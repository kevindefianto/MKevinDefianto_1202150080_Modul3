package com.example.android.mkevindefianto_1202150080_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //menginisiasi variabel
    public TextView mUser, mPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //memanggil id agar variabel berfungsi

        mUser = (TextView)findViewById(R.id.txtUsername);
        mPass = (TextView)findViewById(R.id.txtPassword);
    }


    public void loginCheck(){
        //menginisasi dan memanggil id agar dapat berfungsi
        String strUser,strPass;
        strUser = mUser.getText().toString();
        strPass = mPass.getText().toString();
        //membuat pengkondisian jika password benar akan pindah ke activity selanjutnya jika salah tetap stay diactivity ini dan akan ada toast yang mengingatkan
        if(!(strUser.equals("EAD") && strPass.equals("MOBILE"))){
            Toast.makeText(this,"Wrong password or username",Toast.LENGTH_SHORT).show();
            return;
        }else{
            Toast.makeText(this,"Berhasil Sign-In",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this,DaftarMenu.class));
        }
    }
    //mengaktifkan tombol button
    public void login(View v){
        loginCheck();
    }
}
