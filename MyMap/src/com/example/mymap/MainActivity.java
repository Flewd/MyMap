package com.example.mymap;

//import android.app.Activity;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;



public class MainActivity extends FragmentActivity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
    public void DropPin(View view){
    	
   	 EditText LongET = (EditText) findViewById(R.id.LongET);
     String Longatude = LongET.getText().toString();
     
     EditText LatET = (EditText) findViewById(R.id.LatET);
     String Latitude = LatET.getText().toString();
    	
    GoogleMap googleMap = ((SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
    	
      final LatLng TutorialsPoint = new LatLng(Float.valueOf(LongET.getText().toString()), Float.valueOf(LatET.getText().toString()));
      Marker TP = googleMap.addMarker(new MarkerOptions().position(TutorialsPoint).title("User Pin")); 
	    
    }
    
       
    
}
