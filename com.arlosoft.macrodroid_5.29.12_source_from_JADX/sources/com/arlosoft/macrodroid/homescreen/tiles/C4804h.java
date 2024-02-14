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

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.h */
/* compiled from: FavouritesTile.kt */
public final class C4804h extends C10433a {

    /* renamed from: b */
    private final C4762j f12041b;

    /* renamed from: c */
    private final String f12042c;

    /* renamed from: d */
    private final int f12043d = C17530R$drawable.ic_star_white_24dp;

    /* renamed from: e */
    private final long f12044e = 25;

    /* renamed from: f */
    private final int f12045f;

    /* renamed from: g */
    private final int f12046g;

    public C4804h(Activity activity, C4762j jVar) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(jVar, "homeScreenNavigator");
        this.f12041b = jVar;
        String string = activity.getString(C17541R$string.favourite_macros);
        C13706o.m87928e(string, "activity.getString(R.string.favourite_macros)");
        this.f12042c = string;
        this.f12045f = ContextCompat.getColor(activity, C17528R$color.favourites_primary);
        this.f12046g = 24;
    }

    /* renamed from: a */
    public int mo29331a() {
        return this.f12045f;
    }

    /* renamed from: b */
    public int mo29332b() {
        return this.f12043d;
    }

    /* renamed from: c */
    public long mo29333c() {
        return this.f12044e;
    }

    /* renamed from: e */
    public String mo29334e() {
        return this.f12042c;
    }

    /* renamed from: f */
    public void mo29335f(View view, View view2) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(view2, "iconView");
        this.f12041b.mo29264A0(view, view2);
    }
}
