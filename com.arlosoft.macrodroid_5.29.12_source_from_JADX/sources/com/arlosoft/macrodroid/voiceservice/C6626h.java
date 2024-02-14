package com.arlosoft.macrodroid.voiceservice;

import android.speech.RecognitionService;
import com.arlosoft.macrodroid.voiceservice.RecognitionServiceTrampoline;

/* renamed from: com.arlosoft.macrodroid.voiceservice.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6626h implements RecognitionServiceTrampoline.C6618b {

    /* renamed from: a */
    public final /* synthetic */ RecognitionService.Callback f15374a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f15375b;

    public /* synthetic */ C6626h(RecognitionService.Callback callback, byte[] bArr) {
        this.f15374a = callback;
        this.f15375b = bArr;
    }

    public final void run() {
        this.f15374a.bufferReceived(this.f15375b);
    }
}
