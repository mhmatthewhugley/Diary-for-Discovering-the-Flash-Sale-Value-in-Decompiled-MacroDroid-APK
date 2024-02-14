package com.arlosoft.macrodroid.utils;

import android.view.View;
import androidx.core.util.Pair;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.utils.StringManipulation;

/* renamed from: com.arlosoft.macrodroid.utils.i1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6393i1 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ StringManipulation.StringManipOptionsAdapter.ViewHolder f14999a;

    /* renamed from: c */
    public final /* synthetic */ C4023j0.C4028e f15000c;

    /* renamed from: d */
    public final /* synthetic */ Pair f15001d;

    public /* synthetic */ C6393i1(StringManipulation.StringManipOptionsAdapter.ViewHolder viewHolder, C4023j0.C4028e eVar, Pair pair) {
        this.f14999a = viewHolder;
        this.f15000c = eVar;
        this.f15001d = pair;
    }

    public final void onClick(View view) {
        this.f14999a.m24592v(this.f15000c, this.f15001d, view);
    }
}
