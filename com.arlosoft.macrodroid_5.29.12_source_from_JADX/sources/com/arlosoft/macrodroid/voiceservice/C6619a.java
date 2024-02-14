package com.arlosoft.macrodroid.voiceservice;

import android.speech.RecognitionService;
import com.arlosoft.macrodroid.voiceservice.RecognitionServiceTrampoline;

/* renamed from: com.arlosoft.macrodroid.voiceservice.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6619a implements RecognitionServiceTrampoline.C6618b {

    /* renamed from: a */
    public final /* synthetic */ RecognitionService.Callback f15362a;

    public /* synthetic */ C6619a(RecognitionService.Callback callback) {
        this.f15362a = callback;
    }

    public final void run() {
        this.f15362a.beginningOfSpeech();
    }
}
