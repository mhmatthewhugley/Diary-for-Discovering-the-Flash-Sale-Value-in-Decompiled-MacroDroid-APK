package com.arlosoft.macrodroid.action;

import com.arlosoft.macrodroid.action.PlaySoundAction;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Stack;

/* renamed from: com.arlosoft.macrodroid.action.td */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3479td implements PlaySoundAction.C2580b {

    /* renamed from: a */
    public final /* synthetic */ PlaySoundAction f9277a;

    /* renamed from: b */
    public final /* synthetic */ long f9278b;

    /* renamed from: c */
    public final /* synthetic */ boolean f9279c;

    /* renamed from: d */
    public final /* synthetic */ int f9280d;

    /* renamed from: e */
    public final /* synthetic */ TriggerContextInfo f9281e;

    /* renamed from: f */
    public final /* synthetic */ boolean f9282f;

    /* renamed from: g */
    public final /* synthetic */ Stack f9283g;

    /* renamed from: h */
    public final /* synthetic */ ResumeMacroInfo f9284h;

    public /* synthetic */ C3479td(PlaySoundAction playSoundAction, long j, boolean z, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack stack, ResumeMacroInfo resumeMacroInfo) {
        this.f9277a = playSoundAction;
        this.f9278b = j;
        this.f9279c = z;
        this.f9280d = i;
        this.f9281e = triggerContextInfo;
        this.f9282f = z2;
        this.f9283g = stack;
        this.f9284h = resumeMacroInfo;
    }

    /* renamed from: a */
    public final void mo25482a(long j) {
        this.f9277a.m11849B3(this.f9278b, this.f9279c, this.f9280d, this.f9281e, this.f9282f, this.f9283g, this.f9284h, j);
    }
}
