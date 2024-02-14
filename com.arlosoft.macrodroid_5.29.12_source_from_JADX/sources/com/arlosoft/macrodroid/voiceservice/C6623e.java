package com.arlosoft.macrodroid.voiceservice;

import android.os.Bundle;
import android.speech.RecognitionService;
import com.arlosoft.macrodroid.voiceservice.RecognitionServiceTrampoline;

/* renamed from: com.arlosoft.macrodroid.voiceservice.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6623e implements RecognitionServiceTrampoline.C6618b {

    /* renamed from: a */
    public final /* synthetic */ RecognitionService.Callback f15368a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f15369b;

    public /* synthetic */ C6623e(RecognitionService.Callback callback, Bundle bundle) {
        this.f15368a = callback;
        this.f15369b = bundle;
    }

    public final void run() {
        this.f15368a.results(this.f15369b);
    }
}
