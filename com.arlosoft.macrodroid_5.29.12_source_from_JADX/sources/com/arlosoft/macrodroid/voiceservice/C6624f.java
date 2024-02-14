package com.arlosoft.macrodroid.voiceservice;

import android.os.Bundle;
import android.speech.RecognitionService;
import com.arlosoft.macrodroid.voiceservice.RecognitionServiceTrampoline;

/* renamed from: com.arlosoft.macrodroid.voiceservice.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6624f implements RecognitionServiceTrampoline.C6618b {

    /* renamed from: a */
    public final /* synthetic */ RecognitionService.Callback f15370a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f15371b;

    public /* synthetic */ C6624f(RecognitionService.Callback callback, Bundle bundle) {
        this.f15370a = callback;
        this.f15371b = bundle;
    }

    public final void run() {
        this.f15370a.partialResults(this.f15371b);
    }
}
