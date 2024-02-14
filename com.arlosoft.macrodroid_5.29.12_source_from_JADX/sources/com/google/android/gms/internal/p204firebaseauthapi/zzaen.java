package com.google.android.gms.internal.p204firebaseauthapi;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaen */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzaen<T> implements zzaew<T> {

    /* renamed from: q */
    private static final int[] f39781q = new int[0];

    /* renamed from: r */
    private static final Unsafe f39782r = zzafx.m56845l();

    /* renamed from: a */
    private final int[] f39783a;

    /* renamed from: b */
    private final Object[] f39784b;

    /* renamed from: c */
    private final int f39785c;

    /* renamed from: d */
    private final int f39786d;

    /* renamed from: e */
    private final zzaek f39787e;

    /* renamed from: f */
    private final boolean f39788f;

    /* renamed from: g */
    private final boolean f39789g;

    /* renamed from: h */
    private final boolean f39790h;

    /* renamed from: i */
    private final int[] f39791i;

    /* renamed from: j */
    private final int f39792j;

    /* renamed from: k */
    private final int f39793k;

    /* renamed from: l */
    private final zzady f39794l;

    /* renamed from: m */
    private final zzafn f39795m;

    /* renamed from: n */
    private final zzact f39796n;

    /* renamed from: o */
    private final zzaep f39797o;

    /* renamed from: p */
    private final zzaef f39798p;

    private zzaen(int[] iArr, Object[] objArr, int i, int i2, zzaek zzaek, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzaep zzaep, zzady zzady, zzafn zzafn, zzact zzact, zzaef zzaef, byte[] bArr) {
        zzaek zzaek2 = zzaek;
        zzact zzact2 = zzact;
        this.f39783a = iArr;
        this.f39784b = objArr;
        this.f39785c = i;
        this.f39786d = i2;
        this.f39789g = zzaek2 instanceof zzadf;
        this.f39790h = z;
        boolean z3 = false;
        if (zzact2 != null && zzact2.mo49048h(zzaek)) {
            z3 = true;
        }
        this.f39788f = z3;
        this.f39791i = iArr2;
        this.f39792j = i3;
        this.f39793k = i4;
        this.f39797o = zzaep;
        this.f39794l = zzady;
        this.f39795m = zzafn;
        this.f39796n = zzact2;
        this.f39787e = zzaek2;
        this.f39798p = zzaef;
    }

    /* renamed from: A */
    private final void m56539A(Object obj, int i, int i2) {
        zzafx.m56855v(obj, (long) (m56567d0(i2) & 1048575), i);
    }

    /* renamed from: B */
    private final void m56540B(Object obj, int i, Object obj2) {
        f39782r.putObject(obj, (long) (m56570m(i) & 1048575), obj2);
        m56583z(obj, i);
    }

    /* renamed from: C */
    private final void m56541C(Object obj, int i, int i2, Object obj2) {
        f39782r.putObject(obj, (long) (m56570m(i2) & 1048575), obj2);
        m56539A(obj, i, i2);
    }

    /* renamed from: D */
    private final boolean m56542D(Object obj, Object obj2, int i) {
        return m56544F(obj, i) == m56544F(obj2, i);
    }

    /* renamed from: E */
    private static boolean m56543E(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: F */
    private final boolean m56544F(Object obj, int i) {
        int d0 = m56567d0(i);
        long j = (long) (d0 & 1048575);
        if (j != 1048575) {
            return (zzafx.m56841h(obj, j) & (1 << (d0 >>> 20))) != 0;
        }
        int m = m56570m(i);
        long j2 = (long) (m & 1048575);
        switch (m56569l(m)) {
            case 0:
                return Double.doubleToRawLongBits(zzafx.m56839f(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzafx.m56840g(obj, j2)) != 0;
            case 2:
                return zzafx.m56842i(obj, j2) != 0;
            case 3:
                return zzafx.m56842i(obj, j2) != 0;
            case 4:
                return zzafx.m56841h(obj, j2) != 0;
            case 5:
                return zzafx.m56842i(obj, j2) != 0;
            case 6:
                return zzafx.m56841h(obj, j2) != 0;
            case 7:
                return zzafx.m56830B(obj, j2);
            case 8:
                Object k = zzafx.m56844k(obj, j2);
                if (k instanceof String) {
                    return !((String) k).isEmpty();
                }
                if (k instanceof zzacc) {
                    return !zzacc.f39635a.equals(k);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzafx.m56844k(obj, j2) != null;
            case 10:
                return !zzacc.f39635a.equals(zzafx.m56844k(obj, j2));
            case 11:
                return zzafx.m56841h(obj, j2) != 0;
            case 12:
                return zzafx.m56841h(obj, j2) != 0;
            case 13:
                return zzafx.m56841h(obj, j2) != 0;
            case 14:
                return zzafx.m56842i(obj, j2) != 0;
            case 15:
                return zzafx.m56841h(obj, j2) != 0;
            case 16:
                return zzafx.m56842i(obj, j2) != 0;
            case 17:
                return zzafx.m56844k(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: G */
    private final boolean m56545G(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m56544F(obj, i) : (i3 & i4) != 0;
    }

    /* renamed from: H */
    private static boolean m56546H(Object obj, int i, zzaew zzaew) {
        return zzaew.mo49144e(zzafx.m56844k(obj, (long) (i & 1048575)));
    }

    /* renamed from: I */
    private static boolean m56547I(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzadf) {
            return ((zzadf) obj).mo49082n();
        }
        return true;
    }

    /* renamed from: J */
    private final boolean m56548J(Object obj, int i, int i2) {
        return zzafx.m56841h(obj, (long) (m56567d0(i2) & 1048575)) == i;
    }

    /* renamed from: K */
    private static boolean m56549K(Object obj, long j) {
        return ((Boolean) zzafx.m56844k(obj, j)).booleanValue();
    }

    /* renamed from: L */
    private final void m56550L(Object obj, zzaco zzaco) throws IOException {
        int i;
        Object obj2 = obj;
        zzaco zzaco2 = zzaco;
        if (!this.f39788f) {
            int length = this.f39783a.length;
            Unsafe unsafe = f39782r;
            int i2 = 1048575;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1048575;
            while (i3 < length) {
                int m = m56570m(i3);
                int[] iArr = this.f39783a;
                int i6 = iArr[i3];
                int l = m56569l(m);
                if (l <= 17) {
                    int i7 = iArr[i3 + 2];
                    int i8 = i7 & i2;
                    if (i8 != i5) {
                        i4 = unsafe.getInt(obj2, (long) i8);
                        i5 = i8;
                    }
                    i = 1 << (i7 >>> 20);
                } else {
                    i = 0;
                }
                long j = (long) (m & i2);
                switch (l) {
                    case 0:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zzaco2.mo49022q(i6, zzafx.m56839f(obj2, j));
                            continue;
                        }
                    case 1:
                        if ((i4 & i) != 0) {
                            zzaco2.mo49031z(i6, zzafx.m56840g(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i4 & i) != 0) {
                            zzaco2.mo49000E(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i4 & i) != 0) {
                            zzaco2.mo49016j(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i4 & i) != 0) {
                            zzaco2.mo48998C(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i4 & i) != 0) {
                            zzaco2.mo49029x(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i4 & i) != 0) {
                            zzaco2.mo49027v(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i4 & i) != 0) {
                            zzaco2.mo49018m(i6, zzafx.m56830B(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i4 & i) != 0) {
                            m56552N(i6, unsafe.getObject(obj2, j), zzaco2);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i4 & i) != 0) {
                            zzaco2.mo49002G(i6, unsafe.getObject(obj2, j), m56573p(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i4 & i) != 0) {
                            zzaco2.mo49020o(i6, (zzacc) unsafe.getObject(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i4 & i) != 0) {
                            zzaco2.mo49014h(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i4 & i) != 0) {
                            zzaco2.mo49025t(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i4 & i) != 0) {
                            zzaco2.mo49003H(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i4 & i) != 0) {
                            zzaco2.mo49005J(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i4 & i) != 0) {
                            zzaco2.mo49007a(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i4 & i) != 0) {
                            zzaco2.mo49009c(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i4 & i) != 0) {
                            zzaco2.mo48997B(i6, unsafe.getObject(obj2, j), m56573p(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        zzaey.m56704l(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, false);
                        continue;
                    case 19:
                        zzaey.m56708p(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, false);
                        continue;
                    case 20:
                        zzaey.m56711s(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, false);
                        continue;
                    case 21:
                        zzaey.m56666B(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, false);
                        continue;
                    case 22:
                        zzaey.m56710r(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, false);
                        continue;
                    case 23:
                        zzaey.m56707o(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, false);
                        continue;
                    case 24:
                        zzaey.m56706n(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, false);
                        continue;
                    case 25:
                        zzaey.m56702j(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, false);
                        continue;
                    case 26:
                        zzaey.m56717y(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2);
                        break;
                    case 27:
                        zzaey.m56712t(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, m56573p(i3));
                        break;
                    case 28:
                        zzaey.m56703k(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2);
                        break;
                    case 29:
                        zzaey.m56718z(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, false);
                        break;
                    case 30:
                        zzaey.m56705m(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, false);
                        break;
                    case 31:
                        zzaey.m56713u(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, false);
                        break;
                    case 32:
                        zzaey.m56714v(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, false);
                        break;
                    case 33:
                        zzaey.m56715w(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, false);
                        break;
                    case 34:
                        zzaey.m56716x(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, false);
                        break;
                    case 35:
                        zzaey.m56704l(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, true);
                        break;
                    case 36:
                        zzaey.m56708p(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, true);
                        break;
                    case 37:
                        zzaey.m56711s(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, true);
                        break;
                    case 38:
                        zzaey.m56666B(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, true);
                        break;
                    case 39:
                        zzaey.m56710r(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, true);
                        break;
                    case 40:
                        zzaey.m56707o(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, true);
                        break;
                    case 41:
                        zzaey.m56706n(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, true);
                        break;
                    case 42:
                        zzaey.m56702j(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, true);
                        break;
                    case 43:
                        zzaey.m56718z(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, true);
                        break;
                    case 44:
                        zzaey.m56705m(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, true);
                        break;
                    case 45:
                        zzaey.m56713u(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, true);
                        break;
                    case 46:
                        zzaey.m56714v(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, true);
                        break;
                    case 47:
                        zzaey.m56715w(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, true);
                        break;
                    case 48:
                        zzaey.m56716x(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, true);
                        break;
                    case 49:
                        zzaey.m56709q(this.f39783a[i3], (List) unsafe.getObject(obj2, j), zzaco2, m56573p(i3));
                        break;
                    case 50:
                        m56551M(zzaco2, i6, unsafe.getObject(obj2, j), i3);
                        break;
                    case 51:
                        if (m56548J(obj2, i6, i3)) {
                            zzaco2.mo49022q(i6, m56556S(obj2, j));
                            break;
                        }
                        break;
                    case 52:
                        if (m56548J(obj2, i6, i3)) {
                            zzaco2.mo49031z(i6, m56557T(obj2, j));
                            break;
                        }
                        break;
                    case 53:
                        if (m56548J(obj2, i6, i3)) {
                            zzaco2.mo49000E(i6, m56571n(obj2, j));
                            break;
                        }
                        break;
                    case 54:
                        if (m56548J(obj2, i6, i3)) {
                            zzaco2.mo49016j(i6, m56571n(obj2, j));
                            break;
                        }
                        break;
                    case 55:
                        if (m56548J(obj2, i6, i3)) {
                            zzaco2.mo48998C(i6, m56560W(obj2, j));
                            break;
                        }
                        break;
                    case 56:
                        if (m56548J(obj2, i6, i3)) {
                            zzaco2.mo49029x(i6, m56571n(obj2, j));
                            break;
                        }
                        break;
                    case 57:
                        if (m56548J(obj2, i6, i3)) {
                            zzaco2.mo49027v(i6, m56560W(obj2, j));
                            break;
                        }
                        break;
                    case 58:
                        if (m56548J(obj2, i6, i3)) {
                            zzaco2.mo49018m(i6, m56549K(obj2, j));
                            break;
                        }
                        break;
                    case 59:
                        if (m56548J(obj2, i6, i3)) {
                            m56552N(i6, unsafe.getObject(obj2, j), zzaco2);
                            break;
                        }
                        break;
                    case 60:
                        if (m56548J(obj2, i6, i3)) {
                            zzaco2.mo49002G(i6, unsafe.getObject(obj2, j), m56573p(i3));
                            break;
                        }
                        break;
                    case 61:
                        if (m56548J(obj2, i6, i3)) {
                            zzaco2.mo49020o(i6, (zzacc) unsafe.getObject(obj2, j));
                            break;
                        }
                        break;
                    case 62:
                        if (m56548J(obj2, i6, i3)) {
                            zzaco2.mo49014h(i6, m56560W(obj2, j));
                            break;
                        }
                        break;
                    case 63:
                        if (m56548J(obj2, i6, i3)) {
                            zzaco2.mo49025t(i6, m56560W(obj2, j));
                            break;
                        }
                        break;
                    case 64:
                        if (m56548J(obj2, i6, i3)) {
                            zzaco2.mo49003H(i6, m56560W(obj2, j));
                            break;
                        }
                        break;
                    case 65:
                        if (m56548J(obj2, i6, i3)) {
                            zzaco2.mo49005J(i6, m56571n(obj2, j));
                            break;
                        }
                        break;
                    case 66:
                        if (m56548J(obj2, i6, i3)) {
                            zzaco2.mo49007a(i6, m56560W(obj2, j));
                            break;
                        }
                        break;
                    case 67:
                        if (m56548J(obj2, i6, i3)) {
                            zzaco2.mo49009c(i6, m56571n(obj2, j));
                            break;
                        }
                        break;
                    case 68:
                        if (m56548J(obj2, i6, i3)) {
                            zzaco2.mo48997B(i6, unsafe.getObject(obj2, j), m56573p(i3));
                            break;
                        }
                        break;
                }
                i3 += 3;
                i2 = 1048575;
            }
            zzafn zzafn = this.f39795m;
            zzafn.mo49210r(zzafn.mo49196d(obj2), zzaco2);
            return;
        }
        this.f39796n.mo49041a(obj2);
        throw null;
    }

    /* renamed from: M */
    private final void m56551M(zzaco zzaco, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzaed zzaed = (zzaed) m56575r(i2);
            throw null;
        }
    }

    /* renamed from: N */
    private static final void m56552N(int i, Object obj, zzaco zzaco) throws IOException {
        if (obj instanceof String) {
            zzaco.mo49012f(i, (String) obj);
        } else {
            zzaco.mo49020o(i, (zzacc) obj);
        }
    }

    /* renamed from: P */
    static zzafo m56553P(Object obj) {
        zzadf zzadf = (zzadf) obj;
        zzafo zzafo = zzadf.zzc;
        if (zzafo != zzafo.m56764c()) {
            return zzafo;
        }
        zzafo f = zzafo.m56766f();
        zzadf.zzc = f;
        return f;
    }

    /* renamed from: Q */
    static zzaen m56554Q(Class cls, zzaeh zzaeh, zzaep zzaep, zzady zzady, zzafn zzafn, zzact zzact, zzaef zzaef) {
        if (zzaeh instanceof zzaeu) {
            return m56555R((zzaeu) zzaeh, zzaep, zzady, zzafn, zzact, zzaef);
        }
        zzafk zzafk = (zzafk) zzaeh;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0378  */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.p204firebaseauthapi.zzaen m56555R(com.google.android.gms.internal.p204firebaseauthapi.zzaeu r34, com.google.android.gms.internal.p204firebaseauthapi.zzaep r35, com.google.android.gms.internal.p204firebaseauthapi.zzady r36, com.google.android.gms.internal.p204firebaseauthapi.zzafn r37, com.google.android.gms.internal.p204firebaseauthapi.zzact r38, com.google.android.gms.internal.p204firebaseauthapi.zzaef r39) {
        /*
            int r0 = r34.mo49136a()
            r1 = 0
            r3 = 2
            if (r0 != r3) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = 0
        L_0x000b:
            java.lang.String r0 = r34.mo49153b()
            int r3 = r0.length()
            char r4 = r0.charAt(r1)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0027
            r4 = 1
        L_0x001d:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0028
            r4 = r6
            goto L_0x001d
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0047
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0034:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0047:
            if (r6 != 0) goto L_0x0056
            int[] r6 = f39781q
            r13 = r6
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            goto L_0x0165
        L_0x0056:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0075
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0062:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0072
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0062
        L_0x0072:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0075:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0094
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0081:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0091
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0081
        L_0x0091:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0094:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b3
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a0:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b0
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a0
        L_0x00b0:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b3:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d2
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00bf:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00cf
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00bf
        L_0x00cf:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d2:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00de:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ee
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00de
        L_0x00ee:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f1:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0110
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fd:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010d
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fd
        L_0x010d:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0110:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0131
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011c:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011c
        L_0x012d:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0131:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0154
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013d:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x014f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013d
        L_0x014f:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0154:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 + r4
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r33 = r12
            r12 = r9
            r9 = r33
        L_0x0165:
            sun.misc.Unsafe r15 = f39782r
            java.lang.Object[] r17 = r34.mo49154c()
            com.google.android.gms.internal.firebase-auth-api.zzaek r18 = r34.zza()
            java.lang.Class r1 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r21 = r14 + r9
            r22 = r14
            r23 = r21
            r9 = 0
            r20 = 0
        L_0x0183:
            if (r4 >= r3) goto L_0x03ca
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01ab
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = r24
            r24 = 13
        L_0x0193:
            int r26 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01a5
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r24
            r4 = r4 | r2
            int r24 = r24 + 13
            r2 = r26
            goto L_0x0193
        L_0x01a5:
            int r2 = r2 << r24
            r4 = r4 | r2
            r2 = r26
            goto L_0x01ad
        L_0x01ab:
            r2 = r24
        L_0x01ad:
            int r24 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01da
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01bb:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r3) goto L_0x01d4
            r3 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r2 = r2 | r3
            int r24 = r24 + 13
            r5 = r27
            r3 = r28
            goto L_0x01bb
        L_0x01d4:
            int r3 = r5 << r24
            r2 = r2 | r3
            r3 = r27
            goto L_0x01de
        L_0x01da:
            r28 = r3
            r3 = r24
        L_0x01de:
            r5 = r2 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r2 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01ec
            int r14 = r20 + 1
            r13[r20] = r9
            r20 = r14
        L_0x01ec:
            r14 = 51
            if (r5 < r14) goto L_0x0295
            int r14 = r3 + 1
            char r3 = r0.charAt(r3)
            r27 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r14) goto L_0x0222
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r14 = r27
            r27 = 13
        L_0x0203:
            int r31 = r14 + 1
            char r14 = r0.charAt(r14)
            r32 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x021c
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r27
            r3 = r3 | r12
            int r27 = r27 + 13
            r14 = r31
            r12 = r32
            goto L_0x0203
        L_0x021c:
            int r12 = r14 << r27
            r3 = r3 | r12
            r14 = r31
            goto L_0x0226
        L_0x0222:
            r32 = r12
            r14 = r27
        L_0x0226:
            int r12 = r5 + -51
            r27 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0247
            r14 = 17
            if (r12 != r14) goto L_0x0233
            goto L_0x0247
        L_0x0233:
            r14 = 12
            if (r12 != r14) goto L_0x0256
            if (r10 != 0) goto L_0x0256
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0254
        L_0x0247:
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0254:
            r16 = r14
        L_0x0256:
            int r3 = r3 + r3
            r12 = r17[r3]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0260
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0268
        L_0x0260:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m56578u(r1, r12)
            r17[r3] = r12
        L_0x0268:
            r31 = r7
            r14 = r8
            long r7 = r15.objectFieldOffset(r12)
            int r8 = (int) r7
            int r3 = r3 + 1
            r7 = r17[r3]
            boolean r12 = r7 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x027b
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x0283
        L_0x027b:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = m56578u(r1, r7)
            r17[r3] = r7
        L_0x0283:
            r3 = r8
            long r7 = r15.objectFieldOffset(r7)
            int r8 = (int) r7
            r30 = r0
            r7 = r1
            r1 = r8
            r29 = r11
            r25 = 1
            r8 = r3
            r3 = 0
            goto L_0x0391
        L_0x0295:
            r31 = r7
            r14 = r8
            r32 = r12
            int r7 = r16 + 1
            r8 = r17[r16]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m56578u(r1, r8)
            r12 = 9
            if (r5 == r12) goto L_0x030d
            r12 = 17
            if (r5 != r12) goto L_0x02ad
            goto L_0x030d
        L_0x02ad:
            r12 = 27
            if (r5 == r12) goto L_0x02fd
            r12 = 49
            if (r5 != r12) goto L_0x02b6
            goto L_0x02fd
        L_0x02b6:
            r12 = 12
            if (r5 == r12) goto L_0x02ed
            r12 = 30
            if (r5 == r12) goto L_0x02ed
            r12 = 44
            if (r5 != r12) goto L_0x02c3
            goto L_0x02ed
        L_0x02c3:
            r12 = 50
            if (r5 != r12) goto L_0x02e3
            int r12 = r22 + 1
            r13[r22] = r9
            int r22 = r9 / 3
            int r22 = r22 + r22
            int r27 = r7 + 1
            r7 = r17[r7]
            r11[r22] = r7
            r7 = r2 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x02e6
            int r7 = r27 + 1
            int r22 = r22 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02e3:
            r25 = 1
            goto L_0x031a
        L_0x02e6:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x031b
        L_0x02ed:
            if (r10 != 0) goto L_0x02e3
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
            goto L_0x030a
        L_0x02fd:
            r25 = 1
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
        L_0x030a:
            r12 = r27
            goto L_0x031b
        L_0x030d:
            r25 = 1
            int r12 = r9 / 3
            int r12 = r12 + r12
            int r12 = r12 + 1
            java.lang.Class r27 = r8.getType()
            r11[r12] = r27
        L_0x031a:
            r12 = r7
        L_0x031b:
            long r7 = r15.objectFieldOffset(r8)
            int r8 = (int) r7
            r7 = r2 & 4096(0x1000, float:5.74E-42)
            r27 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r11
            r11 = 4096(0x1000, float:5.74E-42)
            if (r7 != r11) goto L_0x0378
            r7 = 17
            if (r5 > r7) goto L_0x0378
            int r7 = r3 + 1
            char r3 = r0.charAt(r3)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r11) goto L_0x0354
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x033e:
            int r27 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r11) goto L_0x0350
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r26
            r3 = r3 | r7
            int r26 = r26 + 13
            r7 = r27
            goto L_0x033e
        L_0x0350:
            int r7 = r7 << r26
            r3 = r3 | r7
            goto L_0x0356
        L_0x0354:
            r27 = r7
        L_0x0356:
            int r7 = r6 + r6
            int r26 = r3 / 32
            int r7 = r7 + r26
            r11 = r17[r7]
            r30 = r0
            boolean r0 = r11 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0367
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            goto L_0x036f
        L_0x0367:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = m56578u(r1, r11)
            r17[r7] = r11
        L_0x036f:
            r7 = r1
            long r0 = r15.objectFieldOffset(r11)
            int r1 = (int) r0
            int r3 = r3 % 32
            goto L_0x0381
        L_0x0378:
            r30 = r0
            r7 = r1
            r27 = r3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
        L_0x0381:
            r0 = 18
            if (r5 < r0) goto L_0x038f
            r0 = 49
            if (r5 > r0) goto L_0x038f
            int r0 = r23 + 1
            r13[r23] = r8
            r23 = r0
        L_0x038f:
            r16 = r12
        L_0x0391:
            int r0 = r9 + 1
            r31[r9] = r4
            int r4 = r0 + 1
            r9 = r2 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x039e
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x039f
        L_0x039e:
            r9 = 0
        L_0x039f:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03a6
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a7
        L_0x03a6:
            r2 = 0
        L_0x03a7:
            r2 = r2 | r9
            int r5 = r5 << 20
            r2 = r2 | r5
            r2 = r2 | r8
            r31[r0] = r2
            int r9 = r4 + 1
            int r0 = r3 << 20
            r0 = r0 | r1
            r31[r4] = r0
            r1 = r7
            r8 = r14
            r14 = r24
            r4 = r27
            r3 = r28
            r11 = r29
            r0 = r30
            r7 = r31
            r12 = r32
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0183
        L_0x03ca:
            r31 = r7
            r29 = r11
            r32 = r12
            r24 = r14
            r14 = r8
            com.google.android.gms.internal.firebase-auth-api.zzaen r0 = new com.google.android.gms.internal.firebase-auth-api.zzaen
            r4 = r0
            com.google.android.gms.internal.firebase-auth-api.zzaek r9 = r34.zza()
            r11 = 0
            r1 = r29
            r20 = 0
            r5 = r31
            r6 = r1
            r7 = r14
            r8 = r32
            r12 = r13
            r13 = r24
            r14 = r21
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p204firebaseauthapi.zzaen.m56555R(com.google.android.gms.internal.firebase-auth-api.zzaeu, com.google.android.gms.internal.firebase-auth-api.zzaep, com.google.android.gms.internal.firebase-auth-api.zzady, com.google.android.gms.internal.firebase-auth-api.zzafn, com.google.android.gms.internal.firebase-auth-api.zzact, com.google.android.gms.internal.firebase-auth-api.zzaef):com.google.android.gms.internal.firebase-auth-api.zzaen");
    }

    /* renamed from: S */
    private static double m56556S(Object obj, long j) {
        return ((Double) zzafx.m56844k(obj, j)).doubleValue();
    }

    /* renamed from: T */
    private static float m56557T(Object obj, long j) {
        return ((Float) zzafx.m56844k(obj, j)).floatValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x030c, code lost:
        r4 = r4 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x030d, code lost:
        r4 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x030e, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x037d, code lost:
        r6 = r6 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0488, code lost:
        r4 = r4 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0503, code lost:
        r4 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0504, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x052d, code lost:
        r6 = r6 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x053b, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x054a, code lost:
        r3 = r3 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x054e, code lost:
        r5 = r5 + 3;
        r3 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f1, code lost:
        r4 = r4 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x019e, code lost:
        r6 = r6 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ae, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01be, code lost:
        r3 = r3 + 8;
     */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m56558U(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f39782r
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
        L_0x000f:
            int[] r9 = r0.f39783a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x0555
            int r9 = r0.m56570m(r5)
            int[] r10 = r0.f39783a
            r11 = r10[r5]
            int r12 = m56569l(r9)
            r13 = 17
            r14 = 1
            if (r12 > r13) goto L_0x0038
            int r13 = r5 + 2
            r10 = r10[r13]
            r13 = r10 & r3
            int r10 = r10 >>> 20
            int r10 = r14 << r10
            if (r13 == r8) goto L_0x0039
            long r7 = (long) r13
            int r7 = r2.getInt(r1, r7)
            r8 = r13
            goto L_0x0039
        L_0x0038:
            r10 = 0
        L_0x0039:
            r9 = r9 & r3
            long r3 = (long) r9
            r9 = 63
            switch(r12) {
                case 0: goto L_0x053f;
                case 1: goto L_0x0530;
                case 2: goto L_0x051a;
                case 3: goto L_0x0506;
                case 4: goto L_0x04f0;
                case 5: goto L_0x04e4;
                case 6: goto L_0x04d8;
                case 7: goto L_0x04ca;
                case 8: goto L_0x049f;
                case 9: goto L_0x048c;
                case 10: goto L_0x046f;
                case 11: goto L_0x045a;
                case 12: goto L_0x0445;
                case 13: goto L_0x0438;
                case 14: goto L_0x042b;
                case 15: goto L_0x0411;
                case 16: goto L_0x03f7;
                case 17: goto L_0x03e3;
                case 18: goto L_0x03d5;
                case 19: goto L_0x03c9;
                case 20: goto L_0x03bd;
                case 21: goto L_0x03b1;
                case 22: goto L_0x03a5;
                case 23: goto L_0x0399;
                case 24: goto L_0x038d;
                case 25: goto L_0x0381;
                case 26: goto L_0x0373;
                case 27: goto L_0x0364;
                case 28: goto L_0x0359;
                case 29: goto L_0x034d;
                case 30: goto L_0x0341;
                case 31: goto L_0x0335;
                case 32: goto L_0x0329;
                case 33: goto L_0x031d;
                case 34: goto L_0x0311;
                case 35: goto L_0x02f8;
                case 36: goto L_0x02e3;
                case 37: goto L_0x02ce;
                case 38: goto L_0x02b9;
                case 39: goto L_0x02a4;
                case 40: goto L_0x028f;
                case 41: goto L_0x0279;
                case 42: goto L_0x0263;
                case 43: goto L_0x024d;
                case 44: goto L_0x0237;
                case 45: goto L_0x0221;
                case 46: goto L_0x020b;
                case 47: goto L_0x01f5;
                case 48: goto L_0x01df;
                case 49: goto L_0x01cf;
                case 50: goto L_0x01c2;
                case 51: goto L_0x01b2;
                case 52: goto L_0x01a2;
                case 53: goto L_0x018a;
                case 54: goto L_0x0175;
                case 55: goto L_0x015f;
                case 56: goto L_0x0152;
                case 57: goto L_0x0145;
                case 58: goto L_0x0136;
                case 59: goto L_0x0109;
                case 60: goto L_0x00f5;
                case 61: goto L_0x00d7;
                case 62: goto L_0x00c1;
                case 63: goto L_0x00ab;
                case 64: goto L_0x009d;
                case 65: goto L_0x008f;
                case 66: goto L_0x0074;
                case 67: goto L_0x0058;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x037e
        L_0x0042:
            boolean r9 = r0.m56548J(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.firebase-auth-api.zzaek r3 = (com.google.android.gms.internal.p204firebaseauthapi.zzaek) r3
            com.google.android.gms.internal.firebase-auth-api.zzaew r4 = r0.m56573p(r5)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56305F(r11, r3, r4)
            goto L_0x037d
        L_0x0058:
            boolean r10 = r0.m56548J(r1, r11, r5)
            if (r10 == 0) goto L_0x037e
            long r3 = m56571n(r1, r3)
            int r10 = r11 << 3
            int r10 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r10)
            long r11 = r3 + r3
            long r3 = r3 >> r9
            long r3 = r3 ^ r11
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56313g(r3)
            int r10 = r10 + r3
            int r6 = r6 + r10
            goto L_0x037e
        L_0x0074:
            boolean r9 = r0.m56548J(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            int r3 = m56560W(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            int r9 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r9
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x030d
        L_0x008f:
            boolean r3 = r0.m56548J(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x01be
        L_0x009d:
            boolean r3 = r0.m56548J(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x01ae
        L_0x00ab:
            boolean r9 = r0.m56548J(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            int r3 = m56560W(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56306G(r3)
            goto L_0x030d
        L_0x00c1:
            boolean r9 = r0.m56548J(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            int r3 = m56560W(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x030d
        L_0x00d7:
            boolean r9 = r0.m56548J(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.firebase-auth-api.zzacc r3 = (com.google.android.gms.internal.p204firebaseauthapi.zzacc) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            int r3 = r3.mo48893f()
            int r9 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
        L_0x00f1:
            int r9 = r9 + r3
            int r4 = r4 + r9
            goto L_0x030e
        L_0x00f5:
            boolean r9 = r0.m56548J(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.firebase-auth-api.zzaew r4 = r0.m56573p(r5)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56681Q(r11, r3, r4)
            goto L_0x037d
        L_0x0109:
            boolean r9 = r0.m56548J(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.p204firebaseauthapi.zzacc
            if (r4 == 0) goto L_0x0128
            com.google.android.gms.internal.firebase-auth-api.zzacc r3 = (com.google.android.gms.internal.p204firebaseauthapi.zzacc) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            int r3 = r3.mo48893f()
            int r9 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x00f1
        L_0x0128:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56310d(r3)
            goto L_0x030d
        L_0x0136:
            boolean r3 = r0.m56548J(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            int r3 = r3 + r14
            goto L_0x037d
        L_0x0145:
            boolean r3 = r0.m56548J(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x01ae
        L_0x0152:
            boolean r3 = r0.m56548J(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x01be
        L_0x015f:
            boolean r9 = r0.m56548J(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            int r3 = m56560W(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56306G(r3)
            goto L_0x030d
        L_0x0175:
            boolean r9 = r0.m56548J(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            long r3 = m56571n(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r9)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56313g(r3)
            goto L_0x019e
        L_0x018a:
            boolean r9 = r0.m56548J(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            long r3 = m56571n(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r9)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56313g(r3)
        L_0x019e:
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x037e
        L_0x01a2:
            boolean r3 = r0.m56548J(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
        L_0x01ae:
            int r3 = r3 + 4
            goto L_0x037d
        L_0x01b2:
            boolean r3 = r0.m56548J(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
        L_0x01be:
            int r3 = r3 + 8
            goto L_0x037d
        L_0x01c2:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.lang.Object r4 = r0.m56575r(r5)
            com.google.android.gms.internal.p204firebaseauthapi.zzaef.m56520a(r11, r3, r4)
            goto L_0x037e
        L_0x01cf:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.firebase-auth-api.zzaew r4 = r0.m56573p(r5)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56676L(r11, r3, r4)
            goto L_0x037d
        L_0x01df:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56686V(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r11)
            int r9 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x030c
        L_0x01f5:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56684T(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r11)
            int r9 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x030c
        L_0x020b:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56675K(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r11)
            int r9 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x030c
        L_0x0221:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56673I(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r11)
            int r9 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x030c
        L_0x0237:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56671G(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r11)
            int r9 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x030c
        L_0x024d:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56689Y(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r11)
            int r9 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x030c
        L_0x0263:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56668D(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r11)
            int r9 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x030c
        L_0x0279:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56673I(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r11)
            int r9 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x030c
        L_0x028f:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56675K(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r11)
            int r9 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x030c
        L_0x02a4:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56678N(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r11)
            int r9 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x030c
        L_0x02b9:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56692a0(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r11)
            int r9 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x030c
        L_0x02ce:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56680P(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r11)
            int r9 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x030c
        L_0x02e3:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56673I(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r11)
            int r9 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x030c
        L_0x02f8:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56675K(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r11)
            int r9 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
        L_0x030c:
            int r4 = r4 + r9
        L_0x030d:
            int r4 = r4 + r3
        L_0x030e:
            int r6 = r6 + r4
            goto L_0x037e
        L_0x0311:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r9 = 0
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56685U(r11, r3, r9)
            goto L_0x037d
        L_0x031d:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56683S(r11, r3, r9)
            goto L_0x037d
        L_0x0329:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56674J(r11, r3, r9)
            goto L_0x037d
        L_0x0335:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56672H(r11, r3, r9)
            goto L_0x037d
        L_0x0341:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56670F(r11, r3, r9)
            goto L_0x037d
        L_0x034d:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56688X(r11, r3, r9)
            goto L_0x037d
        L_0x0359:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56669E(r11, r3)
            goto L_0x037d
        L_0x0364:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.firebase-auth-api.zzaew r4 = r0.m56573p(r5)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56682R(r11, r3, r4)
            goto L_0x037d
        L_0x0373:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56687W(r11, r3)
        L_0x037d:
            int r6 = r6 + r3
        L_0x037e:
            r12 = 0
            goto L_0x054e
        L_0x0381:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r12 = 0
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56665A(r11, r3, r12)
            goto L_0x03e0
        L_0x038d:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56672H(r11, r3, r12)
            goto L_0x03e0
        L_0x0399:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56674J(r11, r3, r12)
            goto L_0x03e0
        L_0x03a5:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56677M(r11, r3, r12)
            goto L_0x03e0
        L_0x03b1:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56690Z(r11, r3, r12)
            goto L_0x03e0
        L_0x03bd:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56679O(r11, r3, r12)
            goto L_0x03e0
        L_0x03c9:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56672H(r11, r3, r12)
            goto L_0x03e0
        L_0x03d5:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56674J(r11, r3, r12)
        L_0x03e0:
            int r6 = r6 + r3
            goto L_0x054e
        L_0x03e3:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.firebase-auth-api.zzaek r3 = (com.google.android.gms.internal.p204firebaseauthapi.zzaek) r3
            com.google.android.gms.internal.firebase-auth-api.zzaew r4 = r0.m56573p(r5)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56305F(r11, r3, r4)
            goto L_0x03e0
        L_0x03f7:
            r12 = 0
            r10 = r10 & r7
            if (r10 == 0) goto L_0x054e
            long r3 = r2.getLong(r1, r3)
            int r10 = r11 << 3
            int r10 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r10)
            long r14 = r3 + r3
            long r3 = r3 >> r9
            long r3 = r3 ^ r14
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56313g(r3)
            int r10 = r10 + r3
            int r6 = r6 + r10
            goto L_0x054e
        L_0x0411:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            int r9 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r9
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x0503
        L_0x042b:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x054a
        L_0x0438:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x053b
        L_0x0445:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56306G(r3)
            goto L_0x0503
        L_0x045a:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x0503
        L_0x046f:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.firebase-auth-api.zzacc r3 = (com.google.android.gms.internal.p204firebaseauthapi.zzacc) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            int r3 = r3.mo48893f()
            int r9 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
        L_0x0488:
            int r9 = r9 + r3
            int r4 = r4 + r9
            goto L_0x0504
        L_0x048c:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.firebase-auth-api.zzaew r4 = r0.m56573p(r5)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56681Q(r11, r3, r4)
            goto L_0x03e0
        L_0x049f:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.p204firebaseauthapi.zzacc
            if (r4 == 0) goto L_0x04bd
            com.google.android.gms.internal.firebase-auth-api.zzacc r3 = (com.google.android.gms.internal.p204firebaseauthapi.zzacc) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            int r3 = r3.mo48893f()
            int r9 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x0488
        L_0x04bd:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56310d(r3)
            goto L_0x0503
        L_0x04ca:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            int r3 = r3 + r14
            goto L_0x03e0
        L_0x04d8:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x053b
        L_0x04e4:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
            goto L_0x054a
        L_0x04f0:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56306G(r3)
        L_0x0503:
            int r4 = r4 + r3
        L_0x0504:
            int r6 = r6 + r4
            goto L_0x054e
        L_0x0506:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r9)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56313g(r3)
            goto L_0x052d
        L_0x051a:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r9)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56313g(r3)
        L_0x052d:
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x054e
        L_0x0530:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
        L_0x053b:
            int r3 = r3 + 4
            goto L_0x03e0
        L_0x053f:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r3)
        L_0x054a:
            int r3 = r3 + 8
            goto L_0x03e0
        L_0x054e:
            int r5 = r5 + 3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000f
        L_0x0555:
            com.google.android.gms.internal.firebase-auth-api.zzafn r2 = r0.f39795m
            java.lang.Object r3 = r2.mo49196d(r1)
            int r2 = r2.mo49193a(r3)
            int r6 = r6 + r2
            boolean r2 = r0.f39788f
            if (r2 != 0) goto L_0x0565
            return r6
        L_0x0565:
            com.google.android.gms.internal.firebase-auth-api.zzact r2 = r0.f39796n
            r2.mo49041a(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p204firebaseauthapi.zzaen.m56558U(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02fc, code lost:
        r5 = r5 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0474, code lost:
        r5 = r5 + (r6 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04c4, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04f6, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04f7, code lost:
        r3 = r3 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0522, code lost:
        r3 = r3 + (r6 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0531, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0541, code lost:
        r4 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0545, code lost:
        r2 = r2 + 3;
     */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m56559V(java.lang.Object r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f39782r
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0005:
            int[] r4 = r11.f39783a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0549
            int r4 = r11.m56570m(r2)
            int r5 = m56569l(r4)
            int[] r6 = r11.f39783a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            com.google.android.gms.internal.firebase-auth-api.zzacy r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacy.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.firebase-auth-api.zzacy r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacy.SINT64_LIST_PACKED
            int r4 = r4.zza()
            if (r5 > r4) goto L_0x0031
            int[] r4 = r11.f39783a
            int r9 = r2 + 2
            r4 = r4[r9]
        L_0x0031:
            r4 = 63
            switch(r5) {
                case 0: goto L_0x0535;
                case 1: goto L_0x0525;
                case 2: goto L_0x050e;
                case 3: goto L_0x04f9;
                case 4: goto L_0x04e2;
                case 5: goto L_0x04d5;
                case 6: goto L_0x04c8;
                case 7: goto L_0x04b8;
                case 8: goto L_0x048c;
                case 9: goto L_0x0478;
                case 10: goto L_0x045a;
                case 11: goto L_0x0444;
                case 12: goto L_0x042e;
                case 13: goto L_0x0420;
                case 14: goto L_0x0412;
                case 15: goto L_0x03f7;
                case 16: goto L_0x03dc;
                case 17: goto L_0x03c7;
                case 18: goto L_0x03ba;
                case 19: goto L_0x03af;
                case 20: goto L_0x03a4;
                case 21: goto L_0x0399;
                case 22: goto L_0x038e;
                case 23: goto L_0x0383;
                case 24: goto L_0x0378;
                case 25: goto L_0x036d;
                case 26: goto L_0x0362;
                case 27: goto L_0x0353;
                case 28: goto L_0x0347;
                case 29: goto L_0x033b;
                case 30: goto L_0x032f;
                case 31: goto L_0x0323;
                case 32: goto L_0x0317;
                case 33: goto L_0x030b;
                case 34: goto L_0x02ff;
                case 35: goto L_0x02e8;
                case 36: goto L_0x02d3;
                case 37: goto L_0x02be;
                case 38: goto L_0x02a9;
                case 39: goto L_0x0294;
                case 40: goto L_0x027f;
                case 41: goto L_0x0269;
                case 42: goto L_0x0253;
                case 43: goto L_0x023d;
                case 44: goto L_0x0227;
                case 45: goto L_0x0211;
                case 46: goto L_0x01fb;
                case 47: goto L_0x01e5;
                case 48: goto L_0x01cf;
                case 49: goto L_0x01bf;
                case 50: goto L_0x01b2;
                case 51: goto L_0x01a4;
                case 52: goto L_0x0196;
                case 53: goto L_0x0180;
                case 54: goto L_0x016a;
                case 55: goto L_0x0154;
                case 56: goto L_0x0146;
                case 57: goto L_0x0138;
                case 58: goto L_0x012a;
                case 59: goto L_0x00fc;
                case 60: goto L_0x00e8;
                case 61: goto L_0x00cc;
                case 62: goto L_0x00b6;
                case 63: goto L_0x00a0;
                case 64: goto L_0x0092;
                case 65: goto L_0x0084;
                case 66: goto L_0x0069;
                case 67: goto L_0x004e;
                case 68: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0545
        L_0x0038:
            boolean r4 = r11.m56548J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            com.google.android.gms.internal.firebase-auth-api.zzaek r4 = (com.google.android.gms.internal.p204firebaseauthapi.zzaek) r4
            com.google.android.gms.internal.firebase-auth-api.zzaew r5 = r11.m56573p(r2)
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56305F(r6, r4, r5)
            goto L_0x03c4
        L_0x004e:
            boolean r5 = r11.m56548J(r12, r6, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = m56571n(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56313g(r6)
            goto L_0x04f6
        L_0x0069:
            boolean r4 = r11.m56548J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m56560W(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x04f6
        L_0x0084:
            boolean r4 = r11.m56548J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x0541
        L_0x0092:
            boolean r4 = r11.m56548J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x0531
        L_0x00a0:
            boolean r4 = r11.m56548J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m56560W(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r5)
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56306G(r4)
            goto L_0x04f6
        L_0x00b6:
            boolean r4 = r11.m56548J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m56560W(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r5)
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x04f6
        L_0x00cc:
            boolean r4 = r11.m56548J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            com.google.android.gms.internal.firebase-auth-api.zzacc r4 = (com.google.android.gms.internal.p204firebaseauthapi.zzacc) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r5)
            int r4 = r4.mo48893f()
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x0474
        L_0x00e8:
            boolean r4 = r11.m56548J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            com.google.android.gms.internal.firebase-auth-api.zzaew r5 = r11.m56573p(r2)
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56681Q(r6, r4, r5)
            goto L_0x03c4
        L_0x00fc:
            boolean r4 = r11.m56548J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.p204firebaseauthapi.zzacc
            if (r5 == 0) goto L_0x011c
            com.google.android.gms.internal.firebase-auth-api.zzacc r4 = (com.google.android.gms.internal.p204firebaseauthapi.zzacc) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r5)
            int r4 = r4.mo48893f()
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x0474
        L_0x011c:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r5)
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56310d(r4)
            goto L_0x04f6
        L_0x012a:
            boolean r4 = r11.m56548J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x04c4
        L_0x0138:
            boolean r4 = r11.m56548J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x0531
        L_0x0146:
            boolean r4 = r11.m56548J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x0541
        L_0x0154:
            boolean r4 = r11.m56548J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m56560W(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r5)
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56306G(r4)
            goto L_0x04f6
        L_0x016a:
            boolean r4 = r11.m56548J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m56571n(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r6)
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56313g(r4)
            goto L_0x0522
        L_0x0180:
            boolean r4 = r11.m56548J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m56571n(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r6)
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56313g(r4)
            goto L_0x0522
        L_0x0196:
            boolean r4 = r11.m56548J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x0531
        L_0x01a4:
            boolean r4 = r11.m56548J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x0541
        L_0x01b2:
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            java.lang.Object r5 = r11.m56575r(r2)
            com.google.android.gms.internal.p204firebaseauthapi.zzaef.m56520a(r6, r4, r5)
            goto L_0x0545
        L_0x01bf:
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.firebase-auth-api.zzaew r5 = r11.m56573p(r2)
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56676L(r6, r4, r5)
            goto L_0x03c4
        L_0x01cf:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56686V(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r6)
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x02fc
        L_0x01e5:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56684T(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r6)
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x02fc
        L_0x01fb:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56675K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r6)
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x02fc
        L_0x0211:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56673I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r6)
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x02fc
        L_0x0227:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56671G(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r6)
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x02fc
        L_0x023d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56689Y(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r6)
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x02fc
        L_0x0253:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56668D(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r6)
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x02fc
        L_0x0269:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56673I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r6)
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x02fc
        L_0x027f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56675K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r6)
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x02fc
        L_0x0294:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56678N(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r6)
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x02fc
        L_0x02a9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56692a0(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r6)
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x02fc
        L_0x02be:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56680P(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r6)
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x02fc
        L_0x02d3:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56673I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r6)
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x02fc
        L_0x02e8:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56675K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56311e(r6)
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
        L_0x02fc:
            int r5 = r5 + r6
            goto L_0x04f6
        L_0x02ff:
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56685U(r6, r4, r1)
            goto L_0x03c4
        L_0x030b:
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56683S(r6, r4, r1)
            goto L_0x03c4
        L_0x0317:
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56674J(r6, r4, r1)
            goto L_0x03c4
        L_0x0323:
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56672H(r6, r4, r1)
            goto L_0x03c4
        L_0x032f:
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56670F(r6, r4, r1)
            goto L_0x03c4
        L_0x033b:
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56688X(r6, r4, r1)
            goto L_0x03c4
        L_0x0347:
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56669E(r6, r4)
            goto L_0x03c4
        L_0x0353:
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.firebase-auth-api.zzaew r5 = r11.m56573p(r2)
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56682R(r6, r4, r5)
            goto L_0x03c4
        L_0x0362:
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56687W(r6, r4)
            goto L_0x03c4
        L_0x036d:
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56665A(r6, r4, r1)
            goto L_0x03c4
        L_0x0378:
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56672H(r6, r4, r1)
            goto L_0x03c4
        L_0x0383:
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56674J(r6, r4, r1)
            goto L_0x03c4
        L_0x038e:
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56677M(r6, r4, r1)
            goto L_0x03c4
        L_0x0399:
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56690Z(r6, r4, r1)
            goto L_0x03c4
        L_0x03a4:
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56679O(r6, r4, r1)
            goto L_0x03c4
        L_0x03af:
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56672H(r6, r4, r1)
            goto L_0x03c4
        L_0x03ba:
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56674J(r6, r4, r1)
        L_0x03c4:
            int r3 = r3 + r4
            goto L_0x0545
        L_0x03c7:
            boolean r4 = r11.m56544F(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            com.google.android.gms.internal.firebase-auth-api.zzaek r4 = (com.google.android.gms.internal.p204firebaseauthapi.zzaek) r4
            com.google.android.gms.internal.firebase-auth-api.zzaew r5 = r11.m56573p(r2)
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56305F(r6, r4, r5)
            goto L_0x03c4
        L_0x03dc:
            boolean r5 = r11.m56544F(r12, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56842i(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56313g(r6)
            goto L_0x04f6
        L_0x03f7:
            boolean r4 = r11.m56544F(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56841h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x04f6
        L_0x0412:
            boolean r4 = r11.m56544F(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x0541
        L_0x0420:
            boolean r4 = r11.m56544F(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x0531
        L_0x042e:
            boolean r4 = r11.m56544F(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56841h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r5)
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56306G(r4)
            goto L_0x04f6
        L_0x0444:
            boolean r4 = r11.m56544F(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56841h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r5)
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x04f6
        L_0x045a:
            boolean r4 = r11.m56544F(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            com.google.android.gms.internal.firebase-auth-api.zzacc r4 = (com.google.android.gms.internal.p204firebaseauthapi.zzacc) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r5)
            int r4 = r4.mo48893f()
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
        L_0x0474:
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L_0x04f7
        L_0x0478:
            boolean r4 = r11.m56544F(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            com.google.android.gms.internal.firebase-auth-api.zzaew r5 = r11.m56573p(r2)
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56681Q(r6, r4, r5)
            goto L_0x03c4
        L_0x048c:
            boolean r4 = r11.m56544F(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.p204firebaseauthapi.zzacc
            if (r5 == 0) goto L_0x04ab
            com.google.android.gms.internal.firebase-auth-api.zzacc r4 = (com.google.android.gms.internal.p204firebaseauthapi.zzacc) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r5)
            int r4 = r4.mo48893f()
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x0474
        L_0x04ab:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r5)
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56310d(r4)
            goto L_0x04f6
        L_0x04b8:
            boolean r4 = r11.m56544F(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
        L_0x04c4:
            int r4 = r4 + 1
            goto L_0x03c4
        L_0x04c8:
            boolean r4 = r11.m56544F(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x0531
        L_0x04d5:
            boolean r4 = r11.m56544F(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
            goto L_0x0541
        L_0x04e2:
            boolean r4 = r11.m56544F(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56841h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r5)
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56306G(r4)
        L_0x04f6:
            int r5 = r5 + r4
        L_0x04f7:
            int r3 = r3 + r5
            goto L_0x0545
        L_0x04f9:
            boolean r4 = r11.m56544F(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56842i(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r6)
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56313g(r4)
            goto L_0x0522
        L_0x050e:
            boolean r4 = r11.m56544F(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56842i(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r6)
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56313g(r4)
        L_0x0522:
            int r6 = r6 + r4
            int r3 = r3 + r6
            goto L_0x0545
        L_0x0525:
            boolean r4 = r11.m56544F(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
        L_0x0531:
            int r4 = r4 + 4
            goto L_0x03c4
        L_0x0535:
            boolean r4 = r11.m56544F(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacn.m56312f(r4)
        L_0x0541:
            int r4 = r4 + 8
            goto L_0x03c4
        L_0x0545:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0549:
            com.google.android.gms.internal.firebase-auth-api.zzafn r0 = r11.f39795m
            java.lang.Object r12 = r0.mo49196d(r12)
            int r12 = r0.mo49193a(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p204firebaseauthapi.zzaen.m56559V(java.lang.Object):int");
    }

    /* renamed from: W */
    private static int m56560W(Object obj, long j) {
        return ((Integer) zzafx.m56844k(obj, j)).intValue();
    }

    /* renamed from: X */
    private final int m56561X(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzabp zzabp) throws IOException {
        Unsafe unsafe = f39782r;
        Object r = m56575r(i3);
        Object object = unsafe.getObject(obj, j);
        if (zzaef.m56521b(object)) {
            zzaee b = zzaee.m56513a().mo49125b();
            zzaef.m56522c(b, object);
            unsafe.putObject(obj, j, b);
        }
        zzaed zzaed = (zzaed) r;
        throw null;
    }

    /* renamed from: Y */
    private final int m56562Y(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzabp zzabp) throws IOException {
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        zzabp zzabp2 = zzabp;
        Unsafe unsafe = f39782r;
        long j3 = (long) (this.f39783a[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(zzabq.m56135p(bArr, i))));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(zzabq.m56121b(bArr, i))));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int m = zzabq.m56132m(bArr2, i9, zzabp2);
                    unsafe.putObject(obj2, j2, Long.valueOf(zzabp2.f39625b));
                    unsafe.putInt(obj2, j3, i11);
                    return m;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int j4 = zzabq.m56129j(bArr2, i9, zzabp2);
                    unsafe.putObject(obj2, j2, Integer.valueOf(zzabp2.f39624a));
                    unsafe.putInt(obj2, j3, i11);
                    return j4;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(obj2, j2, Long.valueOf(zzabq.m56135p(bArr, i)));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(obj2, j2, Integer.valueOf(zzabq.m56121b(bArr, i)));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int m2 = zzabq.m56132m(bArr2, i9, zzabp2);
                    unsafe.putObject(obj2, j2, Boolean.valueOf(zzabp2.f39625b != 0));
                    unsafe.putInt(obj2, j3, i11);
                    return m2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int j5 = zzabq.m56129j(bArr2, i9, zzabp2);
                    int i14 = zzabp2.f39624a;
                    if (i14 == 0) {
                        unsafe.putObject(obj2, j2, "");
                    } else if ((i6 & 536870912) == 0 || zzagc.m56877f(bArr2, j5, j5 + i14)) {
                        unsafe.putObject(obj2, j2, new String(bArr2, j5, i14, zzadl.f39746b));
                        j5 += i14;
                    } else {
                        throw zzadn.m56468d();
                    }
                    unsafe.putInt(obj2, j3, i11);
                    return j5;
                }
                break;
            case 60:
                if (i12 == 2) {
                    Object t = m56577t(obj2, i11, i13);
                    int o = zzabq.m56134o(t, m56573p(i13), bArr, i, i2, zzabp);
                    m56541C(obj2, i11, i13, t);
                    return o;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int a = zzabq.m56120a(bArr2, i9, zzabp2);
                    unsafe.putObject(obj2, j2, zzabp2.f39626c);
                    unsafe.putInt(obj2, j3, i11);
                    return a;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int j6 = zzabq.m56129j(bArr2, i9, zzabp2);
                    int i15 = zzabp2.f39624a;
                    zzadj o2 = m56572o(i13);
                    if (o2 == null || o2.zza()) {
                        unsafe.putObject(obj2, j2, Integer.valueOf(i15));
                        unsafe.putInt(obj2, j3, i11);
                    } else {
                        m56553P(obj).mo49219j(i10, Long.valueOf((long) i15));
                    }
                    return j6;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int j7 = zzabq.m56129j(bArr2, i9, zzabp2);
                    unsafe.putObject(obj2, j2, Integer.valueOf(zzacg.m56196l(zzabp2.f39624a)));
                    unsafe.putInt(obj2, j3, i11);
                    return j7;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int m3 = zzabq.m56132m(bArr2, i9, zzabp2);
                    unsafe.putObject(obj2, j2, Long.valueOf(zzacg.m56197m(zzabp2.f39625b)));
                    unsafe.putInt(obj2, j3, i11);
                    return m3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    Object t2 = m56577t(obj2, i11, i13);
                    int n = zzabq.m56133n(t2, m56573p(i13), bArr, i, i2, (i10 & -8) | 4, zzabp);
                    m56541C(obj2, i11, i13, t2);
                    return n;
                }
                break;
        }
        return i9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02ff, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x032b, code lost:
        if (r0 != r14) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x034e, code lost:
        if (r0 != r14) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0115, code lost:
        r6 = r6 | r10;
        r13 = r34;
        r9 = r7;
        r2 = r15;
        r7 = r20;
        r1 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0148, code lost:
        r13 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x021e, code lost:
        r0 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x023c, code lost:
        r6 = r6 | r10;
        r9 = r7;
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x023f, code lost:
        r7 = r20;
        r1 = r23;
        r8 = 1048575;
        r10 = -1;
        r15 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0248, code lost:
        r13 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x024c, code lost:
        r2 = r4;
        r29 = r7;
        r7 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02ec, code lost:
        if (r0 != r24) goto L_0x02ee;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m56563Z(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.p204firebaseauthapi.zzabp r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            m56579v(r31)
            sun.misc.Unsafe r9 = f39782r
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001d:
            if (r0 >= r13) goto L_0x0376
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002f
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56130k(r0, r12, r3, r11)
            int r3 = r11.f39624a
            r4 = r0
            r17 = r3
            goto L_0x0032
        L_0x002f:
            r17 = r0
            r4 = r3
        L_0x0032:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003f
            int r2 = r2 / 3
            int r0 = r15.m56566c0(r5, r2)
            goto L_0x0043
        L_0x003f:
            int r0 = r15.m56565b0(r5)
        L_0x0043:
            r2 = r0
            if (r2 != r10) goto L_0x0050
            r2 = r4
            r23 = r5
            r29 = r9
            r15 = 0
        L_0x004c:
            r18 = -1
            goto L_0x0351
        L_0x0050:
            int[] r0 = r15.f39783a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r13 = m56569l(r1)
            r10 = r1 & r8
            r19 = r9
            long r8 = (long) r10
            r10 = 17
            r33 = r5
            if (r13 > r10) goto L_0x0253
            int r10 = r2 + 2
            r0 = r0[r10]
            int r10 = r0 >>> 20
            r5 = 1
            int r10 = r5 << r10
            r15 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r15
            if (r0 == r7) goto L_0x008d
            r22 = r1
            r20 = r2
            if (r7 == r15) goto L_0x0081
            long r1 = (long) r7
            r7 = r19
            r7.putInt(r14, r1, r6)
            goto L_0x0083
        L_0x0081:
            r7 = r19
        L_0x0083:
            if (r0 == r15) goto L_0x008a
            long r1 = (long) r0
            int r6 = r7.getInt(r14, r1)
        L_0x008a:
            r2 = r7
            r7 = r0
            goto L_0x0093
        L_0x008d:
            r22 = r1
            r20 = r2
            r2 = r19
        L_0x0093:
            r0 = 5
            switch(r13) {
                case 0: goto L_0x0221;
                case 1: goto L_0x0205;
                case 2: goto L_0x01e4;
                case 3: goto L_0x01e4;
                case 4: goto L_0x01cc;
                case 5: goto L_0x01ac;
                case 6: goto L_0x0195;
                case 7: goto L_0x0174;
                case 8: goto L_0x014f;
                case 9: goto L_0x0120;
                case 10: goto L_0x0102;
                case 11: goto L_0x01cc;
                case 12: goto L_0x00ef;
                case 13: goto L_0x0195;
                case 14: goto L_0x01ac;
                case 15: goto L_0x00d8;
                case 16: goto L_0x00a5;
                default: goto L_0x0097;
            }
        L_0x0097:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            goto L_0x024c
        L_0x00a5:
            if (r3 != 0) goto L_0x00cf
            int r13 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56132m(r12, r4, r11)
            long r0 = r11.f39625b
            long r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacg.m56197m(r0)
            r0 = r2
            r1 = r31
            r15 = r20
            r20 = r7
            r7 = r2
            r2 = r8
            r23 = r33
            r0.putLong(r1, r2, r4)
            r6 = r6 | r10
            r9 = r7
            r0 = r13
            r2 = r15
            r7 = r20
            r1 = r23
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r15 = r30
            goto L_0x0248
        L_0x00cf:
            r23 = r33
            r15 = r20
            r20 = r7
            r7 = r2
            goto L_0x0148
        L_0x00d8:
            r23 = r33
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0148
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r12, r4, r11)
            int r1 = r11.f39624a
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzacg.m56196l(r1)
            r7.putInt(r14, r8, r1)
            goto L_0x0115
        L_0x00ef:
            r23 = r33
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0148
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r12, r4, r11)
            int r1 = r11.f39624a
            r7.putInt(r14, r8, r1)
            goto L_0x0115
        L_0x0102:
            r23 = r33
            r15 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0148
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56120a(r12, r4, r11)
            java.lang.Object r1 = r11.f39626c
            r7.putObject(r14, r8, r1)
        L_0x0115:
            r6 = r6 | r10
            r13 = r34
            r9 = r7
            r2 = r15
            r7 = r20
            r1 = r23
            goto L_0x036e
        L_0x0120:
            r23 = r33
            r15 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0148
            r13 = r30
            r19 = 1048575(0xfffff, float:1.469367E-39)
            java.lang.Object r8 = r13.m56576s(r14, r15)
            com.google.android.gms.internal.firebase-auth-api.zzaew r1 = r13.m56573p(r15)
            r0 = r8
            r2 = r32
            r3 = r4
            r4 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56134o(r0, r1, r2, r3, r4, r5)
            r13.m56540B(r14, r15, r8)
            goto L_0x023c
        L_0x0148:
            r13 = r30
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x024c
        L_0x014f:
            r13 = r30
            r23 = r33
            r15 = r20
            r0 = 2
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x024c
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r22 & r0
            if (r0 != 0) goto L_0x0169
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56126g(r12, r4, r11)
            goto L_0x016d
        L_0x0169:
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56127h(r12, r4, r11)
        L_0x016d:
            java.lang.Object r1 = r11.f39626c
            r7.putObject(r14, r8, r1)
            goto L_0x023c
        L_0x0174:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x024c
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56132m(r12, r4, r11)
            long r1 = r11.f39625b
            r3 = 0
            int r17 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r17 == 0) goto L_0x018f
            goto L_0x0190
        L_0x018f:
            r5 = 0
        L_0x0190:
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56851r(r14, r8, r5)
            goto L_0x023c
        L_0x0195:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x024c
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56121b(r12, r4)
            r7.putInt(r14, r8, r0)
            goto L_0x021e
        L_0x01ac:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r5) goto L_0x024c
            long r21 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56135p(r12, r4)
            r0 = r7
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x023c
        L_0x01cc:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x024c
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r12, r4, r11)
            int r1 = r11.f39624a
            r7.putInt(r14, r8, r1)
            goto L_0x023c
        L_0x01e4:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x024c
            int r17 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56132m(r12, r4, r11)
            long r4 = r11.f39625b
            r0 = r7
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r10
            r9 = r7
            r2 = r15
            r0 = r17
            goto L_0x023f
        L_0x0205:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x024c
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56121b(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56854u(r14, r8, r0)
        L_0x021e:
            int r0 = r4 + 4
            goto L_0x023c
        L_0x0221:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r5) goto L_0x024c
            long r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56135p(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56853t(r14, r8, r0)
            int r0 = r4 + 8
        L_0x023c:
            r6 = r6 | r10
            r9 = r7
            r2 = r15
        L_0x023f:
            r7 = r20
            r1 = r23
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r15 = r13
        L_0x0248:
            r13 = r34
            goto L_0x001d
        L_0x024c:
            r2 = r4
            r29 = r7
            r7 = r20
            goto L_0x004c
        L_0x0253:
            r23 = r33
            r22 = r1
            r20 = r7
            r10 = r15
            r7 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r15 = r2
            r0 = 27
            if (r13 != r0) goto L_0x02b2
            r0 = 2
            if (r3 != r0) goto L_0x02a7
            java.lang.Object r0 = r7.getObject(r14, r8)
            com.google.android.gms.internal.firebase-auth-api.zzadk r0 = (com.google.android.gms.internal.p204firebaseauthapi.zzadk) r0
            boolean r1 = r0.mo48862a()
            if (r1 != 0) goto L_0x0284
            int r1 = r0.size()
            if (r1 != 0) goto L_0x027c
            r1 = 10
            goto L_0x027d
        L_0x027c:
            int r1 = r1 + r1
        L_0x027d:
            com.google.android.gms.internal.firebase-auth-api.zzadk r0 = r0.mo48877G(r1)
            r7.putObject(r14, r8, r0)
        L_0x0284:
            r5 = r0
            com.google.android.gms.internal.firebase-auth-api.zzaew r0 = r10.m56573p(r15)
            r1 = r17
            r2 = r32
            r3 = r4
            r4 = r34
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56124e(r0, r1, r2, r3, r4, r5, r6)
            r13 = r34
            r9 = r7
            r6 = r8
            r2 = r15
            r7 = r20
            r1 = r23
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r15 = r10
            r10 = -1
            goto L_0x001d
        L_0x02a7:
            r14 = r4
            r25 = r6
            r29 = r7
            r26 = r20
            r18 = -1
            goto L_0x032e
        L_0x02b2:
            r0 = 49
            if (r13 > r0) goto L_0x0301
            r1 = r22
            long r1 = (long) r1
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r5 = r3
            r3 = r4
            r24 = r4
            r4 = r34
            r33 = r5
            r5 = r17
            r25 = r6
            r6 = r23
            r26 = r20
            r20 = r7
            r7 = r33
            r27 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r15
            r29 = r20
            r18 = -1
            r9 = r21
            r11 = r13
            r12 = r27
            r14 = r35
            int r0 = r0.m56564a0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r24
            if (r0 == r14) goto L_0x02ff
        L_0x02ee:
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r15
            r1 = r23
            r6 = r25
            r7 = r26
            goto L_0x036c
        L_0x02ff:
            r2 = r0
            goto L_0x032f
        L_0x0301:
            r33 = r3
            r14 = r4
            r25 = r6
            r29 = r7
            r27 = r8
            r26 = r20
            r1 = r22
            r18 = -1
            r0 = 50
            if (r13 != r0) goto L_0x0334
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x032e
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r14
            r4 = r34
            r5 = r15
            r6 = r27
            r8 = r35
            int r0 = r0.m56561X(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r14) goto L_0x02ff
            goto L_0x02ee
        L_0x032e:
            r2 = r14
        L_0x032f:
            r6 = r25
            r7 = r26
            goto L_0x0351
        L_0x0334:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r14
            r4 = r34
            r5 = r17
            r6 = r23
            r9 = r13
            r10 = r27
            r12 = r15
            r13 = r35
            int r0 = r0.m56562Y(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r14) goto L_0x02ff
            goto L_0x02ee
        L_0x0351:
            com.google.android.gms.internal.firebase-auth-api.zzafo r4 = m56553P(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56128i(r0, r1, r2, r3, r4, r5)
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r15
            r1 = r23
        L_0x036c:
            r9 = r29
        L_0x036e:
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r15 = r30
            goto L_0x001d
        L_0x0376:
            r25 = r6
            r29 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x0389
            long r1 = (long) r7
            r3 = r31
            r6 = r25
            r4 = r29
            r4.putInt(r3, r1, r6)
        L_0x0389:
            r1 = r34
            if (r0 != r1) goto L_0x038e
            return r0
        L_0x038e:
            com.google.android.gms.internal.firebase-auth-api.zzadn r0 = com.google.android.gms.internal.p204firebaseauthapi.zzadn.m56471g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p204firebaseauthapi.zzaen.m56563Z(java.lang.Object, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.zzabp):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:282:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:?, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x017a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0447 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0447 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c8  */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m56564a0(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.p204firebaseauthapi.zzabp r29) throws java.io.IOException {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = f39782r
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.firebase-auth-api.zzadk r12 = (com.google.android.gms.internal.p204firebaseauthapi.zzadk) r12
            boolean r13 = r12.mo48862a()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.android.gms.internal.firebase-auth-api.zzadk r12 = r12.mo48877G(r13)
            r11.putObject(r1, r9, r12)
        L_0x0032:
            r9 = 5
            r10 = 0
            r13 = 1
            r14 = 2
            switch(r26) {
                case 18: goto L_0x03d9;
                case 19: goto L_0x038c;
                case 20: goto L_0x0349;
                case 21: goto L_0x0349;
                case 22: goto L_0x032e;
                case 23: goto L_0x02ed;
                case 24: goto L_0x02ac;
                case 25: goto L_0x0253;
                case 26: goto L_0x01a0;
                case 27: goto L_0x0185;
                case 28: goto L_0x012b;
                case 29: goto L_0x032e;
                case 30: goto L_0x00fa;
                case 31: goto L_0x02ac;
                case 32: goto L_0x02ed;
                case 33: goto L_0x00ab;
                case 34: goto L_0x005c;
                case 35: goto L_0x03d9;
                case 36: goto L_0x038c;
                case 37: goto L_0x0349;
                case 38: goto L_0x0349;
                case 39: goto L_0x032e;
                case 40: goto L_0x02ed;
                case 41: goto L_0x02ac;
                case 42: goto L_0x0253;
                case 43: goto L_0x032e;
                case 44: goto L_0x00fa;
                case 45: goto L_0x02ac;
                case 46: goto L_0x02ed;
                case 47: goto L_0x00ab;
                case 48: goto L_0x005c;
                default: goto L_0x003a;
            }
        L_0x003a:
            r1 = 3
            if (r6 != r1) goto L_0x0447
            com.google.android.gms.internal.firebase-auth-api.zzaew r1 = r15.m56573p(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56122c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f39626c
            r12.add(r8)
            goto L_0x0425
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.google.android.gms.internal.firebase-auth-api.zzadz r12 = (com.google.android.gms.internal.p204firebaseauthapi.zzadz) r12
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r4, r7)
            int r2 = r7.f39624a
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56132m(r3, r1, r7)
            long r4 = r7.f39625b
            long r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacg.m56197m(r4)
            r12.mo49119f(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x0448
        L_0x007b:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p204firebaseauthapi.zzadn.m56472i()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x0447
            com.google.android.gms.internal.firebase-auth-api.zzadz r12 = (com.google.android.gms.internal.p204firebaseauthapi.zzadz) r12
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56132m(r3, r4, r7)
            long r8 = r7.f39625b
            long r8 = com.google.android.gms.internal.p204firebaseauthapi.zzacg.m56197m(r8)
            r12.mo49119f(r8)
        L_0x0091:
            if (r1 >= r5) goto L_0x00aa
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r1, r7)
            int r6 = r7.f39624a
            if (r2 == r6) goto L_0x009c
            goto L_0x00aa
        L_0x009c:
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56132m(r3, r4, r7)
            long r8 = r7.f39625b
            long r8 = com.google.android.gms.internal.p204firebaseauthapi.zzacg.m56197m(r8)
            r12.mo49119f(r8)
            goto L_0x0091
        L_0x00aa:
            return r1
        L_0x00ab:
            if (r6 != r14) goto L_0x00cf
            com.google.android.gms.internal.firebase-auth-api.zzadg r12 = (com.google.android.gms.internal.p204firebaseauthapi.zzadg) r12
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r4, r7)
            int r2 = r7.f39624a
            int r2 = r2 + r1
        L_0x00b6:
            if (r1 >= r2) goto L_0x00c6
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r1, r7)
            int r4 = r7.f39624a
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacg.m56196l(r4)
            r12.mo49093f(r4)
            goto L_0x00b6
        L_0x00c6:
            if (r1 != r2) goto L_0x00ca
            goto L_0x0448
        L_0x00ca:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p204firebaseauthapi.zzadn.m56472i()
            throw r1
        L_0x00cf:
            if (r6 != 0) goto L_0x0447
            com.google.android.gms.internal.firebase-auth-api.zzadg r12 = (com.google.android.gms.internal.p204firebaseauthapi.zzadg) r12
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r4, r7)
            int r4 = r7.f39624a
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacg.m56196l(r4)
            r12.mo49093f(r4)
        L_0x00e0:
            if (r1 >= r5) goto L_0x00f9
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r1, r7)
            int r6 = r7.f39624a
            if (r2 == r6) goto L_0x00eb
            goto L_0x00f9
        L_0x00eb:
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r4, r7)
            int r4 = r7.f39624a
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacg.m56196l(r4)
            r12.mo49093f(r4)
            goto L_0x00e0
        L_0x00f9:
            return r1
        L_0x00fa:
            if (r6 != r14) goto L_0x0101
            int r2 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56125f(r3, r4, r12, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x0447
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56131l(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            com.google.android.gms.internal.firebase-auth-api.zzadj r3 = r15.m56572o(r8)
            r4 = 0
            com.google.android.gms.internal.firebase-auth-api.zzafn r5 = r0.f39795m
            r22 = r16
            r23 = r21
            r24 = r12
            r25 = r3
            r26 = r4
            r27 = r5
            com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56695c(r22, r23, r24, r25, r26, r27)
        L_0x0128:
            r1 = r2
            goto L_0x0448
        L_0x012b:
            if (r6 != r14) goto L_0x0447
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r4, r7)
            int r4 = r7.f39624a
            if (r4 < 0) goto L_0x0180
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x017b
            if (r4 != 0) goto L_0x0141
            com.google.android.gms.internal.firebase-auth-api.zzacc r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacc.f39635a
            r12.add(r4)
            goto L_0x0149
        L_0x0141:
            com.google.android.gms.internal.firebase-auth-api.zzacc r6 = com.google.android.gms.internal.p204firebaseauthapi.zzacc.m56160u(r3, r1, r4)
            r12.add(r6)
        L_0x0148:
            int r1 = r1 + r4
        L_0x0149:
            if (r1 >= r5) goto L_0x017a
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r1, r7)
            int r6 = r7.f39624a
            if (r2 == r6) goto L_0x0154
            goto L_0x017a
        L_0x0154:
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r4, r7)
            int r4 = r7.f39624a
            if (r4 < 0) goto L_0x0175
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0170
            if (r4 != 0) goto L_0x0168
            com.google.android.gms.internal.firebase-auth-api.zzacc r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacc.f39635a
            r12.add(r4)
            goto L_0x0149
        L_0x0168:
            com.google.android.gms.internal.firebase-auth-api.zzacc r6 = com.google.android.gms.internal.p204firebaseauthapi.zzacc.m56160u(r3, r1, r4)
            r12.add(r6)
            goto L_0x0148
        L_0x0170:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p204firebaseauthapi.zzadn.m56472i()
            throw r1
        L_0x0175:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p204firebaseauthapi.zzadn.m56470f()
            throw r1
        L_0x017a:
            return r1
        L_0x017b:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p204firebaseauthapi.zzadn.m56472i()
            throw r1
        L_0x0180:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p204firebaseauthapi.zzadn.m56470f()
            throw r1
        L_0x0185:
            if (r6 == r14) goto L_0x0189
            goto L_0x0447
        L_0x0189:
            com.google.android.gms.internal.firebase-auth-api.zzaew r1 = r15.m56573p(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56124e(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x01a0:
            if (r6 != r14) goto L_0x0447
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x01f3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r4, r7)
            int r6 = r7.f39624a
            if (r6 < 0) goto L_0x01ee
            if (r6 != 0) goto L_0x01bb
            r12.add(r1)
            goto L_0x01c6
        L_0x01bb:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.p204firebaseauthapi.zzadl.f39746b
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
        L_0x01c5:
            int r4 = r4 + r6
        L_0x01c6:
            if (r4 >= r5) goto L_0x0447
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r4, r7)
            int r8 = r7.f39624a
            if (r2 != r8) goto L_0x0447
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r6, r7)
            int r6 = r7.f39624a
            if (r6 < 0) goto L_0x01e9
            if (r6 != 0) goto L_0x01de
            r12.add(r1)
            goto L_0x01c6
        L_0x01de:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.p204firebaseauthapi.zzadl.f39746b
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
            goto L_0x01c5
        L_0x01e9:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p204firebaseauthapi.zzadn.m56470f()
            throw r1
        L_0x01ee:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p204firebaseauthapi.zzadn.m56470f()
            throw r1
        L_0x01f3:
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r4, r7)
            int r6 = r7.f39624a
            if (r6 < 0) goto L_0x024e
            if (r6 != 0) goto L_0x0201
            r12.add(r1)
            goto L_0x0214
        L_0x0201:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.p204firebaseauthapi.zzagc.m56877f(r3, r4, r8)
            if (r9 == 0) goto L_0x0249
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.p204firebaseauthapi.zzadl.f39746b
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
        L_0x0213:
            r4 = r8
        L_0x0214:
            if (r4 >= r5) goto L_0x0447
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r4, r7)
            int r8 = r7.f39624a
            if (r2 != r8) goto L_0x0447
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r6, r7)
            int r6 = r7.f39624a
            if (r6 < 0) goto L_0x0244
            if (r6 != 0) goto L_0x022c
            r12.add(r1)
            goto L_0x0214
        L_0x022c:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.p204firebaseauthapi.zzagc.m56877f(r3, r4, r8)
            if (r9 == 0) goto L_0x023f
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.p204firebaseauthapi.zzadl.f39746b
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
            goto L_0x0213
        L_0x023f:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p204firebaseauthapi.zzadn.m56468d()
            throw r1
        L_0x0244:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p204firebaseauthapi.zzadn.m56470f()
            throw r1
        L_0x0249:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p204firebaseauthapi.zzadn.m56468d()
            throw r1
        L_0x024e:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p204firebaseauthapi.zzadn.m56470f()
            throw r1
        L_0x0253:
            r1 = 0
            if (r6 != r14) goto L_0x027b
            com.google.android.gms.internal.firebase-auth-api.zzabr r12 = (com.google.android.gms.internal.p204firebaseauthapi.zzabr) r12
            int r2 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r4, r7)
            int r4 = r7.f39624a
            int r4 = r4 + r2
        L_0x025f:
            if (r2 >= r4) goto L_0x0272
            int r2 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56132m(r3, r2, r7)
            long r5 = r7.f39625b
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x026d
            r5 = 1
            goto L_0x026e
        L_0x026d:
            r5 = 0
        L_0x026e:
            r12.mo48879d(r5)
            goto L_0x025f
        L_0x0272:
            if (r2 != r4) goto L_0x0276
            goto L_0x0128
        L_0x0276:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p204firebaseauthapi.zzadn.m56472i()
            throw r1
        L_0x027b:
            if (r6 != 0) goto L_0x0447
            com.google.android.gms.internal.firebase-auth-api.zzabr r12 = (com.google.android.gms.internal.p204firebaseauthapi.zzabr) r12
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56132m(r3, r4, r7)
            long r8 = r7.f39625b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x028b
            r6 = 1
            goto L_0x028c
        L_0x028b:
            r6 = 0
        L_0x028c:
            r12.mo48879d(r6)
        L_0x028f:
            if (r4 >= r5) goto L_0x02ab
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r4, r7)
            int r8 = r7.f39624a
            if (r2 == r8) goto L_0x029a
            goto L_0x02ab
        L_0x029a:
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56132m(r3, r6, r7)
            long r8 = r7.f39625b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02a6
            r6 = 1
            goto L_0x02a7
        L_0x02a6:
            r6 = 0
        L_0x02a7:
            r12.mo48879d(r6)
            goto L_0x028f
        L_0x02ab:
            return r4
        L_0x02ac:
            if (r6 != r14) goto L_0x02cc
            com.google.android.gms.internal.firebase-auth-api.zzadg r12 = (com.google.android.gms.internal.p204firebaseauthapi.zzadg) r12
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r4, r7)
            int r2 = r7.f39624a
            int r2 = r2 + r1
        L_0x02b7:
            if (r1 >= r2) goto L_0x02c3
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56121b(r3, r1)
            r12.mo49093f(r4)
            int r1 = r1 + 4
            goto L_0x02b7
        L_0x02c3:
            if (r1 != r2) goto L_0x02c7
            goto L_0x0448
        L_0x02c7:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p204firebaseauthapi.zzadn.m56472i()
            throw r1
        L_0x02cc:
            if (r6 != r9) goto L_0x0447
            com.google.android.gms.internal.firebase-auth-api.zzadg r12 = (com.google.android.gms.internal.p204firebaseauthapi.zzadg) r12
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56121b(r17, r18)
            r12.mo49093f(r1)
        L_0x02d7:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02ec
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r1, r7)
            int r6 = r7.f39624a
            if (r2 == r6) goto L_0x02e4
            goto L_0x02ec
        L_0x02e4:
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56121b(r3, r4)
            r12.mo49093f(r1)
            goto L_0x02d7
        L_0x02ec:
            return r1
        L_0x02ed:
            if (r6 != r14) goto L_0x030d
            com.google.android.gms.internal.firebase-auth-api.zzadz r12 = (com.google.android.gms.internal.p204firebaseauthapi.zzadz) r12
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r4, r7)
            int r2 = r7.f39624a
            int r2 = r2 + r1
        L_0x02f8:
            if (r1 >= r2) goto L_0x0304
            long r4 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56135p(r3, r1)
            r12.mo49119f(r4)
            int r1 = r1 + 8
            goto L_0x02f8
        L_0x0304:
            if (r1 != r2) goto L_0x0308
            goto L_0x0448
        L_0x0308:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p204firebaseauthapi.zzadn.m56472i()
            throw r1
        L_0x030d:
            if (r6 != r13) goto L_0x0447
            com.google.android.gms.internal.firebase-auth-api.zzadz r12 = (com.google.android.gms.internal.p204firebaseauthapi.zzadz) r12
            long r8 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56135p(r17, r18)
            r12.mo49119f(r8)
        L_0x0318:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x032d
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r1, r7)
            int r6 = r7.f39624a
            if (r2 == r6) goto L_0x0325
            goto L_0x032d
        L_0x0325:
            long r8 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56135p(r3, r4)
            r12.mo49119f(r8)
            goto L_0x0318
        L_0x032d:
            return r1
        L_0x032e:
            if (r6 != r14) goto L_0x0336
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56125f(r3, r4, r12, r7)
            goto L_0x0448
        L_0x0336:
            if (r6 == 0) goto L_0x033a
            goto L_0x0447
        L_0x033a:
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56131l(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0349:
            if (r6 != r14) goto L_0x0369
            com.google.android.gms.internal.firebase-auth-api.zzadz r12 = (com.google.android.gms.internal.p204firebaseauthapi.zzadz) r12
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r4, r7)
            int r2 = r7.f39624a
            int r2 = r2 + r1
        L_0x0354:
            if (r1 >= r2) goto L_0x0360
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56132m(r3, r1, r7)
            long r4 = r7.f39625b
            r12.mo49119f(r4)
            goto L_0x0354
        L_0x0360:
            if (r1 != r2) goto L_0x0364
            goto L_0x0448
        L_0x0364:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p204firebaseauthapi.zzadn.m56472i()
            throw r1
        L_0x0369:
            if (r6 != 0) goto L_0x0447
            com.google.android.gms.internal.firebase-auth-api.zzadz r12 = (com.google.android.gms.internal.p204firebaseauthapi.zzadz) r12
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56132m(r3, r4, r7)
            long r8 = r7.f39625b
            r12.mo49119f(r8)
        L_0x0376:
            if (r1 >= r5) goto L_0x038b
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r1, r7)
            int r6 = r7.f39624a
            if (r2 == r6) goto L_0x0381
            goto L_0x038b
        L_0x0381:
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56132m(r3, r4, r7)
            long r8 = r7.f39625b
            r12.mo49119f(r8)
            goto L_0x0376
        L_0x038b:
            return r1
        L_0x038c:
            if (r6 != r14) goto L_0x03b0
            com.google.android.gms.internal.firebase-auth-api.zzacz r12 = (com.google.android.gms.internal.p204firebaseauthapi.zzacz) r12
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r4, r7)
            int r2 = r7.f39624a
            int r2 = r2 + r1
        L_0x0397:
            if (r1 >= r2) goto L_0x03a7
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56121b(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.mo49059d(r4)
            int r1 = r1 + 4
            goto L_0x0397
        L_0x03a7:
            if (r1 != r2) goto L_0x03ab
            goto L_0x0448
        L_0x03ab:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p204firebaseauthapi.zzadn.m56472i()
            throw r1
        L_0x03b0:
            if (r6 != r9) goto L_0x0447
            com.google.android.gms.internal.firebase-auth-api.zzacz r12 = (com.google.android.gms.internal.p204firebaseauthapi.zzacz) r12
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56121b(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo49059d(r1)
        L_0x03bf:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03d8
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r1, r7)
            int r6 = r7.f39624a
            if (r2 == r6) goto L_0x03cc
            goto L_0x03d8
        L_0x03cc:
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56121b(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo49059d(r1)
            goto L_0x03bf
        L_0x03d8:
            return r1
        L_0x03d9:
            if (r6 != r14) goto L_0x03fc
            com.google.android.gms.internal.firebase-auth-api.zzacp r12 = (com.google.android.gms.internal.p204firebaseauthapi.zzacp) r12
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r4, r7)
            int r2 = r7.f39624a
            int r2 = r2 + r1
        L_0x03e4:
            if (r1 >= r2) goto L_0x03f4
            long r4 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56135p(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.mo49033d(r4)
            int r1 = r1 + 8
            goto L_0x03e4
        L_0x03f4:
            if (r1 != r2) goto L_0x03f7
            goto L_0x0448
        L_0x03f7:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p204firebaseauthapi.zzadn.m56472i()
            throw r1
        L_0x03fc:
            if (r6 != r13) goto L_0x0447
            com.google.android.gms.internal.firebase-auth-api.zzacp r12 = (com.google.android.gms.internal.p204firebaseauthapi.zzacp) r12
            long r8 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56135p(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo49033d(r8)
        L_0x040b:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0424
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r1, r7)
            int r6 = r7.f39624a
            if (r2 == r6) goto L_0x0418
            goto L_0x0424
        L_0x0418:
            long r8 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56135p(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo49033d(r8)
            goto L_0x040b
        L_0x0424:
            return r1
        L_0x0425:
            if (r4 >= r5) goto L_0x0446
            int r8 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r3, r4, r7)
            int r9 = r7.f39624a
            if (r2 == r9) goto L_0x0430
            goto L_0x0446
        L_0x0430:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56122c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f39626c
            r12.add(r8)
            goto L_0x0425
        L_0x0446:
            return r4
        L_0x0447:
            r1 = r4
        L_0x0448:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p204firebaseauthapi.zzaen.m56564a0(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.firebase-auth-api.zzabp):int");
    }

    /* renamed from: b0 */
    private final int m56565b0(int i) {
        if (i < this.f39785c || i > this.f39786d) {
            return -1;
        }
        return m56568k(i, 0);
    }

    /* renamed from: c0 */
    private final int m56566c0(int i, int i2) {
        if (i < this.f39785c || i > this.f39786d) {
            return -1;
        }
        return m56568k(i, i2);
    }

    /* renamed from: d0 */
    private final int m56567d0(int i) {
        return this.f39783a[i + 2];
    }

    /* renamed from: k */
    private final int m56568k(int i, int i2) {
        int length = (this.f39783a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f39783a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: l */
    private static int m56569l(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: m */
    private final int m56570m(int i) {
        return this.f39783a[i + 1];
    }

    /* renamed from: n */
    private static long m56571n(Object obj, long j) {
        return ((Long) zzafx.m56844k(obj, j)).longValue();
    }

    /* renamed from: o */
    private final zzadj m56572o(int i) {
        int i2 = i / 3;
        return (zzadj) this.f39784b[i2 + i2 + 1];
    }

    /* renamed from: p */
    private final zzaew m56573p(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzaew zzaew = (zzaew) this.f39784b[i3];
        if (zzaew != null) {
            return zzaew;
        }
        zzaew b = zzaes.m56608a().mo49150b((Class) this.f39784b[i3 + 1]);
        this.f39784b[i3] = b;
        return b;
    }

    /* renamed from: q */
    private final Object m56574q(Object obj, int i, Object obj2, zzafn zzafn, Object obj3) {
        int i2 = this.f39783a[i];
        Object k = zzafx.m56844k(obj, (long) (m56570m(i) & 1048575));
        if (k == null || m56572o(i) == null) {
            return obj2;
        }
        zzaee zzaee = (zzaee) k;
        zzaed zzaed = (zzaed) m56575r(i);
        throw null;
    }

    /* renamed from: r */
    private final Object m56575r(int i) {
        int i2 = i / 3;
        return this.f39784b[i2 + i2];
    }

    /* renamed from: s */
    private final Object m56576s(Object obj, int i) {
        zzaew p = m56573p(i);
        long m = (long) (m56570m(i) & 1048575);
        if (!m56544F(obj, i)) {
            return p.mo49141b();
        }
        Object object = f39782r.getObject(obj, m);
        if (m56547I(object)) {
            return object;
        }
        Object b = p.mo49141b();
        if (object != null) {
            p.mo49145f(b, object);
        }
        return b;
    }

    /* renamed from: t */
    private final Object m56577t(Object obj, int i, int i2) {
        zzaew p = m56573p(i2);
        if (!m56548J(obj, i, i2)) {
            return p.mo49141b();
        }
        Object object = f39782r.getObject(obj, (long) (m56570m(i2) & 1048575));
        if (m56547I(object)) {
            return object;
        }
        Object b = p.mo49141b();
        if (object != null) {
            p.mo49145f(b, object);
        }
        return b;
    }

    /* renamed from: u */
    private static Field m56578u(Class cls, String str) {
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

    /* renamed from: v */
    private static void m56579v(Object obj) {
        if (!m56547I(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* renamed from: w */
    private final void m56580w(Object obj, Object obj2, int i) {
        if (m56544F(obj2, i)) {
            long m = (long) (m56570m(i) & 1048575);
            Unsafe unsafe = f39782r;
            Object object = unsafe.getObject(obj2, m);
            if (object != null) {
                zzaew p = m56573p(i);
                if (!m56544F(obj, i)) {
                    if (!m56547I(object)) {
                        unsafe.putObject(obj, m, object);
                    } else {
                        Object b = p.mo49141b();
                        p.mo49145f(b, object);
                        unsafe.putObject(obj, m, b);
                    }
                    m56583z(obj, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, m);
                if (!m56547I(object2)) {
                    Object b2 = p.mo49141b();
                    p.mo49145f(b2, object2);
                    unsafe.putObject(obj, m, b2);
                    object2 = b2;
                }
                p.mo49145f(object2, object);
                return;
            }
            int i2 = this.f39783a[i];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i2 + " is present but null: " + obj3);
        }
    }

    /* renamed from: x */
    private final void m56581x(Object obj, Object obj2, int i) {
        int i2 = this.f39783a[i];
        if (m56548J(obj2, i2, i)) {
            long m = (long) (m56570m(i) & 1048575);
            Unsafe unsafe = f39782r;
            Object object = unsafe.getObject(obj2, m);
            if (object != null) {
                zzaew p = m56573p(i);
                if (!m56548J(obj, i2, i)) {
                    if (!m56547I(object)) {
                        unsafe.putObject(obj, m, object);
                    } else {
                        Object b = p.mo49141b();
                        p.mo49145f(b, object);
                        unsafe.putObject(obj, m, b);
                    }
                    m56539A(obj, i2, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, m);
                if (!m56547I(object2)) {
                    Object b2 = p.mo49141b();
                    p.mo49145f(b2, object2);
                    unsafe.putObject(obj, m, b2);
                    object2 = b2;
                }
                p.mo49145f(object2, object);
                return;
            }
            int i3 = this.f39783a[i];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i3 + " is present but null: " + obj3);
        }
    }

    /* renamed from: y */
    private final void m56582y(Object obj, int i, zzaev zzaev) throws IOException {
        if (m56543E(i)) {
            zzafx.m56857x(obj, (long) (i & 1048575), zzaev.mo48954p());
        } else if (this.f39789g) {
            zzafx.m56857x(obj, (long) (i & 1048575), zzaev.mo48955q());
        } else {
            zzafx.m56857x(obj, (long) (i & 1048575), zzaev.mo48951m());
        }
    }

    /* renamed from: z */
    private final void m56583z(Object obj, int i) {
        int d0 = m56567d0(i);
        long j = (long) (1048575 & d0);
        if (j != 1048575) {
            zzafx.m56855v(obj, j, (1 << (d0 >>> 20)) | zzafx.m56841h(obj, j));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x033c, code lost:
        if (r0 != r15) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0358, code lost:
        r7 = r33;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0381, code lost:
        if (r0 != r15) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03a4, code lost:
        if (r0 != r15) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x018f, code lost:
        r5 = r25 | r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0191, code lost:
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0194, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01f7, code lost:
        r5 = r25 | r23;
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01fa, code lost:
        r2 = r11;
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01fe, code lost:
        r8 = r6;
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0295, code lost:
        r0 = r6 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0297, code lost:
        r5 = r25 | r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0299, code lost:
        r2 = r11;
        r3 = r13;
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x029f, code lost:
        r8 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02a1, code lost:
        r7 = r33;
        r2 = r6;
        r27 = r10;
        r31 = r11;
        r19 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo49139O(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.p204firebaseauthapi.zzabp r34) throws java.io.IOException {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            m56579v(r29)
            sun.misc.Unsafe r10 = f39782r
            r16 = 0
            r0 = r31
            r1 = 0
            r2 = -1
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001c:
            if (r0 >= r13) goto L_0x0415
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002d
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56130k(r0, r12, r1, r9)
            int r1 = r9.f39624a
            r4 = r1
            r1 = r0
            goto L_0x002e
        L_0x002d:
            r4 = r0
        L_0x002e:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r2) goto L_0x003b
            int r3 = r3 / r8
            int r2 = r15.m56566c0(r0, r3)
            goto L_0x003f
        L_0x003b:
            int r2 = r15.m56565b0(r0)
        L_0x003f:
            r3 = -1
            if (r2 != r3) goto L_0x0051
            r31 = r0
            r2 = r1
            r8 = r4
            r25 = r5
            r27 = r10
            r7 = r11
            r18 = -1
            r19 = 0
            goto L_0x03a7
        L_0x0051:
            int[] r3 = r15.f39783a
            int r19 = r2 + 1
            r8 = r3[r19]
            int r11 = m56569l(r8)
            r19 = r0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r8 & r17
            r20 = r1
            long r0 = (long) r0
            r21 = r0
            r0 = 17
            if (r11 > r0) goto L_0x02ac
            int r0 = r2 + 2
            r0 = r3[r0]
            int r3 = r0 >>> 20
            r1 = 1
            int r23 = r1 << r3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r3
            if (r0 == r6) goto L_0x008c
            r17 = r4
            if (r6 == r3) goto L_0x0082
            long r3 = (long) r6
            r10.putInt(r14, r3, r5)
        L_0x0082:
            long r3 = (long) r0
            int r5 = r10.getInt(r14, r3)
            r26 = r0
            r25 = r5
            goto L_0x0092
        L_0x008c:
            r17 = r4
            r25 = r5
            r26 = r6
        L_0x0092:
            r0 = 5
            switch(r11) {
                case 0: goto L_0x027c;
                case 1: goto L_0x0260;
                case 2: goto L_0x0240;
                case 3: goto L_0x0240;
                case 4: goto L_0x0228;
                case 5: goto L_0x0202;
                case 6: goto L_0x01de;
                case 7: goto L_0x01bc;
                case 8: goto L_0x0197;
                case 9: goto L_0x0167;
                case 10: goto L_0x014c;
                case 11: goto L_0x0228;
                case 12: goto L_0x0115;
                case 13: goto L_0x01de;
                case 14: goto L_0x0202;
                case 15: goto L_0x00f6;
                case 16: goto L_0x00c2;
                default: goto L_0x0096;
            }
        L_0x0096:
            r13 = r2
            r11 = r19
            r6 = r20
            r0 = 3
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x029f
            java.lang.Object r7 = r15.m56576s(r14, r13)
            com.google.android.gms.internal.firebase-auth-api.zzaew r1 = r15.m56573p(r13)
            int r0 = r11 << 3
            r5 = r0 | 4
            r0 = r7
            r2 = r30
            r3 = r6
            r4 = r32
            r8 = r17
            r6 = r34
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56133n(r0, r1, r2, r3, r4, r5, r6)
            r15.m56540B(r14, r13, r7)
            goto L_0x018f
        L_0x00c2:
            if (r7 != 0) goto L_0x00e8
            r1 = r20
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56132m(r12, r1, r9)
            long r0 = r9.f39625b
            long r4 = com.google.android.gms.internal.p204firebaseauthapi.zzacg.m56197m(r0)
            r11 = r19
            r7 = r21
            r0 = r10
            r1 = r29
            r13 = r2
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r7
            r8 = r17
            r0.putLong(r1, r2, r4)
            r5 = r25 | r23
            r0 = r6
            goto L_0x0191
        L_0x00e8:
            r13 = r2
            r11 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r17
            r6 = r20
            goto L_0x02a1
        L_0x00f6:
            r13 = r2
            r8 = r17
            r11 = r19
            r1 = r20
            r3 = r21
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x0194
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r12, r1, r9)
            int r1 = r9.f39624a
            int r1 = com.google.android.gms.internal.p204firebaseauthapi.zzacg.m56196l(r1)
            r10.putInt(r14, r3, r1)
            goto L_0x018f
        L_0x0115:
            r13 = r2
            r8 = r17
            r11 = r19
            r1 = r20
            r3 = r21
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x0194
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r12, r1, r9)
            int r1 = r9.f39624a
            com.google.android.gms.internal.firebase-auth-api.zzadj r2 = r15.m56572o(r13)
            if (r2 == 0) goto L_0x0148
            boolean r2 = r2.zza()
            if (r2 == 0) goto L_0x0138
            goto L_0x0148
        L_0x0138:
            com.google.android.gms.internal.firebase-auth-api.zzafo r2 = m56553P(r29)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo49219j(r8, r1)
            r1 = r8
            r2 = r11
            goto L_0x02f7
        L_0x0148:
            r10.putInt(r14, r3, r1)
            goto L_0x018f
        L_0x014c:
            r13 = r2
            r8 = r17
            r11 = r19
            r1 = r20
            r3 = r21
            r0 = 2
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x0194
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56120a(r12, r1, r9)
            java.lang.Object r1 = r9.f39626c
            r10.putObject(r14, r3, r1)
            goto L_0x018f
        L_0x0167:
            r13 = r2
            r8 = r17
            r11 = r19
            r1 = r20
            r0 = 2
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x0194
            java.lang.Object r6 = r15.m56576s(r14, r13)
            com.google.android.gms.internal.firebase-auth-api.zzaew r2 = r15.m56573p(r13)
            r0 = r6
            r5 = r1
            r1 = r2
            r2 = r30
            r3 = r5
            r4 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56134o(r0, r1, r2, r3, r4, r5)
            r15.m56540B(r14, r13, r6)
        L_0x018f:
            r5 = r25 | r23
        L_0x0191:
            r1 = r8
            goto L_0x01fa
        L_0x0194:
            r6 = r1
            goto L_0x02a1
        L_0x0197:
            r13 = r2
            r6 = r17
            r11 = r19
            r5 = r20
            r3 = r21
            r0 = 2
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x01fe
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r8
            if (r0 != 0) goto L_0x01b2
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56126g(r12, r5, r9)
            goto L_0x01b6
        L_0x01b2:
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56127h(r12, r5, r9)
        L_0x01b6:
            java.lang.Object r1 = r9.f39626c
            r10.putObject(r14, r3, r1)
            goto L_0x01f7
        L_0x01bc:
            r13 = r2
            r6 = r17
            r11 = r19
            r5 = r20
            r3 = r21
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x01fe
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56132m(r12, r5, r9)
            long r7 = r9.f39625b
            r20 = 0
            int r2 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x01d9
            goto L_0x01da
        L_0x01d9:
            r1 = 0
        L_0x01da:
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56851r(r14, r3, r1)
            goto L_0x01f7
        L_0x01de:
            r13 = r2
            r6 = r17
            r11 = r19
            r5 = r20
            r3 = r21
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x01fe
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56121b(r12, r5)
            r10.putInt(r14, r3, r0)
            int r0 = r5 + 4
        L_0x01f7:
            r5 = r25 | r23
            r1 = r6
        L_0x01fa:
            r2 = r11
            r3 = r13
            goto L_0x02fa
        L_0x01fe:
            r8 = r6
            r6 = r5
            goto L_0x02a1
        L_0x0202:
            r13 = r2
            r6 = r17
            r11 = r19
            r5 = r20
            r3 = r21
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r1) goto L_0x0223
            long r7 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56135p(r12, r5)
            r0 = r10
            r1 = r29
            r2 = r3
            r17 = r6
            r6 = r5
            r4 = r7
            r0.putLong(r1, r2, r4)
            goto L_0x0295
        L_0x0223:
            r17 = r6
            r6 = r5
            goto L_0x029f
        L_0x0228:
            r13 = r2
            r11 = r19
            r6 = r20
            r3 = r21
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x029f
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56129j(r12, r6, r9)
            int r1 = r9.f39624a
            r10.putInt(r14, r3, r1)
            goto L_0x0297
        L_0x0240:
            r13 = r2
            r11 = r19
            r6 = r20
            r3 = r21
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x029f
            int r6 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56132m(r12, r6, r9)
            long r7 = r9.f39625b
            r0 = r10
            r1 = r29
            r2 = r3
            r4 = r7
            r0.putLong(r1, r2, r4)
            r5 = r25 | r23
            r0 = r6
            goto L_0x0299
        L_0x0260:
            r13 = r2
            r11 = r19
            r6 = r20
            r3 = r21
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x029f
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56121b(r12, r6)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56854u(r14, r3, r0)
            int r0 = r6 + 4
            goto L_0x0297
        L_0x027c:
            r13 = r2
            r11 = r19
            r6 = r20
            r3 = r21
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r1) goto L_0x029f
            long r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56135p(r12, r6)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56853t(r14, r3, r0)
        L_0x0295:
            int r0 = r6 + 8
        L_0x0297:
            r5 = r25 | r23
        L_0x0299:
            r2 = r11
            r3 = r13
            r1 = r17
            goto L_0x02fa
        L_0x029f:
            r8 = r17
        L_0x02a1:
            r7 = r33
            r2 = r6
            r27 = r10
            r31 = r11
            r19 = r13
            goto L_0x0389
        L_0x02ac:
            r13 = r2
            r2 = r4
            r26 = r6
            r1 = r19
            r6 = r20
            r3 = r21
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r0 = 27
            if (r11 != r0) goto L_0x030f
            r0 = 2
            if (r7 != r0) goto L_0x0302
            java.lang.Object r0 = r10.getObject(r14, r3)
            com.google.android.gms.internal.firebase-auth-api.zzadk r0 = (com.google.android.gms.internal.p204firebaseauthapi.zzadk) r0
            boolean r7 = r0.mo48862a()
            if (r7 != 0) goto L_0x02df
            int r7 = r0.size()
            if (r7 != 0) goto L_0x02d7
            r7 = 10
            goto L_0x02d8
        L_0x02d7:
            int r7 = r7 + r7
        L_0x02d8:
            com.google.android.gms.internal.firebase-auth-api.zzadk r0 = r0.mo48877G(r7)
            r10.putObject(r14, r3, r0)
        L_0x02df:
            r7 = r0
            com.google.android.gms.internal.firebase-auth-api.zzaew r0 = r15.m56573p(r13)
            r8 = r1
            r1 = r2
            r11 = r2
            r2 = r30
            r3 = r6
            r4 = r32
            r25 = r5
            r5 = r7
            r6 = r34
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56124e(r0, r1, r2, r3, r4, r5, r6)
            r2 = r8
            r1 = r11
        L_0x02f7:
            r3 = r13
            r5 = r25
        L_0x02fa:
            r6 = r26
            r13 = r32
            r11 = r33
            goto L_0x001c
        L_0x0302:
            r25 = r5
            r31 = r1
            r17 = r2
            r15 = r6
            r27 = r10
            r19 = r13
            goto L_0x0384
        L_0x030f:
            r25 = r5
            r5 = r1
            r0 = 49
            if (r11 > r0) goto L_0x035c
            long r0 = (long) r8
            r20 = r0
            r0 = r28
            r1 = r29
            r8 = r2
            r2 = r30
            r23 = r3
            r3 = r6
            r4 = r32
            r31 = r5
            r5 = r8
            r15 = r6
            r6 = r31
            r17 = r8
            r8 = r13
            r27 = r10
            r9 = r20
            r19 = r13
            r12 = r23
            r14 = r34
            int r0 = r0.m56564a0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0358
        L_0x033e:
            r15 = r28
            r14 = r29
            r12 = r30
            r2 = r31
            r13 = r32
            r11 = r33
            r9 = r34
            r1 = r17
            r3 = r19
            r5 = r25
            r6 = r26
            r10 = r27
            goto L_0x001c
        L_0x0358:
            r7 = r33
            r2 = r0
            goto L_0x0387
        L_0x035c:
            r17 = r2
            r23 = r3
            r31 = r5
            r15 = r6
            r27 = r10
            r19 = r13
            r0 = 50
            if (r11 != r0) goto L_0x038c
            r0 = 2
            if (r7 != r0) goto L_0x0384
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r19
            r6 = r23
            r8 = r34
            int r0 = r0.m56561X(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0358
            goto L_0x033e
        L_0x0384:
            r7 = r33
            r2 = r15
        L_0x0387:
            r8 = r17
        L_0x0389:
            r6 = r26
            goto L_0x03a7
        L_0x038c:
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r17
            r6 = r31
            r9 = r11
            r10 = r23
            r12 = r19
            r13 = r34
            int r0 = r0.m56562Y(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0358
            goto L_0x033e
        L_0x03a7:
            if (r8 != r7) goto L_0x03b8
            if (r7 == 0) goto L_0x03b8
            r9 = r28
            r12 = r29
            r0 = r6
            r5 = r25
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2
            goto L_0x0425
        L_0x03b8:
            r9 = r28
            boolean r0 = r9.f39788f
            if (r0 == 0) goto L_0x03ee
            r10 = r34
            com.google.android.gms.internal.firebase-auth-api.zzacs r0 = r10.f39627d
            com.google.android.gms.internal.firebase-auth-api.zzacs r1 = com.google.android.gms.internal.p204firebaseauthapi.zzacs.f39670b
            if (r0 == r1) goto L_0x03e9
            com.google.android.gms.internal.firebase-auth-api.zzaek r1 = r9.f39787e
            r11 = r31
            com.google.android.gms.internal.firebase-auth-api.zzadd r0 = r0.mo49040b(r1, r11)
            if (r0 != 0) goto L_0x03e2
            com.google.android.gms.internal.firebase-auth-api.zzafo r4 = m56553P(r29)
            r0 = r8
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56128i(r0, r1, r2, r3, r4, r5)
            r12 = r29
            goto L_0x0403
        L_0x03e2:
            r12 = r29
            r0 = r12
            com.google.android.gms.internal.firebase-auth-api.zzadc r0 = (com.google.android.gms.internal.p204firebaseauthapi.zzadc) r0
            r0 = 0
            throw r0
        L_0x03e9:
            r12 = r29
            r11 = r31
            goto L_0x03f4
        L_0x03ee:
            r12 = r29
            r11 = r31
            r10 = r34
        L_0x03f4:
            com.google.android.gms.internal.firebase-auth-api.zzafo r4 = m56553P(r29)
            r0 = r8
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56128i(r0, r1, r2, r3, r4, r5)
        L_0x0403:
            r13 = r32
            r1 = r8
            r15 = r9
            r9 = r10
            r2 = r11
            r14 = r12
            r3 = r19
            r5 = r25
            r10 = r27
            r12 = r30
            r11 = r7
            goto L_0x001c
        L_0x0415:
            r25 = r5
            r26 = r6
            r27 = r10
            r7 = r11
            r12 = r14
            r9 = r15
            r6 = r0
            r8 = r1
            r0 = r26
            r1 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0425:
            if (r0 == r1) goto L_0x042d
            long r0 = (long) r0
            r2 = r27
            r2.putInt(r12, r0, r5)
        L_0x042d:
            int r0 = r9.f39792j
            r10 = r0
        L_0x0430:
            int r0 = r9.f39793k
            if (r10 >= r0) goto L_0x0447
            int[] r0 = r9.f39791i
            r2 = r0[r10]
            r3 = 0
            com.google.android.gms.internal.firebase-auth-api.zzafn r4 = r9.f39795m
            r0 = r28
            r1 = r29
            r5 = r29
            r0.m56574q(r1, r2, r3, r4, r5)
            int r10 = r10 + 1
            goto L_0x0430
        L_0x0447:
            if (r7 != 0) goto L_0x0453
            r0 = r32
            if (r6 != r0) goto L_0x044e
            goto L_0x0459
        L_0x044e:
            com.google.android.gms.internal.firebase-auth-api.zzadn r0 = com.google.android.gms.internal.p204firebaseauthapi.zzadn.m56471g()
            throw r0
        L_0x0453:
            r0 = r32
            if (r6 > r0) goto L_0x045a
            if (r8 != r7) goto L_0x045a
        L_0x0459:
            return r6
        L_0x045a:
            com.google.android.gms.internal.firebase-auth-api.zzadn r0 = com.google.android.gms.internal.p204firebaseauthapi.zzadn.m56471g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p204firebaseauthapi.zzaen.mo49139O(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.zzabp):int");
    }

    /* renamed from: a */
    public final int mo49140a(Object obj) {
        return this.f39790h ? m56559V(obj) : m56558U(obj);
    }

    /* renamed from: b */
    public final Object mo49141b() {
        return ((zzadf) this.f39787e).mo49090y();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c2, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0226, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0227, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo49142c(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.f39783a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022b
            int r3 = r8.m56570m(r1)
            int[] r4 = r8.f39783a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = m56569l(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0218;
                case 1: goto L_0x020d;
                case 2: goto L_0x0202;
                case 3: goto L_0x01f7;
                case 4: goto L_0x01f0;
                case 5: goto L_0x01e5;
                case 6: goto L_0x01de;
                case 7: goto L_0x01d3;
                case 8: goto L_0x01c6;
                case 9: goto L_0x01b8;
                case 10: goto L_0x01ac;
                case 11: goto L_0x01a4;
                case 12: goto L_0x019c;
                case 13: goto L_0x0194;
                case 14: goto L_0x0188;
                case 15: goto L_0x0180;
                case 16: goto L_0x0174;
                case 17: goto L_0x0169;
                case 18: goto L_0x015d;
                case 19: goto L_0x015d;
                case 20: goto L_0x015d;
                case 21: goto L_0x015d;
                case 22: goto L_0x015d;
                case 23: goto L_0x015d;
                case 24: goto L_0x015d;
                case 25: goto L_0x015d;
                case 26: goto L_0x015d;
                case 27: goto L_0x015d;
                case 28: goto L_0x015d;
                case 29: goto L_0x015d;
                case 30: goto L_0x015d;
                case 31: goto L_0x015d;
                case 32: goto L_0x015d;
                case 33: goto L_0x015d;
                case 34: goto L_0x015d;
                case 35: goto L_0x015d;
                case 36: goto L_0x015d;
                case 37: goto L_0x015d;
                case 38: goto L_0x015d;
                case 39: goto L_0x015d;
                case 40: goto L_0x015d;
                case 41: goto L_0x015d;
                case 42: goto L_0x015d;
                case 43: goto L_0x015d;
                case 44: goto L_0x015d;
                case 45: goto L_0x015d;
                case 46: goto L_0x015d;
                case 47: goto L_0x015d;
                case 48: goto L_0x015d;
                case 49: goto L_0x015d;
                case 50: goto L_0x0151;
                case 51: goto L_0x013b;
                case 52: goto L_0x0129;
                case 53: goto L_0x0117;
                case 54: goto L_0x0105;
                case 55: goto L_0x00f7;
                case 56: goto L_0x00e5;
                case 57: goto L_0x00d7;
                case 58: goto L_0x00c5;
                case 59: goto L_0x00b1;
                case 60: goto L_0x009f;
                case 61: goto L_0x008d;
                case 62: goto L_0x007f;
                case 63: goto L_0x0071;
                case 64: goto L_0x0063;
                case 65: goto L_0x0051;
                case 66: goto L_0x0043;
                case 67: goto L_0x0031;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0227
        L_0x001f:
            boolean r3 = r8.m56548J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0031:
            boolean r3 = r8.m56548J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m56571n(r9, r5)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzadl.m56459c(r3)
            goto L_0x0226
        L_0x0043:
            boolean r3 = r8.m56548J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m56560W(r9, r5)
            goto L_0x0226
        L_0x0051:
            boolean r3 = r8.m56548J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m56571n(r9, r5)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzadl.m56459c(r3)
            goto L_0x0226
        L_0x0063:
            boolean r3 = r8.m56548J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m56560W(r9, r5)
            goto L_0x0226
        L_0x0071:
            boolean r3 = r8.m56548J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m56560W(r9, r5)
            goto L_0x0226
        L_0x007f:
            boolean r3 = r8.m56548J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m56560W(r9, r5)
            goto L_0x0226
        L_0x008d:
            boolean r3 = r8.m56548J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x009f:
            boolean r3 = r8.m56548J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00b1:
            boolean r3 = r8.m56548J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00c5:
            boolean r3 = r8.m56548J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            boolean r3 = m56549K(r9, r5)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzadl.m56457a(r3)
            goto L_0x0226
        L_0x00d7:
            boolean r3 = r8.m56548J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m56560W(r9, r5)
            goto L_0x0226
        L_0x00e5:
            boolean r3 = r8.m56548J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m56571n(r9, r5)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzadl.m56459c(r3)
            goto L_0x0226
        L_0x00f7:
            boolean r3 = r8.m56548J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m56560W(r9, r5)
            goto L_0x0226
        L_0x0105:
            boolean r3 = r8.m56548J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m56571n(r9, r5)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzadl.m56459c(r3)
            goto L_0x0226
        L_0x0117:
            boolean r3 = r8.m56548J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m56571n(r9, r5)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzadl.m56459c(r3)
            goto L_0x0226
        L_0x0129:
            boolean r3 = r8.m56548J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            float r3 = m56557T(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x013b:
            boolean r3 = r8.m56548J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            double r3 = m56556S(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzadl.m56459c(r3)
            goto L_0x0226
        L_0x0151:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x015d:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0169:
            java.lang.Object r3 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
            goto L_0x01c2
        L_0x0174:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56842i(r9, r5)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzadl.m56459c(r3)
            goto L_0x0226
        L_0x0180:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56841h(r9, r5)
            goto L_0x0226
        L_0x0188:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56842i(r9, r5)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzadl.m56459c(r3)
            goto L_0x0226
        L_0x0194:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56841h(r9, r5)
            goto L_0x0226
        L_0x019c:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56841h(r9, r5)
            goto L_0x0226
        L_0x01a4:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56841h(r9, r5)
            goto L_0x0226
        L_0x01ac:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01b8:
            java.lang.Object r3 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
        L_0x01c2:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0227
        L_0x01c6:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01d3:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56830B(r9, r5)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzadl.m56457a(r3)
            goto L_0x0226
        L_0x01de:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56841h(r9, r5)
            goto L_0x0226
        L_0x01e5:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56842i(r9, r5)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzadl.m56459c(r3)
            goto L_0x0226
        L_0x01f0:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56841h(r9, r5)
            goto L_0x0226
        L_0x01f7:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56842i(r9, r5)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzadl.m56459c(r3)
            goto L_0x0226
        L_0x0202:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56842i(r9, r5)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzadl.m56459c(r3)
            goto L_0x0226
        L_0x020d:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56840g(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x0218:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56839f(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.p204firebaseauthapi.zzadl.m56459c(r3)
        L_0x0226:
            int r2 = r2 + r3
        L_0x0227:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022b:
            int r2 = r2 * 53
            com.google.android.gms.internal.firebase-auth-api.zzafn r0 = r8.f39795m
            java.lang.Object r0 = r0.mo49196d(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f39788f
            if (r0 != 0) goto L_0x023d
            return r2
        L_0x023d:
            com.google.android.gms.internal.firebase-auth-api.zzact r0 = r8.f39796n
            r0.mo49041a(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p204firebaseauthapi.zzaen.mo49142c(java.lang.Object):int");
    }

    /* renamed from: d */
    public final void mo49143d(Object obj) {
        if (m56547I(obj)) {
            if (obj instanceof zzadf) {
                zzadf zzadf = (zzadf) obj;
                zzadf.mo49080k(Integer.MAX_VALUE);
                zzadf.zza = 0;
                zzadf.mo49078h();
            }
            int length = this.f39783a.length;
            for (int i = 0; i < length; i += 3) {
                int m = m56570m(i);
                long j = (long) (1048575 & m);
                int l = m56569l(m);
                if (l != 9) {
                    switch (l) {
                        case 17:
                            break;
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
                            this.f39794l.mo49115b(obj, j);
                            continue;
                        case 50:
                            Unsafe unsafe = f39782r;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((zzaee) object).mo49126c();
                                unsafe.putObject(obj, j, object);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
                if (m56544F(obj, i)) {
                    m56573p(i).mo49143d(f39782r.getObject(obj, j));
                }
            }
            this.f39795m.mo49205m(obj);
            if (this.f39788f) {
                this.f39796n.mo49045e(obj);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo49144e(Object obj) {
        int i;
        int i2;
        Object obj2 = obj;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f39792j) {
            int i6 = this.f39791i[i5];
            int i7 = this.f39783a[i6];
            int m = m56570m(i6);
            int i8 = this.f39783a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f39782r.getInt(obj2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & m) != 0 && !m56545G(obj, i6, i2, i, i10)) {
                return false;
            }
            int l = m56569l(m);
            if (l != 9 && l != 17) {
                if (l != 27) {
                    if (l == 60 || l == 68) {
                        if (m56548J(obj2, i7, i6) && !m56546H(obj2, m, m56573p(i6))) {
                            return false;
                        }
                    } else if (l != 49) {
                        if (l == 50 && !((zzaee) zzafx.m56844k(obj2, (long) (m & 1048575))).isEmpty()) {
                            zzaed zzaed = (zzaed) m56575r(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzafx.m56844k(obj2, (long) (m & 1048575));
                if (!list.isEmpty()) {
                    zzaew p = m56573p(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!p.mo49144e(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (m56545G(obj, i6, i2, i, i10) && !m56546H(obj2, m, m56573p(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.f39788f) {
            return true;
        }
        this.f39796n.mo49041a(obj2);
        throw null;
    }

    /* renamed from: f */
    public final void mo49145f(Object obj, Object obj2) {
        m56579v(obj);
        Objects.requireNonNull(obj2);
        for (int i = 0; i < this.f39783a.length; i += 3) {
            int m = m56570m(i);
            long j = (long) (1048575 & m);
            int i2 = this.f39783a[i];
            switch (m56569l(m)) {
                case 0:
                    if (!m56544F(obj2, i)) {
                        break;
                    } else {
                        zzafx.m56853t(obj, j, zzafx.m56839f(obj2, j));
                        m56583z(obj, i);
                        break;
                    }
                case 1:
                    if (!m56544F(obj2, i)) {
                        break;
                    } else {
                        zzafx.m56854u(obj, j, zzafx.m56840g(obj2, j));
                        m56583z(obj, i);
                        break;
                    }
                case 2:
                    if (!m56544F(obj2, i)) {
                        break;
                    } else {
                        zzafx.m56856w(obj, j, zzafx.m56842i(obj2, j));
                        m56583z(obj, i);
                        break;
                    }
                case 3:
                    if (!m56544F(obj2, i)) {
                        break;
                    } else {
                        zzafx.m56856w(obj, j, zzafx.m56842i(obj2, j));
                        m56583z(obj, i);
                        break;
                    }
                case 4:
                    if (!m56544F(obj2, i)) {
                        break;
                    } else {
                        zzafx.m56855v(obj, j, zzafx.m56841h(obj2, j));
                        m56583z(obj, i);
                        break;
                    }
                case 5:
                    if (!m56544F(obj2, i)) {
                        break;
                    } else {
                        zzafx.m56856w(obj, j, zzafx.m56842i(obj2, j));
                        m56583z(obj, i);
                        break;
                    }
                case 6:
                    if (!m56544F(obj2, i)) {
                        break;
                    } else {
                        zzafx.m56855v(obj, j, zzafx.m56841h(obj2, j));
                        m56583z(obj, i);
                        break;
                    }
                case 7:
                    if (!m56544F(obj2, i)) {
                        break;
                    } else {
                        zzafx.m56851r(obj, j, zzafx.m56830B(obj2, j));
                        m56583z(obj, i);
                        break;
                    }
                case 8:
                    if (!m56544F(obj2, i)) {
                        break;
                    } else {
                        zzafx.m56857x(obj, j, zzafx.m56844k(obj2, j));
                        m56583z(obj, i);
                        break;
                    }
                case 9:
                    m56580w(obj, obj2, i);
                    break;
                case 10:
                    if (!m56544F(obj2, i)) {
                        break;
                    } else {
                        zzafx.m56857x(obj, j, zzafx.m56844k(obj2, j));
                        m56583z(obj, i);
                        break;
                    }
                case 11:
                    if (!m56544F(obj2, i)) {
                        break;
                    } else {
                        zzafx.m56855v(obj, j, zzafx.m56841h(obj2, j));
                        m56583z(obj, i);
                        break;
                    }
                case 12:
                    if (!m56544F(obj2, i)) {
                        break;
                    } else {
                        zzafx.m56855v(obj, j, zzafx.m56841h(obj2, j));
                        m56583z(obj, i);
                        break;
                    }
                case 13:
                    if (!m56544F(obj2, i)) {
                        break;
                    } else {
                        zzafx.m56855v(obj, j, zzafx.m56841h(obj2, j));
                        m56583z(obj, i);
                        break;
                    }
                case 14:
                    if (!m56544F(obj2, i)) {
                        break;
                    } else {
                        zzafx.m56856w(obj, j, zzafx.m56842i(obj2, j));
                        m56583z(obj, i);
                        break;
                    }
                case 15:
                    if (!m56544F(obj2, i)) {
                        break;
                    } else {
                        zzafx.m56855v(obj, j, zzafx.m56841h(obj2, j));
                        m56583z(obj, i);
                        break;
                    }
                case 16:
                    if (!m56544F(obj2, i)) {
                        break;
                    } else {
                        zzafx.m56856w(obj, j, zzafx.m56842i(obj2, j));
                        m56583z(obj, i);
                        break;
                    }
                case 17:
                    m56580w(obj, obj2, i);
                    break;
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
                    this.f39794l.mo49116c(obj, obj2, j);
                    break;
                case 50:
                    zzaey.m56701i(this.f39798p, obj, obj2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!m56548J(obj2, i2, i)) {
                        break;
                    } else {
                        zzafx.m56857x(obj, j, zzafx.m56844k(obj2, j));
                        m56539A(obj, i2, i);
                        break;
                    }
                case 60:
                    m56581x(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m56548J(obj2, i2, i)) {
                        break;
                    } else {
                        zzafx.m56857x(obj, j, zzafx.m56844k(obj2, j));
                        m56539A(obj, i2, i);
                        break;
                    }
                case 68:
                    m56581x(obj, obj2, i);
                    break;
            }
        }
        zzaey.m56698f(this.f39795m, obj, obj2);
        if (this.f39788f) {
            zzaey.m56697e(this.f39796n, obj, obj2);
        }
    }

    /* renamed from: g */
    public final boolean mo49146g(Object obj, Object obj2) {
        boolean z;
        int length = this.f39783a.length;
        for (int i = 0; i < length; i += 3) {
            int m = m56570m(i);
            long j = (long) (m & 1048575);
            switch (m56569l(m)) {
                case 0:
                    if (m56542D(obj, obj2, i) && Double.doubleToLongBits(zzafx.m56839f(obj, j)) == Double.doubleToLongBits(zzafx.m56839f(obj2, j))) {
                        continue;
                    }
                case 1:
                    if (m56542D(obj, obj2, i) && Float.floatToIntBits(zzafx.m56840g(obj, j)) == Float.floatToIntBits(zzafx.m56840g(obj2, j))) {
                        continue;
                    }
                case 2:
                    if (m56542D(obj, obj2, i) && zzafx.m56842i(obj, j) == zzafx.m56842i(obj2, j)) {
                        continue;
                    }
                case 3:
                    if (m56542D(obj, obj2, i) && zzafx.m56842i(obj, j) == zzafx.m56842i(obj2, j)) {
                        continue;
                    }
                case 4:
                    if (m56542D(obj, obj2, i) && zzafx.m56841h(obj, j) == zzafx.m56841h(obj2, j)) {
                        continue;
                    }
                case 5:
                    if (m56542D(obj, obj2, i) && zzafx.m56842i(obj, j) == zzafx.m56842i(obj2, j)) {
                        continue;
                    }
                case 6:
                    if (m56542D(obj, obj2, i) && zzafx.m56841h(obj, j) == zzafx.m56841h(obj2, j)) {
                        continue;
                    }
                case 7:
                    if (m56542D(obj, obj2, i) && zzafx.m56830B(obj, j) == zzafx.m56830B(obj2, j)) {
                        continue;
                    }
                case 8:
                    if (m56542D(obj, obj2, i) && zzaey.m56700h(zzafx.m56844k(obj, j), zzafx.m56844k(obj2, j))) {
                        continue;
                    }
                case 9:
                    if (m56542D(obj, obj2, i) && zzaey.m56700h(zzafx.m56844k(obj, j), zzafx.m56844k(obj2, j))) {
                        continue;
                    }
                case 10:
                    if (m56542D(obj, obj2, i) && zzaey.m56700h(zzafx.m56844k(obj, j), zzafx.m56844k(obj2, j))) {
                        continue;
                    }
                case 11:
                    if (m56542D(obj, obj2, i) && zzafx.m56841h(obj, j) == zzafx.m56841h(obj2, j)) {
                        continue;
                    }
                case 12:
                    if (m56542D(obj, obj2, i) && zzafx.m56841h(obj, j) == zzafx.m56841h(obj2, j)) {
                        continue;
                    }
                case 13:
                    if (m56542D(obj, obj2, i) && zzafx.m56841h(obj, j) == zzafx.m56841h(obj2, j)) {
                        continue;
                    }
                case 14:
                    if (m56542D(obj, obj2, i) && zzafx.m56842i(obj, j) == zzafx.m56842i(obj2, j)) {
                        continue;
                    }
                case 15:
                    if (m56542D(obj, obj2, i) && zzafx.m56841h(obj, j) == zzafx.m56841h(obj2, j)) {
                        continue;
                    }
                case 16:
                    if (m56542D(obj, obj2, i) && zzafx.m56842i(obj, j) == zzafx.m56842i(obj2, j)) {
                        continue;
                    }
                case 17:
                    if (m56542D(obj, obj2, i) && zzaey.m56700h(zzafx.m56844k(obj, j), zzafx.m56844k(obj2, j))) {
                        continue;
                    }
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
                    z = zzaey.m56700h(zzafx.m56844k(obj, j), zzafx.m56844k(obj2, j));
                    break;
                case 50:
                    z = zzaey.m56700h(zzafx.m56844k(obj, j), zzafx.m56844k(obj2, j));
                    break;
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
                    long d0 = (long) (m56567d0(i) & 1048575);
                    if (zzafx.m56841h(obj, d0) == zzafx.m56841h(obj2, d0) && zzaey.m56700h(zzafx.m56844k(obj, j), zzafx.m56844k(obj2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.f39795m.mo49196d(obj).equals(this.f39795m.mo49196d(obj2))) {
            return false;
        }
        if (!this.f39788f) {
            return true;
        }
        this.f39796n.mo49041a(obj);
        this.f39796n.mo49041a(obj2);
        throw null;
    }

    /* renamed from: h */
    public final void mo49147h(Object obj, zzaco zzaco) throws IOException {
        if (!this.f39790h) {
            m56550L(obj, zzaco);
        } else if (!this.f39788f) {
            int length = this.f39783a.length;
            for (int i = 0; i < length; i += 3) {
                int m = m56570m(i);
                int i2 = this.f39783a[i];
                switch (m56569l(m)) {
                    case 0:
                        if (!m56544F(obj, i)) {
                            break;
                        } else {
                            zzaco.mo49022q(i2, zzafx.m56839f(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 1:
                        if (!m56544F(obj, i)) {
                            break;
                        } else {
                            zzaco.mo49031z(i2, zzafx.m56840g(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 2:
                        if (!m56544F(obj, i)) {
                            break;
                        } else {
                            zzaco.mo49000E(i2, zzafx.m56842i(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 3:
                        if (!m56544F(obj, i)) {
                            break;
                        } else {
                            zzaco.mo49016j(i2, zzafx.m56842i(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 4:
                        if (!m56544F(obj, i)) {
                            break;
                        } else {
                            zzaco.mo48998C(i2, zzafx.m56841h(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 5:
                        if (!m56544F(obj, i)) {
                            break;
                        } else {
                            zzaco.mo49029x(i2, zzafx.m56842i(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 6:
                        if (!m56544F(obj, i)) {
                            break;
                        } else {
                            zzaco.mo49027v(i2, zzafx.m56841h(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 7:
                        if (!m56544F(obj, i)) {
                            break;
                        } else {
                            zzaco.mo49018m(i2, zzafx.m56830B(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 8:
                        if (!m56544F(obj, i)) {
                            break;
                        } else {
                            m56552N(i2, zzafx.m56844k(obj, (long) (m & 1048575)), zzaco);
                            break;
                        }
                    case 9:
                        if (!m56544F(obj, i)) {
                            break;
                        } else {
                            zzaco.mo49002G(i2, zzafx.m56844k(obj, (long) (m & 1048575)), m56573p(i));
                            break;
                        }
                    case 10:
                        if (!m56544F(obj, i)) {
                            break;
                        } else {
                            zzaco.mo49020o(i2, (zzacc) zzafx.m56844k(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 11:
                        if (!m56544F(obj, i)) {
                            break;
                        } else {
                            zzaco.mo49014h(i2, zzafx.m56841h(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 12:
                        if (!m56544F(obj, i)) {
                            break;
                        } else {
                            zzaco.mo49025t(i2, zzafx.m56841h(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 13:
                        if (!m56544F(obj, i)) {
                            break;
                        } else {
                            zzaco.mo49003H(i2, zzafx.m56841h(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 14:
                        if (!m56544F(obj, i)) {
                            break;
                        } else {
                            zzaco.mo49005J(i2, zzafx.m56842i(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 15:
                        if (!m56544F(obj, i)) {
                            break;
                        } else {
                            zzaco.mo49007a(i2, zzafx.m56841h(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 16:
                        if (!m56544F(obj, i)) {
                            break;
                        } else {
                            zzaco.mo49009c(i2, zzafx.m56842i(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 17:
                        if (!m56544F(obj, i)) {
                            break;
                        } else {
                            zzaco.mo48997B(i2, zzafx.m56844k(obj, (long) (m & 1048575)), m56573p(i));
                            break;
                        }
                    case 18:
                        zzaey.m56704l(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, false);
                        break;
                    case 19:
                        zzaey.m56708p(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, false);
                        break;
                    case 20:
                        zzaey.m56711s(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, false);
                        break;
                    case 21:
                        zzaey.m56666B(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, false);
                        break;
                    case 22:
                        zzaey.m56710r(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, false);
                        break;
                    case 23:
                        zzaey.m56707o(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, false);
                        break;
                    case 24:
                        zzaey.m56706n(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, false);
                        break;
                    case 25:
                        zzaey.m56702j(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, false);
                        break;
                    case 26:
                        zzaey.m56717y(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco);
                        break;
                    case 27:
                        zzaey.m56712t(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, m56573p(i));
                        break;
                    case 28:
                        zzaey.m56703k(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco);
                        break;
                    case 29:
                        zzaey.m56718z(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, false);
                        break;
                    case 30:
                        zzaey.m56705m(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, false);
                        break;
                    case 31:
                        zzaey.m56713u(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, false);
                        break;
                    case 32:
                        zzaey.m56714v(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, false);
                        break;
                    case 33:
                        zzaey.m56715w(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, false);
                        break;
                    case 34:
                        zzaey.m56716x(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, false);
                        break;
                    case 35:
                        zzaey.m56704l(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, true);
                        break;
                    case 36:
                        zzaey.m56708p(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, true);
                        break;
                    case 37:
                        zzaey.m56711s(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, true);
                        break;
                    case 38:
                        zzaey.m56666B(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, true);
                        break;
                    case 39:
                        zzaey.m56710r(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, true);
                        break;
                    case 40:
                        zzaey.m56707o(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, true);
                        break;
                    case 41:
                        zzaey.m56706n(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, true);
                        break;
                    case 42:
                        zzaey.m56702j(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, true);
                        break;
                    case 43:
                        zzaey.m56718z(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, true);
                        break;
                    case 44:
                        zzaey.m56705m(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, true);
                        break;
                    case 45:
                        zzaey.m56713u(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, true);
                        break;
                    case 46:
                        zzaey.m56714v(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, true);
                        break;
                    case 47:
                        zzaey.m56715w(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, true);
                        break;
                    case 48:
                        zzaey.m56716x(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, true);
                        break;
                    case 49:
                        zzaey.m56709q(i2, (List) zzafx.m56844k(obj, (long) (m & 1048575)), zzaco, m56573p(i));
                        break;
                    case 50:
                        m56551M(zzaco, i2, zzafx.m56844k(obj, (long) (m & 1048575)), i);
                        break;
                    case 51:
                        if (!m56548J(obj, i2, i)) {
                            break;
                        } else {
                            zzaco.mo49022q(i2, m56556S(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 52:
                        if (!m56548J(obj, i2, i)) {
                            break;
                        } else {
                            zzaco.mo49031z(i2, m56557T(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 53:
                        if (!m56548J(obj, i2, i)) {
                            break;
                        } else {
                            zzaco.mo49000E(i2, m56571n(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 54:
                        if (!m56548J(obj, i2, i)) {
                            break;
                        } else {
                            zzaco.mo49016j(i2, m56571n(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 55:
                        if (!m56548J(obj, i2, i)) {
                            break;
                        } else {
                            zzaco.mo48998C(i2, m56560W(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 56:
                        if (!m56548J(obj, i2, i)) {
                            break;
                        } else {
                            zzaco.mo49029x(i2, m56571n(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 57:
                        if (!m56548J(obj, i2, i)) {
                            break;
                        } else {
                            zzaco.mo49027v(i2, m56560W(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 58:
                        if (!m56548J(obj, i2, i)) {
                            break;
                        } else {
                            zzaco.mo49018m(i2, m56549K(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 59:
                        if (!m56548J(obj, i2, i)) {
                            break;
                        } else {
                            m56552N(i2, zzafx.m56844k(obj, (long) (m & 1048575)), zzaco);
                            break;
                        }
                    case 60:
                        if (!m56548J(obj, i2, i)) {
                            break;
                        } else {
                            zzaco.mo49002G(i2, zzafx.m56844k(obj, (long) (m & 1048575)), m56573p(i));
                            break;
                        }
                    case 61:
                        if (!m56548J(obj, i2, i)) {
                            break;
                        } else {
                            zzaco.mo49020o(i2, (zzacc) zzafx.m56844k(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 62:
                        if (!m56548J(obj, i2, i)) {
                            break;
                        } else {
                            zzaco.mo49014h(i2, m56560W(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 63:
                        if (!m56548J(obj, i2, i)) {
                            break;
                        } else {
                            zzaco.mo49025t(i2, m56560W(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 64:
                        if (!m56548J(obj, i2, i)) {
                            break;
                        } else {
                            zzaco.mo49003H(i2, m56560W(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 65:
                        if (!m56548J(obj, i2, i)) {
                            break;
                        } else {
                            zzaco.mo49005J(i2, m56571n(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 66:
                        if (!m56548J(obj, i2, i)) {
                            break;
                        } else {
                            zzaco.mo49007a(i2, m56560W(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 67:
                        if (!m56548J(obj, i2, i)) {
                            break;
                        } else {
                            zzaco.mo49009c(i2, m56571n(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 68:
                        if (!m56548J(obj, i2, i)) {
                            break;
                        } else {
                            zzaco.mo48997B(i2, zzafx.m56844k(obj, (long) (m & 1048575)), m56573p(i));
                            break;
                        }
                }
            }
            zzafn zzafn = this.f39795m;
            zzafn.mo49210r(zzafn.mo49196d(obj), zzaco);
        } else {
            this.f39796n.mo49041a(obj);
            throw null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:176|175|177|178|(1:180)|181|(5:203|183|(2:186|184)|212|(2:188|214)(1:218))|171|208|201) */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0616, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0185, code lost:
        r13 = r4;
        r11 = r5;
        r14 = r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:177:0x061c */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0621 A[Catch:{ all -> 0x0616 }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0659 A[LOOP:5: B:195:0x0655->B:197:0x0659, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x066d  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x062c A[SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49148i(java.lang.Object r18, com.google.android.gms.internal.p204firebaseauthapi.zzaev r19, com.google.android.gms.internal.p204firebaseauthapi.zzacs r20) throws java.io.IOException {
        /*
            r17 = this;
            r7 = r17
            r15 = r18
            r0 = r19
            r6 = r20
            java.util.Objects.requireNonNull(r20)
            m56579v(r18)
            com.google.android.gms.internal.firebase-auth-api.zzafn r14 = r7.f39795m
            com.google.android.gms.internal.firebase-auth-api.zzact r5 = r7.f39796n
            r16 = 0
            r4 = r16
            r8 = r4
        L_0x0017:
            int r2 = r19.mo48938a()     // Catch:{ all -> 0x064d }
            int r1 = r7.m56565b0(r2)     // Catch:{ all -> 0x064d }
            if (r1 >= 0) goto L_0x00b6
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L_0x0044
            int r0 = r7.f39792j
        L_0x0028:
            int r1 = r7.f39793k
            if (r0 >= r1) goto L_0x003e
            int[] r1 = r7.f39791i
            r3 = r1[r0]
            r1 = r17
            r2 = r18
            r5 = r14
            r6 = r18
            java.lang.Object r4 = r1.m56574q(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0028
        L_0x003e:
            if (r4 == 0) goto L_0x0649
            r14.mo49206n(r15, r4)
            return
        L_0x0044:
            boolean r1 = r7.f39788f     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x004b
            r11 = r16
            goto L_0x0052
        L_0x004b:
            com.google.android.gms.internal.firebase-auth-api.zzaek r1 = r7.f39787e     // Catch:{ all -> 0x00b1 }
            java.lang.Object r1 = r5.mo49043c(r6, r1, r2)     // Catch:{ all -> 0x00b1 }
            r11 = r1
        L_0x0052:
            if (r11 == 0) goto L_0x0070
            if (r8 != 0) goto L_0x005b
            com.google.android.gms.internal.firebase-auth-api.zzacx r1 = r5.mo49042b(r15)     // Catch:{ all -> 0x064d }
            goto L_0x005c
        L_0x005b:
            r1 = r8
        L_0x005c:
            r8 = r5
            r9 = r18
            r10 = r19
            r12 = r20
            r13 = r1
            r3 = r14
            r14 = r4
            r2 = r15
            r15 = r3
            java.lang.Object r4 = r8.mo49044d(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00ac }
            r8 = r1
        L_0x006d:
            r15 = r2
            r14 = r3
            goto L_0x0017
        L_0x0070:
            r3 = r14
            r2 = r15
            r3.mo49209q(r0)     // Catch:{ all -> 0x00ac }
            if (r4 != 0) goto L_0x007c
            java.lang.Object r1 = r3.mo49195c(r2)     // Catch:{ all -> 0x00ac }
            r4 = r1
        L_0x007c:
            boolean r1 = r3.mo49208p(r4, r0)     // Catch:{ all -> 0x00a7 }
            if (r1 != 0) goto L_0x006d
            int r0 = r7.f39792j
        L_0x0084:
            int r1 = r7.f39793k
            if (r0 >= r1) goto L_0x009f
            int[] r1 = r7.f39791i
            r5 = r1[r0]
            r1 = r17
            r9 = r2
            r2 = r18
            r10 = r3
            r3 = r5
            r5 = r10
            r6 = r18
            java.lang.Object r4 = r1.m56574q(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            r2 = r9
            r3 = r10
            goto L_0x0084
        L_0x009f:
            r9 = r2
            r10 = r3
            if (r4 == 0) goto L_0x0649
            r10.mo49206n(r9, r4)
            return
        L_0x00a7:
            r0 = move-exception
            r9 = r2
            r10 = r3
            goto L_0x0652
        L_0x00ac:
            r0 = move-exception
            r9 = r2
            r10 = r3
            goto L_0x064b
        L_0x00b1:
            r0 = move-exception
            r10 = r14
            r9 = r15
            goto L_0x064b
        L_0x00b6:
            r10 = r14
            r9 = r15
            int r3 = r7.m56570m(r1)     // Catch:{ all -> 0x064a }
            int r11 = m56569l(r3)     // Catch:{ zzadm -> 0x0618 }
            r12 = 1048575(0xfffff, float:1.469367E-39)
            switch(r11) {
                case 0: goto L_0x05d7;
                case 1: goto L_0x05c6;
                case 2: goto L_0x05b5;
                case 3: goto L_0x05a4;
                case 4: goto L_0x0593;
                case 5: goto L_0x0582;
                case 6: goto L_0x0570;
                case 7: goto L_0x055e;
                case 8: goto L_0x0550;
                case 9: goto L_0x053b;
                case 10: goto L_0x0529;
                case 11: goto L_0x0517;
                case 12: goto L_0x04f2;
                case 13: goto L_0x04e0;
                case 14: goto L_0x04ce;
                case 15: goto L_0x04bc;
                case 16: goto L_0x04aa;
                case 17: goto L_0x0495;
                case 18: goto L_0x0484;
                case 19: goto L_0x0473;
                case 20: goto L_0x0462;
                case 21: goto L_0x0451;
                case 22: goto L_0x0440;
                case 23: goto L_0x042f;
                case 24: goto L_0x041e;
                case 25: goto L_0x040d;
                case 26: goto L_0x03e0;
                case 27: goto L_0x03cb;
                case 28: goto L_0x03ba;
                case 29: goto L_0x03a9;
                case 30: goto L_0x038d;
                case 31: goto L_0x037c;
                case 32: goto L_0x036b;
                case 33: goto L_0x035a;
                case 34: goto L_0x0349;
                case 35: goto L_0x0338;
                case 36: goto L_0x0327;
                case 37: goto L_0x0316;
                case 38: goto L_0x0305;
                case 39: goto L_0x02f4;
                case 40: goto L_0x02e3;
                case 41: goto L_0x02d2;
                case 42: goto L_0x02c1;
                case 43: goto L_0x02b0;
                case 44: goto L_0x0293;
                case 45: goto L_0x0285;
                case 46: goto L_0x0277;
                case 47: goto L_0x0269;
                case 48: goto L_0x025b;
                case 49: goto L_0x0249;
                case 50: goto L_0x0213;
                case 51: goto L_0x0201;
                case 52: goto L_0x01f0;
                case 53: goto L_0x01df;
                case 54: goto L_0x01ce;
                case 55: goto L_0x01bd;
                case 56: goto L_0x01ac;
                case 57: goto L_0x019b;
                case 58: goto L_0x018a;
                case 59: goto L_0x017f;
                case 60: goto L_0x016e;
                case 61: goto L_0x0161;
                case 62: goto L_0x0150;
                case 63: goto L_0x012a;
                case 64: goto L_0x0119;
                case 65: goto L_0x0107;
                case 66: goto L_0x00f5;
                case 67: goto L_0x00e3;
                case 68: goto L_0x00d1;
                default: goto L_0x00c6;
            }
        L_0x00c6:
            r13 = r4
            r11 = r5
            r14 = r6
            if (r13 != 0) goto L_0x05eb
            java.lang.Object r1 = r10.mo49195c(r9)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e9
        L_0x00d1:
            java.lang.Object r3 = r7.m56577t(r9, r2, r1)     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.firebase-auth-api.zzaek r3 = (com.google.android.gms.internal.p204firebaseauthapi.zzaek) r3     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.firebase-auth-api.zzaew r11 = r7.m56573p(r1)     // Catch:{ zzadm -> 0x0618 }
            r0.mo48935I(r3, r11, r6)     // Catch:{ zzadm -> 0x0618 }
            r7.m56541C(r9, r2, r1, r3)     // Catch:{ zzadm -> 0x0618 }
            goto L_0x0185
        L_0x00e3:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ zzadm -> 0x0618 }
            long r13 = r19.mo48952n()     // Catch:{ zzadm -> 0x0618 }
            java.lang.Long r3 = java.lang.Long.valueOf(r13)     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56857x(r9, r11, r3)     // Catch:{ zzadm -> 0x0618 }
            r7.m56539A(r9, r2, r1)     // Catch:{ zzadm -> 0x0618 }
            goto L_0x0185
        L_0x00f5:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ zzadm -> 0x0618 }
            int r3 = r19.mo48945g()     // Catch:{ zzadm -> 0x0618 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56857x(r9, r11, r3)     // Catch:{ zzadm -> 0x0618 }
            r7.m56539A(r9, r2, r1)     // Catch:{ zzadm -> 0x0618 }
            goto L_0x0185
        L_0x0107:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ zzadm -> 0x0618 }
            long r13 = r19.mo48949k()     // Catch:{ zzadm -> 0x0618 }
            java.lang.Long r3 = java.lang.Long.valueOf(r13)     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56857x(r9, r11, r3)     // Catch:{ zzadm -> 0x0618 }
            r7.m56539A(r9, r2, r1)     // Catch:{ zzadm -> 0x0618 }
            goto L_0x0185
        L_0x0119:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ zzadm -> 0x0618 }
            int r3 = r19.mo48943e()     // Catch:{ zzadm -> 0x0618 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56857x(r9, r11, r3)     // Catch:{ zzadm -> 0x0618 }
            r7.m56539A(r9, r2, r1)     // Catch:{ zzadm -> 0x0618 }
            goto L_0x0185
        L_0x012a:
            int r11 = r19.mo48940b()     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.firebase-auth-api.zzadj r13 = r7.m56572o(r1)     // Catch:{ zzadm -> 0x0618 }
            if (r13 == 0) goto L_0x0143
            boolean r13 = r13.zza()     // Catch:{ zzadm -> 0x0618 }
            if (r13 == 0) goto L_0x013b
            goto L_0x0143
        L_0x013b:
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56696d(r9, r2, r11, r4, r10)     // Catch:{ zzadm -> 0x0618 }
            r11 = r5
            r14 = r6
            goto L_0x0610
        L_0x0143:
            r3 = r3 & r12
            long r12 = (long) r3     // Catch:{ zzadm -> 0x0618 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56857x(r9, r12, r3)     // Catch:{ zzadm -> 0x0618 }
            r7.m56539A(r9, r2, r1)     // Catch:{ zzadm -> 0x0618 }
            goto L_0x0185
        L_0x0150:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ zzadm -> 0x0618 }
            int r3 = r19.mo48946h()     // Catch:{ zzadm -> 0x0618 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56857x(r9, r11, r3)     // Catch:{ zzadm -> 0x0618 }
            r7.m56539A(r9, r2, r1)     // Catch:{ zzadm -> 0x0618 }
            goto L_0x0185
        L_0x0161:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.firebase-auth-api.zzacc r3 = r19.mo48951m()     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56857x(r9, r11, r3)     // Catch:{ zzadm -> 0x0618 }
            r7.m56539A(r9, r2, r1)     // Catch:{ zzadm -> 0x0618 }
            goto L_0x0185
        L_0x016e:
            java.lang.Object r3 = r7.m56577t(r9, r2, r1)     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.firebase-auth-api.zzaek r3 = (com.google.android.gms.internal.p204firebaseauthapi.zzaek) r3     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.firebase-auth-api.zzaew r11 = r7.m56573p(r1)     // Catch:{ zzadm -> 0x0618 }
            r0.mo48934H(r3, r11, r6)     // Catch:{ zzadm -> 0x0618 }
            r7.m56541C(r9, r2, r1, r3)     // Catch:{ zzadm -> 0x0618 }
            goto L_0x0185
        L_0x017f:
            r7.m56582y(r9, r3, r0)     // Catch:{ zzadm -> 0x0618 }
            r7.m56539A(r9, r2, r1)     // Catch:{ zzadm -> 0x0618 }
        L_0x0185:
            r13 = r4
            r11 = r5
            r14 = r6
            goto L_0x05e7
        L_0x018a:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ zzadm -> 0x0618 }
            boolean r3 = r19.mo48937M()     // Catch:{ zzadm -> 0x0618 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56857x(r9, r11, r3)     // Catch:{ zzadm -> 0x0618 }
            r7.m56539A(r9, r2, r1)     // Catch:{ zzadm -> 0x0618 }
            goto L_0x0185
        L_0x019b:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ zzadm -> 0x0618 }
            int r3 = r19.mo48941c()     // Catch:{ zzadm -> 0x0618 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56857x(r9, r11, r3)     // Catch:{ zzadm -> 0x0618 }
            r7.m56539A(r9, r2, r1)     // Catch:{ zzadm -> 0x0618 }
            goto L_0x0185
        L_0x01ac:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ zzadm -> 0x0618 }
            long r13 = r19.mo48947i()     // Catch:{ zzadm -> 0x0618 }
            java.lang.Long r3 = java.lang.Long.valueOf(r13)     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56857x(r9, r11, r3)     // Catch:{ zzadm -> 0x0618 }
            r7.m56539A(r9, r2, r1)     // Catch:{ zzadm -> 0x0618 }
            goto L_0x0185
        L_0x01bd:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ zzadm -> 0x0618 }
            int r3 = r19.mo48944f()     // Catch:{ zzadm -> 0x0618 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56857x(r9, r11, r3)     // Catch:{ zzadm -> 0x0618 }
            r7.m56539A(r9, r2, r1)     // Catch:{ zzadm -> 0x0618 }
            goto L_0x0185
        L_0x01ce:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ zzadm -> 0x0618 }
            long r13 = r19.mo48950l()     // Catch:{ zzadm -> 0x0618 }
            java.lang.Long r3 = java.lang.Long.valueOf(r13)     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56857x(r9, r11, r3)     // Catch:{ zzadm -> 0x0618 }
            r7.m56539A(r9, r2, r1)     // Catch:{ zzadm -> 0x0618 }
            goto L_0x0185
        L_0x01df:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ zzadm -> 0x0618 }
            long r13 = r19.mo48948j()     // Catch:{ zzadm -> 0x0618 }
            java.lang.Long r3 = java.lang.Long.valueOf(r13)     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56857x(r9, r11, r3)     // Catch:{ zzadm -> 0x0618 }
            r7.m56539A(r9, r2, r1)     // Catch:{ zzadm -> 0x0618 }
            goto L_0x0185
        L_0x01f0:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ zzadm -> 0x0618 }
            float r3 = r19.zzb()     // Catch:{ zzadm -> 0x0618 }
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56857x(r9, r11, r3)     // Catch:{ zzadm -> 0x0618 }
            r7.m56539A(r9, r2, r1)     // Catch:{ zzadm -> 0x0618 }
            goto L_0x0185
        L_0x0201:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ zzadm -> 0x0618 }
            double r13 = r19.zza()     // Catch:{ zzadm -> 0x0618 }
            java.lang.Double r3 = java.lang.Double.valueOf(r13)     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56857x(r9, r11, r3)     // Catch:{ zzadm -> 0x0618 }
            r7.m56539A(r9, r2, r1)     // Catch:{ zzadm -> 0x0618 }
            goto L_0x0185
        L_0x0213:
            java.lang.Object r2 = r7.m56575r(r1)     // Catch:{ zzadm -> 0x0618 }
            int r1 = r7.m56570m(r1)     // Catch:{ zzadm -> 0x0618 }
            r1 = r1 & r12
            long r11 = (long) r1     // Catch:{ zzadm -> 0x0618 }
            java.lang.Object r1 = com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56844k(r9, r11)     // Catch:{ zzadm -> 0x0618 }
            if (r1 == 0) goto L_0x0239
            boolean r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaef.m56521b(r1)     // Catch:{ zzadm -> 0x0618 }
            if (r3 == 0) goto L_0x0244
            com.google.android.gms.internal.firebase-auth-api.zzaee r3 = com.google.android.gms.internal.p204firebaseauthapi.zzaee.m56513a()     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.firebase-auth-api.zzaee r3 = r3.mo49125b()     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.p204firebaseauthapi.zzaef.m56522c(r3, r1)     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56857x(r9, r11, r3)     // Catch:{ zzadm -> 0x0618 }
            r1 = r3
            goto L_0x0244
        L_0x0239:
            com.google.android.gms.internal.firebase-auth-api.zzaee r1 = com.google.android.gms.internal.p204firebaseauthapi.zzaee.m56513a()     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.firebase-auth-api.zzaee r1 = r1.mo49125b()     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56857x(r9, r11, r1)     // Catch:{ zzadm -> 0x0618 }
        L_0x0244:
            com.google.android.gms.internal.firebase-auth-api.zzaee r1 = (com.google.android.gms.internal.p204firebaseauthapi.zzaee) r1     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.firebase-auth-api.zzaed r2 = (com.google.android.gms.internal.p204firebaseauthapi.zzaed) r2     // Catch:{ zzadm -> 0x0618 }
            throw r16     // Catch:{ zzadm -> 0x0618 }
        L_0x0249:
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.firebase-auth-api.zzaew r1 = r7.m56573p(r1)     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.firebase-auth-api.zzady r11 = r7.f39794l     // Catch:{ zzadm -> 0x0618 }
            java.util.List r2 = r11.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x0618 }
            r0.mo48956r(r2, r1, r6)     // Catch:{ zzadm -> 0x0618 }
            goto L_0x0185
        L_0x025b:
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x0618 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x0618 }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x0618 }
            r0.mo48931E(r1)     // Catch:{ zzadm -> 0x0618 }
            goto L_0x0185
        L_0x0269:
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x0618 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x0618 }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x0618 }
            r0.mo48932F(r1)     // Catch:{ zzadm -> 0x0618 }
            goto L_0x0185
        L_0x0277:
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x0618 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x0618 }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x0618 }
            r0.mo48962x(r1)     // Catch:{ zzadm -> 0x0618 }
            goto L_0x0185
        L_0x0285:
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x0618 }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x0618 }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x0618 }
            r0.mo48963y(r1)     // Catch:{ zzadm -> 0x0618 }
            goto L_0x0185
        L_0x0293:
            com.google.android.gms.internal.firebase-auth-api.zzady r11 = r7.f39794l     // Catch:{ zzadm -> 0x0618 }
            r3 = r3 & r12
            long r12 = (long) r3     // Catch:{ zzadm -> 0x0618 }
            java.util.List r3 = r11.mo49114a(r9, r12)     // Catch:{ zzadm -> 0x0618 }
            r0.mo48953o(r3)     // Catch:{ zzadm -> 0x0618 }
            com.google.android.gms.internal.firebase-auth-api.zzadj r11 = r7.m56572o(r1)     // Catch:{ zzadm -> 0x0618 }
            r1 = r18
            r13 = r4
            r4 = r11
            r11 = r5
            r5 = r13
            r14 = r6
            r6 = r10
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56695c(r1, r2, r3, r4, r5, r6)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x0610
        L_0x02b0:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48933G(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x02c1:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48928B(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x02d2:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48964z(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x02e3:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48927A(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x02f4:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48961w(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x0305:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48930D(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x0316:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48957s(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x0327:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48929C(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x0338:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48958t(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x0349:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48931E(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x035a:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48932F(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x036b:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48962x(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x037c:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48963y(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x038d:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzady r4 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r3 = r3 & r12
            long r5 = (long) r3     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r3 = r4.mo49114a(r9, r5)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48953o(r3)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            com.google.android.gms.internal.firebase-auth-api.zzadj r4 = r7.m56572o(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r1 = r18
            r5 = r13
            r6 = r10
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56695c(r1, r2, r3, r4, r5, r6)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x0610
        L_0x03a9:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48933G(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x03ba:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48960v(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x03cb:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzaew r1 = r7.m56573p(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            com.google.android.gms.internal.firebase-auth-api.zzady r4 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r2 = r4.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48959u(r2, r1, r14)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x03e0:
            r13 = r4
            r11 = r5
            r14 = r6
            boolean r1 = m56543E(r3)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            if (r1 == 0) goto L_0x03fb
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r0
            com.google.android.gms.internal.firebase-auth-api.zzach r2 = (com.google.android.gms.internal.p204firebaseauthapi.zzach) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r3 = 1
            r2.mo48936J(r1, r3)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x03fb:
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r0
            com.google.android.gms.internal.firebase-auth-api.zzach r2 = (com.google.android.gms.internal.p204firebaseauthapi.zzach) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r3 = 0
            r2.mo48936J(r1, r3)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x040d:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48928B(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x041e:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48964z(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x042f:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48927A(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x0440:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48961w(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x0451:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48930D(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x0462:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48957s(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x0473:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48929C(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x0484:
            r13 = r4
            r11 = r5
            r14 = r6
            com.google.android.gms.internal.firebase-auth-api.zzady r1 = r7.f39794l     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            java.util.List r1 = r1.mo49114a(r9, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48958t(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x0495:
            r13 = r4
            r11 = r5
            r14 = r6
            java.lang.Object r2 = r7.m56576s(r9, r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            com.google.android.gms.internal.firebase-auth-api.zzaek r2 = (com.google.android.gms.internal.p204firebaseauthapi.zzaek) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            com.google.android.gms.internal.firebase-auth-api.zzaew r3 = r7.m56573p(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48935I(r2, r3, r14)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r7.m56540B(r9, r1, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x04aa:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            long r4 = r19.mo48952n()     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56856w(r9, r2, r4)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r7.m56583z(r9, r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x04bc:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            int r4 = r19.mo48945g()     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56855v(r9, r2, r4)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r7.m56583z(r9, r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x04ce:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            long r4 = r19.mo48949k()     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56856w(r9, r2, r4)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r7.m56583z(r9, r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x04e0:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            int r4 = r19.mo48943e()     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56855v(r9, r2, r4)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r7.m56583z(r9, r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x04f2:
            r13 = r4
            r11 = r5
            r14 = r6
            int r4 = r19.mo48940b()     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            com.google.android.gms.internal.firebase-auth-api.zzadj r5 = r7.m56572o(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            if (r5 == 0) goto L_0x050c
            boolean r5 = r5.zza()     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            if (r5 == 0) goto L_0x0506
            goto L_0x050c
        L_0x0506:
            java.lang.Object r4 = com.google.android.gms.internal.p204firebaseauthapi.zzaey.m56696d(r9, r2, r4, r13, r10)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x0610
        L_0x050c:
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56855v(r9, r2, r4)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r7.m56583z(r9, r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x0517:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            int r4 = r19.mo48946h()     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56855v(r9, r2, r4)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r7.m56583z(r9, r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x0529:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            com.google.android.gms.internal.firebase-auth-api.zzacc r4 = r19.mo48951m()     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56857x(r9, r2, r4)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r7.m56583z(r9, r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x053b:
            r13 = r4
            r11 = r5
            r14 = r6
            java.lang.Object r2 = r7.m56576s(r9, r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            com.google.android.gms.internal.firebase-auth-api.zzaek r2 = (com.google.android.gms.internal.p204firebaseauthapi.zzaek) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            com.google.android.gms.internal.firebase-auth-api.zzaew r3 = r7.m56573p(r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r0.mo48934H(r2, r3, r14)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r7.m56540B(r9, r1, r2)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x0550:
            r13 = r4
            r11 = r5
            r14 = r6
            r7.m56582y(r9, r3, r0)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r7.m56583z(r9, r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x055b:
            r0 = move-exception
            goto L_0x0651
        L_0x055e:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            boolean r4 = r19.mo48937M()     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56851r(r9, r2, r4)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r7.m56583z(r9, r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x0570:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            int r4 = r19.mo48941c()     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56855v(r9, r2, r4)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r7.m56583z(r9, r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x0582:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            long r4 = r19.mo48947i()     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56856w(r9, r2, r4)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r7.m56583z(r9, r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x0593:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            int r4 = r19.mo48944f()     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56855v(r9, r2, r4)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r7.m56583z(r9, r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x05a4:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            long r4 = r19.mo48950l()     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56856w(r9, r2, r4)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r7.m56583z(r9, r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x05b5:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            long r4 = r19.mo48948j()     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56856w(r9, r2, r4)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r7.m56583z(r9, r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x05c6:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            float r4 = r19.zzb()     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56854u(r9, r2, r4)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r7.m56583z(r9, r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            goto L_0x05e7
        L_0x05d7:
            r13 = r4
            r11 = r5
            r14 = r6
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            double r4 = r19.zza()     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            com.google.android.gms.internal.p204firebaseauthapi.zzafx.m56853t(r9, r2, r4)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
            r7.m56583z(r9, r1)     // Catch:{ zzadm -> 0x061b, all -> 0x055b }
        L_0x05e7:
            r4 = r13
            goto L_0x0610
        L_0x05e9:
            r4 = r1
            goto L_0x05ec
        L_0x05eb:
            r4 = r13
        L_0x05ec:
            boolean r1 = r10.mo49208p(r4, r0)     // Catch:{ zzadm -> 0x061c }
            if (r1 != 0) goto L_0x0610
            int r0 = r7.f39792j
        L_0x05f4:
            int r1 = r7.f39793k
            if (r0 >= r1) goto L_0x060a
            int[] r1 = r7.f39791i
            r3 = r1[r0]
            r1 = r17
            r2 = r18
            r5 = r10
            r6 = r18
            java.lang.Object r4 = r1.m56574q(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x05f4
        L_0x060a:
            if (r4 == 0) goto L_0x0649
            r10.mo49206n(r9, r4)
            return
        L_0x0610:
            r15 = r9
            r5 = r11
            r6 = r14
            r14 = r10
            goto L_0x0017
        L_0x0616:
            r0 = move-exception
            goto L_0x0652
        L_0x0618:
            r13 = r4
            r11 = r5
            r14 = r6
        L_0x061b:
            r4 = r13
        L_0x061c:
            r10.mo49209q(r0)     // Catch:{ all -> 0x0616 }
            if (r4 != 0) goto L_0x0626
            java.lang.Object r1 = r10.mo49195c(r9)     // Catch:{ all -> 0x0616 }
            r4 = r1
        L_0x0626:
            boolean r1 = r10.mo49208p(r4, r0)     // Catch:{ all -> 0x0616 }
            if (r1 != 0) goto L_0x0610
            int r0 = r7.f39792j
        L_0x062e:
            int r1 = r7.f39793k
            if (r0 >= r1) goto L_0x0644
            int[] r1 = r7.f39791i
            r3 = r1[r0]
            r1 = r17
            r2 = r18
            r5 = r10
            r6 = r18
            java.lang.Object r4 = r1.m56574q(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x062e
        L_0x0644:
            if (r4 == 0) goto L_0x0649
            r10.mo49206n(r9, r4)
        L_0x0649:
            return
        L_0x064a:
            r0 = move-exception
        L_0x064b:
            r13 = r4
            goto L_0x0651
        L_0x064d:
            r0 = move-exception
            r13 = r4
            r10 = r14
            r9 = r15
        L_0x0651:
            r4 = r13
        L_0x0652:
            int r1 = r7.f39792j
            r8 = r1
        L_0x0655:
            int r1 = r7.f39793k
            if (r8 >= r1) goto L_0x066b
            int[] r1 = r7.f39791i
            r3 = r1[r8]
            r1 = r17
            r2 = r18
            r5 = r10
            r6 = r18
            java.lang.Object r4 = r1.m56574q(r2, r3, r4, r5, r6)
            int r8 = r8 + 1
            goto L_0x0655
        L_0x066b:
            if (r4 == 0) goto L_0x0670
            r10.mo49206n(r9, r4)
        L_0x0670:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p204firebaseauthapi.zzaen.mo49148i(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzaev, com.google.android.gms.internal.firebase-auth-api.zzacs):void");
    }

    /* renamed from: j */
    public final void mo49149j(Object obj, byte[] bArr, int i, int i2, zzabp zzabp) throws IOException {
        if (this.f39790h) {
            m56563Z(obj, bArr, i, i2, zzabp);
        } else {
            mo49139O(obj, bArr, i, i2, 0, zzabp);
        }
    }
}
