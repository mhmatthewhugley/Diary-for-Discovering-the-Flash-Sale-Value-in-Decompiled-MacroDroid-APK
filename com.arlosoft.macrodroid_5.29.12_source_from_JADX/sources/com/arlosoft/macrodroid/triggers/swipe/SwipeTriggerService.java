package com.arlosoft.macrodroid.triggers.swipe;

import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.SwipeTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p151q3.C8166c;

public class SwipeTriggerService extends OverlayService {

    /* renamed from: o */
    private static WeakReference<SwipeTriggerService> f14583o;

    /* renamed from: f */
    private C8166c f14584f;

    /* renamed from: g */
    private C8166c f14585g;

    public void onCreate() {
        super.onCreate();
        f14583o = new WeakReference<>(this);
    }

    public void onDestroy() {
        super.onDestroy();
        C8166c cVar = this.f14584f;
        if (cVar != null) {
            cVar.mo38216c();
        }
        C8166c cVar2 = this.f14585g;
        if (cVar2 != null) {
            cVar2.mo38216c();
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(this)) {
            for (Macro triggerListWithAwaitingActions : C4934n.m18998M().mo29679I()) {
                Iterator<Trigger> it = triggerListWithAwaitingActions.getTriggerListWithAwaitingActions().iterator();
                while (it.hasNext()) {
                    Trigger next = it.next();
                    if (next instanceof SwipeTrigger) {
                        SwipeTrigger swipeTrigger = (SwipeTrigger) next;
                        if (swipeTrigger.mo31530p3() == 0 && this.f14584f == null) {
                            this.f14584f = new C8166c(this, 0);
                        }
                        if (swipeTrigger.mo31530p3() == 1 && this.f14585g == null) {
                            this.f14585g = new C8166c(this, 1);
                        }
                    }
                }
            }
            return 1;
        }
        C4878b.m18868g("Swipe Trigger setup failed - needs can draw overlays permission");
        return 2;
    }
}
