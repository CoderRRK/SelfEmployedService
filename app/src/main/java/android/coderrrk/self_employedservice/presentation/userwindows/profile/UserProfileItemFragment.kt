package android.coderrrk.self_employedservice.presentation.userwindows.profile


import android.coderrrk.self_employedservice.databinding.UserProfileItemFragmentBinding
import android.coderrrk.somenotes.data.sqlite.ProfileDb
import android.coderrrk.somenotes.data.sqlite.ProfileRepositoryImpl
import android.coderrrk.somenotes.data.sqlite.ProfileRoomDataBase
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.user_profile_item_fragment.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
class UserProfileItemFragment: Fragment() {

    var binding: UserProfileItemFragmentBinding? = null
    private val userProfileViewModel: UserProfileViewModel? = null

    val applicationScope = CoroutineScope(SupervisorJob())
    val database by lazy { ProfileRoomDataBase.getDatabase(requireContext(), applicationScope) }
    val repository by lazy { ProfileRepositoryImpl(database.profileDao()) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = UserProfileItemFragmentBinding.inflate(inflater, container, false)
        val view = binding?.root

        userProfileViewModel?.plofile?.observe(viewLifecycleOwner, Observer{ profileDb ->
            profileDb?.let {
            surname_profile?.setText(profileDb[0].toString())
                name_profile?.setText(profileDb[1].toString())
                patronymic_profile?.setText(profileDb[2].toString())
                email_profile?.setText(profileDb[3].toString())
                phone_profile?.setText(profileDb[4].toString())
                inn_profile?.setText(profileDb[5].toString())
                Log.d("load", "" + repository)
    }
    })

        binding?.saveProfileButton?.setOnClickListener(View.OnClickListener {

            val surnameProfile = surname_profile?.text.toString()
            val nameProfile = name_profile?.text.toString()
            val patronymicProfile = patronymic_profile?.text.toString()
            val emailProfile = email_profile?.text.toString()
            val phoneProfile = phone_profile?.text.toString()
            val innProfile = inn_profile?.text.toString()
            val profileDb = ProfileDb(surnameProfile, nameProfile, patronymicProfile, emailProfile, phoneProfile, innProfile)

            Log.d("save", "" + surname_profile?.text.toString())
            userProfileViewModel?.insert(profileDb)

            requireActivity().onBackPressed()

        })
        return view

    }


}