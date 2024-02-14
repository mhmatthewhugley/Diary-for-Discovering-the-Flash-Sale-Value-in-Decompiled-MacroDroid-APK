package com.arlosoft.macrodroid.action.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.action.LocalePluginAction;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.Iterator;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p189x2.C10357b;
import p189x2.C10374m;
import p189x2.C10375p;
import p337nc.C15785a;

/* compiled from: LocaleTaskerSettingCompleteReceiver.kt */
public final class LocaleTaskerSettingCompleteReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final C3398a f9044a = new C3398a((C13695i) null);

    /* renamed from: com.arlosoft.macrodroid.action.receivers.LocaleTaskerSettingCompleteReceiver$a */
    /* compiled from: LocaleTaskerSettingCompleteReceiver.kt */
    public static final class C3398a {
        private C3398a() {
        }

        public /* synthetic */ C3398a(C13695i iVar) {
            this();
        }
    }

    public void onReceive(Context context, Intent intent) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(intent, "intent");
        C10375p pVar = new C10375p();
        Bundle a = C15785a.C15787b.m95315a(intent.getExtras());
        long longExtra = intent.getLongExtra("action_id", 0);
        if (a != null && !a.isEmpty()) {
            for (Macro actions : C4934n.m18998M().mo29679I()) {
                Iterator<Action> it = actions.getActions().iterator();
                while (it.hasNext()) {
                    Action next = it.next();
                    if (next instanceof LocalePluginAction) {
                        LocalePluginAction localePluginAction = (LocalePluginAction) next;
                        if (localePluginAction.mo27847f1() == longExtra) {
                            C10357b v3 = localePluginAction.mo25309v3();
                            C13706o.m87928e(v3, "action.arrayHandlingOption");
                            pVar.mo41057d(a, (C10374m) next, next, v3);
                            localePluginAction.mo25305G3();
                        }
                    }
                }
            }
            for (Macro actions2 : C4934n.m18998M().mo29709y()) {
                Iterator<Action> it2 = actions2.getActions().iterator();
                while (it2.hasNext()) {
                    Action next2 = it2.next();
                    if (next2 instanceof LocalePluginAction) {
                        LocalePluginAction localePluginAction2 = (LocalePluginAction) next2;
                        if (localePluginAction2.mo27847f1() == longExtra) {
                            C10357b v32 = localePluginAction2.mo25309v3();
                            C13706o.m87928e(v32, "action.arrayHandlingOption");
                            pVar.mo41057d(a, (C10374m) next2, next2, v32);
                            localePluginAction2.mo25305G3();
                        }
                    }
                }
            }
        }
    }
}
