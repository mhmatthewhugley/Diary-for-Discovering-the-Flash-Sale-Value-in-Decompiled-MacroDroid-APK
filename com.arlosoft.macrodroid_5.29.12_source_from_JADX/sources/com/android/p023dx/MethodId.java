package com.android.p023dx;

import com.android.p023dx.rop.cst.CstMethodRef;
import com.android.p023dx.rop.cst.CstNat;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.type.Prototype;
import java.util.List;

/* renamed from: com.android.dx.MethodId */
public final class MethodId<D, R> {
    final CstMethodRef constant;
    final TypeId<D> declaringType;
    final String name;
    final CstNat nat;
    final TypeList parameters;
    final TypeId<R> returnType;

    MethodId(TypeId<D> typeId, TypeId<R> typeId2, String str, TypeList typeList) {
        if (typeId == null || typeId2 == null || str == null || typeList == null) {
            throw null;
        }
        this.declaringType = typeId;
        this.returnType = typeId2;
        this.name = str;
        this.parameters = typeList;
        CstNat cstNat = new CstNat(new CstString(str), new CstString(descriptor(false)));
        this.nat = cstNat;
        this.constant = new CstMethodRef(typeId.constant, cstNat);
    }

    /* access modifiers changed from: package-private */
    public String descriptor(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        if (z) {
            sb.append(this.declaringType.name);
        }
        for (TypeId<?> typeId : this.parameters.types) {
            sb.append(typeId.name);
        }
        sb.append(")");
        sb.append(this.returnType.name);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof MethodId) {
            MethodId methodId = (MethodId) obj;
            return methodId.declaringType.equals(this.declaringType) && methodId.name.equals(this.name) && methodId.parameters.equals(this.parameters) && methodId.returnType.equals(this.returnType);
        }
    }

    public TypeId<D> getDeclaringType() {
        return this.declaringType;
    }

    public String getName() {
        return this.name;
    }

    public List<TypeId<?>> getParameters() {
        return this.parameters.asList();
    }

    public TypeId<R> getReturnType() {
        return this.returnType;
    }

    public int hashCode() {
        return ((((((527 + this.declaringType.hashCode()) * 31) + this.name.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.returnType.hashCode();
    }

    public boolean isConstructor() {
        return this.name.equals("<init>");
    }

    public boolean isStaticInitializer() {
        return this.name.equals("<clinit>");
    }

    /* access modifiers changed from: package-private */
    public Prototype prototype(boolean z) {
        return Prototype.intern(descriptor(z));
    }

    public String toString() {
        return this.declaringType + "." + this.name + "(" + this.parameters + ")";
    }
}
