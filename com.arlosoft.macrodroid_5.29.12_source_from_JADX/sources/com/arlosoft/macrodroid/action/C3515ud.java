package com.arlosoft.macrodroid.action;

import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Stack;

/* renamed from: com.arlosoft.macrodroid.action.ud */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3515ud implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ PlaySoundAction f9356a;

    /* renamed from: c */
    public final /* synthetic */ int f9357c;

    /* renamed from: d */
    public final /* synthetic */ TriggerContextInfo f9358d;

    /* renamed from: f */
    public final /* synthetic */ boolean f9359f;

    /* renamed from: g */
    public final /* synthetic */ Stack f9360g;

    /* renamed from: o */
    public final /* synthetic */ ResumeMacroInfo f9361o;

    public /* synthetic */ C3515ud(PlaySoundAction playSoundAction, int i, TriggerContextInfo triggerContextInfo, boolean z, Stack stack, ResumeMacroInfo resumeMacroInfo) {
        this.f9356a = playSoundAction;
        this.f9357c = i;
        this.f9358d = triggerContextInfo;
        this.f9359f = z;
        this.f9360g = stack;
        this.f9361o = resumeMacroInfo;
    }

    public final void run() {
        this.f9356a.m11848A3(this.f9357c, this.f9358d, this.f9359f, this.f9360g, this.f9361o);
    }
}
