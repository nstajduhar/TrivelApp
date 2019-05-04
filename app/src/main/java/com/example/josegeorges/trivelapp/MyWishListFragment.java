package com.example.josegeorges.trivelapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.josegeorges.trivelapp.ForRecyclerView.PackageAdapter;
import com.github.clans.fab.FloatingActionButton;

import java.util.ArrayList;


/**
 * This class will serve the purpose of showing the user's selected packages.
 */
public class MyWishListFragment extends Fragment {


    private OnFragmentInteractionListener mListener;

    //needed items
    private FragmentManager fm;
    private Button goToPackagesButton;
    private TextView isEmptyTextView;
    private RecyclerView recyclerView;
    private ArrayList<TripPackage> tripPackages = new ArrayList<>();
    private PackageAdapter adapter;

    public MyWishListFragment() {
        // Required empty public constructor
    }


    /**
     * This method is called from the MainActivity to add the TripPackage to the ArrayList that is going
     * to populate the RecyclerView through the Adapter.
     *
     * The method checks to see if the selected package is already in the list, if it is then the package
     * will be remove instead. This way we avoid duplicates and it makes sense to change the functioning from
     * adding to removing.
     *
     * TODO: The Toast created by the Fab button shows Added even though is even remove, we have to find a way to fix this
     *
     * @param tripPackage package selected by the user in the TripViewFragment
     */
    public void addToArrayList(TripPackage tripPackage, FloatingActionButton fab){
        boolean contained = false;
        for(int i = 0; i < tripPackages.size(); i++){
            if(tripPackage.getTitle() == tripPackages.get(i).getTitle()) {
                contained = true;
                tripPackages.remove(tripPackages.get(i));
                break;
            }
        }
        if(contained) {
            fab.setLabelText(getString(R.string.fab1_1) + tripPackage.getTitle() + getString(R.string.fab1_2));
            Toast.makeText(getActivity(), tripPackage.getTitle() + getString(R.string.toast_removed), Toast.LENGTH_SHORT).show();
        }
        else {
            tripPackages.add(tripPackage);
            adapter.notifyDataSetChanged();
            fab.setLabelText(getString(R.string.fab1_3) + tripPackage.getTitle() + getString(R.string.fab1_4));
            Toast.makeText(getActivity(), tripPackage.getTitle() + getString(R.string.toast_added), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //inflating the view
        View view = inflater.inflate(R.layout.fragment_my_wish_list, container, false);
        getActivity().setTitle(R.string.wish_list);
        //linking the views
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        isEmptyTextView = (TextView) view.findViewById(R.id.isEmpty_TextView);
        goToPackagesButton = (Button) view.findViewById(R.id.goToPackages_button);

        //setting up the layoutManager
        LinearLayoutManager myLayoutManager = new LinearLayoutManager(getActivity());
        myLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        //Setting up the Divider
        RecyclerViewDivider itemDecoration = new RecyclerViewDivider(recyclerView.getContext(), R.drawable.recycler_divider);


        //if the tripPackages ArrayList is empty, then we show a text view saying that there are no packages yet.
        if (tripPackages.isEmpty()){
            recyclerView.setVisibility(View.GONE);
            isEmptyTextView.setVisibility(View.VISIBLE);
            goToPackagesButton.setVisibility(View.VISIBLE);

            goToPackagesButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    fm = getActivity().getSupportFragmentManager();
                    FragmentTransaction transaction = fm.beginTransaction();
                    transaction.replace(R.id.content, new PackagesFragment());
                    transaction.commit();
                }
            });

            //DEBUGGING PURPOSES
            Log.d("JOSE", "ArrayList is empty " + tripPackages.size());

        //else, we show the RecyclerView with the current TripPackages
        }else{
            recyclerView.setVisibility(View.VISIBLE);
            isEmptyTextView.setVisibility(View.GONE);
            goToPackagesButton.setVisibility(View.GONE);

            //DEBUGGING PURPOSES
            Log.d("JOSE", "ArrayList is NOT empty " + tripPackages.size());
        }

        //setting layoutManager and adapter to the recyclerView
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(myLayoutManager);
        recyclerView.addItemDecoration(itemDecoration);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //setting up the adapter
        adapter = new PackageAdapter(tripPackages, (MainActivity) this.getActivity());
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
