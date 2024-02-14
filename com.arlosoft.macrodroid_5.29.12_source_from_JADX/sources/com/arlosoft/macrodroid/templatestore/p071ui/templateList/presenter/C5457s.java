package com.arlosoft.macrodroid.templatestore.p071ui.templateList.presenter;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.paging.PagedList;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.avatar.views.AvatarView;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.database.room.C4382a;
import com.arlosoft.macrodroid.database.room.C4384b;
import com.arlosoft.macrodroid.database.room.C4391d;
import com.arlosoft.macrodroid.database.room.C4393e;
import com.arlosoft.macrodroid.database.room.C4407l;
import com.arlosoft.macrodroid.database.room.C4409m;
import com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase;
import com.arlosoft.macrodroid.extensions.C4660g;
import com.arlosoft.macrodroid.macro.C4915a;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5116a;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.templatestore.events.TemplateDeletedEvent;
import com.arlosoft.macrodroid.templatestore.events.UserBlockedEvent;
import com.arlosoft.macrodroid.templatestore.model.MacroTemplate;
import com.arlosoft.macrodroid.templatestore.model.User;
import com.arlosoft.macrodroid.templatestore.p071ui.C5274a;
import com.arlosoft.macrodroid.templatestore.p071ui.C5275b;
import com.arlosoft.macrodroid.templatestore.p071ui.C5276c;
import com.arlosoft.macrodroid.templatestore.p071ui.templateList.C5410a;
import com.arlosoft.macrodroid.templatestore.p071ui.templateList.C5412c;
import com.arlosoft.macrodroid.templatestore.p071ui.templateList.C5489v;
import com.arlosoft.macrodroid.templatestore.p071ui.upload.C5496a;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.gson.Gson;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15423h2;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.C15573z;
import p058a3.C2229c;
import p088f3.C7290c;
import p099h1.C7361a;
import p142p0.C8056a;
import p161s1.C10180a;
import p171u0.C10280a;
import p176v0.C10312a;
import p199z2.C10434a;
import p270ga.C12318a;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16269p;
import p414v9.C16728b;
import p440y9.C16971a;
import p448z9.C17070a;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s */
/* compiled from: TemplateListPresenter.kt */
public final class C5457s extends C10280a<C5489v> implements C5276c, C5412c.C5413a, C5274a, C15478k0 {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final C5116a f13383A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final C7361a f13384B;

    /* renamed from: C */
    private final C4915a f13385C;

    /* renamed from: D */
    private final C4083b f13386D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final MacroDroidRoomDatabase f13387E;

    /* renamed from: F */
    private C15573z f13388F;

    /* renamed from: G */
    private C13640g f13389G;

    /* renamed from: H */
    private C17070a f13390H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C7290c f13391I;

    /* renamed from: J */
    private C5275b f13392J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public int f13393K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public int f13394L;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f13395c;

    /* renamed from: d */
    private final C10312a f13396d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10434a f13397f;

    /* renamed from: g */
    private final C5527g f13398g;

    /* renamed from: o */
    private final C5410a f13399o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Gson f13400p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C5412c f13401s;

