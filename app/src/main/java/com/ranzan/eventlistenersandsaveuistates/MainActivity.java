package com.ranzan.eventlistenersandsaveuistates;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initValues();
        checkLength();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(editText.getText().toString());
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void initValues() {
        editText = findViewById(R.id.et);
        textView = findViewById(R.id.tv);
        btn = findViewById(R.id.btn);
    }

    private boolean checkLength() {
        if (editText.getText().toString().length() > 6) {
            Toast.makeText(MainActivity.this, editText.getText(), Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}