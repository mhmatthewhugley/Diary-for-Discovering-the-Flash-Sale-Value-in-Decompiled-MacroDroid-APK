package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class zza extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ Context f47935a;

    /* renamed from: b */
    final /* synthetic */ ProviderInstaller.ProviderInstallListener f47936b;

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            ProviderInstaller.m66581a(this.f47935a);
            return 0;
        } catch (GooglePlayServicesRepairableException e) {
            return Integer.valueOf(e.mo21177b());
        } catch (GooglePlayServicesNotAvailableException e2) {
            return Integer.valueOf(e2.errorCode);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.f47936b.mo56098a();
            return;
        }
        this.f47936b.mo56099b(num.intValue(), ProviderInstaller.f47931a.mo21153d(this.f47935a, num.intValue(), "pi"));
    }
}
