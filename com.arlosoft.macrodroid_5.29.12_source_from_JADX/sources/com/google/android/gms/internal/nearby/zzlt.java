package com.google.android.gms.internal.nearby;

import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.common.util.IOUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzlt {

    /* renamed from: a */
    private final ExecutorService f44879a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile InputStream f44880b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile boolean f44881c = false;

    /* renamed from: d */
    private final SimpleArrayMap f44882d = new SimpleArrayMap();

    /* renamed from: e */
    private final SimpleArrayMap f44883e = new SimpleArrayMap();

    public zzlt() {
        zzg.m62482a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f44879a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m62699b(zzlt zzlt, OutputStream outputStream, boolean z, long j) {
        try {
            outputStream.write(z ? 1 : 0);
        } catch (IOException e) {
            Log.w("NearbyConnections", String.format("Unable to deliver status for Payload %d", new Object[]{Long.valueOf(j)}), e);
        } finally {
            IOUtils.m4889b(outputStream);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo52902c(long j) {
        SimpleArrayMap simpleArrayMap = this.f44882d;
        Long valueOf = Long.valueOf(j);
        IOUtils.m4889b((Closeable) simpleArrayMap.get(valueOf));
        this.f44882d.remove(valueOf);
        zzmb zzmb = (zzmb) this.f44883e.remove(valueOf);
        if (zzmb != null) {
            IOUtils.m4888a(zzmb.mo52933m2());
            IOUtils.m4888a(zzmb.mo52934n2());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo52903d(InputStream inputStream, OutputStream outputStream, OutputStream outputStream2, zzmb zzmb, long j) {
        SimpleArrayMap simpleArrayMap = this.f44882d;
        Long valueOf = Long.valueOf(j);
        simpleArrayMap.put(valueOf, outputStream);
        this.f44883e.put(valueOf, zzmb);
        this.f44879a.execute(new zzls(this, inputStream, outputStream, j, outputStream2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo52904e() {
        this.f44881c = true;
        this.f44879a.shutdownNow();
        IOUtils.m4889b(this.f44880b);
        for (int i = 0; i < this.f44882d.size(); i++) {
            IOUtils.m4889b((Closeable) this.f44882d.valueAt(i));
        }
        this.f44882d.clear();
        for (int i2 = 0; i2 < this.f44883e.size(); i2++) {
            zzmb zzmb = (zzmb) this.f44883e.valueAt(i2);
            IOUtils.m4888a(zzmb.mo52933m2());
            IOUtils.m4888a(zzmb.mo52934n2());
        }
        this.f44883e.clear();
    }
}
