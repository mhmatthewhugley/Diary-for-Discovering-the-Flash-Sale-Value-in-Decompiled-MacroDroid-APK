package com.android.p023dx.dex.code;

import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.SourcePosition;
import com.android.p023dx.rop.cst.Constant;
import java.util.Objects;

/* renamed from: com.android.dx.dex.code.CstInsn */
public final class CstInsn extends FixedSizeInsn {
    private int classIndex = -1;
    private final Constant constant;
    private int index = -1;

    public CstInsn(Dop dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, Constant constant2) {
        super(dop, sourcePosition, registerSpecList);
        Objects.requireNonNull(constant2, "constant == null");
        this.constant = constant2;
    }

    /* access modifiers changed from: protected */
    public String argString() {
        return this.constant.toHuman();
    }

    public int getClassIndex() {
        int i = this.classIndex;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("class index not yet set");
    }

    public Constant getConstant() {
        return this.constant;
    }

    public int getIndex() {
        int i = this.index;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("index not yet set for " + this.constant);
    }

    public boolean hasClassIndex() {
        return this.classIndex >= 0;
    }

    public boolean hasIndex() {
        return this.index >= 0;
    }

    public void setClassIndex(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        } else if (this.classIndex < 0) {
            this.classIndex = i;
        } else {
            throw new RuntimeException("class index already set");
        }
    }

    public void setIndex(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        } else if (this.index < 0) {
            this.index = i;
        } else {
            throw new RuntimeException("index already set");
        }
    }

    public DalvInsn withOpcode(Dop dop) {
        CstInsn cstInsn = new CstInsn(dop, getPosition(), getRegisters(), this.constant);
        int i = this.index;
        if (i >= 0) {
            cstInsn.setIndex(i);
        }
        int i2 = this.classIndex;
        if (i2 >= 0) {
            cstInsn.setClassIndex(i2);
        }
        return cstInsn;
    }

    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        CstInsn cstInsn = new CstInsn(getOpcode(), getPosition(), registerSpecList, this.constant);
        int i = this.index;
        if (i >= 0) {
            cstInsn.setIndex(i);
        }
        int i2 = this.classIndex;
        if (i2 >= 0) {
            cstInsn.setClassIndex(i2);
        }
        return cstInsn;
    }
}
