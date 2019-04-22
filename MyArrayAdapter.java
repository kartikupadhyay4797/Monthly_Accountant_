package com.example.tinpattiofflineaccountant;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class MyArrayAdapter extends ArrayAdapter<MyObj> {
    public MyArrayAdapter(Context context, ArrayList<MyObj> list){
        super(context,0,list);
    }
    public View getView(int position, View convertview, ViewGroup parent){
        View listItem=convertview;
        if(listItem==null){
            listItem= LayoutInflater.from(getContext()).inflate(R.layout.mylist,parent,false);
        }
        MyObj Obj=getItem(position);
        TextView showExp=(TextView)listItem.findViewById(R.id.showExp);
        showExp.setText("Rs. "+Obj.getShowExp());
        TextView showDetails=(TextView)listItem.findViewById(R.id.ShowDetails);
        showDetails.setText(Obj.getShowDetail());
        TextView date=(TextView)listItem.findViewById(R.id.date);
        date.setText(Obj.getDate());
        return listItem;
    }
}
