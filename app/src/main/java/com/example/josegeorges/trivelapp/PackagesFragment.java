package com.example.josegeorges.trivelapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.josegeorges.trivelapp.ForRecyclerView.PackageAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
This fragment will be showing the current Packages Trivel offers
 */
public class PackagesFragment extends Fragment {


    private OnFragmentInteractionListener mListener;


    //needed items
    private RecyclerView recyclerView;
    private ArrayList<TripPackage> tripPackages;

    public PackagesFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tripPackages = new ArrayList<>();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //inflating the view
        View view = inflater.inflate(R.layout.fragment_packages, container, false);
        getActivity().setTitle(R.string.our_packages);
        //linking the recyclerView
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



        //setting up the layoutManager
        LinearLayoutManager myLayoutManager = new LinearLayoutManager(getActivity());
        myLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        //Setting up the Divider
        RecyclerViewDivider itemDecoration = new RecyclerViewDivider(recyclerView.getContext(), R.drawable.recycler_divider);
        //populating packages
        PackagesCreater.populatePackages(tripPackages, (MainActivity) getActivity());
        //making sure that everything is set up first
        if (tripPackages.size() > 0 & recyclerView != null) {
            recyclerView.setAdapter(new PackageAdapter(tripPackages, (MainActivity) this.getActivity()));
        }
        recyclerView.setLayoutManager(myLayoutManager);
        recyclerView.addItemDecoration(itemDecoration);
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
