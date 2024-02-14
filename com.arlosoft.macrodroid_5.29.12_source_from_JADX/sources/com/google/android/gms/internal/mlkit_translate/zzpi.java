package com.google.android.gms.internal.mlkit_translate;

import com.google.mlkit.common.sdkinternal.ModelType;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzpi extends zzpw {

    /* renamed from: a */
    private final zzld f44412a;

    /* renamed from: b */
    private final String f44413b;

    /* renamed from: c */
    private final boolean f44414c;

    /* renamed from: d */
    private final ModelType f44415d;

    /* renamed from: e */
    private final zzlj f44416e;

    /* renamed from: f */
    private final int f44417f;

    /* synthetic */ zzpi(zzld zzld, String str, boolean z, boolean z2, ModelType modelType, zzlj zzlj, int i, zzph zzph) {
        this.f44412a = zzld;
        this.f44413b = str;
        this.f44414c = z;
        this.f44415d = modelType;
        this.f44416e = zzlj;
        this.f44417f = i;
    }

    /* renamed from: a */
    public final int mo52421a() {
        return this.f44417f;
    }

    /* renamed from: b */
    public final ModelType mo52422b() {
        return this.f44415d;
    }

    /* renamed from: c */
    public final zzld mo52423c() {
        return this.f44412a;
    }

    /* renamed from: d */
    public final zzlj mo52424d() {
        return this.f44416e;
    }

    /* renamed from: e */
    public final String mo52425e() {
        return this.f44413b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzpw) {
            zzpw zzpw = (zzpw) obj;
            if (this.f44412a.equals(zzpw.mo52423c()) && this.f44413b.equals(zzpw.mo52425e()) && this.f44414c == zzpw.mo52428g()) {
                zzpw.mo52427f();
                return this.f44415d.equals(zzpw.mo52422b()) && this.f44416e.equals(zzpw.mo52424d()) && this.f44417f == zzpw.mo52421a();
            }
        }
    }

    /* renamed from: f */
    public final boolean mo52427f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo52428g() {
        return this.f44414c;
    }

    public final int hashCode() {
        return ((((((((((((this.f44412a.hashCode() ^ 1000003) * 1000003) ^ this.f44413b.hashCode()) * 1000003) ^ (true != this.f44414c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ this.f44415d.hashCode()) * 1000003) ^ this.f44416e.hashCode()) * 1000003) ^ this.f44417f;
    }

    public final String toString() {
        String obj = this.f44412a.toString();
        String str = this.f44413b;
        boolean z = this.f44414c;
        String obj2 = this.f44415d.toString();
        String obj3 = this.f44416e.toString();
        int i = this.f44417f;
        return "RemoteModelLoggingOptions{errorCode=" + obj + ", tfliteSchemaVersion=" + str + ", shouldLogRoughDownloadTime=" + z + ", shouldLogExactDownloadTime=false, modelType=" + obj2 + ", downloadStatus=" + obj3 + ", failureStatusCode=" + i + "}";
    }
}
