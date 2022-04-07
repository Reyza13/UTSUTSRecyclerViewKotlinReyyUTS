package com.reyy.recyclerviewkotlinreyy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Badminton>(
            Badminton(
                R.drawable.lining1,
                nameBadminton = "Lining Tectonic 7C",
                descBadminton = "Raket Lining Tectonic 7C" +
                        "\nVarian Warna Black/Gold " +
                        "\n" +
                        "\nHarga Rp.2.000.000"
            ),
            Badminton(
                R.drawable.lining2,
                nameBadminton = "Lining 3D BreakFree N90 II",
                descBadminton = "Raket Lining 3D BreakFree N90 II" +
                        "\nVarian Warna Green/Black" +
                        "\n " +
                        "\nHarga Rp.1.999.999"
            ),
            Badminton(
                R.drawable.lining3,
                nameBadminton = "Lining Air Force 78",
                descBadminton = "Raket Lining Air Force 78 " +
                        "\nVarian Warna Pink/Black or Green/Black" +
                        "\nHarga Rp.1.600.000"
            ),
            Badminton(
                R.drawable.lining4,
                nameBadminton = "Lining Turbo X 102",
                descBadminton = "Raket Lining Turbo X 102" +
                        "\nVarian Warna Black/White/Yellow" +
                        "\n " +
                        "\nHarga Rp.1.250.000"
            ),
            Badminton(
                R.drawable.lining5,
                nameBadminton = "Lining Turbo X 90",
                descBadminton = "Raket Lining Turbo X 90 " +
                        "\nVarian Warna Rainbow" +
                        "\n" +
                        "\nHarga Rp.1.500.000"
            ),
            Badminton(
                R.drawable.lining6,
                nameBadminton = "Lining Aeronaut 1000 T Limited Edition",
                descBadminton = "Raket Lining Aeronaut 1000 T Limited Edition " +
                        "\nVarian Warna Gold/Purple/Black" +
                        "\n" +
                        "\nHarga Rp.1.999.999"
            ),
            Badminton(
                R.drawable.lining7,
                nameBadminton = "Lining SS 100 Lite Black/Silver",
                descBadminton = "Raket Lining SS 100 Lite Black/Silver" +
                        "\nVarian Warna Silver/Black" +
                        "\n " +
                        "\nHarga Rp.2.999.999"
            ),
            Badminton(
                R.drawable.lining8,
                nameBadminton = "Lining Aeronaut 9000 I",
                descBadminton = "Raket Lining Aeronaut 9000 I" +
                        "\nVarian Warna Rainbow" +
                        "\n " +
                        "\nHarga Rp.3.000.000"

            ),
            Badminton(
                R.drawable.lining9,
                nameBadminton = "Lining Aeronaut 9000 I PLR",
                descBadminton = "Raket Lining Aeronaut 9000 I Professional Lightweight Racket " +
                        "\nVarian Warna Gold/Black" +
                        "\n" +
                        "\nHarga Rp.2.999.999"

            ),
            Badminton(
                R.drawable.lining10,
                nameBadminton = "Lining Aeronaut 9000",
                descBadminton = "Raket Lining Aeronaut 9000" +
                        "\nVarian Warna White/Gold" +
                        "\n " +
                        "\nHarga Rp.1.600.000"
            ),
            Badminton(
                R.drawable.yonex1,
                nameBadminton = "Yonex Voltric DG",
                descBadminton = "Raket Yonex Voltric DG " +
                        "\nVarian Warna Blue/White" +
                        "\n" +
                        "\nHarga Rp.1.999.999"
            ),
            Badminton(
                R.drawable.yonex2,
                nameBadminton = "Yonex Nano Speed",
                descBadminton = "Raket Yonex Nano Speed" +
                        "\nVarian Warna Black/White" +
                        "\n " +
                        "\nHarga Rp.1.000.000"
            ),
            Badminton(
                R.drawable.yonex3,
                nameBadminton = "Yonex ArcSaber ",
                descBadminton = "Raket Yonex ArcSaber" +
                        "\nVarian Warna Black/Red" +
                        "\n " +
                        "\nHarga Rp.2.600.000"
            ),
            Badminton(
                R.drawable.yonex4,
                nameBadminton = "Yonex Voltric DG Slim",
                descBadminton = "Raket Yonex Voltric DG Slim" +
                        "\nVarian Warna Black/White" +
                        "\n " +
                        "\nHarga Rp.1.999.999"
            ),
            Badminton(
                R.drawable.yonex5,
                nameBadminton = "Yonex Astrox 2",
                descBadminton = "Raket Yonex Astrox 2" +
                        "\nVarian Warna Black/Blue" +
                        "\n" +
                        "\nHarga Rp.2.000.000"
            ),
            Badminton(
                R.drawable.yonex6,
                nameBadminton = "Yonex Astrox 55",
                descBadminton = "Raket Yonex Astrox 55 " +
                        "\nVarian Warna Black/White" +
                        "\n" +
                        "\nHarga Rp.1.999.999"
            ),
            Badminton(
                R.drawable.yonex7,
                nameBadminton = "Yonex Astrox 7",
                descBadminton = "Raket Yonex Astrox 7 " +
                        "\nVarian Warna Black/Orange" +
                        "\n" +
                        "\nHarga Rp.1.800.000"
            ),
            Badminton(
                R.drawable.yonex8,
                nameBadminton = "Yonex Lindan/Lee Chong Wei",
                descBadminton = "Raket Yonex Lindan/Lee Chong Wei" +
                        "\nVarian Warna Black/Green" +
                        "\n" +
                        "\nHarga Rp.1.999.999"

            ),
            Badminton(
                R.drawable.yonex9,
                nameBadminton = "Yonex Voltric DG",
                descBadminton = "Raket Yonex Voltric DG" +
                        "\nVarian Warna Black/Blue" +
                        "\n " +
                        "\nHarga Rp.1.999.999"

            ),
            Badminton(
                R.drawable.yonex10,
                nameBadminton = "Yonex Nano Flare",
                descBadminton = "Raket Yonex Nano Flare " +
                        "\nVarian Warna Black/Green" +
                        "\n" +
                        "\nHarga Rp.2.999.999"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = BadmintonAdapter (this,superheroList){
            val intent = Intent (this,DetailBadmintonActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE,it)
            startActivity(intent)

        }
    }
}