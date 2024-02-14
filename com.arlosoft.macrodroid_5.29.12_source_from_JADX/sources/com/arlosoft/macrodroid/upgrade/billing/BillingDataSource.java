package com.arlosoft.macrodroid.upgrade.billing;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.work.PeriodicWorkRequest;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13654b;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13678a0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15423h2;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.flow.C15276b0;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15288g;
import kotlinx.coroutines.flow.C15290h;
import kotlinx.coroutines.flow.C15346k0;
import kotlinx.coroutines.flow.C15401u;
import kotlinx.coroutines.flow.C15402v;
import kotlinx.coroutines.flow.C15406z;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* compiled from: BillingDataSource.kt */
public final class BillingDataSource implements LifecycleObserver, PurchasesUpdatedListener, BillingClientStateListener {

    /* renamed from: E */
    public static final C6307a f14859E = new C6307a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: F */
    public static final String f14860F = ("TrivialDrive:" + BillingDataSource.class.getSimpleName());
    /* access modifiers changed from: private */

    /* renamed from: G */
    public static volatile BillingDataSource f14861G;

    /* renamed from: H */
    private static final Handler f14862H = new Handler(Looper.getMainLooper());

    /* renamed from: A */
    private final Set<Purchase> f14863A = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final C15401u<List<String>> f14864B = C15276b0.m94087b(0, 1, (C15220e) null, 5, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final C15401u<List<String>> f14865C = C15276b0.m94087b(0, 0, (C15220e) null, 7, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final C15402v<Boolean> f14866D = C15346k0.m94215a(Boolean.FALSE);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Application f14867a;

    /* renamed from: c */
    private final C15478k0 f14868c;

    /* renamed from: d */
    private final List<String> f14869d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final List<String> f14870f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final BillingClient f14871g;

    /* renamed from: o */
    private long f14872o = 1000;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public long f14873p = -14400000;

    /* renamed from: s */
    private final Map<String, C15402v<C6308b>> f14874s = new HashMap();

    /* renamed from: z */
    private final Map<String, C15402v<SkuDetails>> f14875z = new HashMap();

    /* renamed from: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$a */
    /* compiled from: BillingDataSource.kt */
    public static final class C6307a {
        private C6307a() {
        }

        public /* synthetic */ C6307a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final BillingDataSource mo32368a(Application application, C15478k0 k0Var, List<String> list, List<String> list2) {
            C13706o.m87929f(application, "application");
            C13706o.m87929f(k0Var, "defaultScope");
            C13706o.m87929f(list, "knownInappSKUs");
            C13706o.m87929f(list2, "autoConsumeSKUs");
            BillingDataSource j = BillingDataSource.f14861G;
            if (j == null) {
                synchronized (this) {
                    j = BillingDataSource.f14861G;
                    if (j == null) {
                        j = new BillingDataSource(application, k0Var, list, list2);
                        C6307a aVar = BillingDataSource.f14859E;
                        BillingDataSource.f14861G = j;
                    }
                }
            }
            return j;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$b */
    /* compiled from: BillingDataSource.kt */
    private enum C6308b {
        SKU_STATE_UNKNOWN,
        SKU_STATE_UNPURCHASED,
        SKU_STATE_PENDING,
        SKU_STATE_PURCHASED,
        SKU_STATE_PURCHASED_AND_ACKNOWLEDGED
    }

    /* renamed from: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$c */
    /* compiled from: SafeCollector.common.kt */
    public static final class C6309c implements C15285f<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C15285f f14882a;

        /* renamed from: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$c$a */
        /* compiled from: Emitters.kt */
        public static final class C6310a<T> implements C15288g {

            /* renamed from: a */
            final /* synthetic */ C15288g f14883a;

            /* renamed from: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$c$a$a */
            /* compiled from: Emitters.kt */
            public static final class C6311a extends C13656d {
                Object L$0;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C6310a this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C6311a(C6310a aVar, C13635d dVar) {
                    super(dVar);
                    this.this$0 = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit((Object) null, this);
                }
            }

            public C6310a(C15288g gVar) {
                this.f14883a = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.C13635d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.C6309c.C6310a.C6311a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$c$a$a r0 = (com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.C6309c.C6310a.C6311a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$c$a$a r0 = new com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$c$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p297ja.C13332o.m85685b(r6)
                    goto L_0x004e
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    p297ja.C13332o.m85685b(r6)
                    kotlinx.coroutines.flow.g r6 = r4.f14883a
                    java.lang.Number r5 = (java.lang.Number) r5
                    int r5 = r5.intValue()
                    if (r5 <= 0) goto L_0x0040
                    r5 = 1
                    goto L_0x0041
                L_0x0040:
                    r5 = 0
                L_0x0041:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C13654b.m87833a(r5)
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004e
                    return r1
                L_0x004e:
                    ja.u r5 = p297ja.C13339u.f61331a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.C6309c.C6310a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public C6309c(C15285f fVar) {
            this.f14882a = fVar;
        }

        public Object collect(C15288g gVar, C13635d dVar) {
            Object collect = this.f14882a.collect(new C6310a(gVar), dVar);
            if (collect == C13652d.m87832c()) {
                return collect;
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$d */
    /* compiled from: BillingDataSource.kt */
    static final class C6312d extends C13665l implements C16269p<Boolean, C13635d<? super C13339u>, Object> {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ BillingDataSource this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6312d(BillingDataSource billingDataSource, C13635d<? super C6312d> dVar) {
            super(2, dVar);
            this.this$0 = billingDataSource;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C6312d dVar2 = new C6312d(this.this$0, dVar);
            dVar2.Z$0 = ((Boolean) obj).booleanValue();
            return dVar2;
        }

        /* renamed from: h */
        public final Object mo32369h(boolean z, C13635d<? super C13339u> dVar) {
            return ((C6312d) create(Boolean.valueOf(z), dVar)).invokeSuspend(C13339u.f61331a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo32369h(((Boolean) obj).booleanValue(), (C13635d) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                if (this.Z$0 && SystemClock.elapsedRealtime() - this.this$0.f14873p > 14400000) {
                    this.this$0.f14873p = SystemClock.elapsedRealtime();
                    String unused = BillingDataSource.f14860F;
                    BillingDataSource billingDataSource = this.this$0;
                    this.label = 1;
                    if (billingDataSource.m24491D(this) == c) {
                        return c;
                    }
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$e */
    /* compiled from: BillingDataSource.kt */
    static final class C6313e extends C13656d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BillingDataSource this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6313e(BillingDataSource billingDataSource, C13635d<? super C6313e> dVar) {
            super(dVar);
            this.this$0 = billingDataSource;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.m24514s((Purchase) null, this);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$f */
    /* compiled from: BillingDataSource.kt */
    static final class C6314f extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Purchase $purchase;
        int label;
        final /* synthetic */ BillingDataSource this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6314f(BillingDataSource billingDataSource, Purchase purchase, C13635d<? super C6314f> dVar) {
            super(2, dVar);
            this.this$0 = billingDataSource;
            this.$purchase = purchase;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C6314f(this.this$0, this.$purchase, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C6314f) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C15401u h = this.this$0.f14865C;
                ArrayList<String> skus = this.$purchase.getSkus();
                C13706o.m87928e(skus, "purchase.skus");
                this.label = 1;
                if (h.emit(skus, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$g */
    /* compiled from: BillingDataSource.kt */
    static final class C6315g extends C13656d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BillingDataSource this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6315g(BillingDataSource billingDataSource, C13635d<? super C6315g> dVar) {
            super(dVar);
            this.this$0 = billingDataSource;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.m24515u((String[]) null, (String) null, this);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$h */
    /* compiled from: SafeCollector.common.kt */
    public static final class C6316h implements C15285f<String> {

        /* renamed from: a */
        final /* synthetic */ C15285f f14884a;

        /* renamed from: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$h$a */
        /* compiled from: Emitters.kt */
        public static final class C6317a<T> implements C15288g {

            /* renamed from: a */
            final /* synthetic */ C15288g f14885a;

            /* renamed from: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$h$a$a */
            /* compiled from: Emitters.kt */
            public static final class C6318a extends C13656d {
                Object L$0;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C6317a this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C6318a(C6317a aVar, C13635d dVar) {
                    super(dVar);
                    this.this$0 = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit((Object) null, this);
                }
            }

            public C6317a(C15288g gVar) {
                this.f14885a = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.C13635d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.C6316h.C6317a.C6318a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$h$a$a r0 = (com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.C6316h.C6317a.C6318a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$h$a$a r0 = new com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$h$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p297ja.C13332o.m85685b(r6)
                    goto L_0x004c
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    p297ja.C13332o.m85685b(r6)
                    kotlinx.coroutines.flow.g r6 = r4.f14885a
                    com.android.billingclient.api.SkuDetails r5 = (com.android.billingclient.api.SkuDetails) r5
                    if (r5 == 0) goto L_0x003f
                    java.lang.String r5 = r5.getPrice()
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    if (r5 != 0) goto L_0x0043
                    goto L_0x004c
                L_0x0043:
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004c
                    return r1
                L_0x004c:
                    ja.u r5 = p297ja.C13339u.f61331a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.C6316h.C6317a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public C6316h(C15285f fVar) {
            this.f14884a = fVar;
        }

        public Object collect(C15288g gVar, C13635d dVar) {
            Object collect = this.f14884a.collect(new C6317a(gVar), dVar);
            if (collect == C13652d.m87832c()) {
                return collect;
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$i */
    /* compiled from: SafeCollector.common.kt */
    public static final class C6319i implements C15285f<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C15285f f14886a;

        /* renamed from: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$i$a */
        /* compiled from: Emitters.kt */
        public static final class C6320a<T> implements C15288g {

            /* renamed from: a */
            final /* synthetic */ C15288g f14887a;

            /* renamed from: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$i$a$a */
            /* compiled from: Emitters.kt */
            public static final class C6321a extends C13656d {
                Object L$0;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C6320a this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C6321a(C6320a aVar, C13635d dVar) {
                    super(dVar);
                    this.this$0 = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit((Object) null, this);
                }
            }

            public C6320a(C15288g gVar) {
                this.f14887a = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.C13635d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.C6319i.C6320a.C6321a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$i$a$a r0 = (com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.C6319i.C6320a.C6321a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$i$a$a r0 = new com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$i$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p297ja.C13332o.m85685b(r6)
                    goto L_0x0052
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    p297ja.C13332o.m85685b(r6)
                    kotlinx.coroutines.flow.g r6 = r4.f14887a
                    com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$b r5 = (com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.C6308b) r5
                    com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$b r2 = com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.C6308b.SKU_STATE_UNKNOWN
                    if (r5 != r2) goto L_0x003e
                    r5 = 0
                    goto L_0x0049
                L_0x003e:
                    com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$b r2 = com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.C6308b.SKU_STATE_PURCHASED_AND_ACKNOWLEDGED
                    if (r5 != r2) goto L_0x0044
                    r5 = 1
                    goto L_0x0045
                L_0x0044:
                    r5 = 0
                L_0x0045:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C13654b.m87833a(r5)
                L_0x0049:
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0052
                    return r1
                L_0x0052:
                    ja.u r5 = p297ja.C13339u.f61331a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.C6319i.C6320a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public C6319i(C15285f fVar) {
            this.f14886a = fVar;
        }

        public Object collect(C15288g gVar, C13635d dVar) {
            Object collect = this.f14886a.collect(new C6320a(gVar), dVar);
            if (collect == C13652d.m87832c()) {
                return collect;
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$j */
    /* compiled from: BillingDataSource.kt */
    static final class C6322j extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ BillingFlowParams.Builder $billingFlowParamsBuilder;
        final /* synthetic */ String[] $upgradeSkus;
        int label;
        final /* synthetic */ BillingDataSource this$0;

        /* renamed from: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$j$a */
        /* compiled from: BillingDataSource.kt */
        static final class C6323a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ Activity $activity;
            int label;
            final /* synthetic */ BillingDataSource this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6323a(BillingDataSource billingDataSource, Activity activity, C13635d<? super C6323a> dVar) {
                super(2, dVar);
                this.this$0 = billingDataSource;
                this.$activity = activity;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C6323a(this.this$0, this.$activity, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C6323a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.m24516w(this.$activity);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6322j(BillingDataSource billingDataSource, String[] strArr, BillingFlowParams.Builder builder, Activity activity, C13635d<? super C6322j> dVar) {
            super(2, dVar);
            this.this$0 = billingDataSource;
            this.$upgradeSkus = strArr;
            this.$billingFlowParamsBuilder = builder;
            this.$activity = activity;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C6322j(this.this$0, this.$upgradeSkus, this.$billingFlowParamsBuilder, this.$activity, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C6322j) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                BillingDataSource billingDataSource = this.this$0;
                String[] strArr = this.$upgradeSkus;
                this.label = 1;
                obj = billingDataSource.m24515u(strArr, BillingClient.SkuType.SUBS, this);
                if (obj == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else if (i == 2 || i == 3) {
                C13332o.m85685b(obj);
                return C13339u.f61331a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = (List) obj;
            int size = list.size();
            if (size != 0) {
                if (size != 1) {
                    String l = BillingDataSource.f14860F;
                    Log.e(l, list.size() + " subscriptions subscribed to. Upgrade not possible.");
                } else {
                    this.$billingFlowParamsBuilder.setSubscriptionUpdateParams(BillingFlowParams.SubscriptionUpdateParams.newBuilder().setOldSkuPurchaseToken(((Purchase) list.get(0)).getPurchaseToken()).build());
                }
            }
            BillingClient e = this.this$0.f14871g;
            Activity activity = this.$activity;
            C13706o.m87926c(activity);
            BillingResult launchBillingFlow = e.launchBillingFlow(activity, this.$billingFlowParamsBuilder.build());
            C13706o.m87928e(launchBillingFlow, "billingClient.launchBill…build()\n                )");
            if (launchBillingFlow.getResponseCode() == 0) {
                C15402v f = this.this$0.f14866D;
                Boolean a = C13654b.m87833a(true);
                this.label = 2;
                if (f.emit(a, this) == c) {
                    return c;
                }
            } else {
                C4878b.m18864c("Billing failed: + " + launchBillingFlow.getDebugMessage());
                String l2 = BillingDataSource.f14860F;
                Log.e(l2, "Billing failed: + " + launchBillingFlow.getDebugMessage());
                C15423h2 c2 = C15186a1.m93731c();
                C6323a aVar = new C6323a(this.this$0, this.$activity, (C13635d<? super C6323a>) null);
                this.label = 3;
                if (C15414h.m94298g(c2, aVar, this) == c) {
                    return c;
                }
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$k */
    /* compiled from: BillingDataSource.kt */
    static final class C6324k extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ BillingDataSource this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6324k(BillingDataSource billingDataSource, C13635d<? super C6324k> dVar) {
            super(2, dVar);
            this.this$0 = billingDataSource;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C6324k(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C6324k) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                BillingDataSource billingDataSource = this.this$0;
                this.label = 1;
                if (billingDataSource.m24491D(this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else if (i == 2) {
                C13332o.m85685b(obj);
                return C13339u.f61331a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            BillingDataSource billingDataSource2 = this.this$0;
            this.label = 2;
            if (billingDataSource2.mo32363E(this) == c) {
                return c;
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$l */
    /* compiled from: BillingDataSource.kt */
    static final class C6325l extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ BillingDataSource this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6325l(BillingDataSource billingDataSource, C13635d<? super C6325l> dVar) {
            super(2, dVar);
            this.this$0 = billingDataSource;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C6325l(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C6325l) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C15402v f = this.this$0.f14866D;
                Boolean a = C13654b.m87833a(false);
                this.label = 1;
                if (f.emit(a, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$m */
    /* compiled from: BillingDataSource.kt */
    static final class C6326m extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C13678a0 $isConsumable;
        final /* synthetic */ Purchase $purchase;
        int label;
        final /* synthetic */ BillingDataSource this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6326m(Purchase purchase, BillingDataSource billingDataSource, C13678a0 a0Var, C13635d<? super C6326m> dVar) {
            super(2, dVar);
            this.$purchase = purchase;
            this.this$0 = billingDataSource;
            this.$isConsumable = a0Var;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C6326m(this.$purchase, this.this$0, this.$isConsumable, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C6326m) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x00e3  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0102  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r1 = r7.label
                java.lang.String r2 = "purchase.skus"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0021
                if (r1 == r4) goto L_0x001d
                if (r1 != r3) goto L_0x0015
                p297ja.C13332o.m85685b(r8)
                goto L_0x00db
            L_0x0015:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x001d:
                p297ja.C13332o.m85685b(r8)
                goto L_0x0087
            L_0x0021:
                p297ja.C13332o.m85685b(r8)
                com.android.billingclient.api.Purchase r8 = r7.$purchase
                java.util.ArrayList r8 = r8.getSkus()
                java.util.Iterator r8 = r8.iterator()
            L_0x002e:
                boolean r1 = r8.hasNext()
                r5 = 0
                if (r1 == 0) goto L_0x0074
                java.lang.Object r1 = r8.next()
                java.lang.String r1 = (java.lang.String) r1
                com.arlosoft.macrodroid.upgrade.billing.BillingDataSource r6 = r7.this$0
                java.util.List r6 = r6.f14870f
                boolean r1 = r6.contains(r1)
                if (r1 == 0) goto L_0x004c
                kotlin.jvm.internal.a0 r1 = r7.$isConsumable
                r1.element = r4
                goto L_0x002e
            L_0x004c:
                kotlin.jvm.internal.a0 r1 = r7.$isConsumable
                boolean r1 = r1.element
                if (r1 == 0) goto L_0x002e
                java.lang.String r8 = com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.f14860F
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r6 = "Purchase cannot contain a mixture of consumableand non-consumable items: "
                r1.append(r6)
                com.android.billingclient.api.Purchase r6 = r7.$purchase
                java.util.ArrayList r6 = r6.getSkus()
                r1.append(r6)
                java.lang.String r1 = r1.toString()
                android.util.Log.e(r8, r1)
                kotlin.jvm.internal.a0 r8 = r7.$isConsumable
                r8.element = r5
            L_0x0074:
                kotlin.jvm.internal.a0 r8 = r7.$isConsumable
                boolean r8 = r8.element
                if (r8 == 0) goto L_0x009b
                com.arlosoft.macrodroid.upgrade.billing.BillingDataSource r8 = r7.this$0
                com.android.billingclient.api.Purchase r1 = r7.$purchase
                r7.label = r4
                java.lang.Object r8 = r8.m24514s(r1, r7)
                if (r8 != r0) goto L_0x0087
                return r0
            L_0x0087:
                com.arlosoft.macrodroid.upgrade.billing.BillingDataSource r8 = r7.this$0
                kotlinx.coroutines.flow.u r8 = r8.f14864B
                com.android.billingclient.api.Purchase r0 = r7.$purchase
                java.util.ArrayList r0 = r0.getSkus()
                kotlin.jvm.internal.C13706o.m87928e(r0, r2)
                r8.mo74652b(r0)
                goto L_0x015e
            L_0x009b:
                com.android.billingclient.api.Purchase r8 = r7.$purchase
                boolean r8 = r8.isAcknowledged()
                if (r8 != 0) goto L_0x015e
                com.arlosoft.macrodroid.upgrade.billing.BillingDataSource r8 = r7.this$0
                android.app.Application r8 = r8.f14867a
                com.arlosoft.macrodroid.settings.C5163j2.m20132c5(r8, r5)
                com.arlosoft.macrodroid.upgrade.billing.BillingDataSource r8 = r7.this$0
                android.app.Application r8 = r8.f14867a
                com.arlosoft.macrodroid.settings.C5163j2.m19968F5(r8, r5)
                com.arlosoft.macrodroid.upgrade.billing.BillingDataSource r8 = r7.this$0
                com.android.billingclient.api.BillingClient r8 = r8.f14871g
                com.android.billingclient.api.AcknowledgePurchaseParams$Builder r1 = com.android.billingclient.api.AcknowledgePurchaseParams.newBuilder()
                com.android.billingclient.api.Purchase r4 = r7.$purchase
                java.lang.String r4 = r4.getPurchaseToken()
                com.android.billingclient.api.AcknowledgePurchaseParams$Builder r1 = r1.setPurchaseToken(r4)
                com.android.billingclient.api.AcknowledgePurchaseParams r1 = r1.build()
                java.lang.String r4 = "newBuilder()\n           …                 .build()"
                kotlin.jvm.internal.C13706o.m87928e(r1, r4)
                r7.label = r3
                java.lang.Object r8 = com.android.billingclient.api.BillingClientKotlinKt.acknowledgePurchase(r8, r1, r7)
                if (r8 != r0) goto L_0x00db
                return r0
            L_0x00db:
                com.android.billingclient.api.BillingResult r8 = (com.android.billingclient.api.BillingResult) r8
                int r8 = r8.getResponseCode()
                if (r8 == 0) goto L_0x0102
                java.lang.String r8 = com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.f14860F
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Error acknowledging purchase: "
                r0.append(r1)
                com.android.billingclient.api.Purchase r1 = r7.$purchase
                java.util.ArrayList r1 = r1.getSkus()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.util.Log.e(r8, r0)
                goto L_0x014c
            L_0x0102:
                com.android.billingclient.api.Purchase r8 = r7.$purchase
                java.util.ArrayList r8 = r8.getSkus()
                java.util.Iterator r8 = r8.iterator()
            L_0x010c:
                boolean r0 = r8.hasNext()
                if (r0 == 0) goto L_0x014c
                java.lang.Object r0 = r8.next()
                java.lang.String r0 = (java.lang.String) r0
                com.arlosoft.macrodroid.upgrade.billing.BillingDataSource r1 = r7.this$0
                android.app.Application r1 = r1.f14867a
                com.android.billingclient.api.Purchase r3 = r7.$purchase
                java.lang.String r3 = r3.getOrderId()
                com.arlosoft.macrodroid.settings.C5163j2.m20066T4(r1, r3)
                com.arlosoft.macrodroid.upgrade.billing.BillingDataSource r1 = r7.this$0
                android.app.Application r1 = r1.f14867a
                com.android.billingclient.api.Purchase r3 = r7.$purchase
                java.lang.String r3 = r3.getPurchaseToken()
                com.arlosoft.macrodroid.settings.C5163j2.m20148e5(r1, r3)
                com.arlosoft.macrodroid.upgrade.billing.BillingDataSource r1 = r7.this$0
                android.app.Application r1 = r1.f14867a
                com.arlosoft.macrodroid.settings.C5163j2.m20140d5(r1, r0)
                com.arlosoft.macrodroid.upgrade.billing.BillingDataSource r1 = r7.this$0
                java.lang.String r3 = "sku"
                kotlin.jvm.internal.C13706o.m87928e(r0, r3)
                com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$b r3 = com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.C6308b.SKU_STATE_PURCHASED_AND_ACKNOWLEDGED
                r1.m24494H(r0, r3)
                goto L_0x010c
            L_0x014c:
                com.arlosoft.macrodroid.upgrade.billing.BillingDataSource r8 = r7.this$0
                kotlinx.coroutines.flow.u r8 = r8.f14864B
                com.android.billingclient.api.Purchase r0 = r7.$purchase
                java.util.ArrayList r0 = r0.getSkus()
                kotlin.jvm.internal.C13706o.m87928e(r0, r2)
                r8.mo74652b(r0)
            L_0x015e:
                ja.u r8 = p297ja.C13339u.f61331a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.C6326m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$n */
    /* compiled from: BillingDataSource.kt */
    static final class C6327n extends C13656d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BillingDataSource this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6327n(BillingDataSource billingDataSource, C13635d<? super C6327n> dVar) {
            super(dVar);
            this.this$0 = billingDataSource;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.m24491D(this);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$o */
    /* compiled from: BillingDataSource.kt */
    static final class C6328o extends C13656d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BillingDataSource this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6328o(BillingDataSource billingDataSource, C13635d<? super C6328o> dVar) {
            super(dVar);
            this.this$0 = billingDataSource;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo32363E(this);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$p */
    /* compiled from: BillingDataSource.kt */
    static final class C6329p extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ BillingDataSource this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6329p(BillingDataSource billingDataSource, C13635d<? super C6329p> dVar) {
            super(2, dVar);
            this.this$0 = billingDataSource;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C6329p(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C6329p) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                BillingDataSource billingDataSource = this.this$0;
                this.label = 1;
                if (billingDataSource.mo32363E(this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13339u.f61331a;
        }
    }

    public BillingDataSource(Application application, C15478k0 k0Var, List<String> list, List<String> list2) {
        C13706o.m87929f(application, "application");
        C13706o.m87929f(k0Var, "defaultScope");
        C13706o.m87929f(list, "knownInappSKUs");
        C13706o.m87929f(list2, "autoConsumeSKUs");
        this.f14867a = application;
        this.f14868c = k0Var;
        this.f14869d = list;
        this.f14870f = list2;
        m24517x();
        BillingClient build = BillingClient.newBuilder(application).setListener(this).enablePendingPurchases().build();
        C13706o.m87928e(build, "newBuilder(application)\n…es()\n            .build()");
        this.f14871g = build;
        build.startConnection(this);
    }

    /* renamed from: B */
    private final void m24489B(BillingResult billingResult, List<? extends SkuDetails> list) {
        int responseCode = billingResult.getResponseCode();
        String debugMessage = billingResult.getDebugMessage();
        C13706o.m87928e(debugMessage, "billingResult.debugMessage");
        switch (responseCode) {
            case -2:
            case 7:
            case 8:
                String str = f14860F;
                Log.wtf(str, "onSkuDetailsResponse: " + responseCode + ' ' + debugMessage);
                break;
            case -1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                String str2 = f14860F;
                Log.e(str2, "onSkuDetailsResponse: " + responseCode + ' ' + debugMessage);
                break;
            case 0:
                String str3 = f14860F;
                Log.i(str3, "onSkuDetailsResponse: " + responseCode + ' ' + debugMessage);
                if (list != null && !list.isEmpty()) {
                    for (SkuDetails skuDetails : list) {
                        String sku = skuDetails.getSku();
                        C13706o.m87928e(sku, "skuDetails.sku");
                        C15402v vVar = this.f14875z.get(sku);
                        if (vVar != null) {
                            vVar.mo74652b(skuDetails);
                        } else {
                            String str4 = f14860F;
                            Log.e(str4, "Unknown sku: " + sku);
                        }
                    }
                    break;
                } else {
                    Log.e(str3, "onSkuDetailsResponse: Found null or empty SkuDetails. Check to see if the SKUs you requested are correctly published in the Google Play Console.");
                    break;
                }
                break;
            case 1:
                String str5 = f14860F;
                Log.i(str5, "onSkuDetailsResponse: " + responseCode + ' ' + debugMessage);
                break;
            default:
                String str6 = f14860F;
                Log.wtf(str6, "onSkuDetailsResponse: " + responseCode + ' ' + debugMessage);
                break;
        }
        if (responseCode == 0) {
            this.f14873p = SystemClock.elapsedRealtime();
        } else {
            this.f14873p = -14400000;
        }
    }

    /* renamed from: C */
    private final void m24490C(List<? extends Purchase> list, List<String> list2) {
        HashSet hashSet = new HashSet();
        if (list != null) {
            for (Purchase purchase : list) {
                Iterator<String> it = purchase.getSkus().iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (this.f14874s.get(next) == null) {
                        String str = f14860F;
                        Log.e(str, "Unknown SKU " + next + ". Check to make sure SKU matches SKUS in the Play developer console.");
                    } else {
                        hashSet.add(next);
                    }
                }
                if (purchase.getPurchaseState() != 1) {
                    m24495I(purchase);
                } else if (!m24518z(purchase)) {
                    Log.e(f14860F, "Invalid signature. Check to make sure your public key is correct.");
                } else {
                    m24495I(purchase);
                    C15561w1 unused = C15473j.m94492d(this.f14868c, (C13640g) null, (C15486m0) null, new C6326m(purchase, this, new C13678a0(), (C13635d<? super C6326m>) null), 3, (Object) null);
                }
            }
        }
        if (list2 != null) {
            for (String next2 : list2) {
                if (!hashSet.contains(next2)) {
                    m24494H(next2, C6308b.SKU_STATE_UNPURCHASED);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m24491D(kotlin.coroutines.C13635d<? super p297ja.C13339u> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.C6327n
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$n r0 = (com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.C6327n) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$n r0 = new com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$n
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            com.arlosoft.macrodroid.upgrade.billing.BillingDataSource r0 = (com.arlosoft.macrodroid.upgrade.billing.BillingDataSource) r0
            p297ja.C13332o.m85685b(r6)
            goto L_0x006f
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0035:
            p297ja.C13332o.m85685b(r6)
            java.util.List<java.lang.String> r6 = r5.f14869d
            if (r6 == 0) goto L_0x0045
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r6 = 0
            goto L_0x0046
        L_0x0045:
            r6 = 1
        L_0x0046:
            if (r6 != 0) goto L_0x007c
            com.android.billingclient.api.BillingClient r6 = r5.f14871g
            com.android.billingclient.api.SkuDetailsParams$Builder r2 = com.android.billingclient.api.SkuDetailsParams.newBuilder()
            java.lang.String r4 = "inapp"
            com.android.billingclient.api.SkuDetailsParams$Builder r2 = r2.setType(r4)
            java.util.List<java.lang.String> r4 = r5.f14869d
            com.android.billingclient.api.SkuDetailsParams$Builder r2 = r2.setSkusList(r4)
            com.android.billingclient.api.SkuDetailsParams r2 = r2.build()
            java.lang.String r4 = "newBuilder()\n           …                 .build()"
            kotlin.jvm.internal.C13706o.m87928e(r2, r4)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = com.android.billingclient.api.BillingClientKotlinKt.querySkuDetails(r6, r2, r0)
            if (r6 != r1) goto L_0x006e
            return r1
        L_0x006e:
            r0 = r5
        L_0x006f:
            com.android.billingclient.api.SkuDetailsResult r6 = (com.android.billingclient.api.SkuDetailsResult) r6
            com.android.billingclient.api.BillingResult r1 = r6.getBillingResult()
            java.util.List r6 = r6.getSkuDetailsList()
            r0.m24489B(r1, r6)
        L_0x007c:
            ja.u r6 = p297ja.C13339u.f61331a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.m24491D(kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: F */
    private final void m24492F() {
        f14862H.postDelayed(new C6330a(this), this.f14872o);
        this.f14872o = Math.min(this.f14872o * ((long) 2), PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static final void m24493G(BillingDataSource billingDataSource) {
        C13706o.m87929f(billingDataSource, "this$0");
        billingDataSource.f14871g.startConnection(billingDataSource);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public final void m24494H(String str, C6308b bVar) {
        C15402v vVar = this.f14874s.get(str);
        if (vVar != null) {
            vVar.mo74652b(bVar);
            return;
        }
        String str2 = f14860F;
        Log.e(str2, "Unknown SKU " + str + ". Check to make sure SKU matches SKUS in the Play developer console.");
    }

    /* renamed from: I */
    private final void m24495I(Purchase purchase) {
        Iterator<String> it = purchase.getSkus().iterator();
        while (it.hasNext()) {
            String next = it.next();
            C15402v vVar = this.f14874s.get(next);
            if (vVar == null) {
                String str = f14860F;
                Log.e(str, "Unknown SKU " + next + ". Check to make sure SKU matches SKUS in the Play developer console.");
            } else {
                int purchaseState = purchase.getPurchaseState();
                if (purchaseState == 0) {
                    vVar.mo74652b(C6308b.SKU_STATE_UNPURCHASED);
                } else if (purchaseState != 1) {
                    if (purchaseState != 2) {
                        String str2 = f14860F;
                        Log.e(str2, "Purchase in unknown state: " + purchase.getPurchaseState());
                    } else {
                        vVar.mo74652b(C6308b.SKU_STATE_PENDING);
                    }
                } else if (purchase.isAcknowledged()) {
                    C5163j2.m20066T4(this.f14867a, purchase.getOrderId());
                    C5163j2.m20148e5(this.f14867a, purchase.getPurchaseToken());
                    C5163j2.m20140d5(this.f14867a, next);
                    vVar.mo74652b(C6308b.SKU_STATE_PURCHASED_AND_ACKNOWLEDGED);
                } else {
                    vVar.mo74652b(C6308b.SKU_STATE_PURCHASED);
                }
            }
        }
    }

    /* renamed from: r */
    private final void m24513r(List<String> list) {
        C13706o.m87926c(list);
        for (String next : list) {
            C15402v a = C15346k0.m94215a(C6308b.SKU_STATE_UNKNOWN);
            C15402v a2 = C15346k0.m94215a(null);
            C15290h.m94135u(C15290h.m94138x(C15290h.m94125k(new C6309c(a2.mo74714c())), new C6312d(this, (C13635d<? super C6312d>) null)), this.f14868c);
            this.f14874s.put(next, a);
            this.f14875z.put(next, a2);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m24514s(com.android.billingclient.api.Purchase r9, kotlin.coroutines.C13635d<? super p297ja.C13339u> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.C6313e
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$e r0 = (com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.C6313e) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$e r0 = new com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$e
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r9 = r0.L$1
            com.android.billingclient.api.Purchase r9 = (com.android.billingclient.api.Purchase) r9
            java.lang.Object r0 = r0.L$0
            com.arlosoft.macrodroid.upgrade.billing.BillingDataSource r0 = (com.arlosoft.macrodroid.upgrade.billing.BillingDataSource) r0
            p297ja.C13332o.m85685b(r10)
            goto L_0x0071
        L_0x0031:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0039:
            p297ja.C13332o.m85685b(r10)
            java.util.Set<com.android.billingclient.api.Purchase> r10 = r8.f14863A
            boolean r10 = r10.contains(r9)
            if (r10 == 0) goto L_0x0047
            ja.u r9 = p297ja.C13339u.f61331a
            return r9
        L_0x0047:
            java.util.Set<com.android.billingclient.api.Purchase> r10 = r8.f14863A
            r10.add(r9)
            com.android.billingclient.api.BillingClient r10 = r8.f14871g
            com.android.billingclient.api.ConsumeParams$Builder r2 = com.android.billingclient.api.ConsumeParams.newBuilder()
            java.lang.String r4 = r9.getPurchaseToken()
            com.android.billingclient.api.ConsumeParams$Builder r2 = r2.setPurchaseToken(r4)
            com.android.billingclient.api.ConsumeParams r2 = r2.build()
            java.lang.String r4 = "newBuilder()\n           …                 .build()"
            kotlin.jvm.internal.C13706o.m87928e(r2, r4)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r10 = com.android.billingclient.api.BillingClientKotlinKt.consumePurchase(r10, r2, r0)
            if (r10 != r1) goto L_0x0070
            return r1
        L_0x0070:
            r0 = r8
        L_0x0071:
            com.android.billingclient.api.ConsumeResult r10 = (com.android.billingclient.api.ConsumeResult) r10
            java.util.Set<com.android.billingclient.api.Purchase> r1 = r0.f14863A
            r1.remove(r9)
            com.android.billingclient.api.BillingResult r1 = r10.getBillingResult()
            int r1 = r1.getResponseCode()
            if (r1 != 0) goto L_0x00b0
            kotlinx.coroutines.k0 r2 = r0.f14868c
            r3 = 0
            r4 = 0
            com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$f r5 = new com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$f
            r10 = 0
            r5.<init>(r0, r9, r10)
            r6 = 3
            r7 = 0
            kotlinx.coroutines.C15561w1 unused = kotlinx.coroutines.C15473j.m94492d(r2, r3, r4, r5, r6, r7)
            java.util.ArrayList r9 = r9.getSkus()
            java.util.Iterator r9 = r9.iterator()
        L_0x0099:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00ce
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r1 = "sku"
            kotlin.jvm.internal.C13706o.m87928e(r10, r1)
            com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$b r1 = com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.C6308b.SKU_STATE_UNPURCHASED
            r0.m24494H(r10, r1)
            goto L_0x0099
        L_0x00b0:
            java.lang.String r9 = f14860F
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error while consuming: "
            r0.append(r1)
            com.android.billingclient.api.BillingResult r10 = r10.getBillingResult()
            java.lang.String r10 = r10.getDebugMessage()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            android.util.Log.e(r9, r10)
        L_0x00ce:
            ja.u r9 = p297ja.C13339u.f61331a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.m24514s(com.android.billingclient.api.Purchase, kotlin.coroutines.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m24515u(java.lang.String[] r7, java.lang.String r8, kotlin.coroutines.C13635d<? super java.util.List<? extends com.android.billingclient.api.Purchase>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.C6315g
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$g r0 = (com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.C6315g) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$g r0 = new com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$g
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.L$0
            java.lang.String[] r7 = (java.lang.String[]) r7
            p297ja.C13332o.m85685b(r9)
            goto L_0x0045
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            p297ja.C13332o.m85685b(r9)
            com.android.billingclient.api.BillingClient r9 = r6.f14871g
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r9 = com.android.billingclient.api.BillingClientKotlinKt.queryPurchasesAsync(r9, r8, r0)
            if (r9 != r1) goto L_0x0045
            return r1
        L_0x0045:
            com.android.billingclient.api.PurchasesResult r9 = (com.android.billingclient.api.PurchasesResult) r9
            com.android.billingclient.api.BillingResult r8 = r9.getBillingResult()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            int r1 = r8.getResponseCode()
            if (r1 == 0) goto L_0x0071
            java.lang.String r7 = f14860F
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "Problem getting purchases: "
            r9.append(r1)
            java.lang.String r8 = r8.getDebugMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.e(r7, r8)
            goto L_0x00ac
        L_0x0071:
            java.util.List r8 = r9.getPurchasesList()
            java.util.Iterator r8 = r8.iterator()
        L_0x0079:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00ac
            java.lang.Object r9 = r8.next()
            com.android.billingclient.api.Purchase r9 = (com.android.billingclient.api.Purchase) r9
            r1 = 0
            int r2 = r7.length
        L_0x0087:
            if (r1 >= r2) goto L_0x0079
            r3 = r7[r1]
            java.util.ArrayList r4 = r9.getSkus()
            java.util.Iterator r4 = r4.iterator()
        L_0x0093:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00a9
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = kotlin.jvm.internal.C13706o.m87924a(r5, r3)
            if (r5 == 0) goto L_0x0093
            r0.add(r9)
            goto L_0x0093
        L_0x00a9:
            int r1 = r1 + 1
            goto L_0x0087
        L_0x00ac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.m24515u(java.lang.String[], java.lang.String, kotlin.coroutines.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final void m24516w(Activity activity) {
        if (activity != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle(this.f14867a.getString(C17541R$string.pro_upgrade_failed));
            builder.setMessage(this.f14867a.getString(C17541R$string.unable_to_contact_play_store));
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) null);
            builder.show();
        }
    }

    /* renamed from: x */
    private final void m24517x() {
        m24513r(this.f14869d);
    }

    /* renamed from: z */
    private final boolean m24518z(Purchase purchase) {
        return C6331b.m24529c(purchase.getOriginalJson(), purchase.getSignature());
    }

    /* renamed from: A */
    public final void mo32362A(Activity activity, String str, String... strArr) {
        C13706o.m87929f(str, "sku");
        C13706o.m87929f(strArr, "upgradeSkusVarargs");
        C15402v vVar = this.f14875z.get(str);
        SkuDetails skuDetails = vVar != null ? (SkuDetails) vVar.getValue() : null;
        if (skuDetails != null) {
            BillingFlowParams.Builder newBuilder = BillingFlowParams.newBuilder();
            C13706o.m87928e(newBuilder, "newBuilder()");
            newBuilder.setSkuDetails(skuDetails);
            C15561w1 unused = C15473j.m94492d(this.f14868c, (C13640g) null, (C15486m0) null, new C6322j(this, (String[]) Arrays.copyOf(strArr, strArr.length), newBuilder, activity, (C13635d<? super C6322j>) null), 3, (Object) null);
            return;
        }
        C4878b.m18864c("SkuDetails not found for: " + str);
        String str2 = f14860F;
        Log.e(str2, "SkuDetails not found for: " + str);
        m24516w(activity);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32363E(kotlin.coroutines.C13635d<? super p297ja.C13339u> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.C6328o
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$o r0 = (com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.C6328o) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$o r0 = new com.arlosoft.macrodroid.upgrade.billing.BillingDataSource$o
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            com.arlosoft.macrodroid.upgrade.billing.BillingDataSource r0 = (com.arlosoft.macrodroid.upgrade.billing.BillingDataSource) r0
            p297ja.C13332o.m85685b(r5)
            goto L_0x0048
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            p297ja.C13332o.m85685b(r5)
            com.android.billingclient.api.BillingClient r5 = r4.f14871g
            r0.L$0 = r4
            r0.label = r3
            java.lang.String r2 = "inapp"
            java.lang.Object r5 = com.android.billingclient.api.BillingClientKotlinKt.queryPurchasesAsync(r5, r2, r0)
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r0 = r4
        L_0x0048:
            com.android.billingclient.api.PurchasesResult r5 = (com.android.billingclient.api.PurchasesResult) r5
            com.android.billingclient.api.BillingResult r1 = r5.getBillingResult()
            int r2 = r1.getResponseCode()
            if (r2 == 0) goto L_0x006f
            java.lang.String r5 = f14860F
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Problem getting purchases: "
            r0.append(r2)
            java.lang.String r1 = r1.getDebugMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r5, r0)
            goto L_0x0078
        L_0x006f:
            java.util.List r5 = r5.getPurchasesList()
            java.util.List<java.lang.String> r1 = r0.f14869d
            r0.m24490C(r5, r1)
        L_0x0078:
            ja.u r5 = p297ja.C13339u.f61331a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.upgrade.billing.BillingDataSource.mo32363E(kotlin.coroutines.d):java.lang.Object");
    }

    public void onBillingServiceDisconnected() {
        m24492F();
    }

    public void onBillingSetupFinished(BillingResult billingResult) {
        C13706o.m87929f(billingResult, "billingResult");
        int responseCode = billingResult.getResponseCode();
        String debugMessage = billingResult.getDebugMessage();
        C13706o.m87928e(debugMessage, "billingResult.debugMessage");
        StringBuilder sb = new StringBuilder();
        sb.append("onBillingSetupFinished: ");
        sb.append(responseCode);
        sb.append(' ');
        sb.append(debugMessage);
        if (responseCode == 0) {
            this.f14872o = 1000;
            C15561w1 unused = C15473j.m94492d(this.f14868c, (C13640g) null, (C15486m0) null, new C6324k(this, (C13635d<? super C6324k>) null), 3, (Object) null);
            return;
        }
        m24492F();
    }

    public void onPurchasesUpdated(BillingResult billingResult, List<? extends Purchase> list) {
        C13706o.m87929f(billingResult, "billingResult");
        int responseCode = billingResult.getResponseCode();
        if (responseCode != 0) {
            if (responseCode == 1) {
                Log.i(f14860F, "onPurchasesUpdated: User canceled the purchase");
            } else if (responseCode == 5) {
                Log.e(f14860F, "onPurchasesUpdated: Developer error means that Google Play does not recognize the configuration. If you are just getting started, make sure you have configured the application correctly in the Google Play Console. The SKU product ID must match and the APK you are using must be signed with release keys.");
            } else if (responseCode != 7) {
                StringBuilder sb = new StringBuilder();
                sb.append("BillingResult [");
                sb.append(billingResult.getResponseCode());
                sb.append("]: ");
                sb.append(billingResult.getDebugMessage());
            } else {
                Log.i(f14860F, "onPurchasesUpdated: The user already owns this item");
            }
        } else if (list != null) {
            m24490C(list, (List<String>) null);
            return;
        }
        C15561w1 unused = C15473j.m94492d(this.f14868c, (C13640g) null, (C15486m0) null, new C6325l(this, (C13635d<? super C6325l>) null), 3, (Object) null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void resume() {
        if (!this.f14866D.getValue().booleanValue() && this.f14871g.isReady()) {
            C15561w1 unused = C15473j.m94492d(this.f14868c, (C13640g) null, (C15486m0) null, new C6329p(this, (C13635d<? super C6329p>) null), 3, (Object) null);
        }
    }

    /* renamed from: t */
    public final C15406z<List<String>> mo32365t() {
        return C15290h.m94115a(this.f14864B);
    }

    /* renamed from: v */
    public final C15285f<String> mo32366v(String str) {
        C13706o.m87929f(str, "sku");
        C15402v<SkuDetails> vVar = this.f14875z.get(str);
        C13706o.m87926c(vVar);
        return new C6316h(vVar);
    }

    /* renamed from: y */
    public final C15285f<Boolean> mo32367y(String str) {
        C13706o.m87929f(str, "sku");
        C15402v<C6308b> vVar = this.f14874s.get(str);
        C13706o.m87926c(vVar);
        return new C6319i(vVar);
    }
}
