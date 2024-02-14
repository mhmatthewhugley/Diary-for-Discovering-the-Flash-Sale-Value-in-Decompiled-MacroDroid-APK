package com.android.p023dx.dex.code;

import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.util.FixedSizeList;
import com.android.p023dx.util.Hex;
import java.util.Objects;

/* renamed from: com.android.dx.dex.code.CatchHandlerList */
public final class CatchHandlerList extends FixedSizeList implements Comparable<CatchHandlerList> {
    public static final CatchHandlerList EMPTY = new CatchHandlerList(0);

    /* renamed from: com.android.dx.dex.code.CatchHandlerList$Entry */
    public static class Entry implements Comparable<Entry> {
        private final CstType exceptionType;
        private final int handler;

        public Entry(CstType cstType, int i) {
            if (i >= 0) {
                Objects.requireNonNull(cstType, "exceptionType == null");
                this.handler = i;
                this.exceptionType = cstType;
                return;
            }
            throw new IllegalArgumentException("handler < 0");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Entry) || compareTo((Entry) obj) != 0) {
                return false;
            }
            return true;
        }

        public CstType getExceptionType() {
            return this.exceptionType;
        }

        public int getHandler() {
            return this.handler;
        }

        public int hashCode() {
            return (this.handler * 31) + this.exceptionType.hashCode();
        }

        public int compareTo(Entry entry) {
            int i = this.handler;
            int i2 = entry.handler;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            return this.exceptionType.compareTo((Constant) entry.exceptionType);
        }
    }

    public CatchHandlerList(int i) {
        super(i);
    }

    public boolean catchesAll() {
        int size = size();
        if (size == 0) {
            return false;
        }
        return get(size - 1).getExceptionType().equals(CstType.OBJECT);
    }

    public Entry get(int i) {
        return (Entry) get0(i);
    }

    public void set(int i, CstType cstType, int i2) {
        set0(i, new Entry(cstType, i2));
    }

    public String toHuman() {
        return toHuman("", "");
    }

    public int compareTo(CatchHandlerList catchHandlerList) {
        if (this == catchHandlerList) {
            return 0;
        }
        int size = size();
        int size2 = catchHandlerList.size();
        int min = Math.min(size, size2);
        for (int i = 0; i < min; i++) {
            int compareTo = get(i).compareTo(catchHandlerList.get(i));
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

    public void set(int i, Entry entry) {
        set0(i, entry);
    }

    public String toHuman(String str, String str2) {
        StringBuilder sb = new StringBuilder(100);
        int size = size();
        sb.append(str);
        sb.append(str2);
        sb.append("catch ");
        for (int i = 0; i < size; i++) {
            Entry entry = get(i);
            if (i != 0) {
                sb.append(",\n");
                sb.append(str);
                sb.append("  ");
            }
            if (i != size - 1 || !catchesAll()) {
                sb.append(entry.getExceptionType().toHuman());
            } else {
                sb.append("<any>");
            }
            sb.append(" -> ");
            sb.append(Hex.u2or4(entry.getHandler()));
        }
        return sb.toString();
    }
}
