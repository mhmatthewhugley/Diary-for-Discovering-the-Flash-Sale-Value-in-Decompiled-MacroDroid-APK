package p194y1;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.remoteconfig.C5070a;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.translations.TranslationsActivity;
import com.arlosoft.macrodroid.upgrade.UpgradeActivity2;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p173u3.C10290a;
import p178v3.C10319a;
import p194y1.C10393a;

/* renamed from: y1.b */
/* compiled from: InfoBarHandler.kt */
public final class C10401b {

    /* renamed from: f */
    public static final C10402a f23638f = new C10402a((C13695i) null);

    /* renamed from: a */
    private final Context f23639a;

    /* renamed from: b */
    private final C5070a f23640b;

    /* renamed from: c */
    private final C10319a f23641c;

    /* renamed from: d */
    private final C10290a f23642d;

    /* renamed from: e */
    private final C10403c f23643e;

    /* renamed from: y1.b$a */
    /* compiled from: InfoBarHandler.kt */
    public static final class C10402a {
        private C10402a() {
        }

        public /* synthetic */ C10402a(C13695i iVar) {
            this();
        }
    }

    public C10401b(Context context, C5070a aVar, C10319a aVar2, C10290a aVar3) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(aVar, "remoteConfig");
        C13706o.m87929f(aVar2, "flashSaleManager");
        C13706o.m87929f(aVar3, "encourageUpgradeMessageManager");
        this.f23639a = context;
        this.f23640b = aVar;
        this.f23641c = aVar2;
        this.f23642d = aVar3;
        this.f23643e = new C10403c(context);
    }

    /* renamed from: a */
    private final String m40757a() {
        if (this.f23643e.mo41091b() != 0) {
            return "";
        }
        if (TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - C5163j2.m20247r0(this.f23639a)) <= 7) {
            return "";
        }
        String f = this.f23640b.mo29979f();
        if (f.length() > 0) {
            this.f23643e.mo41095f(System.currentTimeMillis());
        }
        return f;
    }

    /* renamed from: e */
    private final void m40758e() {
        Intent putExtra = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", this.f23639a.getPackageName());
        C13706o.m87928e(putExtra, "Intent(Settings.ACTION_A…AGE, context.packageName)");
        putExtra.addFlags(268435456);
        this.f23639a.startActivity(putExtra);
    }

    /* renamed from: f */
    private final void m40759f() {
        Intent intent = new Intent(this.f23639a, TranslationsActivity.class);
        intent.addFlags(268435456);
        this.f23639a.startActivity(intent);
    }

    /* renamed from: g */
    private final void m40760g() {
        Intent intent = new Intent(this.f23639a, UpgradeActivity2.class);
        intent.addFlags(268435456);
        this.f23639a.startActivity(intent);
    }

    /* renamed from: b */
    public final C10393a mo41088b(int i) {
        if (this.f23643e.mo41092c(i)) {
            return new C10393a.C10396c();
        }
        if (this.f23643e.mo41093d()) {
            return new C10393a.C10399f();
        }
        if (this.f23641c.mo40945e()) {
            return new C10393a.C10397d();
        }
        C10393a a = this.f23642d.mo40906a();
        if (a != null) {
            return a;
        }
        if (Build.VERSION.SDK_INT >= 26 && !NotificationManagerCompat.from(this.f23639a).areNotificationsEnabled() && this.f23643e.mo41094e()) {
            return new C10393a.C10400g();
        }
        String a2 = m40757a();
        if (!(a2.length() > 0)) {
            return null;
        }
        String string = this.f23639a.getString(C17541R$string.translations);
        C13706o.m87928e(string, "context.getString(R.string.translations)");
        return new C10393a.C10398e(a2, string);
    }

    /* renamed from: c */
    public final void mo41089c(C10393a aVar) {
        C13706o.m87929f(aVar, "infoBar");
        if (aVar instanceof C10393a.C10400g) {
            m40758e();
        } else if (aVar instanceof C10393a.C10398e) {
            m40759f();
        } else {
            if (aVar instanceof C10393a.C10394a ? true : aVar instanceof C10393a.C10395b) {
                m40760g();
            }
        }
    }

    /* renamed from: d */
    public final void mo41090d(C10393a aVar) {
        C13706o.m87929f(aVar, "infoBar");
        if (aVar instanceof C10393a.C10396c) {
            this.f23643e.mo41096g(false);
        } else if (aVar instanceof C10393a.C10399f) {
            this.f23643e.mo41097h(false);
        } else if (aVar instanceof C10393a.C10400g) {
            this.f23643e.mo41098i(false);
        } else {
            if (aVar instanceof C10393a.C10394a ? true : aVar instanceof C10393a.C10395b) {
                this.f23642d.mo40907b(this.f23639a);
            }
        }
    }
}
