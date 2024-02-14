package com.arlosoft.macrodroid.triggers.services;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.core.util.Pair;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.LocalePluginTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.twofortyfouram.locale.sdk.host.api.Condition;
import com.twofortyfouram.locale.sdk.host.api.Event;
import com.twofortyfouram.locale.sdk.host.model.PluginType;
import java.util.ArrayList;
import java.util.Iterator;
import p189x2.C10374m;
import p189x2.C10375p;
import p337nc.C15785a;

public class LocalePluginCheckerService extends IntentService {
    public LocalePluginCheckerService() {
        super("LocalePluginCheckerService");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m24165b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Macro macro = (Macro) it.next();
            macro.invokeActions(macro.getTriggerContextInfo());
        }
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        int i;
        boolean z;
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        String stringExtra = intent.getStringExtra("com.twofortyfouram.locale.intent.extra.ACTIVITY");
        C10375p pVar = new C10375p();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (it.hasNext()) {
                Trigger next2 = it.next();
                if (next2 instanceof LocalePluginTrigger) {
                    LocalePluginTrigger localePluginTrigger = (LocalePluginTrigger) next2;
                    if (localePluginTrigger.mo31279u3().getActivityClassName().equals(stringExtra)) {
                        if (localePluginTrigger.mo31279u3().getType() == PluginType.CONDITION) {
                            Condition condition = new Condition(this, localePluginTrigger.mo31279u3());
                            Pair<Integer, Bundle> query = condition.query(localePluginTrigger.mo31280v3(), localePluginTrigger.mo31281w3());
                            i = ((Integer) query.first).intValue();
                            z = (i == 16 && !localePluginTrigger.mo31282x3()) || (i != 16 && localePluginTrigger.mo31282x3());
                            bundle = (Bundle) query.second;
                            condition.destroy();
                        } else {
                            Event event = new Event(this, localePluginTrigger.mo31279u3());
                            Pair<Integer, Bundle> query2 = event.query(localePluginTrigger.mo31280v3(), localePluginTrigger.mo31281w3(), C15785a.C15786a.m95314c(intent));
                            i = ((Integer) query2.first).intValue();
                            z = i == 16;
                            bundle = (Bundle) query2.second;
                            event.destroy();
                        }
                        localePluginTrigger.mo31277C3(i);
                        if (z && next2.mo31374R2()) {
                            next.setTriggerThatInvoked(next2);
                            if (next.canInvoke(next.getTriggerContextInfo())) {
                                arrayList.add(next);
                                if (bundle != null) {
                                    pVar.mo41057d(bundle, (C10374m) next2, next2, ((LocalePluginTrigger) next2).mo31278t3());
                                }
                            }
                        }
                    }
                }
            }
        }
        new Handler(Looper.getMainLooper()).post(new C6126f(arrayList));
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }
}
