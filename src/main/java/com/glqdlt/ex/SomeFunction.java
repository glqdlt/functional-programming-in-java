package com.glqdlt.ex;

import java.util.LinkedList;
import java.util.List;

/**
 * @author glqdlt
 * 2019-03-16
 */
public class SomeFunction {
    public static int sum(List<Integer> arr){
        if(arr.size() == 0){
            throw new RuntimeException("Empty List");
        }
        if(arr.size() == 1){
            return arr.get(0);
        }
        LinkedList<Integer> temp = new LinkedList<>();
        temp.addAll(arr);
        Integer first = temp.get(0);
        Integer second = temp.get(1);
        temp.set(0,first+second);
        temp.remove(1);
        return sum(temp);
    }


    public static int max(List<Integer> arr){

        if(arr.size() == 0){
            throw new RuntimeException("Empty List");
        }
        if(arr.size() == 1){
            return arr.get(0);
        }

        LinkedList<Integer> temp = new LinkedList<>();
        temp.addAll(arr);

        int first = temp.get(0);
        int second = temp.get(1);

        if (first > second) {
            temp.remove(1);
        } else {
            temp.remove(0);
        }

        return max(temp);
    }
}
