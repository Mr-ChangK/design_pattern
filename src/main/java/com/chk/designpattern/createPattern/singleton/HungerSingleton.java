package com.chk.designpattern.createPattern.singleton;

/**
 * @author changhongkai
 * @date 2018/12/14 下午3:22
 * 饿汉式，天生线程安全
 */
public class HungerSingleton {
    private static HungerSingleton hungerSingleton = new HungerSingleton();

    private HungerSingleton() {

    }

    public static HungerSingleton getSynInstance() {
        return hungerSingleton;
    }
}
