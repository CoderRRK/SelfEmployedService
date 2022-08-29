package android.coderrrk.self_employedservice.domain.retrofitusecase

data class Salary(
    val currency: String,
    val from: Int,
    val gross: Boolean,
    val to: Int
)