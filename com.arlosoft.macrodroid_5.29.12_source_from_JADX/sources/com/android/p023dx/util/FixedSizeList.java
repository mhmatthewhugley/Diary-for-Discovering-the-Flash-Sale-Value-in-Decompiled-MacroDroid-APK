package com.android.p023dx.util;

import java.util.Arrays;

/* renamed from: com.android.dx.util.FixedSizeList */
public class FixedSizeList extends MutabilityControl implements ToHuman {
    private Object[] arr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FixedSizeList(int i) {
        super(i != 0);
        try {
            this.arr = new Object[i];
        } catch (NegativeArraySizeException unused) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    private Object throwIndex(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("n < 0");
        }
        throw new IndexOutOfBoundsException("n >= size()");
    }

    private String toString0(String str, String str2, String str3, boolean z) {
        int length = this.arr.length;
        StringBuffer stringBuffer = new StringBuffer((length * 10) + 10);
        if (str != null) {
            stringBuffer.append(str);
        }
        for (int i = 0; i < length; i++) {
            if (!(i == 0 || str2 == null)) {
                stringBuffer.append(str2);
            }
            if (z) {
                stringBuffer.append(((ToHuman) this.arr[i]).toHuman());
            } else {
                stringBuffer.append(this.arr[i]);
            }
        }
        if (str3 != null) {
            stringBuffer.append(str3);
        }
        return stringBuffer.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.arr, ((FixedSizeList) obj).arr);
    }

    /* access modifiers changed from: protected */
    public final Object get0(int i) {
        try {
            Object obj = this.arr[i];
            if (obj != null) {
                return obj;
            }
            throw new NullPointerException("unset: " + i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            return throwIndex(i);
        }
    }

    /* access modifiers changed from: protected */
    public final Object getOrNull0(int i) {
        return this.arr[i];
    }

    public int hashCode() {
        return Arrays.hashCode(this.arr);
    }

    /* access modifiers changed from: protected */
    public final void set0(int i, Object obj) {
        throwIfImmutable();
        try {
            this.arr[i] = obj;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throwIndex(i);
        }
    }

    public void shrinkToFit() {
        int i = 0;
        for (Object obj : this.arr) {
            if (obj != null) {
                i++;
            }
        }
        if (r0 != i) {
            throwIfImmutable();
            Object[] objArr = new Object[i];
            int i2 = 0;
            for (Object obj2 : this.arr) {
                if (obj2 != null) {
                    objArr[i2] = obj2;
                    i2++;
                }
            }
            this.arr = objArr;
            if (i == 0) {
                setImmutable();
            }
        }
    }

    public final int size() {
        return this.arr.length;
    }

    public String toHuman() {
        String name = getClass().getName();
        return toString0(name.substring(name.lastIndexOf(46) + 1) + '{', ", ", "}", true);
    }

    public String toString() {
        String name = getClass().getName();
        return toString0(name.substring(name.lastIndexOf(46) + 1) + '{', ", ", "}", false);
    }

    public String toHuman(String str, String str2, String str3) {
        return toString0(str, str2, str3, true);
    }

    public String toString(String str, String str2, String str3) {
        return toString0(str, str2, str3, false);
    }
}
