package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzad */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
abstract class zzad extends zzh {

    /* renamed from: d */
    final CharSequence f39735d;

    /* renamed from: f */
    final zzn f39736f;

    /* renamed from: g */
    int f39737g = 0;

    /* renamed from: o */
    int f39738o;

    protected zzad(zzaf zzaf, CharSequence charSequence) {
        this.f39736f = zzaf.f39819a;
        this.f39738o = Integer.MAX_VALUE;
        this.f39735d = charSequence;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo49064a() {
        int i;
        int i2 = this.f39737g;
        while (true) {
            int i3 = this.f39737g;
            if (i3 != -1) {
                int d = mo48818d(i3);
                if (d == -1) {
                    d = this.f39735d.length();
                    this.f39737g = -1;
                    i = -1;
                } else {
                    i = mo48817c(d);
                    this.f39737g = i;
                }
                if (i == i2) {
                    int i4 = i + 1;
                    this.f39737g = i4;
                    if (i4 > this.f39735d.length()) {
                        this.f39737g = -1;
                    }
                } else {
                    if (i2 < d) {
                        this.f39735d.charAt(i2);
                    }
                    if (i2 < d) {
                        this.f39735d.charAt(d - 1);
                    }
                    int i5 = this.f39738o;
                    if (i5 == 1) {
                        d = this.f39735d.length();
                        this.f39737g = -1;
                        if (d > i2) {
                            this.f39735d.charAt(d - 1);
                        }
                    } else {
                        this.f39738o = i5 - 1;
                    }
                    return this.f39735d.subSequence(i2, d).toString();
                }
            } else {
                mo49445b();
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract int mo48817c(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract int mo48818d(int i);
}
