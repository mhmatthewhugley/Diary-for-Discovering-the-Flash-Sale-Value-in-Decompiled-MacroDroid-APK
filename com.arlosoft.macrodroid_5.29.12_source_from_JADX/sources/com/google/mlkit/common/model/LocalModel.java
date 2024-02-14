package com.google.mlkit.common.model;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.mlkit_common.zzw;
import com.google.android.gms.internal.mlkit_common.zzx;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public class LocalModel {
    @Nullable

    /* renamed from: a */
    private final String f56269a;
    @Nullable

    /* renamed from: b */
    private final String f56270b;
    @Nullable

    /* renamed from: c */
    private final Uri f56271c;

    /* renamed from: d */
    private final boolean f56272d;

    /* compiled from: com.google.mlkit:common@@18.5.0 */
    public static class Builder {
        @Nullable

        /* renamed from: a */
        private String f56273a = null;
        @Nullable

        /* renamed from: b */
        private String f56274b = null;
        @Nullable

        /* renamed from: c */
        private Uri f56275c = null;

        /* renamed from: d */
        private boolean f56276d = false;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalModel)) {
            return false;
        }
        LocalModel localModel = (LocalModel) obj;
        return Objects.m4470a(this.f56269a, localModel.f56269a) && Objects.m4470a(this.f56270b, localModel.f56270b) && Objects.m4470a(this.f56271c, localModel.f56271c) && this.f56272d == localModel.f56272d;
    }

    public int hashCode() {
        return Objects.m4471b(this.f56269a, this.f56270b, this.f56271c, Boolean.valueOf(this.f56272d));
    }

    @NonNull
    public String toString() {
        zzw a = zzx.m61549a(this);
        a.mo52015a("absoluteFilePath", this.f56269a);
        a.mo52015a("assetFilePath", this.f56270b);
        a.mo52015a("uri", this.f56271c);
        a.mo52016b("isManifestFile", this.f56272d);
        return a.toString();
    }
}
