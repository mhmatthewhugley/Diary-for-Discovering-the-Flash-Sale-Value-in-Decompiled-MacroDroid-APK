package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbls;
import com.google.android.gms.internal.ads.zzbnc;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbni;
import com.google.android.gms.internal.ads.zzbnl;
import com.google.android.gms.internal.ads.zzbnp;
import com.google.android.gms.internal.ads.zzbns;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzbsl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public interface zzbo extends IInterface {
    /* renamed from: Ab */
    void mo19913Ab(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    /* renamed from: M5 */
    void mo19914M5(zzbnp zzbnp, zzq zzq) throws RemoteException;

    /* renamed from: M6 */
    void mo19915M6(zzbsl zzbsl) throws RemoteException;

    /* renamed from: b */
    zzbl mo19908b() throws RemoteException;

    /* renamed from: ba */
    void mo19916ba(zzbsc zzbsc) throws RemoteException;

    /* renamed from: e7 */
    void mo19917e7(zzcd zzcd) throws RemoteException;

    /* renamed from: i7 */
    void mo19909i7(zzbls zzbls) throws RemoteException;

    /* renamed from: m2 */
    void mo19910m2(zzbns zzbns) throws RemoteException;

    /* renamed from: m7 */
    void mo19911m7(zzbf zzbf) throws RemoteException;

    /* renamed from: ma */
    void mo19912ma(String str, zzbnl zzbnl, @Nullable zzbni zzbni) throws RemoteException;

    /* renamed from: o5 */
    void mo19918o5(zzbnc zzbnc) throws RemoteException;

    /* renamed from: p2 */
    void mo19919p2(zzbnf zzbnf) throws RemoteException;

    /* renamed from: wb */
    void mo19920wb(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;
}
