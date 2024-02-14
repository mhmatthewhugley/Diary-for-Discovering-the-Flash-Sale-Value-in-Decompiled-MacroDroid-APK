package p178v3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.extensions.C4657d;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.remoteconfig.C5070a;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.upgrade.UpgradeActivity2;
import com.arlosoft.macrodroid.utils.C6368b1;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p148q0.C8151a;
import p190x3.C10378a;

/* renamed from: v3.a */
/* compiled from: FlashSaleManager.kt */
public final class C10319a {

    /* renamed from: c */
    public static final C10320a f23486c = new C10320a((C13695i) null);

    /* renamed from: a */
    private final C5070a f23487a;

    /* renamed from: b */
    private final C4083b f23488b;

    /* renamed from: v3.a$a */
    /* compiled from: FlashSaleManager.kt */
    public static final class C10320a {
        private C10320a() {
        }

        public /* synthetic */ C10320a(C13695i iVar) {
            this();
        }
    }

    public C10319a(C5070a aVar, C4083b bVar) {
        C13706o.m87929f(aVar, "remoteConfig");
        C13706o.m87929f(bVar, "premiumStatusHandler");
        this.f23487a = aVar;
        this.f23488b = bVar;
    }

    /* renamed from: a */
    public final boolean mo40941a() {
        if (mo40945e() || this.f23488b.mo28009e().mo28008a()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C10378a aVar = C10378a.f23596a;
        long r0 = C5163j2.m20247r0(aVar.mo41059a());
        if (r0 <= 0) {
            return false;
        }
        long days = TimeUnit.MILLISECONDS.toDays(currentTimeMillis - C5163j2.m20247r0(aVar.mo41059a()));
        C4878b.m18864c(">> Install date = " + r0 + " - Days since install = " + days);
        int Y0 = C5163j2.m20097Y0(aVar.mo41059a());
        if ((Y0 > 0 || (Y0 = (int) this.f23487a.mo29978e()) != 0) && days >= ((long) Y0)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo40942b(Context context) {
        C13706o.m87929f(context, "context");
        NotificationManagerCompat from = NotificationManagerCompat.from(context);
        C13706o.m87928e(from, "from(context)");
        from.cancel(7073236);
    }

    /* renamed from: c */
    public final void mo40943c(Context context) {
        C13706o.m87929f(context, "context");
        NotificationCompat.Builder autoCancel = new NotificationCompat.Builder(context).setSmallIcon((int) C17530R$drawable.material_ic_money_off_24px_svg).setContentTitle(context.getString(C17541R$string.flash_sale)).setContentText(context.getString(C17541R$string.for_limited_time_sale_price)).setContentIntent(PendingIntent.getActivity(context, 0, new Intent(context, UpgradeActivity2.class), C6368b1.f14959b | 268435456)).setPriority(2).setDefaults(-1).setChannelId("info_notification").setAutoCancel(true);
        C13706o.m87928e(autoCancel, "Builder(context)\n       …     .setAutoCancel(true)");
        NotificationManagerCompat from = NotificationManagerCompat.from(context);
        C13706o.m87928e(from, "from(context)");
        from.notify(7073236, autoCancel.build());
        C5163j2.m20242q3(context, false);
    }

    /* renamed from: d */
    public final long mo40944d() {
        return C5163j2.m20082W(C10378a.f23596a.mo41059a());
    }

    /* renamed from: e */
    public final boolean mo40945e() {
        if (!this.f23488b.mo28009e().mo28008a() && System.currentTimeMillis() < mo40944d()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo40946f() {
        if (!mo40941a()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C10378a aVar = C10378a.f23596a;
        long days = TimeUnit.MILLISECONDS.toDays(currentTimeMillis - C5163j2.m20247r0(aVar.mo41059a()));
        C8151a.m33872m(days);
        C5163j2.m20024N4(aVar.mo41059a(), ((int) days) + ((int) this.f23487a.mo29978e()));
        C5163j2.m20016M3(aVar.mo41059a(), currentTimeMillis + ((long) C4657d.m18116a(24)));
        return true;
    }
}
