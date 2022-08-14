package app.test.adminussdcod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class AllCantroll : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_cantroll)
        //get data put extra
        val bundle: Bundle? = intent.extras
        val name = bundle!!.getString("name")
        val  btnconinternettoplam = findViewById<Button>(R.id.btnconinternettoplam)
        btnconinternettoplam.setOnClickListener {
            Toast.makeText(this, "Toplam : " + name, Toast.LENGTH_LONG).show()
            startActivity(Intent(this, InternetToplamlar::class.java))
        }

    }
}