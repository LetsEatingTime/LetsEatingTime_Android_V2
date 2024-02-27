package school.alt.let.auth.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import school.alt.let.auth.state.SignupState
import school.alt.let.network.auth.AuthRepository
import school.alt.let.network.auth.dto.request.SignupRequestDto
import javax.inject.Inject


@HiltViewModel
class SignupViewModel @Inject constructor(
    private val authRepository: AuthRepository
) : ViewModel() {

    private val _signupState = MutableSharedFlow<SignupState>()
    val signupState: SharedFlow<SignupState> = _signupState

    fun signup(signupRequestDto: SignupRequestDto) {
        viewModelScope.launch {
            kotlin.runCatching {
                authRepository.signup(signupRequestDto)
            }.onSuccess {
                _signupState.emit(SignupState(true, ""))
            }.onFailure { e ->
                _signupState.emit(SignupState(false, e.message.toString()))
            }
        }
    }
}