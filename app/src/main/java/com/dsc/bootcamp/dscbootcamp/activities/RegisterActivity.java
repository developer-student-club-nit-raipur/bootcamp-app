package com.dsc.bootcamp.dscbootcamp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.dsc.bootcamp.dscbootcamp.R;
import com.dsc.bootcamp.dscbootcamp.utils.TinyDB;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etName, etEmail, etPassword, etConfirmPassword;
    private Button btnRegister;
    private String name, email, password, confirmPassword;
    private TinyDB db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        db = new TinyDB(this);
        initView();
        btnRegister.setOnClickListener(this);
    }

    //Initialising the components of UI
    private void initView(){
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        btnRegister = findViewById(R.id.btnRegister);
    }

    //Function to save data or do whatever when we register the user
    private void register(){
        setData();
        if(name.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() ||
                !(password.equals(confirmPassword))){
            Toast.makeText(this, "One or more fields empty", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Registered Successfully", Toast.LENGTH_LONG).show();
            //Saving to cache memory
            db.putString("name", name);
            db.putString("email", email);
            db.putString("password", password);

            //Going to new activity
            Intent i = new Intent(this, LoginActivity.class);
            startActivity(i);

            //Destroying this activity
            finish();
        }
    }

    //Function to get the value from edit text and store to a string
    private void setData(){
        name = etName.getText().toString().trim();
        email = etEmail.getText().toString().trim();
        password = etPassword.getText().toString().trim();
        confirmPassword = etConfirmPassword.getText().toString();//Should never be trimmed
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnRegister:
                register();
                break;
        }
    }


}
