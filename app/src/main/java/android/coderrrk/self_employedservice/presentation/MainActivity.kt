package android.coderrrk.self_employedservice.presentation

import android.app.Activity
import android.app.PendingIntent.getActivity
import android.coderrrk.self_employedservice.R
import android.coderrrk.self_employedservice.presentation.authentication.AuthenticationFragment
import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavGraphNavigator
import androidx.navigation.Navigation
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

