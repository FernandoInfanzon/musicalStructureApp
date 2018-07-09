package com.fernandoim.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the album 1 category
        TextView album1 = (TextView) findViewById(R.id.album1);

        // Set a clic listener on that View
        album1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String albumSelected = getResources().getString(R.string.album1);
                Toast.makeText(view.getContext(), "You have selected " + albumSelected , Toast.LENGTH_SHORT).show();
                Intent album1Intent = new Intent(MainActivity.this, Album1Activity.class);
                startActivity(album1Intent);
            }
        });

        // Find the View that shows the album 2 category
        TextView album2 = (TextView) findViewById(R.id.album2);

        // Set a clic listener on that View
        album2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String albumSelected = getResources().getString(R.string.album2);
                Toast.makeText(view.getContext(), "You have selected " + albumSelected , Toast.LENGTH_SHORT).show();
                Intent album2Intent = new Intent(MainActivity.this, Album2Activity.class);
                startActivity(album2Intent);
            }
        });

        // Find the View that shows the album 3 category
        TextView album3 = (TextView) findViewById(R.id.album3);

        // Set a clic listener on that View
        album3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String albumSelected = getResources().getString(R.string.album3);
                Toast.makeText(view.getContext(), "You have selected " + albumSelected , Toast.LENGTH_SHORT).show();
                Intent album3Intent = new Intent(MainActivity.this, Album3Activity.class);
                startActivity(album3Intent);
            }
        });

        // Find the View that shows the album 4 category
        TextView album4 = (TextView) findViewById(R.id.album4);

        // Set a clic listener on that View
        album4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String albumSelected = getResources().getString(R.string.album4);
                Toast.makeText(view.getContext(), "You have selected " + albumSelected , Toast.LENGTH_SHORT).show();
                Intent album4Intent = new Intent(MainActivity.this, Album4Activity.class);
                startActivity(album4Intent);
            }
        });

        // Find the View that shows the album 5 category
        TextView album5 = (TextView) findViewById(R.id.album5);

        // Set a clic listener on that View
        album5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String albumSelected = getResources().getString(R.string.album5);
                Toast.makeText(view.getContext(), "You have selected " + albumSelected , Toast.LENGTH_SHORT).show();
                Intent album5Intent = new Intent(MainActivity.this, Album5Activity.class);
                startActivity(album5Intent);
            }
        });

        // Find the View that shows the album 6 category
        TextView album6 = (TextView) findViewById(R.id.album6);

        // Set a clic listener on that View
        album6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String albumSelected = getResources().getString(R.string.album6);
                Toast.makeText(view.getContext(), "You have selected " + albumSelected , Toast.LENGTH_SHORT).show();
                Intent album6Intent = new Intent(MainActivity.this, Album6Activity.class);
                startActivity(album6Intent);
            }
        });

        // Find the View that shows the album 7 category
        TextView album7 = (TextView) findViewById(R.id.album7);

        // Set a clic listener on that View
        album7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String albumSelected = getResources().getString(R.string.album7);
                Toast.makeText(view.getContext(), "You have selected " + albumSelected , Toast.LENGTH_SHORT).show();
                Intent album7Intent = new Intent(MainActivity.this, Album7Activity.class);
                startActivity(album7Intent);
            }
        });

        // Find the View that shows the album 8 category
        TextView album8 = (TextView) findViewById(R.id.album8);

        // Set a clic listener on that View
        album8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String albumSelected = getResources().getString(R.string.album8);
                Toast.makeText(view.getContext(), "You have selected " + albumSelected , Toast.LENGTH_SHORT).show();
                Intent album8Intent = new Intent(MainActivity.this, Album8Activity.class);
                startActivity(album8Intent);
            }
        });

        // Find the View that shows the album 9 category
        TextView album9 = (TextView) findViewById(R.id.album9);

        // Set a clic listener on that View
        album9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String albumSelected = getResources().getString(R.string.album9);
                Toast.makeText(view.getContext(), "You have selected " + albumSelected , Toast.LENGTH_SHORT).show();
                Intent album9Intent = new Intent(MainActivity.this, Album9Activity.class);
                startActivity(album9Intent);
            }
        });

    }

}

