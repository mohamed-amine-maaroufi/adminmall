package com.example.adminmall.manageproduct;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adminmall.R;
import com.example.adminmall.beans.Product;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.List;

import androidx.annotation.NonNull;


public class ProductList extends ArrayAdapter<Product> {
    private Activity context;
    List<Product> products;

    public ProductList(Activity context, List<Product> products) {
        super(context, R.layout.layout_custom_list, products);
        this.context = context;
        this.products = products;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.layout_custom_list, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textView1);
        Button btndelete = (Button) listViewItem.findViewById(R.id.btndelete);

        final Product product = products.get(position);
        textViewName.setText(product.getProduct_title());

        final FirebaseFirestore databaseproducts = FirebaseFirestore.getInstance();

        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                databaseproducts.collection("PRODUCTS").document(product.getId())
                        .delete()
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {

                                ProductsListActivity.cleanListProduct(position);
                                Toast.makeText(context, "Product successfully deleted! " , Toast.LENGTH_SHORT).show();


                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(context, "Error deleting product  " , Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });

        return listViewItem;
    }


}