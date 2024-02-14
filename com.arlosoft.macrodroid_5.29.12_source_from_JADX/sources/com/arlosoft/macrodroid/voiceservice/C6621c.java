package com.arlosoft.macrodroid.voiceservice;

import android.speech.RecognitionService;
import com.arlosoft.macrodroid.voiceservice.RecognitionServiceTrampoline;

/* renamed from: com.arlosoft.macrodroid.voiceservice.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6621c implements RecognitionServiceTrampoline.C6618b {

    /* renamed from: a */
    public final /* synthetic */ RecognitionService.Callback f15364a;

    /* renamed from: b */
    public final /* synthetic */ float f15365b;

    public /* synthetic */ C6621c(RecognitionService.Callback callback, float f) {
        this.f15364a = callback;
        this.f15365b = f;
    }

    public final void run() {
        this.f15364a.rmsChanged(this.f15365b);
    }
}
