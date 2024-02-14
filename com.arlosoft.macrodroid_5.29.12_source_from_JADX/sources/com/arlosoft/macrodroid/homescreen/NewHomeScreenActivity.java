package com.arlosoft.macrodroid.homescreen;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.util.Pair;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.p009ui.BottomNavigationViewKt;
import com.android.billingclient.api.BillingClient;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.advert.AdvertActivity;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.celltowers.CellTowerListActivity;
import com.arlosoft.macrodroid.confirmation.validation.C4099d;
import com.arlosoft.macrodroid.confirmation.validation.ConfirmActionActivity;
import com.arlosoft.macrodroid.editscreen.EditMacroActivity;
import com.arlosoft.macrodroid.extensions.C4658e;
import com.arlosoft.macrodroid.geofences.GeofenceListActivity;
import com.arlosoft.macrodroid.homescreen.favourites.FavouritesDialogActivity;
import com.arlosoft.macrodroid.homescreen.quickrun.QuickRunMacroDialogActivity;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4917c;
import com.arlosoft.macrodroid.plugins.PluginsActivity;
import com.arlosoft.macrodroid.quicksettings.QuickSettingsActivity;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.settings.EditCategoriesActivity;
import com.arlosoft.macrodroid.settings.EditModesActivity;
import com.arlosoft.macrodroid.settings.drawer.DrawerPreferencesActivity;
import com.arlosoft.macrodroid.settings.notificationbar.NotificationBarPreferencesActivity;
import com.arlosoft.macrodroid.templatestore.events.TemplateStoreRefreshEvent;
import com.arlosoft.macrodroid.upgrade.UpgradeActivity2;
import com.arlosoft.macrodroid.upgrade.billing.BillingDataSource;
import com.arlosoft.macrodroid.utils.C6455x0;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import p148q0.C8151a;
import p161s1.C10180a;
import p176v0.C10312a;
import p184w3.C10331a;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16269p;
import p374qe.C16310b;

/* compiled from: NewHomeScreenActivity.kt */
public final class NewHomeScreenActivity extends AdvertActivity implements C4762j {

    /* renamed from: O */
    public static final C4742a f11920O = new C4742a((C13695i) null);

    /* renamed from: H */
    public C10312a f11921H;

    /* renamed from: I */
    public C4099d f11922I;

    /* renamed from: J */
    public BillingDataSource f11923J;

    /* renamed from: K */
    public C6455x0 f11924K;

    /* renamed from: L */
    private BillingClient f11925L;

    /* renamed from: M */
    private NavController f11926M;

    /* renamed from: N */
    public Map<Integer, View> f11927N = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.homescreen.NewHomeScreenActivity$a */
    /* compiled from: NewHomeScreenActivity.kt */
    public static final class C4742a {
        private C4742a() {
        }

