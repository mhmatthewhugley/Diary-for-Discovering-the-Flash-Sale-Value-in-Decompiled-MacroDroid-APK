package com.google.android.gms.internal.places;

import java.lang.reflect.Type;

public enum zzaw {
    DOUBLE(0, r4, r8),
    FLOAT(1, r4, r10),
    INT64(2, r4, r5),
    UINT64(3, r4, r5),
    INT32(4, r4, r15),
    FIXED64(5, r4, r12),
    FIXED32(6, r4, r15),
    BOOL(7, r4, r19),
    STRING(8, r4, r21),
    MESSAGE(9, r4, r23),
    BYTES(10, r4, r25),
    UINT32(11, r4, r15),
    ENUM(12, r4, r28),
    SFIXED32(13, r4, r15),
    SFIXED64(14, r4, r12),
    SINT32(15, r4, r15),
    SINT64(16, r4, r12),
    GROUP(17, r4, r23),
    DOUBLE_LIST(18, r4, r8),
    FLOAT_LIST(19, r4, r10),
    INT64_LIST(20, r4, r5),
    UINT64_LIST(21, r4, r5),
    INT32_LIST(22, r4, r15),
    FIXED64_LIST(23, r4, r12),
    FIXED32_LIST(24, r4, r15),
    BOOL_LIST(25, r4, r19),
    STRING_LIST(26, r4, r21),
    MESSAGE_LIST(27, r4, r23),
    BYTES_LIST(28, r4, r25),
    UINT32_LIST(29, r4, r15),
    ENUM_LIST(30, r4, r28),
    SFIXED32_LIST(31, r4, r15),
    SFIXED64_LIST(32, r4, r12),
    SINT32_LIST(33, r4, r15),
    SINT64_LIST(34, r4, r12),
    DOUBLE_LIST_PACKED(35, r4, r8),
    FLOAT_LIST_PACKED(36, r4, r10),
    INT64_LIST_PACKED(37, r4, r5),
    UINT64_LIST_PACKED(38, r4, r5),
    INT32_LIST_PACKED(39, r4, r15),
    FIXED64_LIST_PACKED(40, r4, r12),
    FIXED32_LIST_PACKED(41, r4, r15),
    BOOL_LIST_PACKED(42, r4, r19),
    UINT32_LIST_PACKED(43, r4, r15),
    ENUM_LIST_PACKED(44, r4, r28),
    SFIXED32_LIST_PACKED(45, r4, r15),
    SFIXED64_LIST_PACKED(46, r4, r12),
    SINT32_LIST_PACKED(47, r4, r15),
    SINT64_LIST_PACKED(48, r4, r12),
    GROUP_LIST(49, r34, r23),
    MAP(50, zzay.MAP, zzbm.VOID);
    

    /* renamed from: q0 */
    private static final zzaw[] f45241q0 = null;

    /* renamed from: r0 */
    private static final Type[] f45242r0 = null;

    /* renamed from: id */
    private final int f45246id;
    private final zzbm zzhm;
    private final zzay zzhn;
    private final Class<?> zzho;
    private final boolean zzhp;

    static {
        int i;
        f45242r0 = new Type[0];
        zzaw[] values = values();
        f45241q0 = new zzaw[values.length];
        for (zzaw zzaw : values) {
            f45241q0[zzaw.f45246id] = zzaw;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        r5 = com.google.android.gms.internal.places.zzaz.f45253b[r6.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzaw(int r4, com.google.android.gms.internal.places.zzay r5, com.google.android.gms.internal.places.zzbm r6) {
        /*
            r1 = this;
            r1.<init>(r2, r3)
            r1.f45246id = r4
            r1.zzhn = r5
            r1.zzhm = r6
            int[] r2 = com.google.android.gms.internal.places.zzaz.f45252a
            int r3 = r5.ordinal()
            r2 = r2[r3]
            r3 = 2
            r4 = 1
            if (r2 == r4) goto L_0x0022
            if (r2 == r3) goto L_0x001b
            r2 = 0
            r1.zzho = r2
            goto L_0x0028
        L_0x001b:
            java.lang.Class r2 = r6.mo53480b()
            r1.zzho = r2
            goto L_0x0028
        L_0x0022:
            java.lang.Class r2 = r6.mo53480b()
            r1.zzho = r2
        L_0x0028:
            r2 = 0
            com.google.android.gms.internal.places.zzay r0 = com.google.android.gms.internal.places.zzay.SCALAR
            if (r5 != r0) goto L_0x003d
            int[] r5 = com.google.android.gms.internal.places.zzaz.f45253b
            int r6 = r6.ordinal()
            r5 = r5[r6]
            if (r5 == r4) goto L_0x003d
            if (r5 == r3) goto L_0x003d
            r3 = 3
            if (r5 == r3) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r4 = 0
        L_0x003e:
            r1.zzhp = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzaw.<init>(java.lang.String, int, int, com.google.android.gms.internal.places.zzay, com.google.android.gms.internal.places.zzbm):void");
    }

    /* renamed from: b */
    public final int mo53428b() {
        return this.f45246id;
    }
}
