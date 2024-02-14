package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.util.concurrent.FluentFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class TimeoutFuture<V> extends FluentFuture.TrustedFuture<V> {
    /* access modifiers changed from: private */

    /* renamed from: s */
    public ListenableFuture<V> f53701s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public ScheduledFuture<?> f53702z;

    private static final class Fire<V> implements Runnable {

        /* renamed from: a */
        TimeoutFuture<V> f53703a;

        public void run() {
            ListenableFuture H;
            String str;
            TimeoutFuture<V> timeoutFuture = this.f53703a;
            if (timeoutFuture != null && (H = timeoutFuture.f53701s) != null) {
                this.f53703a = null;
                if (H.isDone()) {
                    timeoutFuture.mo61564E(H);
                    return;
                }
                try {
                    ScheduledFuture I = timeoutFuture.f53702z;
                    ScheduledFuture unused = timeoutFuture.f53702z = null;
                    str = "Timed out";
                    if (I != null) {
                        long abs = Math.abs(I.getDelay(TimeUnit.MILLISECONDS));
                        if (abs > 10) {
                            StringBuilder sb = new StringBuilder(str.length() + 66);
                            sb.append(str);
                            sb.append(" (timeout delayed by ");
                            sb.append(abs);
                            sb.append(" ms after scheduled time)");
                            str = sb.toString();
                        }
                    }
                    String valueOf = String.valueOf(str);
                    String valueOf2 = String.valueOf(H);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 2 + valueOf2.length());
                    sb2.append(valueOf);
                    sb2.append(": ");
                    sb2.append(valueOf2);
                    timeoutFuture.mo61563D(new TimeoutFutureException(sb2.toString()));
                    H.cancel(true);
                } catch (Throwable th) {
                    H.cancel(true);
                    throw th;
                }
            }
        }
    }

    private static final class TimeoutFutureException extends TimeoutException {
        public synchronized Throwable fillInStackTrace() {
            setStackTrace(new StackTraceElement[0]);
            return this;
        }

        private TimeoutFutureException(String str) {
            super(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo61544m() {
        mo61574y(this.f53701s);
        ScheduledFuture<?> scheduledFuture = this.f53702z;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f53701s = null;
        this.f53702z = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public String mo61546z() {
        ListenableFuture<V> listenableFuture = this.f53701s;
        ScheduledFuture<?> scheduledFuture = this.f53702z;
        if (listenableFuture == null) {
            return null;
        }
        String valueOf = String.valueOf(listenableFuture);
        StringBuilder sb = new StringBuilder(valueOf.length() + 14);
        sb.append("inputFuture=[");
        sb.append(valueOf);
        sb.append("]");
        String sb2 = sb.toString();
        if (scheduledFuture == null) {
            return sb2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return sb2;
        }
        String valueOf2 = String.valueOf(sb2);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 43);
        sb3.append(valueOf2);
        sb3.append(", remaining delay=[");
        sb3.append(delay);
        sb3.append(" ms]");
        return sb3.toString();
    }
}
