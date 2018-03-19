package com.example.craig.mtglifecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int p1Life = 20;
    int p1Poison = 0;
    int p2Life = 20;
    int p2Poison = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void p1IncrementLife(View view) {
        p1Life++;
        TextView lifeText = findViewById(R.id.p1Life);
        lifeText.setText(String.valueOf(p1Life));
    }

    public void p1DecrementLife(View view) {
        p1Life--;
        TextView lifeText = findViewById(R.id.p1Life);
        lifeText.setText(String.valueOf(p1Life));
    }

    public void p1IncrementPoison(View view) {
        p1Poison++;
        TextView psnText = findViewById(R.id.p1Poison);
        psnText.setText(String.valueOf(p1Poison));
    }

    public void p2IncrementLife(View view) {
        p2Life++;
        TextView lifeText = findViewById(R.id.p2Life);
        lifeText.setText(String.valueOf(p2Life));
    }

    public void p2DecrementLife(View view) {
        p2Life--;
        TextView lifeText = findViewById(R.id.p2Life);
        lifeText.setText(String.valueOf(p2Life));
    }

    public void p2IncrementPoison(View view) {
        p2Poison++;
        TextView psnText = findViewById(R.id.p2Poison);
        psnText.setText(String.valueOf(p2Poison));
    }

    public void reset(View view) {
        TextView txtView = findViewById(R.id.p1Life);
        txtView.setText(String.valueOf(p1Life = 20));
        txtView = findViewById(R.id.p1Poison);
        txtView.setText(String.valueOf(p1Poison = 0));
        txtView = findViewById(R.id.p2Life);
        txtView.setText(String.valueOf(p2Life = 20));
        txtView = findViewById(R.id.p2Poison);
        txtView.setText(String.valueOf(p2Poison = 0));
    }
}
