package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class zzt extends zzw {

    /* renamed from: s */
    final /* synthetic */ zzu f39301s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzt(zzu zzu, zzx zzx, CharSequence charSequence) {
        super(zzx, charSequence);
        this.f39301s = zzu;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo48662c(int i) {
        return i + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo48663d(int i) {
        zzo zzo = this.f39301s.f39302a;
        CharSequence charSequence = this.f39305d;
        int length = charSequence.length();
        zzs.m55919b(i, length, "index");
        while (i < length) {
            if (zzo.mo48659a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
