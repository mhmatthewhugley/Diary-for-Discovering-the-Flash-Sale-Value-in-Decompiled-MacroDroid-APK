package com.arlosoft.macrodroid.troubleshooting;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.bugreporting.ReportBugActivity;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.logging.systemlog.SystemLogActivity;
import com.arlosoft.macrodroid.troubleshooting.help.C6251c;
import com.arlosoft.macrodroid.troubleshooting.problem.C6279g;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.tasks.Task;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p148q0.C8151a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

/* compiled from: TroubleShootingActivity.kt */
public final class TroubleShootingActivity extends MacroDroidDaggerBaseActivity {

    /* renamed from: s */
    public Map<Integer, View> f14782s = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.TroubleShootingActivity$a */
    /* compiled from: TroubleShootingActivity.kt */
    private final class C6217a extends FragmentStateAdapter {

        /* renamed from: a */
        final /* synthetic */ TroubleShootingActivity f14783a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6217a(TroubleShootingActivity troubleShootingActivity, FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            C13706o.m87929f(fragmentActivity, "fa");
            this.f14783a = troubleShootingActivity;
        }

        public Fragment createFragment(int i) {
            if (i == 0) {
                return new C6279g();
            }
            return new C6251c();
        }

        public int getItemCount() {
            return 2;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.TroubleShootingActivity$b */
    /* compiled from: TroubleShootingActivity.kt */
    static final class C6218b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ TroubleShootingActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6218b(TroubleShootingActivity troubleShootingActivity, C13635d<? super C6218b> dVar) {
            super(3, dVar);
            this.this$0 = troubleShootingActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6218b(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m24271a2();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: Z1 */
    private final void m24270Z1() {
        Button button = (Button) mo32236X1(C17532R$id.reportBugButton);
        C13706o.m87928e(button, "reportBugButton");
        C4666m.m18147o(button, (C13640g) null, new C6218b(this, (C13635d<? super C6218b>) null), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public final void m24271a2() {
        try {
            AppUpdateManager a = AppUpdateManagerFactory.m70404a(this);
            C13706o.m87928e(a, "create(this)");
            Task<AppUpdateInfo> a2 = a.mo59541a();
            C13706o.m87928e(a2, "appUpdateManager.appUpdateInfo");
            a2.mo60018d(new C6224f(this, a));
            a2.mo60016b(new C6223e(this));
        } catch (Exception e) {
            C8151a.m33873n(e);
            m24277g2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public static final void m24272b2(TroubleShootingActivity troubleShootingActivity, AppUpdateManager appUpdateManager, AppUpdateInfo appUpdateInfo) {
        C13706o.m87929f(troubleShootingActivity, "this$0");
        C13706o.m87929f(appUpdateManager, "$appUpdateManager");
        if (appUpdateInfo.mo59537c() == 2) {
            C13706o.m87928e(appUpdateInfo, "appUpdateInfo");
            troubleShootingActivity.m24275e2(appUpdateManager, appUpdateInfo);
            return;
        }
        troubleShootingActivity.m24277g2();
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public static final void m24273c2(TroubleShootingActivity troubleShootingActivity, Exception exc) {
        C13706o.m87929f(troubleShootingActivity, "this$0");
        C8151a.m33873n(exc);
        troubleShootingActivity.m24277g2();
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public static final void m24274d2(TroubleShootingActivity troubleShootingActivity, TabLayout.Tab tab, int i) {
        C13706o.m87929f(troubleShootingActivity, "this$0");
        C13706o.m87929f(tab, "tab");
        tab.mo59076r(troubleShootingActivity.getString(i == 0 ? C17541R$string.troubleshoot_heading_issues_identified : C17541R$string.troubleshoot_common_problems));
        ((ViewPager2) troubleShootingActivity.mo32236X1(C17532R$id.viewPager)).setCurrentItem(tab.mo59065g(), true);
    }

    /* renamed from: e2 */
    private final void m24275e2(AppUpdateManager appUpdateManager, AppUpdateInfo appUpdateInfo) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((int) C17541R$string.report_a_bug);
        builder.setMessage((int) C17541R$string.report_bug_update_required);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6221c(appUpdateManager, appUpdateInfo, this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public static final void m24276f2(AppUpdateManager appUpdateManager, AppUpdateInfo appUpdateInfo, TroubleShootingActivity troubleShootingActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(appUpdateManager, "$appUpdateManager");
        C13706o.m87929f(appUpdateInfo, "$appUpdateInfo");
        C13706o.m87929f(troubleShootingActivity, "this$0");
        appUpdateManager.mo59542b(appUpdateInfo, 1, troubleShootingActivity, 0);
    }

    /* renamed from: g2 */
    private final void m24277g2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((int) C17541R$string.report_a_bug);
        builder.setMessage((int) C17541R$string.report_bug_dialog_info);
        builder.setPositiveButton((int) C17541R$string.report_a_bug, (DialogInterface.OnClickListener) new C6219a(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setNeutralButton((int) C17541R$string.system_log, (DialogInterface.OnClickListener) new C6220b(this));
        try {
            builder.show();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m24278h2(TroubleShootingActivity troubleShootingActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(troubleShootingActivity, "this$0");
        troubleShootingActivity.startActivity(new Intent(troubleShootingActivity, ReportBugActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m24279i2(TroubleShootingActivity troubleShootingActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(troubleShootingActivity, "this$0");
        Intent intent = new Intent(troubleShootingActivity, SystemLogActivity.class);
        intent.addFlags(268435456);
        troubleShootingActivity.startActivity(intent);
    }

    /* renamed from: X1 */
    public View mo32236X1(int i) {
        Map<Integer, View> map = this.f14782s;
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

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.activity_troubleshooting);
        setSupportActionBar((Toolbar) mo32236X1(C17532R$id.toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setTitle((int) C17541R$string.drawer_menu_troubleshooting);
        }
        C6217a aVar = new C6217a(this, this);
        int i = C17532R$id.viewPager;
        ((ViewPager2) mo32236X1(i)).setAdapter(aVar);
        int i2 = C17532R$id.tabLayout;
        ((TabLayout) mo32236X1(i2)).mo58990K(ContextCompat.getColor(this, C17528R$color.white_slight_transparent), ContextCompat.getColor(this, 2131101114));
        ((TabLayout) mo32236X1(i2)).setSelectedTabIndicatorColor(ContextCompat.getColor(this, 2131101114));
        new TabLayoutMediator((TabLayout) mo32236X1(i2), (ViewPager2) mo32236X1(i), new C6222d(this)).mo59092a();
        m24270Z1();
    }
}
