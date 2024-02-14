package com.arlosoft.macrodroid.action;

import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Stack;

/* renamed from: com.arlosoft.macrodroid.action.n8 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3277n8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocalePluginAction f8749a;

    /* renamed from: c */
    public final /* synthetic */ int f8750c;

    /* renamed from: d */
    public final /* synthetic */ TriggerContextInfo f8751d;

    /* renamed from: f */
    public final /* synthetic */ boolean f8752f;

    /* renamed from: g */
    public final /* synthetic */ Stack f8753g;

    /* renamed from: o */
    public final /* synthetic */ ResumeMacroInfo f8754o;

    public /* synthetic */ C3277n8(LocalePluginAction localePluginAction, int i, TriggerContextInfo triggerContextInfo, boolean z, Stack stack, ResumeMacroInfo resumeMacroInfo) {
        this.f8749a = localePluginAction;
        this.f8750c = i;
        this.f8751d = triggerContextInfo;
        this.f8752f = z;
        this.f8753g = stack;
        this.f8754o = resumeMacroInfo;
    }

    public final void run() {
        this.f8749a.m11265E3(this.f8750c, this.f8751d, this.f8752f, this.f8753g, this.f8754o);
    }
}
