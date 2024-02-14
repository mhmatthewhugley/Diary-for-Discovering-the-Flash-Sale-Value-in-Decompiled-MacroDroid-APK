package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbcf {

    /* renamed from: a */
    private final int f26561a;

    /* renamed from: b */
    private final int f26562b;

    /* renamed from: c */
    private final int f26563c;

    /* renamed from: d */
    private final boolean f26564d;

    /* renamed from: e */
    private final zzbcu f26565e;

    /* renamed from: f */
    private final zzbdc f26566f;

    /* renamed from: g */
    private final Object f26567g = new Object();

    /* renamed from: h */
    private final ArrayList f26568h = new ArrayList();

    /* renamed from: i */
    private final ArrayList f26569i = new ArrayList();

    /* renamed from: j */
    private final ArrayList f26570j = new ArrayList();

    /* renamed from: k */
    private int f26571k = 0;

    /* renamed from: l */
    private int f26572l = 0;

    /* renamed from: m */
    private int f26573m = 0;

    /* renamed from: n */
    private int f26574n;

    /* renamed from: o */
    private String f26575o = "";

    /* renamed from: p */
    private String f26576p = "";

    /* renamed from: q */
    private String f26577q = "";

    public zzbcf(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.f26561a = i;
        this.f26562b = i2;
        this.f26563c = i3;
        this.f26564d = z;
        this.f26565e = new zzbcu(i4);
        this.f26566f = new zzbdc(i5, i6, i7);
    }

    /* renamed from: p */
    private final void m43089p(@Nullable String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null && str.length() >= this.f26563c) {
            synchronized (this.f26567g) {
                this.f26568h.add(str);
                this.f26571k += str.length();
                if (z) {
                    this.f26569i.add(str);
                    this.f26570j.add(new zzbcq(f, f2, f3, f4, this.f26569i.size() - 1));
                }
            }
        }
    }

    /* renamed from: q */
    private static final String m43090q(ArrayList arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            sb.append((String) arrayList.get(i2));
            sb.append(' ');
            i2++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        if (sb2.length() < 100) {
            return sb2;
        }
        return sb2.substring(0, 100);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: a */
    public final int mo42424a(int i, int i2) {
        return this.f26564d ? this.f26562b : (i * this.f26561a) + (i2 * this.f26562b);
    }

    /* renamed from: b */
    public final int mo42425b() {
        return this.f26574n;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: c */
    public final int mo42426c() {
        return this.f26571k;
    }

    /* renamed from: d */
    public final String mo42427d() {
        return this.f26575o;
    }

    /* renamed from: e */
    public final String mo42428e() {
        return this.f26576p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbcf)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzbcf) obj).f26575o;
        return str != null && str.equals(this.f26575o);
    }

    /* renamed from: f */
    public final String mo42430f() {
        return this.f26577q;
    }

    /* renamed from: g */
    public final void mo42431g() {
        synchronized (this.f26567g) {
            this.f26573m--;
        }
    }

    /* renamed from: h */
    public final void mo42432h() {
        synchronized (this.f26567g) {
            this.f26573m++;
        }
    }

    public final int hashCode() {
        return this.f26575o.hashCode();
    }

    /* renamed from: i */
    public final void mo42434i() {
        synchronized (this.f26567g) {
            this.f26574n -= 100;
        }
    }

    /* renamed from: j */
    public final void mo42435j(int i) {
        this.f26572l = i;
    }

    /* renamed from: k */
    public final void mo42436k(String str, boolean z, float f, float f2, float f3, float f4) {
        m43089p(str, z, f, f2, f3, f4);
    }

    /* renamed from: l */
    public final void mo42437l(String str, boolean z, float f, float f2, float f3, float f4) {
        m43089p(str, z, f, f2, f3, f4);
        synchronized (this.f26567g) {
            if (this.f26573m < 0) {
                zzcgp.m45224b("ActivityContent: negative number of WebViews.");
            }
            mo42438m();
        }
    }

    /* renamed from: m */
    public final void mo42438m() {
        synchronized (this.f26567g) {
            int a = mo42424a(this.f26571k, this.f26572l);
            if (a > this.f26574n) {
                this.f26574n = a;
                if (!zzt.m2904q().mo43494h().mo20355T()) {
                    this.f26575o = this.f26565e.mo42486a(this.f26568h);
                    this.f26576p = this.f26565e.mo42486a(this.f26569i);
                }
                if (!zzt.m2904q().mo43494h().mo20354M()) {
                    this.f26577q = this.f26566f.mo42495a(this.f26569i, this.f26570j);
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo42439n() {
        synchronized (this.f26567g) {
            int a = mo42424a(this.f26571k, this.f26572l);
            if (a > this.f26574n) {
                this.f26574n = a;
            }
        }
    }

    /* renamed from: o */
    public final boolean mo42440o() {
        boolean z;
        synchronized (this.f26567g) {
            z = this.f26573m == 0;
        }
        return z;
    }

    public final String toString() {
        int i = this.f26572l;
        int i2 = this.f26574n;
        int i3 = this.f26571k;
        String q = m43090q(this.f26568h, 100);
        String q2 = m43090q(this.f26569i, 100);
        String str = this.f26575o;
        String str2 = this.f26576p;
        String str3 = this.f26577q;
        return "ActivityContent fetchId: " + i + " score:" + i2 + " total_length:" + i3 + "\n text: " + q + "\n viewableText" + q2 + "\n signture: " + str + "\n viewableSignture: " + str2 + "\n viewableSignatureForVertical: " + str3;
    }
}
