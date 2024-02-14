package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public interface zzdx extends IInterface {
    /* renamed from: D3 */
    void mo55039D3(zzaw zzaw, zzq zzq) throws RemoteException;

    @Nullable
    /* renamed from: F7 */
    byte[] mo55040F7(zzaw zzaw, String str) throws RemoteException;

    /* renamed from: M3 */
    void mo55041M3(zzq zzq) throws RemoteException;

    /* renamed from: Na */
    void mo55042Na(zzac zzac, zzq zzq) throws RemoteException;

    /* renamed from: O4 */
    void mo55043O4(zzq zzq) throws RemoteException;

    @Nullable
    /* renamed from: O7 */
    String mo55044O7(zzq zzq) throws RemoteException;

    /* renamed from: S4 */
    List mo55045S4(@Nullable String str, @Nullable String str2, boolean z, zzq zzq) throws RemoteException;

    /* renamed from: S9 */
    void mo55055S9(zzaw zzaw, String str, @Nullable String str2) throws RemoteException;

    /* renamed from: Z6 */
    void mo55046Z6(zzq zzq) throws RemoteException;

    /* renamed from: a4 */
    void mo55047a4(long j, @Nullable String str, @Nullable String str2, String str3) throws RemoteException;

    /* renamed from: c8 */
    List mo55048c8(String str, @Nullable String str2, @Nullable String str3) throws RemoteException;

    /* renamed from: h4 */
    void mo55049h4(zzkw zzkw, zzq zzq) throws RemoteException;

    /* renamed from: i2 */
    void mo55056i2(zzac zzac) throws RemoteException;

    /* renamed from: k7 */
    void mo55050k7(Bundle bundle, zzq zzq) throws RemoteException;

    @Nullable
    /* renamed from: n2 */
    List mo55051n2(zzq zzq, boolean z) throws RemoteException;

    /* renamed from: t5 */
    void mo55052t5(zzq zzq) throws RemoteException;

    /* renamed from: t7 */
    List mo55053t7(String str, @Nullable String str2, @Nullable String str3, boolean z) throws RemoteException;

    /* renamed from: t9 */
    List mo55054t9(@Nullable String str, @Nullable String str2, zzq zzq) throws RemoteException;
}
