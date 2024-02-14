package com.getpebble.android.kit.util;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class PebbleTuple {

    /* renamed from: f */
    private static final Charset f16168f = Charset.forName("UTF-8");

    /* renamed from: g */
    static final Map<String, C6912a> f16169g = new HashMap();

    /* renamed from: h */
    static final Map<Integer, C6913b> f16170h = new HashMap();

    /* renamed from: a */
    public final int f16171a;

    /* renamed from: b */
    public final C6912a f16172b;

    /* renamed from: c */
    public final C6913b f16173c;

    /* renamed from: d */
    public final int f16174d;

    /* renamed from: e */
    public final Object f16175e;

    public static class ValueOverflowException extends RuntimeException {
        public ValueOverflowException() {
            super("Value exceeds tuple capacity");
        }
    }

    /* renamed from: com.getpebble.android.kit.util.PebbleTuple$a */
    enum C6912a {
        BYTES(0),
        STRING(1),
        UINT(2),
        INT(3);
        
        public final byte ord;

        private C6912a(int i) {
            this.ord = (byte) i;
        }

        public String getName() {
            return name().toLowerCase(Locale.US);
        }
    }

    /* renamed from: com.getpebble.android.kit.util.PebbleTuple$b */
    enum C6913b {
        NONE(0),
        BYTE(1),
        SHORT(2),
        WORD(4);
        
        public final int value;

        private C6913b(int i) {
            this.value = i;
        }
    }

    static {
        for (C6912a aVar : C6912a.values()) {
            f16169g.put(aVar.getName(), aVar);
        }
        for (C6913b bVar : C6913b.values()) {
            f16170h.put(Integer.valueOf(bVar.value), bVar);
        }
    }

    private PebbleTuple(int i, C6912a aVar, C6913b bVar, int i2, Object obj) {
        this.f16171a = i;
        this.f16172b = aVar;
        this.f16173c = bVar;
        this.f16174d = i2;
        this.f16175e = obj;
    }

    /* renamed from: a */
    static PebbleTuple m26116a(int i, C6912a aVar, C6913b bVar, int i2) {
        return new PebbleTuple(i, aVar, bVar, bVar.value, Long.valueOf((long) i2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.getpebble.android.kit.util.PebbleTuple m26117b(int r7, com.getpebble.android.kit.util.PebbleTuple.C6912a r8, com.getpebble.android.kit.util.PebbleTuple.C6913b r9, java.lang.Object r10) {
        /*
            com.getpebble.android.kit.util.PebbleTuple$b r0 = com.getpebble.android.kit.util.PebbleTuple.C6913b.NONE
            if (r9 == r0) goto L_0x0008
            int r0 = r9.value
        L_0x0006:
            r5 = r0
            goto L_0x0026
        L_0x0008:
            com.getpebble.android.kit.util.PebbleTuple$a r0 = com.getpebble.android.kit.util.PebbleTuple.C6912a.BYTES
            if (r8 != r0) goto L_0x0011
            r0 = r10
            byte[] r0 = (byte[]) r0
            int r0 = r0.length
            goto L_0x0006
        L_0x0011:
            com.getpebble.android.kit.util.PebbleTuple$a r0 = com.getpebble.android.kit.util.PebbleTuple.C6912a.STRING
            if (r8 != r0) goto L_0x0020
            r0 = r10
            java.lang.String r0 = (java.lang.String) r0
            java.nio.charset.Charset r1 = f16168f
            byte[] r0 = r0.getBytes(r1)
            int r0 = r0.length
            goto L_0x0006
        L_0x0020:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x0026:
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r5 > r0) goto L_0x0036
            com.getpebble.android.kit.util.PebbleTuple r0 = new com.getpebble.android.kit.util.PebbleTuple
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        L_0x0036:
            com.getpebble.android.kit.util.PebbleTuple$ValueOverflowException r7 = new com.getpebble.android.kit.util.PebbleTuple$ValueOverflowException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getpebble.android.kit.util.PebbleTuple.m26117b(int, com.getpebble.android.kit.util.PebbleTuple$a, com.getpebble.android.kit.util.PebbleTuple$b, java.lang.Object):com.getpebble.android.kit.util.PebbleTuple");
    }
}
