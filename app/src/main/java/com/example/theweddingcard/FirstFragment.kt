package com.example.theweddingcard

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import java.util.*


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        view.findViewById<TextView>(R.id.mapLink).setOnClickListener {
//            val uri: String =
//                java.lang.String.format(Locale.ENGLISH, "geo:%f,%f", latitude, longitude)
//            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
//            context!!.startActivity(intent)
//        }
    }

}