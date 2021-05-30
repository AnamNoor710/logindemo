package com.example.phonenumberauth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class recycleview extends AppCompatActivity {

    RecyclerView rcv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleview);

        rcv=(RecyclerView)findViewById(R.id.recyleview);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        String arr[]={"Complaint1","Complaint2","Complaint3","Complaint4","Complaint5","Complaint6","Complaint7","Complaint8","Complaint9","Complaint10","Complaint11","Complaints12","C","C++","JAVA","PHP",".NEt","JQuery"};
        rcv.setAdapter(new myAdapter(arr));


    }
}