package com.arlosoft.macrodroid.action;

import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Stack;

/* renamed from: com.arlosoft.macrodroid.action.tb */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3477tb implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ OpenWebPageAction f9267a;

    /* renamed from: c */
    public final /* synthetic */ boolean f9268c;

    /* renamed from: d */
    public final /* synthetic */ int f9269d;

    /* renamed from: f */
    public final /* synthetic */ TriggerContextInfo f9270f;

    /* renamed from: g */
    public final /* synthetic */ boolean f9271g;

    /* renamed from: o */
    public final /* synthetic */ Stack f9272o;

    /* renamed from: p */
    public final /* synthetic */ ResumeMacroInfo f9273p;

    public /* synthetic */ C3477tb(OpenWebPageAction openWebPageAction, boolean z, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack stack, ResumeMacroInfo resumeMacroInfo) {
        this.f9267a = openWebPageAction;
        this.f9268c = z;
        this.f9269d = i;
        this.f9270f = triggerContextInfo;
        this.f9271g = z2;
        this.f9272o = stack;
        this.f9273p = resumeMacroInfo;
    }

    public final void run() {
        this.f9267a.m11691E3(this.f9268c, this.f9269d, this.f9270f, this.f9271g, this.f9272o, this.f9273p);
    }
}
