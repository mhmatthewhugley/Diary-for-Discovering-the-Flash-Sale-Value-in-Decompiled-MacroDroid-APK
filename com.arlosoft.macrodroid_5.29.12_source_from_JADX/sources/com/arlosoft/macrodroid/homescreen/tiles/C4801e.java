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

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.e */
/* compiled from: CategoriesTile.kt */
public final class C4801e extends C10433a {

    /* renamed from: b */
    private final C4762j f12024b;

    /* renamed from: c */
    private final String f12025c;

    /* renamed from: d */
    private final int f12026d = C17530R$drawable.ic_categories;

    /* renamed from: e */
    private final long f12027e = 16;

    /* renamed from: f */
    private final int f12028f;

    /* renamed from: g */
    private final int f12029g;

    public C4801e(Activity activity, C4762j jVar) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(jVar, "homeScreenNavigator");
        this.f12024b = jVar;
        String string = activity.getString(C17541R$string.categories);
        C13706o.m87928e(string, "activity.getString(R.string.categories)");
        this.f12025c = string;
        this.f12028f = ContextCompat.getColor(activity, C17528R$color.categories_primary);
        this.f12029g = 24;
    }

    /* renamed from: a */
    public int mo29331a() {
        return this.f12028f;
    }

    /* renamed from: b */
    public int mo29332b() {
        return this.f12026d;
    }

    /* renamed from: c */
    public long mo29333c() {
        return this.f12027e;
    }

    /* renamed from: e */
    public String mo29334e() {
        return this.f12025c;
    }

    /* renamed from: f */
    public void mo29335f(View view, View view2) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(view2, "iconView");
        this.f12024b.mo29267G0();
    }
}
