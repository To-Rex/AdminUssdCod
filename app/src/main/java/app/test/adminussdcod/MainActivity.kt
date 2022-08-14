package app.test.adminussdcod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // timeout Sample actvity 1500 ms
        Thread.sleep(500)
        startActivity(Intent(this, Sample::class.java))
        finish()

    }
}