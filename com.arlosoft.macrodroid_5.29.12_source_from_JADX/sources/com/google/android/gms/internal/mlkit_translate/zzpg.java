package com.google.android.gms.internal.mlkit_translate;

import com.google.mlkit.common.sdkinternal.ModelType;
import java.util.Objects;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzpg extends zzpv {

    /* renamed from: a */
    private zzld f44405a;

    /* renamed from: b */
    private String f44406b;

    /* renamed from: c */
    private boolean f44407c;

    /* renamed from: d */
    private ModelType f44408d;

    /* renamed from: e */
    private zzlj f44409e;

    /* renamed from: f */
    private int f44410f;

    /* renamed from: g */
    private byte f44411g;

    zzpg() {
    }

    /* renamed from: a */
    public final zzpv mo52413a(zzlj zzlj) {
        Objects.requireNonNull(zzlj, "Null downloadStatus");
        this.f44409e = zzlj;
        return this;
    }

    /* renamed from: b */
    public final zzpv mo52414b(zzld zzld) {
        Objects.requireNonNull(zzld, "Null errorCode");
        this.f44405a = zzld;
        return this;
    }

    /* renamed from: c */
    public final zzpv mo52415c(int i) {
        this.f44410f = i;
        this.f44411g = (byte) (this.f44411g | 4);
        return this;
    }

    /* renamed from: d */
    public final zzpv mo52416d(ModelType modelType) {
        Objects.requireNonNull(modelType, "Null modelType");
        this.f44408d = modelType;
        return this;
    }

    /* renamed from: e */
    public final zzpv mo52417e(boolean z) {
        this.f44411g = (byte) (this.f44411g | 2);
        return this;
    }

    /* renamed from: f */
    public final zzpv mo52418f(boolean z) {
        this.f44407c = z;
        this.f44411g = (byte) (this.f44411g | 1);
        return this;
    }

    /* renamed from: g */
    public final zzpw mo52419g() {
        zzld zzld;
        String str;
        ModelType modelType;
        zzlj zzlj;
        if (this.f44411g == 7 && (zzld = this.f44405a) != null && (str = this.f44406b) != null && (modelType = this.f44408d) != null && (zzlj = this.f44409e) != null) {
            return new zzpi(zzld, str, this.f44407c, false, modelType, zzlj, this.f44410f, (zzph) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f44405a == null) {
            sb.append(" errorCode");
        }
        if (this.f44406b == null) {
            sb.append(" tfliteSchemaVersion");
        }
        if ((this.f44411g & 1) == 0) {
            sb.append(" shouldLogRoughDownloadTime");
        }
        if ((this.f44411g & 2) == 0) {
            sb.append(" shouldLogExactDownloadTime");
        }
        if (this.f44408d == null) {
            sb.append(" modelType");
        }
        if (this.f44409e == null) {
            sb.append(" downloadStatus");
        }
        if ((this.f44411g & 4) == 0) {
            sb.append(" failureStatusCode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: h */
    public final zzpv mo52420h(String str) {
        this.f44406b = "NA";
        return this;
    }
}
