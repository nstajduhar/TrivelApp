package com.example.josegeorges.trivelapp.ForRecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.josegeorges.trivelapp.MainActivity;
import com.example.josegeorges.trivelapp.R;
import com.example.josegeorges.trivelapp.SalesRep;

import java.util.ArrayList;

/**
 * Created by josegeorges on 2017-12-20.
 */

public class SalesRepAdapter extends RecyclerView.Adapter<SalesRepViewHolder> {

    //array of salesrep going to te recyclerView
    private ArrayList<SalesRep> list;


    //activity and fragmentManager
    private MainActivity activity;
    private FragmentManager fm;

    /**
     *
     * @param list the list use to populate items in the recyclerView
     * @param activity needed to create intents from this class
     */
    public SalesRepAdapter(ArrayList<SalesRep> list, MainActivity activity) {
        this.list = list;
        this.activity = activity;
    }


    @Override
    public SalesRepViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.salesrep_items, parent, false);
        SalesRepViewHolder holder = new SalesRepViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(SalesRepViewHolder holder, final int position) {
        holder.getSalesRep_image().setImageResource(list.get(position).getImageID());
        holder.getSalesRep_name().setText(list.get(position).getName());
        holder.getSalesRep_phone().setImageResource(R.drawable.ic_call_black_24dp);
        holder.getSalesRep_email().setImageResource(R.drawable.ic_email_black_24dp);

        holder.getSalesRep_phone().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("INTENTS", "Calling " + list.get(position).getPhone());
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + list.get(position).getPhone()));
                if(intent.resolveActivity(activity.getPackageManager()) != null){
                    activity.startActivity(intent);
                }
            }
        });

        holder.getSalesRep_email().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("INTENTS", "Emailing " + list.get(position).getEmail());
                String[] emailAddress = {list.get(position).getEmail()};
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, emailAddress);
                intent.putExtra(Intent.EXTRA_SUBJECT, "Book trip");
                intent.putExtra(Intent.EXTRA_TEXT, "Hey " + list.get(position).getName() + " I was contacting you about...");
                if(intent.resolveActivity(activity.getPackageManager()) != null){
                    activity.startActivity(intent);
                }
            }
        });

        holder.getSalesRep_social().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("INTENTS", "Social " + list.get(position).getSocial());
                String[] socialLink = {list.get(position).getSocial()};
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.facebook.com/Trivel-341889966290364/"));
                if(intent.resolveActivity(activity.getPackageManager()) != null){
                    activity.startActivity(intent);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
