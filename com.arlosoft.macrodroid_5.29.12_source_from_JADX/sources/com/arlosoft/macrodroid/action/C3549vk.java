package com.arlosoft.macrodroid.action;

import com.arlosoft.macrodroid.action.ShellScriptAction;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Stack;

/* renamed from: com.arlosoft.macrodroid.action.vk */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3549vk implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ShellScriptAction f9435a;

    /* renamed from: c */
    public final /* synthetic */ boolean f9436c;

    /* renamed from: d */
    public final /* synthetic */ int f9437d;

    /* renamed from: f */
    public final /* synthetic */ TriggerContextInfo f9438f;

    /* renamed from: g */
    public final /* synthetic */ boolean f9439g;

    /* renamed from: o */
    public final /* synthetic */ Stack f9440o;

    /* renamed from: p */
    public final /* synthetic */ ResumeMacroInfo f9441p;

    public /* synthetic */ C3549vk(ShellScriptAction shellScriptAction, boolean z, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack stack, ResumeMacroInfo resumeMacroInfo) {
        this.f9435a = shellScriptAction;
        this.f9436c = z;
        this.f9437d = i;
        this.f9438f = triggerContextInfo;
        this.f9439g = z2;
        this.f9440o = stack;
        this.f9441p = resumeMacroInfo;
    }

    public final void run() {
        ShellScriptAction.C2687f.m13052p(this.f9435a, this.f9436c, this.f9437d, this.f9438f, this.f9439g, this.f9440o, this.f9441p);
    }
}
