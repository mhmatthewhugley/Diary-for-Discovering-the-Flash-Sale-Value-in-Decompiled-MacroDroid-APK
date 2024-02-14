package com.android.p023dx.p024cf.code;

import com.android.p023dx.util.IntList;
import com.android.p023dx.util.MutabilityControl;

/* renamed from: com.android.dx.cf.code.SwitchList */
public final class SwitchList extends MutabilityControl {
    private int size;
    private final IntList targets;
    private final IntList values;

    public SwitchList(int i) {
        super(true);
        this.values = new IntList(i);
        this.targets = new IntList(i + 1);
        this.size = i;
    }

    public void add(int i, int i2) {
        throwIfImmutable();
        if (i2 >= 0) {
            this.values.add(i);
            this.targets.add(i2);
            return;
        }
        throw new IllegalArgumentException("target < 0");
    }

    public int getDefaultTarget() {
        return this.targets.get(this.size);
    }

    public int getTarget(int i) {
        return this.targets.get(i);
    }

    public IntList getTargets() {
        return this.targets;
    }

    public int getValue(int i) {
        return this.values.get(i);
    }

    public IntList getValues() {
        return this.values;
    }

    public void removeSuperfluousDefaults() {
        throwIfImmutable();
        int i = this.size;
        if (i == this.targets.size() - 1) {
            int i2 = this.targets.get(i);
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = this.targets.get(i4);
                if (i5 != i2) {
                    if (i4 != i3) {
                        this.targets.set(i3, i5);
                        IntList intList = this.values;
                        intList.set(i3, intList.get(i4));
                    }
                    i3++;
                }
            }
            if (i3 != i) {
                this.values.shrink(i3);
                this.targets.set(i3, i2);
                this.targets.shrink(i3 + 1);
                this.size = i3;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("incomplete instance");
    }

    public void setDefaultTarget(int i) {
        throwIfImmutable();
        if (i < 0) {
            throw new IllegalArgumentException("target < 0");
        } else if (this.targets.size() == this.size) {
            this.targets.add(i);
        } else {
            throw new RuntimeException("non-default elements not all set");
        }
    }

    public void setImmutable() {
        this.values.setImmutable();
        this.targets.setImmutable();
        super.setImmutable();
    }

    public int size() {
        return this.size;
    }
}
