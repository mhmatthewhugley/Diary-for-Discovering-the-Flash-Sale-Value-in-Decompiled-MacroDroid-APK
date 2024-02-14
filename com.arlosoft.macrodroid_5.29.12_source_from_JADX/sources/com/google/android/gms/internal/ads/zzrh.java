package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzrh implements zzql {

    /* renamed from: a */
    private final MediaCodec f38347a;
    @Nullable

    /* renamed from: b */
    private ByteBuffer[] f38348b;
    @Nullable

    /* renamed from: c */
    private ByteBuffer[] f38349c;

    /* synthetic */ zzrh(MediaCodec mediaCodec, zzrg zzrg) {
        this.f38347a = mediaCodec;
        if (zzen.f34500a < 21) {
            this.f38348b = mediaCodec.getInputBuffers();
            this.f38349c = mediaCodec.getOutputBuffers();
        }
    }

    /* renamed from: a */
    public final MediaFormat mo48018a() {
        return this.f38347a.getOutputFormat();
    }

    @RequiresApi(21)
    /* renamed from: f */
    public final void mo48019f(int i, long j) {
        this.f38347a.releaseOutputBuffer(i, j);
    }

    /* renamed from: g */
    public final void mo48020g() {
        this.f38347a.flush();
    }

    /* renamed from: h */
    public final void mo48021h(int i, int i2, int i3, long j, int i4) {
        this.f38347a.queueInputBuffer(i, 0, i3, j, i4);
    }

    @RequiresApi(23)
    /* renamed from: i */
    public final void mo48022i(Surface surface) {
        this.f38347a.setOutputSurface(surface);
    }

    /* renamed from: j */
    public final void mo48023j() {
        this.f38348b = null;
        this.f38349c = null;
        this.f38347a.release();
    }

    /* renamed from: k */
    public final void mo48024k(int i, int i2, zzgf zzgf, long j, int i3) {
        this.f38347a.queueSecureInputBuffer(i, 0, zzgf.mo46768a(), j, 0);
    }

    /* renamed from: l */
    public final void mo48025l(int i) {
        this.f38347a.setVideoScalingMode(i);
    }

    /* renamed from: m */
    public final void mo48026m(int i, boolean z) {
        this.f38347a.releaseOutputBuffer(i, z);
    }

    /* renamed from: n */
    public final int mo48027n(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f38347a.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3) {
                if (zzen.f34500a < 21) {
                    this.f38349c = this.f38347a.getOutputBuffers();
                }
                dequeueOutputBuffer = -3;
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @RequiresApi(19)
    /* renamed from: n0 */
    public final void mo48028n0(Bundle bundle) {
        this.f38347a.setParameters(bundle);
    }

    /* renamed from: q */
    public final boolean mo48029q() {
        return false;
    }

    @Nullable
    /* renamed from: x */
    public final ByteBuffer mo48030x(int i) {
        if (zzen.f34500a >= 21) {
            return this.f38347a.getOutputBuffer(i);
        }
        return ((ByteBuffer[]) zzen.m49166h(this.f38349c))[i];
    }

    @Nullable
    /* renamed from: y */
    public final ByteBuffer mo48031y(int i) {
        if (zzen.f34500a >= 21) {
            return this.f38347a.getInputBuffer(i);
        }
        return ((ByteBuffer[]) zzen.m49166h(this.f38348b))[i];
    }

    public final int zza() {
        return this.f38347a.dequeueInputBuffer(0);
    }
}
