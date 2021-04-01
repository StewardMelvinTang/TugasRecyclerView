package com.example.tugasrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class profil extends AppCompatActivity {

    TextView textnama;
    TextView textrole;
    ImageView profileicon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        Intent intentkeprofile = getIntent();
        String namabos=intentkeprofile.getStringExtra("namabos");
        String rolebos=intentkeprofile.getStringExtra("rolebos");
        textnama = (TextView) findViewById(R.id.namatext);
        textrole = (TextView) findViewById(R.id.namarole);
        profileicon = (ImageView) findViewById(R.id.profileicon);

        Bundle bundle = getIntent().getExtras();
        int resid = bundle.getInt("profilebos");

        textnama.setText("Nama : "+namabos);
        textrole.setText("Role : "+rolebos);
        profileicon.setImageResource(resid);
    }
}