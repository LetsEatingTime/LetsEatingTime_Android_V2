package school.alt.let.network.auth.dto.request

data class SignupRequestDto(
    val className: Int,
    val classNo: Int,
    val grade: Int,
    val id: String,
    val name: String,
    val password: String,
    val userType: String
)