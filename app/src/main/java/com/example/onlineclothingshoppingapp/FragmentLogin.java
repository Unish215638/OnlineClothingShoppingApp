package com.example.onlineclothingshoppingapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.content.Context.MODE_PRIVATE;

public class FragmentLogin extends Fragment implements View.OnClickListener{
    private EditText etUsername,etPassword;
    private Button btnLogin;
    View view;

    public FragmentLogin() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.login_fragment,container,false);

        etUsername = view.findViewById(R.id.etusername);
        etPassword = view.findViewById(R.id.etpassword);
        btnLogin = view.findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);
        return view;
    }

    private void checkUser(){
        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("user",MODE_PRIVATE);
        String username = sharedPreferences.getString("username","");
        String password = sharedPreferences.getString("password","");
        if(validateFields()) {
            if (username.equals(etUsername.getText().toString()) && password.equals(etPassword.getText().toString())) {
                Toast.makeText(this.getActivity(), "Login Successful", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this.getActivity(), dashoardActivity.class);
                startActivity(intent);

            } else {
                Toast.makeText(this.getActivity(), "Invalid username/password", Toast.LENGTH_LONG).show();
            }
        }

    }

    @Override
    public void onClick(View v) {
        checkUser();
    }


    private boolean validateFields() {
        if (TextUtils.isEmpty(etUsername.getText().toString())) {
            etUsername.setError("Enter Username");
            etUsername.requestFocus();
            return false;

        } else if(TextUtils.isEmpty(etPassword.getText().toString())){
            etPassword.setError("Enter Password");
            etPassword.requestFocus();
            return false;

        }
        else {
            return true;
        }
    }
}
