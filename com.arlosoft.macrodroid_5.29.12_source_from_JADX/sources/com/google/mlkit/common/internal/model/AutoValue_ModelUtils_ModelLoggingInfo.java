package com.google.mlkit.common.internal.model;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.mlkit.common.internal.model.ModelUtils;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class AutoValue_ModelUtils_ModelLoggingInfo extends ModelUtils.ModelLoggingInfo {

    /* renamed from: a */
    private final long f56240a;

    /* renamed from: b */
    private final String f56241b;

    /* renamed from: c */
    private final boolean f56242c;

    @KeepForSdk
    /* renamed from: a */
    public String mo64506a() {
        return this.f56241b;
    }

    @KeepForSdk
    /* renamed from: b */
    public long mo64507b() {
        return this.f56240a;
    }

    @KeepForSdk
    /* renamed from: c */
    public boolean mo64508c() {
        return this.f56242c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ModelUtils.ModelLoggingInfo) {
            ModelUtils.ModelLoggingInfo modelLoggingInfo = (ModelUtils.ModelLoggingInfo) obj;
            return this.f56240a == modelLoggingInfo.mo64507b() && this.f56241b.equals(modelLoggingInfo.mo64506a()) && this.f56242c == modelLoggingInfo.mo64508c();
        }
    }

    public final int hashCode() {
        long j = this.f56240a;
        return (true != this.f56242c ? 1237 : 1231) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f56241b.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.f56240a;
        String str = this.f56241b;
        boolean z = this.f56242c;
        return "ModelLoggingInfo{size=" + j + ", hash=" + str + ", manifestModel=" + z + "}";
    }
}
