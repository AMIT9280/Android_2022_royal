package com.hw_login_page.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hw_login_page.R;
import com.hw_login_page.model.RecModel;

import java.util.ArrayList;

public class MyBaseAdapter2 extends BaseAdapter {
    Context context;
    ArrayList<RecModel> RecModelArrayList;
    public MyBaseAdapter2(Context context, ArrayList<RecModel> recModelArrayList) {

       this.context = context;
       this.RecModelArrayList = recModelArrayList;
    }
    @Override
    public int getCount() {
        return RecModelArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return RecModelArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater)  context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.raw_rec,null);
        ImageView imgData = view.findViewById(R.id.img_data);
        TextView tvData = view.findViewById(R.id.tv_data);
        TextView tv_index = view.findViewById(R.id.index);
        TextView tv_Des = view.findViewById(R.id.des);

        RecModel RecModel = RecModelArrayList.get(i);

        imgData.setImageResource(RecModelArrayList.get(i).getImgData());
        tvData.setText(RecModel.getRecData());
        tv_index.setText(String.valueOf(i+1));
        tv_Des.setText(RecModel.getDes());

        return view;

    }
}
