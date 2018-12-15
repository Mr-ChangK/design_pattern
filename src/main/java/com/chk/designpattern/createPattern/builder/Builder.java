package com.chk.designpattern.createPattern.builder;

/**
 * @author changhongkai
 * @date 2018/12/15 下午7:00
 */
public abstract class Builder {

    abstract protected void bulidPartA(String var);
    abstract protected void buildPartB(String var);
    abstract public Product buildProduct();
}
