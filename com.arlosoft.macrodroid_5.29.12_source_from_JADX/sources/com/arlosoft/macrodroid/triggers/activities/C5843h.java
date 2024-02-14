package com.arlosoft.macrodroid.triggers.activities;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* renamed from: com.arlosoft.macrodroid.triggers.activities.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5843h implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ LocationChooserActivity f13853a;

    /* renamed from: b */
    public final /* synthetic */ Menu f13854b;

    /* renamed from: c */
    public final /* synthetic */ MenuItem f13855c;

    public /* synthetic */ C5843h(LocationChooserActivity locationChooserActivity, Menu menu, MenuItem menuItem) {
        this.f13853a = locationChooserActivity;
        this.f13854b = menu;
        this.f13855c = menuItem;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f13853a.m23852m2(this.f13854b, this.f13855c, view, i, i2, i3, i4, i5, i6, i7, i8);
    }
}
