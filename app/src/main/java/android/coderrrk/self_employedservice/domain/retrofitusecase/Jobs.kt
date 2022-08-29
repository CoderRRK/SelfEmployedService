package android.coderrrk.self_employedservice.domain.retrofitusecase

data class Jobs(
    val alternate_url: String,
    val arguments: Any,
    val clusters: Any,
    val found: Int,
    val items: List<Item>,
    val page: Int,
    val pages: Int,
    val per_page: Int
)