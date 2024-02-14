package com.arlosoft.macrodroid.homescreen.tiles;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.ExportImportActivity;
import kotlin.jvm.internal.C13706o;
import p198z1.C10433a;

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.n */
/* compiled from: ImportExportTile.kt */
public final class C4812n extends C10433a {

    /* renamed from: b */
    private final Activity f12066b;

    /* renamed from: c */
    private final String f12067c;

    /* renamed from: d */
    private final int f12068d = C17530R$drawable.material_ic_save_24px_svg;

    /* renamed from: e */
    private final long f12069e = 6;

    /* renamed from: f */
    private final int f12070f;

    public C4812n(Activity activity) {
        C13706o.m87929f(activity, "activity");
        this.f12066b = activity;
        String string = activity.getString(C17541R$string.export_import);
        C13706o.m87928e(string, "activity.getString(R.string.export_import)");
        this.f12067c = string;
        this.f12070f = ContextCompat.getColor(activity, C17528R$color.export_import_primary);
    }

    /* renamed from: a */
    public int mo29331a() {
        return this.f12070f;
    }

    /* renamed from: b */
    public int mo29332b() {
        return this.f12068d;
    }

    /* renamed from: c */
    public long mo29333c() {
        return this.f12069e;
    }

    /* renamed from: e */
    public String mo29334e() {
        return this.f12067c;
    }

    /* renamed from: f */
    public void mo29335f(View view, View view2) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(view2, "iconView");
        this.f12066b.startActivity(new Intent(this.f12066b, ExportImportActivity.class));
    }
}
