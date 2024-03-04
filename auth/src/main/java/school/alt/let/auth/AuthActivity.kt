package school.alt.let.auth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import school.alt.let.database.PreferenceManager

import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AuthActivity : ComponentActivity() {

    companion object {
        lateinit var prefs: PreferenceManager
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        prefs = PreferenceManager(this)
        setContent {

        }
    }
}