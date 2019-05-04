package com.example.onlineclothingshoppingapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static android.content.Context.MODE_PRIVATE;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentAddItem extends Fragment implements View.OnClickListener {
    private static final String FILE_NAME = "items.txt";
    private EditText itemname, itemprice, itemimagename, itemdescription;
    Button btnadditem;
    View view;

    public FragmentAddItem() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.add_item_fragment, container, false);
        itemname = view.findViewById(R.id.etitemName);
        itemprice = view.findViewById(R.id.etItemprice);
        itemimagename = view.findViewById(R.id.etImagename);
        itemdescription = view.findViewById(R.id.etItemdescription);
        btnadditem = view.findViewById(R.id.btnAddItem);
        btnadditem.setOnClickListener(this);
        return view;

    }


    @Override
    public void onClick(View v) {
        String item_name = itemname.getText().toString();
        String item_price = itemprice.getText().toString();
        String item_image_name = itemimagename.getText().toString();
        String item_description = itemdescription.getText().toString();
//        FileOutputStream fos = null;

//
//        try {
//            FileOutputStream fos=openFileOutput(FILE_NAME,MODE_PRIVATE);
//            fos.write(item_name.getBytes());
//            fos.write(item_price.getBytes());
//            fos.write(item_image_name.getBytes());
//            fos.write(item_description.getBytes());
//            fos.close();
//            Toast.makeText(this.getActivity(), "SAved To"+getFilesDir()+"/"+FILE_NAME, Toast.LENGTH_LONG).show();
//            itemname.setText("");
////                    Log.d(TAG, "onClick: Saved To"+getFilesDir()+"/"+FILE_NAME);
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//







}



}
