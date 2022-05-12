package com.azgiampaoli.gof;

public class singletonLazyHolder {

    private static class Holder {
        public static singletonLazyHolder instancia;
    }

    private singletonLazyHolder() {
        super();
    }

    public static singletonLazyHolder getInstancia(){
        if(Holder.instancia == null){
            Holder.instancia = new singletonLazyHolder();
        }
        return Holder.instancia;
    }





}
