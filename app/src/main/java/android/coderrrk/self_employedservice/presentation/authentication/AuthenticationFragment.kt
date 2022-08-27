package android.coderrrk.self_employedservice.presentation.authentication

import android.coderrrk.self_employedservice.R
import android.coderrrk.self_employedservice.databinding.AuthenticationFragmentBinding
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class AuthenticationFragment: Fragment() {

    var binding: AuthenticationFragmentBinding? = null
    var addresses = arrayOf("google@gmail.com")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = AuthenticationFragmentBinding.inflate(inflater, container, false)
        val view = binding?.root
        binding?.SingFragmentButton?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_authenticationFragment_to_singInFragment)
        })
        binding?.RegistrationFragmentButton?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_authenticationFragment_to_registrationFragment)
        })
        binding?.WriteToUsFragmentButton?.setOnClickListener(View.OnClickListener {
            writeToUs()
        })
        return view
    }

    private fun writeToUs() {
        val intent = Intent(Intent.ACTION_SENDTO)
        intent.data = Uri.parse("mailto:")
        intent.putExtra(Intent.EXTRA_EMAIL, addresses)
        startActivity(intent)
    }
}