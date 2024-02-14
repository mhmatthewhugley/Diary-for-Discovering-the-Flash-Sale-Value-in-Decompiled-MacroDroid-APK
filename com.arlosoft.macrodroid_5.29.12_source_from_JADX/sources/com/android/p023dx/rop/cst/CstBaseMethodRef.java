package com.android.p023dx.rop.cst;

import com.android.p023dx.rop.type.Prototype;
import com.android.p023dx.rop.type.Type;

/* renamed from: com.android.dx.rop.cst.CstBaseMethodRef */
public abstract class CstBaseMethodRef extends CstMemberRef {
    private Prototype instancePrototype = null;
    private final Prototype prototype = Prototype.intern(getNat().getDescriptor().getString());

    CstBaseMethodRef(CstType cstType, CstNat cstNat) {
        super(cstType, cstNat);
    }

    /* access modifiers changed from: protected */
    public final int compareTo0(Constant constant) {
        int compareTo0 = super.compareTo0(constant);
        if (compareTo0 != 0) {
            return compareTo0;
        }
        return this.prototype.compareTo(((CstBaseMethodRef) constant).prototype);
    }

    public final int getParameterWordCount(boolean z) {
        return getPrototype(z).getParameterTypes().getWordCount();
    }

    public final Prototype getPrototype() {
        return this.prototype;
    }

    public final Type getType() {
        return this.prototype.getReturnType();
    }

    public final boolean isClassInit() {
        return getNat().isClassInit();
    }

    public final boolean isInstanceInit() {
        return getNat().isInstanceInit();
    }

    public final Prototype getPrototype(boolean z) {
        if (z) {
            return this.prototype;
        }
        if (this.instancePrototype == null) {
            this.instancePrototype = this.prototype.withFirstParameter(getDefiningClass().getClassType());
        }
        return this.instancePrototype;
    }
}
