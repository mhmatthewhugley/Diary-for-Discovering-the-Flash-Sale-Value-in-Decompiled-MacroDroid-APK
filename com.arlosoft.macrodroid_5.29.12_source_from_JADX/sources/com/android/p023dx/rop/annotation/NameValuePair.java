package com.android.p023dx.rop.annotation;

import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstString;
import java.util.Objects;

/* renamed from: com.android.dx.rop.annotation.NameValuePair */
public final class NameValuePair implements Comparable<NameValuePair> {
    private final CstString name;
    private final Constant value;

    public NameValuePair(CstString cstString, Constant constant) {
        Objects.requireNonNull(cstString, "name == null");
        Objects.requireNonNull(constant, "value == null");
        this.name = cstString;
        this.value = constant;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NameValuePair)) {
            return false;
        }
        NameValuePair nameValuePair = (NameValuePair) obj;
        if (!this.name.equals(nameValuePair.name) || !this.value.equals(nameValuePair.value)) {
            return false;
        }
        return true;
    }

    public CstString getName() {
        return this.name;
    }

    public Constant getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return this.name.toHuman() + ":" + this.value;
    }

    public int compareTo(NameValuePair nameValuePair) {
        int compareTo = this.name.compareTo((Constant) nameValuePair.name);
        if (compareTo != 0) {
            return compareTo;
        }
        return this.value.compareTo(nameValuePair.value);
    }
}
