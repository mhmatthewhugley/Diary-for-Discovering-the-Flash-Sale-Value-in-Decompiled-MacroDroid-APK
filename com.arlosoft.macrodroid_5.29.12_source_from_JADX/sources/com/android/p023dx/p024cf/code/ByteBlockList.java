package com.android.p023dx.p024cf.code;

import com.android.p023dx.util.Hex;
import com.android.p023dx.util.LabeledList;

/* renamed from: com.android.dx.cf.code.ByteBlockList */
public final class ByteBlockList extends LabeledList {
    public ByteBlockList(int i) {
        super(i);
    }

    public ByteBlock get(int i) {
        return (ByteBlock) get0(i);
    }

    public ByteBlock labelToBlock(int i) {
        int indexOfLabel = indexOfLabel(i);
        if (indexOfLabel >= 0) {
            return get(indexOfLabel);
        }
        throw new IllegalArgumentException("no such label: " + Hex.m907u2(i));
    }

    public void set(int i, ByteBlock byteBlock) {
        super.set(i, byteBlock);
    }
}
