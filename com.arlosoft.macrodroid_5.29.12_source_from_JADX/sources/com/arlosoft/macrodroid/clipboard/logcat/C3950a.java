package com.arlosoft.macrodroid.clipboard.logcat;

import android.content.Context;
import androidx.annotation.RequiresApi;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15482l0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15516s2;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.C15573z;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15288g;
import kotlinx.coroutines.flow.C15290h;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@RequiresApi(29)
/* renamed from: com.arlosoft.macrodroid.clipboard.logcat.a */
/* compiled from: LogcatClipboardDetector.kt */
public final class C3950a {

    /* renamed from: g */
    public static final C3951a f10270g = new C3951a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f10271a;

    /* renamed from: b */
    private C15573z f10272b = C15516s2.m94604b((C15561w1) null, 1, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3952b f10273c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f10274d;

    /* renamed from: e */
    private boolean f10275e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C15285f<String> f10276f = C15290h.m94132r(new C3953c((C13635d<? super C3953c>) null));

    /* renamed from: com.arlosoft.macrodroid.clipboard.logcat.a$a */
    /* compiled from: LogcatClipboardDetector.kt */
    public static final class C3951a {
        private C3951a() {
        }

        public /* synthetic */ C3951a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.clipboard.logcat.a$b */
    /* compiled from: LogcatClipboardDetector.kt */
    public interface C3952b {
        /* renamed from: a */
        void mo27659a();
    }

    /* renamed from: com.arlosoft.macrodroid.clipboard.logcat.a$c */
    /* compiled from: LogcatClipboardDetector.kt */
    static final class C3953c extends C13665l implements C16269p<C15288g<? super String>, C13635d<? super C13339u>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C3953c(C13635d<? super C3953c> dVar) {
            super(2, dVar);
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C3953c cVar = new C3953c(dVar);
            cVar.L$0 = obj;
            return cVar;
        }

        public final Object invoke(C15288g<? super String> gVar, C13635d<? super C13339u> dVar) {
            return ((C3953c) create(gVar, dVar)).invokeSuspend(C13339u.f61331a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
            kotlin.p312io.C13667b.m87853a(r3, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r1 = r7.label
                r2 = 1
                if (r1 == 0) goto L_0x0025
                if (r1 != r2) goto L_0x001d
                java.lang.Object r1 = r7.L$2
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r7.L$1
                java.io.Closeable r3 = (java.io.Closeable) r3
                java.lang.Object r4 = r7.L$0
                kotlinx.coroutines.flow.g r4 = (kotlinx.coroutines.flow.C15288g) r4
                p297ja.C13332o.m85685b(r8)     // Catch:{ all -> 0x001b }
                goto L_0x006b
            L_0x001b:
                r8 = move-exception
                goto L_0x008e
            L_0x001d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0025:
                p297ja.C13332o.m85685b(r8)
                java.lang.Object r8 = r7.L$0
                kotlinx.coroutines.flow.g r8 = (kotlinx.coroutines.flow.C15288g) r8
                java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
                java.lang.String r3 = "logcat -c"
                java.lang.Process r1 = r1.exec(r3)
                r1.waitFor()
                java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
                java.lang.String r3 = "logcat ClipboardService:I *:S"
                java.lang.Process r1 = r1.exec(r3)
                java.io.InputStream r1 = r1.getInputStream()
                java.lang.String r3 = "getRuntime().exec(\"logca…\n            .inputStream"
                kotlin.jvm.internal.C13706o.m87928e(r1, r3)
                java.nio.charset.Charset r3 = kotlin.text.C15147d.f64349b
                java.io.InputStreamReader r4 = new java.io.InputStreamReader
                r4.<init>(r1, r3)
                r1 = 8192(0x2000, float:1.14794E-41)
                boolean r3 = r4 instanceof java.io.BufferedReader
                if (r3 == 0) goto L_0x005d
                java.io.BufferedReader r4 = (java.io.BufferedReader) r4
                r3 = r4
                goto L_0x0062
            L_0x005d:
                java.io.BufferedReader r3 = new java.io.BufferedReader
                r3.<init>(r4, r1)
            L_0x0062:
                kotlin.sequences.h r1 = kotlin.p312io.C13675i.m87861d(r3)     // Catch:{ all -> 0x001b }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x001b }
                r4 = r8
            L_0x006b:
                r8 = r7
            L_0x006c:
                r5 = 0
                boolean r6 = r1.hasNext()     // Catch:{ all -> 0x001b }
                if (r6 == 0) goto L_0x0088
                java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x001b }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x001b }
                r8.L$0 = r4     // Catch:{ all -> 0x001b }
                r8.L$1 = r3     // Catch:{ all -> 0x001b }
                r8.L$2 = r1     // Catch:{ all -> 0x001b }
                r8.label = r2     // Catch:{ all -> 0x001b }
                java.lang.Object r5 = r4.emit(r5, r8)     // Catch:{ all -> 0x001b }
                if (r5 != r0) goto L_0x006c
                return r0
            L_0x0088:
                ja.u r8 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x001b }
                kotlin.p312io.C13667b.m87853a(r3, r5)
                return r8
            L_0x008e:
                throw r8     // Catch:{ all -> 0x008f }
            L_0x008f:
                r0 = move-exception
                kotlin.p312io.C13667b.m87853a(r3, r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.clipboard.logcat.C3950a.C3953c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.clipboard.logcat.a$d */
    /* compiled from: LogcatClipboardDetector.kt */
    static final class C3954d extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ C3950a this$0;

        /* renamed from: com.arlosoft.macrodroid.clipboard.logcat.a$d$a */
        /* compiled from: LogcatClipboardDetector.kt */
        static final class C3955a<T> implements C15288g {

            /* renamed from: a */
            final /* synthetic */ C3950a f10277a;

            /* renamed from: com.arlosoft.macrodroid.clipboard.logcat.a$d$a$a */
            /* compiled from: LogcatClipboardDetector.kt */
            static final class C3956a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
                int label;
                final /* synthetic */ C3950a this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C3956a(C3950a aVar, C13635d<? super C3956a> dVar) {
                    super(2, dVar);
                    this.this$0 = aVar;
                }

                public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                    return new C3956a(this.this$0, dVar);
                }

                public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                    return ((C3956a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object unused = C13652d.m87832c();
                    if (this.label == 0) {
                        C13332o.m85685b(obj);
                        C3952b c = this.this$0.f10273c;
                        if (c == null) {
                            return null;
                        }
                        c.mo27659a();
                        return C13339u.f61331a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            C3955a(C3950a aVar) {
                this.f10277a = aVar;
            }

            /* renamed from: a */
            public final Object emit(String str, C13635d<? super C13339u> dVar) {
                if (C15177w.m93663N(str, "Denying", false, 2, (Object) null)) {
                    String packageName = this.f10277a.f10271a.getPackageName();
                    C13706o.m87928e(packageName, "context.packageName");
                    if (C15177w.m93663N(str, packageName, false, 2, (Object) null)) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - this.f10277a.f10274d > 1000) {
                            this.f10277a.f10274d = currentTimeMillis;
                            return C15414h.m94298g(C15186a1.m93731c(), new C3956a(this.f10277a, (C13635d<? super C3956a>) null), dVar);
                        }
                    }
                }
                return C13339u.f61331a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3954d(C3950a aVar, C13635d<? super C3954d> dVar) {
            super(2, dVar);
            this.this$0 = aVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C3954d(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C3954d) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C15285f d = this.this$0.f10276f;
                C3955a aVar = new C3955a(this.this$0);
                this.label = 1;
                if (d.collect(aVar, this) == c) {
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

    public C3950a(Context context) {
        C13706o.m87929f(context, "context");
        this.f10271a = context;
    }

    /* renamed from: f */
    private final C13640g m15332f() {
        if (this.f10272b.mo74487b()) {
            C15561w1.C15562a.m94723a(this.f10272b, (CancellationException) null, 1, (Object) null);
        }
        this.f10272b = C15516s2.m94604b((C15561w1) null, 1, (Object) null);
        return C15186a1.m93730b().plus(this.f10272b);
    }

    /* renamed from: g */
    public final void mo27655g() {
        this.f10273c = null;
        mo27658j();
    }

    /* renamed from: h */
    public final void mo27656h(C3952b bVar) {
        C13706o.m87929f(bVar, "listener");
        this.f10273c = bVar;
    }

    /* renamed from: i */
    public final void mo27657i() {
        this.f10275e = true;
        C15561w1 unused = C15473j.m94492d(C15482l0.m94502a(m15332f()), C15186a1.m93730b(), (C15486m0) null, new C3954d(this, (C13635d<? super C3954d>) null), 2, (Object) null);
    }

    /* renamed from: j */
    public final void mo27658j() {
        this.f10275e = false;
        if (this.f10272b.mo74487b()) {
            C15561w1.C15562a.m94723a(this.f10272b, (CancellationException) null, 1, (Object) null);
        }
    }
}
