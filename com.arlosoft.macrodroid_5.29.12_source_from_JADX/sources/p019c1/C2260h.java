package p019c1;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.C8045b;
import org.altbeacon.beacon.C8051h;
import org.altbeacon.beacon.Region;
import p019c1.C2264i;
import p270ga.C12318a;
import p292io.reactivex.subjects.C13240a;
import p292io.reactivex.subjects.C13242b;
import p414v9.C16728b;
import p414v9.C16735i;
import p414v9.C16737j;
import p414v9.C16739l;
import p440y9.C16971a;

/* renamed from: c1.h */
/* compiled from: RxBeacon.kt */
public final class C2260h {

    /* renamed from: g */
    public static final C2261a f6956g = new C2261a((C13695i) null);

    /* renamed from: a */
    private C8045b f6957a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f6958b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public BeaconManager f6959c;

    /* renamed from: d */
    private final C13240a<C2264i> f6960d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C13242b f6961e;

    /* renamed from: f */
    private final C8051h f6962f;

    /* renamed from: c1.h$a */
    /* compiled from: RxBeacon.kt */
    public static final class C2261a {
        private C2261a() {
        }

        public /* synthetic */ C2261a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C2260h mo24562a(Context context) {
            C13706o.m87929f(context, "context");
            return new C2260h(context);
        }
    }

    /* renamed from: c1.h$b */
    /* compiled from: RxBeacon.kt */
    public static final class C2262b implements C8045b {

        /* renamed from: a */
        final /* synthetic */ C2260h f6963a;

        /* renamed from: b */
        final /* synthetic */ C16737j<Boolean> f6964b;

        C2262b(C2260h hVar, C16737j<Boolean> jVar) {
            this.f6963a = hVar;
            this.f6964b = jVar;
        }

        /* renamed from: a */
        public void mo24563a(ServiceConnection serviceConnection) {
            C13706o.m87929f(serviceConnection, "serviceConnection");
            this.f6963a.f6958b.unbindService(serviceConnection);
        }

        /* renamed from: b */
        public void mo24564b() {
            this.f6963a.f6961e.onComplete();
            this.f6964b.onNext(Boolean.TRUE);
            BeaconManager h = this.f6963a.f6959c;
            if (h != null) {
                h.mo37993e(this.f6963a.mo24558p());
            }
        }

        /* renamed from: c */
        public Context mo24565c() {
            return this.f6963a.f6958b;
        }

        /* renamed from: d */
        public boolean mo24566d(Intent intent, ServiceConnection serviceConnection, int i) {
            C13706o.m87929f(intent, "intent");
            C13706o.m87929f(serviceConnection, "serviceConnection");
            return this.f6963a.f6958b.bindService(intent, serviceConnection, i);
        }
    }

    /* renamed from: c1.h$c */
    /* compiled from: RxBeacon.kt */
    public static final class C2263c implements C8051h {

        /* renamed from: a */
        final /* synthetic */ C2260h f6965a;

        C2263c(C2260h hVar) {
            this.f6965a = hVar;
        }

        /* renamed from: a */
        public void mo24567a(Region region) {
            C13706o.m87929f(region, "region");
            this.f6965a.mo24557o().onNext(new C2264i(C2264i.C2265a.ENTER, region));
        }

        /* renamed from: b */
        public void mo24568b(Region region) {
            C13706o.m87929f(region, "region");
            this.f6965a.mo24557o().onNext(new C2264i(C2264i.C2265a.EXIT, region));
        }

        /* renamed from: c */
        public void mo24569c(int i, Region region) {
            C13706o.m87929f(region, "region");
        }
    }

