package com.arlosoft.macrodroid.homescreen.tiles;

import android.app.Activity;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.homescreen.C4762j;
import kotlin.jvm.internal.C13706o;
import p198z1.C10433a;

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.f */
/* compiled from: CellTowersTile.kt */
public final class C4802f extends C10433a {

    /* renamed from: b */
    private final Activity f12030b;

    /* renamed from: c */
    private final C4762j f12031c;

    /* renamed from: d */
    private final String f12032d;

    /* renamed from: e */
    private final int f12033e = C17530R$drawable.ic_radio_tower;

    /* renamed from: f */
    private final long f12034f = 10;

    /* renamed from: g */
    private final int f12035g;

    public C4802f(Activity activity, C4762j jVar) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(jVar, "homeScreenNavigator");
        this.f12030b = activity;
        this.f12031c = jVar;
        String string = activity.getString(C17541R$string.constraint_cell_towers);
        C13706o.m87928e(string, "activity.getString(R.str…g.constraint_cell_towers)");
        this.f12032d = string;
        this.f12035g = ContextCompat.getColor(activity, C17528R$color.cell_towers_primary);
    }

    /* renamed from: a */
    public int mo29331a() {
        return this.f12035g;
    }

    /* renamed from: b */
    public int mo29332b() {
        return this.f12033e;
    }

    /* renamed from: c */
    public long mo29333c() {
        return this.f12034f;
    }

    /* renamed from: e */
    public String mo29334e() {
        return this.f12032d;
    }

    /* renamed from: f */
    public void mo29335f(View view, View view2) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(view2, "iconView");
        this.f12031c.mo29274p0();
    }
}
