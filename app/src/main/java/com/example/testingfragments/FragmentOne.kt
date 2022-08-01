package com.example.testingfragments

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentOne.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentOne : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    var TAG = "Prakash"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "fragOne onAttach called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        Log.d(TAG, "fragOne onCreate called")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d(TAG, "fragOne onCreateView called")
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "fragOne onPause called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "fragOne onResume called")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "fragOne onStart called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "fragOne onStop called")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "fragOne onDetach called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "fragOne onDestroy called")
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FragmentOne.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FragmentOne().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}