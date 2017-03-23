package com.sportapp.boot3.meetappoutside;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Delug on 23/03/2017.
 */

public class Register extends AppCompatActivity {

    EditText etName, etMail, etPassword;
    String name, email, password;
    Button btnRegister;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);
        etName = (EditText) findViewById(R.id.etNewName);
        etMail = (EditText) findViewById(R.id.etNewEmail);
        etPassword = (EditText) findViewById(R.id.etNewPassword);
        btnRegister = (Button) findViewById(R.id.btnNewRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = etName.getText().toString();
                email = etMail.getText().toString();
                password = etPassword.getText().toString();
                String task = "Register";
                BackgroundTask backgroundTask = new BackgroundTask(Register.this);
                BackGroundTask.execute(task,name,email,password);
                finish();

            }
        });


    }
}

