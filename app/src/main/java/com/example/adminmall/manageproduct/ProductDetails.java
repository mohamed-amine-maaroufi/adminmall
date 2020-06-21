package com.example.adminmall.manageproduct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.example.adminmall.R;
import com.example.adminmall.beans.Product;
import com.google.android.material.textfield.TextInputEditText;

public class ProductDetails extends AppCompatActivity {

    EditText product_title, product_price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        product_title = findViewById(R.id.product_title);
        product_price = findViewById(R.id.product_price);

        Intent i = getIntent();
        Product product = (Product)i.getSerializableExtra("product");
        product_title.setText(product.getProduct_title());
        product_price.setText(product.getProduct_price());
    }
}