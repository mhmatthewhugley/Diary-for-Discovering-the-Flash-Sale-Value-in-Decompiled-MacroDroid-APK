package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgsy implements zzgsl {

    /* renamed from: a */
    private final zzgso f37247a;

    /* renamed from: b */
    private final String f37248b;

    /* renamed from: c */
    private final Object[] f37249c;

    /* renamed from: d */
    private final int f37250d;

    zzgsy(zzgso zzgso, String str, Object[] objArr) {
        this.f37247a = zzgso;
        this.f37248b = str;
        this.f37249c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f37250d = charAt;
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
                this.f37250d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo47408a() {
        return (this.f37250d & 1) == 1 ? 1 : 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo47425b() {
        return this.f37248b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Object[] mo47426c() {
        return this.f37249c;
    }

    public final zzgso zza() {
        return this.f37247a;
    }

    public final boolean zzb() {
        return (this.f37250d & 2) == 2;
    }
}
