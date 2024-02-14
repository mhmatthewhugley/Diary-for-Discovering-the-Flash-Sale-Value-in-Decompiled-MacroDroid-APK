package com.android.p023dx.rop.code;

import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.rop.type.TypeBearer;
import com.android.p023dx.util.ToHuman;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.android.dx.rop.code.RegisterSpec */
public final class RegisterSpec implements TypeBearer, ToHuman, Comparable<RegisterSpec> {
    public static final String PREFIX = "v";
    private static final ForComparison theInterningItem = new ForComparison();
    private static final HashMap<Object, RegisterSpec> theInterns = new HashMap<>(1000);
    private final LocalItem local;
    private final int reg;
    private final TypeBearer type;

    /* renamed from: com.android.dx.rop.code.RegisterSpec$ForComparison */
    private static class ForComparison {
        /* access modifiers changed from: private */
        public LocalItem local;
        /* access modifiers changed from: private */
        public int reg;
        /* access modifiers changed from: private */
        public TypeBearer type;

        private ForComparison() {
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof RegisterSpec)) {
                return false;
            }
            return ((RegisterSpec) obj).equals(this.reg, this.type, this.local);
        }

        public int hashCode() {
            return RegisterSpec.hashCodeOf(this.reg, this.type, this.local);
        }

        public void set(int i, TypeBearer typeBearer, LocalItem localItem) {
            this.reg = i;
            this.type = typeBearer;
            this.local = localItem;
        }

        public RegisterSpec toRegisterSpec() {
            return new RegisterSpec(this.reg, this.type, this.local);
        }
    }

    /* access modifiers changed from: private */
    public static int hashCodeOf(int i, TypeBearer typeBearer, LocalItem localItem) {
        return ((((localItem != null ? localItem.hashCode() : 0) * 31) + typeBearer.hashCode()) * 31) + i;
    }

    private static RegisterSpec intern(int i, TypeBearer typeBearer, LocalItem localItem) {
        HashMap<Object, RegisterSpec> hashMap = theInterns;
        synchronized (hashMap) {
            ForComparison forComparison = theInterningItem;
            forComparison.set(i, typeBearer, localItem);
            RegisterSpec registerSpec = hashMap.get(forComparison);
            if (registerSpec != null) {
                return registerSpec;
            }
            RegisterSpec registerSpec2 = forComparison.toRegisterSpec();
            hashMap.put(registerSpec2, registerSpec2);
            return registerSpec2;
        }
    }

    public static RegisterSpec make(int i, TypeBearer typeBearer) {
        return intern(i, typeBearer, (LocalItem) null);
    }

    public static RegisterSpec makeLocalOptional(int i, TypeBearer typeBearer, LocalItem localItem) {
        return intern(i, typeBearer, localItem);
    }

    public static String regString(int i) {
        return PREFIX + i;
    }

    private String toString0(boolean z) {
        StringBuffer stringBuffer = new StringBuffer(40);
        stringBuffer.append(regString());
        stringBuffer.append(":");
        LocalItem localItem = this.local;
        if (localItem != null) {
            stringBuffer.append(localItem.toString());
        }
        Type type2 = this.type.getType();
        stringBuffer.append(type2);
        if (type2 != this.type) {
            stringBuffer.append("=");
            if (z) {
                TypeBearer typeBearer = this.type;
                if (typeBearer instanceof CstString) {
                    stringBuffer.append(((CstString) typeBearer).toQuoted());
                }
            }
            if (z) {
                TypeBearer typeBearer2 = this.type;
                if (typeBearer2 instanceof Constant) {
                    stringBuffer.append(typeBearer2.toHuman());
                }
            }
            stringBuffer.append(this.type);
        }
        return stringBuffer.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof RegisterSpec) {
            RegisterSpec registerSpec = (RegisterSpec) obj;
            return equals(registerSpec.reg, registerSpec.type, registerSpec.local);
        } else if (!(obj instanceof ForComparison)) {
            return false;
        } else {
            ForComparison forComparison = (ForComparison) obj;
            return equals(forComparison.reg, forComparison.type, forComparison.local);
        }
    }

    public boolean equalsUsingSimpleType(RegisterSpec registerSpec) {
        if (matchesVariable(registerSpec) && this.reg == registerSpec.reg) {
            return true;
        }
        return false;
    }

    public final int getBasicFrameType() {
        return this.type.getBasicFrameType();
    }

    public final int getBasicType() {
        return this.type.getBasicType();
    }

    public int getCategory() {
        return this.type.getType().getCategory();
    }

    public TypeBearer getFrameType() {
        return this.type.getFrameType();
    }

    public LocalItem getLocalItem() {
        return this.local;
    }

    public int getNextReg() {
        return this.reg + getCategory();
    }

    public int getReg() {
        return this.reg;
    }

    public Type getType() {
        return this.type.getType();
    }

    public TypeBearer getTypeBearer() {
        return this.type;
    }

    public int hashCode() {
        return hashCodeOf(this.reg, this.type, this.local);
    }

    public RegisterSpec intersect(RegisterSpec registerSpec, boolean z) {
        TypeBearer type2;
        if (this == registerSpec) {
            return this;
        }
        if (registerSpec == null || this.reg != registerSpec.getReg()) {
            return null;
        }
        LocalItem localItem = this.local;
        LocalItem localItem2 = (localItem == null || !localItem.equals(registerSpec.getLocalItem())) ? null : this.local;
        boolean z2 = localItem2 == this.local;
        if ((z && !z2) || (type2 = getType()) != registerSpec.getType()) {
            return null;
        }
        if (this.type.equals(registerSpec.getTypeBearer())) {
            type2 = this.type;
        }
        if (type2 == this.type && z2) {
            return this;
        }
        int i = this.reg;
        if (localItem2 == null) {
            return make(i, type2);
        }
        return make(i, type2, localItem2);
    }

    public boolean isCategory1() {
        return this.type.getType().isCategory1();
    }

    public boolean isCategory2() {
        return this.type.getType().isCategory2();
    }

    public final boolean isConstant() {
        return false;
    }

    public boolean isEvenRegister() {
        return (getReg() & 1) == 0;
    }

    public boolean matchesVariable(RegisterSpec registerSpec) {
        if (registerSpec == null || !this.type.getType().equals(registerSpec.type.getType())) {
            return false;
        }
        LocalItem localItem = this.local;
        LocalItem localItem2 = registerSpec.local;
        if (localItem == localItem2 || (localItem != null && localItem.equals(localItem2))) {
            return true;
        }
        return false;
    }

    public String toHuman() {
        return toString0(true);
    }

    public String toString() {
        return toString0(false);
    }

    public RegisterSpec withLocalItem(LocalItem localItem) {
        LocalItem localItem2 = this.local;
        return (localItem2 == localItem || (localItem2 != null && localItem2.equals(localItem))) ? this : makeLocalOptional(this.reg, this.type, localItem);
    }

    public RegisterSpec withOffset(int i) {
        return i == 0 ? this : withReg(this.reg + i);
    }

    public RegisterSpec withReg(int i) {
        if (this.reg == i) {
            return this;
        }
        return makeLocalOptional(i, this.type, this.local);
    }

    public RegisterSpec withSimpleType() {
        Type type2;
        TypeBearer typeBearer = this.type;
        if (typeBearer instanceof Type) {
            type2 = (Type) typeBearer;
        } else {
            type2 = typeBearer.getType();
        }
        if (type2.isUninitialized()) {
            type2 = type2.getInitializedType();
        }
        if (type2 == typeBearer) {
            return this;
        }
        return makeLocalOptional(this.reg, type2, this.local);
    }

    public RegisterSpec withType(TypeBearer typeBearer) {
        return makeLocalOptional(this.reg, typeBearer, this.local);
    }

    private RegisterSpec(int i, TypeBearer typeBearer, LocalItem localItem) {
        if (i >= 0) {
            Objects.requireNonNull(typeBearer, "type == null");
            this.reg = i;
            this.type = typeBearer;
            this.local = localItem;
            return;
        }
        throw new IllegalArgumentException("reg < 0");
    }

    public static RegisterSpec make(int i, TypeBearer typeBearer, LocalItem localItem) {
        Objects.requireNonNull(localItem, "local  == null");
        return intern(i, typeBearer, localItem);
    }

    public int compareTo(RegisterSpec registerSpec) {
        int i = this.reg;
        int i2 = registerSpec.reg;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int compareTo = this.type.getType().compareTo(registerSpec.type.getType());
        if (compareTo != 0) {
            return compareTo;
        }
        LocalItem localItem = this.local;
        if (localItem != null) {
            LocalItem localItem2 = registerSpec.local;
            if (localItem2 == null) {
                return 1;
            }
            return localItem.compareTo(localItem2);
        } else if (registerSpec.local == null) {
            return 0;
        } else {
            return -1;
        }
    }

    public String regString() {
        return regString(this.reg);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = r1.local;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(int r2, com.android.p023dx.rop.type.TypeBearer r3, com.android.p023dx.rop.code.LocalItem r4) {
        /*
            r1 = this;
            int r0 = r1.reg
            if (r0 != r2) goto L_0x001a
            com.android.dx.rop.type.TypeBearer r2 = r1.type
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x001a
            com.android.dx.rop.code.LocalItem r2 = r1.local
            if (r2 == r4) goto L_0x0018
            if (r2 == 0) goto L_0x001a
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x001a
        L_0x0018:
            r2 = 1
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.rop.code.RegisterSpec.equals(int, com.android.dx.rop.type.TypeBearer, com.android.dx.rop.code.LocalItem):boolean");
    }
}
