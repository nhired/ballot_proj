package com.example.ballot


import android.app.PendingIntent.getActivity
import android.app.PendingIntent.writePendingIntentOrNullToParcel
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_home.*
import org.w3c.dom.Text

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Instead of view.findViewById(R.id.hello) as TextView
        t1?.setOnClickListener {
            val intent = Intent(activity, BillSummary::class.java)
            activity!!.startActivity(intent)
        }
    }


}

