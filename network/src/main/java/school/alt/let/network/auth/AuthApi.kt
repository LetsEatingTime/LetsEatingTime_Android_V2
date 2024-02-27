package school.alt.let.network.auth


import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import school.alt.let.network.auth.dto.request.LoginRequestDto
import school.alt.let.network.auth.dto.request.SignupRequestDto
import school.alt.let.network.auth.dto.response.LoginResponseDto
import school.alt.let.network.auth.dto.response.SignupResponseDto
import school.alt.let.network.auth.dto.response.WithdrawResponseDto


interface AuthApi {

    @POST("/api/account/login.do")
    suspend fun login(
        @Body loginRequestDto: LoginRequestDto
    ): LoginResponseDto

    @POST("/api/account/signup.do")
    suspend fun signup(
        @Body signupRequestDto: SignupRequestDto
    ): SignupResponseDto

    @GET("api/account/refresh.do")
    fun refresh(
        @Header("Authorization") refreshToken: String
    ): LoginResponseDto

    @POST("/api/user/withdraw")
    fun withdraw(
        @Header("Authorization") accessToken: String
    ): WithdrawResponseDto

}