
package io.collective;

import java.time.Clock;

public class SimpleAgedCache {
    private final Clock clock;
    private String  keys[];
    private String values[];
    private int prices[];
    private int i=0;

    public SimpleAgedCache() {
    }

    public SimpleAgedCache(Clock clock) {
        this.clock = clock;
    }

    public void put(String keys,String value, int price) {
        this.keys[i] = keys;
        this.values[i] = value;
        this.prices[i] = price;
        i++;
    }

    public boolean isEmpty(){
       if(keys.length==0 && values.length==0 && prices.length==0){
           return true;
       }
       return false;
    }

    public int size(){
        return  i;
    }

    public String get(String key){
        for(int j=0;j<i;j++){
            if(keys[j].equals(key)){
                return values[j];
            }
        }
        return null;
    }



}

