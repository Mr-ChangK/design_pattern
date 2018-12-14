package com.chk.designpattern.createPattern.singleton;

import java.util.Objects;

/**
 * @author changhongkai
 * @date 2018/12/14 下午3:19
 * 懒汉式
 */
public class LazySingleton {
    private LazySingleton() {

    }

    private static LazySingleton lazySingleton;

    /**
     * 线程安全
     *
     * @return
     */
    public static synchronized LazySingleton getSynInstance1() {
        if (Objects.isNull(lazySingleton)) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    /**
     * 线程安全
     * 使用双重检查锁来保证线程安全唯一
     *
     * @return
     */
    public static LazySingleton getSynInstance2() {
        if (Objects.isNull(lazySingleton)) {
            synchronized (Class.class) {
                if (Objects.isNull(lazySingleton)) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

    /**
     * 线程安全
     * 使用静态内部类保证线程安全，因为内部的静态类只会被加载一次，只会有一个实例对象，所以是线程安全的
     *
     * @return
     */
    public LazySingleton getSynInstance3() {
        if (Objects.isNull(lazySingleton)) {
            lazySingleton = Singleton.lazySingleton;
        }
        return lazySingleton;
    }

    private static class Singleton {
        private static LazySingleton lazySingleton = new LazySingleton();
    }

    /**
     * 线程不安全
     *
     * @return
     */
    public static LazySingleton getNonSynInstance() {
        if (Objects.isNull(lazySingleton)) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
