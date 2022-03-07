package com.example.cinemo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.cinemo.databases.MyLoveBeans;

import java.util.List;

public class recAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<MyLoveBeans> list;

    public recAdapter(List<MyLoveBeans> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ListItem(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        ((ListItem)holder).name.setText(list.get(position).getName());
        ((ListItem)holder).years.setText(list.get(position).getTimes());
        ((ListItem)holder).content.setText(list.get(position).getTime());
        Glide.with(holder.itemView.getContext()).load(list.get(position).getUrl()).into(((ListItem)holder).image);
        ((ListItem)holder).more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(),MoreActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("url",list.get(position).getUrl());
                bundle.putString("name",list.get(position).getName());
                bundle.putString("time",list.get(position).getTimes());
                bundle.putString("content",list.get(position).getContent());
                intent.putExtras(bundle);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    private class ListItem extends RecyclerView.ViewHolder {

        private ImageView image;
        private TextView name;
        private TextView years;
        private TextView content;
        private TextView more;

        public ListItem(@NonNull View inflater) {
            super(inflater);
            image = inflater.findViewById(R.id.image);
            name = inflater.findViewById(R.id.name);
            years = inflater.findViewById(R.id.years);
            content = inflater.findViewById(R.id.content);
            more = inflater.findViewById(R.id.more);
        }
    }
}
