package com.azgiampaoli;


import com.azgiampaoli.gof.singletonEager;
import com.azgiampaoli.gof.singletonLazy;
import com.azgiampaoli.gof.singletonLazyHolder;

public class Main {

    public static void main(String[] args) {

        singletonLazy lazy = singletonLazy.getInstancia();
        System.out.println(lazy);
        singletonLazy lazy1 = singletonLazy.getInstancia();
        System.out.println(lazy1);
        singletonEager lazy2 = singletonEager.getInstancia();
        System.out.println(lazy2);
        singletonEager lazy3 = singletonEager.getInstancia();
        System.out.println(lazy3);
        singletonLazyHolder lazy4 = singletonLazyHolder.getInstancia();
        System.out.println(lazy4);
        singletonLazyHolder lazy5 = singletonLazyHolder.getInstancia();
        System.out.println(lazy5);
    }
}
