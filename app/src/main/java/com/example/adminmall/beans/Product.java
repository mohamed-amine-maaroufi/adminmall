package com.example.adminmall.beans;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private int star_1, star_2,star_3, star_4, star_5;
    private boolean cod;
    private double average_rating;
    private String cutted_price;
    private String free_coupen_body;
    private String getFree_coupen_title;
    private int free_coupens;
    private String product_description;
    private String product_image_1;
    private String product_image_2;
    private String product_image_3;
    private String product_other_details;
    private String product_price;
    private String product_title;
    private String spec_title_1;
    private String spec_title_1_field_1_name;
    private String spec_title_1_field_1_value;
    private String spec_title_1_field_2_name;
    private String spec_title_1_field_2_value;
    private int spec_title_1_totals_fields;
    private String spec_title_2;
    private String spec_title_2_field_1_name;
    private String spec_title_2_field_1_value;
    private String spec_title_2_field_2_name;
    private String spec_title_2_field_2_value;
    private int spec_title_2_totals_fields;
    private String spec_title_3;
    private String spec_title_3_field_1_name;
    private String spec_title_3_field_1_value;
    private String spec_title_3_field_2_name;
    private String spec_title_3_field_2_value;
    private int spec_title_3_totals_fields;
    private String spec_title_4;
    private String spec_title_4_field_1_name;
    private String spec_title_4_field_1_value;
    private String spec_title_4_field_2_name;
    private String spec_title_4_field_2_value;
    private String spec_title_4_field_3_name;
    private String spec_title_4_field_3_value;
    private int spec_title_4_totals_fields;
    private int total_rating;
    private int total_spec_titles;

    //constructor with parameters
    public Product(
                    int star_1,
                    int star_2,
                    int  star_3,
                    int star_4,
                    int star_5,
                    boolean cod,
                    double average_rating,
                    String cutted_price,
                    String free_coupen_body,
                    String getFree_coupen_title,
                    int free_coupens,
                    String product_description,
                    String product_image_1,
                    String product_image_2,
                    String product_image_3,
                    String product_other_details,
                    String product_price,
                    String product_title,
                    String spec_title_1,
                    String spec_title_1_field_1_name,
                    String spec_title_1_field_1_value,
                    String spec_title_1_field_2_value,
                    int spec_title_1_totals_fields,
                    String spec_title_2,
                    String spec_title_2_field_1_name,
                    String spec_title_2_field_1_value,
                    String spec_title_2_field_2_name,
                    String spec_title_2_field_2_value,
                    int spec_title_2_totals_fields,
                    String spec_title_3,
                    String spec_title_3_field_1_name,
                    String spec_title_3_field_1_value,
                    String spec_title_3_field_2_name,
                    String spec_title_3_field_2_value,
                    int spec_title_3_totals_fields,
                    String spec_title_4,
                    String spec_title_4_field_1_name,
                    String spec_title_4_field_1_value,
                    String spec_title_4_field_2_name,
                    String spec_title_4_field_2_value,
					String spec_title_4_field_3_name,
					String spec_title_4_field_3_value,
					int spec_title_4_totals_fields,
					int total_rating,
					int total_spec_titles
    )
    {
		this.star_1 = star_1;
		this.star_2 = star_2;
		this.star_3 = star_3;
		this.star_4 = star_4;
		this.star_5 = star_5;
		this.cod = cod;
		this.average_rating = average_rating;
		this.cutted_price = cutted_price;
		this.free_coupen_body = free_coupen_body;
		this.getFree_coupen_title = getFree_coupen_title;
		this.free_coupens = free_coupens;
		this.product_description = product_description;
		this.product_image_1 = product_image_1;
		this.product_image_2 = product_image_2;
		this.product_image_3 = product_image_3;
		this.product_other_details = product_other_details;
		this.product_price = product_price;
		this.product_title = product_title;
		this.spec_title_1 = spec_title_1;
		this.spec_title_1_field_1_name = spec_title_1_field_1_name;
		this.spec_title_1_field_1_value = spec_title_1_field_1_value;
		this.spec_title_1_field_2_name = spec_title_1_field_2_name;
		this.spec_title_1_field_2_value = spec_title_1_field_2_value;
		this.spec_title_1_totals_fields = spec_title_1_totals_fields;
		this.spec_title_2 = spec_title_2;
		this.spec_title_2_field_1_name = spec_title_2_field_1_name;
		this.spec_title_2_field_1_value = spec_title_2_field_1_value;
		this.spec_title_2_field_2_name = spec_title_2_field_2_name;
		this.spec_title_2_field_2_value = spec_title_2_field_2_value;
		this.spec_title_2_totals_fields = spec_title_2_totals_fields;
		this.spec_title_3 = spec_title_3;
		this.spec_title_3_field_1_name = spec_title_3_field_1_name;
		this.spec_title_3_field_1_value = spec_title_3_field_1_value;
		this.spec_title_3_field_2_name = spec_title_3_field_2_name;
		this.spec_title_3_field_2_value = spec_title_3_field_2_value;
		this.spec_title_3_totals_fields = spec_title_3_totals_fields;
		this.spec_title_4 = spec_title_4;
		this.spec_title_4_field_1_name = spec_title_4_field_1_name;
		this.spec_title_4_field_1_value = spec_title_4_field_1_value;
		this.spec_title_4_field_2_name = spec_title_4_field_2_name;
		this.spec_title_4_field_2_value = spec_title_4_field_2_value;
		this.spec_title_4_field_3_name = spec_title_4_field_3_name;
		this.spec_title_4_field_3_value = spec_title_4_field_3_value;
		this.spec_title_4_totals_fields = spec_title_4_totals_fields;
		this.total_rating = total_rating;
		this.total_spec_titles = total_spec_titles;

    }
    //default parameters
    public Product(){

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStar_1() {
        return star_1;
    }

    public void setStar_1(int star_1) {
        this.star_1 = star_1;
    }

    public int getStar_2() {
        return star_2;
    }

    public void setStar_2(int star_2) {
        this.star_2 = star_2;
    }

    public int getStar_3() {
        return star_3;
    }

    public void setStar_3(int star_3) {
        this.star_3 = star_3;
    }

    public int getStar_4() {
        return star_4;
    }

    public void setStar_4(int star_4) {
        this.star_4 = star_4;
    }

    public int getStar_5() {
        return star_5;
    }

    public void setStar_5(int star_5) {
        this.star_5 = star_5;
    }

    public boolean isCod() {
        return cod;
    }

    public void setCod(boolean cod) {
        this.cod = cod;
    }

    public double getAverage_rating() {
        return average_rating;
    }

    public void setAverage_rating(double average_rating) {
        this.average_rating = average_rating;
    }

    public String getCutted_price() {
        return cutted_price;
    }

    public void setCutted_price(String cutted_price) {
        this.cutted_price = cutted_price;
    }

    public String getFree_coupen_body() {
        return free_coupen_body;
    }

    public void setFree_coupen_body(String free_coupen_body) {
        this.free_coupen_body = free_coupen_body;
    }

    public String getGetFree_coupen_title() {
        return getFree_coupen_title;
    }

    public void setGetFree_coupen_title(String getFree_coupen_title) {
        this.getFree_coupen_title = getFree_coupen_title;
    }

    public int getFree_coupens() {
        return free_coupens;
    }

    public void setFree_coupens(int free_coupens) {
        this.free_coupens = free_coupens;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public String getProduct_image_1() {
        return product_image_1;
    }

    public void setProduct_image_1(String product_image_1) {
        this.product_image_1 = product_image_1;
    }

    public String getProduct_image_2() {
        return product_image_2;
    }

    public void setProduct_image_2(String product_image_2) {
        this.product_image_2 = product_image_2;
    }

    public String getProduct_image_3() {
        return product_image_3;
    }

    public void setProduct_image_3(String product_image_3) {
        this.product_image_3 = product_image_3;
    }

    public String getProduct_other_details() {
        return product_other_details;
    }

    public void setProduct_other_details(String product_other_details) {
        this.product_other_details = product_other_details;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

    public String getProduct_title() {
        return product_title;
    }

    public void setProduct_title(String product_title) {
        this.product_title = product_title;
    }

    public String getSpec_title_1() {
        return spec_title_1;
    }

    public void setSpec_title_1(String spec_title_1) {
        this.spec_title_1 = spec_title_1;
    }

    public String getSpec_title_1_field_1_name() {
        return spec_title_1_field_1_name;
    }

    public void setSpec_title_1_field_1_name(String spec_title_1_field_1_name) {
        this.spec_title_1_field_1_name = spec_title_1_field_1_name;
    }

    public String getSpec_title_1_field_1_value() {
        return spec_title_1_field_1_value;
    }

    public void setSpec_title_1_field_1_value(String spec_title_1_field_1_value) {
        this.spec_title_1_field_1_value = spec_title_1_field_1_value;
    }

    public String getSpec_title_1_field_2_name() {
        return spec_title_1_field_2_name;
    }

    public void setSpec_title_1_field_2_name(String spec_title_1_field_2_name) {
        this.spec_title_1_field_2_name = spec_title_1_field_2_name;
    }

    public String getSpec_title_1_field_2_value() {
        return spec_title_1_field_2_value;
    }

    public void setSpec_title_1_field_2_value(String spec_title_1_field_2_value) {
        this.spec_title_1_field_2_value = spec_title_1_field_2_value;
    }

    public int getSpec_title_1_totals_fields() {
        return spec_title_1_totals_fields;
    }

    public void setSpec_title_1_totals_fields(int spec_title_1_totals_fields) {
        this.spec_title_1_totals_fields = spec_title_1_totals_fields;
    }

    public String getSpec_title_2() {
        return spec_title_2;
    }

    public void setSpec_title_2(String spec_title_2) {
        this.spec_title_2 = spec_title_2;
    }

    public String getSpec_title_2_field_1_name() {
        return spec_title_2_field_1_name;
    }

    public void setSpec_title_2_field_1_name(String spec_title_2_field_1_name) {
        this.spec_title_2_field_1_name = spec_title_2_field_1_name;
    }

    public String getSpec_title_2_field_1_value() {
        return spec_title_2_field_1_value;
    }

    public void setSpec_title_2_field_1_value(String spec_title_2_field_1_value) {
        this.spec_title_2_field_1_value = spec_title_2_field_1_value;
    }

    public String getSpec_title_2_field_2_name() {
        return spec_title_2_field_2_name;
    }

    public void setSpec_title_2_field_2_name(String spec_title_2_field_2_name) {
        this.spec_title_2_field_2_name = spec_title_2_field_2_name;
    }

    public String getSpec_title_2_field_2_value() {
        return spec_title_2_field_2_value;
    }

    public void setSpec_title_2_field_2_value(String spec_title_2_field_2_value) {
        this.spec_title_2_field_2_value = spec_title_2_field_2_value;
    }

    public int getSpec_title_2_totals_fields() {
        return spec_title_2_totals_fields;
    }

    public void setSpec_title_2_totals_fields(int spec_title_2_totals_fields) {
        this.spec_title_2_totals_fields = spec_title_2_totals_fields;
    }

    public String getSpec_title_3() {
        return spec_title_3;
    }

    public void setSpec_title_3(String spec_title_3) {
        this.spec_title_3 = spec_title_3;
    }

    public String getSpec_title_3_field_1_name() {
        return spec_title_3_field_1_name;
    }

    public void setSpec_title_3_field_1_name(String spec_title_3_field_1_name) {
        this.spec_title_3_field_1_name = spec_title_3_field_1_name;
    }

    public String getSpec_title_3_field_1_value() {
        return spec_title_3_field_1_value;
    }

    public void setSpec_title_3_field_1_value(String spec_title_3_field_1_value) {
        this.spec_title_3_field_1_value = spec_title_3_field_1_value;
    }

    public String getSpec_title_3_field_2_name() {
        return spec_title_3_field_2_name;
    }

    public void setSpec_title_3_field_2_name(String spec_title_3_field_2_name) {
        this.spec_title_3_field_2_name = spec_title_3_field_2_name;
    }

    public String getSpec_title_3_field_2_value() {
        return spec_title_3_field_2_value;
    }

    public void setSpec_title_3_field_2_value(String spec_title_3_field_2_value) {
        this.spec_title_3_field_2_value = spec_title_3_field_2_value;
    }

    public int getSpec_title_3_totals_fields() {
        return spec_title_3_totals_fields;
    }

    public void setSpec_title_3_totals_fields(int spec_title_3_totals_fields) {
        this.spec_title_3_totals_fields = spec_title_3_totals_fields;
    }

    public String getSpec_title_4() {
        return spec_title_4;
    }

    public void setSpec_title_4(String spec_title_4) {
        this.spec_title_4 = spec_title_4;
    }

    public String getSpec_title_4_field_1_name() {
        return spec_title_4_field_1_name;
    }

    public void setSpec_title_4_field_1_name(String spec_title_4_field_1_name) {
        this.spec_title_4_field_1_name = spec_title_4_field_1_name;
    }

    public String getSpec_title_4_field_1_value() {
        return spec_title_4_field_1_value;
    }

    public void setSpec_title_4_field_1_value(String spec_title_4_field_1_value) {
        this.spec_title_4_field_1_value = spec_title_4_field_1_value;
    }

    public String getSpec_title_4_field_2_name() {
        return spec_title_4_field_2_name;
    }

    public void setSpec_title_4_field_2_name(String spec_title_4_field_2_name) {
        this.spec_title_4_field_2_name = spec_title_4_field_2_name;
    }

    public String getSpec_title_4_field_2_value() {
        return spec_title_4_field_2_value;
    }

    public void setSpec_title_4_field_2_value(String spec_title_4_field_2_value) {
        this.spec_title_4_field_2_value = spec_title_4_field_2_value;
    }

    public String getSpec_title_4_field_3_name() {
        return spec_title_4_field_3_name;
    }

    public void setSpec_title_4_field_3_name(String spec_title_4_field_3_name) {
        this.spec_title_4_field_3_name = spec_title_4_field_3_name;
    }

    public String getSpec_title_4_field_3_value() {
        return spec_title_4_field_3_value;
    }

    public void setSpec_title_4_field_3_value(String spec_title_4_field_3_value) {
        this.spec_title_4_field_3_value = spec_title_4_field_3_value;
    }

    public int getSpec_title_4_totals_fields() {
        return spec_title_4_totals_fields;
    }

    public void setSpec_title_4_totals_fields(int spec_title_4_totals_fields) {
        this.spec_title_4_totals_fields = spec_title_4_totals_fields;
    }

    public int getTotal_rating() {
        return total_rating;
    }

    public void setTotal_rating(int total_rating) {
        this.total_rating = total_rating;
    }

    public int getTotal_spec_titles() {
        return total_spec_titles;
    }

    public void setTotal_spec_titles(int total_spec_titles) {
        this.total_spec_titles = total_spec_titles;
    }
}