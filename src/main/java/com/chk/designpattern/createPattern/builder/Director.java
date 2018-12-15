package com.chk.designpattern.createPattern.builder;

/**
 * @author changhongkai
 * @date 2018/12/15 下午11:20
 */
public class Director {

    public Product buildProduce(Builder builder){
        builder.bulidPartA("1111");
        builder.buildPartB("3333");
        return builder.buildProduct();
    }
}
