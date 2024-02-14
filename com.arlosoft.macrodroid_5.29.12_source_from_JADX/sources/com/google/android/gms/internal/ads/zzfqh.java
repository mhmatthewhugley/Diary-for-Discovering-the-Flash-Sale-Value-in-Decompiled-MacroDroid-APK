package com.google.android.gms.internal.ads;

import android.os.IBinder;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfqh extends zzfrb {

    /* renamed from: a */
    private IBinder f36260a;

    /* renamed from: b */
    private String f36261b;

    /* renamed from: c */
    private int f36262c;

    /* renamed from: d */
    private float f36263d;

    /* renamed from: e */
    private int f36264e;

    /* renamed from: f */
    private String f36265f;

    /* renamed from: g */
    private byte f36266g;

    zzfqh() {
    }

    /* renamed from: a */
    public final zzfrb mo46090a(String str) {
        this.f36265f = str;
        return this;
    }

    /* renamed from: b */
    public final zzfrb mo46091b(String str) {
        this.f36261b = str;
        return this;
    }

    /* renamed from: c */
    public final zzfrb mo46092c(int i) {
        this.f36266g = (byte) (this.f36266g | 8);
        return this;
    }

    /* renamed from: d */
    public final zzfrb mo46093d(int i) {
        this.f36262c = i;
        this.f36266g = (byte) (this.f36266g | 2);
        return this;
    }

    /* renamed from: e */
    public final zzfrb mo46094e(float f) {
        this.f36263d = f;
        this.f36266g = (byte) (this.f36266g | 4);
        return this;
    }

    /* renamed from: f */
    public final zzfrb mo46095f(boolean z) {
        this.f36266g = (byte) (this.f36266g | 1);
        return this;
    }

    /* renamed from: g */
    public final zzfrb mo46096g(IBinder iBinder) {
        Objects.requireNonNull(iBinder, "Null windowToken");
        this.f36260a = iBinder;
        return this;
    }

    /* renamed from: h */
    public final zzfrb mo46097h(int i) {
        this.f36264e = i;
        this.f36266g = (byte) (this.f36266g | 16);
        return this;
    }

    /* renamed from: i */
    public final zzfrc mo46098i() {
        IBinder iBinder;
        if (this.f36266g == 31 && (iBinder = this.f36260a) != null) {
            return new zzfqj(iBinder, false, this.f36261b, this.f36262c, this.f36263d, 0, (String) null, this.f36264e, this.f36265f, (zzfqi) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f36260a == null) {
            sb.append(" windowToken");
        }
        if ((this.f36266g & 1) == 0) {
            sb.append(" stableSessionToken");
        }
        if ((this.f36266g & 2) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.f36266g & 4) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.f36266g & 8) == 0) {
            sb.append(" displayMode");
        }
        if ((this.f36266g & 16) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
