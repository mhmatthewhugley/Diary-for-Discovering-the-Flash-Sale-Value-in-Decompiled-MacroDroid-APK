package com.arlosoft.macrodroid.settings;

import android.speech.tts.TextToSpeech;
import androidx.preference.ListPreference;

/* renamed from: com.arlosoft.macrodroid.settings.a2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5119a2 implements TextToSpeech.OnInitListener {

    /* renamed from: a */
    public final /* synthetic */ C5141f2 f12857a;

    /* renamed from: c */
    public final /* synthetic */ ListPreference f12858c;

    public /* synthetic */ C5119a2(C5141f2 f2Var, ListPreference listPreference) {
        this.f12857a = f2Var;
        this.f12858c = listPreference;
    }

    public final void onInit(int i) {
        this.f12857a.m19831N1(this.f12858c, i);
    }
}
