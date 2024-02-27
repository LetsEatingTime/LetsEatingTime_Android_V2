package school.alt.let.network.auth.dto.response

data class LoginResponseDto(
    val data: Data,
    val status: Int
)

data class Data(
    val accessToken: String,
    val grantType: String,
    val refreshToken: String
)