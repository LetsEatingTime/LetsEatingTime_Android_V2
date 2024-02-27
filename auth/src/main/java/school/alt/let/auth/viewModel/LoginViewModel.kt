package school.alt.let.auth.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import school.alt.let.auth.state.LoginState
import school.alt.let.network.auth.AuthRepository
import school.alt.let.network.auth.dto.request.LoginRequestDto
import javax.inject.Inject


@HiltViewModel
class LoginViewModel @Inject constructor(
    private val authRepository: AuthRepository
) : ViewModel() {

    private val _loginState = MutableSharedFlow<LoginState>()
    val loginState: SharedFlow<LoginState> = _loginState
    fun login(loginRequestDto: LoginRequestDto) {
        viewModelScope.launch {
            kotlin.runCatching {
                authRepository.login(loginRequestDto)
            }.onSuccess {
                _loginState.emit(LoginState(true, ""))
            }.onFailure { e ->
                _loginState.emit(LoginState(false, e.message.toString()))
            }
        }
    }

}