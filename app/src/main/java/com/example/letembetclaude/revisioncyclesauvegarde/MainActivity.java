package com.example.letembetclaude.revisioncyclesauvegarde;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int random1;
    int random2;
    int random3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView de1 = findViewById(R.id.de1);
        TextView de2 = findViewById(R.id.de2);
        TextView de3 = findViewById(R.id.de3);

        if (savedInstanceState != null) {
            random1 = savedInstanceState.getInt("de1");
            random2 = savedInstanceState.getInt("de2");
            random3 = savedInstanceState.getInt("de3");
        }

        else {
            random1 = new Random().nextInt(5) + 1;
            random2 = new Random().nextInt(5) + 1;
            random3 = new Random().nextInt(5) + 1;
        }

        de1.setText(Integer.toString(random1));
        de2.setText(Integer.toString(random2));
        de3.setText(Integer.toString(random3));

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("de1", random1);
        outState.putInt("de2", random2);
        outState.putInt("de3", random3);
        super.onSaveInstanceState(outState);
    }
}
