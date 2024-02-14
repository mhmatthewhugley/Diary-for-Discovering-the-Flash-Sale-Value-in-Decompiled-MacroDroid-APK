package com.android.p023dx.rop.type;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.android.p023dx.util.Hex;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.android.dx.rop.type.Type */
public final class Type implements TypeBearer, Comparable<Type> {
    public static final Type ANNOTATION = intern("Ljava/lang/annotation/Annotation;");
    public static final Type BOOLEAN;
    public static final Type BOOLEAN_ARRAY;
    public static final Type BOOLEAN_CLASS = intern("Ljava/lang/Boolean;");
    public static final int BT_ADDR = 10;
    public static final int BT_BOOLEAN = 1;
    public static final int BT_BYTE = 2;
    public static final int BT_CHAR = 3;
    public static final int BT_COUNT = 11;
    public static final int BT_DOUBLE = 4;
    public static final int BT_FLOAT = 5;
    public static final int BT_INT = 6;
    public static final int BT_LONG = 7;
    public static final int BT_OBJECT = 9;
    public static final int BT_SHORT = 8;
    public static final int BT_VOID = 0;
    public static final Type BYTE;
    public static final Type BYTE_ARRAY;
    public static final Type BYTE_CLASS = intern("Ljava/lang/Byte;");
    public static final Type CHAR;
    public static final Type CHARACTER_CLASS = intern("Ljava/lang/Character;");
    public static final Type CHAR_ARRAY;
    public static final Type CLASS = intern("Ljava/lang/Class;");
    public static final Type CLONEABLE = intern("Ljava/lang/Cloneable;");
    public static final Type DOUBLE;
    public static final Type DOUBLE_ARRAY;
    public static final Type DOUBLE_CLASS = intern("Ljava/lang/Double;");
    public static final Type FLOAT;
    public static final Type FLOAT_ARRAY;
    public static final Type FLOAT_CLASS = intern("Ljava/lang/Float;");
    public static final Type INT;
    public static final Type INTEGER_CLASS = intern("Ljava/lang/Integer;");
    public static final Type INT_ARRAY;
    public static final Type KNOWN_NULL = new Type("<null>", 9);
    public static final Type LONG;
    public static final Type LONG_ARRAY;
    public static final Type LONG_CLASS = intern("Ljava/lang/Long;");
    public static final Type OBJECT;
    public static final Type OBJECT_ARRAY;
    public static final Type RETURN_ADDRESS = new Type("<addr>", 10);
    public static final Type SERIALIZABLE = intern("Ljava/io/Serializable;");
    public static final Type SHORT;
    public static final Type SHORT_ARRAY;
    public static final Type SHORT_CLASS = intern("Ljava/lang/Short;");
    public static final Type STRING = intern("Ljava/lang/String;");
    public static final Type THROWABLE = intern("Ljava/lang/Throwable;");
    public static final Type VOID = new Type(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, 0);
    public static final Type VOID_CLASS = intern("Ljava/lang/Void;");
    private static final HashMap<String, Type> internTable = new HashMap<>(500);
    private Type arrayType;
    private final int basicType;
    private String className;
    private Type componentType;
    private final String descriptor;
    private Type initializedType;
    private final int newAt;

    static {
        Type type = new Type("Z", 1);
        BOOLEAN = type;
        Type type2 = new Type("B", 2);
        BYTE = type2;
        Type type3 = new Type("C", 3);
        CHAR = type3;
        Type type4 = new Type("D", 4);
        DOUBLE = type4;
        Type type5 = new Type("F", 5);
        FLOAT = type5;
        Type type6 = new Type("I", 6);
        INT = type6;
        Type type7 = new Type("J", 7);
        LONG = type7;
        Type type8 = new Type(ExifInterface.LATITUDE_SOUTH, 8);
        SHORT = type8;
        putIntern(type);
        putIntern(type2);
        putIntern(type3);
        putIntern(type4);
        putIntern(type5);
        putIntern(type6);
        putIntern(type7);
        putIntern(type8);
        Type intern = intern("Ljava/lang/Object;");
        OBJECT = intern;
        BOOLEAN_ARRAY = type.getArrayType();
        BYTE_ARRAY = type2.getArrayType();
        CHAR_ARRAY = type3.getArrayType();
        DOUBLE_ARRAY = type4.getArrayType();
        FLOAT_ARRAY = type5.getArrayType();
        INT_ARRAY = type6.getArrayType();
        LONG_ARRAY = type7.getArrayType();
        OBJECT_ARRAY = intern.getArrayType();
        SHORT_ARRAY = type8.getArrayType();
    }

    private Type(String str, int i, int i2) {
        Objects.requireNonNull(str, "descriptor == null");
        if (i < 0 || i >= 11) {
            throw new IllegalArgumentException("bad basicType");
        } else if (i2 >= -1) {
            this.descriptor = str;
            this.basicType = i;
            this.newAt = i2;
            this.arrayType = null;
            this.componentType = null;
            this.initializedType = null;
        } else {
            throw new IllegalArgumentException("newAt < -1");
        }
    }

