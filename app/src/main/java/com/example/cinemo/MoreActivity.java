package com.example.cinemo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.example.cinemo.databases.MyLoveBeans;
import com.example.cinemo.databases.MyLoveDao;

public class MoreActivity extends AppCompatActivity {

    private ImageView image;
    private TextView name;
    private TextView years;
    private TextView content;
    private TextView more;
    String url;
    String content1;
    String name1;
    String time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        Intent intent = getIntent();
        Bundle bu = intent.getExtras();

        url = bu.getString("url");
        name1 = bu.getString("name");
        time = bu.getString("time");
        content1 = bu.getString("content");

        Log.i("TAG", "onCreate: "+url);
        initView();
        Glide.with(this).load(url).into(image);
        name.setText(name1);
        years.setText(time);
        content.setText(content1);
    }


    private void initView() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        image = findViewById(R.id.image);
        name = findViewById(R.id.name);
        years = findViewById(R.id.years);
        content = findViewById(R.id.content);
        more = findViewById(R.id.more);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        MyLoveDao myLoveDao = new MyLoveDao(MoreActivity.this);
                        MyLoveBeans myLoveBeans = new MyLoveBeans();
                        myLoveBeans.setName(name1);
                        myLoveBeans.setContent(content1);
                        myLoveBeans.setTime(time);
                        myLoveBeans.setUrl(url);
                        int add = myLoveDao.add(myLoveBeans);
                    }
                });
                thread.start();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return true;
    }
}