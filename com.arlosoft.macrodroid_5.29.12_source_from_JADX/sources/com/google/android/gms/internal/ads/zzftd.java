package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzftd extends zzfti {

    /* renamed from: p */
    final /* synthetic */ zzfte f36352p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzftd(zzfte zzfte, zzftk zzftk, CharSequence charSequence) {
        super(zzftk, charSequence);
        this.f36352p = zzfte;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo46179c(int i) {
        return i + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo46180d(int i) {
        zzfsj zzfsj = this.f36352p.f36353a;
        CharSequence charSequence = this.f36357d;
        int length = charSequence.length();
        zzfsx.m50937b(i, length, "index");
        while (i < length) {
            if (zzfsj.mo46167b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
