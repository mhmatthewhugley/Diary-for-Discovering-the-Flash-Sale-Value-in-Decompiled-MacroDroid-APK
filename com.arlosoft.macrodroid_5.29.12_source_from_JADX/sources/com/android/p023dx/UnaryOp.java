package com.android.p023dx;

import com.android.p023dx.rop.code.Rop;
import com.android.p023dx.rop.code.Rops;

/* renamed from: com.android.dx.UnaryOp */
public enum UnaryOp {
    NOT {
        /* access modifiers changed from: package-private */
        public Rop rop(TypeId<?> typeId) {
            return Rops.opNot(typeId.ropType);
        }
    },
    NEGATE {
        /* access modifiers changed from: package-private */
        public Rop rop(TypeId<?> typeId) {
            return Rops.opNeg(typeId.ropType);
        }
    };

    /* access modifiers changed from: package-private */
    public abstract Rop rop(TypeId<?> typeId);
}
