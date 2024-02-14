package p194y1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.preference.PreferenceManager;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* renamed from: y1.c */
/* compiled from: InfoBarSettings.kt */
public final class C10403c {

    /* renamed from: c */
    public static final C10404a f23644c = new C10404a((C13695i) null);

    /* renamed from: a */
    private final Context f23645a;

    /* renamed from: b */
    private final SharedPreferences f23646b;

    /* renamed from: y1.c$a */
    /* compiled from: InfoBarSettings.kt */
    public static final class C10404a {
        private C10404a() {
        }

        public /* synthetic */ C10404a(C13695i iVar) {
            this();
        }
    }

    public C10403c(Context context) {
        C13706o.m87929f(context, "context");
        this.f23645a = context;
        this.f23646b = PreferenceManager.getDefaultSharedPreferences(context);
    }

    /* renamed from: a */
    private final SharedPreferences.Editor m40764a() {
        SharedPreferences.Editor edit = this.f23646b.edit();
        C13706o.m87928e(edit, "prefs.edit()");
        return edit;
    }

    /* renamed from: b */
    public final long mo41091b() {
        return this.f23646b.getLong("help_translate_timestamp", 0);
    }

    /* renamed from: c */
    public final boolean mo41092c(int i) {
        if (Build.VERSION.SDK_INT >= 30 && i > 0 && i < 519000) {
            return this.f23646b.getBoolean("should_show_file_access_warning", true);
        }
        m40764a().putBoolean("should_show_file_access_warning", false).apply();
        return false;
    }

    /* renamed from: d */
    public final boolean mo41093d() {
        return this.f23646b.getBoolean("should_show_long_press_home_info", true);
    }

    /* renamed from: e */
    public final boolean mo41094e() {
        return this.f23646b.getBoolean("should_show_notification_blocked_warning", true);
    }

    /* renamed from: f */
    public final void mo41095f(long j) {
        m40764a().putLong("help_translate_timestamp", j).apply();
    }

    /* renamed from: g */
    public final void mo41096g(boolean z) {
        m40764a().putBoolean("should_show_file_access_warning", z).apply();
    }

    /* renamed from: h */
    public final void mo41097h(boolean z) {
        m40764a().putBoolean("should_show_long_press_home_info", z).apply();
    }

    /* renamed from: i */
    public final void mo41098i(boolean z) {
        m40764a().putBoolean("should_show_notification_blocked_warning", z).apply();
    }
}
