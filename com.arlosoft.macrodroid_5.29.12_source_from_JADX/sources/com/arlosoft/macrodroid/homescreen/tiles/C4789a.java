package com.arlosoft.macrodroid.homescreen.tiles;

import android.app.Activity;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.actionblock.list.ActionBlockListActivity;
import kotlin.jvm.internal.C13706o;
import p198z1.C10433a;

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.a */
/* compiled from: ActionBlocksTile.kt */
public final class C4789a extends C10433a {

    /* renamed from: b */
    private final Activity f11991b;

    /* renamed from: c */
    private final String f11992c;

    /* renamed from: d */
    private final int f11993d = C17530R$drawable.text_box_multiple;

    /* renamed from: e */
    private final long f11994e = 23;

    /* renamed from: f */
    private final int f11995f;

    public C4789a(Activity activity) {
        C13706o.m87929f(activity, "activity");
        this.f11991b = activity;
        String string = activity.getString(C17541R$string.action_blocks);
        C13706o.m87928e(string, "activity.getString(R.string.action_blocks)");
        this.f11992c = string;
        this.f11995f = ContextCompat.getColor(activity, C17528R$color.actions_primary);
    }

    /* renamed from: a */
    public int mo29331a() {
        return this.f11995f;
    }

    /* renamed from: b */
    public int mo29332b() {
        return this.f11993d;
    }

    /* renamed from: c */
    public long mo29333c() {
        return this.f11994e;
    }

    /* renamed from: e */
    public String mo29334e() {
        return this.f11992c;
    }

    /* renamed from: f */
    public void mo29335f(View view, View view2) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(view2, "iconView");
        ActionBlockListActivity.f9803G.mo27229b(this.f11991b, false, 0);
    }
}
