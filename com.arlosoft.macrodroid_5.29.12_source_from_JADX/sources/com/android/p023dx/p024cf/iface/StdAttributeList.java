package com.android.p023dx.p024cf.iface;

import com.android.p023dx.util.FixedSizeList;

/* renamed from: com.android.dx.cf.iface.StdAttributeList */
public final class StdAttributeList extends FixedSizeList implements AttributeList {
    public StdAttributeList(int i) {
        super(i);
    }

    public int byteLength() {
        int size = size();
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            i += get(i2).byteLength();
        }
        return i;
    }

    public Attribute findFirst(String str) {
        int size = size();
        for (int i = 0; i < size; i++) {
            Attribute attribute = get(i);
            if (attribute.getName().equals(str)) {
                return attribute;
            }
        }
        return null;
    }

    public Attribute findNext(Attribute attribute) {
        Attribute attribute2;
        int size = size();
        int i = 0;
        while (i < size) {
            if (get(i) == attribute) {
                String name = attribute.getName();
                do {
                    i++;
                    if (i >= size) {
                        return null;
                    }
                    attribute2 = get(i);
                } while (!attribute2.getName().equals(name));
                return attribute2;
            }
            i++;
        }
        return null;
    }

    public Attribute get(int i) {
        return (Attribute) get0(i);
    }

    public void set(int i, Attribute attribute) {
        set0(i, attribute);
    }
}
