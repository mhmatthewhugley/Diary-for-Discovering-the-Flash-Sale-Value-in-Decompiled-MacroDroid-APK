package com.arlosoft.macrodroid.triggers.services;

import android.content.Intent;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.AndroidWearTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.utils.C6375e;
import com.arlosoft.macrodroid.wizard.WizardActivity;
import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.WearableListenerService;
import java.util.ArrayList;
import java.util.Iterator;
import p319lc.C15626c;

public class DataLayerListenerService extends WearableListenerService {
    /* renamed from: A */
    private void m24095A(String str) {
        ArrayList arrayList = new ArrayList();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if ((next2 instanceof AndroidWearTrigger) && ((AndroidWearTrigger) next2).mo30904i3() == 0 && next.getName().equals(str) && next2.mo31374R2()) {
                    if (next.canInvoke(next.getTriggerContextInfo())) {
                        arrayList.add(next);
                        next.setTriggerThatInvoked(next2);
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Macro macro = (Macro) it2.next();
            macro.invokeActions(macro.getTriggerContextInfo());
        }
    }

    /* renamed from: y */
    private void m24096y() {
        int f0 = C5163j2.m20151f0(this);
        if (MacroDroidApplication.m14845u().f9902p.mo28009e().mo28008a() || C4934n.m18998M().mo29710z().size() < f0) {
            Intent intent = new Intent(this, WizardActivity.class);
            intent.putExtra("add_wear_trigger", true);
            intent.addFlags(268435456);
            startActivity(intent);
            return;
        }
        C15626c.makeText(MacroDroidApplication.m14845u(), C17541R$string.macro_limit_reached, 1).show();
    }

    /* renamed from: z */
    private void m24097z(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if (next2 instanceof AndroidWearTrigger) {
                    AndroidWearTrigger androidWearTrigger = (AndroidWearTrigger) next2;
                    if (((androidWearTrigger.mo30904i3() == 1 && z) || (androidWearTrigger.mo30904i3() == 2 && !z)) && next2.mo31374R2()) {
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
    }

    /* renamed from: g */
    public void mo24754g(MessageEvent messageEvent) {
        StringBuilder sb = new StringBuilder();
        sb.append("onMessageReceived: ");
        sb.append(messageEvent);
        String path = messageEvent.getPath();
        if (path.startsWith("/macrodroid/invoke-android-wear-macro")) {
            m24095A(path.substring(path.lastIndexOf("/") + 1));
        } else if (path.startsWith("/macrodroid/add-new-macro")) {
            m24096y();
        } else if (path.startsWith("/macrodroid/request-macro-list")) {
            C6375e.m24619c(this, true);
        }
    }

    /* renamed from: q */
    public void mo32012q(Node node) {
        super.mo32012q(node);
        String id = node.getId();
        String p0 = node.mo56222p0();
        StringBuilder sb = new StringBuilder();
        sb.append("Connected peer name & ID: ");
        sb.append(p0);
        sb.append("|");
        sb.append(id);
        m24097z(true);
    }

    /* renamed from: r */
    public void mo32013r(Node node) {
        String id = node.getId();
        String p0 = node.mo56222p0();
        StringBuilder sb = new StringBuilder();
        sb.append("Disconnected peer name & ID: ");
        sb.append(p0);
        sb.append("|");
        sb.append(id);
        m24097z(false);
    }
}
