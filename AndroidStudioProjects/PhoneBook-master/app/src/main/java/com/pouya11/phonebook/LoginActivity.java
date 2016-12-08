package com.pouya11.phonebook;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText txtPassword;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sharedPreferences = getSharedPreferences(StaticValues.SP_NAME, MODE_PRIVATE);

        txtPassword = (EditText) findViewById(R.id.txt_password);
    }

    public void btnLoginClicked(View view) {
        if(txtPassword.getText().toString().equals(
                sharedPreferences.getString(
                        StaticValues.SP_PASSWORD, StaticValues.SP_PASSWORD_DEFAULT
                )
        )){
            startActivity(new Intent(this, MainActivity.class));
        }
    }

}
