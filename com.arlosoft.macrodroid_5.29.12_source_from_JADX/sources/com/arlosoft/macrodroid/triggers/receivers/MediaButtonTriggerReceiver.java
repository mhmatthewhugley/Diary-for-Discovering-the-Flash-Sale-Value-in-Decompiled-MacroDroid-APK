package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.MediaButtonPressedTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p148q0.C8151a;

public class MediaButtonTriggerReceiver extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static long f14361a;

    /* renamed from: b */
    private static final ScheduledExecutorService f14362b = Executors.newScheduledThreadPool(1);

    /* renamed from: c */
    private static ScheduledFuture f14363c;

    /* renamed from: com.arlosoft.macrodroid.triggers.receivers.MediaButtonTriggerReceiver$a */
    private static class C6072a implements Runnable {

        /* renamed from: a */
        private final Context f14364a;

        C6072a(@NonNull Context context) {
            this.f14364a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static /* synthetic */ void m24036b(ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Macro macro = (Macro) it.next();
                macro.invokeActions(macro.getTriggerContextInfo());
            }
        }

        public void run() {
            ArrayList arrayList = new ArrayList();
            for (Macro next : C4934n.m18998M().mo29679I()) {
                Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Trigger next2 = it.next();
                    if (next2 instanceof MediaButtonPressedTrigger) {
                        MediaButtonPressedTrigger mediaButtonPressedTrigger = (MediaButtonPressedTrigger) next2;
                        if (((mediaButtonPressedTrigger.mo31320n3().equals(MediaButtonPressedTrigger.f13646g) && MediaButtonTriggerReceiver.f14361a == 3) || ((mediaButtonPressedTrigger.mo31320n3().equals(MediaButtonPressedTrigger.f13645f) && MediaButtonTriggerReceiver.f14361a == 2) || (mediaButtonPressedTrigger.mo31320n3().equals(MediaButtonPressedTrigger.f13644d) && MediaButtonTriggerReceiver.f14361a == 1))) && next2.mo31374R2()) {
                            next.setTriggerThatInvoked(next2);
                            if (next.canInvoke(next.getTriggerContextInfo())) {
                                arrayList.add(next);
                                break;
                            }
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                new Handler(this.f14364a.getMainLooper()).post(new C6079a(arrayList));
            }
            long unused = MediaButtonTriggerReceiver.f14361a = 0;
        }
    }

    /* renamed from: c */
    private void m24034c(Context context, Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (!intent.getBooleanExtra("MediaButtonMacroDroid", false) && keyEvent != null) {
            int keyCode = keyEvent.getKeyCode();
            int action = keyEvent.getAction();
            if (keyCode == 79 && action == 0) {
                f14361a++;
                ScheduledFuture scheduledFuture = f14363c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                if (f14361a < 3) {
                    f14363c = f14362b.schedule(new C6072a(context), 620, TimeUnit.MILLISECONDS);
                } else {
                    f14363c = f14362b.schedule(new C6072a(context), 0, TimeUnit.SECONDS);
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.MEDIA_BUTTON")) {
            m24034c(context, intent);
            return;
        }
        C8151a.m33873n(new RuntimeException("MediaButtonTriggerReceiver: Unexpected action: " + intent.getAction()));
    }
}