        public /* synthetic */ C4742a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final Intent mo29282a(Context context) {
            C13706o.m87929f(context, "context");
            Intent intent = new Intent(context, NewHomeScreenActivity.class);
            intent.putExtra("tab_to_load", 1);
            return intent;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.homescreen.NewHomeScreenActivity$b */
    /* compiled from: NewHomeScreenActivity.kt */
    static final class C4743b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ long $checkProFrequencyDays;
        int label;
        final /* synthetic */ NewHomeScreenActivity this$0;

        /* renamed from: com.arlosoft.macrodroid.homescreen.NewHomeScreenActivity$b$a */
        /* compiled from: NewHomeScreenActivity.kt */
        public /* synthetic */ class C4744a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f11928a;

            static {
                int[] iArr = new int[C10331a.values().length];
                iArr[C10331a.PRO_USER_SERIAL_VALID.ordinal()] = 1;
                iArr[C10331a.PRO_USER_PLAY_STORE_VALID.ordinal()] = 2;
                iArr[C10331a.PRO_USER_SERIAL_NOT_VERIFIED.ordinal()] = 3;
                iArr[C10331a.PRO_USER_NO_INFO_IN_APP.ordinal()] = 4;
                iArr[C10331a.PRO_USER_PLAY_STORE_INVALID.ordinal()] = 5;
                iArr[C10331a.PRO_USER_PLAY_STORE_VOIDED.ordinal()] = 6;
                iArr[C10331a.PRO_USER_STAUTUS_AUTH_FAILED.ordinal()] = 7;
                iArr[C10331a.PRO_USER_STATUS_UNAVAILABLE.ordinal()] = 8;
                f11928a = iArr;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4743b(NewHomeScreenActivity newHomeScreenActivity, long j, C13635d<? super C4743b> dVar) {
            super(2, dVar);
            this.this$0 = newHomeScreenActivity;
            this.$checkProFrequencyDays = j;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C4743b(this.this$0, this.$checkProFrequencyDays, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C4743b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C4099d m2 = this.this$0.mo29272m2();
                this.label = 1;
                obj = m2.mo28025a(this);
                if (obj == c) {
                    return c;
                }
            } else if (i == 1) {
                try {
                    C13332o.m85685b(obj);
                } catch (Exception e) {
                    C8151a.m33883y(e.toString());
                    C4878b.m18864c("Purchase validation failed: " + e);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C10331a aVar = (C10331a) obj;
            C4878b.m18864c("Validate purchase result: " + aVar);
            switch (C4744a.f11928a[aVar.ordinal()]) {
                case 1:
                    C8151a.m33853B();
                    break;
                case 2:
                    C8151a.m33853B();
                    break;
                case 3:
                    this.this$0.m18392n2("serial not verified");
                    break;
                case 4:
                case 5:
                    break;
                case 6:
                    this.this$0.m18392n2("voided");
                    break;
                case 7:
                    this.this$0.m18392n2("auth failed");
                    break;
                case 8:
                    C8151a.m33852A();
                    break;
            }
            C5163j2.m20031O4(this.this$0, System.currentTimeMillis() + C4658e.m18118a(this.$checkProFrequencyDays));
            return C13339u.f61331a;
        }
    }

    /* renamed from: k2 */
    private final void m18390k2(Intent intent) {
        int intExtra = intent.getIntExtra("tab_to_load", -1);
        if (intExtra == 0) {
            mo29277r2();
        } else if (intExtra == 1) {
            mo29280v();
        } else if (intExtra == 2) {
            mo29278s2();
        } else if (intExtra == 3) {
            mo29268L0();
        }
    }

    /* renamed from: l2 */
    private final void m18391l2() {
        long l = mo27270Z1().mo29985l();
        if (System.currentTimeMillis() > C5163j2.m20104Z0(this)) {
            C15561w1 unused = C15473j.m94492d(LifecycleOwnerKt.getLifecycleScope(this), C15186a1.m93730b(), (C15486m0) null, new C4743b(this, l, (C13635d<? super C4743b>) null), 2, (Object) null);
        } else {
            C4658e.m18120c(C5163j2.m20104Z0(this)).mo75749x(C16310b.f66725q);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public final void m18392n2(String str) {
        C5163j2.m20132c5(this, true);
        C5163j2.m19968F5(this, true);
        C5163j2.m20157f6(this, (String) null);
        finish();
        ConfirmActionActivity.f10674J.mo28017a(this);
        C8151a.m33884z(str);
    }

    /* renamed from: o2 */
    private final boolean m18393o2(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: p2 */
    private final boolean m18394p2() {
        try {
            if (getPackageManager().getPackageInfo(getPackageName(), 0).firstInstallTime == getPackageManager().getPackageInfo(getPackageName(), 0).lastUpdateTime) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static final void m18395q2(NewHomeScreenActivity newHomeScreenActivity) {
        C13706o.m87929f(newHomeScreenActivity, "this$0");
        if (!newHomeScreenActivity.mo27315N1()) {
            UpgradeActivity2.f14829L.mo32326a(newHomeScreenActivity);
        }
    }

    /* renamed from: A0 */
    public void mo29264A0(View view, View view2) {
        C13706o.m87929f(view, "tileView");
        C13706o.m87929f(view2, "iconView");
        Intent intent = new Intent(this, FavouritesDialogActivity.class);
        Pair create = Pair.create(view, "tileContainer");
        C13706o.m87928e(create, "create<View, String>(tileView, \"tileContainer\")");
        Pair create2 = Pair.create(view2, "icon");
        C13706o.m87928e(create2, "create<View, String>(iconView, \"icon\")");
        ActivityOptionsCompat makeSceneTransitionAnimation = ActivityOptionsCompat.makeSceneTransitionAnimation(this, create, create2);
        C13706o.m87928e(makeSceneTransitionAnimation, "makeSceneTransitionAnima…this, cardPair, iconPair)");
        startActivity(intent, makeSceneTransitionAnimation.toBundle());
    }

    /* renamed from: E0 */
    public void mo29265E0() {
        startActivity(new Intent(this, GeofenceListActivity.class));
    }

    /* renamed from: E1 */
    public void mo29266E1(View view, View view2) {
        C13706o.m87929f(view, "tileView");
        C13706o.m87929f(view2, "iconView");
        Intent intent = new Intent(this, QuickRunMacroDialogActivity.class);
        Pair create = Pair.create(view, "tileContainer");
        C13706o.m87928e(create, "create<View, String>(tileView, \"tileContainer\")");
        Pair create2 = Pair.create(view2, "icon");
        C13706o.m87928e(create2, "create<View, String>(iconView, \"icon\")");
        ActivityOptionsCompat makeSceneTransitionAnimation = ActivityOptionsCompat.makeSceneTransitionAnimation(this, create, create2);
        C13706o.m87928e(makeSceneTransitionAnimation, "makeSceneTransitionAnima…this, cardPair, iconPair)");
        startActivity(intent, makeSceneTransitionAnimation.toBundle());
    }

    /* renamed from: G0 */
    public void mo29267G0() {
        startActivity(new Intent(this, EditCategoriesActivity.class));
    }

    /* renamed from: L0 */
    public void mo29268L0() {
        NavController navController = this.f11926M;
        if (navController == null) {
            C13706o.m87945v("navController");
            navController = null;
        }
        navController.navigate((int) C17532R$id.navigation_settings);
    }

    /* renamed from: X */
    public void mo29269X() {
        startActivity(new Intent(this, QuickSettingsActivity.class));
    }

    /* renamed from: f1 */
    public void mo29270f1() {
        startActivity(new Intent(this, DrawerPreferencesActivity.class));
    }

    /* renamed from: i2 */
    public View mo29271i2(int i) {
        Map<Integer, View> map = this.f11927N;
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

    /* renamed from: m2 */
    public final C4099d mo29272m2() {
        C4099d dVar = this.f11922I;
        if (dVar != null) {
            return dVar;
        }
        C13706o.m87945v("premiumValidator");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.activity_new_home_screen);
        if (getIntent().getBooleanExtra("exitApp", false)) {
            finish();
            return;
        }
        NavController findNavController = NavHostFragment.findNavController(getSupportFragmentManager().findFragmentById(C17532R$id.navHostFragment));
        C13706o.m87928e(findNavController, "findNavController(navHostFragment)");
        this.f11926M = findNavController;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) mo29271i2(C17532R$id.bottomNavigation);
        C13706o.m87928e(bottomNavigationView, "bottomNavigation");
        NavController navController = this.f11926M;
        if (navController == null) {
            C13706o.m87945v("navController");
            navController = null;
        }
        BottomNavigationViewKt.setupWithNavController(bottomNavigationView, navController);
        Intent intent = getIntent();
        C13706o.m87928e(intent, "intent");
        m18390k2(intent);
        if (!C5163j2.m20013M0(getApplicationContext())) {
            C15626c.makeText(getApplicationContext(), C17541R$string.macrodroid_disabled, 0).show();
        }
        C4878b.m18879r("Home Screen Created");
        String name = getApplication().getClass().getName();
        C13706o.m87928e(name, "application.javaClass.name");
        if (!C15176v.m93640u(name, "MacroDroidApplication", false, 2, (Object) null)) {
            finish();
        }
        if (m18393o2("com.google.android.gms.common.URET")) {
            finish();
        }
        if (C4917c.m18992a(MacroDroidApplication.f9883I.mo27303b())) {
            m18392n2("Wrong Key");
        }
        C10180a.m40075a().mo80019m(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C10180a.m40075a().mo80020p(this);
    }

    public final void onEventMainThread(TemplateStoreRefreshEvent templateStoreRefreshEvent) {
        C13706o.m87929f(templateStoreRefreshEvent, NotificationCompat.CATEGORY_EVENT);
        NavController navController = this.f11926M;
        NavController navController2 = null;
        if (navController == null) {
            C13706o.m87945v("navController");
            navController = null;
        }
        navController.navigate((int) C17532R$id.navigation_home);
        NavController navController3 = this.f11926M;
        if (navController3 == null) {
            C13706o.m87945v("navController");
        } else {
            navController2 = navController3;
        }
        navController2.navigate((int) C17532R$id.navigation_templates);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        C13706o.m87929f(intent, "intent");
        super.onNewIntent(intent);
        m18390k2(intent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        try {
            BillingClient billingClient = this.f11925L;
            boolean z = true;
            if (billingClient == null || !billingClient.isReady()) {
                z = false;
            }
            if (z) {
                BillingClient billingClient2 = this.f11925L;
                if (billingClient2 != null) {
                    billingClient2.endConnection();
                }
                this.f11925L = null;
            }
        } catch (Exception e) {
            FirebaseCrashlytics a = FirebaseCrashlytics.m6487a();
            a.mo22936d(new Exception("NewHomeScreenActivity failed onPause: " + e));
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (C5163j2.m20063T1(this)) {
            ConfirmActionActivity.f10674J.mo28017a(this);
            finish();
        } else if (mo27269Y1().mo28009e().mo28008a()) {
            m18391l2();
        } else {
            if (C5163j2.m20262t(getApplicationContext()) && m18394p2()) {
                new Handler(Looper.getMainLooper()).postDelayed(new C4763k(this), 500);
            }
            C5163j2.m20250r3(getApplicationContext(), false);
        }
    }

    /* renamed from: p0 */
    public void mo29274p0() {
        Intent intent = new Intent(this, CellTowerListActivity.class);
        intent.putExtra("EditModeOn", true);
        startActivity(intent);
    }

    /* renamed from: p1 */
    public void mo29275p1() {
        startActivity(new Intent(this, NotificationBarPreferencesActivity.class));
    }

    /* renamed from: q1 */
    public void mo29276q1() {
        startActivity(new Intent(this, EditModesActivity.class));
    }

    /* renamed from: r2 */
    public void mo29277r2() {
        NavController navController = this.f11926M;
        if (navController == null) {
            C13706o.m87945v("navController");
            navController = null;
        }
        navController.navigate((int) C17532R$id.navigation_home);
    }

    /* renamed from: s2 */
    public void mo29278s2() {
        NavController navController = this.f11926M;
        if (navController == null) {
            C13706o.m87945v("navController");
            navController = null;
        }
        navController.navigate((int) C17532R$id.navigation_templates);
    }

    /* renamed from: t1 */
    public void mo29279t1() {
        startActivity(new Intent(this, PluginsActivity.class));
    }

    /* renamed from: v */
    public void mo29280v() {
        NavController navController = this.f11926M;
        if (navController == null) {
            C13706o.m87945v("navController");
            navController = null;
        }
        navController.navigate((int) C17532R$id.navigation_macro_list);
    }

    /* renamed from: w1 */
    public void mo29281w1(int i) {
        Intent intent = new Intent(this, EditMacroActivity.class);
        intent.putExtra("MacroId", i);
        startActivity(intent);
    }
}
