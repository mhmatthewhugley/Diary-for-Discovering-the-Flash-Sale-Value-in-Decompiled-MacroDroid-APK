package com.android.p023dx.p024cf.code;

import com.android.p023dx.util.FixedSizeList;
import java.util.Objects;

/* renamed from: com.android.dx.cf.code.LineNumberList */
public final class LineNumberList extends FixedSizeList {
    public static final LineNumberList EMPTY = new LineNumberList(0);

    /* renamed from: com.android.dx.cf.code.LineNumberList$Item */
    public static class Item {
        private final int lineNumber;
        private final int startPc;

        public Item(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("startPc < 0");
            } else if (i2 >= 0) {
                this.startPc = i;
                this.lineNumber = i2;
            } else {
                throw new IllegalArgumentException("lineNumber < 0");
            }
        }

        public int getLineNumber() {
            return this.lineNumber;
        }

        public int getStartPc() {
            return this.startPc;
        }
    }

    public LineNumberList(int i) {
        super(i);
    }

    public static LineNumberList concat(LineNumberList lineNumberList, LineNumberList lineNumberList2) {
        if (lineNumberList == EMPTY) {
            return lineNumberList2;
        }
        int size = lineNumberList.size();
        int size2 = lineNumberList2.size();
        LineNumberList lineNumberList3 = new LineNumberList(size + size2);
        for (int i = 0; i < size; i++) {
            lineNumberList3.set(i, lineNumberList.get(i));
        }
        for (int i2 = 0; i2 < size2; i2++) {
            lineNumberList3.set(size + i2, lineNumberList2.get(i2));
        }
        return lineNumberList3;
    }

    public Item get(int i) {
        return (Item) get0(i);
    }

    public int pcToLine(int i) {
        int size = size();
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Item item = get(i4);
            int startPc = item.getStartPc();
            if (startPc <= i && startPc > i2) {
                i3 = item.getLineNumber();
                if (startPc == i) {
                    break;
                }
                i2 = startPc;
            }
        }
        return i3;
    }

    public void set(int i, Item item) {
        Objects.requireNonNull(item, "item == null");
        set0(i, item);
    }

    public void set(int i, int i2, int i3) {
        set0(i, new Item(i2, i3));
    }
}
