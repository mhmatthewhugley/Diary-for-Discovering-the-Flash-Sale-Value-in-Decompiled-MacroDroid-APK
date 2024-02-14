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

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.g */
/* compiled from: DrawerTile.kt */
public final class C4803g extends C10433a {

    /* renamed from: b */
    private final C4762j f12036b;

    /* renamed from: c */
    private final String f12037c;

    /* renamed from: d */
    private final int f12038d = C17530R$drawable.ic_drawer_right;

    /* renamed from: e */
    private final long f12039e = 14;

    /* renamed from: f */
    private final int f12040f;

    public C4803g(Activity activity, C4762j jVar) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(jVar, "homeScreenNavigator");
        this.f12036b = jVar;
        String string = activity.getString(C17541R$string.macrodroid_drawer_options);
        C13706o.m87928e(string, "activity.getString(R.str…acrodroid_drawer_options)");
        this.f12037c = string;
        this.f12040f = ContextCompat.getColor(activity, C17528R$color.drawer_primary);
    }

    /* renamed from: a */
    public int mo29331a() {
        return this.f12040f;
    }

    /* renamed from: b */
    public int mo29332b() {
        return this.f12038d;
    }

    /* renamed from: c */
    public long mo29333c() {
        return this.f12039e;
    }

    /* renamed from: e */
    public String mo29334e() {
        return this.f12037c;
    }

    /* renamed from: f */
    public void mo29335f(View view, View view2) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(view2, "iconView");
        this.f12036b.mo29270f1();
    }
}
