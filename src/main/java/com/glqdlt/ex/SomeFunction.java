package com.glqdlt.ex;

import java.util.List;

/**
 * @author glqdlt
 * 2019-03-16
 */
public interface SomeFunction {
    default int max(List<Integer> list){
        return list.get(0);
    }
}
