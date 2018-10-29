package com.lesnyg.edu.explicitintentexample1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSimple = findViewById(R.id.buttonSimple);
        buttonSimple.setOnClickListener(this);
        Button buttonResult = findViewById(R.id.buttonResult);
        buttonResult.setOnClickListener(this);
        Button buttonListview = findViewById(R.id.buttonListview);
        buttonListview.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.buttonSimple:
                Intent intentsimple = new Intent(this,subActivity.class);
                startActivity(intentsimple); break;
            case R.id.buttonResult:
                Intent intentresult = new Intent(this,ActivityResult.class);
                startActivity(intentresult); break;
            case R.id.buttonListview:
                Intent intentlistview = new Intent(this,ActivityListview.class);
                startActivity(intentlistview); break;}
    }
}
