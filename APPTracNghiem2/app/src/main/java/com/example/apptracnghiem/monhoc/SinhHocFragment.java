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
public class SinhHocFragment extends Fragment {


    public SinhHocFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Môn Sinh Học");
        return inflater.inflate(R.layout.fragment_sinh_hoc, container, false);
    }

}
