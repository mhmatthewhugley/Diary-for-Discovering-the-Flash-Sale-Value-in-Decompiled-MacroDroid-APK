package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.annotation.Nullable;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzwr extends Handler implements Runnable {

    /* renamed from: a */
    private final zzws f38807a;

    /* renamed from: c */
    private final long f38808c;
    @Nullable

    /* renamed from: d */
    private zzwo f38809d;
    @Nullable

    /* renamed from: f */
    private IOException f38810f;

    /* renamed from: g */
    private int f38811g;
    @Nullable

    /* renamed from: o */
    private Thread f38812o;

    /* renamed from: p */
    private boolean f38813p;

    /* renamed from: s */
    private volatile boolean f38814s;

    /* renamed from: z */
    final /* synthetic */ zzww f38815z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzwr(zzww zzww, Looper looper, zzws zzws, zzwo zzwo, int i, long j) {
        super(looper);
        this.f38815z = zzww;
        this.f38807a = zzws;
        this.f38809d = zzwo;
        this.f38808c = j;
    }

    /* renamed from: d */
    private final void m55283d() {
        this.f38810f = null;
        zzww zzww = this.f38815z;
        ExecutorService d = zzww.f38821a;
        zzwr c = zzww.f38822b;
        Objects.requireNonNull(c);
        d.execute(c);
    }

    /* renamed from: a */
    public final void mo48346a(boolean z) {
        this.f38814s = z;
        this.f38810f = null;
        if (hasMessages(0)) {
            this.f38813p = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.f38813p = true;
                this.f38807a.mo48196f();
                Thread thread = this.f38812o;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.f38815z.f38822b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzwo zzwo = this.f38809d;
            Objects.requireNonNull(zzwo);
            zzwo.mo48207p(this.f38807a, elapsedRealtime, elapsedRealtime - this.f38808c, true);
            this.f38809d = null;
        }
    }

    /* renamed from: b */
    public final void mo48347b(int i) throws IOException {
        IOException iOException = this.f38810f;
        if (iOException != null && this.f38811g > i) {
            throw iOException;
        }
    }

    /* renamed from: c */
    public final void mo48348c(long j) {
        zzdd.m47212f(this.f38815z.f38822b == null);
        this.f38815z.f38822b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            m55283d();
        }
    }

    public final void handleMessage(Message message) {
        long j;
        if (!this.f38814s) {
            int i = message.what;
            if (i == 0) {
                m55283d();
            } else if (i != 3) {
                this.f38815z.f38822b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = elapsedRealtime - this.f38808c;
                zzwo zzwo = this.f38809d;
                Objects.requireNonNull(zzwo);
                if (this.f38813p) {
                    zzwo.mo48207p(this.f38807a, elapsedRealtime, j2, false);
                    return;
                }
                int i2 = message.what;
                if (i2 == 1) {
                    try {
                        zzwo.mo48205g(this.f38807a, elapsedRealtime, j2);
                    } catch (RuntimeException e) {
                        zzdw.m48253c("LoadTask", "Unexpected exception handling load completed", e);
                        this.f38815z.f38823c = new zzwv(e);
                    }
                } else if (i2 == 2) {
                    IOException iOException = (IOException) message.obj;
                    this.f38810f = iOException;
                    int i3 = this.f38811g + 1;
                    this.f38811g = i3;
                    zzwq f = zzwo.mo48204f(this.f38807a, elapsedRealtime, j2, iOException, i3);
                    if (f.f38805a == 3) {
                        this.f38815z.f38823c = this.f38810f;
                    } else if (f.f38805a != 2) {
                        if (f.f38805a == 1) {
                            this.f38811g = 1;
                        }
                        if (f.f38806b != -9223372036854775807L) {
                            j = f.f38806b;
                        } else {
                            j = (long) Math.min((this.f38811g - 1) * 1000, SamsungIrisUnlockModule.IRIS_ERROR_NEED_TO_RETRY);
                        }
                        mo48348c(j);
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = !this.f38813p;
                this.f38812o = Thread.currentThread();
            }
            if (z) {
                int i = zzen.f34500a;
                Trace.beginSection("load:" + this.f38807a.getClass().getSimpleName());
                this.f38807a.mo48195e();
                Trace.endSection();
            }
            synchronized (this) {
                this.f38812o = null;
                Thread.interrupted();
            }
            if (!this.f38814s) {
                sendEmptyMessage(1);
            }
        } catch (IOException e) {
            if (!this.f38814s) {
                obtainMessage(2, e).sendToTarget();
            }
        } catch (Exception e2) {
            if (!this.f38814s) {
                zzdw.m48253c("LoadTask", "Unexpected exception loading stream", e2);
                obtainMessage(2, new zzwv(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            if (!this.f38814s) {
                zzdw.m48253c("LoadTask", "OutOfMemory error loading stream", e3);
                obtainMessage(2, new zzwv(e3)).sendToTarget();
            }
        } catch (Error e4) {
            if (!this.f38814s) {
                zzdw.m48253c("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(3, e4).sendToTarget();
            }
            throw e4;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
