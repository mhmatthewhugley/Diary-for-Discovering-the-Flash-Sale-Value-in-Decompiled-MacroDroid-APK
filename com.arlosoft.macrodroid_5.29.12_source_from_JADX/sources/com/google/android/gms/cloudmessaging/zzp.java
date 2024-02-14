package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
abstract class zzp<T> {

    /* renamed from: a */
    final int f3000a;

    /* renamed from: b */
    final TaskCompletionSource<T> f3001b = new TaskCompletionSource<>();

    /* renamed from: c */
    final int f3002c;

    /* renamed from: d */
    final Bundle f3003d;

    zzp(int i, int i2, Bundle bundle) {
        this.f3000a = i;
        this.f3002c = i2;
        this.f3003d = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo21110a(Bundle bundle);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo21111b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo21112c(zzq zzq) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzq);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
        }
        this.f3001b.mo56138b(zzq);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo21113d(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
        }
        this.f3001b.mo56139c(t);
    }

    public final String toString() {
        int i = this.f3002c;
        int i2 = this.f3000a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(mo21111b());
        sb.append("}");
        return sb.toString();
    }
}
