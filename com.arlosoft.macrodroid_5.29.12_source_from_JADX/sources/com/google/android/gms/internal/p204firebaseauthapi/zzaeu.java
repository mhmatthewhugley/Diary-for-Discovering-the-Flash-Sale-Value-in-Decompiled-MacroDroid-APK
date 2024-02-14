package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaeu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzaeu implements zzaeh {

    /* renamed from: a */
    private final zzaek f39811a;

    /* renamed from: b */
    private final String f39812b;

    /* renamed from: c */
    private final Object[] f39813c;

    /* renamed from: d */
    private final int f39814d;

    zzaeu(zzaek zzaek, String str, Object[] objArr) {
        this.f39811a = zzaek;
        this.f39812b = str;
        this.f39813c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f39814d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f39814d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo49136a() {
        return (this.f39814d & 1) == 1 ? 1 : 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo49153b() {
        return this.f39812b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Object[] mo49154c() {
        return this.f39813c;
    }

    public final zzaek zza() {
        return this.f39811a;
    }

    public final boolean zzb() {
        return (this.f39814d & 2) == 2;
    }
}
