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
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.remoteconfig.C5070a;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.wizard.WizardActivity;
import kotlin.jvm.internal.C13706o;
import p198z1.C10433a;

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.c */
/* compiled from: AddWizardMacroTile.kt */
public final class C4799c extends C10433a {

    /* renamed from: b */
    private final Activity f12012b;

    /* renamed from: c */
    private final C5070a f12013c;

    /* renamed from: d */
    private final C4083b f12014d;

    /* renamed from: e */
    private final String f12015e;

    /* renamed from: f */
    private final int f12016f = C17530R$drawable.ic_wizard;

    /* renamed from: g */
    private final long f12017g = 18;

    /* renamed from: h */
    private final int f12018h;

    public C4799c(Activity activity, C5070a aVar, C4083b bVar) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(aVar, "remoteConfig");
        C13706o.m87929f(bVar, "premiumStatusHandler");
        this.f12012b = activity;
        this.f12013c = aVar;
        this.f12014d = bVar;
        String string = activity.getString(C17541R$string.add_macro_wizard);
        C13706o.m87928e(string, "activity.getString(R.string.add_macro_wizard)");
        this.f12015e = string;
        this.f12018h = ContextCompat.getColor(activity, C17528R$color.trigger_primary);
    }

    /* renamed from: a */
    public int mo29331a() {
        return this.f12018h;
    }

    /* renamed from: b */
    public int mo29332b() {
        return this.f12016f;
    }

    /* renamed from: c */
    public long mo29333c() {
        return this.f12017g;
    }

    /* renamed from: e */
    public String mo29334e() {
        return this.f12015e;
    }

    /* renamed from: f */
    public void mo29335f(View view, View view2) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(view2, "iconView");
        int size = C4934n.m18998M().mo29710z().size();
        int f0 = C5163j2.m20151f0(this.f12012b.getApplicationContext());
        if (this.f12014d.mo28009e().mo28008a() || size < f0) {
            this.f12012b.startActivity(new Intent(this.f12012b, WizardActivity.class));
            return;
        }
        C4061t1.m15957G0(this.f12012b, this.f12013c);
    }
}
