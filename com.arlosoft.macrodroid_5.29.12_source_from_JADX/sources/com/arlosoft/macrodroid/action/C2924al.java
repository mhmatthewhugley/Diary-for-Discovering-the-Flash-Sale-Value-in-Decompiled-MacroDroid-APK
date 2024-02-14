package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;

/* renamed from: com.arlosoft.macrodroid.action.al */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2924al implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SpeakTextAction f8002a;

    /* renamed from: c */
    public final /* synthetic */ EditText f8003c;

    /* renamed from: d */
    public final /* synthetic */ SeekBar f8004d;

    /* renamed from: f */
    public final /* synthetic */ SeekBar f8005f;

    /* renamed from: g */
    public final /* synthetic */ Spinner f8006g;

    /* renamed from: o */
    public final /* synthetic */ int[] f8007o;

    public /* synthetic */ C2924al(SpeakTextAction speakTextAction, EditText editText, SeekBar seekBar, SeekBar seekBar2, Spinner spinner, int[] iArr) {
        this.f8002a = speakTextAction;
        this.f8003c = editText;
        this.f8004d = seekBar;
        this.f8005f = seekBar2;
        this.f8006g = spinner;
        this.f8007o = iArr;
    }

    public final void onClick(View view) {
        this.f8002a.m13095Z3(this.f8003c, this.f8004d, this.f8005f, this.f8006g, this.f8007o, view);
    }
}
