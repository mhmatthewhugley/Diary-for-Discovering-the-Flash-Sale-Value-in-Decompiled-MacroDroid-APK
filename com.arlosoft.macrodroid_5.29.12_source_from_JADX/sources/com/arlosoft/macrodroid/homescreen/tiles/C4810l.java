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

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.l */
/* compiled from: GeofencesTile.kt */
public final class C4810l extends C10433a {

    /* renamed from: b */
    private final C4762j f12057b;

    /* renamed from: c */
    private final String f12058c;

    /* renamed from: d */
    private final int f12059d = C17530R$drawable.ic_map_marker_radius;

    /* renamed from: e */
    private final long f12060e = 9;

    /* renamed from: f */
    private final int f12061f;

    public C4810l(Activity activity, C4762j jVar) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(jVar, "homeScreenNavigator");
        this.f12057b = jVar;
        String string = activity.getString(C17541R$string.geofences);
        C13706o.m87928e(string, "activity.getString(R.string.geofences)");
        this.f12058c = string;
        this.f12061f = ContextCompat.getColor(activity, C17528R$color.geofences_primary);
    }

    /* renamed from: a */
    public int mo29331a() {
        return this.f12061f;
    }

    /* renamed from: b */
    public int mo29332b() {
        return this.f12059d;
    }

    /* renamed from: c */
    public long mo29333c() {
        return this.f12060e;
    }

    /* renamed from: e */
    public String mo29334e() {
        return this.f12058c;
    }

    /* renamed from: f */
    public void mo29335f(View view, View view2) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(view2, "iconView");
        this.f12057b.mo29265E0();
    }
}
