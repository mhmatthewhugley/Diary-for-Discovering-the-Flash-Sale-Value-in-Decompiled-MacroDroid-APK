package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.zal;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zaao extends zaav {

    /* renamed from: c */
    private final Map f3280c;

    /* renamed from: d */
    final /* synthetic */ zaaw f3281d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zaao(zaaw zaaw, Map map) {
        super(zaaw, (zaau) null);
        this.f3281d = zaaw;
        this.f3280c = map;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo21445a() {
        zal zal = new zal(this.f3281d.f3292d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Api.Client client : this.f3280c.keySet()) {
            if (!client.mo21201i() || ((zaal) this.f3280c.get(client)).f3276c) {
                arrayList2.add(client);
            } else {
                arrayList.add(client);
            }
        }
        int i = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i2 < size) {
                i = zal.mo21763b(this.f3281d.f3291c, (Api.Client) arrayList.get(i2));
                i2++;
                if (i != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i2 < size2) {
                i = zal.mo21763b(this.f3281d.f3291c, (Api.Client) arrayList2.get(i2));
                i2++;
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            ConnectionResult connectionResult = new ConnectionResult(i, (PendingIntent) null);
            zaaw zaaw = this.f3281d;
            zaaw.f3289a.mo21462q(new zaam(this, zaaw, connectionResult));
            return;
        }
        zaaw zaaw2 = this.f3281d;
        if (zaaw2.f3301m && zaaw2.f3299k != null) {
            zaaw2.f3299k.mo56105k();
        }
        for (Api.Client client2 : this.f3280c.keySet()) {
            BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks = (BaseGmsClient.ConnectionProgressReportCallbacks) this.f3280c.get(client2);
            if (!client2.mo21201i() || zal.mo21763b(this.f3281d.f3291c, client2) == 0) {
                client2.mo21200h(connectionProgressReportCallbacks);
            } else {
                zaaw zaaw3 = this.f3281d;
                zaaw3.f3289a.mo21462q(new zaan(this, zaaw3, connectionProgressReportCallbacks));
            }
        }
    }
}
