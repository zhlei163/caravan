package com.ctrip.soa.caravan.util.safelist.checker;

import java.util.List;

import com.ctrip.soa.caravan.common.value.CollectionValues;
import com.ctrip.soa.caravan.util.safelist.SafeListChecker;

/**
 * Created by Qiang Zhao on 10/05/2016.
 */
public class WhiteListChecker<T> implements SafeListChecker<T> {

    public static final WhiteListChecker<String> DEFAULT = new WhiteListChecker<>();

    @Override
    public boolean check(List<T> list, T item) {
        if (CollectionValues.isNullOrEmpty(list))
            return true;

        return list.contains(item);
    }

}
