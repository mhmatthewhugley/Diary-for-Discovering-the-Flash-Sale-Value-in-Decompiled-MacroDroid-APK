package com.arlosoft.macrodroid.cloudmessaging;

import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.database.room.C4407l;
import com.arlosoft.macrodroid.database.room.C4409m;
import com.arlosoft.macrodroid.database.room.C4418o;
import com.arlosoft.macrodroid.database.room.C4419p;
import com.arlosoft.macrodroid.database.room.C4421q;
import com.arlosoft.macrodroid.database.room.C4445w;
import com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5124c;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.templatestore.events.TemplateUpdateEvent;
import com.arlosoft.macrodroid.templatestore.events.UserUpdateEvent;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.WebHookTrigger;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.Iterator;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.C15573z;
import p065c3.C2268a;
import p157r3.C8195d;
import p161s1.C10180a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;
import p455ag.C17105a;

/* compiled from: MacroDroidFirebaseMessagingService.kt */
public final class MacroDroidFirebaseMessagingService extends FirebaseMessagingService implements C15478k0 {

    /* renamed from: D */
    public static final C3957a f10278D = new C3957a((C13695i) null);

    /* renamed from: A */
    public C2268a f10279A;

    /* renamed from: B */
    public MacroDroidRoomDatabase f10280B;

    /* renamed from: C */
    public C5527g f10281C;

    /* renamed from: p */
    private final C15573z f10282p;

    /* renamed from: s */
    private final C13640g f10283s;

    /* renamed from: z */
    public C8195d f10284z;

    /* renamed from: com.arlosoft.macrodroid.cloudmessaging.MacroDroidFirebaseMessagingService$a */
    /* compiled from: MacroDroidFirebaseMessagingService.kt */
    public static final class C3957a {
        private C3957a() {
        }

