package com.example.onlineclothingshoppingapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FragmentRegister extends Fragment  implements View.OnClickListener{
    private EditText etfname,etlname,etemail,etdob,etusername,etpassword,etcpassword;
    private Button btnsignup;
 View view;
    public FragmentRegister() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       view=inflater.inflate(R.layout.register_fragment,container,false);
        etfname=view.findViewById(R.id.etfname);
        etlname=view.findViewById(R.id.etlname);
        etemail=view.findViewById(R.id.etemail);
        etusername=view.findViewById(R.id.etusername);
        etdob=view.findViewById(R.id.etdob);
        etpassword=view.findViewById(R.id.etpassword);
        etcpassword=view.findViewById(R.id.etcpassword);
        btnsignup=view.findViewById(R.id.btnsignup);

        btnsignup.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (etcpassword.getText().toString().equals(etpassword.getText().toString())){
            signup();
        }else{
            Toast.makeText(this.getActivity(), "confirm password did not match", Toast.LENGTH_SHORT).show();
        }

    }


    private void signup(){
        SharedPreferences sharedPreferences=this.getActivity().getSharedPreferences("user", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("first_name",etfname.getText().toString());
        editor.putString("last_name",etlname.getText().toString());
        editor.putString("email",etemail.getText().toString());
        editor.putString("username",etusername.getText().toString());
        editor.putString("dob",etdob.getText().toString());
        editor.putString("password",etpassword.getText().toString());
        editor.putString("confirm_password",etcpassword.getText().toString());
        editor.commit();
        Toast.makeText(this.getActivity(), "Successfully Registered", Toast.LENGTH_SHORT).show();
    }
}

