package com.arlosoft.macrodroid.voiceservice;

import android.speech.RecognitionService;
import com.arlosoft.macrodroid.voiceservice.RecognitionServiceTrampoline;

/* renamed from: com.arlosoft.macrodroid.voiceservice.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6620b implements RecognitionServiceTrampoline.C6618b {

    /* renamed from: a */
    public final /* synthetic */ RecognitionService.Callback f15363a;

    public /* synthetic */ C6620b(RecognitionService.Callback callback) {
        this.f15363a = callback;
    }

    public final void run() {
        this.f15363a.endOfSpeech();
    }
}
