package com.arlosoft.macrodroid.action.activities.httprequest;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.C2966c7;
import com.arlosoft.macrodroid.action.HttpRequestAction;
import com.arlosoft.macrodroid.action.HttpRequestConfig;
import com.arlosoft.macrodroid.action.activities.httprequest.C2868q;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p139o1.C7997e;
import p297ja.C13339u;
import p319lc.C15626c;

/* compiled from: HttpRequestConfigActivity.kt */
public final class HttpRequestConfigActivity extends MacroDroidDaggerBaseActivity {

    /* renamed from: E */
    public static final C2840a f7898E = new C2840a((C13695i) null);

    /* renamed from: A */
    private HttpRequestAction f7899A;

    /* renamed from: B */
    public HttpRequestConfigViewModel f7900B;

    /* renamed from: C */
    private long f7901C;

    /* renamed from: D */
    public Map<Integer, View> f7902D = new LinkedHashMap();

    /* renamed from: s */
    private C7997e f7903s;

    /* renamed from: z */
    private HttpRequestConfig f7904z;

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.HttpRequestConfigActivity$a */
    /* compiled from: HttpRequestConfigActivity.kt */
    public static final class C2840a {
        private C2840a() {
        }

        public /* synthetic */ C2840a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.HttpRequestConfigActivity$b */
    /* compiled from: HttpRequestConfigActivity.kt */
    public final class C2841b extends FragmentPagerAdapter {

        /* renamed from: a */
        private final long f7905a;

        /* renamed from: b */
        final /* synthetic */ HttpRequestConfigActivity f7906b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2841b(HttpRequestConfigActivity httpRequestConfigActivity, FragmentManager fragmentManager, long j) {
            super(fragmentManager);
            C13706o.m87929f(fragmentManager, "fm");
            this.f7906b = httpRequestConfigActivity;
            this.f7905a = j;
        }

        public int getCount() {
            return 4;
        }

        public Fragment getItem(int i) {
            if (i == 0) {
                return C2889x.f7965B.mo26269a(this.f7905a);
            }
            if (i == 1) {
                return C2868q.f7946s.mo26255a(C2868q.C2873c.QUERY_PARAMS, this.f7905a);
            }
            if (i == 2) {
                return C2855k.f7929p.mo26241a(this.f7905a);
            }
            if (i != 3) {
                return C2889x.f7965B.mo26269a(this.f7905a);
            }
            return C2868q.f7946s.mo26255a(C2868q.C2873c.HEADER_PARAMS, this.f7905a);
        }

        public CharSequence getPageTitle(int i) {
            if (i == 0) {
                return this.f7906b.getString(C17541R$string.settings);
            }
            if (i == 1) {
                return this.f7906b.getString(C17541R$string.http_request_query_params);
            }
            if (i != 2) {
                return i != 3 ? "" : this.f7906b.getString(C17541R$string.http_request_header_params);
            }
            return this.f7906b.getString(C17541R$string.http_request_content_body);
        }
    }

