package com.arlosoft.macrodroid.triggers.activities;

import android.os.Bundle;
import com.arlosoft.macrodroid.common.NonAppActivity;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.MediaButtonPressedTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;

public class MediaButtonLongPressActivity extends NonAppActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList arrayList = new ArrayList();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if ((next2 instanceof MediaButtonPressedTrigger) && ((MediaButtonPressedTrigger) next2).mo31320n3().equals(MediaButtonPressedTrigger.f13647o) && next2.mo31374R2()) {
                    next.setTriggerThatInvoked(next2);
                    if (next.canInvoke(next.getTriggerContextInfo())) {
                        arrayList.add(next);
                        break;
                    }
                }
            }
        }
        if (arrayList.size() > 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Macro macro = (Macro) it2.next();
                macro.invokeActions(macro.getTriggerContextInfo());
            }
        }
        finish();
    }
}
