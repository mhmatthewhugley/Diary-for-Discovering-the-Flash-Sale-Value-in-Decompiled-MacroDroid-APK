package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzbiz implements zzblh {

    /* renamed from: a */
    final /* synthetic */ zzbja f26796a;

    zzbiz(zzbja zzbja) {
        this.f26796a = zzbja;
    }

    /* renamed from: a */
    public final String mo42659a(String str, String str2) {
        return this.f26796a.f26801e.getString(str, str2);
    }

    /* renamed from: b */
    public final Double mo42660b(String str, double d) {
        try {
            return Double.valueOf((double) this.f26796a.f26801e.getFloat(str, (float) d));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.f26796a.f26801e.getString(str, String.valueOf(d)));
        }
    }

    /* renamed from: c */
    public final Long mo42661c(String str, long j) {
        try {
            return Long.valueOf(this.f26796a.f26801e.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf((long) this.f26796a.f26801e.getInt(str, (int) j));
        }
    }

    /* renamed from: d */
    public final Boolean mo42662d(String str, boolean z) {
        try {
            return Boolean.valueOf(this.f26796a.f26801e.getBoolean(str, z));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.f26796a.f26801e.getString(str, String.valueOf(z)));
        }
    }
}