        public /* synthetic */ C3957a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.cloudmessaging.MacroDroidFirebaseMessagingService$b */
    /* compiled from: MacroDroidFirebaseMessagingService.kt */
    static final class C3958b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ int $macroId;
        final /* synthetic */ int $userId;
        final /* synthetic */ String $userImage;
        final /* synthetic */ String $username;
        Object L$0;
        int label;
        final /* synthetic */ MacroDroidFirebaseMessagingService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3958b(MacroDroidFirebaseMessagingService macroDroidFirebaseMessagingService, int i, int i2, String str, String str2, C13635d<? super C3958b> dVar) {
            super(2, dVar);
            this.this$0 = macroDroidFirebaseMessagingService;
            this.$userId = i;
            this.$macroId = i2;
            this.$username = str;
            this.$userImage = str2;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C3958b(this.this$0, this.$userId, this.$macroId, this.$username, this.$userImage, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C3958b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            C4407l lVar;
            Object obj2;
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                if (this.this$0.mo27664A().mo30790b().getUserId() != this.$userId) {
                    C4409m e = this.this$0.mo27669y().mo28679e();
                    int i2 = this.$macroId;
                    this.label = 1;
                    obj2 = e.mo28742b(i2, this);
                    if (obj2 == c) {
                        return c;
                    }
                }
                return C13339u.f61331a;
            } else if (i == 1) {
                C13332o.m85685b(obj);
                obj2 = obj;
            } else if (i == 2) {
                lVar = (C4407l) this.L$0;
                C13332o.m85685b(obj);
                this.this$0.mo27670z().mo24576b(lVar.mo28737b());
                C10180a.m40075a().mo80018i(new TemplateUpdateEvent());
                return C13339u.f61331a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4407l lVar2 = (C4407l) obj2;
            if (lVar2 != null) {
                C4419p pVar = r4;
                C4419p pVar2 = new C4419p(0, C4418o.TYPE_MACRO_DELETED, this.$macroId, lVar2.mo28737b(), this.$username, this.$userId, this.$userImage, "", System.currentTimeMillis());
                C4421q f = this.this$0.mo27669y().mo28680f();
                this.L$0 = lVar2;
                this.label = 2;
                if (f.mo28767b(pVar, this) == c) {
                    return c;
                }
                lVar = lVar2;
                this.this$0.mo27670z().mo24576b(lVar.mo28737b());
                C10180a.m40075a().mo80018i(new TemplateUpdateEvent());
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.cloudmessaging.MacroDroidFirebaseMessagingService$c */
    /* compiled from: MacroDroidFirebaseMessagingService.kt */
    static final class C3959c extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ String $comment;
        final /* synthetic */ int $macroId;
        final /* synthetic */ int $userId;
        final /* synthetic */ String $userImage;
        final /* synthetic */ String $username;
        Object L$0;
        int label;
        final /* synthetic */ MacroDroidFirebaseMessagingService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3959c(MacroDroidFirebaseMessagingService macroDroidFirebaseMessagingService, int i, int i2, String str, String str2, String str3, C13635d<? super C3959c> dVar) {
            super(2, dVar);
            this.this$0 = macroDroidFirebaseMessagingService;
            this.$userId = i;
            this.$macroId = i2;
            this.$username = str;
            this.$userImage = str2;
            this.$comment = str3;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C3959c(this.this$0, this.$userId, this.$macroId, this.$username, this.$userImage, this.$comment, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C3959c) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C4407l lVar;
            Object obj3;
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                if (this.this$0.mo27664A().mo30790b().getUserId() != this.$userId) {
                    C4409m e = this.this$0.mo27669y().mo28679e();
                    int i2 = this.$macroId;
                    this.label = 1;
                    obj3 = e.mo28742b(i2, this);
                    if (obj3 == c) {
                        return c;
                    }
                }
                return C13339u.f61331a;
            } else if (i == 1) {
                C13332o.m85685b(obj);
                obj3 = obj;
            } else if (i == 2) {
                lVar = (C4407l) this.L$0;
                C13332o.m85685b(obj);
                obj2 = obj;
                this.this$0.mo27670z().mo24575a(lVar.mo28737b(), this.$macroId, this.$comment, (int) ((Number) obj2).longValue());
                C10180a.m40075a().mo80018i(new TemplateUpdateEvent());
                return C13339u.f61331a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4407l lVar2 = (C4407l) obj3;
            if (lVar2 != null) {
                C4419p pVar = r4;
                C4419p pVar2 = new C4419p(0, C4418o.TYPE_MACRO_NEW_COMMENT, this.$macroId, lVar2.mo28737b(), this.$username, this.$userId, this.$userImage, this.$comment, System.currentTimeMillis());
                C4421q f = this.this$0.mo27669y().mo28680f();
                this.L$0 = lVar2;
                this.label = 2;
                obj2 = f.mo28767b(pVar, this);
                if (obj2 == c) {
                    return c;
                }
                lVar = lVar2;
                this.this$0.mo27670z().mo24575a(lVar.mo28737b(), this.$macroId, this.$comment, (int) ((Number) obj2).longValue());
                C10180a.m40075a().mo80018i(new TemplateUpdateEvent());
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.cloudmessaging.MacroDroidFirebaseMessagingService$d */
    /* compiled from: MacroDroidFirebaseMessagingService.kt */
    static final class C3960d extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ int $macroId;
        final /* synthetic */ int $userId;
        final /* synthetic */ String $userImage;
        final /* synthetic */ String $username;
        Object L$0;
        int label;
        final /* synthetic */ MacroDroidFirebaseMessagingService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3960d(MacroDroidFirebaseMessagingService macroDroidFirebaseMessagingService, int i, int i2, String str, String str2, C13635d<? super C3960d> dVar) {
            super(2, dVar);
            this.this$0 = macroDroidFirebaseMessagingService;
            this.$userId = i;
            this.$macroId = i2;
            this.$username = str;
            this.$userImage = str2;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C3960d(this.this$0, this.$userId, this.$macroId, this.$username, this.$userImage, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C3960d) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C4407l lVar;
            Object obj3;
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                if (this.this$0.mo27664A().mo30790b().getUserId() != this.$userId) {
                    C4409m e = this.this$0.mo27669y().mo28679e();
                    int i2 = this.$macroId;
                    this.label = 1;
                    obj3 = e.mo28742b(i2, this);
                    if (obj3 == c) {
                        return c;
                    }
                }
                return C13339u.f61331a;
            } else if (i == 1) {
                C13332o.m85685b(obj);
                obj3 = obj;
            } else if (i == 2) {
                lVar = (C4407l) this.L$0;
                C13332o.m85685b(obj);
                obj2 = obj;
                this.this$0.mo27670z().mo24577c(lVar.mo28737b(), this.$macroId, (int) ((Number) obj2).longValue());
                C10180a.m40075a().mo80018i(new TemplateUpdateEvent());
                return C13339u.f61331a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4407l lVar2 = (C4407l) obj3;
            if (lVar2 != null) {
                C4419p pVar = r4;
                C4419p pVar2 = new C4419p(0, C4418o.TYPE_MACRO_UPDATED, this.$macroId, lVar2.mo28737b(), this.$username, this.$userId, this.$userImage, "", System.currentTimeMillis());
                C4421q f = this.this$0.mo27669y().mo28680f();
                this.L$0 = lVar2;
                this.label = 2;
                obj2 = f.mo28767b(pVar, this);
                if (obj2 == c) {
                    return c;
                }
                lVar = lVar2;
                this.this$0.mo27670z().mo24577c(lVar.mo28737b(), this.$macroId, (int) ((Number) obj2).longValue());
                C10180a.m40075a().mo80018i(new TemplateUpdateEvent());
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.cloudmessaging.MacroDroidFirebaseMessagingService$e */
    /* compiled from: MacroDroidFirebaseMessagingService.kt */
    static final class C3961e extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ int $macroId;
        final /* synthetic */ String $macroName;
        final /* synthetic */ int $userId;
        final /* synthetic */ String $userImage;
        final /* synthetic */ String $username;
        int label;
        final /* synthetic */ MacroDroidFirebaseMessagingService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3961e(MacroDroidFirebaseMessagingService macroDroidFirebaseMessagingService, int i, int i2, String str, String str2, String str3, C13635d<? super C3961e> dVar) {
            super(2, dVar);
            this.this$0 = macroDroidFirebaseMessagingService;
            this.$userId = i;
            this.$macroId = i2;
            this.$macroName = str;
            this.$username = str2;
            this.$userImage = str3;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C3961e(this.this$0, this.$userId, this.$macroId, this.$macroName, this.$username, this.$userImage, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C3961e) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object obj3;
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                if (this.this$0.mo27664A().mo30790b().getUserId() != this.$userId) {
                    C4445w h = this.this$0.mo27669y().mo28682h();
                    int i2 = this.$userId;
                    this.label = 1;
                    obj3 = h.mo28801b(i2, this);
                    if (obj3 == c) {
                        return c;
                    }
                }
                return C13339u.f61331a;
            } else if (i == 1) {
                C13332o.m85685b(obj);
                obj3 = obj;
            } else if (i == 2) {
                C13332o.m85685b(obj);
                obj2 = obj;
                this.this$0.mo27670z().mo24578d(this.$username, this.$macroName, this.$macroId, (int) ((Number) obj2).longValue());
                C10180a.m40075a().mo80018i(new UserUpdateEvent());
                return C13339u.f61331a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (obj3 != null) {
                C4419p pVar = new C4419p(0, C4418o.TYPE_USER_NEW_MACRO, this.$macroId, this.$macroName, this.$username, this.$userId, this.$userImage, "", System.currentTimeMillis());
                C4421q f = this.this$0.mo27669y().mo28680f();
                this.label = 2;
                obj2 = f.mo28767b(pVar, this);
                if (obj2 == c) {
                    return c;
                }
                this.this$0.mo27670z().mo24578d(this.$username, this.$macroName, this.$macroId, (int) ((Number) obj2).longValue());
                C10180a.m40075a().mo80018i(new UserUpdateEvent());
            }
            return C13339u.f61331a;
        }
    }

    public MacroDroidFirebaseMessagingService() {
        C15573z b = C15198b2.m93746b((C15561w1) null, 1, (Object) null);
        this.f10282p = b;
        this.f10283s = b.plus(C15186a1.m93730b());
    }

    /* renamed from: C */
    private final void m15339C(String str, int i, int i2, String str2, String str3) {
        C15561w1 unused = C15473j.m94492d(this, (C13640g) null, (C15486m0) null, new C3958b(this, i2, i, str2, str3, (C13635d<? super C3958b>) null), 3, (Object) null);
    }

    /* renamed from: D */
    private final void m15340D(String str, String str2, int i, int i2, String str3, String str4) {
        C15561w1 unused = C15473j.m94492d(this, (C13640g) null, (C15486m0) null, new C3959c(this, i2, i, str3, str4, str2, (C13635d<? super C3959c>) null), 3, (Object) null);
    }

    /* renamed from: E */
    private final void m15341E(String str, int i, int i2, String str2, String str3) {
        C15561w1 unused = C15473j.m94492d(this, (C13640g) null, (C15486m0) null, new C3960d(this, i2, i, str2, str3, (C13635d<? super C3960d>) null), 3, (Object) null);
    }

    /* renamed from: F */
    private final void m15342F(String str, String str2, int i, int i2, String str3) {
        C15561w1 unused = C15473j.m94492d(this, (C13640g) null, (C15486m0) null, new C3961e(this, i2, i, str2, str, str3, (C13635d<? super C3961e>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static final void m15343G(MacroDroidFirebaseMessagingService macroDroidFirebaseMessagingService, Task task) {
        C13706o.m87929f(macroDroidFirebaseMessagingService, "this$0");
        C13706o.m87929f(task, "task");
        if (task.mo23718s()) {
            String str = (String) task.mo23715p();
            C17105a.m100579a("Refreshed token: $refreshedToken", new Object[0]);
            if (str != null) {
                macroDroidFirebaseMessagingService.m15344H(str);
            }
        }
    }

    /* renamed from: H */
    private final void m15344H(String str) {
        for (Macro triggerList : C4934n.m18998M().mo29710z()) {
            Iterator<Trigger> it = triggerList.getTriggerList().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next() instanceof WebHookTrigger) {
                        C8195d B = mo27665B();
                        C13706o.m87926c(B);
                        String n2 = C5163j2.m20217n2(this, false);
                        C13706o.m87928e(n2, "getUniqueId(this, false)");
                        B.mo38263f(n2, "", str, C5124c.f12865c).mo79657k(new C3962a(this, str), C3963b.f10287a);
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static final void m15345I(MacroDroidFirebaseMessagingService macroDroidFirebaseMessagingService, String str) {
        C13706o.m87929f(macroDroidFirebaseMessagingService, "this$0");
        C13706o.m87929f(str, "$token");
        C5163j2.m20164g5(macroDroidFirebaseMessagingService, str);
        C4878b.m18879r("Push token upload success");
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static final void m15346J(Throwable th) {
        C4878b.m18868g("Push token upload failed");
    }

    /* renamed from: K */
    private final void m15347K(int i) {
    }

    /* renamed from: A */
    public final C5527g mo27664A() {
        C5527g gVar = this.f10281C;
        if (gVar != null) {
            return gVar;
        }
        C13706o.m87945v("userProvider");
        return null;
    }

    /* renamed from: B */
    public final C8195d mo27665B() {
        C8195d dVar = this.f10284z;
        if (dVar != null) {
            return dVar;
        }
        C13706o.m87945v("webTriggerInteractor");
        return null;
    }

    public C13640g getCoroutineContext() {
        return this.f10283s;
    }

    public void onCreate() {
        super.onCreate();
        MacroDroidApplication.f9883I.mo27302a().mo38297b(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.util.Map} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo27667q(com.google.firebase.messaging.RemoteMessage r13) {
        /*
            r12 = this;
            java.lang.String r0 = "remoteMessage"
            kotlin.jvm.internal.C13706o.m87929f(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "From: "
            r0.append(r2)
            java.lang.String r2 = r13.mo63393m2()
            r0.append(r2)
            java.util.Map r0 = r13.mo63392l2()
            java.lang.String r1 = "remoteMessage.data"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0214
            java.lang.String r1 = "Type"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x0214
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0214
            int r2 = r1.hashCode()
            java.lang.String r3 = ""
            java.lang.String r4 = "valueOf(userId)"
            java.lang.String r5 = "valueOf(macroId)"
            java.lang.String r6 = "uImg"
            java.lang.String r7 = "un"
            java.lang.String r8 = "uId"
            java.lang.String r9 = "Id"
            java.lang.String r10 = "mn"
            switch(r2) {
                case -1713859729: goto L_0x01c3;
                case -1478252181: goto L_0x0166;
                case 71033549: goto L_0x0112;
                case 434559337: goto L_0x00c9;
                case 756526871: goto L_0x0074;
                case 1879016367: goto L_0x0050;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x0214
        L_0x0050:
            java.lang.String r2 = "MacroPoints"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x005a
            goto L_0x0214
        L_0x005a:
            java.lang.String r1 = "Points"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "valueOf(data[CloudMessages.VALUE_POINTS])"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            int r0 = r0.intValue()
            r12.m15347K(r0)
            goto L_0x0214
        L_0x0074:
            java.lang.String r2 = "UserNewMacro"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x007e
            goto L_0x0214
        L_0x007e:
            java.lang.Object r1 = r0.get(r7)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.get(r10)
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r1 = r0.get(r9)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            if (r2 == 0) goto L_0x0214
            if (r7 == 0) goto L_0x0214
            if (r1 == 0) goto L_0x0214
            if (r8 == 0) goto L_0x0214
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            kotlin.jvm.internal.C13706o.m87928e(r1, r5)
            int r5 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            kotlin.jvm.internal.C13706o.m87928e(r1, r4)
            int r6 = r1.intValue()
            if (r0 != 0) goto L_0x00bf
            r0 = r3
        L_0x00bf:
            r1 = r12
            r3 = r7
            r4 = r5
            r5 = r6
            r6 = r0
            r1.m15342F(r2, r3, r4, r5, r6)
            goto L_0x0214
        L_0x00c9:
            java.lang.String r2 = "UrlTrigger"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00d3
            goto L_0x0214
        L_0x00d3:
            java.lang.String r1 = "id"
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "variables"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            com.google.gson.GsonBuilder r2 = p172u1.C10283c.m40413c()
            com.google.gson.Gson r2 = r2.mo64004c()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            if (r0 == 0) goto L_0x0102
            java.lang.Class r3 = r3.getClass()
            java.lang.Object r0 = r2.mo63976j(r0, r3)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>"
            kotlin.jvm.internal.C13706o.m87927d(r0, r2)
            r3 = r0
            java.util.Map r3 = (java.util.Map) r3
        L_0x0102:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0214
            com.arlosoft.macrodroid.triggers.WebHookTrigger$b r0 = com.arlosoft.macrodroid.triggers.WebHookTrigger.f13738g
            kotlin.jvm.internal.C13706o.m87926c(r1)
            r0.mo31632b(r1, r3)
            goto L_0x0214
        L_0x0112:
            java.lang.String r2 = "MacroDeleted"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x011c
            goto L_0x0214
        L_0x011c:
            java.lang.Object r1 = r0.get(r10)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.get(r9)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            if (r2 == 0) goto L_0x0214
            if (r1 == 0) goto L_0x0214
            if (r8 == 0) goto L_0x0214
            if (r7 == 0) goto L_0x0214
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            kotlin.jvm.internal.C13706o.m87928e(r1, r5)
            int r5 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            kotlin.jvm.internal.C13706o.m87928e(r1, r4)
            int r4 = r1.intValue()
            if (r0 != 0) goto L_0x015d
            r6 = r3
            goto L_0x015e
        L_0x015d:
            r6 = r0
        L_0x015e:
            r1 = r12
            r3 = r5
            r5 = r7
            r1.m15339C(r2, r3, r4, r5, r6)
            goto L_0x0214
        L_0x0166:
            java.lang.String r2 = "MacroNewComment"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0170
            goto L_0x0214
        L_0x0170:
            java.lang.String r1 = "c"
            java.lang.Object r1 = r0.get(r1)
            r11 = r1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r1 = r0.get(r10)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.get(r9)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            if (r2 == 0) goto L_0x0214
            if (r11 == 0) goto L_0x0214
            if (r1 == 0) goto L_0x0214
            if (r7 == 0) goto L_0x0214
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            kotlin.jvm.internal.C13706o.m87928e(r1, r5)
            int r5 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            kotlin.jvm.internal.C13706o.m87928e(r1, r4)
            int r6 = r1.intValue()
            if (r0 != 0) goto L_0x01b9
            r0 = r3
        L_0x01b9:
            r1 = r12
            r3 = r11
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r0
            r1.m15340D(r2, r3, r4, r5, r6, r7)
            goto L_0x0214
        L_0x01c3:
            java.lang.String r2 = "MacroUpdated"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01cc
            goto L_0x0214
        L_0x01cc:
            java.lang.Object r1 = r0.get(r10)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.get(r9)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            if (r2 == 0) goto L_0x0214
            if (r1 == 0) goto L_0x0214
            if (r8 == 0) goto L_0x0214
            if (r7 == 0) goto L_0x0214
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            kotlin.jvm.internal.C13706o.m87928e(r1, r5)
            int r5 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            kotlin.jvm.internal.C13706o.m87928e(r1, r4)
            int r4 = r1.intValue()
            if (r0 != 0) goto L_0x020d
            r6 = r3
            goto L_0x020e
        L_0x020d:
            r6 = r0
        L_0x020e:
            r1 = r12
            r3 = r5
            r5 = r7
            r1.m15341E(r2, r3, r4, r5, r6)
        L_0x0214:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.cloudmessaging.MacroDroidFirebaseMessagingService.mo27667q(com.google.firebase.messaging.RemoteMessage):void");
    }

    /* renamed from: s */
    public void mo27668s(String str) {
        C13706o.m87929f(str, "s");
        super.mo27668s(str);
        FirebaseMessaging.m76862n().mo63351q().mo23702c(new C3964c(this));
    }

    /* renamed from: y */
    public final MacroDroidRoomDatabase mo27669y() {
        MacroDroidRoomDatabase macroDroidRoomDatabase = this.f10280B;
        if (macroDroidRoomDatabase != null) {
            return macroDroidRoomDatabase;
        }
        C13706o.m87945v("roomDatabase");
        return null;
    }

    /* renamed from: z */
    public final C2268a mo27670z() {
        C2268a aVar = this.f10279A;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("templateStoreNotificationHandler");
        return null;
    }
}
