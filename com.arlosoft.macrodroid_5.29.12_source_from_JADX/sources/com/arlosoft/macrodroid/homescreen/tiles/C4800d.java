package com.arlosoft.macrodroid.homescreen.tiles;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.autobackup.p068ui.AutoBackupActivity;
import kotlin.jvm.internal.C13706o;
import p198z1.C10433a;

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.d */
/* compiled from: AutoBackupTile.kt */
public final class C4800d extends C10433a {

    /* renamed from: b */
    private final Activity f12019b;

    /* renamed from: c */
    private final String f12020c;

    /* renamed from: d */
    private final int f12021d = C17530R$drawable.ic_content_save_all;

    /* renamed from: e */
    private final long f12022e = 13;

    /* renamed from: f */
    private final int f12023f;

    public C4800d(Activity activity) {
        C13706o.m87929f(activity, "activity");
        this.f12019b = activity;
        String string = activity.getString(C17541R$string.auto_backup);
        C13706o.m87928e(string, "activity.getString(R.string.auto_backup)");
        this.f12020c = string;
        this.f12023f = ContextCompat.getColor(activity, C17528R$color.auto_backup_primary);
    }

    /* renamed from: a */
    public int mo29331a() {
        return this.f12023f;
    }

    /* renamed from: b */
    public int mo29332b() {
        return this.f12021d;
    }

    /* renamed from: c */
    public long mo29333c() {
        return this.f12022e;
    }

    /* renamed from: e */
    public String mo29334e() {
        return this.f12020c;
    }

    /* renamed from: f */
    public void mo29335f(View view, View view2) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(view2, "iconView");
        this.f12019b.startActivity(new Intent(this.f12019b, AutoBackupActivity.class));
    }
}
