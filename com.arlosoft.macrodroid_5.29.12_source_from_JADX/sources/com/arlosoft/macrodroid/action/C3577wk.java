package com.arlosoft.macrodroid.action;

import com.arlosoft.macrodroid.action.ShellScriptAction;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Stack;

/* renamed from: com.arlosoft.macrodroid.action.wk */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3577wk implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ShellScriptAction f9501a;

    /* renamed from: c */
    public final /* synthetic */ boolean f9502c;

    /* renamed from: d */
    public final /* synthetic */ int f9503d;

    /* renamed from: f */
    public final /* synthetic */ TriggerContextInfo f9504f;

    /* renamed from: g */
    public final /* synthetic */ boolean f9505g;

    /* renamed from: o */
    public final /* synthetic */ Stack f9506o;

    /* renamed from: p */
    public final /* synthetic */ ResumeMacroInfo f9507p;

    public /* synthetic */ C3577wk(ShellScriptAction shellScriptAction, boolean z, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack stack, ResumeMacroInfo resumeMacroInfo) {
        this.f9501a = shellScriptAction;
        this.f9502c = z;
        this.f9503d = i;
        this.f9504f = triggerContextInfo;
        this.f9505g = z2;
        this.f9506o = stack;
        this.f9507p = resumeMacroInfo;
    }

    public final void run() {
        ShellScriptAction.C2687f.C2688a.C2689a.m13054e(this.f9501a, this.f9502c, this.f9503d, this.f9504f, this.f9505g, this.f9506o, this.f9507p);
    }
}