    /* renamed from: X1 */
    private final void m14026X1() {
        mo26200b2().mo26210h().observe(this, new C2848d(this));
        mo26200b2().mo26213k().observe(this, new C2849e(this));
        mo26200b2().mo26211i().observe(this, new C2846c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public static final void m14027Y1(HttpRequestConfigActivity httpRequestConfigActivity, C13339u uVar) {
        C13706o.m87929f(httpRequestConfigActivity, "this$0");
        httpRequestConfigActivity.setResult(-1);
        httpRequestConfigActivity.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public static final void m14028Z1(HttpRequestConfigActivity httpRequestConfigActivity, C13339u uVar) {
        C13706o.m87929f(httpRequestConfigActivity, "this$0");
        httpRequestConfigActivity.m14032e2();
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public static final void m14029a2(HttpRequestConfigActivity httpRequestConfigActivity, String str) {
        C13706o.m87929f(httpRequestConfigActivity, "this$0");
        if (str != null) {
            httpRequestConfigActivity.m14031d2(str);
        }
    }

    /* renamed from: c2 */
    private final void m14030c2() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C13706o.m87928e(supportFragmentManager, "supportFragmentManager");
        C2841b bVar = new C2841b(this, supportFragmentManager, this.f7901C);
        C7997e eVar = this.f7903s;
        C7997e eVar2 = null;
        if (eVar == null) {
            C13706o.m87945v("binding");
            eVar = null;
        }
        eVar.f19251e.setAdapter(bVar);
        C7997e eVar3 = this.f7903s;
        if (eVar3 == null) {
            C13706o.m87945v("binding");
            eVar3 = null;
        }
        eVar3.f19251e.setOffscreenPageLimit(8);
        C7997e eVar4 = this.f7903s;
        if (eVar4 == null) {
            C13706o.m87945v("binding");
        } else {
            eVar2 = eVar4;
        }
        eVar2.f19249c.setupWithViewPager((ViewPager) mo26199W1(C17532R$id.viewPager));
    }

    /* renamed from: d2 */
    private final void m14031d2(String str) {
        C15626c.m94876a(this, str, 1).show();
    }

    /* renamed from: e2 */
    private final void m14032e2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog_Action);
        builder.setTitle((int) C17541R$string.action_http_request);
        builder.setMessage((int) C17541R$string.do_you_wish_to_save_changes);
        builder.setPositiveButton((int) C17541R$string.save, (DialogInterface.OnClickListener) new C2842a(this));
        builder.setNeutralButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton((int) C17541R$string.discard, (DialogInterface.OnClickListener) new C2844b(this));
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public static final void m14033f2(HttpRequestConfigActivity httpRequestConfigActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(httpRequestConfigActivity, "this$0");
        httpRequestConfigActivity.mo26200b2().mo26215m();
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public static final void m14034g2(HttpRequestConfigActivity httpRequestConfigActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(httpRequestConfigActivity, "this$0");
        httpRequestConfigActivity.setResult(0);
        httpRequestConfigActivity.finish();
    }

    /* renamed from: W1 */
    public View mo26199W1(int i) {
        Map<Integer, View> map = this.f7902D;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b2 */
    public final HttpRequestConfigViewModel mo26200b2() {
        HttpRequestConfigViewModel httpRequestConfigViewModel = this.f7900B;
        if (httpRequestConfigViewModel != null) {
            return httpRequestConfigViewModel;
        }
        C13706o.m87945v("viewModel");
        return null;
    }

    public void onBackPressed() {
        mo26200b2().mo26214l();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C7997e c = C7997e.m33313c(getLayoutInflater());
        C13706o.m87928e(c, "inflate(layoutInflater)");
        this.f7903s = c;
        C7997e eVar = null;
        if (c == null) {
            C13706o.m87945v("binding");
            c = null;
        }
        setContentView((View) c.getRoot());
        this.f7901C = getIntent().getLongExtra("MacroGuid", 0);
        C7997e eVar2 = this.f7903s;
        if (eVar2 == null) {
            C13706o.m87945v("binding");
        } else {
            eVar = eVar2;
        }
        setSupportActionBar(eVar.f19250d);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setTitle((int) C17541R$string.action_http_request);
        }
        getLifecycle().addObserver(mo26200b2());
        Parcelable parcelableExtra = getIntent().getParcelableExtra("http_request_config");
        C13706o.m87926c(parcelableExtra);
        this.f7904z = (HttpRequestConfig) parcelableExtra;
        HttpRequestAction a = C2966c7.f8098a.mo26350a();
        C13706o.m87926c(a);
        this.f7899A = a;
        m14030c2();
        m14026X1();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C13706o.m87929f(menu, "menu");
        getMenuInflater().inflate(C17536R$menu.http_request_config_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            mo26200b2().mo26214l();
        } else if (itemId == 2131363255) {
            mo26200b2().mo26215m();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
