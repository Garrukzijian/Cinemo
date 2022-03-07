package com.example.cinemo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cinemo.databases.MyLoveBeans;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private TextView toolbar;
    private RecyclerView listview;
    public MyHander myHander = new MyHander();
    public static final int error = 0;
    public static final int okkk = 1;
    private List<MyLoveBeans> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        toolbar = findViewById(R.id.toolbar);
        listview = findViewById(R.id.listview);

        new Thread(new Runnable() {
            @Override
            public void run() {
                getVdioData();
            }
        }).start();
        setAdapter();


        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    private void setAdapter() {
        listview.setAdapter(new recAdapter(list));
        listview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }

    private void getVdioData() {
        new OkhttpUtils().get(URL.VDIO_URL).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Message message = new Message();
                message.obj = e.toString();
                message.what = error;
                myHander.sendMessage(message);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Message message = new Message();
                message.obj = response.body().string().toString();
                message.what = okkk;
                myHander.sendMessage(message);
            }
        });
    }

    public class MyHander extends Handler {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 0:
                    break;
                case 1:
                    Gson gson = new Gson();
                    vdioBeans vdioBeans = gson.fromJson(msg.obj.toString(), vdioBeans.class);
                    List<com.example.cinemo.vdioBeans.MoviesBean> movies = vdioBeans.getMovies();
                    for (int i = 0; i < movies.size(); i++) {
                        MyLoveBeans itemBeans = new MyLoveBeans();
                        String poster_url = movies.get(i).getPoster_url();
                        String actor = movies.get(i).getActor();
                        String director = movies.get(i).getDirector();
                        String release_date = movies.get(i).getRelease_date();
                        String synopsis_th = movies.get(i).getSynopsis_en();
                        itemBeans.setName(director);
                        itemBeans.setTime(actor);
                        itemBeans.setTimes(release_date);
                        itemBeans.setContent(synopsis_th);
                        itemBeans.setUrl(poster_url);
                        list.add(itemBeans);
                    }
                    setAdapter();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + msg.what);
            }
        }
    }
}