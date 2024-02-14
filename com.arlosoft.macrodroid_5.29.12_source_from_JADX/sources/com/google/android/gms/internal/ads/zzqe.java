package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayDeque;

@RequiresApi(23)
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzqe extends MediaCodec.Callback {

    /* renamed from: a */
    private final Object f38227a = new Object();

    /* renamed from: b */
    private final HandlerThread f38228b;

    /* renamed from: c */
    private Handler f38229c;
    @GuardedBy("lock")

    /* renamed from: d */
    private final zzqi f38230d;
    @GuardedBy("lock")

    /* renamed from: e */
    private final zzqi f38231e;
    @GuardedBy("lock")

    /* renamed from: f */
    private final ArrayDeque f38232f;
    @GuardedBy("lock")

    /* renamed from: g */
    private final ArrayDeque f38233g;
    @GuardedBy("lock")
    @Nullable

    /* renamed from: h */
    private MediaFormat f38234h;
    @GuardedBy("lock")
    @Nullable

    /* renamed from: i */
    private MediaFormat f38235i;
    @GuardedBy("lock")
    @Nullable

    /* renamed from: j */
    private MediaCodec.CodecException f38236j;
    @GuardedBy("lock")

    /* renamed from: k */
    private long f38237k;
    @GuardedBy("lock")

    /* renamed from: l */
    private boolean f38238l;
    @GuardedBy("lock")
    @Nullable

    /* renamed from: m */
    private IllegalStateException f38239m;

    zzqe(HandlerThread handlerThread) {
        this.f38228b = handlerThread;
        this.f38230d = new zzqi();
        this.f38231e = new zzqi();
        this.f38232f = new ArrayDeque();
        this.f38233g = new ArrayDeque();
    }

    /* renamed from: d */
    public static /* synthetic */ void m54595d(zzqe zzqe) {
        synchronized (zzqe.f38227a) {
            if (!zzqe.f38238l) {
                long j = zzqe.f38237k - 1;
                zzqe.f38237k = j;
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i <= 0) {
                    if (i < 0) {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (zzqe.f38227a) {
                            zzqe.f38239m = illegalStateException;
                        }
                        return;
                    }
                    zzqe.m54597i();
                }
            }
        }
    }

    @GuardedBy("lock")
    /* renamed from: h */
    private final void m54596h(MediaFormat mediaFormat) {
        this.f38231e.mo48063b(-2);
        this.f38233g.add(mediaFormat);
    }

    @GuardedBy("lock")
    /* renamed from: i */
    private final void m54597i() {
        if (!this.f38233g.isEmpty()) {
            this.f38235i = (MediaFormat) this.f38233g.getLast();
        }
        this.f38230d.mo48064c();
        this.f38231e.mo48064c();
        this.f38232f.clear();
        this.f38233g.clear();
        this.f38236j = null;
    }

    @GuardedBy("lock")
    /* renamed from: j */
    private final void m54598j() {
        IllegalStateException illegalStateException = this.f38239m;
        if (illegalStateException != null) {
            this.f38239m = null;
            throw illegalStateException;
        }
    }

    @GuardedBy("lock")
    /* renamed from: k */
    private final void m54599k() {
        MediaCodec.CodecException codecException = this.f38236j;
        if (codecException != null) {
            this.f38236j = null;
            throw codecException;
        }
    }

    @GuardedBy("lock")
    /* renamed from: l */
    private final boolean m54600l() {
        return this.f38237k > 0 || this.f38238l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo48044a() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f38227a
            monitor-enter(r0)
            boolean r1 = r3.m54600l()     // Catch:{ all -> 0x0023 }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return r2
        L_0x000c:
            r3.m54598j()     // Catch:{ all -> 0x0023 }
            r3.m54599k()     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.zzqi r1 = r3.f38230d     // Catch:{ all -> 0x0023 }
            boolean r1 = r1.mo48065d()     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x001b
            goto L_0x0021
        L_0x001b:
            com.google.android.gms.internal.ads.zzqi r1 = r3.f38230d     // Catch:{ all -> 0x0023 }
            int r2 = r1.mo48062a()     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return r2
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqe.mo48044a():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        return r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo48045b(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f38227a
            monitor-enter(r0)
            boolean r1 = r9.m54600l()     // Catch:{ all -> 0x004e }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return r2
        L_0x000c:
            r9.m54598j()     // Catch:{ all -> 0x004e }
            r9.m54599k()     // Catch:{ all -> 0x004e }
            com.google.android.gms.internal.ads.zzqi r1 = r9.f38231e     // Catch:{ all -> 0x004e }
            boolean r1 = r1.mo48065d()     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x001c
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return r2
        L_0x001c:
            com.google.android.gms.internal.ads.zzqi r1 = r9.f38231e     // Catch:{ all -> 0x004e }
            int r1 = r1.mo48062a()     // Catch:{ all -> 0x004e }
            r2 = -2
            if (r1 < 0) goto L_0x003f
            android.media.MediaFormat r2 = r9.f38234h     // Catch:{ all -> 0x004e }
            com.google.android.gms.internal.ads.zzdd.m47208b(r2)     // Catch:{ all -> 0x004e }
            java.util.ArrayDeque r2 = r9.f38232f     // Catch:{ all -> 0x004e }
            java.lang.Object r2 = r2.remove()     // Catch:{ all -> 0x004e }
            android.media.MediaCodec$BufferInfo r2 = (android.media.MediaCodec.BufferInfo) r2     // Catch:{ all -> 0x004e }
            int r4 = r2.offset     // Catch:{ all -> 0x004e }
            int r5 = r2.size     // Catch:{ all -> 0x004e }
            long r6 = r2.presentationTimeUs     // Catch:{ all -> 0x004e }
            int r8 = r2.flags     // Catch:{ all -> 0x004e }
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch:{ all -> 0x004e }
            goto L_0x004c
        L_0x003f:
            if (r1 != r2) goto L_0x004c
            java.util.ArrayDeque r10 = r9.f38233g     // Catch:{ all -> 0x004e }
            java.lang.Object r10 = r10.remove()     // Catch:{ all -> 0x004e }
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch:{ all -> 0x004e }
            r9.f38234h = r10     // Catch:{ all -> 0x004e }
            r1 = -2
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return r1
        L_0x004e:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqe.mo48045b(android.media.MediaCodec$BufferInfo):int");
    }

    /* renamed from: c */
    public final MediaFormat mo48046c() {
        MediaFormat mediaFormat;
        synchronized (this.f38227a) {
            mediaFormat = this.f38234h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* renamed from: e */
    public final void mo48047e() {
        synchronized (this.f38227a) {
            this.f38237k++;
            Handler handler = this.f38229c;
            int i = zzen.f34500a;
            handler.post(new zzqd(this));
        }
    }

    /* renamed from: f */
    public final void mo48048f(MediaCodec mediaCodec) {
        zzdd.m47212f(this.f38229c == null);
        this.f38228b.start();
        Handler handler = new Handler(this.f38228b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f38229c = handler;
    }

    /* renamed from: g */
    public final void mo48049g() {
        synchronized (this.f38227a) {
            this.f38238l = true;
            this.f38228b.quit();
            m54597i();
        }
    }

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f38227a) {
            this.f38236j = codecException;
        }
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f38227a) {
            this.f38230d.mo48063b(i);
        }
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f38227a) {
            MediaFormat mediaFormat = this.f38235i;
            if (mediaFormat != null) {
                m54596h(mediaFormat);
                this.f38235i = null;
            }
            this.f38231e.mo48063b(i);
            this.f38232f.add(bufferInfo);
        }
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f38227a) {
            m54596h(mediaFormat);
            this.f38235i = null;
        }
    }
}
