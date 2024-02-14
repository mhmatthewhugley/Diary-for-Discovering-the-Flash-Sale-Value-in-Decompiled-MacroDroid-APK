package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.internal.zzgr;
import com.google.android.gms.measurement.internal.zzgs;
import java.util.List;
import java.util.Map;

@ShowFirstParty
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
public class AppMeasurementSdk {

    /* renamed from: a */
    private final zzef f46397a;

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
    public static final class ConditionalUserProperty {
        private ConditionalUserProperty() {
        }
    }

    @ShowFirstParty
    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
    public interface EventInterceptor extends zzgr {
    }

    @ShowFirstParty
    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
    public interface OnEventListener extends zzgs {
    }

    public AppMeasurementSdk(zzef zzef) {
        this.f46397a = zzef;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @NonNull
    @KeepForSdk
    /* renamed from: k */
    public static AppMeasurementSdk m65326k(@NonNull Context context, @NonNull String str, @NonNull String str2, @Nullable String str3, @NonNull Bundle bundle) {
        return zzef.m59630u(context, str, str2, str3, bundle).mo50871r();
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo54891a(@Size(min = 1) @NonNull String str) {
        this.f46397a.mo50855I(str);
    }

    @KeepForSdk
    /* renamed from: b */
    public void mo54892b(@Size(max = 24, min = 1) @NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        this.f46397a.mo50856J(str, str2, bundle);
    }

    @KeepForSdk
    /* renamed from: c */
    public void mo54893c(@Size(min = 1) @NonNull String str) {
        this.f46397a.mo50857K(str);
    }

    @KeepForSdk
    /* renamed from: d */
    public long mo54894d() {
        return this.f46397a.mo50869p();
    }

    @KeepForSdk
    @Nullable
    /* renamed from: e */
    public String mo54895e() {
        return this.f46397a.mo50874x();
    }

    @KeepForSdk
    @Nullable
    /* renamed from: f */
    public String mo54896f() {
        return this.f46397a.mo50876z();
    }

    @WorkerThread
    @NonNull
    @KeepForSdk
    /* renamed from: g */
    public List<Bundle> mo54897g(@Nullable String str, @Size(max = 23, min = 1) @Nullable String str2) {
        return this.f46397a.mo50853D(str, str2);
    }

    @KeepForSdk
    @Nullable
    /* renamed from: h */
    public String mo54898h() {
        return this.f46397a.mo50850A();
    }

    @KeepForSdk
    @Nullable
    /* renamed from: i */
    public String mo54899i() {
        return this.f46397a.mo50851B();
    }

    @KeepForSdk
    @Nullable
    /* renamed from: j */
    public String mo54900j() {
        return this.f46397a.mo50852C();
    }

    @WorkerThread
    @KeepForSdk
    /* renamed from: l */
    public int mo54901l(@Size(min = 1) @NonNull String str) {
        return this.f46397a.mo50868o(str);
    }

    @WorkerThread
    @NonNull
    @KeepForSdk
    /* renamed from: m */
    public Map<String, Object> mo54902m(@Nullable String str, @Size(max = 24, min = 1) @Nullable String str2, boolean z) {
        return this.f46397a.mo50854E(str, str2, z);
    }

    @KeepForSdk
    /* renamed from: n */
    public void mo54903n(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f46397a.mo50859M(str, str2, bundle);
    }

    @KeepForSdk
    @Nullable
    /* renamed from: o */
    public void mo54904o(@NonNull Bundle bundle) {
        this.f46397a.mo50870q(bundle, false);
    }

    @KeepForSdk
    @Nullable
    /* renamed from: p */
    public Bundle mo54905p(@NonNull Bundle bundle) {
        return this.f46397a.mo50870q(bundle, true);
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: q */
    public void mo54906q(@NonNull OnEventListener onEventListener) {
        this.f46397a.mo50861b(onEventListener);
    }

    @KeepForSdk
    /* renamed from: r */
    public void mo54907r(@NonNull Bundle bundle) {
        this.f46397a.mo50862c(bundle);
    }

    @KeepForSdk
    /* renamed from: s */
    public void mo54908s(@NonNull Bundle bundle) {
        this.f46397a.mo50863d(bundle);
    }

    @KeepForSdk
    /* renamed from: t */
    public void mo54909t(@NonNull Activity activity, @Size(max = 36, min = 1) @Nullable String str, @Size(max = 36, min = 1) @Nullable String str2) {
        this.f46397a.mo50864e(activity, str, str2);
    }

    @KeepForSdk
    /* renamed from: u */
    public void mo54910u(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        this.f46397a.mo50866g(str, str2, obj, true);
    }

    /* renamed from: v */
    public final void mo54911v(boolean z) {
        this.f46397a.mo50865f(z);
    }
}
