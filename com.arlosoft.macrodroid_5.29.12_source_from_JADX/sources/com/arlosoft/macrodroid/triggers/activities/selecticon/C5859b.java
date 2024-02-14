package com.arlosoft.macrodroid.triggers.activities.selecticon;

import android.graphics.drawable.Drawable;
import com.arlosoft.macrodroid.triggers.activities.selecticon.SelectIconAdapter;

/* renamed from: com.arlosoft.macrodroid.triggers.activities.selecticon.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5859b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SelectIconAdapter.ViewHolder f13906a;

    /* renamed from: c */
    public final /* synthetic */ Drawable f13907c;

    public /* synthetic */ C5859b(SelectIconAdapter.ViewHolder viewHolder, Drawable drawable) {
        this.f13906a = viewHolder;
        this.f13907c = drawable;
    }

    public final void run() {
        this.f13906a.icon.setImageDrawable(this.f13907c);
    }
}
