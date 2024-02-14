package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzeu {
    @VisibleForTesting

    /* renamed from: a */
    final String f46726a;

    /* renamed from: b */
    private final String f46727b;

    /* renamed from: c */
    private final String f46728c;

    /* renamed from: d */
    private final long f46729d;

    /* renamed from: e */
    final /* synthetic */ zzew f46730e;

    /* synthetic */ zzeu(zzew zzew, String str, long j, zzet zzet) {
        this.f46730e = zzew;
        Preconditions.m4484g("health_monitor");
        Preconditions.m4478a(j > 0);
        this.f46726a = "health_monitor:start";
        this.f46727b = "health_monitor:count";
        this.f46728c = "health_monitor:value";
        this.f46729d = j;
    }

    @WorkerThread
    /* renamed from: c */
    private final long m65594c() {
        return this.f46730e.mo55127m().getLong(this.f46726a, 0);
    }

    @WorkerThread
    /* renamed from: d */
    private final void m65595d() {
        this.f46730e.mo55073e();
        long a = this.f46730e.f46899a.mo55201a().mo21950a();
        SharedPreferences.Editor edit = this.f46730e.mo55127m().edit();
        edit.remove(this.f46727b);
        edit.remove(this.f46728c);
        edit.putLong(this.f46726a, a);
        edit.apply();
    }

    @WorkerThread
    /* renamed from: a */
    public final Pair mo55122a() {
        long j;
        this.f46730e.mo55073e();
        this.f46730e.mo55073e();
        long c = m65594c();
        if (c == 0) {
            m65595d();
            j = 0;
        } else {
            j = Math.abs(c - this.f46730e.f46899a.mo55201a().mo21950a());
        }
        long j2 = this.f46729d;
        if (j < j2) {
            return null;
        }
        if (j > j2 + j2) {
            m65595d();
            return null;
        }
        String string = this.f46730e.mo55127m().getString(this.f46728c, (String) null);
        long j3 = this.f46730e.mo55127m().getLong(this.f46727b, 0);
        m65595d();
        if (string == null || j3 <= 0) {
            return zzew.f46735y;
        }
        return new Pair(string, Long.valueOf(j3));
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo55123b(String str, long j) {
        this.f46730e.mo55073e();
        if (m65594c() == 0) {
            m65595d();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f46730e.mo55127m().getLong(this.f46727b, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f46730e.mo55127m().edit();
            edit.putString(this.f46728c, str);
            edit.putLong(this.f46727b, 1);
            edit.apply();
            return;
        }
        long nextLong = this.f46730e.f46899a.mo55196N().mo55609s().nextLong();
        long j3 = j2 + 1;
        long j4 = LocationRequestCompat.PASSIVE_INTERVAL / j3;
        SharedPreferences.Editor edit2 = this.f46730e.mo55127m().edit();
        if ((nextLong & LocationRequestCompat.PASSIVE_INTERVAL) < j4) {
            edit2.putString(this.f46728c, str);
        }
        edit2.putLong(this.f46727b, j3);
        edit2.apply();
    }
}
