package com.example.examen1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_confrimar_cliente.*

class ConfrimarCliente : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confrimar_cliente)

        btn_regresar.setOnClickListener(){
            finish()
        }

        val  bundle = intent.extras

        val nom_clie = bundle?.getString("nom_clie")
        val dni_clie = bundle?.getString("dni_clie")
        val serv_inst = bundle?.getString("serv_inst")
        val cos_inst = bundle?.getString("cos_inst")
        val cos_ser = bundle?.getString("cos_ser")
        val desc = bundle?.getString("desc")
        val total = bundle?.getString("total")

        tv_nom_clie.setText(nom_clie)
        tv_dni.setText(dni_clie)
        tv_serv_inst.setText(serv_inst)
        tv_cot_inst.setText(cos_inst)
        tv_cost_serv.setText(cos_ser)
        tv_desc.setText(desc)
        tv_total.setText(total)

    }
}


