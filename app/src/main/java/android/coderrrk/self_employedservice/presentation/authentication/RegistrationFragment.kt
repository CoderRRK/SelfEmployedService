package android.coderrrk.self_employedservice.presentation.authentication

import android.coderrrk.self_employedservice.R
import android.coderrrk.self_employedservice.databinding.RegistrationFragmentBinding
import android.coderrrk.self_employedservice.databinding.SinginFragmentBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class RegistrationFragment: Fragment() {

    var binding: RegistrationFragmentBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = RegistrationFragmentBinding.inflate(inflater, container, false)
        val view = binding?.root
        binding?.RegistrationButton?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_registrationFragment_to_singInFragment)
        })
        return view
    }
}