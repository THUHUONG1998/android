package com.example.apptracnghiem.monhoc;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.apptracnghiem.MainActivity;
import com.example.apptracnghiem.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VatlyFragment extends Fragment {


    public VatlyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Môn vật lý");
        return inflater.inflate(R.layout.fragment_vatly, container, false);
    }

}
