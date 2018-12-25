package com.example.adnanshakeel.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;

public class HistoryActivity extends AppCompatActivity {
    private Button btnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        btnback=findViewById(R.id.btnBack);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HistoryActivity.this,PatientDetailActivity.class);
                startActivity(intent);

            }
        });
    }
}
