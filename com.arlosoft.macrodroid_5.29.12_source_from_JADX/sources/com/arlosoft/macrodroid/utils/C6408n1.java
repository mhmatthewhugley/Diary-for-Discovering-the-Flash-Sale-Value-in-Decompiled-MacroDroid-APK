package com.arlosoft.macrodroid.utils;

import android.content.Context;

/* renamed from: com.arlosoft.macrodroid.utils.n1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6408n1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C6414o1 f15027a;

    /* renamed from: c */
    public final /* synthetic */ String f15028c;

    /* renamed from: d */
    public final /* synthetic */ byte[] f15029d;

    /* renamed from: f */
    public final /* synthetic */ int f15030f;

    /* renamed from: g */
    public final /* synthetic */ Context f15031g;

    public /* synthetic */ C6408n1(C6414o1 o1Var, String str, byte[] bArr, int i, Context context) {
        this.f15027a = o1Var;
        this.f15028c = str;
        this.f15029d = bArr;
        this.f15030f = i;
        this.f15031g = context;
    }

    public final void run() {
        this.f15027a.m24697d(this.f15028c, this.f15029d, this.f15030f, this.f15031g);
    }
}
