package com.arlosoft.macrodroid.triggers.receivers;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.arlosoft.macrodroid.actionblock.common.ActionBlockData;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4915a;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.InvokedByNotificationTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Collections;
import java.util.Stack;
import p136n3.C15754f;

public class InvokeMacroReceiver extends BroadcastReceiver {
    /* renamed from: b */
    private C4915a m24030b() {
        return C4934n.m18998M();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m24031c(Intent intent, Context context) {
        Intent intent2 = intent;
        long longExtra = intent2.getLongExtra("MacroGuid", 0);
        int intExtra = intent2.getIntExtra("cancel_notification_id", -1);
        if (intExtra >= 0) {
            ((NotificationManager) context.getSystemService("notification")).cancel(String.valueOf(intExtra), intExtra);
        }
        for (Macro next : C4934n.m18998M().mo29680J()) {
            if (next.getGUID() == longExtra) {
                if (next.isActionBlock) {
                    ActionBlockData actionBlockData = (ActionBlockData) intent2.getParcelableExtra("action_block_data");
                    if (actionBlockData == null) {
                        C4878b.m18868g("Action Block data was null in InvokeMacroReceiver for an action block");
                    } else {
                        Macro Q = C4934n.m18998M().mo29682Q(intent2.getLongExtra("parent_macro_id", 0));
                        ActionBlock cloneActionBlock = m24030b().mo29649g(next.getGUID()).cloneActionBlock(false);
                        ResumeMacroInfo resumeMacroInfo = new ResumeMacroInfo(cloneActionBlock.getGUID(), -1, (TriggerContextInfo) null, true, new Stack(), (ResumeMacroInfo) null, actionBlockData.mo27087f());
                        C4878b.m18874m("Running action block: " + cloneActionBlock.getName(), next.getGUID());
                        cloneActionBlock.invokeActions((TriggerContextInfo) null, true, resumeMacroInfo, actionBlockData.mo27085e(), Collections.emptyMap(), Q);
                    }
                } else {
                    next.getTriggerListWithAwaitingActions();
                    TriggerContextInfo triggerContextInfo = new TriggerContextInfo((Trigger) InvokedByNotificationTrigger.m22475g3());
                    next.setTriggerThatInvoked(InvokedByNotificationTrigger.m22475g3());
                    C4878b.m18874m("Running macro: " + next.getName(), next.getGUID());
                    next.invokeActions(triggerContextInfo);
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        new Handler().postDelayed(new C15754f(this, intent, context), 500);
    }
}
