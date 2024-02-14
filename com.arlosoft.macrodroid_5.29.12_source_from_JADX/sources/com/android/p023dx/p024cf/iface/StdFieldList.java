package com.android.p023dx.p024cf.iface;

import com.android.p023dx.util.FixedSizeList;

/* renamed from: com.android.dx.cf.iface.StdFieldList */
public final class StdFieldList extends FixedSizeList implements FieldList {
    public StdFieldList(int i) {
        super(i);
    }

    public Field get(int i) {
        return (Field) get0(i);
    }

    public void set(int i, Field field) {
        set0(i, field);
    }
}
