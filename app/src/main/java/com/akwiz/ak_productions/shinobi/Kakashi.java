package com.akwiz.ak_productions.shinobi;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Nitish on 21-Jan-17.
 */

public class Kakashi extends Fragment{

    public Kakashi()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.kakashi, container, false);

        return view;
        }
}
