package za.ac.iie.st10444988.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.compose.animation.core.animate


class SplashScreen : AppCompatActivity() {
    private fun intent(splashScreen: SplashScreen, java: Class<MainActivity>): Any {
        TODO("Not yet implemented")
    }

    private fun StartActivity(i: Any) {
        TODO("Not yet implemented")
    }

    private fun overidependingtransition(fadeIn: Int) {


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val btnMainActivity=findViewById<Button>(R.id.btnMainActivity)
        btnMainActivity.setOnClickListener {  }
        val intent = intent
        startActivity(intent)

        val =intent(this,MainActivity::class.java)
        val box = androidx.compose.animation.{ StartActivity() }
        overidependingtransition(android.R.anim.fade_in)
        overridePendingTransition(android.R.anim.fade_out)
        finish()



    }
}