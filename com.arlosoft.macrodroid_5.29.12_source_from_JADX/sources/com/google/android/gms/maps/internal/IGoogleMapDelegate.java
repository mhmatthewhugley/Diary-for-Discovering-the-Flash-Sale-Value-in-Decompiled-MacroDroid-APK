package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zzt;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.MarkerOptions;

public interface IGoogleMapDelegate extends IInterface {
    /* renamed from: J8 */
    void mo54566J8(zzbs zzbs, IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: T3 */
    void mo54567T3(int i) throws RemoteException;

    /* renamed from: U0 */
    IProjectionDelegate mo54568U0() throws RemoteException;

    /* renamed from: U7 */
    void mo54569U7(int i, int i2, int i3, int i4) throws RemoteException;

    /* renamed from: aa */
    IUiSettingsDelegate mo54570aa() throws RemoteException;

    /* renamed from: b3 */
    CameraPosition mo54571b3() throws RemoteException;

    /* renamed from: e5 */
    void mo54572e5(zzr zzr) throws RemoteException;

    /* renamed from: h2 */
    void mo54573h2(zzl zzl) throws RemoteException;

    /* renamed from: l8 */
    void mo54574l8(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: y6 */
    zzt mo54575y6(MarkerOptions markerOptions) throws RemoteException;

    /* renamed from: z5 */
    void mo54576z5(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: z7 */
    void mo54577z7(zzaj zzaj) throws RemoteException;
}
