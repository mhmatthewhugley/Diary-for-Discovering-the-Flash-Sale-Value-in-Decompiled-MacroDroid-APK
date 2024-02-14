package com.arlosoft.macrodroid.homescreen.tiles;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.variables.MacroDroidVariablesActivity;
import kotlin.jvm.internal.C13706o;
import p198z1.C10433a;

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.z */
/* compiled from: VariablesTile.kt */
public final class C4825z extends C10433a {

    /* renamed from: b */
    private final Activity f12131b;

    /* renamed from: c */
    private final String f12132c;

    /* renamed from: d */
    private final int f12133d = C17530R$drawable.ic_help_box;

    /* renamed from: e */
    private final long f12134e = 7;

    /* renamed from: f */
    private final int f12135f;

    public C4825z(Activity activity) {
        C13706o.m87929f(activity, "activity");
        this.f12131b = activity;
        String string = activity.getString(C17541R$string.variables);
        C13706o.m87928e(string, "activity.getString(R.string.variables)");
        this.f12132c = string;
        this.f12135f = ContextCompat.getColor(activity, C17528R$color.variables_primary);
    }

    /* renamed from: a */
    public int mo29331a() {
        return this.f12135f;
    }

    /* renamed from: b */
    public int mo29332b() {
        return this.f12133d;
    }

    /* renamed from: c */
    public long mo29333c() {
        return this.f12134e;
    }

    /* renamed from: e */
    public String mo29334e() {
        return this.f12132c;
    }

    /* renamed from: f */
    public void mo29335f(View view, View view2) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(view2, "iconView");
        this.f12131b.startActivity(new Intent(this.f12131b, MacroDroidVariablesActivity.class));
    }
}
