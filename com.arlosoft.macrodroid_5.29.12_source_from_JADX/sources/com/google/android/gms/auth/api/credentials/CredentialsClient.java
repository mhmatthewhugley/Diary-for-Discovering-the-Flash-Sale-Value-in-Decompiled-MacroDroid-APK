package com.google.android.gms.auth.api.credentials;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.internal.p203authapi.zzr;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class CredentialsClient extends GoogleApi<Auth.AuthCredentialsOptions> {
    CredentialsClient(@NonNull Context context, @NonNull Auth.AuthCredentialsOptions authCredentialsOptions) {
        super(context, Auth.f2669f, authCredentialsOptions, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    /* renamed from: G */
    public Task<Void> mo20844G(@NonNull Credential credential) {
        return PendingResultUtil.m4476c(Auth.f2672i.mo20840a(mo21225k(), credential));
    }

    /* renamed from: H */
    public Task<Void> mo20845H() {
        return PendingResultUtil.m4476c(Auth.f2672i.mo20842c(mo21225k()));
    }

    /* renamed from: I */
    public PendingIntent mo20846I(@NonNull HintRequest hintRequest) {
        return zzr.m55741a(mo21238x(), (Auth.AuthCredentialsOptions) mo21237w(), hintRequest, ((Auth.AuthCredentialsOptions) mo21237w()).mo20770a());
    }

    /* renamed from: J */
    public Task<CredentialRequestResponse> mo20847J(@NonNull CredentialRequest credentialRequest) {
        return PendingResultUtil.m4474a(Auth.f2672i.mo20841b(mo21225k(), credentialRequest), new CredentialRequestResponse());
    }

    /* renamed from: K */
    public Task<Void> mo20848K(@NonNull Credential credential) {
        return PendingResultUtil.m4476c(Auth.f2672i.mo20843d(mo21225k(), credential));
    }

    CredentialsClient(@NonNull Activity activity, @NonNull Auth.AuthCredentialsOptions authCredentialsOptions) {
        super(activity, Auth.f2669f, authCredentialsOptions, (StatusExceptionMapper) new ApiExceptionMapper());
    }
}
