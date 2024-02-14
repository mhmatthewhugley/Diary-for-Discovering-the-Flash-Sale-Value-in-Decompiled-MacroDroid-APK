package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.content.ContextCompat;
import androidx.webkit.ProxyConfig;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.logcat.LogcatMessage;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.activities.LogcatConfigActivity;
import com.arlosoft.macrodroid.utils.C6460y1;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15561w1;
import p057a2.C2224m;
import p119k3.C7559u0;
import p150q2.C8164a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* compiled from: LogcatTrigger.kt */
public final class LogcatTrigger extends Trigger implements C2224m {
    public static final Parcelable.Creator<LogcatTrigger> CREATOR = new C5688a();

    /* renamed from: d */
    public static final C5689b f13642d = new C5689b((C13695i) null);
    private static int diagnosticsLineCount;
    /* access modifiers changed from: private */
    public static InputStream inputStream;
    private static C15561w1 logcatJob;
    /* access modifiers changed from: private */
    public static boolean streamClosed = true;
    private static int triggerCount;
    private String component;
    private String textToMatch;

    /* renamed from: com.arlosoft.macrodroid.triggers.LogcatTrigger$a */
    /* compiled from: LogcatTrigger.kt */
    public static final class C5688a implements Parcelable.Creator<LogcatTrigger> {
        C5688a() {
        }

