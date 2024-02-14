package com.arlosoft.macrodroid.action;

import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Stack;

/* renamed from: com.arlosoft.macrodroid.action.sk */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3455sk implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f9199a;

    /* renamed from: c */
    public final /* synthetic */ ShellScriptAction f9200c;

    /* renamed from: d */
    public final /* synthetic */ boolean f9201d;

    /* renamed from: f */
    public final /* synthetic */ int f9202f;

    /* renamed from: g */
    public final /* synthetic */ TriggerContextInfo f9203g;

    /* renamed from: o */
    public final /* synthetic */ boolean f9204o;

    /* renamed from: p */
    public final /* synthetic */ Stack f9205p;

    /* renamed from: s */
    public final /* synthetic */ ResumeMacroInfo f9206s;

    public /* synthetic */ C3455sk(String str, ShellScriptAction shellScriptAction, boolean z, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack stack, ResumeMacroInfo resumeMacroInfo) {
        this.f9199a = str;
        this.f9200c = shellScriptAction;
        this.f9201d = z;
        this.f9202f = i;
        this.f9203g = triggerContextInfo;
        this.f9204o = z2;
        this.f9205p = stack;
        this.f9206s = resumeMacroInfo;
    }

    public final void run() {
        ShellScriptAction.m13003H3(this.f9199a, this.f9200c, this.f9201d, this.f9202f, this.f9203g, this.f9204o, this.f9205p, this.f9206s);
    }
}
