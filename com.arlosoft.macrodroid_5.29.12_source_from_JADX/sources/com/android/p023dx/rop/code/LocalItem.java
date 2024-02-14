package com.android.p023dx.rop.code;

import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstString;

/* renamed from: com.android.dx.rop.code.LocalItem */
public class LocalItem implements Comparable<LocalItem> {
    private final CstString name;
    private final CstString signature;

    private LocalItem(CstString cstString, CstString cstString2) {
        this.name = cstString;
        this.signature = cstString2;
    }

    private static int compareHandlesNulls(CstString cstString, CstString cstString2) {
        if (cstString == cstString2) {
            return 0;
        }
        if (cstString == null) {
            return -1;
        }
        if (cstString2 == null) {
            return 1;
        }
        return cstString.compareTo((Constant) cstString2);
    }

    public static LocalItem make(CstString cstString, CstString cstString2) {
        if (cstString == null && cstString2 == null) {
            return null;
        }
        return new LocalItem(cstString, cstString2);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof LocalItem) && compareTo((LocalItem) obj) == 0) {
            return true;
        }
        return false;
    }

    public CstString getName() {
        return this.name;
    }

    public CstString getSignature() {
        return this.signature;
    }

    public int hashCode() {
        CstString cstString = this.name;
        int i = 0;
        int hashCode = (cstString == null ? 0 : cstString.hashCode()) * 31;
        CstString cstString2 = this.signature;
        if (cstString2 != null) {
            i = cstString2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        CstString cstString = this.name;
        if (cstString != null && this.signature == null) {
            return cstString.toQuoted();
        }
        String str = "";
        if (cstString == null && this.signature == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        CstString cstString2 = this.name;
        sb.append(cstString2 == null ? str : cstString2.toQuoted());
        sb.append("|");
        CstString cstString3 = this.signature;
        if (cstString3 != null) {
            str = cstString3.toQuoted();
        }
        sb.append(str);
        return sb.toString();
    }

    public int compareTo(LocalItem localItem) {
        int compareHandlesNulls = compareHandlesNulls(this.name, localItem.name);
        if (compareHandlesNulls != 0) {
            return compareHandlesNulls;
        }
        return compareHandlesNulls(this.signature, localItem.signature);
    }
}
