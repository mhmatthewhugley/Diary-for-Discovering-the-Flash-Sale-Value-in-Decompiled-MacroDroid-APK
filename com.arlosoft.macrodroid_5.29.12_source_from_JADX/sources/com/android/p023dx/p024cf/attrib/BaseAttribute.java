package com.android.p023dx.p024cf.attrib;

import com.android.p023dx.p024cf.iface.Attribute;
import java.util.Objects;

/* renamed from: com.android.dx.cf.attrib.BaseAttribute */
public abstract class BaseAttribute implements Attribute {
    private final String name;

    public BaseAttribute(String str) {
        Objects.requireNonNull(str, "name == null");
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
