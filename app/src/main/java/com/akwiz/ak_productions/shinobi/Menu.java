package com.akwiz.ak_productions.shinobi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Nitish on 21-Jan-17.
 */

public class Menu extends Fragment {

    public interface  MyInterface{
        public void activityCall(int index);
    }

    MyInterface activityCommander;

    public Menu()
    {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Activity activity = (Activity) context;
        try{
            activityCommander = (MyInterface) activity;
        }
        catch(Exception e)
        {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu, container, false);

        Button nar = (Button)view.findViewById(R.id.n);
        Button sas = (Button)view.findViewById(R.id.s);
        Button kak = (Button)view.findViewById(R.id.k);
        Button ita = (Button)view.findViewById(R.id.i);

        nar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityCommander.activityCall(0);

            }
        });

        sas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                activityCommander.activityCall(1);
            }
        });

        ita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                activityCommander.activityCall(2);
            }
        });

        kak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                activityCommander.activityCall(3);
            }
        });



     return view;
    }
}
