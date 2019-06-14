package com.example.apptracnghiem.monhoc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.apptracnghiem.R;

import java.util.ArrayList;
import java.util.List;

public class ExamAdater extends ArrayAdapter<Exam> {
    private int exam;
    private  int parent;

    public ExamAdater(Context context, ArrayList<Exam> exam) {
        super(context, 0, (List<Exam>) exam);
    }
    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView==null){
            LayoutInflater inflater= LayoutInflater.from(getContext());
            convertView= inflater.inflate(R.layout.item_gridview, parent, false);
        }
        TextView tvName = (TextView) convertView.findViewById(R.id.tvNum_exam);
        ImageView imgIcon =  convertView.findViewById(R.id.imgIcon);

        Exam p = getItem(position);
        if(p!=null){
            tvName.setText("" +p.getName());
            imgIcon.setImageResource(R.drawable.sach);
        }

        return convertView;
    }
}
