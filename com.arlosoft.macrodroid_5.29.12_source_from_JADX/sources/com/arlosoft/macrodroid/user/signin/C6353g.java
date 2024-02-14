package com.arlosoft.macrodroid.user.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.extensions.C4656c;
import com.arlosoft.macrodroid.rest.BaseError;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.templatestore.events.TemplateStoreRefreshEvent;
import com.arlosoft.macrodroid.templatestore.model.User;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import com.firebase.p073ui.auth.AuthUI;
import com.firebase.p073ui.auth.IdpResponse;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p161s1.C10180a;
import p176v0.C10312a;
import p199z2.C10434a;
import p270ga.C12318a;
import p297ja.C13339u;
import p329me.C15737b;
import p370qa.C16254a;
import p414v9.C16727a;
import p414v9.C16732f;
import p414v9.C16735i;
import p440y9.C16971a;
import p448z9.C17070a;
import retrofit2.HttpException;

/* renamed from: com.arlosoft.macrodroid.user.signin.g */
/* compiled from: SignInHelper.kt */
public final class C6353g {

    /* renamed from: e */
    public static final C6354a f14928e = new C6354a((C13695i) null);

    /* renamed from: f */
    private static final List<AuthUI.IdpConfig> f14929f = C13614t.m87751m(new AuthUI.IdpConfig.C6836c().mo34067b(), new AuthUI.IdpConfig.C6838e().mo34067b(), new AuthUI.IdpConfig.C6839f().mo34067b());

    /* renamed from: a */
    private final Context f14930a;

    /* renamed from: b */
    private final C10312a f14931b;

    /* renamed from: c */
    private final C10434a f14932c;

    /* renamed from: d */
    private final C5527g f14933d;

    /* renamed from: com.arlosoft.macrodroid.user.signin.g$a */
    /* compiled from: SignInHelper.kt */
    public static final class C6354a {
        private C6354a() {
        }

        public /* synthetic */ C6354a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.user.signin.g$b */
    /* compiled from: SignInHelper.kt */
    public interface C6355b {
        /* renamed from: a */
        void mo27362a();

        /* renamed from: b */
        void mo27363b(User user);

        /* renamed from: c */
        void mo27364c();

        /* renamed from: d */
        void mo27365d();
    }

    /* renamed from: com.arlosoft.macrodroid.user.signin.g$c */
    /* compiled from: SignInHelper.kt */
    static final class C6356c extends C13708q implements C16254a<C13339u> {
        final /* synthetic */ Fragment $fragment;
        final /* synthetic */ C6353g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6356c(Fragment fragment, C6353g gVar) {
            super(0);
            this.$fragment = fragment;
            this.this$0 = gVar;
        }

        public final void invoke() {
            this.$fragment.startActivityForResult(this.this$0.m24556h(), 9729);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.user.signin.g$d */
    /* compiled from: SignInHelper.kt */
    static final class C6357d extends C13708q implements C16254a<C13339u> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ C6353g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6357d(Activity activity, C6353g gVar) {
            super(0);
            this.$activity = activity;
            this.this$0 = gVar;
        }

        public final void invoke() {
            this.$activity.startActivityForResult(this.this$0.m24556h(), 9729);
        }
    }

    public C6353g(Context context, C10312a aVar, C10434a aVar2, C5527g gVar) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(aVar, "screenLoader");
        C13706o.m87929f(aVar2, "api");
        C13706o.m87929f(gVar, "userProvider");
        this.f14930a = context;
        this.f14931b = aVar;
        this.f14932c = aVar2;
        this.f14933d = gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final Intent m24556h() {
        Intent a = ((AuthUI.C6843d) ((AuthUI.C6843d) ((AuthUI.C6843d) ((AuthUI.C6843d) ((AuthUI.C6843d) ((AuthUI.C6843d) AuthUI.m25697j().mo34049c().mo34075c(true)).mo34077e(false)).mo34076d(f14929f)).mo34080h(C17542R$style.LoginTheme)).mo34079g(C17530R$drawable.onboarding_intro)).mo34075c(true)).mo34073a();
        C13706o.m87928e(a, "getInstance()\n          …\n                .build()");
        return a;
    }

    /* renamed from: j */
    public static /* synthetic */ void m24557j(C6353g gVar, IdpResponse idpResponse, C17070a aVar, C6355b bVar, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        gVar.mo32404i(idpResponse, aVar, bVar, z);
    }

