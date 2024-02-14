package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class LifecycleCallback {
    @NonNull
    @KeepForSdk

    /* renamed from: a */
    protected final LifecycleFragment f3200a;

    @KeepForSdk
    protected LifecycleCallback(@NonNull LifecycleFragment lifecycleFragment) {
        this.f3200a = lifecycleFragment;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public static LifecycleFragment m3791c(@NonNull Activity activity) {
        return m3792d(new LifecycleActivity(activity));
    }

    @NonNull
    @KeepForSdk
    /* renamed from: d */
    protected static LifecycleFragment m3792d(@NonNull LifecycleActivity lifecycleActivity) {
        if (lifecycleActivity.mo21361d()) {
            return zzd.m4279W(lifecycleActivity.mo21359b());
        }
        if (lifecycleActivity.mo21360c()) {
            return zzb.m4273c(lifecycleActivity.mo21358a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static LifecycleFragment getChimeraLifecycleFragmentImpl(LifecycleActivity lifecycleActivity) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @MainThread
    @KeepForSdk
    /* renamed from: a */
    public void mo21362a(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr) {
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public Activity mo21363b() {
        Activity N = this.f3200a.mo21371N();
        Preconditions.m4488k(N);
        return N;
    }

    @MainThread
    @KeepForSdk
    /* renamed from: e */
    public void mo21364e(int i, int i2, @NonNull Intent intent) {
    }

    @MainThread
    @KeepForSdk
    /* renamed from: f */
    public void mo21365f(@Nullable Bundle bundle) {
    }

    @MainThread
    @KeepForSdk
    /* renamed from: g */
    public void mo21366g() {
    }

    @MainThread
    @KeepForSdk
    /* renamed from: h */
    public void mo21367h() {
    }

    @MainThread
    @KeepForSdk
    /* renamed from: i */
    public void mo21368i(@NonNull Bundle bundle) {
    }

    @MainThread
    @KeepForSdk
    /* renamed from: j */
    public void mo21369j() {
    }

    @MainThread
    @KeepForSdk
    /* renamed from: k */
    public void mo21370k() {
    }
}
