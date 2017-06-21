package com.example.user.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    private EditText etHeight,etWeight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
    }

    private void findViews() {
        etHeight = (EditText) findViewById(R.id.etHeight);
        etWeight = (EditText) findViewById(R.id.etWeight);
    }

    public void onSubmitbt(View view) {
        String height = etHeight.getText().toString();
        String weight = etWeight.getText().toString();

        Person person = new Person(Double.parseDouble(height),Double.parseDouble(weight));

        Intent intent = new Intent(this,ResultActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("person",person);
        intent.putExtras(bundle);
        startActivity(intent);

    }
}
