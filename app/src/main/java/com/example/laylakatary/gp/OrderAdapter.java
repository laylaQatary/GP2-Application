package com.example.laylakatary.gp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Layla Katary on 13/03/2017.
 */
public class OrderAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<Branch> list;

    public OrderAdapter(Context context,ArrayList<Branch> list){
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

        private ImageView img;
        private TextView TotalString;
        private TextView Price;
        private TextView Qountity  ;
        private TextView count;
        ItemViewHolder(View view){
            img = (ImageView) view.findViewById(R.id.list_image);
         //   TotalString = (TextView) view.findViewById(R.id.thumbnail);
            Price = (TextView) view.findViewById(R.id.price);
            TotalString = (TextView) view.findViewById(R.id.from_name);
            Qountity = (TextView) view.findViewById(R.id.weight);
            count = (TextView) view.findViewById(R.id.cart_product_quantity_tv);
        }
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ItemViewHolder holder;
        if (view == null){
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.relativeorder,parent,false);
            holder = new ItemViewHolder(view);
            view.setTag(holder);
        }
        else {
            holder = (ItemViewHolder) view.getTag();
        }

        holder.count.setText(list.get(position).getName());
        holder.Qountity.setText(list.get(position).getName());
        holder.Price.setText(list.get(position).getName());
        holder.TotalString.setText(list.get(position).getName());
        holder.img.setImageResource(R.drawable.bnana);
        return view;
    }
}
