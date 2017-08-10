package com.example.uuuuu.dream1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    private TextView textView2;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textView2 = (TextView) findViewById(R.id.textView2);
        button2 = (Button) findViewById(R.id.button2);

        Intent mainIntent = getIntent();
        String username = mainIntent.getStringExtra(Intent.EXTRA_TEXT);
        textView2.setText("Welcome, " + username);


        Toast.makeText(this, "You are logged in", Toast.LENGTH_LONG).show();

        /**
         * *Tampilkan aktifitas di sini
         **/


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logoutintent = new Intent(DetailActivity.this, MainActivity.class);
                startActivity(logoutintent);
            }
        });


    }
}
