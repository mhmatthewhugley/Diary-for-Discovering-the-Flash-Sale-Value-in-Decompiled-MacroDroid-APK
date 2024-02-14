package com.arlosoft.macrodroid.homescreen.tiles;

import android.app.Activity;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.videos.VideosActivity;
import kotlin.jvm.internal.C13706o;
import p198z1.C10433a;

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.a0 */
/* compiled from: VideosTile.kt */
public final class C4790a0 extends C10433a {

    /* renamed from: b */
    private final Activity f11996b;

    /* renamed from: c */
    private final String f11997c;

    /* renamed from: d */
    private final int f11998d = C17530R$drawable.material_ic_videocam_24px_svg;

    /* renamed from: e */
    private final long f11999e = 24;

    /* renamed from: f */
    private final int f12000f;

    public C4790a0(Activity activity) {
        C13706o.m87929f(activity, "activity");
        this.f11996b = activity;
        String string = activity.getString(C17541R$string.tile_videos_title);
        C13706o.m87928e(string, "activity.getString(R.string.tile_videos_title)");
        this.f11997c = string;
        this.f12000f = ContextCompat.getColor(activity, C17528R$color.videos_primary);
    }

    /* renamed from: a */
    public int mo29331a() {
        return this.f12000f;
    }

    /* renamed from: b */
    public int mo29332b() {
        return this.f11998d;
    }

    /* renamed from: c */
    public long mo29333c() {
        return this.f11999e;
    }

    /* renamed from: e */
    public String mo29334e() {
        return this.f11997c;
    }

    /* renamed from: f */
    public void mo29335f(View view, View view2) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(view2, "iconView");
        VideosActivity.f15336B.mo32824a(this.f11996b);
    }
}
