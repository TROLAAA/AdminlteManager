package com.datong.entity;

import lombok.Data;

@Data
public class Stock {
    private int goods_id;
    private String goods_name;
    private String goods_total;
    private String goods_left;
}
