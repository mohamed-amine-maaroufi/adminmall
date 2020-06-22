package com.example.adminmall.manageproduct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.example.adminmall.R;
import com.example.adminmall.beans.Product;
import com.google.android.material.textfield.TextInputEditText;

public class ProductDetails extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        EditText product_title = findViewById(R.id.product_title);
        EditText product_price = findViewById(R.id.product_price);
        EditText star_1 = findViewById(R.id.star_1);
        EditText star_2 = findViewById(R.id.star_2);
        EditText star_3 = findViewById(R.id.star_3);
        EditText star_4 = findViewById(R.id.star_4);
        EditText star_5 = findViewById(R.id.star_5);
        EditText cod = findViewById(R.id.cod);
        EditText average_rating = findViewById(R.id.average_rating);
        EditText cutted_price = findViewById(R.id.cutted_price);
        EditText free_coupen_body = findViewById(R.id.free_coupen_body);
        EditText free_coupen_title = findViewById(R.id.free_coupen_title);
        EditText free_coupens = findViewById(R.id.free_coupens);
        EditText product_description = findViewById(R.id.product_description);
        EditText product_image_1 = findViewById(R.id.product_image_1);
        EditText product_image_2 = findViewById(R.id.product_image_2);
        EditText product_image_3 = findViewById(R.id.product_image_3);
        EditText product_other_details = findViewById(R.id.product_other_details);
        EditText spec_title_1 = findViewById(R.id.spec_title_1);
        EditText spec_title_1_field_1_name = findViewById(R.id.spec_title_1_field_1_name);
        EditText spec_title_1_field_1_value = findViewById(R.id.spec_title_1_field_1_value);
        EditText spec_title_1_field_2_name = findViewById(R.id.spec_title_1_field_2_name);
        EditText spec_title_1_field_2_value = findViewById(R.id.spec_title_1_field_2_value);
        EditText spec_title_1_totals_fields = findViewById(R.id.spec_title_1_totals_fields);
        EditText spec_title_2 = findViewById(R.id.spec_title_2);
        EditText spec_title_2_field_1_name = findViewById(R.id.spec_title_2_field_1_name);
        EditText spec_title_2_field_1_value = findViewById(R.id.spec_title_2_field_1_value);
        EditText spec_title_2_field_2_name = findViewById(R.id.spec_title_2_field_2_name);
        EditText spec_title_2_field_2_value = findViewById(R.id.spec_title_2_field_2_value);
        EditText spec_title_2_totals_fields = findViewById(R.id.spec_title_2_totals_fields);
        EditText spec_title_3 = findViewById(R.id.spec_title_3);
        EditText spec_title_3_field_1_name = findViewById(R.id.spec_title_3_field_1_name);
        EditText spec_title_3_field_1_value = findViewById(R.id.spec_title_3_field_1_value);
        EditText spec_title_3_field_2_name = findViewById(R.id.spec_title_3_field_2_name);
        EditText spec_title_3_field_2_value = findViewById(R.id.spec_title_3_field_2_value);
        EditText spec_title_3_totals_fields = findViewById(R.id.spec_title_3_totals_fields);
        EditText spec_title_4 = findViewById(R.id.spec_title_4);
        EditText spec_title_4_field_1_name = findViewById(R.id.spec_title_4_field_1_name);
        EditText spec_title_4_field_1_value = findViewById(R.id.spec_title_4_field_1_value);
        EditText spec_title_4_field_2_name = findViewById(R.id.spec_title_4_field_2_name);
        EditText spec_title_4_field_2_value = findViewById(R.id.spec_title_4_field_2_value);
        EditText spec_title_4_field_3_name = findViewById(R.id.spec_title_4_field_3_name);
        EditText spec_title_4_field_3_value = findViewById(R.id.spec_title_4_field_3_value);
        EditText spec_title_4_totals_fields = findViewById(R.id.spec_title_4_totals_fields);
        EditText total_rating = findViewById(R.id.total_rating);
        EditText total_spec_titles = findViewById(R.id.total_spec_titles);

        Intent i = getIntent();
        Product product = (Product)i.getSerializableExtra("product");
        product_title.setText(product.getProduct_title());
        product_price.setText(product.getProduct_price());

        /*star_1.setText(product.get);
        star_2.setText(product.get);
        star_4.setText(product.get);
        star_5.setText(product.get);
        cod.setText(product.get);
        average_rating.setText(product.get);
        cutted_price.setText(product.get);
        free_coupen_body.setText(product.get);
        free_coupen_title.setText(product.get);
        free_coupens.setText(product.get);
        product_description.setText(product.get);
        product_image_1.setText(product.get);
        product_image_2.setText(product.get);
        product_image_3.setText(product.get);
        product_other_details.setText(product.get);
        spec_title_1.setText(product.get);
        spec_title_1_field_1_name.setText(product.get);
        spec_title_1_field_1_value.setText(product.get);
        spec_title_1_field_2_name.setText(product.get);
        spec_title_1_field_2_value.setText(product.get);
        spec_title_1_totals_fields.setText(product.get);
        spec_title_2.setText(product.get);
        spec_title_2_field_1_name.setText(product.get);
        spec_title_2_field_1_value.setText(product.get);
        spec_title_2_field_2_name.setText(product.get);
        spec_title_2_field_2_value.setText(product.get);
        spec_title_2_totals_fields.setText(product.get);
        spec_title_3.setText(product.get);
        spec_title_3_field_1_name.setText(product.get);
        spec_title_3_field_1_value.setText(product.get);
        spec_title_3_field_2_name.setText(product.get);
        spec_title_3_field_2_value.setText(product.get);
        spec_title_3_totals_fields.setText(product.get);
        spec_title_4.setText(product.get);
        spec_title_4_field_1_name.setText(product.get);
        spec_title_4_field_1_value.setText(product.get);
        spec_title_4_field_2_name.setText(product.get);
        spec_title_4_field_2_value.setText(product.get);
        spec_title_4_field_3_name.setText(product.get);
        spec_title_4_field_3_value.setText(product.get);
        spec_title_4_totals_fields.setText(product.get);
        total_rating.setText(product.get);
        total_spec_titles.setText(product.get);*/
    }
}