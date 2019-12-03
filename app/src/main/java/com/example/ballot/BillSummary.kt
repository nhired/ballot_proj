package com.example.ballot

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bill_summary.*

class BillSummary : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bill_summary)

        back_arrow?.setOnClickListener {
            val quitIntent = Intent(this@BillSummary, MainActivity::class.java)
            startActivity(quitIntent)
        }
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        // Instead of view.findViewById(R.id.hello) as TextView
//        back_arrow?.setOnClickListener {
//            val intent = Intent(activity, HomeFragment::class.java)
//            activity!!.startActivity(intent)
//        }


}
