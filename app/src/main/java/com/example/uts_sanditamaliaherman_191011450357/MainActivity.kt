package com.example.uts_sanditamaliaherman_191011450357

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val list = mutableListOf<Kota>()

        list.add(Kota("Kota Bandung", "Kota Bandung merupakan ibukota Provinsi Jawa Barat. " +
                "alam sistem perkotaan nasional, Kota Bandung telah ditetapkan sebagai Pusat Kegiatan Nasional (PKN). " +
                "Kota Bandung juga termasuk ke dalam Kawasan Strategis Nasional Perkotaan Cekungan Bandung " +
                "(Metropolitan Cekungan Bandung).", R.drawable.kota_bandung)
        )
        list.add(Kota("Kota DKI Jakarta", "Jakarta merupakan ibu kota negara Indonesia. " +
                "Kota Jakarta merupakan kota metropolitan yang terletak sangat strategis " +
                "sehingga kota ini banyak digunakan sebagai pusat perdagangan.", R.drawable.kota_jakarta)
        )
        list.add(Kota("Kota DI Yogyakarta", "Keistimewaan Yogyakarta" +
                "tidak hanya dilihat dari sudut pandang politik dan pemerintahan, " +
                "namun juga aspek-aspek sosial budaya yang bermuara di Kraton Yogyakarta. " +
                "Keraton Yogyakarta adalah simbol budaya adiluhung Jawa.", R.drawable.kota_jogja)
        )
        list.add(Kota("Kota Surabaya", "Surabaya yang menjadi Ibukota dari Provinsi Jawa Timur. " +
                "Surabaya kota menjadi pusat bisnis di Jawa Timur. " +
                "Tak pelak, dulu Kota Surabaya juga menjadi pusat perdagangan paling ramai di Pulau Jawa. " +
                "Banyak tempat menarik yang wajib dikunjungi bagi pelancong.", R.drawable.kota_surabaya)
        )
        list.add(Kota("Kota Tangerang","Adalah kota yang terletak di Tatar Pasundan Provinsi Banten. " +
                "Keunikan Kota Tangerang dari Segi Perekonomian Di Kota Tangerang, kita dapat menemukan pasar tradisional yang ada di pusat Kota Tangerang, " +
                "tepatnya di Jalan Kisamaun. ", R.drawable.kota_tangerang)
        )

        listView.adapter = KotaIndonesia( this, R.layout.kotaindonesia, list)

        listView.setOnItemClickListener { adapterView, view, i, l ->
            when(i){
                0 -> Toast.makeText(this, "Kamu Memilih Kota Bandung", Toast.LENGTH_SHORT).show()
                1 -> Toast.makeText(this, "Kamu Memilih Kota DKI Jakarta", Toast.LENGTH_SHORT).show()
                2 -> Toast.makeText(this, "Kamu Memilih Kota DI Yogyakarta", Toast.LENGTH_SHORT).show()
                3 -> Toast.makeText(this, "Kamu Memilih Kota Surabaya", Toast.LENGTH_SHORT).show()
                4 -> Toast.makeText(this, "Kamu Memilih Kota Tangerang", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setMessage("Apakah anda yakin ingin keluar?")
            .setPositiveButton("Ya",
                DialogInterface.OnClickListener { dialog, which -> finish() })
            .setNegativeButton("Tidak",
                DialogInterface.OnClickListener { dialog, which -> dialog.cancel() })
            .show()
    }
}