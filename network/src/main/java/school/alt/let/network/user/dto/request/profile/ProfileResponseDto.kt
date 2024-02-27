package school.alt.let.network.user.dto.request.profile

import school.alt.let.network.user.dto.request.meal.Data

data class ProfileResponseDto(
    val data: Data,
    val status: Int
)

data class Data(
    val mealTime: List<String>,
    val user: User
)

data class User(
    val approvedYn: String,
    val className: Int,
    val classNo: Int,
    val createTime: String,
    val grade: Int,
    val id: String,
    val idx: Int,
    val image: Int,
    val name: String,
    val userType: String,
    val withdrawedTime: Any,
    val withdrawedYn: String
)
