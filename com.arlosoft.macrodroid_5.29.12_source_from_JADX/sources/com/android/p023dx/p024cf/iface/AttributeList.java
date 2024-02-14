package com.android.p023dx.p024cf.iface;

/* renamed from: com.android.dx.cf.iface.AttributeList */
public interface AttributeList {
    int byteLength();

    Attribute findFirst(String str);

    Attribute findNext(Attribute attribute);

    Attribute get(int i);

    boolean isMutable();

    int size();
}
