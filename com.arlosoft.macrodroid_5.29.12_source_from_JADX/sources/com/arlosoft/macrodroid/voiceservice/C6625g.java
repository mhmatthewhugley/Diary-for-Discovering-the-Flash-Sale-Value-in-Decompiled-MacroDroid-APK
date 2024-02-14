package com.arlosoft.macrodroid.voiceservice;

import android.os.Bundle;
import android.speech.RecognitionService;
import com.arlosoft.macrodroid.voiceservice.RecognitionServiceTrampoline;

/* renamed from: com.arlosoft.macrodroid.voiceservice.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6625g implements RecognitionServiceTrampoline.C6618b {

    /* renamed from: a */
    public final /* synthetic */ RecognitionService.Callback f15372a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f15373b;

    public /* synthetic */ C6625g(RecognitionService.Callback callback, Bundle bundle) {
        this.f15372a = callback;
        this.f15373b = bundle;
    }

    public final void run() {
        this.f15372a.readyForSpeech(this.f15373b);
    }
}
