package com.arlosoft.macrodroid.variables;

import android.app.Activity;
import android.content.DialogInterface;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.VariableValue;
import kotlin.jvm.internal.C13680b0;

/* renamed from: com.arlosoft.macrodroid.variables.g0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6504g0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ String[] f15127a;

    /* renamed from: c */
    public final /* synthetic */ C13680b0 f15128c;

    /* renamed from: d */
    public final /* synthetic */ Activity f15129d;

    /* renamed from: f */
    public final /* synthetic */ C6520o0.C6521a f15130f;

    /* renamed from: g */
    public final /* synthetic */ C6520o0.C6525c f15131g;

    /* renamed from: o */
    public final /* synthetic */ VariableValue.Dictionary f15132o;

    public /* synthetic */ C6504g0(String[] strArr, C13680b0 b0Var, Activity activity, C6520o0.C6521a aVar, C6520o0.C6525c cVar, VariableValue.Dictionary dictionary) {
        this.f15127a = strArr;
        this.f15128c = b0Var;
        this.f15129d = activity;
        this.f15130f = aVar;
        this.f15131g = cVar;
        this.f15132o = dictionary;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C6520o0.m24888M0(this.f15127a, this.f15128c, this.f15129d, this.f15130f, this.f15131g, this.f15132o, dialogInterface, i);
    }
}
