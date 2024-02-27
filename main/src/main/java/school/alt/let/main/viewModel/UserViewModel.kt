package school.alt.let.main.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import school.alt.let.main.state.ImageState
import school.alt.let.main.state.MealState
import school.alt.let.main.state.ProfileState
import school.alt.let.network.user.UserRepository
import javax.inject.Inject

class UserViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    private val _imageState = MutableSharedFlow<ImageState>()
    val imageState: SharedFlow<ImageState> = _imageState

    private val _profileState = MutableSharedFlow<ProfileState>()
    val profileState: SharedFlow<ProfileState> = _profileState

    private val _mealState = MutableSharedFlow<MealState>()
    val mealState: SharedFlow<MealState> = _mealState


    fun image(accessToken: String, idx: String) {
        viewModelScope.launch {
            kotlin.runCatching {
                userRepository.image(accessToken, idx)
            }.onSuccess {
                _imageState.emit(ImageState(true, ""))
            }.onFailure { e ->
                _imageState.emit(ImageState(false, e.message.toString()))
            }
        }
    }

    fun profile(accessToken: String) {
        viewModelScope.launch {
            kotlin.runCatching {
                userRepository.profile(accessToken)
            }.onSuccess {
                _profileState.emit(ProfileState(true, ""))
            }.onFailure { e ->
                _profileState.emit(ProfileState(false, e.message.toString()))
            }
        }
    }

    fun meal(date: String) {
        viewModelScope.launch {
            kotlin.runCatching {
                userRepository.meal(date)
            }.onSuccess {
                _mealState.emit(MealState(true, ""))
            }.onFailure { e ->
                _mealState.emit(MealState(false, e.message.toString()))
            }
        }
    }


}