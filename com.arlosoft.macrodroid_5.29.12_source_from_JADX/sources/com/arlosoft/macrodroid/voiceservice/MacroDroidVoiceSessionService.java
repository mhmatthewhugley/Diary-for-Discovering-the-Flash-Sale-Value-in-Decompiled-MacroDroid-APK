package com.arlosoft.macrodroid.voiceservice;

import android.os.Bundle;
import android.service.voice.VoiceInteractionSessionService;
import p066c4.C2270a;

/* compiled from: MacroDroidVoiceSessionService.kt */
public final class MacroDroidVoiceSessionService extends VoiceInteractionSessionService {
    /* renamed from: a */
    public C2270a onNewSession(Bundle bundle) {
        return new C2270a(this);
    }
}
