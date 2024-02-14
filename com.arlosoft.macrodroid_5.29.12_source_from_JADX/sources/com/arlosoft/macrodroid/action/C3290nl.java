package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.speech.tts.TextToSpeech;
import android.widget.Spinner;

/* renamed from: com.arlosoft.macrodroid.action.nl */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3290nl implements TextToSpeech.OnInitListener {

    /* renamed from: a */
    public final /* synthetic */ SpeakTextAction f8794a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8795c;

    /* renamed from: d */
    public final /* synthetic */ Spinner f8796d;

    public /* synthetic */ C3290nl(SpeakTextAction speakTextAction, Activity activity, Spinner spinner) {
        this.f8794a = speakTextAction;
        this.f8795c = activity;
        this.f8796d = spinner;
    }

    public final void onInit(int i) {
        this.f8794a.m13087R3(this.f8795c, this.f8796d, i);
    }
}
