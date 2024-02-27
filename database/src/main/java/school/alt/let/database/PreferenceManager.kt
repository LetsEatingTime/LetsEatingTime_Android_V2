package school.alt.let.database


import android.content.Context
import android.content.SharedPreferences
import java.time.LocalDateTime


class PreferenceManager(context: Context) {
    private val prefs: SharedPreferences =
        context.getSharedPreferences(LETS_EATING_TIME, Context.MODE_PRIVATE)

    var autoLogin: Boolean
        get() = prefs.getBoolean(AUTO_LOGIN, false)
        set(value) = prefs.edit().putBoolean(AUTO_LOGIN, value).apply()

    var accessToken: String
        get() = prefs.getString(ACCESS_TOKEN, "").toString()
        set(value) = prefs.edit().putString(ACCESS_TOKEN, value).apply()

    var refreshToken: String
        get() = prefs.getString(REFRESH_TOKEN, "").toString()
        set(value) = prefs.edit().putString(REFRESH_TOKEN, value).apply()

    var expiredAt: String
        get() = prefs.getString(EXPIRED_AT, LocalDateTime.MIN.toString()).toString()
        set(value) = prefs.edit().putString(EXPIRED_AT, value).apply()


    fun deleteToken() {
        prefs.edit().remove(AUTO_LOGIN).apply()
        prefs.edit().remove(ACCESS_TOKEN).apply()
        prefs.edit().remove(REFRESH_TOKEN).apply()
        prefs.edit().remove(EXPIRED_AT).apply()
    }

    companion object {
        const val LETS_EATING_TIME = "LETS_EATING_TIME"
        const val AUTO_LOGIN = "AUTO_LOGIN"
        const val ACCESS_TOKEN = "ACCESS_TOKEN"
        const val REFRESH_TOKEN = "REFRESH_TOKEN"
        const val EXPIRED_AT = "EXPIRED_AT"
    }
}