package android.coderrrk.self_employedservice.presentation.userwindows.home

import android.coderrrk.self_employedservice.databinding.UserHomeItemFragmentBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider


class UserHomeItemFragment: Fragment() {

    var binding: UserHomeItemFragmentBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this).get(UserHomeViewModel::class.java)
        binding = UserHomeItemFragmentBinding.inflate(inflater, container, false)
        val view = binding?.root

        binding?.employer?.text = this.requireArguments().getSerializable("employer").toString()
        binding?.jobTitle?.text = this.requireArguments().getSerializable("job").toString()
        binding?.requirement?.text = this.requireArguments().getSerializable("requirement").toString()
        binding?.responsibility?.text = this.requireArguments().getSerializable("responsibility").toString()
        binding?.deadline?.text = this.requireArguments().getSerializable("deadline").toString()
        binding?.salary?.text = this.requireArguments().getSerializable("from").toString() + " " +
                this.requireArguments().getSerializable("salary").toString()
        return view
    }
}