        /* renamed from: a */
        public LogcatTrigger createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new LogcatTrigger(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public LogcatTrigger[] newArray(int i) {
            return new LogcatTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.LogcatTrigger$b */
    /* compiled from: LogcatTrigger.kt */
    public static final class C5689b {

        /* renamed from: com.arlosoft.macrodroid.triggers.LogcatTrigger$b$a */
        /* compiled from: LogcatTrigger.kt */
        static final class C5690a extends C13656d {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C5689b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5690a(C5689b bVar, C13635d<? super C5690a> dVar) {
                super(dVar);
                this.this$0 = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.m22656b((String) null, this);
            }
        }

        /* renamed from: com.arlosoft.macrodroid.triggers.LogcatTrigger$b$b */
        /* compiled from: LogcatTrigger.kt */
        static final class C5691b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ List<Macro> $macrosToInvoke;
            int label;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5691b(List<Macro> list, C13635d<? super C5691b> dVar) {
                super(2, dVar);
                this.$macrosToInvoke = list;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C5691b(this.$macrosToInvoke, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C5691b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    for (Macro next : this.$macrosToInvoke) {
                        next.invokeActions(next.getTriggerContextInfo());
                    }
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        private C5689b() {
        }

        public /* synthetic */ C5689b(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object m22656b(java.lang.String r12, kotlin.coroutines.C13635d<? super p297ja.C13339u> r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof com.arlosoft.macrodroid.triggers.LogcatTrigger.C5689b.C5690a
                if (r0 == 0) goto L_0x0013
                r0 = r13
                com.arlosoft.macrodroid.triggers.LogcatTrigger$b$a r0 = (com.arlosoft.macrodroid.triggers.LogcatTrigger.C5689b.C5690a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                com.arlosoft.macrodroid.triggers.LogcatTrigger$b$a r0 = new com.arlosoft.macrodroid.triggers.LogcatTrigger$b$a
                r0.<init>(r11, r13)
            L_0x0018:
                java.lang.Object r13 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x0032
                if (r2 != r3) goto L_0x002a
                p297ja.C13332o.m85685b(r13)     // Catch:{ Exception -> 0x00d6 }
                goto L_0x00d6
            L_0x002a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L_0x0032:
                p297ja.C13332o.m85685b(r13)
                java.util.ArrayList r13 = new java.util.ArrayList
                r13.<init>()
                r2 = 2
                java.lang.String r5 = ":"
                r6 = 0
                r7 = 0
                r8 = 6
                r9 = 0
                r4 = r12
                int r4 = kotlin.text.C15177w.m93682a0(r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00d6 }
                java.lang.String r2 = r12.substring(r2, r4)     // Catch:{ Exception -> 0x00d6 }
                java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.C13706o.m87928e(r2, r4)     // Catch:{ Exception -> 0x00d6 }
                int r4 = r2.length()     // Catch:{ Exception -> 0x00d6 }
                int r4 = r4 + 4
                java.lang.String r4 = r12.substring(r4)     // Catch:{ Exception -> 0x00d6 }
                java.lang.String r5 = "this as java.lang.String).substring(startIndex)"
                kotlin.jvm.internal.C13706o.m87928e(r4, r5)     // Catch:{ Exception -> 0x00d6 }
                com.arlosoft.macrodroid.macro.n r5 = com.arlosoft.macrodroid.macro.C4934n.m18998M()     // Catch:{ Exception -> 0x00d6 }
                java.util.List r5 = r5.mo29679I()     // Catch:{ Exception -> 0x00d6 }
                java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x00d6 }
            L_0x006a:
                boolean r6 = r5.hasNext()     // Catch:{ Exception -> 0x00d6 }
                r7 = 0
                if (r6 == 0) goto L_0x00c4
                java.lang.Object r6 = r5.next()     // Catch:{ Exception -> 0x00d6 }
                com.arlosoft.macrodroid.macro.Macro r6 = (com.arlosoft.macrodroid.macro.Macro) r6     // Catch:{ Exception -> 0x00d6 }
                java.util.ArrayList r8 = r6.getTriggerListWithAwaitingActions()     // Catch:{ Exception -> 0x00d6 }
                java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x00d6 }
            L_0x007f:
                boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x00d6 }
                if (r9 == 0) goto L_0x006a
                java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x00d6 }
                com.arlosoft.macrodroid.triggers.Trigger r9 = (com.arlosoft.macrodroid.triggers.Trigger) r9     // Catch:{ Exception -> 0x00d6 }
                boolean r10 = r9 instanceof com.arlosoft.macrodroid.triggers.LogcatTrigger     // Catch:{ Exception -> 0x00d6 }
                if (r10 == 0) goto L_0x007f
                r10 = r9
                com.arlosoft.macrodroid.triggers.LogcatTrigger r10 = (com.arlosoft.macrodroid.triggers.LogcatTrigger) r10     // Catch:{ Exception -> 0x00d6 }
                boolean r10 = r10.m22641o3(r4)     // Catch:{ Exception -> 0x00d6 }
                if (r10 == 0) goto L_0x007f
                r10 = r9
                com.arlosoft.macrodroid.triggers.LogcatTrigger r10 = (com.arlosoft.macrodroid.triggers.LogcatTrigger) r10     // Catch:{ Exception -> 0x00d6 }
                boolean r10 = r10.m22640n3(r2)     // Catch:{ Exception -> 0x00d6 }
                if (r10 == 0) goto L_0x007f
                boolean r10 = r9.mo27845e0(r7)     // Catch:{ Exception -> 0x00d6 }
                if (r10 == 0) goto L_0x007f
                r6.setTriggerThatInvoked(r9)     // Catch:{ Exception -> 0x00d6 }
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r7 = com.arlosoft.macrodroid.triggers.TriggerContextInfo.m23361b(r9, r12)     // Catch:{ Exception -> 0x00d6 }
                r6.setTriggerContextInfo(r7)     // Catch:{ Exception -> 0x00d6 }
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r7 = r6.getTriggerContextInfo()     // Catch:{ Exception -> 0x00d6 }
                boolean r7 = r6.canInvoke(r7)     // Catch:{ Exception -> 0x00d6 }
                if (r7 == 0) goto L_0x006a
                java.lang.String r7 = "macro"
                kotlin.jvm.internal.C13706o.m87928e(r6, r7)     // Catch:{ Exception -> 0x00d6 }
                r13.add(r6)     // Catch:{ Exception -> 0x00d6 }
                goto L_0x006a
            L_0x00c4:
                kotlinx.coroutines.h2 r12 = kotlinx.coroutines.C15186a1.m93731c()     // Catch:{ Exception -> 0x00d6 }
                com.arlosoft.macrodroid.triggers.LogcatTrigger$b$b r2 = new com.arlosoft.macrodroid.triggers.LogcatTrigger$b$b     // Catch:{ Exception -> 0x00d6 }
                r2.<init>(r13, r7)     // Catch:{ Exception -> 0x00d6 }
                r0.label = r3     // Catch:{ Exception -> 0x00d6 }
                java.lang.Object r12 = kotlinx.coroutines.C15414h.m94298g(r12, r2, r0)     // Catch:{ Exception -> 0x00d6 }
                if (r12 != r1) goto L_0x00d6
                return r1
            L_0x00d6:
                ja.u r12 = p297ja.C13339u.f61331a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.LogcatTrigger.C5689b.m22656b(java.lang.String, kotlin.coroutines.d):java.lang.Object");
        }

        /* renamed from: c */
        public final String mo31308c(int i) {
            StringBuffer stringBuffer = new StringBuffer();
            if (mo31309d(i, 1)) {
                stringBuffer.append("main");
                stringBuffer.append(",");
            }
            if (mo31309d(i, 2)) {
                stringBuffer.append("system");
                stringBuffer.append(",");
            }
            if (mo31309d(i, 4)) {
                stringBuffer.append("crash");
                stringBuffer.append(",");
            }
            if (mo31309d(i, 8)) {
                stringBuffer.append("kernel");
                stringBuffer.append(",");
            }
            if (mo31309d(i, 16)) {
                stringBuffer.append("radio");
                stringBuffer.append(",");
            }
            if (mo31309d(i, 32)) {
                stringBuffer.append("events");
                stringBuffer.append(",");
            }
            if (!(stringBuffer.length() > 0)) {
                return "";
            }
            String stringBuffer2 = stringBuffer.toString();
            C13706o.m87928e(stringBuffer2, "stringBuffer.toString()");
            return C15182y.m93712U0(stringBuffer2, 1);
        }

        /* renamed from: d */
        public final boolean mo31309d(int i, int i2) {
            return (i & i2) == i2;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.LogcatTrigger$c */
    /* compiled from: LogcatTrigger.kt */
    static final class C5692c extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ LogcatTrigger this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5692c(LogcatTrigger logcatTrigger, C13635d<? super C5692c> dVar) {
            super(2, dVar);
            this.this$0 = logcatTrigger;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5692c(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5692c) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cf, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            kotlin.p312io.C13667b.m87853a(r3, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d3, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r1 = r6.label
                r2 = 1
                if (r1 == 0) goto L_0x0023
                if (r1 != r2) goto L_0x001b
                java.lang.Object r1 = r6.L$1
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r6.L$0
                java.io.Closeable r3 = (java.io.Closeable) r3
                p297ja.C13332o.m85685b(r7)     // Catch:{ all -> 0x0018 }
                goto L_0x00ab
            L_0x0018:
                r7 = move-exception
                goto L_0x00ce
            L_0x001b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x0023:
                p297ja.C13332o.m85685b(r7)
                java.lang.String r7 = ">>>>> Starting Logcat monitor"
                com.arlosoft.macrodroid.triggers.LogcatTrigger r1 = r6.this$0     // Catch:{ Exception -> 0x00d4 }
                java.lang.Long r1 = r1.mo27840Y0()     // Catch:{ Exception -> 0x00d4 }
                java.lang.String r3 = "macroGuid"
                kotlin.jvm.internal.C13706o.m87928e(r1, r3)     // Catch:{ Exception -> 0x00d4 }
                long r3 = r1.longValue()     // Catch:{ Exception -> 0x00d4 }
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18874m(r7, r3)     // Catch:{ Exception -> 0x00d4 }
                com.arlosoft.macrodroid.triggers.LogcatTrigger$b r7 = com.arlosoft.macrodroid.triggers.LogcatTrigger.f13642d     // Catch:{ Exception -> 0x00d4 }
                com.arlosoft.macrodroid.triggers.LogcatTrigger r1 = r6.this$0     // Catch:{ Exception -> 0x00d4 }
                android.content.Context r1 = r1.mo27827K0()     // Catch:{ Exception -> 0x00d4 }
                int r1 = com.arlosoft.macrodroid.settings.C5163j2.m20006L0(r1)     // Catch:{ Exception -> 0x00d4 }
                java.lang.String r7 = r7.mo31308c(r1)     // Catch:{ Exception -> 0x00d4 }
                java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x00d4 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d4 }
                r3.<init>()     // Catch:{ Exception -> 0x00d4 }
                java.lang.String r4 = "logcat -c -b "
                r3.append(r4)     // Catch:{ Exception -> 0x00d4 }
                r3.append(r7)     // Catch:{ Exception -> 0x00d4 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00d4 }
                java.lang.Process r1 = r1.exec(r3)     // Catch:{ Exception -> 0x00d4 }
                r1.waitFor()     // Catch:{ Exception -> 0x00d4 }
                java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x00d4 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d4 }
                r3.<init>()     // Catch:{ Exception -> 0x00d4 }
                java.lang.String r4 = "logcat -v tag -b "
                r3.append(r4)     // Catch:{ Exception -> 0x00d4 }
                r3.append(r7)     // Catch:{ Exception -> 0x00d4 }
                java.lang.String r7 = r3.toString()     // Catch:{ Exception -> 0x00d4 }
                java.lang.Process r7 = r1.exec(r7)     // Catch:{ Exception -> 0x00d4 }
                java.io.InputStream r7 = r7.getInputStream()     // Catch:{ Exception -> 0x00d4 }
                com.arlosoft.macrodroid.triggers.LogcatTrigger.inputStream = r7     // Catch:{ Exception -> 0x00d4 }
                java.io.InputStream r7 = com.arlosoft.macrodroid.triggers.LogcatTrigger.inputStream     // Catch:{ Exception -> 0x00d4 }
                if (r7 == 0) goto L_0x00ef
                java.nio.charset.Charset r1 = kotlin.text.C15147d.f64349b     // Catch:{ Exception -> 0x00d4 }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00d4 }
                r3.<init>(r7, r1)     // Catch:{ Exception -> 0x00d4 }
                r7 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r3 instanceof java.io.BufferedReader     // Catch:{ Exception -> 0x00d4 }
                if (r1 == 0) goto L_0x009c
                java.io.BufferedReader r3 = (java.io.BufferedReader) r3     // Catch:{ Exception -> 0x00d4 }
                goto L_0x00a2
            L_0x009c:
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00d4 }
                r1.<init>(r3, r7)     // Catch:{ Exception -> 0x00d4 }
                r3 = r1
            L_0x00a2:
                kotlin.sequences.h r7 = kotlin.p312io.C13675i.m87861d(r3)     // Catch:{ all -> 0x0018 }
                java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0018 }
                r1 = r7
            L_0x00ab:
                r7 = r6
            L_0x00ac:
                r4 = 0
                boolean r5 = r1.hasNext()     // Catch:{ all -> 0x0018 }
                if (r5 == 0) goto L_0x00c8
                java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x0018 }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0018 }
                com.arlosoft.macrodroid.triggers.LogcatTrigger$b r5 = com.arlosoft.macrodroid.triggers.LogcatTrigger.f13642d     // Catch:{ all -> 0x0018 }
                r7.L$0 = r3     // Catch:{ all -> 0x0018 }
                r7.L$1 = r1     // Catch:{ all -> 0x0018 }
                r7.label = r2     // Catch:{ all -> 0x0018 }
                java.lang.Object r4 = r5.m22656b(r4, r7)     // Catch:{ all -> 0x0018 }
                if (r4 != r0) goto L_0x00ac
                return r0
            L_0x00c8:
                ja.u r7 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0018 }
                kotlin.p312io.C13667b.m87853a(r3, r4)     // Catch:{ Exception -> 0x00d4 }
                goto L_0x00ef
            L_0x00ce:
                throw r7     // Catch:{ all -> 0x00cf }
            L_0x00cf:
                r0 = move-exception
                kotlin.p312io.C13667b.m87853a(r3, r7)     // Catch:{ Exception -> 0x00d4 }
                throw r0     // Catch:{ Exception -> 0x00d4 }
            L_0x00d4:
                r7 = move-exception
                boolean r0 = com.arlosoft.macrodroid.triggers.LogcatTrigger.streamClosed
                if (r0 != 0) goto L_0x00ef
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to initialise logcat listener: "
                r0.append(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r7)
            L_0x00ef:
                ja.u r7 = p297ja.C13339u.f61331a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.LogcatTrigger.C5692c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public LogcatTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ LogcatTrigger(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public final boolean m22640n3(String str) {
        if (this.component.length() == 0) {
            return true;
        }
        String t0 = C4023j0.m15760t0(mo27827K0(), this.component, (TriggerContextInfo) null, this.m_macro);
        C13706o.m87928e(t0, "text");
        Locale locale = Locale.ROOT;
        String lowerCase = t0.toLowerCase(locale);
        C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String b = C6460y1.m24790b(lowerCase, false);
        String lowerCase2 = str.toLowerCase(locale);
        C13706o.m87928e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return C6460y1.m24792d(String.valueOf(lowerCase2), b, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public final boolean m22641o3(String str) {
        if (this.textToMatch.length() == 0) {
            return false;
        }
        String t0 = C4023j0.m15760t0(mo27827K0(), this.textToMatch, (TriggerContextInfo) null, this.m_macro);
        C13706o.m87928e(t0, "text");
        Locale locale = Locale.ROOT;
        String lowerCase = t0.toLowerCase(locale);
        C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String b = C6460y1.m24790b(lowerCase, false);
        String lowerCase2 = str.toLowerCase(locale);
        C13706o.m87928e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return C6460y1.m24792d(String.valueOf(lowerCase2), b, false);
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.textToMatch, this.component};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        C13706o.m87929f(strArr, "magicText");
        if (strArr.length == 2) {
            this.textToMatch = strArr[0];
            this.component = strArr[1];
            return;
        }
        FirebaseCrashlytics a = FirebaseCrashlytics.m6487a();
        a.mo22936d(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ')'));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return '[' + this.component + "] " + this.textToMatch;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S2 */
    public void mo30885S2() {
        int i = triggerCount - 1;
        triggerCount = i;
        if (i == 0) {
            try {
                streamClosed = true;
                InputStream inputStream2 = inputStream;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                C15561w1 w1Var = logcatJob;
                if (w1Var != null) {
                    C15561w1.C15562a.m94723a(w1Var, (CancellationException) null, 1, (Object) null);
                }
                logcatJob = null;
                inputStream = null;
                Long Y0 = mo27840Y0();
                C13706o.m87928e(Y0, "macroGuid");
                C4878b.m18874m("<<<<<< Closing Logcat monitor", Y0.longValue());
            } catch (Exception e) {
                FirebaseCrashlytics.m6487a().mo22936d(e);
                Long Y02 = mo27840Y0();
                C13706o.m87928e(Y02, "macroGuid");
                C4878b.m18869h("Closing logcat monitor failed: " + e, Y02.longValue());
            }
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7559u0.f18453l.mo37651a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: U2 */
    public void mo30886U2() {
        if (triggerCount == 0) {
            streamClosed = false;
            if (ContextCompat.checkSelfPermission(mo27827K0(), "android.permission.READ_LOGS") != 0 && C8164a.m33886a()) {
                C4061t1.m15947B0(new String[]{"pm grant com.arlosoft.macrodroid android.permission.READ_LOGS"});
            }
            C15561w1 w1Var = logcatJob;
            if (w1Var != null) {
                C15561w1.C15562a.m94723a(w1Var, (CancellationException) null, 1, (Object) null);
            }
            logcatJob = C15473j.m94492d(C15503p1.f64723a, C15186a1.m93730b(), (C15486m0) null, new C5692c(this, (C13635d<? super C5692c>) null), 2, (Object) null);
        }
        triggerCount++;
    }

    /* renamed from: W1 */
    public void mo25540W1() {
        LogcatConfigActivity.C5820a aVar = LogcatConfigActivity.f13795B;
        Activity j0 = mo27850j0();
        C13706o.m87928e(j0, "activity");
        Macro X0 = mo27837X0();
        C13706o.m87928e(X0, "macro");
        aVar.mo31701a(j0, X0, this, (LogcatMessage) null, C5163j2.m20006L0(mo27827K0()));
    }

    /* renamed from: Y2 */
    public TriggerContextInfo mo30911Y2() {
        return TriggerContextInfo.m23362c(this, "test product name", "test manufacturer name");
    }

    /* renamed from: l3 */
    public final String mo31302l3() {
        return this.component;
    }

    /* renamed from: m3 */
    public final String mo31303m3() {
        return this.textToMatch;
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        if (i != 1) {
            super.mo24713q1(activity, i, i2, intent);
        } else if (i2 == -1) {
            C13706o.m87926c(intent);
            LogcatMessage logcatMessage = (LogcatMessage) intent.getParcelableExtra("logcat_message");
            C5163j2.m19927A4(mo27827K0(), intent.getIntExtra("enabled_buffers", 0));
            C13706o.m87926c(logcatMessage);
            this.textToMatch = logcatMessage.mo29368b();
            this.component = logcatMessage.mo29367a();
            mo24689O1();
        } else {
            mo27864r1();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.textToMatch);
        parcel.writeString(this.component);
    }

    public LogcatTrigger() {
        this.textToMatch = "";
        this.component = ProxyConfig.MATCH_ALL_SCHEMES;
    }

    private LogcatTrigger(Parcel parcel) {
        super(parcel);
        String str = "";
        this.textToMatch = str;
        this.component = ProxyConfig.MATCH_ALL_SCHEMES;
        String readString = parcel.readString();
        this.textToMatch = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.component = readString2 != null ? readString2 : str;
    }
}
