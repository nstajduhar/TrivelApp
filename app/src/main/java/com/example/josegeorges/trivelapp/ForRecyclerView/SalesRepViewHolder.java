package com.example.josegeorges.trivelapp.ForRecyclerView;

import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.josegeorges.trivelapp.R;

/**
 * Created by josegeorges on 2017-12-20.
 */

public class SalesRepViewHolder extends RecyclerView.ViewHolder {

    private ImageView salesRep_image;
    private TextView salesRep_name;
    private ImageView salesRep_phone;
    private ImageView salesRep_email;
    private ImageView salesRep_social;

    public SalesRepViewHolder(View itemView) {
        super(itemView);

        salesRep_image = (ImageView) itemView.findViewById(R.id.salesrep_imageView);
        salesRep_name = (TextView) itemView.findViewById(R.id.salesrep_name);
        salesRep_phone = (ImageView) itemView.findViewById(R.id.salesrep_call);
        salesRep_email = (ImageView) itemView.findViewById(R.id.salesrep_email);
        salesRep_social = (ImageView) itemView.findViewById(R.id.salesrep_social);

    }

    public ImageView getSalesRep_image() {
        return salesRep_image;
    }

    public void setSalesRep_image(ImageView salesRep_image) {
        this.salesRep_image = salesRep_image;
    }

    public TextView getSalesRep_name() {
        return salesRep_name;
    }

    public void setSalesRep_name(TextView salesRep_name) {
        this.salesRep_name = salesRep_name;
    }

    public ImageView getSalesRep_phone() {
        return salesRep_phone;
    }

    public void setSalesRep_phone(ImageView salesRep_phone) {
        this.salesRep_phone = salesRep_phone;
    }

    public ImageView getSalesRep_social(){return salesRep_social;}
    public  void  setSalesRep_social(ImageView salesRep_social){
        this.salesRep_social = salesRep_social;
    }

    public ImageView getSalesRep_email() {
        return salesRep_email;
    }

    public void setSalesRep_email(ImageView salesRep_email) {
        this.salesRep_email = salesRep_email;
    }
}
