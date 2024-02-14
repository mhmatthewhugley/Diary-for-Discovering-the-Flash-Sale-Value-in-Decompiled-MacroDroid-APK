package com.google.android.gms.internal.mlkit_common;

import com.google.mlkit.common.sdkinternal.ModelType;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzmg extends zzms {

    /* renamed from: a */
    private final zziy f43023a;

    /* renamed from: b */
    private final String f43024b;

    /* renamed from: c */
    private final boolean f43025c;

    /* renamed from: d */
    private final boolean f43026d;

    /* renamed from: e */
    private final ModelType f43027e;

    /* renamed from: f */
    private final zzje f43028f;

    /* renamed from: g */
    private final int f43029g;

    /* synthetic */ zzmg(zziy zziy, String str, boolean z, boolean z2, ModelType modelType, zzje zzje, int i, zzmf zzmf) {
        this.f43023a = zziy;
        this.f43024b = str;
        this.f43025c = z;
        this.f43026d = z2;
        this.f43027e = modelType;
        this.f43028f = zzje;
        this.f43029g = i;
    }

    /* renamed from: a */
    public final int mo51987a() {
        return this.f43029g;
    }

    /* renamed from: b */
    public final ModelType mo51988b() {
        return this.f43027e;
    }

    /* renamed from: c */
    public final zziy mo51989c() {
        return this.f43023a;
    }

    /* renamed from: d */
    public final zzje mo51990d() {
        return this.f43028f;
    }

    /* renamed from: e */
    public final String mo51991e() {
        return this.f43024b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzms) {
            zzms zzms = (zzms) obj;
            return this.f43023a.equals(zzms.mo51989c()) && this.f43024b.equals(zzms.mo51991e()) && this.f43025c == zzms.mo51994g() && this.f43026d == zzms.mo51993f() && this.f43027e.equals(zzms.mo51988b()) && this.f43028f.equals(zzms.mo51990d()) && this.f43029g == zzms.mo51987a();
        }
    }

    /* renamed from: f */
    public final boolean mo51993f() {
        return this.f43026d;
    }

    /* renamed from: g */
    public final boolean mo51994g() {
        return this.f43025c;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((this.f43023a.hashCode() ^ 1000003) * 1000003) ^ this.f43024b.hashCode()) * 1000003) ^ (true != this.f43025c ? 1237 : 1231)) * 1000003;
        if (true == this.f43026d) {
            i = 1231;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.f43027e.hashCode()) * 1000003) ^ this.f43028f.hashCode()) * 1000003) ^ this.f43029g;
    }

    public final String toString() {
        String obj = this.f43023a.toString();
        String str = this.f43024b;
        boolean z = this.f43025c;
        boolean z2 = this.f43026d;
        String obj2 = this.f43027e.toString();
        String obj3 = this.f43028f.toString();
        int i = this.f43029g;
        return "RemoteModelLoggingOptions{errorCode=" + obj + ", tfliteSchemaVersion=" + str + ", shouldLogRoughDownloadTime=" + z + ", shouldLogExactDownloadTime=" + z2 + ", modelType=" + obj2 + ", downloadStatus=" + obj3 + ", failureStatusCode=" + i + "}";
    }
}
