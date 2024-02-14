package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.appset.zze;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class zzp extends GoogleApi<Api.ApiOptions.NoOptions> implements AppSetIdClient {

    /* renamed from: m */
    private static final Api.ClientKey<zzd> f39088m;

    /* renamed from: n */
    private static final Api.AbstractClientBuilder<zzd, Api.ApiOptions.NoOptions> f39089n;

    /* renamed from: o */
    private static final Api<Api.ApiOptions.NoOptions> f39090o;

    /* renamed from: k */
    private final Context f39091k;

    /* renamed from: l */
    private final GoogleApiAvailabilityLight f39092l;

    static {
        Api.ClientKey<zzd> clientKey = new Api.ClientKey<>();
        f39088m = clientKey;
        zzn zzn = new zzn();
        f39089n = zzn;
        f39090o = new Api<>("AppSet.API", zzn, clientKey);
    }

    zzp(Context context, GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        super(context, f39090o, Api.ApiOptions.f3083b, GoogleApi.Settings.f3103c);
        this.f39091k = context;
        this.f39092l = googleApiAvailabilityLight;
    }

    /* renamed from: h */
    public final Task<AppSetIdInfo> mo20736h() {
        if (this.f39092l.mo21157j(this.f39091k, 212800000) != 0) {
            return Tasks.m66666e(new ApiException(new Status(17)));
        }
        return mo21230p(TaskApiCall.m3866c().mo21408d(zze.f2637a).mo21406b(new zzm(this)).mo21407c(false).mo21409e(27601).mo21405a());
    }
}
