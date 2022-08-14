package app.test.adminussdcod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Sample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //hide toolbar
        supportActionBar?.hide()
        setContentView(R.layout.activity_sample)
        val btnmobi = findViewById<Button>(R.id.button)
        val btnuzmobile = findViewById<Button>(R.id.button2)
        val btnbeeline = findViewById<Button>(R.id.button3)
        val btnusell = findViewById<Button>(R.id.button4)

        btnmobi.setOnClickListener {
            val intent = Intent(this, AllCantroll::class.java)
            intent.putExtra("name", "1")
            startActivity(intent)
        }
        btnuzmobile.setOnClickListener {
            val intent = Intent(this, AllCantroll::class.java)
            intent.putExtra("name", "2")
            startActivity(intent)
        }
        btnbeeline.setOnClickListener {
            val intent = Intent(this, AllCantroll::class.java)
            intent.putExtra("name", "3")
            startActivity(intent)
        }
        btnusell.setOnClickListener {
            val intent = Intent(this, AllCantroll::class.java)
            intent.putExtra("name", "4")
            startActivity(intent)
        }
    }
}