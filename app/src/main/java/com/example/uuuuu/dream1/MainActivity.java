package com.example.uuuuu.dream1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText uname;
    private EditText pass;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname = (EditText) findViewById(R.id.uname);
        pass = (EditText) findViewById(R.id.pass);
        button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //variable untuk menyimpan
                String username = uname.getText().toString();
                String password = pass.getText().toString();

                if (username.equals ("admin") && password.equals("admin")) {
                    /*Toast.makeText(MainActivity.this,
                            "Selamat Anda Berhasil Login",
                            Toast.LENGTH_LONG).show();*/
                    Intent detailintent = new Intent(MainActivity.this, DetailActivity.class);
                    detailintent.putExtra(Intent.EXTRA_TEXT, username);
                    startActivity(detailintent);
                } else{
                    Toast.makeText(MainActivity.this,
                            "Username dan/atau Password Salah !",
                            Toast.LENGTH_LONG).show();
                }

                /*Toast.makeText(MainActivity.this,
                        "Username : " + username + " Password : " + password,
                        Toast.LENGTH_LONG).show();*/
            }
        });
    }
}
