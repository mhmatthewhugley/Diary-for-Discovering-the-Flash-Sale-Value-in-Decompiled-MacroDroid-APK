package com.arlosoft.macrodroid.homescreen.tiles;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.stopwatch.StopWatchesActivity;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C13706o;
import p198z1.C10433a;

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.w */
/* compiled from: StopwatchesTile.kt */
public final class C4822w extends C10433a {

    /* renamed from: b */
    private final Activity f12116b;

    /* renamed from: c */
    private final String f12117c;

    /* renamed from: d */
    private final int f12118d = C17530R$drawable.ic_timer_outline;

    /* renamed from: e */
    private final long f12119e = 8;

    /* renamed from: f */
    private final int f12120f;

    public C4822w(Activity activity) {
        C13706o.m87929f(activity, "activity");
        this.f12116b = activity;
        String string = activity.getString(C17541R$string.stopwatches);
        C13706o.m87928e(string, "activity.getString(R.string.stopwatches)");
        this.f12117c = string;
        this.f12120f = ContextCompat.getColor(activity, C17528R$color.stopwatches_primary);
    }

    /* renamed from: a */
    public int mo29331a() {
        return this.f12120f;
    }

    /* renamed from: b */
    public int mo29332b() {
        return this.f12118d;
    }

    /* renamed from: c */
    public long mo29333c() {
        return this.f12119e;
    }

    /* renamed from: e */
    public String mo29334e() {
        return this.f12117c;
    }

    /* renamed from: f */
    public void mo29335f(View view, View view2) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(view2, "iconView");
        this.f12116b.startActivity(new Intent(this.f12116b, StopWatchesActivity.class));
    }

    /* renamed from: g */
    public void mo29346g(FrameLayout frameLayout) {
        C13706o.m87929f(frameLayout, "view");
        Context context = frameLayout.getContext();
        C13706o.m87928e(context, "view.context");
        Object systemService = context.getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(C17535R$layout.home_tile_custom_stopwatch, frameLayout, true);
            int i = C17532R$id.stopwatch1;
            View findViewById = frameLayout.findViewById(i);
            int i2 = C17532R$id.stopwatchName;
            ((TextView) findViewById.findViewById(i2)).setText("Test2");
            View findViewById2 = frameLayout.findViewById(i);
            int i3 = C17532R$id.stopwatchTime;
            ((TextView) findViewById2.findViewById(i3)).setText("0:00");
            int i4 = C17532R$id.stopwatch2;
            ((TextView) frameLayout.findViewById(i4).findViewById(i2)).setText("Test1");
            ((TextView) frameLayout.findViewById(i4).findViewById(i3)).setText("12:00");
            int i5 = C17532R$id.stopwatch3;
            ((TextView) frameLayout.findViewById(i5).findViewById(i2)).setText("Test1");
            ((TextView) frameLayout.findViewById(i5).findViewById(i3)).setText("0:00");
            int i6 = C17532R$id.stopwatch4;
            ((TextView) frameLayout.findViewById(i6).findViewById(i2)).setText("Test1");
            ((TextView) frameLayout.findViewById(i6).findViewById(i3)).setText("0:00");
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }
}
