package android.coderrrk.self_employedservice.presentation.authentication

import android.coderrrk.self_employedservice.R
import android.coderrrk.self_employedservice.databinding.PasswordRecoveryFragmentBinding
import android.coderrrk.self_employedservice.databinding.RegistrationFragmentBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class PasswordRecoveryFragment: Fragment() {

    var binding: PasswordRecoveryFragmentBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = PasswordRecoveryFragmentBinding.inflate(inflater, container, false)
        val view = binding?.root
        binding?.PasswordRecoveryButton?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_passwordRecoveryFragment_to_singInFragment)
        })
        return view
    }
}