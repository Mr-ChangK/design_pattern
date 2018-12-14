package com.chk.designpattern.factorymethod;

/**
 * @author changhongkai
 * @date 2018/12/14 上午11:27
 */
public class AppleCanFactory extends CanFactory {
    @Override
    public FruitCan produce() {
        return new AppleCan();
    }
}
