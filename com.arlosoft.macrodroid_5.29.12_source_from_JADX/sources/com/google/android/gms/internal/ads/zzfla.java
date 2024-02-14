package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfla {

    /* renamed from: a */
    private final String f36040a;

    /* renamed from: b */
    private final String f36041b;

    private zzfla(String str, String str2) {
        this.f36040a = str;
        this.f36041b = str2;
    }

    /* renamed from: a */
    public static zzfla m50451a(String str, String str2) {
        zzfly.m50527a(str, "Name is null or empty");
        zzfly.m50527a(str2, "Version is null or empty");
        return new zzfla(str, str2);
    }

    /* renamed from: b */
    public final String mo45887b() {
        return this.f36040a;
    }

    /* renamed from: c */
    public final String mo45888c() {
        return this.f36041b;
    }
}
