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

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.v */
/* compiled from: SettingsTile.kt */
public final class C4821v extends C10433a {

    /* renamed from: b */
    private final C4762j f12111b;

    /* renamed from: c */
    private final String f12112c;

    /* renamed from: d */
    private final int f12113d = C17530R$drawable.ic_settings_white_48px;

    /* renamed from: e */
    private final long f12114e = 4;

    /* renamed from: f */
    private final int f12115f;

    public C4821v(Activity activity, C4762j jVar) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(jVar, "homeScreenNavigator");
        this.f12111b = jVar;
        String string = activity.getString(C17541R$string.settings);
        C13706o.m87928e(string, "activity.getString(R.string.settings)");
        this.f12112c = string;
        this.f12115f = ContextCompat.getColor(activity, C17528R$color.settings_primary);
    }

    /* renamed from: a */
    public int mo29331a() {
        return this.f12115f;
    }

    /* renamed from: b */
    public int mo29332b() {
        return this.f12113d;
    }

    /* renamed from: c */
    public long mo29333c() {
        return this.f12114e;
    }

    /* renamed from: e */
    public String mo29334e() {
        return this.f12112c;
    }

    /* renamed from: f */
    public void mo29335f(View view, View view2) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(view2, "iconView");
        this.f12111b.mo29268L0();
    }
}
