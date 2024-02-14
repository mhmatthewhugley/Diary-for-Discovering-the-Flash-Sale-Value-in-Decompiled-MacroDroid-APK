package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.ImageView;

/* renamed from: com.arlosoft.macrodroid.action.z */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3637z implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AndroidWearAction f9657a;

    /* renamed from: c */
    public final /* synthetic */ int f9658c;

    /* renamed from: d */
    public final /* synthetic */ ImageView[] f9659d;

    /* renamed from: f */
    public final /* synthetic */ int f9660f;

    public /* synthetic */ C3637z(AndroidWearAction androidWearAction, int i, ImageView[] imageViewArr, int i2) {
        this.f9657a = androidWearAction;
        this.f9658c = i;
        this.f9659d = imageViewArr;
        this.f9660f = i2;
    }

    public final void onClick(View view) {
        this.f9657a.m9781f4(this.f9658c, this.f9659d, this.f9660f, view);
    }
}
