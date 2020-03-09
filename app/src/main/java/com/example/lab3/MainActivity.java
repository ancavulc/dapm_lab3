package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText text = (EditText)findViewById(R.id.editText);
        final EditText password = (EditText)findViewById(R.id.editText3);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueText = text.getText().toString();
                String valuePassword = password.getText().toString();

                if(valueText.equals("student") && valuePassword.equals("student")) {
                    Log.e("-----------","INTRA IN IF");
                    Intent i = new Intent(MainActivity.this, FindTheNumberActivity.class);
                    startActivity(i);
                } else {

                    Log.e("-----------","NU INTRA IN IF");
                }
            }
        });

    }
}
