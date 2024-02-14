package com.arlosoft.macrodroid.homescreen.tiles;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.logging.LogActivity;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C13706o;
import p198z1.C10433a;

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.y */
/* compiled from: UserLogTile.kt */
public final class C4824y extends C10433a {

    /* renamed from: b */
    private final Activity f12126b;

    /* renamed from: c */
    private final String f12127c;

    /* renamed from: d */
    private final int f12128d = C17530R$drawable.ic_file_document_edit;

    /* renamed from: e */
    private final long f12129e = 12;

    /* renamed from: f */
    private final int f12130f;

    public C4824y(Activity activity) {
        C13706o.m87929f(activity, "activity");
        this.f12126b = activity;
        String string = activity.getString(C17541R$string.user_log);
        C13706o.m87928e(string, "activity.getString(R.string.user_log)");
        this.f12127c = string;
        this.f12130f = ContextCompat.getColor(activity, C17528R$color.user_log_primary);
    }

    /* renamed from: a */
    public int mo29331a() {
        return this.f12130f;
    }

    /* renamed from: b */
    public int mo29332b() {
        return this.f12128d;
    }

    /* renamed from: c */
    public long mo29333c() {
        return this.f12129e;
    }

    /* renamed from: e */
    public String mo29334e() {
        return this.f12127c;
    }

    /* renamed from: f */
    public void mo29335f(View view, View view2) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(view2, "iconView");
        Activity activity = this.f12126b;
        Intent intent = new Intent(this.f12126b, LogActivity.class);
        intent.putExtra(LogActivity.f12202B, true);
        activity.startActivity(intent);
    }

    /* renamed from: g */
    public void mo29346g(FrameLayout frameLayout) {
        C13706o.m87929f(frameLayout, "view");
        Context context = frameLayout.getContext();
        C13706o.m87928e(context, "view.context");
        Object systemService = context.getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(C17535R$layout.home_tile_custom_log, frameLayout, true);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }
}
