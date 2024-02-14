package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzcb;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.internal.measurement.zzck;
import com.google.android.gms.internal.measurement.zzcl;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.Map;

@DynamiteApi
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
public class AppMeasurementDynamiteService extends zzcb {
    @VisibleForTesting

    /* renamed from: a */
    zzfr f46398a = null;
    @GuardedBy("listenerMap")

    /* renamed from: c */
    private final Map f46399c = new ArrayMap();

    /* renamed from: t1 */
    private final void m65348t1(zzcf zzcf, String str) {
        zzb();
        this.f46398a.mo55196N().mo55581J(zzcf, str);
    }

    private final void zzb() {
        if (this.f46398a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void beginAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        zzb();
        this.f46398a.mo55218w().mo55034j(str, j);
    }

    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        zzb();
        this.f46398a.mo55191I().mo55369m(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j) throws RemoteException {
        zzb();
        this.f46398a.mo55191I().mo55351I((Boolean) null);
    }

    public void endAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        zzb();
        this.f46398a.mo55218w().mo55035k(str, j);
    }

    public void generateEventId(zzcf zzcf) throws RemoteException {
        zzb();
        long r0 = this.f46398a.mo55196N().mo55608r0();
        zzb();
        this.f46398a.mo55196N().mo55580I(zzcf, r0);
    }

    public void getAppInstanceId(zzcf zzcf) throws RemoteException {
        zzb();
        this.f46398a.mo55185B().mo55181x(new zzi(this, zzcf));
    }

    public void getCachedAppInstanceId(zzcf zzcf) throws RemoteException {
        zzb();
        m65348t1(zzcf, this.f46398a.mo55191I().mo55362V());
    }

    public void getConditionalUserProperties(String str, String str2, zzcf zzcf) throws RemoteException {
        zzb();
        this.f46398a.mo55185B().mo55181x(new zzm(this, zzcf, str, str2));
    }

    public void getCurrentScreenClass(zzcf zzcf) throws RemoteException {
        zzb();
        m65348t1(zzcf, this.f46398a.mo55191I().mo55363W());
    }

    public void getCurrentScreenName(zzcf zzcf) throws RemoteException {
        zzb();
        m65348t1(zzcf, this.f46398a.mo55191I().mo55364X());
    }

    public void getGmpAppId(zzcf zzcf) throws RemoteException {
        String str;
        zzb();
        zzhx I = this.f46398a.mo55191I();
        if (I.f46899a.mo55197O() != null) {
            str = I.f46899a.mo55197O();
        } else {
            try {
                str = zzid.m65899c(I.f46899a.mo55202c(), "google_app_id", I.f46899a.mo55200R());
            } catch (IllegalStateException e) {
                I.f46899a.mo55221z().mo55098p().mo55092b("getGoogleAppId failed with exception", e);
                str = null;
            }
        }
        m65348t1(zzcf, str);
    }

    public void getMaxUserProperties(String str, zzcf zzcf) throws RemoteException {
        zzb();
        this.f46398a.mo55191I().mo55357Q(str);
        zzb();
        this.f46398a.mo55196N().mo55579H(zzcf, 25);
    }

    public void getSessionId(zzcf zzcf) throws RemoteException {
        zzb();
        zzhx I = this.f46398a.mo55191I();
        I.f46899a.mo55185B().mo55181x(new zzhk(I, zzcf));
    }

