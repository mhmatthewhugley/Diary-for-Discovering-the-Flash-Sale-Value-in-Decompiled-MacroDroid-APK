package p066c4;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import androidx.annotation.RequiresApi;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.HomeButtonLongPressTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C13706o;

@RequiresApi(23)
/* renamed from: c4.a */
/* compiled from: MacroDroidVoiceSession.kt */
public final class C2270a extends VoiceInteractionSession {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2270a(Context context) {
        super(context);
        C13706o.m87929f(context, "context");
    }

    public void onHandleAssist(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent) {
        super.onHandleAssist(bundle, assistStructure, assistContent);
        ArrayList arrayList = new ArrayList();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if ((next2 instanceof HomeButtonLongPressTrigger) && next2.mo31374R2()) {
                    next.setTriggerThatInvoked(next2);
                    if (next.canInvoke(next.getTriggerContextInfo())) {
                        arrayList.add(next);
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

    public void onPrepareShow(Bundle bundle, int i) {
        super.onPrepareShow(bundle, i);
        if (bundle == null) {
            C4878b.m18868g("Voice session failed - the bundle was null");
            return;
        }
        try {
            String string = bundle.getString("ACTION");
            if (string == null) {
                string = "";
            }
            if (C13706o.m87924a(string, "android.settings.VOICE_CONTROL_AIRPLANE_MODE")) {
                Intent intent = new Intent("android.settings.VOICE_CONTROL_AIRPLANE_MODE");
                intent.putExtra("airplane_mode_enabled", bundle.getBoolean("airplane_mode_enabled"));
                startVoiceActivity(intent);
            }
            if (C13706o.m87924a(string, "android.settings.VOICE_CONTROL_DO_NOT_DISTURB_MODE")) {
                Intent intent2 = new Intent("android.settings.VOICE_CONTROL_DO_NOT_DISTURB_MODE");
                intent2.putExtra("android.settings.extra.do_not_disturb_mode_enabled", bundle.getBoolean("android.settings.extra.do_not_disturb_mode_enabled"));
                intent2.putExtra("android.settings.extra.do_not_disturb_mode_minutes", bundle.getInt("android.settings.extra.do_not_disturb_mode_minutes"));
                startVoiceActivity(intent2);
            }
            if (C13706o.m87924a(string, "android.settings.VOICE_CONTROL_BATTERY_SAVER_MODE")) {
                Intent intent3 = new Intent("android.settings.VOICE_CONTROL_BATTERY_SAVER_MODE");
                intent3.putExtra("android.settings.extra.battery_saver_mode_enabled", bundle.getBoolean("android.settings.extra.battery_saver_mode_enabled"));
                startVoiceActivity(intent3);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                setUiEnabled(false);
            }
        } catch (Exception e) {
            C4878b.m18868g("Command failed: " + e);
        }
    }
}
