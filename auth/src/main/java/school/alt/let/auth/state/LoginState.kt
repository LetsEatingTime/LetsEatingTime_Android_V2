package school.alt.let.auth.state

data class LoginState(
    val isSuccess: Boolean = false,
    val error: String = ""
)
