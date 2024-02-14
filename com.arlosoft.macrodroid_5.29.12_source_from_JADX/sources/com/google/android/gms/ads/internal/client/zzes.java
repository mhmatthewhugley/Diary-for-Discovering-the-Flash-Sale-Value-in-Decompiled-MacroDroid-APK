package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbrx;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzcgp;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzes extends zzcl {

    /* renamed from: a */
    private zzbrx f1965a;

    /* renamed from: C1 */
    public final void mo19972C1(boolean z) throws RemoteException {
    }

    /* renamed from: F4 */
    public final void mo19966F4(@Nullable String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    /* renamed from: Ya */
    public final void mo19973Ya(float f) throws RemoteException {
    }

    /* renamed from: Z7 */
    public final void mo19967Z7(zzez zzez) throws RemoteException {
    }

    /* renamed from: b */
    public final float mo19974b() throws RemoteException {
        return 1.0f;
    }

    /* renamed from: c */
    public final String mo19975c() {
        return "";
    }

    /* renamed from: e6 */
    public final void mo19976e6(String str) throws RemoteException {
    }

    /* renamed from: f */
    public final List mo19968f() throws RemoteException {
        return Collections.emptyList();
    }

    /* renamed from: g */
    public final void mo19977g() {
    }

    /* renamed from: ga */
    public final void mo19969ga(zzbvk zzbvk) throws RemoteException {
    }

    /* renamed from: h */
    public final void mo19970h() throws RemoteException {
        zzcgp.m45226d("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzcgi.f28421b.post(new zzer(this));
    }

    /* renamed from: i9 */
    public final void mo19978i9(zzcy zzcy) {
    }

    /* renamed from: k3 */
    public final void mo19971k3(zzbrx zzbrx) throws RemoteException {
        this.f1965a = zzbrx;
    }

    /* renamed from: la */
    public final void mo19979la(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    /* renamed from: r */
    public final boolean mo19980r() throws RemoteException {
        return false;
    }

    /* renamed from: w0 */
    public final void mo19981w0(@Nullable String str) throws RemoteException {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb() {
        zzbrx zzbrx = this.f1965a;
        if (zzbrx != null) {
            try {
                zzbrx.mo20076j5(Collections.emptyList());
            } catch (RemoteException e) {
                zzcgp.m45230h("Could not notify onComplete event.", e);
            }
        }
    }
}
