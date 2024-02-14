package com.arlosoft.macrodroid.triggers.services;

import android.media.AudioManager;
import android.os.Build;
import android.view.KeyEvent;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.events.ListenForVolumeLongPressEvent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.VolumeLongPressTrigger;
import java.util.ArrayList;
import java.util.Iterator;
import p145p3.C8060a;
import p161s1.C10180a;

public class NotificationServiceOreo extends NotificationService implements C8060a.C8062b {

    /* renamed from: B */
    private long f14523B = 2000;

    /* renamed from: C */
    private long f14524C = 0;

    /* renamed from: D */
    private boolean f14525D = false;

    /* renamed from: E */
    private C8060a f14526E;

    /* renamed from: a */
    public void mo32079a(KeyEvent keyEvent) {
        long currentTimeMillis = System.currentTimeMillis();
        int flags = keyEvent.getFlags();
        if (flags != 8 && flags != 128) {
            return;
        }
        if (currentTimeMillis - this.f14524C >= this.f14523B || !this.f14525D) {
            this.f14524C = currentTimeMillis;
            ArrayList arrayList = new ArrayList();
            for (Macro next : C4934n.m18998M().mo29679I()) {
                Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Trigger next2 = it.next();
                    if ((next2 instanceof VolumeLongPressTrigger) && next2.mo27822G1()) {
                        if ((keyEvent.getKeyCode() == 24) == (((VolumeLongPressTrigger) next2).mo31600h3() == 0) && next2.mo31374R2()) {
                            next.setTriggerThatInvoked(next2);
                            if (next.canInvoke(next.getTriggerContextInfo())) {
                                arrayList.add(next);
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
            if (arrayList.size() == 0) {
                AudioManager audioManager = (AudioManager) getSystemService("audio");
                if (keyEvent.getKeyCode() == 25) {
                    audioManager.adjustVolume(-1, 1);
                } else if (keyEvent.getKeyCode() == 24) {
                    audioManager.adjustVolume(1, 1);
                }
                this.f14525D = false;
                return;
            }
            this.f14525D = true;
        }
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26 && ContextCompat.checkSelfPermission(this, "android.permission.SET_VOLUME_KEY_LONG_PRESS_LISTENER") == 0) {
            this.f14526E = new C8060a(this, this);
        }
        C10180a.m40075a().mo80019m(this);
    }

    public void onDestroy() {
        try {
            C10180a.m40075a().mo80020p(this);
        } catch (Exception unused) {
        }
        super.onDestroy();
    }

    public void onEventMainThread(ListenForVolumeLongPressEvent listenForVolumeLongPressEvent) {
        if (Build.VERSION.SDK_INT >= 26 && ContextCompat.checkSelfPermission(this, "android.permission.SET_VOLUME_KEY_LONG_PRESS_LISTENER") == 0) {
            if (this.f14526E == null) {
                C4878b.m18879r("Creating new Media Session Manager Wrapper");
                this.f14526E = new C8060a(this, this);
                return;
            }
            C4878b.m18879r("Media Session Manager Wrapper already exists");
        }
    }
}
