package com.example.marco.teoremapitagoras

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mainactivityres.*

class Mainactivityres : AppCompatActivity() {

        companion object ResCompanion {
        val EXTRA_A ="extraA"
        private val DEFAULT_a: Double = -1.0

            val EXTRA_B ="extraB"
            private val DEFAULT_B: Double = -1.0

            val EXTRA_C ="extraC"
            private val DEFAULT_C: Double = -1.0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainactivityres)

          val intent  = intent

        if(intent!=null && intent.hasExtra(Mainactivityres.EXTRA_A)){
            val resA:Double = intent.getDoubleExtra(Mainactivityres.EXTRA_A, Mainactivityres.DEFAULT_a)
            val resB:Double = intent.getDoubleExtra(Mainactivityres.EXTRA_B, Mainactivityres.DEFAULT_B)
            val resC:Double = intent.getDoubleExtra(Mainactivityres.EXTRA_C, Mainactivityres.DEFAULT_C)
            tvresa.setText("Cateto Adyacente : "+resA.toString())
            tvresb.setText("Cateto opuesto: "+resB.toString())
            tvresc.setText("Hipotenusa: "+resC.toString())


        }
    }

}
