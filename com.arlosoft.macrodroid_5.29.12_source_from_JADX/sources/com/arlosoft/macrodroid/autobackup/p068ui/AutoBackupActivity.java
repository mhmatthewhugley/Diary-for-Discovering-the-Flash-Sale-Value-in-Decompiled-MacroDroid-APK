package com.arlosoft.macrodroid.autobackup.p068ui;

import android.os.Bundle;
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
import p139o1.C7993c;

/* renamed from: com.arlosoft.macrodroid.autobackup.ui.AutoBackupActivity */
/* compiled from: AutoBackupActivity.kt */
public final class AutoBackupActivity extends MacroDroidDaggerBaseActivity {

    /* renamed from: A */
    public static final C3795a f9918A = new C3795a((C13695i) null);

    /* renamed from: s */
    private C7993c f9919s;

    /* renamed from: z */
    public Map<Integer, View> f9920z = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.AutoBackupActivity$a */
    /* compiled from: AutoBackupActivity.kt */
    public static final class C3795a {
        private C3795a() {
        }

        public /* synthetic */ C3795a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: S1 */
    private final void m14887S1() {
        C3801c cVar = new C3801c(this);
        C7993c cVar2 = this.f9919s;
        C7993c cVar3 = null;
        if (cVar2 == null) {
            C13706o.m87945v("binding");
            cVar2 = null;
        }
        cVar2.f19232f.setAdapter(cVar);
        C7993c cVar4 = this.f9919s;
        if (cVar4 == null) {
            C13706o.m87945v("binding");
            cVar4 = null;
        }
        TabLayout tabLayout = cVar4.f19230d;
        C7993c cVar5 = this.f9919s;
        if (cVar5 == null) {
            C13706o.m87945v("binding");
        } else {
            cVar3 = cVar5;
        }
        new TabLayoutMediator(tabLayout, cVar3.f19232f, new C3796a(cVar)).mo59092a();
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public static final void m14888T1(C3801c cVar, TabLayout.Tab tab, int i) {
        C13706o.m87929f(cVar, "$adapter");
        C13706o.m87929f(tab, "tab");
        tab.mo59076r(cVar.mo27327B(i));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C7993c c = C7993c.m33300c(getLayoutInflater());
        C13706o.m87928e(c, "inflate(layoutInflater)");
        this.f9919s = c;
        C7993c cVar = null;
        if (c == null) {
            C13706o.m87945v("binding");
            c = null;
        }
        setContentView((View) c.getRoot());
        C7993c cVar2 = this.f9919s;
        if (cVar2 == null) {
            C13706o.m87945v("binding");
        } else {
            cVar = cVar2;
        }
        setSupportActionBar(cVar.f19231e);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setTitle((int) C17541R$string.auto_backup);
        }
        m14887S1();
    }
}
