package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.Component;
import com.google.firebase.components.Dependency;
import com.google.mlkit.common.model.RemoteModel;
import java.util.UUID;

@KeepForSdk
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class SharedPrefManager {
    @NonNull
    @KeepForSdk

    /* renamed from: b */
    public static final Component<?> f56332b = Component.m6343c(SharedPrefManager.class).mo22880b(Dependency.m6427j(MlKitContext.class)).mo22880b(Dependency.m6427j(Context.class)).mo22884f(zzs.f56425a).mo22882d();

    /* renamed from: a */
    private final Context f56333a;

    public SharedPrefManager(@NonNull Context context) {
        this.f56333a = context;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: f */
    public static SharedPrefManager m79063f(@NonNull MlKitContext mlKitContext) {
        return (SharedPrefManager) mlKitContext.mo64553a(SharedPrefManager.class);
    }

    /* renamed from: p */
    private final SharedPreferences m79064p() {
        return this.f56333a.getSharedPreferences("com.google.mlkit.internal", 0);
    }

    @KeepForSdk
    /* renamed from: a */
    public synchronized void mo64568a(@NonNull RemoteModel remoteModel) {
        String c = mo64570c(remoteModel);
        m79064p().edit().remove(String.format("downloading_model_id_%s", new Object[]{remoteModel.mo64532e()})).remove(String.format("downloading_model_hash_%s", new Object[]{remoteModel.mo64532e()})).remove(String.format("downloading_model_type_%s", new Object[]{c})).remove(String.format("downloading_begin_time_%s", new Object[]{remoteModel.mo64532e()})).remove(String.format("model_first_use_time_%s", new Object[]{remoteModel.mo64532e()})).apply();
    }

    @WorkerThread
    @KeepForSdk
    /* renamed from: b */
    public synchronized void mo64569b(@NonNull RemoteModel remoteModel) {
        m79064p().edit().remove(String.format("current_model_hash_%s", new Object[]{remoteModel.mo64532e()})).commit();
    }

    @KeepForSdk
    @Nullable
    /* renamed from: c */
    public synchronized String mo64570c(@NonNull RemoteModel remoteModel) {
        return m79064p().getString(String.format("downloading_model_hash_%s", new Object[]{remoteModel.mo64532e()}), (String) null);
    }

    @KeepForSdk
    @Nullable
    /* renamed from: d */
    public synchronized Long mo64571d(@NonNull RemoteModel remoteModel) {
        long j = m79064p().getLong(String.format("downloading_model_id_%s", new Object[]{remoteModel.mo64532e()}), -1);
        if (j < 0) {
            return null;
        }
        return Long.valueOf(j);
    }

    @KeepForSdk
    @Nullable
    /* renamed from: e */
    public synchronized String mo64572e(@NonNull RemoteModel remoteModel) {
        return m79064p().getString(String.format("bad_hash_%s", new Object[]{remoteModel.mo64532e()}), (String) null);
    }

    @KeepForSdk
    @Nullable
    /* renamed from: g */
    public synchronized String mo64573g(@NonNull RemoteModel remoteModel) {
        return m79064p().getString(String.format("current_model_hash_%s", new Object[]{remoteModel.mo64532e()}), (String) null);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: h */
    public synchronized String mo64574h() {
        String string = m79064p().getString("ml_sdk_instance_id", (String) null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        m79064p().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }

    @KeepForSdk
    /* renamed from: i */
    public synchronized long mo64575i(@NonNull RemoteModel remoteModel) {
        return m79064p().getLong(String.format("downloading_begin_time_%s", new Object[]{remoteModel.mo64532e()}), 0);
    }

    @KeepForSdk
    /* renamed from: j */
    public synchronized long mo64576j(@NonNull RemoteModel remoteModel) {
        return m79064p().getLong(String.format("model_first_use_time_%s", new Object[]{remoteModel.mo64532e()}), 0);
    }

    @KeepForSdk
    @Nullable
    /* renamed from: k */
    public synchronized String mo64577k() {
        return m79064p().getString("app_version", (String) null);
    }

    @KeepForSdk
    /* renamed from: l */
    public synchronized void mo64578l(long j, @NonNull ModelInfo modelInfo) {
        String b = modelInfo.mo64556b();
        String a = modelInfo.mo64555a();
        m79064p().edit().putString(String.format("downloading_model_hash_%s", new Object[]{b}), a).putLong(String.format("downloading_model_id_%s", new Object[]{b}), j).putLong(String.format("downloading_begin_time_%s", new Object[]{b}), SystemClock.elapsedRealtime()).apply();
    }

    @KeepForSdk
    /* renamed from: m */
    public synchronized void mo64579m(@NonNull RemoteModel remoteModel, @NonNull String str, @NonNull String str2) {
        m79064p().edit().putString(String.format("bad_hash_%s", new Object[]{remoteModel.mo64532e()}), str).putString("app_version", str2).apply();
    }

    @KeepForSdk
    /* renamed from: n */
    public synchronized void mo64580n(@NonNull RemoteModel remoteModel, @NonNull String str) {
        m79064p().edit().putString(String.format("current_model_hash_%s", new Object[]{remoteModel.mo64532e()}), str).apply();
    }

    @KeepForSdk
    /* renamed from: o */
    public synchronized void mo64581o(@NonNull RemoteModel remoteModel, long j) {
        m79064p().edit().putLong(String.format("model_first_use_time_%s", new Object[]{remoteModel.mo64532e()}), j).apply();
    }
}
