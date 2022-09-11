package android.coderrrk.self_employedservice.presentation.userwindows.profile

import android.coderrrk.self_employedservice.R
import android.coderrrk.self_employedservice.databinding.UserProfileFragmentBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

open class UserProfileFragment: Fragment() {

    var binding: UserProfileFragmentBinding? = null
//    val applicationScope = CoroutineScope(SupervisorJob())
//    val database by lazy { ProfileRoomDataBase.getDatabase(this.requireContext(), applicationScope) }
//    val repository by lazy { ProfileRepositoryImpl(database.profileDao()) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = UserProfileFragmentBinding.inflate(inflater, container, false)
        val view = binding?.root

        binding?.changeProfileButton?.setOnClickListener(View.OnClickListener {
            val fragment = UserProfileItemFragment()

            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.containerMain, fragment)
                .addToBackStack(null)
                .commit()
        })
        return view
    }

}

