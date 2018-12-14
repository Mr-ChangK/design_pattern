package com.chk.designpattern.factoryMethod;

/**
 * @author changhongkai
 * @date 2018/12/14 上午11:28
 */
public class OrangeCanFactory extends CanFactoryAbstract {
    @Override
    public FruitCanAbstract produce() {
        return new OrangeCan();
    }
}
