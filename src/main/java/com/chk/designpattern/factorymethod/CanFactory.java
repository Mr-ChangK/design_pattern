package com.chk.designpattern.factorymethod;

/**
 * @author changhongkai
 * @date 2018/12/14 上午11:02
 */
public abstract class CanFactory {

    abstract public FruitCan produce();

    public static FruitCan processAppleCan(){
        return new AppleCan();
    }

    public static FruitCan processOrangeCan(){
        return new OrangeCan();
    }
}
