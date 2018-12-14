package com.chk.designpattern.factoryMethod;

/**
 * @author changhongkai
 * @date 2018/12/14 上午11:27
 */
public class AppleCanFactory extends CanFactoryAbstract {
    @Override
    public FruitCanAbstract produce() {
        return new AppleCan();
    }
}
