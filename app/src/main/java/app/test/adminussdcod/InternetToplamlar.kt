package app.test.adminussdcod

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import java.util.*


class InternetToplamlar : AppCompatActivity() {

    private var listdata: ListView? = null
    var listItems = ArrayList<String>()

    var adapter: ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_internet_toplamlar)

        listdata = findViewById(R.id.listdata)
        //dataModalArrayList = ArrayList()
        //listdata.setDivider(null)
        //listdata.setDividerHeight(1)
        listdata!!.divider = null
        listdata!!.dividerHeight = 1

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems)

        val ref = FirebaseDatabase.getInstance().reference
        ref.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                //dataModalArrayList!!.clear()
                //listdata?.adapter = null
                for (dataSnapshot in snapshot.child("Beeline/Internet To`plamlar").children) {
                    val toplamname = dataSnapshot.key
                    if (toplamname != null) {
                        listItems.add(toplamname)
                    }
                    /*for (dataSnapshot1 in snapshot.child("Beeline/Internet To`plamlar/$toplamname").children) {
                        val daq_name1 = dataSnapshot1.key
                        val hiz_ulanish = Objects.requireNonNull(dataSnapshot1.child("Code").value).toString()
                        val hiz_havolasi = Objects.requireNonNull(dataSnapshot1.child("Muddati").value).toString()
                        val hiz_mal = Objects.requireNonNull(dataSnapshot1.child("Narxi").value).toString()
                        println(daq_name1)
                        //daq_name1?.let { ConInternetTopplamlar(it, hiz_ulanish, hiz_havolasi, hiz_mal) }
                           // ?.let { dataModalArrayList!!.add(it) }
                        Toast.makeText(this@InternetToplamlar, "$daq_name1 - $hiz_ulanish", Toast.LENGTH_LONG).show()
                    }*/
                }
                listdata?.adapter = adapter
                adapter?.notifyDataSetChanged()
            }
            override fun onCancelled(error: DatabaseError) {}
        })


        /*btninsaqlash.setOnClickListener {
            val inmb = ediinmb.text.toString()
            val incode = ediincode.text.toString()
            val inmuddati = ediinmuddati.text.toString()
            val innarxi = ediinnarxi.text.toString()
            if (inmb.isEmpty() || incode.isEmpty() || inmuddati.isEmpty() || innarxi.isEmpty()) {
                ediinmb.error = "Məlumatları doldurun"
                ediincode.error = "Məlumatları doldurun"
                ediinmuddati.error = "Məlumatları doldurun"
                ediinnarxi.error = "Məlumatları doldurun"
            } else {
                val database = FirebaseDatabase.getInstance()
                val myRef = database.getReference("Beeline/Internet To`plamlar")
                val myRef2 = myRef.child("4G internet To'plamlar1")
                val myRef3 = myRef2.child(inmb)
                myRef3.child("Code").setValue(incode)
                myRef3.child("Muddati").setValue(inmuddati)
                myRef3.child("Narxi").setValue(innarxi)
                Toast.makeText(this, "Məlumatlar uğurla yadda saxlandı", Toast.LENGTH_LONG).show()
            }
        }*/


    }
}