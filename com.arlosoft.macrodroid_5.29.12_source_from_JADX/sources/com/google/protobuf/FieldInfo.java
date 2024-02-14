package com.google.protobuf;

import com.google.protobuf.Internal;
import java.lang.reflect.Field;

final class FieldInfo implements Comparable<FieldInfo> {

    /* renamed from: A */
    private final Field f56818A;

    /* renamed from: B */
    private final Class<?> f56819B;

    /* renamed from: C */
    private final Object f56820C;

    /* renamed from: D */
    private final Internal.EnumVerifier f56821D;

    /* renamed from: a */
    private final Field f56822a;

    /* renamed from: c */
    private final FieldType f56823c;

    /* renamed from: d */
    private final Class<?> f56824d;

    /* renamed from: f */
    private final int f56825f;

    /* renamed from: g */
    private final Field f56826g;

    /* renamed from: o */
    private final int f56827o;

    /* renamed from: p */
    private final boolean f56828p;

    /* renamed from: s */
    private final boolean f56829s;

    /* renamed from: z */
    private final OneofInfo f56830z;

    /* renamed from: com.google.protobuf.FieldInfo$1 */
    static /* synthetic */ class C115841 {

        /* renamed from: a */
        static final /* synthetic */ int[] f56831a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.google.protobuf.FieldType[] r0 = com.google.protobuf.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f56831a = r0
                com.google.protobuf.FieldType r1 = com.google.protobuf.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f56831a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.FieldType r1 = com.google.protobuf.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f56831a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.FieldType r1 = com.google.protobuf.FieldType.MESSAGE_LIST     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f56831a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.FieldType r1 = com.google.protobuf.FieldType.GROUP_LIST     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.FieldInfo.C115841.<clinit>():void");
        }
    }

    public static final class Builder {
        private Builder() {
        }
    }

    /* renamed from: b */
    public int compareTo(FieldInfo fieldInfo) {
        return this.f56825f - fieldInfo.f56825f;
    }

    /* renamed from: d */
    public Field mo65114d() {
        return this.f56818A;
    }

    /* renamed from: e */
    public Internal.EnumVerifier mo65115e() {
        return this.f56821D;
    }

    /* renamed from: f */
    public Field mo65116f() {
        return this.f56822a;
    }

    /* renamed from: g */
    public int mo65117g() {
        return this.f56825f;
    }

    /* renamed from: i */
    public Object mo65118i() {
        return this.f56820C;
    }

    /* renamed from: j */
    public Class<?> mo65119j() {
        int i = C115841.f56831a[this.f56823c.ordinal()];
        if (i == 1 || i == 2) {
            Field field = this.f56822a;
            return field != null ? field.getType() : this.f56819B;
        } else if (i == 3 || i == 4) {
            return this.f56824d;
        } else {
            return null;
        }
    }

    /* renamed from: k */
    public OneofInfo mo65120k() {
        return this.f56830z;
    }

    /* renamed from: l */
    public Field mo65121l() {
        return this.f56826g;
    }

    /* renamed from: m */
    public int mo65122m() {
        return this.f56827o;
    }

    /* renamed from: n */
    public FieldType mo65123n() {
        return this.f56823c;
    }

    /* renamed from: o */
    public boolean mo65124o() {
        return this.f56829s;
    }

    /* renamed from: q */
    public boolean mo65125q() {
        return this.f56828p;
    }
}
