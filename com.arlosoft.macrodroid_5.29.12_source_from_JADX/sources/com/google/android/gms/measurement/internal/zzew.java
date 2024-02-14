package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzew extends zzgl {
    @VisibleForTesting

    /* renamed from: y */
    static final Pair f46735y = new Pair("", 0L);

    /* renamed from: c */
    private SharedPreferences f46736c;

    /* renamed from: d */
    public zzeu f46737d;

    /* renamed from: e */
    public final zzes f46738e = new zzes(this, "first_open_time", 0);

    /* renamed from: f */
    public final zzes f46739f = new zzes(this, "app_install_time", 0);

    /* renamed from: g */
    public final zzev f46740g = new zzev(this, "app_instance_id", (String) null);

    /* renamed from: h */
    private String f46741h;

    /* renamed from: i */
    private boolean f46742i;

    /* renamed from: j */
    private long f46743j;

    /* renamed from: k */
    public final zzes f46744k = new zzes(this, "session_timeout", 1800000);

    /* renamed from: l */
    public final zzeq f46745l = new zzeq(this, "start_new_session", true);

    /* renamed from: m */
    public final zzev f46746m = new zzev(this, "non_personalized_ads", (String) null);

    /* renamed from: n */
    public final zzeq f46747n = new zzeq(this, "allow_remote_dynamite", false);

    /* renamed from: o */
    public final zzes f46748o = new zzes(this, "last_pause_time", 0);

    /* renamed from: p */
    public final zzes f46749p = new zzes(this, "session_id", 0);

    /* renamed from: q */
    public boolean f46750q;

    /* renamed from: r */
    public final zzeq f46751r = new zzeq(this, "app_backgrounded", false);

    /* renamed from: s */
    public final zzeq f46752s = new zzeq(this, "deep_link_retrieval_complete", false);

    /* renamed from: t */
    public final zzes f46753t = new zzes(this, "deep_link_retrieval_attempts", 0);

    /* renamed from: u */
    public final zzev f46754u = new zzev(this, "firebase_feature_rollouts", (String) null);

    /* renamed from: v */
    public final zzev f46755v = new zzev(this, "deferred_attribution_cache", (String) null);

    /* renamed from: w */
    public final zzes f46756w = new zzes(this, "deferred_attribution_cache_timestamp", 0);

    /* renamed from: x */
    public final zzer f46757x = new zzer(this, "default_event_parameters", (Bundle) null);

    zzew(zzfr zzfr) {
        super(zzfr);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: f */
    public final void mo55126f() {
        SharedPreferences sharedPreferences = this.f46899a.mo55202c().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f46736c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f46750q = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f46736c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f46899a.mo55219x();
        this.f46737d = new zzeu(this, "health_monitor", Math.max(0, ((Long) zzdu.f46602d.mo55037a((Object) null)).longValue()), (zzet) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo55000g() {
        return true;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: m */
    public final SharedPreferences mo55127m() {
        mo55073e();
        mo55243i();
        Preconditions.m4488k(this.f46736c);
        return this.f46736c;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: n */
    public final Pair mo55128n(String str) {
        mo55073e();
        long c = this.f46899a.mo55201a().mo21952c();
        String str2 = this.f46741h;
        if (str2 != null && c < this.f46743j) {
            return new Pair(str2, Boolean.valueOf(this.f46742i));
        }
        this.f46743j = c + this.f46899a.mo55219x().mo54933p(str, zzdu.f46600c);
        AdvertisingIdClient.m1819d(true);
        try {
            AdvertisingIdClient.Info a = AdvertisingIdClient.m1817a(this.f46899a.mo55202c());
            this.f46741h = "";
            String a2 = a.mo19848a();
            if (a2 != null) {
                this.f46741h = a2;
            }
            this.f46742i = a.mo19849b();
        } catch (Exception e) {
            this.f46899a.mo55221z().mo55097o().mo55092b("Unable to get advertising id", e);
            this.f46741h = "";
        }
        AdvertisingIdClient.m1819d(false);
        return new Pair(this.f46741h, Boolean.valueOf(this.f46742i));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: o */
    public final zzai mo55129o() {
        mo55073e();
        return zzai.m65384b(mo55127m().getString("consent_settings", "G1"));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: p */
    public final Boolean mo55130p() {
        mo55073e();
        if (mo55127m().contains("measurement_enabled")) {
            return Boolean.valueOf(mo55127m().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: q */
    public final void mo55131q(Boolean bool) {
        mo55073e();
        SharedPreferences.Editor edit = mo55127m().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: r */
    public final void mo55132r(boolean z) {
        mo55073e();
        this.f46899a.mo55221z().mo55102t().mo55092b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = mo55127m().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: s */
    public final boolean mo55133s() {
        SharedPreferences sharedPreferences = this.f46736c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean mo55134t(long j) {
        return j - this.f46744k.mo55120a() > this.f46748o.mo55120a();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: u */
    public final boolean mo55135u(int i) {
        return zzai.m65386j(i, mo55127m().getInt("consent_source", 100));
    }
}
