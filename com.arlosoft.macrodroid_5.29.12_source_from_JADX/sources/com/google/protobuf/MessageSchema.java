package com.google.protobuf;

import com.google.protobuf.ArrayDecoders;
import com.google.protobuf.ByteString;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

final class MessageSchema<T> implements Schema<T> {

    /* renamed from: r */
    private static final int[] f57006r = new int[0];

    /* renamed from: s */
    private static final Unsafe f57007s = UnsafeUtil.m81361G();

    /* renamed from: a */
    private final int[] f57008a;

    /* renamed from: b */
    private final Object[] f57009b;

    /* renamed from: c */
    private final int f57010c;

    /* renamed from: d */
    private final int f57011d;

    /* renamed from: e */
    private final MessageLite f57012e;

    /* renamed from: f */
    private final boolean f57013f;

    /* renamed from: g */
    private final boolean f57014g;

    /* renamed from: h */
    private final boolean f57015h;

    /* renamed from: i */
    private final boolean f57016i;

    /* renamed from: j */
    private final int[] f57017j;

    /* renamed from: k */
    private final int f57018k;

    /* renamed from: l */
    private final int f57019l;

    /* renamed from: m */
    private final NewInstanceSchema f57020m;

    /* renamed from: n */
    private final ListFieldSchema f57021n;

    /* renamed from: o */
    private final UnknownFieldSchema<?, ?> f57022o;

    /* renamed from: p */
    private final ExtensionSchema<?> f57023p;

    /* renamed from: q */
    private final MapFieldSchema f57024q;

