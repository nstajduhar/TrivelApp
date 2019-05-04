package com.example.josegeorges.trivelapp.ForRecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.josegeorges.trivelapp.R;


/**
 * Created by josegeorges on 2017-11-30.
 */

/**
 * This class will serve has a holder for all the views that are going into the adapter.
 * This way, we don't need to call it everytime, which will improve performance
 * */
public class PackageViewHolder extends RecyclerView.ViewHolder {

    //views
    private ImageView packageIcon;
    private TextView packageTitle;
    private TextView packagePrice;
    private TextView packageDescription;

    private RelativeLayout tripPackage;


    public PackageViewHolder(View itemView) {
        super(itemView);
        packageIcon = (ImageView) itemView.findViewById(R.id.package_icon);
        packageTitle = (TextView) itemView.findViewById(R.id.package_title);
        packagePrice = (TextView) itemView.findViewById(R.id.package_price);
        packageDescription = (TextView) itemView.findViewById(R.id.package_description);


        tripPackage = (RelativeLayout) itemView.findViewById(R.id.tripPackage);

    }



    public ImageView getPackageIcon() {
        return packageIcon;
    }


    public TextView getPackageTitle() {
        return packageTitle;
    }


    public TextView getPackagePrice() {
        return packagePrice;
    }

    public TextView getPackageDescription() {
        return packageDescription;
    }

    public RelativeLayout getTripPackage() {
        return tripPackage;
    }
}
