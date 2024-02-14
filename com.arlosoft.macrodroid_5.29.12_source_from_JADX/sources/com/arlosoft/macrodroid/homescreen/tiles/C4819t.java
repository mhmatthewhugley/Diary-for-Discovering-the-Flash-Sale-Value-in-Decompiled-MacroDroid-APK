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

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.t */
/* compiled from: QuickRunMacroTile.kt */
public final class C4819t extends C10433a {

    /* renamed from: b */
    private final Activity f12099b;

    /* renamed from: c */
    private final C4762j f12100c;

    /* renamed from: d */
    private final String f12101d;

    /* renamed from: e */
    private final int f12102e = C17530R$drawable.ic_run_fast;

    /* renamed from: f */
    private final long f12103f = 22;

    /* renamed from: g */
    private final int f12104g;

    public C4819t(Activity activity, C4762j jVar) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(jVar, "homeScreenNavigator");
        this.f12099b = activity;
        this.f12100c = jVar;
        String string = activity.getString(C17541R$string.home_screen_tile_quick_run_macro);
        C13706o.m87928e(string, "activity.getString(R.str…een_tile_quick_run_macro)");
        this.f12101d = string;
        this.f12104g = ContextCompat.getColor(activity, C17528R$color.home_screen_tile_quick_run_macro);
    }

    /* renamed from: a */
    public int mo29331a() {
        return this.f12104g;
    }

    /* renamed from: b */
    public int mo29332b() {
        return this.f12102e;
    }

    /* renamed from: c */
    public long mo29333c() {
        return this.f12103f;
    }

    /* renamed from: e */
    public String mo29334e() {
        return this.f12101d;
    }

    /* renamed from: f */
    public void mo29335f(View view, View view2) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(view2, "iconView");
        this.f12100c.mo29266E1(view, view2);
    }
}