    /* renamed from: z */
    private final C5496a f13402z;

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s$a */
    /* compiled from: TemplateListPresenter.kt */
    static final class C5458a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ int $macroId;
        final /* synthetic */ String $macroName;
        int label;
        final /* synthetic */ C5457s this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5458a(C5457s sVar, int i, String str, C13635d<? super C5458a> dVar) {
            super(2, dVar);
            this.this$0 = sVar;
            this.$macroId = i;
            this.$macroName = str;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5458a(this.this$0, this.$macroId, this.$macroName, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5458a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C4384b c2 = this.this$0.f13387E.mo28677c();
                C4382a aVar = new C4382a(this.$macroId, this.$macroName);
                this.label = 1;
                if (c2.mo28707b(aVar, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.mo30648X(false);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s$b */
    /* compiled from: TemplateListPresenter.kt */
    static final class C5459b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ int $userId;
        final /* synthetic */ String $username;
        int label;
        final /* synthetic */ C5457s this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5459b(C5457s sVar, int i, String str, C13635d<? super C5459b> dVar) {
            super(2, dVar);
            this.this$0 = sVar;
            this.$userId = i;
            this.$username = str;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5459b(this.this$0, this.$userId, this.$username, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5459b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C4393e d = this.this$0.f13387E.mo28678d();
                C4391d dVar = new C4391d(this.$userId, this.$username);
                this.label = 1;
                if (d.mo28719b(dVar, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.mo30648X(false);
            C10180a.m40075a().mo80018i(new UserBlockedEvent(this.$userId));
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s$c */
    /* compiled from: TemplateListPresenter.kt */
    static final class C5460c extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ String $language;
        final /* synthetic */ int $queryingUserId;
        final /* synthetic */ String $searchTerm;
        Object L$0;
        int label;
        final /* synthetic */ C5457s this$0;

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s$c$a */
        /* compiled from: TemplateListPresenter.kt */
        static final class C5461a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            int label;
            final /* synthetic */ C5457s this$0;

            /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s$c$a$a */
            /* compiled from: TemplateListPresenter.kt */
            public /* synthetic */ class C5462a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f13403a;

                static {
                    int[] iArr = new int[C2229c.values().length];
                    iArr[C2229c.LOADING.ordinal()] = 1;
                    iArr[C2229c.ERROR.ordinal()] = 2;
                    iArr[C2229c.PIRATE_VERSION.ordinal()] = 3;
                    iArr[C2229c.HAS_DATA.ordinal()] = 4;
                    iArr[C2229c.EMPTY.ordinal()] = 5;
                    f13403a = iArr;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5461a(C5457s sVar, C13635d<? super C5461a> dVar) {
                super(2, dVar);
                this.this$0 = sVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: r */
            public static final void m20999r(C5489v vVar, PagedList pagedList) {
                vVar.mo30682b(pagedList);
            }

            /* access modifiers changed from: private */
            /* renamed from: u */
            public static final void m21000u(C5489v vVar, C5457s sVar, C2229c cVar) {
                int i = cVar == null ? -1 : C5462a.f13403a[cVar.ordinal()];
                if (i == 1) {
                    vVar.mo30684c1();
                } else if (i == 2) {
                    vVar.mo30693q();
                    C5489v vVar2 = (C5489v) sVar.mo40890k();
                    if (vVar2 != null) {
                        vVar2.mo30678M0(false);
                    }
                } else if (i == 3) {
                    vVar.mo30677J();
                    C5489v vVar3 = (C5489v) sVar.mo40890k();
                    if (vVar3 != null) {
                        vVar3.mo30678M0(false);
                    }
                } else if (i == 4) {
                    vVar.mo30673B1();
                    C5489v vVar4 = (C5489v) sVar.mo40890k();
                    if (vVar4 != null) {
                        vVar4.mo30678M0(false);
                    }
                } else if (i == 5) {
                    vVar.mo30706x0();
                    C5489v vVar5 = (C5489v) sVar.mo40890k();
                    if (vVar5 != null) {
                        vVar5.mo30678M0(false);
                    }
                }
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C5461a(this.this$0, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C5461a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C5489v vVar = (C5489v) this.this$0.mo40890k();
                    C7290c cVar = null;
                    if (vVar != null) {
                        C7290c P = this.this$0.f13391I;
                        if (P == null) {
                            C13706o.m87945v("templatesViewModel");
                            P = null;
                        }
                        P.mo37206i().observe(vVar, new C5467t(vVar));
                    }
                    C5489v vVar2 = (C5489v) this.this$0.mo40890k();
                    if (vVar2 != null) {
                        C5457s sVar = this.this$0;
                        C7290c P2 = sVar.f13391I;
                        if (P2 == null) {
                            C13706o.m87945v("templatesViewModel");
                        } else {
                            cVar = P2;
                        }
                        cVar.mo37205g().observe(vVar2, new C5468u(vVar2, sVar));
                    }
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5460c(C5457s sVar, int i, String str, String str2, C13635d<? super C5460c> dVar) {
            super(2, dVar);
            this.this$0 = sVar;
            this.$queryingUserId = i;
            this.$searchTerm = str;
            this.$language = str2;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5460c(this.this$0, this.$queryingUserId, this.$searchTerm, this.$language, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5460c) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x005e A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r2 = r0.label
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x0032
                if (r2 == r5) goto L_0x002c
                if (r2 == r4) goto L_0x0020
                if (r2 != r3) goto L_0x0018
                p297ja.C13332o.m85685b(r21)
                goto L_0x00de
            L_0x0018:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0020:
                java.lang.Object r2 = r0.L$0
                java.util.List r2 = (java.util.List) r2
                p297ja.C13332o.m85685b(r21)
                r6 = r21
            L_0x0029:
                r18 = r2
                goto L_0x005f
            L_0x002c:
                p297ja.C13332o.m85685b(r21)
                r2 = r21
                goto L_0x0048
            L_0x0032:
                p297ja.C13332o.m85685b(r21)
                com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s r2 = r0.this$0
                com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase r2 = r2.f13387E
                com.arlosoft.macrodroid.database.room.e r2 = r2.mo28678d()
                r0.label = r5
                java.lang.Object r2 = r2.mo28718a(r0)
                if (r2 != r1) goto L_0x0048
                return r1
            L_0x0048:
                java.util.List r2 = (java.util.List) r2
                com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s r6 = r0.this$0
                com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase r6 = r6.f13387E
                com.arlosoft.macrodroid.database.room.b r6 = r6.mo28677c()
                r0.L$0 = r2
                r0.label = r4
                java.lang.Object r6 = r6.mo28706a(r0)
                if (r6 != r1) goto L_0x0029
                return r1
            L_0x005f:
                r19 = r6
                java.util.List r19 = (java.util.List) r19
                com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s r2 = r0.this$0
                f3.c r6 = new f3.c
                com.google.gson.Gson r8 = r2.f13400p
                com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s r7 = r0.this$0
                z2.a r9 = r7.f13397f
                com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s r7 = r0.this$0
                int r10 = r7.f13393K
                int r11 = r0.$queryingUserId
                com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s r7 = r0.this$0
                com.arlosoft.macrodroid.templatestore.ui.templateList.c r7 = r7.f13401s
                int r12 = r7.mo30611b()
                com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s r7 = r0.this$0
                int r13 = r7.f13394L
                java.lang.String r14 = r0.$searchTerm
                com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s r7 = r0.this$0
                com.arlosoft.macrodroid.settings.a r15 = r7.f13383A
                com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s r7 = r0.this$0
                h1.a r16 = r7.f13384B
                java.lang.String r7 = r0.$language
                r5 = 0
                if (r7 == 0) goto L_0x00a6
                int r7 = r7.length()
                if (r7 != 0) goto L_0x00a3
                goto L_0x00a6
            L_0x00a3:
                r17 = 0
                goto L_0x00a8
            L_0x00a6:
                r17 = 1
            L_0x00a8:
                if (r17 != 0) goto L_0x00bb
                java.lang.String r7 = r0.$language
                java.lang.String r3 = "language"
                kotlin.jvm.internal.C13706o.m87928e(r7, r3)
                java.lang.String r3 = r7.substring(r5, r4)
                java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.C13706o.m87928e(r3, r4)
                goto L_0x00bd
            L_0x00bb:
                java.lang.String r3 = "en"
            L_0x00bd:
                r17 = r3
                r7 = r6
                r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                r2.f13391I = r6
                kotlinx.coroutines.h2 r2 = kotlinx.coroutines.C15186a1.m93731c()
                com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s$c$a r3 = new com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s$c$a
                com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s r4 = r0.this$0
                r5 = 0
                r3.<init>(r4, r5)
                r0.L$0 = r5
                r4 = 3
                r0.label = r4
                java.lang.Object r2 = kotlinx.coroutines.C15414h.m94298g(r2, r3, r0)
                if (r2 != r1) goto L_0x00de
                return r1
            L_0x00de:
                ja.u r1 = p297ja.C13339u.f61331a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.templatestore.p071ui.templateList.presenter.C5457s.C5460c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s$d */
    /* compiled from: TemplateListPresenter.kt */
    static final class C5463d extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ String $macroName;
        final /* synthetic */ MacroTemplate $macroTemplate;
        int label;
        final /* synthetic */ C5457s this$0;

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s$d$a */
        /* compiled from: TemplateListPresenter.kt */
        static final class C5464a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ String $macroName;
            int label;
            final /* synthetic */ C5457s this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5464a(C5457s sVar, String str, C13635d<? super C5464a> dVar) {
                super(2, dVar);
                this.this$0 = sVar;
                this.$macroName = str;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C5464a(this.this$0, this.$macroName, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C5464a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C5489v vVar = (C5489v) this.this$0.mo40890k();
                    if (vVar != null) {
                        vVar.refresh();
                    }
                    Context K = this.this$0.f13395c;
                    C13696i0 i0Var = C13696i0.f61931a;
                    String string = this.this$0.f13395c.getString(C17541R$string.template_store_subscribed_to);
                    C13706o.m87928e(string, "context.getString(R.stri…late_store_subscribed_to)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{this.$macroName}, 1));
                    C13706o.m87928e(format, "format(format, *args)");
                    C15626c.m94876a(K, format, 0).show();
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5463d(C5457s sVar, MacroTemplate macroTemplate, String str, C13635d<? super C5463d> dVar) {
            super(2, dVar);
            this.this$0 = sVar;
            this.$macroTemplate = macroTemplate;
            this.$macroName = str;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5463d(this.this$0, this.$macroTemplate, this.$macroName, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5463d) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C4409m e = this.this$0.f13387E.mo28679e();
                C4407l lVar = new C4407l(this.$macroTemplate.getId(), this.$macroName);
                this.label = 1;
                if (e.mo28741a(lVar, this) == c) {
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
            C15423h2 c2 = C15186a1.m93731c();
            C5464a aVar = new C5464a(this.this$0, this.$macroName, (C13635d<? super C5464a>) null);
            this.label = 2;
            if (C15414h.m94298g(c2, aVar, this) == c) {
                return c;
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s$e */
    /* compiled from: TemplateListPresenter.kt */
    static final class C5465e extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ String $macroName;
        final /* synthetic */ MacroTemplate $macroTemplate;
        final /* synthetic */ Task<Void> $task;
        int label;
        final /* synthetic */ C5457s this$0;

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s$e$a */
        /* compiled from: TemplateListPresenter.kt */
        static final class C5466a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ String $msg;
            int label;
            final /* synthetic */ C5457s this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5466a(C5457s sVar, String str, C13635d<? super C5466a> dVar) {
                super(2, dVar);
                this.this$0 = sVar;
                this.$msg = str;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C5466a(this.this$0, this.$msg, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C5466a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C15626c.m94876a(this.this$0.f13395c, this.$msg, 0).show();
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5465e(Task<Void> task, C5457s sVar, MacroTemplate macroTemplate, String str, C13635d<? super C5465e> dVar) {
            super(2, dVar);
            this.$task = task;
            this.this$0 = sVar;
            this.$macroTemplate = macroTemplate;
            this.$macroName = str;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5465e(this.$task, this.this$0, this.$macroTemplate, this.$macroName, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5465e) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x009f A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x001f
                if (r1 == r3) goto L_0x001b
                if (r1 != r2) goto L_0x0013
                p297ja.C13332o.m85685b(r7)
                goto L_0x00a0
            L_0x0013:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001b:
                p297ja.C13332o.m85685b(r7)
                goto L_0x0043
            L_0x001f:
                p297ja.C13332o.m85685b(r7)
                com.google.android.gms.tasks.Task<java.lang.Void> r7 = r6.$task
                boolean r7 = r7.mo23719t()
                if (r7 == 0) goto L_0x006c
                com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s r7 = r6.this$0
                com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase r7 = r7.f13387E
                com.arlosoft.macrodroid.database.room.m r7 = r7.mo28679e()
                com.arlosoft.macrodroid.templatestore.model.MacroTemplate r1 = r6.$macroTemplate
                int r1 = r1.getId()
                r6.label = r3
                java.lang.Object r7 = r7.mo28743c(r1, r6)
                if (r7 != r0) goto L_0x0043
                return r0
            L_0x0043:
                kotlin.jvm.internal.i0 r7 = kotlin.jvm.internal.C13696i0.f61931a
                com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s r7 = r6.this$0
                android.content.Context r7 = r7.f13395c
                r1 = 2131955044(0x7f130d64, float:1.9546604E38)
                java.lang.String r7 = r7.getString(r1)
                java.lang.String r1 = "context.getString(R.stri…_store_unsubscribed_from)"
                kotlin.jvm.internal.C13706o.m87928e(r7, r1)
                java.lang.Object[] r1 = new java.lang.Object[r3]
                r4 = 0
                java.lang.String r5 = r6.$macroName
                r1[r4] = r5
                java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
                java.lang.String r7 = java.lang.String.format(r7, r1)
                java.lang.String r1 = "format(format, *args)"
                kotlin.jvm.internal.C13706o.m87928e(r7, r1)
                goto L_0x007e
            L_0x006c:
                com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s r7 = r6.this$0
                android.content.Context r7 = r7.f13395c
                r1 = 2131955043(0x7f130d63, float:1.9546602E38)
                java.lang.String r7 = r7.getString(r1)
                java.lang.String r1 = "{\n                      …                        }"
                kotlin.jvm.internal.C13706o.m87928e(r7, r1)
            L_0x007e:
                com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s r1 = r6.this$0
                java.lang.Object r1 = r1.mo40890k()
                com.arlosoft.macrodroid.templatestore.ui.templateList.v r1 = (com.arlosoft.macrodroid.templatestore.p071ui.templateList.C5489v) r1
                if (r1 == 0) goto L_0x008b
                r1.refresh()
            L_0x008b:
                kotlinx.coroutines.h2 r1 = kotlinx.coroutines.C15186a1.m93731c()
                com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s$e$a r3 = new com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s$e$a
                com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.s r4 = r6.this$0
                r5 = 0
                r3.<init>(r4, r7, r5)
                r6.label = r2
                java.lang.Object r7 = kotlinx.coroutines.C15414h.m94298g(r1, r3, r6)
                if (r7 != r0) goto L_0x00a0
                return r0
            L_0x00a0:
                ja.u r7 = p297ja.C13339u.f61331a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.templatestore.p071ui.templateList.presenter.C5457s.C5465e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C5457s(Context context, C10312a aVar, C10434a aVar2, C5527g gVar, C5410a aVar3, Gson gson, C5412c cVar, C5496a aVar4, C5116a aVar5, C7361a aVar6, C4915a aVar7, C4083b bVar, MacroDroidRoomDatabase macroDroidRoomDatabase) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(aVar, "screenLoader");
        C13706o.m87929f(aVar2, "api");
        C13706o.m87929f(gVar, "userProvider");
        C13706o.m87929f(aVar3, "localTemplateOverrideStore");
        C13706o.m87929f(gson, "gson");
        C13706o.m87929f(cVar, "categoryManager");
        C13706o.m87929f(aVar4, "templateRefreshNotifier");
        C13706o.m87929f(aVar5, "appPreferences");
        C13706o.m87929f(aVar6, "categoriesHelper");
        C13706o.m87929f(aVar7, "actionBlockStore");
        C13706o.m87929f(bVar, "premiumStatusHandler");
        C13706o.m87929f(macroDroidRoomDatabase, "roomDatabase");
        this.f13395c = context;
        this.f13396d = aVar;
        this.f13397f = aVar2;
        this.f13398g = gVar;
        this.f13399o = aVar3;
        this.f13400p = gson;
        this.f13401s = cVar;
        this.f13402z = aVar4;
        this.f13383A = aVar5;
        this.f13384B = aVar6;
        this.f13385C = aVar7;
        this.f13386D = bVar;
        this.f13387E = macroDroidRoomDatabase;
        C15573z b = C15198b2.m93746b((C15561w1) null, 1, (Object) null);
        this.f13388F = b;
        this.f13389G = b.plus(C15186a1.m93730b());
    }

    /* renamed from: A0 */
    private final boolean m20922A0(String str, int i, int i2) {
        int length = str.length();
        return i <= length && length <= i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public static final void m20939V(C5457s sVar, MacroTemplate macroTemplate) {
        C13706o.m87929f(sVar, "this$0");
        C13706o.m87929f(macroTemplate, "$macroTemplate");
        sVar.f13399o.mo30606a(macroTemplate.getId(), macroTemplate.setDeleted());
        C5489v vVar = (C5489v) sVar.mo40890k();
        if (vVar != null) {
            vVar.refresh();
        }
        C5489v vVar2 = (C5489v) sVar.mo40890k();
        if (vVar2 != null) {
            vVar2.mo30699s1();
        }
        C10180a.m40075a().mo80018i(new TemplateDeletedEvent());
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public static final void m20940W(C5457s sVar, Throwable th) {
        C13706o.m87929f(sVar, "this$0");
        C5489v vVar = (C5489v) sVar.mo40890k();
        if (vVar != null) {
            vVar.mo30680a();
        }
    }

    /* renamed from: Y */
    public static /* synthetic */ void m20941Y(C5457s sVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        sVar.mo30648X(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public static final void m20942f0(C5457s sVar, Boolean bool) {
        C13706o.m87929f(sVar, "this$0");
        C5489v vVar = (C5489v) sVar.mo40890k();
        if (vVar != null) {
            vVar.mo30678M0(false);
        }
        m20941Y(sVar, false, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public static final void m20943h0(C5457s sVar) {
        C13706o.m87929f(sVar, "this$0");
        C5489v vVar = (C5489v) sVar.mo40890k();
        if (vVar != null) {
            vVar.mo30694r(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public static final void m20944i0(C5457s sVar) {
        C13706o.m87929f(sVar, "this$0");
        C5489v vVar = (C5489v) sVar.mo40890k();
        if (vVar != null) {
            vVar.mo30692p();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public static final void m20945j0(C5457s sVar, Throwable th) {
        C13706o.m87929f(sVar, "this$0");
        C5489v vVar = (C5489v) sVar.mo40890k();
        if (vVar != null) {
            vVar.mo30691o();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public static final void m20946l0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public static final void m20947m0(C5457s sVar, MacroTemplate macroTemplate, Throwable th) {
        C13706o.m87929f(sVar, "this$0");
        C13706o.m87929f(macroTemplate, "$macroTemplate");
        sVar.f13399o.mo30606a(macroTemplate.getId(), macroTemplate);
        C5489v vVar = (C5489v) sVar.mo40890k();
        if (vVar != null) {
            vVar.refresh();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public static final void m20948n0(C5457s sVar, MacroTemplate macroTemplate, String str, Task task) {
        C13706o.m87929f(sVar, "this$0");
        C13706o.m87929f(macroTemplate, "$macroTemplate");
        C13706o.m87929f(str, "$macroName");
        C13706o.m87929f(task, "task");
        if (task.mo23719t()) {
            C15561w1 unused = C15473j.m94492d(sVar, (C13640g) null, (C15486m0) null, new C5463d(sVar, macroTemplate, str, (C13635d<? super C5463d>) null), 3, (Object) null);
            return;
        }
        C5489v vVar = (C5489v) sVar.mo40890k();
        if (vVar != null) {
            vVar.refresh();
        }
        C15626c.makeText(sVar.f13395c, C17541R$string.template_store_subscription_failed, 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public static final void m20950o0(C5457s sVar, Exception exc) {
        C13706o.m87929f(sVar, "this$0");
        C13706o.m87929f(exc, "exception");
        C15626c.makeText(sVar.f13395c, C17541R$string.template_store_subscription_failed, 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public static final void m20952p0(C5457s sVar) {
        C13706o.m87929f(sVar, "this$0");
        C15626c.makeText(sVar.f13395c, C17541R$string.template_store_subscription_failed, 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public static final void m20954q0(C5457s sVar, MacroTemplate macroTemplate, String str, Task task) {
        C13706o.m87929f(sVar, "this$0");
        C13706o.m87929f(macroTemplate, "$macroTemplate");
        C13706o.m87929f(str, "$macroName");
        C13706o.m87929f(task, "task");
        C15561w1 unused = C15473j.m94492d(sVar, (C13640g) null, (C15486m0) null, new C5465e(task, sVar, macroTemplate, str, (C13635d<? super C5465e>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public static final void m20956r0(C5457s sVar, Exception exc) {
        C13706o.m87929f(sVar, "this$0");
        C13706o.m87929f(exc, "exception");
        C15626c.makeText(sVar.f13395c, C17541R$string.template_store_unsubscribe_failed, 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public static final void m20960u0(C5457s sVar, MacroTemplate macroTemplate, String str) {
        C13706o.m87929f(sVar, "this$0");
        C13706o.m87929f(macroTemplate, "$macroTemplate");
        C13706o.m87929f(str, "$descriptionText");
        sVar.f13399o.mo30606a(macroTemplate.getId(), macroTemplate.updateDescription(str));
        C5489v vVar = (C5489v) sVar.mo40890k();
        if (vVar != null) {
            vVar.refresh();
        }
        C5489v vVar2 = (C5489v) sVar.mo40890k();
        if (vVar2 != null) {
            vVar2.mo30690m1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public static final void m20962v0(C5457s sVar, Throwable th) {
        C13706o.m87929f(sVar, "this$0");
        C5489v vVar = (C5489v) sVar.mo40890k();
        if (vVar != null) {
            vVar.mo30702u1(false);
        }
        C5489v vVar2 = (C5489v) sVar.mo40890k();
        if (vVar2 != null) {
            vVar2.mo30676G();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public static final void m20965x0(C5457s sVar) {
        C13706o.m87929f(sVar, "this$0");
        C5489v vVar = (C5489v) sVar.mo40890k();
        if (vVar != null) {
            vVar.mo30702u1(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public static final void m20967y0(C5457s sVar, MacroTemplate macroTemplate, String str) {
        C13706o.m87929f(sVar, "this$0");
        C13706o.m87929f(macroTemplate, "$macroTemplate");
        C13706o.m87929f(str, "$name");
        sVar.f13399o.mo30606a(macroTemplate.getId(), macroTemplate.updateName(str));
        C5489v vVar = (C5489v) sVar.mo40890k();
        if (vVar != null) {
            vVar.refresh();
        }
        C5489v vVar2 = (C5489v) sVar.mo40890k();
        if (vVar2 != null) {
            vVar2.mo30690m1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public static final void m20969z0(C5457s sVar, Throwable th) {
        C13706o.m87929f(sVar, "this$0");
        C5489v vVar = (C5489v) sVar.mo40890k();
        if (vVar != null) {
            vVar.mo30676G();
        }
    }

    /* renamed from: L */
    public void mo30432L(String str) {
        C13706o.m87929f(str, "searchTerm");
        m20941Y(this, false, 1, (Object) null);
    }

    /* renamed from: S */
    public final void mo30645S(int i, String str) {
        C13706o.m87929f(str, "macroName");
        C15561w1 unused = C15473j.m94492d(this, (C13640g) null, (C15486m0) null, new C5458a(this, i, str, (C13635d<? super C5458a>) null), 3, (Object) null);
    }

    /* renamed from: T */
    public final void mo30646T(int i, String str) {
        C13706o.m87929f(str, "username");
        C15561w1 unused = C15473j.m94492d(this, (C13640g) null, (C15486m0) null, new C5459b(this, i, str, (C13635d<? super C5459b>) null), 3, (Object) null);
    }

    /* renamed from: U */
    public final void mo30647U(MacroTemplate macroTemplate) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        String g = C4660g.m18129g(macroTemplate.getUserId() + "adb97ac6-f780-4a41-8475-ce661b574999" + macroTemplate.getId());
        C17070a aVar = this.f13390H;
        if (aVar == null) {
            C13706o.m87945v("compositeDisposable");
            aVar = null;
        }
        aVar.mo62358a(this.f13397f.mo41165i(g, macroTemplate.getId(), macroTemplate.getUserId()).mo79658m(C12318a.m83030b()).mo79655i(C16971a.m100210a()).mo79657k(new C5450l(this, macroTemplate), new C5440b(this)));
    }

    /* renamed from: X */
    public final void mo30648X(boolean z) {
        String str;
        int userId = this.f13398g.mo30790b().getUserId();
        String language = C5163j2.m19963F0(this.f13395c).getLanguage();
        C5275b bVar = this.f13392J;
        if (bVar == null || (str = bVar.mo30419z()) == null) {
            str = "";
        }
        C15561w1 unused = C15473j.m94492d(this, (C13640g) null, (C15486m0) null, new C5460c(this, userId, str, language, (C13635d<? super C5460c>) null), 3, (Object) null);
    }

    /* renamed from: Z */
    public final void mo30649Z(MacroTemplate macroTemplate) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        C5489v vVar = (C5489v) mo40890k();
        if (vVar != null) {
            vVar.mo30704w(macroTemplate);
        }
    }

    /* renamed from: a */
    public void mo30433a(MacroTemplate macroTemplate) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        C5489v vVar = (C5489v) mo40890k();
        if (vVar != null) {
            vVar.mo30689l1(macroTemplate);
        }
    }

    /* renamed from: a0 */
    public final void mo30650a0(MacroTemplate macroTemplate) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        C5489v vVar = (C5489v) mo40890k();
        if (vVar != null) {
            vVar.mo30681a1(macroTemplate);
        }
    }

    /* renamed from: b */
    public void mo30434b(MacroTemplate macroTemplate, boolean z) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        if (!this.f13386D.mo28009e().mo28008a()) {
            C5489v vVar = (C5489v) mo40890k();
            if (vVar != null) {
                vVar.mo30685d();
            }
            C5489v vVar2 = (C5489v) mo40890k();
            if (vVar2 != null) {
                vVar2.refresh();
            }
        } else if (this.f13398g.mo30790b().isGuest()) {
            C5489v vVar3 = (C5489v) mo40890k();
            if (vVar3 != null) {
                vVar3.mo30697s();
            }
            C5489v vVar4 = (C5489v) mo40890k();
            if (vVar4 != null) {
                vVar4.refresh();
            }
        } else {
            String nameTranslated = macroTemplate.getNameTranslated();
            if (nameTranslated == null) {
                nameTranslated = macroTemplate.getName();
            }
            if (z) {
                FirebaseMessaging n = FirebaseMessaging.m76862n();
                n.mo63344H("macro-" + macroTemplate.getId()).mo23702c(new C5444f(this, macroTemplate, nameTranslated)).mo23705f(new C5447i(this)).mo23700a(new C5443e(this));
                return;
            }
            FirebaseMessaging n2 = FirebaseMessaging.m76862n();
            n2.mo63347K("macro-" + macroTemplate.getId()).mo23702c(new C5445g(this, macroTemplate, nameTranslated)).mo23705f(new C5446h(this));
        }
    }

    /* renamed from: b0 */
    public final void mo30651b0(MacroTemplate macroTemplate) {
        String str;
        String str2;
        Macro next;
        C13706o.m87929f(macroTemplate, "macroTemplate");
        Iterator<Macro> it = C4934n.m18998M().mo29710z().iterator();
        do {
            str = "";
            str2 = null;
            if (it.hasNext()) {
                next = it.next();
            } else {
                C10312a aVar = this.f13396d;
                int id = macroTemplate.getId();
                String name = macroTemplate.getName();
                String description = macroTemplate.getDescription();
                Macro macro = macroTemplate.getMacro();
                if (macro != null) {
                    str2 = macro.getCategory();
                }
                if (str2 != null) {
                    str = str2;
                }
                aVar.mo40934i(id, name, description, str);
                return;
            }
        } while (!C13706o.m87924a(next.getName(), macroTemplate.getName()));
        C10312a aVar2 = this.f13396d;
        int id2 = macroTemplate.getId();
        C13706o.m87928e(next, "macro");
        String description2 = macroTemplate.getDescription();
        Macro macro2 = macroTemplate.getMacro();
        if (macro2 != null) {
            str2 = macro2.getCategory();
        }
        if (str2 != null) {
            str = str2;
        }
        aVar2.mo40933h(id2, next, description2, str);
    }

    /* renamed from: c */
    public void mo30435c(MacroTemplate macroTemplate) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        this.f13396d.mo40930e(macroTemplate);
    }

    /* renamed from: c0 */
    public final void mo30652c0(MacroTemplate macroTemplate) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        C5489v vVar = (C5489v) mo40890k();
        if (vVar != null) {
            vVar.mo30683c0(macroTemplate);
        }
    }

    /* renamed from: d */
    public void mo30436d(MacroTemplate macroTemplate) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        User b = this.f13398g.mo30790b();
        C5489v vVar = (C5489v) mo40890k();
        if (vVar != null) {
            vVar.mo30670A(macroTemplate, b.getUserId() == macroTemplate.getUserId(), b.isModerator());
        }
    }

    /* renamed from: d0 */
    public final void mo30653d0(MacroTemplate macroTemplate) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        if (this.f13398g.mo30790b().isGuest()) {
            C5489v vVar = (C5489v) mo40890k();
            if (vVar != null) {
                vVar.mo30705w0();
                return;
            }
            return;
        }
        C5489v vVar2 = (C5489v) mo40890k();
        if (vVar2 != null) {
            vVar2.mo30686h1(macroTemplate);
        }
    }

    /* renamed from: e */
    public void mo30437e(MacroTemplate macroTemplate, AvatarView avatarView) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        C13706o.m87929f(avatarView, "avatarImage");
        this.f13396d.mo40936k(macroTemplate.getUsername(), macroTemplate.getUserImage(), macroTemplate.getUserId(), avatarView);
    }

    /* renamed from: e0 */
    public final void mo30654e0() {
        mo30648X(true);
    }

    /* renamed from: f */
    public void mo30438f(MacroTemplate macroTemplate) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        int userId = this.f13398g.mo30790b().getUserId();
        if (userId == macroTemplate.getUserId()) {
            C5489v vVar = (C5489v) mo40890k();
            if (vVar != null) {
                vVar.mo30700t0();
            }
            C5489v vVar2 = (C5489v) mo40890k();
            if (vVar2 != null) {
                vVar2.refresh();
            }
        } else if (userId == 0) {
            C5489v vVar3 = (C5489v) mo40890k();
            if (vVar3 != null) {
                vVar3.mo30705w0();
            }
            C5489v vVar4 = (C5489v) mo40890k();
            if (vVar4 != null) {
                vVar4.refresh();
            }
        } else {
            MacroTemplate c = this.f13399o.mo30608c(macroTemplate.getId());
            boolean z = !(c != null ? c.getStarred() : macroTemplate.getStarred());
            this.f13399o.mo30606a(macroTemplate.getId(), macroTemplate.updateStarRating(z));
            String g = C4660g.m18129g(macroTemplate.getId() + "adb97ac6-f780-4a41-8475-ce661b574999" + userId);
            C17070a aVar = this.f13390H;
            if (aVar == null) {
                C13706o.m87945v("compositeDisposable");
                aVar = null;
            }
            aVar.mo62358a(this.f13397f.mo41175s(g, macroTemplate.getId(), userId, z).mo79658m(C12318a.m83030b()).mo79655i(C16971a.m100210a()).mo79657k(C5453o.f13379a, new C5442d(this, macroTemplate)));
        }
    }

    /* renamed from: g */
    public void mo30616g(int i) {
        m20941Y(this, false, 1, (Object) null);
    }

    /* renamed from: g0 */
    public final void mo30655g0(MacroTemplate macroTemplate, int i, String str) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        C13706o.m87929f(str, "reasonText");
        C5489v vVar = (C5489v) mo40890k();
        if (vVar != null) {
            vVar.mo30694r(true);
        }
        C17070a aVar = this.f13390H;
        if (aVar == null) {
            C13706o.m87945v("compositeDisposable");
            aVar = null;
        }
        aVar.mo62358a(C16728b.m99297h(C16728b.m99298n(1500, TimeUnit.MILLISECONDS), this.f13397f.mo41177u(macroTemplate.getId(), this.f13398g.mo30790b().getUserId(), i, str)).mo79658m(C12318a.m83030b()).mo79655i(C16971a.m100210a()).mo79653d(new C5449k(this)).mo79657k(new C5439a(this), new C5455q(this)));
    }

    public C13640g getCoroutineContext() {
        return this.f13389G;
    }

    /* renamed from: h */
    public void mo30439h(MacroTemplate macroTemplate) {
        String str;
        String str2;
        C13706o.m87929f(macroTemplate, "macroTemplate");
        MacroTemplate c = this.f13399o.mo30608c(macroTemplate.getId());
        if (c == null) {
            c = macroTemplate;
        }
        boolean z = C5163j2.m20177i2(this.f13395c) != null;
        Macro macro = c.getMacro();
        if (macro != null) {
            if (z || !macroTemplate.getUseTranslatedText()) {
                str2 = macroTemplate.getName();
            } else {
                str2 = macroTemplate.getNameTranslated();
                if (str2 == null) {
                    str2 = macroTemplate.getName();
                }
            }
            macro.setName(str2);
        }
        Macro macro2 = c.getMacro();
        if (macro2 != null) {
            if (z || !macroTemplate.getUseTranslatedText()) {
                str = macroTemplate.getDescription();
            } else {
                str = macroTemplate.getDescriptionTranslated();
                if (str == null) {
                    str = macroTemplate.getDescription();
                }
            }
            macro2.setDescription(str);
        }
        Macro macro3 = c.getMacro();
        C13706o.m87926c(macro3);
        Macro cloneMacro = macro3.cloneMacro(false, true);
        C4915a aVar = this.f13385C;
        C13706o.m87928e(cloneMacro, "clonedMacro");
        List<ActionBlock> actionBlocksToImport = cloneMacro.getActionBlocksToImport();
        C13706o.m87928e(actionBlocksToImport, "clonedMacro.actionBlocksToImport");
        C8056a.m33601a(aVar, cloneMacro, actionBlocksToImport, false);
        this.f13396d.mo40928c(cloneMacro, true);
    }

    /* renamed from: i */
    public void mo30440i(MacroTemplate macroTemplate) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        this.f13399o.mo30606a(macroTemplate.getId(), macroTemplate.setUseTranslated(!macroTemplate.getUseTranslatedText()));
        C5489v vVar = (C5489v) mo40890k();
        if (vVar != null) {
            vVar.refresh();
        }
    }

    /* renamed from: k0 */
    public void mo30656k0(C13640g gVar) {
        C13706o.m87929f(gVar, "<set-?>");
        this.f13389G = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo27412l() {
        C17070a aVar = this.f13390H;
        if (aVar == null) {
            C13706o.m87945v("compositeDisposable");
            aVar = null;
        }
        aVar.mo80337d();
        this.f13401s.mo30613d(this);
        C5275b bVar = this.f13392J;
        if (bVar != null) {
            bVar.mo30412b0(this);
        }
        this.f13392J = null;
        C15561w1.C15562a.m94723a(this.f13388F, (CancellationException) null, 1, (Object) null);
        C10180a.m40075a().mo80020p(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo27413m() {
        C17070a aVar = null;
        if (this.f13388F.isCancelled()) {
            C15573z b = C15198b2.m93746b((C15561w1) null, 1, (Object) null);
            this.f13388F = b;
            mo30656k0(b.plus(C15186a1.m93730b()));
        }
        this.f13390H = new C17070a();
        this.f13401s.mo30610a(this);
        C5275b bVar = this.f13392J;
        if (bVar != null) {
            bVar.mo30411Y(this);
        }
        C17070a aVar2 = this.f13390H;
        if (aVar2 == null) {
            C13706o.m87945v("compositeDisposable");
        } else {
            aVar = aVar2;
        }
        aVar.mo62358a(this.f13402z.mo30748b().mo79670q(new C5454p(this)));
        C10180a.m40075a().mo80019m(this);
    }

    public final void onEventMainThread(UserBlockedEvent userBlockedEvent) {
        C13706o.m87929f(userBlockedEvent, NotificationCompat.CATEGORY_EVENT);
        m20941Y(this, false, 1, (Object) null);
    }

    /* renamed from: s0 */
    public final void mo30658s0(C5489v vVar, C5275b bVar, int i, int i2) {
        C13706o.m87929f(vVar, "view");
        this.f13393K = i;
        this.f13394L = i2;
        this.f13392J = bVar;
        super.mo40891n(vVar);
    }

    /* renamed from: t0 */
    public final void mo30659t0(MacroTemplate macroTemplate, String str) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        C13706o.m87929f(str, "descriptionText");
        if (!m20922A0(str, 20, 2000)) {
            C5489v vVar = (C5489v) mo40890k();
            if (vVar != null) {
                vVar.mo30679T(false);
                return;
            }
            return;
        }
        C5489v vVar2 = (C5489v) mo40890k();
        if (vVar2 != null) {
            vVar2.mo30702u1(true);
        }
        String g = C4660g.m18129g(str + "adb97ac6-f780-4a41-8475-ce661b574999" + macroTemplate.getId());
        C17070a aVar = this.f13390H;
        if (aVar == null) {
            C13706o.m87945v("compositeDisposable");
            aVar = null;
        }
        aVar.mo62358a(C16728b.m99297h(C16728b.m99298n(1500, TimeUnit.MILLISECONDS), this.f13397f.mo41169m(g, macroTemplate.getId(), str)).mo79658m(C12318a.m83030b()).mo79655i(C16971a.m100210a()).mo79657k(new C5452n(this, macroTemplate, str), new C5456r(this)));
    }

    /* renamed from: w0 */
    public final void mo30660w0(MacroTemplate macroTemplate, String str) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        C13706o.m87929f(str, "name");
        if (!m20922A0(str, 5, 100)) {
            C5489v vVar = (C5489v) mo40890k();
            if (vVar != null) {
                vVar.mo30679T(true);
                return;
            }
            return;
        }
        C5489v vVar2 = (C5489v) mo40890k();
        if (vVar2 != null) {
            vVar2.mo30702u1(true);
        }
        String g = C4660g.m18129g(str + "adb97ac6-f780-4a41-8475-ce661b574999" + macroTemplate.getId());
        C17070a aVar = this.f13390H;
        if (aVar == null) {
            C13706o.m87945v("compositeDisposable");
            aVar = null;
        }
        aVar.mo62358a(C16728b.m99297h(C16728b.m99298n(1500, TimeUnit.MILLISECONDS), this.f13397f.mo41161e(g, macroTemplate.getId(), str)).mo79658m(C12318a.m83030b()).mo79655i(C16971a.m100210a()).mo79653d(new C5448j(this)).mo79657k(new C5451m(this, macroTemplate, str), new C5441c(this)));
    }
}
