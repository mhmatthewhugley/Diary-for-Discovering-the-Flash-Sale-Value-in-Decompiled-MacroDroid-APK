package com.arlosoft.macrodroid.action;

import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Stack;

/* renamed from: com.arlosoft.macrodroid.action.cc */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2971cc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ OpenWebPageAction f8114a;

    /* renamed from: c */
    public final /* synthetic */ String f8115c;

    /* renamed from: d */
    public final /* synthetic */ String f8116d;

    /* renamed from: f */
    public final /* synthetic */ boolean f8117f;

    /* renamed from: g */
    public final /* synthetic */ int f8118g;

    /* renamed from: o */
    public final /* synthetic */ TriggerContextInfo f8119o;

    /* renamed from: p */
    public final /* synthetic */ boolean f8120p;

    /* renamed from: s */
    public final /* synthetic */ Stack f8121s;

    /* renamed from: z */
    public final /* synthetic */ ResumeMacroInfo f8122z;

    public /* synthetic */ C2971cc(OpenWebPageAction openWebPageAction, String str, String str2, boolean z, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack stack, ResumeMacroInfo resumeMacroInfo) {
        this.f8114a = openWebPageAction;
        this.f8115c = str;
        this.f8116d = str2;
        this.f8117f = z;
        this.f8118g = i;
        this.f8119o = triggerContextInfo;
        this.f8120p = z2;
        this.f8121s = stack;
        this.f8122z = resumeMacroInfo;
    }

    public final void run() {
        this.f8114a.m11692F3(this.f8115c, this.f8116d, this.f8117f, this.f8118g, this.f8119o, this.f8120p, this.f8121s, this.f8122z);
    }
}
