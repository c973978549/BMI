package com.example.user.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView tvBMI,tvLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        findViews();

        Object obj = getIntent().getExtras().getSerializable("person");
        Person person = (Person) getIntent().getExtras().getSerializable("person");
        if(person != null){
            tvBMI.setText(person.toString());
            tvLevel.setText(person.judgeLevel());
        }
    }

    private void findViews() {
        tvBMI = (TextView) findViewById(R.id.tvBMI);
        tvLevel= (TextView) findViewById(R.id.tvLevel);
    }

    public void onBackClick(View view) {
        finish();
    }
}
