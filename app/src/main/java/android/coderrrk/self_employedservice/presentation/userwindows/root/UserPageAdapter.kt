package android.coderrrk.self_employedservice.presentation.userwindows.root

import android.coderrrk.self_employedservice.presentation.userwindows.home.UserHomeFragment
import android.coderrrk.self_employedservice.presentation.userwindows.profile.UserProfileFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class UserPageAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> UserHomeFragment()
            else -> UserProfileFragment()
        }
    }
}