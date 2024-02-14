package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
abstract class zzw extends zzj {

    /* renamed from: d */
    final CharSequence f39305d;

    /* renamed from: f */
    final zzo f39306f;

    /* renamed from: g */
    final boolean f39307g;

    /* renamed from: o */
    int f39308o = 0;

    /* renamed from: p */
    int f39309p;

    protected zzw(zzx zzx, CharSequence charSequence) {
        this.f39306f = zzx.f39310a;
        this.f39307g = zzx.f39311b;
        this.f39309p = Integer.MAX_VALUE;
        this.f39305d = charSequence;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo48654a() {
        int d;
        int i;
        int i2 = this.f39308o;
        while (true) {
            int i3 = this.f39308o;
            if (i3 != -1) {
                d = mo48663d(i3);
                if (d == -1) {
                    d = this.f39305d.length();
                    this.f39308o = -1;
                    i = -1;
                } else {
                    i = mo48662c(d);
                    this.f39308o = i;
                }
                if (i == i2) {
                    int i4 = i + 1;
                    this.f39308o = i4;
                    if (i4 > this.f39305d.length()) {
                        this.f39308o = -1;
                    }
                } else {
                    if (i2 < d) {
                        this.f39305d.charAt(i2);
                    }
                    if (i2 < d) {
                        this.f39305d.charAt(d - 1);
                    }
                    if (!this.f39307g || i2 != d) {
                        int i5 = this.f39309p;
                    } else {
                        i2 = this.f39308o;
                    }
                }
            } else {
                mo48655b();
                return null;
            }
        }
        int i52 = this.f39309p;
        if (i52 == 1) {
            d = this.f39305d.length();
            this.f39308o = -1;
            if (d > i2) {
                this.f39305d.charAt(d - 1);
            }
        } else {
            this.f39309p = i52 - 1;
        }
        return this.f39305d.subSequence(i2, d).toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract int mo48662c(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract int mo48663d(int i);
}
