package com.arlosoft.macrodroid.action;

import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Stack;

/* renamed from: com.arlosoft.macrodroid.action.gl */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3094gl implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SpeakTextAction f8386a;

    /* renamed from: c */
    public final /* synthetic */ int f8387c;

    /* renamed from: d */
    public final /* synthetic */ TriggerContextInfo f8388d;

    /* renamed from: f */
    public final /* synthetic */ boolean f8389f;

    /* renamed from: g */
    public final /* synthetic */ Stack f8390g;

    /* renamed from: o */
    public final /* synthetic */ ResumeMacroInfo f8391o;

    public /* synthetic */ C3094gl(SpeakTextAction speakTextAction, int i, TriggerContextInfo triggerContextInfo, boolean z, Stack stack, ResumeMacroInfo resumeMacroInfo) {
        this.f8386a = speakTextAction;
        this.f8387c = i;
        this.f8388d = triggerContextInfo;
        this.f8389f = z;
        this.f8390g = stack;
        this.f8391o = resumeMacroInfo;
    }

    public final void run() {
        this.f8386a.m13101f4(this.f8387c, this.f8388d, this.f8389f, this.f8390g, this.f8391o);
    }
}
