package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.zae;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class SignInClientImpl extends GmsClient<zaf> implements zae {

    /* renamed from: d0 */
    public static final /* synthetic */ int f47947d0 = 0;

    /* renamed from: Z */
    private final boolean f47948Z = true;

    /* renamed from: a0 */
    private final ClientSettings f47949a0;

    /* renamed from: b0 */
    private final Bundle f47950b0;
    @Nullable

    /* renamed from: c0 */
    private final Integer f47951c0;

    public SignInClientImpl(@NonNull Context context, @NonNull Looper looper, boolean z, @NonNull ClientSettings clientSettings, @NonNull Bundle bundle, @NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks, @NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f47949a0 = clientSettings;
        this.f47950b0 = bundle;
        this.f47951c0 = clientSettings.mo21676j();
    }

    @NonNull
    @KeepForSdk
    /* renamed from: r0 */
    public static Bundle m66587r0(@NonNull ClientSettings clientSettings) {
        clientSettings.mo21675i();
        Integer j = clientSettings.mo21676j();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", clientSettings.mo21668b());
        if (j != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", j.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: F */
    public final Bundle mo21623F() {
        if (!mo21621D().getPackageName().equals(this.f47949a0.mo21673g())) {
            this.f47950b0.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f47949a0.mo21673g());
        }
        return this.f47950b0;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: J */
    public final String mo21029J() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: K */
    public final String mo21030K() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: a */
    public final void mo56104a() {
        try {
            ((zaf) mo21626I()).mo56111Z8(((Integer) Preconditions.m4488k(this.f47951c0)).intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    /* renamed from: j */
    public final boolean mo21648j() {
        return this.f47948Z;
    }

    /* renamed from: k */
    public final void mo56105k() {
        mo21646h(new BaseGmsClient.LegacyClientCallbackAdapter());
    }

    /* renamed from: p */
    public final void mo56106p(zae zae) {
        Preconditions.m4489l(zae, "Expecting a valid ISignInCallbacks");
        try {
            Account d = this.f47949a0.mo21670d();
            ((zaf) mo21626I()).mo56113sb(new zai(1, new zat(d, ((Integer) Preconditions.m4488k(this.f47951c0)).intValue(), "<<default account>>".equals(d.name) ? Storage.m3343b(mo21621D()).mo21014c() : null)), zae);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                zae.mo21446C2(new zak(1, new ConnectionResult(8, (PendingIntent) null), (zav) null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* renamed from: q */
    public final int mo21032q() {
        return GooglePlayServicesUtilLight.f3065a;
    }

    /* renamed from: s */
    public final void mo56107s(@NonNull IAccountAccessor iAccountAccessor, boolean z) {
        try {
            ((zaf) mo21626I()).mo56112ia(iAccountAccessor, ((Integer) Preconditions.m4488k(this.f47951c0)).intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: x */
    public final /* synthetic */ IInterface mo21035x(@NonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof zaf ? (zaf) queryLocalInterface : new zaf(iBinder);
    }
}
