package com.google.mlkit.common.internal.model;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.mlkit.common.internal.model.ModelUtils;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class AutoValue_ModelUtils_AutoMLManifest extends ModelUtils.AutoMLManifest {

    /* renamed from: a */
    private final String f56237a;

    /* renamed from: b */
    private final String f56238b;

    /* renamed from: c */
    private final String f56239c;

    @KeepForSdk
    /* renamed from: a */
    public String mo64500a() {
        return this.f56239c;
    }

    @KeepForSdk
    /* renamed from: b */
    public String mo64501b() {
        return this.f56238b;
    }

    @KeepForSdk
    /* renamed from: c */
    public String mo64502c() {
        return this.f56237a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ModelUtils.AutoMLManifest) {
            ModelUtils.AutoMLManifest autoMLManifest = (ModelUtils.AutoMLManifest) obj;
            return this.f56237a.equals(autoMLManifest.mo64502c()) && this.f56238b.equals(autoMLManifest.mo64501b()) && this.f56239c.equals(autoMLManifest.mo64500a());
        }
    }

    public final int hashCode() {
        return ((((this.f56237a.hashCode() ^ 1000003) * 1000003) ^ this.f56238b.hashCode()) * 1000003) ^ this.f56239c.hashCode();
    }

    public final String toString() {
        String str = this.f56237a;
        String str2 = this.f56238b;
        String str3 = this.f56239c;
        return "AutoMLManifest{modelType=" + str + ", modelFile=" + str2 + ", labelsFile=" + str3 + "}";
    }
}
