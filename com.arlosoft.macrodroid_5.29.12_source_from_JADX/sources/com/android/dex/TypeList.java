package com.android.dex;

import com.android.dex.util.Unsigned;

public final class TypeList implements Comparable<TypeList> {
    public static final TypeList EMPTY = new TypeList((Dex) null, Dex.EMPTY_SHORT_ARRAY);
    private final Dex dex;
    private final short[] types;

    public TypeList(Dex dex2, short[] sArr) {
        this.dex = dex2;
        this.types = sArr;
    }

    public short[] getTypes() {
        return this.types;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        int length = this.types.length;
        for (int i = 0; i < length; i++) {
            Dex dex2 = this.dex;
            sb.append(dex2 != null ? dex2.typeNames().get(this.types[i]) : Short.valueOf(this.types[i]));
        }
        sb.append(")");
        return sb.toString();
    }

    public int compareTo(TypeList typeList) {
        short[] sArr;
        int i = 0;
        while (true) {
            sArr = this.types;
            if (i >= sArr.length) {
                break;
            }
            short[] sArr2 = typeList.types;
            if (i >= sArr2.length) {
                break;
            } else if (sArr[i] != sArr2[i]) {
                return Unsigned.compare(sArr[i], sArr2[i]);
            } else {
                i++;
            }
        }
        return Unsigned.compare(sArr.length, typeList.types.length);
    }
}
