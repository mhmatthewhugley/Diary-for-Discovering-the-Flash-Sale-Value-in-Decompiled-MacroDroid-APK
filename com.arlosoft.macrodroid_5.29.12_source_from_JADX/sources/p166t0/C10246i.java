package p166t0;

import android.app.Application;
import com.arlosoft.macrodroid.upgrade.billing.BillingDataSource;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15503p1;

/* renamed from: t0.i */
/* compiled from: BillingModule.kt */
public final class C10246i {

    /* renamed from: a */
    public static final C10246i f23380a = new C10246i();

    private C10246i() {
    }

    /* renamed from: a */
    public static final BillingDataSource m40280a(Application application) {
        C13706o.m87929f(application, "application");
        List m = C13614t.m87751m("com.arlosoft.macrodroid.pro.flash_sale", "com.arlosoft.macrodroid.pro.flash_sale2", "com.arlosoft.macrodroid.pro.h", "com.arlosoft.macrodroid.pro.h2", "com.arlosoft.macrodroid.pro");
        List m2 = C13614t.m87751m("donation_low", "donation_medium", "donation_high");
        return BillingDataSource.f14859E.mo32368a(application, C15503p1.f64723a, C13566b0.m87442q0(m, m2), m2);
    }
}
