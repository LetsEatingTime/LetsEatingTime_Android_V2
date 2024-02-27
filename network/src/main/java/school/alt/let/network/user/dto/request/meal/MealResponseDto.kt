package school.alt.let.network.user.dto.request.meal

import school.alt.let.network.user.dto.request.profile.Data

data class MealResponseDto(
    val data: Data,
    val status: Int
)

data class Data(
    val breakfast: Breakfast,
    val dinner: Dinner,
    val exists: Boolean,
    val lunch: Lunch
)

data class Breakfast(
    val calcium: String,
    val calorie: String,
    val carbohydrates: String,
    val fat: String,
    val iron: String,
    val mealType: String,
    val menu: List<String>,
    val protein: String,
    val riboflavin: String,
    val thiamin: String,
    val vitaminA: String,
    val vitaminC: String
)

data class Dinner(
    val calcium: String,
    val calorie: String,
    val carbohydrates: String,
    val fat: String,
    val iron: String,
    val mealType: String,
    val menu: List<String>,
    val protein: String,
    val riboflavin: String,
    val thiamin: String,
    val vitaminA: String,
    val vitaminC: String
)

data class Lunch(
    val calcium: String,
    val calorie: String,
    val carbohydrates: String,
    val fat: String,
    val iron: String,
    val mealType: String,
    val menu: List<String>,
    val protein: String,
    val riboflavin: String,
    val thiamin: String,
    val vitaminA: String,
    val vitaminC: String
)
