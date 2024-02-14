package com.google.android.gms.internal.nearby;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.ConnectionsClient;
import com.google.android.gms.nearby.connection.ConnectionsOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.PayloadCallback;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzih extends GoogleApi implements ConnectionsClient {

    /* renamed from: m */
    private static final Api.ClientKey f44760m;

    /* renamed from: n */
    private static final Api.AbstractClientBuilder f44761n;

    /* renamed from: o */
    private static final Api f44762o;

    /* renamed from: p */
    public static final /* synthetic */ int f44763p = 0;

    /* renamed from: k */
    private final zzfg f44764k = zzfg.m62444d(this, (Api.ApiOptions) null);
    @Nullable

    /* renamed from: l */
    private final zzkp f44765l = null;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f44760m = clientKey;
        zzhy zzhy = new zzhy();
        f44761n = zzhy;
        f44762o = new Api("Nearby.CONNECTIONS_API", zzhy, clientKey);
    }

    public zzih(Context context, @Nullable ConnectionsOptions connectionsOptions) {
        super(context, f44762o, null, GoogleApi.Settings.f3103c);
    }

    /* renamed from: L */
    private final Task m62585L(zzig zzig) {
        return mo21235u(TaskApiCall.m3866c().mo21409e(1229).mo21406b(new zzhx(zzig)).mo21405a());
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public final void m62586M(String str) {
        this.f44764k.mo52691e(this, RegistrationMethods.m3853a().mo21400f(this.f44764k.mo52690c(this, str, "connection")).mo21396b(zzhq.f44735a).mo21399e(zzhr.f44736a).mo21398d(1268).mo21395a());
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public final void m62587N(String str) {
        zzfg zzfg = this.f44764k;
        zzfg.mo52693g(this, zzfg.mo52688a(str, "connection"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final /* synthetic */ void mo52756I(DiscoveryOptions discoveryOptions, Void voidR) {
        zzkp zzkp;
        if (discoveryOptions.mo55673n2() && (zzkp = this.f44765l) != null) {
            zzkp.mo52794d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final /* synthetic */ void mo52757J(Task task) {
        this.f44764k.mo52692f(this, "connection");
        mo21227m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final /* synthetic */ void mo52758K(Void voidR) {
        zzkp zzkp = this.f44765l;
        if (zzkp != null) {
            zzkp.mo52795e();
        }
    }

    /* renamed from: b */
    public final void mo52759b() {
        this.f44764k.mo52692f(this, "discovery").mo23708i(new zzho(this));
    }

    /* renamed from: c */
    public final Task<Void> mo52760c(String str, String str2, ConnectionLifecycleCallback connectionLifecycleCallback, AdvertisingOptions advertisingOptions) {
        ListenerHolder A = mo21221A(new zzie(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        return this.f44764k.mo52691e(this, RegistrationMethods.m3853a().mo21400f(this.f44764k.mo52689b(this, new Object(), "advertising")).mo21396b(new zzhb(this, str, str2, A, advertisingOptions)).mo21399e(zzhc.f44703a).mo21398d(1266).mo21395a());
    }

    /* renamed from: d */
    public final Task<Void> mo52761d(String str, EndpointDiscoveryCallback endpointDiscoveryCallback, DiscoveryOptions discoveryOptions) {
        ListenerHolder b = this.f44764k.mo52689b(this, endpointDiscoveryCallback, "discovery");
        return this.f44764k.mo52691e(this, RegistrationMethods.m3853a().mo21400f(b).mo21396b(new zzhi(this, str, b, discoveryOptions)).mo21399e(zzhj.f44727a).mo21398d(1267).mo21395a()).mo23708i(new zzhk(this, discoveryOptions)).mo23705f(zzhl.f44730a);
    }

    /* renamed from: e */
    public final void mo52762e(String str) {
        m62585L(new zzhp(str));
        m62587N(str);
    }

    /* renamed from: f */
    public final Task<Void> mo52763f(String str, PayloadCallback payloadCallback) {
        return mo21235u(TaskApiCall.m3866c().mo21406b(new zzhe(this, str, mo21221A(payloadCallback, PayloadCallback.class.getName()))).mo21409e(1227).mo21405a());
    }

    /* renamed from: g */
    public final Task<Void> mo52764g(String str, Payload payload) {
        return mo21235u(TaskApiCall.m3866c().mo21406b(new zzhs(this, str, payload)).mo21409e(1228).mo21405a());
    }

    /* renamed from: i */
    public final void mo52765i() {
        this.f44764k.mo52692f(this, "advertising");
    }

    /* renamed from: j */
    public final Task<Void> mo52766j(String str, String str2, ConnectionLifecycleCallback connectionLifecycleCallback) {
        ListenerHolder A = mo21221A(new zzie(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        m62586M(str2);
        return mo21235u(TaskApiCall.m3866c().mo21406b(new zzhf(this, str, str2, A)).mo21409e(1226).mo21405a()).mo23705f(new zzic(this, str2));
    }
}
