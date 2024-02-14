package com.arlosoft.macrodroid.triggers.services;

import android.app.IntentService;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.arlosoft.macrodroid.data.C4366a;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.triggers.WeatherTrigger;
import java.util.ArrayList;
import java.util.Iterator;

public class WeatherService extends IntentService {

    /* renamed from: a */
    private static C4366a f14558a;

    public WeatherService() {
        super("WeatherService");
    }

    /* renamed from: a */
    private String m24231a() {
        return C5163j2.m19963F0(this).getLanguage();
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0067 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0079 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0081 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m24232b(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x0070 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0070 }
            r2.<init>()     // Catch:{ all -> 0x0070 }
            java.lang.String r3 = "http://api.openweathermap.org/data/2.5/weather?APPID=d8cabbe23fb9ee0f252a4c87380216c8&units=units=metric&lang="
            r2.append(r3)     // Catch:{ all -> 0x0070 }
            java.lang.String r3 = r5.m24231a()     // Catch:{ all -> 0x0070 }
            r2.append(r3)     // Catch:{ all -> 0x0070 }
            java.lang.String r3 = "&"
            r2.append(r3)     // Catch:{ all -> 0x0070 }
            r2.append(r6)     // Catch:{ all -> 0x0070 }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x0070 }
            r1.<init>(r6)     // Catch:{ all -> 0x0070 }
            java.net.URLConnection r6 = r1.openConnection()     // Catch:{ all -> 0x0070 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = "GET"
            r6.setRequestMethod(r1)     // Catch:{ all -> 0x006d }
            r1 = 1
            r6.setDoInput(r1)     // Catch:{ all -> 0x006d }
            r6.setDoOutput(r1)     // Catch:{ all -> 0x006d }
            r6.connect()     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r1.<init>()     // Catch:{ all -> 0x006d }
            java.io.InputStream r2 = r6.getInputStream()     // Catch:{ all -> 0x006d }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x006b }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ all -> 0x006b }
            r4.<init>(r2)     // Catch:{ all -> 0x006b }
            r3.<init>(r4)     // Catch:{ all -> 0x006b }
        L_0x004b:
            java.lang.String r4 = r3.readLine()     // Catch:{ all -> 0x006b }
            if (r4 == 0) goto L_0x005a
            r1.append(r4)     // Catch:{ all -> 0x006b }
            java.lang.String r4 = "\r\n"
            r1.append(r4)     // Catch:{ all -> 0x006b }
            goto L_0x004b
        L_0x005a:
            r2.close()     // Catch:{ all -> 0x006b }
            r6.disconnect()     // Catch:{ all -> 0x006b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x006b }
            r2.close()     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r6.disconnect()     // Catch:{ all -> 0x006a }
        L_0x006a:
            return r0
        L_0x006b:
            r1 = move-exception
            goto L_0x0073
        L_0x006d:
            r1 = move-exception
            r2 = r0
            goto L_0x0073
        L_0x0070:
            r1 = move-exception
            r6 = r0
            r2 = r6
        L_0x0073:
            r1.printStackTrace()     // Catch:{ all -> 0x007d }
            r2.close()     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r6.disconnect()     // Catch:{ all -> 0x007c }
        L_0x007c:
            return r0
        L_0x007d:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r6.disconnect()     // Catch:{ all -> 0x0084 }
        L_0x0084:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.services.WeatherService.m24232b(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        String b = m24232b(C5163j2.m20297x2(this));
        if (b == null) {
            C4878b.m18873l("Failed to obtain weather data");
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
            return;
        }
        C4366a a = C4366a.m17318a(b);
        if (a == null) {
            C4878b.m18873l("Failed to obtain weather data");
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if ((next2 instanceof WeatherTrigger) && ((WeatherTrigger) next2).mo31610H3(f14558a, a) && next2.mo31374R2()) {
                    next.setTriggerThatInvoked(next2);
                    next.setTriggerContextInfo(new TriggerContextInfo(next.getTriggerThatInvoked(), a.mo28619b()));
                    if (next.canInvoke(next.getTriggerContextInfo())) {
                        arrayList.add(next);
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Macro macro = (Macro) it2.next();
            macro.invokeActions(macro.getTriggerContextInfo());
        }
        f14558a = a;
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }
}
