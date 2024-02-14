package com.arlosoft.macrodroid.action;

import com.arlosoft.macrodroid.action.SpeakTextAction;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Stack;

/* renamed from: com.arlosoft.macrodroid.action.el */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3037el implements SpeakTextAction.C2702h {

    /* renamed from: a */
    public final /* synthetic */ SpeakTextAction f8268a;

    /* renamed from: b */
    public final /* synthetic */ String f8269b;

    /* renamed from: c */
    public final /* synthetic */ boolean f8270c;

    /* renamed from: d */
    public final /* synthetic */ int f8271d;

    /* renamed from: e */
    public final /* synthetic */ TriggerContextInfo f8272e;

    /* renamed from: f */
    public final /* synthetic */ boolean f8273f;

    /* renamed from: g */
    public final /* synthetic */ Stack f8274g;

    /* renamed from: h */
    public final /* synthetic */ ResumeMacroInfo f8275h;

    public /* synthetic */ C3037el(SpeakTextAction speakTextAction, String str, boolean z, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack stack, ResumeMacroInfo resumeMacroInfo) {
        this.f8268a = speakTextAction;
        this.f8269b = str;
        this.f8270c = z;
        this.f8271d = i;
        this.f8272e = triggerContextInfo;
        this.f8273f = z2;
        this.f8274g = stack;
        this.f8275h = resumeMacroInfo;
    }

    /* renamed from: a */
    public final void mo25804a(String str) {
        this.f8268a.m13102g4(this.f8269b, this.f8270c, this.f8271d, this.f8272e, this.f8273f, this.f8274g, this.f8275h, str);
    }
}
