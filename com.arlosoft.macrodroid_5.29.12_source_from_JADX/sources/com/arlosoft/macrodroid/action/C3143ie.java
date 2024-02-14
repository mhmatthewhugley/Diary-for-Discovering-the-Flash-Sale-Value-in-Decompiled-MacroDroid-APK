package com.arlosoft.macrodroid.action;

import com.arlosoft.macrodroid.action.ReadScreenContentsAction;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Stack;

/* renamed from: com.arlosoft.macrodroid.action.ie */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3143ie implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ReadScreenContentsAction f8487a;

    /* renamed from: c */
    public final /* synthetic */ boolean f8488c;

    /* renamed from: d */
    public final /* synthetic */ int f8489d;

    /* renamed from: f */
    public final /* synthetic */ TriggerContextInfo f8490f;

    /* renamed from: g */
    public final /* synthetic */ boolean f8491g;

    /* renamed from: o */
    public final /* synthetic */ Stack f8492o;

    /* renamed from: p */
    public final /* synthetic */ ResumeMacroInfo f8493p;

    public /* synthetic */ C3143ie(ReadScreenContentsAction readScreenContentsAction, boolean z, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack stack, ResumeMacroInfo resumeMacroInfo) {
        this.f8487a = readScreenContentsAction;
        this.f8488c = z;
        this.f8489d = i;
        this.f8490f = triggerContextInfo;
        this.f8491g = z2;
        this.f8492o = stack;
        this.f8493p = resumeMacroInfo;
    }

    public final void run() {
        ReadScreenContentsAction.C2596e.m11985p(this.f8487a, this.f8488c, this.f8489d, this.f8490f, this.f8491g, this.f8492o, this.f8493p);
    }
}