    public void getTestFlag(zzcf zzcf, int i) throws RemoteException {
        zzb();
        if (i == 0) {
            this.f46398a.mo55196N().mo55581J(zzcf, this.f46398a.mo55191I().mo55365Y());
        } else if (i == 1) {
            this.f46398a.mo55196N().mo55580I(zzcf, this.f46398a.mo55191I().mo55361U().longValue());
        } else if (i == 2) {
            zzlb N = this.f46398a.mo55196N();
            double doubleValue = this.f46398a.mo55191I().mo55359S().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zzcf.mo50779m1(bundle);
            } catch (RemoteException e) {
                N.f46899a.mo55221z().mo55103u().mo55092b("Error returning double value to wrapper", e);
            }
        } else if (i == 3) {
            this.f46398a.mo55196N().mo55579H(zzcf, this.f46398a.mo55191I().mo55360T().intValue());
        } else if (i == 4) {
            this.f46398a.mo55196N().mo55575D(zzcf, this.f46398a.mo55191I().mo55358R().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, zzcf zzcf) throws RemoteException {
        zzb();
        this.f46398a.mo55185B().mo55181x(new zzk(this, zzcf, str, str2, z));
    }

    public void initForTests(@NonNull Map map) throws RemoteException {
        zzb();
    }

    public void initialize(IObjectWrapper iObjectWrapper, zzcl zzcl, long j) throws RemoteException {
        zzfr zzfr = this.f46398a;
        if (zzfr == null) {
            this.f46398a = zzfr.m65677H((Context) Preconditions.m4488k((Context) ObjectWrapper.m5050A1(iObjectWrapper)), zzcl, Long.valueOf(j));
        } else {
            zzfr.mo55221z().mo55103u().mo55091a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(zzcf zzcf) throws RemoteException {
        zzb();
        this.f46398a.mo55185B().mo55181x(new zzn(this, zzcf));
    }

    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        zzb();
        this.f46398a.mo55191I().mo55373q(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcf, long j) throws RemoteException {
        Bundle bundle2;
        zzb();
        Preconditions.m4484g(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f46398a.mo55185B().mo55181x(new zzj(this, zzcf, new zzaw(str2, new zzau(bundle), "app", j), str));
    }

    public void logHealthData(int i, @NonNull String str, @NonNull IObjectWrapper iObjectWrapper, @NonNull IObjectWrapper iObjectWrapper2, @NonNull IObjectWrapper iObjectWrapper3) throws RemoteException {
        Object obj;
        Object obj2;
        zzb();
        Object obj3 = null;
        if (iObjectWrapper == null) {
            obj = null;
        } else {
            obj = ObjectWrapper.m5050A1(iObjectWrapper);
        }
        if (iObjectWrapper2 == null) {
            obj2 = null;
        } else {
            obj2 = ObjectWrapper.m5050A1(iObjectWrapper2);
        }
        if (iObjectWrapper3 != null) {
            obj3 = ObjectWrapper.m5050A1(iObjectWrapper3);
        }
        this.f46398a.mo55221z().mo55096F(i, true, false, str, obj, obj2, obj3);
    }

    public void onActivityCreated(@NonNull IObjectWrapper iObjectWrapper, @NonNull Bundle bundle, long j) throws RemoteException {
        zzb();
        zzhw zzhw = this.f46398a.mo55191I().f47032c;
        if (zzhw != null) {
            this.f46398a.mo55191I().mo55370n();
            zzhw.onActivityCreated((Activity) ObjectWrapper.m5050A1(iObjectWrapper), bundle);
        }
    }

    public void onActivityDestroyed(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        zzhw zzhw = this.f46398a.mo55191I().f47032c;
        if (zzhw != null) {
            this.f46398a.mo55191I().mo55370n();
            zzhw.onActivityDestroyed((Activity) ObjectWrapper.m5050A1(iObjectWrapper));
        }
    }

    public void onActivityPaused(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        zzhw zzhw = this.f46398a.mo55191I().f47032c;
        if (zzhw != null) {
            this.f46398a.mo55191I().mo55370n();
            zzhw.onActivityPaused((Activity) ObjectWrapper.m5050A1(iObjectWrapper));
        }
    }

    public void onActivityResumed(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        zzhw zzhw = this.f46398a.mo55191I().f47032c;
        if (zzhw != null) {
            this.f46398a.mo55191I().mo55370n();
            zzhw.onActivityResumed((Activity) ObjectWrapper.m5050A1(iObjectWrapper));
        }
    }

    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcf zzcf, long j) throws RemoteException {
        zzb();
        zzhw zzhw = this.f46398a.mo55191I().f47032c;
        Bundle bundle = new Bundle();
        if (zzhw != null) {
            this.f46398a.mo55191I().mo55370n();
            zzhw.onActivitySaveInstanceState((Activity) ObjectWrapper.m5050A1(iObjectWrapper), bundle);
        }
        try {
            zzcf.mo50779m1(bundle);
        } catch (RemoteException e) {
            this.f46398a.mo55221z().mo55103u().mo55092b("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        if (this.f46398a.mo55191I().f47032c != null) {
            this.f46398a.mo55191I().mo55370n();
            Activity activity = (Activity) ObjectWrapper.m5050A1(iObjectWrapper);
        }
    }

    public void onActivityStopped(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        if (this.f46398a.mo55191I().f47032c != null) {
            this.f46398a.mo55191I().mo55370n();
            Activity activity = (Activity) ObjectWrapper.m5050A1(iObjectWrapper);
        }
    }

    public void performAction(Bundle bundle, zzcf zzcf, long j) throws RemoteException {
        zzb();
        zzcf.mo50779m1((Bundle) null);
    }

    public void registerOnMeasurementEventListener(zzci zzci) throws RemoteException {
        zzgs zzgs;
        zzb();
        synchronized (this.f46399c) {
            zzgs = (zzgs) this.f46399c.get(Integer.valueOf(zzci.mo50834d()));
            if (zzgs == null) {
                zzgs = new zzp(this, zzci);
                this.f46399c.put(Integer.valueOf(zzci.mo50834d()), zzgs);
            }
        }
        this.f46398a.mo55191I().mo55378v(zzgs);
    }

    public void resetAnalyticsData(long j) throws RemoteException {
        zzb();
        this.f46398a.mo55191I().mo55379w(j);
    }

    public void setConditionalUserProperty(@NonNull Bundle bundle, long j) throws RemoteException {
        zzb();
        if (bundle == null) {
            this.f46398a.mo55221z().mo55098p().mo55091a("Conditional user property must not be null");
        } else {
            this.f46398a.mo55191I().mo55347E(bundle, j);
        }
    }

    public void setConsent(@NonNull Bundle bundle, long j) throws RemoteException {
        zzb();
        zzhx I = this.f46398a.mo55191I();
        I.f46899a.mo55185B().mo55182y(new zzgv(I, bundle, j));
    }

    public void setConsentThirdParty(@NonNull Bundle bundle, long j) throws RemoteException {
        zzb();
        this.f46398a.mo55191I().mo55348F(bundle, -20, j);
    }

    public void setCurrentScreen(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2, long j) throws RemoteException {
        zzb();
        this.f46398a.mo55193K().mo55407D((Activity) ObjectWrapper.m5050A1(iObjectWrapper), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zzb();
        zzhx I = this.f46398a.mo55191I();
        I.mo55140f();
        I.f46899a.mo55185B().mo55181x(new zzht(I, z));
    }

    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        Bundle bundle2;
        zzb();
        zzhx I = this.f46398a.mo55191I();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        I.f46899a.mo55185B().mo55181x(new zzgw(I, bundle2));
    }

    public void setEventInterceptor(zzci zzci) throws RemoteException {
        zzb();
        zzo zzo = new zzo(this, zzci);
        if (this.f46398a.mo55185B().mo55175C()) {
            this.f46398a.mo55191I().mo55350H(zzo);
        } else {
            this.f46398a.mo55185B().mo55181x(new zzl(this, zzo));
        }
    }

    public void setInstanceIdProvider(zzck zzck) throws RemoteException {
        zzb();
    }

    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        zzb();
        this.f46398a.mo55191I().mo55351I(Boolean.valueOf(z));
    }

    public void setMinimumSessionDuration(long j) throws RemoteException {
        zzb();
    }

    public void setSessionTimeoutDuration(long j) throws RemoteException {
        zzb();
        zzhx I = this.f46398a.mo55191I();
        I.f46899a.mo55185B().mo55181x(new zzha(I, j));
    }

    public void setUserId(@NonNull String str, long j) throws RemoteException {
        zzb();
        zzhx I = this.f46398a.mo55191I();
        if (str == null || !TextUtils.isEmpty(str)) {
            I.f46899a.mo55185B().mo55181x(new zzgx(I, str));
            I.mo55354L((String) null, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID, str, true, j);
            return;
        }
        I.f46899a.mo55221z().mo55103u().mo55091a("User ID must be non-empty or null");
    }

    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        zzb();
        this.f46398a.mo55191I().mo55354L(str, str2, ObjectWrapper.m5050A1(iObjectWrapper), z, j);
    }

    public void unregisterOnMeasurementEventListener(zzci zzci) throws RemoteException {
        zzgs zzgs;
        zzb();
        synchronized (this.f46399c) {
            zzgs = (zzgs) this.f46399c.remove(Integer.valueOf(zzci.mo50834d()));
        }
        if (zzgs == null) {
            zzgs = new zzp(this, zzci);
        }
        this.f46398a.mo55191I().mo55356N(zzgs);
    }
}
