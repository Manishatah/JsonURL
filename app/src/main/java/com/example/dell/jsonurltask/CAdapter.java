package com.example.dell.jsonurltask;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sony on 08-02-2017.
 */

public class CAdapter extends BaseAdapter {

    private Activity activity;
    private LayoutInflater inflater;
    private List<Model>model;


    public CAdapter(Activity activity, List<Model> model){
        this.activity = activity;
        this.model =model ;

    }
    @Override
    public int getCount() {
        return model.size();
    }

    @Override
    public Object getItem(int position) {
        return model.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(inflater == null)
            inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView == null)
            convertView =inflater.inflate(R.layout.list_row,null);

        TextView t1 = (TextView)convertView.findViewById(R.id.txtuserid);
        TextView t2 = (TextView)convertView.findViewById(R.id.txtid);
        TextView t3 = (TextView)convertView.findViewById(R.id.txttitle);
        TextView t4 = (TextView)convertView.findViewById(R.id.txtbody);


        Model md = model.get(position);
        t1.setText(String.valueOf(md.getUseri()));
        t2.setText(String.valueOf(md.getId()));
        t3.setText(md.getTitle());
        t4.setText(md.getBody());




        return convertView;
    }
}
