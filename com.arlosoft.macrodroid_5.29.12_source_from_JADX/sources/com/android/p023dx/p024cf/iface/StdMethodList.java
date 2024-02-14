package com.android.p023dx.p024cf.iface;

import com.android.p023dx.util.FixedSizeList;

/* renamed from: com.android.dx.cf.iface.StdMethodList */
public final class StdMethodList extends FixedSizeList implements MethodList {
    public StdMethodList(int i) {
        super(i);
    }

    public Method get(int i) {
        return (Method) get0(i);
    }

    public void set(int i, Method method) {
        set0(i, method);
    }
}
