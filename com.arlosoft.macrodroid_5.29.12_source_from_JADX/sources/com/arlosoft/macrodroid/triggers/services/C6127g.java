package com.arlosoft.macrodroid.triggers.services;

import android.location.Location;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.LocationTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.commons.p353io.FilenameUtils;
import p148q0.C8151a;

/* renamed from: com.arlosoft.macrodroid.triggers.services.g */
/* compiled from: LocationTriggerAreaChecker */
public class C6127g {

    /* renamed from: com.arlosoft.macrodroid.triggers.services.g$a */
    /* compiled from: LocationTriggerAreaChecker */
    public enum C6128a {
        UNKNOWN,
        OUTSIDE_TRIGGER_AREA,
        PROBABLY_OUTSIDE_TRIGGER_AREA,
        POSSIBLY_INSIDE_TRIGGER_AREA,
        PROBABLY_INSIDE_TRIGGER_AREA,
        INSIDE_TRIGGER_AREA
    }

    /* renamed from: a */
    public static synchronized boolean m24242a(Location location) {
        Iterator<Macro> it;
        synchronized (C6127g.class) {
            boolean z = true;
            if (location.getAccuracy() > 200.0f) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
            decimalFormatSymbols.setDecimalSeparator(FilenameUtils.EXTENSION_SEPARATOR);
            DecimalFormat decimalFormat = new DecimalFormat("#.#######", decimalFormatSymbols);
            String str = "http://maps.google.com/maps?q=" + location.getLatitude() + "," + location.getLongitude() + "&center=" + decimalFormat.format(location.getLatitude()) + "," + decimalFormat.format(location.getLongitude());
            C4878b.m18880s("Location: <a href=\"" + str + "\">" + str + " (Uncertainty=" + location.getAccuracy() + "m)</a>", 0);
            HashMap hashMap = new HashMap();
            Iterator<Macro> it2 = C4934n.m18998M().mo29679I().iterator();
            while (it2.hasNext()) {
                Macro next = it2.next();
                Iterator<Trigger> it3 = next.getTriggerListWithAwaitingActions().iterator();
                while (it3.hasNext()) {
                    Trigger next2 = it3.next();
                    if (next2 instanceof LocationTrigger) {
                        LocationTrigger locationTrigger = (LocationTrigger) next2;
                        C6128a G0 = C5163j2.m19971G0(MacroDroidApplication.m14845u(), locationTrigger);
                        C6128a b = m24243b(location, locationTrigger.mo31288l3());
                        StringBuilder sb = new StringBuilder();
                        it = it2;
                        sb.append(location.getLatitude());
                        sb.append(",");
                        sb.append(location.getLongitude());
                        TriggerContextInfo triggerContextInfo = new TriggerContextInfo((Trigger) locationTrigger, sb.toString());
                        C6128a aVar = C6128a.POSSIBLY_INSIDE_TRIGGER_AREA;
                        if (b == aVar) {
                            z = false;
                        } else {
                            C6128a aVar2 = C6128a.OUTSIDE_TRIGGER_AREA;
                            if (b != aVar2) {
                                C6128a aVar3 = C6128a.PROBABLY_OUTSIDE_TRIGGER_AREA;
                                if (b != aVar3) {
                                    if ((b == C6128a.INSIDE_TRIGGER_AREA || b == C6128a.PROBABLY_INSIDE_TRIGGER_AREA) && locationTrigger.mo31290o3() && (((G0 == C6128a.UNKNOWN && locationTrigger.mo31289n3()) || G0 == aVar2 || G0 == aVar3) && next2.mo31374R2())) {
                                        next.setTriggerThatInvoked(next2);
                                        next.setTriggerContextInfo(triggerContextInfo);
                                        if (next.canInvoke(next.getTriggerContextInfo())) {
                                            arrayList.add(next);
                                        }
                                    }
                                }
                            }
                            if (!locationTrigger.mo31290o3() && (((G0 == C6128a.UNKNOWN && locationTrigger.mo31289n3()) || G0 == C6128a.INSIDE_TRIGGER_AREA || G0 == C6128a.PROBABLY_INSIDE_TRIGGER_AREA) && next2.mo31374R2())) {
                                next.setTriggerThatInvoked(next2);
                                next.setTriggerContextInfo(triggerContextInfo);
                                if (next.canInvoke(next.getTriggerContextInfo())) {
                                    arrayList.add(next);
                                }
                            }
                        }
                        if (b != aVar) {
                            hashMap.put(locationTrigger, b);
                        }
                    } else {
                        Location location2 = location;
                        it = it2;
                    }
                    it2 = it;
                }
                Location location3 = location;
            }
            for (LocationTrigger locationTrigger2 : hashMap.keySet()) {
                C5163j2.m20283v4(MacroDroidApplication.m14845u(), locationTrigger2, (C6128a) hashMap.get(locationTrigger2));
            }
            if (z) {
                C8151a.m33860a("Location Trigger - running macros");
                for (Macro next3 : C4934n.m18998M().mo29679I()) {
                    Iterator<Trigger> it4 = next3.getTriggerListWithAwaitingActions().iterator();
                    while (it4.hasNext()) {
                        Trigger next4 = it4.next();
                        if (next4 instanceof LocationTrigger) {
                            C4878b.m18880s(C5163j2.m19971G0(MacroDroidApplication.m14845u(), (LocationTrigger) next4).toString(), next3.getGUID());
                        }
                    }
                }
            }
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                Macro macro = (Macro) it5.next();
                macro.invokeActions(macro.getTriggerContextInfo());
            }
            return z;
        }
    }

    /* renamed from: b */
    private static C6128a m24243b(Location location, Location location2) {
        float distanceTo = location.distanceTo(location2);
        float accuracy = location.getAccuracy();
        float accuracy2 = location2.getAccuracy();
        if (distanceTo < accuracy2 - accuracy) {
            return C6128a.INSIDE_TRIGGER_AREA;
        }
        double d = (double) distanceTo;
        double d2 = (double) accuracy2;
        double d3 = ((double) accuracy) * 0.85d;
        if (d < d2 - d3) {
            return C6128a.PROBABLY_INSIDE_TRIGGER_AREA;
        }
        if (distanceTo > accuracy2 + accuracy) {
            return C6128a.OUTSIDE_TRIGGER_AREA;
        }
        if (d > d2 + d3) {
            return C6128a.PROBABLY_OUTSIDE_TRIGGER_AREA;
        }
        return C6128a.POSSIBLY_INSIDE_TRIGGER_AREA;
    }
}
