package school.alt.let.network.user

import okhttp3.ResponseBody
import school.alt.let.network.user.dto.request.meal.MealResponseDto
import school.alt.let.network.user.dto.request.profile.ProfileResponseDto

interface UserRepository {
    suspend fun image(accessToken: String, idx: String): ByteArray
    suspend fun profile(accessToken: String): ProfileResponseDto
    suspend fun meal(date: String): MealResponseDto
}