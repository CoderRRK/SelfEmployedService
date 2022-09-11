package android.coderrrk.self_employedservice.presentation.userwindows.root

import android.coderrrk.self_employedservice.R
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.user_root_fragment.view.*

class UserRootFragment: Fragment() {

    private var ctx: Context?= null

    override fun onAttach(context: Context){
        super.onAttach(context)
        ctx = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.user_root_fragment, container, false)
        view.tab_layout.tabIconTint = null
        view.view_pager.adapter = UserPageAdapter(ctx as FragmentActivity)

        TabLayoutMediator(view.tab_layout, view.view_pager){
                tab, pos ->
            when(pos){
                0 -> {
                    tab.setIcon(R.drawable.ic_baseline_home_24)
                }
                1 -> {
                    tab.setIcon(R.drawable.ic_baseline_person_24)
                }
            }
        }.attach()
        return view
    }


}