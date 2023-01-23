package com.example.les2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView vhod = findViewById(R.id.text);
        EditText pochta = findViewById(R.id.edit_text);
        TextView privet = findViewById(R.id.text_2);
        TextView b = findViewById(R.id.text_3);
        EditText c = findViewById(R.id.edit_text_1);
        Button d = findViewById(R.id.button_2);
        TextView e = findViewById(R.id.text_4);
        TextView f = findViewById(R.id.text_5);


        pochta.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {}

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if (pochta.getText().toString().isEmpty()){
                    d.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.white1));
                }else{
                    d.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                }
            }
        });

        c.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {}

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if (c.getText().toString().isEmpty()){
                    d.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.white1));
                }else{
                    d.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                }
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pochta.getText().toString().equals("admin") && c.getText().toString().equals("admin")){
                    pochta.setVisibility(View.GONE);
                    vhod.setVisibility(View.GONE);
                    b.setVisibility(View.GONE);
                    c.setVisibility(View.GONE);
                    d.setVisibility(View.GONE);
                    e.setVisibility(View.GONE);
                    f.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Неправильный логин или пароль", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}