package school.alt.let.network.auth


import school.alt.let.network.auth.dto.request.LoginRequestDto
import school.alt.let.network.auth.dto.request.SignupRequestDto
import school.alt.let.network.auth.dto.response.LoginResponseDto
import school.alt.let.network.auth.dto.response.SignupResponseDto
import school.alt.let.network.auth.dto.response.WithdrawResponseDto

import javax.inject.Inject


class AuthApiRepositoryImpl @Inject constructor(
    private val authApi: AuthApi
) : AuthRepository {
    override suspend fun login(loginRequestDto: LoginRequestDto): LoginResponseDto {
        return authApi.login(loginRequestDto)
    }

    override suspend fun signup(signupRequestDto: SignupRequestDto): SignupResponseDto {
        return authApi.signup(signupRequestDto)
    }

    override suspend fun refresh(refreshToken: String): LoginResponseDto {
        return authApi.refresh(refreshToken)
    }

    override suspend fun withdraw(accessToken: String): WithdrawResponseDto {
        return authApi.withdraw(accessToken)
    }

}