package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzazx extends Handler implements Runnable {

    /* renamed from: a */
    private final zzazy f26380a;

    /* renamed from: c */
    private final zzazw f26381c;

    /* renamed from: d */
    public final int f26382d;

    /* renamed from: f */
    private final long f26383f;

    /* renamed from: g */
    private IOException f26384g;

    /* renamed from: o */
    private int f26385o;

    /* renamed from: p */
    private volatile Thread f26386p;

    /* renamed from: s */
    private volatile boolean f26387s;

    /* renamed from: z */
    final /* synthetic */ zzbaa f26388z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzazx(zzbaa zzbaa, Looper looper, zzazy zzazy, zzazw zzazw, int i, long j) {
        super(looper);
        this.f26388z = zzbaa;
        this.f26380a = zzazy;
        this.f26381c = zzazw;
        this.f26382d = i;
        this.f26383f = j;
    }

    /* renamed from: d */
    private final void m42905d() {
        this.f26384g = null;
        zzbaa zzbaa = this.f26388z;
        zzbaa.f26390a.execute(zzbaa.f26391b);
    }

    /* renamed from: a */
    public final void mo42296a(boolean z) {
        this.f26387s = z;
        this.f26384g = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.f26380a.zzb();
            if (this.f26386p != null) {
                this.f26386p.interrupt();
            }
            if (!z) {
                return;
            }
        }
        this.f26388z.f26391b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f26381c.mo42215j(this.f26380a, elapsedRealtime, elapsedRealtime - this.f26383f, true);
    }

    /* renamed from: b */
    public final void mo42297b(int i) throws IOException {
        IOException iOException = this.f26384g;
        if (iOException != null && this.f26385o > i) {
            throw iOException;
        }
    }

    /* renamed from: c */
    public final void mo42298c(long j) {
        zzbac.m42926e(this.f26388z.f26391b == null);
        this.f26388z.f26391b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            m42905d();
        }
    }

    public final void handleMessage(Message message) {
        if (!this.f26387s) {
            int i = message.what;
            if (i == 0) {
                m42905d();
            } else if (i != 4) {
                this.f26388z.f26391b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.f26383f;
                if (this.f26380a.mo42197b()) {
                    this.f26381c.mo42215j(this.f26380a, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                int i3 = 1;
                if (i2 == 1) {
                    this.f26381c.mo42215j(this.f26380a, elapsedRealtime, j, false);
                } else if (i2 == 2) {
                    this.f26381c.mo42216k(this.f26380a, elapsedRealtime, j);
                } else if (i2 == 3) {
                    IOException iOException = (IOException) message.obj;
                    this.f26384g = iOException;
                    int m = this.f26381c.mo42218m(this.f26380a, elapsedRealtime, j, iOException);
                    if (m == 3) {
                        this.f26388z.f26392c = this.f26384g;
                    } else if (m != 2) {
                        if (m != 1) {
                            i3 = 1 + this.f26385o;
                        }
                        this.f26385o = i3;
                        mo42298c((long) Math.min((i3 - 1) * 1000, SamsungIrisUnlockModule.IRIS_ERROR_NEED_TO_RETRY));
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    public final void run() {
        try {
            this.f26386p = Thread.currentThread();
            if (!this.f26380a.mo42197b()) {
                String simpleName = this.f26380a.getClass().getSimpleName();
                zzbap.m42983a("load:" + simpleName);
                this.f26380a.mo42196a();
                zzbap.m42984b();
            }
            if (!this.f26387s) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f26387s) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (InterruptedException unused) {
            zzbac.m42926e(this.f26380a.mo42197b());
            if (!this.f26387s) {
                sendEmptyMessage(2);
            }
        } catch (Exception e2) {
            Log.e("LoadTask", "Unexpected exception loading stream", e2);
            if (!this.f26387s) {
                obtainMessage(3, new zzazz(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e3);
            if (!this.f26387s) {
                obtainMessage(3, new zzazz(e3)).sendToTarget();
            }
        } catch (Error e4) {
            Log.e("LoadTask", "Unexpected error loading stream", e4);
            if (!this.f26387s) {
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        } catch (Throwable th) {
            zzbap.m42984b();
            throw th;
        }
    }
}
