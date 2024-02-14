package com.arlosoft.macrodroid.action;

import com.arlosoft.macrodroid.action.UpdateClipboardAction;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Stack;

/* renamed from: com.arlosoft.macrodroid.action.vp */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3554vp implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ UpdateClipboardAction f9447a;

    /* renamed from: c */
    public final /* synthetic */ int f9448c;

    /* renamed from: d */
    public final /* synthetic */ TriggerContextInfo f9449d;

    /* renamed from: f */
    public final /* synthetic */ boolean f9450f;

    /* renamed from: g */
    public final /* synthetic */ Stack f9451g;

    /* renamed from: o */
    public final /* synthetic */ ResumeMacroInfo f9452o;

    public /* synthetic */ C3554vp(UpdateClipboardAction updateClipboardAction, int i, TriggerContextInfo triggerContextInfo, boolean z, Stack stack, ResumeMacroInfo resumeMacroInfo) {
        this.f9447a = updateClipboardAction;
        this.f9448c = i;
        this.f9449d = triggerContextInfo;
        this.f9450f = z;
        this.f9451g = stack;
        this.f9452o = resumeMacroInfo;
    }

    public final void run() {
        UpdateClipboardAction.C2776c.m13682p(this.f9447a, this.f9448c, this.f9449d, this.f9450f, this.f9451g, this.f9452o);
    }
}
