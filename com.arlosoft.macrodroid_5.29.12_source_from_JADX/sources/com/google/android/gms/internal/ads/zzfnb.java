package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfnb extends zzfmy {

    /* renamed from: a */
    private String f36140a;

    /* renamed from: b */
    private boolean f36141b;

    /* renamed from: c */
    private boolean f36142c;

    /* renamed from: d */
    private byte f36143d;

    zzfnb() {
    }

    /* renamed from: a */
    public final zzfmy mo45986a(String str) {
        Objects.requireNonNull(str, "Null clientVersion");
        this.f36140a = str;
        return this;
    }

    /* renamed from: b */
    public final zzfmy mo45987b(boolean z) {
        this.f36142c = true;
        this.f36143d = (byte) (this.f36143d | 2);
        return this;
    }

    /* renamed from: c */
    public final zzfmy mo45988c(boolean z) {
        this.f36141b = z;
        this.f36143d = (byte) (this.f36143d | 1);
        return this;
    }

    /* renamed from: d */
    public final zzfmz mo45989d() {
        String str;
        if (this.f36143d == 3 && (str = this.f36140a) != null) {
            return new zzfnd(str, this.f36141b, this.f36142c, (zzfnc) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f36140a == null) {
            sb.append(" clientVersion");
        }
        if ((this.f36143d & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.f36143d & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
