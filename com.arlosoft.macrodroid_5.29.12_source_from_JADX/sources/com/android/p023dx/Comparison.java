package com.android.p023dx;

import com.android.p023dx.rop.code.Rop;
import com.android.p023dx.rop.code.Rops;
import com.android.p023dx.rop.type.TypeList;

/* renamed from: com.android.dx.Comparison */
public enum Comparison {
    LT {
        /* access modifiers changed from: package-private */
        public Rop rop(TypeList typeList) {
            return Rops.opIfLt(typeList);
        }
    },
    LE {
        /* access modifiers changed from: package-private */
        public Rop rop(TypeList typeList) {
            return Rops.opIfLe(typeList);
        }
    },
    EQ {
        /* access modifiers changed from: package-private */
        public Rop rop(TypeList typeList) {
            return Rops.opIfEq(typeList);
        }
    },
    GE {
        /* access modifiers changed from: package-private */
        public Rop rop(TypeList typeList) {
            return Rops.opIfGe(typeList);
        }
    },
    GT {
        /* access modifiers changed from: package-private */
        public Rop rop(TypeList typeList) {
            return Rops.opIfGt(typeList);
        }
    },
    NE {
        /* access modifiers changed from: package-private */
        public Rop rop(TypeList typeList) {
            return Rops.opIfNe(typeList);
        }
    };

    /* access modifiers changed from: package-private */
    public abstract Rop rop(TypeList typeList);
}
