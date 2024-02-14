package com.arlosoft.macrodroid.homescreen;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.net.MailTo;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17533R$integer;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.DonateActivity;
import com.arlosoft.macrodroid.HelpActivity;
import com.arlosoft.macrodroid.MacroDroidService;
import com.arlosoft.macrodroid.WikiActivity;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.celltowers.CellTowerListActivity;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.confirmation.C4080a;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.data.BasicTile;
import com.arlosoft.macrodroid.data.HomeScreenTileConfig;
import com.arlosoft.macrodroid.data.HomeTile;
import com.arlosoft.macrodroid.drawer.DrawerOverlayHandleService;
import com.arlosoft.macrodroid.events.MacroDroidDisabledEvent;
import com.arlosoft.macrodroid.events.MacroDroidEnabledEvent;
import com.arlosoft.macrodroid.events.RefreshHomeScreenEvent;
import com.arlosoft.macrodroid.extensions.C4660g;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.geofences.GeofenceListActivity;
import com.arlosoft.macrodroid.homescreen.tiles.C4811m;
import com.arlosoft.macrodroid.homescreen.tiles.adapter.C4791a;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.privacy.PrivacyActivity;
import com.arlosoft.macrodroid.remoteconfig.C5070a;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.stopwatch.StopWatchesActivity;
import com.arlosoft.macrodroid.templatestore.p071ui.profile.C5331h;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import com.arlosoft.macrodroid.translations.TranslationsActivity;
import com.arlosoft.macrodroid.troubleshooting.TroubleShootingActivity;
import com.arlosoft.macrodroid.upgrade.UpgradeActivity2;
import com.arlosoft.macrodroid.utils.AccessibilityInfoActivity;
import com.arlosoft.macrodroid.utils.C6376e0;
import com.arlosoft.macrodroid.utils.C6417p1;
import com.arlosoft.macrodroid.utils.C6453w1;
import com.arlosoft.macrodroid.utils.FragmentViewBindingDelegate;
import com.arlosoft.macrodroid.variables.MacroDroidVariablesActivity;
import com.google.gson.Gson;
import com.hanks.htextview.scale.ScaleTextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13680b0;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13704m;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13716y;
import kotlinx.coroutines.C15478k0;
import p081e1.C7264a;
import p139o1.C8031w;
import p148q0.C8151a;
import p154r0.C8184d;
import p161s1.C10180a;
import p178v3.C10319a;
import p194y1.C10393a;
import p194y1.C10401b;
import p198z1.C10433a;
import p247e6.C12156m;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16265l;
import p370qa.C16270q;
import p433xa.C16887m;
import p455ag.C17105a;

/* compiled from: HomeFragment.kt */
public final class HomeFragment extends C8184d {

    /* renamed from: I */
    public static final C4733a f11897I = new C4733a((C13695i) null);

    /* renamed from: J */
    static final /* synthetic */ C16887m<Object>[] f11898J = {C13687e0.m87873g(new C13716y(HomeFragment.class, "binding", "getBinding()Lcom/arlosoft/macrodroid/databinding/FragmentHomeBinding;", 0))};

    /* renamed from: K */
    private static boolean f11899K;

    /* renamed from: L */
    private static boolean f11900L;

    /* renamed from: A */
    private final C7264a f11901A = MacroDroidApplication.f9883I.mo27303b().mo27293q("HomeScreenTiles");

    /* renamed from: B */
    private final Gson f11902B = new Gson();
    /* access modifiers changed from: private */

    /* renamed from: C */
    public List<C10433a> f11903C;

    /* renamed from: D */
    private C4762j f11904D;

    /* renamed from: E */
    private C4765m f11905E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f11906F;

    /* renamed from: G */
    private CountDownTimer f11907G;

    /* renamed from: H */
    public Map<Integer, View> f11908H = new LinkedHashMap();

    /* renamed from: d */
    private final FragmentViewBindingDelegate f11909d = C6376e0.m24622a(this, C4734b.f11916a);

    /* renamed from: f */
    public C5070a f11910f;

    /* renamed from: g */
    public C5331h f11911g;

    /* renamed from: o */
    public C5527g f11912o;

    /* renamed from: p */
    public C10319a f11913p;

    /* renamed from: s */
    public C4083b f11914s;

    /* renamed from: z */
    public C10401b f11915z;

    /* renamed from: com.arlosoft.macrodroid.homescreen.HomeFragment$a */
    /* compiled from: HomeFragment.kt */
    public static final class C4733a {
        private C4733a() {
        }

