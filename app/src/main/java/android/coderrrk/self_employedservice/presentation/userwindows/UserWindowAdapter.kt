package android.coderrrk.self_employedservice.presentation.userwindows

import android.coderrrk.self_employedservice.R
import android.coderrrk.self_employedservice.domain.Item
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.user_window_item.view.*

class UserWindowAdapter: RecyclerView.Adapter<UserWindowAdapter.UserWindowHolder>() {

    var listRetrofitInfo = emptyList<Item>()

    class UserWindowHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserWindowAdapter.UserWindowHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_window_item, parent, false)
        return UserWindowAdapter.UserWindowHolder(view)
    }

    override fun onBindViewHolder(holder: UserWindowAdapter.UserWindowHolder, position: Int) {

        holder.itemView.job_text_view.text = listRetrofitInfo[position].name
        if (listRetrofitInfo[position].salary == null || listRetrofitInfo[position].employer.logo_urls == null){
            holder.itemView.salary_from_text_view.text = "Не указано"
        }else {
            Picasso.get().load(listRetrofitInfo[position].employer.logo_urls.original).fit().centerInside()
                .into(holder.itemView.posterImageView)
            holder.itemView.salary_from_text_view.text =
                listRetrofitInfo[position].salary.from.toString() + " " + listRetrofitInfo[position].salary.currency
        }
    }

    override fun getItemCount(): Int {
        return listRetrofitInfo.size
    }

    fun setList(list: List<Item>) {
        listRetrofitInfo = list
        notifyDataSetChanged()
    }
}
