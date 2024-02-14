package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.IntentReceivedTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6460y1;
import com.arlosoft.macrodroid.variables.VariableValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.C13592k0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* compiled from: IntentReceivedTriggerReceiver.kt */
public final class IntentReceivedTriggerReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        TriggerContextInfo triggerContextInfo;
        String str;
        MacroDroidVariable q;
        Context context2 = context;
        C13706o.m87929f(context2, "context");
        C13706o.m87929f(intent, "intent");
        ArrayList<Macro> arrayList = new ArrayList<>();
        Bundle extras = intent.getExtras();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if (next2 instanceof IntentReceivedTrigger) {
                    TriggerContextInfo triggerContextInfo2 = null;
                    if (next2.mo27845e0((TriggerContextInfo) null)) {
                        IntentReceivedTrigger intentReceivedTrigger = (IntentReceivedTrigger) next2;
                        if (C13706o.m87924a(intentReceivedTrigger.mo31226t3(), intent.getAction())) {
                            int i = 0;
                            for (C13592k0 k0Var : C13566b0.m87411M0(intentReceivedTrigger.mo31228v3())) {
                                if (extras == null || !extras.containsKey((String) k0Var.mo71845d())) {
                                    triggerContextInfo = triggerContextInfo2;
                                } else {
                                    Object obj = extras.get((String) k0Var.mo71845d());
                                    if (obj == null || (str = obj.toString()) == null) {
                                        str = "";
                                    }
                                    String t0 = C4023j0.m15760t0(context2, intentReceivedTrigger.mo31229w3().get(k0Var.mo71844c()), triggerContextInfo2, next2.mo27837X0());
                                    C13706o.m87928e(t0, "text");
                                    Locale locale = Locale.ROOT;
                                    String lowerCase = t0.toLowerCase(locale);
                                    C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    String c = C6460y1.m24791c(lowerCase, intentReceivedTrigger.mo31227u3());
                                    String lowerCase2 = str.toLowerCase(locale);
                                    C13706o.m87928e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    if (C6460y1.m24792d(lowerCase2, c, intentReceivedTrigger.mo31227u3())) {
                                        i++;
                                        String str2 = intentReceivedTrigger.mo31230x3().get(k0Var.mo71844c());
                                        if (!(str2 == null || (q = next2.mo27861q(str2)) == null)) {
                                            triggerContextInfo = null;
                                            next2.mo27832M2(q, new VariableValue.StringValue(str, (List) null, 2, (C13695i) null));
                                        }
                                    }
                                    triggerContextInfo = null;
                                }
                                context2 = context;
                                triggerContextInfo2 = triggerContextInfo;
                            }
                            if (i == intentReceivedTrigger.mo31228v3().size()) {
                                next.setTriggerThatInvoked(next2);
                                if (next.canInvoke(next.getTriggerContextInfo())) {
                                    C13706o.m87928e(next, "macro");
                                    arrayList.add(next);
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                context2 = context;
            }
            context2 = context;
        }
        for (Macro macro : arrayList) {
            macro.invokeActions(macro.getTriggerContextInfo());
        }
    }
}
