package com.example.account;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Create", Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this, SplashActivity.class);

    }

    @SuppressLint("WrongViewCast")
    public void buClick(View v){
        EditText txtname = findViewById(R.id.etname);
        EditText txtPwd= findViewById(R.id.etpwd);

        TextView tvname= findViewById(R.id.tvname);
        TextView tvPwd= findViewById(R.id.tvPwd);
        Intent intent2= new Intent(this, MainActivity2.class);

        Bundle b = new Bundle();

        b.putString("name", txtname.getText().toString());
        b.putString("pwd", txtPwd.getText().toString());
        b.putString("txtVname", tvname.getText().toString());
        b.putString("txtVpwd", tvPwd.getText().toString());

        intent2.putExtras(b);
        startActivity(intent2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Start", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Resume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Restart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Pause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Stop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Destroy", Toast.LENGTH_LONG).show();
    }
}