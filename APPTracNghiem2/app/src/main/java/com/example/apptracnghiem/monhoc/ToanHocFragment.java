package com.example.apptracnghiem.monhoc;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListAdapter;

import com.example.apptracnghiem.MainActivity;
import com.example.apptracnghiem.R;
import com.example.apptracnghiem.question.ScreenSlideActivity;


import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ToanHocFragment extends Fragment {

    ExamAdater examAdater;
    GridView gvExam;
    ArrayList<Exam> arr_exam = new ArrayList<Exam>();
    public ToanHocFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Môn toán học");
        return inflater.inflate(R.layout.fragment_toan_hoc, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        gvExam =(GridView) getActivity().findViewById(R.id.gvExam);
        arr_exam.add(new Exam("đề số 1 "));
        arr_exam.add(new Exam("đề số 2 "));
        arr_exam.add(new Exam("đề số 3 "));
        arr_exam.add(new Exam("đề số 4 "));
        arr_exam.add(new Exam("đề số 5 "));
        arr_exam.add(new Exam("đề số 6 "));
        // gán giá trị vào bảng
        examAdater = new ExamAdater(getActivity(), arr_exam);
        gvExam.setAdapter(examAdater);
        gvExam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> AdapterView, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), ScreenSlideActivity.class);
                intent.putExtra("num_exam", position+1);
                intent.putExtra("subject", "toan");
                intent.putExtra("test", "yes");
                startActivity(intent);
            }
        });


    }
}
