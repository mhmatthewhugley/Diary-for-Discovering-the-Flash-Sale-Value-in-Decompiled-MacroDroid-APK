package com.arlosoft.macrodroid.triggers.services;

import android.accessibilityservice.AccessibilityService;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.VolumeButtonTrigger;
import java.util.ArrayList;
import java.util.Iterator;

public class VolumeButtonAccessibilityService extends AccessibilityService {

    /* renamed from: d */
    public static boolean f14555d = false;

    /* renamed from: a */
    private boolean f14556a = false;

    /* renamed from: c */
    private boolean f14557c = false;

    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    public void onDestroy() {
        C4878b.m18879r("Volume Button Accessibility Service Destroyed");
        f14555d = false;
        super.onDestroy();
    }

    public void onInterrupt() {
    }

    /* access modifiers changed from: protected */
    public boolean onKeyEvent(KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (keyEvent.getKeyCode() == 25) {
            z2 = false;
            z = true;
        } else {
            z2 = keyEvent.getKeyCode() == 24;
            z = false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 25 || keyEvent.getKeyCode() == 24) {
                for (Macro next : C4934n.m18998M().mo29679I()) {
                    Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Trigger next2 = it.next();
                            if ((next2 instanceof VolumeButtonTrigger) && next2.mo31374R2()) {
                                VolumeButtonTrigger volumeButtonTrigger = (VolumeButtonTrigger) next2;
                                if (volumeButtonTrigger.mo31592r3() == 0 && ((volumeButtonTrigger.mo31595x3() && z2) || (!volumeButtonTrigger.mo31595x3() && z))) {
                                    next.setTriggerThatInvoked(next2);
                                    if (next.canInvoke(next.getTriggerContextInfo()) && volumeButtonTrigger.mo31593v3()) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.f14556a = keyEvent.getKeyCode() == 25;
            if (keyEvent.getKeyCode() != 24) {
                z3 = false;
            }
            this.f14557c = z3;
        } else if (keyEvent.getAction() == 1 && (keyEvent.getKeyCode() == 25 || keyEvent.getKeyCode() == 24)) {
            boolean z4 = keyEvent.getEventTime() - keyEvent.getDownTime() > 300;
            ArrayList arrayList = new ArrayList();
            boolean z5 = false;
            for (Macro next3 : C4934n.m18998M().mo29679I()) {
                Iterator<Trigger> it2 = next3.getTriggerListWithAwaitingActions().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Trigger next4 = it2.next();
                    if ((next4 instanceof VolumeButtonTrigger) && next4.mo31374R2()) {
                        VolumeButtonTrigger volumeButtonTrigger2 = (VolumeButtonTrigger) next4;
                        if (volumeButtonTrigger2.mo31592r3() == 0 && (((volumeButtonTrigger2.mo31595x3() && z2) || (!volumeButtonTrigger2.mo31595x3() && z)) && volumeButtonTrigger2.mo31594w3() == z4)) {
                            next3.setTriggerThatInvoked(next4);
                            if (next3.canInvoke(next3.getTriggerContextInfo())) {
                                arrayList.add(next3);
                                z5 = true;
                                break;
                            }
                        }
                    }
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Macro macro = (Macro) it3.next();
                macro.invokeActions(macro.getTriggerContextInfo());
            }
            if (!z5) {
                AudioManager audioManager = (AudioManager) getSystemService("audio");
                if (keyEvent.getKeyCode() == 25) {
                    if (!this.f14556a) {
                        audioManager.adjustVolume(-1, 1);
                    }
                    this.f14556a = false;
                } else if (keyEvent.getKeyCode() == 24) {
                    if (!this.f14557c) {
                        audioManager.adjustVolume(1, 1);
                    }
                    this.f14557c = false;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onServiceConnected() {
        C4878b.m18879r("Volume Button Accessibility Service Connected");
        f14555d = true;
    }
}
