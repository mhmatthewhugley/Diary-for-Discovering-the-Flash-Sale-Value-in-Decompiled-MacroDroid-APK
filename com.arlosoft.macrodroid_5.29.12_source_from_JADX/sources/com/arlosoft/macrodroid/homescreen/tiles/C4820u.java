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

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.u */
/* compiled from: QuickSettingsConfigTile.kt */
public final class C4820u extends C10433a {

    /* renamed from: b */
    private final C4762j f12105b;

    /* renamed from: c */
    private final String f12106c;

    /* renamed from: d */
    private final int f12107d = C17530R$drawable.ic_cog_box;

    /* renamed from: e */
    private final long f12108e = 15;

    /* renamed from: f */
    private final int f12109f;

    /* renamed from: g */
    private final int f12110g;

    public C4820u(Activity activity, C4762j jVar) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(jVar, "homeScreenNavigator");
        this.f12105b = jVar;
        String string = activity.getString(C17541R$string.quick_settings_tiles);
        C13706o.m87928e(string, "activity.getString(R.string.quick_settings_tiles)");
        this.f12106c = string;
        this.f12109f = ContextCompat.getColor(activity, C17528R$color.quick_settings_config_primary);
        this.f12110g = 24;
    }

    /* renamed from: a */
    public int mo29331a() {
        return this.f12109f;
    }

    /* renamed from: b */
    public int mo29332b() {
        return this.f12107d;
    }

    /* renamed from: c */
    public long mo29333c() {
        return this.f12108e;
    }

    /* renamed from: e */
    public String mo29334e() {
        return this.f12106c;
    }

    /* renamed from: f */
    public void mo29335f(View view, View view2) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(view2, "iconView");
        this.f12105b.mo29269X();
    }
}
