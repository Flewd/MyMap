package com.example.mymap;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.app.Activity;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;


import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

public class MenuFragment extends Fragment {
	
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_menu_fragment, container, false);
    }
    
}
