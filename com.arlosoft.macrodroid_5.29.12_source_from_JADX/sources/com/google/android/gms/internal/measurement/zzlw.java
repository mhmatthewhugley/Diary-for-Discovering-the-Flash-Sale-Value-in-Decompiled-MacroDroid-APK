package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzlw implements zzlj {

    /* renamed from: a */
    private final zzlm f41700a;

    /* renamed from: b */
    private final String f41701b;

    /* renamed from: c */
    private final Object[] f41702c;

    /* renamed from: d */
    private final int f41703d;

    zzlw(zzlm zzlm, String str, Object[] objArr) {
        this.f41700a = zzlm;
        this.f41701b = str;
        this.f41702c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f41703d = charAt;
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
                this.f41703d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo51505a() {
        return (this.f41703d & 1) == 1 ? 1 : 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo51521b() {
        return this.f41701b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Object[] mo51522c() {
        return this.f41702c;
    }

    public final zzlm zza() {
        return this.f41700a;
    }

    public final boolean zzb() {
        return (this.f41703d & 2) == 2;
    }
}
