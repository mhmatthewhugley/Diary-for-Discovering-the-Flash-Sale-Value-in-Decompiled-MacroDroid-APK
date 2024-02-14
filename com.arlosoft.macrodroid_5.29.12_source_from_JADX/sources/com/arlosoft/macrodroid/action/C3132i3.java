package com.arlosoft.macrodroid.action;

import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Stack;
import p216ba.C11110a;

/* renamed from: com.arlosoft.macrodroid.action.i3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3132i3 implements C11110a {

    /* renamed from: a */
    public final /* synthetic */ ConnectivityCheckAction f8462a;

    /* renamed from: b */
    public final /* synthetic */ boolean f8463b;

    /* renamed from: c */
    public final /* synthetic */ int f8464c;

    /* renamed from: d */
    public final /* synthetic */ TriggerContextInfo f8465d;

    /* renamed from: e */
    public final /* synthetic */ boolean f8466e;

    /* renamed from: f */
    public final /* synthetic */ Stack f8467f;

    /* renamed from: g */
    public final /* synthetic */ ResumeMacroInfo f8468g;

    public /* synthetic */ C3132i3(ConnectivityCheckAction connectivityCheckAction, boolean z, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack stack, ResumeMacroInfo resumeMacroInfo) {
        this.f8462a = connectivityCheckAction;
        this.f8463b = z;
        this.f8464c = i;
        this.f8465d = triggerContextInfo;
        this.f8466e = z2;
        this.f8467f = stack;
        this.f8468g = resumeMacroInfo;
    }

    public final void run() {
        ConnectivityCheckAction.m10240C3(this.f8462a, this.f8463b, this.f8464c, this.f8465d, this.f8466e, this.f8467f, this.f8468g);
    }
}
