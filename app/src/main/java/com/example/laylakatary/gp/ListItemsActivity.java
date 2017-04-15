package com.example.laylakatary.gp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


//Firebase
// twitter Fabric Digits

public class ListItemsActivity extends Activity implements View.OnClickListener {



    private ListView listView;
    Button order=(Button)findViewById(R.id.imageButton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_iteams);

        listView = (ListView) findViewById(R.id.items_list_view);

        listView.setAdapter(new ItemsAdapter(this, getItemList(), 5));

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListItemsActivity.this , Order.class));
            }
        });
        //order.setOnClickListener();

//        // order.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            Intent intent=new Intent(v.getContext(), ListItemsActivity.class);
//            startActivity(intent);
//
//
//        }
//      });


    }



    private List<ItemMetaInfo> getItemList() {
        List<ItemMetaInfo> list = new ArrayList<>();
        ItemMetaInfo info = new ItemMetaInfo("","Apple","50");;
        list.add(info);
        list.add(info);
        list.add(info);
        list.add(info);
        list.add(info);
        list.add(info);
        list.add(info);

        return list;
    }

    @Override
    public void onClick(View v) {

    }


//   // private Button move=(Button) findViewById(R.id.imageButton);
//    private static final int ITEM_ID=4500;
//    private ArrayList<DataModel> dataModels;
//    private LinearLayout rootlayout;
//    //zprivate LinearLayout rootlayout11;
//    //private LinearLayout rootlayout12;
//
//    private static final int ITEM_ID2=4500;
//    private ArrayList<DataModel> dataModels2;
//    private LinearLayout rootlayout2;
//
//    private ArrayList<DataModel> dataModels3;
//    private LinearLayout rootlayout3;
//
//   /* public void movefun(View v){
//        Intent intent = new Intent(this, Order.class);
//        startActivity(intent);
//
//    }*/
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_list_iteams);
//        setUIRef();
//        Alayout();
//        setUIRef2();
//        Blayout();
//        setUIRef3();
//        Clayout();
//       /* move.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(v.getContext(), Order.class);
//                startActivity(intent);
//
//
//            }
//        });*/
//    }
//
//    private void setUIRef() {
//
//        rootlayout= (LinearLayout) findViewById(R.id.Rootlayout);
//
//    }
//    private void setUIRef2() {
//
//        rootlayout2= (LinearLayout) findViewById(R.id.Rootlayout2);
//    }
//
//    private void setUIRef3() {
//
//        rootlayout3= (LinearLayout) findViewById(R.id.Rootlayout3);
//    }
//
//    private void Alayout(){
//        dataModels= new ArrayList<>();
//        dataModels.add(new DataModel("Apple", R.drawable.apple,"500","+","11","-"));
//        dataModels.add(new DataModel("Banana",R.drawable.bnana,"300","+","11","-"));
//        dataModels.add(new DataModel("AA",R.drawable.apple,"200","+","11","-"));
//        dataModels.add(new DataModel("BBB", R.drawable.bnana,"500","+","11","-"));
//        dataModels.add(new DataModel("ccc", R.drawable.bnana,"600","+","11","-"));
//        dataModels.add(new DataModel("banana", R.drawable.bnana,"0","+","11","-"));
//        dataModels.add(new DataModel("banana", R.drawable.bnana,"100","+","11","-"));
//
//        for(int i=0; i<dataModels.size(); i++){
//            LinearLayout itemLayout= new LinearLayout(ListItemsActivity.this);
//
//            itemLayout.setId(ITEM_ID + i);
//
//            itemLayout.setOrientation(LinearLayout.VERTICAL);
//
//            LinearLayout.LayoutParams params =new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
//            params.gravity= Gravity.CENTER;
//            params.setMargins(10, 10, 10, 10);
//
//            itemLayout.setLayoutParams(params);
//
//
//            ImageView imageview=new ImageView(ListItemsActivity.this);
//            imageview.setLayoutParams(params);
//            imageview.setImageResource(dataModels.get(i).getResId());
//
//
//            TextView textview=new TextView(ListItemsActivity.this);
//            textview.setLayoutParams(params);
//            textview.setText(dataModels.get(i).getName());
//            textview.setWidth(200);
//
//            TextView textview2=new TextView(ListItemsActivity.this);
//            textview2.setLayoutParams(params);
//            textview2.setText(dataModels.get(i).getPrice());
//            textview2.setWidth(200);
//
//            Button B1=new Button(ListItemsActivity.this);
//            int x=0;
//            B1.setLayoutParams(params);
//            B1.setText(dataModels.get(i).getBu());
//
//            TextView editText= new TextView(ListItemsActivity.this);
//            editText.setLayoutParams(params);
//            editText.setText(dataModels.get(i).getEdit());
//            dataModels.get(i).setEdit(String.valueOf(x));
//            editText.setText(dataModels.get(i).getEdit());
//
//            if(B1.callOnClick()){
//
//                x++;
//                dataModels.get(i).setEdit(String.valueOf(x));
//                editText.setText(dataModels.get(i).getEdit());
//                itemLayout.addView(editText);
//            }
//
//            //dataModels.get(i).setEdit(String.valueOf(x));
//
//
//
//
//            Button B2=new Button(ListItemsActivity.this);
//            B2.setLayoutParams(params);
//            B2.setText(dataModels.get(i).getBu2());
//            if(B2.callOnClick()){
//
//                x--;
//                dataModels.get(i).setEdit(String.valueOf(x));
//                editText.setText(dataModels.get(i).getEdit());
//                itemLayout.addView(editText);
//            }
//
//
//
//
//
//
//
//            itemLayout.addView(imageview);
//            itemLayout.addView(textview);
//            itemLayout.addView(textview2);
//            itemLayout.addView(B1);
//            itemLayout.addView(editText);
//            itemLayout.addView(B2);
//
//
//
//
//            itemLayout.setOnClickListener(this);
//            //itemLayout1.setOnClickListener(this);
//            rootlayout.addView(itemLayout);
//            //rootlayout11.addView(itemLayout1);
//
//
//        }
//
//
//    }
//
//
//
//    private void Blayout(){
//        dataModels2= new ArrayList<>();
//
//        dataModels2.add(new DataModel("Apple", R.drawable.apple,"500","+","11","-"));
//        dataModels2.add(new DataModel("Banana",R.drawable.bnana,"300","+","11","-"));
//        dataModels2.add(new DataModel("AA",R.drawable.apple,"200","+","11","-"));
//        dataModels2.add(new DataModel("BBB", R.drawable.bnana,"500","+","11","-"));
//        dataModels2.add(new DataModel("ccc", R.drawable.bnana,"600","+","11","-"));
//        dataModels2.add(new DataModel("banana", R.drawable.bnana,"0","+","11","-"));
//        dataModels2.add(new DataModel("banana", R.drawable.bnana,"100","+","11","-"));
//
//        for(int i=0; i<dataModels2.size(); i++){
//            LinearLayout itemLayout= new LinearLayout(ListItemsActivity.this);
//            itemLayout.setId(ITEM_ID2 + i);
//            itemLayout.setOrientation(LinearLayout.VERTICAL);
//            LinearLayout.LayoutParams params =new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
//            params.gravity= Gravity.CENTER;
//            params.setMargins(10, 10, 10, 10);
//
//            itemLayout.setLayoutParams(params);
//
//            ImageView imageview=new ImageView(ListItemsActivity.this);
//            imageview.setLayoutParams(params);
//            imageview.setImageResource(dataModels2.get(i).getResId());
//
//
//            TextView textview=new TextView(ListItemsActivity.this);
//            textview.setLayoutParams(params);
//            textview.setText(dataModels2.get(i).getName());
//            textview.setWidth(200);
//
//            TextView textview2=new TextView(ListItemsActivity.this);
//            textview2.setLayoutParams(params);
//            textview2.setText(dataModels.get(i).getPrice());
//            textview2.setWidth(200);
//
//
//
//            itemLayout.addView(imageview);
//            itemLayout.addView(textview);
//            itemLayout.addView(textview2);
//
//            itemLayout.setOnClickListener( this);
//            rootlayout2.addView(itemLayout);
//
//        }
//
//
//    }
//
//    private void Clayout(){
//        dataModels3= new ArrayList<>();
//        dataModels3.add(new DataModel("Apple", R.drawable.apple,"500","+","11","-"));
//        dataModels3.add(new DataModel("Banana",R.drawable.bnana,"300","+","11","-"));
//        dataModels3.add(new DataModel("AA",R.drawable.apple,"200","+","11","-"));
//        dataModels3.add(new DataModel("BBB", R.drawable.bnana,"500","+","11","-"));
//        dataModels3.add(new DataModel("ccc", R.drawable.bnana,"600","+","11","-"));
//        dataModels3.add(new DataModel("banana", R.drawable.bnana,"0","+","11","-"));
//        dataModels3.add(new DataModel("banana", R.drawable.bnana,"100","+","11","-"));
//
//        for(int i=0; i<dataModels3.size(); i++){
//            LinearLayout itemLayout= new LinearLayout(ListItemsActivity.this);
//            itemLayout.setId(ITEM_ID2 + i);
//            itemLayout.setOrientation(LinearLayout.VERTICAL);
//            LinearLayout.LayoutParams params =new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
//            params.gravity= Gravity.CENTER;
//            params.setMargins(10, 10, 10, 10);
//
//            itemLayout.setLayoutParams(params);
//
//            ImageView imageview=new ImageView(ListItemsActivity.this);
//            imageview.setLayoutParams(params);
//            imageview.setImageResource(dataModels3.get(i).getResId());
//
//
//            TextView textview=new TextView(ListItemsActivity.this);
//            textview.setLayoutParams(params);
//            textview.setText(dataModels3.get(i).getName());
//            textview.setWidth(200);
//
//            TextView textview2=new TextView(ListItemsActivity.this);
//            textview2.setLayoutParams(params);
//            textview2.setText(dataModels.get(i).getPrice());
//            textview2.setWidth(200);
//
//            itemLayout.addView(imageview);
//            itemLayout.addView(textview);
//            itemLayout.addView(textview2);
//
//            itemLayout.setOnClickListener( this);
//            rootlayout3.addView(itemLayout);
//
//        }
//
//
//    }
//
//
//
//    @Override
//    public void onClick(View v) {
//        if( !checkRootLayoutItemClick(v)){
//
//
//        }
//        if( !checkRootLayoutItemClick2(v)){
//
//
//        }
//        if( !checkRootLayoutItemClick3(v)){
//
//
//        }
//
//    }
//    private boolean checkRootLayoutItemClick(View view){
//
//        boolean flag=false;
//        for(int i=0; i<rootlayout.getChildCount(); i++){
//
//            View viewChild= rootlayout.getChildAt(i);
//            if(viewChild instanceof LinearLayout){
//
//                if(viewChild==view){
//                    flag=true;
//                    Toast.makeText(this,"item"+i+"clicked",Toast.LENGTH_LONG).show();
//                }
//            }
//
//        }
//        return flag;
//    }
//
//    private boolean checkRootLayoutItemClick2(View view){
//
//        boolean flag=false;
//        for(int i=0; i<rootlayout2.getChildCount(); i++){
//
//            View viewChild= rootlayout2.getChildAt(i);
//            if(viewChild instanceof LinearLayout){
//
//                if(viewChild==view){
//                    flag=true;
//                    Toast.makeText(this,"item"+i+"clicked",Toast.LENGTH_LONG).show();
//                }
//            }
//
//        }
//        return flag;
//    }
//
//
//    private boolean checkRootLayoutItemClick3(View view){
//
//        boolean flag=false;
//        for(int i=0; i<rootlayout3.getChildCount(); i++){
//
//            View viewChild= rootlayout3.getChildAt(i);
//            if(viewChild instanceof LinearLayout){
//
//                if(viewChild==view){
//                    flag=true;
//                    Toast.makeText(this,"item"+i+"clicked",Toast.LENGTH_LONG).show();
//                }
//            }
//
//        }
//        return flag;
//    }
}
