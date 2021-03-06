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
import android.widget.Spinner;
import android.widget.Toast;

import com.example.adminmall.R;
import com.example.adminmall.beans.Product;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class ProductUpdateDetails extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_update_details);
        try {

            //initiliaze UI
            final Spinner SpinnerCategorie = findViewById(R.id.spinnercategorie);
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
            Button btn_update = findViewById(R.id.update);

            // get product data from intent
            Intent i = getIntent();
            final Product product = (Product)i.getSerializableExtra("product");


            //set selected categorie
            String textcaterogie = product.getIndex_category();

            if(textcaterogie.equals("4"))
                SpinnerCategorie.setSelection(0);
            if(textcaterogie.equals("7"))
                SpinnerCategorie.setSelection(1);
            if(textcaterogie.equals("3"))
                SpinnerCategorie.setSelection(2);
            if(textcaterogie.equals("6"))
                SpinnerCategorie.setSelection(3);
            if(textcaterogie.equals("5"))
                SpinnerCategorie.setSelection(4);
            if(textcaterogie.equals("2"))
                SpinnerCategorie.setSelection(5);
            if(textcaterogie.equals("11"))
                SpinnerCategorie.setSelection(6);
            if(textcaterogie.equals("8"))
                SpinnerCategorie.setSelection(7);
            if(textcaterogie.equals("9"))
                SpinnerCategorie.setSelection(8);
            if(textcaterogie.equals("10"))
                SpinnerCategorie.setSelection(9);
            if(textcaterogie.equals("12"))
                SpinnerCategorie.setSelection(10);

            //fill edit texts with data of product
            product_title.setText(product.getProduct_title());
            product_price.setText(product.getProduct_price());
            star_1.setText(product.getStar_1());
            star_2.setText(product.getStar_2());
            star_3.setText(product.getStar_3());
            star_4.setText(product.getStar_4());
            star_5.setText(product.getStar_5());

            //set check radio button for COD
            if(product.getCod().equals("true"))
            {
                codradioTrue.setChecked(true);
            }
            else if(product.getCod().equals("false"))
            {
                codradioFalse.setChecked(true);
            }
            else
            {
                codradioFalse.setChecked(true);
            }

            //set check radio button for In stock
            if(product.getIn_stock().equals("true"))
            {
                instockradioTrue.setChecked(true);
            }
            else if(product.getIn_stock().equals("false"))
            {
                instockradioFalse.setChecked(true);
            }
            else
            {
                instockradioFalse.setChecked(true);
            }


            average_rating.setText(product.getAverage_rating());
            cutted_price.setText(product.getCutted_price());
            free_coupen_body.setText(product.getFree_coupen_body());
            free_coupen_title.setText(product.getFree_coupen_title());
            free_coupens.setText(product.getFree_coupens());
            product_description.setText(product.getProduct_description());
            no_of_product_images.setText(product.getNo_of_product_images());
            product_image_1.setText(product.getProduct_image_1());
            product_image_2.setText(product.getProduct_image_2());
            product_image_3.setText(product.getProduct_image_3());
            product_other_details.setText(product.getProduct_other_details());
            spec_title_1.setText(product.getSpec_title_1());
            spec_title_1_field_1_name.setText(product.getSpec_title_1_field_1_name());
            spec_title_1_field_1_value.setText(product.getSpec_title_1_field_1_value());
            spec_title_1_field_2_name.setText(product.getSpec_title_1_field_2_name());
            spec_title_1_field_2_value.setText(product.getSpec_title_1_field_2_value());
            spec_title_1_totals_fields.setText(product.getSpec_title_1_totals_fields());
            spec_title_2.setText(product.getSpec_title_2());
            spec_title_2_field_1_name.setText(product.getSpec_title_2_field_1_name());
            spec_title_2_field_1_value.setText(product.getSpec_title_2_field_1_value());
            spec_title_2_field_2_name.setText(product.getSpec_title_2_field_2_name());
            spec_title_2_field_2_value.setText(product.getSpec_title_2_field_2_value());
            spec_title_2_totals_fields.setText(product.getSpec_title_2_totals_fields());
            spec_title_3.setText(product.getSpec_title_3());
            spec_title_3_field_1_name.setText(product.getSpec_title_3_field_1_name());
            spec_title_3_field_1_value.setText(product.getSpec_title_3_field_1_value());
            spec_title_3_field_2_name.setText(product.getSpec_title_3_field_2_name());
            spec_title_3_field_2_value.setText(product.getSpec_title_3_field_2_value());
            spec_title_3_totals_fields.setText(product.getSpec_title_3_totals_fields());
            spec_title_4.setText(product.getSpec_title_4());
            spec_title_4_field_1_name.setText(product.getSpec_title_4_field_1_name());
            spec_title_4_field_1_value.setText(product.getSpec_title_4_field_1_value());
            spec_title_4_field_2_name.setText(product.getSpec_title_4_field_2_name());
            spec_title_4_field_2_value.setText(product.getSpec_title_4_field_2_value());
            spec_title_4_field_3_name.setText(product.getSpec_title_4_field_3_name());
            spec_title_4_field_3_value.setText(product.getSpec_title_4_field_3_value());
            spec_title_4_totals_fields.setText(product.getSpec_title_4_totals_fields());
            total_rating.setText(product.getTotal_rating());
            total_spec_titles.setText(product.getTotal_spec_titles());


            //initialize database
            //our database reference object
            FirebaseFirestore databaseproducts = FirebaseFirestore.getInstance();
            final DocumentReference productDocumentRef = databaseproducts.collection("PRODUCTS").document(product.getId());


            //action of update button: update the product
            btn_update.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {


                        progressBar.setVisibility(View.VISIBLE);
                        Map<String, Object> updates = new HashMap<>();


                        String textcaterogie = SpinnerCategorie.getSelectedItem().toString();
                        int indexcategorie = 0;

                        if(textcaterogie.equals("نقش على البلور"))
                            indexcategorie = 4;
                        if(textcaterogie.equals("خشب"))
                            indexcategorie = 7;
                        if(textcaterogie.equals("الخياطة"))
                            indexcategorie = 3;
                        if(textcaterogie.equals("صناعة المصوغ"))
                            indexcategorie = 6;
                        if(textcaterogie.equals("الأثاث"))
                            indexcategorie = 5;
                        if(textcaterogie.equals("اللباس التقليدي"))
                            indexcategorie = 2;
                        if(textcaterogie.equals("سعف النخيل"))
                            indexcategorie = 11;
                        if(textcaterogie.equals("نحاس"))
                            indexcategorie = 8;
                        if(textcaterogie.equals("الفخار و الخزف"))
                            indexcategorie = 9;
                        if(textcaterogie.equals("صناعة الجلد"))
                            indexcategorie = 10;
                        if(textcaterogie.equals("الزربية"))
                            indexcategorie = 12;

                        updates.put("use_tab_layout", true);
                        updates.put("index_category", indexcategorie);
                        updates.put("product_title", product_title.getText().toString());
                        updates.put("product_description", product_description.getText().toString());

                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(star_1.getText().toString())) {
                            updates.put("1_star", Integer.parseInt(star_1.getText().toString()));
                        }
                        else
                        {
                            updates.put("1_star", 0);
                        }

                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(star_2.getText().toString())) {
                            updates.put("2_star", Integer.parseInt(star_2.getText().toString()));
                        }
                        else
                        {
                            updates.put("2_star", 0);
                        }


                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(star_3.getText().toString())) {
                            updates.put("3_star", Integer.parseInt(star_3.getText().toString()));
                        }
                        else
                        {
                            updates.put("3_star", 0);
                        }

                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(star_4.getText().toString())) {
                            updates.put("4_star", Integer.parseInt(star_4.getText().toString()));
                        }
                        else
                        {
                            updates.put("4_star", 0);
                        }

                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(star_5.getText().toString())) {
                            updates.put("5_star", Integer.parseInt(star_5.getText().toString()));
                        }
                        else
                        {
                            updates.put("5_star", 0);
                        }



                        // get selected radio button from radioGroup of COD
                        int selectedIdRadioCOD = RadioGroupCod.getCheckedRadioButtonId();
                        // find the radiobutton by returned id
                        RadioButton radioCod = (RadioButton) findViewById(selectedIdRadioCOD);
                        updates.put("COD", Boolean.parseBoolean(radioCod.getText().toString()));
                        radioCod.setChecked(true);

                        // get selected radio button from radioGroup of in_stock
                        int selectedIdRadioInstock = RadioGroupInstock.getCheckedRadioButtonId();
                        // find the radiobutton by returned id
                        RadioButton radioinstock = (RadioButton) findViewById(selectedIdRadioInstock);
                        updates.put("in_stock", Boolean.parseBoolean(radioinstock.getText().toString()));
                        radioinstock.setChecked(true);

                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(average_rating.getText().toString())) {
                            updates.put("average_rating", Integer.parseInt(average_rating.getText().toString()));
                        }
                        else
                        {
                            updates.put("average_rating", 0);
                        }

                        updates.put("cutted_price", cutted_price.getText().toString());
                        updates.put("free_coupen_body", free_coupen_body.getText().toString());
                        updates.put("free_coupen_title", free_coupen_title.getText().toString());

                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(free_coupens.getText().toString())) {
                            updates.put("free_coupens", Integer.parseInt(free_coupens.getText().toString()));
                        }
                        else
                        {
                            updates.put("free_coupens", 0);
                        }


                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(no_of_product_images.getText().toString())) {
                            updates.put("no_of_product_images", Integer.parseInt(no_of_product_images.getText().toString()));
                        }
                        else
                        {
                            updates.put("no_of_product_images", 0);
                        }


                        updates.put("product_image_1", product_image_1.getText().toString());
                        updates.put("product_image_2", product_image_2.getText().toString());
                        updates.put("product_image_3", product_image_3.getText().toString());
                        updates.put("product_other_details", product_other_details.getText().toString());
                        updates.put("product_price", product_price.getText().toString());

                        updates.put("spec_title_1", spec_title_1.getText().toString());
                        updates.put("spec_title_1_field_1_name", spec_title_1_field_1_name.getText().toString());
                        updates.put("spec_title_1_field_1_value", spec_title_1_field_1_value.getText().toString());
                        updates.put("spec_title_1_field_2_name", spec_title_1_field_2_name.getText().toString());
                        updates.put("spec_title_1_field_2_value", spec_title_1_field_2_value.getText().toString());

                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(spec_title_1_totals_fields.getText().toString())) {
                            updates.put("spec_title_1_total_fields", Integer.parseInt(spec_title_1_totals_fields.getText().toString()));
                        }
                        else
                        {
                            updates.put("spec_title_1_total_fields", 0);
                        }

                        updates.put("spec_title_2", spec_title_2.getText().toString());
                        updates.put("spec_title_2_field_1_name", spec_title_2_field_1_name.getText().toString());
                        updates.put("spec_title_2_field_1_value", spec_title_2_field_1_value.getText().toString());
                        updates.put("spec_title_2_field_2_name", spec_title_2_field_2_name.getText().toString());
                        updates.put("spec_title_2_field_2_value", spec_title_2_field_2_value.getText().toString());

                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(spec_title_2_totals_fields.getText().toString())) {
                            updates.put("spec_title_2_total_fields", Integer.parseInt(spec_title_2_totals_fields.getText().toString()));
                        }
                        else
                        {
                            updates.put("spec_title_2_total_fields", 0);
                        }

                        updates.put("spec_title_3", spec_title_3.getText().toString());
                        updates.put("spec_title_3_field_1_name", spec_title_3_field_1_name.getText().toString());
                        updates.put("spec_title_3_field_1_value", spec_title_3_field_1_value.getText().toString());
                        updates.put("spec_title_3_field_2_name", spec_title_3_field_2_name.getText().toString());
                        updates.put("spec_title_3_field_2_value", spec_title_3_field_2_value.getText().toString());

                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(spec_title_3_totals_fields.getText().toString())) {
                            updates.put("spec_title_3_total_fields", Integer.parseInt(spec_title_3_totals_fields.getText().toString()));
                        }
                        else
                        {
                            updates.put("spec_title_3_total_fields", 0);
                        }

                        updates.put("spec_title_4", spec_title_4.getText().toString());
                        updates.put("spec_title_4_field_1_name", spec_title_4_field_1_name.getText().toString());
                        updates.put("spec_title_4_field_1_value", spec_title_4_field_1_value.getText().toString());
                        updates.put("spec_title_4_field_2_name", spec_title_4_field_2_name.getText().toString());
                        updates.put("spec_title_4_field_2_value", spec_title_4_field_2_value.getText().toString());
                        updates.put("spec_title_4_field_3_name", spec_title_4_field_3_name.getText().toString());
                        updates.put("spec_title_4_field_3_value", spec_title_4_field_3_value.getText().toString());

                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(spec_title_4_totals_fields.getText().toString())) {
                            updates.put("spec_title_4_total_fields", Integer.parseInt(spec_title_4_totals_fields.getText().toString()));
                        }
                        else
                        {
                            updates.put("spec_title_4_total_fields", 0);
                        }

                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(total_rating.getText().toString())) {
                            updates.put("total_ratings", Integer.parseInt(total_rating.getText().toString()));
                        }
                        else
                        {
                            updates.put("total_ratings", 0);
                        }

                        //set default value to zero if the input text is empty --> to avoid crush of conversion from string to int
                        if (!TextUtils.isEmpty(total_spec_titles.getText().toString())) {
                            updates.put("total_spec_titles", Integer.parseInt(total_spec_titles.getText().toString()));
                        }
                        else
                        {
                            updates.put("total_spec_titles", 0);
                        }


                        productDocumentRef
                                .update(updates)
                                .addOnSuccessListener(new OnSuccessListener<Void>() {
                                    @Override
                                    public void onSuccess(Void aVoid) {
                                        progressBar.setVisibility(View.GONE);
                                        //return to activity list of product and close the current activity of adding product
                                        Intent intent = new Intent(ProductUpdateDetails.this, ProductsListActivity.class);
                                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                        startActivity(intent);
                                        Toast.makeText(ProductUpdateDetails.this, "Product successfully updated!", Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .addOnFailureListener(new OnFailureListener() {
                                    @Override
                                    public void onFailure(@NonNull Exception e) {
                                        progressBar.setVisibility(View.GONE);
                                        Toast.makeText(ProductUpdateDetails.this, "Error updating product", Toast.LENGTH_SHORT).show();

                                    }
                                });
                    }
                    catch (Exception e )
                    {
                        Toast.makeText(ProductUpdateDetails.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }

            });
        }
        catch (Exception e)
        {
            Toast.makeText(ProductUpdateDetails.this, e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}