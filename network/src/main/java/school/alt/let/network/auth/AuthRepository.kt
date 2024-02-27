package school.alt.let.network.auth

import school.alt.let.network.auth.dto.request.LoginRequestDto
import school.alt.let.network.auth.dto.request.SignupRequestDto
import school.alt.let.network.auth.dto.response.LoginResponseDto
import school.alt.let.network.auth.dto.response.SignupResponseDto
import school.alt.let.network.auth.dto.response.WithdrawResponseDto

interface AuthRepository {
    suspend fun login(loginRequestDto: LoginRequestDto): LoginResponseDto
    suspend fun signup(signupRequestDto: SignupRequestDto): SignupResponseDto
    suspend fun refresh(refreshToken: String): LoginResponseDto
    suspend fun withdraw(accessToken:String): WithdrawResponseDto
}