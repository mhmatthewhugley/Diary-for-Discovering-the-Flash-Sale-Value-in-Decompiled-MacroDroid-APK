package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzxh extends HandlerThread implements Handler.Callback {

    /* renamed from: a */
    private zzdj f38891a;

    /* renamed from: c */
    private Handler f38892c;
    @Nullable

    /* renamed from: d */
    private Error f38893d;
    @Nullable

    /* renamed from: f */
    private RuntimeException f38894f;
    @Nullable

    /* renamed from: g */
    private zzxj f38895g;

    public zzxh() {
        super("ExoPlayer:PlaceholderSurface");
    }

    /* renamed from: a */
    public final zzxj mo48389a(int i) {
        boolean z;
        start();
        this.f38892c = new Handler(getLooper(), this);
        this.f38891a = new zzdj(this.f38892c, (zzdi) null);
        synchronized (this) {
            z = false;
            this.f38892c.obtainMessage(1, i, 0).sendToTarget();
            while (this.f38895g == null && this.f38894f == null && this.f38893d == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f38894f;
        if (runtimeException == null) {
            Error error = this.f38893d;
            if (error == null) {
                zzxj zzxj = this.f38895g;
                Objects.requireNonNull(zzxj);
                return zzxj;
            }
            throw error;
        }
        throw runtimeException;
    }

    /* renamed from: b */
    public final void mo48390b() {
        Handler handler = this.f38892c;
        Objects.requireNonNull(handler);
        handler.sendEmptyMessage(2);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                int i2 = message.arg1;
                zzdj zzdj = this.f38891a;
                Objects.requireNonNull(zzdj);
                zzdj.mo44665b(i2);
                this.f38895g = new zzxj(this, this.f38891a.mo44664a(), i2 != 0, (zzxi) null);
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e) {
                zzdw.m48253c("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                this.f38894f = e;
                synchronized (this) {
                    notify();
                }
            } catch (zzdk e2) {
                zzdw.m48253c("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                this.f38894f = new IllegalStateException(e2);
                synchronized (this) {
                    notify();
                }
            } catch (Error e3) {
                try {
                    zzdw.m48253c("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.f38893d = e3;
                    synchronized (this) {
                        notify();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
            }
            return true;
        } else if (i != 2) {
            return true;
        } else {
            try {
                zzdj zzdj2 = this.f38891a;
                Objects.requireNonNull(zzdj2);
                zzdj2.mo44666c();
            } catch (Throwable th2) {
                quit();
                throw th2;
            }
            quit();
            return true;
        }
    }
}
