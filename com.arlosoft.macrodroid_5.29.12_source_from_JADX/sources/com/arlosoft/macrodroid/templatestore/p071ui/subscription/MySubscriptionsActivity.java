package com.arlosoft.macrodroid.templatestore.p071ui.subscription;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p139o1.C8009k;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.MySubscriptionsActivity */
/* compiled from: MySubscriptionsActivity.kt */
public final class MySubscriptionsActivity extends MacroDroidDaggerBaseActivity {

    /* renamed from: A */
    public static final C5347a f13200A = new C5347a((C13695i) null);

    /* renamed from: s */
    private C8009k f13201s;

    /* renamed from: z */
    public Map<Integer, View> f13202z = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.MySubscriptionsActivity$a */
    /* compiled from: MySubscriptionsActivity.kt */
    public static final class C5347a {
        private C5347a() {
        }

        public /* synthetic */ C5347a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final void mo30537a(Activity activity) {
            C13706o.m87929f(activity, "activity");
            activity.startActivity(new Intent(activity, MySubscriptionsActivity.class));
        }
    }

    /* renamed from: S1 */
    private final void m20735S1() {
        C5349b bVar = new C5349b(this);
        C8009k kVar = this.f13201s;
        C8009k kVar2 = null;
        if (kVar == null) {
            C13706o.m87945v("binding");
            kVar = null;
        }
        kVar.f19325f.setAdapter(bVar);
        C8009k kVar3 = this.f13201s;
        if (kVar3 == null) {
            C13706o.m87945v("binding");
            kVar3 = null;
        }
        TabLayout tabLayout = kVar3.f19323d;
        C8009k kVar4 = this.f13201s;
        if (kVar4 == null) {
            C13706o.m87945v("binding");
        } else {
            kVar2 = kVar4;
        }
        new TabLayoutMediator(tabLayout, kVar2.f19325f, new C5348a(bVar)).mo59092a();
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public static final void m20736T1(C5349b bVar, TabLayout.Tab tab, int i) {
        C13706o.m87929f(bVar, "$adapter");
        C13706o.m87929f(tab, "tab");
        tab.mo59076r(bVar.mo30538B(i));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8009k c = C8009k.m33354c(getLayoutInflater());
        C13706o.m87928e(c, "inflate(layoutInflater)");
        this.f13201s = c;
        C8009k kVar = null;
        if (c == null) {
            C13706o.m87945v("binding");
            c = null;
        }
        setContentView((View) c.getRoot());
        C8009k kVar2 = this.f13201s;
        if (kVar2 == null) {
            C13706o.m87945v("binding");
        } else {
            kVar = kVar2;
        }
        setSupportActionBar(kVar.f19324e);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setTitle((int) C17541R$string.my_subscriptions);
        }
        m20735S1();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
