package com.arlosoft.macrodroid.voiceservice;

import android.speech.RecognitionService;
import com.arlosoft.macrodroid.voiceservice.RecognitionServiceTrampoline;

/* renamed from: com.arlosoft.macrodroid.voiceservice.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6622d implements RecognitionServiceTrampoline.C6618b {

    /* renamed from: a */
    public final /* synthetic */ RecognitionService.Callback f15366a;

    /* renamed from: b */
    public final /* synthetic */ int f15367b;

    public /* synthetic */ C6622d(RecognitionService.Callback callback, int i) {
        this.f15366a = callback;
        this.f15367b = i;
    }

    public final void run() {
        this.f15366a.error(this.f15367b);
    }
}
