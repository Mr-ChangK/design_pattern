package com.chk.designpattern.structuralPattern.Adapter.classAdapter;

/**
 * @author changhongkai
 * @date 2018/12/25 下午3:57
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        needAdapterMethod();
    }
}
