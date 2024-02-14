package org.altbeacon.beacon;

import android.content.Context;
import android.content.Intent;
import java.util.Collection;
import java.util.Set;
import org.altbeacon.beacon.service.C16014e;
import org.altbeacon.beacon.service.C16015f;
import org.altbeacon.beacon.service.C16018i;
import p097gd.C7354d;

/* renamed from: org.altbeacon.beacon.f */
/* compiled from: IntentHandler */
public class C8049f {

    /* renamed from: a */
    private static final String f19643a = "f";

    /* renamed from: a */
    public void mo38058a(Context context, Intent intent) {
        C16014e eVar;
        C16018i iVar = null;
        if (intent == null || intent.getExtras() == null) {
            eVar = null;
        } else {
            eVar = intent.getExtras().getBundle("monitoringData") != null ? C16014e.m96537a(intent.getExtras().getBundle("monitoringData")) : null;
            if (intent.getExtras().getBundle("rangingData") != null) {
                iVar = C16018i.m96579a(intent.getExtras().getBundle("rangingData"));
            }
        }
        if (iVar != null) {
            String str = f19643a;
            C7354d.m30376a(str, "got ranging data", new Object[0]);
            if (iVar.mo76469b() == null) {
                C7354d.m30381f(str, "Ranging data has a null beacons collection", new Object[0]);
            }
            Set<C8052i> G = BeaconManager.m33479A(context).mo37978G();
            Collection<Beacon> b = iVar.mo76469b();
            if (G != null) {
                for (C8052i a : G) {
                    a.mo16894a(b, iVar.mo76470c());
                }
            } else {
                C7354d.m30376a(str, "but ranging notifier is null, so we're dropping it.", new Object[0]);
            }
            C8052i u = BeaconManager.m33479A(context).mo38010u();
            if (u != null) {
                u.mo16894a(b, iVar.mo76470c());
            }
            if (BeaconManager.m33479A(context).mo37984S(iVar.mo76470c())) {
                BeaconManager.m33479A(context).mo37979I(iVar.mo76470c()).mo38059f().postValue(iVar.mo76469b());
            }
        }
        if (eVar != null) {
            C7354d.m30376a(f19643a, "got monitoring data", new Object[0]);
            Set<C8051h> D = BeaconManager.m33479A(context).mo37975D();
            Region b2 = eVar.mo76436b();
            Integer valueOf = Integer.valueOf(eVar.mo76437c() ? 1 : 0);
            if (D != null) {
                for (C8051h next : D) {
                    C7354d.m30376a(f19643a, "Calling monitoring notifier: %s", next);
                    next.mo24569c(valueOf.intValue(), b2);
                    C16015f.m96542d(context).mo76453t(b2, valueOf);
                    if (eVar.mo76437c()) {
                        next.mo24567a(eVar.mo76436b());
                    } else {
                        next.mo24568b(eVar.mo76436b());
                    }
                }
            }
            if (BeaconManager.m33479A(context).mo37984S(eVar.mo76436b())) {
                BeaconManager.m33479A(context).mo37979I(eVar.mo76436b()).mo38060g().postValue(valueOf);
            }
        }
    }
}
