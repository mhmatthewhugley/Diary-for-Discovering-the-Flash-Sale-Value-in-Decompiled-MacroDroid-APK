package com.android.p023dx.rop.cst;

import java.util.Objects;
import org.apache.commons.p353io.FilenameUtils;

/* renamed from: com.android.dx.rop.cst.CstMemberRef */
public abstract class CstMemberRef extends TypedConstant {
    private final CstType definingClass;
    private final CstNat nat;

    CstMemberRef(CstType cstType, CstNat cstNat) {
        Objects.requireNonNull(cstType, "definingClass == null");
        Objects.requireNonNull(cstNat, "nat == null");
        this.definingClass = cstType;
        this.nat = cstNat;
    }

    /* access modifiers changed from: protected */
    public int compareTo0(Constant constant) {
        CstMemberRef cstMemberRef = (CstMemberRef) constant;
        int compareTo = this.definingClass.compareTo((Constant) cstMemberRef.definingClass);
        if (compareTo != 0) {
            return compareTo;
        }
        return this.nat.getName().compareTo((Constant) cstMemberRef.nat.getName());
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CstMemberRef cstMemberRef = (CstMemberRef) obj;
        if (!this.definingClass.equals(cstMemberRef.definingClass) || !this.nat.equals(cstMemberRef.nat)) {
            return false;
        }
        return true;
    }

    public final CstType getDefiningClass() {
        return this.definingClass;
    }

    public final CstNat getNat() {
        return this.nat;
    }

    public final int hashCode() {
        return (this.definingClass.hashCode() * 31) ^ this.nat.hashCode();
    }

    public final boolean isCategory2() {
        return false;
    }

    public final String toHuman() {
        return this.definingClass.toHuman() + FilenameUtils.EXTENSION_SEPARATOR + this.nat.toHuman();
    }

    public final String toString() {
        return typeName() + '{' + toHuman() + '}';
    }
}
