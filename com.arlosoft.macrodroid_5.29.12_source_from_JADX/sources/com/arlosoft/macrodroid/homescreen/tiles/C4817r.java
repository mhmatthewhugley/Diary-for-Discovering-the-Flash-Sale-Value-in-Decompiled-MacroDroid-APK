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

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.r */
/* compiled from: NotificationBarTile.kt */
public final class C4817r extends C10433a {

    /* renamed from: b */
    private final C4762j f12089b;

    /* renamed from: c */
    private final String f12090c;

    /* renamed from: d */
    private final int f12091d = C17530R$drawable.ic_checkbook;

    /* renamed from: e */
    private final long f12092e = 17;

    /* renamed from: f */
    private final int f12093f;

    public C4817r(Activity activity, C4762j jVar) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(jVar, "homeScreenNavigator");
        this.f12089b = jVar;
        String string = activity.getString(C17541R$string.notification_bar_options);
        C13706o.m87928e(string, "activity.getString(R.str…notification_bar_options)");
        this.f12090c = string;
        this.f12093f = ContextCompat.getColor(activity, C17528R$color.notification_bar_primary);
    }

    /* renamed from: a */
    public int mo29331a() {
        return this.f12093f;
    }

    /* renamed from: b */
    public int mo29332b() {
        return this.f12091d;
    }

    /* renamed from: c */
    public long mo29333c() {
        return this.f12092e;
    }

    /* renamed from: e */
    public String mo29334e() {
        return this.f12090c;
    }

    /* renamed from: f */
    public void mo29335f(View view, View view2) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(view2, "iconView");
        this.f12089b.mo29275p1();
    }
}
