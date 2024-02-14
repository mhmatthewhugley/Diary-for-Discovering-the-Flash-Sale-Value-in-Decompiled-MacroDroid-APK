package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

@RequiresApi(23)
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzqc {
    @GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")

    /* renamed from: g */
    private static final ArrayDeque f38218g = new ArrayDeque();

    /* renamed from: h */
    private static final Object f38219h = new Object();

    /* renamed from: a */
    private final MediaCodec f38220a;

    /* renamed from: b */
    private final HandlerThread f38221b;

    /* renamed from: c */
    private Handler f38222c;

    /* renamed from: d */
    private final AtomicReference f38223d = new AtomicReference();

    /* renamed from: e */
    private final zzdg f38224e;

    /* renamed from: f */
    private boolean f38225f;

    public zzqc(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzdg zzdg = new zzdg(zzde.f32179a);
        this.f38220a = mediaCodec;
        this.f38221b = handlerThread;
        this.f38224e = zzdg;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m54585a(com.google.android.gms.internal.ads.zzqc r9, android.os.Message r10) {
        /*
            int r0 = r10.what
            r1 = 0
            if (r0 == 0) goto L_0x0043
            r2 = 1
            if (r0 == r2) goto L_0x0022
            r2 = 2
            if (r0 == r2) goto L_0x001c
            java.util.concurrent.atomic.AtomicReference r9 = r9.f38223d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r10 = r10.what
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r0.<init>(r10)
            com.google.android.gms.internal.ads.zzpz.m54581a(r9, r1, r0)
            goto L_0x005d
        L_0x001c:
            com.google.android.gms.internal.ads.zzdg r9 = r9.f38224e
            r9.mo44618e()
            goto L_0x005d
        L_0x0022:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.internal.ads.zzqb r10 = (com.google.android.gms.internal.ads.zzqb) r10
            int r3 = r10.f38212a
            android.media.MediaCodec$CryptoInfo r5 = r10.f38215d
            long r6 = r10.f38216e
            int r8 = r10.f38217f
            java.lang.Object r0 = f38219h     // Catch:{ RuntimeException -> 0x003c }
            monitor-enter(r0)     // Catch:{ RuntimeException -> 0x003c }
            android.media.MediaCodec r2 = r9.f38220a     // Catch:{ all -> 0x0039 }
            r4 = 0
            r2.queueSecureInputBuffer(r3, r4, r5, r6, r8)     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            goto L_0x005c
        L_0x0039:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r2     // Catch:{ RuntimeException -> 0x003c }
        L_0x003c:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.f38223d
            com.google.android.gms.internal.ads.zzpz.m54581a(r9, r1, r0)
            goto L_0x005c
        L_0x0043:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.internal.ads.zzqb r10 = (com.google.android.gms.internal.ads.zzqb) r10
            int r3 = r10.f38212a
            int r5 = r10.f38214c
            long r6 = r10.f38216e
            int r8 = r10.f38217f
            android.media.MediaCodec r2 = r9.f38220a     // Catch:{ RuntimeException -> 0x0056 }
            r4 = 0
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch:{ RuntimeException -> 0x0056 }
            goto L_0x005c
        L_0x0056:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.f38223d
            com.google.android.gms.internal.ads.zzpz.m54581a(r9, r1, r0)
        L_0x005c:
            r1 = r10
        L_0x005d:
            if (r1 == 0) goto L_0x006a
            java.util.ArrayDeque r9 = f38218g
            monitor-enter(r9)
            r9.add(r1)     // Catch:{ all -> 0x0067 }
            monitor-exit(r9)     // Catch:{ all -> 0x0067 }
            return
        L_0x0067:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0067 }
            throw r10
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqc.m54585a(com.google.android.gms.internal.ads.zzqc, android.os.Message):void");
    }

    /* renamed from: g */
    private static zzqb m54586g() {
        ArrayDeque arrayDeque = f38218g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                zzqb zzqb = new zzqb();
                return zzqb;
            }
            zzqb zzqb2 = (zzqb) arrayDeque.removeFirst();
            return zzqb2;
        }
    }

    /* renamed from: h */
    private final void m54587h() {
        RuntimeException runtimeException = (RuntimeException) this.f38223d.getAndSet((Object) null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Nullable
    /* renamed from: i */
    private static byte[] m54588i(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Nullable
    /* renamed from: j */
    private static int[] m54589j(@Nullable int[] iArr, @Nullable int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    /* renamed from: b */
    public final void mo48038b() {
        if (this.f38225f) {
            try {
                Handler handler = this.f38222c;
                Objects.requireNonNull(handler);
                handler.removeCallbacksAndMessages((Object) null);
                this.f38224e.mo44616c();
                Handler handler2 = this.f38222c;
                Objects.requireNonNull(handler2);
                handler2.obtainMessage(2).sendToTarget();
                this.f38224e.mo44614a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: c */
    public final void mo48039c(int i, int i2, int i3, long j, int i4) {
        m54587h();
        zzqb g = m54586g();
        g.mo48037a(i, 0, i3, j, i4);
        Handler handler = this.f38222c;
        int i5 = zzen.f34500a;
        handler.obtainMessage(0, g).sendToTarget();
    }

    /* renamed from: d */
    public final void mo48040d(int i, int i2, zzgf zzgf, long j, int i3) {
        m54587h();
        zzqb g = m54586g();
        g.mo48037a(i, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = g.f38215d;
        cryptoInfo.numSubSamples = zzgf.f36761f;
        cryptoInfo.numBytesOfClearData = m54589j(zzgf.f36759d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m54589j(zzgf.f36760e, cryptoInfo.numBytesOfEncryptedData);
        byte[] i4 = m54588i(zzgf.f36757b, cryptoInfo.key);
        Objects.requireNonNull(i4);
        cryptoInfo.key = i4;
        byte[] i5 = m54588i(zzgf.f36756a, cryptoInfo.iv);
        Objects.requireNonNull(i5);
        cryptoInfo.iv = i5;
        cryptoInfo.mode = zzgf.f36758c;
        if (zzen.f34500a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzgf.f36762g, zzgf.f36763h));
        }
        this.f38222c.obtainMessage(1, g).sendToTarget();
    }

    /* renamed from: e */
    public final void mo48041e() {
        if (this.f38225f) {
            mo48038b();
            this.f38221b.quit();
        }
        this.f38225f = false;
    }

    /* renamed from: f */
    public final void mo48042f() {
        if (!this.f38225f) {
            this.f38221b.start();
            this.f38222c = new zzqa(this, this.f38221b.getLooper());
            this.f38225f = true;
        }
    }
}
