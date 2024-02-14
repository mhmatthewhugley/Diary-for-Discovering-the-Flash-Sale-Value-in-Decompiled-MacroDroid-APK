package com.arlosoft.macrodroid.action;

import com.arlosoft.macrodroid.action.ShellScriptAction;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Stack;

/* renamed from: com.arlosoft.macrodroid.action.tk */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3495tk implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ShellScriptAction f9298a;

    /* renamed from: c */
    public final /* synthetic */ boolean f9299c;

    /* renamed from: d */
    public final /* synthetic */ int f9300d;

    /* renamed from: f */
    public final /* synthetic */ TriggerContextInfo f9301f;

    /* renamed from: g */
    public final /* synthetic */ boolean f9302g;

    /* renamed from: o */
    public final /* synthetic */ Stack f9303o;

    /* renamed from: p */
    public final /* synthetic */ ResumeMacroInfo f9304p;

    public /* synthetic */ C3495tk(ShellScriptAction shellScriptAction, boolean z, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack stack, ResumeMacroInfo resumeMacroInfo) {
        this.f9298a = shellScriptAction;
        this.f9299c = z;
        this.f9300d = i;
        this.f9301f = triggerContextInfo;
        this.f9302g = z2;
        this.f9303o = stack;
        this.f9304p = resumeMacroInfo;
    }

    public final void run() {
        ShellScriptAction.C2686e.m13046s(this.f9298a, this.f9299c, this.f9300d, this.f9301f, this.f9302g, this.f9303o, this.f9304p);
    }
}
