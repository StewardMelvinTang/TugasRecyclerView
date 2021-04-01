package com.example.tugasrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements DataAdapter.ViewHolder.OnNoteListener {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<DataClass> userList;
    DataAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        initData();
        initRecyclerView();





    }

    //input data here
    private void initData() {
        userList = new ArrayList<>();

        userList.add(new DataClass(R.drawable.avatar2, "Steward Melvin Tang", "Programmer & GameDesigner"));
        userList.add(new DataClass(R.drawable.avatar3, "Muhammad Azmiy Nurrasyid", "GameProducer & GameDesigner"));
        userList.add(new DataClass(R.drawable.avatar5, "Ayuni Fu'adah", "Visual Artist"));
        userList.add(new DataClass(R.drawable.avatar1, "Samuel Yudi Gunawan", "Game Designer & BugHunter"));
        userList.add(new DataClass(R.drawable.avatar4, "Vincent Prasetyo", "Programmer"));
        userList.add(new DataClass(R.drawable.avatar6, "Zaebi Hidayatullah", "Programmer & GameProducer"));
    }



    private void initRecyclerView() {
        recyclerView=findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new DataAdapter(userList, this);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onNoteClick(int position, String nama, String role, int profile) {
        Intent intentkeprofile = new Intent(MainActivity.this, profil.class);
        intentkeprofile.putExtra("namabos", ""+nama);
        intentkeprofile.putExtra("rolebos", ""+role);
        intentkeprofile.putExtra("profilebos", profile);
        startActivity(intentkeprofile);

    }
}