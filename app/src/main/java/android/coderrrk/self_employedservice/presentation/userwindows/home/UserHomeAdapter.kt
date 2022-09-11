package android.coderrrk.self_employedservice.presentation.userwindows.home

import android.coderrrk.self_employedservice.R
import android.coderrrk.self_employedservice.domain.retrofitusecase.Item
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.user_home_item.view.*

class UserHomeAdapter (val myOnClickListener: UserHomeOnClickListener): RecyclerView.Adapter<UserHomeAdapter.UserWindowHolder>() {

    var listRetrofitInfo = emptyList<Item>()

    class UserWindowHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserWindowHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_home_item, parent, false)
        return UserWindowHolder(view)
    }

    override fun onBindViewHolder(holder: UserWindowHolder, position: Int) {

        val item = listRetrofitInfo[position]

        holder.itemView.job_text_view.text = listRetrofitInfo[position].name
        if (listRetrofitInfo[position].salary == null || listRetrofitInfo[position].employer.logo_urls == null){
            holder.itemView.salary_from_text_view.text = "Не указано"
        }else {
            Picasso.get().load(listRetrofitInfo[position].employer.logo_urls.original).fit().centerInside()
                .into(holder.itemView.posterImageView)
            holder.itemView.salary_from_text_view.text =
                listRetrofitInfo[position].salary.from.toString() + " " + listRetrofitInfo[position].salary.currency
        }

        holder.itemView.setOnClickListener(View.OnClickListener{
            myOnClickListener.onClicked(item)
        })
    }

    override fun getItemCount(): Int {
        return listRetrofitInfo.size
    }

    fun setList(list: List<Item>) {
        listRetrofitInfo = list
        notifyDataSetChanged()
    }

}