    public static Type intern(String str) {
        Type type;
        HashMap<String, Type> hashMap = internTable;
        synchronized (hashMap) {
            type = hashMap.get(str);
        }
        if (type != null) {
            return type;
        }
        try {
            char charAt = str.charAt(0);
            if (charAt == '[') {
                return intern(str.substring(1)).getArrayType();
            }
            int length = str.length();
            if (charAt == 'L') {
                int i = length - 1;
                if (str.charAt(i) == ';') {
                    int i2 = 1;
                    while (i2 < i) {
                        char charAt2 = str.charAt(i2);
                        if (!(charAt2 == '(' || charAt2 == ')' || charAt2 == '.')) {
                            if (charAt2 != '/') {
                                if (!(charAt2 == ';' || charAt2 == '[')) {
                                }
                            } else if (i2 == 1 || i2 == i || str.charAt(i2 - 1) == '/') {
                                throw new IllegalArgumentException("bad descriptor: " + str);
                            }
                            i2++;
                        }
                        throw new IllegalArgumentException("bad descriptor: " + str);
                    }
                    return putIntern(new Type(str, 9));
                }
            }
            throw new IllegalArgumentException("bad descriptor: " + str);
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("descriptor is empty");
        } catch (NullPointerException unused2) {
            throw new NullPointerException("descriptor == null");
        }
    }

    public static Type internClassName(String str) {
        Objects.requireNonNull(str, "name == null");
        if (str.startsWith("[")) {
            return intern(str);
        }
        return intern('L' + str + ';');
    }

    public static Type internReturnType(String str) {
        try {
            if (str.equals(ExifInterface.GPS_MEASUREMENT_INTERRUPTED)) {
                return VOID;
            }
            return intern(str);
        } catch (NullPointerException unused) {
            throw new NullPointerException("descriptor == null");
        }
    }

    private static Type putIntern(Type type) {
        HashMap<String, Type> hashMap = internTable;
        synchronized (hashMap) {
            String descriptor2 = type.getDescriptor();
            Type type2 = hashMap.get(descriptor2);
            if (type2 != null) {
                return type2;
            }
            hashMap.put(descriptor2, type);
            return type;
        }
    }

    public Type asUninitialized(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("newAt < 0");
        } else if (!isReference()) {
            throw new IllegalArgumentException("not a reference type: " + this.descriptor);
        } else if (!isUninitialized()) {
            Type type = new Type('N' + Hex.m907u2(i) + this.descriptor, 9, i);
            type.initializedType = this;
            return putIntern(type);
        } else {
            throw new IllegalArgumentException("already uninitialized: " + this.descriptor);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Type)) {
            return false;
        }
        return this.descriptor.equals(((Type) obj).descriptor);
    }

    public Type getArrayType() {
        if (this.arrayType == null) {
            this.arrayType = putIntern(new Type('[' + this.descriptor, 9));
        }
        return this.arrayType;
    }

    public int getBasicFrameType() {
        int i = this.basicType;
        if (i == 1 || i == 2 || i == 3 || i == 6 || i == 8) {
            return 6;
        }
        return i;
    }

    public int getBasicType() {
        return this.basicType;
    }

    public int getCategory() {
        int i = this.basicType;
        return (i == 4 || i == 7) ? 2 : 1;
    }

    public String getClassName() {
        if (this.className == null) {
            if (!isReference()) {
                throw new IllegalArgumentException("not an object type: " + this.descriptor);
            } else if (this.descriptor.charAt(0) == '[') {
                this.className = this.descriptor;
            } else {
                String str = this.descriptor;
                this.className = str.substring(1, str.length() - 1);
            }
        }
        return this.className;
    }

    public Type getComponentType() {
        if (this.componentType == null) {
            if (this.descriptor.charAt(0) == '[') {
                this.componentType = intern(this.descriptor.substring(1));
            } else {
                throw new IllegalArgumentException("not an array type: " + this.descriptor);
            }
        }
        return this.componentType;
    }

    public String getDescriptor() {
        return this.descriptor;
    }

    public Type getInitializedType() {
        Type type = this.initializedType;
        if (type != null) {
            return type;
        }
        throw new IllegalArgumentException("initialized type: " + this.descriptor);
    }

    public int getNewAt() {
        return this.newAt;
    }

    public Type getType() {
        return this;
    }

    public int hashCode() {
        return this.descriptor.hashCode();
    }

    public boolean isArray() {
        return this.descriptor.charAt(0) == '[';
    }

    public boolean isArrayOrKnownNull() {
        return isArray() || equals(KNOWN_NULL);
    }

    public boolean isCategory1() {
        int i = this.basicType;
        return (i == 4 || i == 7) ? false : true;
    }

    public boolean isCategory2() {
        int i = this.basicType;
        return i == 4 || i == 7;
    }

    public boolean isConstant() {
        return false;
    }

    public boolean isIntlike() {
        int i = this.basicType;
        return i == 1 || i == 2 || i == 3 || i == 6 || i == 8;
    }

    public boolean isPrimitive() {
        switch (this.basicType) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public boolean isReference() {
        return this.basicType == 9;
    }

    public boolean isUninitialized() {
        return this.newAt >= 0;
    }

    public String toHuman() {
        switch (this.basicType) {
            case 0:
                return "void";
            case 1:
                return TypedValues.Custom.S_BOOLEAN;
            case 2:
                return "byte";
            case 3:
                return "char";
            case 4:
                return "double";
            case 5:
                return TypedValues.Custom.S_FLOAT;
            case 6:
                return "int";
            case 7:
                return "long";
            case 8:
                return "short";
            case 9:
                if (!isArray()) {
                    return getClassName().replace("/", ".");
                }
                return getComponentType().toHuman() + "[]";
            default:
                return this.descriptor;
        }
    }

    public String toString() {
        return this.descriptor;
    }

    public int compareTo(Type type) {
        return this.descriptor.compareTo(type.descriptor);
    }

    public Type getFrameType() {
        int i = this.basicType;
        if (i == 1 || i == 2 || i == 3 || i == 6 || i == 8) {
            return INT;
        }
        return this;
    }

    private Type(String str, int i) {
        this(str, i, -1);
    }
}
