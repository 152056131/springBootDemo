package com.example.springbootdemo.bean;

import java.io.Serializable;

public class Shopcar implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcar.id
     *
     * @mbg.generated Fri Feb 10 15:51:35 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcar.price
     *
     * @mbg.generated Fri Feb 10 15:51:35 CST 2023
     */
    private String price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shopcar
     *
     * @mbg.generated Fri Feb 10 15:51:35 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcar.id
     *
     * @return the value of shopcar.id
     *
     * @mbg.generated Fri Feb 10 15:51:35 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcar.id
     *
     * @param id the value for shopcar.id
     *
     * @mbg.generated Fri Feb 10 15:51:35 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcar.price
     *
     * @return the value of shopcar.price
     *
     * @mbg.generated Fri Feb 10 15:51:35 CST 2023
     */
    public String getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcar.price
     *
     * @param price the value for shopcar.price
     *
     * @mbg.generated Fri Feb 10 15:51:35 CST 2023
     */
    public void setPrice(String price) {
        this.price = price;
    }
}