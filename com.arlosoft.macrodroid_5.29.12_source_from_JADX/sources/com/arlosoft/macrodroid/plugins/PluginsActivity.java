package com.arlosoft.macrodroid.plugins;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.avatar.views.AvatarView;
import com.arlosoft.macrodroid.common.C4013g;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.extensions.C4656c;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.plugins.C5012h;
import com.arlosoft.macrodroid.plugins.data.AppBrainPackageInfo;
import com.arlosoft.macrodroid.plugins.pluginlist.C5039j;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.templatestore.model.User;
import com.arlosoft.macrodroid.templatestore.p071ui.profile.C5331h;
import com.arlosoft.macrodroid.templatestore.p071ui.profile.ProfileActivity;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import com.arlosoft.macrodroid.user.signin.C6353g;
import com.arlosoft.macrodroid.utils.C6370c0;
import com.firebase.p073ui.auth.FirebaseUiException;
import com.firebase.p073ui.auth.IdpResponse;
import com.google.android.material.snackbar.SnackbarAnimate;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15478k0;
import p058a3.C2227a;
import p063b5.C2253f;
import p083e4.C7271c;
import p148q0.C8151a;
import p176v0.C10312a;
import p187x0.C10351d;
import p245de.mustafagercek.library.LoadingButton;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16254a;
import p370qa.C16270q;
import p448z9.C17070a;

/* compiled from: PluginsActivity.kt */
public final class PluginsActivity extends MacroDroidDaggerBaseActivity {

    /* renamed from: A */
    public C5527g f12531A;

    /* renamed from: B */
    public C6353g f12532B;

    /* renamed from: C */
    public C2227a f12533C;

    /* renamed from: D */
    public C5012h f12534D;

    /* renamed from: E */
    public C5331h f12535E;

    /* renamed from: F */
    public C4083b f12536F;

    /* renamed from: G */
    private C17070a f12537G;

    /* renamed from: H */
    private AppCompatDialog f12538H;

    /* renamed from: I */
    private AppCompatDialog f12539I;

    /* renamed from: J */
    public Map<Integer, View> f12540J = new LinkedHashMap();

    /* renamed from: s */
    private C4968a f12541s;

    /* renamed from: z */
    public C10312a f12542z;

    /* renamed from: com.arlosoft.macrodroid.plugins.PluginsActivity$a */
    /* compiled from: PluginsActivity.kt */
    private final class C4968a extends FragmentStateAdapter {

        /* renamed from: a */
        private final C6370c0 f12543a = new C6370c0();

        /* renamed from: c */
        final /* synthetic */ PluginsActivity f12544c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4968a(PluginsActivity pluginsActivity, FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            C13706o.m87929f(fragmentActivity, "fa");
            this.f12544c = pluginsActivity;
        }

        /* renamed from: B */
        private final int m19323B(int i) {
            return i == 0 ? 0 : 1;
        }

        /* renamed from: C */
        public final void mo29765C() {
            this.f12543a.notifyObservers();
        }

        public Fragment createFragment(int i) {
            C5039j a = C5039j.f12633z.mo29913a(m19323B(i));
            this.f12543a.addObserver(a);
            return a;
        }

