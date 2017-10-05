package com.example.admin.tinhtonghaisovahienthilenlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText edtNum1, edtNum2;
    private ListView lv;
    private ArrayAdapter<String> mAdapter;
    private ArrayList<String> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum1 = (EditText) findViewById(R.id.edtNum1);
        edtNum2 = (EditText) findViewById(R.id.edtNum2);

        lv = (ListView) findViewById(R.id.lv);

        mList = new ArrayList<>();
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mList);
        lv.setAdapter(mAdapter);


    }
    public void add(View view){
        String strNum1 = edtNum1.getText().toString();
        String strNum2 = edtNum2.getText().toString();

        double a = Double.parseDouble(strNum1);
        double b = Double.parseDouble(strNum2);

        double kq = a + b;

        String strResult = a+" + "+b+" = "+kq;

        mList.add(0,strResult);
        mAdapter.notifyDataSetChanged();

    }
    public void sub(View view){

        String strNum1 = edtNum1.getText().toString();
        String strNum2 = edtNum2.getText().toString();

        double a = Double.parseDouble(strNum1);
        double b =Double.parseDouble(strNum2);

        double kq = a - b;
        String strResult = a+" - "+b+" = \n"+kq;

        mList.add(0,strResult);
        mAdapter.notifyDataSetChanged();

    }
}
