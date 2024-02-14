package com.arlosoft.macrodroid.translations;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17533R$integer;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.translations.data.Translation;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import p058a3.C2227a;
import p139o1.C8015n;

/* compiled from: TranslationsActivity.kt */
public final class TranslationsActivity extends MacroDroidDaggerBaseActivity {

    /* renamed from: A */
    private C8015n f13541A;

    /* renamed from: B */
    public Map<Integer, View> f13542B = new LinkedHashMap();

    /* renamed from: s */
    public C5586f f13543s;

    /* renamed from: z */
    public C2227a f13544z;

    /* renamed from: T1 */
    private final void m21379T1() {
        mo30843X1().mo30883i().observe(this, new C5575c(this));
        mo30843X1().mo30882h().observe(this, new C5574b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public static final void m21380U1(TranslationsActivity translationsActivity, List list) {
        C13706o.m87929f(translationsActivity, "this$0");
        translationsActivity.m21382Y1(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public static final void m21381V1(TranslationsActivity translationsActivity, String str) {
        C13706o.m87929f(translationsActivity, "this$0");
        if (str != null) {
            translationsActivity.m21383Z1(str);
        }
    }

    /* renamed from: Y1 */
    private final void m21382Y1(List<Translation> list) {
        C8015n nVar = null;
        if (list != null) {
            C8015n nVar2 = this.f13541A;
            if (nVar2 == null) {
                C13706o.m87945v("binding");
                nVar2 = null;
            }
            nVar2.f19358b.setLayoutManager(new GridLayoutManager(this, getResources().getInteger(C17533R$integer.tiles_per_row)));
            C8015n nVar3 = this.f13541A;
            if (nVar3 == null) {
                C13706o.m87945v("binding");
                nVar3 = null;
            }
            nVar3.f19358b.setAdapter(new C5583e(list, mo30842W1(), mo30843X1()));
            C8015n nVar4 = this.f13541A;
            if (nVar4 == null) {
                C13706o.m87945v("binding");
                nVar4 = null;
            }
            FrameLayout frameLayout = nVar4.f19359c;
            C13706o.m87928e(frameLayout, "binding.loadingView");
            frameLayout.setVisibility(8);
            C8015n nVar5 = this.f13541A;
            if (nVar5 == null) {
                C13706o.m87945v("binding");
            } else {
                nVar = nVar5;
            }
            RecyclerView recyclerView = nVar.f19358b;
            C13706o.m87928e(recyclerView, "binding.languageEntries");
            recyclerView.setVisibility(0);
            return;
        }
        C8015n nVar6 = this.f13541A;
        if (nVar6 == null) {
            C13706o.m87945v("binding");
        } else {
            nVar = nVar6;
        }
        FrameLayout frameLayout2 = nVar.f19359c;
        C13706o.m87928e(frameLayout2, "binding.loadingView");
        frameLayout2.setVisibility(8);
    }

    /* renamed from: Z1 */
    private final void m21383Z1(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* renamed from: W1 */
    public final C2227a mo30842W1() {
        C2227a aVar = this.f13544z;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("flagProvider");
        return null;
    }

    /* renamed from: X1 */
    public final C5586f mo30843X1() {
        C5586f fVar = this.f13543s;
        if (fVar != null) {
            return fVar;
        }
        C13706o.m87945v("viewModel");
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8015n c = C8015n.m33375c(getLayoutInflater());
        C13706o.m87928e(c, "inflate(layoutInflater)");
        this.f13541A = c;
        if (c == null) {
            C13706o.m87945v("binding");
            c = null;
        }
        setContentView((View) c.getRoot());
        setTitle(C17541R$string.translations);
        setSupportActionBar((Toolbar) findViewById(2131364057));
        ActionBar supportActionBar = getSupportActionBar();
        C13706o.m87926c(supportActionBar);
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        m21379T1();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        onBackPressed();
        return true;
    }
}
