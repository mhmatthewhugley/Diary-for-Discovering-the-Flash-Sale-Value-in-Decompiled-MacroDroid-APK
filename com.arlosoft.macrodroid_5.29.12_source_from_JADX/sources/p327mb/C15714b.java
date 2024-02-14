package p327mb;

import kotlin.reflect.jvm.internal.impl.protobuf.C14503i;
import p308kb.C13455c;
import p308kb.C13484j;
import p308kb.C13486k;
import p308kb.C13540x;

/* renamed from: mb.b */
/* compiled from: Flags */
public class C15714b {

    /* renamed from: A */
    public static final C15716b f65025A;

    /* renamed from: B */
    public static final C15716b f65026B;

    /* renamed from: C */
    public static final C15716b f65027C;

    /* renamed from: D */
    public static final C15716b f65028D;

    /* renamed from: E */
    public static final C15716b f65029E;

    /* renamed from: F */
    public static final C15716b f65030F;

    /* renamed from: G */
    public static final C15716b f65031G;

    /* renamed from: H */
    public static final C15716b f65032H;

    /* renamed from: I */
    public static final C15716b f65033I;

    /* renamed from: J */
    public static final C15716b f65034J;

    /* renamed from: K */
    public static final C15716b f65035K;

    /* renamed from: L */
    public static final C15716b f65036L;

    /* renamed from: M */
    public static final C15716b f65037M;

    /* renamed from: N */
    public static final C15716b f65038N;

    /* renamed from: O */
    public static final C15716b f65039O = C15718d.m95018c();

    /* renamed from: a */
    public static final C15716b f65040a;

    /* renamed from: b */
    public static final C15716b f65041b;

    /* renamed from: c */
    public static final C15716b f65042c;

    /* renamed from: d */
    public static final C15718d<C13540x> f65043d;

    /* renamed from: e */
    public static final C15718d<C13486k> f65044e;

    /* renamed from: f */
    public static final C15718d<C13455c.C13458c> f65045f;

    /* renamed from: g */
    public static final C15716b f65046g;

    /* renamed from: h */
    public static final C15716b f65047h;

    /* renamed from: i */
    public static final C15716b f65048i;

    /* renamed from: j */
    public static final C15716b f65049j;

    /* renamed from: k */
    public static final C15716b f65050k;

    /* renamed from: l */
    public static final C15716b f65051l;

    /* renamed from: m */
    public static final C15716b f65052m;

    /* renamed from: n */
    public static final C15716b f65053n;

    /* renamed from: o */
    public static final C15718d<C13484j> f65054o;

    /* renamed from: p */
    public static final C15716b f65055p;

    /* renamed from: q */
    public static final C15716b f65056q;

    /* renamed from: r */
    public static final C15716b f65057r;

    /* renamed from: s */
    public static final C15716b f65058s;

    /* renamed from: t */
    public static final C15716b f65059t;

    /* renamed from: u */
    public static final C15716b f65060u;

    /* renamed from: v */
    public static final C15716b f65061v;

    /* renamed from: w */
    public static final C15716b f65062w;

    /* renamed from: x */
    public static final C15716b f65063x;

    /* renamed from: y */
    public static final C15716b f65064y;

    /* renamed from: z */
    public static final C15716b f65065z;

    /* renamed from: mb.b$b */
    /* compiled from: Flags */
    public static class C15716b extends C15718d<Boolean> {
        public C15716b(int i) {
            super(i, 1);
        }

        /* renamed from: f */
        private static /* synthetic */ void m95005f(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"}));
        }

        /* renamed from: g */
        public Boolean mo75157d(int i) {
            boolean z = true;
            if ((i & (1 << this.f65067a)) == 0) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (valueOf == null) {
                m95005f(0);
            }
            return valueOf;
        }

