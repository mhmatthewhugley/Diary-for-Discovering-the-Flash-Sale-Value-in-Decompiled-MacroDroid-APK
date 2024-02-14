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

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.q */
/* compiled from: ModesConfigTile.kt */
public final class C4816q extends C10433a {

    /* renamed from: b */
    private final C4762j f12084b;

    /* renamed from: c */
    private final String f12085c;

    /* renamed from: d */
    private final int f12086d = C17530R$drawable.active_icon_new;

    /* renamed from: e */
    private final long f12087e = 19;

    /* renamed from: f */
    private final int f12088f;

    public C4816q(Activity activity, C4762j jVar) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(jVar, "homeScreenNavigator");
        this.f12084b = jVar;
        String string = activity.getString(C17541R$string.edit_macrodroid_modes);
        C13706o.m87928e(string, "activity.getString(R.string.edit_macrodroid_modes)");
        this.f12085c = string;
        this.f12088f = ContextCompat.getColor(activity, C17528R$color.modes_config_primary);
    }

    /* renamed from: a */
    public int mo29331a() {
        return this.f12088f;
    }

    /* renamed from: b */
    public int mo29332b() {
        return this.f12086d;
    }

    /* renamed from: c */
    public long mo29333c() {
        return this.f12087e;
    }

    /* renamed from: e */
    public String mo29334e() {
        return this.f12085c;
    }

    /* renamed from: f */
    public void mo29335f(View view, View view2) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(view2, "iconView");
        this.f12084b.mo29276q1();
    }
}
