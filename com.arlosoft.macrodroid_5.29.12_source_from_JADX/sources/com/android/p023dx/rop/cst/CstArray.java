package com.android.p023dx.rop.cst;

import com.android.p023dx.util.FixedSizeList;
import java.util.Objects;

/* renamed from: com.android.dx.rop.cst.CstArray */
public final class CstArray extends Constant {
    private final List list;

    /* renamed from: com.android.dx.rop.cst.CstArray$List */
    public static final class List extends FixedSizeList implements Comparable<List> {
        public List(int i) {
            super(i);
        }

        public Constant get(int i) {
            return (Constant) get0(i);
        }

        public void set(int i, Constant constant) {
            set0(i, constant);
        }

        public int compareTo(List list) {
            int size = size();
            int size2 = list.size();
            int i = size < size2 ? size : size2;
            for (int i2 = 0; i2 < i; i2++) {
                int compareTo = ((Constant) get0(i2)).compareTo((Constant) list.get0(i2));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            if (size < size2) {
                return -1;
            }
            if (size > size2) {
                return 1;
            }
            return 0;
        }
    }

    public CstArray(List list2) {
        Objects.requireNonNull(list2, "list == null");
        list2.throwIfMutable();
        this.list = list2;
    }

    /* access modifiers changed from: protected */
    public int compareTo0(Constant constant) {
        return this.list.compareTo(((CstArray) constant).list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CstArray)) {
            return false;
        }
        return this.list.equals(((CstArray) obj).list);
    }

    public List getList() {
        return this.list;
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    public boolean isCategory2() {
        return false;
    }

    public String toHuman() {
        return this.list.toHuman("{", ", ", "}");
    }

    public String toString() {
        return this.list.toString("array{", ", ", "}");
    }

    public String typeName() {
        return "array";
    }
}
