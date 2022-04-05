package com.example.account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txt1= findViewById(R.id.textView2);
        TextView txt2= findViewById(R.id.textView3);
        TextView txt3= findViewById(R.id.textView4);

        Bundle b=getIntent().getExtras();
        String user=b.getString("name");
        String pass=b.getString("pwd");
        String usertv=b.getString("txtVname");
        String passtv=b.getString("txtVpwd");

        txt1.setText(txt1.getText());
        txt2.setText(usertv + user);
        txt3.setText(passtv + pass);
    }

    public void  backClick(View v){
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}