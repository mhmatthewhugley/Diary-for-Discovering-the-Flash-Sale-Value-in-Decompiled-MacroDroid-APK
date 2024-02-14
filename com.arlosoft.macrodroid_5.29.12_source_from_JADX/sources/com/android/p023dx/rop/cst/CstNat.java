package com.android.p023dx.rop.cst;

import com.android.p023dx.rop.type.Type;
import java.util.Objects;

/* renamed from: com.android.dx.rop.cst.CstNat */
public final class CstNat extends Constant {
    public static final CstNat PRIMITIVE_TYPE_NAT = new CstNat(new CstString("TYPE"), new CstString("Ljava/lang/Class;"));
    private final CstString descriptor;
    private final CstString name;

    public CstNat(CstString cstString, CstString cstString2) {
        Objects.requireNonNull(cstString, "name == null");
        Objects.requireNonNull(cstString2, "descriptor == null");
        this.name = cstString;
        this.descriptor = cstString2;
    }

    /* access modifiers changed from: protected */
    public int compareTo0(Constant constant) {
        CstNat cstNat = (CstNat) constant;
        int compareTo = this.name.compareTo((Constant) cstNat.name);
        if (compareTo != 0) {
            return compareTo;
        }
        return this.descriptor.compareTo((Constant) cstNat.descriptor);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CstNat)) {
            return false;
        }
        CstNat cstNat = (CstNat) obj;
        if (!this.name.equals(cstNat.name) || !this.descriptor.equals(cstNat.descriptor)) {
            return false;
        }
        return true;
    }

    public CstString getDescriptor() {
        return this.descriptor;
    }

    public Type getFieldType() {
        return Type.intern(this.descriptor.getString());
    }

    public CstString getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) ^ this.descriptor.hashCode();
    }

    public boolean isCategory2() {
        return false;
    }

    public final boolean isClassInit() {
        return this.name.getString().equals("<clinit>");
    }

    public final boolean isInstanceInit() {
        return this.name.getString().equals("<init>");
    }

    public String toHuman() {
        return this.name.toHuman() + ':' + this.descriptor.toHuman();
    }

    public String toString() {
        return "nat{" + toHuman() + '}';
    }

    public String typeName() {
        return "nat";
    }
}
