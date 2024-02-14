package com.android.p023dx;

import com.android.p023dx.rop.code.Rop;
import com.android.p023dx.rop.code.Rops;
import com.android.p023dx.rop.type.TypeList;

/* renamed from: com.android.dx.BinaryOp */
public enum BinaryOp {
    ADD {
        /* access modifiers changed from: package-private */
        public Rop rop(TypeList typeList) {
            return Rops.opAdd(typeList);
        }
    },
    SUBTRACT {
        /* access modifiers changed from: package-private */
        public Rop rop(TypeList typeList) {
            return Rops.opSub(typeList);
        }
    },
    MULTIPLY {
        /* access modifiers changed from: package-private */
        public Rop rop(TypeList typeList) {
            return Rops.opMul(typeList);
        }
    },
    DIVIDE {
        /* access modifiers changed from: package-private */
        public Rop rop(TypeList typeList) {
            return Rops.opDiv(typeList);
        }
    },
    REMAINDER {
        /* access modifiers changed from: package-private */
        public Rop rop(TypeList typeList) {
            return Rops.opRem(typeList);
        }
    },
    AND {
        /* access modifiers changed from: package-private */
        public Rop rop(TypeList typeList) {
            return Rops.opAnd(typeList);
        }
    },
    OR {
        /* access modifiers changed from: package-private */
        public Rop rop(TypeList typeList) {
            return Rops.opOr(typeList);
        }
    },
    XOR {
        /* access modifiers changed from: package-private */
        public Rop rop(TypeList typeList) {
            return Rops.opXor(typeList);
        }
    },
    SHIFT_LEFT {
        /* access modifiers changed from: package-private */
        public Rop rop(TypeList typeList) {
            return Rops.opShl(typeList);
        }
    },
    SHIFT_RIGHT {
        /* access modifiers changed from: package-private */
        public Rop rop(TypeList typeList) {
            return Rops.opShr(typeList);
        }
    },
    UNSIGNED_SHIFT_RIGHT {
        /* access modifiers changed from: package-private */
        public Rop rop(TypeList typeList) {
            return Rops.opUshr(typeList);
        }
    };

    /* access modifiers changed from: package-private */
    public abstract Rop rop(TypeList typeList);
}
