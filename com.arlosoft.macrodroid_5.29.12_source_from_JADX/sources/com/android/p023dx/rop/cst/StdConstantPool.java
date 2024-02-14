package com.android.p023dx.rop.cst;

import com.android.dex.util.ExceptionWithContext;
import com.android.p023dx.util.Hex;
import com.android.p023dx.util.MutabilityControl;

/* renamed from: com.android.dx.rop.cst.StdConstantPool */
public final class StdConstantPool extends MutabilityControl implements ConstantPool {
    private final Constant[] entries;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StdConstantPool(int i) {
        super(i > 1);
        if (i >= 1) {
            this.entries = new Constant[i];
            return;
        }
        throw new IllegalArgumentException("size < 1");
    }

    private static Constant throwInvalid(int i) {
        throw new ExceptionWithContext("invalid constant pool index " + Hex.m907u2(i));
    }

    public Constant get(int i) {
        try {
            Constant constant = this.entries[i];
            if (constant == null) {
                throwInvalid(i);
            }
            return constant;
        } catch (IndexOutOfBoundsException unused) {
            return throwInvalid(i);
        }
    }

    public Constant get0Ok(int i) {
        if (i == 0) {
            return null;
        }
        return get(i);
    }

    public Constant[] getEntries() {
        return this.entries;
    }

    public Constant getOrNull(int i) {
        try {
            return this.entries[i];
        } catch (IndexOutOfBoundsException unused) {
            return throwInvalid(i);
        }
    }

    public void set(int i, Constant constant) {
        int i2;
        Constant constant2;
        throwIfImmutable();
        boolean z = constant != null && constant.isCategory2();
        if (i >= 1) {
            if (z) {
                Constant[] constantArr = this.entries;
                if (i != constantArr.length - 1) {
                    constantArr[i + 1] = null;
                } else {
                    throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                }
            }
            if (constant != null) {
                Constant[] constantArr2 = this.entries;
                if (constantArr2[i] == null && (constant2 = constantArr2[i2]) != null && constant2.isCategory2()) {
                    this.entries[i - 1] = null;
                }
            }
            this.entries[i] = constant;
            return;
        }
        throw new IllegalArgumentException("n < 1");
    }

    public int size() {
        return this.entries.length;
    }
}
