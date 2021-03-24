package com.airongomes.myanimations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.FragmentTransaction
import com.bumptech.glide.Glide


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentImage.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentImage : Fragment() {
    var setImage: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_show_photo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageView = view.findViewById<ImageView>(R.id.fullscreen_image)

        view.findViewById<View>(R.id.fragment_container).setOnClickListener{
            requireActivity()
                .supportFragmentManager.
                beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .remove(this).commit()
        }

        setImage?.let {
            Glide.with(requireActivity()).load(it).into(imageView)
        }

    }
}