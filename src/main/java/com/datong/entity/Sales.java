package com.datong.entity;

import lombok.Data;

@Data
public class Sales {
    private int goods_id;
    private String goods_name;
    private float goods_price;
    private int goods_CustomNumber;
    private float total_price;
    private String SalesDate;
}
