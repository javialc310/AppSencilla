package com.example.appsencilla
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    private lateinit var txtNombre: EditText
    private lateinit var txtApellido: EditText
    private lateinit var btnAceptar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Obtenemos una referencia a los controles de la interfaz
        txtNombre = findViewById(R.id.txtNombre)
        txtApellido=findViewById(R.id.txtApellido)
        btnAceptar = findViewById(R.id.btnAceptar)
        btnAceptar.setOnClickListener {
            //Creamos el Intent
            val intent = Intent(this@MainActivity, SaludoActivity::class.java)
            //Añadimos al intent la información a pasar entre actividades
            intent.putExtra("NOMBRE", txtNombre.text.toString())
            intent.putExtra("APELLIDO", txtApellido.text.toString())
            //Iniciamos la nueva actividad
            startActivity(intent)
        }

    }

}