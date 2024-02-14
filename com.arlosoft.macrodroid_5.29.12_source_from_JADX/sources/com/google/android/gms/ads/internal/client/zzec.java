package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbrw;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzec extends zzbrw {

    /* renamed from: a */
    final /* synthetic */ zzed f1939a;

    /* synthetic */ zzec(zzed zzed, zzeb zzeb) {
        this.f1939a = zzed;
    }

    /* renamed from: j5 */
    public final void mo20076j5(List list) throws RemoteException {
        int i;
        ArrayList arrayList;
        synchronized (this.f1939a.f1941a) {
            this.f1939a.f1943c = false;
            this.f1939a.f1944d = true;
            arrayList = new ArrayList(this.f1939a.f1942b);
            this.f1939a.f1942b.clear();
        }
        InitializationStatus c = zzed.m2264m(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).mo19853a(c);
        }
    }
}
