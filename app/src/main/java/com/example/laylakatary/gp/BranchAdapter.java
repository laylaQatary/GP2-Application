package com.example.laylakatary.gp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import java.util.ArrayList;

/**
 * Created by Layla Katary on 13/03/2017.
 */
public class BranchAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<Branch> list;

    public BranchAdapter(Context context,ArrayList<Branch> list){
        this.mContext = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    class ItemViewHolder {

        private Button branchButton;
        ItemViewHolder(View view){
            branchButton = (Button) view.findViewById(R.id.branch_btn);
        }
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ItemViewHolder holder;
        if (view == null){
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.branch_item,parent,false);
            holder = new ItemViewHolder(view);
            view.setTag(holder);
        }
        else {
            holder = (ItemViewHolder) view.getTag();
        }

        holder.branchButton.setText(list.get(position).getName());
        holder.branchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext,ListItemsActivity.class));
            }
        });

        return view;
    }
}
