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

    }

}

