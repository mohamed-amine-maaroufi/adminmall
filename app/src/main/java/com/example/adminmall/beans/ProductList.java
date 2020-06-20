package com.example.adminmall.beans;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.adminmall.R;
import java.util.List;



public class ProductList extends ArrayAdapter<Product> {
    private Activity context;
    List<Product> products;

    public ProductList(Activity context, List<Product> products) {
        super(context, R.layout.layout_custom_list, products);
        this.context = context;
        this.products = products;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.layout_custom_list, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textView1);
        TextView textViewGenre = (TextView) listViewItem.findViewById(R.id.textView2);

        Product product = products.get(position);
        textViewName.setText(product.getProduct_title());
        textViewGenre.setText(product.getProduct_price());

        return listViewItem;
    }


}