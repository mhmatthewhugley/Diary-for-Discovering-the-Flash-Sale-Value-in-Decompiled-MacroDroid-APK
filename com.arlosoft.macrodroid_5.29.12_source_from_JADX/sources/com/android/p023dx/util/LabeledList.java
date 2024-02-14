package com.android.p023dx.util;

import java.util.Arrays;

/* renamed from: com.android.dx.util.LabeledList */
public class LabeledList extends FixedSizeList {
    private final IntList labelToIndex;

    public LabeledList(int i) {
        super(i);
        this.labelToIndex = new IntList(i);
    }

    private void addLabelIndex(int i, int i2) {
        int size = this.labelToIndex.size();
        for (int i3 = 0; i3 <= i - size; i3++) {
            this.labelToIndex.add(-1);
        }
        this.labelToIndex.set(i, i2);
    }

    private void rebuildLabelToIndex() {
        int size = size();
        for (int i = 0; i < size; i++) {
            LabeledItem labeledItem = (LabeledItem) get0(i);
            if (labeledItem != null) {
                this.labelToIndex.set(labeledItem.getLabel(), i);
            }
        }
    }

    private void removeLabel(int i) {
        this.labelToIndex.set(i, -1);
    }

    public final int[] getLabelsInOrder() {
        int size = size();
        int[] iArr = new int[size];
        int i = 0;
        while (i < size) {
            LabeledItem labeledItem = (LabeledItem) get0(i);
            if (labeledItem != null) {
                iArr[i] = labeledItem.getLabel();
                i++;
            } else {
                throw new NullPointerException("null at index " + i);
            }
        }
        Arrays.sort(iArr);
        return iArr;
    }

    public final int getMaxLabel() {
        int size = this.labelToIndex.size() - 1;
        while (size >= 0 && this.labelToIndex.get(size) < 0) {
            size--;
        }
        int i = size + 1;
        this.labelToIndex.shrink(i);
        return i;
    }

    public final int indexOfLabel(int i) {
        if (i >= this.labelToIndex.size()) {
            return -1;
        }
        return this.labelToIndex.get(i);
    }

    /* access modifiers changed from: protected */
    public void set(int i, LabeledItem labeledItem) {
        LabeledItem labeledItem2 = (LabeledItem) getOrNull0(i);
        set0(i, labeledItem);
        if (labeledItem2 != null) {
            removeLabel(labeledItem2.getLabel());
        }
        if (labeledItem != null) {
            addLabelIndex(labeledItem.getLabel(), i);
        }
    }

    public void shrinkToFit() {
        super.shrinkToFit();
        rebuildLabelToIndex();
    }

    public LabeledList(LabeledList labeledList) {
        super(labeledList.size());
        this.labelToIndex = labeledList.labelToIndex.mutableCopy();
        int size = labeledList.size();
        for (int i = 0; i < size; i++) {
            Object r2 = labeledList.get0(i);
            if (r2 != null) {
                set0(i, r2);
            }
        }
    }
}
