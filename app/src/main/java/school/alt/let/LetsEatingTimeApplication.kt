package school.alt.let

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import school.alt.let.database.PreferenceManager

@HiltAndroidApp
class LetsEatingTimeApplication : Application() {

    companion object {
        lateinit var prefs: PreferenceManager
    }
    override fun onCreate() {
        super.onCreate()
        prefs = PreferenceManager(applicationContext)
    }
}