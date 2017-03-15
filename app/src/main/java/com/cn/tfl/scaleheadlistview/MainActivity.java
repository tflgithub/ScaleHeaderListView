package com.cn.tfl.scaleheadlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view= LayoutInflater.from(this).inflate(R.layout.header_view,null);
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        ScaleHeadListView listView = (ScaleHeadListView) findViewById(R.id.listView);
        listView.addHeaderView(view);
        listView.setImageView(imageView);
        List<String> list = new ArrayList<>();
        for (int i = 0; i <5; i++) {
            list.add(i + " item");
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);
    }

}
