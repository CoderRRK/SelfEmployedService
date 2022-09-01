package android.coderrrk.self_employedservice.presentation.userwindows

import android.coderrrk.self_employedservice.R
import android.coderrrk.self_employedservice.domain.retrofitusecase.Item
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.user_window_home_fragment.view.*


class UserWindowHomeFragment() : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: UserWindowAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this).get(UserWindowViewModel::class.java)
        val view = inflater.inflate(R.layout.user_window_home_fragment, container, false)
        recyclerView = view.recycler_view
        adapter = UserWindowAdapter(object : MyOnClickListener {
            override fun onClicked(item: Item) {
                val fragment = UserWindowHomeItemFragment()

                val bundle = Bundle()
                bundle.putSerializable("employer", item.employer.name)
                bundle.putSerializable("job", item.name)
                bundle.putSerializable("requirement", item.snippet.requirement)
                bundle.putSerializable("responsibility", item.snippet.responsibility)
                bundle.putSerializable("deadline", item.working_days.toString())
                bundle.putSerializable("from", item.salary.from)
                bundle.putSerializable("salary", item.salary.currency)

                fragment.arguments = bundle

                activity!!.supportFragmentManager.beginTransaction()
                    .replace(R.id.containerMain, fragment)
                    .addToBackStack(null)
                    .commit()
            }
        })
        recyclerView.adapter = adapter
        viewModel.getDataRetro()
        viewModel.myList.observe(viewLifecycleOwner) { list ->
            list.body()?.let { adapter.setList(it.items) }
        }
        return view
    }
}