package com.arlosoft.macrodroid.action;

import com.arlosoft.macrodroid.action.ShellScriptAction;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Stack;

/* renamed from: com.arlosoft.macrodroid.action.uk */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3522uk implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ShellScriptAction f9371a;

    /* renamed from: c */
    public final /* synthetic */ boolean f9372c;

    /* renamed from: d */
    public final /* synthetic */ int f9373d;

    /* renamed from: f */
    public final /* synthetic */ TriggerContextInfo f9374f;

    /* renamed from: g */
    public final /* synthetic */ boolean f9375g;

    /* renamed from: o */
    public final /* synthetic */ Stack f9376o;

    /* renamed from: p */
    public final /* synthetic */ ResumeMacroInfo f9377p;

    public /* synthetic */ C3522uk(ShellScriptAction shellScriptAction, boolean z, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack stack, ResumeMacroInfo resumeMacroInfo) {
        this.f9371a = shellScriptAction;
        this.f9372c = z;
        this.f9373d = i;
        this.f9374f = triggerContextInfo;
        this.f9375g = z2;
        this.f9376o = stack;
        this.f9377p = resumeMacroInfo;
    }

    public final void run() {
        ShellScriptAction.C2686e.m13047t(this.f9371a, this.f9372c, this.f9373d, this.f9374f, this.f9375g, this.f9376o, this.f9377p);
    }
}
