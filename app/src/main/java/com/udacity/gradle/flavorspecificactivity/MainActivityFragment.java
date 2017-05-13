package com.udacity.gradle.flavorspecificactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.udacity.gradle.flavorspecificactivity.paid.jokes;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if(BuildConfig.APPLICATION_ID.equals("com.udacity.gradle.flavorspecificactivity.free"))
        return inflater.inflate(R.layout.fragment_main, container, false);

        else if (BuildConfig.APPLICATION_ID.equals("com.udacity.gradle.flavorspecificactivity.paid"))
            return inflater.inflate(R.layout.mainfragpaid,container,false);


        else
            return inflater.inflate(R.layout.fragment_main, container, false);
    }

public void paidjokes(View view){
    getContext().startActivity(new Intent(getActivity(), jokes.class));
}

}
