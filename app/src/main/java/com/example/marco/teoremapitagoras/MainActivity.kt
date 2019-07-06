package com.example.marco.teoremapitagoras

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var a: Double = 0.0
    var b: Double = 0.0
    var c: Double = 0.0
    var x:Double = 0.0

    var res: Double = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcularb(v: View){
        if (eta.text.isEmpty()) {
            Toast.makeText(this, "A no esta especificado", Toast.LENGTH_SHORT).show()
            eta.requestFocus()
        }else if (etc.text.isEmpty()) {
            Toast.makeText(this, "C no esta especificado", Toast.LENGTH_SHORT).show()
            etc.requestFocus()

        }else{
            a = eta.text.toString().toDouble()
            c = etc.text.toString().toDouble()
            x= ((c*c)-(a*a))
            b = Math.sqrt(x)
            etb.setText(b.toString())
        }

    }
    fun calculara(v: View){
        if (etb.text.isEmpty()) {
            Toast.makeText(this, "B no esta especificado", Toast.LENGTH_SHORT).show()
            etc.requestFocus()
        }else if (etc.text.isEmpty()) {
            Toast.makeText(this, "C no esta especificado", Toast.LENGTH_SHORT).show()
            etb.requestFocus()

        }else{
            b = etb.text.toString().toDouble()
            c = etc.text.toString().toDouble()
            x= ((c*c)-(b*b))
            a = Math.sqrt(x)
            eta.setText(a.toString())
        }

    }
    fun calcularc(v: View){
        if (etb.text.isEmpty()) {
            Toast.makeText(this, "B no esta especificado", Toast.LENGTH_SHORT).show()
            etb.requestFocus()
        }else if (eta.text.isEmpty()) {
            Toast.makeText(this, "C no esta especificado", Toast.LENGTH_SHORT).show()
            eta.requestFocus()

        }else{
            b = etb.text.toString().toDouble()
            a = eta.text.toString().toDouble()
            x = ((a*a)+(b*b));
            c = Math.sqrt(x)
            etc.setText(a.toString())
        }

    }
    fun valida(v:  View) {
        if (eta.text.isEmpty()) {
            Toast.makeText(this, "campos vacios", Toast.LENGTH_SHORT).show()
            eta.requestFocus()
        }else if (etb.text.isEmpty()) {
            Toast.makeText(this, "campos vacios", Toast.LENGTH_SHORT).show()
            etb.requestFocus()

        }else if (etc.text.isEmpty()) {
            Toast.makeText(this, "campos vacios", Toast.LENGTH_SHORT).show()
            etc.requestFocus()
        }else{
            val intent = Intent(this, Mainactivityres::class.java)
            intent.putExtra(Mainactivityres.EXTRA_A,a)
            intent.putExtra(Mainactivityres.EXTRA_B,b)
            intent.putExtra(Mainactivityres.EXTRA_C,c)
            startActivity(intent)
        }
    }

}