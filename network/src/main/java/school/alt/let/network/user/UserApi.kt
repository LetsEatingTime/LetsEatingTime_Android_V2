package school.alt.let.network.user


import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query
import school.alt.let.network.user.dto.request.meal.MealResponseDto
import school.alt.let.network.user.dto.request.profile.ProfileResponseDto


interface UserApi {

    @GET("/api/user/image/{idx}")
    fun image(
        @Header("Authorization") accessToken: String,
        @Path(value = "idx") idx: String
    ): ResponseBody

    @GET("/api/user/profile")
    fun profile(
        @Header("Authorization") accessToken: String
    ): ProfileResponseDto


    @GET("api/openapi/meal")
    fun meal(
        @Query("date") date: String
    ): MealResponseDto

}