    /* renamed from: k */
    private final void m24558k(String str, C17070a aVar, C6355b bVar) {
        bVar.mo27364c();
        aVar.mo62358a(this.f14932c.mo41166j(str).mo79727m(C6351e.f14926a).mo79730q(C12318a.m83030b()).mo79726l(C16971a.m100210a()).mo79729o(new C6349c(this, bVar), new C6350d(this, str, bVar)));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final C15737b m24559l(C16732f fVar) {
        C13706o.m87929f(fVar, "errors");
        return fVar.mo79661h(C6352f.f14927a);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final C15737b m24560m(Throwable th) {
        C13706o.m87929f(th, "error");
        if (new BaseError(th, (BaseError.C5076d) null, 2, (C13695i) null).mo29992b()) {
            return C16735i.m99346b0(2, TimeUnit.SECONDS).mo79699d0(C16727a.DROP);
        }
        return C16732f.m99314f(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m24561n(C6353g gVar, C6355b bVar, User user) {
        C13706o.m87929f(gVar, "this$0");
        C13706o.m87929f(bVar, "$callbackHandler");
        C13706o.m87929f(user, "user");
        C5163j2.m20095X5(gVar.f14930a, user);
        bVar.mo27363b(user);
        C10180a.m40075a().mo80018i(new TemplateStoreRefreshEvent());
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m24562o(C6353g gVar, String str, C6355b bVar, Throwable th) {
        C13706o.m87929f(gVar, "this$0");
        C13706o.m87929f(str, "$personalIdentifier");
        C13706o.m87929f(bVar, "$callbackHandler");
        if (!(th instanceof HttpException)) {
            bVar.mo27365d();
        } else if (((HttpException) th).mo80527a() == 404) {
            gVar.f14931b.mo40929d(true, str, false);
        } else {
            bVar.mo27365d();
        }
    }

    /* renamed from: p */
    private final void m24563p(Activity activity, C16254a<C13339u> aVar) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(activity, C17542R$style.Theme_App_Dialog_Template);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_user_generated_content_policy);
        appCompatDialog.setTitle((int) C17541R$string.user_generated_content_policy_title);
        View findViewById = appCompatDialog.findViewById(C17532R$id.okButton);
        C13706o.m87926c(findViewById);
        View findViewById2 = appCompatDialog.findViewById(C17532R$id.cancelButton);
        C13706o.m87926c(findViewById2);
        ((Button) findViewById).setOnClickListener(new C6347a(activity, aVar, appCompatDialog));
        ((Button) findViewById2).setOnClickListener(new C6348b(appCompatDialog));
        C4656c.m18114c(appCompatDialog, 0);
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m24564q(Activity activity, C16254a aVar, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(activity, "$activity");
        C13706o.m87929f(aVar, "$acceptedCallback");
        C13706o.m87929f(appCompatDialog, "$dialog");
        C5163j2.m20072U3(activity, true);
        aVar.invoke();
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final void m24565r(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        r6 = r3.mo34092j();
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32404i(com.firebase.p073ui.auth.IdpResponse r3, p448z9.C17070a r4, com.arlosoft.macrodroid.user.signin.C6353g.C6355b r5, boolean r6) {
        /*
            r2 = this;
            java.lang.String r0 = "disposable"
            kotlin.jvm.internal.C13706o.m87929f(r4, r0)
            java.lang.String r0 = "callbackHandler"
            kotlin.jvm.internal.C13706o.m87929f(r5, r0)
            com.google.firebase.auth.FirebaseAuth r0 = com.google.firebase.auth.FirebaseAuth.getInstance()
            com.google.firebase.auth.FirebaseUser r0 = r0.mo22613g()
            if (r0 == 0) goto L_0x0043
            java.lang.String r3 = r0.mo22647l2()
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = r0.mo22647l2()
            goto L_0x0023
        L_0x001f:
            java.lang.String r3 = r0.mo22649n2()
        L_0x0023:
            if (r3 == 0) goto L_0x002f
            if (r6 == 0) goto L_0x002b
            r2.m24558k(r3, r4, r5)
            goto L_0x0097
        L_0x002b:
            r5.mo27362a()
            goto L_0x0097
        L_0x002f:
            java.lang.String r3 = "Sign in error, no user email or phone number was returned"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r3)
            com.google.firebase.crashlytics.FirebaseCrashlytics r3 = com.google.firebase.crashlytics.FirebaseCrashlytics.m6487a()
            java.lang.Exception r4 = new java.lang.Exception
            java.lang.String r5 = "Template store sign in error, no user email or phone number was returned"
            r4.<init>(r5)
            r3.mo22936d(r4)
            goto L_0x0097
        L_0x0043:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Sign in error: "
            r4.append(r5)
            r5 = 0
            if (r3 == 0) goto L_0x005f
            com.firebase.ui.auth.FirebaseUiException r6 = r3.mo34092j()
            if (r6 == 0) goto L_0x005f
            int r6 = r6.mo34082a()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x0060
        L_0x005f:
            r6 = r5
        L_0x0060:
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r4)
            com.google.firebase.crashlytics.FirebaseCrashlytics r4 = com.google.firebase.crashlytics.FirebaseCrashlytics.m6487a()
            java.lang.Exception r6 = new java.lang.Exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Template store Sign in error: "
            r0.append(r1)
            if (r3 == 0) goto L_0x008a
            com.firebase.ui.auth.FirebaseUiException r3 = r3.mo34092j()
            if (r3 == 0) goto L_0x008a
            int r3 = r3.mo34082a()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
        L_0x008a:
            r0.append(r5)
            java.lang.String r3 = r0.toString()
            r6.<init>(r3)
            r4.mo22936d(r6)
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.user.signin.C6353g.mo32404i(com.firebase.ui.auth.IdpResponse, z9.a, com.arlosoft.macrodroid.user.signin.g$b, boolean):void");
    }

    /* renamed from: s */
    public final void mo32405s(Activity activity) {
        C13706o.m87929f(activity, "activity");
        if (C5163j2.m20159g0(this.f14930a)) {
            activity.startActivityForResult(m24556h(), 9729);
        } else {
            m24563p(activity, new C6357d(activity, this));
        }
    }

    /* renamed from: t */
    public final void mo32406t(Fragment fragment) {
        C13706o.m87929f(fragment, "fragment");
        if (C5163j2.m20159g0(this.f14930a)) {
            fragment.startActivityForResult(m24556h(), 9729);
            return;
        }
        FragmentActivity requireActivity = fragment.requireActivity();
        C13706o.m87928e(requireActivity, "fragment.requireActivity()");
        m24563p(requireActivity, new C6356c(fragment, this));
    }
}
