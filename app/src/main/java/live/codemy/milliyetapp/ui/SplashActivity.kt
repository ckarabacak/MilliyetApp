package live.codemy.milliyetapp.ui

import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import live.codemy.milliyetapp.R
import live.codemy.milliyetapp.util.extStartActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        object : CountDownTimer(3000, 1000) {
            override fun onFinish() {
                this@SplashActivity extStartActivity DashboardActivity::class.java
            }

            override fun onTick(millisUntilFinished: Long) {}
        }.start()
    }
}
