package com.android.p023dx.util;

import java.util.Arrays;

/* renamed from: com.android.dx.util.IntList */
public final class IntList extends MutabilityControl {
    public static final IntList EMPTY;
    private int size;
    private boolean sorted;
    private int[] values;

    static {
        IntList intList = new IntList(0);
        EMPTY = intList;
        intList.setImmutable();
    }

    public IntList() {
        this(4);
    }

    private void growIfNeeded() {
        int i = this.size;
        int[] iArr = this.values;
        if (i == iArr.length) {
            int[] iArr2 = new int[(((i * 3) / 2) + 10)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.values = iArr2;
        }
    }

    public static IntList makeImmutable(int i) {
        IntList intList = new IntList(1);
        intList.add(i);
        intList.setImmutable();
        return intList;
    }

    public void add(int i) {
        throwIfImmutable();
        growIfNeeded();
        int[] iArr = this.values;
        int i2 = this.size;
        int i3 = i2 + 1;
        this.size = i3;
        iArr[i2] = i;
        if (this.sorted) {
            boolean z = true;
            if (i3 > 1) {
                if (i < iArr[i3 - 2]) {
                    z = false;
                }
                this.sorted = z;
            }
        }
    }

    public int binarysearch(int i) {
        int i2 = this.size;
        if (!this.sorted) {
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.values[i3] == i) {
                    return i3;
                }
            }
            return -i2;
        }
        int i4 = -1;
        int i5 = i2;
        while (i5 > i4 + 1) {
            int i6 = ((i5 - i4) >> 1) + i4;
            if (i <= this.values[i6]) {
                i5 = i6;
            } else {
                i4 = i6;
            }
        }
        if (i5 != i2) {
            return i == this.values[i5] ? i5 : (-i5) - 1;
        }
        return (-i2) - 1;
    }

    public boolean contains(int i) {
        return indexOf(i) >= 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntList)) {
            return false;
        }
        IntList intList = (IntList) obj;
        if (this.sorted != intList.sorted || this.size != intList.size) {
            return false;
        }
        for (int i = 0; i < this.size; i++) {
            if (this.values[i] != intList.values[i]) {
                return false;
            }
        }
        return true;
    }

    public int get(int i) {
        if (i < this.size) {
            try {
                return this.values[i];
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IndexOutOfBoundsException("n < 0");
            }
        } else {
            throw new IndexOutOfBoundsException("n >= size()");
        }
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + this.values[i2];
        }
        return i;
    }

    public int indexOf(int i) {
        int binarysearch = binarysearch(i);
        if (binarysearch >= 0) {
            return binarysearch;
        }
        return -1;
    }

    public void insert(int i, int i2) {
        if (i <= this.size) {
            growIfNeeded();
            int[] iArr = this.values;
            int i3 = i + 1;
            System.arraycopy(iArr, i, iArr, i3, this.size - i);
            int[] iArr2 = this.values;
            iArr2[i] = i2;
            boolean z = true;
            int i4 = this.size + 1;
            this.size = i4;
            if (!this.sorted || ((i != 0 && i2 <= iArr2[i - 1]) || (i != i4 - 1 && i2 >= iArr2[i3]))) {
                z = false;
            }
            this.sorted = z;
            return;
        }
        throw new IndexOutOfBoundsException("n > size()");
    }

    public IntList mutableCopy() {
        int i = this.size;
        IntList intList = new IntList(i);
        for (int i2 = 0; i2 < i; i2++) {
            intList.add(this.values[i2]);
        }
        return intList;
    }

    public int pop() {
        throwIfImmutable();
        this.size--;
        return get(this.size - 1);
    }

    public void removeIndex(int i) {
        int i2 = this.size;
        if (i < i2) {
            int[] iArr = this.values;
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
            this.size--;
            return;
        }
        throw new IndexOutOfBoundsException("n >= size()");
    }

    public void set(int i, int i2) {
        throwIfImmutable();
        if (i < this.size) {
            try {
                this.values[i] = i2;
                this.sorted = false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                if (i < 0) {
                    throw new IllegalArgumentException("n < 0");
                }
            }
        } else {
            throw new IndexOutOfBoundsException("n >= size()");
        }
    }

    public void shrink(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("newSize < 0");
        } else if (i <= this.size) {
            throwIfImmutable();
            this.size = i;
        } else {
            throw new IllegalArgumentException("newSize > size");
        }
    }

    public int size() {
        return this.size;
    }

    public void sort() {
        throwIfImmutable();
        if (!this.sorted) {
            Arrays.sort(this.values, 0, this.size);
            this.sorted = true;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer((this.size * 5) + 10);
        stringBuffer.append('{');
        for (int i = 0; i < this.size; i++) {
            if (i != 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(this.values[i]);
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public int top() {
        return get(this.size - 1);
    }

    public IntList(int i) {
        super(true);
        try {
            this.values = new int[i];
            this.size = 0;
            this.sorted = true;
        } catch (NegativeArraySizeException unused) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    public static IntList makeImmutable(int i, int i2) {
        IntList intList = new IntList(2);
        intList.add(i);
        intList.add(i2);
        intList.setImmutable();
        return intList;
    }

    public void pop(int i) {
        throwIfImmutable();
        this.size -= i;
    }
}
