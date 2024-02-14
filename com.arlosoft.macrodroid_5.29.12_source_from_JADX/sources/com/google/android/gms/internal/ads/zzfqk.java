package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfqk extends zzfrd {

    /* renamed from: a */
    private int f36273a;

    /* renamed from: b */
    private String f36274b;

    /* renamed from: c */
    private byte f36275c;

    zzfqk() {
    }

    /* renamed from: a */
    public final zzfrd mo46111a(String str) {
        this.f36274b = str;
        return this;
    }

    /* renamed from: b */
    public final zzfrd mo46112b(int i) {
        this.f36273a = i;
        this.f36275c = 1;
        return this;
    }

    /* renamed from: c */
    public final zzfre mo46113c() {
        if (this.f36275c == 1) {
            return new zzfqm(this.f36273a, this.f36274b, (zzfql) null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
