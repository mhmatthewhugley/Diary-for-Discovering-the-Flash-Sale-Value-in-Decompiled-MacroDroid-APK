package com.android.p023dx.p024cf.code;

import com.android.p023dx.util.Hex;
import com.android.p023dx.util.IntList;
import com.android.p023dx.util.LabeledItem;
import java.util.Objects;

/* renamed from: com.android.dx.cf.code.ByteBlock */
public final class ByteBlock implements LabeledItem {
    private final ByteCatchList catches;
    private final int end;
    private final int label;
    private final int start;
    private final IntList successors;

    public ByteBlock(int i, int i2, int i3, IntList intList, ByteCatchList byteCatchList) {
        if (i < 0) {
            throw new IllegalArgumentException("label < 0");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("start < 0");
        } else if (i3 > i2) {
            Objects.requireNonNull(intList, "targets == null");
            int size = intList.size();
            int i4 = 0;
            while (i4 < size) {
                if (intList.get(i4) >= 0) {
                    i4++;
                } else {
                    throw new IllegalArgumentException("successors[" + i4 + "] == " + intList.get(i4));
                }
            }
            Objects.requireNonNull(byteCatchList, "catches == null");
            this.label = i;
            this.start = i2;
            this.end = i3;
            this.successors = intList;
            this.catches = byteCatchList;
        } else {
            throw new IllegalArgumentException("end <= start");
        }
    }

    public ByteCatchList getCatches() {
        return this.catches;
    }

    public int getEnd() {
        return this.end;
    }

    public int getLabel() {
        return this.label;
    }

    public int getStart() {
        return this.start;
    }

    public IntList getSuccessors() {
        return this.successors;
    }

    public String toString() {
        return '{' + Hex.m907u2(this.label) + ": " + Hex.m907u2(this.start) + ".." + Hex.m907u2(this.end) + '}';
    }
}
