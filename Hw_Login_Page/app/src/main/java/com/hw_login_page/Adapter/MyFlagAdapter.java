package com.hw_login_page.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hw_login_page.R;
import com.hw_login_page.model.conModel;

import java.util.ArrayList;

public class MyFlagAdapter extends BaseAdapter {
    Context context;
    ArrayList<conModel> conModelArrayList;
    public MyFlagAdapter(Context context, ArrayList<conModel> conModelArrayList) {

            this.context =context;
            this.conModelArrayList = conModelArrayList;
    }

    @Override
    public int getCount() {
        return conModelArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return conModelArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.raw_cutm_list,null);
        ImageView imgData = view.findViewById(R.id.img_data);

        TextView tvData = view.findViewById(R.id.tv_data);

        conModel conModel = conModelArrayList.get(i);

        imgData.setImageResource(conModelArrayList.get(i).getImgCon());
        tvData.setText(conModel.getConName());
        return view;
    }
}
