package com.pouya11.phonebook;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ChangePasswordActivity extends AppCompatActivity {

    EditText txtCurrentPassword;
    EditText txtNewPassword;
    EditText txtNewPasswordConfirm;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor sharedPreferencesEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        this.sharedPreferences = getSharedPreferences("com.pouya11.phonebook", MODE_PRIVATE);
        this.sharedPreferencesEditor = this.sharedPreferences.edit();

        this.txtCurrentPassword = (EditText) findViewById(R.id.txt_current_password);
        this.txtNewPassword = (EditText) findViewById(R.id.txt_new_password);
        this.txtNewPasswordConfirm = (EditText) findViewById(R.id.txt_new_password_confirm);
    }

    public void btnChangeClicked(View view) {
        String newPassword = this.txtNewPassword.getText().toString();
        String newPasswordConfirm = this.txtNewPasswordConfirm.getText().toString();
        String currentPassword = this.txtCurrentPassword.getText().toString();

        if(!newPassword.equals(newPasswordConfirm)){
            Toast.makeText(this, "New password and confirm are not same", Toast.LENGTH_LONG).show();
        } else if(!currentPassword.equals(
                sharedPreferences.getString(
                        StaticValues.SP_PASSWORD,
                        StaticValues.SP_PASSWORD_DEFAULT
                )
        )){
            Toast.makeText(this, "Current password is wrong", Toast.LENGTH_LONG).show();
        } else {
            sharedPreferencesEditor.putString(StaticValues.SP_PASSWORD, newPassword);
            sharedPreferencesEditor.commit();
        }
    }

    public void btnCancelClicked(View view) {
        finish();
    }
}
