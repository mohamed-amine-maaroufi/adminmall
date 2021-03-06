package com.example.adminmall.manageproduct;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adminmall.R;
import com.example.adminmall.beans.Product;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;


public class ProductsListActivity extends AppCompatActivity {


    //our database reference object
    FirebaseFirestore databaseproducts;
    ListView listViewproducts;
    Button btnadd;
    TextView titlepage;
    public static ProductList productAdapter;

    //a list to store all the products from firebase database
    List<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_list);

        //initialize UI
        listViewproducts = (ListView) findViewById(R.id.listViewproducts);
        btnadd = (Button) findViewById(R.id.btnadd);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ProductsListActivity.this, ProductAddDetails.class);
                startActivity(i);
            }
        });

        //initialize database
        databaseproducts = FirebaseFirestore.getInstance();

        //list to store products
        products = new ArrayList<>();

        databaseproducts.collection("PRODUCTS")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            products.clear();
                            try {
                                for (QueryDocumentSnapshot document : task.getResult()) {
                                    Log.d("ActivityProducts", document.getId() + " => " + document.getData());



                                    //getting product
                                    Product product = new Product();

                                    product.setId(document.getId());

                                    product.setProduct_title(String.valueOf(  document.get("product_title")));
                                    product.setProduct_price(String.valueOf(document.get("product_price")));

                                    if(document.get("index_category") != null)
                                        product.setIndex_category(String.valueOf( document.get("index_category")));

                                    if(document.get("1_star") != null)
                                        product.setStar_1(String.valueOf( document.get("1_star")));

                                    if(document.get("2_star") != null)
                                        product.setStar_2(String.valueOf( document.get("2_star")));

                                    if(document.get("3_star") != null)
                                        product.setStar_3(String.valueOf( document.get("3_star")));

                                    if(document.get("4_star") != null)
                                        product.setStar_4(String.valueOf( document.get("4_star")));

                                    if(document.get("5_star") != null)
                                        product.setStar_5(String.valueOf( document.get("5_star")));

                                    if(document.get("COD") != null)
                                        product.setCod(String.valueOf( document.get("COD")));

                                    if(document.get("in_stock") != null)
                                        product.setIn_stock(String.valueOf(  document.get("in_stock")));

                                    if(document.get("no_of_product_images") != null)
                                        product.setNo_of_product_images(String.valueOf(  document.get("no_of_product_images")));


                                    if(document.get("average_rating") != null)
                                        product.setAverage_rating(String.valueOf( document.get("average_rating")));


                                    product.setCutted_price(String.valueOf( document.get("cutted_price")));
                                    product.setFree_coupen_body(String.valueOf(document.get("free_coupen_body")));
                                    product.setFree_coupen_title(String.valueOf( document.get("free_coupen_title")));

                                    if(document.get("free_coupens") != null)
                                        product.setFree_coupens(String.valueOf(document.get("free_coupens")));

                                    product.setProduct_description(String.valueOf(  document.get("product_description")));
                                    product.setProduct_image_1(String.valueOf(  document.get("no_of_product_images")));
                                    product.setProduct_image_1(String.valueOf(  document.get("product_image_1")));
                                    product.setProduct_image_2(String.valueOf(  document.get("product_image_2")));
                                    product.setProduct_image_3(String.valueOf(  document.get("product_image_3")));
                                    product.setProduct_other_details(String.valueOf(  document.get("product_other_details")));
                                    product.setProduct_price(String.valueOf(  document.get("product_price")));
                                    product.setProduct_title(String.valueOf(  document.get("product_title")));
                                    product.setSpec_title_1(String.valueOf(  document.get("spec_title_1")));
                                    product.setSpec_title_1_field_1_name(String.valueOf(  document.get("spec_title_1_field_1_name")));
                                    product.setSpec_title_1_field_1_value(String.valueOf(  document.get("spec_title_1_field_1_value")));
                                    product.setSpec_title_1_field_2_name(String.valueOf(  document.get("spec_title_1_field_2_name")));
                                    product.setSpec_title_1_field_2_value(String.valueOf(  document.get("spec_title_1_field_2_value")));

                                    if(document.get("spec_title_1_total_fields") != null)
                                        product.setSpec_title_1_totals_fields(String.valueOf(  document.get("spec_title_1_total_fields")));

                                    product.setSpec_title_2(String.valueOf(  document.get("spec_title_2")));
                                    product.setSpec_title_2_field_1_name(String.valueOf(  document.get("spec_title_2_field_1_name")));
                                    product.setSpec_title_2_field_1_value(String.valueOf(  document.get("spec_title_2_field_1_value")));
                                    product.setSpec_title_2_field_2_name(String.valueOf(  document.get("spec_title_2_field_2_name")));
                                    product.setSpec_title_2_field_2_value(String.valueOf(  document.get("spec_title_2_field_2_value")));

                                    if(document.get("spec_title_2_total_fields") != null)
                                        product.setSpec_title_2_totals_fields(String.valueOf(  document.get("spec_title_2_total_fields")));

                                    product.setSpec_title_3(String.valueOf(  document.get("spec_title_3")));
                                    product.setSpec_title_3_field_1_name(String.valueOf(  document.get("spec_title_3_field_1_name")));
                                    product.setSpec_title_3_field_1_value(String.valueOf(  document.get("spec_title_3_field_1_value")));
                                    product.setSpec_title_3_field_2_name(String.valueOf(  document.get("spec_title_3_field_2_name")));
                                    product.setSpec_title_3_field_2_value(String.valueOf(  document.get("spec_title_3_field_2_value")));

                                    if(document.get("spec_title_3_total_fields") != null)
                                        product.setSpec_title_3_totals_fields(String.valueOf(  document.get("spec_title_3_total_fields")));

                                    product.setSpec_title_4(String.valueOf(  document.get("spec_title_4")));
                                    product.setSpec_title_4_field_1_name(String.valueOf(  document.get("spec_title_4_field_1_name")));
                                    product.setSpec_title_4_field_1_value(String.valueOf(  document.get("spec_title_4_field_1_value")));
                                    product.setSpec_title_4_field_2_name(String.valueOf(  document.get("spec_title_4_field_2_name")));
                                    product.setSpec_title_4_field_2_value(String.valueOf(  document.get("spec_title_4_field_2_value")));
                                    product.setSpec_title_4_field_3_name(String.valueOf(  document.get("spec_title_4_field_3_name")));
                                    product.setSpec_title_4_field_3_value(String.valueOf(  document.get("spec_title_4_field_3_value")));

                                    if(document.get("spec_title_4_total_fields") != null)
                                        product.setSpec_title_4_totals_fields(String.valueOf(  document.get("spec_title_4_total_fields")));

                                    if(document.get("total_ratings") != null)
                                        product.setTotal_rating(String.valueOf(  document.get("total_ratings")));

                                    if(document.get("total_spec_titles") != null)
                                        product.setTotal_spec_titles(String.valueOf(  document.get("total_spec_titles")));


                                    //adding product to the list
                                    products.add(product);
                                }


                            } catch (Exception e) {
                                e.printStackTrace();
                                Toast.makeText(ProductsListActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                            }

                                //creating adapter
                                productAdapter = new ProductList(ProductsListActivity.this, products);
                                //attaching adapter to the listview
                                listViewproducts.setAdapter(productAdapter);


                        } else {
                            Log.w("ActivityProducts", "Error getting documents.", task.getException());


                            Toast.makeText(ProductsListActivity.this, "Error getting documents. : " +  task.getException().toString() , Toast.LENGTH_LONG).show();

                        }
                    }
                });



        //attaching listener to listview
       listViewproducts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Product product = products.get(i);
                //creating an intent
                Intent intent = new Intent(ProductsListActivity.this, ProductUpdateDetails.class);
                //putting product to intent
                intent.putExtra("product", product);
                //starting the activity with intent
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();

    }


    public static void cleanListProduct(int position)
    {
        productAdapter.remove(productAdapter.getItem(position));
    }

}
