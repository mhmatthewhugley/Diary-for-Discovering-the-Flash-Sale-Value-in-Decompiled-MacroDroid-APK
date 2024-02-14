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

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.s */
/* compiled from: PluginsTile.kt */
public final class C4818s extends C10433a {

    /* renamed from: b */
    private final C4762j f12094b;

    /* renamed from: c */
    private final String f12095c;

    /* renamed from: d */
    private final int f12096d = C17530R$drawable.ic_power_plug_white_24dp;

    /* renamed from: e */
    private final long f12097e = 20;

    /* renamed from: f */
    private final int f12098f;

    public C4818s(Activity activity, C4762j jVar) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(jVar, "homeScreenNavigator");
        this.f12094b = jVar;
        String string = activity.getString(C17541R$string.home_screen_tile_plugins);
        C13706o.m87928e(string, "activity.getString(R.str…home_screen_tile_plugins)");
        this.f12095c = string;
        this.f12098f = ContextCompat.getColor(activity, C17528R$color.plugins_primary);
    }

    /* renamed from: a */
    public int mo29331a() {
        return this.f12098f;
    }

    /* renamed from: b */
    public int mo29332b() {
        return this.f12096d;
    }

    /* renamed from: c */
    public long mo29333c() {
        return this.f12097e;
    }

    /* renamed from: e */
    public String mo29334e() {
        return this.f12095c;
    }

    /* renamed from: f */
    public void mo29335f(View view, View view2) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(view2, "iconView");
        this.f12094b.mo29279t1();
    }
}