        public int getItemCount() {
            return 2;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.PluginsActivity$b */
    /* compiled from: PluginsActivity.kt */
    public /* synthetic */ class C4969b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12545a;

        static {
            int[] iArr = new int[C5012h.C5023c.values().length];
            iArr[C5012h.C5023c.ALREADY_EXISTS.ordinal()] = 1;
            iArr[C5012h.C5023c.USER_NOT_ALLOWED.ordinal()] = 2;
            f12545a = iArr;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.PluginsActivity$c */
    /* compiled from: PluginsActivity.kt */
    static final class C4970c extends C13708q implements C16254a<C13339u> {
        final /* synthetic */ PluginsActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4970c(PluginsActivity pluginsActivity) {
            super(0);
            this.this$0 = pluginsActivity;
        }

        public final void invoke() {
            this.this$0.mo29761e2().mo40935j();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.PluginsActivity$d */
    /* compiled from: PluginsActivity.kt */
    static final class C4971d extends C13708q implements C16254a<C13339u> {
        final /* synthetic */ PluginsActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4971d(PluginsActivity pluginsActivity) {
            super(0);
            this.this$0 = pluginsActivity;
        }

        public final void invoke() {
            this.this$0.mo29762f2().mo32405s(this.this$0);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.PluginsActivity$e */
    /* compiled from: PluginsActivity.kt */
    public static final class C4972e implements C6353g.C6355b {

        /* renamed from: a */
        final /* synthetic */ PluginsActivity f12546a;

        C4972e(PluginsActivity pluginsActivity) {
            this.f12546a = pluginsActivity;
        }

        /* renamed from: a */
        public void mo27362a() {
        }

        /* renamed from: b */
        public void mo27363b(User user) {
            C13706o.m87929f(user, "user");
            this.f12546a.mo29764h2().mo29887u();
            this.f12546a.m19303n2(user);
        }

        /* renamed from: c */
        public void mo27364c() {
            FrameLayout frameLayout = (FrameLayout) this.f12546a.mo29758X1(C17532R$id.loadingBlocker);
            C13706o.m87928e(frameLayout, "loadingBlocker");
            frameLayout.setVisibility(0);
        }

        /* renamed from: d */
        public void mo27365d() {
            this.f12546a.m19286A2();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.PluginsActivity$f */
    /* compiled from: PluginsActivity.kt */
    static final class C4973f extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ String $applicationName;
        final /* synthetic */ Drawable $icon;
        final /* synthetic */ String $packageName;
        final /* synthetic */ AppCompatDialog $submitNewPluginDialog;
        int label;
        final /* synthetic */ PluginsActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4973f(AppCompatDialog appCompatDialog, PluginsActivity pluginsActivity, String str, String str2, Drawable drawable, C13635d<? super C4973f> dVar) {
            super(3, dVar);
            this.$submitNewPluginDialog = appCompatDialog;
            this.this$0 = pluginsActivity;
            this.$packageName = str;
            this.$applicationName = str2;
            this.$icon = drawable;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4973f(this.$submitNewPluginDialog, this.this$0, this.$packageName, this.$applicationName, this.$icon, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                String valueOf = String.valueOf(((TextInputEditText) this.$submitNewPluginDialog.findViewById(C17532R$id.apkDownloadLink)).getText());
                AppCompatDialog appCompatDialog = this.$submitNewPluginDialog;
                int i = C17532R$id.descriptionText;
                String valueOf2 = String.valueOf(((TextInputEditText) ((TextInputEditText) appCompatDialog.findViewById(i)).findViewById(i)).getText());
                if (!URLUtil.isValidUrl(valueOf)) {
                    C15626c.makeText(this.this$0.getApplicationContext(), C17541R$string.please_enter_valid_apk_download_link, 1).show();
                } else if (valueOf2.length() < 20) {
                    C15626c.makeText(this.this$0.getApplicationContext(), C17541R$string.invalid_plugin_name_or_description, 1).show();
                } else {
                    this.this$0.mo29764h2().mo29889w(this.$packageName, this.$applicationName, "", valueOf2, "", valueOf, (String) null, this.$icon);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.PluginsActivity$g */
    /* compiled from: PluginsActivity.kt */
    static final class C4974g extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $submitNewPluginDialog;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4974g(AppCompatDialog appCompatDialog, C13635d<? super C4974g> dVar) {
            super(3, dVar);
            this.$submitNewPluginDialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4974g(this.$submitNewPluginDialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$submitNewPluginDialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public final void m19286A2() {
        FrameLayout frameLayout = (FrameLayout) mo29758X1(C17532R$id.loadingBlocker);
        C13706o.m87928e(frameLayout, "loadingBlocker");
        frameLayout.setVisibility(8);
        SnackbarAnimate h = SnackbarAnimate.m69573h((CoordinatorLayout) mo29758X1(C17532R$id.coordinator_layout), C17541R$string.could_not_sign_in, 0);
        C13706o.m87928e(h, "make(coordinator_layout,…ckbarAnimate.LENGTH_LONG)");
        h.mo58921e().setBackgroundResource(C17528R$color.snack_bar_error);
        View findViewById = h.mo58921e().findViewById(2131363815);
        C13706o.m87927d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setTextColor(-1);
        h.mo58932r();
    }

    /* renamed from: B2 */
    private final void m19287B2(String str) {
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = getPackageManager().getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        String obj = applicationInfo != null ? getPackageManager().getApplicationLabel(applicationInfo).toString() : "(unknown)";
        Drawable applicationIcon = getPackageManager().getApplicationIcon(str);
        C13706o.m87928e(applicationIcon, "packageManager.getApplicationIcon(packageName)");
        AppCompatDialog appCompatDialog = new AppCompatDialog(this, C17542R$style.Theme_App_Dialog_Plugins);
        appCompatDialog.setCancelable(false);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_submit_plugin);
        appCompatDialog.setTitle((int) C17541R$string.submit_new_plugin);
        C4656c.m18115d(appCompatDialog, 0, 1, (Object) null);
        ((ImageView) appCompatDialog.findViewById(C17532R$id.appIcon)).setImageDrawable(applicationIcon);
        ((TextView) appCompatDialog.findViewById(C17532R$id.appName)).setText(obj);
        ((TextView) appCompatDialog.findViewById(C17532R$id.packageName)).setText(str);
        appCompatDialog.show();
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        C13706o.m87928e(button, "submitNewPluginDialog.okButton");
        C4666m.m18147o(button, (C13640g) null, new C4973f(appCompatDialog, this, str, obj, applicationIcon, (C13635d<? super C4973f>) null), 1, (Object) null);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        if (button2 != null) {
            C4666m.m18147o(button2, (C13640g) null, new C4974g(appCompatDialog, (C13635d<? super C4974g>) null), 1, (Object) null);
        }
        C4656c.m18114c(appCompatDialog, 0);
    }

    /* renamed from: a2 */
    private final void m19296a2() {
        mo29764h2().mo29886t().observe(this, new C5007d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public static final void m19297b2(PluginsActivity pluginsActivity, C5012h.C5014b bVar) {
        C13706o.m87929f(pluginsActivity, "this$0");
        if (bVar == null) {
            return;
        }
        if (bVar instanceof C5012h.C5014b.C5019e) {
            FrameLayout frameLayout = (FrameLayout) pluginsActivity.mo29758X1(C17532R$id.loadingBlocker);
            C13706o.m87928e(frameLayout, "loadingBlocker");
            frameLayout.setVisibility(0);
        } else if (bVar instanceof C5012h.C5014b.C5018d) {
            pluginsActivity.m19306q2(((C5012h.C5014b.C5018d) bVar).mo29892a(), pluginsActivity.mo29763g2().mo30790b());
        } else if (bVar instanceof C5012h.C5014b.C5021g) {
            pluginsActivity.m19301l2(((C5012h.C5014b.C5021g) bVar).mo29894a());
        } else if (bVar instanceof C5012h.C5014b.C5022h) {
            pluginsActivity.m19302m2(((C5012h.C5014b.C5022h) bVar).mo29895a());
        } else if (bVar instanceof C5012h.C5014b.C5020f) {
            pluginsActivity.m19314y2(((C5012h.C5014b.C5020f) bVar).mo29893a());
        } else if (bVar instanceof C5012h.C5014b.C5015a) {
            pluginsActivity.m19308s2();
        } else if (bVar instanceof C5012h.C5014b.C5017c) {
            pluginsActivity.m19300k2(((C5012h.C5014b.C5017c) bVar).mo29891a());
        } else if (bVar instanceof C5012h.C5014b.C5016b) {
            pluginsActivity.m19299j2();
        }
    }

    /* renamed from: i2 */
    private final void m19298i2() {
        if (!mo29759c2().mo28009e().mo28008a()) {
            String string = getString(C17541R$string.sorry_pro_users_only_submit_plugins);
            C13706o.m87928e(string, "getString(R.string.sorry…sers_only_submit_plugins)");
            String string2 = getString(C17541R$string.upgrade);
            C13706o.m87928e(string2, "getString(R.string.upgrade)");
            m19309t2(string, string2, new C4970c(this));
        } else if (mo29763g2().mo30790b().isGuest()) {
            String string3 = getString(C17541R$string.please_sign_in_to_submit_and_rate_new_plugins);
            C13706o.m87928e(string3, "getString(R.string.pleas…mit_and_rate_new_plugins)");
            String string4 = getString(C17541R$string.sign_in);
            C13706o.m87928e(string4, "getString(R.string.sign_in)");
            m19309t2(string3, string4, new C4971d(this));
        } else {
            mo29764h2().mo29885s();
        }
    }

    /* renamed from: j2 */
    private final void m19299j2() {
        FrameLayout frameLayout = (FrameLayout) mo29758X1(C17532R$id.loadingBlocker);
        C13706o.m87928e(frameLayout, "loadingBlocker");
        frameLayout.setVisibility(8);
        SnackbarAnimate h = SnackbarAnimate.m69573h((CoordinatorLayout) mo29758X1(C17532R$id.coordinator_layout), C17541R$string.macrodroid_error, 0);
        C13706o.m87928e(h, "make(coordinator_layout,…ckbarAnimate.LENGTH_LONG)");
        h.mo58921e().setBackgroundResource(C17528R$color.snack_bar_error);
        View findViewById = h.mo58921e().findViewById(2131363815);
        C13706o.m87927d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setTextColor(-1);
        h.mo58932r();
    }

    /* renamed from: k2 */
    private final void m19300k2(String str) {
        FrameLayout frameLayout = (FrameLayout) mo29758X1(C17532R$id.loadingBlocker);
        C13706o.m87928e(frameLayout, "loadingBlocker");
        frameLayout.setVisibility(8);
        m19287B2(str);
    }

    /* renamed from: l2 */
    private final void m19301l2(String str) {
        AppCompatDialog appCompatDialog = this.f12539I;
        if (appCompatDialog != null) {
            appCompatDialog.dismiss();
        }
        Context applicationContext = getApplicationContext();
        C13696i0 i0Var = C13696i0.f61931a;
        String string = getString(C17541R$string.uploaded);
        C13706o.m87928e(string, "getString(R.string.uploaded)");
        String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        C13706o.m87928e(format, "format(format, *args)");
        C15626c.m94876a(applicationContext, format, 1).show();
        C4968a aVar = this.f12541s;
        if (aVar == null) {
            C13706o.m87945v("pagerAdapter");
            aVar = null;
        }
        aVar.mo29765C();
    }

    /* renamed from: m2 */
    private final void m19302m2(C5012h.C5023c cVar) {
        LoadingButton loadingButton;
        AppCompatDialog appCompatDialog = this.f12539I;
        if (!(appCompatDialog == null || (loadingButton = (LoadingButton) appCompatDialog.findViewById(C17532R$id.submitButton)) == null)) {
            loadingButton.mo67472c();
        }
        int i = C4969b.f12545a[cVar.ordinal()];
        if (i == 1) {
            m19311v2();
            AppCompatDialog appCompatDialog2 = this.f12539I;
            if (appCompatDialog2 != null) {
                appCompatDialog2.dismiss();
            }
        } else if (i != 2) {
            C15626c.m94876a(getApplicationContext(), getString(C17541R$string.upload_failed), 1).show();
        } else {
            C15626c.m94876a(getApplicationContext(), getString(C17541R$string.not_allowed_to_submit_plugins), 1).show();
            AppCompatDialog appCompatDialog3 = this.f12539I;
            if (appCompatDialog3 != null) {
                appCompatDialog3.dismiss();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public final void m19303n2(User user) {
        try {
            String string = getString(C17541R$string.templates_signed_in_popup, new Object[]{user.getUsername()});
            C13706o.m87928e(string, "getString(R.string.templ…_in_popup, user.username)");
            C15626c.m94876a(getApplicationContext(), string, 1).show();
        } catch (Exception e) {
            C8151a.m33873n(e);
        }
    }

    /* renamed from: o2 */
    private final void m19304o2() {
        this.f12541s = new C4968a(this, this);
        int i = C17532R$id.viewPager;
        ViewPager2 viewPager2 = (ViewPager2) mo29758X1(i);
        C4968a aVar = this.f12541s;
        if (aVar == null) {
            C13706o.m87945v("pagerAdapter");
            aVar = null;
        }
        viewPager2.setAdapter(aVar);
        ((ViewPager2) mo29758X1(i)).setOffscreenPageLimit(3);
        int i2 = C17532R$id.tabBar;
        ((TabLayout) mo29758X1(i2)).mo58990K(ContextCompat.getColor(this, 2131101114), ContextCompat.getColor(this, 2131101114));
        ((TabLayout) mo29758X1(i2)).setSelectedTabIndicatorColor(ContextCompat.getColor(this, 2131101114));
        new TabLayoutMediator((TabLayout) mo29758X1(i2), (ViewPager2) mo29758X1(i), new C5009e(this)).mo59092a();
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m19305p2(PluginsActivity pluginsActivity, TabLayout.Tab tab, int i) {
        C13706o.m87929f(pluginsActivity, "this$0");
        C13706o.m87929f(tab, "tab");
        tab.mo59076r(pluginsActivity.getString(i == 0 ? C17541R$string.template_store_top_rated : C17541R$string.template_store_latest));
        ((ViewPager2) pluginsActivity.mo29758X1(C17532R$id.viewPager)).setCurrentItem(tab.mo59065g(), true);
    }

    /* renamed from: q2 */
    private final void m19306q2(AppBrainPackageInfo appBrainPackageInfo, User user) {
        FrameLayout frameLayout = (FrameLayout) mo29758X1(C17532R$id.loadingBlocker);
        C13706o.m87928e(frameLayout, "loadingBlocker");
        frameLayout.setVisibility(8);
        AppCompatDialog appCompatDialog = this.f12538H;
        if (appCompatDialog != null) {
            appCompatDialog.dismiss();
        }
        AppCompatDialog appCompatDialog2 = new AppCompatDialog(this, C17542R$style.Theme_App_Dialog_SubmitPlugin);
        appCompatDialog2.setTitle((int) C17541R$string.submit_new_plugin);
        appCompatDialog2.setCancelable(true);
        appCompatDialog2.setContentView((int) C17535R$layout.dialog_plugin_app_info);
        appCompatDialog2.show();
        ((TextView) appCompatDialog2.findViewById(C17532R$id.pluginName)).setText(appBrainPackageInfo.getName());
        ((TextView) appCompatDialog2.findViewById(C17532R$id.developerName)).setText(appBrainPackageInfo.getDeveloperName());
        ((TextView) appCompatDialog2.findViewById(C17532R$id.description)).setText(appBrainPackageInfo.getShortDescription());
        ((TextView) appCompatDialog2.findViewById(C17532R$id.link)).setText("https://play.google.com/store/apps/details?id=" + appBrainPackageInfo.getPackageName());
        C5331h d2 = mo29760d2();
        AvatarView avatarView = (AvatarView) appCompatDialog2.findViewById(C17532R$id.avatarImage);
        C13706o.m87928e(avatarView, "avatarImage");
        d2.mo30528b(avatarView, user.getImage(), user.getUsername());
        ((TextView) appCompatDialog2.findViewById(C17532R$id.usernameEdit)).setText(user.getUsername());
        ((TextView) appCompatDialog2.findViewById(C17532R$id.commentCount)).setText("0");
        ((TextView) appCompatDialog2.findViewById(C17532R$id.timeLabel)).setText(String.valueOf(DateUtils.getRelativeTimeSpanString(System.currentTimeMillis(), Calendar.getInstance().getTimeInMillis(), 60000)));
        C7271c.m30018u(this).mo37188r(Uri.parse(appBrainPackageInfo.getIconUrl())).mo24491a(new C2253f().mo24503h()).mo37169G0((ImageView) appCompatDialog2.findViewById(C17532R$id.pluginIcon));
        C4656c.m18114c(appCompatDialog2, getResources().getDimensionPixelOffset(C17529R$dimen.margin_medium));
        ((LoadingButton) appCompatDialog2.findViewById(C17532R$id.submitButton)).setButtonOnClickListener(new C4976b(appCompatDialog2, appBrainPackageInfo, this));
        this.f12539I = appCompatDialog2;
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public static final void m19307r2(AppCompatDialog appCompatDialog, AppBrainPackageInfo appBrainPackageInfo, PluginsActivity pluginsActivity, View view) {
        C13706o.m87929f(appCompatDialog, "$this_apply");
        C13706o.m87929f(appBrainPackageInfo, "$appInfo");
        C13706o.m87929f(pluginsActivity, "this$0");
        ((LoadingButton) appCompatDialog.findViewById(C17532R$id.submitButton)).mo67471b();
        pluginsActivity.mo29764h2().mo29889w(appBrainPackageInfo.getPackageName(), appBrainPackageInfo.getName(), appBrainPackageInfo.getDeveloperName(), appBrainPackageInfo.getShortDescription(), appBrainPackageInfo.getWebsite(), "https://play.google.com/store/apps/details?id=" + appBrainPackageInfo.getPackageName(), appBrainPackageInfo.getIconUrl(), (Drawable) null);
    }

    /* renamed from: s2 */
    private final void m19308s2() {
        FrameLayout frameLayout = (FrameLayout) mo29758X1(C17532R$id.loadingBlocker);
        C13706o.m87928e(frameLayout, "loadingBlocker");
        frameLayout.setVisibility(8);
        SnackbarAnimate h = SnackbarAnimate.m69573h((CoordinatorLayout) mo29758X1(C17532R$id.coordinator_layout), C17541R$string.check_connection_try_again, 0);
        C13706o.m87928e(h, "make(coordinator_layout,…ckbarAnimate.LENGTH_LONG)");
        h.mo58921e().setBackgroundResource(C17528R$color.snack_bar_error);
        View findViewById = h.mo58921e().findViewById(2131363815);
        C13706o.m87927d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setTextColor(-1);
        h.mo58932r();
    }

    /* renamed from: t2 */
    private final void m19309t2(String str, String str2, C16254a<C13339u> aVar) {
        SnackbarAnimate i = SnackbarAnimate.m69574i((CoordinatorLayout) mo29758X1(C17532R$id.coordinator_layout), str, SamsungIrisUnlockModule.IRIS_ERROR_NEED_TO_RETRY);
        C13706o.m87928e(i, "make(coordinator_layout, errorMessage, 5000)");
        i.mo58921e().setBackgroundResource(2131100690);
        View findViewById = i.mo58921e().findViewById(2131363815);
        C13706o.m87927d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setTextColor(-1);
        View findViewById2 = i.mo58921e().findViewById(2131363814);
        C13706o.m87927d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setTextColor(-1);
        i.mo58927m(str2, new C4977c(aVar));
        i.mo58932r();
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public static final void m19310u2(C16254a aVar, View view) {
        C13706o.m87929f(aVar, "$action");
        aVar.invoke();
    }

    /* renamed from: v2 */
    private final void m19311v2() {
        FrameLayout frameLayout = (FrameLayout) mo29758X1(C17532R$id.loadingBlocker);
        C13706o.m87928e(frameLayout, "loadingBlocker");
        frameLayout.setVisibility(8);
        SnackbarAnimate h = SnackbarAnimate.m69573h((CoordinatorLayout) mo29758X1(C17532R$id.coordinator_layout), C17541R$string.plugin_already_exists, 0);
        C13706o.m87928e(h, "make(coordinator_layout,…ckbarAnimate.LENGTH_LONG)");
        h.mo58921e().setBackgroundResource(C17528R$color.snack_bar_error);
        View findViewById = h.mo58921e().findViewById(2131363815);
        C13706o.m87927d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setTextColor(-1);
        h.mo58932r();
    }

    /* renamed from: w2 */
    private final void m19312w2() {
        if (C5163j2.m20049R1(this)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle((int) C17541R$string.home_screen_tile_plugins);
            builder.setMessage((int) C17541R$string.plugin_dialog_info_text);
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) C4975a.f12547a);
            builder.show();
            C5163j2.m19952D5(this, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public static final void m19313x2(DialogInterface dialogInterface, int i) {
        C13706o.m87929f(dialogInterface, "dialog");
        dialogInterface.dismiss();
    }

    /* renamed from: y2 */
    private final AlertDialog m19314y2(List<? extends C4013g> list) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(this, C17542R$style.Theme_App_Dialog_Template);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_app_chooser);
        appCompatDialog.setTitle((int) C17541R$string.select_plugin);
        ViewGroup viewGroup = (ViewGroup) appCompatDialog.findViewById(C17532R$id.button_bar);
        ListView listView = (ListView) appCompatDialog.findViewById(C17532R$id.application_list);
        SearchView searchView = (SearchView) appCompatDialog.findViewById(C17532R$id.search_view);
        if (searchView != null) {
            searchView.setVisibility(8);
        }
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        C10351d dVar = new C10351d(this, new ArrayList(list), (List<Boolean>) null, new C5010f(this, appCompatDialog));
        if (listView != null) {
            listView.setAdapter(dVar);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = appCompatDialog.getWindow();
        C13706o.m87926c(window);
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        appCompatDialog.show();
        Window window2 = appCompatDialog.getWindow();
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public static final void m19315z2(PluginsActivity pluginsActivity, AppCompatDialog appCompatDialog, C4013g gVar) {
        C13706o.m87929f(pluginsActivity, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        C13706o.m87929f(gVar, "appInfo");
        C5012h h2 = pluginsActivity.mo29764h2();
        String str = gVar.f10397b;
        C13706o.m87928e(str, "appInfo.packageName");
        h2.mo29888v(str);
        appCompatDialog.dismiss();
    }

    /* renamed from: X1 */
    public View mo29758X1(int i) {
        Map<Integer, View> map = this.f12540J;
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

    /* renamed from: c2 */
    public final C4083b mo29759c2() {
        C4083b bVar = this.f12536F;
        if (bVar != null) {
            return bVar;
        }
        C13706o.m87945v("premiumStatusHandler");
        return null;
    }

    /* renamed from: d2 */
    public final C5331h mo29760d2() {
        C5331h hVar = this.f12535E;
        if (hVar != null) {
            return hVar;
        }
        C13706o.m87945v("profileImageProvider");
        return null;
    }

    /* renamed from: e2 */
    public final C10312a mo29761e2() {
        C10312a aVar = this.f12542z;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("screenLoader");
        return null;
    }

    /* renamed from: f2 */
    public final C6353g mo29762f2() {
        C6353g gVar = this.f12532B;
        if (gVar != null) {
            return gVar;
        }
        C13706o.m87945v("signInHelper");
        return null;
    }

    /* renamed from: g2 */
    public final C5527g mo29763g2() {
        C5527g gVar = this.f12531A;
        if (gVar != null) {
            return gVar;
        }
        C13706o.m87945v("userProvider");
        return null;
    }

    /* renamed from: h2 */
    public final C5012h mo29764h2() {
        C5012h hVar = this.f12534D;
        if (hVar != null) {
            return hVar;
        }
        C13706o.m87945v("viewModel");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C17070a aVar;
        super.onActivityResult(i, i2, intent);
        IdpResponse g = IdpResponse.m25763g(intent);
        if (i == 9729) {
            Integer num = null;
            if (i2 == -1) {
                C6353g f2 = mo29762f2();
                C17070a aVar2 = this.f12537G;
                if (aVar2 == null) {
                    C13706o.m87945v("compositeDisposable");
                    aVar = null;
                } else {
                    aVar = aVar2;
                }
                C6353g.m24557j(f2, g, aVar, new C4972e(this), false, 8, (Object) null);
            } else if (g != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Sign in error: ");
                FirebaseUiException j = g.mo34092j();
                sb.append(j != null ? Integer.valueOf(j.mo34082a()) : null);
                C4878b.m18868g(sb.toString());
                FirebaseCrashlytics a = FirebaseCrashlytics.m6487a();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Template store Sign in error: ");
                FirebaseUiException j2 = g.mo34092j();
                if (j2 != null) {
                    num = Integer.valueOf(j2.mo34082a());
                }
                sb2.append(num);
                a.mo22936d(new Exception(sb2.toString()));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.activity_plugins);
        m19304o2();
        this.f12537G = new C17070a();
        setSupportActionBar((Toolbar) mo29758X1(C17532R$id.toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setTitle((int) C17541R$string.home_screen_tile_plugins);
        }
        m19296a2();
        m19312w2();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C13706o.m87929f(menu, "menu");
        getMenuInflater().inflate(C17536R$menu.plugin_menu, menu);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C17070a aVar = this.f12537G;
        if (aVar == null) {
            C13706o.m87945v("compositeDisposable");
            aVar = null;
        }
        aVar.mo80337d();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        switch (menuItem.getItemId()) {
            case 16908332:
                onBackPressed();
                break;
            case C17532R$id.add_new_plugin:
                m19298i2();
                return true;
            case C17532R$id.menu_my_profile:
                startActivity(ProfileActivity.f13156G.mo30512a(this, false, "", true));
                break;
            case C17532R$id.menu_sign_in:
                mo29762f2().mo32405s(this);
                break;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        C13706o.m87929f(menu, "menu");
        int i = C17532R$id.toolbar;
        MenuItem findItem = ((Toolbar) mo29758X1(i)).getMenu().findItem(C17532R$id.menu_my_profile);
        MenuItem findItem2 = ((Toolbar) mo29758X1(i)).getMenu().findItem(C17532R$id.menu_sign_in);
        findItem.setVisible(!mo29763g2().mo30790b().isGuest());
        findItem2.setVisible(!findItem.isVisible());
        return super.onPrepareOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        FrameLayout frameLayout = (FrameLayout) mo29758X1(C17532R$id.loadingBlocker);
        C13706o.m87928e(frameLayout, "loadingBlocker");
        frameLayout.setVisibility(8);
    }
}
