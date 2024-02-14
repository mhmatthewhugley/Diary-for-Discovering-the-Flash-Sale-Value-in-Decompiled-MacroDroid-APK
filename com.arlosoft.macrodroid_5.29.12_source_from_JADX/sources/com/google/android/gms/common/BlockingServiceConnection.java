package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class BlockingServiceConnection implements ServiceConnection {

    /* renamed from: a */
    boolean f3042a = false;

    /* renamed from: c */
    private final BlockingQueue f3043c = new LinkedBlockingQueue();

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public IBinder mo21127a() throws InterruptedException {
        Preconditions.m4487j("BlockingServiceConnection.getService() called on main thread");
        if (!this.f3042a) {
            this.f3042a = true;
            return (IBinder) this.f3043c.take();
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public IBinder mo21128b(long j, @NonNull TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        Preconditions.m4487j("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f3042a) {
            this.f3042a = true;
            IBinder iBinder = (IBinder) this.f3043c.poll(j, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        this.f3043c.add(iBinder);
    }

    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
    }
}
