package com.android.p023dx;

import com.android.p023dx.rop.code.RegisterSpec;

/* renamed from: com.android.dx.Local */
public final class Local<T> {
    private final Code code;
    private int reg = -1;
    private RegisterSpec spec;
    final TypeId<T> type;

    private Local(Code code2, TypeId<T> typeId) {
        this.code = code2;
        this.type = typeId;
    }

    static <T> Local<T> get(Code code2, TypeId<T> typeId) {
        return new Local<>(code2, typeId);
    }

    public TypeId getType() {
        return this.type;
    }

    /* access modifiers changed from: package-private */
    public int initialize(int i) {
        this.reg = i;
        this.spec = RegisterSpec.make(i, this.type.ropType);
        return size();
    }

    /* access modifiers changed from: package-private */
    public int size() {
        return this.type.ropType.getCategory();
    }

    /* access modifiers changed from: package-private */
    public RegisterSpec spec() {
        if (this.spec == null) {
            this.code.initializeLocals();
            if (this.spec == null) {
                throw new AssertionError();
            }
        }
        return this.spec;
    }

    public String toString() {
        return RegisterSpec.PREFIX + this.reg + "(" + this.type + ")";
    }
}
