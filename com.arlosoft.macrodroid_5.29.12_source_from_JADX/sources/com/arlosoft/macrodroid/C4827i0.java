package com.arlosoft.macrodroid;

import android.view.View;
import android.widget.AdapterView;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.List;
import java.util.Stack;

/* renamed from: com.arlosoft.macrodroid.i0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4827i0 implements AdapterView.OnItemClickListener {

    /* renamed from: A */
    public final /* synthetic */ Stack f12139A;

    /* renamed from: B */
    public final /* synthetic */ ResumeMacroInfo f12140B;

    /* renamed from: a */
    public final /* synthetic */ SelectModeActivity f12141a;

    /* renamed from: c */
    public final /* synthetic */ List f12142c;

    /* renamed from: d */
    public final /* synthetic */ boolean f12143d;

    /* renamed from: f */
    public final /* synthetic */ TriggerContextInfo f12144f;

    /* renamed from: g */
    public final /* synthetic */ Macro f12145g;

    /* renamed from: o */
    public final /* synthetic */ boolean f12146o;

    /* renamed from: p */
    public final /* synthetic */ Trigger f12147p;

    /* renamed from: s */
    public final /* synthetic */ int f12148s;

    /* renamed from: z */
    public final /* synthetic */ boolean f12149z;

    public /* synthetic */ C4827i0(SelectModeActivity selectModeActivity, List list, boolean z, TriggerContextInfo triggerContextInfo, Macro macro, boolean z2, Trigger trigger, int i, boolean z3, Stack stack, ResumeMacroInfo resumeMacroInfo) {
        this.f12141a = selectModeActivity;
        this.f12142c = list;
        this.f12143d = z;
        this.f12144f = triggerContextInfo;
        this.f12145g = macro;
        this.f12146o = z2;
        this.f12147p = trigger;
        this.f12148s = i;
        this.f12149z = z3;
        this.f12139A = stack;
        this.f12140B = resumeMacroInfo;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f12141a.m9517L1(this.f12142c, this.f12143d, this.f12144f, this.f12145g, this.f12146o, this.f12147p, this.f12148s, this.f12149z, this.f12139A, this.f12140B, adapterView, view, i, j);
    }
}
