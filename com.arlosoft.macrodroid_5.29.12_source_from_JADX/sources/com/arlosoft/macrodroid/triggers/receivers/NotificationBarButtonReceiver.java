package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.NotificationButtonTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.activities.NotificationButtonNotAssignedActivity;
import com.arlosoft.macrodroid.triggers.services.MacroDroidAccessibilityServiceJellyBean;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import p148q0.C8151a;

public class NotificationBarButtonReceiver extends BroadcastReceiver {
    /* renamed from: a */
    private void m24038a(Context context) {
        if (Build.VERSION.SDK_INT < 31) {
            try {
                Object systemService = context.getSystemService("statusbar");
                Method method = Class.forName("android.app.StatusBarManager").getMethod("collapsePanels", new Class[0]);
                method.setAccessible(true);
                method.invoke(systemService, new Object[0]);
            } catch (Exception e) {
                C8151a.m33873n(new RuntimeException("Could not collapse notification panel: " + e.getMessage()));
            }
        } else if (!C4061t1.m15992f0(context)) {
            C4878b.m18868g("Could not collapse button bar, the MacroDroid accessibility service must be enabled on Android 12+");
        } else {
            Intent intent = new Intent(context, MacroDroidAccessibilityServiceJellyBean.class);
            intent.putExtra("GlobalControlType", 15);
            context.startService(intent);
        }
    }

    public void onReceive(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        int i = intent.getExtras().getInt("notificationButton");
        boolean z = false;
        for (Macro next : C4934n.m18998M().mo29710z()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if (next2 instanceof NotificationButtonTrigger) {
                    NotificationButtonTrigger notificationButtonTrigger = (NotificationButtonTrigger) next2;
                    if (notificationButtonTrigger.mo31361i3() == i && next2.mo31374R2()) {
                        z = true;
                        if (notificationButtonTrigger.mo31360h3()) {
                            m24038a(context);
                        }
                        if (next.isEnabled()) {
                            next.setTriggerThatInvoked(next2);
                            if (next.canInvoke(next.getTriggerContextInfo())) {
                                arrayList.add(next);
                            }
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Macro macro = (Macro) it2.next();
            macro.invokeActions(macro.getTriggerContextInfo());
        }
        if (!z) {
            m24038a(context);
            Intent intent2 = new Intent(context, NotificationButtonNotAssignedActivity.class);
            intent2.addFlags(268435456);
            intent2.putExtra("ButtonId", i);
            context.startActivity(intent2);
        }
    }
}
