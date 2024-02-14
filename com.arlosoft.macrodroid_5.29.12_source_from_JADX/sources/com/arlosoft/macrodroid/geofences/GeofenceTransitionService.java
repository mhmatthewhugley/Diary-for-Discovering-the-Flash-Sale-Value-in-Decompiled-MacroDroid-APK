package com.arlosoft.macrodroid.geofences;

import android.app.IntentService;
import android.content.Intent;
import android.location.Location;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.GeofenceTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.p353io.FilenameUtils;
import p081e1.C7264a;
import p332n7.C15756a;

/* compiled from: GeofenceTransitionService.kt */
public final class GeofenceTransitionService extends IntentService {
    public GeofenceTransitionService() {
        super("GeofenceTransitionService");
    }

    /* renamed from: a */
    private final int m18248a(GeofencingEvent geofencingEvent) {
        return geofencingEvent.mo54164c() == 2 ? 2 : 1;
    }

    /* renamed from: b */
    private final String m18249b(int i) {
        return i != 1 ? i != 2 ? "Unknown" : "Outside" : "Inside";
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        GeofenceTransitionService geofenceTransitionService = this;
        if (intent != null) {
            GeofencingEvent a = GeofencingEvent.m64658a(intent);
            C13706o.m87928e(a, "fromIntent(intent)");
            if (a.mo54167f()) {
                C4878b.m18882u("GeofenceInfo Error: " + a.mo54163b());
                return;
            }
            String str = "GeofenceInfo";
            C7264a q = MacroDroidApplication.f9883I.mo27303b().mo27293q(str);
            GeofenceStore geofenceStore = (GeofenceStore) q.mo37133c(str, GeofenceStore.class);
            boolean z = true;
            if (geofenceStore == null) {
                geofenceStore = new GeofenceStore((Map) null, 1, (C13695i) null);
            }
            Location e = a.mo54166e();
            C13706o.m87928e(e, "geofencingEvent.triggeringLocation");
            if (a.mo54164c() != 1) {
                z = false;
            }
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
            decimalFormatSymbols.setDecimalSeparator(FilenameUtils.EXTENSION_SEPARATOR);
            DecimalFormat decimalFormat = new DecimalFormat("#.#######", decimalFormatSymbols);
            String str2 = "http://maps.google.com/maps?q=" + decimalFormat.format(e.getLatitude()) + ',' + decimalFormat.format(e.getLongitude()) + "&center=" + decimalFormat.format(e.getLatitude()) + ',' + decimalFormat.format(e.getLongitude());
            C4878b.m18881t("Location: <a href=\"" + str2 + "\">" + str2 + " (Uncertainty=" + e.getAccuracy() + "m)</a>", 0, GeofenceInfo.GEOFENCE_GENERIC_ID);
            StringBuilder sb = new StringBuilder();
            sb.append("Geofence Event: ");
            sb.append(C15756a.m95058a(e));
            C4878b.m18875n(sb.toString(), 0, GeofenceInfo.GEOFENCE_GENERIC_ID);
            ArrayList arrayList = new ArrayList();
            for (Geofence next : a.mo54165d()) {
                GeofenceInfo geofenceInfo = geofenceStore.getGeofenceMap().get(next.mo50588f());
                if (geofenceInfo != null) {
                    int a2 = geofenceTransitionService.m18248a(a);
                    GeofencingEvent geofencingEvent = a;
                    long j = 0;
                    C4878b.m18875n("Geofence Event: " + geofenceInfo.getName() + " Status = " + geofenceTransitionService.m18249b(a2), 0, next.mo50588f());
                    if (geofenceInfo.getInsideStatus() == a2) {
                        C4878b.m18875n("Geofence status has not changed", 0, next.mo50588f());
                        return;
                    }
                    String f = next.mo50588f();
                    C13706o.m87928e(f, "geofence.requestId");
                    geofenceStore.setGeofence(f, GeofenceInfo.copy$default(geofenceInfo, (String) null, (String) null, 0.0d, 0.0d, 0, a2, 31, (Object) null));
                    q.mo37132b(str, geofenceStore);
                    for (Macro next2 : C4934n.m18998M().mo29679I()) {
                        Iterator<Trigger> it = next2.getTriggerListWithAwaitingActions().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Trigger next3 = it.next();
                            if (next3 instanceof GeofenceTrigger) {
                                GeofenceTrigger geofenceTrigger = (GeofenceTrigger) next3;
                                C7264a aVar = q;
                                if (!C13706o.m87924a(geofenceTrigger.mo31173o(), geofenceInfo.getId()) || geofenceTrigger.mo31174p3() != z || !next3.mo31374R2() || (geofenceInfo.getInsideStatus() == 0 && !((GeofenceTrigger) next3).mo31175q3())) {
                                    q = aVar;
                                } else {
                                    next2.setTriggerThatInvoked(next3);
                                    StringBuilder sb2 = new StringBuilder();
                                    String str3 = str;
                                    sb2.append(e.getLatitude());
                                    sb2.append(',');
                                    sb2.append(e.getLongitude());
                                    next2.setTriggerContextInfo(new TriggerContextInfo(next3, sb2.toString()));
                                    if (next2.canInvoke(next2.getTriggerContextInfo())) {
                                        arrayList.add(next2);
                                        q = aVar;
                                        str = str3;
                                        j = 0;
                                        break;
                                    }
                                    q = aVar;
                                    str = str3;
                                }
                            }
                            j = 0;
                        }
                    }
                    long j2 = j;
                    geofenceTransitionService = this;
                    a = geofencingEvent;
                    long j3 = j2;
                } else {
                    geofenceTransitionService = this;
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Macro macro = (Macro) it2.next();
                macro.invokeActions(macro.getTriggerContextInfo());
            }
        }
    }
}