    public C2260h(Context context) {
        List<BeaconParser> r;
        List<BeaconParser> r2;
        List<BeaconParser> r3;
        List<BeaconParser> r4;
        List<BeaconParser> r5;
        C13706o.m87929f(context, "context");
        Context applicationContext = context.getApplicationContext();
        C13706o.m87928e(applicationContext, "context.applicationContext");
        this.f6958b = applicationContext;
        BeaconManager A = BeaconManager.m33479A(applicationContext);
        this.f6959c = A;
        if (!(A == null || (r5 = A.mo38009r()) == null)) {
            r5.add(new BeaconParser().mo38029u("m:2-3=0215,i:4-19,i:20-21,i:22-23,p:24-24"));
        }
        BeaconManager beaconManager = this.f6959c;
        if (!(beaconManager == null || (r4 = beaconManager.mo38009r()) == null)) {
            r4.add(new BeaconParser().mo38029u("x,s:0-1=feaa,m:2-2=20,d:3-3,d:4-5,d:6-7,d:8-11,d:12-15"));
        }
        BeaconManager beaconManager2 = this.f6959c;
        if (!(beaconManager2 == null || (r3 = beaconManager2.mo38009r()) == null)) {
            r3.add(new BeaconParser().mo38029u("s:0-1=feaa,m:2-2=00,p:3-3:-41,i:4-13,i:14-19"));
        }
        BeaconManager beaconManager3 = this.f6959c;
        if (!(beaconManager3 == null || (r2 = beaconManager3.mo38009r()) == null)) {
            r2.add(new BeaconParser().mo38029u("s:0-1=feaa,m:2-2=10,p:3-3:-41,i:4-20v"));
        }
        BeaconManager beaconManager4 = this.f6959c;
        if (!(beaconManager4 == null || (r = beaconManager4.mo38009r()) == null)) {
            r.add(new BeaconParser().mo38029u("m:2-3=beac,i:4-19,i:20-21,i:22-23,p:24-24,d:25-25"));
        }
        BeaconManager beaconManager5 = this.f6959c;
        if (beaconManager5 != null) {
            beaconManager5.mo37990Z(5000);
        }
        BeaconManager beaconManager6 = this.f6959c;
        if (beaconManager6 != null) {
            beaconManager6.mo37989Y(15000);
        }
        C13240a<C2264i> i0 = C13240a.m85593i0();
        C13706o.m87928e(i0, "create()");
        this.f6960d = i0;
        C13242b t = C13242b.m85602t();
        C13706o.m87928e(t, "create()");
        this.f6961e = t;
        this.f6962f = new C2263c(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final C16739l m9306k(C2260h hVar, Region region, Boolean bool) {
        C13706o.m87929f(hVar, "this$0");
        C13706o.m87929f(region, "$region");
        C13706o.m87929f(bool, "<anonymous parameter 0>");
        return C16735i.m99352k(new C1429g(hVar, region));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m9307l(C2260h hVar, Region region, C16737j jVar) {
        C13706o.m87929f(hVar, "this$0");
        C13706o.m87929f(region, "$region");
        C13706o.m87929f(jVar, "objectObservableEmitter");
        BeaconManager beaconManager = hVar.f6959c;
        if (beaconManager != null) {
            beaconManager.mo37995f(new C1427e(hVar, jVar));
        }
        BeaconManager beaconManager2 = hVar.f6959c;
        if (beaconManager2 != null) {
            beaconManager2.mo37996f0(region);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m9308m(C2260h hVar, C16737j jVar, Collection collection, Region region) {
        C13706o.m87929f(hVar, "this$0");
        C13706o.m87929f(jVar, "$objectObservableEmitter");
        C13706o.m87928e(collection, "collection");
        if (!collection.isEmpty()) {
            BeaconManager beaconManager = hVar.f6959c;
            if (beaconManager != null) {
                beaconManager.mo37999h0(region);
            }
            BeaconManager beaconManager2 = hVar.f6959c;
            if (beaconManager2 != null) {
                beaconManager2.mo37987V();
            }
            C13706o.m87928e(region, "region");
            jVar.onNext(new C2266j(collection, region));
        }
    }

    /* renamed from: q */
    private final C16735i<Boolean> m9309q() {
        if (!this.f6961e.mo70084u()) {
            return mo24559r();
        }
        C16735i<Boolean> F = C16735i.m99342F(Boolean.TRUE);
        C13706o.m87928e(F, "{\n            Observable.just(true)\n        }");
        return F;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final void m9310s(C2260h hVar, C16737j jVar) {
        C13706o.m87929f(hVar, "this$0");
        C13706o.m87929f(jVar, "objectObservableEmitter");
        C2262b bVar = new C2262b(hVar, jVar);
        hVar.f6957a = bVar;
        BeaconManager beaconManager = hVar.f6959c;
        if (beaconManager != null) {
            beaconManager.mo38001j(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static final void m9311t(C2260h hVar) {
        BeaconManager beaconManager;
        BeaconManager beaconManager2;
        C13706o.m87929f(hVar, "this$0");
        C8045b bVar = hVar.f6957a;
        if (!(bVar == null || (beaconManager2 = hVar.f6959c) == null)) {
            beaconManager2.mo38002j0(bVar);
        }
        if (!(hVar.f6957a == null || (beaconManager = hVar.f6959c) == null)) {
            beaconManager.mo37986U();
        }
        C13242b t = C13242b.m85602t();
        C13706o.m87928e(t, "create()");
        hVar.f6961e = t;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final void m9312v(C2260h hVar, Region region) {
        C13706o.m87929f(hVar, "this$0");
        C13706o.m87929f(region, "$region");
        BeaconManager beaconManager = hVar.f6959c;
        if (beaconManager != null) {
            beaconManager.mo37994e0(region);
        }
    }

    /* renamed from: j */
    public final C16735i<C2266j> mo24555j(Region region) {
        C13706o.m87929f(region, "region");
        C16735i<R> I = m9309q().mo79712u(new C1426d(this, region)).mo79694Z(10, TimeUnit.SECONDS).mo79688T(C12318a.m83030b()).mo79679I(C16971a.m100210a());
        C13706o.m87928e(I, "initIfRequired().flatMap…dSchedulers.mainThread())");
        return I;
    }

    /* renamed from: n */
    public final void mo24556n() {
        List<BeaconParser> r;
        List<BeaconParser> r2;
        List<BeaconParser> r3;
        List<BeaconParser> r4;
        List<BeaconParser> r5;
        BeaconManager beaconManager = this.f6959c;
        if (!(beaconManager == null || (r5 = beaconManager.mo38009r()) == null)) {
            r5.remove(new BeaconParser().mo38029u("m:2-3=0215,i:4-19,i:20-21,i:22-23,p:24-24"));
        }
        BeaconManager beaconManager2 = this.f6959c;
        if (!(beaconManager2 == null || (r4 = beaconManager2.mo38009r()) == null)) {
            r4.remove(new BeaconParser().mo38029u("x,s:0-1=feaa,m:2-2=20,d:3-3,d:4-5,d:6-7,d:8-11,d:12-15"));
        }
        BeaconManager beaconManager3 = this.f6959c;
        if (!(beaconManager3 == null || (r3 = beaconManager3.mo38009r()) == null)) {
            r3.remove(new BeaconParser().mo38029u("s:0-1=feaa,m:2-2=00,p:3-3:-41,i:4-13,i:14-19"));
        }
        BeaconManager beaconManager4 = this.f6959c;
        if (!(beaconManager4 == null || (r2 = beaconManager4.mo38009r()) == null)) {
            r2.remove(new BeaconParser().mo38029u("s:0-1=feaa,m:2-2=10,p:3-3:-41,i:4-20v"));
        }
        BeaconManager beaconManager5 = this.f6959c;
        if (!(beaconManager5 == null || (r = beaconManager5.mo38009r()) == null)) {
            r.remove(new BeaconParser().mo38029u("m:2-3=beac,i:4-19,i:20-21,i:22-23,p:24-24,d:25-25"));
        }
        BeaconManager beaconManager6 = this.f6959c;
        if (beaconManager6 != null) {
            beaconManager6.mo37987V();
        }
        this.f6959c = null;
    }

    /* renamed from: o */
    public final C13240a<C2264i> mo24557o() {
        return this.f6960d;
    }

    /* renamed from: p */
    public final C8051h mo24558p() {
        return this.f6962f;
    }

    /* renamed from: r */
    public final C16735i<Boolean> mo24559r() {
        BeaconManager beaconManager = this.f6959c;
        if (beaconManager != null) {
            beaconManager.mo37991b0(false);
        }
        C16735i<Boolean> p = C16735i.m99352k(new C1428f(this)).mo79709p(new C1424b(this));
        C13706o.m87928e(p, "create<Boolean> { object…reate()\n                }");
        return p;
    }

    /* renamed from: u */
    public final C16728b mo24560u(Region region) {
        C13706o.m87929f(region, "region");
        C16728b i = this.f6961e.mo79654e(new C1425c(this, region)).mo79658m(C12318a.m83030b()).mo79655i(C16971a.m100210a());
        C13706o.m87928e(i, "initCompletable.doOnComp…dSchedulers.mainThread())");
        return i;
    }

    /* renamed from: w */
    public final void mo24561w(Region region) {
        C13706o.m87929f(region, "region");
        BeaconManager beaconManager = this.f6959c;
        if (beaconManager != null) {
            beaconManager.mo37997g0(region);
        }
    }
}
