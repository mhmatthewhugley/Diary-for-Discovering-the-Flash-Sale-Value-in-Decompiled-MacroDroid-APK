package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

@RequiresApi(23)
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzpy implements zzql {

    /* renamed from: a */
    private final MediaCodec f38200a;

    /* renamed from: b */
    private final zzqe f38201b;

    /* renamed from: c */
    private final zzqc f38202c;

    /* renamed from: d */
    private boolean f38203d;

    /* renamed from: e */
    private int f38204e = 0;

    /* synthetic */ zzpy(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, zzpx zzpx) {
        this.f38200a = mediaCodec;
        this.f38201b = new zzqe(handlerThread);
        this.f38202c = new zzqc(mediaCodec, handlerThread2);
    }

    /* renamed from: d */
    static /* synthetic */ void m54565d(zzpy zzpy, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        zzpy.f38201b.mo48048f(zzpy.f38200a);
        int i2 = zzen.f34500a;
        Trace.beginSection("configureCodec");
        zzpy.f38200a.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        Trace.endSection();
        zzpy.f38202c.mo48042f();
        Trace.beginSection("startCodec");
        zzpy.f38200a.start();
        Trace.endSection();
        zzpy.f38204e = 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static String m54566e(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final MediaFormat mo48018a() {
        return this.f38201b.mo48046c();
    }

    /* renamed from: f */
    public final void mo48019f(int i, long j) {
        this.f38200a.releaseOutputBuffer(i, j);
    }

    /* renamed from: g */
    public final void mo48020g() {
        this.f38202c.mo48038b();
        this.f38200a.flush();
        this.f38201b.mo48047e();
        this.f38200a.start();
    }

    /* renamed from: h */
    public final void mo48021h(int i, int i2, int i3, long j, int i4) {
        this.f38202c.mo48039c(i, 0, i3, j, i4);
    }

    /* renamed from: i */
    public final void mo48022i(Surface surface) {
        this.f38200a.setOutputSurface(surface);
    }

    /* renamed from: j */
    public final void mo48023j() {
        try {
            if (this.f38204e == 1) {
                this.f38202c.mo48041e();
                this.f38201b.mo48049g();
            }
            this.f38204e = 2;
            if (!this.f38203d) {
                this.f38200a.release();
                this.f38203d = true;
            }
        } catch (Throwable th) {
            if (!this.f38203d) {
                this.f38200a.release();
                this.f38203d = true;
            }
            throw th;
        }
    }

    /* renamed from: k */
    public final void mo48024k(int i, int i2, zzgf zzgf, long j, int i3) {
        this.f38202c.mo48040d(i, 0, zzgf, j, 0);
    }

    /* renamed from: l */
    public final void mo48025l(int i) {
        this.f38200a.setVideoScalingMode(i);
    }

    /* renamed from: m */
    public final void mo48026m(int i, boolean z) {
        this.f38200a.releaseOutputBuffer(i, z);
    }

    /* renamed from: n */
    public final int mo48027n(MediaCodec.BufferInfo bufferInfo) {
        return this.f38201b.mo48045b(bufferInfo);
    }

    /* renamed from: n0 */
    public final void mo48028n0(Bundle bundle) {
        this.f38200a.setParameters(bundle);
    }

    /* renamed from: q */
    public final boolean mo48029q() {
        return false;
    }

    @Nullable
    /* renamed from: x */
    public final ByteBuffer mo48030x(int i) {
        return this.f38200a.getOutputBuffer(i);
    }

    @Nullable
    /* renamed from: y */
    public final ByteBuffer mo48031y(int i) {
        return this.f38200a.getInputBuffer(i);
    }

    public final int zza() {
        return this.f38201b.mo48044a();
    }
}
