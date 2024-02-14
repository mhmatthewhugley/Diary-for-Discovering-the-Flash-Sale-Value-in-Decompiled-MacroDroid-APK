package com.android.p023dx.util;

import java.util.NoSuchElementException;

/* renamed from: com.android.dx.util.BitIntSet */
public class BitIntSet implements IntSet {
    int[] bits;

    public BitIntSet(int i) {
        this.bits = Bits.makeBitSet(i);
    }

    private void ensureCapacity(int i) {
        if (i >= Bits.getMax(this.bits)) {
            int[] makeBitSet = Bits.makeBitSet(Math.max(i + 1, Bits.getMax(this.bits) * 2));
            int[] iArr = this.bits;
            System.arraycopy(iArr, 0, makeBitSet, 0, iArr.length);
            this.bits = makeBitSet;
        }
    }

    public void add(int i) {
        ensureCapacity(i);
        Bits.set(this.bits, i, true);
    }

    public int elements() {
        return Bits.bitCount(this.bits);
    }

    public boolean has(int i) {
        return i < Bits.getMax(this.bits) && Bits.get(this.bits, i);
    }

    public IntIterator iterator() {
        return new IntIterator() {
            private int idx;

            {
                this.idx = Bits.findFirst(BitIntSet.this.bits, 0);
            }

            public boolean hasNext() {
                return this.idx >= 0;
            }

            public int next() {
                if (hasNext()) {
                    int i = this.idx;
                    this.idx = Bits.findFirst(BitIntSet.this.bits, i + 1);
                    return i;
                }
                throw new NoSuchElementException();
            }
        };
    }

    public void merge(IntSet intSet) {
        if (intSet instanceof BitIntSet) {
            BitIntSet bitIntSet = (BitIntSet) intSet;
            ensureCapacity(Bits.getMax(bitIntSet.bits) + 1);
            Bits.m901or(this.bits, bitIntSet.bits);
        } else if (intSet instanceof ListIntSet) {
            ListIntSet listIntSet = (ListIntSet) intSet;
            int size = listIntSet.ints.size();
            if (size > 0) {
                ensureCapacity(listIntSet.ints.get(size - 1));
            }
            for (int i = 0; i < listIntSet.ints.size(); i++) {
                Bits.set(this.bits, listIntSet.ints.get(i), true);
            }
        } else {
            IntIterator it = intSet.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
        }
    }

    public void remove(int i) {
        if (i < Bits.getMax(this.bits)) {
            Bits.set(this.bits, i, false);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        int findFirst = Bits.findFirst(this.bits, 0);
        boolean z = true;
        while (findFirst >= 0) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(findFirst);
            findFirst = Bits.findFirst(this.bits, findFirst + 1);
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
