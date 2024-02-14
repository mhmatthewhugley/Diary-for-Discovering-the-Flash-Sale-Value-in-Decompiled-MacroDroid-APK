package com.arlosoft.macrodroid.voiceservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import kotlin.jvm.internal.C13706o;

/* compiled from: MacroDroidVoiceService.kt */
public final class MacroDroidVoiceService$broadcastReceiver$1 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ MacroDroidVoiceService f15358a;

    MacroDroidVoiceService$broadcastReceiver$1(MacroDroidVoiceService macroDroidVoiceService) {
        this.f15358a = macroDroidVoiceService;
    }

    public void onReceive(Context context, Intent intent) {
        C13706o.m87929f(intent, "intent");
        if (C15176v.m93642w(intent.getAction(), "com.arlosoft.macrodropid.action.ASSISTANT", false, 2, (Object) null)) {
            try {
                this.f15358a.showSession(intent.getExtras(), 0);
            } catch (Exception e) {
                C4878b.m18868g("Failed to invoke MacroDroidVoiceService: " + e);
            }
        }
    }
}
