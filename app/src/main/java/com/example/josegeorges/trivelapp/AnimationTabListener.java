package com.example.josegeorges.trivelapp;

import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TabHost;

/**
 * Created by josegeorges on 2017-12-14.
 *
 * This class will help animate the TabHost when tabs are change to make the app look nicer.
 */

public class AnimationTabListener implements TabHost.OnTabChangeListener{

    private static final int ANIMATION_TIME = 240;

    //needed properties
    private Context context;
    private TabHost tabHost;
    private View previousView;
    private View currentView;
    private int currentTab;

    public AnimationTabListener(Context context, TabHost tabHost){
        this.context = context;
        this.tabHost = tabHost;
        previousView = tabHost.getCurrentView();
    }

    @Override
    public void onTabChanged(String s) {
        //Setting animation depending on which tab we are going and coming from
        currentView = tabHost.getCurrentView();
        if (tabHost.getCurrentTab() > currentTab) {
            previousView.setAnimation(toLeftAnimation());
            currentView.setAnimation(fromRightAnimation());
        }else{
            previousView.setAnimation(toRightAnimation());
            currentView.setAnimation(fromLeftAnimation());
        }
        previousView = currentView;
        currentTab = tabHost.getCurrentTab();
    }



    //Animations
    private Animation fromLeftAnimation() {
        Animation fromLeft = new TranslateAnimation(Animation.RELATIVE_TO_PARENT,
                -1.0f,
                Animation.RELATIVE_TO_PARENT,
                0.0f,
                Animation.RELATIVE_TO_PARENT,
                0.0f,
                Animation.RELATIVE_TO_PARENT,
                0.0f);
        return setProperties(fromLeft);
    }



    private Animation toRightAnimation() {
        Animation toRight = new TranslateAnimation(Animation.RELATIVE_TO_PARENT,
                0.0f,
                Animation.RELATIVE_TO_PARENT,
                1.0f,
                Animation.RELATIVE_TO_PARENT,
                0.0f,
                Animation.RELATIVE_TO_PARENT,
                0.0f);
        return setProperties(toRight);
    }

    private Animation fromRightAnimation() {
        Animation fromRight = new TranslateAnimation(Animation.RELATIVE_TO_PARENT,
                1.0f,
                Animation.RELATIVE_TO_PARENT,
                0.0f,
                Animation.RELATIVE_TO_PARENT,
                0.0f,
                Animation.RELATIVE_TO_PARENT,
                0.0f);
        return setProperties(fromRight);
    }

    private Animation toLeftAnimation() {
        Animation toLeft = new TranslateAnimation(Animation.RELATIVE_TO_PARENT,
                0.0f,
                Animation.RELATIVE_TO_PARENT,
                -1.0f,
                Animation.RELATIVE_TO_PARENT,
                0.0f,
                Animation.RELATIVE_TO_PARENT,
                0.0f);
        return setProperties(toLeft);

    }

    //setting final common properties to the animations
    private Animation setProperties(Animation animation) {
        animation.setDuration(ANIMATION_TIME);
        animation.setInterpolator(new AccelerateInterpolator());
        return animation;
    }
}
