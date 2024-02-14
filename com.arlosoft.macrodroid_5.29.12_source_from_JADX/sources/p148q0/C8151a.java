package p148q0;

import android.app.Activity;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.jvm.internal.C13706o;

/* renamed from: q0.a */
/* compiled from: FirebaseAnalyticsEventLogger.kt */
public final class C8151a {

    /* renamed from: a */
    public static final C8151a f19786a = new C8151a();

    /* renamed from: b */
    private static final FirebaseAnalytics f19787b;

    static {
        FirebaseAnalytics instance = FirebaseAnalytics.getInstance(MacroDroidApplication.f9883I.mo27303b());
        C13706o.m87928e(instance, "getInstance(MacroDroidApplication.instance)");
        f19787b = instance;
    }

    private C8151a() {
    }

    /* renamed from: A */
    public static final void m33852A() {
        f19787b.mo61989a("pro_version_check_unknown", (Bundle) null);
    }

    /* renamed from: B */
    public static final void m33853B() {
        f19787b.mo61989a("pro_version_check_valid", (Bundle) null);
    }

    /* renamed from: C */
    public static final void m33854C(String str) {
        C13706o.m87929f(str, "response");
        Bundle bundle = new Bundle();
        bundle.putString("response", str);
        f19787b.mo61989a("review_prompt_answer", bundle);
    }

    /* renamed from: D */
    public static final void m33855D() {
        f19787b.mo61989a("review_prompt_shown", (Bundle) null);
    }

