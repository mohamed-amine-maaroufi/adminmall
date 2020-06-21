package com.example.adminmall;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.adminmall.manageproduct.ProductsListActivity;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_clients = findViewById(R.id.btn_clients);
        Button btn_products = findViewById(R.id.btn_products);

        btn_products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ProductsListActivity.class);
                startActivity(i);
            }
        });

        btn_clients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, clientsList.class);
                startActivity(i);
            }
        });
    }
}
