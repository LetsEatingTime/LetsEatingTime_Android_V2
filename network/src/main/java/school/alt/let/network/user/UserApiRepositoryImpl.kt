package school.alt.let.network.user

import okhttp3.ResponseBody
import school.alt.let.network.user.dto.request.meal.MealResponseDto
import school.alt.let.network.user.dto.request.profile.ProfileResponseDto
import javax.inject.Inject

class UserApiRepositoryImpl @Inject constructor(
    private val userApi: UserApi
) : UserRepository {
    override suspend fun image(accessToken: String, idx: String): ResponseBody {
        return userApi.image(accessToken,idx)
    }

    override suspend fun profile(accessToken: String): ProfileResponseDto {
        return userApi.profile(accessToken)
    }

    override suspend fun meal(date: String): MealResponseDto {
        return userApi.meal(date)
    }
}
