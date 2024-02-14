package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbja implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final Object f26797a = new Object();

    /* renamed from: b */
    private final ConditionVariable f26798b = new ConditionVariable();

    /* renamed from: c */
    private volatile boolean f26799c = false;
    @VisibleForTesting

    /* renamed from: d */
    volatile boolean f26800d = false;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: e */
    public SharedPreferences f26801e = null;

    /* renamed from: f */
    private Bundle f26802f = new Bundle();

    /* renamed from: g */
    private Context f26803g;

    /* renamed from: h */
    private JSONObject f26804h = new JSONObject();

    /* renamed from: f */
    private final void m43535f() {
        if (this.f26801e != null) {
            try {
                this.f26804h = new JSONObject((String) zzbje.m43547a(new zzbiy(this)));
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: b */
    public final Object mo42663b(zzbiu zzbiu) {
        if (!this.f26798b.block(5000)) {
            synchronized (this.f26797a) {
                if (!this.f26800d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f26799c || this.f26801e == null) {
            synchronized (this.f26797a) {
                if (this.f26799c) {
                    if (this.f26801e == null) {
                    }
                }
                Object m = zzbiu.mo42651m();
                return m;
            }
        }
        if (zzbiu.mo42649e() == 2) {
            Bundle bundle = this.f26802f;
            if (bundle == null) {
                return zzbiu.mo42651m();
            }
            return zzbiu.mo42646b(bundle);
        } else if (zzbiu.mo42649e() != 1 || !this.f26804h.has(zzbiu.mo42652n())) {
            return zzbje.m43547a(new zzbix(this, zzbiu));
        } else {
            return zzbiu.mo42645a(this.f26804h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object mo42664c(zzbiu zzbiu) {
        return zzbiu.mo42647c(this.f26801e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ String mo42665d() {
        return this.f26801e.getString("flag_configuration", "{}");
    }

    /* renamed from: e */
    public final void mo42666e(Context context) {
        if (!this.f26799c) {
            synchronized (this.f26797a) {
                if (!this.f26799c) {
                    if (!this.f26800d) {
                        this.f26800d = true;
                    }
                    Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    this.f26803g = applicationContext;
                    try {
                        this.f26802f = Wrappers.m4929a(applicationContext).mo21960c(this.f26803g.getPackageName(), 128).metaData;
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    }
                    try {
                        Context e = GooglePlayServicesUtilLight.m3564e(context);
                        if (!(e == null && (e = context.getApplicationContext()) == null)) {
                            context = e;
                        }
                        if (context != null) {
                            zzay.m1923b();
                            SharedPreferences a = zzbiw.m43529a(context);
                            this.f26801e = a;
                            if (a != null) {
                                a.registerOnSharedPreferenceChangeListener(this);
                            }
                            zzblj.m43656c(new zzbiz(this));
                            m43535f();
                            this.f26799c = true;
                            this.f26800d = false;
                            this.f26798b.open();
                        }
                    } finally {
                        this.f26800d = false;
                        this.f26798b.open();
                    }
                }
            }
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            m43535f();
        }
    }
}
