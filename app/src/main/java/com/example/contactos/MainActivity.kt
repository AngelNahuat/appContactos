package com.example.contactos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ListView
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar=findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        var contacto:ArrayList<Contacto>
        contacto= ArrayList()
        contacto!!.add(Contacto("Angel","Nahuat","Telmex",18,55.0F,"Felipe Carrillo Puerto 77200","9831152335","nglnahuat@gmail.com",R.drawable.foto_01))
        val lista=findViewById<ListView>(R.id.lista)
        val adapter=AdaptadorCustom(this, contacto!!)
        lista.adapter=adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){
            R.id.newview->{
                val intent=Intent(this,Detalle::class.java)
                startActivity(intent)
                return true

            }else->{ return super.onOptionsItemSelected(item)}
        }

        }


}