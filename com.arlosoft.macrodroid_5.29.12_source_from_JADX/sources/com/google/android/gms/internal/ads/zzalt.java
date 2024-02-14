package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzalt extends zzgwr {

    /* renamed from: C */
    private Date f24952C;

    /* renamed from: D */
    private Date f24953D;

    /* renamed from: E */
    private long f24954E;

    /* renamed from: F */
    private long f24955F;

    /* renamed from: G */
    private double f24956G = 1.0d;

    /* renamed from: H */
    private float f24957H = 1.0f;

    /* renamed from: I */
    private zzgxb f24958I = zzgxb.f37397j;

    /* renamed from: J */
    private long f24959J;

    public zzalt() {
        super("mvhd");
    }

    /* renamed from: d */
    public final void mo41638d(ByteBuffer byteBuffer) {
        mo47577g(byteBuffer);
        if (mo47576f() == 1) {
            this.f24952C = zzgww.m53633a(zzalp.m41714f(byteBuffer));
            this.f24953D = zzgww.m53633a(zzalp.m41714f(byteBuffer));
            this.f24954E = zzalp.m41713e(byteBuffer);
            this.f24955F = zzalp.m41714f(byteBuffer);
        } else {
            this.f24952C = zzgww.m53633a(zzalp.m41713e(byteBuffer));
            this.f24953D = zzgww.m53633a(zzalp.m41713e(byteBuffer));
            this.f24954E = zzalp.m41713e(byteBuffer);
            this.f24955F = zzalp.m41713e(byteBuffer);
        }
        this.f24956G = zzalp.m41710b(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.f24957H = ((float) ((short) ((bArr[1] & 255) | ((short) ((bArr[0] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK))))) / 256.0f;
        zzalp.m41712d(byteBuffer);
        zzalp.m41713e(byteBuffer);
        zzalp.m41713e(byteBuffer);
        double b = zzalp.m41710b(byteBuffer);
        double b2 = zzalp.m41710b(byteBuffer);
        double a = zzalp.m41709a(byteBuffer);
        this.f24958I = new zzgxb(b, b2, zzalp.m41710b(byteBuffer), zzalp.m41710b(byteBuffer), a, zzalp.m41709a(byteBuffer), zzalp.m41709a(byteBuffer), zzalp.m41710b(byteBuffer), zzalp.m41710b(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f24959J = zzalp.m41713e(byteBuffer);
    }

    /* renamed from: h */
    public final long mo41639h() {
        return this.f24955F;
    }

    /* renamed from: i */
    public final long mo41640i() {
        return this.f24954E;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f24952C + ";modificationTime=" + this.f24953D + ";timescale=" + this.f24954E + ";duration=" + this.f24955F + ";rate=" + this.f24956G + ";volume=" + this.f24957H + ";matrix=" + this.f24958I + ";nextTrackId=" + this.f24959J + "]";
    }
}
