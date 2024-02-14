package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zze;
import com.google.firebase.analytics.connector.internal.zzg;
import com.google.firebase.events.Event;
import com.google.firebase.events.Subscriber;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
public class AnalyticsConnectorImpl implements AnalyticsConnector {

    /* renamed from: c */
    private static volatile AnalyticsConnector f53799c;
    @VisibleForTesting

    /* renamed from: a */
    final AppMeasurementSdk f53800a;
    @VisibleForTesting

    /* renamed from: b */
    final Map f53801b = new ConcurrentHashMap();

    AnalyticsConnectorImpl(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.m4488k(appMeasurementSdk);
        this.f53800a = appMeasurementSdk;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @NonNull
    @KeepForSdk
    /* renamed from: h */
    public static AnalyticsConnector m74463h(@NonNull FirebaseApp firebaseApp, @NonNull Context context, @NonNull Subscriber subscriber) {
        Preconditions.m4488k(firebaseApp);
        Preconditions.m4488k(context);
        Preconditions.m4488k(subscriber);
        Preconditions.m4488k(context.getApplicationContext());
        if (f53799c == null) {
            synchronized (AnalyticsConnectorImpl.class) {
                if (f53799c == null) {
                    Bundle bundle = new Bundle(1);
                    if (firebaseApp.mo61956w()) {
                        subscriber.mo22918b(DataCollectionDefaultChange.class, zza.f53820a, zzb.f53821a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.mo61955v());
                    }
                    f53799c = new AnalyticsConnectorImpl(zzef.m59630u(context, (String) null, (String) null, (String) null, bundle).mo50871r());
                }
            }
        }
        return f53799c;
    }

    /* renamed from: i */
    static /* synthetic */ void m74464i(Event event) {
        boolean z = ((DataCollectionDefaultChange) event.mo23659a()).f53734a;
        synchronized (AnalyticsConnectorImpl.class) {
            ((AnalyticsConnectorImpl) Preconditions.m4488k(f53799c)).f53800a.mo54911v(z);
        }
    }

    /* renamed from: j */
    private final boolean m74465j(@NonNull String str) {
        return !str.isEmpty() && this.f53801b.containsKey(str) && this.f53801b.get(str) != null;
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo61992a(@NonNull AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        if (zzc.m74479f(conditionalUserProperty)) {
            this.f53800a.mo54907r(zzc.m74474a(conditionalUserProperty));
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public void mo61993b(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (zzc.m74482i(str) && zzc.m74480g(str2, bundle) && zzc.m74478e(str, str2, bundle)) {
            zzc.m74477d(str, str2, bundle);
            this.f53800a.mo54903n(str, str2, bundle);
        }
    }

    @KeepForSdk
    /* renamed from: c */
    public void mo61994c(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        if (zzc.m74482i(str) && zzc.m74483j(str, str2)) {
            this.f53800a.mo54910u(str, str2, obj);
        }
    }

    @KeepForSdk
    public void clearConditionalUserProperty(@Size(max = 24, min = 1) @NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (str2 == null || zzc.m74480g(str2, bundle)) {
            this.f53800a.mo54892b(str, str2, bundle);
        }
    }

    @WorkerThread
    @NonNull
    @KeepForSdk
    /* renamed from: d */
    public Map<String, Object> mo61996d(boolean z) {
        return this.f53800a.mo54902m((String) null, (String) null, z);
    }

    @WorkerThread
    @KeepForSdk
    /* renamed from: e */
    public int mo61997e(@Size(min = 1) @NonNull String str) {
        return this.f53800a.mo54901l(str);
    }

    @WorkerThread
    @NonNull
    @KeepForSdk
    /* renamed from: f */
    public List<AnalyticsConnector.ConditionalUserProperty> mo61998f(@NonNull String str, @Size(max = 23, min = 1) @NonNull String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle b : this.f53800a.mo54897g(str, str2)) {
            arrayList.add(zzc.m74475b(b));
        }
        return arrayList;
    }

    @WorkerThread
    @NonNull
    @KeepForSdk
    /* renamed from: g */
    public AnalyticsConnector.AnalyticsConnectorHandle mo61999g(@NonNull final String str, @NonNull AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        Object obj;
        Preconditions.m4488k(analyticsConnectorListener);
        if (!zzc.m74482i(str) || m74465j(str)) {
            return null;
        }
        AppMeasurementSdk appMeasurementSdk = this.f53800a;
        if ("fiam".equals(str)) {
            obj = new zze(appMeasurementSdk, analyticsConnectorListener);
        } else {
            obj = "clx".equals(str) ? new zzg(appMeasurementSdk, analyticsConnectorListener) : null;
        }
        if (obj == null) {
            return null;
        }
        this.f53801b.put(str, obj);
        return new AnalyticsConnector.AnalyticsConnectorHandle() {
        };
    }
}
