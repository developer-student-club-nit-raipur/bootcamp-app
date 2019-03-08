package com.dsc.bootcamp.dscbootcamp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private TinyDB db;
    private Button btnLogin;
    private EditText etEmail, etPassword;
    private String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        db = new TinyDB(this);
        initView();
        btnLogin.setOnClickListener(this);
    }

    //To initialise the UI element
    private void initView(){
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
    }

    //To check email and password
    private void login(){
        email = etEmail.getText().toString().trim();
        password = etPassword.getText().toString();

        if(email.isEmpty() || password.isEmpty()){
            Toast.makeText(this, "One or more fields empty", Toast.LENGTH_LONG).show();
        }
        else{
            if(checkAuthrization()){
                //User is authrized to login
                Toast.makeText(this, "Login successfully", Toast.LENGTH_LONG).show();
                //Now we may switch to another activity

            }
            else{
                Toast.makeText(this, "Invalid Username and Password", Toast.LENGTH_LONG).show();
            }
        }
    }

    //To match username and password
    private Boolean checkAuthrization(){
        if(db.getString("email").equals(email) && db.getString("password").equals(password)){
            return true;
        }
        else
            return false;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLogin:
                login();
                break;
        }
    }
}
