package com.example.listadodealumnos

import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {

    private val alumnos = mutableListOf<Alumno>()
    private lateinit var adapter: AlumnoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val btnAgregar: Button = findViewById(R.id.btnAgregar)

        adapter = AlumnoAdapter(alumnos)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        btnAgregar.setOnClickListener {
              alumnos.add(Alumno("shrek", "123456", R.drawable.shrek, "shrek@ejemplo.com"))
            adapter.notifyDataSetChanged()
            alumnos.add(Alumno("burro", "654321", R.drawable.burro, "burro@ejemplo.com"))
            adapter.notifyDataSetChanged()
            alumnos.add(Alumno("fiona", "987654", R.drawable.fiona, "fiona@ejemplo.com"))
            adapter.notifyDataSetChanged()
            alumnos.add(Alumno("dragona", "456789", R.drawable.dragona, "dragona@ejemplo.com"))
        }
    }
}