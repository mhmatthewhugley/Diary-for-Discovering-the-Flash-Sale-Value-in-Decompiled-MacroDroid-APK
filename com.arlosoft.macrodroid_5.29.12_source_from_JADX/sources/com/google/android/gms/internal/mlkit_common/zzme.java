package com.google.android.gms.internal.mlkit_common;

import com.google.mlkit.common.sdkinternal.ModelType;
import java.util.Objects;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzme extends zzmr {

    /* renamed from: a */
    private zziy f43015a;

    /* renamed from: b */
    private String f43016b;

    /* renamed from: c */
    private boolean f43017c;

    /* renamed from: d */
    private boolean f43018d;

    /* renamed from: e */
    private ModelType f43019e;

    /* renamed from: f */
    private zzje f43020f;

    /* renamed from: g */
    private int f43021g;

    /* renamed from: h */
    private byte f43022h;

    zzme() {
    }

    /* renamed from: a */
    public final zzmr mo51979a(zzje zzje) {
        Objects.requireNonNull(zzje, "Null downloadStatus");
        this.f43020f = zzje;
        return this;
    }

    /* renamed from: b */
    public final zzmr mo51980b(zziy zziy) {
        Objects.requireNonNull(zziy, "Null errorCode");
        this.f43015a = zziy;
        return this;
    }

    /* renamed from: c */
    public final zzmr mo51981c(int i) {
        this.f43021g = i;
        this.f43022h = (byte) (this.f43022h | 4);
        return this;
    }

    /* renamed from: d */
    public final zzmr mo51982d(ModelType modelType) {
        Objects.requireNonNull(modelType, "Null modelType");
        this.f43019e = modelType;
        return this;
    }

    /* renamed from: e */
    public final zzmr mo51983e(boolean z) {
        this.f43018d = z;
        this.f43022h = (byte) (this.f43022h | 2);
        return this;
    }

    /* renamed from: f */
    public final zzmr mo51984f(boolean z) {
        this.f43017c = z;
        this.f43022h = (byte) (this.f43022h | 1);
        return this;
    }

    /* renamed from: g */
    public final zzms mo51985g() {
        zziy zziy;
        String str;
        ModelType modelType;
        zzje zzje;
        if (this.f43022h == 7 && (zziy = this.f43015a) != null && (str = this.f43016b) != null && (modelType = this.f43019e) != null && (zzje = this.f43020f) != null) {
            return new zzmg(zziy, str, this.f43017c, this.f43018d, modelType, zzje, this.f43021g, (zzmf) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f43015a == null) {
            sb.append(" errorCode");
        }
        if (this.f43016b == null) {
            sb.append(" tfliteSchemaVersion");
        }
        if ((this.f43022h & 1) == 0) {
            sb.append(" shouldLogRoughDownloadTime");
        }
        if ((this.f43022h & 2) == 0) {
            sb.append(" shouldLogExactDownloadTime");
        }
        if (this.f43019e == null) {
            sb.append(" modelType");
        }
        if (this.f43020f == null) {
            sb.append(" downloadStatus");
        }
        if ((this.f43022h & 4) == 0) {
            sb.append(" failureStatusCode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: h */
    public final zzmr mo51986h(String str) {
        this.f43016b = "NA";
        return this;
    }
}
