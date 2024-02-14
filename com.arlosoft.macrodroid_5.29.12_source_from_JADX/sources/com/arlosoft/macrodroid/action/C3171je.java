package com.arlosoft.macrodroid.action;

import com.arlosoft.macrodroid.action.ReadScreenContentsAction;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Stack;

/* renamed from: com.arlosoft.macrodroid.action.je */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3171je implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f8535a;

    /* renamed from: c */
    public final /* synthetic */ ReadScreenContentsAction f8536c;

    /* renamed from: d */
    public final /* synthetic */ int f8537d;

    /* renamed from: f */
    public final /* synthetic */ TriggerContextInfo f8538f;

    /* renamed from: g */
    public final /* synthetic */ boolean f8539g;

    /* renamed from: o */
    public final /* synthetic */ Stack f8540o;

    /* renamed from: p */
    public final /* synthetic */ ResumeMacroInfo f8541p;

    public /* synthetic */ C3171je(boolean z, ReadScreenContentsAction readScreenContentsAction, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack stack, ResumeMacroInfo resumeMacroInfo) {
        this.f8535a = z;
        this.f8536c = readScreenContentsAction;
        this.f8537d = i;
        this.f8538f = triggerContextInfo;
        this.f8539g = z2;
        this.f8540o = stack;
        this.f8541p = resumeMacroInfo;
    }

    public final void run() {
        ReadScreenContentsAction.C2596e.C2597a.C2598a.m11987e(this.f8535a, this.f8536c, this.f8537d, this.f8538f, this.f8539g, this.f8540o, this.f8541p);
    }
}
