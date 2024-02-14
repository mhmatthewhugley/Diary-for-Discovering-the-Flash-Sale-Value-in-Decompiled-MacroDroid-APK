package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
abstract class zzfti extends zzfsd {

    /* renamed from: d */
    final CharSequence f36357d;

    /* renamed from: f */
    final zzfsj f36358f;

    /* renamed from: g */
    int f36359g = 0;

    /* renamed from: o */
    int f36360o;

    protected zzfti(zzftk zzftk, CharSequence charSequence) {
        this.f36358f = zzftk.f36361a;
        this.f36360o = Integer.MAX_VALUE;
        this.f36357d = charSequence;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo46162a() {
        int i;
        int i2 = this.f36359g;
        while (true) {
            int i3 = this.f36359g;
            if (i3 != -1) {
                int d = mo46180d(i3);
                if (d == -1) {
                    d = this.f36357d.length();
                    this.f36359g = -1;
                    i = -1;
                } else {
                    i = mo46179c(d);
                    this.f36359g = i;
                }
                if (i == i2) {
                    int i4 = i + 1;
                    this.f36359g = i4;
                    if (i4 > this.f36357d.length()) {
                        this.f36359g = -1;
                    }
                } else {
                    if (i2 < d) {
                        this.f36357d.charAt(i2);
                    }
                    if (i2 < d) {
                        this.f36357d.charAt(d - 1);
                    }
                    int i5 = this.f36360o;
                    if (i5 == 1) {
                        d = this.f36357d.length();
                        this.f36359g = -1;
                        if (d > i2) {
                            this.f36357d.charAt(d - 1);
                        }
                    } else {
                        this.f36360o = i5 - 1;
                    }
                    return this.f36357d.subSequence(i2, d).toString();
                }
            } else {
                mo46163b();
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract int mo46179c(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract int mo46180d(int i);
}
