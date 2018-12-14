package com.chk.designpattern.factorymethod;

/**
 * @author changhongkai
 * @date 2018/12/14 上午11:28
 */
public class OrangeCanFactory extends CanFactory {
    @Override
    public FruitCan produce() {
        return new OrangeCan();
    }
}
