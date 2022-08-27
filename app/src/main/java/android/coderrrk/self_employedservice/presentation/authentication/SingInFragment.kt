package android.coderrrk.self_employedservice.presentation.authentication

import android.coderrrk.self_employedservice.R
import android.coderrrk.self_employedservice.databinding.AuthenticationFragmentBinding
import android.coderrrk.self_employedservice.databinding.SinginFragmentBinding
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class SingInFragment: Fragment() {

    var binding: SinginFragmentBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SinginFragmentBinding.inflate(inflater, container, false)
        val view = binding?.root
        binding?.SingInForgotPassword?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_singInFragment_to_passwordRecoveryFragment)
        })
        binding?.SingInSingIn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_singInFragment_to_userWindowFragment)
        })
        return view
    }
}