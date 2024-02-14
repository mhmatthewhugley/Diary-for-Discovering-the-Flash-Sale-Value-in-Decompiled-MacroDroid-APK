package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.AnyRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.Serializable;

public abstract class NavType<T> {
    @NonNull
    public static final NavType<boolean[]> BoolArrayType = new NavType<boolean[]>(true) {
        @NonNull
        public String getName() {
            return "boolean[]";
        }

        public boolean[] get(@NonNull Bundle bundle, @NonNull String str) {
            return (boolean[]) bundle.get(str);
        }

        @NonNull
        public boolean[] parseValue(@NonNull String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public void put(@NonNull Bundle bundle, @NonNull String str, @Nullable boolean[] zArr) {
            bundle.putBooleanArray(str, zArr);
        }
    };
    @NonNull
    public static final NavType<Boolean> BoolType = new NavType<Boolean>(false) {
        @NonNull
        public String getName() {
            return TypedValues.Custom.S_BOOLEAN;
        }

        public Boolean get(@NonNull Bundle bundle, @NonNull String str) {
            return (Boolean) bundle.get(str);
        }

        @NonNull
        public Boolean parseValue(@NonNull String str) {
            if ("true".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equals(str)) {
                return Boolean.FALSE;
            }
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }

        public void put(@NonNull Bundle bundle, @NonNull String str, @NonNull Boolean bool) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    };
    @NonNull
    public static final NavType<float[]> FloatArrayType = new NavType<float[]>(true) {
        @NonNull
        public String getName() {
            return "float[]";
        }

        public float[] get(@NonNull Bundle bundle, @NonNull String str) {
            return (float[]) bundle.get(str);
        }

        @NonNull
        public float[] parseValue(@NonNull String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public void put(@NonNull Bundle bundle, @NonNull String str, @Nullable float[] fArr) {
            bundle.putFloatArray(str, fArr);
        }
    };
    @NonNull
    public static final NavType<Float> FloatType = new NavType<Float>(false) {
        @NonNull
        public String getName() {
            return TypedValues.Custom.S_FLOAT;
        }

        public Float get(@NonNull Bundle bundle, @NonNull String str) {
            return (Float) bundle.get(str);
        }

        @NonNull
        public Float parseValue(@NonNull String str) {
            return Float.valueOf(Float.parseFloat(str));
        }

        public void put(@NonNull Bundle bundle, @NonNull String str, @NonNull Float f) {
            bundle.putFloat(str, f.floatValue());
        }
    };
    @NonNull
    public static final NavType<int[]> IntArrayType = new NavType<int[]>(true) {
        @NonNull
        public String getName() {
            return "integer[]";
        }

        public int[] get(@NonNull Bundle bundle, @NonNull String str) {
            return (int[]) bundle.get(str);
        }

        @NonNull
        public int[] parseValue(@NonNull String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public void put(@NonNull Bundle bundle, @NonNull String str, @Nullable int[] iArr) {
            bundle.putIntArray(str, iArr);
        }
    };
    @NonNull
    public static final NavType<Integer> IntType = new NavType<Integer>(false) {
        @NonNull
        public String getName() {
            return TypedValues.Custom.S_INT;
        }

        public Integer get(@NonNull Bundle bundle, @NonNull String str) {
            return (Integer) bundle.get(str);
        }

        @NonNull
        public Integer parseValue(@NonNull String str) {
            if (str.startsWith("0x")) {
                return Integer.valueOf(Integer.parseInt(str.substring(2), 16));
            }
            return Integer.valueOf(Integer.parseInt(str));
        }

        public void put(@NonNull Bundle bundle, @NonNull String str, @NonNull Integer num) {
            bundle.putInt(str, num.intValue());
        }
    };
    @NonNull
    public static final NavType<long[]> LongArrayType = new NavType<long[]>(true) {
        @NonNull
        public String getName() {
            return "long[]";
        }

        public long[] get(@NonNull Bundle bundle, @NonNull String str) {
            return (long[]) bundle.get(str);
        }

        @NonNull
        public long[] parseValue(@NonNull String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public void put(@NonNull Bundle bundle, @NonNull String str, @Nullable long[] jArr) {
            bundle.putLongArray(str, jArr);
        }
    };
    @NonNull
    public static final NavType<Long> LongType = new NavType<Long>(false) {
        @NonNull
        public String getName() {
            return "long";
        }

        public Long get(@NonNull Bundle bundle, @NonNull String str) {
            return (Long) bundle.get(str);
        }

        @NonNull
        public Long parseValue(@NonNull String str) {
            if (str.endsWith("L")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.startsWith("0x")) {
                return Long.valueOf(Long.parseLong(str.substring(2), 16));
            }
            return Long.valueOf(Long.parseLong(str));
        }

        public void put(@NonNull Bundle bundle, @NonNull String str, @NonNull Long l) {
            bundle.putLong(str, l.longValue());
        }
    };
    @NonNull
    public static final NavType<Integer> ReferenceType = new NavType<Integer>(false) {
        @NonNull
        public String getName() {
            return "reference";
        }

        @AnyRes
        public Integer get(@NonNull Bundle bundle, @NonNull String str) {
            return (Integer) bundle.get(str);
        }

        @NonNull
        public Integer parseValue(@NonNull String str) {
            if (str.startsWith("0x")) {
                return Integer.valueOf(Integer.parseInt(str.substring(2), 16));
            }
            return Integer.valueOf(Integer.parseInt(str));
        }

        public void put(@NonNull Bundle bundle, @NonNull String str, @NonNull @AnyRes Integer num) {
            bundle.putInt(str, num.intValue());
        }
    };
    @NonNull
    public static final NavType<String[]> StringArrayType = new NavType<String[]>(true) {
        @NonNull
        public String getName() {
            return "string[]";
        }

        public String[] get(@NonNull Bundle bundle, @NonNull String str) {
            return (String[]) bundle.get(str);
        }

        @NonNull
        public String[] parseValue(@NonNull String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public void put(@NonNull Bundle bundle, @NonNull String str, @Nullable String[] strArr) {
            bundle.putStringArray(str, strArr);
        }
    };
    @NonNull
    public static final NavType<String> StringType = new NavType<String>(true) {
        @NonNull
        public String getName() {
            return TypedValues.Custom.S_STRING;
        }

        @NonNull
        public String parseValue(@NonNull String str) {
            return str;
        }

        public String get(@NonNull Bundle bundle, @NonNull String str) {
            return (String) bundle.get(str);
        }

        public void put(@NonNull Bundle bundle, @NonNull String str, @Nullable String str2) {
            bundle.putString(str, str2);
        }
    };
    private final boolean mNullableAllowed;

    public static final class ParcelableArrayType<D extends Parcelable> extends NavType<D[]> {
        @NonNull
        private final Class<D[]> mArrayType;

        public ParcelableArrayType(@NonNull Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls)) {
                try {
                    this.mArrayType = Class.forName("[L" + cls.getName() + ";");
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new IllegalArgumentException(cls + " does not implement Parcelable.");
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ParcelableArrayType.class != obj.getClass()) {
                return false;
            }
            return this.mArrayType.equals(((ParcelableArrayType) obj).mArrayType);
        }

        @NonNull
        public String getName() {
            return this.mArrayType.getName();
        }

        public int hashCode() {
            return this.mArrayType.hashCode();
        }

        @Nullable
        public D[] get(@NonNull Bundle bundle, @NonNull String str) {
            return (Parcelable[]) bundle.get(str);
        }

        @NonNull
        public D[] parseValue(@NonNull String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public void put(@NonNull Bundle bundle, @NonNull String str, @Nullable D[] dArr) {
            this.mArrayType.cast(dArr);
            bundle.putParcelableArray(str, dArr);
        }
    }

    public static final class ParcelableType<D> extends NavType<D> {
        @NonNull
        private final Class<D> mType;

        public ParcelableType(@NonNull Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.mType = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Parcelable or Serializable.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ParcelableType.class != obj.getClass()) {
                return false;
            }
            return this.mType.equals(((ParcelableType) obj).mType);
        }

        @Nullable
        public D get(@NonNull Bundle bundle, @NonNull String str) {
            return bundle.get(str);
        }

        @NonNull
        public String getName() {
            return this.mType.getName();
        }

        public int hashCode() {
            return this.mType.hashCode();
        }

        @NonNull
        public D parseValue(@NonNull String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public void put(@NonNull Bundle bundle, @NonNull String str, @Nullable D d) {
            this.mType.cast(d);
            if (d == null || (d instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d);
            } else if (d instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d);
            }
        }
    }

    public static final class SerializableArrayType<D extends Serializable> extends NavType<D[]> {
        @NonNull
        private final Class<D[]> mArrayType;

        public SerializableArrayType(@NonNull Class<D> cls) {
            super(true);
            if (Serializable.class.isAssignableFrom(cls)) {
                try {
                    this.mArrayType = Class.forName("[L" + cls.getName() + ";");
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SerializableArrayType.class != obj.getClass()) {
                return false;
            }
            return this.mArrayType.equals(((SerializableArrayType) obj).mArrayType);
        }

        @NonNull
        public String getName() {
            return this.mArrayType.getName();
        }

        public int hashCode() {
            return this.mArrayType.hashCode();
        }

        @Nullable
        public D[] get(@NonNull Bundle bundle, @NonNull String str) {
            return (Serializable[]) bundle.get(str);
        }

        @NonNull
        public D[] parseValue(@NonNull String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARNING: type inference failed for: r4v0, types: [D[], java.lang.Object, java.io.Serializable] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void put(@androidx.annotation.NonNull android.os.Bundle r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable D[] r4) {
            /*
                r1 = this;
                java.lang.Class<D[]> r0 = r1.mArrayType
                r0.cast(r4)
                r2.putSerializable(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavType.SerializableArrayType.put(android.os.Bundle, java.lang.String, java.io.Serializable[]):void");
        }
    }

    public static class SerializableType<D extends Serializable> extends NavType<D> {
        @NonNull
        private final Class<D> mType;

        public SerializableType(@NonNull Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            } else if (!cls.isEnum()) {
                this.mType = cls;
            } else {
                throw new IllegalArgumentException(cls + " is an Enum. You should use EnumType instead.");
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SerializableType)) {
                return false;
            }
            return this.mType.equals(((SerializableType) obj).mType);
        }

        @NonNull
        public String getName() {
            return this.mType.getName();
        }

        public int hashCode() {
            return this.mType.hashCode();
        }

        @Nullable
        public D get(@NonNull Bundle bundle, @NonNull String str) {
            return (Serializable) bundle.get(str);
        }

        @NonNull
        public D parseValue(@NonNull String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public void put(@NonNull Bundle bundle, @NonNull String str, @Nullable D d) {
            this.mType.cast(d);
            bundle.putSerializable(str, d);
        }

        SerializableType(boolean z, @NonNull Class<D> cls) {
            super(z);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.mType = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Serializable.");
        }
    }

    NavType(boolean z) {
        this.mNullableAllowed = z;
    }

    @NonNull
    public static NavType<?> fromArgType(@Nullable String str, @Nullable String str2) {
        String str3;
        NavType<Integer> navType = IntType;
        if (navType.getName().equals(str)) {
            return navType;
        }
        NavType<int[]> navType2 = IntArrayType;
        if (navType2.getName().equals(str)) {
            return navType2;
        }
        NavType<Long> navType3 = LongType;
        if (navType3.getName().equals(str)) {
            return navType3;
        }
        NavType<long[]> navType4 = LongArrayType;
        if (navType4.getName().equals(str)) {
            return navType4;
        }
        NavType<Boolean> navType5 = BoolType;
        if (navType5.getName().equals(str)) {
            return navType5;
        }
        NavType<boolean[]> navType6 = BoolArrayType;
        if (navType6.getName().equals(str)) {
            return navType6;
        }
        NavType<String> navType7 = StringType;
        if (navType7.getName().equals(str)) {
            return navType7;
        }
        NavType<String[]> navType8 = StringArrayType;
        if (navType8.getName().equals(str)) {
            return navType8;
        }
        NavType<Float> navType9 = FloatType;
        if (navType9.getName().equals(str)) {
            return navType9;
        }
        NavType<float[]> navType10 = FloatArrayType;
        if (navType10.getName().equals(str)) {
            return navType10;
        }
        NavType<Integer> navType11 = ReferenceType;
        if (navType11.getName().equals(str)) {
            return navType11;
        }
        if (str == null || str.isEmpty()) {
            return navType7;
        }
        try {
            if (!str.startsWith(".") || str2 == null) {
                str3 = str;
            } else {
                str3 = str2 + str;
            }
            if (str.endsWith("[]")) {
                str3 = str3.substring(0, str3.length() - 2);
                Class<?> cls = Class.forName(str3);
                if (Parcelable.class.isAssignableFrom(cls)) {
                    return new ParcelableArrayType(cls);
                }
                if (Serializable.class.isAssignableFrom(cls)) {
                    return new SerializableArrayType(cls);
                }
            } else {
                Class<?> cls2 = Class.forName(str3);
                if (Parcelable.class.isAssignableFrom(cls2)) {
                    return new ParcelableType(cls2);
                }
                if (Enum.class.isAssignableFrom(cls2)) {
                    return new EnumType(cls2);
                }
                if (Serializable.class.isAssignableFrom(cls2)) {
                    return new SerializableType(cls2);
                }
            }
            throw new IllegalArgumentException(str3 + " is not Serializable or Parcelable.");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:6|7|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0 = BoolType;
        r0.parseValue(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        return StringType;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r0 = LongType;
        r0.parseValue(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r0 = FloatType;
        r0.parseValue(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        return r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0006 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.navigation.NavType inferFromValue(@androidx.annotation.NonNull java.lang.String r1) {
        /*
            androidx.navigation.NavType<java.lang.Integer> r0 = IntType     // Catch:{ IllegalArgumentException -> 0x0006 }
            r0.parseValue(r1)     // Catch:{ IllegalArgumentException -> 0x0006 }
            return r0
        L_0x0006:
            androidx.navigation.NavType<java.lang.Long> r0 = LongType     // Catch:{ IllegalArgumentException -> 0x000c }
            r0.parseValue(r1)     // Catch:{ IllegalArgumentException -> 0x000c }
            return r0
        L_0x000c:
            androidx.navigation.NavType<java.lang.Float> r0 = FloatType     // Catch:{ IllegalArgumentException -> 0x0012 }
            r0.parseValue(r1)     // Catch:{ IllegalArgumentException -> 0x0012 }
            return r0
        L_0x0012:
            androidx.navigation.NavType<java.lang.Boolean> r0 = BoolType     // Catch:{ IllegalArgumentException -> 0x0018 }
            r0.parseValue(r1)     // Catch:{ IllegalArgumentException -> 0x0018 }
            return r0
        L_0x0018:
            androidx.navigation.NavType<java.lang.String> r1 = StringType
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavType.inferFromValue(java.lang.String):androidx.navigation.NavType");
    }

    @NonNull
    static NavType inferFromValueType(@Nullable Object obj) {
        if (obj instanceof Integer) {
            return IntType;
        }
        if (obj instanceof int[]) {
            return IntArrayType;
        }
        if (obj instanceof Long) {
            return LongType;
        }
        if (obj instanceof long[]) {
            return LongArrayType;
        }
        if (obj instanceof Float) {
            return FloatType;
        }
        if (obj instanceof float[]) {
            return FloatArrayType;
        }
        if (obj instanceof Boolean) {
            return BoolType;
        }
        if (obj instanceof boolean[]) {
            return BoolArrayType;
        }
        if ((obj instanceof String) || obj == null) {
            return StringType;
        }
        if (obj instanceof String[]) {
            return StringArrayType;
        }
        if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new ParcelableArrayType(obj.getClass().getComponentType());
        }
        if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new SerializableArrayType(obj.getClass().getComponentType());
        }
        if (obj instanceof Parcelable) {
            return new ParcelableType(obj.getClass());
        }
        if (obj instanceof Enum) {
            return new EnumType(obj.getClass());
        }
        if (obj instanceof Serializable) {
            return new SerializableType(obj.getClass());
        }
        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
    }

    @Nullable
    public abstract T get(@NonNull Bundle bundle, @NonNull String str);

    @NonNull
    public abstract String getName();

    public boolean isNullableAllowed() {
        return this.mNullableAllowed;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public T parseAndPut(@NonNull Bundle bundle, @NonNull String str, @NonNull String str2) {
        T parseValue = parseValue(str2);
        put(bundle, str, parseValue);
        return parseValue;
    }

    @NonNull
    public abstract T parseValue(@NonNull String str);

    public abstract void put(@NonNull Bundle bundle, @NonNull String str, @Nullable T t);

    @NonNull
    public String toString() {
        return getName();
    }

    public static final class EnumType<D extends Enum> extends SerializableType<D> {
        @NonNull
        private final Class<D> mType;

        public EnumType(@NonNull Class<D> cls) {
            super(false, cls);
            if (cls.isEnum()) {
                this.mType = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is not an Enum type.");
        }

        @NonNull
        public String getName() {
            return this.mType.getName();
        }

        @NonNull
        public D parseValue(@NonNull String str) {
            for (D d : (Enum[]) this.mType.getEnumConstants()) {
                if (d.name().equals(str)) {
                    return d;
                }
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.mType.getName() + ".");
        }
    }
}
