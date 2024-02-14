package com.google.android.gms.internal.icing;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzeh<T> implements zzep<T> {

    /* renamed from: n */
    private static final int[] f40916n = new int[0];

    /* renamed from: o */
    private static final Unsafe f40917o = zzfn.m59090v();

    /* renamed from: a */
    private final int[] f40918a;

    /* renamed from: b */
    private final Object[] f40919b;

    /* renamed from: c */
    private final zzee f40920c;

    /* renamed from: d */
    private final boolean f40921d;

    /* renamed from: e */
    private final boolean f40922e;

    /* renamed from: f */
    private final int[] f40923f;

    /* renamed from: g */
    private final int f40924g;

    /* renamed from: h */
    private final int f40925h;

    /* renamed from: i */
    private final zzds f40926i;

    /* renamed from: j */
    private final zzfd<?, ?> f40927j;

    /* renamed from: k */
    private final zzcq<?> f40928k;

    /* renamed from: l */
    private final zzej f40929l;

    /* renamed from: m */
    private final zzdz f40930m;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.google.android.gms.internal.icing.zzee} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.google.android.gms.internal.icing.zzej} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.gms.internal.icing.zzdz} */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.icing.zzcq, com.google.android.gms.internal.icing.zzcq<?>] */
    /* JADX WARNING: type inference failed for: r3v6, types: [int] */
    /* JADX WARNING: type inference failed for: r3v9, types: [com.google.android.gms.internal.icing.zzds] */
    /* JADX WARNING: type inference failed for: r3v10, types: [com.google.android.gms.internal.icing.zzfd<?, ?>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzeh(int[] r6, int[] r7, java.lang.Object[] r8, int r9, int r10, com.google.android.gms.internal.icing.zzee r11, boolean r12, boolean r13, int[] r14, int r15, int r16, com.google.android.gms.internal.icing.zzej r17, com.google.android.gms.internal.icing.zzds r18, com.google.android.gms.internal.icing.zzfd<?, ?> r19, com.google.android.gms.internal.icing.zzcq<?> r20, com.google.android.gms.internal.icing.zzdz r21) {
        /*
            r5 = this;
            r0 = r5
            r1 = r10
            r2 = r19
            r5.<init>()
            r3 = r6
            r0.f40918a = r3
            r3 = r7
            r0.f40919b = r3
            r3 = r11
            r0.f40922e = r3
            r3 = 0
            if (r2 == 0) goto L_0x001a
            boolean r4 = r2.mo50288a(r10)
            if (r4 == 0) goto L_0x001a
            r3 = 1
        L_0x001a:
            r0.f40921d = r3
            r3 = r13
            r0.f40923f = r3
            r3 = r14
            r0.f40924g = r3
            r3 = r15
            r0.f40925h = r3
            r3 = r16
            r0.f40929l = r3
            r3 = r17
            r0.f40926i = r3
            r3 = r18
            r0.f40927j = r3
            r0.f40928k = r2
            r0.f40920c = r1
            r1 = r20
            r0.f40930m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.zzeh.<init>(int[], java.lang.Object[], int, int, com.google.android.gms.internal.icing.zzee, boolean, boolean, int[], int, int, com.google.android.gms.internal.icing.zzej, com.google.android.gms.internal.icing.zzds, com.google.android.gms.internal.icing.zzfd, com.google.android.gms.internal.icing.zzcq, com.google.android.gms.internal.icing.zzdz, byte[]):void");
    }

    /* renamed from: A */
    private static <T> float m58880A(T t, long j) {
        return ((Float) zzfn.m59087s(t, j)).floatValue();
    }

    /* renamed from: B */
    private static <T> int m58881B(T t, long j) {
        return ((Integer) zzfn.m59087s(t, j)).intValue();
    }

    /* renamed from: C */
    private static <T> long m58882C(T t, long j) {
        return ((Long) zzfn.m59087s(t, j)).longValue();
    }

    /* renamed from: D */
    private static <T> boolean m58883D(T t, long j) {
        return ((Boolean) zzfn.m59087s(t, j)).booleanValue();
    }

    /* renamed from: E */
    private final boolean m58884E(T t, T t2, int i) {
        return m58885g(t, i) == m58885g(t2, i);
    }

    /* renamed from: g */
    private final boolean m58885g(T t, int i) {
        int x = m58902x(i);
        long j = (long) (x & 1048575);
        if (j != 1048575) {
            return (zzfn.m59077i(t, j) & (1 << (x >>> 20))) != 0;
        }
        int w = m58901w(i);
        long j2 = (long) (w & 1048575);
        switch (m58903y(w)) {
            case 0:
                return zzfn.m59085q(t, j2) != 0.0d;
            case 1:
                return zzfn.m59083o(t, j2) != 0.0f;
            case 2:
                return zzfn.m59079k(t, j2) != 0;
            case 3:
                return zzfn.m59079k(t, j2) != 0;
            case 4:
                return zzfn.m59077i(t, j2) != 0;
            case 5:
                return zzfn.m59079k(t, j2) != 0;
            case 6:
                return zzfn.m59077i(t, j2) != 0;
            case 7:
                return zzfn.m59081m(t, j2);
            case 8:
                Object s = zzfn.m59087s(t, j2);
                if (s instanceof String) {
                    return !((String) s).isEmpty();
                }
                if (s instanceof zzcf) {
                    return !zzcf.f40792a.equals(s);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzfn.m59087s(t, j2) != null;
            case 10:
                return !zzcf.f40792a.equals(zzfn.m59087s(t, j2));
            case 11:
                return zzfn.m59077i(t, j2) != 0;
            case 12:
                return zzfn.m59077i(t, j2) != 0;
            case 13:
                return zzfn.m59077i(t, j2) != 0;
            case 14:
                return zzfn.m59079k(t, j2) != 0;
            case 15:
                return zzfn.m59077i(t, j2) != 0;
            case 16:
                return zzfn.m59079k(t, j2) != 0;
            case 17:
                return zzfn.m59087s(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: h */
    private final void m58886h(T t, int i) {
        int x = m58902x(i);
        long j = (long) (1048575 & x);
        if (j != 1048575) {
            zzfn.m59078j(t, j, (1 << (x >>> 20)) | zzfn.m59077i(t, j));
        }
    }

    /* renamed from: i */
    private final boolean m58887i(T t, int i, int i2) {
        return zzfn.m59077i(t, (long) (m58902x(i2) & 1048575)) == i;
    }

    /* renamed from: j */
    private final void m58888j(T t, int i, int i2) {
        zzfn.m59078j(t, (long) (m58902x(i2) & 1048575), i);
    }

    /* renamed from: k */
    private final void m58889k(T t, zzcn zzcn) throws IOException {
        int i;
        T t2 = t;
        zzcn zzcn2 = zzcn;
        if (!this.f40921d) {
            int length = this.f40918a.length;
            Unsafe unsafe = f40917o;
            int i2 = 1048575;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1048575;
            while (i3 < length) {
                int w = m58901w(i3);
                int i6 = this.f40918a[i3];
                int y = m58903y(w);
                if (y <= 17) {
                    int i7 = this.f40918a[i3 + 2];
                    int i8 = i7 & i2;
                    if (i8 != i5) {
                        i4 = unsafe.getInt(t2, (long) i8);
                        i5 = i8;
                    }
                    i = 1 << (i7 >>> 20);
                } else {
                    i = 0;
                }
                long j = (long) (w & i2);
                switch (y) {
                    case 0:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zzcn2.mo50271o(i6, zzfn.m59085q(t2, j));
                            continue;
                        }
                    case 1:
                        if ((i4 & i) != 0) {
                            zzcn2.mo50270n(i6, zzfn.m59083o(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i4 & i) != 0) {
                            zzcn2.mo50268l(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i4 & i) != 0) {
                            zzcn2.mo50273q(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i4 & i) != 0) {
                            zzcn2.mo50274r(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i4 & i) != 0) {
                            zzcn2.mo50275s(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i4 & i) != 0) {
                            zzcn2.mo50276t(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i4 & i) != 0) {
                            zzcn2.mo50277u(i6, zzfn.m59081m(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i4 & i) != 0) {
                            m58891m(i6, unsafe.getObject(t2, j), zzcn2);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i4 & i) != 0) {
                            zzcn2.mo50249A(i6, unsafe.getObject(t2, j), m58899u(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i4 & i) != 0) {
                            zzcn2.mo50279w(i6, (zzcf) unsafe.getObject(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i4 & i) != 0) {
                            zzcn2.mo50280x(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i4 & i) != 0) {
                            zzcn2.mo50272p(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i4 & i) != 0) {
                            zzcn2.mo50267k(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i4 & i) != 0) {
                            zzcn2.mo50269m(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i4 & i) != 0) {
                            zzcn2.mo50281y(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i4 & i) != 0) {
                            zzcn2.mo50282z(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i4 & i) != 0) {
                            zzcn2.mo50250B(i6, unsafe.getObject(t2, j), m58899u(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        zzer.m58969h(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        continue;
                    case 19:
                        zzer.m58970i(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        continue;
                    case 20:
                        zzer.m58971j(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        continue;
                    case 21:
                        zzer.m58972k(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        continue;
                    case 22:
                        zzer.m58976o(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        continue;
                    case 23:
                        zzer.m58974m(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        continue;
                    case 24:
                        zzer.m58979r(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        continue;
                    case 25:
                        zzer.m58982u(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        continue;
                    case 26:
                        zzer.m58983v(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2);
                        break;
                    case 27:
                        zzer.m58985x(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, m58899u(i3));
                        break;
                    case 28:
                        zzer.m58984w(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2);
                        break;
                    case 29:
                        zzer.m58977p(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        break;
                    case 30:
                        zzer.m58981t(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        break;
                    case 31:
                        zzer.m58980s(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        break;
                    case 32:
                        zzer.m58975n(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        break;
                    case 33:
                        zzer.m58978q(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        break;
                    case 34:
                        zzer.m58973l(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        break;
                    case 35:
                        zzer.m58969h(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 36:
                        zzer.m58970i(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 37:
                        zzer.m58971j(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 38:
                        zzer.m58972k(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 39:
                        zzer.m58976o(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 40:
                        zzer.m58974m(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 41:
                        zzer.m58979r(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 42:
                        zzer.m58982u(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 43:
                        zzer.m58977p(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 44:
                        zzer.m58981t(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 45:
                        zzer.m58980s(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 46:
                        zzer.m58975n(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 47:
                        zzer.m58978q(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 48:
                        zzer.m58973l(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 49:
                        zzer.m58986y(this.f40918a[i3], (List) unsafe.getObject(t2, j), zzcn2, m58899u(i3));
                        break;
                    case 50:
                        m58890l(zzcn2, i6, unsafe.getObject(t2, j), i3);
                        break;
                    case 51:
                        if (m58887i(t2, i6, i3)) {
                            zzcn2.mo50271o(i6, m58904z(t2, j));
                            break;
                        }
                        break;
                    case 52:
                        if (m58887i(t2, i6, i3)) {
                            zzcn2.mo50270n(i6, m58880A(t2, j));
                            break;
                        }
                        break;
                    case 53:
                        if (m58887i(t2, i6, i3)) {
                            zzcn2.mo50268l(i6, m58882C(t2, j));
                            break;
                        }
                        break;
                    case 54:
                        if (m58887i(t2, i6, i3)) {
                            zzcn2.mo50273q(i6, m58882C(t2, j));
                            break;
                        }
                        break;
                    case 55:
                        if (m58887i(t2, i6, i3)) {
                            zzcn2.mo50274r(i6, m58881B(t2, j));
                            break;
                        }
                        break;
                    case 56:
                        if (m58887i(t2, i6, i3)) {
                            zzcn2.mo50275s(i6, m58882C(t2, j));
                            break;
                        }
                        break;
                    case 57:
                        if (m58887i(t2, i6, i3)) {
                            zzcn2.mo50276t(i6, m58881B(t2, j));
                            break;
                        }
                        break;
                    case 58:
                        if (m58887i(t2, i6, i3)) {
                            zzcn2.mo50277u(i6, m58883D(t2, j));
                            break;
                        }
                        break;
                    case 59:
                        if (m58887i(t2, i6, i3)) {
                            m58891m(i6, unsafe.getObject(t2, j), zzcn2);
                            break;
                        }
                        break;
                    case 60:
                        if (m58887i(t2, i6, i3)) {
                            zzcn2.mo50249A(i6, unsafe.getObject(t2, j), m58899u(i3));
                            break;
                        }
                        break;
                    case 61:
                        if (m58887i(t2, i6, i3)) {
                            zzcn2.mo50279w(i6, (zzcf) unsafe.getObject(t2, j));
                            break;
                        }
                        break;
                    case 62:
                        if (m58887i(t2, i6, i3)) {
                            zzcn2.mo50280x(i6, m58881B(t2, j));
                            break;
                        }
                        break;
                    case 63:
                        if (m58887i(t2, i6, i3)) {
                            zzcn2.mo50272p(i6, m58881B(t2, j));
                            break;
                        }
                        break;
                    case 64:
                        if (m58887i(t2, i6, i3)) {
                            zzcn2.mo50267k(i6, m58881B(t2, j));
                            break;
                        }
                        break;
                    case 65:
                        if (m58887i(t2, i6, i3)) {
                            zzcn2.mo50269m(i6, m58882C(t2, j));
                            break;
                        }
                        break;
                    case 66:
                        if (m58887i(t2, i6, i3)) {
                            zzcn2.mo50281y(i6, m58881B(t2, j));
                            break;
                        }
                        break;
                    case 67:
                        if (m58887i(t2, i6, i3)) {
                            zzcn2.mo50282z(i6, m58882C(t2, j));
                            break;
                        }
                        break;
                    case 68:
                        if (m58887i(t2, i6, i3)) {
                            zzcn2.mo50250B(i6, unsafe.getObject(t2, j), m58899u(i3));
                            break;
                        }
                        break;
                }
                i3 += 3;
                i2 = 1048575;
            }
            zzfd<?, ?> zzfd = this.f40927j;
            zzfd.mo50409g(zzfd.mo50404b(t2), zzcn2);
            return;
        }
        this.f40928k.mo50289b(t2);
        throw null;
    }

    /* renamed from: l */
    private final <K, V> void m58890l(zzcn zzcn, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzdx zzdx = (zzdx) m58900v(i2);
            throw null;
        }
    }

    /* renamed from: m */
    private static final void m58891m(int i, Object obj, zzcn zzcn) throws IOException {
        if (obj instanceof String) {
            zzcn.mo50278v(i, (String) obj);
        } else {
            zzcn.mo50279w(i, (zzcf) obj);
        }
    }

    /* renamed from: n */
    static <T> zzeh<T> m58892n(Class<T> cls, zzeb zzeb, zzej zzej, zzds zzds, zzfd<?, ?> zzfd, zzcq<?> zzcq, zzdz zzdz) {
        if (zzeb instanceof zzeo) {
            return m58893o((zzeo) zzeb, zzej, zzds, zzfd, zzcq, zzdz);
        }
        zzfa zzfa = (zzfa) zzeb;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0378  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.icing.zzeh<T> m58893o(com.google.android.gms.internal.icing.zzeo r34, com.google.android.gms.internal.icing.zzej r35, com.google.android.gms.internal.icing.zzds r36, com.google.android.gms.internal.icing.zzfd<?, ?> r37, com.google.android.gms.internal.icing.zzcq<?> r38, com.google.android.gms.internal.icing.zzdz r39) {
        /*
            int r0 = r34.mo50353a()
            r1 = 0
            r3 = 2
            if (r0 != r3) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = 0
        L_0x000b:
            java.lang.String r0 = r34.mo50365b()
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
            int[] r6 = f40916n
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
            sun.misc.Unsafe r15 = f40917o
            java.lang.Object[] r17 = r34.mo50366c()
            com.google.android.gms.internal.icing.zzee r18 = r34.zzb()
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
            java.lang.reflect.Field r12 = m58894p(r1, r12)
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
            java.lang.reflect.Field r7 = m58894p(r1, r7)
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
            java.lang.reflect.Field r8 = m58894p(r1, r8)
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
            java.lang.reflect.Field r11 = m58894p(r1, r11)
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
            com.google.android.gms.internal.icing.zzeh r0 = new com.google.android.gms.internal.icing.zzeh
            r4 = r0
            com.google.android.gms.internal.icing.zzee r9 = r34.zzb()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.zzeh.m58893o(com.google.android.gms.internal.icing.zzeo, com.google.android.gms.internal.icing.zzej, com.google.android.gms.internal.icing.zzds, com.google.android.gms.internal.icing.zzfd, com.google.android.gms.internal.icing.zzcq, com.google.android.gms.internal.icing.zzdz):com.google.android.gms.internal.icing.zzeh");
    }

    /* renamed from: p */
    private static Field m58894p(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: q */
    private final void m58895q(T t, T t2, int i) {
        long w = (long) (m58901w(i) & 1048575);
        if (m58885g(t2, i)) {
            Object s = zzfn.m59087s(t, w);
            Object s2 = zzfn.m59087s(t2, w);
            if (s != null && s2 != null) {
                zzfn.m59088t(t, w, zzdh.m58824i(s, s2));
                m58886h(t, i);
            } else if (s2 != null) {
                zzfn.m59088t(t, w, s2);
                m58886h(t, i);
            }
        }
    }

    /* renamed from: r */
    private final void m58896r(T t, T t2, int i) {
        int w = m58901w(i);
        int i2 = this.f40918a[i];
        long j = (long) (w & 1048575);
        if (m58887i(t2, i2, i)) {
            Object s = m58887i(t, i2, i) ? zzfn.m59087s(t, j) : null;
            Object s2 = zzfn.m59087s(t2, j);
            if (s != null && s2 != null) {
                zzfn.m59088t(t, j, zzdh.m58824i(s, s2));
                m58888j(t, i2, i);
            } else if (s2 != null) {
                zzfn.m59088t(t, j, s2);
                m58888j(t, i2, i);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0304, code lost:
        r8 = r8 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x046b, code lost:
        r8 = r8 + (r9 + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04b5, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04e0, code lost:
        r8 = r8 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04e1, code lost:
        r4 = r4 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0508, code lost:
        r7 = r7 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0515, code lost:
        r7 = r7 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0523, code lost:
        r7 = r7 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0527, code lost:
        r3 = r3 + 3;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m58897s(T r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = f40917o
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x000c:
            int[] r7 = r14.f40918a
            int r7 = r7.length
            if (r3 >= r7) goto L_0x052b
            int r7 = r14.m58901w(r3)
            int[] r8 = r14.f40918a
            r8 = r8[r3]
            int r9 = m58903y(r7)
            r10 = 17
            r11 = 1
            if (r9 > r10) goto L_0x0037
            int[] r10 = r14.f40918a
            int r12 = r3 + 2
            r10 = r10[r12]
            r12 = r10 & r1
            int r10 = r10 >>> 20
            int r10 = r11 << r10
            if (r12 == r6) goto L_0x0038
            long r5 = (long) r12
            int r5 = r0.getInt(r15, r5)
            r6 = r12
            goto L_0x0038
        L_0x0037:
            r10 = 0
        L_0x0038:
            r7 = r7 & r1
            long r12 = (long) r7
            r7 = 63
            switch(r9) {
                case 0: goto L_0x0519;
                case 1: goto L_0x050b;
                case 2: goto L_0x04f6;
                case 3: goto L_0x04e3;
                case 4: goto L_0x04ce;
                case 5: goto L_0x04c3;
                case 6: goto L_0x04b8;
                case 7: goto L_0x04ab;
                case 8: goto L_0x0481;
                case 9: goto L_0x046f;
                case 10: goto L_0x0453;
                case 11: goto L_0x043f;
                case 12: goto L_0x042b;
                case 13: goto L_0x041f;
                case 14: goto L_0x0413;
                case 15: goto L_0x03fa;
                case 16: goto L_0x03e2;
                case 17: goto L_0x03cf;
                case 18: goto L_0x03c2;
                case 19: goto L_0x03b7;
                case 20: goto L_0x03ac;
                case 21: goto L_0x03a1;
                case 22: goto L_0x0396;
                case 23: goto L_0x038b;
                case 24: goto L_0x0380;
                case 25: goto L_0x0375;
                case 26: goto L_0x036a;
                case 27: goto L_0x035b;
                case 28: goto L_0x034f;
                case 29: goto L_0x0343;
                case 30: goto L_0x0337;
                case 31: goto L_0x032b;
                case 32: goto L_0x031f;
                case 33: goto L_0x0313;
                case 34: goto L_0x0307;
                case 35: goto L_0x02f0;
                case 36: goto L_0x02db;
                case 37: goto L_0x02c6;
                case 38: goto L_0x02b1;
                case 39: goto L_0x029c;
                case 40: goto L_0x0287;
                case 41: goto L_0x0271;
                case 42: goto L_0x025b;
                case 43: goto L_0x0245;
                case 44: goto L_0x022f;
                case 45: goto L_0x0219;
                case 46: goto L_0x0203;
                case 47: goto L_0x01ed;
                case 48: goto L_0x01d7;
                case 49: goto L_0x01c7;
                case 50: goto L_0x01ba;
                case 51: goto L_0x01ac;
                case 52: goto L_0x019e;
                case 53: goto L_0x0188;
                case 54: goto L_0x0172;
                case 55: goto L_0x015c;
                case 56: goto L_0x014e;
                case 57: goto L_0x0140;
                case 58: goto L_0x0132;
                case 59: goto L_0x0104;
                case 60: goto L_0x00f0;
                case 61: goto L_0x00d4;
                case 62: goto L_0x00be;
                case 63: goto L_0x00a8;
                case 64: goto L_0x009a;
                case 65: goto L_0x008c;
                case 66: goto L_0x0071;
                case 67: goto L_0x0057;
                case 68: goto L_0x0041;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x0527
        L_0x0041:
            boolean r7 = r14.m58887i(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.icing.zzee r7 = (com.google.android.gms.internal.icing.zzee) r7
            com.google.android.gms.internal.icing.zzep r9 = r14.m58899u(r3)
            int r7 = com.google.android.gms.internal.icing.zzcm.m58705e(r8, r7, r9)
            goto L_0x03cc
        L_0x0057:
            boolean r9 = r14.m58887i(r15, r8, r3)
            if (r9 == 0) goto L_0x0527
            long r9 = m58882C(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.m58699A(r8)
            long r11 = r9 + r9
            long r9 = r9 >> r7
            long r9 = r9 ^ r11
            int r7 = com.google.android.gms.internal.icing.zzcm.m58700B(r9)
            goto L_0x04e0
        L_0x0071:
            boolean r7 = r14.m58887i(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = m58881B(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.m58699A(r8)
            int r9 = r7 + r7
            int r7 = r7 >> 31
            r7 = r7 ^ r9
            int r7 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x04e0
        L_0x008c:
            boolean r7 = r14.m58887i(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x0523
        L_0x009a:
            boolean r7 = r14.m58887i(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x0515
        L_0x00a8:
            boolean r7 = r14.m58887i(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = m58881B(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.m58699A(r8)
            int r7 = com.google.android.gms.internal.icing.zzcm.m58709z(r7)
            goto L_0x04e0
        L_0x00be:
            boolean r7 = r14.m58887i(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = m58881B(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.m58699A(r8)
            int r7 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x04e0
        L_0x00d4:
            boolean r7 = r14.m58887i(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.icing.zzcf r7 = (com.google.android.gms.internal.icing.zzcf) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.m58699A(r8)
            int r7 = r7.mo50214f()
            int r9 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x046b
        L_0x00f0:
            boolean r7 = r14.m58887i(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.icing.zzep r9 = r14.m58899u(r3)
            int r7 = com.google.android.gms.internal.icing.zzer.m58958W(r8, r7, r9)
            goto L_0x03cc
        L_0x0104:
            boolean r7 = r14.m58887i(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.icing.zzcf
            if (r9 == 0) goto L_0x0124
            com.google.android.gms.internal.icing.zzcf r7 = (com.google.android.gms.internal.icing.zzcf) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.m58699A(r8)
            int r7 = r7.mo50214f()
            int r9 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x046b
        L_0x0124:
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.m58699A(r8)
            int r7 = com.google.android.gms.internal.icing.zzcm.m58701C(r7)
            goto L_0x04e0
        L_0x0132:
            boolean r7 = r14.m58887i(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x04b5
        L_0x0140:
            boolean r7 = r14.m58887i(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x0515
        L_0x014e:
            boolean r7 = r14.m58887i(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x0523
        L_0x015c:
            boolean r7 = r14.m58887i(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = m58881B(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.m58699A(r8)
            int r7 = com.google.android.gms.internal.icing.zzcm.m58709z(r7)
            goto L_0x04e0
        L_0x0172:
            boolean r7 = r14.m58887i(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            long r9 = m58882C(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            int r8 = com.google.android.gms.internal.icing.zzcm.m58700B(r9)
            goto L_0x0508
        L_0x0188:
            boolean r7 = r14.m58887i(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            long r9 = m58882C(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            int r8 = com.google.android.gms.internal.icing.zzcm.m58700B(r9)
            goto L_0x0508
        L_0x019e:
            boolean r7 = r14.m58887i(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x0515
        L_0x01ac:
            boolean r7 = r14.m58887i(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x0523
        L_0x01ba:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.lang.Object r9 = r14.m58900v(r3)
            com.google.android.gms.internal.icing.zzdz.m58863a(r8, r7, r9)
            goto L_0x0527
        L_0x01c7:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.icing.zzep r9 = r14.m58899u(r3)
            int r7 = com.google.android.gms.internal.icing.zzer.m58961Z(r8, r7, r9)
            goto L_0x03cc
        L_0x01d7:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58941F(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.icing.zzcm.m58708y(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x0304
        L_0x01ed:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58949N(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.icing.zzcm.m58708y(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x0304
        L_0x0203:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58953R(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.icing.zzcm.m58708y(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x0304
        L_0x0219:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58951P(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.icing.zzcm.m58708y(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x0304
        L_0x022f:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58943H(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.icing.zzcm.m58708y(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x0304
        L_0x0245:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58947L(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.icing.zzcm.m58708y(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x0304
        L_0x025b:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58955T(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.icing.zzcm.m58708y(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x0304
        L_0x0271:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58951P(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.icing.zzcm.m58708y(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x0304
        L_0x0287:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58953R(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.icing.zzcm.m58708y(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x0304
        L_0x029c:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58945J(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.icing.zzcm.m58708y(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x0304
        L_0x02b1:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58939D(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.icing.zzcm.m58708y(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x0304
        L_0x02c6:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58937B(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.icing.zzcm.m58708y(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x0304
        L_0x02db:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58951P(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.icing.zzcm.m58708y(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x0304
        L_0x02f0:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58953R(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.icing.zzcm.m58708y(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
        L_0x0304:
            int r8 = r8 + r9
            goto L_0x04e0
        L_0x0307:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58942G(r8, r7, r2)
            goto L_0x03cc
        L_0x0313:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58950O(r8, r7, r2)
            goto L_0x03cc
        L_0x031f:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58954S(r8, r7, r2)
            goto L_0x03cc
        L_0x032b:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58952Q(r8, r7, r2)
            goto L_0x03cc
        L_0x0337:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58944I(r8, r7, r2)
            goto L_0x03cc
        L_0x0343:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58948M(r8, r7, r2)
            goto L_0x03cc
        L_0x034f:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58960Y(r8, r7)
            goto L_0x03cc
        L_0x035b:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.icing.zzep r9 = r14.m58899u(r3)
            int r7 = com.google.android.gms.internal.icing.zzer.m58959X(r8, r7, r9)
            goto L_0x03cc
        L_0x036a:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58957V(r8, r7)
            goto L_0x03cc
        L_0x0375:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58956U(r8, r7, r2)
            goto L_0x03cc
        L_0x0380:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58952Q(r8, r7, r2)
            goto L_0x03cc
        L_0x038b:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58954S(r8, r7, r2)
            goto L_0x03cc
        L_0x0396:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58946K(r8, r7, r2)
            goto L_0x03cc
        L_0x03a1:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58940E(r8, r7, r2)
            goto L_0x03cc
        L_0x03ac:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58938C(r8, r7, r2)
            goto L_0x03cc
        L_0x03b7:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58952Q(r8, r7, r2)
            goto L_0x03cc
        L_0x03c2:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.m58954S(r8, r7, r2)
        L_0x03cc:
            int r4 = r4 + r7
            goto L_0x0527
        L_0x03cf:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.icing.zzee r7 = (com.google.android.gms.internal.icing.zzee) r7
            com.google.android.gms.internal.icing.zzep r9 = r14.m58899u(r3)
            int r7 = com.google.android.gms.internal.icing.zzcm.m58705e(r8, r7, r9)
            goto L_0x03cc
        L_0x03e2:
            r9 = r5 & r10
            if (r9 == 0) goto L_0x0527
            long r9 = r0.getLong(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.m58699A(r8)
            long r11 = r9 + r9
            long r9 = r9 >> r7
            long r9 = r9 ^ r11
            int r7 = com.google.android.gms.internal.icing.zzcm.m58700B(r9)
            goto L_0x04e0
        L_0x03fa:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.m58699A(r8)
            int r9 = r7 + r7
            int r7 = r7 >> 31
            r7 = r7 ^ r9
            int r7 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x04e0
        L_0x0413:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x0523
        L_0x041f:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x0515
        L_0x042b:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.m58699A(r8)
            int r7 = com.google.android.gms.internal.icing.zzcm.m58709z(r7)
            goto L_0x04e0
        L_0x043f:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.m58699A(r8)
            int r7 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x04e0
        L_0x0453:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.icing.zzcf r7 = (com.google.android.gms.internal.icing.zzcf) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.m58699A(r8)
            int r7 = r7.mo50214f()
            int r9 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
        L_0x046b:
            int r9 = r9 + r7
            int r8 = r8 + r9
            goto L_0x04e1
        L_0x046f:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.icing.zzep r9 = r14.m58899u(r3)
            int r7 = com.google.android.gms.internal.icing.zzer.m58958W(r8, r7, r9)
            goto L_0x03cc
        L_0x0481:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.icing.zzcf
            if (r9 == 0) goto L_0x049e
            com.google.android.gms.internal.icing.zzcf r7 = (com.google.android.gms.internal.icing.zzcf) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.m58699A(r8)
            int r7 = r7.mo50214f()
            int r9 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x046b
        L_0x049e:
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.m58699A(r8)
            int r7 = com.google.android.gms.internal.icing.zzcm.m58701C(r7)
            goto L_0x04e0
        L_0x04ab:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
        L_0x04b5:
            int r7 = r7 + r11
            goto L_0x03cc
        L_0x04b8:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x0515
        L_0x04c3:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            goto L_0x0523
        L_0x04ce:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.m58699A(r8)
            int r7 = com.google.android.gms.internal.icing.zzcm.m58709z(r7)
        L_0x04e0:
            int r8 = r8 + r7
        L_0x04e1:
            int r4 = r4 + r8
            goto L_0x0527
        L_0x04e3:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            long r9 = r0.getLong(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            int r8 = com.google.android.gms.internal.icing.zzcm.m58700B(r9)
            goto L_0x0508
        L_0x04f6:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            long r9 = r0.getLong(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
            int r8 = com.google.android.gms.internal.icing.zzcm.m58700B(r9)
        L_0x0508:
            int r7 = r7 + r8
            goto L_0x03cc
        L_0x050b:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
        L_0x0515:
            int r7 = r7 + 4
            goto L_0x03cc
        L_0x0519:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.m58699A(r7)
        L_0x0523:
            int r7 = r7 + 8
            goto L_0x03cc
        L_0x0527:
            int r3 = r3 + 3
            goto L_0x000c
        L_0x052b:
            com.google.android.gms.internal.icing.zzfd<?, ?> r0 = r14.f40927j
            java.lang.Object r1 = r0.mo50404b(r15)
            int r0 = r0.mo50408f(r1)
            int r4 = r4 + r0
            boolean r0 = r14.f40921d
            if (r0 != 0) goto L_0x053b
            return r4
        L_0x053b:
            com.google.android.gms.internal.icing.zzcq<?> r0 = r14.f40928k
            r0.mo50289b(r15)
            r15 = 0
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.zzeh.m58897s(java.lang.Object):int");
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
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m58898t(T r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f40917o
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0005:
            int[] r4 = r11.f40918a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0549
            int r4 = r11.m58901w(r2)
            int r5 = m58903y(r4)
            int[] r6 = r11.f40918a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            com.google.android.gms.internal.icing.zzcv r4 = com.google.android.gms.internal.icing.zzcv.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.icing.zzcv r4 = com.google.android.gms.internal.icing.zzcv.SINT64_LIST_PACKED
            int r4 = r4.zza()
            if (r5 > r4) goto L_0x0031
            int[] r4 = r11.f40918a
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
            boolean r4 = r11.m58887i(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            com.google.android.gms.internal.icing.zzee r4 = (com.google.android.gms.internal.icing.zzee) r4
            com.google.android.gms.internal.icing.zzep r5 = r11.m58899u(r2)
            int r4 = com.google.android.gms.internal.icing.zzcm.m58705e(r6, r4, r5)
            goto L_0x03c4
        L_0x004e:
            boolean r5 = r11.m58887i(r12, r6, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = m58882C(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.m58699A(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.icing.zzcm.m58700B(r6)
            goto L_0x04f6
        L_0x0069:
            boolean r4 = r11.m58887i(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m58881B(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.m58699A(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x04f6
        L_0x0084:
            boolean r4 = r11.m58887i(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x0541
        L_0x0092:
            boolean r4 = r11.m58887i(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x0531
        L_0x00a0:
            boolean r4 = r11.m58887i(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m58881B(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.m58699A(r5)
            int r4 = com.google.android.gms.internal.icing.zzcm.m58709z(r4)
            goto L_0x04f6
        L_0x00b6:
            boolean r4 = r11.m58887i(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m58881B(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.m58699A(r5)
            int r4 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x04f6
        L_0x00cc:
            boolean r4 = r11.m58887i(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            com.google.android.gms.internal.icing.zzcf r4 = (com.google.android.gms.internal.icing.zzcf) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.m58699A(r5)
            int r4 = r4.mo50214f()
            int r6 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x0474
        L_0x00e8:
            boolean r4 = r11.m58887i(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            com.google.android.gms.internal.icing.zzep r5 = r11.m58899u(r2)
            int r4 = com.google.android.gms.internal.icing.zzer.m58958W(r6, r4, r5)
            goto L_0x03c4
        L_0x00fc:
            boolean r4 = r11.m58887i(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.icing.zzcf
            if (r5 == 0) goto L_0x011c
            com.google.android.gms.internal.icing.zzcf r4 = (com.google.android.gms.internal.icing.zzcf) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.m58699A(r5)
            int r4 = r4.mo50214f()
            int r6 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x0474
        L_0x011c:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.m58699A(r5)
            int r4 = com.google.android.gms.internal.icing.zzcm.m58701C(r4)
            goto L_0x04f6
        L_0x012a:
            boolean r4 = r11.m58887i(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x04c4
        L_0x0138:
            boolean r4 = r11.m58887i(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x0531
        L_0x0146:
            boolean r4 = r11.m58887i(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x0541
        L_0x0154:
            boolean r4 = r11.m58887i(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m58881B(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.m58699A(r5)
            int r4 = com.google.android.gms.internal.icing.zzcm.m58709z(r4)
            goto L_0x04f6
        L_0x016a:
            boolean r4 = r11.m58887i(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m58882C(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.icing.zzcm.m58699A(r6)
            int r4 = com.google.android.gms.internal.icing.zzcm.m58700B(r4)
            goto L_0x0522
        L_0x0180:
            boolean r4 = r11.m58887i(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m58882C(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.icing.zzcm.m58699A(r6)
            int r4 = com.google.android.gms.internal.icing.zzcm.m58700B(r4)
            goto L_0x0522
        L_0x0196:
            boolean r4 = r11.m58887i(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x0531
        L_0x01a4:
            boolean r4 = r11.m58887i(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x0541
        L_0x01b2:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            java.lang.Object r5 = r11.m58900v(r2)
            com.google.android.gms.internal.icing.zzdz.m58863a(r6, r4, r5)
            goto L_0x0545
        L_0x01bf:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.icing.zzep r5 = r11.m58899u(r2)
            int r4 = com.google.android.gms.internal.icing.zzer.m58961Z(r6, r4, r5)
            goto L_0x03c4
        L_0x01cf:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58941F(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.icing.zzcm.m58708y(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x02fc
        L_0x01e5:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58949N(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.icing.zzcm.m58708y(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x02fc
        L_0x01fb:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58953R(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.icing.zzcm.m58708y(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x02fc
        L_0x0211:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58951P(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.icing.zzcm.m58708y(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x02fc
        L_0x0227:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58943H(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.icing.zzcm.m58708y(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x02fc
        L_0x023d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58947L(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.icing.zzcm.m58708y(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x02fc
        L_0x0253:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58955T(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.icing.zzcm.m58708y(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x02fc
        L_0x0269:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58951P(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.icing.zzcm.m58708y(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x02fc
        L_0x027f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58953R(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.icing.zzcm.m58708y(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x02fc
        L_0x0294:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58945J(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.icing.zzcm.m58708y(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x02fc
        L_0x02a9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58939D(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.icing.zzcm.m58708y(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x02fc
        L_0x02be:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58937B(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.icing.zzcm.m58708y(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x02fc
        L_0x02d3:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58951P(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.icing.zzcm.m58708y(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x02fc
        L_0x02e8:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58953R(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.icing.zzcm.m58708y(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
        L_0x02fc:
            int r5 = r5 + r6
            goto L_0x04f6
        L_0x02ff:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58942G(r6, r4, r1)
            goto L_0x03c4
        L_0x030b:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58950O(r6, r4, r1)
            goto L_0x03c4
        L_0x0317:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58954S(r6, r4, r1)
            goto L_0x03c4
        L_0x0323:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58952Q(r6, r4, r1)
            goto L_0x03c4
        L_0x032f:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58944I(r6, r4, r1)
            goto L_0x03c4
        L_0x033b:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58948M(r6, r4, r1)
            goto L_0x03c4
        L_0x0347:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58960Y(r6, r4)
            goto L_0x03c4
        L_0x0353:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.icing.zzep r5 = r11.m58899u(r2)
            int r4 = com.google.android.gms.internal.icing.zzer.m58959X(r6, r4, r5)
            goto L_0x03c4
        L_0x0362:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58957V(r6, r4)
            goto L_0x03c4
        L_0x036d:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58956U(r6, r4, r1)
            goto L_0x03c4
        L_0x0378:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58952Q(r6, r4, r1)
            goto L_0x03c4
        L_0x0383:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58954S(r6, r4, r1)
            goto L_0x03c4
        L_0x038e:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58946K(r6, r4, r1)
            goto L_0x03c4
        L_0x0399:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58940E(r6, r4, r1)
            goto L_0x03c4
        L_0x03a4:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58938C(r6, r4, r1)
            goto L_0x03c4
        L_0x03af:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58952Q(r6, r4, r1)
            goto L_0x03c4
        L_0x03ba:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.m58954S(r6, r4, r1)
        L_0x03c4:
            int r3 = r3 + r4
            goto L_0x0545
        L_0x03c7:
            boolean r4 = r11.m58885g(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            com.google.android.gms.internal.icing.zzee r4 = (com.google.android.gms.internal.icing.zzee) r4
            com.google.android.gms.internal.icing.zzep r5 = r11.m58899u(r2)
            int r4 = com.google.android.gms.internal.icing.zzcm.m58705e(r6, r4, r5)
            goto L_0x03c4
        L_0x03dc:
            boolean r5 = r11.m58885g(r12, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = com.google.android.gms.internal.icing.zzfn.m59079k(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.m58699A(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.icing.zzcm.m58700B(r6)
            goto L_0x04f6
        L_0x03f7:
            boolean r4 = r11.m58885g(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.icing.zzfn.m59077i(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.m58699A(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x04f6
        L_0x0412:
            boolean r4 = r11.m58885g(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x0541
        L_0x0420:
            boolean r4 = r11.m58885g(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x0531
        L_0x042e:
            boolean r4 = r11.m58885g(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.icing.zzfn.m59077i(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.m58699A(r5)
            int r4 = com.google.android.gms.internal.icing.zzcm.m58709z(r4)
            goto L_0x04f6
        L_0x0444:
            boolean r4 = r11.m58885g(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.icing.zzfn.m59077i(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.m58699A(r5)
            int r4 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x04f6
        L_0x045a:
            boolean r4 = r11.m58885g(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            com.google.android.gms.internal.icing.zzcf r4 = (com.google.android.gms.internal.icing.zzcf) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.m58699A(r5)
            int r4 = r4.mo50214f()
            int r6 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
        L_0x0474:
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L_0x04f7
        L_0x0478:
            boolean r4 = r11.m58885g(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            com.google.android.gms.internal.icing.zzep r5 = r11.m58899u(r2)
            int r4 = com.google.android.gms.internal.icing.zzer.m58958W(r6, r4, r5)
            goto L_0x03c4
        L_0x048c:
            boolean r4 = r11.m58885g(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.m59087s(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.icing.zzcf
            if (r5 == 0) goto L_0x04ab
            com.google.android.gms.internal.icing.zzcf r4 = (com.google.android.gms.internal.icing.zzcf) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.m58699A(r5)
            int r4 = r4.mo50214f()
            int r6 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x0474
        L_0x04ab:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.m58699A(r5)
            int r4 = com.google.android.gms.internal.icing.zzcm.m58701C(r4)
            goto L_0x04f6
        L_0x04b8:
            boolean r4 = r11.m58885g(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
        L_0x04c4:
            int r4 = r4 + 1
            goto L_0x03c4
        L_0x04c8:
            boolean r4 = r11.m58885g(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x0531
        L_0x04d5:
            boolean r4 = r11.m58885g(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
            goto L_0x0541
        L_0x04e2:
            boolean r4 = r11.m58885g(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.icing.zzfn.m59077i(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.m58699A(r5)
            int r4 = com.google.android.gms.internal.icing.zzcm.m58709z(r4)
        L_0x04f6:
            int r5 = r5 + r4
        L_0x04f7:
            int r3 = r3 + r5
            goto L_0x0545
        L_0x04f9:
            boolean r4 = r11.m58885g(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = com.google.android.gms.internal.icing.zzfn.m59079k(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.icing.zzcm.m58699A(r6)
            int r4 = com.google.android.gms.internal.icing.zzcm.m58700B(r4)
            goto L_0x0522
        L_0x050e:
            boolean r4 = r11.m58885g(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = com.google.android.gms.internal.icing.zzfn.m59079k(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.icing.zzcm.m58699A(r6)
            int r4 = com.google.android.gms.internal.icing.zzcm.m58700B(r4)
        L_0x0522:
            int r6 = r6 + r4
            int r3 = r3 + r6
            goto L_0x0545
        L_0x0525:
            boolean r4 = r11.m58885g(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
        L_0x0531:
            int r4 = r4 + 4
            goto L_0x03c4
        L_0x0535:
            boolean r4 = r11.m58885g(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.m58699A(r4)
        L_0x0541:
            int r4 = r4 + 8
            goto L_0x03c4
        L_0x0545:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0549:
            com.google.android.gms.internal.icing.zzfd<?, ?> r0 = r11.f40927j
            java.lang.Object r12 = r0.mo50404b(r12)
            int r12 = r0.mo50408f(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.zzeh.m58898t(java.lang.Object):int");
    }

    /* renamed from: u */
    private final zzep m58899u(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzep zzep = (zzep) this.f40919b[i3];
        if (zzep != null) {
            return zzep;
        }
        zzep b = zzem.m58920a().mo50362b((Class) this.f40919b[i3 + 1]);
        this.f40919b[i3] = b;
        return b;
    }

    /* renamed from: v */
    private final Object m58900v(int i) {
        int i2 = i / 3;
        return this.f40919b[i2 + i2];
    }

    /* renamed from: w */
    private final int m58901w(int i) {
        return this.f40918a[i + 1];
    }

    /* renamed from: x */
    private final int m58902x(int i) {
        return this.f40918a[i + 2];
    }

    /* renamed from: y */
    private static int m58903y(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: z */
    private static <T> double m58904z(T t, long j) {
        return ((Double) zzfn.m59087s(t, j)).doubleValue();
    }

    /* renamed from: a */
    public final int mo50356a(T t) {
        return this.f40922e ? m58898t(t) : m58897s(t);
    }

    /* renamed from: b */
    public final void mo50357b(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i = 0; i < this.f40918a.length; i += 3) {
            int w = m58901w(i);
            long j = (long) (1048575 & w);
            int i2 = this.f40918a[i];
            switch (m58903y(w)) {
                case 0:
                    if (!m58885g(t2, i)) {
                        break;
                    } else {
                        zzfn.m59086r(t, j, zzfn.m59085q(t2, j));
                        m58886h(t, i);
                        break;
                    }
                case 1:
                    if (!m58885g(t2, i)) {
                        break;
                    } else {
                        zzfn.m59084p(t, j, zzfn.m59083o(t2, j));
                        m58886h(t, i);
                        break;
                    }
                case 2:
                    if (!m58885g(t2, i)) {
                        break;
                    } else {
                        zzfn.m59080l(t, j, zzfn.m59079k(t2, j));
                        m58886h(t, i);
                        break;
                    }
                case 3:
                    if (!m58885g(t2, i)) {
                        break;
                    } else {
                        zzfn.m59080l(t, j, zzfn.m59079k(t2, j));
                        m58886h(t, i);
                        break;
                    }
                case 4:
                    if (!m58885g(t2, i)) {
                        break;
                    } else {
                        zzfn.m59078j(t, j, zzfn.m59077i(t2, j));
                        m58886h(t, i);
                        break;
                    }
                case 5:
                    if (!m58885g(t2, i)) {
                        break;
                    } else {
                        zzfn.m59080l(t, j, zzfn.m59079k(t2, j));
                        m58886h(t, i);
                        break;
                    }
                case 6:
                    if (!m58885g(t2, i)) {
                        break;
                    } else {
                        zzfn.m59078j(t, j, zzfn.m59077i(t2, j));
                        m58886h(t, i);
                        break;
                    }
                case 7:
                    if (!m58885g(t2, i)) {
                        break;
                    } else {
                        zzfn.m59082n(t, j, zzfn.m59081m(t2, j));
                        m58886h(t, i);
                        break;
                    }
                case 8:
                    if (!m58885g(t2, i)) {
                        break;
                    } else {
                        zzfn.m59088t(t, j, zzfn.m59087s(t2, j));
                        m58886h(t, i);
                        break;
                    }
                case 9:
                    m58895q(t, t2, i);
                    break;
                case 10:
                    if (!m58885g(t2, i)) {
                        break;
                    } else {
                        zzfn.m59088t(t, j, zzfn.m59087s(t2, j));
                        m58886h(t, i);
                        break;
                    }
                case 11:
                    if (!m58885g(t2, i)) {
                        break;
                    } else {
                        zzfn.m59078j(t, j, zzfn.m59077i(t2, j));
                        m58886h(t, i);
                        break;
                    }
                case 12:
                    if (!m58885g(t2, i)) {
                        break;
                    } else {
                        zzfn.m59078j(t, j, zzfn.m59077i(t2, j));
                        m58886h(t, i);
                        break;
                    }
                case 13:
                    if (!m58885g(t2, i)) {
                        break;
                    } else {
                        zzfn.m59078j(t, j, zzfn.m59077i(t2, j));
                        m58886h(t, i);
                        break;
                    }
                case 14:
                    if (!m58885g(t2, i)) {
                        break;
                    } else {
                        zzfn.m59080l(t, j, zzfn.m59079k(t2, j));
                        m58886h(t, i);
                        break;
                    }
                case 15:
                    if (!m58885g(t2, i)) {
                        break;
                    } else {
                        zzfn.m59078j(t, j, zzfn.m59077i(t2, j));
                        m58886h(t, i);
                        break;
                    }
                case 16:
                    if (!m58885g(t2, i)) {
                        break;
                    } else {
                        zzfn.m59080l(t, j, zzfn.m59079k(t2, j));
                        m58886h(t, i);
                        break;
                    }
                case 17:
                    m58895q(t, t2, i);
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
                    this.f40926i.mo50334b(t, t2, j);
                    break;
                case 50:
                    zzer.m58968g(this.f40930m, t, t2, j);
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
                    if (!m58887i(t2, i2, i)) {
                        break;
                    } else {
                        zzfn.m59088t(t, j, zzfn.m59087s(t2, j));
                        m58888j(t, i2, i);
                        break;
                    }
                case 60:
                    m58896r(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m58887i(t2, i2, i)) {
                        break;
                    } else {
                        zzfn.m59088t(t, j, zzfn.m59087s(t2, j));
                        m58888j(t, i2, i);
                        break;
                    }
                case 68:
                    m58896r(t, t2, i);
                    break;
            }
        }
        zzer.m58967f(this.f40927j, t, t2);
        if (this.f40921d) {
            zzer.m58966e(this.f40928k, t, t2);
        }
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
    public final int mo50358c(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f40918a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022b
            int r3 = r8.m58901w(r1)
            int[] r4 = r8.f40918a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = m58903y(r3)
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
            boolean r3 = r8.m58887i(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.zzfn.m59087s(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0031:
            boolean r3 = r8.m58887i(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m58882C(r9, r5)
            int r3 = com.google.android.gms.internal.icing.zzdh.m58820e(r3)
            goto L_0x0226
        L_0x0043:
            boolean r3 = r8.m58887i(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m58881B(r9, r5)
            goto L_0x0226
        L_0x0051:
            boolean r3 = r8.m58887i(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m58882C(r9, r5)
            int r3 = com.google.android.gms.internal.icing.zzdh.m58820e(r3)
            goto L_0x0226
        L_0x0063:
            boolean r3 = r8.m58887i(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m58881B(r9, r5)
            goto L_0x0226
        L_0x0071:
            boolean r3 = r8.m58887i(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m58881B(r9, r5)
            goto L_0x0226
        L_0x007f:
            boolean r3 = r8.m58887i(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m58881B(r9, r5)
            goto L_0x0226
        L_0x008d:
            boolean r3 = r8.m58887i(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.zzfn.m59087s(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x009f:
            boolean r3 = r8.m58887i(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.zzfn.m59087s(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00b1:
            boolean r3 = r8.m58887i(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.zzfn.m59087s(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00c5:
            boolean r3 = r8.m58887i(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            boolean r3 = m58883D(r9, r5)
            int r3 = com.google.android.gms.internal.icing.zzdh.m58821f(r3)
            goto L_0x0226
        L_0x00d7:
            boolean r3 = r8.m58887i(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m58881B(r9, r5)
            goto L_0x0226
        L_0x00e5:
            boolean r3 = r8.m58887i(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m58882C(r9, r5)
            int r3 = com.google.android.gms.internal.icing.zzdh.m58820e(r3)
            goto L_0x0226
        L_0x00f7:
            boolean r3 = r8.m58887i(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m58881B(r9, r5)
            goto L_0x0226
        L_0x0105:
            boolean r3 = r8.m58887i(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m58882C(r9, r5)
            int r3 = com.google.android.gms.internal.icing.zzdh.m58820e(r3)
            goto L_0x0226
        L_0x0117:
            boolean r3 = r8.m58887i(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m58882C(r9, r5)
            int r3 = com.google.android.gms.internal.icing.zzdh.m58820e(r3)
            goto L_0x0226
        L_0x0129:
            boolean r3 = r8.m58887i(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            float r3 = m58880A(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x013b:
            boolean r3 = r8.m58887i(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            double r3 = m58904z(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.icing.zzdh.m58820e(r3)
            goto L_0x0226
        L_0x0151:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.zzfn.m59087s(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x015d:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.zzfn.m59087s(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0169:
            java.lang.Object r3 = com.google.android.gms.internal.icing.zzfn.m59087s(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
            goto L_0x01c2
        L_0x0174:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.icing.zzfn.m59079k(r9, r5)
            int r3 = com.google.android.gms.internal.icing.zzdh.m58820e(r3)
            goto L_0x0226
        L_0x0180:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.icing.zzfn.m59077i(r9, r5)
            goto L_0x0226
        L_0x0188:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.icing.zzfn.m59079k(r9, r5)
            int r3 = com.google.android.gms.internal.icing.zzdh.m58820e(r3)
            goto L_0x0226
        L_0x0194:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.icing.zzfn.m59077i(r9, r5)
            goto L_0x0226
        L_0x019c:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.icing.zzfn.m59077i(r9, r5)
            goto L_0x0226
        L_0x01a4:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.icing.zzfn.m59077i(r9, r5)
            goto L_0x0226
        L_0x01ac:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.zzfn.m59087s(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01b8:
            java.lang.Object r3 = com.google.android.gms.internal.icing.zzfn.m59087s(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
        L_0x01c2:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0227
        L_0x01c6:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.zzfn.m59087s(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01d3:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.icing.zzfn.m59081m(r9, r5)
            int r3 = com.google.android.gms.internal.icing.zzdh.m58821f(r3)
            goto L_0x0226
        L_0x01de:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.icing.zzfn.m59077i(r9, r5)
            goto L_0x0226
        L_0x01e5:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.icing.zzfn.m59079k(r9, r5)
            int r3 = com.google.android.gms.internal.icing.zzdh.m58820e(r3)
            goto L_0x0226
        L_0x01f0:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.icing.zzfn.m59077i(r9, r5)
            goto L_0x0226
        L_0x01f7:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.icing.zzfn.m59079k(r9, r5)
            int r3 = com.google.android.gms.internal.icing.zzdh.m58820e(r3)
            goto L_0x0226
        L_0x0202:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.icing.zzfn.m59079k(r9, r5)
            int r3 = com.google.android.gms.internal.icing.zzdh.m58820e(r3)
            goto L_0x0226
        L_0x020d:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.icing.zzfn.m59083o(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x0218:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.icing.zzfn.m59085q(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.icing.zzdh.m58820e(r3)
        L_0x0226:
            int r2 = r2 + r3
        L_0x0227:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022b:
            int r2 = r2 * 53
            com.google.android.gms.internal.icing.zzfd<?, ?> r0 = r8.f40927j
            java.lang.Object r0 = r0.mo50404b(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f40921d
            if (r0 != 0) goto L_0x023d
            return r2
        L_0x023d:
            com.google.android.gms.internal.icing.zzcq<?> r0 = r8.f40928k
            r0.mo50289b(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.zzeh.mo50358c(java.lang.Object):int");
    }

    /* renamed from: d */
    public final void mo50359d(T t) {
        int i;
        int i2 = this.f40924g;
        while (true) {
            i = this.f40925h;
            if (i2 >= i) {
                break;
            }
            long w = (long) (m58901w(this.f40923f[i2]) & 1048575);
            Object s = zzfn.m59087s(t, w);
            if (s != null) {
                ((zzdy) s).mo50344c();
                zzfn.m59088t(t, w, s);
            }
            i2++;
        }
        int length = this.f40923f.length;
        while (i < length) {
            this.f40926i.mo50333a(t, (long) this.f40923f[i]);
            i++;
        }
        this.f40927j.mo50405c(t);
        if (this.f40921d) {
            this.f40928k.mo50290c(t);
        }
    }

    /* renamed from: e */
    public final void mo50360e(T t, zzcn zzcn) throws IOException {
        if (!this.f40922e) {
            m58889k(t, zzcn);
        } else if (!this.f40921d) {
            int length = this.f40918a.length;
            for (int i = 0; i < length; i += 3) {
                int w = m58901w(i);
                int i2 = this.f40918a[i];
                switch (m58903y(w)) {
                    case 0:
                        if (!m58885g(t, i)) {
                            break;
                        } else {
                            zzcn.mo50271o(i2, zzfn.m59085q(t, (long) (w & 1048575)));
                            break;
                        }
                    case 1:
                        if (!m58885g(t, i)) {
                            break;
                        } else {
                            zzcn.mo50270n(i2, zzfn.m59083o(t, (long) (w & 1048575)));
                            break;
                        }
                    case 2:
                        if (!m58885g(t, i)) {
                            break;
                        } else {
                            zzcn.mo50268l(i2, zzfn.m59079k(t, (long) (w & 1048575)));
                            break;
                        }
                    case 3:
                        if (!m58885g(t, i)) {
                            break;
                        } else {
                            zzcn.mo50273q(i2, zzfn.m59079k(t, (long) (w & 1048575)));
                            break;
                        }
                    case 4:
                        if (!m58885g(t, i)) {
                            break;
                        } else {
                            zzcn.mo50274r(i2, zzfn.m59077i(t, (long) (w & 1048575)));
                            break;
                        }
                    case 5:
                        if (!m58885g(t, i)) {
                            break;
                        } else {
                            zzcn.mo50275s(i2, zzfn.m59079k(t, (long) (w & 1048575)));
                            break;
                        }
                    case 6:
                        if (!m58885g(t, i)) {
                            break;
                        } else {
                            zzcn.mo50276t(i2, zzfn.m59077i(t, (long) (w & 1048575)));
                            break;
                        }
                    case 7:
                        if (!m58885g(t, i)) {
                            break;
                        } else {
                            zzcn.mo50277u(i2, zzfn.m59081m(t, (long) (w & 1048575)));
                            break;
                        }
                    case 8:
                        if (!m58885g(t, i)) {
                            break;
                        } else {
                            m58891m(i2, zzfn.m59087s(t, (long) (w & 1048575)), zzcn);
                            break;
                        }
                    case 9:
                        if (!m58885g(t, i)) {
                            break;
                        } else {
                            zzcn.mo50249A(i2, zzfn.m59087s(t, (long) (w & 1048575)), m58899u(i));
                            break;
                        }
                    case 10:
                        if (!m58885g(t, i)) {
                            break;
                        } else {
                            zzcn.mo50279w(i2, (zzcf) zzfn.m59087s(t, (long) (w & 1048575)));
                            break;
                        }
                    case 11:
                        if (!m58885g(t, i)) {
                            break;
                        } else {
                            zzcn.mo50280x(i2, zzfn.m59077i(t, (long) (w & 1048575)));
                            break;
                        }
                    case 12:
                        if (!m58885g(t, i)) {
                            break;
                        } else {
                            zzcn.mo50272p(i2, zzfn.m59077i(t, (long) (w & 1048575)));
                            break;
                        }
                    case 13:
                        if (!m58885g(t, i)) {
                            break;
                        } else {
                            zzcn.mo50267k(i2, zzfn.m59077i(t, (long) (w & 1048575)));
                            break;
                        }
                    case 14:
                        if (!m58885g(t, i)) {
                            break;
                        } else {
                            zzcn.mo50269m(i2, zzfn.m59079k(t, (long) (w & 1048575)));
                            break;
                        }
                    case 15:
                        if (!m58885g(t, i)) {
                            break;
                        } else {
                            zzcn.mo50281y(i2, zzfn.m59077i(t, (long) (w & 1048575)));
                            break;
                        }
                    case 16:
                        if (!m58885g(t, i)) {
                            break;
                        } else {
                            zzcn.mo50282z(i2, zzfn.m59079k(t, (long) (w & 1048575)));
                            break;
                        }
                    case 17:
                        if (!m58885g(t, i)) {
                            break;
                        } else {
                            zzcn.mo50250B(i2, zzfn.m59087s(t, (long) (w & 1048575)), m58899u(i));
                            break;
                        }
                    case 18:
                        zzer.m58969h(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, false);
                        break;
                    case 19:
                        zzer.m58970i(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, false);
                        break;
                    case 20:
                        zzer.m58971j(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, false);
                        break;
                    case 21:
                        zzer.m58972k(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, false);
                        break;
                    case 22:
                        zzer.m58976o(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, false);
                        break;
                    case 23:
                        zzer.m58974m(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, false);
                        break;
                    case 24:
                        zzer.m58979r(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, false);
                        break;
                    case 25:
                        zzer.m58982u(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, false);
                        break;
                    case 26:
                        zzer.m58983v(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn);
                        break;
                    case 27:
                        zzer.m58985x(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, m58899u(i));
                        break;
                    case 28:
                        zzer.m58984w(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn);
                        break;
                    case 29:
                        zzer.m58977p(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, false);
                        break;
                    case 30:
                        zzer.m58981t(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, false);
                        break;
                    case 31:
                        zzer.m58980s(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, false);
                        break;
                    case 32:
                        zzer.m58975n(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, false);
                        break;
                    case 33:
                        zzer.m58978q(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, false);
                        break;
                    case 34:
                        zzer.m58973l(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, false);
                        break;
                    case 35:
                        zzer.m58969h(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, true);
                        break;
                    case 36:
                        zzer.m58970i(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, true);
                        break;
                    case 37:
                        zzer.m58971j(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, true);
                        break;
                    case 38:
                        zzer.m58972k(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, true);
                        break;
                    case 39:
                        zzer.m58976o(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, true);
                        break;
                    case 40:
                        zzer.m58974m(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, true);
                        break;
                    case 41:
                        zzer.m58979r(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, true);
                        break;
                    case 42:
                        zzer.m58982u(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, true);
                        break;
                    case 43:
                        zzer.m58977p(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, true);
                        break;
                    case 44:
                        zzer.m58981t(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, true);
                        break;
                    case 45:
                        zzer.m58980s(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, true);
                        break;
                    case 46:
                        zzer.m58975n(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, true);
                        break;
                    case 47:
                        zzer.m58978q(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, true);
                        break;
                    case 48:
                        zzer.m58973l(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, true);
                        break;
                    case 49:
                        zzer.m58986y(this.f40918a[i], (List) zzfn.m59087s(t, (long) (w & 1048575)), zzcn, m58899u(i));
                        break;
                    case 50:
                        m58890l(zzcn, i2, zzfn.m59087s(t, (long) (w & 1048575)), i);
                        break;
                    case 51:
                        if (!m58887i(t, i2, i)) {
                            break;
                        } else {
                            zzcn.mo50271o(i2, m58904z(t, (long) (w & 1048575)));
                            break;
                        }
                    case 52:
                        if (!m58887i(t, i2, i)) {
                            break;
                        } else {
                            zzcn.mo50270n(i2, m58880A(t, (long) (w & 1048575)));
                            break;
                        }
                    case 53:
                        if (!m58887i(t, i2, i)) {
                            break;
                        } else {
                            zzcn.mo50268l(i2, m58882C(t, (long) (w & 1048575)));
                            break;
                        }
                    case 54:
                        if (!m58887i(t, i2, i)) {
                            break;
                        } else {
                            zzcn.mo50273q(i2, m58882C(t, (long) (w & 1048575)));
                            break;
                        }
                    case 55:
                        if (!m58887i(t, i2, i)) {
                            break;
                        } else {
                            zzcn.mo50274r(i2, m58881B(t, (long) (w & 1048575)));
                            break;
                        }
                    case 56:
                        if (!m58887i(t, i2, i)) {
                            break;
                        } else {
                            zzcn.mo50275s(i2, m58882C(t, (long) (w & 1048575)));
                            break;
                        }
                    case 57:
                        if (!m58887i(t, i2, i)) {
                            break;
                        } else {
                            zzcn.mo50276t(i2, m58881B(t, (long) (w & 1048575)));
                            break;
                        }
                    case 58:
                        if (!m58887i(t, i2, i)) {
                            break;
                        } else {
                            zzcn.mo50277u(i2, m58883D(t, (long) (w & 1048575)));
                            break;
                        }
                    case 59:
                        if (!m58887i(t, i2, i)) {
                            break;
                        } else {
                            m58891m(i2, zzfn.m59087s(t, (long) (w & 1048575)), zzcn);
                            break;
                        }
                    case 60:
                        if (!m58887i(t, i2, i)) {
                            break;
                        } else {
                            zzcn.mo50249A(i2, zzfn.m59087s(t, (long) (w & 1048575)), m58899u(i));
                            break;
                        }
                    case 61:
                        if (!m58887i(t, i2, i)) {
                            break;
                        } else {
                            zzcn.mo50279w(i2, (zzcf) zzfn.m59087s(t, (long) (w & 1048575)));
                            break;
                        }
                    case 62:
                        if (!m58887i(t, i2, i)) {
                            break;
                        } else {
                            zzcn.mo50280x(i2, m58881B(t, (long) (w & 1048575)));
                            break;
                        }
                    case 63:
                        if (!m58887i(t, i2, i)) {
                            break;
                        } else {
                            zzcn.mo50272p(i2, m58881B(t, (long) (w & 1048575)));
                            break;
                        }
                    case 64:
                        if (!m58887i(t, i2, i)) {
                            break;
                        } else {
                            zzcn.mo50267k(i2, m58881B(t, (long) (w & 1048575)));
                            break;
                        }
                    case 65:
                        if (!m58887i(t, i2, i)) {
                            break;
                        } else {
                            zzcn.mo50269m(i2, m58882C(t, (long) (w & 1048575)));
                            break;
                        }
                    case 66:
                        if (!m58887i(t, i2, i)) {
                            break;
                        } else {
                            zzcn.mo50281y(i2, m58881B(t, (long) (w & 1048575)));
                            break;
                        }
                    case 67:
                        if (!m58887i(t, i2, i)) {
                            break;
                        } else {
                            zzcn.mo50282z(i2, m58882C(t, (long) (w & 1048575)));
                            break;
                        }
                    case 68:
                        if (!m58887i(t, i2, i)) {
                            break;
                        } else {
                            zzcn.mo50250B(i2, zzfn.m59087s(t, (long) (w & 1048575)), m58899u(i));
                            break;
                        }
                }
            }
            zzfd<?, ?> zzfd = this.f40927j;
            zzfd.mo50409g(zzfd.mo50404b(t), zzcn);
        } else {
            this.f40928k.mo50289b(t);
            throw null;
        }
    }

    /* renamed from: f */
    public final boolean mo50361f(T t, T t2) {
        boolean z;
        int length = this.f40918a.length;
        for (int i = 0; i < length; i += 3) {
            int w = m58901w(i);
            long j = (long) (w & 1048575);
            switch (m58903y(w)) {
                case 0:
                    if (m58884E(t, t2, i) && Double.doubleToLongBits(zzfn.m59085q(t, j)) == Double.doubleToLongBits(zzfn.m59085q(t2, j))) {
                        continue;
                    }
                case 1:
                    if (m58884E(t, t2, i) && Float.floatToIntBits(zzfn.m59083o(t, j)) == Float.floatToIntBits(zzfn.m59083o(t2, j))) {
                        continue;
                    }
                case 2:
                    if (m58884E(t, t2, i) && zzfn.m59079k(t, j) == zzfn.m59079k(t2, j)) {
                        continue;
                    }
                case 3:
                    if (m58884E(t, t2, i) && zzfn.m59079k(t, j) == zzfn.m59079k(t2, j)) {
                        continue;
                    }
                case 4:
                    if (m58884E(t, t2, i) && zzfn.m59077i(t, j) == zzfn.m59077i(t2, j)) {
                        continue;
                    }
                case 5:
                    if (m58884E(t, t2, i) && zzfn.m59079k(t, j) == zzfn.m59079k(t2, j)) {
                        continue;
                    }
                case 6:
                    if (m58884E(t, t2, i) && zzfn.m59077i(t, j) == zzfn.m59077i(t2, j)) {
                        continue;
                    }
                case 7:
                    if (m58884E(t, t2, i) && zzfn.m59081m(t, j) == zzfn.m59081m(t2, j)) {
                        continue;
                    }
                case 8:
                    if (m58884E(t, t2, i) && zzer.m58965d(zzfn.m59087s(t, j), zzfn.m59087s(t2, j))) {
                        continue;
                    }
                case 9:
                    if (m58884E(t, t2, i) && zzer.m58965d(zzfn.m59087s(t, j), zzfn.m59087s(t2, j))) {
                        continue;
                    }
                case 10:
                    if (m58884E(t, t2, i) && zzer.m58965d(zzfn.m59087s(t, j), zzfn.m59087s(t2, j))) {
                        continue;
                    }
                case 11:
                    if (m58884E(t, t2, i) && zzfn.m59077i(t, j) == zzfn.m59077i(t2, j)) {
                        continue;
                    }
                case 12:
                    if (m58884E(t, t2, i) && zzfn.m59077i(t, j) == zzfn.m59077i(t2, j)) {
                        continue;
                    }
                case 13:
                    if (m58884E(t, t2, i) && zzfn.m59077i(t, j) == zzfn.m59077i(t2, j)) {
                        continue;
                    }
                case 14:
                    if (m58884E(t, t2, i) && zzfn.m59079k(t, j) == zzfn.m59079k(t2, j)) {
                        continue;
                    }
                case 15:
                    if (m58884E(t, t2, i) && zzfn.m59077i(t, j) == zzfn.m59077i(t2, j)) {
                        continue;
                    }
                case 16:
                    if (m58884E(t, t2, i) && zzfn.m59079k(t, j) == zzfn.m59079k(t2, j)) {
                        continue;
                    }
                case 17:
                    if (m58884E(t, t2, i) && zzer.m58965d(zzfn.m59087s(t, j), zzfn.m59087s(t2, j))) {
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
                    z = zzer.m58965d(zzfn.m59087s(t, j), zzfn.m59087s(t2, j));
                    break;
                case 50:
                    z = zzer.m58965d(zzfn.m59087s(t, j), zzfn.m59087s(t2, j));
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
                    long x = (long) (m58902x(i) & 1048575);
                    if (zzfn.m59077i(t, x) == zzfn.m59077i(t2, x) && zzer.m58965d(zzfn.m59087s(t, j), zzfn.m59087s(t2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.f40927j.mo50404b(t).equals(this.f40927j.mo50404b(t2))) {
            return false;
        }
        if (!this.f40921d) {
            return true;
        }
        this.f40928k.mo50289b(t);
        this.f40928k.mo50289b(t2);
        throw null;
    }
}
