package com.example.leccion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edit1, edit2;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();
    }


    private void setViews() {
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }

    /*private  void goToResultActivity(){
        startActivity(CheckActivity.makeIntent(this,getWeekNumber()));
    }*/

    @Override
    public void onClick(View view) {
        if (view == btn) {
            Log.e("test", edit1.getText().toString());
            Log.e("test", edit2.getText().toString());


            if (validateUse(edit1.getText().toString(), edit2.getText().toString())) {
                Toast.makeText(this, "Si se pudo", Toast.LENGTH_SHORT).show();

            } else {
                Log.e("test", "no paso la validacion general");
            }


        }

    }


    public boolean validateUse(String email, String password) {

        if (Check.validateEmpty(email) || Check.validateEmpty(password)) {
            Toast.makeText(this, "no paso la validacion empty", Toast.LENGTH_SHORT).show();

            return false;

        }
        if (!Check.validateEmail(email)) {
            Toast.makeText(this, "no paso la validacion email", Toast.LENGTH_SHORT).show();

            return false;
        }
        if (!Check.validateUser(email, password)) {
            Toast.makeText(this, "no paso la validacion user", Toast.LENGTH_SHORT).show();

            return false;
        }


        return true;
    }
}