        /* renamed from: h */
        public int mo75158e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f65067a;
            }
            return 0;
        }
    }

    /* renamed from: mb.b$c */
    /* compiled from: Flags */
    private static class C15717c<E extends C14503i.C14504a> extends C15718d<E> {

        /* renamed from: c */
        private final E[] f65066c;

        public C15717c(int i, E[] eArr) {
            super(i, m95011g(eArr));
            this.f65066c = eArr;
        }

        /* renamed from: f */
        private static /* synthetic */ void m95010f(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"}));
        }

        /* renamed from: g */
        private static <E> int m95011g(E[] eArr) {
            if (eArr == null) {
                m95010f(0);
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i = 31; i >= 0; i--) {
                if (((1 << i) & length) != 0) {
                    return i + 1;
                }
            }
            throw new IllegalStateException("Empty enum: " + eArr.getClass());
        }

        /* renamed from: h */
        public E mo75157d(int i) {
            int i2 = this.f65067a;
            int i3 = (i & (((1 << this.f65068b) - 1) << i2)) >> i2;
            for (E e : this.f65066c) {
                if (e.mo71084c() == i3) {
                    return e;
                }
            }
            return null;
        }

        /* renamed from: i */
        public int mo75158e(E e) {
            return e.mo71084c() << this.f65067a;
        }
    }

    /* renamed from: mb.b$d */
    /* compiled from: Flags */
    public static abstract class C15718d<E> {

        /* renamed from: a */
        public final int f65067a;

        /* renamed from: b */
        public final int f65068b;

        /* renamed from: a */
        public static <E extends C14503i.C14504a> C15718d<E> m95016a(C15718d<?> dVar, E[] eArr) {
            return new C15717c(dVar.f65067a + dVar.f65068b, eArr);
        }

        /* renamed from: b */
        public static C15716b m95017b(C15718d<?> dVar) {
            return new C15716b(dVar.f65067a + dVar.f65068b);
        }

        /* renamed from: c */
        public static C15716b m95018c() {
            return new C15716b(0);
        }

        /* renamed from: d */
        public abstract E mo75157d(int i);

        /* renamed from: e */
        public abstract int mo75158e(E e);

        private C15718d(int i, int i2) {
            this.f65067a = i;
            this.f65068b = i2;
        }
    }

    static {
        C15716b c = C15718d.m95018c();
        f65040a = c;
        f65041b = C15718d.m95017b(c);
        C15716b c2 = C15718d.m95018c();
        f65042c = c2;
        C15718d<C13540x> a = C15718d.m95016a(c2, C13540x.values());
        f65043d = a;
        C15718d<C13486k> a2 = C15718d.m95016a(a, C13486k.values());
        f65044e = a2;
        C15718d<C13455c.C13458c> a3 = C15718d.m95016a(a2, C13455c.C13458c.values());
        f65045f = a3;
        C15716b b = C15718d.m95017b(a3);
        f65046g = b;
        C15716b b2 = C15718d.m95017b(b);
        f65047h = b2;
        C15716b b3 = C15718d.m95017b(b2);
        f65048i = b3;
        C15716b b4 = C15718d.m95017b(b3);
        f65049j = b4;
        C15716b b5 = C15718d.m95017b(b4);
        f65050k = b5;
        f65051l = C15718d.m95017b(b5);
        C15716b b6 = C15718d.m95017b(a);
        f65052m = b6;
        f65053n = C15718d.m95017b(b6);
        C15718d<C13484j> a4 = C15718d.m95016a(a2, C13484j.values());
        f65054o = a4;
        C15716b b7 = C15718d.m95017b(a4);
        f65055p = b7;
        C15716b b8 = C15718d.m95017b(b7);
        f65056q = b8;
        C15716b b9 = C15718d.m95017b(b8);
        f65057r = b9;
        C15716b b10 = C15718d.m95017b(b9);
        f65058s = b10;
        C15716b b11 = C15718d.m95017b(b10);
        f65059t = b11;
        C15716b b12 = C15718d.m95017b(b11);
        f65060u = b12;
        C15716b b13 = C15718d.m95017b(b12);
        f65061v = b13;
        f65062w = C15718d.m95017b(b13);
        C15716b b14 = C15718d.m95017b(a4);
        f65063x = b14;
        C15716b b15 = C15718d.m95017b(b14);
        f65064y = b15;
        C15716b b16 = C15718d.m95017b(b15);
        f65065z = b16;
        C15716b b17 = C15718d.m95017b(b16);
        f65025A = b17;
        C15716b b18 = C15718d.m95017b(b17);
        f65026B = b18;
        C15716b b19 = C15718d.m95017b(b18);
        f65027C = b19;
        C15716b b20 = C15718d.m95017b(b19);
        f65028D = b20;
        C15716b b21 = C15718d.m95017b(b20);
        f65029E = b21;
        f65030F = C15718d.m95017b(b21);
        C15716b b22 = C15718d.m95017b(c2);
        f65031G = b22;
        C15716b b23 = C15718d.m95017b(b22);
        f65032H = b23;
        f65033I = C15718d.m95017b(b23);
        C15716b b24 = C15718d.m95017b(a2);
        f65034J = b24;
        C15716b b25 = C15718d.m95017b(b24);
        f65035K = b25;
        f65036L = C15718d.m95017b(b25);
        C15716b c3 = C15718d.m95018c();
        f65037M = c3;
        f65038N = C15718d.m95017b(c3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ void m95003a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 == r1) goto L_0x002b
            if (r5 == r3) goto L_0x0026
            r4 = 5
            if (r5 == r4) goto L_0x002b
            r4 = 6
            if (r5 == r4) goto L_0x0021
            r4 = 8
            if (r5 == r4) goto L_0x002b
            r4 = 9
            if (r5 == r4) goto L_0x0021
            r4 = 11
            if (r5 == r4) goto L_0x002b
            java.lang.String r4 = "visibility"
            r0[r2] = r4
            goto L_0x002f
        L_0x0021:
            java.lang.String r4 = "memberKind"
            r0[r2] = r4
            goto L_0x002f
        L_0x0026:
            java.lang.String r4 = "kind"
            r0[r2] = r4
            goto L_0x002f
        L_0x002b:
            java.lang.String r4 = "modality"
            r0[r2] = r4
        L_0x002f:
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r1] = r2
            switch(r5) {
                case 3: goto L_0x004a;
                case 4: goto L_0x0045;
                case 5: goto L_0x0045;
                case 6: goto L_0x0045;
                case 7: goto L_0x0040;
                case 8: goto L_0x0040;
                case 9: goto L_0x0040;
                case 10: goto L_0x003b;
                case 11: goto L_0x003b;
                default: goto L_0x0036;
            }
        L_0x0036:
            java.lang.String r5 = "getClassFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x003b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x0040:
            java.lang.String r5 = "getPropertyFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x0045:
            java.lang.String r5 = "getFunctionFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x004a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r3] = r5
        L_0x004e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p327mb.C15714b.m95003a(int):void");
    }

    /* renamed from: b */
    public static int m95004b(boolean z, C13540x xVar, C13486k kVar, boolean z2, boolean z3, boolean z4) {
        if (xVar == null) {
            m95003a(10);
        }
        if (kVar == null) {
            m95003a(11);
        }
        return f65042c.mo75158e(Boolean.valueOf(z)) | f65044e.mo75158e(kVar) | f65043d.mo75158e(xVar) | f65034J.mo75158e(Boolean.valueOf(z2)) | f65035K.mo75158e(Boolean.valueOf(z3)) | f65036L.mo75158e(Boolean.valueOf(z4));
    }
}
