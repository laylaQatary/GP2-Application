package com.example.laylakatary.gp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Layla Katary on 05/03/2017.
 */
public class ItemsAdapter extends BaseAdapter {

    private Context mContext;
    private List<ItemMetaInfo> list;
    private int numberOfRows;
    private boolean flag = true;

    public ItemsAdapter(Context context,List<ItemMetaInfo> list,int numberOfRows){
        this.mContext = context;
        this.list = list;
        this.numberOfRows = numberOfRows;
    }

    @Override
    public int getCount() {
        return numberOfRows;
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

        private HorizontalScrollView scrollView;
        private LinearLayout linearLayout;
        private Button Buttonpositive;
        private Button Buttonnegative;

        ItemViewHolder(View view){
            scrollView = (HorizontalScrollView) view.findViewById(R.id.horizontalScrollView);
            linearLayout = (LinearLayout) view.findViewById(R.id.linear_scroll_view);
            Buttonpositive = (Button) view.findViewById(R.id.plusButton);
            Buttonnegative =(Button) view.findViewById(R.id.negativeButton);
        }


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        ItemViewHolder holder;
        if (view == null){
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_item_row,parent,false);
            holder = new ItemViewHolder(view);
            view.setTag(holder);
        }

        else {
            holder = (ItemViewHolder) view.getTag();
        }

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View tempView = inflater.inflate(R.layout.horizontal_scroll_item,null,false);
        TextView itemName = (TextView) tempView.findViewById(R.id.item_name);
        TextView itemPrice = (TextView) tempView.findViewById(R.id.item_price);

        ImageView itemImg = (ImageView) tempView.findViewById(R.id.item_img);
        EditText count= (EditText) tempView.findViewById(R.id.textcounter);
        final String[] counterstring = {count.getText().toString()};
       final int[] counterint = {Integer.parseInt(counterstring[0])};

        holder.Buttonpositive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterint[0]++;
               // counterstring[0] = counterint.toString();

            }
        });
        count.setText(counterint[0]);

//        holder.branchButton.setText(list.get(position).getName());
//        holder.branchButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mContext.startActivity(new Intent(mContext,ListItemsActivity.class));
//            }
//        });


//        Button plusButton=(Button)tempView.findViewById(R.id.plusButton);
//        Button negativeButton=(Button)tempView.findViewById(R.id.negativeButton);
//
//        plusButton.setOnClickListener(new View.OnClickListener() {
//            String count="";
//            int cou=0;
//            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            View tempView = inflater.inflate(R.layout.horizontal_scroll_item,null,false);
//            TextView text=(TextView)tempView.findViewById(R.id.textcounter);
//            @Override
//            public void onClick(View v) {
//
//                count = text.getText().toString();
//                cou = Integer.parseInt(count);
//                cou++;
//                count = Integer.toString(cou);
//                text.setText(count);
//
//            }
//        });
//
//        negativeButton.setOnClickListener(new View.OnClickListener() {
//            String count = "";
//            int cou = 0;
//            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            View tempView = inflater.inflate(R.layout.horizontal_scroll_item, null, false);
//            TextView text = (TextView) tempView.findViewById(R.id.textcounter);
//
//            @Override
//            public void onClick(View v) {
//                count = text.getText().toString();
//            cou=Integer.parseInt(count);
//            if(cou==0){
//
//                //massege
//                cou=0;
//            }
//                else
//                    cou--;
//            count=Integer.toString(cou);
//            text.setText(count);
//
//            }
//        });




        if (flag) {

            for (int i = 0; i < list.size(); i++) {
                itemName.setText(list.get(i).getName());
                itemPrice.setText(list.get(i).getPrice());
                itemImg.setImageResource(R.drawable.bnana);
                if (i == list.size()-1){
                    flag = false;
                }
            }
        }

        holder.linearLayout.addView(tempView);

        return view;
    }
}