    /* renamed from: com.google.protobuf.MessageSchema$1 */
    static /* synthetic */ class C115981 {

        /* renamed from: a */
        static final /* synthetic */ int[] f57025a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f57025a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f57025a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f57025a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f57025a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f57025a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f57025a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f57025a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f57025a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f57025a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f57025a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f57025a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f57025a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f57025a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f57025a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f57025a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f57025a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f57025a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.C115981.<clinit>():void");
        }
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, boolean z, boolean z2, int[] iArr2, int i3, int i4, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        this.f57008a = iArr;
        this.f57009b = objArr;
        this.f57010c = i;
        this.f57011d = i2;
        this.f57014g = messageLite instanceof GeneratedMessageLite;
        this.f57015h = z;
        this.f57013f = extensionSchema != null && extensionSchema.mo65104e(messageLite);
        this.f57016i = z2;
        this.f57017j = iArr2;
        this.f57018k = i3;
        this.f57019l = i4;
        this.f57020m = newInstanceSchema;
        this.f57021n = listFieldSchema;
        this.f57022o = unknownFieldSchema;
        this.f57023p = extensionSchema;
        this.f57012e = messageLite;
        this.f57024q = mapFieldSchema;
    }

    /* renamed from: A */
    private static boolean m80916A(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: B */
    private boolean m80917B(T t, int i) {
        int h0 = m80948h0(i);
        long j = (long) (1048575 & h0);
        if (j == 1048575) {
            int s0 = m80969s0(i);
            long U = m80936U(s0);
            switch (m80967r0(s0)) {
                case 0:
                    if (UnsafeUtil.m81404z(t, U) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (UnsafeUtil.m81355A(t, U) != 0.0f) {
                        return true;
                    }
                    return false;
                case 2:
                    if (UnsafeUtil.m81358D(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (UnsafeUtil.m81358D(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (UnsafeUtil.m81356B(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (UnsafeUtil.m81358D(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (UnsafeUtil.m81356B(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return UnsafeUtil.m81397s(t, U);
                case 8:
                    Object F = UnsafeUtil.m81360F(t, U);
                    if (F instanceof String) {
                        return !((String) F).isEmpty();
                    }
                    if (F instanceof ByteString) {
                        return !ByteString.f56619a.equals(F);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (UnsafeUtil.m81360F(t, U) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    return !ByteString.f56619a.equals(UnsafeUtil.m81360F(t, U));
                case 11:
                    if (UnsafeUtil.m81356B(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (UnsafeUtil.m81356B(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (UnsafeUtil.m81356B(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (UnsafeUtil.m81358D(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (UnsafeUtil.m81356B(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (UnsafeUtil.m81358D(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (UnsafeUtil.m81360F(t, U) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((UnsafeUtil.m81356B(t, j) & (1 << (h0 >>> 20))) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: C */
    private boolean m80918C(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m80917B(t, i) : (i3 & i4) != 0;
    }

    /* renamed from: D */
    private static boolean m80919D(Object obj, int i, Schema schema) {
        return schema.mo65349f(UnsafeUtil.m81360F(obj, m80936U(i)));
    }

    /* renamed from: E */
    private <N> boolean m80920E(Object obj, int i, int i2) {
        List list = (List) UnsafeUtil.m81360F(obj, m80936U(i));
        if (list.isEmpty()) {
            return true;
        }
        Schema u = m80972u(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!u.mo65349f(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: F */
    private boolean m80921F(T t, int i, int i2) {
        Map<?, ?> e = this.f57024q.mo65336e(UnsafeUtil.m81360F(t, m80936U(i)));
        if (e.isEmpty()) {
            return true;
        }
        if (this.f57024q.mo65333b(m80970t(i2)).f57001c.mo65548b() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        Schema<?> schema = null;
        for (Object next : e.values()) {
            if (schema == null) {
                schema = Protobuf.m81041a().mo65366d(next.getClass());
            }
            if (!schema.mo65349f(next)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    private boolean m80922G(T t, T t2, int i) {
        long h0 = (long) (m80948h0(i) & 1048575);
        return UnsafeUtil.m81356B(t, h0) == UnsafeUtil.m81356B(t2, h0);
    }

    /* renamed from: H */
    private boolean m80923H(T t, int i, int i2) {
        return UnsafeUtil.m81356B(t, (long) (m80948h0(i2) & 1048575)) == i;
    }

    /* renamed from: I */
    private static boolean m80924I(int i) {
        return (i & 268435456) != 0;
    }

    /* renamed from: J */
    private static List<?> m80925J(Object obj, long j) {
        return (List) UnsafeUtil.m81360F(obj, j);
    }

    /* renamed from: K */
    private static <T> long m80926K(T t, long j) {
        return UnsafeUtil.m81358D(t, j);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: L */
    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> void m80927L(com.google.protobuf.UnknownFieldSchema<UT, UB> r17, com.google.protobuf.ExtensionSchema<ET> r18, T r19, com.google.protobuf.Reader r20, com.google.protobuf.ExtensionRegistryLite r21) throws java.io.IOException {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r10 = r19
            r0 = r20
            r11 = r21
            r12 = 0
            r13 = r12
            r14 = r13
        L_0x000d:
            int r1 = r20.mo64772G()     // Catch:{ all -> 0x0612 }
            int r3 = r8.m80946f0(r1)     // Catch:{ all -> 0x0612 }
            if (r3 >= 0) goto L_0x008e
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0033
            int r0 = r8.f57018k
        L_0x001e:
            int r1 = r8.f57019l
            if (r0 >= r1) goto L_0x002d
            int[] r1 = r8.f57017j
            r1 = r1[r0]
            java.lang.Object r13 = r8.m80962p(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x001e
        L_0x002d:
            if (r13 == 0) goto L_0x0032
            r9.mo65456o(r10, r13)
        L_0x0032:
            return
        L_0x0033:
            boolean r2 = r8.f57013f     // Catch:{ all -> 0x0612 }
            if (r2 != 0) goto L_0x003b
            r15 = r18
            r3 = r12
            goto L_0x0044
        L_0x003b:
            com.google.protobuf.MessageLite r2 = r8.f57012e     // Catch:{ all -> 0x0612 }
            r15 = r18
            java.lang.Object r1 = r15.mo65101b(r11, r2, r1)     // Catch:{ all -> 0x0612 }
            r3 = r1
        L_0x0044:
            if (r3 == 0) goto L_0x005c
            if (r14 != 0) goto L_0x004d
            com.google.protobuf.FieldSet r1 = r18.mo65103d(r19)     // Catch:{ all -> 0x0612 }
            r14 = r1
        L_0x004d:
            r1 = r18
            r2 = r20
            r4 = r21
            r5 = r14
            r6 = r13
            r7 = r17
            java.lang.Object r13 = r1.mo65106g(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0612 }
            goto L_0x000d
        L_0x005c:
            boolean r1 = r9.mo65458q(r0)     // Catch:{ all -> 0x0612 }
            if (r1 == 0) goto L_0x0069
            boolean r1 = r20.mo64776K()     // Catch:{ all -> 0x0612 }
            if (r1 == 0) goto L_0x0077
            goto L_0x000d
        L_0x0069:
            if (r13 != 0) goto L_0x0070
            java.lang.Object r1 = r9.mo65447f(r10)     // Catch:{ all -> 0x0612 }
            r13 = r1
        L_0x0070:
            boolean r1 = r9.mo65454m(r13, r0)     // Catch:{ all -> 0x0612 }
            if (r1 == 0) goto L_0x0077
            goto L_0x000d
        L_0x0077:
            int r0 = r8.f57018k
        L_0x0079:
            int r1 = r8.f57019l
            if (r0 >= r1) goto L_0x0088
            int[] r1 = r8.f57017j
            r1 = r1[r0]
            java.lang.Object r13 = r8.m80962p(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x0079
        L_0x0088:
            if (r13 == 0) goto L_0x008d
            r9.mo65456o(r10, r13)
        L_0x008d:
            return
        L_0x008e:
            r15 = r18
            int r4 = r8.m80969s0(r3)     // Catch:{ all -> 0x0612 }
            int r2 = m80967r0(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            switch(r2) {
                case 0: goto L_0x059d;
                case 1: goto L_0x058d;
                case 2: goto L_0x057d;
                case 3: goto L_0x056d;
                case 4: goto L_0x055d;
                case 5: goto L_0x054d;
                case 6: goto L_0x053d;
                case 7: goto L_0x052d;
                case 8: goto L_0x0525;
                case 9: goto L_0x04ee;
                case 10: goto L_0x04de;
                case 11: goto L_0x04ce;
                case 12: goto L_0x04ab;
                case 13: goto L_0x049b;
                case 14: goto L_0x048b;
                case 15: goto L_0x047b;
                case 16: goto L_0x046b;
                case 17: goto L_0x0434;
                case 18: goto L_0x0425;
                case 19: goto L_0x0416;
                case 20: goto L_0x0407;
                case 21: goto L_0x03f8;
                case 22: goto L_0x03e9;
                case 23: goto L_0x03da;
                case 24: goto L_0x03cb;
                case 25: goto L_0x03bc;
                case 26: goto L_0x03b7;
                case 27: goto L_0x03a5;
                case 28: goto L_0x0396;
                case 29: goto L_0x0387;
                case 30: goto L_0x0370;
                case 31: goto L_0x0361;
                case 32: goto L_0x0352;
                case 33: goto L_0x0343;
                case 34: goto L_0x0334;
                case 35: goto L_0x0325;
                case 36: goto L_0x0316;
                case 37: goto L_0x0307;
                case 38: goto L_0x02f8;
                case 39: goto L_0x02e9;
                case 40: goto L_0x02da;
                case 41: goto L_0x02cb;
                case 42: goto L_0x02bc;
                case 43: goto L_0x02ad;
                case 44: goto L_0x0296;
                case 45: goto L_0x0287;
                case 46: goto L_0x0278;
                case 47: goto L_0x0269;
                case 48: goto L_0x025a;
                case 49: goto L_0x0244;
                case 50: goto L_0x0233;
                case 51: goto L_0x021f;
                case 52: goto L_0x020b;
                case 53: goto L_0x01f7;
                case 54: goto L_0x01e3;
                case 55: goto L_0x01cf;
                case 56: goto L_0x01bb;
                case 57: goto L_0x01a7;
                case 58: goto L_0x0193;
                case 59: goto L_0x018b;
                case 60: goto L_0x0152;
                case 61: goto L_0x0142;
                case 62: goto L_0x012e;
                case 63: goto L_0x0107;
                case 64: goto L_0x00f3;
                case 65: goto L_0x00df;
                case 66: goto L_0x00cb;
                case 67: goto L_0x00b7;
                case 68: goto L_0x00a3;
                default: goto L_0x009b;
            }     // Catch:{ InvalidWireTypeException -> 0x05cb }
        L_0x009b:
            if (r13 != 0) goto L_0x05ae
            java.lang.Object r1 = r17.mo65455n()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x05ad
        L_0x00a3:
            long r4 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.Schema r2 = r8.m80972u(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = r0.mo64766A(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81376V(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80961o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x00b7:
            long r4 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo64770E()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81376V(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80961o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x00cb:
            long r4 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo64798n()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81376V(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80961o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x00df:
            long r4 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo64792h()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81376V(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80961o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x00f3:
            long r4 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo64777L()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81376V(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80961o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0107:
            int r2 = r20.mo64797m()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.Internal$EnumVerifier r5 = r8.m80968s(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r5 == 0) goto L_0x011e
            boolean r5 = r5.mo60055a(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r5 == 0) goto L_0x0118
            goto L_0x011e
        L_0x0118:
            java.lang.Object r13 = com.google.protobuf.SchemaUtil.m81156L(r1, r2, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x011e:
            long r4 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81376V(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80961o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x012e:
            long r4 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo64794j()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81376V(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80961o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0142:
            long r4 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.ByteString r2 = r20.mo64805s()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81376V(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80961o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0152:
            boolean r2 = r8.m80923H(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r2 == 0) goto L_0x0174
            long r5 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = com.google.protobuf.UnsafeUtil.m81360F(r10, r5)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.Schema r5 = r8.m80972u(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r5 = r0.mo64774I(r5, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = com.google.protobuf.Internal.m80739h(r2, r5)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81376V(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x0186
        L_0x0174:
            long r4 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.Schema r2 = r8.m80972u(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = r0.mo64774I(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81376V(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80959n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
        L_0x0186:
            r8.m80961o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x018b:
            r8.m80953k0(r10, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80961o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0193:
            long r4 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            boolean r2 = r20.mo64790f()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81376V(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80961o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01a7:
            long r4 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo64812z()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81376V(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80961o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01bb:
            long r4 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo64784b()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81376V(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80961o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01cf:
            long r4 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo64806t()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81376V(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80961o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01e3:
            long r4 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo64809w()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81376V(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80961o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01f7:
            long r4 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo64780O()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81376V(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80961o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x020b:
            long r4 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            float r2 = r20.readFloat()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81376V(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80961o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x021f:
            long r4 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            double r6 = r20.readDouble()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81376V(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80961o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0233:
            java.lang.Object r4 = r8.m80970t(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r1 = r16
            r2 = r19
            r5 = r21
            r6 = r20
            r1.m80928M(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0244:
            long r4 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.Schema r6 = r8.m80972u(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r1 = r16
            r2 = r19
            r3 = r4
            r5 = r20
            r7 = r21
            r1.m80949i0(r2, r3, r5, r6, r7)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x025a:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64787d(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0269:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64808v(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0278:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64767B(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0287:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64786c(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0296:
            com.google.protobuf.ListFieldSchema r2 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r2 = r2.mo65303e(r10, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64796l(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.Internal$EnumVerifier r3 = r8.m80968s(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r13 = com.google.protobuf.SchemaUtil.m81145A(r1, r2, r3, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02ad:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64810x(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02bc:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64799o(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02cb:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64769D(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02da:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64807u(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02e9:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64768C(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02f8:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64793i(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0307:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64795k(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0316:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64775J(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0325:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64779N(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0334:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64787d(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0343:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64808v(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0352:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64767B(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0361:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64786c(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0370:
            com.google.protobuf.ListFieldSchema r2 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r2 = r2.mo65303e(r10, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64796l(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.Internal$EnumVerifier r3 = r8.m80968s(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r13 = com.google.protobuf.SchemaUtil.m81145A(r1, r2, r3, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0387:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64810x(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0396:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64778M(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03a5:
            com.google.protobuf.Schema r5 = r8.m80972u(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r1 = r16
            r2 = r19
            r3 = r4
            r4 = r20
            r6 = r21
            r1.m80951j0(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03b7:
            r8.m80955l0(r10, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03bc:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64799o(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03cb:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64769D(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03da:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64807u(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03e9:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64768C(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03f8:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64793i(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0407:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64795k(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0416:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64775J(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0425:
            com.google.protobuf.ListFieldSchema r1 = r8.f57021n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo65303e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo64779N(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0434:
            boolean r1 = r8.m80917B(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r1 == 0) goto L_0x0457
            long r1 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r1 = com.google.protobuf.UnsafeUtil.m81360F(r10, r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.Schema r2 = r8.m80972u(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = r0.mo64766A(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r1 = com.google.protobuf.Internal.m80739h(r1, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81376V(r10, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0457:
            long r1 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.Schema r4 = r8.m80972u(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r4 = r0.mo64766A(r4, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81376V(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80959n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x046b:
            long r1 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo64770E()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81375U(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80959n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x047b:
            long r1 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo64798n()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81374T(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80959n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x048b:
            long r1 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo64792h()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81375U(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80959n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x049b:
            long r1 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo64777L()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81374T(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80959n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04ab:
            int r2 = r20.mo64797m()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.Internal$EnumVerifier r5 = r8.m80968s(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r5 == 0) goto L_0x04c2
            boolean r5 = r5.mo60055a(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r5 == 0) goto L_0x04bc
            goto L_0x04c2
        L_0x04bc:
            java.lang.Object r13 = com.google.protobuf.SchemaUtil.m81156L(r1, r2, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04c2:
            long r4 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81374T(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80959n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04ce:
            long r1 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo64794j()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81374T(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80959n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04de:
            long r1 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.ByteString r4 = r20.mo64805s()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81376V(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80959n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04ee:
            boolean r1 = r8.m80917B(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r1 == 0) goto L_0x0511
            long r1 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r1 = com.google.protobuf.UnsafeUtil.m81360F(r10, r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.Schema r2 = r8.m80972u(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = r0.mo64774I(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r1 = com.google.protobuf.Internal.m80739h(r1, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81376V(r10, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0511:
            long r1 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.Schema r4 = r8.m80972u(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r4 = r0.mo64774I(r4, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81376V(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80959n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0525:
            r8.m80953k0(r10, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80959n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x052d:
            long r1 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            boolean r4 = r20.mo64790f()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81365K(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80959n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x053d:
            long r1 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo64812z()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81374T(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80959n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x054d:
            long r1 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo64784b()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81375U(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80959n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x055d:
            long r1 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo64806t()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81374T(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80959n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x056d:
            long r1 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo64809w()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81375U(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80959n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x057d:
            long r1 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo64780O()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81375U(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80959n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x058d:
            long r1 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            float r4 = r20.readFloat()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81373S(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80959n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x059d:
            long r1 = m80936U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            double r4 = r20.readDouble()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.UnsafeUtil.m81372R(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m80959n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x05ad:
            r13 = r1
        L_0x05ae:
            boolean r1 = r9.mo65454m(r13, r0)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f57018k
        L_0x05b6:
            int r1 = r8.f57019l
            if (r0 >= r1) goto L_0x05c5
            int[] r1 = r8.f57017j
            r1 = r1[r0]
            java.lang.Object r13 = r8.m80962p(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05b6
        L_0x05c5:
            if (r13 == 0) goto L_0x05ca
            r9.mo65456o(r10, r13)
        L_0x05ca:
            return
        L_0x05cb:
            boolean r1 = r9.mo65458q(r0)     // Catch:{ all -> 0x0612 }
            if (r1 == 0) goto L_0x05ee
            boolean r1 = r20.mo64776K()     // Catch:{ all -> 0x0612 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f57018k
        L_0x05d9:
            int r1 = r8.f57019l
            if (r0 >= r1) goto L_0x05e8
            int[] r1 = r8.f57017j
            r1 = r1[r0]
            java.lang.Object r13 = r8.m80962p(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05d9
        L_0x05e8:
            if (r13 == 0) goto L_0x05ed
            r9.mo65456o(r10, r13)
        L_0x05ed:
            return
        L_0x05ee:
            if (r13 != 0) goto L_0x05f5
            java.lang.Object r1 = r9.mo65447f(r10)     // Catch:{ all -> 0x0612 }
            r13 = r1
        L_0x05f5:
            boolean r1 = r9.mo65454m(r13, r0)     // Catch:{ all -> 0x0612 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f57018k
        L_0x05fd:
            int r1 = r8.f57019l
            if (r0 >= r1) goto L_0x060c
            int[] r1 = r8.f57017j
            r1 = r1[r0]
            java.lang.Object r13 = r8.m80962p(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05fd
        L_0x060c:
            if (r13 == 0) goto L_0x0611
            r9.mo65456o(r10, r13)
        L_0x0611:
            return
        L_0x0612:
            r0 = move-exception
            int r1 = r8.f57018k
        L_0x0615:
            int r2 = r8.f57019l
            if (r1 >= r2) goto L_0x0624
            int[] r2 = r8.f57017j
            r2 = r2[r1]
            java.lang.Object r13 = r8.m80962p(r10, r2, r13, r9)
            int r1 = r1 + 1
            goto L_0x0615
        L_0x0624:
            if (r13 == 0) goto L_0x0629
            r9.mo65456o(r10, r13)
        L_0x0629:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.m80927L(com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, java.lang.Object, com.google.protobuf.Reader, com.google.protobuf.ExtensionRegistryLite):void");
    }

    /* renamed from: M */
    private final <K, V> void m80928M(Object obj, int i, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) throws IOException {
        long U = m80936U(m80969s0(i));
        Object F = UnsafeUtil.m81360F(obj, U);
        if (F == null) {
            F = this.f57024q.mo65335d(obj2);
            UnsafeUtil.m81376V(obj, U, F);
        } else if (this.f57024q.mo65339h(F)) {
            Object d = this.f57024q.mo65335d(obj2);
            this.f57024q.mo65332a(d, F);
            UnsafeUtil.m81376V(obj, U, d);
            F = d;
        }
        reader.mo64801q(this.f57024q.mo65334c(F), this.f57024q.mo65333b(obj2), extensionRegistryLite);
    }

    /* renamed from: N */
    private void m80929N(T t, T t2, int i) {
        long U = m80936U(m80969s0(i));
        if (m80917B(t2, i)) {
            Object F = UnsafeUtil.m81360F(t, U);
            Object F2 = UnsafeUtil.m81360F(t2, U);
            if (F != null && F2 != null) {
                UnsafeUtil.m81376V(t, U, Internal.m80739h(F, F2));
                m80959n0(t, i);
            } else if (F2 != null) {
                UnsafeUtil.m81376V(t, U, F2);
                m80959n0(t, i);
            }
        }
    }

    /* renamed from: O */
    private void m80930O(T t, T t2, int i) {
        int s0 = m80969s0(i);
        int T = m80935T(i);
        long U = m80936U(s0);
        if (m80923H(t2, T, i)) {
            Object obj = null;
            if (m80923H(t, T, i)) {
                obj = UnsafeUtil.m81360F(t, U);
            }
            Object F = UnsafeUtil.m81360F(t2, U);
            if (obj != null && F != null) {
                UnsafeUtil.m81376V(t, U, Internal.m80739h(obj, F));
                m80961o0(t, T, i);
            } else if (F != null) {
                UnsafeUtil.m81376V(t, U, F);
                m80961o0(t, T, i);
            }
        }
    }

    /* renamed from: P */
    private void m80931P(T t, T t2, int i) {
        int s0 = m80969s0(i);
        long U = m80936U(s0);
        int T = m80935T(i);
        switch (m80967r0(s0)) {
            case 0:
                if (m80917B(t2, i)) {
                    UnsafeUtil.m81372R(t, U, UnsafeUtil.m81404z(t2, U));
                    m80959n0(t, i);
                    return;
                }
                return;
            case 1:
                if (m80917B(t2, i)) {
                    UnsafeUtil.m81373S(t, U, UnsafeUtil.m81355A(t2, U));
                    m80959n0(t, i);
                    return;
                }
                return;
            case 2:
                if (m80917B(t2, i)) {
                    UnsafeUtil.m81375U(t, U, UnsafeUtil.m81358D(t2, U));
                    m80959n0(t, i);
                    return;
                }
                return;
            case 3:
                if (m80917B(t2, i)) {
                    UnsafeUtil.m81375U(t, U, UnsafeUtil.m81358D(t2, U));
                    m80959n0(t, i);
                    return;
                }
                return;
            case 4:
                if (m80917B(t2, i)) {
                    UnsafeUtil.m81374T(t, U, UnsafeUtil.m81356B(t2, U));
                    m80959n0(t, i);
                    return;
                }
                return;
            case 5:
                if (m80917B(t2, i)) {
                    UnsafeUtil.m81375U(t, U, UnsafeUtil.m81358D(t2, U));
                    m80959n0(t, i);
                    return;
                }
                return;
            case 6:
                if (m80917B(t2, i)) {
                    UnsafeUtil.m81374T(t, U, UnsafeUtil.m81356B(t2, U));
                    m80959n0(t, i);
                    return;
                }
                return;
            case 7:
                if (m80917B(t2, i)) {
                    UnsafeUtil.m81365K(t, U, UnsafeUtil.m81397s(t2, U));
                    m80959n0(t, i);
                    return;
                }
                return;
            case 8:
                if (m80917B(t2, i)) {
                    UnsafeUtil.m81376V(t, U, UnsafeUtil.m81360F(t2, U));
                    m80959n0(t, i);
                    return;
                }
                return;
            case 9:
                m80929N(t, t2, i);
                return;
            case 10:
                if (m80917B(t2, i)) {
                    UnsafeUtil.m81376V(t, U, UnsafeUtil.m81360F(t2, U));
                    m80959n0(t, i);
                    return;
                }
                return;
            case 11:
                if (m80917B(t2, i)) {
                    UnsafeUtil.m81374T(t, U, UnsafeUtil.m81356B(t2, U));
                    m80959n0(t, i);
                    return;
                }
                return;
            case 12:
                if (m80917B(t2, i)) {
                    UnsafeUtil.m81374T(t, U, UnsafeUtil.m81356B(t2, U));
                    m80959n0(t, i);
                    return;
                }
                return;
            case 13:
                if (m80917B(t2, i)) {
                    UnsafeUtil.m81374T(t, U, UnsafeUtil.m81356B(t2, U));
                    m80959n0(t, i);
                    return;
                }
                return;
            case 14:
                if (m80917B(t2, i)) {
                    UnsafeUtil.m81375U(t, U, UnsafeUtil.m81358D(t2, U));
                    m80959n0(t, i);
                    return;
                }
                return;
            case 15:
                if (m80917B(t2, i)) {
                    UnsafeUtil.m81374T(t, U, UnsafeUtil.m81356B(t2, U));
                    m80959n0(t, i);
                    return;
                }
                return;
            case 16:
                if (m80917B(t2, i)) {
                    UnsafeUtil.m81375U(t, U, UnsafeUtil.m81358D(t2, U));
                    m80959n0(t, i);
                    return;
                }
                return;
            case 17:
                m80929N(t, t2, i);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f57021n.mo65302d(t, t2, U);
                return;
            case 50:
                SchemaUtil.m81150F(this.f57024q, t, t2, U);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (m80923H(t2, T, i)) {
                    UnsafeUtil.m81376V(t, U, UnsafeUtil.m81360F(t2, U));
                    m80961o0(t, T, i);
                    return;
                }
                return;
            case 60:
                m80930O(t, t2, i);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (m80923H(t2, T, i)) {
                    UnsafeUtil.m81376V(t, U, UnsafeUtil.m81360F(t2, U));
                    m80961o0(t, T, i);
                    return;
                }
                return;
            case 68:
                m80930O(t, t2, i);
                return;
            default:
                return;
        }
    }

    /* renamed from: Q */
    static <T> MessageSchema<T> m80932Q(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        if (messageInfo instanceof RawMessageInfo) {
            return m80934S((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
        }
        return m80933R((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* renamed from: R */
    static <T> MessageSchema<T> m80933R(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int i;
        int i2;
        int i3;
        boolean z = structuralMessageInfo.mo65342c() == ProtoSyntax.PROTO3;
        FieldInfo[] e = structuralMessageInfo.mo65433e();
        if (e.length == 0) {
            i2 = 0;
            i = 0;
        } else {
            i2 = e[0].mo65117g();
            i = e[e.length - 1].mo65117g();
        }
        int length = e.length;
        int[] iArr = new int[(length * 3)];
        Object[] objArr = new Object[(length * 2)];
        int i4 = 0;
        int i5 = 0;
        for (FieldInfo fieldInfo : e) {
            if (fieldInfo.mo65123n() == FieldType.MAP) {
                i4++;
            } else if (fieldInfo.mo65123n().mo65148b() >= 18 && fieldInfo.mo65123n().mo65148b() <= 49) {
                i5++;
            }
        }
        int[] iArr2 = null;
        int[] iArr3 = i4 > 0 ? new int[i4] : null;
        if (i5 > 0) {
            iArr2 = new int[i5];
        }
        int[] d = structuralMessageInfo.mo65432d();
        if (d == null) {
            d = f57006r;
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i6 < e.length) {
            FieldInfo fieldInfo2 = e[i6];
            int g = fieldInfo2.mo65117g();
            m80965q0(fieldInfo2, iArr, i7, objArr);
            if (i8 < d.length && d[i8] == g) {
                d[i8] = i7;
                i8++;
            }
            if (fieldInfo2.mo65123n() == FieldType.MAP) {
                iArr3[i9] = i7;
                i9++;
            } else if (fieldInfo2.mo65123n().mo65148b() >= 18 && fieldInfo2.mo65123n().mo65148b() <= 49) {
                i3 = i7;
                iArr2[i10] = (int) UnsafeUtil.m81364J(fieldInfo2.mo65116f());
                i10++;
                i6++;
                i7 = i3 + 3;
            }
            i3 = i7;
            i6++;
            i7 = i3 + 3;
        }
        if (iArr3 == null) {
            iArr3 = f57006r;
        }
        if (iArr2 == null) {
            iArr2 = f57006r;
        }
        int[] iArr4 = new int[(d.length + iArr3.length + iArr2.length)];
        System.arraycopy(d, 0, iArr4, 0, d.length);
        System.arraycopy(iArr3, 0, iArr4, d.length, iArr3.length);
        System.arraycopy(iArr2, 0, iArr4, d.length + iArr3.length, iArr2.length);
        return new MessageSchema(iArr, objArr, i2, i, structuralMessageInfo.mo65341b(), z, true, iArr4, d.length, d.length + iArr3.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x036e  */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.protobuf.MessageSchema<T> m80934S(com.google.protobuf.RawMessageInfo r34, com.google.protobuf.NewInstanceSchema r35, com.google.protobuf.ListFieldSchema r36, com.google.protobuf.UnknownFieldSchema<?, ?> r37, com.google.protobuf.ExtensionSchema<?> r38, com.google.protobuf.MapFieldSchema r39) {
        /*
            com.google.protobuf.ProtoSyntax r0 = r34.mo65342c()
            com.google.protobuf.ProtoSyntax r1 = com.google.protobuf.ProtoSyntax.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = 0
        L_0x000c:
            java.lang.String r0 = r34.mo65373e()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0028
            r4 = 1
        L_0x001e:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0029
            r4 = r6
            goto L_0x001e
        L_0x0028:
            r6 = 1
        L_0x0029:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0048
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0035:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0045
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0035
        L_0x0045:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0048:
            if (r6 != 0) goto L_0x0057
            int[] r6 = f57006r
            r13 = r6
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            goto L_0x0161
        L_0x0057:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0076
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0063:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0073
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0063
        L_0x0073:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0076:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0095
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0082:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0092
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0082
        L_0x0092:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0095:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b4
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a1:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b1
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a1
        L_0x00b1:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b4:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d3
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c0:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c0
        L_0x00d0:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d3:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00df:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ef
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00df
        L_0x00ef:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f2:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0111
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fe:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fe
        L_0x010e:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0111:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0132
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011d:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011d
        L_0x012e:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0132:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0155
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013e:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0150
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013e
        L_0x0150:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0155:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 * 2
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
        L_0x0161:
            sun.misc.Unsafe r15 = f57007s
            java.lang.Object[] r17 = r34.mo65372d()
            com.google.protobuf.MessageLite r18 = r34.mo65341b()
            java.lang.Class r2 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 * 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r20 = r14 + r12
            r22 = r14
            r23 = r20
            r12 = 0
            r21 = 0
        L_0x0180:
            if (r4 >= r1) goto L_0x03c0
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01a8
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x0190:
            int r26 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01a2
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r4 = r4 | r3
            int r24 = r24 + 13
            r3 = r26
            goto L_0x0190
        L_0x01a2:
            int r3 = r3 << r24
            r4 = r4 | r3
            r3 = r26
            goto L_0x01aa
        L_0x01a8:
            r3 = r24
        L_0x01aa:
            int r24 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01d7
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01b8:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r1) goto L_0x01d1
            r1 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r24
            r3 = r3 | r1
            int r24 = r24 + 13
            r5 = r27
            r1 = r28
            goto L_0x01b8
        L_0x01d1:
            int r1 = r5 << r24
            r3 = r3 | r1
            r1 = r27
            goto L_0x01db
        L_0x01d7:
            r28 = r1
            r1 = r24
        L_0x01db:
            r5 = r3 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r3 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01e8
            int r14 = r12 + 1
            r13[r12] = r21
            r12 = r14
        L_0x01e8:
            r14 = 51
            r30 = r12
            if (r5 < r14) goto L_0x0286
            int r14 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0217
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
        L_0x01fd:
            int r33 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r12) goto L_0x0212
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r32
            r1 = r1 | r12
            int r32 = r32 + 13
            r14 = r33
            r12 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01fd
        L_0x0212:
            int r12 = r14 << r32
            r1 = r1 | r12
            r14 = r33
        L_0x0217:
            int r12 = r5 + -51
            r32 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0237
            r14 = 17
            if (r12 != r14) goto L_0x0224
            goto L_0x0237
        L_0x0224:
            r14 = 12
            if (r12 != r14) goto L_0x0245
            if (r10 != 0) goto L_0x0245
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0243
        L_0x0237:
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0243:
            r16 = r14
        L_0x0245:
            int r1 = r1 * 2
            r12 = r17[r1]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0250
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0258
        L_0x0250:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m80957m0(r2, r12)
            r17[r1] = r12
        L_0x0258:
            r14 = r8
            r33 = r9
            long r8 = r15.objectFieldOffset(r12)
            int r9 = (int) r8
            int r1 = r1 + 1
            r8 = r17[r1]
            boolean r12 = r8 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x026b
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x0273
        L_0x026b:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m80957m0(r2, r8)
            r17[r1] = r8
        L_0x0273:
            r1 = r9
            long r8 = r15.objectFieldOffset(r8)
            int r9 = (int) r8
            r31 = r0
            r0 = r10
            r8 = r11
            r29 = r32
            r25 = 1
            r10 = r9
            r9 = r1
            r1 = 0
            goto L_0x0388
        L_0x0286:
            r14 = r8
            r33 = r9
            int r8 = r16 + 1
            r9 = r17[r16]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m80957m0(r2, r9)
            r12 = 9
            if (r5 == r12) goto L_0x02fe
            r12 = 17
            if (r5 != r12) goto L_0x029c
            goto L_0x02fe
        L_0x029c:
            r12 = 27
            if (r5 == r12) goto L_0x02ed
            r12 = 49
            if (r5 != r12) goto L_0x02a5
            goto L_0x02ed
        L_0x02a5:
            r12 = 12
            if (r5 == r12) goto L_0x02dc
            r12 = 30
            if (r5 == r12) goto L_0x02dc
            r12 = 44
            if (r5 != r12) goto L_0x02b2
            goto L_0x02dc
        L_0x02b2:
            r12 = 50
            if (r5 != r12) goto L_0x02d2
            int r12 = r22 + 1
            r13[r22] = r21
            int r22 = r21 / 3
            int r22 = r22 * 2
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r22] = r8
            r8 = r3 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x02d5
            int r22 = r22 + 1
            int r8 = r27 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02d2:
            r25 = 1
            goto L_0x030c
        L_0x02d5:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x030d
        L_0x02dc:
            if (r10 != 0) goto L_0x02d2
            int r12 = r21 / 3
            int r12 = r12 * 2
            r25 = 1
            int r12 = r12 + 1
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r12] = r8
            goto L_0x02fb
        L_0x02ed:
            r25 = 1
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r12] = r8
        L_0x02fb:
            r12 = r27
            goto L_0x030d
        L_0x02fe:
            r25 = 1
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            java.lang.Class r27 = r9.getType()
            r11[r12] = r27
        L_0x030c:
            r12 = r8
        L_0x030d:
            long r8 = r15.objectFieldOffset(r9)
            int r9 = (int) r8
            r8 = r3 & 4096(0x1000, float:5.74E-42)
            r27 = r12
            r12 = 4096(0x1000, float:5.74E-42)
            if (r8 != r12) goto L_0x031c
            r8 = 1
            goto L_0x031d
        L_0x031c:
            r8 = 0
        L_0x031d:
            if (r8 == 0) goto L_0x036e
            r8 = 17
            if (r5 > r8) goto L_0x036e
            int r8 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0348
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x0332:
            int r29 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r12) goto L_0x0344
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r26
            r1 = r1 | r8
            int r26 = r26 + 13
            r8 = r29
            goto L_0x0332
        L_0x0344:
            int r8 = r8 << r26
            r1 = r1 | r8
            goto L_0x034a
        L_0x0348:
            r29 = r8
        L_0x034a:
            int r8 = r6 * 2
            int r26 = r1 / 32
            int r8 = r8 + r26
            r12 = r17[r8]
            r31 = r0
            boolean r0 = r12 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x035b
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0363
        L_0x035b:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m80957m0(r2, r12)
            r17[r8] = r12
        L_0x0363:
            r0 = r10
            r8 = r11
            long r10 = r15.objectFieldOffset(r12)
            int r11 = (int) r10
            int r1 = r1 % 32
            r10 = r11
            goto L_0x0378
        L_0x036e:
            r31 = r0
            r0 = r10
            r8 = r11
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r1
            r1 = 0
        L_0x0378:
            r11 = 18
            if (r5 < r11) goto L_0x0386
            r11 = 49
            if (r5 > r11) goto L_0x0386
            int r11 = r23 + 1
            r13[r23] = r9
            r23 = r11
        L_0x0386:
            r16 = r27
        L_0x0388:
            int r11 = r21 + 1
            r7[r21] = r4
            int r4 = r11 + 1
            r12 = r3 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0395
            r12 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0396
        L_0x0395:
            r12 = 0
        L_0x0396:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x039d
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x039e
        L_0x039d:
            r3 = 0
        L_0x039e:
            r3 = r3 | r12
            int r5 = r5 << 20
            r3 = r3 | r5
            r3 = r3 | r9
            r7[r11] = r3
            int r21 = r4 + 1
            int r1 = r1 << 20
            r1 = r1 | r10
            r7[r4] = r1
            r10 = r0
            r11 = r8
            r8 = r14
            r14 = r24
            r1 = r28
            r4 = r29
            r12 = r30
            r0 = r31
            r9 = r33
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0180
        L_0x03c0:
            r33 = r9
            r0 = r10
            r24 = r14
            r14 = r8
            r8 = r11
            com.google.protobuf.MessageSchema r1 = new com.google.protobuf.MessageSchema
            com.google.protobuf.MessageLite r9 = r34.mo65341b()
            r11 = 0
            r4 = r1
            r5 = r7
            r6 = r8
            r7 = r14
            r8 = r33
            r12 = r13
            r13 = r24
            r14 = r20
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.m80934S(com.google.protobuf.RawMessageInfo, com.google.protobuf.NewInstanceSchema, com.google.protobuf.ListFieldSchema, com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, com.google.protobuf.MapFieldSchema):com.google.protobuf.MessageSchema");
    }

    /* renamed from: T */
    private int m80935T(int i) {
        return this.f57008a[i];
    }

    /* renamed from: U */
    private static long m80936U(int i) {
        return (long) (i & 1048575);
    }

    /* renamed from: V */
    private static <T> boolean m80937V(T t, long j) {
        return ((Boolean) UnsafeUtil.m81360F(t, j)).booleanValue();
    }

    /* renamed from: W */
    private static <T> double m80938W(T t, long j) {
        return ((Double) UnsafeUtil.m81360F(t, j)).doubleValue();
    }

    /* renamed from: X */
    private static <T> float m80939X(T t, long j) {
        return ((Float) UnsafeUtil.m81360F(t, j)).floatValue();
    }

    /* renamed from: Y */
    private static <T> int m80940Y(T t, long j) {
        return ((Integer) UnsafeUtil.m81360F(t, j)).intValue();
    }

    /* renamed from: Z */
    private static <T> long m80941Z(T t, long j) {
        return ((Long) UnsafeUtil.m81360F(t, j)).longValue();
    }

    /* renamed from: a0 */
    private <K, V> int m80942a0(T t, byte[] bArr, int i, int i2, int i3, long j, ArrayDecoders.Registers registers) throws IOException {
        T t2 = t;
        long j2 = j;
        Unsafe unsafe = f57007s;
        int i4 = i3;
        Object t3 = m80970t(i3);
        Object object = unsafe.getObject(t, j2);
        if (this.f57024q.mo65339h(object)) {
            Object d = this.f57024q.mo65335d(t3);
            this.f57024q.mo65332a(d, object);
            unsafe.putObject(t, j2, d);
            object = d;
        }
        return m80954l(bArr, i, i2, this.f57024q.mo65333b(t3), this.f57024q.mo65334c(object), registers);
    }

    /* renamed from: b0 */
    private int m80943b0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, ArrayDecoders.Registers registers) throws IOException {
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        ArrayDecoders.Registers registers2 = registers;
        Unsafe unsafe = f57007s;
        long j3 = (long) (this.f57008a[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Double.valueOf(ArrayDecoders.m79370d(bArr, i)));
                    int i14 = i9 + 8;
                    unsafe.putInt(t2, j3, i11);
                    return i14;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Float.valueOf(ArrayDecoders.m79378l(bArr, i)));
                    int i15 = i9 + 4;
                    unsafe.putInt(t2, j3, i11);
                    return i15;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int L = ArrayDecoders.m79364L(bArr2, i9, registers2);
                    unsafe.putObject(t2, j2, Long.valueOf(registers2.f56574b));
                    unsafe.putInt(t2, j3, i11);
                    return L;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int I = ArrayDecoders.m79361I(bArr2, i9, registers2);
                    unsafe.putObject(t2, j2, Integer.valueOf(registers2.f56573a));
                    unsafe.putInt(t2, j3, i11);
                    return I;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Long.valueOf(ArrayDecoders.m79376j(bArr, i)));
                    int i16 = i9 + 8;
                    unsafe.putInt(t2, j3, i11);
                    return i16;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Integer.valueOf(ArrayDecoders.m79374h(bArr, i)));
                    int i17 = i9 + 4;
                    unsafe.putInt(t2, j3, i11);
                    return i17;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int L2 = ArrayDecoders.m79364L(bArr2, i9, registers2);
                    unsafe.putObject(t2, j2, Boolean.valueOf(registers2.f56574b != 0));
                    unsafe.putInt(t2, j3, i11);
                    return L2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int I2 = ArrayDecoders.m79361I(bArr2, i9, registers2);
                    int i18 = registers2.f56573a;
                    if (i18 == 0) {
                        unsafe.putObject(t2, j2, "");
                    } else if ((i6 & 536870912) == 0 || Utf8.m81487u(bArr2, I2, I2 + i18)) {
                        unsafe.putObject(t2, j2, new String(bArr2, I2, i18, Internal.f56935a));
                        I2 += i18;
                    } else {
                        throw InvalidProtocolBufferException.m80760c();
                    }
                    unsafe.putInt(t2, j3, i11);
                    return I2;
                }
                break;
            case 60:
                if (i12 == 2) {
                    int p = ArrayDecoders.m79382p(m80972u(i13), bArr2, i9, i2, registers2);
                    Object object = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t2, j2, registers2.f56575c);
                    } else {
                        unsafe.putObject(t2, j2, Internal.m80739h(object, registers2.f56575c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return p;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int b = ArrayDecoders.m79368b(bArr2, i9, registers2);
                    unsafe.putObject(t2, j2, registers2.f56575c);
                    unsafe.putInt(t2, j3, i11);
                    return b;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int I3 = ArrayDecoders.m79361I(bArr2, i9, registers2);
                    int i19 = registers2.f56573a;
                    Internal.EnumVerifier s = m80968s(i13);
                    if (s == null || s.mo60055a(i19)) {
                        unsafe.putObject(t2, j2, Integer.valueOf(i19));
                        unsafe.putInt(t2, j3, i11);
                    } else {
                        m80974v(t).mo65469m(i10, Long.valueOf((long) i19));
                    }
                    return I3;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int I4 = ArrayDecoders.m79361I(bArr2, i9, registers2);
                    unsafe.putObject(t2, j2, Integer.valueOf(CodedInputStream.m79832b(registers2.f56573a)));
                    unsafe.putInt(t2, j3, i11);
                    return I4;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int L3 = ArrayDecoders.m79364L(bArr2, i9, registers2);
                    unsafe.putObject(t2, j2, Long.valueOf(CodedInputStream.m79833c(registers2.f56574b)));
                    unsafe.putInt(t2, j3, i11);
                    return L3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int n = ArrayDecoders.m79380n(m80972u(i13), bArr, i, i2, (i10 & -8) | 4, registers);
                    Object object2 = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t2, j2, registers2.f56575c);
                    } else {
                        unsafe.putObject(t2, j2, Internal.m80739h(object2, registers2.f56575c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return n;
                }
                break;
        }
        return i9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0296, code lost:
        if (r0 != r15) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02dd, code lost:
        if (r0 != r15) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0300, code lost:
        if (r0 != r15) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0303, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0178, code lost:
        r6 = r6 | r21;
        r9 = r10;
        r1 = r19;
        r10 = -1;
        r29 = r13;
        r13 = r2;
        r2 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ca, code lost:
        r6 = r6 | r21;
        r9 = r10;
        r2 = r13;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f7, code lost:
        r6 = r6 | r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01fa, code lost:
        r2 = r4;
        r28 = r10;
        r20 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m80944d0(T r31, byte[] r32, int r33, int r34, com.google.protobuf.ArrayDecoders.Registers r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            sun.misc.Unsafe r9 = f57007s
            r10 = -1
            r16 = 0
            r0 = r33
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0017:
            if (r0 >= r13) goto L_0x0328
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = com.google.protobuf.ArrayDecoders.m79360H(r0, r12, r3, r11)
            int r3 = r11.f56573a
            r4 = r0
            r17 = r3
            goto L_0x002c
        L_0x0029:
            r17 = r0
            r4 = r3
        L_0x002c:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x0039
            int r2 = r2 / 3
            int r0 = r15.m80947g0(r5, r2)
            goto L_0x003d
        L_0x0039:
            int r0 = r15.m80946f0(r5)
        L_0x003d:
            r2 = r0
            if (r2 != r10) goto L_0x004b
            r2 = r4
            r19 = r5
            r28 = r9
            r18 = -1
            r20 = 0
            goto L_0x0305
        L_0x004b:
            int[] r0 = r15.f57008a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r0 = m80967r0(r1)
            r18 = r9
            long r8 = m80936U(r1)
            r10 = 17
            r33 = r5
            if (r0 > r10) goto L_0x0203
            int[] r10 = r15.f57008a
            int r21 = r2 + 2
            r10 = r10[r21]
            int r21 = r10 >>> 20
            r5 = 1
            int r21 = r5 << r21
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r13
            r23 = r1
            r19 = r2
            if (r10 == r7) goto L_0x008f
            if (r7 == r13) goto L_0x007f
            long r1 = (long) r7
            r7 = r18
            r7.putInt(r14, r1, r6)
            goto L_0x0081
        L_0x007f:
            r7 = r18
        L_0x0081:
            if (r10 == r13) goto L_0x0089
            long r1 = (long) r10
            int r1 = r7.getInt(r14, r1)
            r6 = r1
        L_0x0089:
            r29 = r10
            r10 = r7
            r7 = r29
            goto L_0x0091
        L_0x008f:
            r10 = r18
        L_0x0091:
            r1 = 5
            switch(r0) {
                case 0: goto L_0x01e5;
                case 1: goto L_0x01d2;
                case 2: goto L_0x01b4;
                case 3: goto L_0x01b4;
                case 4: goto L_0x01a1;
                case 5: goto L_0x0185;
                case 6: goto L_0x0164;
                case 7: goto L_0x0147;
                case 8: goto L_0x0126;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00e2;
                case 11: goto L_0x01a1;
                case 12: goto L_0x00d1;
                case 13: goto L_0x0164;
                case 14: goto L_0x0185;
                case 15: goto L_0x00bc;
                case 16: goto L_0x009e;
                default: goto L_0x0095;
            }
        L_0x0095:
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            goto L_0x01fa
        L_0x009e:
            if (r3 != 0) goto L_0x00b7
            int r17 = com.google.protobuf.ArrayDecoders.m79364L(r12, r4, r11)
            long r0 = r11.f56574b
            long r4 = com.google.protobuf.CodedInputStream.m79833c(r0)
            r0 = r10
            r1 = r31
            r13 = r19
            r2 = r8
            r19 = r33
            r0.putLong(r1, r2, r4)
            goto L_0x01ca
        L_0x00b7:
            r13 = r19
            r19 = r33
            goto L_0x0121
        L_0x00bc:
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x0121
            int r0 = com.google.protobuf.ArrayDecoders.m79361I(r12, r4, r11)
            int r1 = r11.f56573a
            int r1 = com.google.protobuf.CodedInputStream.m79832b(r1)
            r10.putInt(r14, r8, r1)
            goto L_0x01f7
        L_0x00d1:
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x0121
            int r0 = com.google.protobuf.ArrayDecoders.m79361I(r12, r4, r11)
            int r1 = r11.f56573a
            r10.putInt(r14, r8, r1)
            goto L_0x01f7
        L_0x00e2:
            r13 = r19
            r0 = 2
            r19 = r33
            if (r3 != r0) goto L_0x0121
            int r0 = com.google.protobuf.ArrayDecoders.m79368b(r12, r4, r11)
            java.lang.Object r1 = r11.f56575c
            r10.putObject(r14, r8, r1)
            goto L_0x01f7
        L_0x00f4:
            r13 = r19
            r0 = 2
            r19 = r33
            if (r3 != r0) goto L_0x011f
            com.google.protobuf.Schema r0 = r15.m80972u(r13)
            r2 = r34
            r18 = 1048575(0xfffff, float:1.469367E-39)
            int r0 = com.google.protobuf.ArrayDecoders.m79382p(r0, r12, r4, r2, r11)
            java.lang.Object r1 = r10.getObject(r14, r8)
            if (r1 != 0) goto L_0x0115
            java.lang.Object r1 = r11.f56575c
            r10.putObject(r14, r8, r1)
            goto L_0x0178
        L_0x0115:
            java.lang.Object r3 = r11.f56575c
            java.lang.Object r1 = com.google.protobuf.Internal.m80739h(r1, r3)
            r10.putObject(r14, r8, r1)
            goto L_0x0178
        L_0x011f:
            r2 = r34
        L_0x0121:
            r18 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x01fa
        L_0x0126:
            r2 = r34
            r13 = r19
            r0 = 2
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            if (r3 != r0) goto L_0x01fa
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r23 & r0
            if (r0 != 0) goto L_0x013d
            int r0 = com.google.protobuf.ArrayDecoders.m79355C(r12, r4, r11)
            goto L_0x0141
        L_0x013d:
            int r0 = com.google.protobuf.ArrayDecoders.m79358F(r12, r4, r11)
        L_0x0141:
            java.lang.Object r1 = r11.f56575c
            r10.putObject(r14, r8, r1)
            goto L_0x0178
        L_0x0147:
            r2 = r34
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            if (r3 != 0) goto L_0x01fa
            int r0 = com.google.protobuf.ArrayDecoders.m79364L(r12, r4, r11)
            long r3 = r11.f56574b
            r22 = 0
            int r1 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r1 == 0) goto L_0x015f
            goto L_0x0160
        L_0x015f:
            r5 = 0
        L_0x0160:
            com.google.protobuf.UnsafeUtil.m81365K(r14, r8, r5)
            goto L_0x0178
        L_0x0164:
            r2 = r34
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            if (r3 != r1) goto L_0x01fa
            int r0 = com.google.protobuf.ArrayDecoders.m79374h(r12, r4)
            r10.putInt(r14, r8, r0)
            int r0 = r4 + 4
        L_0x0178:
            r6 = r6 | r21
            r9 = r10
            r1 = r19
            r10 = -1
            r29 = r13
            r13 = r2
            r2 = r29
            goto L_0x0017
        L_0x0185:
            r2 = r34
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            if (r3 != r5) goto L_0x01fa
            long r22 = com.google.protobuf.ArrayDecoders.m79376j(r12, r4)
            r0 = r10
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x01f7
        L_0x01a1:
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            if (r3 != 0) goto L_0x01fa
            int r0 = com.google.protobuf.ArrayDecoders.m79361I(r12, r4, r11)
            int r1 = r11.f56573a
            r10.putInt(r14, r8, r1)
            goto L_0x01f7
        L_0x01b4:
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            if (r3 != 0) goto L_0x01fa
            int r17 = com.google.protobuf.ArrayDecoders.m79364L(r12, r4, r11)
            long r4 = r11.f56574b
            r0 = r10
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
        L_0x01ca:
            r6 = r6 | r21
            r9 = r10
            r2 = r13
            r0 = r17
            goto L_0x0248
        L_0x01d2:
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            if (r3 != r1) goto L_0x01fa
            float r0 = com.google.protobuf.ArrayDecoders.m79378l(r12, r4)
            com.google.protobuf.UnsafeUtil.m81373S(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x01f7
        L_0x01e5:
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            if (r3 != r5) goto L_0x01fa
            double r0 = com.google.protobuf.ArrayDecoders.m79370d(r12, r4)
            com.google.protobuf.UnsafeUtil.m81372R(r14, r8, r0)
            int r0 = r4 + 8
        L_0x01f7:
            r6 = r6 | r21
            goto L_0x0246
        L_0x01fa:
            r2 = r4
            r28 = r10
            r20 = r13
            r18 = -1
            goto L_0x0305
        L_0x0203:
            r19 = r33
            r23 = r1
            r13 = r2
            r10 = r18
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 27
            if (r0 != r1) goto L_0x025c
            r1 = 2
            if (r3 != r1) goto L_0x024f
            java.lang.Object r0 = r10.getObject(r14, r8)
            com.google.protobuf.Internal$ProtobufList r0 = (com.google.protobuf.Internal.ProtobufList) r0
            boolean r1 = r0.mo64749c1()
            if (r1 != 0) goto L_0x0232
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0229
            r1 = 10
            goto L_0x022b
        L_0x0229:
            int r1 = r1 * 2
        L_0x022b:
            com.google.protobuf.Internal$ProtobufList r0 = r0.mo64901q1(r1)
            r10.putObject(r14, r8, r0)
        L_0x0232:
            r5 = r0
            com.google.protobuf.Schema r0 = r15.m80972u(r13)
            r1 = r17
            r2 = r32
            r3 = r4
            r4 = r34
            r8 = r6
            r6 = r35
            int r0 = com.google.protobuf.ArrayDecoders.m79383q(r0, r1, r2, r3, r4, r5, r6)
            r6 = r8
        L_0x0246:
            r9 = r10
            r2 = r13
        L_0x0248:
            r1 = r19
            r10 = -1
            r13 = r34
            goto L_0x0017
        L_0x024f:
            r15 = r4
            r24 = r6
            r25 = r7
            r28 = r10
            r20 = r13
            r18 = -1
            goto L_0x02e0
        L_0x025c:
            r1 = 49
            if (r0 > r1) goto L_0x02ac
            r1 = r23
            long r1 = (long) r1
            r5 = r0
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r33 = r3
            r3 = r4
            r15 = r4
            r4 = r34
            r23 = r5
            r5 = r17
            r24 = r6
            r6 = r19
            r25 = r7
            r7 = r33
            r26 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r13
            r28 = r10
            r18 = -1
            r9 = r21
            r11 = r23
            r20 = r13
            r12 = r26
            r14 = r35
            int r0 = r0.m80945e0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0303
        L_0x0298:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r1 = r19
            r2 = r20
            r6 = r24
            r7 = r25
            goto L_0x0323
        L_0x02ac:
            r33 = r3
            r15 = r4
            r24 = r6
            r25 = r7
            r26 = r8
            r28 = r10
            r20 = r13
            r1 = r23
            r18 = -1
            r23 = r0
            r0 = 50
            r9 = r23
            if (r9 != r0) goto L_0x02e6
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x02e0
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r20
            r6 = r26
            r8 = r35
            int r0 = r0.m80942a0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0303
            goto L_0x0298
        L_0x02e0:
            r2 = r15
        L_0x02e1:
            r6 = r24
            r7 = r25
            goto L_0x0305
        L_0x02e6:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r19
            r10 = r26
            r12 = r20
            r13 = r35
            int r0 = r0.m80943b0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0303
            goto L_0x0298
        L_0x0303:
            r2 = r0
            goto L_0x02e1
        L_0x0305:
            com.google.protobuf.UnknownFieldSetLite r4 = m80974v(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.protobuf.ArrayDecoders.m79359G(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r1 = r19
            r2 = r20
        L_0x0323:
            r9 = r28
            r10 = -1
            goto L_0x0017
        L_0x0328:
            r24 = r6
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x033b
            long r1 = (long) r7
            r3 = r31
            r6 = r24
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x033b:
            r1 = r34
            if (r0 != r1) goto L_0x0340
            return r0
        L_0x0340:
            com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.m80764g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.m80944d0(java.lang.Object, byte[], int, int, com.google.protobuf.ArrayDecoders$Registers):int");
    }

    /* renamed from: e0 */
    private int m80945e0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, ArrayDecoders.Registers registers) throws IOException {
        int i8;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i5;
        int i11 = i6;
        long j3 = j2;
        ArrayDecoders.Registers registers2 = registers;
        Unsafe unsafe = f57007s;
        Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe.getObject(t, j3);
        if (!protobufList.mo64749c1()) {
            int size = protobufList.size();
            protobufList = protobufList.mo64901q1(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j3, protobufList);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i10 == 2) {
                    return ArrayDecoders.m79385s(bArr, i9, protobufList, registers2);
                }
                if (i10 == 1) {
                    return ArrayDecoders.m79371e(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 19:
            case 36:
                if (i10 == 2) {
                    return ArrayDecoders.m79388v(bArr, i9, protobufList, registers2);
                }
                if (i10 == 5) {
                    return ArrayDecoders.m79379m(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i10 == 2) {
                    return ArrayDecoders.m79392z(bArr, i9, protobufList, registers2);
                }
                if (i10 == 0) {
                    return ArrayDecoders.m79365M(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i10 == 2) {
                    return ArrayDecoders.m79391y(bArr, i9, protobufList, registers2);
                }
                if (i10 == 0) {
                    return ArrayDecoders.m79362J(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i10 == 2) {
                    return ArrayDecoders.m79387u(bArr, i9, protobufList, registers2);
                }
                if (i10 == 1) {
                    return ArrayDecoders.m79377k(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i10 == 2) {
                    return ArrayDecoders.m79386t(bArr, i9, protobufList, registers2);
                }
                if (i10 == 5) {
                    return ArrayDecoders.m79375i(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 25:
            case 42:
                if (i10 == 2) {
                    return ArrayDecoders.m79384r(bArr, i9, protobufList, registers2);
                }
                if (i10 == 0) {
                    return ArrayDecoders.m79367a(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 26:
                if (i10 == 2) {
                    if ((j & 536870912) == 0) {
                        return ArrayDecoders.m79356D(i3, bArr, i, i2, protobufList, registers);
                    }
                    return ArrayDecoders.m79357E(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 27:
                if (i10 == 2) {
                    return ArrayDecoders.m79383q(m80972u(i11), i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 28:
                if (i10 == 2) {
                    return ArrayDecoders.m79369c(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 30:
            case 44:
                if (i10 == 2) {
                    i8 = ArrayDecoders.m79391y(bArr, i9, protobufList, registers2);
                } else if (i10 == 0) {
                    i8 = ArrayDecoders.m79362J(i3, bArr, i, i2, protobufList, registers);
                }
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t2;
                UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
                if (unknownFieldSetLite == UnknownFieldSetLite.m81294c()) {
                    unknownFieldSetLite = null;
                }
                UnknownFieldSetLite unknownFieldSetLite2 = (UnknownFieldSetLite) SchemaUtil.m81145A(i4, protobufList, m80968s(i11), unknownFieldSetLite, this.f57022o);
                if (unknownFieldSetLite2 != null) {
                    generatedMessageLite.unknownFields = unknownFieldSetLite2;
                }
                return i8;
            case 33:
            case 47:
                if (i10 == 2) {
                    return ArrayDecoders.m79389w(bArr, i9, protobufList, registers2);
                }
                if (i10 == 0) {
                    return ArrayDecoders.m79353A(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 34:
            case 48:
                if (i10 == 2) {
                    return ArrayDecoders.m79390x(bArr, i9, protobufList, registers2);
                }
                if (i10 == 0) {
                    return ArrayDecoders.m79354B(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 49:
                if (i10 == 3) {
                    return ArrayDecoders.m79381o(m80972u(i11), i3, bArr, i, i2, protobufList, registers);
                }
                break;
        }
        return i9;
    }

    /* renamed from: f0 */
    private int m80946f0(int i) {
        if (i < this.f57010c || i > this.f57011d) {
            return -1;
        }
        return m80963p0(i, 0);
    }

    /* renamed from: g0 */
    private int m80947g0(int i, int i2) {
        if (i < this.f57010c || i > this.f57011d) {
            return -1;
        }
        return m80963p0(i, i2);
    }

    /* renamed from: h0 */
    private int m80948h0(int i) {
        return this.f57008a[i + 2];
    }

    /* renamed from: i0 */
    private <E> void m80949i0(Object obj, long j, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.mo64789e(this.f57021n.mo65303e(obj, j), schema, extensionRegistryLite);
    }

    /* renamed from: j */
    private boolean m80950j(T t, T t2, int i) {
        return m80917B(t, i) == m80917B(t2, i);
    }

    /* renamed from: j0 */
    private <E> void m80951j0(Object obj, int i, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.mo64791g(this.f57021n.mo65303e(obj, m80936U(i)), schema, extensionRegistryLite);
    }

    /* renamed from: k */
    private static <T> boolean m80952k(T t, long j) {
        return UnsafeUtil.m81397s(t, j);
    }

    /* renamed from: k0 */
    private void m80953k0(Object obj, int i, Reader reader) throws IOException {
        if (m80916A(i)) {
            UnsafeUtil.m81376V(obj, m80936U(i), reader.mo64781P());
        } else if (this.f57014g) {
            UnsafeUtil.m81376V(obj, m80936U(i), reader.mo64771F());
        } else {
            UnsafeUtil.m81376V(obj, m80936U(i), reader.mo64805s());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v6, types: [int, byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <K, V> int m80954l(byte[] r15, int r16, int r17, com.google.protobuf.MapEntryLite.Metadata<K, V> r18, java.util.Map<K, V> r19, com.google.protobuf.ArrayDecoders.Registers r20) throws java.io.IOException {
        /*
            r14 = this;
            r7 = r15
            r8 = r17
            r9 = r18
            r0 = r16
            r10 = r20
            int r0 = com.google.protobuf.ArrayDecoders.m79361I(r15, r0, r10)
            int r1 = r10.f56573a
            if (r1 < 0) goto L_0x0081
            int r2 = r8 - r0
            if (r1 > r2) goto L_0x0081
            int r11 = r0 + r1
            K r1 = r9.f57000b
            V r2 = r9.f57002d
            r12 = r1
            r13 = r2
        L_0x001d:
            if (r0 >= r11) goto L_0x0074
            int r1 = r0 + 1
            byte r0 = r7[r0]
            if (r0 >= 0) goto L_0x002e
            int r0 = com.google.protobuf.ArrayDecoders.m79360H(r0, r15, r1, r10)
            int r1 = r10.f56573a
            r2 = r0
            r0 = r1
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            int r1 = r0 >>> 3
            r3 = r0 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0057
            r4 = 2
            if (r1 == r4) goto L_0x003a
            goto L_0x006f
        L_0x003a:
            com.google.protobuf.WireFormat$FieldType r1 = r9.f57001c
            int r1 = r1.mo65549d()
            if (r3 != r1) goto L_0x006f
            com.google.protobuf.WireFormat$FieldType r4 = r9.f57001c
            V r0 = r9.f57002d
            java.lang.Class r5 = r0.getClass()
            r0 = r14
            r1 = r15
            r3 = r17
            r6 = r20
            int r0 = r0.m80956m(r1, r2, r3, r4, r5, r6)
            java.lang.Object r13 = r10.f56575c
            goto L_0x001d
        L_0x0057:
            com.google.protobuf.WireFormat$FieldType r1 = r9.f56999a
            int r1 = r1.mo65549d()
            if (r3 != r1) goto L_0x006f
            com.google.protobuf.WireFormat$FieldType r4 = r9.f56999a
            r5 = 0
            r0 = r14
            r1 = r15
            r3 = r17
            r6 = r20
            int r0 = r0.m80956m(r1, r2, r3, r4, r5, r6)
            java.lang.Object r12 = r10.f56575c
            goto L_0x001d
        L_0x006f:
            int r0 = com.google.protobuf.ArrayDecoders.m79366N(r0, r15, r2, r8, r10)
            goto L_0x001d
        L_0x0074:
            if (r0 != r11) goto L_0x007c
            r0 = r19
            r0.put(r12, r13)
            return r11
        L_0x007c:
            com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.m80764g()
            throw r0
        L_0x0081:
            com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.m80767k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.m80954l(byte[], int, int, com.google.protobuf.MapEntryLite$Metadata, java.util.Map, com.google.protobuf.ArrayDecoders$Registers):int");
    }

    /* renamed from: l0 */
    private void m80955l0(Object obj, int i, Reader reader) throws IOException {
        if (m80916A(i)) {
            reader.mo64802r(this.f57021n.mo65303e(obj, m80936U(i)));
        } else {
            reader.mo64773H(this.f57021n.mo65303e(obj, m80936U(i)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r3 + 8;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m80956m(byte[] r2, int r3, int r4, com.google.protobuf.WireFormat.FieldType r5, java.lang.Class<?> r6, com.google.protobuf.ArrayDecoders.Registers r7) throws java.io.IOException {
        /*
            r1 = this;
            int[] r0 = com.google.protobuf.MessageSchema.C115981.f57025a
            int r5 = r5.ordinal()
            r5 = r0[r5]
            switch(r5) {
                case 1: goto L_0x0099;
                case 2: goto L_0x0094;
                case 3: goto L_0x0087;
                case 4: goto L_0x007a;
                case 5: goto L_0x007a;
                case 6: goto L_0x006f;
                case 7: goto L_0x006f;
                case 8: goto L_0x0064;
                case 9: goto L_0x0057;
                case 10: goto L_0x0057;
                case 11: goto L_0x0057;
                case 12: goto L_0x004a;
                case 13: goto L_0x004a;
                case 14: goto L_0x003d;
                case 15: goto L_0x002b;
                case 16: goto L_0x0019;
                case 17: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "unsupported field type."
            r2.<init>(r3)
            throw r2
        L_0x0013:
            int r2 = com.google.protobuf.ArrayDecoders.m79358F(r2, r3, r7)
            goto L_0x00ae
        L_0x0019:
            int r2 = com.google.protobuf.ArrayDecoders.m79364L(r2, r3, r7)
            long r3 = r7.f56574b
            long r3 = com.google.protobuf.CodedInputStream.m79833c(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r7.f56575c = r3
            goto L_0x00ae
        L_0x002b:
            int r2 = com.google.protobuf.ArrayDecoders.m79361I(r2, r3, r7)
            int r3 = r7.f56573a
            int r3 = com.google.protobuf.CodedInputStream.m79832b(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.f56575c = r3
            goto L_0x00ae
        L_0x003d:
            com.google.protobuf.Protobuf r5 = com.google.protobuf.Protobuf.m81041a()
            com.google.protobuf.Schema r5 = r5.mo65366d(r6)
            int r2 = com.google.protobuf.ArrayDecoders.m79382p(r5, r2, r3, r4, r7)
            goto L_0x00ae
        L_0x004a:
            int r2 = com.google.protobuf.ArrayDecoders.m79364L(r2, r3, r7)
            long r3 = r7.f56574b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r7.f56575c = r3
            goto L_0x00ae
        L_0x0057:
            int r2 = com.google.protobuf.ArrayDecoders.m79361I(r2, r3, r7)
            int r3 = r7.f56573a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.f56575c = r3
            goto L_0x00ae
        L_0x0064:
            float r2 = com.google.protobuf.ArrayDecoders.m79378l(r2, r3)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r7.f56575c = r2
            goto L_0x0084
        L_0x006f:
            long r4 = com.google.protobuf.ArrayDecoders.m79376j(r2, r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r7.f56575c = r2
            goto L_0x0091
        L_0x007a:
            int r2 = com.google.protobuf.ArrayDecoders.m79374h(r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7.f56575c = r2
        L_0x0084:
            int r2 = r3 + 4
            goto L_0x00ae
        L_0x0087:
            double r4 = com.google.protobuf.ArrayDecoders.m79370d(r2, r3)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r7.f56575c = r2
        L_0x0091:
            int r2 = r3 + 8
            goto L_0x00ae
        L_0x0094:
            int r2 = com.google.protobuf.ArrayDecoders.m79368b(r2, r3, r7)
            goto L_0x00ae
        L_0x0099:
            int r2 = com.google.protobuf.ArrayDecoders.m79364L(r2, r3, r7)
            long r3 = r7.f56574b
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            r3 = 1
            goto L_0x00a8
        L_0x00a7:
            r3 = 0
        L_0x00a8:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r7.f56575c = r3
        L_0x00ae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.m80956m(byte[], int, int, com.google.protobuf.WireFormat$FieldType, java.lang.Class, com.google.protobuf.ArrayDecoders$Registers):int");
    }

    /* renamed from: m0 */
    private static Field m80957m0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: n */
    private static <T> double m80958n(T t, long j) {
        return UnsafeUtil.m81404z(t, j);
    }

    /* renamed from: n0 */
    private void m80959n0(T t, int i) {
        int h0 = m80948h0(i);
        long j = (long) (1048575 & h0);
        if (j != 1048575) {
            UnsafeUtil.m81374T(t, j, (1 << (h0 >>> 20)) | UnsafeUtil.m81356B(t, j));
        }
    }

    /* renamed from: o */
    private boolean m80960o(T t, T t2, int i) {
        int s0 = m80969s0(i);
        long U = m80936U(s0);
        switch (m80967r0(s0)) {
            case 0:
                if (!m80950j(t, t2, i) || Double.doubleToLongBits(UnsafeUtil.m81404z(t, U)) != Double.doubleToLongBits(UnsafeUtil.m81404z(t2, U))) {
                    return false;
                }
                return true;
            case 1:
                if (!m80950j(t, t2, i) || Float.floatToIntBits(UnsafeUtil.m81355A(t, U)) != Float.floatToIntBits(UnsafeUtil.m81355A(t2, U))) {
                    return false;
                }
                return true;
            case 2:
                if (!m80950j(t, t2, i) || UnsafeUtil.m81358D(t, U) != UnsafeUtil.m81358D(t2, U)) {
                    return false;
                }
                return true;
            case 3:
                if (!m80950j(t, t2, i) || UnsafeUtil.m81358D(t, U) != UnsafeUtil.m81358D(t2, U)) {
                    return false;
                }
                return true;
            case 4:
                if (!m80950j(t, t2, i) || UnsafeUtil.m81356B(t, U) != UnsafeUtil.m81356B(t2, U)) {
                    return false;
                }
                return true;
            case 5:
                if (!m80950j(t, t2, i) || UnsafeUtil.m81358D(t, U) != UnsafeUtil.m81358D(t2, U)) {
                    return false;
                }
                return true;
            case 6:
                if (!m80950j(t, t2, i) || UnsafeUtil.m81356B(t, U) != UnsafeUtil.m81356B(t2, U)) {
                    return false;
                }
                return true;
            case 7:
                if (!m80950j(t, t2, i) || UnsafeUtil.m81397s(t, U) != UnsafeUtil.m81397s(t2, U)) {
                    return false;
                }
                return true;
            case 8:
                if (!m80950j(t, t2, i) || !SchemaUtil.m81155K(UnsafeUtil.m81360F(t, U), UnsafeUtil.m81360F(t2, U))) {
                    return false;
                }
                return true;
            case 9:
                if (!m80950j(t, t2, i) || !SchemaUtil.m81155K(UnsafeUtil.m81360F(t, U), UnsafeUtil.m81360F(t2, U))) {
                    return false;
                }
                return true;
            case 10:
                if (!m80950j(t, t2, i) || !SchemaUtil.m81155K(UnsafeUtil.m81360F(t, U), UnsafeUtil.m81360F(t2, U))) {
                    return false;
                }
                return true;
            case 11:
                if (!m80950j(t, t2, i) || UnsafeUtil.m81356B(t, U) != UnsafeUtil.m81356B(t2, U)) {
                    return false;
                }
                return true;
            case 12:
                if (!m80950j(t, t2, i) || UnsafeUtil.m81356B(t, U) != UnsafeUtil.m81356B(t2, U)) {
                    return false;
                }
                return true;
            case 13:
                if (!m80950j(t, t2, i) || UnsafeUtil.m81356B(t, U) != UnsafeUtil.m81356B(t2, U)) {
                    return false;
                }
                return true;
            case 14:
                if (!m80950j(t, t2, i) || UnsafeUtil.m81358D(t, U) != UnsafeUtil.m81358D(t2, U)) {
                    return false;
                }
                return true;
            case 15:
                if (!m80950j(t, t2, i) || UnsafeUtil.m81356B(t, U) != UnsafeUtil.m81356B(t2, U)) {
                    return false;
                }
                return true;
            case 16:
                if (!m80950j(t, t2, i) || UnsafeUtil.m81358D(t, U) != UnsafeUtil.m81358D(t2, U)) {
                    return false;
                }
                return true;
            case 17:
                if (!m80950j(t, t2, i) || !SchemaUtil.m81155K(UnsafeUtil.m81360F(t, U), UnsafeUtil.m81360F(t2, U))) {
                    return false;
                }
                return true;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return SchemaUtil.m81155K(UnsafeUtil.m81360F(t, U), UnsafeUtil.m81360F(t2, U));
            case 50:
                return SchemaUtil.m81155K(UnsafeUtil.m81360F(t, U), UnsafeUtil.m81360F(t2, U));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!m80922G(t, t2, i) || !SchemaUtil.m81155K(UnsafeUtil.m81360F(t, U), UnsafeUtil.m81360F(t2, U))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    /* renamed from: o0 */
    private void m80961o0(T t, int i, int i2) {
        UnsafeUtil.m81374T(t, (long) (m80948h0(i2) & 1048575), i);
    }

    /* renamed from: p */
    private final <UT, UB> UB m80962p(Object obj, int i, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        Internal.EnumVerifier s;
        int T = m80935T(i);
        Object F = UnsafeUtil.m81360F(obj, m80936U(m80969s0(i)));
        if (F == null || (s = m80968s(i)) == null) {
            return ub;
        }
        return m80964q(i, T, this.f57024q.mo65334c(F), s, ub, unknownFieldSchema);
    }

    /* renamed from: p0 */
    private int m80963p0(int i, int i2) {
        int length = (this.f57008a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int T = m80935T(i4);
            if (i == T) {
                return i4;
            }
            if (i < T) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: q */
    private final <K, V, UT, UB> UB m80964q(int i, int i2, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        MapEntryLite.Metadata<?, ?> b = this.f57024q.mo65333b(m80970t(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!enumVerifier.mo60055a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = unknownFieldSchema.mo65455n();
                }
                ByteString.CodedBuilder J = ByteString.m79760J(MapEntryLite.m80857b(b, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.m80859e(J.mo64945b(), b, next.getKey(), next.getValue());
                    unknownFieldSchema.mo65445d(ub, i2, J.mo64944a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bd  */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m80965q0(com.google.protobuf.FieldInfo r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            com.google.protobuf.OneofInfo r0 = r8.mo65120k()
            r1 = 0
            if (r0 == 0) goto L_0x0025
            com.google.protobuf.FieldType r2 = r8.mo65123n()
            int r2 = r2.mo65148b()
            int r2 = r2 + 51
            java.lang.reflect.Field r3 = r0.mo65363b()
            long r3 = com.google.protobuf.UnsafeUtil.m81364J(r3)
            int r4 = (int) r3
            java.lang.reflect.Field r0 = r0.mo65362a()
            long r5 = com.google.protobuf.UnsafeUtil.m81364J(r0)
        L_0x0022:
            int r0 = (int) r5
        L_0x0023:
            r3 = 0
            goto L_0x006b
        L_0x0025:
            com.google.protobuf.FieldType r0 = r8.mo65123n()
            java.lang.reflect.Field r2 = r8.mo65116f()
            long r2 = com.google.protobuf.UnsafeUtil.m81364J(r2)
            int r4 = (int) r2
            int r2 = r0.mo65148b()
            boolean r3 = r0.mo65149d()
            if (r3 != 0) goto L_0x005a
            boolean r0 = r0.mo65150e()
            if (r0 != 0) goto L_0x005a
            java.lang.reflect.Field r0 = r8.mo65121l()
            if (r0 != 0) goto L_0x004c
            r0 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0051
        L_0x004c:
            long r5 = com.google.protobuf.UnsafeUtil.m81364J(r0)
            int r0 = (int) r5
        L_0x0051:
            int r3 = r8.mo65122m()
            int r3 = java.lang.Integer.numberOfTrailingZeros(r3)
            goto L_0x006b
        L_0x005a:
            java.lang.reflect.Field r0 = r8.mo65114d()
            if (r0 != 0) goto L_0x0062
            r0 = 0
            goto L_0x0023
        L_0x0062:
            java.lang.reflect.Field r0 = r8.mo65114d()
            long r5 = com.google.protobuf.UnsafeUtil.m81364J(r0)
            goto L_0x0022
        L_0x006b:
            int r5 = r8.mo65117g()
            r9[r10] = r5
            int r5 = r10 + 1
            boolean r6 = r8.mo65124o()
            if (r6 == 0) goto L_0x007c
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x007d
        L_0x007c:
            r6 = 0
        L_0x007d:
            boolean r7 = r8.mo65125q()
            if (r7 == 0) goto L_0x0085
            r1 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0085:
            r1 = r1 | r6
            int r2 = r2 << 20
            r1 = r1 | r2
            r1 = r1 | r4
            r9[r5] = r1
            int r1 = r10 + 2
            int r2 = r3 << 20
            r0 = r0 | r2
            r9[r1] = r0
            java.lang.Class r9 = r8.mo65119j()
            java.lang.Object r0 = r8.mo65118i()
            if (r0 == 0) goto L_0x00bd
            int r10 = r10 / 3
            int r10 = r10 * 2
            java.lang.Object r0 = r8.mo65118i()
            r11[r10] = r0
            if (r9 == 0) goto L_0x00ae
            int r10 = r10 + 1
            r11[r10] = r9
            goto L_0x00da
        L_0x00ae:
            com.google.protobuf.Internal$EnumVerifier r9 = r8.mo65115e()
            if (r9 == 0) goto L_0x00da
            int r10 = r10 + 1
            com.google.protobuf.Internal$EnumVerifier r8 = r8.mo65115e()
            r11[r10] = r8
            goto L_0x00da
        L_0x00bd:
            if (r9 == 0) goto L_0x00c8
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            r11[r10] = r9
            goto L_0x00da
        L_0x00c8:
            com.google.protobuf.Internal$EnumVerifier r9 = r8.mo65115e()
            if (r9 == 0) goto L_0x00da
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            com.google.protobuf.Internal$EnumVerifier r8 = r8.mo65115e()
            r11[r10] = r8
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.m80965q0(com.google.protobuf.FieldInfo, int[], int, java.lang.Object[]):void");
    }

    /* renamed from: r */
    private static <T> float m80966r(T t, long j) {
        return UnsafeUtil.m81355A(t, j);
    }

    /* renamed from: r0 */
    private static int m80967r0(int i) {
        return (i & 267386880) >>> 20;
    }

    /* renamed from: s */
    private Internal.EnumVerifier m80968s(int i) {
        return (Internal.EnumVerifier) this.f57009b[((i / 3) * 2) + 1];
    }

    /* renamed from: s0 */
    private int m80969s0(int i) {
        return this.f57008a[i + 1];
    }

    /* renamed from: t */
    private Object m80970t(int i) {
        return this.f57009b[(i / 3) * 2];
    }

    /* JADX WARNING: Removed duplicated region for block: B:168:0x0491  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m80971t0(T r18, com.google.protobuf.Writer r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f57013f
            if (r3 == 0) goto L_0x0021
            com.google.protobuf.ExtensionSchema<?> r3 = r0.f57023p
            com.google.protobuf.FieldSet r3 = r3.mo65102c(r1)
            boolean r5 = r3.mo65135n()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo65138s()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            int[] r6 = r0.f57008a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f57007s
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x0030:
            if (r10 >= r6) goto L_0x048f
            int r13 = r0.m80969s0(r10)
            int r14 = r0.m80935T(r10)
            int r15 = m80967r0(r13)
            r4 = 17
            if (r15 > r4) goto L_0x0058
            int[] r4 = r0.f57008a
            int r16 = r10 + 2
            r4 = r4[r16]
            r9 = r4 & r8
            if (r9 == r11) goto L_0x0052
            long r11 = (long) r9
            int r12 = r7.getInt(r1, r11)
            r11 = r9
        L_0x0052:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x0059
        L_0x0058:
            r4 = 0
        L_0x0059:
            if (r5 == 0) goto L_0x0077
            com.google.protobuf.ExtensionSchema<?> r9 = r0.f57023p
            int r9 = r9.mo65100a(r5)
            if (r9 > r14) goto L_0x0077
            com.google.protobuf.ExtensionSchema<?> r9 = r0.f57023p
            r9.mo65109j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0075
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0059
        L_0x0075:
            r5 = 0
            goto L_0x0059
        L_0x0077:
            long r8 = m80936U(r13)
            switch(r15) {
                case 0: goto L_0x047d;
                case 1: goto L_0x0471;
                case 2: goto L_0x0465;
                case 3: goto L_0x0459;
                case 4: goto L_0x044d;
                case 5: goto L_0x0441;
                case 6: goto L_0x0435;
                case 7: goto L_0x0429;
                case 8: goto L_0x041d;
                case 9: goto L_0x040c;
                case 10: goto L_0x03fd;
                case 11: goto L_0x03f0;
                case 12: goto L_0x03e3;
                case 13: goto L_0x03d6;
                case 14: goto L_0x03c9;
                case 15: goto L_0x03bc;
                case 16: goto L_0x03af;
                case 17: goto L_0x039e;
                case 18: goto L_0x038e;
                case 19: goto L_0x037e;
                case 20: goto L_0x036e;
                case 21: goto L_0x035e;
                case 22: goto L_0x034e;
                case 23: goto L_0x033e;
                case 24: goto L_0x032e;
                case 25: goto L_0x031e;
                case 26: goto L_0x030f;
                case 27: goto L_0x02fc;
                case 28: goto L_0x02ed;
                case 29: goto L_0x02dd;
                case 30: goto L_0x02cd;
                case 31: goto L_0x02bd;
                case 32: goto L_0x02ad;
                case 33: goto L_0x029d;
                case 34: goto L_0x028d;
                case 35: goto L_0x027d;
                case 36: goto L_0x026d;
                case 37: goto L_0x025d;
                case 38: goto L_0x024d;
                case 39: goto L_0x023d;
                case 40: goto L_0x022d;
                case 41: goto L_0x021d;
                case 42: goto L_0x020d;
                case 43: goto L_0x01fd;
                case 44: goto L_0x01ed;
                case 45: goto L_0x01dd;
                case 46: goto L_0x01cd;
                case 47: goto L_0x01bd;
                case 48: goto L_0x01ad;
                case 49: goto L_0x019a;
                case 50: goto L_0x0191;
                case 51: goto L_0x0182;
                case 52: goto L_0x0173;
                case 53: goto L_0x0164;
                case 54: goto L_0x0155;
                case 55: goto L_0x0146;
                case 56: goto L_0x0137;
                case 57: goto L_0x0128;
                case 58: goto L_0x0119;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f7;
                case 61: goto L_0x00e7;
                case 62: goto L_0x00d9;
                case 63: goto L_0x00cb;
                case 64: goto L_0x00bd;
                case 65: goto L_0x00af;
                case 66: goto L_0x00a1;
                case 67: goto L_0x0093;
                case 68: goto L_0x0081;
                default: goto L_0x007e;
            }
        L_0x007e:
            r13 = 0
            goto L_0x0488
        L_0x0081:
            boolean r4 = r0.m80923H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.Schema r8 = r0.m80972u(r10)
            r2.mo64868i(r14, r4, r8)
            goto L_0x007e
        L_0x0093:
            boolean r4 = r0.m80923H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r8 = m80941Z(r1, r8)
            r2.mo64871p(r14, r8)
            goto L_0x007e
        L_0x00a1:
            boolean r4 = r0.m80923H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = m80940Y(r1, r8)
            r2.mo64861O(r14, r4)
            goto L_0x007e
        L_0x00af:
            boolean r4 = r0.m80923H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r8 = m80941Z(r1, r8)
            r2.mo64841l(r14, r8)
            goto L_0x007e
        L_0x00bd:
            boolean r4 = r0.m80923H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = m80940Y(r1, r8)
            r2.mo64814C(r14, r4)
            goto L_0x007e
        L_0x00cb:
            boolean r4 = r0.m80923H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = m80940Y(r1, r8)
            r2.mo64823L(r14, r4)
            goto L_0x007e
        L_0x00d9:
            boolean r4 = r0.m80923H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = m80940Y(r1, r8)
            r2.mo64872s(r14, r4)
            goto L_0x007e
        L_0x00e7:
            boolean r4 = r0.m80923H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.ByteString r4 = (com.google.protobuf.ByteString) r4
            r2.mo64869j(r14, r4)
            goto L_0x007e
        L_0x00f7:
            boolean r4 = r0.m80923H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.Schema r8 = r0.m80972u(r10)
            r2.mo64873w(r14, r4, r8)
            goto L_0x007e
        L_0x010a:
            boolean r4 = r0.m80923H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.m80979x0(r14, r4, r2)
            goto L_0x007e
        L_0x0119:
            boolean r4 = r0.m80923H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            boolean r4 = m80937V(r1, r8)
            r2.mo64855B(r14, r4)
            goto L_0x007e
        L_0x0128:
            boolean r4 = r0.m80923H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = m80940Y(r1, r8)
            r2.mo64865d(r14, r4)
            goto L_0x007e
        L_0x0137:
            boolean r4 = r0.m80923H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r8 = m80941Z(r1, r8)
            r2.mo64874x(r14, r8)
            goto L_0x007e
        L_0x0146:
            boolean r4 = r0.m80923H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = m80940Y(r1, r8)
            r2.mo64870k(r14, r4)
            goto L_0x007e
        L_0x0155:
            boolean r4 = r0.m80923H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r8 = m80941Z(r1, r8)
            r2.mo64867g(r14, r8)
            goto L_0x007e
        L_0x0164:
            boolean r4 = r0.m80923H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r8 = m80941Z(r1, r8)
            r2.mo64813A(r14, r8)
            goto L_0x007e
        L_0x0173:
            boolean r4 = r0.m80923H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            float r4 = m80939X(r1, r8)
            r2.mo64821I(r14, r4)
            goto L_0x007e
        L_0x0182:
            boolean r4 = r0.m80923H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            double r8 = m80938W(r1, r8)
            r2.mo64848t(r14, r8)
            goto L_0x007e
        L_0x0191:
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.m80977w0(r2, r14, r4, r10)
            goto L_0x007e
        L_0x019a:
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.Schema r9 = r0.m80972u(r10)
            com.google.protobuf.SchemaUtil.m81165U(r4, r8, r2, r9)
            goto L_0x007e
        L_0x01ad:
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.protobuf.SchemaUtil.m81174b0(r4, r8, r2, r13)
            goto L_0x007e
        L_0x01bd:
            r13 = 1
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81172a0(r4, r8, r2, r13)
            goto L_0x007e
        L_0x01cd:
            r13 = 1
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81170Z(r4, r8, r2, r13)
            goto L_0x007e
        L_0x01dd:
            r13 = 1
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81169Y(r4, r8, r2, r13)
            goto L_0x007e
        L_0x01ed:
            r13 = 1
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81161Q(r4, r8, r2, r13)
            goto L_0x007e
        L_0x01fd:
            r13 = 1
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81178d0(r4, r8, r2, r13)
            goto L_0x007e
        L_0x020d:
            r13 = 1
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81158N(r4, r8, r2, r13)
            goto L_0x007e
        L_0x021d:
            r13 = 1
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81162R(r4, r8, r2, r13)
            goto L_0x007e
        L_0x022d:
            r13 = 1
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81163S(r4, r8, r2, r13)
            goto L_0x007e
        L_0x023d:
            r13 = 1
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81166V(r4, r8, r2, r13)
            goto L_0x007e
        L_0x024d:
            r13 = 1
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81180e0(r4, r8, r2, r13)
            goto L_0x007e
        L_0x025d:
            r13 = 1
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81167W(r4, r8, r2, r13)
            goto L_0x007e
        L_0x026d:
            r13 = 1
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81164T(r4, r8, r2, r13)
            goto L_0x007e
        L_0x027d:
            r13 = 1
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81160P(r4, r8, r2, r13)
            goto L_0x007e
        L_0x028d:
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.protobuf.SchemaUtil.m81174b0(r4, r8, r2, r13)
            goto L_0x0488
        L_0x029d:
            r13 = 0
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81172a0(r4, r8, r2, r13)
            goto L_0x0488
        L_0x02ad:
            r13 = 0
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81170Z(r4, r8, r2, r13)
            goto L_0x0488
        L_0x02bd:
            r13 = 0
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81169Y(r4, r8, r2, r13)
            goto L_0x0488
        L_0x02cd:
            r13 = 0
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81161Q(r4, r8, r2, r13)
            goto L_0x0488
        L_0x02dd:
            r13 = 0
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81178d0(r4, r8, r2, r13)
            goto L_0x0488
        L_0x02ed:
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81159O(r4, r8, r2)
            goto L_0x007e
        L_0x02fc:
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.Schema r9 = r0.m80972u(r10)
            com.google.protobuf.SchemaUtil.m81168X(r4, r8, r2, r9)
            goto L_0x007e
        L_0x030f:
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81176c0(r4, r8, r2)
            goto L_0x007e
        L_0x031e:
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.protobuf.SchemaUtil.m81158N(r4, r8, r2, r13)
            goto L_0x0488
        L_0x032e:
            r13 = 0
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81162R(r4, r8, r2, r13)
            goto L_0x0488
        L_0x033e:
            r13 = 0
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81163S(r4, r8, r2, r13)
            goto L_0x0488
        L_0x034e:
            r13 = 0
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81166V(r4, r8, r2, r13)
            goto L_0x0488
        L_0x035e:
            r13 = 0
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81180e0(r4, r8, r2, r13)
            goto L_0x0488
        L_0x036e:
            r13 = 0
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81167W(r4, r8, r2, r13)
            goto L_0x0488
        L_0x037e:
            r13 = 0
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81164T(r4, r8, r2, r13)
            goto L_0x0488
        L_0x038e:
            r13 = 0
            int r4 = r0.m80935T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.m81160P(r4, r8, r2, r13)
            goto L_0x0488
        L_0x039e:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.Schema r8 = r0.m80972u(r10)
            r2.mo64868i(r14, r4, r8)
            goto L_0x0488
        L_0x03af:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            long r8 = r7.getLong(r1, r8)
            r2.mo64871p(r14, r8)
            goto L_0x0488
        L_0x03bc:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            int r4 = r7.getInt(r1, r8)
            r2.mo64861O(r14, r4)
            goto L_0x0488
        L_0x03c9:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            long r8 = r7.getLong(r1, r8)
            r2.mo64841l(r14, r8)
            goto L_0x0488
        L_0x03d6:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            int r4 = r7.getInt(r1, r8)
            r2.mo64814C(r14, r4)
            goto L_0x0488
        L_0x03e3:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            int r4 = r7.getInt(r1, r8)
            r2.mo64823L(r14, r4)
            goto L_0x0488
        L_0x03f0:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            int r4 = r7.getInt(r1, r8)
            r2.mo64872s(r14, r4)
            goto L_0x0488
        L_0x03fd:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.ByteString r4 = (com.google.protobuf.ByteString) r4
            r2.mo64869j(r14, r4)
            goto L_0x0488
        L_0x040c:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.Schema r8 = r0.m80972u(r10)
            r2.mo64873w(r14, r4, r8)
            goto L_0x0488
        L_0x041d:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.m80979x0(r14, r4, r2)
            goto L_0x0488
        L_0x0429:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            boolean r4 = m80952k(r1, r8)
            r2.mo64855B(r14, r4)
            goto L_0x0488
        L_0x0435:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            int r4 = r7.getInt(r1, r8)
            r2.mo64865d(r14, r4)
            goto L_0x0488
        L_0x0441:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            long r8 = r7.getLong(r1, r8)
            r2.mo64874x(r14, r8)
            goto L_0x0488
        L_0x044d:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            int r4 = r7.getInt(r1, r8)
            r2.mo64870k(r14, r4)
            goto L_0x0488
        L_0x0459:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            long r8 = r7.getLong(r1, r8)
            r2.mo64867g(r14, r8)
            goto L_0x0488
        L_0x0465:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            long r8 = r7.getLong(r1, r8)
            r2.mo64813A(r14, r8)
            goto L_0x0488
        L_0x0471:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            float r4 = m80966r(r1, r8)
            r2.mo64821I(r14, r4)
            goto L_0x0488
        L_0x047d:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            double r8 = m80958n(r1, r8)
            r2.mo64848t(r14, r8)
        L_0x0488:
            int r10 = r10 + 3
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0030
        L_0x048f:
            if (r5 == 0) goto L_0x04a6
            com.google.protobuf.ExtensionSchema<?> r4 = r0.f57023p
            r4.mo65109j(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a4
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x048f
        L_0x04a4:
            r5 = 0
            goto L_0x048f
        L_0x04a6:
            com.google.protobuf.UnknownFieldSchema<?, ?> r3 = r0.f57022o
            r0.m80981y0(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.m80971t0(java.lang.Object, com.google.protobuf.Writer):void");
    }

    /* renamed from: u */
    private Schema m80972u(int i) {
        int i2 = (i / 3) * 2;
        Schema schema = (Schema) this.f57009b[i2];
        if (schema != null) {
            return schema;
        }
        Schema d = Protobuf.m81041a().mo65366d((Class) this.f57009b[i2 + 1]);
        this.f57009b[i2] = d;
        return d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m80973u0(T r13, com.google.protobuf.Writer r14) throws java.io.IOException {
        /*
            r12 = this;
            boolean r0 = r12.f57013f
            r1 = 0
            if (r0 == 0) goto L_0x001c
            com.google.protobuf.ExtensionSchema<?> r0 = r12.f57023p
            com.google.protobuf.FieldSet r0 = r0.mo65102c(r13)
            boolean r2 = r0.mo65135n()
            if (r2 != 0) goto L_0x001c
            java.util.Iterator r0 = r0.mo65138s()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x001e
        L_0x001c:
            r0 = r1
            r2 = r0
        L_0x001e:
            int[] r3 = r12.f57008a
            int r3 = r3.length
            r4 = 0
            r5 = 0
        L_0x0023:
            if (r5 >= r3) goto L_0x0586
            int r6 = r12.m80969s0(r5)
            int r7 = r12.m80935T(r5)
        L_0x002d:
            if (r2 == 0) goto L_0x004b
            com.google.protobuf.ExtensionSchema<?> r8 = r12.f57023p
            int r8 = r8.mo65100a(r2)
            if (r8 > r7) goto L_0x004b
            com.google.protobuf.ExtensionSchema<?> r8 = r12.f57023p
            r8.mo65109j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002d
        L_0x0049:
            r2 = r1
            goto L_0x002d
        L_0x004b:
            int r8 = m80967r0(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x0571;
                case 1: goto L_0x055f;
                case 2: goto L_0x054d;
                case 3: goto L_0x053b;
                case 4: goto L_0x0529;
                case 5: goto L_0x0517;
                case 6: goto L_0x0505;
                case 7: goto L_0x04f2;
                case 8: goto L_0x04df;
                case 9: goto L_0x04c8;
                case 10: goto L_0x04b3;
                case 11: goto L_0x04a0;
                case 12: goto L_0x048d;
                case 13: goto L_0x047a;
                case 14: goto L_0x0467;
                case 15: goto L_0x0454;
                case 16: goto L_0x0441;
                case 17: goto L_0x042a;
                case 18: goto L_0x0417;
                case 19: goto L_0x0404;
                case 20: goto L_0x03f1;
                case 21: goto L_0x03de;
                case 22: goto L_0x03cb;
                case 23: goto L_0x03b8;
                case 24: goto L_0x03a5;
                case 25: goto L_0x0392;
                case 26: goto L_0x037f;
                case 27: goto L_0x0368;
                case 28: goto L_0x0355;
                case 29: goto L_0x0342;
                case 30: goto L_0x032f;
                case 31: goto L_0x031c;
                case 32: goto L_0x0309;
                case 33: goto L_0x02f6;
                case 34: goto L_0x02e3;
                case 35: goto L_0x02d0;
                case 36: goto L_0x02bd;
                case 37: goto L_0x02aa;
                case 38: goto L_0x0297;
                case 39: goto L_0x0284;
                case 40: goto L_0x0271;
                case 41: goto L_0x025e;
                case 42: goto L_0x024b;
                case 43: goto L_0x0238;
                case 44: goto L_0x0225;
                case 45: goto L_0x0212;
                case 46: goto L_0x01ff;
                case 47: goto L_0x01ec;
                case 48: goto L_0x01d9;
                case 49: goto L_0x01c2;
                case 50: goto L_0x01b5;
                case 51: goto L_0x01a2;
                case 52: goto L_0x018f;
                case 53: goto L_0x017c;
                case 54: goto L_0x0169;
                case 55: goto L_0x0156;
                case 56: goto L_0x0143;
                case 57: goto L_0x0130;
                case 58: goto L_0x011d;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f3;
                case 61: goto L_0x00de;
                case 62: goto L_0x00cb;
                case 63: goto L_0x00b8;
                case 64: goto L_0x00a5;
                case 65: goto L_0x0092;
                case 66: goto L_0x007f;
                case 67: goto L_0x006c;
                case 68: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0582
        L_0x0055:
            boolean r8 = r12.m80923H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            com.google.protobuf.Schema r8 = r12.m80972u(r5)
            r14.mo64868i(r7, r6, r8)
            goto L_0x0582
        L_0x006c:
            boolean r8 = r12.m80923H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            long r8 = m80941Z(r13, r8)
            r14.mo64871p(r7, r8)
            goto L_0x0582
        L_0x007f:
            boolean r8 = r12.m80923H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            int r6 = m80940Y(r13, r8)
            r14.mo64861O(r7, r6)
            goto L_0x0582
        L_0x0092:
            boolean r8 = r12.m80923H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            long r8 = m80941Z(r13, r8)
            r14.mo64841l(r7, r8)
            goto L_0x0582
        L_0x00a5:
            boolean r8 = r12.m80923H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            int r6 = m80940Y(r13, r8)
            r14.mo64814C(r7, r6)
            goto L_0x0582
        L_0x00b8:
            boolean r8 = r12.m80923H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            int r6 = m80940Y(r13, r8)
            r14.mo64823L(r7, r6)
            goto L_0x0582
        L_0x00cb:
            boolean r8 = r12.m80923H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            int r6 = m80940Y(r13, r8)
            r14.mo64872s(r7, r6)
            goto L_0x0582
        L_0x00de:
            boolean r8 = r12.m80923H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            r14.mo64869j(r7, r6)
            goto L_0x0582
        L_0x00f3:
            boolean r8 = r12.m80923H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            com.google.protobuf.Schema r8 = r12.m80972u(r5)
            r14.mo64873w(r7, r6, r8)
            goto L_0x0582
        L_0x010a:
            boolean r8 = r12.m80923H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            r12.m80979x0(r7, r6, r14)
            goto L_0x0582
        L_0x011d:
            boolean r8 = r12.m80923H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            boolean r6 = m80937V(r13, r8)
            r14.mo64855B(r7, r6)
            goto L_0x0582
        L_0x0130:
            boolean r8 = r12.m80923H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            int r6 = m80940Y(r13, r8)
            r14.mo64865d(r7, r6)
            goto L_0x0582
        L_0x0143:
            boolean r8 = r12.m80923H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            long r8 = m80941Z(r13, r8)
            r14.mo64874x(r7, r8)
            goto L_0x0582
        L_0x0156:
            boolean r8 = r12.m80923H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            int r6 = m80940Y(r13, r8)
            r14.mo64870k(r7, r6)
            goto L_0x0582
        L_0x0169:
            boolean r8 = r12.m80923H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            long r8 = m80941Z(r13, r8)
            r14.mo64867g(r7, r8)
            goto L_0x0582
        L_0x017c:
            boolean r8 = r12.m80923H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            long r8 = m80941Z(r13, r8)
            r14.mo64813A(r7, r8)
            goto L_0x0582
        L_0x018f:
            boolean r8 = r12.m80923H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            float r6 = m80939X(r13, r8)
            r14.mo64821I(r7, r6)
            goto L_0x0582
        L_0x01a2:
            boolean r8 = r12.m80923H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            double r8 = m80938W(r13, r8)
            r14.mo64848t(r7, r8)
            goto L_0x0582
        L_0x01b5:
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            r12.m80977w0(r14, r7, r6, r5)
            goto L_0x0582
        L_0x01c2:
            int r7 = r12.m80935T(r5)
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.Schema r8 = r12.m80972u(r5)
            com.google.protobuf.SchemaUtil.m81165U(r7, r6, r14, r8)
            goto L_0x0582
        L_0x01d9:
            int r7 = r12.m80935T(r5)
            long r10 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81174b0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ec:
            int r7 = r12.m80935T(r5)
            long r10 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81172a0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ff:
            int r7 = r12.m80935T(r5)
            long r10 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81170Z(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0212:
            int r7 = r12.m80935T(r5)
            long r10 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81169Y(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0225:
            int r7 = r12.m80935T(r5)
            long r10 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81161Q(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0238:
            int r7 = r12.m80935T(r5)
            long r10 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81178d0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x024b:
            int r7 = r12.m80935T(r5)
            long r10 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81158N(r7, r6, r14, r9)
            goto L_0x0582
        L_0x025e:
            int r7 = r12.m80935T(r5)
            long r10 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81162R(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0271:
            int r7 = r12.m80935T(r5)
            long r10 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81163S(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0284:
            int r7 = r12.m80935T(r5)
            long r10 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81166V(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0297:
            int r7 = r12.m80935T(r5)
            long r10 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81180e0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02aa:
            int r7 = r12.m80935T(r5)
            long r10 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81167W(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02bd:
            int r7 = r12.m80935T(r5)
            long r10 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81164T(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02d0:
            int r7 = r12.m80935T(r5)
            long r10 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81160P(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02e3:
            int r7 = r12.m80935T(r5)
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81174b0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x02f6:
            int r7 = r12.m80935T(r5)
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81172a0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0309:
            int r7 = r12.m80935T(r5)
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81170Z(r7, r6, r14, r4)
            goto L_0x0582
        L_0x031c:
            int r7 = r12.m80935T(r5)
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81169Y(r7, r6, r14, r4)
            goto L_0x0582
        L_0x032f:
            int r7 = r12.m80935T(r5)
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81161Q(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0342:
            int r7 = r12.m80935T(r5)
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81178d0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0355:
            int r7 = r12.m80935T(r5)
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81159O(r7, r6, r14)
            goto L_0x0582
        L_0x0368:
            int r7 = r12.m80935T(r5)
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.Schema r8 = r12.m80972u(r5)
            com.google.protobuf.SchemaUtil.m81168X(r7, r6, r14, r8)
            goto L_0x0582
        L_0x037f:
            int r7 = r12.m80935T(r5)
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81176c0(r7, r6, r14)
            goto L_0x0582
        L_0x0392:
            int r7 = r12.m80935T(r5)
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81158N(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03a5:
            int r7 = r12.m80935T(r5)
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81162R(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03b8:
            int r7 = r12.m80935T(r5)
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81163S(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03cb:
            int r7 = r12.m80935T(r5)
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81166V(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03de:
            int r7 = r12.m80935T(r5)
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81180e0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03f1:
            int r7 = r12.m80935T(r5)
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81167W(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0404:
            int r7 = r12.m80935T(r5)
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81164T(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0417:
            int r7 = r12.m80935T(r5)
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.m81160P(r7, r6, r14, r4)
            goto L_0x0582
        L_0x042a:
            boolean r8 = r12.m80917B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            com.google.protobuf.Schema r8 = r12.m80972u(r5)
            r14.mo64868i(r7, r6, r8)
            goto L_0x0582
        L_0x0441:
            boolean r8 = r12.m80917B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            long r8 = m80926K(r13, r8)
            r14.mo64871p(r7, r8)
            goto L_0x0582
        L_0x0454:
            boolean r8 = r12.m80917B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            int r6 = m80982z(r13, r8)
            r14.mo64861O(r7, r6)
            goto L_0x0582
        L_0x0467:
            boolean r8 = r12.m80917B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            long r8 = m80926K(r13, r8)
            r14.mo64841l(r7, r8)
            goto L_0x0582
        L_0x047a:
            boolean r8 = r12.m80917B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            int r6 = m80982z(r13, r8)
            r14.mo64814C(r7, r6)
            goto L_0x0582
        L_0x048d:
            boolean r8 = r12.m80917B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            int r6 = m80982z(r13, r8)
            r14.mo64823L(r7, r6)
            goto L_0x0582
        L_0x04a0:
            boolean r8 = r12.m80917B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            int r6 = m80982z(r13, r8)
            r14.mo64872s(r7, r6)
            goto L_0x0582
        L_0x04b3:
            boolean r8 = r12.m80917B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            r14.mo64869j(r7, r6)
            goto L_0x0582
        L_0x04c8:
            boolean r8 = r12.m80917B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            com.google.protobuf.Schema r8 = r12.m80972u(r5)
            r14.mo64873w(r7, r6, r8)
            goto L_0x0582
        L_0x04df:
            boolean r8 = r12.m80917B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r13, r8)
            r12.m80979x0(r7, r6, r14)
            goto L_0x0582
        L_0x04f2:
            boolean r8 = r12.m80917B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            boolean r6 = m80952k(r13, r8)
            r14.mo64855B(r7, r6)
            goto L_0x0582
        L_0x0505:
            boolean r8 = r12.m80917B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            int r6 = m80982z(r13, r8)
            r14.mo64865d(r7, r6)
            goto L_0x0582
        L_0x0517:
            boolean r8 = r12.m80917B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            long r8 = m80926K(r13, r8)
            r14.mo64874x(r7, r8)
            goto L_0x0582
        L_0x0529:
            boolean r8 = r12.m80917B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            int r6 = m80982z(r13, r8)
            r14.mo64870k(r7, r6)
            goto L_0x0582
        L_0x053b:
            boolean r8 = r12.m80917B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            long r8 = m80926K(r13, r8)
            r14.mo64867g(r7, r8)
            goto L_0x0582
        L_0x054d:
            boolean r8 = r12.m80917B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            long r8 = m80926K(r13, r8)
            r14.mo64813A(r7, r8)
            goto L_0x0582
        L_0x055f:
            boolean r8 = r12.m80917B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            float r6 = m80966r(r13, r8)
            r14.mo64821I(r7, r6)
            goto L_0x0582
        L_0x0571:
            boolean r8 = r12.m80917B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m80936U(r6)
            double r8 = m80958n(r13, r8)
            r14.mo64848t(r7, r8)
        L_0x0582:
            int r5 = r5 + 3
            goto L_0x0023
        L_0x0586:
            if (r2 == 0) goto L_0x059c
            com.google.protobuf.ExtensionSchema<?> r3 = r12.f57023p
            r3.mo65109j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x059a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0586
        L_0x059a:
            r2 = r1
            goto L_0x0586
        L_0x059c:
            com.google.protobuf.UnknownFieldSchema<?, ?> r0 = r12.f57022o
            r12.m80981y0(r0, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.m80973u0(java.lang.Object, com.google.protobuf.Writer):void");
    }

    /* renamed from: v */
    static UnknownFieldSetLite m80974v(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.m81294c()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite j = UnknownFieldSetLite.m81298j();
        generatedMessageLite.unknownFields = j;
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m80975v0(T r11, com.google.protobuf.Writer r12) throws java.io.IOException {
        /*
            r10 = this;
            com.google.protobuf.UnknownFieldSchema<?, ?> r0 = r10.f57022o
            r10.m80981y0(r0, r11, r12)
            boolean r0 = r10.f57013f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            com.google.protobuf.ExtensionSchema<?> r0 = r10.f57023p
            com.google.protobuf.FieldSet r0 = r0.mo65102c(r11)
            boolean r2 = r0.mo65135n()
            if (r2 != 0) goto L_0x0021
            java.util.Iterator r0 = r0.mo65130g()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0023
        L_0x0021:
            r0 = r1
            r2 = r0
        L_0x0023:
            int[] r3 = r10.f57008a
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x058c
            int r4 = r10.m80969s0(r3)
            int r5 = r10.m80935T(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            com.google.protobuf.ExtensionSchema<?> r6 = r10.f57023p
            int r6 = r6.mo65100a(r2)
            if (r6 <= r5) goto L_0x0050
            com.google.protobuf.ExtensionSchema<?> r6 = r10.f57023p
            r6.mo65109j(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0032
        L_0x004e:
            r2 = r1
            goto L_0x0032
        L_0x0050:
            int r6 = m80967r0(r4)
            r7 = 1
            r8 = 0
            switch(r6) {
                case 0: goto L_0x0577;
                case 1: goto L_0x0565;
                case 2: goto L_0x0553;
                case 3: goto L_0x0541;
                case 4: goto L_0x052f;
                case 5: goto L_0x051d;
                case 6: goto L_0x050b;
                case 7: goto L_0x04f8;
                case 8: goto L_0x04e5;
                case 9: goto L_0x04ce;
                case 10: goto L_0x04b9;
                case 11: goto L_0x04a6;
                case 12: goto L_0x0493;
                case 13: goto L_0x0480;
                case 14: goto L_0x046d;
                case 15: goto L_0x045a;
                case 16: goto L_0x0447;
                case 17: goto L_0x0430;
                case 18: goto L_0x041d;
                case 19: goto L_0x040a;
                case 20: goto L_0x03f7;
                case 21: goto L_0x03e4;
                case 22: goto L_0x03d1;
                case 23: goto L_0x03be;
                case 24: goto L_0x03ab;
                case 25: goto L_0x0398;
                case 26: goto L_0x0385;
                case 27: goto L_0x036e;
                case 28: goto L_0x035b;
                case 29: goto L_0x0348;
                case 30: goto L_0x0335;
                case 31: goto L_0x0322;
                case 32: goto L_0x030f;
                case 33: goto L_0x02fc;
                case 34: goto L_0x02e9;
                case 35: goto L_0x02d6;
                case 36: goto L_0x02c3;
                case 37: goto L_0x02b0;
                case 38: goto L_0x029d;
                case 39: goto L_0x028a;
                case 40: goto L_0x0277;
                case 41: goto L_0x0264;
                case 42: goto L_0x0251;
                case 43: goto L_0x023e;
                case 44: goto L_0x022b;
                case 45: goto L_0x0218;
                case 46: goto L_0x0205;
                case 47: goto L_0x01f2;
                case 48: goto L_0x01df;
                case 49: goto L_0x01c8;
                case 50: goto L_0x01bb;
                case 51: goto L_0x01a8;
                case 52: goto L_0x0195;
                case 53: goto L_0x0182;
                case 54: goto L_0x016f;
                case 55: goto L_0x015c;
                case 56: goto L_0x0149;
                case 57: goto L_0x0136;
                case 58: goto L_0x0123;
                case 59: goto L_0x0110;
                case 60: goto L_0x00f9;
                case 61: goto L_0x00e4;
                case 62: goto L_0x00d1;
                case 63: goto L_0x00be;
                case 64: goto L_0x00ab;
                case 65: goto L_0x0098;
                case 66: goto L_0x0085;
                case 67: goto L_0x0072;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0588
        L_0x005b:
            boolean r6 = r10.m80923H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            com.google.protobuf.Schema r6 = r10.m80972u(r3)
            r12.mo64868i(r5, r4, r6)
            goto L_0x0588
        L_0x0072:
            boolean r6 = r10.m80923H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            long r6 = m80941Z(r11, r6)
            r12.mo64871p(r5, r6)
            goto L_0x0588
        L_0x0085:
            boolean r6 = r10.m80923H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            int r4 = m80940Y(r11, r6)
            r12.mo64861O(r5, r4)
            goto L_0x0588
        L_0x0098:
            boolean r6 = r10.m80923H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            long r6 = m80941Z(r11, r6)
            r12.mo64841l(r5, r6)
            goto L_0x0588
        L_0x00ab:
            boolean r6 = r10.m80923H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            int r4 = m80940Y(r11, r6)
            r12.mo64814C(r5, r4)
            goto L_0x0588
        L_0x00be:
            boolean r6 = r10.m80923H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            int r4 = m80940Y(r11, r6)
            r12.mo64823L(r5, r4)
            goto L_0x0588
        L_0x00d1:
            boolean r6 = r10.m80923H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            int r4 = m80940Y(r11, r6)
            r12.mo64872s(r5, r4)
            goto L_0x0588
        L_0x00e4:
            boolean r6 = r10.m80923H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            com.google.protobuf.ByteString r4 = (com.google.protobuf.ByteString) r4
            r12.mo64869j(r5, r4)
            goto L_0x0588
        L_0x00f9:
            boolean r6 = r10.m80923H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            com.google.protobuf.Schema r6 = r10.m80972u(r3)
            r12.mo64873w(r5, r4, r6)
            goto L_0x0588
        L_0x0110:
            boolean r6 = r10.m80923H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            r10.m80979x0(r5, r4, r12)
            goto L_0x0588
        L_0x0123:
            boolean r6 = r10.m80923H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            boolean r4 = m80937V(r11, r6)
            r12.mo64855B(r5, r4)
            goto L_0x0588
        L_0x0136:
            boolean r6 = r10.m80923H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            int r4 = m80940Y(r11, r6)
            r12.mo64865d(r5, r4)
            goto L_0x0588
        L_0x0149:
            boolean r6 = r10.m80923H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            long r6 = m80941Z(r11, r6)
            r12.mo64874x(r5, r6)
            goto L_0x0588
        L_0x015c:
            boolean r6 = r10.m80923H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            int r4 = m80940Y(r11, r6)
            r12.mo64870k(r5, r4)
            goto L_0x0588
        L_0x016f:
            boolean r6 = r10.m80923H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            long r6 = m80941Z(r11, r6)
            r12.mo64867g(r5, r6)
            goto L_0x0588
        L_0x0182:
            boolean r6 = r10.m80923H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            long r6 = m80941Z(r11, r6)
            r12.mo64813A(r5, r6)
            goto L_0x0588
        L_0x0195:
            boolean r6 = r10.m80923H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            float r4 = m80939X(r11, r6)
            r12.mo64821I(r5, r4)
            goto L_0x0588
        L_0x01a8:
            boolean r6 = r10.m80923H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            double r6 = m80938W(r11, r6)
            r12.mo64848t(r5, r6)
            goto L_0x0588
        L_0x01bb:
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            r10.m80977w0(r12, r5, r4, r3)
            goto L_0x0588
        L_0x01c8:
            int r5 = r10.m80935T(r3)
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.Schema r6 = r10.m80972u(r3)
            com.google.protobuf.SchemaUtil.m81165U(r5, r4, r12, r6)
            goto L_0x0588
        L_0x01df:
            int r5 = r10.m80935T(r3)
            long r8 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81174b0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x01f2:
            int r5 = r10.m80935T(r3)
            long r8 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81172a0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0205:
            int r5 = r10.m80935T(r3)
            long r8 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81170Z(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0218:
            int r5 = r10.m80935T(r3)
            long r8 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81169Y(r5, r4, r12, r7)
            goto L_0x0588
        L_0x022b:
            int r5 = r10.m80935T(r3)
            long r8 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81161Q(r5, r4, r12, r7)
            goto L_0x0588
        L_0x023e:
            int r5 = r10.m80935T(r3)
            long r8 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81178d0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0251:
            int r5 = r10.m80935T(r3)
            long r8 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81158N(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0264:
            int r5 = r10.m80935T(r3)
            long r8 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81162R(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0277:
            int r5 = r10.m80935T(r3)
            long r8 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81163S(r5, r4, r12, r7)
            goto L_0x0588
        L_0x028a:
            int r5 = r10.m80935T(r3)
            long r8 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81166V(r5, r4, r12, r7)
            goto L_0x0588
        L_0x029d:
            int r5 = r10.m80935T(r3)
            long r8 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81180e0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02b0:
            int r5 = r10.m80935T(r3)
            long r8 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81167W(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02c3:
            int r5 = r10.m80935T(r3)
            long r8 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81164T(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02d6:
            int r5 = r10.m80935T(r3)
            long r8 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81160P(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02e9:
            int r5 = r10.m80935T(r3)
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81174b0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02fc:
            int r5 = r10.m80935T(r3)
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81172a0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x030f:
            int r5 = r10.m80935T(r3)
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81170Z(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0322:
            int r5 = r10.m80935T(r3)
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81169Y(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0335:
            int r5 = r10.m80935T(r3)
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81161Q(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0348:
            int r5 = r10.m80935T(r3)
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81178d0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x035b:
            int r5 = r10.m80935T(r3)
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81159O(r5, r4, r12)
            goto L_0x0588
        L_0x036e:
            int r5 = r10.m80935T(r3)
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.Schema r6 = r10.m80972u(r3)
            com.google.protobuf.SchemaUtil.m81168X(r5, r4, r12, r6)
            goto L_0x0588
        L_0x0385:
            int r5 = r10.m80935T(r3)
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81176c0(r5, r4, r12)
            goto L_0x0588
        L_0x0398:
            int r5 = r10.m80935T(r3)
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81158N(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03ab:
            int r5 = r10.m80935T(r3)
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81162R(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03be:
            int r5 = r10.m80935T(r3)
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81163S(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03d1:
            int r5 = r10.m80935T(r3)
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81166V(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03e4:
            int r5 = r10.m80935T(r3)
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81180e0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03f7:
            int r5 = r10.m80935T(r3)
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81167W(r5, r4, r12, r8)
            goto L_0x0588
        L_0x040a:
            int r5 = r10.m80935T(r3)
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81164T(r5, r4, r12, r8)
            goto L_0x0588
        L_0x041d:
            int r5 = r10.m80935T(r3)
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.m81160P(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0430:
            boolean r6 = r10.m80917B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            com.google.protobuf.Schema r6 = r10.m80972u(r3)
            r12.mo64868i(r5, r4, r6)
            goto L_0x0588
        L_0x0447:
            boolean r6 = r10.m80917B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            long r6 = m80926K(r11, r6)
            r12.mo64871p(r5, r6)
            goto L_0x0588
        L_0x045a:
            boolean r6 = r10.m80917B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            int r4 = m80982z(r11, r6)
            r12.mo64861O(r5, r4)
            goto L_0x0588
        L_0x046d:
            boolean r6 = r10.m80917B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            long r6 = m80926K(r11, r6)
            r12.mo64841l(r5, r6)
            goto L_0x0588
        L_0x0480:
            boolean r6 = r10.m80917B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            int r4 = m80982z(r11, r6)
            r12.mo64814C(r5, r4)
            goto L_0x0588
        L_0x0493:
            boolean r6 = r10.m80917B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            int r4 = m80982z(r11, r6)
            r12.mo64823L(r5, r4)
            goto L_0x0588
        L_0x04a6:
            boolean r6 = r10.m80917B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            int r4 = m80982z(r11, r6)
            r12.mo64872s(r5, r4)
            goto L_0x0588
        L_0x04b9:
            boolean r6 = r10.m80917B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            com.google.protobuf.ByteString r4 = (com.google.protobuf.ByteString) r4
            r12.mo64869j(r5, r4)
            goto L_0x0588
        L_0x04ce:
            boolean r6 = r10.m80917B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            com.google.protobuf.Schema r6 = r10.m80972u(r3)
            r12.mo64873w(r5, r4, r6)
            goto L_0x0588
        L_0x04e5:
            boolean r6 = r10.m80917B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.m81360F(r11, r6)
            r10.m80979x0(r5, r4, r12)
            goto L_0x0588
        L_0x04f8:
            boolean r6 = r10.m80917B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            boolean r4 = m80952k(r11, r6)
            r12.mo64855B(r5, r4)
            goto L_0x0588
        L_0x050b:
            boolean r6 = r10.m80917B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            int r4 = m80982z(r11, r6)
            r12.mo64865d(r5, r4)
            goto L_0x0588
        L_0x051d:
            boolean r6 = r10.m80917B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            long r6 = m80926K(r11, r6)
            r12.mo64874x(r5, r6)
            goto L_0x0588
        L_0x052f:
            boolean r6 = r10.m80917B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            int r4 = m80982z(r11, r6)
            r12.mo64870k(r5, r4)
            goto L_0x0588
        L_0x0541:
            boolean r6 = r10.m80917B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            long r6 = m80926K(r11, r6)
            r12.mo64867g(r5, r6)
            goto L_0x0588
        L_0x0553:
            boolean r6 = r10.m80917B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            long r6 = m80926K(r11, r6)
            r12.mo64813A(r5, r6)
            goto L_0x0588
        L_0x0565:
            boolean r6 = r10.m80917B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            float r4 = m80966r(r11, r6)
            r12.mo64821I(r5, r4)
            goto L_0x0588
        L_0x0577:
            boolean r6 = r10.m80917B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m80936U(r4)
            double r6 = m80958n(r11, r6)
            r12.mo64848t(r5, r6)
        L_0x0588:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x058c:
            if (r2 == 0) goto L_0x05a3
            com.google.protobuf.ExtensionSchema<?> r11 = r10.f57023p
            r11.mo65109j(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x05a1
            java.lang.Object r11 = r0.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r2 = r11
            goto L_0x058c
        L_0x05a1:
            r2 = r1
            goto L_0x058c
        L_0x05a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.m80975v0(java.lang.Object, com.google.protobuf.Writer):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0346, code lost:
        r4 = (r4 + r9) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0460, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0517, code lost:
        r5 = r5 + 3;
        r3 = 1048575;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m80976w(T r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f57007s
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 0
        L_0x000f:
            int[] r9 = r0.f57008a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x051e
            int r9 = r0.m80969s0(r5)
            int r10 = r0.m80935T(r5)
            int r11 = m80967r0(r9)
            r12 = 17
            r13 = 1
            if (r11 > r12) goto L_0x003a
            int[] r12 = r0.f57008a
            int r14 = r5 + 2
            r12 = r12[r14]
            r14 = r12 & r3
            int r15 = r12 >>> 20
            int r15 = r13 << r15
            if (r14 == r7) goto L_0x0058
            long r7 = (long) r14
            int r8 = r2.getInt(r1, r7)
            r7 = r14
            goto L_0x0058
        L_0x003a:
            boolean r12 = r0.f57016i
            if (r12 == 0) goto L_0x0056
            com.google.protobuf.FieldType r12 = com.google.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r12 = r12.mo65148b()
            if (r11 < r12) goto L_0x0056
            com.google.protobuf.FieldType r12 = com.google.protobuf.FieldType.SINT64_LIST_PACKED
            int r12 = r12.mo65148b()
            if (r11 > r12) goto L_0x0056
            int[] r12 = r0.f57008a
            int r14 = r5 + 2
            r12 = r12[r14]
            r12 = r12 & r3
            goto L_0x0057
        L_0x0056:
            r12 = 0
        L_0x0057:
            r15 = 0
        L_0x0058:
            long r13 = m80936U(r9)
            r9 = 0
            r3 = 0
            switch(r11) {
                case 0: goto L_0x050b;
                case 1: goto L_0x0501;
                case 2: goto L_0x04f3;
                case 3: goto L_0x04e5;
                case 4: goto L_0x04d7;
                case 5: goto L_0x04cd;
                case 6: goto L_0x04c3;
                case 7: goto L_0x04b8;
                case 8: goto L_0x049c;
                case 9: goto L_0x048b;
                case 10: goto L_0x047c;
                case 11: goto L_0x046f;
                case 12: goto L_0x0462;
                case 13: goto L_0x0457;
                case 14: goto L_0x044e;
                case 15: goto L_0x0441;
                case 16: goto L_0x0434;
                case 17: goto L_0x0421;
                case 18: goto L_0x0412;
                case 19: goto L_0x0406;
                case 20: goto L_0x03fa;
                case 21: goto L_0x03ee;
                case 22: goto L_0x03e2;
                case 23: goto L_0x03d6;
                case 24: goto L_0x03ca;
                case 25: goto L_0x03be;
                case 26: goto L_0x03b3;
                case 27: goto L_0x03a4;
                case 28: goto L_0x0398;
                case 29: goto L_0x038b;
                case 30: goto L_0x037e;
                case 31: goto L_0x0371;
                case 32: goto L_0x0364;
                case 33: goto L_0x0357;
                case 34: goto L_0x034a;
                case 35: goto L_0x032a;
                case 36: goto L_0x030d;
                case 37: goto L_0x02f0;
                case 38: goto L_0x02d3;
                case 39: goto L_0x02b5;
                case 40: goto L_0x0297;
                case 41: goto L_0x0279;
                case 42: goto L_0x025b;
                case 43: goto L_0x023d;
                case 44: goto L_0x021f;
                case 45: goto L_0x0201;
                case 46: goto L_0x01e3;
                case 47: goto L_0x01c5;
                case 48: goto L_0x01a7;
                case 49: goto L_0x0197;
                case 50: goto L_0x0187;
                case 51: goto L_0x0179;
                case 52: goto L_0x016d;
                case 53: goto L_0x015d;
                case 54: goto L_0x014d;
                case 55: goto L_0x013d;
                case 56: goto L_0x0131;
                case 57: goto L_0x0124;
                case 58: goto L_0x0117;
                case 59: goto L_0x00f9;
                case 60: goto L_0x00e5;
                case 61: goto L_0x00d3;
                case 62: goto L_0x00c3;
                case 63: goto L_0x00b3;
                case 64: goto L_0x00a6;
                case 65: goto L_0x009a;
                case 66: goto L_0x008a;
                case 67: goto L_0x007a;
                case 68: goto L_0x0064;
                default: goto L_0x0062;
            }
        L_0x0062:
            goto L_0x041e
        L_0x0064:
            boolean r3 = r0.m80923H(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.MessageLite r3 = (com.google.protobuf.MessageLite) r3
            com.google.protobuf.Schema r4 = r0.m80972u(r5)
            int r3 = com.google.protobuf.CodedOutputStream.m80119k0(r10, r3, r4)
            goto L_0x041d
        L_0x007a:
            boolean r3 = r0.m80923H(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            long r3 = m80941Z(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m80089J0(r10, r3)
            goto L_0x041d
        L_0x008a:
            boolean r3 = r0.m80923H(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            int r3 = m80940Y(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m80087H0(r10, r3)
            goto L_0x041d
        L_0x009a:
            boolean r9 = r0.m80923H(r1, r10, r5)
            if (r9 == 0) goto L_0x041e
            int r3 = com.google.protobuf.CodedOutputStream.m80085F0(r10, r3)
            goto L_0x041d
        L_0x00a6:
            boolean r3 = r0.m80923H(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            r3 = 0
            int r4 = com.google.protobuf.CodedOutputStream.m80083D0(r10, r3)
            goto L_0x0460
        L_0x00b3:
            boolean r3 = r0.m80923H(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            int r3 = m80940Y(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m80111c0(r10, r3)
            goto L_0x041d
        L_0x00c3:
            boolean r3 = r0.m80923H(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            int r3 = m80940Y(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m80094O0(r10, r3)
            goto L_0x041d
        L_0x00d3:
            boolean r3 = r0.m80923H(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            int r3 = com.google.protobuf.CodedOutputStream.m80105Y(r10, r3)
            goto L_0x041d
        L_0x00e5:
            boolean r3 = r0.m80923H(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.Schema r4 = r0.m80972u(r5)
            int r3 = com.google.protobuf.SchemaUtil.m81190o(r10, r3, r4)
            goto L_0x041d
        L_0x00f9:
            boolean r3 = r0.m80923H(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.google.protobuf.ByteString
            if (r4 == 0) goto L_0x010f
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            int r3 = com.google.protobuf.CodedOutputStream.m80105Y(r10, r3)
            goto L_0x041d
        L_0x010f:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.CodedOutputStream.m80091L0(r10, r3)
            goto L_0x041d
        L_0x0117:
            boolean r3 = r0.m80923H(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            r3 = 1
            int r3 = com.google.protobuf.CodedOutputStream.m80101V(r10, r3)
            goto L_0x041d
        L_0x0124:
            boolean r3 = r0.m80923H(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            r3 = 0
            int r4 = com.google.protobuf.CodedOutputStream.m80113e0(r10, r3)
            goto L_0x0460
        L_0x0131:
            boolean r9 = r0.m80923H(r1, r10, r5)
            if (r9 == 0) goto L_0x041e
            int r3 = com.google.protobuf.CodedOutputStream.m80115g0(r10, r3)
            goto L_0x041d
        L_0x013d:
            boolean r3 = r0.m80923H(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            int r3 = m80940Y(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m80122n0(r10, r3)
            goto L_0x041d
        L_0x014d:
            boolean r3 = r0.m80923H(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            long r3 = m80941Z(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m80096Q0(r10, r3)
            goto L_0x041d
        L_0x015d:
            boolean r3 = r0.m80923H(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            long r3 = m80941Z(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m80124p0(r10, r3)
            goto L_0x041d
        L_0x016d:
            boolean r3 = r0.m80923H(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            int r3 = com.google.protobuf.CodedOutputStream.m80117i0(r10, r9)
            goto L_0x041d
        L_0x0179:
            boolean r3 = r0.m80923H(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            r3 = 0
            int r3 = com.google.protobuf.CodedOutputStream.m80109a0(r10, r3)
            goto L_0x041d
        L_0x0187:
            com.google.protobuf.MapFieldSchema r3 = r0.f57024q
            java.lang.Object r4 = r2.getObject(r1, r13)
            java.lang.Object r9 = r0.m80970t(r5)
            int r3 = r3.mo65338g(r10, r4, r9)
            goto L_0x041d
        L_0x0197:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.Schema r4 = r0.m80972u(r5)
            int r3 = com.google.protobuf.SchemaUtil.m81185j(r10, r3, r4)
            goto L_0x041d
        L_0x01a7:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81195t(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f57016i
            if (r4 == 0) goto L_0x01bb
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x01bb:
            int r4 = com.google.protobuf.CodedOutputStream.m80093N0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m80095P0(r3)
            goto L_0x0346
        L_0x01c5:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81193r(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f57016i
            if (r4 == 0) goto L_0x01d9
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x01d9:
            int r4 = com.google.protobuf.CodedOutputStream.m80093N0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m80095P0(r3)
            goto L_0x0346
        L_0x01e3:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81184i(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f57016i
            if (r4 == 0) goto L_0x01f7
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x01f7:
            int r4 = com.google.protobuf.CodedOutputStream.m80093N0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m80095P0(r3)
            goto L_0x0346
        L_0x0201:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81182g(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f57016i
            if (r4 == 0) goto L_0x0215
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0215:
            int r4 = com.google.protobuf.CodedOutputStream.m80093N0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m80095P0(r3)
            goto L_0x0346
        L_0x021f:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81179e(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f57016i
            if (r4 == 0) goto L_0x0233
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0233:
            int r4 = com.google.protobuf.CodedOutputStream.m80093N0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m80095P0(r3)
            goto L_0x0346
        L_0x023d:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81198w(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f57016i
            if (r4 == 0) goto L_0x0251
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0251:
            int r4 = com.google.protobuf.CodedOutputStream.m80093N0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m80095P0(r3)
            goto L_0x0346
        L_0x025b:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81173b(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f57016i
            if (r4 == 0) goto L_0x026f
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x026f:
            int r4 = com.google.protobuf.CodedOutputStream.m80093N0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m80095P0(r3)
            goto L_0x0346
        L_0x0279:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81182g(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f57016i
            if (r4 == 0) goto L_0x028d
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x028d:
            int r4 = com.google.protobuf.CodedOutputStream.m80093N0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m80095P0(r3)
            goto L_0x0346
        L_0x0297:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81184i(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f57016i
            if (r4 == 0) goto L_0x02ab
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x02ab:
            int r4 = com.google.protobuf.CodedOutputStream.m80093N0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m80095P0(r3)
            goto L_0x0346
        L_0x02b5:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81187l(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f57016i
            if (r4 == 0) goto L_0x02c9
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x02c9:
            int r4 = com.google.protobuf.CodedOutputStream.m80093N0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m80095P0(r3)
            goto L_0x0346
        L_0x02d3:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81200y(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f57016i
            if (r4 == 0) goto L_0x02e7
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x02e7:
            int r4 = com.google.protobuf.CodedOutputStream.m80093N0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m80095P0(r3)
            goto L_0x0346
        L_0x02f0:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81189n(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f57016i
            if (r4 == 0) goto L_0x0304
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0304:
            int r4 = com.google.protobuf.CodedOutputStream.m80093N0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m80095P0(r3)
            goto L_0x0346
        L_0x030d:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81182g(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f57016i
            if (r4 == 0) goto L_0x0321
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0321:
            int r4 = com.google.protobuf.CodedOutputStream.m80093N0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m80095P0(r3)
            goto L_0x0346
        L_0x032a:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81184i(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f57016i
            if (r4 == 0) goto L_0x033e
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x033e:
            int r4 = com.google.protobuf.CodedOutputStream.m80093N0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m80095P0(r3)
        L_0x0346:
            int r4 = r4 + r9
            int r4 = r4 + r3
            goto L_0x0460
        L_0x034a:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.protobuf.SchemaUtil.m81194s(r10, r3, r4)
            goto L_0x041d
        L_0x0357:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81192q(r10, r3, r4)
            goto L_0x041d
        L_0x0364:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81183h(r10, r3, r4)
            goto L_0x041d
        L_0x0371:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81181f(r10, r3, r4)
            goto L_0x041d
        L_0x037e:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81177d(r10, r3, r4)
            goto L_0x041d
        L_0x038b:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81197v(r10, r3, r4)
            goto L_0x041d
        L_0x0398:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81175c(r10, r3)
            goto L_0x041d
        L_0x03a4:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.Schema r4 = r0.m80972u(r5)
            int r3 = com.google.protobuf.SchemaUtil.m81191p(r10, r3, r4)
            goto L_0x041d
        L_0x03b3:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81196u(r10, r3)
            goto L_0x041d
        L_0x03be:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.protobuf.SchemaUtil.m81171a(r10, r3, r4)
            goto L_0x041d
        L_0x03ca:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81181f(r10, r3, r4)
            goto L_0x041d
        L_0x03d6:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81183h(r10, r3, r4)
            goto L_0x041d
        L_0x03e2:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81186k(r10, r3, r4)
            goto L_0x041d
        L_0x03ee:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81199x(r10, r3, r4)
            goto L_0x041d
        L_0x03fa:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81188m(r10, r3, r4)
            goto L_0x041d
        L_0x0406:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81181f(r10, r3, r4)
            goto L_0x041d
        L_0x0412:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m81183h(r10, r3, r4)
        L_0x041d:
            int r6 = r6 + r3
        L_0x041e:
            r11 = 0
            goto L_0x0517
        L_0x0421:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.MessageLite r3 = (com.google.protobuf.MessageLite) r3
            com.google.protobuf.Schema r4 = r0.m80972u(r5)
            int r3 = com.google.protobuf.CodedOutputStream.m80119k0(r10, r3, r4)
            goto L_0x041d
        L_0x0434:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m80089J0(r10, r3)
            goto L_0x041d
        L_0x0441:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m80087H0(r10, r3)
            goto L_0x041d
        L_0x044e:
            r9 = r8 & r15
            if (r9 == 0) goto L_0x041e
            int r3 = com.google.protobuf.CodedOutputStream.m80085F0(r10, r3)
            goto L_0x041d
        L_0x0457:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            r3 = 0
            int r4 = com.google.protobuf.CodedOutputStream.m80083D0(r10, r3)
        L_0x0460:
            int r6 = r6 + r4
            goto L_0x041e
        L_0x0462:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m80111c0(r10, r3)
            goto L_0x041d
        L_0x046f:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m80094O0(r10, r3)
            goto L_0x041d
        L_0x047c:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            int r3 = com.google.protobuf.CodedOutputStream.m80105Y(r10, r3)
            goto L_0x041d
        L_0x048b:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.Schema r4 = r0.m80972u(r5)
            int r3 = com.google.protobuf.SchemaUtil.m81190o(r10, r3, r4)
            goto L_0x041d
        L_0x049c:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.google.protobuf.ByteString
            if (r4 == 0) goto L_0x04b0
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            int r3 = com.google.protobuf.CodedOutputStream.m80105Y(r10, r3)
            goto L_0x041d
        L_0x04b0:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.CodedOutputStream.m80091L0(r10, r3)
            goto L_0x041d
        L_0x04b8:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            r3 = 1
            int r3 = com.google.protobuf.CodedOutputStream.m80101V(r10, r3)
            goto L_0x041d
        L_0x04c3:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            r11 = 0
            int r3 = com.google.protobuf.CodedOutputStream.m80113e0(r10, r11)
            goto L_0x0516
        L_0x04cd:
            r11 = 0
            r9 = r8 & r15
            if (r9 == 0) goto L_0x0517
            int r3 = com.google.protobuf.CodedOutputStream.m80115g0(r10, r3)
            goto L_0x0516
        L_0x04d7:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0517
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m80122n0(r10, r3)
            goto L_0x0516
        L_0x04e5:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0517
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m80096Q0(r10, r3)
            goto L_0x0516
        L_0x04f3:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0517
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m80124p0(r10, r3)
            goto L_0x0516
        L_0x0501:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0517
            int r3 = com.google.protobuf.CodedOutputStream.m80117i0(r10, r9)
            goto L_0x0516
        L_0x050b:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0517
            r3 = 0
            int r3 = com.google.protobuf.CodedOutputStream.m80109a0(r10, r3)
        L_0x0516:
            int r6 = r6 + r3
        L_0x0517:
            int r5 = r5 + 3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000f
        L_0x051e:
            com.google.protobuf.UnknownFieldSchema<?, ?> r2 = r0.f57022o
            int r2 = r0.m80980y(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f57013f
            if (r2 == 0) goto L_0x0534
            com.google.protobuf.ExtensionSchema<?> r2 = r0.f57023p
            com.google.protobuf.FieldSet r1 = r2.mo65102c(r1)
            int r1 = r1.mo65134l()
            int r6 = r6 + r1
        L_0x0534:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.m80976w(java.lang.Object):int");
    }

    /* renamed from: w0 */
    private <K, V> void m80977w0(Writer writer, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            writer.mo64820H(i, this.f57024q.mo65333b(m80970t(i2)), this.f57024q.mo65336e(obj));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m80978x(T r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = f57007s
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0008:
            int[] r6 = r0.f57008a
            int r6 = r6.length
            if (r4 >= r6) goto L_0x04e3
            int r6 = r15.m80969s0(r4)
            int r7 = m80967r0(r6)
            int r8 = r15.m80935T(r4)
            long r9 = m80936U(r6)
            com.google.protobuf.FieldType r6 = com.google.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r6 = r6.mo65148b()
            if (r7 < r6) goto L_0x0038
            com.google.protobuf.FieldType r6 = com.google.protobuf.FieldType.SINT64_LIST_PACKED
            int r6 = r6.mo65148b()
            if (r7 > r6) goto L_0x0038
            int[] r6 = r0.f57008a
            int r11 = r4 + 2
            r6 = r6[r11]
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r11
            goto L_0x0039
        L_0x0038:
            r6 = 0
        L_0x0039:
            r11 = 1
            r12 = 0
            r13 = 0
            switch(r7) {
                case 0: goto L_0x04d1;
                case 1: goto L_0x04c5;
                case 2: goto L_0x04b5;
                case 3: goto L_0x04a5;
                case 4: goto L_0x0495;
                case 5: goto L_0x0489;
                case 6: goto L_0x047d;
                case 7: goto L_0x0471;
                case 8: goto L_0x0453;
                case 9: goto L_0x043f;
                case 10: goto L_0x042e;
                case 11: goto L_0x041f;
                case 12: goto L_0x0410;
                case 13: goto L_0x0405;
                case 14: goto L_0x03fa;
                case 15: goto L_0x03eb;
                case 16: goto L_0x03dc;
                case 17: goto L_0x03c7;
                case 18: goto L_0x03bc;
                case 19: goto L_0x03b3;
                case 20: goto L_0x03aa;
                case 21: goto L_0x03a1;
                case 22: goto L_0x0398;
                case 23: goto L_0x038f;
                case 24: goto L_0x0386;
                case 25: goto L_0x037d;
                case 26: goto L_0x0374;
                case 27: goto L_0x0367;
                case 28: goto L_0x035e;
                case 29: goto L_0x0355;
                case 30: goto L_0x034b;
                case 31: goto L_0x0341;
                case 32: goto L_0x0337;
                case 33: goto L_0x032d;
                case 34: goto L_0x0323;
                case 35: goto L_0x0303;
                case 36: goto L_0x02e6;
                case 37: goto L_0x02c9;
                case 38: goto L_0x02ac;
                case 39: goto L_0x028e;
                case 40: goto L_0x0270;
                case 41: goto L_0x0252;
                case 42: goto L_0x0234;
                case 43: goto L_0x0216;
                case 44: goto L_0x01f8;
                case 45: goto L_0x01da;
                case 46: goto L_0x01bc;
                case 47: goto L_0x019e;
                case 48: goto L_0x0180;
                case 49: goto L_0x0172;
                case 50: goto L_0x0162;
                case 51: goto L_0x0154;
                case 52: goto L_0x0148;
                case 53: goto L_0x0138;
                case 54: goto L_0x0128;
                case 55: goto L_0x0118;
                case 56: goto L_0x010c;
                case 57: goto L_0x0100;
                case 58: goto L_0x00f4;
                case 59: goto L_0x00d6;
                case 60: goto L_0x00c2;
                case 61: goto L_0x00b0;
                case 62: goto L_0x00a0;
                case 63: goto L_0x0090;
                case 64: goto L_0x0084;
                case 65: goto L_0x0078;
                case 66: goto L_0x0068;
                case 67: goto L_0x0058;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x04df
        L_0x0042:
            boolean r6 = r15.m80923H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r1, r9)
            com.google.protobuf.MessageLite r6 = (com.google.protobuf.MessageLite) r6
            com.google.protobuf.Schema r7 = r15.m80972u(r4)
            int r6 = com.google.protobuf.CodedOutputStream.m80119k0(r8, r6, r7)
            goto L_0x03c4
        L_0x0058:
            boolean r6 = r15.m80923H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m80941Z(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m80089J0(r8, r6)
            goto L_0x03c4
        L_0x0068:
            boolean r6 = r15.m80923H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m80940Y(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m80087H0(r8, r6)
            goto L_0x03c4
        L_0x0078:
            boolean r6 = r15.m80923H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m80085F0(r8, r13)
            goto L_0x03c4
        L_0x0084:
            boolean r6 = r15.m80923H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m80083D0(r8, r3)
            goto L_0x03c4
        L_0x0090:
            boolean r6 = r15.m80923H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m80940Y(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m80111c0(r8, r6)
            goto L_0x03c4
        L_0x00a0:
            boolean r6 = r15.m80923H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m80940Y(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m80094O0(r8, r6)
            goto L_0x03c4
        L_0x00b0:
            boolean r6 = r15.m80923H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r1, r9)
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            int r6 = com.google.protobuf.CodedOutputStream.m80105Y(r8, r6)
            goto L_0x03c4
        L_0x00c2:
            boolean r6 = r15.m80923H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r1, r9)
            com.google.protobuf.Schema r7 = r15.m80972u(r4)
            int r6 = com.google.protobuf.SchemaUtil.m81190o(r8, r6, r7)
            goto L_0x03c4
        L_0x00d6:
            boolean r6 = r15.m80923H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r1, r9)
            boolean r7 = r6 instanceof com.google.protobuf.ByteString
            if (r7 == 0) goto L_0x00ec
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            int r6 = com.google.protobuf.CodedOutputStream.m80105Y(r8, r6)
            goto L_0x03c4
        L_0x00ec:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.protobuf.CodedOutputStream.m80091L0(r8, r6)
            goto L_0x03c4
        L_0x00f4:
            boolean r6 = r15.m80923H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m80101V(r8, r11)
            goto L_0x03c4
        L_0x0100:
            boolean r6 = r15.m80923H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m80113e0(r8, r3)
            goto L_0x03c4
        L_0x010c:
            boolean r6 = r15.m80923H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m80115g0(r8, r13)
            goto L_0x03c4
        L_0x0118:
            boolean r6 = r15.m80923H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m80940Y(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m80122n0(r8, r6)
            goto L_0x03c4
        L_0x0128:
            boolean r6 = r15.m80923H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m80941Z(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m80096Q0(r8, r6)
            goto L_0x03c4
        L_0x0138:
            boolean r6 = r15.m80923H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m80941Z(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m80124p0(r8, r6)
            goto L_0x03c4
        L_0x0148:
            boolean r6 = r15.m80923H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m80117i0(r8, r12)
            goto L_0x03c4
        L_0x0154:
            boolean r6 = r15.m80923H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            r6 = 0
            int r6 = com.google.protobuf.CodedOutputStream.m80109a0(r8, r6)
            goto L_0x03c4
        L_0x0162:
            com.google.protobuf.MapFieldSchema r6 = r0.f57024q
            java.lang.Object r7 = com.google.protobuf.UnsafeUtil.m81360F(r1, r9)
            java.lang.Object r9 = r15.m80970t(r4)
            int r6 = r6.mo65338g(r8, r7, r9)
            goto L_0x03c4
        L_0x0172:
            java.util.List r6 = m80925J(r1, r9)
            com.google.protobuf.Schema r7 = r15.m80972u(r4)
            int r6 = com.google.protobuf.SchemaUtil.m81185j(r8, r6, r7)
            goto L_0x03c4
        L_0x0180:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.m81195t(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f57016i
            if (r9 == 0) goto L_0x0194
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0194:
            int r6 = com.google.protobuf.CodedOutputStream.m80093N0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m80095P0(r7)
            goto L_0x031f
        L_0x019e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.m81193r(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f57016i
            if (r9 == 0) goto L_0x01b2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01b2:
            int r6 = com.google.protobuf.CodedOutputStream.m80093N0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m80095P0(r7)
            goto L_0x031f
        L_0x01bc:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.m81184i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f57016i
            if (r9 == 0) goto L_0x01d0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01d0:
            int r6 = com.google.protobuf.CodedOutputStream.m80093N0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m80095P0(r7)
            goto L_0x031f
        L_0x01da:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.m81182g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f57016i
            if (r9 == 0) goto L_0x01ee
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01ee:
            int r6 = com.google.protobuf.CodedOutputStream.m80093N0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m80095P0(r7)
            goto L_0x031f
        L_0x01f8:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.m81179e(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f57016i
            if (r9 == 0) goto L_0x020c
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x020c:
            int r6 = com.google.protobuf.CodedOutputStream.m80093N0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m80095P0(r7)
            goto L_0x031f
        L_0x0216:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.m81198w(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f57016i
            if (r9 == 0) goto L_0x022a
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x022a:
            int r6 = com.google.protobuf.CodedOutputStream.m80093N0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m80095P0(r7)
            goto L_0x031f
        L_0x0234:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.m81173b(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f57016i
            if (r9 == 0) goto L_0x0248
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0248:
            int r6 = com.google.protobuf.CodedOutputStream.m80093N0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m80095P0(r7)
            goto L_0x031f
        L_0x0252:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.m81182g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f57016i
            if (r9 == 0) goto L_0x0266
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0266:
            int r6 = com.google.protobuf.CodedOutputStream.m80093N0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m80095P0(r7)
            goto L_0x031f
        L_0x0270:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.m81184i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f57016i
            if (r9 == 0) goto L_0x0284
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0284:
            int r6 = com.google.protobuf.CodedOutputStream.m80093N0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m80095P0(r7)
            goto L_0x031f
        L_0x028e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.m81187l(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f57016i
            if (r9 == 0) goto L_0x02a2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02a2:
            int r6 = com.google.protobuf.CodedOutputStream.m80093N0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m80095P0(r7)
            goto L_0x031f
        L_0x02ac:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.m81200y(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f57016i
            if (r9 == 0) goto L_0x02c0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02c0:
            int r6 = com.google.protobuf.CodedOutputStream.m80093N0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m80095P0(r7)
            goto L_0x031f
        L_0x02c9:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.m81189n(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f57016i
            if (r9 == 0) goto L_0x02dd
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02dd:
            int r6 = com.google.protobuf.CodedOutputStream.m80093N0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m80095P0(r7)
            goto L_0x031f
        L_0x02e6:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.m81182g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f57016i
            if (r9 == 0) goto L_0x02fa
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02fa:
            int r6 = com.google.protobuf.CodedOutputStream.m80093N0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m80095P0(r7)
            goto L_0x031f
        L_0x0303:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.m81184i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f57016i
            if (r9 == 0) goto L_0x0317
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0317:
            int r6 = com.google.protobuf.CodedOutputStream.m80093N0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m80095P0(r7)
        L_0x031f:
            int r6 = r6 + r8
            int r6 = r6 + r7
            goto L_0x03c4
        L_0x0323:
            java.util.List r6 = m80925J(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.m81194s(r8, r6, r3)
            goto L_0x03c4
        L_0x032d:
            java.util.List r6 = m80925J(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.m81192q(r8, r6, r3)
            goto L_0x03c4
        L_0x0337:
            java.util.List r6 = m80925J(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.m81183h(r8, r6, r3)
            goto L_0x03c4
        L_0x0341:
            java.util.List r6 = m80925J(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.m81181f(r8, r6, r3)
            goto L_0x03c4
        L_0x034b:
            java.util.List r6 = m80925J(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.m81177d(r8, r6, r3)
            goto L_0x03c4
        L_0x0355:
            java.util.List r6 = m80925J(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.m81197v(r8, r6, r3)
            goto L_0x03c4
        L_0x035e:
            java.util.List r6 = m80925J(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.m81175c(r8, r6)
            goto L_0x03c4
        L_0x0367:
            java.util.List r6 = m80925J(r1, r9)
            com.google.protobuf.Schema r7 = r15.m80972u(r4)
            int r6 = com.google.protobuf.SchemaUtil.m81191p(r8, r6, r7)
            goto L_0x03c4
        L_0x0374:
            java.util.List r6 = m80925J(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.m81196u(r8, r6)
            goto L_0x03c4
        L_0x037d:
            java.util.List r6 = m80925J(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.m81171a(r8, r6, r3)
            goto L_0x03c4
        L_0x0386:
            java.util.List r6 = m80925J(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.m81181f(r8, r6, r3)
            goto L_0x03c4
        L_0x038f:
            java.util.List r6 = m80925J(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.m81183h(r8, r6, r3)
            goto L_0x03c4
        L_0x0398:
            java.util.List r6 = m80925J(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.m81186k(r8, r6, r3)
            goto L_0x03c4
        L_0x03a1:
            java.util.List r6 = m80925J(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.m81199x(r8, r6, r3)
            goto L_0x03c4
        L_0x03aa:
            java.util.List r6 = m80925J(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.m81188m(r8, r6, r3)
            goto L_0x03c4
        L_0x03b3:
            java.util.List r6 = m80925J(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.m81181f(r8, r6, r3)
            goto L_0x03c4
        L_0x03bc:
            java.util.List r6 = m80925J(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.m81183h(r8, r6, r3)
        L_0x03c4:
            int r5 = r5 + r6
            goto L_0x04df
        L_0x03c7:
            boolean r6 = r15.m80917B(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r1, r9)
            com.google.protobuf.MessageLite r6 = (com.google.protobuf.MessageLite) r6
            com.google.protobuf.Schema r7 = r15.m80972u(r4)
            int r6 = com.google.protobuf.CodedOutputStream.m80119k0(r8, r6, r7)
            goto L_0x03c4
        L_0x03dc:
            boolean r6 = r15.m80917B(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = com.google.protobuf.UnsafeUtil.m81358D(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m80089J0(r8, r6)
            goto L_0x03c4
        L_0x03eb:
            boolean r6 = r15.m80917B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.UnsafeUtil.m81356B(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m80087H0(r8, r6)
            goto L_0x03c4
        L_0x03fa:
            boolean r6 = r15.m80917B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m80085F0(r8, r13)
            goto L_0x03c4
        L_0x0405:
            boolean r6 = r15.m80917B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m80083D0(r8, r3)
            goto L_0x03c4
        L_0x0410:
            boolean r6 = r15.m80917B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.UnsafeUtil.m81356B(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m80111c0(r8, r6)
            goto L_0x03c4
        L_0x041f:
            boolean r6 = r15.m80917B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.UnsafeUtil.m81356B(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m80094O0(r8, r6)
            goto L_0x03c4
        L_0x042e:
            boolean r6 = r15.m80917B(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r1, r9)
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            int r6 = com.google.protobuf.CodedOutputStream.m80105Y(r8, r6)
            goto L_0x03c4
        L_0x043f:
            boolean r6 = r15.m80917B(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r1, r9)
            com.google.protobuf.Schema r7 = r15.m80972u(r4)
            int r6 = com.google.protobuf.SchemaUtil.m81190o(r8, r6, r7)
            goto L_0x03c4
        L_0x0453:
            boolean r6 = r15.m80917B(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.m81360F(r1, r9)
            boolean r7 = r6 instanceof com.google.protobuf.ByteString
            if (r7 == 0) goto L_0x0469
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            int r6 = com.google.protobuf.CodedOutputStream.m80105Y(r8, r6)
            goto L_0x03c4
        L_0x0469:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.protobuf.CodedOutputStream.m80091L0(r8, r6)
            goto L_0x03c4
        L_0x0471:
            boolean r6 = r15.m80917B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m80101V(r8, r11)
            goto L_0x03c4
        L_0x047d:
            boolean r6 = r15.m80917B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m80113e0(r8, r3)
            goto L_0x03c4
        L_0x0489:
            boolean r6 = r15.m80917B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m80115g0(r8, r13)
            goto L_0x03c4
        L_0x0495:
            boolean r6 = r15.m80917B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.UnsafeUtil.m81356B(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m80122n0(r8, r6)
            goto L_0x03c4
        L_0x04a5:
            boolean r6 = r15.m80917B(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = com.google.protobuf.UnsafeUtil.m81358D(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m80096Q0(r8, r6)
            goto L_0x03c4
        L_0x04b5:
            boolean r6 = r15.m80917B(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = com.google.protobuf.UnsafeUtil.m81358D(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m80124p0(r8, r6)
            goto L_0x03c4
        L_0x04c5:
            boolean r6 = r15.m80917B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m80117i0(r8, r12)
            goto L_0x03c4
        L_0x04d1:
            boolean r6 = r15.m80917B(r1, r4)
            if (r6 == 0) goto L_0x04df
            r6 = 0
            int r6 = com.google.protobuf.CodedOutputStream.m80109a0(r8, r6)
            goto L_0x03c4
        L_0x04df:
            int r4 = r4 + 3
            goto L_0x0008
        L_0x04e3:
            com.google.protobuf.UnknownFieldSchema<?, ?> r2 = r0.f57022o
            int r1 = r15.m80980y(r2, r1)
            int r5 = r5 + r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.m80978x(java.lang.Object):int");
    }

    /* renamed from: x0 */
    private void m80979x0(int i, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.mo64866f(i, (String) obj);
        } else {
            writer.mo64869j(i, (ByteString) obj);
        }
    }

    /* renamed from: y */
    private <UT, UB> int m80980y(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t) {
        return unknownFieldSchema.mo65449h(unknownFieldSchema.mo65448g(t));
    }

    /* renamed from: y0 */
    private <UT, UB> void m80981y0(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t, Writer writer) throws IOException {
        unknownFieldSchema.mo65461t(unknownFieldSchema.mo65448g(t), writer);
    }

    /* renamed from: z */
    private static <T> int m80982z(T t, long j) {
        return UnsafeUtil.m81356B(t, j);
    }

    /* renamed from: a */
    public void mo65343a(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i = 0; i < this.f57008a.length; i += 3) {
            m80931P(t, t2, i);
        }
        SchemaUtil.m81151G(this.f57022o, t, t2);
        if (this.f57013f) {
            SchemaUtil.m81149E(this.f57023p, t, t2);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c1, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0225, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0226, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo65344b(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f57008a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022a
            int r3 = r8.m80969s0(r1)
            int r4 = r8.m80935T(r1)
            long r5 = m80936U(r3)
            int r3 = m80967r0(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0217;
                case 1: goto L_0x020c;
                case 2: goto L_0x0201;
                case 3: goto L_0x01f6;
                case 4: goto L_0x01ef;
                case 5: goto L_0x01e4;
                case 6: goto L_0x01dd;
                case 7: goto L_0x01d2;
                case 8: goto L_0x01c5;
                case 9: goto L_0x01b7;
                case 10: goto L_0x01ab;
                case 11: goto L_0x01a3;
                case 12: goto L_0x019b;
                case 13: goto L_0x0193;
                case 14: goto L_0x0187;
                case 15: goto L_0x017f;
                case 16: goto L_0x0173;
                case 17: goto L_0x0168;
                case 18: goto L_0x015c;
                case 19: goto L_0x015c;
                case 20: goto L_0x015c;
                case 21: goto L_0x015c;
                case 22: goto L_0x015c;
                case 23: goto L_0x015c;
                case 24: goto L_0x015c;
                case 25: goto L_0x015c;
                case 26: goto L_0x015c;
                case 27: goto L_0x015c;
                case 28: goto L_0x015c;
                case 29: goto L_0x015c;
                case 30: goto L_0x015c;
                case 31: goto L_0x015c;
                case 32: goto L_0x015c;
                case 33: goto L_0x015c;
                case 34: goto L_0x015c;
                case 35: goto L_0x015c;
                case 36: goto L_0x015c;
                case 37: goto L_0x015c;
                case 38: goto L_0x015c;
                case 39: goto L_0x015c;
                case 40: goto L_0x015c;
                case 41: goto L_0x015c;
                case 42: goto L_0x015c;
                case 43: goto L_0x015c;
                case 44: goto L_0x015c;
                case 45: goto L_0x015c;
                case 46: goto L_0x015c;
                case 47: goto L_0x015c;
                case 48: goto L_0x015c;
                case 49: goto L_0x015c;
                case 50: goto L_0x0150;
                case 51: goto L_0x013a;
                case 52: goto L_0x0128;
                case 53: goto L_0x0116;
                case 54: goto L_0x0104;
                case 55: goto L_0x00f6;
                case 56: goto L_0x00e4;
                case 57: goto L_0x00d6;
                case 58: goto L_0x00c4;
                case 59: goto L_0x00b0;
                case 60: goto L_0x009e;
                case 61: goto L_0x008c;
                case 62: goto L_0x007e;
                case 63: goto L_0x0070;
                case 64: goto L_0x0062;
                case 65: goto L_0x0050;
                case 66: goto L_0x0042;
                case 67: goto L_0x0030;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0226
        L_0x001e:
            boolean r3 = r8.m80923H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.m81360F(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0030:
            boolean r3 = r8.m80923H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m80941Z(r9, r5)
            int r3 = com.google.protobuf.Internal.m80737f(r3)
            goto L_0x0225
        L_0x0042:
            boolean r3 = r8.m80923H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m80940Y(r9, r5)
            goto L_0x0225
        L_0x0050:
            boolean r3 = r8.m80923H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m80941Z(r9, r5)
            int r3 = com.google.protobuf.Internal.m80737f(r3)
            goto L_0x0225
        L_0x0062:
            boolean r3 = r8.m80923H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m80940Y(r9, r5)
            goto L_0x0225
        L_0x0070:
            boolean r3 = r8.m80923H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m80940Y(r9, r5)
            goto L_0x0225
        L_0x007e:
            boolean r3 = r8.m80923H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m80940Y(r9, r5)
            goto L_0x0225
        L_0x008c:
            boolean r3 = r8.m80923H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.m81360F(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x009e:
            boolean r3 = r8.m80923H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.m81360F(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00b0:
            boolean r3 = r8.m80923H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.m81360F(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00c4:
            boolean r3 = r8.m80923H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            boolean r3 = m80937V(r9, r5)
            int r3 = com.google.protobuf.Internal.m80734c(r3)
            goto L_0x0225
        L_0x00d6:
            boolean r3 = r8.m80923H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m80940Y(r9, r5)
            goto L_0x0225
        L_0x00e4:
            boolean r3 = r8.m80923H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m80941Z(r9, r5)
            int r3 = com.google.protobuf.Internal.m80737f(r3)
            goto L_0x0225
        L_0x00f6:
            boolean r3 = r8.m80923H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m80940Y(r9, r5)
            goto L_0x0225
        L_0x0104:
            boolean r3 = r8.m80923H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m80941Z(r9, r5)
            int r3 = com.google.protobuf.Internal.m80737f(r3)
            goto L_0x0225
        L_0x0116:
            boolean r3 = r8.m80923H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m80941Z(r9, r5)
            int r3 = com.google.protobuf.Internal.m80737f(r3)
            goto L_0x0225
        L_0x0128:
            boolean r3 = r8.m80923H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            float r3 = m80939X(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x013a:
            boolean r3 = r8.m80923H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            double r3 = m80938W(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.Internal.m80737f(r3)
            goto L_0x0225
        L_0x0150:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.m81360F(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x015c:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.m81360F(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0168:
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.m81360F(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
            goto L_0x01c1
        L_0x0173:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.UnsafeUtil.m81358D(r9, r5)
            int r3 = com.google.protobuf.Internal.m80737f(r3)
            goto L_0x0225
        L_0x017f:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.UnsafeUtil.m81356B(r9, r5)
            goto L_0x0225
        L_0x0187:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.UnsafeUtil.m81358D(r9, r5)
            int r3 = com.google.protobuf.Internal.m80737f(r3)
            goto L_0x0225
        L_0x0193:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.UnsafeUtil.m81356B(r9, r5)
            goto L_0x0225
        L_0x019b:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.UnsafeUtil.m81356B(r9, r5)
            goto L_0x0225
        L_0x01a3:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.UnsafeUtil.m81356B(r9, r5)
            goto L_0x0225
        L_0x01ab:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.m81360F(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01b7:
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.m81360F(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
        L_0x01c1:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0226
        L_0x01c5:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.m81360F(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01d2:
            int r2 = r2 * 53
            boolean r3 = com.google.protobuf.UnsafeUtil.m81397s(r9, r5)
            int r3 = com.google.protobuf.Internal.m80734c(r3)
            goto L_0x0225
        L_0x01dd:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.UnsafeUtil.m81356B(r9, r5)
            goto L_0x0225
        L_0x01e4:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.UnsafeUtil.m81358D(r9, r5)
            int r3 = com.google.protobuf.Internal.m80737f(r3)
            goto L_0x0225
        L_0x01ef:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.UnsafeUtil.m81356B(r9, r5)
            goto L_0x0225
        L_0x01f6:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.UnsafeUtil.m81358D(r9, r5)
            int r3 = com.google.protobuf.Internal.m80737f(r3)
            goto L_0x0225
        L_0x0201:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.UnsafeUtil.m81358D(r9, r5)
            int r3 = com.google.protobuf.Internal.m80737f(r3)
            goto L_0x0225
        L_0x020c:
            int r2 = r2 * 53
            float r3 = com.google.protobuf.UnsafeUtil.m81355A(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x0217:
            int r2 = r2 * 53
            double r3 = com.google.protobuf.UnsafeUtil.m81404z(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.Internal.m80737f(r3)
        L_0x0225:
            int r2 = r2 + r3
        L_0x0226:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022a:
            int r2 = r2 * 53
            com.google.protobuf.UnknownFieldSchema<?, ?> r0 = r8.f57022o
            java.lang.Object r0 = r0.mo65448g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f57013f
            if (r0 == 0) goto L_0x0248
            int r2 = r2 * 53
            com.google.protobuf.ExtensionSchema<?> r0 = r8.f57023p
            com.google.protobuf.FieldSet r9 = r0.mo65102c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x0248:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.mo65344b(java.lang.Object):int");
    }

    /* renamed from: c */
    public boolean mo65345c(T t, T t2) {
        int length = this.f57008a.length;
        for (int i = 0; i < length; i += 3) {
            if (!m80960o(t, t2, i)) {
                return false;
            }
        }
        if (!this.f57022o.mo65448g(t).equals(this.f57022o.mo65448g(t2))) {
            return false;
        }
        if (this.f57013f) {
            return this.f57023p.mo65102c(t).equals(this.f57023p.mo65102c(t2));
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x03a3, code lost:
        if (r0 != r15) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03e3, code lost:
        if (r0 != r15) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0403, code lost:
        if (r0 != r15) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0406, code lost:
        r8 = r33;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x013e, code lost:
        r4 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x023c, code lost:
        r1 = r6 | r21;
        r14 = r4;
        r13 = r5;
        r2 = r8;
        r3 = r11;
        r6 = r24;
        r11 = r33;
        r5 = r1;
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02b5, code lost:
        r2 = r8;
        r3 = r11;
        r14 = r13;
        r1 = r17;
        r6 = r24;
        r13 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02f6, code lost:
        r5 = r6 | r21;
        r13 = r32;
        r14 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02fb, code lost:
        r2 = r8;
        r3 = r11;
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0301, code lost:
        r2 = r3;
        r23 = r6;
        r21 = r8;
        r27 = r10;
        r9 = r11;
        r8 = r33;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo65346c0(T r29, byte[] r30, int r31, int r32, int r33, com.google.protobuf.ArrayDecoders.Registers r34) throws java.io.IOException {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            sun.misc.Unsafe r10 = f57007s
            r16 = 0
            r0 = r31
            r1 = -1
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            if (r0 >= r13) goto L_0x0461
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002a
            int r0 = com.google.protobuf.ArrayDecoders.m79360H(r0, r12, r3, r9)
            int r3 = r9.f56573a
            r4 = r3
            r3 = r0
            goto L_0x002b
        L_0x002a:
            r4 = r0
        L_0x002b:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r1) goto L_0x0038
            int r2 = r2 / r8
            int r1 = r15.m80947g0(r0, r2)
            goto L_0x003c
        L_0x0038:
            int r1 = r15.m80946f0(r0)
        L_0x003c:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x0051
            r17 = r0
            r2 = r3
            r9 = r4
            r23 = r5
            r24 = r6
            r27 = r10
            r8 = r11
            r18 = -1
            r21 = 0
            goto L_0x040a
        L_0x0051:
            int[] r1 = r15.f57008a
            int r19 = r2 + 1
            r1 = r1[r19]
            int r8 = m80967r0(r1)
            long r11 = m80936U(r1)
            r19 = r4
            r4 = 17
            r20 = r1
            if (r8 > r4) goto L_0x030d
            int[] r4 = r15.f57008a
            int r21 = r2 + 2
            r4 = r4[r21]
            int r21 = r4 >>> 20
            r1 = 1
            int r21 = r1 << r21
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r13
            r17 = r2
            if (r4 == r6) goto L_0x0088
            if (r6 == r13) goto L_0x0080
            long r1 = (long) r6
            r10.putInt(r14, r1, r5)
        L_0x0080:
            long r1 = (long) r4
            int r5 = r10.getInt(r14, r1)
            r24 = r4
            goto L_0x008a
        L_0x0088:
            r24 = r6
        L_0x008a:
            r6 = r5
            r1 = 5
            switch(r8) {
                case 0: goto L_0x02db;
                case 1: goto L_0x02c0;
                case 2: goto L_0x028f;
                case 3: goto L_0x028f;
                case 4: goto L_0x0273;
                case 5: goto L_0x024b;
                case 6: goto L_0x0220;
                case 7: goto L_0x01fa;
                case 8: goto L_0x01d1;
                case 9: goto L_0x0194;
                case 10: goto L_0x017a;
                case 11: goto L_0x0273;
                case 12: goto L_0x0142;
                case 13: goto L_0x0220;
                case 14: goto L_0x024b;
                case 15: goto L_0x0120;
                case 16: goto L_0x00f3;
                case 17: goto L_0x009f;
                default: goto L_0x008f;
            }
        L_0x008f:
            r12 = r30
            r4 = r14
            r8 = r17
            r11 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r17 = r0
            goto L_0x0301
        L_0x009f:
            r2 = 3
            if (r7 != r2) goto L_0x00e6
            int r1 = r0 << 3
            r4 = r1 | 4
            r2 = r17
            com.google.protobuf.Schema r1 = r15.m80972u(r2)
            r17 = r0
            r0 = r1
            r18 = -1
            r1 = r30
            r8 = r2
            r2 = r3
            r3 = r32
            r7 = r19
            r5 = r34
            int r0 = com.google.protobuf.ArrayDecoders.m79380n(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r21
            if (r1 != 0) goto L_0x00c9
            java.lang.Object r1 = r9.f56575c
            r10.putObject(r14, r11, r1)
            goto L_0x00d6
        L_0x00c9:
            java.lang.Object r1 = r10.getObject(r14, r11)
            java.lang.Object r2 = r9.f56575c
            java.lang.Object r1 = com.google.protobuf.Internal.m80739h(r1, r2)
            r10.putObject(r14, r11, r1)
        L_0x00d6:
            r5 = r6 | r21
            r12 = r30
            r13 = r32
            r11 = r33
            r3 = r7
            r2 = r8
            r1 = r17
            r6 = r24
            goto L_0x0019
        L_0x00e6:
            r8 = r17
            r18 = -1
            r17 = r0
            r12 = r30
            r4 = r14
            r11 = r19
            goto L_0x01cc
        L_0x00f3:
            r8 = r17
            r4 = r19
            r18 = -1
            r17 = r0
            if (r7 != 0) goto L_0x011c
            r1 = r11
            r12 = r30
            int r7 = com.google.protobuf.ArrayDecoders.m79364L(r12, r3, r9)
            long r13 = r9.f56574b
            long r13 = com.google.protobuf.CodedInputStream.m79833c(r13)
            r0 = r10
            r2 = r1
            r1 = r29
            r11 = r4
            r4 = r13
            r0.putLong(r1, r2, r4)
            r5 = r6 | r21
            r14 = r29
            r13 = r32
            r0 = r7
            goto L_0x02fb
        L_0x011c:
            r12 = r30
            r11 = r4
            goto L_0x013e
        L_0x0120:
            r13 = r11
            r8 = r17
            r11 = r19
            r18 = -1
            r12 = r30
            r17 = r0
            if (r7 != 0) goto L_0x013e
            int r0 = com.google.protobuf.ArrayDecoders.m79361I(r12, r3, r9)
            int r1 = r9.f56573a
            int r1 = com.google.protobuf.CodedInputStream.m79832b(r1)
            r4 = r29
            r10.putInt(r4, r13, r1)
            goto L_0x02f6
        L_0x013e:
            r4 = r29
            goto L_0x01cc
        L_0x0142:
            r4 = r14
            r8 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r12 = r30
            if (r7 != 0) goto L_0x01cc
            int r0 = com.google.protobuf.ArrayDecoders.m79361I(r12, r3, r9)
            int r1 = r9.f56573a
            com.google.protobuf.Internal$EnumVerifier r2 = r15.m80968s(r8)
            if (r2 == 0) goto L_0x0175
            boolean r2 = r2.mo60055a(r1)
            if (r2 == 0) goto L_0x0163
            goto L_0x0175
        L_0x0163:
            com.google.protobuf.UnknownFieldSetLite r2 = m80974v(r29)
            long r13 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r2.mo65469m(r11, r1)
            r13 = r32
            r14 = r4
            r5 = r6
            goto L_0x02fb
        L_0x0175:
            r10.putInt(r4, r13, r1)
            goto L_0x02f6
        L_0x017a:
            r4 = r14
            r8 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r0 = 2
            r12 = r30
            if (r7 != r0) goto L_0x01cc
            int r0 = com.google.protobuf.ArrayDecoders.m79368b(r12, r3, r9)
            java.lang.Object r1 = r9.f56575c
            r10.putObject(r4, r13, r1)
            goto L_0x02f6
        L_0x0194:
            r4 = r14
            r8 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r0 = 2
            r12 = r30
            if (r7 != r0) goto L_0x01ca
            com.google.protobuf.Schema r0 = r15.m80972u(r8)
            r5 = r32
            r19 = 1048575(0xfffff, float:1.469367E-39)
            int r0 = com.google.protobuf.ArrayDecoders.m79382p(r0, r12, r3, r5, r9)
            r1 = r6 & r21
            if (r1 != 0) goto L_0x01bb
            java.lang.Object r1 = r9.f56575c
            r10.putObject(r4, r13, r1)
            goto L_0x023c
        L_0x01bb:
            java.lang.Object r1 = r10.getObject(r4, r13)
            java.lang.Object r2 = r9.f56575c
            java.lang.Object r1 = com.google.protobuf.Internal.m80739h(r1, r2)
            r10.putObject(r4, r13, r1)
            goto L_0x023c
        L_0x01ca:
            r5 = r32
        L_0x01cc:
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0301
        L_0x01d1:
            r5 = r32
            r4 = r14
            r8 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r0 = 2
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            if (r7 != r0) goto L_0x0301
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x01f0
            int r0 = com.google.protobuf.ArrayDecoders.m79355C(r12, r3, r9)
            goto L_0x01f4
        L_0x01f0:
            int r0 = com.google.protobuf.ArrayDecoders.m79358F(r12, r3, r9)
        L_0x01f4:
            java.lang.Object r1 = r9.f56575c
            r10.putObject(r4, r13, r1)
            goto L_0x023c
        L_0x01fa:
            r5 = r32
            r4 = r14
            r8 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            if (r7 != 0) goto L_0x0301
            int r0 = com.google.protobuf.ArrayDecoders.m79364L(r12, r3, r9)
            long r1 = r9.f56574b
            r25 = 0
            int r3 = (r1 > r25 ? 1 : (r1 == r25 ? 0 : -1))
            if (r3 == 0) goto L_0x021b
            r1 = 1
            goto L_0x021c
        L_0x021b:
            r1 = 0
        L_0x021c:
            com.google.protobuf.UnsafeUtil.m81365K(r4, r13, r1)
            goto L_0x023c
        L_0x0220:
            r5 = r32
            r4 = r14
            r8 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            if (r7 != r1) goto L_0x0301
            int r0 = com.google.protobuf.ArrayDecoders.m79374h(r12, r3)
            r10.putInt(r4, r13, r0)
            int r0 = r3 + 4
        L_0x023c:
            r1 = r6 | r21
            r14 = r4
            r13 = r5
            r2 = r8
            r3 = r11
            r6 = r24
            r11 = r33
            r5 = r1
            r1 = r17
            goto L_0x0019
        L_0x024b:
            r5 = r32
            r4 = r14
            r8 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r0 = 1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            if (r7 != r0) goto L_0x0301
            long r22 = com.google.protobuf.ArrayDecoders.m79376j(r12, r3)
            r0 = r10
            r1 = r29
            r7 = r3
            r2 = r13
            r13 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            r5 = r6 | r21
            goto L_0x02b5
        L_0x0273:
            r4 = r14
            r8 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            if (r7 != 0) goto L_0x0301
            int r0 = com.google.protobuf.ArrayDecoders.m79361I(r12, r3, r9)
            int r1 = r9.f56573a
            r10.putInt(r4, r13, r1)
            goto L_0x02f6
        L_0x028f:
            r4 = r14
            r8 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            if (r7 != 0) goto L_0x0301
            int r7 = com.google.protobuf.ArrayDecoders.m79364L(r12, r3, r9)
            long r2 = r9.f56574b
            r0 = r10
            r1 = r29
            r22 = r2
            r2 = r13
            r13 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            r5 = r6 | r21
            r0 = r7
        L_0x02b5:
            r2 = r8
            r3 = r11
            r14 = r13
            r1 = r17
            r6 = r24
            r13 = r32
            goto L_0x0363
        L_0x02c0:
            r4 = r14
            r8 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            if (r7 != r1) goto L_0x0301
            float r0 = com.google.protobuf.ArrayDecoders.m79378l(r12, r3)
            com.google.protobuf.UnsafeUtil.m81373S(r4, r13, r0)
            int r0 = r3 + 4
            goto L_0x02f6
        L_0x02db:
            r4 = r14
            r8 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r0 = 1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            if (r7 != r0) goto L_0x0301
            double r0 = com.google.protobuf.ArrayDecoders.m79370d(r12, r3)
            com.google.protobuf.UnsafeUtil.m81372R(r4, r13, r0)
            int r0 = r3 + 8
        L_0x02f6:
            r5 = r6 | r21
            r13 = r32
            r14 = r4
        L_0x02fb:
            r2 = r8
            r3 = r11
            r1 = r17
            goto L_0x0361
        L_0x0301:
            r2 = r3
            r23 = r6
            r21 = r8
            r27 = r10
            r9 = r11
            r8 = r33
            goto L_0x040a
        L_0x030d:
            r17 = r0
            r4 = r14
            r18 = -1
            r13 = r11
            r11 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            r0 = 27
            if (r8 != r0) goto L_0x0374
            r0 = 2
            if (r7 != r0) goto L_0x0367
            java.lang.Object r0 = r10.getObject(r4, r13)
            com.google.protobuf.Internal$ProtobufList r0 = (com.google.protobuf.Internal.ProtobufList) r0
            boolean r1 = r0.mo64749c1()
            if (r1 != 0) goto L_0x033f
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0336
            r1 = 10
            goto L_0x0338
        L_0x0336:
            int r1 = r1 * 2
        L_0x0338:
            com.google.protobuf.Internal$ProtobufList r0 = r0.mo64901q1(r1)
            r10.putObject(r4, r13, r0)
        L_0x033f:
            r7 = r0
            com.google.protobuf.Schema r0 = r15.m80972u(r2)
            r1 = r11
            r21 = r2
            r2 = r30
            r4 = r32
            r23 = r5
            r5 = r7
            r24 = r6
            r6 = r34
            int r0 = com.google.protobuf.ArrayDecoders.m79383q(r0, r1, r2, r3, r4, r5, r6)
            r14 = r29
            r13 = r32
            r3 = r11
            r1 = r17
            r2 = r21
            r5 = r23
        L_0x0361:
            r6 = r24
        L_0x0363:
            r11 = r33
            goto L_0x0019
        L_0x0367:
            r21 = r2
            r23 = r5
            r24 = r6
            r15 = r3
            r27 = r10
            r19 = r11
            goto L_0x03e6
        L_0x0374:
            r21 = r2
            r23 = r5
            r24 = r6
            r0 = 49
            if (r8 > r0) goto L_0x03bf
            r1 = r20
            long r5 = (long) r1
            r0 = r28
            r1 = r29
            r2 = r30
            r4 = r3
            r15 = r4
            r4 = r32
            r25 = r5
            r5 = r11
            r6 = r17
            r31 = r8
            r8 = r21
            r27 = r10
            r9 = r25
            r19 = r11
            r11 = r31
            r12 = r13
            r14 = r34
            int r0 = r0.m80945e0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0406
        L_0x03a5:
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            r1 = r17
            r3 = r19
            r2 = r21
            r5 = r23
            r6 = r24
            r10 = r27
            goto L_0x0019
        L_0x03bf:
            r15 = r3
            r31 = r8
            r27 = r10
            r19 = r11
            r1 = r20
            r0 = 50
            r9 = r31
            if (r9 != r0) goto L_0x03ec
            r0 = 2
            if (r7 != r0) goto L_0x03e6
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r21
            r6 = r13
            r8 = r34
            int r0 = r0.m80942a0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0406
            goto L_0x03a5
        L_0x03e6:
            r8 = r33
            r2 = r15
        L_0x03e9:
            r9 = r19
            goto L_0x040a
        L_0x03ec:
            r0 = r28
            r8 = r1
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r19
            r6 = r17
            r10 = r13
            r12 = r21
            r13 = r34
            int r0 = r0.m80943b0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0406
            goto L_0x03a5
        L_0x0406:
            r8 = r33
            r2 = r0
            goto L_0x03e9
        L_0x040a:
            if (r9 != r8) goto L_0x041a
            if (r8 == 0) goto L_0x041a
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r28
            r0 = r2
            r3 = r9
            r5 = r23
            r6 = r24
            goto L_0x046c
        L_0x041a:
            r10 = r28
            boolean r0 = r10.f57013f
            r11 = r34
            if (r0 == 0) goto L_0x043c
            com.google.protobuf.ExtensionRegistryLite r0 = r11.f56576d
            com.google.protobuf.ExtensionRegistryLite r1 = com.google.protobuf.ExtensionRegistryLite.m80520b()
            if (r0 == r1) goto L_0x043c
            com.google.protobuf.MessageLite r5 = r10.f57012e
            com.google.protobuf.UnknownFieldSchema<?, ?> r6 = r10.f57022o
            r0 = r9
            r1 = r30
            r3 = r32
            r4 = r29
            r7 = r34
            int r0 = com.google.protobuf.ArrayDecoders.m79373g(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x044b
        L_0x043c:
            com.google.protobuf.UnknownFieldSetLite r4 = m80974v(r29)
            r0 = r9
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.protobuf.ArrayDecoders.m79359G(r0, r1, r2, r3, r4, r5)
        L_0x044b:
            r14 = r29
            r12 = r30
            r13 = r32
            r3 = r9
            r15 = r10
            r9 = r11
            r1 = r17
            r2 = r21
            r5 = r23
            r6 = r24
            r10 = r27
            r11 = r8
            goto L_0x0019
        L_0x0461:
            r23 = r5
            r24 = r6
            r27 = r10
            r8 = r11
            r10 = r15
            r1 = 1048575(0xfffff, float:1.469367E-39)
        L_0x046c:
            if (r6 == r1) goto L_0x0477
            long r1 = (long) r6
            r4 = r29
            r6 = r27
            r6.putInt(r4, r1, r5)
            goto L_0x0479
        L_0x0477:
            r4 = r29
        L_0x0479:
            r1 = 0
            int r2 = r10.f57018k
        L_0x047c:
            int r5 = r10.f57019l
            if (r2 >= r5) goto L_0x048f
            int[] r5 = r10.f57017j
            r5 = r5[r2]
            com.google.protobuf.UnknownFieldSchema<?, ?> r6 = r10.f57022o
            java.lang.Object r1 = r10.m80962p(r4, r5, r1, r6)
            com.google.protobuf.UnknownFieldSetLite r1 = (com.google.protobuf.UnknownFieldSetLite) r1
            int r2 = r2 + 1
            goto L_0x047c
        L_0x048f:
            if (r1 == 0) goto L_0x0496
            com.google.protobuf.UnknownFieldSchema<?, ?> r2 = r10.f57022o
            r2.mo65456o(r4, r1)
        L_0x0496:
            if (r8 != 0) goto L_0x04a2
            r1 = r32
            if (r0 != r1) goto L_0x049d
            goto L_0x04a8
        L_0x049d:
            com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.m80764g()
            throw r0
        L_0x04a2:
            r1 = r32
            if (r0 > r1) goto L_0x04a9
            if (r3 != r8) goto L_0x04a9
        L_0x04a8:
            return r0
        L_0x04a9:
            com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.m80764g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.mo65346c0(java.lang.Object, byte[], int, int, int, com.google.protobuf.ArrayDecoders$Registers):int");
    }

    /* renamed from: d */
    public void mo65347d(T t, Writer writer) throws IOException {
        if (writer.mo64853y() == Writer.FieldOrder.DESCENDING) {
            m80975v0(t, writer);
        } else if (this.f57015h) {
            m80973u0(t, writer);
        } else {
            m80971t0(t, writer);
        }
    }

    /* renamed from: e */
    public void mo65348e(T t) {
        int i;
        int i2 = this.f57018k;
        while (true) {
            i = this.f57019l;
            if (i2 >= i) {
                break;
            }
            long U = m80936U(m80969s0(this.f57017j[i2]));
            Object F = UnsafeUtil.m81360F(t, U);
            if (F != null) {
                UnsafeUtil.m81376V(t, U, this.f57024q.mo65337f(F));
            }
            i2++;
        }
        int length = this.f57017j.length;
        while (i < length) {
            this.f57021n.mo65301c(t, (long) this.f57017j[i]);
            i++;
        }
        this.f57022o.mo65451j(t);
        if (this.f57013f) {
            this.f57023p.mo65105f(t);
        }
    }

    /* renamed from: f */
    public final boolean mo65349f(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f57018k) {
            int i6 = this.f57017j[i5];
            int T = m80935T(i6);
            int s0 = m80969s0(i6);
            int i7 = this.f57008a[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = f57007s.getInt(t2, (long) i8);
                }
                i = i4;
                i2 = i8;
            } else {
                i2 = i3;
                i = i4;
            }
            if (m80924I(s0) && !m80918C(t, i6, i2, i, i9)) {
                return false;
            }
            int r0 = m80967r0(s0);
            if (r0 != 9 && r0 != 17) {
                if (r0 != 27) {
                    if (r0 == 60 || r0 == 68) {
                        if (m80923H(t2, T, i6) && !m80919D(t2, s0, m80972u(i6))) {
                            return false;
                        }
                    } else if (r0 != 49) {
                        if (r0 == 50 && !m80921F(t2, s0, i6)) {
                            return false;
                        }
                    }
                }
                if (!m80920E(t2, s0, i6)) {
                    return false;
                }
            } else if (m80918C(t, i6, i2, i, i9) && !m80919D(t2, s0, m80972u(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        return !this.f57013f || this.f57023p.mo65102c(t2).mo65137p();
    }

    /* renamed from: g */
    public int mo65350g(T t) {
        return this.f57015h ? m80978x(t) : m80976w(t);
    }

    /* renamed from: h */
    public void mo65351h(T t, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        Objects.requireNonNull(extensionRegistryLite);
        m80927L(this.f57022o, this.f57023p, t, reader, extensionRegistryLite);
    }

    /* renamed from: i */
    public void mo65352i(T t, byte[] bArr, int i, int i2, ArrayDecoders.Registers registers) throws IOException {
        if (this.f57015h) {
            m80944d0(t, bArr, i, i2, registers);
        } else {
            mo65346c0(t, bArr, i, i2, 0, registers);
        }
    }

    public T newInstance() {
        return this.f57020m.mo65354a(this.f57012e);
    }
}
