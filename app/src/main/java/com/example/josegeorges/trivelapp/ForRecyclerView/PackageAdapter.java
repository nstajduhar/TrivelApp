package com.example.josegeorges.trivelapp.ForRecyclerView;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.josegeorges.trivelapp.MainActivity;
import com.example.josegeorges.trivelapp.R;
import com.example.josegeorges.trivelapp.TripPackage;
import com.example.josegeorges.trivelapp.TripViewFragment;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by josegeorges on 2017-11-30.
 */
/**
 * The adapter will be in charge of populating the recyclerView with the information needed
 * */
public class PackageAdapter extends RecyclerView.Adapter<PackageViewHolder> {


    //array of packages going to te recyclerView
    private ArrayList<TripPackage> list;

    //activity and fragmentManager
    private MainActivity activity;
    private FragmentManager fm;

    /**
     *
     * @param list the list use to populate items in the recyclerView
     * @param activity needed to create fragment transactions from this class
     */
    public PackageAdapter(ArrayList<TripPackage> list, MainActivity activity) {
        this.list = list;
        this.activity = activity;
    }

    @Override
    public PackageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.packages_items, parent, false);
        PackageViewHolder holder = new PackageViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(PackageViewHolder holder, final int position) {
       // holder.getPackageIcon().setImageResource(list.get(position).getImagesId()[0]);
        Picasso.with(activity.getBaseContext()).load(list.get(position).getImagesId()[0]).resize(50,25).centerCrop().into(holder.getPackageIcon());
        holder.getPackageTitle().setText(list.get(position).getTitle());
        holder.getPackageDescription().setText(list.get(position).getDescription());
        holder.getPackagePrice().setText(list.get(position).getPrice());

         /*
        * I made a setOnClickListener for the relativeLayout to simulate when an item is pressed. I made it this way
        * because we only need to press the item just once and this way makes it easy.
        *
        * It will pass the list of tripPackages and position, so that we can locate the one we are currently
        *   on and populate the fragment with the correct information
        *
        * */
        holder.getTripPackage().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("JOSE", list.get(position).getTitle() + " was pressed");
                fm = activity.getSupportFragmentManager();
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.setCustomAnimations(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out);
                transaction.replace(R.id.content, TripViewFragment.newInstance(list, position));
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
    }


    @Override
    public int getItemCount() {
        return list.size();
    }
}
