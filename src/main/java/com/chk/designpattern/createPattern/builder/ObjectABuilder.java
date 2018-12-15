package com.chk.designpattern.createPattern.builder;

/**
 * @author changhongkai
 * @date 2018/12/15 下午7:01
 */
public class ObjectABuilder extends Builder {
    private Product product;
    @Override
    public void  bulidPartA(String var) {
        product.setPartA(var);
    }

    @Override
    protected void buildPartB(String var) {
        product.setPartB(var);
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
