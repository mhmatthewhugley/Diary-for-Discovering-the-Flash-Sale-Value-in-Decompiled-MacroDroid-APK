package com.google.android.gms.internal.places;

import com.google.android.gms.internal.places.zzax;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzav<FieldDescriptorType extends zzax<FieldDescriptorType>> {

    /* renamed from: d */
    private static final zzav f45188d = new zzav(true);

    /* renamed from: a */
    final zzdb<FieldDescriptorType, Object> f45189a = zzdb.m63536c(16);

    /* renamed from: b */
    private boolean f45190b;

    /* renamed from: c */
    private boolean f45191c = false;

    private zzav() {
    }

    /* renamed from: f */
    public static <T extends zzax<T>> zzav<T> m63274f() {
        return f45188d;
    }

    /* renamed from: h */
    static int m63275h(zzef zzef, int i, Object obj) {
        int w0 = zzaj.m63139w0(i);
        if (zzef == zzef.GROUP) {
            zzbd.m63348i((zzck) obj);
            w0 <<= 1;
        }
        return w0 + m63281o(zzef, obj);
    }

    /* renamed from: i */
    private final Object m63276i(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f45189a.get(fielddescriptortype);
        return obj instanceof zzbl ? zzbl.m63369e() : obj;
    }

    /* renamed from: j */
    static void m63277j(zzaj zzaj, zzef zzef, int i, Object obj) throws IOException {
        if (zzef == zzef.GROUP) {
            zzck zzck = (zzck) obj;
            zzbd.m63348i(zzck);
            zzaj.mo53353z(i, 3);
            zzck.mo53449e(zzaj);
            zzaj.mo53353z(i, 4);
            return;
        }
        zzaj.mo53353z(i, zzef.mo53649d());
        switch (zzau.f45187b[zzef.ordinal()]) {
            case 1:
                zzaj.mo53338g(((Double) obj).doubleValue());
                return;
            case 2:
                zzaj.mo53328N(((Float) obj).floatValue());
                return;
            case 3:
                zzaj.mo53324D(((Long) obj).longValue());
                return;
            case 4:
                zzaj.mo53324D(((Long) obj).longValue());
                return;
            case 5:
                zzaj.mo53349s0(((Integer) obj).intValue());
                return;
            case 6:
                zzaj.mo53333W(((Long) obj).longValue());
                return;
            case 7:
                zzaj.mo53352v0(((Integer) obj).intValue());
                return;
            case 8:
                zzaj.mo53326F(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzck) obj).mo53449e(zzaj);
                return;
            case 10:
                zzaj.mo53325E((zzck) obj);
                return;
            case 11:
                if (obj instanceof zzw) {
                    zzaj.mo53347o((zzw) obj);
                    return;
                } else {
                    zzaj.mo53345m0((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzw) {
                    zzaj.mo53347o((zzw) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzaj.mo53334X(bArr, 0, bArr.length);
                return;
            case 13:
                zzaj.mo53350t0(((Integer) obj).intValue());
                return;
            case 14:
                zzaj.mo53352v0(((Integer) obj).intValue());
                return;
            case 15:
                zzaj.mo53333W(((Long) obj).longValue());
                return;
            case 16:
                zzaj.mo53351u0(((Integer) obj).intValue());
                return;
            case 17:
                zzaj.mo53331Q(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzbg) {
                    zzaj.mo53349s0(((zzbg) obj).mo53473h());
                    return;
                } else {
                    zzaj.mo53349s0(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: l */
    private final void m63278l(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo53429B()) {
            m63279m(fielddescriptortype.mo53434p(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                m63279m(fielddescriptortype.mo53434p(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzbl) {
            this.f45191c = true;
        }
        this.f45189a.put(fielddescriptortype, obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if ((r3 instanceof com.google.android.gms.internal.places.zzbg) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.places.zzbl) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m63279m(com.google.android.gms.internal.places.zzef r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.places.zzbd.m63340a(r3)
            int[] r0 = com.google.android.gms.internal.places.zzau.f45186a
            com.google.android.gms.internal.places.zzem r2 = r2.mo53648b()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0041;
                case 2: goto L_0x003e;
                case 3: goto L_0x003b;
                case 4: goto L_0x0038;
                case 5: goto L_0x0035;
                case 6: goto L_0x0032;
                case 7: goto L_0x0029;
                case 8: goto L_0x0020;
                case 9: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0044
        L_0x0015:
            boolean r2 = r3 instanceof com.google.android.gms.internal.places.zzck
            if (r2 != 0) goto L_0x0043
            boolean r2 = r3 instanceof com.google.android.gms.internal.places.zzbl
            if (r2 == 0) goto L_0x001e
            goto L_0x0043
        L_0x001e:
            r0 = 0
            goto L_0x0043
        L_0x0020:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0043
            boolean r2 = r3 instanceof com.google.android.gms.internal.places.zzbg
            if (r2 == 0) goto L_0x001e
            goto L_0x0043
        L_0x0029:
            boolean r2 = r3 instanceof com.google.android.gms.internal.places.zzw
            if (r2 != 0) goto L_0x0043
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x001e
            goto L_0x0043
        L_0x0032:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0043
        L_0x0035:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0043
        L_0x0038:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0043
        L_0x003b:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0043
        L_0x003e:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0043
        L_0x0041:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0043:
            r1 = r0
        L_0x0044:
            if (r1 == 0) goto L_0x0047
            return
        L_0x0047:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzav.m63279m(com.google.android.gms.internal.places.zzef, java.lang.Object):void");
    }

    /* renamed from: n */
    public static int m63280n(zzax<?> zzax, Object obj) {
        zzef p = zzax.mo53434p();
        int h = zzax.mo53433h();
        if (!zzax.mo53429B()) {
            return m63275h(p, h, obj);
        }
        int i = 0;
        if (zzax.mo53430F1()) {
            for (Object o : (List) obj) {
                i += m63281o(p, o);
            }
            return zzaj.m63139w0(h) + i + zzaj.m63100E0(i);
        }
        for (Object h2 : (List) obj) {
            i += m63275h(p, h, h2);
        }
        return i;
    }

    /* renamed from: o */
    private static int m63281o(zzef zzef, Object obj) {
        switch (zzau.f45187b[zzef.ordinal()]) {
            case 1:
                return zzaj.m63130q(((Double) obj).doubleValue());
            case 2:
                return zzaj.m63107R(((Float) obj).floatValue());
            case 3:
                return zzaj.m63112Z(((Long) obj).longValue());
            case 4:
                return zzaj.m63115c0(((Long) obj).longValue());
            case 5:
                return zzaj.m63141x0(((Integer) obj).intValue());
            case 6:
                return zzaj.m63124j0(((Long) obj).longValue());
            case 7:
                return zzaj.m63096A0(((Integer) obj).intValue());
            case 8:
                return zzaj.m63105K(((Boolean) obj).booleanValue());
            case 9:
                return zzaj.m63110U((zzck) obj);
            case 10:
                if (obj instanceof zzbl) {
                    return zzaj.m63117e((zzbl) obj);
                }
                return zzaj.m63104J((zzck) obj);
            case 11:
                if (obj instanceof zzw) {
                    return zzaj.m63140x((zzw) obj);
                }
                return zzaj.m63128o0((String) obj);
            case 12:
                if (obj instanceof zzw) {
                    return zzaj.m63140x((zzw) obj);
                }
                return zzaj.m63106L((byte[]) obj);
            case 13:
                return zzaj.m63143y0(((Integer) obj).intValue());
            case 14:
                return zzaj.m63097B0(((Integer) obj).intValue());
            case 15:
                return zzaj.m63126l0(((Long) obj).longValue());
            case 16:
                return zzaj.m63144z0(((Integer) obj).intValue());
            case 17:
                return zzaj.m63121g0(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzbg) {
                    return zzaj.m63098C0(((zzbg) obj).mo53473h());
                }
                return zzaj.m63098C0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: p */
    private static boolean m63282p(Map.Entry<FieldDescriptorType, Object> entry) {
        zzax zzax = (zzax) entry.getKey();
        if (zzax.mo53435z() == zzem.MESSAGE) {
            if (zzax.mo53429B()) {
                for (zzck a : (List) entry.getValue()) {
                    if (!a.mo53445a()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzck) {
                    if (!((zzck) value).mo53445a()) {
                        return false;
                    }
                } else if (value instanceof zzbl) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: q */
    private final void m63283q(Map.Entry<FieldDescriptorType, Object> entry) {
        Object obj;
        zzax zzax = (zzax) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzbl) {
            value = zzbl.m63369e();
        }
        if (zzax.mo53429B()) {
            Object i = m63276i(zzax);
            if (i == null) {
                i = new ArrayList();
            }
            for (Object s : (List) value) {
                ((List) i).add(m63285s(s));
            }
            this.f45189a.put(zzax, i);
        } else if (zzax.mo53435z() == zzem.MESSAGE) {
            Object i2 = m63276i(zzax);
            if (i2 == null) {
                this.f45189a.put(zzax, m63285s(value));
                return;
            }
            if (i2 instanceof zzcp) {
                obj = zzax.mo53432N0((zzcp) i2, (zzcp) value);
            } else {
                obj = zzax.mo53431K0(((zzck) i2).mo53447c(), (zzck) value).mo53459W1();
            }
            this.f45189a.put(zzax, obj);
        } else {
            this.f45189a.put(zzax, m63285s(value));
        }
    }

    /* renamed from: r */
    private static int m63284r(Map.Entry<FieldDescriptorType, Object> entry) {
        zzax zzax = (zzax) entry.getKey();
        Object value = entry.getValue();
        if (zzax.mo53435z() != zzem.MESSAGE || zzax.mo53429B() || zzax.mo53430F1()) {
            return m63280n(zzax, value);
        }
        if (value instanceof zzbl) {
            return zzaj.m63135t(((zzax) entry.getKey()).mo53433h(), (zzbl) value);
        }
        return zzaj.m63136u(((zzax) entry.getKey()).mo53433h(), (zzck) value);
    }

    /* renamed from: s */
    private static Object m63285s(Object obj) {
        if (obj instanceof zzcp) {
            return ((zzcp) obj).mo53545l0();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> mo53418a() {
        if (this.f45191c) {
            return new zzbq(this.f45189a.mo53565m().iterator());
        }
        return this.f45189a.mo53565m().iterator();
    }

    /* renamed from: b */
    public final boolean mo53419b() {
        return this.f45190b;
    }

    /* renamed from: c */
    public final boolean mo53420c() {
        for (int i = 0; i < this.f45189a.mo53563k(); i++) {
            if (!m63282p(this.f45189a.mo53557d(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> p : this.f45189a.mo53564l()) {
            if (!m63282p(p)) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzav zzav = new zzav();
        for (int i = 0; i < this.f45189a.mo53563k(); i++) {
            Map.Entry<FieldDescriptorType, Object> d = this.f45189a.mo53557d(i);
            zzav.m63278l((zzax) d.getKey(), d.getValue());
        }
        for (Map.Entry next : this.f45189a.mo53564l()) {
            zzav.m63278l((zzax) next.getKey(), next.getValue());
        }
        zzav.f45191c = this.f45191c;
        return zzav;
    }

    /* renamed from: d */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> mo53422d() {
        if (this.f45191c) {
            return new zzbq(this.f45189a.entrySet().iterator());
        }
        return this.f45189a.entrySet().iterator();
    }

    /* renamed from: e */
    public final void mo53423e() {
        if (!this.f45190b) {
            this.f45189a.mo53554b();
            this.f45190b = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzav)) {
            return false;
        }
        return this.f45189a.equals(((zzav) obj).f45189a);
    }

    /* renamed from: g */
    public final int mo53425g() {
        int i = 0;
        for (int i2 = 0; i2 < this.f45189a.mo53563k(); i2++) {
            i += m63284r(this.f45189a.mo53557d(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> r : this.f45189a.mo53564l()) {
            i += m63284r(r);
        }
        return i;
    }

    public final int hashCode() {
        return this.f45189a.hashCode();
    }

    /* renamed from: k */
    public final void mo53427k(zzav<FieldDescriptorType> zzav) {
        for (int i = 0; i < zzav.f45189a.mo53563k(); i++) {
            m63283q(zzav.f45189a.mo53557d(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> q : zzav.f45189a.mo53564l()) {
            m63283q(q);
        }
    }

    private zzav(boolean z) {
        mo53423e();
    }
}
