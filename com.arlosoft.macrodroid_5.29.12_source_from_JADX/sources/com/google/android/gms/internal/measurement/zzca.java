package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class zzca extends zzbm implements zzcc {
    zzca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel y = mo50772y();
        y.writeString(str);
        y.writeLong(j);
        mo50769A1(23, y);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel y = mo50772y();
        y.writeString(str);
        y.writeString(str2);
        zzbo.m59534e(y, bundle);
        mo50769A1(9, y);
    }

    public final void clearMeasurementEnabled(long j) throws RemoteException {
        Parcel y = mo50772y();
        y.writeLong(j);
        mo50769A1(43, y);
    }

    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel y = mo50772y();
        y.writeString(str);
        y.writeLong(j);
        mo50769A1(24, y);
    }

    public final void generateEventId(zzcf zzcf) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59535f(y, zzcf);
        mo50769A1(22, y);
    }

    public final void getAppInstanceId(zzcf zzcf) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59535f(y, zzcf);
        mo50769A1(20, y);
    }

    public final void getCachedAppInstanceId(zzcf zzcf) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59535f(y, zzcf);
        mo50769A1(19, y);
    }

    public final void getConditionalUserProperties(String str, String str2, zzcf zzcf) throws RemoteException {
        Parcel y = mo50772y();
        y.writeString(str);
        y.writeString(str2);
        zzbo.m59535f(y, zzcf);
        mo50769A1(10, y);
    }

    public final void getCurrentScreenClass(zzcf zzcf) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59535f(y, zzcf);
        mo50769A1(17, y);
    }

    public final void getCurrentScreenName(zzcf zzcf) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59535f(y, zzcf);
        mo50769A1(16, y);
    }

    public final void getGmpAppId(zzcf zzcf) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59535f(y, zzcf);
        mo50769A1(21, y);
    }

    public final void getMaxUserProperties(String str, zzcf zzcf) throws RemoteException {
        Parcel y = mo50772y();
        y.writeString(str);
        zzbo.m59535f(y, zzcf);
        mo50769A1(6, y);
    }

    public final void getSessionId(zzcf zzcf) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59535f(y, zzcf);
        mo50769A1(46, y);
    }

    public final void getTestFlag(zzcf zzcf, int i) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59535f(y, zzcf);
        y.writeInt(i);
        mo50769A1(38, y);
    }

    public final void getUserProperties(String str, String str2, boolean z, zzcf zzcf) throws RemoteException {
        Parcel y = mo50772y();
        y.writeString(str);
        y.writeString(str2);
        zzbo.m59533d(y, z);
        zzbo.m59535f(y, zzcf);
        mo50769A1(5, y);
    }

    public final void initialize(IObjectWrapper iObjectWrapper, zzcl zzcl, long j) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59535f(y, iObjectWrapper);
        zzbo.m59534e(y, zzcl);
        y.writeLong(j);
        mo50769A1(1, y);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel y = mo50772y();
        y.writeString(str);
        y.writeString(str2);
        zzbo.m59534e(y, bundle);
        zzbo.m59533d(y, z);
        zzbo.m59533d(y, z2);
        y.writeLong(j);
        mo50769A1(2, y);
    }

    public final void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel y = mo50772y();
        y.writeInt(5);
        y.writeString(str);
        zzbo.m59535f(y, iObjectWrapper);
        zzbo.m59535f(y, iObjectWrapper2);
        zzbo.m59535f(y, iObjectWrapper3);
        mo50769A1(33, y);
    }

    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59535f(y, iObjectWrapper);
        zzbo.m59534e(y, bundle);
        y.writeLong(j);
        mo50769A1(27, y);
    }

    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59535f(y, iObjectWrapper);
        y.writeLong(j);
        mo50769A1(28, y);
    }

    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59535f(y, iObjectWrapper);
        y.writeLong(j);
        mo50769A1(29, y);
    }

    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59535f(y, iObjectWrapper);
        y.writeLong(j);
        mo50769A1(30, y);
    }

    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcf zzcf, long j) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59535f(y, iObjectWrapper);
        zzbo.m59535f(y, zzcf);
        y.writeLong(j);
        mo50769A1(31, y);
    }

    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59535f(y, iObjectWrapper);
        y.writeLong(j);
        mo50769A1(25, y);
    }

    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59535f(y, iObjectWrapper);
        y.writeLong(j);
        mo50769A1(26, y);
    }

    public final void performAction(Bundle bundle, zzcf zzcf, long j) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59534e(y, bundle);
        zzbo.m59535f(y, zzcf);
        y.writeLong(j);
        mo50769A1(32, y);
    }

    public final void registerOnMeasurementEventListener(zzci zzci) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59535f(y, zzci);
        mo50769A1(35, y);
    }

    public final void resetAnalyticsData(long j) throws RemoteException {
        Parcel y = mo50772y();
        y.writeLong(j);
        mo50769A1(12, y);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59534e(y, bundle);
        y.writeLong(j);
        mo50769A1(8, y);
    }

    public final void setConsent(Bundle bundle, long j) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59534e(y, bundle);
        y.writeLong(j);
        mo50769A1(44, y);
    }

    public final void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59534e(y, bundle);
        y.writeLong(j);
        mo50769A1(45, y);
    }

    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59535f(y, iObjectWrapper);
        y.writeString(str);
        y.writeString(str2);
        y.writeLong(j);
        mo50769A1(15, y);
    }

    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59533d(y, z);
        mo50769A1(39, y);
    }

    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59534e(y, bundle);
        mo50769A1(42, y);
    }

    public final void setEventInterceptor(zzci zzci) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59535f(y, zzci);
        mo50769A1(34, y);
    }

    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59533d(y, z);
        y.writeLong(j);
        mo50769A1(11, y);
    }

    public final void setSessionTimeoutDuration(long j) throws RemoteException {
        Parcel y = mo50772y();
        y.writeLong(j);
        mo50769A1(14, y);
    }

    public final void setUserId(String str, long j) throws RemoteException {
        Parcel y = mo50772y();
        y.writeString(str);
        y.writeLong(j);
        mo50769A1(7, y);
    }

    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        Parcel y = mo50772y();
        y.writeString(str);
        y.writeString(str2);
        zzbo.m59535f(y, iObjectWrapper);
        zzbo.m59533d(y, z);
        y.writeLong(j);
        mo50769A1(4, y);
    }

    public final void unregisterOnMeasurementEventListener(zzci zzci) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59535f(y, zzci);
        mo50769A1(36, y);
    }
}
