package android.coderrrk.self_employedservice.domain.retrofitusecase

import java.io.Serializable

data class Item(
    val accept_temporary: Boolean,
    val address: Address,
    val adv_response_url: String,
    val alternate_url: String,
    val apply_alternate_url: String,
    val archived: Boolean,
    val area: Area,
    val contacts: Any,
    val created_at: String,
    val department: Department,
    val employer: Employer,
    val has_test: Boolean,
    val id: String,
    val insider_interview: Any,
    val name: String,
    val premium: Boolean,
    val published_at: String,
    val relations: List<Any>,
    val response_letter_required: Boolean,
    val response_url: Any,
    val salary: Salary,
    val schedule: Schedule,
    val snippet: Snippet,
    val sort_point_distance: Any,
    val type: Type,
    val url: String,
    val working_days: List<WorkingDay>,
    val working_time_intervals: List<WorkingTimeInterval>,
    val working_time_modes: List<WorkingTimeMode>
) : Serializable