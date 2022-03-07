package com.example.cinemo;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cinemo.databases.MyLoveBeans;
import com.example.cinemo.databases.MyLoveDao;

import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView text;
    private RecyclerView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        toolbar = findViewById(R.id.toolbar);
        text = findViewById(R.id.text);
        listview = findViewById(R.id.listview);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        text.setText("my Love");

        MyLoveDao myLoveDao = new MyLoveDao(MainActivity2.this);
        List<MyLoveBeans> quer = myLoveDao.quer();
        setAdapter(quer);
    }

    private void setAdapter(List<MyLoveBeans> quer) {
        listview.setAdapter(new recAdapter(quer));
        listview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return true;
    }
}