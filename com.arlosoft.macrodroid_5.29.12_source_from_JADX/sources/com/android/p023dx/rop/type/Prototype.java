package com.android.p023dx.rop.type;

import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.android.dx.rop.type.Prototype */
public final class Prototype implements Comparable<Prototype> {
    private static final HashMap<String, Prototype> internTable = new HashMap<>(500);
    private final String descriptor;
    private StdTypeList parameterFrameTypes = null;
    private final StdTypeList parameterTypes;
    private final Type returnType;

    private Prototype(String str, Type type, StdTypeList stdTypeList) {
        Objects.requireNonNull(str, "descriptor == null");
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(stdTypeList, "parameterTypes == null");
        this.descriptor = str;
        this.returnType = type;
        this.parameterTypes = stdTypeList;
    }

    public static Prototype intern(String str) {
        Prototype prototype;
        int i;
        Objects.requireNonNull(str, "descriptor == null");
        HashMap<String, Prototype> hashMap = internTable;
        synchronized (hashMap) {
            prototype = hashMap.get(str);
        }
        if (prototype != null) {
            return prototype;
        }
        Type[] makeParameterArray = makeParameterArray(str);
        int i2 = 1;
        int i3 = 0;
        while (true) {
            char charAt = str.charAt(i2);
            if (charAt == ')') {
                Type internReturnType = Type.internReturnType(str.substring(i2 + 1));
                StdTypeList stdTypeList = new StdTypeList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    stdTypeList.set(i4, makeParameterArray[i4]);
                }
                return putIntern(new Prototype(str, internReturnType, stdTypeList));
            }
            int i5 = i2;
            while (charAt == '[') {
                i5++;
                charAt = str.charAt(i5);
            }
            if (charAt == 'L') {
                int indexOf = str.indexOf(59, i5);
                if (indexOf != -1) {
                    i = indexOf + 1;
                } else {
                    throw new IllegalArgumentException("bad descriptor");
                }
            } else {
                i = i5 + 1;
            }
            makeParameterArray[i3] = Type.intern(str.substring(i2, i));
            i3++;
            i2 = i;
        }
    }

    public static Prototype internInts(Type type, int i) {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append('(');
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append('I');
        }
        stringBuffer.append(')');
        stringBuffer.append(type.getDescriptor());
        return intern(stringBuffer.toString());
    }

    private static Type[] makeParameterArray(String str) {
        int length = str.length();
        int i = 0;
        if (str.charAt(0) == '(') {
            int i2 = 1;
            int i3 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                char charAt = str.charAt(i2);
                if (charAt == ')') {
                    i = i2;
                    break;
                }
                if (charAt >= 'A' && charAt <= 'Z') {
                    i3++;
                }
                i2++;
            }
            if (i == 0 || i == length - 1) {
                throw new IllegalArgumentException("bad descriptor");
            } else if (str.indexOf(41, i + 1) == -1) {
                return new Type[i3];
            } else {
                throw new IllegalArgumentException("bad descriptor");
            }
        } else {
            throw new IllegalArgumentException("bad descriptor");
        }
    }

    private static Prototype putIntern(Prototype prototype) {
        HashMap<String, Prototype> hashMap = internTable;
        synchronized (hashMap) {
            String descriptor2 = prototype.getDescriptor();
            Prototype prototype2 = hashMap.get(descriptor2);
            if (prototype2 != null) {
                return prototype2;
            }
            hashMap.put(descriptor2, prototype);
            return prototype;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Prototype)) {
            return false;
        }
        return this.descriptor.equals(((Prototype) obj).descriptor);
    }

    public String getDescriptor() {
        return this.descriptor;
    }

    public StdTypeList getParameterFrameTypes() {
        if (this.parameterFrameTypes == null) {
            int size = this.parameterTypes.size();
            StdTypeList stdTypeList = new StdTypeList(size);
            boolean z = false;
            for (int i = 0; i < size; i++) {
                Type type = this.parameterTypes.get(i);
                if (type.isIntlike()) {
                    type = Type.INT;
                    z = true;
                }
                stdTypeList.set(i, type);
            }
            if (!z) {
                stdTypeList = this.parameterTypes;
            }
            this.parameterFrameTypes = stdTypeList;
        }
        return this.parameterFrameTypes;
    }

    public StdTypeList getParameterTypes() {
        return this.parameterTypes;
    }

    public Type getReturnType() {
        return this.returnType;
    }

    public int hashCode() {
        return this.descriptor.hashCode();
    }

    public String toString() {
        return this.descriptor;
    }

    public Prototype withFirstParameter(Type type) {
        String str = "(" + type.getDescriptor() + this.descriptor.substring(1);
        StdTypeList withFirst = this.parameterTypes.withFirst(type);
        withFirst.setImmutable();
        return putIntern(new Prototype(str, this.returnType, withFirst));
    }

    public int compareTo(Prototype prototype) {
        if (this == prototype) {
            return 0;
        }
        int compareTo = this.returnType.compareTo(prototype.returnType);
        if (compareTo != 0) {
            return compareTo;
        }
        int size = this.parameterTypes.size();
        int size2 = prototype.parameterTypes.size();
        int min = Math.min(size, size2);
        for (int i = 0; i < min; i++) {
            int compareTo2 = this.parameterTypes.get(i).compareTo(prototype.parameterTypes.get(i));
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        if (size < size2) {
            return -1;
        }
        if (size > size2) {
            return 1;
        }
        return 0;
    }

    public static Prototype intern(String str, Type type, boolean z, boolean z2) {
        Prototype intern = intern(str);
        if (z) {
            return intern;
        }
        if (z2) {
            type = type.asUninitialized(Integer.MAX_VALUE);
        }
        return intern.withFirstParameter(type);
    }
}
