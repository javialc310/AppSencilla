package com.example.appsencilla

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class SaludoActivity : AppCompatActivity() {
    private lateinit var txtSaludo : TextView
    private lateinit var btnCambiar: Switch
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)
        //Obtenemos una referencia a los controles de la interfaz
        txtSaludo = findViewById(R.id.txtSaludo)
        btnCambiar = findViewById(R.id.btnSwitch)
        //Recuperamos la información pasada en el intent
        val nombre = intent.getStringExtra("NOMBRE")
        val apellido = intent.getStringExtra("APELLIDO")
        //Construimos el mensaje a mostrar
        txtSaludo.text="$nombre"
        btnCambiar.setOnCheckedChangeListener { _, isChecked ->
            val texto:TextView=findViewById(R.id.saludo)
            if (isChecked){
                texto.text="Apellido:"
                txtSaludo.text="$apellido"
            }else {
                texto.text = "Nombre:"
                txtSaludo.text = "$nombre"
            }
        }
    }

    fun volver(view: View) {
        val intent = Intent(this@SaludoActivity, MainActivity::class.java)
        startActivity(intent)
    }

}