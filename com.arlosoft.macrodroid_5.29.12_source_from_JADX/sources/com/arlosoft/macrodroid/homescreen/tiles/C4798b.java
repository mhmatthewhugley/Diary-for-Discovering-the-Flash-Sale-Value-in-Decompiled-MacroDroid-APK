package com.arlosoft.macrodroid.homescreen.tiles;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.editscreen.EditMacroActivity;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.remoteconfig.C5070a;
import com.arlosoft.macrodroid.settings.C5163j2;
import kotlin.jvm.internal.C13706o;
import p198z1.C10433a;

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.b */
/* compiled from: AddEmptyMacroTile.kt */
public final class C4798b extends C10433a {

    /* renamed from: b */
    private final Activity f12005b;

    /* renamed from: c */
    private final C5070a f12006c;

    /* renamed from: d */
    private final C4083b f12007d;

    /* renamed from: e */
    private final String f12008e;

    /* renamed from: f */
    private final int f12009f = C17530R$drawable.ic_plus_circle_white_48dp;

    /* renamed from: g */
    private final long f12010g = 2;

    /* renamed from: h */
    private final int f12011h;

    public C4798b(Activity activity, C5070a aVar, C4083b bVar) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(aVar, "remoteConfig");
        C13706o.m87929f(bVar, "premiumStatusHandler");
        this.f12005b = activity;
        this.f12006c = aVar;
        this.f12007d = bVar;
        String string = activity.getString(C17541R$string.add_macro);
        C13706o.m87928e(string, "activity.getString(R.string.add_macro)");
        this.f12008e = string;
        this.f12011h = ContextCompat.getColor(activity, C17528R$color.primary);
    }

    /* renamed from: a */
    public int mo29331a() {
        return this.f12011h;
    }

    /* renamed from: b */
    public int mo29332b() {
        return this.f12009f;
    }

    /* renamed from: c */
    public long mo29333c() {
        return this.f12010g;
    }

    /* renamed from: e */
    public String mo29334e() {
        return this.f12008e;
    }

    /* renamed from: f */
    public void mo29335f(View view, View view2) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(view2, "iconView");
        int size = C4934n.m18998M().mo29710z().size();
        int f0 = C5163j2.m20151f0(this.f12005b.getApplicationContext());
        if (this.f12007d.mo28009e().mo28008a() || size < f0) {
            Macro macro = new Macro();
            macro.setCompleted(false);
            macro.setName("");
            C4934n.m18998M().mo29699r(macro);
            Intent intent = new Intent(this.f12005b, EditMacroActivity.class);
            intent.putExtra("MacroId", macro.getId());
            intent.putExtra("adding_new_macro", true);
            this.f12005b.startActivity(intent);
            return;
        }
        C4061t1.m15957G0(this.f12005b, this.f12006c);
    }
}