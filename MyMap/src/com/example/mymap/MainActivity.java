package com.example.mymap;

//import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;



public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
//        googleMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
        
//        final LatLng TutorialsPoint = new LatLng(21 , 57);
//        Marker TP = googleMap.addMarker(new MarkerOptions().position(TutorialsPoint).title("TutorialsPoint")); 

      //  final LatLng myLatLng = new LatLng(googleMap.getMyLocation().getLatitude() , googleMap.getMyLocation().getLongitude());
      //  Marker myLocation = googleMap.addMarker(new MarkerOptions().position(myLatLng).title("TutorialsPoint")); 

    }
    public void SwitchFragment(View view){
    	
    	
        Fragment frag;
        frag = new MenuFragment();

        FragmentManager fm = getFragmentManager();
	    FragmentTransaction fragmentTransaction = fm.beginTransaction();
	    fragmentTransaction.replace(R.id.map, frag);
	    fragmentTransaction.commit();
	    
    }
    
       
    
}
