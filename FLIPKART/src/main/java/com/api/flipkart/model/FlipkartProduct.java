package com.api.flipkart.model;

import jakarta.persistence.*;

@Entity
@Table(name = "flipkart")
public class FlipkartProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "F_PRODUCT_ID")
    private String productid;
    @Column(name = "F_PRODUCT_NAME")
    private String productname;
    @Column(name = "F_PRODUCT_PRICE")
    private long productprice;

    public FlipkartProduct() {
    }

    public FlipkartProduct(int id, String productid, String productname, long productprice) {
        super();
        this.id = id;
        this.productid = productid;
        this.productname = productname;
        this.productprice = productprice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public long getProductprice() {
        return productprice;
    }

    public void setProductprice(long productprice) {
        this.productprice = productprice;
    }

    @Override
    public String toString() {
        return "FlipkartProduct [id=" + id + ", productid=" + productid + ", productname=" + productname
                + ", productprice=" + productprice + "]";
    }

}
