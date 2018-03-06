package com.example.juansebastianquinayasguarin.mrfox;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements PrincipalFragment.OnFragmentInteractionListener,FoxFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pantallaLogin();
    }

    //**************************************************************************************************

    public void pantallaLogin() {
        Fragment fragment = new PrincipalFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.activitymain, fragment).commit();
    }

    public void pantallaFox(){
        Fragment fragment = new FoxFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.activitymain, fragment).commit();
    }

    //**************************************************************************************************
    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
