package com.arlosoft.macrodroid.action;

import android.media.AudioManager;
import android.speech.tts.TextToSpeech;

/* renamed from: com.arlosoft.macrodroid.action.ye */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3625ye implements TextToSpeech.OnUtteranceCompletedListener {

    /* renamed from: a */
    public final /* synthetic */ AudioManager f9629a;

    public /* synthetic */ C3625ye(AudioManager audioManager) {
        this.f9629a = audioManager;
    }

    public final void onUtteranceCompleted(String str) {
        this.f9629a.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
    }
}