        public /* synthetic */ C4733a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.homescreen.HomeFragment$b */
    /* compiled from: HomeFragment.kt */
    /* synthetic */ class C4734b extends C13704m implements C16265l<View, C8031w> {

        /* renamed from: a */
        public static final C4734b f11916a = new C4734b();

        C4734b() {
            super(1, C8031w.class, "bind", "bind(Landroid/view/View;)Lcom/arlosoft/macrodroid/databinding/FragmentHomeBinding;", 0);
        }

        /* renamed from: l */
        public final C8031w invoke(View view) {
            C13706o.m87929f(view, "p0");
            return C8031w.m33430a(view);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.homescreen.HomeFragment$c */
    /* compiled from: HomeFragment.kt */
    static final class C4735c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ HomeFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4735c(HomeFragment homeFragment, C13635d<? super C4735c> dVar) {
            super(3, dVar);
            this.this$0 = homeFragment;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4735c(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m18346S0();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.homescreen.HomeFragment$d */
    /* compiled from: HomeFragment.kt */
    static final class C4736d extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C10393a $infoBarToDisplay;
        int label;
        final /* synthetic */ HomeFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4736d(HomeFragment homeFragment, C10393a aVar, C13635d<? super C4736d> dVar) {
            super(3, dVar);
            this.this$0 = homeFragment;
            this.$infoBarToDisplay = aVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4736d(this.this$0, this.$infoBarToDisplay, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.mo29246N0().mo41089c(this.$infoBarToDisplay);
                this.this$0.mo29246N0().mo41090d(this.$infoBarToDisplay);
                this.this$0.m18342J0().f19495j.mo75513c();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.homescreen.HomeFragment$e */
    /* compiled from: HomeFragment.kt */
    static final class C4737e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C10393a $infoBarToDisplay;
        int label;
        final /* synthetic */ HomeFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4737e(HomeFragment homeFragment, C10393a aVar, C13635d<? super C4737e> dVar) {
            super(3, dVar);
            this.this$0 = homeFragment;
            this.$infoBarToDisplay = aVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4737e(this.this$0, this.$infoBarToDisplay, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.mo29246N0().mo41090d(this.$infoBarToDisplay);
                this.this$0.m18342J0().f19495j.mo75513c();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.homescreen.HomeFragment$f */
    /* compiled from: HomeFragment.kt */
    public static final class C4738f extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ HomeFragment f11917a;

        /* renamed from: b */
        final /* synthetic */ C13680b0 f11918b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4738f(long j, HomeFragment homeFragment, C13680b0 b0Var) {
            super(j, 1000);
            this.f11917a = homeFragment;
            this.f11918b = b0Var;
        }

        public void onFinish() {
            this.f11917a.f11906F = true;
            this.f11917a.m18337E0(C4080a.C4081a.f10663a);
        }

        public void onTick(long j) {
            long j2 = j / ((long) 1000);
            TextView textView = this.f11917a.m18342J0().f19493h;
            StringBuilder sb = new StringBuilder();
            sb.append(C15177w.m93692k0(String.valueOf(j2 / ((long) 3600)), 2, '0'));
            sb.append(':');
            long j3 = (long) 60;
            sb.append(C15177w.m93692k0(String.valueOf((j2 / j3) % j3), 2, '0'));
            sb.append(':');
            sb.append(C15177w.m93692k0(String.valueOf(j2 % j3), 2, '0'));
            textView.setText(sb.toString());
            C13680b0 b0Var = this.f11918b;
            int i = b0Var.element + 1;
            b0Var.element = i;
            if (i % 9 == 0) {
                this.f11917a.m18342J0().f19492g.mo65569a(this.f11917a.getString(C17541R$string.flash_sale));
            } else if ((i + 6) % 9 == 0) {
                try {
                    ScaleTextView scaleTextView = this.f11917a.m18342J0().f19492g;
                    C13696i0 i0Var = C13696i0.f61931a;
                    String string = this.f11917a.getString(C17541R$string.flash_sale_percentage_off);
                    C13706o.m87928e(string, "getString(R.string.flash_sale_percentage_off)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{50}, 1));
                    C13706o.m87928e(format, "format(format, *args)");
                    scaleTextView.mo65569a(format);
                } catch (Exception e) {
                    C8151a.m33873n(e);
                    this.f11917a.m18342J0().f19492g.mo65569a("50% off");
                }
            } else if ((i + 3) % 9 == 0) {
                ScaleTextView scaleTextView2 = this.f11917a.m18342J0().f19492g;
                C13696i0 i0Var2 = C13696i0.f61931a;
                String string2 = this.f11917a.getString(C17541R$string.flash_sale_24_hours_label);
                C13706o.m87928e(string2, "getString(R.string.flash_sale_24_hours_label)");
                String format2 = String.format(string2, Arrays.copyOf(new Object[]{50}, 1));
                C13706o.m87928e(format2, "format(format, *args)");
                scaleTextView2.mo65569a(format2);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.homescreen.HomeFragment$g */
    /* compiled from: HomeFragment.kt */
    static final class C4739g extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ HomeFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4739g(HomeFragment homeFragment, C13635d<? super C4739g> dVar) {
            super(3, dVar);
            this.this$0 = homeFragment;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4739g(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                try {
                    C8151a.m33874o();
                    UpgradeActivity2.C6289a aVar = UpgradeActivity2.f14829L;
                    FragmentActivity requireActivity = this.this$0.requireActivity();
                    C13706o.m87928e(requireActivity, "requireActivity()");
                    aVar.mo32326a(requireActivity);
                } catch (Exception unused2) {
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.homescreen.HomeFragment$h */
    /* compiled from: HomeFragment.kt */
    static final class C4740h extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ HomeFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4740h(HomeFragment homeFragment, C13635d<? super C4740h> dVar) {
            super(3, dVar);
            this.this$0 = homeFragment;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4740h(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                try {
                    C8151a.m33874o();
                    UpgradeActivity2.C6289a aVar = UpgradeActivity2.f14829L;
                    FragmentActivity requireActivity = this.this$0.requireActivity();
                    C13706o.m87928e(requireActivity, "requireActivity()");
                    aVar.mo32326a(requireActivity);
                } catch (Exception unused2) {
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.homescreen.HomeFragment$i */
    /* compiled from: HomeFragment.kt */
    public static final class C4741i implements C12156m.C12162f {

        /* renamed from: a */
        final /* synthetic */ HomeFragment f11919a;

        C4741i(HomeFragment homeFragment) {
            this.f11919a = homeFragment;
        }

        /* renamed from: a */
        public void mo29260a(int i, int i2) {
        }

        /* renamed from: b */
        public void mo29261b(int i) {
        }

        /* renamed from: c */
        public void mo29262c(int i, int i2, boolean z) {
            List<C10433a> j0 = this.f11919a.f11903C;
            if (j0 == null) {
                C13706o.m87945v("tiles");
                j0 = null;
            }
            ArrayList arrayList = new ArrayList(C13616u.m87774u(j0, 10));
            for (C10433a c : j0) {
                arrayList.add(new BasicTile(c.mo29333c()));
            }
            this.f11919a.m18350V0(new HomeScreenTileConfig(arrayList));
        }

        /* renamed from: d */
        public void mo29263d(int i, int i2) {
        }
    }

    /* renamed from: A0 */
    private final void m18333A0() {
        Context requireContext = requireContext();
        C13706o.m87928e(requireContext, "requireContext()");
        boolean M0 = C5163j2.m20013M0(requireContext);
        m18342J0().f19500o.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        m18342J0().f19500o.setChecked(M0);
        m18342J0().f19500o.setOnCheckedChangeListener(new C4750f(requireContext, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public static final void m18334B0(Context context, HomeFragment homeFragment, CompoundButton compoundButton, boolean z) {
        C13706o.m87929f(context, "$context");
        C13706o.m87929f(homeFragment, "this$0");
        if (z) {
            C5163j2.m19935B4(context, true);
            Macro.setMacroDroidEnabledState(true);
            MacroDroidService.f7040a.mo24641f(context);
            C4934n.m18998M().mo29694n0();
            C15626c.m94876a(context, homeFragment.getString(C17541R$string.macrodroid_enabled), 0).show();
            C8151a.m33876r(true);
            if (C5163j2.m20085W2(homeFragment.requireActivity())) {
                homeFragment.requireContext().stopService(new Intent(context, DrawerOverlayHandleService.class));
                homeFragment.requireActivity().startService(new Intent(homeFragment.requireActivity(), DrawerOverlayHandleService.class));
                return;
            }
            return;
        }
        C5163j2.m19935B4(context, false);
        Macro.setMacroDroidEnabledState(false);
        MacroDroidService.f7040a.mo24642g(context);
        C4934n.m18998M().mo29694n0();
        C15626c.m94876a(context, homeFragment.getString(C17541R$string.macrodroid_disabled), 0).show();
        C8151a.m33876r(true);
        if (C5163j2.m20085W2(homeFragment.requireActivity())) {
            homeFragment.requireActivity().stopService(new Intent(homeFragment.requireActivity(), DrawerOverlayHandleService.class));
        }
    }

    /* renamed from: C0 */
    private final void m18335C0() {
        mo29247O0().mo28010f().observe(getViewLifecycleOwner(), new C4759g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: D0 */
    public static final void m18336D0(HomeFragment homeFragment, C4080a aVar) {
        C13706o.m87929f(homeFragment, "this$0");
        C13706o.m87928e(aVar, "premiumStatus");
        homeFragment.m18337E0(aVar);
        if (!aVar.mo28008a() && C5163j2.m20114a3(homeFragment.requireContext())) {
            homeFragment.m18338F0();
        }
        if (homeFragment.mo29247O0().mo28009e().mo28008a()) {
            homeFragment.m18342J0().f19499n.getMenu().findItem(C17532R$id.drawer_upgrade_to_pro).setVisible(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public final void m18337E0(C4080a aVar) {
        if (getActivity() == null) {
            return;
        }
        if (aVar.mo28008a()) {
            LinearLayout linearLayout = m18342J0().f19505t;
            C13706o.m87928e(linearLayout, "binding.upgradeBar");
            linearLayout.setVisibility(8);
            return;
        }
        if (!mo29248P0().mo29987n()) {
            m18342J0().f19501p.mo33122a();
        }
        LinearLayout linearLayout2 = m18342J0().f19505t;
        C13706o.m87928e(linearLayout2, "binding.upgradeBar");
        linearLayout2.setVisibility(0);
        if (m18345R0()) {
            C13680b0 b0Var = new C13680b0();
            long d = mo29245K0().mo40944d() - System.currentTimeMillis();
            CountDownTimer countDownTimer = this.f11907G;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f11907G = new C4738f(d, this, b0Var).start();
            TextView textView = m18342J0().f19493h;
            C13706o.m87928e(textView, "binding.flashSaleTimeRemaining");
            textView.setVisibility(0);
            ScaleTextView scaleTextView = m18342J0().f19492g;
            C13706o.m87928e(scaleTextView, "binding.flashSaleText");
            scaleTextView.setVisibility(0);
            TextView textView2 = m18342J0().f19507v;
            C13706o.m87928e(textView2, "binding.upgradeReason");
            textView2.setVisibility(8);
            m18342J0().f19507v.setText(getString(C17541R$string.flash_sale));
        } else {
            ScaleTextView scaleTextView2 = m18342J0().f19492g;
            C13706o.m87928e(scaleTextView2, "binding.flashSaleText");
            scaleTextView2.setVisibility(8);
            TextView textView3 = m18342J0().f19507v;
            C13706o.m87928e(textView3, "binding.upgradeReason");
            textView3.setVisibility(0);
            TextView textView4 = m18342J0().f19493h;
            C13706o.m87928e(textView4, "binding.flashSaleTimeRemaining");
            textView4.setVisibility(8);
            TextView textView5 = m18342J0().f19507v;
            C4765m mVar = this.f11905E;
            if (mVar == null) {
                C13706o.m87945v("upgradeBanner");
                mVar = null;
            }
            textView5.setText(mVar.mo29301a());
        }
        LinearLayout linearLayout3 = m18342J0().f19505t;
        C13706o.m87928e(linearLayout3, "binding.upgradeBar");
        C4666m.m18147o(linearLayout3, (C13640g) null, new C4739g(this, (C13635d<? super C4739g>) null), 1, (Object) null);
        Button button = m18342J0().f19506u;
        C13706o.m87928e(button, "binding.upgradeButton");
        C4666m.m18147o(button, (C13640g) null, new C4740h(this, (C13635d<? super C4740h>) null), 1, (Object) null);
    }

    /* renamed from: F0 */
    private final void m18338F0() {
        int B0;
        if (!f11900L && (B0 = C5163j2.m19931B0(getContext())) <= 1) {
            C5163j2.m20251r4(getContext(), B0 + 1);
            AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
            builder.setTitle(C17541R$string.pro_upgrade_failed);
            builder.setMessage(C17541R$string.pro_upgrade_issue_detail);
            builder.setPositiveButton(C17541R$string.action_clear_app_data, new C4748d(this));
            if (B0 > 0) {
                builder.setNegativeButton(C17541R$string.request_upgrade_support, new C4745a(this));
                builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
            } else {
                builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
            }
            C8151a.m33875p();
            builder.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G0 */
    public static final void m18339G0(HomeFragment homeFragment, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(homeFragment, "this$0");
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", "com.android.vending", (String) null));
            homeFragment.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H0 */
    public static final void m18340H0(HomeFragment homeFragment, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(homeFragment, "this$0");
        homeFragment.m18348U0();
    }

    /* renamed from: I0 */
    private final void m18341I0() {
        if (C5163j2.m20070U1(requireContext())) {
            int i = requireContext().getPackageManager().getPackageInfo(requireContext().getPackageName(), 0).versionCode;
            int y0 = C5163j2.m20303y0(requireContext());
            if (y0 != 0 && y0 < i - 1) {
                FragmentActivity requireActivity = requireActivity();
                C13706o.m87928e(requireActivity, "requireActivity()");
                C6453w1.m24773b(requireActivity, true);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J0 */
    public final C8031w m18342J0() {
        return (C8031w) this.f11909d.mo32407a(this, f11898J[0]);
    }

    /* renamed from: L0 */
    private final HomeScreenTileConfig m18343L0() {
        HomeScreenTileConfig homeScreenTileConfig = (HomeScreenTileConfig) this.f11901A.mo37133c("HomeScreenTiles", HomeScreenTileConfig.class);
        HomeScreenTileConfig.C4358a aVar = HomeScreenTileConfig.Companion;
        HomeScreenTileConfig a = aVar.mo28524a();
        if (homeScreenTileConfig == null) {
            return aVar.mo28524a();
        }
        List I0 = C13566b0.m87405I0(homeScreenTileConfig.getTiles());
        List<HomeTile> tiles = homeScreenTileConfig.getTiles();
        ArrayList arrayList = new ArrayList(C13616u.m87774u(tiles, 10));
        for (HomeTile tileId : tiles) {
            arrayList.add(Long.valueOf(tileId.getTileId()));
        }
        List<HomeTile> tiles2 = a.getTiles();
        ArrayList arrayList2 = new ArrayList();
        for (T next : tiles2) {
            if (!arrayList.contains(Long.valueOf(((HomeTile) next).getTileId()))) {
                arrayList2.add(next);
            }
        }
        I0.addAll(0, arrayList2);
        return new HomeScreenTileConfig(C13566b0.m87402F0(I0));
    }

    /* renamed from: Q0 */
    private final void m18344Q0(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        switch (itemId) {
            case C17532R$id.dont_kill_my_app:
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://dontkillmyapp.com"));
                intent.addFlags(268435456);
                startActivity(intent);
                return;
            case C17532R$id.drawer_accessibility_services:
                startActivity(new Intent(requireActivity(), AccessibilityInfoActivity.class));
                m18342J0().f19491f.closeDrawers();
                return;
            case C17532R$id.huawei_support_thread:
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://macrodroidforum.com/index.php?threads/huawei-support-thread.2/")));
                m18342J0().f19491f.closeDrawers();
                return;
            case C17532R$id.uninstall_macrodroid:
                Context requireContext = requireContext();
                C13706o.m87928e(requireContext, "requireContext()");
                C6417p1.m24714a(requireContext);
                return;
            case C17532R$id.xiaomi_support_thread:
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://macrodroidforum.com/index.php?threads/xiaomi-support-thread.3/")));
                m18342J0().f19491f.closeDrawers();
                return;
            default:
                switch (itemId) {
                    case C17532R$id.drawer_blog:
                        try {
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://medium.com/@macrodroid")));
                        } catch (ActivityNotFoundException unused) {
                        }
                        m18342J0().f19491f.closeDrawers();
                        return;
                    case C17532R$id.drawer_cell_towers:
                        Intent intent2 = new Intent(requireActivity(), CellTowerListActivity.class);
                        intent2.putExtra("EditModeOn", true);
                        startActivity(intent2);
                        m18342J0().f19491f.closeDrawers();
                        return;
                    default:
                        switch (itemId) {
                            case C17532R$id.drawer_donate:
                                startActivity(new Intent(requireActivity(), DonateActivity.class));
                                m18342J0().f19491f.closeDrawers();
                                return;
                            case C17532R$id.drawer_drawer_options:
                                C4762j jVar = this.f11904D;
                                if (jVar != null) {
                                    jVar.mo29270f1();
                                    return;
                                }
                                return;
                            case C17532R$id.drawer_geofences:
                                Intent intent3 = new Intent(requireActivity(), GeofenceListActivity.class);
                                intent3.putExtra("EditModeOn", true);
                                startActivity(intent3);
                                m18342J0().f19491f.closeDrawers();
                                return;
                            default:
                                switch (itemId) {
                                    case C17532R$id.drawer_help:
                                        startActivity(new Intent(requireActivity(), HelpActivity.class));
                                        m18342J0().f19491f.closeDrawers();
                                        return;
                                    case C17532R$id.drawer_invite_frieds:
                                        C4061t1.m15980Z(requireActivity());
                                        m18342J0().f19491f.closeDrawers();
                                        return;
                                    default:
                                        switch (itemId) {
                                            case C17532R$id.drawer_notification_bar_options:
                                                C4762j jVar2 = this.f11904D;
                                                if (jVar2 != null) {
                                                    jVar2.mo29275p1();
                                                    return;
                                                }
                                                return;
                                            case C17532R$id.drawer_privacy_policy:
                                                startActivity(new Intent(requireActivity(), PrivacyActivity.class));
                                                m18342J0().f19491f.closeDrawers();
                                                return;
                                            case C17532R$id.drawer_quick_settings_options:
                                                C4762j jVar3 = this.f11904D;
                                                if (jVar3 != null) {
                                                    jVar3.mo29269X();
                                                    return;
                                                }
                                                return;
                                            case C17532R$id.drawer_stopwatches:
                                                startActivity(new Intent(requireActivity(), StopWatchesActivity.class));
                                                m18342J0().f19491f.closeDrawers();
                                                return;
                                            case C17532R$id.drawer_translations:
                                                startActivity(new Intent(requireActivity(), TranslationsActivity.class));
                                                m18342J0().f19491f.closeDrawers();
                                                return;
                                            case C17532R$id.drawer_troubleshooting:
                                                startActivity(new Intent(requireActivity(), TroubleShootingActivity.class));
                                                m18342J0().f19491f.closeDrawers();
                                                return;
                                            case C17532R$id.drawer_upgrade_to_pro:
                                                m18354X0();
                                                m18342J0().f19491f.closeDrawers();
                                                return;
                                            case C17532R$id.drawer_variables:
                                                startActivity(new Intent(requireActivity(), MacroDroidVariablesActivity.class));
                                                m18342J0().f19491f.closeDrawers();
                                                return;
                                            case C17532R$id.drawer_version_history:
                                                try {
                                                    FragmentActivity requireActivity = requireActivity();
                                                    C13706o.m87928e(requireActivity, "requireActivity()");
                                                    C6453w1.m24773b(requireActivity, false);
                                                    m18342J0().f19491f.closeDrawers();
                                                    return;
                                                } catch (ActivityNotFoundException unused2) {
                                                }
                                            case C17532R$id.drawer_wiki:
                                                startActivity(new Intent(requireActivity(), WikiActivity.class));
                                                m18342J0().f19491f.closeDrawers();
                                                return;
                                            default:
                                                return;
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: R0 */
    private final boolean m18345R0() {
        return mo29245K0().mo40945e() && !this.f11906F;
    }

    /* access modifiers changed from: private */
    /* renamed from: S0 */
    public final void m18346S0() {
        m18342J0().f19491f.openDrawer((int) GravityCompat.START);
    }

    /* renamed from: T0 */
    private final void m18347T0() {
        FragmentActivity requireActivity = requireActivity();
        C13706o.m87928e(requireActivity, "requireActivity()");
        C4762j jVar = this.f11904D;
        C13706o.m87926c(jVar);
        C4811m mVar = new C4811m(requireActivity, jVar, mo29248P0(), mo29247O0());
        List<HomeTile> tiles = m18343L0().getTiles();
        ArrayList arrayList = new ArrayList(C13616u.m87774u(tiles, 10));
        for (HomeTile a : tiles) {
            arrayList.add(mVar.mo29345a(a));
        }
        this.f11903C = C13566b0.m87405I0(arrayList);
        m18342J0().f19494i.setLayoutManager(new GridLayoutManager(requireActivity(), getResources().getInteger(C17533R$integer.tiles_per_row)));
        C12156m mVar2 = new C12156m();
        List<C10433a> list = this.f11903C;
        if (list == null) {
            C13706o.m87945v("tiles");
            list = null;
        }
        RecyclerView.Adapter i = mVar2.mo68422i(new C4791a(list));
        C13706o.m87928e(i, "dragDropManager.createWrappedAdapter(tileAdapter)");
        m18342J0().f19494i.setAdapter(i);
        RecyclerView.ItemAnimator itemAnimator = m18342J0().f19494i.getItemAnimator();
        C13706o.m87927d(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        mVar2.mo68417c0(false);
        mVar2.mo68415b0(true);
        mVar2.mo68413a(m18342J0().f19494i);
        mVar2.mo68420e0(new C4741i(this));
    }

    /* renamed from: U0 */
    private final void m18348U0() {
        String str = "The pro upgrade has been lost on my device.\n\n" + "The email account I purchased with was: <Please enter email address here>";
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse(MailTo.MAILTO_SCHEME));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"support@macrodroid.com"});
        intent.putExtra("android.intent.extra.SUBJECT", requireContext().getString(C17541R$string.pro_upgrade_failed));
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.addFlags(268435456);
        try {
            requireContext().startActivity(intent);
        } catch (Exception unused) {
            C17105a.m100581c("No application available to handle ACTION_SENDTO intent", new Object[0]);
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType("message/rfc822");
            intent2.putExtra("android.intent.extra.EMAIL", new String[]{"support@macrodroid.com"});
            intent2.putExtra("android.intent.extra.SUBJECT", requireContext().getString(C17541R$string.pro_upgrade_failed));
            intent2.putExtra("android.intent.extra.TEXT", str);
            intent2.addFlags(268435456);
            try {
                requireContext().startActivity(Intent.createChooser(intent2, requireContext().getString(C17541R$string.upgrade_support)));
            } catch (Exception unused2) {
                C17105a.m100581c("No application available to handle ACTION_SEND intent", new Object[0]);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V0 */
    public final void m18350V0(HomeScreenTileConfig homeScreenTileConfig) {
        this.f11901A.mo37131a(this.f11902B, "HomeScreenTiles", homeScreenTileConfig);
    }

    /* renamed from: W0 */
    private final void m18352W0() {
        try {
            PackageInfo packageInfo = requireContext().getPackageManager().getPackageInfo(requireContext().getPackageName(), 0);
            C13706o.m87928e(packageInfo, "requireContext().package…Context().packageName, 0)");
            C5163j2.m20235p4(getActivity(), packageInfo.versionCode);
        } catch (Exception unused) {
        }
    }

    /* renamed from: X0 */
    private final void m18354X0() {
        UpgradeActivity2.C6289a aVar = UpgradeActivity2.f14829L;
        FragmentActivity requireActivity = requireActivity();
        C13706o.m87928e(requireActivity, "requireActivity()");
        aVar.mo32326a(requireActivity);
    }

    /* renamed from: p0 */
    private final void m18366p0() {
        if (C4934n.m18998M().mo29710z().size() > 5 && !C5163j2.m19933B2(requireContext())) {
            if (System.currentTimeMillis() - C5163j2.m20295x0(requireContext()) > 864000000) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
                builder.setTitle(C17541R$string.review_application);
                builder.setMessage(C17541R$string.if_you_like_please_review);
                builder.setPositiveButton(17039370, new C4749e(this));
                builder.setNegativeButton(C17541R$string.no_thanks, new C4747c(this));
                builder.setNeutralButton(C17541R$string.maybe_later, new C4746b(this));
                builder.show();
                C8151a.m33855D();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x003a */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m18367q0(com.arlosoft.macrodroid.homescreen.HomeFragment r2, android.content.DialogInterface r3, int r4) {
        /*
            java.lang.String r4 = "android.intent.action.VIEW"
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C13706o.m87929f(r2, r0)
            android.content.Context r0 = r2.requireContext()     // Catch:{ ActivityNotFoundException -> 0x003a }
            com.arlosoft.macrodroid.settings.C5163j2.m20116a5(r0)     // Catch:{ ActivityNotFoundException -> 0x003a }
            r3.dismiss()     // Catch:{ ActivityNotFoundException -> 0x003a }
            android.content.Intent r3 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x003a }
            r3.<init>(r4)     // Catch:{ ActivityNotFoundException -> 0x003a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ActivityNotFoundException -> 0x003a }
            r0.<init>()     // Catch:{ ActivityNotFoundException -> 0x003a }
            java.lang.String r1 = "market://details?id="
            r0.append(r1)     // Catch:{ ActivityNotFoundException -> 0x003a }
            android.content.Context r1 = r2.requireContext()     // Catch:{ ActivityNotFoundException -> 0x003a }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ ActivityNotFoundException -> 0x003a }
            r0.append(r1)     // Catch:{ ActivityNotFoundException -> 0x003a }
            java.lang.String r0 = r0.toString()     // Catch:{ ActivityNotFoundException -> 0x003a }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ ActivityNotFoundException -> 0x003a }
            r3.setData(r0)     // Catch:{ ActivityNotFoundException -> 0x003a }
            r2.startActivity(r3)     // Catch:{ ActivityNotFoundException -> 0x003a }
            goto L_0x005f
        L_0x003a:
            android.content.Intent r3 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x005f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ActivityNotFoundException -> 0x005f }
            r0.<init>()     // Catch:{ ActivityNotFoundException -> 0x005f }
            java.lang.String r1 = "http://play.google.com/store/apps/details?id="
            r0.append(r1)     // Catch:{ ActivityNotFoundException -> 0x005f }
            android.content.Context r1 = r2.requireContext()     // Catch:{ ActivityNotFoundException -> 0x005f }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ ActivityNotFoundException -> 0x005f }
            r0.append(r1)     // Catch:{ ActivityNotFoundException -> 0x005f }
            java.lang.String r0 = r0.toString()     // Catch:{ ActivityNotFoundException -> 0x005f }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ ActivityNotFoundException -> 0x005f }
            r3.<init>(r4, r0)     // Catch:{ ActivityNotFoundException -> 0x005f }
            r2.startActivity(r3)     // Catch:{ ActivityNotFoundException -> 0x005f }
        L_0x005f:
            java.lang.String r2 = "ok"
            p148q0.C8151a.m33854C(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.homescreen.HomeFragment.m18367q0(com.arlosoft.macrodroid.homescreen.HomeFragment, android.content.DialogInterface, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public static final void m18368r0(HomeFragment homeFragment, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(homeFragment, "this$0");
        C5163j2.m20116a5(homeFragment.requireContext());
        dialogInterface.dismiss();
        C8151a.m33854C("no_thanks");
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public static final void m18369s0(HomeFragment homeFragment, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(homeFragment, "this$0");
        C5163j2.m20227o4(homeFragment.requireContext(), System.currentTimeMillis());
        dialogInterface.dismiss();
        C8151a.m33854C("maybe_later");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:21|22|(1:24)(1:25)|26|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("v5.29.12");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x013c, code lost:
        if (mo29247O0().mo28009e().mo28008a() != false) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x013f, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0140, code lost:
        r3.append(r0);
        r2.setText(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0126 */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m18370u0() {
        /*
            r7 = this;
            java.lang.String r0 = " Pro"
            java.lang.String r1 = ""
            o1.w r2 = r7.m18342J0()
            androidx.drawerlayout.widget.DrawerLayout r2 = r2.f19491f
            r3 = 393216(0x60000, float:5.51013E-40)
            r2.setDescendantFocusability(r3)
            androidx.fragment.app.FragmentActivity r2 = r7.requireActivity()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r3 = 2131558931(0x7f0d0213, float:1.8743192E38)
            r4 = 0
            android.view.View r2 = r2.inflate(r3, r4)
            r3 = 2131362869(0x7f0a0435, float:1.834553E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r5 = "MACRODROID"
            android.text.SpannableString r5 = com.arlosoft.macrodroid.extensions.C4660g.m18128f(r5)
            r3.setText(r5)
            o1.w r3 = r7.m18342J0()
            com.google.android.material.navigation.NavigationView r3 = r3.f19499n
            r3.mo58389d(r2)
            o1.w r3 = r7.m18342J0()
            com.google.android.material.navigation.NavigationView r3 = r3.f19499n
            com.arlosoft.macrodroid.homescreen.h r5 = new com.arlosoft.macrodroid.homescreen.h
            r5.<init>(r7)
            r3.setNavigationItemSelectedListener(r5)
            o1.w r3 = r7.m18342J0()
            android.widget.ImageButton r3 = r3.f19490e
            java.lang.String r5 = "binding.drawMenuToggle"
            kotlin.jvm.internal.C13706o.m87928e(r3, r5)
            com.arlosoft.macrodroid.homescreen.HomeFragment$c r5 = new com.arlosoft.macrodroid.homescreen.HomeFragment$c
            r5.<init>(r7, r4)
            r6 = 1
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r3, r4, r5, r6, r4)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r5 = 24
            if (r3 >= r5) goto L_0x0077
            o1.w r3 = r7.m18342J0()
            com.google.android.material.navigation.NavigationView r3 = r3.f19499n
            android.view.Menu r3 = r3.getMenu()
            r5 = 2131362613(0x7f0a0335, float:1.8345012E38)
            android.view.MenuItem r3 = r3.findItem(r5)
            r3.setVisible(r4)
        L_0x0077:
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r5 = "xiaomi"
            boolean r5 = kotlin.text.C15176v.m93641v(r3, r5, r6)
            if (r5 == 0) goto L_0x0096
            o1.w r3 = r7.m18342J0()
            com.google.android.material.navigation.NavigationView r3 = r3.f19499n
            android.view.Menu r3 = r3.getMenu()
            r5 = 2131364368(0x7f0a0a10, float:1.8348571E38)
            android.view.MenuItem r3 = r3.findItem(r5)
            r3.setVisible(r6)
            goto L_0x00b2
        L_0x0096:
            java.lang.String r5 = "huawei"
            boolean r3 = kotlin.text.C15176v.m93641v(r3, r5, r6)
            if (r3 == 0) goto L_0x00b2
            o1.w r3 = r7.m18342J0()
            com.google.android.material.navigation.NavigationView r3 = r3.f19499n
            android.view.Menu r3 = r3.getMenu()
            r5 = 2131362904(0x7f0a0458, float:1.8345602E38)
            android.view.MenuItem r3 = r3.findItem(r5)
            r3.setVisible(r6)
        L_0x00b2:
            com.arlosoft.macrodroid.confirmation.b r3 = r7.mo29247O0()
            com.arlosoft.macrodroid.confirmation.a r3 = r3.mo28009e()
            boolean r3 = r3.mo28008a()
            if (r3 == 0) goto L_0x00d9
            o1.w r3 = r7.m18342J0()
            com.google.android.material.navigation.NavigationView r3 = r3.f19499n
            android.view.Menu r3 = r3.getMenu()
            r5 = 2131362617(0x7f0a0339, float:1.834502E38)
            android.view.MenuItem r3 = r3.findItem(r5)
            java.lang.String r5 = "binding.navigationView.m…id.drawer_upgrade_to_pro)"
            kotlin.jvm.internal.C13706o.m87928e(r3, r5)
            r3.setVisible(r4)
        L_0x00d9:
            r3 = 2131363341(0x7f0a060d, float:1.8346488E38)
            android.view.View r2 = r2.findViewById(r3)     // Catch:{ Exception -> 0x014a }
            java.lang.String r3 = "navigationHeader.findVie….nav_header_version_info)"
            kotlin.jvm.internal.C13706o.m87928e(r2, r3)     // Catch:{ Exception -> 0x014a }
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch:{ Exception -> 0x014a }
            android.content.Context r3 = r7.requireContext()     // Catch:{ Exception -> 0x0126 }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ Exception -> 0x0126 }
            android.content.Context r5 = r7.requireContext()     // Catch:{ Exception -> 0x0126 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ Exception -> 0x0126 }
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r5, r4)     // Catch:{ Exception -> 0x0126 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0126 }
            r4.<init>()     // Catch:{ Exception -> 0x0126 }
            r5 = 118(0x76, float:1.65E-43)
            r4.append(r5)     // Catch:{ Exception -> 0x0126 }
            java.lang.String r3 = r3.versionName     // Catch:{ Exception -> 0x0126 }
            r4.append(r3)     // Catch:{ Exception -> 0x0126 }
            com.arlosoft.macrodroid.confirmation.b r3 = r7.mo29247O0()     // Catch:{ Exception -> 0x0126 }
            com.arlosoft.macrodroid.confirmation.a r3 = r3.mo28009e()     // Catch:{ Exception -> 0x0126 }
            boolean r3 = r3.mo28008a()     // Catch:{ Exception -> 0x0126 }
            if (r3 == 0) goto L_0x011a
            r3 = r0
            goto L_0x011b
        L_0x011a:
            r3 = r1
        L_0x011b:
            r4.append(r3)     // Catch:{ Exception -> 0x0126 }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0126 }
            r2.setText(r3)     // Catch:{ Exception -> 0x0126 }
            goto L_0x014a
        L_0x0126:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014a }
            r3.<init>()     // Catch:{ Exception -> 0x014a }
            java.lang.String r4 = "v5.29.12"
            r3.append(r4)     // Catch:{ Exception -> 0x014a }
            com.arlosoft.macrodroid.confirmation.b r4 = r7.mo29247O0()     // Catch:{ Exception -> 0x014a }
            com.arlosoft.macrodroid.confirmation.a r4 = r4.mo28009e()     // Catch:{ Exception -> 0x014a }
            boolean r4 = r4.mo28008a()     // Catch:{ Exception -> 0x014a }
            if (r4 == 0) goto L_0x013f
            goto L_0x0140
        L_0x013f:
            r0 = r1
        L_0x0140:
            r3.append(r0)     // Catch:{ Exception -> 0x014a }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x014a }
            r2.setText(r0)     // Catch:{ Exception -> 0x014a }
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.homescreen.HomeFragment.m18370u0():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public static final boolean m18371v0(HomeFragment homeFragment, MenuItem menuItem) {
        C13706o.m87929f(homeFragment, "this$0");
        C13706o.m87929f(menuItem, "menuItem");
        homeFragment.m18344Q0(menuItem);
        return true;
    }

    /* renamed from: y0 */
    private final void m18372y0(int i) {
        C10393a b = mo29246N0().mo41088b(i);
        if (b != null) {
            if (b instanceof C10393a.C10398e) {
                String language = Locale.getDefault().getLanguage();
                C13706o.m87928e(language, "getDefault().language");
                C8151a.m33857F(language);
            }
            Button button = m18342J0().f19489d;
            C13706o.m87928e(button, "binding.configureButton");
            int i2 = 8;
            button.setVisibility(b.mo41087g() ? 0 : 8);
            View view = m18342J0().f19488c;
            C13706o.m87928e(view, "binding.barBottomSpace");
            if (!b.mo41087g()) {
                i2 = 0;
            }
            view.setVisibility(i2);
            Button button2 = m18342J0().f19489d;
            String c = b.mo41083c();
            if (c == null) {
                Integer d = b.mo41084d();
                c = getString(d != null ? d.intValue() : C17541R$string.configure);
            }
            button2.setText(c);
            Button button3 = m18342J0().f19489d;
            C13706o.m87928e(button3, "binding.configureButton");
            C4666m.m18147o(button3, (C13640g) null, new C4736d(this, b, (C13635d<? super C4736d>) null), 1, (Object) null);
            m18342J0().f19496k.setBackgroundColor(ContextCompat.getColor(requireContext(), b.mo41082b()));
            if (b.mo41086f() != null) {
                m18342J0().f19498m.setText(b.mo41086f());
            } else {
                m18342J0().f19498m.setText(getString(b.mo41085e()));
            }
            if (!f11899K) {
                m18342J0().f19495j.mo75515e();
                f11899K = true;
                C8151a.m33868i(b.mo41081a());
            } else {
                m18342J0().f19495j.mo75516f(false);
            }
            ImageView imageView = m18342J0().f19497l;
            C13706o.m87928e(imageView, "binding.infoBarDismissButton");
            C4666m.m18147o(imageView, (C13640g) null, new C4737e(this, b, (C13635d<? super C4737e>) null), 1, (Object) null);
        }
    }

    /* renamed from: K0 */
    public final C10319a mo29245K0() {
        C10319a aVar = this.f11913p;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("flashSaleManager");
        return null;
    }

    /* renamed from: N0 */
    public final C10401b mo29246N0() {
        C10401b bVar = this.f11915z;
        if (bVar != null) {
            return bVar;
        }
        C13706o.m87945v("infoBarHandler");
        return null;
    }

    /* renamed from: O0 */
    public final C4083b mo29247O0() {
        C4083b bVar = this.f11914s;
        if (bVar != null) {
            return bVar;
        }
        C13706o.m87945v("premiumStatusHandler");
        return null;
    }

    /* renamed from: P0 */
    public final C5070a mo29248P0() {
        C5070a aVar = this.f11910f;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("remoteConfig");
        return null;
    }

    /* renamed from: U */
    public void mo26239U() {
        this.f11908H.clear();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C10180a.m40075a().mo80017g(this)) {
            C10180a.m40075a().mo80019m(this);
        }
        MacroDroidService.C2296a aVar = MacroDroidService.f7040a;
        Context applicationContext = requireContext().getApplicationContext();
        C13706o.m87928e(applicationContext, "requireContext().applicationContext");
        aVar.mo24644i(applicationContext, true);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13706o.m87929f(layoutInflater, "inflater");
        return layoutInflater.inflate(C17535R$layout.fragment_home, viewGroup, false);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f11904D = null;
        C10180a.m40075a().mo80020p(this);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo26239U();
    }

    public final void onEventMainThread(MacroDroidDisabledEvent macroDroidDisabledEvent) {
        C13706o.m87929f(macroDroidDisabledEvent, NotificationCompat.CATEGORY_EVENT);
        m18342J0().f19500o.setChecked(false);
    }

    public void onPause() {
        CountDownTimer countDownTimer = this.f11907G;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        if (!mo29247O0().mo28009e().mo28008a()) {
            mo29245K0().mo40946f();
        }
        m18333A0();
        m18335C0();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C13706o.m87929f(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity requireActivity = requireActivity();
        C13706o.m87928e(requireActivity, "requireActivity()");
        C8151a.m33856E(requireActivity, "HomeFragment");
        Context requireContext = requireContext();
        C13706o.m87928e(requireContext, "requireContext()");
        this.f11905E = new C4765m(requireContext);
        FragmentActivity requireActivity2 = requireActivity();
        C13706o.m87928e(requireActivity2, "requireActivity()");
        this.f11904D = (C4762j) requireActivity2;
        m18342J0().f19502q.setText(C4660g.m18128f("MACRODROID"));
        m18347T0();
        m18370u0();
        m18341I0();
        m18372y0(C5163j2.m20303y0(requireContext()));
        m18352W0();
        m18366p0();
        m18335C0();
    }

    public final void onEventMainThread(MacroDroidEnabledEvent macroDroidEnabledEvent) {
        C13706o.m87929f(macroDroidEnabledEvent, NotificationCompat.CATEGORY_EVENT);
        m18342J0().f19500o.setChecked(true);
    }

    public final void onEventMainThread(RefreshHomeScreenEvent refreshHomeScreenEvent) {
        C13706o.m87929f(refreshHomeScreenEvent, NotificationCompat.CATEGORY_EVENT);
        m18347T0();
    }
}
