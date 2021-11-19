package com.example.appfinal

import android.app.SearchManager
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageButton


class SearchFragment : Fragment() {

    private lateinit var searchBtn:ImageButton
    private lateinit var queryText: EditText


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_search, container, false)

        searchBtn = view.findViewById(R.id.search_btn)

        searchBtn.setOnClickListener{

            queryText = view.findViewById(R.id.search_q)
            val q = queryText.getText().toString()

            if (q.length > 0){
                val intent = Intent(Intent.ACTION_WEB_SEARCH)
                intent.putExtra(SearchManager.QUERY, q)
                startActivity(intent)
            }
        }

        return view
    }
}
