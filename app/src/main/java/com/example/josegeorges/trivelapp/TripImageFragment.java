package com.example.josegeorges.trivelapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


/**
 * This Fragment is used to show the images inside the ViewPager from TripViewFragment
 */
public class TripImageFragment extends Fragment {

    //key for the bundle
    private static final String IMAGE = "image";

    //variable receiving the image
    private int image;

    private OnFragmentInteractionListener mListener;

    public TripImageFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param image image to populate the imageView with.
     * @return A new instance of fragment TripImageFragment.
     */
    public static TripImageFragment newInstance(int image) {
        TripImageFragment fragment = new TripImageFragment();
        Bundle args = new Bundle();
        args.putInt(IMAGE, image);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            //setting the image ID here
            image = getArguments().getInt(IMAGE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //inflating the view
        View view =  inflater.inflate(R.layout.fragment_trip_image, container, false);

        //simply set the image to the received image
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        Picasso.with(getContext()).load(image).into(imageView);
        //imageView.setImageResource(image);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);

        return view;
    }

        /*

The code below comes with the Fragment to create interaction between Fragments
    it is not being used but left it in case of need for future usage.

     */

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
