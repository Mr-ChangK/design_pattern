package com.chk.designpattern.createPattern.abstractFactory;

/**
 * @author changhongkai
 * @date 2018/12/14 下午2:21
 */
public abstract class CarFactoryAbstract {
    abstract protected void decideCarColor();

    abstract protected void decideCarType();

    abstract public void build();
}
