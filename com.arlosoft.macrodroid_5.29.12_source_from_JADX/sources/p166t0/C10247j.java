package p166t0;

import android.app.Application;
import com.arlosoft.macrodroid.upgrade.billing.BillingDataSource;
import p287ia.C12478a;
import p422w8.C16779b;

/* renamed from: t0.j */
/* compiled from: BillingModule_ProvideBillingDataSourceFactory */
public final class C10247j implements C12478a {

    /* renamed from: a */
    private final C12478a<Application> f23381a;

    public C10247j(C12478a<Application> aVar) {
        this.f23381a = aVar;
    }

    /* renamed from: a */
    public static C10247j m40281a(C12478a<Application> aVar) {
        return new C10247j(aVar);
    }

    /* renamed from: c */
    public static BillingDataSource m40282c(C12478a<Application> aVar) {
        return m40283d(aVar.get());
    }

    /* renamed from: d */
    public static BillingDataSource m40283d(Application application) {
        return (BillingDataSource) C16779b.m99514b(C10246i.m40280a(application), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public BillingDataSource get() {
        return m40282c(this.f23381a);
    }
}
