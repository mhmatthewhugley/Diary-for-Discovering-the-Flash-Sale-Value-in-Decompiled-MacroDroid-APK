package com.arlosoft.macrodroid.voiceservice;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.service.voice.VoiceInteractionService;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C13695i;

@RequiresApi(23)
/* compiled from: MacroDroidVoiceService.kt */
public final class MacroDroidVoiceService extends VoiceInteractionService {

    /* renamed from: c */
    public static final C6616a f15356c = new C6616a((C13695i) null);

    /* renamed from: a */
    private final BroadcastReceiver f15357a = new MacroDroidVoiceService$broadcastReceiver$1(this);

    /* renamed from: com.arlosoft.macrodroid.voiceservice.MacroDroidVoiceService$a */
    /* compiled from: MacroDroidVoiceService.kt */
    public static final class C6616a {
        private C6616a() {
        }

        public /* synthetic */ C6616a(C13695i iVar) {
            this();
        }
    }

    public void onReady() {
        super.onReady();
        registerReceiver(this.f15357a, new IntentFilter("com.arlosoft.macrodropid.action.ASSISTANT"));
    }

    public void onShutdown() {
        try {
            unregisterReceiver(this.f15357a);
        } catch (Exception unused) {
        }
        super.onShutdown();
    }
}
