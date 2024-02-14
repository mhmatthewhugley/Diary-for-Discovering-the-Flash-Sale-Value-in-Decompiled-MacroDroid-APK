package com.arlosoft.macrodroid.action.services;

import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.action.services.UploadService;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.logging.systemlog.C4900q;
import com.arlosoft.macrodroid.settings.C5163j2;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15561w1;
import p098h0.C7359c;
import p110j0.C7430a;
import p134n0.C7960a;
import p148q0.C8151a;
import p297ja.C13339u;
import p370qa.C16269p;

/* compiled from: SendEmailService.kt */
public final class SendEmailService extends UploadService {

    /* renamed from: D */
    public static final C3435a f9124D = new C3435a((C13695i) null);

    /* renamed from: E */
    private static String f9125E = "UploadLocationService";

    /* renamed from: C */
    public C4900q f9126C;

    /* renamed from: com.arlosoft.macrodroid.action.services.SendEmailService$a */
    /* compiled from: SendEmailService.kt */
    public static final class C3435a {
        private C3435a() {
        }

        public /* synthetic */ C3435a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.services.SendEmailService$b */
    /* compiled from: SendEmailService.kt */
    static final class C3436b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Intent $intent;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ SendEmailService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3436b(Intent intent, SendEmailService sendEmailService, C13635d<? super C3436b> dVar) {
            super(2, dVar);
            this.$intent = intent;
            this.this$0 = sendEmailService;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C3436b(this.$intent, this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C3436b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r1 = r12.label
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0025
                if (r1 != r2) goto L_0x001d
                java.lang.Object r0 = r12.L$2
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r1 = r12.L$1
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r4 = r12.L$0
                java.lang.String r4 = (java.lang.String) r4
                p297ja.C13332o.m85685b(r13)
                goto L_0x009f
            L_0x001d:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0025:
                p297ja.C13332o.m85685b(r13)
                android.content.Intent r13 = r12.$intent
                android.os.Bundle r13 = r13.getExtras()
                kotlin.jvm.internal.C13706o.m87926c(r13)
                java.lang.String r1 = "EmailAddress"
                java.lang.String r8 = r13.getString(r1)
                android.content.Intent r13 = r12.$intent
                android.os.Bundle r13 = r13.getExtras()
                kotlin.jvm.internal.C13706o.m87926c(r13)
                java.lang.String r1 = "Subject"
                java.lang.String r9 = r13.getString(r1)
                android.content.Intent r13 = r12.$intent
                android.os.Bundle r13 = r13.getExtras()
                kotlin.jvm.internal.C13706o.m87926c(r13)
                java.lang.String r1 = "Body"
                java.lang.String r6 = r13.getString(r1)
                android.content.Intent r13 = r12.$intent
                android.os.Bundle r13 = r13.getExtras()
                kotlin.jvm.internal.C13706o.m87926c(r13)
                java.lang.String r1 = "AttachLog"
                boolean r13 = r13.getBoolean(r1, r3)
                android.content.Intent r1 = r12.$intent
                android.os.Bundle r1 = r1.getExtras()
                kotlin.jvm.internal.C13706o.m87926c(r1)
                java.lang.String r4 = "AttachUserLog"
                boolean r1 = r1.getBoolean(r4, r3)
                if (r13 != 0) goto L_0x0082
                if (r1 != 0) goto L_0x0082
                com.arlosoft.macrodroid.action.services.UploadService$d r13 = new com.arlosoft.macrodroid.action.services.UploadService$d
                com.arlosoft.macrodroid.action.services.SendEmailService r5 = r12.this$0
                java.lang.String r7 = "Email"
                r4 = r13
                r4.<init>(r6, r7, r8, r9)
                goto L_0x00cd
            L_0x0082:
                r4 = 0
                if (r13 == 0) goto L_0x00a6
                com.arlosoft.macrodroid.action.services.SendEmailService r13 = r12.this$0
                com.arlosoft.macrodroid.logging.systemlog.q r13 = r13.mo26799t()
                com.arlosoft.macrodroid.database.room.i r1 = com.arlosoft.macrodroid.database.room.C4403i.VERBOSE
                r12.L$0 = r8
                r12.L$1 = r9
                r12.L$2 = r6
                r12.label = r2
                java.lang.Object r13 = r13.mo29496b(r1, r12)
                if (r13 != r0) goto L_0x009c
                return r0
            L_0x009c:
                r0 = r6
                r4 = r8
                r1 = r9
            L_0x009f:
                java.lang.String r13 = (java.lang.String) r13
                r7 = r0
                r10 = r1
                r9 = r4
                r4 = r13
                goto L_0x00b1
            L_0x00a6:
                if (r1 == 0) goto L_0x00ae
                com.arlosoft.macrodroid.action.services.SendEmailService r13 = r12.this$0
                java.lang.String r4 = com.arlosoft.macrodroid.logging.LogActivity.m18753X1(r13)
            L_0x00ae:
                r7 = r6
                r10 = r9
                r9 = r8
            L_0x00b1:
                if (r4 == 0) goto L_0x00c3
                java.io.File r11 = new java.io.File
                r11.<init>(r4)
                com.arlosoft.macrodroid.action.services.UploadService$d r13 = new com.arlosoft.macrodroid.action.services.UploadService$d
                com.arlosoft.macrodroid.action.services.SendEmailService r6 = r12.this$0
                java.lang.String r8 = "Email"
                r5 = r13
                r5.<init>((java.lang.Object) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (java.io.File) r11)
                goto L_0x00cd
            L_0x00c3:
                com.arlosoft.macrodroid.action.services.UploadService$d r13 = new com.arlosoft.macrodroid.action.services.UploadService$d
                com.arlosoft.macrodroid.action.services.SendEmailService r6 = r12.this$0
                java.lang.String r8 = "Email"
                r5 = r13
                r5.<init>(r7, r8, r9, r10)
            L_0x00cd:
                java.lang.Object r0 = com.arlosoft.macrodroid.action.services.UploadService.f9143z
                java.lang.String r1 = "s_lock"
                kotlin.jvm.internal.C13706o.m87928e(r0, r1)
                com.arlosoft.macrodroid.action.services.SendEmailService r1 = r12.this$0
                monitor-enter(r0)
                java.util.Queue<com.arlosoft.macrodroid.action.services.UploadService$d> r4 = r1.f9147f     // Catch:{ all -> 0x0116 }
                r4.add(r13)     // Catch:{ all -> 0x0116 }
                java.lang.String r13 = "++++ ADDED EMAIL TO UPLOAD QUEUE"
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0116 }
                p455ag.C17105a.m100579a(r13, r4)     // Catch:{ all -> 0x0116 }
                java.util.Queue<com.arlosoft.macrodroid.action.services.UploadService$d> r13 = r1.f9147f     // Catch:{ all -> 0x0116 }
                int r13 = r13.size()     // Catch:{ all -> 0x0116 }
                if (r13 != r2) goto L_0x00f6
                java.lang.String r13 = "++++ STARTED ALARM FOR EMAIL QUEUE"
                java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x0116 }
                p455ag.C17105a.m100579a(r13, r2)     // Catch:{ all -> 0x0116 }
                r1.mo26819k(r3)     // Catch:{ all -> 0x0116 }
                goto L_0x0112
            L_0x00f6:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0116 }
                r13.<init>()     // Catch:{ all -> 0x0116 }
                java.lang.String r2 = "++++ NOT STARTING ALARM QUEUE SIZE = "
                r13.append(r2)     // Catch:{ all -> 0x0116 }
                java.util.Queue<com.arlosoft.macrodroid.action.services.UploadService$d> r1 = r1.f9147f     // Catch:{ all -> 0x0116 }
                int r1 = r1.size()     // Catch:{ all -> 0x0116 }
                r13.append(r1)     // Catch:{ all -> 0x0116 }
                java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0116 }
                java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x0116 }
                p455ag.C17105a.m100579a(r13, r1)     // Catch:{ all -> 0x0116 }
            L_0x0112:
                ja.u r13 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0116 }
                monitor-exit(r0)
                return r13
            L_0x0116:
                r13 = move-exception
                monitor-exit(r0)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.services.SendEmailService.C3436b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public SendEmailService() {
        MacroDroidApplication.f9883I.mo27302a().mo38314s(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo26791g() {
        return "preferences:send_email_notify_failure";
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo26792h() {
        return "preferences:send_email_notify_success";
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo26793i() {
        return "preferences:send_email_retry_period";
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C7960a.C7963c mo26794o(Context context, UploadService.C3444d dVar) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(dVar, "queueItem");
        C8151a.m33873n(new RuntimeException("Called uploadToTwitter from SendEmailService"));
        Object obj = dVar.f9166a;
        C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.String");
        C7960a.C7963c j = C7960a.m33247j(context, (String) obj);
        C13706o.m87928e(j, "uploadMessage(context, queueItem.item as String)");
        return j;
    }

    public void onCreate() {
        super.onCreate();
        this.f9145c = "Email";
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 2;
        }
        C15561w1 unused = C15473j.m94492d(C15503p1.f64723a, (C13640g) null, (C15486m0) null, new C3436b(intent, this, (C13635d<? super C3436b>) null), 3, (Object) null);
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo26797q(Context context, UploadService.C3444d dVar, String str) throws Exception {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(dVar, "queueItem");
        C13706o.m87929f(str, "emailFrom");
        C7430a aVar = new C7430a(str, C5163j2.m20061T(context));
        if (dVar.f9172g == null) {
            UploadService.C3444d dVar2 = this.f9144a;
            String str2 = dVar2.f9170e;
            Object obj = dVar2.f9166a;
            C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.String");
            aVar.mo37546c(str2, (String) obj, str, this.f9144a.f9169d);
        } else if (dVar.f9173h == null) {
            UploadService.C3444d dVar3 = this.f9144a;
            String str3 = dVar3.f9170e;
            Object obj2 = dVar3.f9166a;
            C13706o.m87927d(obj2, "null cannot be cast to non-null type kotlin.String");
            aVar.mo37547d(str3, (String) obj2, str, this.f9144a.f9169d, dVar.f9172g);
        } else {
            UploadService.C3444d dVar4 = this.f9144a;
            String str4 = dVar4.f9170e;
            Object obj3 = dVar4.f9166a;
            C13706o.m87927d(obj3, "null cannot be cast to non-null type kotlin.String");
            UploadService.C3444d dVar5 = this.f9144a;
            aVar.mo37548e(str4, (String) obj3, str, dVar5.f9169d, dVar.f9172g, dVar5.f9173h);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo26798s(Context context, UploadService.C3444d dVar, String str, String str2) throws Exception {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(dVar, "queueItem");
        C13706o.m87929f(str, "emailFrom");
        C13706o.m87929f(str2, "token");
        C7359c cVar = new C7359c();
        StringBuilder sb = new StringBuilder();
        sb.append("++++ CALLING UPLOAD VIA EMAIL OAUTH: ");
        sb.append(dVar.f9173h);
        if (dVar.f9172g == null) {
            UploadService.C3444d dVar2 = this.f9144a;
            String str3 = dVar2.f9170e;
            Object obj = dVar2.f9166a;
            C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.String");
            cVar.mo37334b(context, str3, (String) obj, str, str2, this.f9144a.f9169d);
        } else if (dVar.f9173h == null) {
            UploadService.C3444d dVar3 = this.f9144a;
            String str4 = dVar3.f9170e;
            Object obj2 = dVar3.f9166a;
            C13706o.m87927d(obj2, "null cannot be cast to non-null type kotlin.String");
            cVar.mo37335c(context, str4, (String) obj2, str, str2, this.f9144a.f9169d, dVar.f9172g);
        } else {
            UploadService.C3444d dVar4 = this.f9144a;
            String str5 = dVar4.f9170e;
            Object obj3 = dVar4.f9166a;
            C13706o.m87927d(obj3, "null cannot be cast to non-null type kotlin.String");
            UploadService.C3444d dVar5 = this.f9144a;
            cVar.mo37336d(context, str5, (String) obj3, str, str2, dVar5.f9169d, dVar.f9172g, dVar5.f9173h);
        }
    }

    /* renamed from: t */
    public final C4900q mo26799t() {
        C4900q qVar = this.f9126C;
        if (qVar != null) {
            return qVar;
        }
        C13706o.m87945v("systemLogHelper");
        return null;
    }
}
