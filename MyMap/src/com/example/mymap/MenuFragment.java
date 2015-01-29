package com.example.mymap;

import android.os.Bundle;
import android.view.View;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class MenuFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_menu_fragment, container, false);
    }
}
