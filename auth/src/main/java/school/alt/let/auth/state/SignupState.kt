package school.alt.let.auth.state

data class SignupState(
    val isSuccess: Boolean = false,
    val error: String = ""
)