    /* renamed from: E */
    public static final void m33856E(Activity activity, String str) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(str, "screenName");
        f19787b.setCurrentScreen(activity, str, (String) null);
    }

    /* renamed from: F */
    public static final void m33857F(String str) {
        C13706o.m87929f(str, "languageCode");
        Bundle bundle = new Bundle();
        bundle.putString("language_code", str);
        f19787b.mo61989a("translation_info_bar_shown", bundle);
    }

    /* renamed from: G */
    public static final void m33858G(String str, String str2) {
        C13706o.m87929f(str, "id");
        C13706o.m87929f(str2, "serial");
        Bundle bundle = new Bundle();
        bundle.putString("id", str);
        bundle.putString("serial", str2);
        f19787b.mo61989a("updgraded_via_serial", bundle);
    }

    /* renamed from: H */
    public static final void m33859H() {
        f19787b.mo61989a("validate_purchase_screen_shown", (Bundle) null);
    }

    /* renamed from: a */
    public static final void m33860a(String str) {
        C13706o.m87929f(str, NotificationCompat.CATEGORY_MESSAGE);
        FirebaseCrashlytics.m6487a().mo22935c(str);
    }

    /* renamed from: b */
    public static final void m33861b(String str) {
        C13706o.m87929f(str, "id");
        Bundle bundle = new Bundle();
        bundle.putString("id", str);
        f19787b.mo61989a("activation_limit_reached", bundle);
    }

    /* renamed from: c */
    public static final void m33862c() {
        f19787b.mo61989a("advert_clicked", (Bundle) null);
    }

    /* renamed from: d */
    public static final void m33863d(String str) {
        C13706o.m87929f(str, "reason");
        Bundle bundle = new Bundle();
        bundle.putString("reason", str);
        f19787b.mo61989a("advert_failed_to_load", bundle);
    }

    /* renamed from: e */
    public static final void m33864e() {
        f19787b.mo61989a("advert_shown", (Bundle) null);
    }

    /* renamed from: f */
    public static final void m33865f() {
        f19787b.mo61989a("advert_loaded", (Bundle) null);
    }

    /* renamed from: g */
    public static final void m33866g(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("key_index", i);
        f19787b.mo61989a("app_brain_api_call_made", bundle);
    }

    /* renamed from: h */
    public static final void m33867h() {
        f19787b.mo61989a("app_brain_calls_exceeded", (Bundle) null);
    }

    /* renamed from: i */
    public static final void m33868i(String str) {
        C13706o.m87929f(str, "bannerType");
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        f19787b.mo61989a("banner_shown", bundle);
    }

    /* renamed from: j */
    public static final void m33869j() {
        f19787b.mo61989a("pro_version_check", (Bundle) null);
    }

    /* renamed from: k */
    public static final void m33870k() {
        if (C5163j2.m20167h0(MacroDroidApplication.f9883I.mo27303b(), "funnel_onboarding_start")) {
            f19786a.m33881w("funnel_macro_added_one", (Bundle) null);
        }
    }

    /* renamed from: l */
    public static final void m33871l() {
        if (C5163j2.m20167h0(MacroDroidApplication.f9883I.mo27303b(), "funnel_macro_added_one")) {
            f19786a.m33881w("funnel_macro_added_five", (Bundle) null);
        }
    }

    /* renamed from: m */
    public static final void m33872m(long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("days_installed", j);
        bundle.putString("days_installed_string", String.valueOf(j));
        f19787b.mo61989a("flash_sale_enabled", bundle);
    }

    /* renamed from: n */
    public static final void m33873n(Throwable th) {
        FirebaseCrashlytics a = FirebaseCrashlytics.m6487a();
        C13706o.m87926c(th);
        a.mo22936d(th);
    }

    /* renamed from: o */
    public static final void m33874o() {
        f19787b.mo61989a("upgrade_button_home_screen_clicked", (Bundle) null);
    }

    /* renamed from: p */
    public static final void m33875p() {
        f19787b.mo61989a("legacy_pro_not_applied", (Bundle) null);
    }

    /* renamed from: r */
    public static final void m33876r(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_on", z);
        f19787b.mo61989a("main_switch_toggle", bundle);
    }

    /* renamed from: s */
    public static final void m33877s(int i, int i2, String str, boolean z) {
        C13706o.m87929f(str, "screenName");
        Bundle bundle = new Bundle();
        bundle.putInt("days_installed", i);
        bundle.putString("days_installed_string", String.valueOf(i));
        bundle.putInt("num_macros", i2);
        bundle.putString("num_macros_string", String.valueOf(i2));
        bundle.putString("screen_type", str);
        bundle.putBoolean("flash_sale", z);
        f19787b.mo61989a("new_purchase", bundle);
    }

    /* renamed from: t */
    public static final void m33878t() {
        f19787b.mo61989a("funnel_onboarding_complete", (Bundle) null);
    }

    /* renamed from: u */
    public static final void m33879u() {
        f19787b.mo61989a("funnel_onboarding_skipped", (Bundle) null);
    }

    /* renamed from: v */
    public static final void m33880v() {
        f19786a.m33881w("funnel_onboarding_start", (Bundle) null);
    }

    /* renamed from: w */
    private final void m33881w(String str, Bundle bundle) {
        MacroDroidApplication.C3787a aVar = MacroDroidApplication.f9883I;
        if (!C5163j2.m20167h0(aVar.mo27303b(), str)) {
            f19787b.mo61989a(str, (Bundle) null);
            C5163j2.m20079V3(aVar.mo27303b(), str, true);
        }
    }

    /* renamed from: x */
    public static final void m33882x() {
        f19787b.mo61989a("pro_advert_purchase", (Bundle) null);
    }

    /* renamed from: y */
    public static final void m33883y(String str) {
        C13706o.m87929f(str, "reason");
        Bundle bundle = new Bundle();
        bundle.putString("failure_reason", str);
        f19787b.mo61989a("pro_version_check_exception", bundle);
    }

    /* renamed from: z */
    public static final void m33884z(String str) {
        C13706o.m87929f(str, "reason");
        Bundle bundle = new Bundle();
        bundle.putString("failure_reason", str);
        f19787b.mo61989a("pro_version_check_failed", bundle);
    }

    /* renamed from: q */
    public final void mo38167q(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("advert_status", z ? "replacement_advert" : "no_advert_available");
        f19787b.mo61989a("pro_advert_shown", bundle);
    }
}
