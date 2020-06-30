package com.example.adminmall.manageproduct;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.adminmall.R;
import com.example.adminmall.beans.Product;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;


public class ProductAddDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_add_details);
        try {

            //initiliaze UI
            final EditText product_title = findViewById(R.id.product_title);
            final EditText product_price = findViewById(R.id.product_price);
            final EditText star_1 = findViewById(R.id.star_1);
            final EditText star_2 = findViewById(R.id.star_2);
            final EditText star_3 = findViewById(R.id.star_3);
            final EditText star_4 = findViewById(R.id.star_4);
            final EditText star_5 = findViewById(R.id.star_5);
            final RadioGroup RadioGroupCod = findViewById(R.id.radioGroupCod);
            final RadioButton codradioTrue = findViewById(R.id.codradioTrue);
            final RadioButton codradioFalse = findViewById(R.id.codradioFalse);
            final RadioGroup RadioGroupInstock = findViewById(R.id.radioGroupIn_stock);
            final RadioButton instockradioTrue = findViewById(R.id.in_stockradioTrue);
            final RadioButton instockradioFalse = findViewById(R.id.in_stockradioFalse);
            final EditText average_rating = findViewById(R.id.average_rating);
            final EditText cutted_price = findViewById(R.id.cutted_price);
            final EditText free_coupen_body = findViewById(R.id.free_coupen_body);
            final EditText free_coupen_title = findViewById(R.id.free_coupen_title);
            final EditText free_coupens = findViewById(R.id.free_coupens);
            final EditText product_description = findViewById(R.id.product_description);
            final EditText product_image_1 = findViewById(R.id.product_image_1);
            final EditText no_of_product_images = findViewById(R.id.no_of_product_images);
            final EditText product_image_2 = findViewById(R.id.product_image_2);
            final EditText product_image_3 = findViewById(R.id.product_image_3);
            final EditText product_other_details = findViewById(R.id.product_other_details);
            final EditText spec_title_1 = findViewById(R.id.spec_title_1);
            final EditText spec_title_1_field_1_name = findViewById(R.id.spec_title_1_field_1_name);
            final EditText spec_title_1_field_1_value = findViewById(R.id.spec_title_1_field_1_value);
            final EditText spec_title_1_field_2_name = findViewById(R.id.spec_title_1_field_2_name);
            final EditText spec_title_1_field_2_value = findViewById(R.id.spec_title_1_field_2_value);
            final EditText spec_title_1_totals_fields = findViewById(R.id.spec_title_1_totals_fields);
            final EditText spec_title_2 = findViewById(R.id.spec_title_2);
            final EditText spec_title_2_field_1_name = findViewById(R.id.spec_title_2_field_1_name);
            final EditText spec_title_2_field_1_value = findViewById(R.id.spec_title_2_field_1_value);
            final EditText spec_title_2_field_2_name = findViewById(R.id.spec_title_2_field_2_name);
            final EditText spec_title_2_field_2_value = findViewById(R.id.spec_title_2_field_2_value);
            final EditText spec_title_2_totals_fields = findViewById(R.id.spec_title_2_totals_fields);
            final EditText spec_title_3 = findViewById(R.id.spec_title_3);
            final EditText spec_title_3_field_1_name = findViewById(R.id.spec_title_3_field_1_name);
            final EditText spec_title_3_field_1_value = findViewById(R.id.spec_title_3_field_1_value);
            final EditText spec_title_3_field_2_name = findViewById(R.id.spec_title_3_field_2_name);
            final EditText spec_title_3_field_2_value = findViewById(R.id.spec_title_3_field_2_value);
            final EditText spec_title_3_totals_fields = findViewById(R.id.spec_title_3_totals_fields);
            final EditText spec_title_4 = findViewById(R.id.spec_title_4);
            final EditText spec_title_4_field_1_name = findViewById(R.id.spec_title_4_field_1_name);
            final EditText spec_title_4_field_1_value = findViewById(R.id.spec_title_4_field_1_value);
            final EditText spec_title_4_field_2_name = findViewById(R.id.spec_title_4_field_2_name);
            final EditText spec_title_4_field_2_value = findViewById(R.id.spec_title_4_field_2_value);
            final EditText spec_title_4_field_3_name = findViewById(R.id.spec_title_4_field_3_name);
            final EditText spec_title_4_field_3_value = findViewById(R.id.spec_title_4_field_3_value);
            final EditText spec_title_4_totals_fields = findViewById(R.id.spec_title_4_totals_fields);
            final EditText total_rating = findViewById(R.id.total_rating);
            final EditText total_spec_titles = findViewById(R.id.total_spec_titles);
            final ProgressBar progressBar = findViewById(R.id.progressBar);

            //initialize update button
            Button btnadd = findViewById(R.id.btnadd);

            //initialize database
            //our database reference object
            final FirebaseFirestore databaseproducts = FirebaseFirestore.getInstance();


            //action of update button: update the product
            btnadd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {


                        progressBar.setVisibility(View.VISIBLE);
                        Map<String, Object> data = new HashMap<>();
                        data.put("product_title", product_title.getText().toString());
                        data.put("product_description", product_description.getText().toString());

                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(star_1.getText().toString())) {
                            data.put("1_star", Integer.parseInt(star_1.getText().toString()));
                        }
                        else
                        {
                            data.put("1_star", 0);
                        }

                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(star_2.getText().toString())) {
                            data.put("2_star", Integer.parseInt(star_2.getText().toString()));
                        }
                        else
                        {
                            data.put("2_star", 0);
                        }


                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(star_3.getText().toString())) {
                            data.put("3_star", Integer.parseInt(star_3.getText().toString()));
                        }
                        else
                        {
                            data.put("3_star", 0);
                        }

                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(star_4.getText().toString())) {
                            data.put("4_star", Integer.parseInt(star_4.getText().toString()));
                        }
                        else
                        {
                            data.put("4_star", 0);
                        }

                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(star_5.getText().toString())) {
                            data.put("5_star", Integer.parseInt(star_5.getText().toString()));
                        }
                        else
                        {
                            data.put("5_star", 0);
                        }



                        // get selected radio button from radioGroup of COD
                        int selectedIdRadioCOD = RadioGroupCod.getCheckedRadioButtonId();
                        // find the radiobutton by returned id
                        RadioButton radioCod = (RadioButton) findViewById(selectedIdRadioCOD);
                        data.put("COD", Boolean.parseBoolean(radioCod.getText().toString()));
                        radioCod.setChecked(true);

                        // get selected radio button from radioGroup of in_stock
                        int selectedIdRadioInstock = RadioGroupInstock.getCheckedRadioButtonId();
                        // find the radiobutton by returned id
                        RadioButton radioinstock = (RadioButton) findViewById(selectedIdRadioInstock);
                        data.put("in_stock", Boolean.parseBoolean(radioinstock.getText().toString()));
                        radioinstock.setChecked(true);

                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(average_rating.getText().toString())) {
                            data.put("average_rating", Integer.parseInt(average_rating.getText().toString()));
                        }
                        else
                        {
                            data.put("average_rating", 0);
                        }

                        data.put("cutted_price", cutted_price.getText().toString());
                        data.put("free_coupen_body", free_coupen_body.getText().toString());
                        data.put("free_coupen_title", free_coupen_title.getText().toString());

                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(free_coupens.getText().toString())) {
                            data.put("free_coupens", Integer.parseInt(free_coupens.getText().toString()));
                        }
                        else
                        {
                            data.put("free_coupens", 0);
                        }


                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(no_of_product_images.getText().toString())) {
                            data.put("no_of_product_images", Integer.parseInt(no_of_product_images.getText().toString()));
                        }
                        else
                        {
                            data.put("no_of_product_images", 0);
                        }


                        data.put("product_image_1", product_image_1.getText().toString());
                        data.put("product_image_2", product_image_2.getText().toString());
                        data.put("product_image_3", product_image_3.getText().toString());
                        data.put("product_other_details", product_other_details.getText().toString());
                        data.put("product_price", product_price.getText().toString());

                        data.put("spec_title_1", spec_title_1.getText().toString());
                        data.put("spec_title_1_field_1_name", spec_title_1_field_1_name.getText().toString());
                        data.put("spec_title_1_field_1_value", spec_title_1_field_1_value.getText().toString());
                        data.put("spec_title_1_field_2_name", spec_title_1_field_2_name.getText().toString());
                        data.put("spec_title_1_field_2_value", spec_title_1_field_2_value.getText().toString());

                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(spec_title_1_totals_fields.getText().toString())) {
                            data.put("spec_title_1_total_fields", Integer.parseInt(spec_title_1_totals_fields.getText().toString()));
                        }
                        else
                        {
                            data.put("spec_title_1_total_fields", 0);
                        }

                        data.put("spec_title_2", spec_title_2.getText().toString());
                        data.put("spec_title_2_field_1_name", spec_title_2_field_1_name.getText().toString());
                        data.put("spec_title_2_field_1_value", spec_title_2_field_1_value.getText().toString());
                        data.put("spec_title_2_field_2_name", spec_title_2_field_2_name.getText().toString());
                        data.put("spec_title_2_field_2_value", spec_title_2_field_2_value.getText().toString());

                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(spec_title_2_totals_fields.getText().toString())) {
                            data.put("spec_title_2_total_fields", Integer.parseInt(spec_title_2_totals_fields.getText().toString()));
                        }
                        else
                        {
                            data.put("spec_title_2_total_fields", 0);
                        }

                        data.put("spec_title_3", spec_title_3.getText().toString());
                        data.put("spec_title_3_field_1_name", spec_title_3_field_1_name.getText().toString());
                        data.put("spec_title_3_field_1_value", spec_title_3_field_1_value.getText().toString());
                        data.put("spec_title_3_field_2_name", spec_title_3_field_2_name.getText().toString());
                        data.put("spec_title_3_field_2_value", spec_title_3_field_2_value.getText().toString());

                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(spec_title_3_totals_fields.getText().toString())) {
                            data.put("spec_title_3_total_fields", Integer.parseInt(spec_title_3_totals_fields.getText().toString()));
                        }
                        else
                        {
                            data.put("spec_title_3_total_fields", 0);
                        }

                        data.put("spec_title_4", spec_title_4.getText().toString());
                        data.put("spec_title_4_field_1_name", spec_title_4_field_1_name.getText().toString());
                        data.put("spec_title_4_field_1_value", spec_title_4_field_1_value.getText().toString());
                        data.put("spec_title_4_field_2_name", spec_title_4_field_2_name.getText().toString());
                        data.put("spec_title_4_field_2_value", spec_title_4_field_2_value.getText().toString());
                        data.put("spec_title_4_field_3_name", spec_title_4_field_3_name.getText().toString());
                        data.put("spec_title_4_field_3_value", spec_title_4_field_3_value.getText().toString());

                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(spec_title_4_totals_fields.getText().toString())) {
                            data.put("spec_title_4_total_fields", Integer.parseInt(spec_title_4_totals_fields.getText().toString()));
                        }
                        else
                        {
                            data.put("spec_title_4_total_fields", 0);
                        }

                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(total_rating.getText().toString())) {
                            data.put("total_ratings", Integer.parseInt(total_rating.getText().toString()));
                        }
                        else
                        {
                            data.put("total_ratings", 0);
                        }

                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(total_spec_titles.getText().toString())) {
                            data.put("total_spec_titles", Integer.parseInt(total_spec_titles.getText().toString()));
                        }
                        else
                        {
                            data.put("total_spec_titles", 0);
                        }



                        databaseproducts.collection("PRODUCTS")
                                .add(data)
                                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                                    @Override
                                    public void onSuccess(DocumentReference documentReference) {

                                        //return to activity list of product and close the current activity of adding product
                                        Intent intent = new Intent(ProductAddDetails.this, ProductsListActivity.class);
                                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                        startActivity(intent);
                                        Toast.makeText(ProductAddDetails.this, "Adding successfully product!", Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .addOnFailureListener(new OnFailureListener() {
                                    @Override
                                    public void onFailure(@NonNull Exception e) {

                                        Toast.makeText(ProductAddDetails.this, "Error adding product", Toast.LENGTH_SHORT).show();
                                    }
                                });
                    }
                    catch (Exception e )
                    {
                        Toast.makeText(ProductAddDetails.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }

            });
        }
        catch (Exception e)
        {
            Toast.makeText(ProductAddDetails.this, e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}