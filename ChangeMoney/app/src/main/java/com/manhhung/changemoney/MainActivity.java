package com.manhhung.changemoney;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtUsd;
    private Button btnChange;
    private TextView txtVnd;
    public  void Change(View view){
        txtVnd.setText((Float.parseFloat(edtUsd.getText().toString()) * 22.80250f) + " VND");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUsd = findViewById(R.id.edtUsd);
        txtVnd = findViewById(R.id.txtVnd);
        btnChange = findViewById(R.id.btnChange);

    }
}