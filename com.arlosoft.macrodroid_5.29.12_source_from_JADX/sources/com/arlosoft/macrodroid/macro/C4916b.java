package com.arlosoft.macrodroid.macro;

import android.os.PowerManager;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Stack;

/* renamed from: com.arlosoft.macrodroid.macro.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4916b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Macro f12356a;

    /* renamed from: c */
    public final /* synthetic */ int f12357c;

    /* renamed from: d */
    public final /* synthetic */ TriggerContextInfo f12358d;

    /* renamed from: f */
    public final /* synthetic */ boolean f12359f;

    /* renamed from: g */
    public final /* synthetic */ Stack f12360g;

    /* renamed from: o */
    public final /* synthetic */ ResumeMacroInfo f12361o;

    /* renamed from: p */
    public final /* synthetic */ PowerManager.WakeLock f12362p;

    public /* synthetic */ C4916b(Macro macro, int i, TriggerContextInfo triggerContextInfo, boolean z, Stack stack, ResumeMacroInfo resumeMacroInfo, PowerManager.WakeLock wakeLock) {
        this.f12356a = macro;
        this.f12357c = i;
        this.f12358d = triggerContextInfo;
        this.f12359f = z;
        this.f12360g = stack;
        this.f12361o = resumeMacroInfo;
        this.f12362p = wakeLock;
    }

    public final void run() {
        ContinuePausedActionsHandler.m18974c(this.f12356a, this.f12357c, this.f12358d, this.f12359f, this.f12360g, this.f12361o, this.f12362p);
    }
}
