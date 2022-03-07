package com.example.cinemo;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class OkhttpUtils {

    public Call get(String url) {
        /**
         * @Description: get();
         * @Author: 封装get请求
         */
        OkHttpClient okHttpClient = new OkHttpClient();
        Request.Builder builder = new Request.Builder();
        Request request = builder.get().url(url).build();
        return okHttpClient.newCall(request);
    }

    public static void post(String url, String json, Callback callback) {

        /**
         * @Description: post();
         * @Author: 封装post请求
         */
        OkHttpClient okHttpClient = new OkHttpClient();
        MediaType mediaType = MediaType.parse("application/json;charset=utf-8");
        RequestBody requestBody = RequestBody.create(mediaType, String.valueOf(json));
        Request request = new Request.Builder().url(url).post(requestBody).build();
        okHttpClient.newCall(request).enqueue(callback);
    }

}
