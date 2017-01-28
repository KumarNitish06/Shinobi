package com.akwiz.ak_productions.shinobi;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


import static android.os.Build.VERSION_CODES.M;

public class Main2Activity extends AppCompatActivity implements Menu.MyInterface{

FragmentManager fragman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

        Fragment f = new Menu();
         getSupportFragmentManager().beginTransaction().add(R.id.frame1, f).commit();



    }

    @Override
    public void activityCall(int index) {
        switch(index)
        {
            case 0 : getSupportFragmentManager().beginTransaction().replace(R.id.frame2, new Naruto()).commit();
                Toast.makeText(this, "I am going to become the Hokage someday, believe it", Toast.LENGTH_LONG).show();
                break;

            case 1 : getSupportFragmentManager().beginTransaction().replace(R.id.frame2, new Sasuke()).commit();
                Toast.makeText(this, "You are such a naive.", Toast.LENGTH_LONG).show();
                break;

            case 2 : getSupportFragmentManager().beginTransaction().replace(R.id.frame2, new Itachi()).commit();
                Toast.makeText(this, "You still have not enough hate.", Toast.LENGTH_LONG).show();
                break;

            case 3 : getSupportFragmentManager().beginTransaction().replace(R.id.frame2, new Kakashi()).commit();
                Toast.makeText(this, "Lightning Blade...", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
