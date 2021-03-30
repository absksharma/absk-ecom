package com.example.absk;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class item1 extends AppCompatActivity implements AdapterView.OnItemClickListener {


    String ar[] ={"item","item2","item3","item4","item5","item6","item7","item8","item9","item10","item11"};
    ListView lv;
    ArrayAdapter ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item1);
        lv=findViewById(R.id.lv);
        ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,ar);
        lv.setAdapter(ad);
        lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}