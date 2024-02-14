package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzdm implements zzcz {

    /* renamed from: a */
    private final zzdc f45699a;

    /* renamed from: b */
    private final String f45700b;

    /* renamed from: c */
    private final Object[] f45701c;

    /* renamed from: d */
    private final int f45702d;

    zzdm(zzdc zzdc, String str, Object[] objArr) {
        this.f45699a = zzdc;
        this.f45700b = str;
        this.f45701c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f45702d = charAt;
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
                this.f45702d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo53993a() {
        return (this.f45702d & 1) == 1 ? 1 : 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo54006b() {
        return this.f45700b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Object[] mo54007c() {
        return this.f45701c;
    }

    public final zzdc zza() {
        return this.f45699a;
    }

    public final boolean zzb() {
        return (this.f45702d & 2) == 2;
    }
}
