package com.manhhung.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText edtName;
    private EditText edtPass;

    public  void login(View view){
        Log.i("Login", "Login start");
        Log.d("Username", edtName.getText().toString());
        Log.d("Password", edtPass.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);
        edtName = findViewById(R.id.edtName);
        edtPass = findViewById(R.id.edtPass);

//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.i("Login", "Login start");
//                Log.d("Username", edtName.getText().toString());
//                Log.d("Password", edtPass.getText().toString());
//            }
//        });
    }
}