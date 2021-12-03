package com.example.toodo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_introductory.*

class IntroductoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introductory)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        toodosplash.animate().translationY(-1600f).setDuration(1000).setStartDelay(3000)
        lottie.animate().translationY(-1600f).setDuration(1000).setStartDelay(3000)
        tag.animate().translationY(1400f).setDuration(1000).setStartDelay(3000)

        Handler().postDelayed({
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
                              }, 4000) // 3000 is the delayed time in milliseconds.
    }
}

// we used the postDelayed(Runnable, time) method
// to send a message with a delayed time.
//Handler().postDelayed({
//    val intent = Intent(this, MainActivity::class.java)
//    startActivity(intent)
//    finish()
//}, 3000) // 3000 is the delayed time in milliseconds.
