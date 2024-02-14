package com.android.p023dx.rop.code;

import com.android.p023dx.util.MutabilityControl;

/* renamed from: com.android.dx.rop.code.RegisterSpecSet */
public final class RegisterSpecSet extends MutabilityControl {
    public static final RegisterSpecSet EMPTY = new RegisterSpecSet(0);
    private int size;
    private final RegisterSpec[] specs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegisterSpecSet(int i) {
        super(i != 0);
        this.specs = new RegisterSpec[i];
        this.size = 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RegisterSpecSet)) {
            return false;
        }
        RegisterSpecSet registerSpecSet = (RegisterSpecSet) obj;
        RegisterSpec[] registerSpecArr = registerSpecSet.specs;
        int length = this.specs.length;
        if (length != registerSpecArr.length || size() != registerSpecSet.size()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            RegisterSpec registerSpec = this.specs[i];
            RegisterSpec registerSpec2 = registerSpecArr[i];
            if (registerSpec != registerSpec2 && (registerSpec == null || !registerSpec.equals(registerSpec2))) {
                return false;
            }
        }
        return true;
    }

    public RegisterSpec findMatchingLocal(RegisterSpec registerSpec) {
        for (RegisterSpec registerSpec2 : this.specs) {
            if (registerSpec2 != null && registerSpec.matchesVariable(registerSpec2)) {
                return registerSpec2;
            }
        }
        return null;
    }

    public RegisterSpec get(int i) {
        try {
            return this.specs[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    public int getMaxSize() {
        return this.specs.length;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        for (RegisterSpec registerSpec : this.specs) {
            if (registerSpec == null) {
                i = 0;
            } else {
                i = registerSpec.hashCode();
            }
            i2 = (i2 * 31) + i;
        }
        return i2;
    }

    public void intersect(RegisterSpecSet registerSpecSet, boolean z) {
        RegisterSpec intersect;
        throwIfImmutable();
        RegisterSpec[] registerSpecArr = registerSpecSet.specs;
        int length = this.specs.length;
        int min = Math.min(length, registerSpecArr.length);
        this.size = -1;
        for (int i = 0; i < min; i++) {
            RegisterSpec registerSpec = this.specs[i];
            if (!(registerSpec == null || (intersect = registerSpec.intersect(registerSpecArr[i], z)) == registerSpec)) {
                this.specs[i] = intersect;
            }
        }
        while (min < length) {
            this.specs[min] = null;
            min++;
        }
    }

    public RegisterSpec localItemToSpec(LocalItem localItem) {
        for (RegisterSpec registerSpec : this.specs) {
            if (registerSpec != null && localItem.equals(registerSpec.getLocalItem())) {
                return registerSpec;
            }
        }
        return null;
    }

    public RegisterSpecSet mutableCopy() {
        RegisterSpecSet registerSpecSet = new RegisterSpecSet(r0);
        for (RegisterSpec registerSpec : this.specs) {
            if (registerSpec != null) {
                registerSpecSet.put(registerSpec);
            }
        }
        registerSpecSet.size = this.size;
        return registerSpecSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        r4 = r0 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void put(com.android.p023dx.rop.code.RegisterSpec r6) {
        /*
            r5 = this;
            r5.throwIfImmutable()
            java.lang.String r0 = "spec == null"
            java.util.Objects.requireNonNull(r6, r0)
            r0 = -1
            r5.size = r0
            int r0 = r6.getReg()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0034 }
            com.android.dx.rop.code.RegisterSpec[] r1 = r5.specs     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0034 }
            r1[r0] = r6     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0034 }
            r2 = 0
            r3 = 2
            if (r0 <= 0) goto L_0x0027
            int r4 = r0 + -1
            r1 = r1[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0034 }
            if (r1 == 0) goto L_0x0027
            int r1 = r1.getCategory()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0034 }
            if (r1 != r3) goto L_0x0027
            com.android.dx.rop.code.RegisterSpec[] r1 = r5.specs     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0034 }
            r1[r4] = r2     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0034 }
        L_0x0027:
            int r6 = r6.getCategory()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0034 }
            if (r6 != r3) goto L_0x0033
            com.android.dx.rop.code.RegisterSpec[] r6 = r5.specs     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0034 }
            int r0 = r0 + 1
            r6[r0] = r2     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0034 }
        L_0x0033:
            return
        L_0x0034:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "spec.getReg() out of range"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.rop.code.RegisterSpecSet.put(com.android.dx.rop.code.RegisterSpec):void");
    }

    public void putAll(RegisterSpecSet registerSpecSet) {
        int maxSize = registerSpecSet.getMaxSize();
        for (int i = 0; i < maxSize; i++) {
            RegisterSpec registerSpec = registerSpecSet.get(i);
            if (registerSpec != null) {
                put(registerSpec);
            }
        }
    }

    public void remove(RegisterSpec registerSpec) {
        try {
            this.specs[registerSpec.getReg()] = null;
            this.size = -1;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    public int size() {
        int i = this.size;
        if (i >= 0) {
            return i;
        }
        int i2 = 0;
        for (RegisterSpec registerSpec : this.specs) {
            if (registerSpec != null) {
                i2++;
            }
        }
        this.size = i2;
        return i2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(r0 * 25);
        stringBuffer.append('{');
        boolean z = false;
        for (RegisterSpec registerSpec : this.specs) {
            if (registerSpec != null) {
                if (z) {
                    stringBuffer.append(", ");
                } else {
                    z = true;
                }
                stringBuffer.append(registerSpec);
            }
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public RegisterSpecSet withOffset(int i) {
        RegisterSpecSet registerSpecSet = new RegisterSpecSet(r0 + i);
        for (RegisterSpec registerSpec : this.specs) {
            if (registerSpec != null) {
                registerSpecSet.put(registerSpec.withOffset(i));
            }
        }
        registerSpecSet.size = this.size;
        if (isImmutable()) {
            registerSpecSet.setImmutable();
        }
        return registerSpecSet;
    }

    public RegisterSpec get(RegisterSpec registerSpec) {
        return get(registerSpec.getReg());
    }
}
