package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import java.util.Date;

public class ConfigMetadataClient {

    /* renamed from: d */
    static final Date f55273d = new Date(-1);
    @VisibleForTesting

    /* renamed from: e */
    static final Date f55274e = new Date(-1);

    /* renamed from: a */
    private final SharedPreferences f55275a;

    /* renamed from: b */
    private final Object f55276b = new Object();

    /* renamed from: c */
    private final Object f55277c = new Object();

    static class BackoffMetadata {

        /* renamed from: a */
        private int f55278a;

        /* renamed from: b */
        private Date f55279b;

        BackoffMetadata(int i, Date date) {
            this.f55278a = i;
            this.f55279b = date;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Date mo63573a() {
            return this.f55279b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo63574b() {
            return this.f55278a;
        }
    }

    public ConfigMetadataClient(SharedPreferences sharedPreferences) {
        this.f55275a = sharedPreferences;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public BackoffMetadata mo63561a() {
        BackoffMetadata backoffMetadata;
        synchronized (this.f55277c) {
            backoffMetadata = new BackoffMetadata(this.f55275a.getInt("num_failed_fetches", 0), new Date(this.f55275a.getLong("backoff_end_time_in_millis", -1)));
        }
        return backoffMetadata;
    }

    /* renamed from: b */
    public long mo63562b() {
        return this.f55275a.getLong("fetch_timeout_in_seconds", 60);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: c */
    public String mo63563c() {
        return this.f55275a.getString("last_fetch_etag", (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Date mo63564d() {
        return new Date(this.f55275a.getLong("last_fetch_time_in_millis", -1));
    }

    /* renamed from: e */
    public long mo63565e() {
        return this.f55275a.getLong("minimum_fetch_interval_in_seconds", ConfigFetchHandler.f55243j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo63566f() {
        mo63567g(0, f55274e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo63567g(int i, Date date) {
        synchronized (this.f55277c) {
            this.f55275a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    @WorkerThread
    /* renamed from: h */
    public void mo63568h(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        synchronized (this.f55276b) {
            this.f55275a.edit().putLong("fetch_timeout_in_seconds", firebaseRemoteConfigSettings.mo63519a()).putLong("minimum_fetch_interval_in_seconds", firebaseRemoteConfigSettings.mo63520b()).commit();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo63569i(String str) {
        synchronized (this.f55276b) {
            this.f55275a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo63570j() {
        synchronized (this.f55276b) {
            this.f55275a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo63571k(Date date) {
        synchronized (this.f55276b) {
            this.f55275a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo63572l() {
        synchronized (this.f55276b) {
            this.f55275a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
