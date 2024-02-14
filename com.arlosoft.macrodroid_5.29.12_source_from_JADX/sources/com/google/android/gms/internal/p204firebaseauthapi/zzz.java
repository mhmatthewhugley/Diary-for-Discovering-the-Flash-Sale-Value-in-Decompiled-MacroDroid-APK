package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzz */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzz extends zzad {

    /* renamed from: p */
    final /* synthetic */ zzaa f40677p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzz(zzaa zzaa, zzaf zzaf, CharSequence charSequence) {
        super(zzaf, charSequence);
        this.f40677p = zzaa;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo48817c(int i) {
        return i + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo48818d(int i) {
        CharSequence charSequence = this.f39735d;
        int length = charSequence.length();
        zzy.m58436b(i, length, "index");
        while (i < length) {
            if (charSequence.charAt(i) == '.') {
                return i;
            }
            i++;
        }
        return -1;
    }
}
