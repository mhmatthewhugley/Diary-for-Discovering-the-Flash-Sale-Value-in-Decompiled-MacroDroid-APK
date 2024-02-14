package com.arlosoft.macrodroid.templatestore.p071ui.user.presenter;

import androidx.core.app.NotificationCompat;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.database.room.C4391d;
import com.arlosoft.macrodroid.database.room.C4393e;
import com.arlosoft.macrodroid.database.room.C4443v;
import com.arlosoft.macrodroid.database.room.C4445w;
import com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase;
import com.arlosoft.macrodroid.templatestore.events.TemplateDeletedEvent;
import com.arlosoft.macrodroid.templatestore.events.UserBlockedEvent;
import com.arlosoft.macrodroid.templatestore.model.User;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5529i;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13654b;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15423h2;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.C15573z;
import p161s1.C10180a;
import p171u0.C10280a;
import p176v0.C10312a;
import p199z2.C10434a;
import p270ga.C12318a;
import p297ja.C13332o;
import p297ja.C13339u;
import p329me.C15737b;
import p370qa.C16254a;
import p370qa.C16269p;
import p414v9.C16727a;
import p414v9.C16728b;
import p414v9.C16732f;
import p414v9.C16735i;
import p440y9.C16971a;
import p448z9.C17070a;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.presenter.l */
/* compiled from: UserPresenter.kt */
public final class C5541l extends C10280a<C5529i> implements C15478k0 {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f13505A;

    /* renamed from: B */
    private C17070a f13506B;

    /* renamed from: C */
    private final C15573z f13507C;

    /* renamed from: D */
    private final C13640g f13508D;

    /* renamed from: c */
    private final C10312a f13509c;

    /* renamed from: d */
    private final C10434a f13510d;

    /* renamed from: f */
    private final C4083b f13511f;

    /* renamed from: g */
    private final C5527g f13512g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final MacroDroidRoomDatabase f13513o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f13514p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public String f13515s = "";
    /* access modifiers changed from: private */

    /* renamed from: z */
    public String f13516z = "";

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.presenter.l$a */
    /* compiled from: UserPresenter.kt */
    static final class C5542a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ int $userId;
        final /* synthetic */ String $username;
        int label;
        final /* synthetic */ C5541l this$0;

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.presenter.l$a$a */
        /* compiled from: UserPresenter.kt */
        static final class C5543a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ int $userId;
            int label;
            final /* synthetic */ C5541l this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5543a(C5541l lVar, int i, C13635d<? super C5543a> dVar) {
                super(2, dVar);
                this.this$0 = lVar;
                this.$userId = i;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C5543a(this.this$0, this.$userId, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C5543a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C5529i iVar = (C5529i) this.this$0.mo40890k();
                    if (iVar != null) {
                        iVar.mo30761F0();
                    }
                    C5529i iVar2 = (C5529i) this.this$0.mo40890k();
                    if (iVar2 != null) {
                        iVar2.mo30763H0();
                    }
                    C10180a.m40075a().mo80018i(new UserBlockedEvent(this.$userId));
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5542a(C5541l lVar, int i, String str, C13635d<? super C5542a> dVar) {
            super(2, dVar);
            this.this$0 = lVar;
            this.$userId = i;
            this.$username = str;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5542a(this.this$0, this.$userId, this.$username, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5542a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C4393e d = this.this$0.f13513o.mo28678d();
                C4391d dVar = new C4391d(this.$userId, this.$username);
                this.label = 1;
                if (d.mo28719b(dVar, this) == c) {
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
            C5543a aVar = new C5543a(this.this$0, this.$userId, (C13635d<? super C5543a>) null);
            this.label = 2;
            if (C15414h.m94298g(c2, aVar, this) == c) {
                return c;
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.presenter.l$b */
    /* compiled from: UserPresenter.kt */
    static final class C5544b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ User $user;
        int label;
        final /* synthetic */ C5541l this$0;

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.presenter.l$b$a */
        /* compiled from: UserPresenter.kt */
        static final class C5545a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ User $user;
            final /* synthetic */ List<C4443v> $userSubscriptions;
            int label;
            final /* synthetic */ C5541l this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5545a(C5541l lVar, List<C4443v> list, User user, C13635d<? super C5545a> dVar) {
                super(2, dVar);
                this.this$0 = lVar;
                this.$userSubscriptions = list;
                this.$user = user;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C5545a(this.this$0, this.$userSubscriptions, this.$user, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C5545a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C5541l lVar = this.this$0;
                    List<C4443v> list = this.$userSubscriptions;
                    ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
                    for (C4443v a : list) {
                        arrayList.add(C13654b.m87834b(a.mo28794a()));
                    }
                    lVar.f13505A = arrayList.contains(C13654b.m87834b(this.$user.getUserId()));
                    C5529i iVar = (C5529i) this.this$0.mo40890k();
                    if (iVar != null) {
                        iVar.mo30766Q(this.this$0.f13505A, false);
                    }
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5544b(C5541l lVar, User user, C13635d<? super C5544b> dVar) {
            super(2, dVar);
            this.this$0 = lVar;
            this.$user = user;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5544b(this.this$0, this.$user, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5544b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C4445w h = this.this$0.f13513o.mo28682h();
                this.label = 1;
                obj = h.mo28802c(this);
                if (obj == c) {
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
            C5545a aVar = new C5545a(this.this$0, (List) obj, this.$user, (C13635d<? super C5545a>) null);
            this.label = 2;
            if (C15414h.m94298g(c2, aVar, this) == c) {
                return c;
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.presenter.l$c */
    /* compiled from: UserPresenter.kt */
    static final class C5546c extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ C5541l this$0;

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.presenter.l$c$a */
        /* compiled from: UserPresenter.kt */
        static final class C5547a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ boolean $isBlocked;
            int label;
            final /* synthetic */ C5541l this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5547a(boolean z, C5541l lVar, C13635d<? super C5547a> dVar) {
                super(2, dVar);
                this.$isBlocked = z;
                this.this$0 = lVar;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C5547a(this.$isBlocked, this.this$0, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C5547a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    if (this.$isBlocked) {
                        C5529i iVar = (C5529i) this.this$0.mo40890k();
                        if (iVar != null) {
                            iVar.mo30761F0();
                        }
                    } else {
                        this.this$0.m21298J();
                    }
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5546c(C5541l lVar, C13635d<? super C5546c> dVar) {
            super(2, dVar);
            this.this$0 = lVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5546c(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5546c) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C4393e d = this.this$0.f13513o.mo28678d();
                this.label = 1;
                obj = d.mo28718a(this);
                if (obj == c) {
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
            Iterable<C4391d> iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(C13616u.m87774u(iterable, 10));
            for (C4391d a : iterable) {
                arrayList.add(C13654b.m87834b(a.mo28713a()));
            }
            boolean contains = arrayList.contains(C13654b.m87834b(this.this$0.f13514p));
            C15423h2 c2 = C15186a1.m93731c();
            C5547a aVar = new C5547a(contains, this.this$0, (C13635d<? super C5547a>) null);
            this.label = 2;
            if (C15414h.m94298g(c2, aVar, this) == c) {
                return c;
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.presenter.l$d */
    /* compiled from: UserPresenter.kt */
    static final class C5548d extends C13708q implements C16254a<C13339u> {

        /* renamed from: a */
        public static final C5548d f13517a = new C5548d();

        C5548d() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.presenter.l$e */
    /* compiled from: UserPresenter.kt */
    static final class C5549e extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ C5541l this$0;

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.presenter.l$e$a */
        /* compiled from: UserPresenter.kt */
        static final class C5550a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            int label;
            final /* synthetic */ C5541l this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5550a(C5541l lVar, C13635d<? super C5550a> dVar) {
                super(2, dVar);
                this.this$0 = lVar;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C5550a(this.this$0, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C5550a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C5529i iVar = (C5529i) this.this$0.mo40890k();
                    if (iVar != null) {
                        iVar.mo30766Q(true, true);
                    }
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5549e(C5541l lVar, C13635d<? super C5549e> dVar) {
            super(2, dVar);
            this.this$0 = lVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5549e(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5549e) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C4445w h = this.this$0.f13513o.mo28682h();
                C4443v vVar = new C4443v(this.this$0.f13514p, this.this$0.f13515s, this.this$0.f13516z);
                this.label = 1;
                if (h.mo28800a(vVar, this) == c) {
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
            C5550a aVar = new C5550a(this.this$0, (C13635d<? super C5550a>) null);
            this.label = 2;
            if (C15414h.m94298g(c2, aVar, this) == c) {
                return c;
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.presenter.l$f */
    /* compiled from: UserPresenter.kt */
    static final class C5551f extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Task<Void> $task;
        int label;
        final /* synthetic */ C5541l this$0;

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.presenter.l$f$a */
        /* compiled from: UserPresenter.kt */
        static final class C5552a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            int label;
            final /* synthetic */ C5541l this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5552a(C5541l lVar, C13635d<? super C5552a> dVar) {
                super(2, dVar);
                this.this$0 = lVar;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C5552a(this.this$0, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C5552a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C5529i iVar = (C5529i) this.this$0.mo40890k();
                    if (iVar == null) {
                        return null;
                    }
                    iVar.mo30766Q(false, true);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.presenter.l$f$b */
        /* compiled from: UserPresenter.kt */
        static final class C5553b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            int label;
            final /* synthetic */ C5541l this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5553b(C5541l lVar, C13635d<? super C5553b> dVar) {
                super(2, dVar);
                this.this$0 = lVar;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C5553b(this.this$0, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C5553b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C5529i iVar = (C5529i) this.this$0.mo40890k();
                    if (iVar == null) {
                        return null;
                    }
                    iVar.mo30765M(false);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5551f(Task<Void> task, C5541l lVar, C13635d<? super C5551f> dVar) {
            super(2, dVar);
            this.$task = task;
            this.this$0 = lVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5551f(this.$task, this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5551f) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                if (this.$task.mo23719t()) {
                    C4445w h = this.this$0.f13513o.mo28682h();
                    int A = this.this$0.f13514p;
                    this.label = 1;
                    if (h.mo28803d(A, this) == c) {
                        return c;
                    }
                } else {
                    C15423h2 c2 = C15186a1.m93731c();
                    C5553b bVar = new C5553b(this.this$0, (C13635d<? super C5553b>) null);
                    this.label = 3;
                    if (C15414h.m94298g(c2, bVar, this) == c) {
                        return c;
                    }
                    return C13339u.f61331a;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else if (i == 2 || i == 3) {
                C13332o.m85685b(obj);
                return C13339u.f61331a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C15423h2 c3 = C15186a1.m93731c();
            C5552a aVar = new C5552a(this.this$0, (C13635d<? super C5552a>) null);
            this.label = 2;
            if (C15414h.m94298g(c3, aVar, this) == c) {
                return c;
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.presenter.l$g */
    /* compiled from: UserPresenter.kt */
    static final class C5554g extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ int $userId;
        int label;
        final /* synthetic */ C5541l this$0;

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.presenter.l$g$a */
        /* compiled from: UserPresenter.kt */
        static final class C5555a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ int $userId;
            int label;
            final /* synthetic */ C5541l this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5555a(C5541l lVar, int i, C13635d<? super C5555a> dVar) {
                super(2, dVar);
                this.this$0 = lVar;
                this.$userId = i;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C5555a(this.this$0, this.$userId, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C5555a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C5529i iVar = (C5529i) this.this$0.mo40890k();
                    if (iVar != null) {
                        iVar.mo30767U0();
                    }
                    C5529i iVar2 = (C5529i) this.this$0.mo40890k();
                    if (iVar2 != null) {
                        iVar2.mo30763H0();
                    }
                    C10180a.m40075a().mo80018i(new UserBlockedEvent(this.$userId));
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5554g(C5541l lVar, int i, C13635d<? super C5554g> dVar) {
            super(2, dVar);
            this.this$0 = lVar;
            this.$userId = i;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5554g(this.this$0, this.$userId, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5554g) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C4393e d = this.this$0.f13513o.mo28678d();
                int i2 = this.$userId;
                this.label = 1;
                if (d.mo28720c(i2, this) == c) {
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
            this.this$0.m21298J();
            C15423h2 c2 = C15186a1.m93731c();
            C5555a aVar = new C5555a(this.this$0, this.$userId, (C13635d<? super C5555a>) null);
            this.label = 2;
            if (C15414h.m94298g(c2, aVar, this) == c) {
                return c;
            }
            return C13339u.f61331a;
        }
    }

    public C5541l(C10312a aVar, C10434a aVar2, C4083b bVar, C5527g gVar, MacroDroidRoomDatabase macroDroidRoomDatabase) {
        C13706o.m87929f(aVar, "screenLoader");
        C13706o.m87929f(aVar2, "api");
        C13706o.m87929f(bVar, "premiumStatusHandler");
        C13706o.m87929f(gVar, "userProvider");
        C13706o.m87929f(macroDroidRoomDatabase, "roomDatabase");
        this.f13509c = aVar;
        this.f13510d = aVar2;
        this.f13511f = bVar;
        this.f13512g = gVar;
        this.f13513o = macroDroidRoomDatabase;
        C15573z b = C15198b2.m93746b((C15561w1) null, 1, (Object) null);
        this.f13507C = b;
        this.f13508D = b.plus(C15186a1.m93730b());
    }

    /* renamed from: H */
    private final void m21296H(User user) {
        C15561w1 unused = C15473j.m94492d(this, C15186a1.m93730b(), (C15486m0) null, new C5544b(this, user, (C13635d<? super C5544b>) null), 2, (Object) null);
    }

    /* renamed from: I */
    private final void m21297I() {
        C15561w1 unused = C15473j.m94492d(this, C15186a1.m93730b(), (C15486m0) null, new C5546c(this, (C13635d<? super C5546c>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public final void m21298J() {
        C17070a aVar = this.f13506B;
        if (aVar == null) {
            C13706o.m87945v("compositeDisposable");
            aVar = null;
        }
        aVar.mo62358a(this.f13510d.mo41162f(this.f13514p).mo79727m(C5536g.f13500a).mo79730q(C12318a.m83030b()).mo79726l(C16971a.m100210a()).mo79729o(new C5533d(this), C5535f.f13499a));
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static final void m21299K(Throwable th) {
        C5548d dVar = C5548d.f13517a;
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public static final C15737b m21300M(C16732f fVar) {
        C13706o.m87929f(fVar, "errors");
        return fVar.mo79661h(C5537h.f13501a);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public static final C15737b m21301N(Throwable th) {
        C13706o.m87929f(th, "it");
        return C16735i.m99346b0(2, TimeUnit.SECONDS).mo79699d0(C16727a.DROP);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public static final void m21302O(C5541l lVar, User user) {
        C13706o.m87929f(lVar, "this$0");
        C5529i iVar = (C5529i) lVar.mo40890k();
        if (iVar != null) {
            C13706o.m87928e(user, "user");
            iVar.mo30764K(user);
        }
        C13706o.m87928e(user, "user");
        lVar.m21296H(user);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public static final void m21303Q(C5541l lVar) {
        C13706o.m87929f(lVar, "this$0");
        C5529i iVar = (C5529i) lVar.mo40890k();
        if (iVar != null) {
            iVar.mo30776r(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public static final void m21304R(C5541l lVar) {
        C13706o.m87929f(lVar, "this$0");
        C5529i iVar = (C5529i) lVar.mo40890k();
        if (iVar != null) {
            iVar.mo30775p();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public static final void m21305S(C5541l lVar, Throwable th) {
        C13706o.m87929f(lVar, "this$0");
        C5529i iVar = (C5529i) lVar.mo40890k();
        if (iVar != null) {
            iVar.mo30774o();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public static final void m21306V(C5541l lVar, Task task) {
        C13706o.m87929f(lVar, "this$0");
        C13706o.m87929f(task, "task");
        if (task.mo23719t()) {
            C15561w1 unused = C15473j.m94492d(lVar, C15186a1.m93730b(), (C15486m0) null, new C5549e(lVar, (C13635d<? super C5549e>) null), 2, (Object) null);
            return;
        }
        C5529i iVar = (C5529i) lVar.mo40890k();
        if (iVar != null) {
            iVar.mo30765M(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public static final void m21307W(C5541l lVar, Exception exc) {
        C13706o.m87929f(lVar, "this$0");
        C13706o.m87929f(exc, "it");
        C5529i iVar = (C5529i) lVar.mo40890k();
        if (iVar != null) {
            iVar.mo30765M(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public static final void m21308X(C5541l lVar, Task task) {
        C13706o.m87929f(lVar, "this$0");
        C13706o.m87929f(task, "task");
        C15561w1 unused = C15473j.m94492d(lVar, C15186a1.m93730b(), (C15486m0) null, new C5551f(task, lVar, (C13635d<? super C5551f>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public static final void m21309Y(C5541l lVar, Exception exc) {
        C13706o.m87929f(lVar, "this$0");
        C13706o.m87929f(exc, "it");
        C5529i iVar = (C5529i) lVar.mo40890k();
        if (iVar != null) {
            iVar.mo30765M(false);
        }
    }

    /* renamed from: G */
    public final void mo30792G(int i, String str) {
        C13706o.m87929f(str, "username");
        C15561w1 unused = C15473j.m94492d(this, (C13640g) null, (C15486m0) null, new C5542a(this, i, str, (C13635d<? super C5542a>) null), 3, (Object) null);
    }

    /* renamed from: P */
    public final void mo30793P(int i, int i2, String str) {
        C13706o.m87929f(str, "reasonText");
        C5529i iVar = (C5529i) mo40890k();
        if (iVar != null) {
            iVar.mo30776r(true);
        }
        C17070a aVar = this.f13506B;
        if (aVar == null) {
            C13706o.m87945v("compositeDisposable");
            aVar = null;
        }
        aVar.mo62358a(C16728b.m99297h(C16728b.m99298n(1500, TimeUnit.MILLISECONDS), this.f13510d.mo41181y(i, this.f13512g.mo30790b().getUserId(), i2, str)).mo79658m(C12318a.m83030b()).mo79655i(C16971a.m100210a()).mo79653d(new C5530a(this)).mo79657k(new C5532c(this), new C5534e(this)));
    }

    /* renamed from: T */
    public final void mo30794T(int i, String str, String str2) {
        C13706o.m87929f(str, "userName");
        C13706o.m87929f(str2, "userImage");
        this.f13514p = i;
        this.f13515s = str;
        this.f13516z = str2;
    }

    /* renamed from: U */
    public final void mo30795U() {
        if (!this.f13511f.mo28009e().mo28008a()) {
            C5529i iVar = (C5529i) mo40890k();
            if (iVar != null) {
                iVar.mo30769d();
            }
        } else if (this.f13512g.mo30790b().isGuest()) {
            C5529i iVar2 = (C5529i) mo40890k();
            if (iVar2 != null) {
                iVar2.mo30777s();
            }
        } else {
            C5529i iVar3 = (C5529i) mo40890k();
            if (iVar3 != null) {
                iVar3.mo30762F1();
            }
            if (!this.f13505A) {
                FirebaseMessaging n = FirebaseMessaging.m76862n();
                n.mo63344H("user-" + this.f13514p).mo23702c(new C5539j(this)).mo23705f(new C5540k(this));
                return;
            }
            FirebaseMessaging n2 = FirebaseMessaging.m76862n();
            n2.mo63347K("user-" + this.f13514p).mo23702c(new C5538i(this)).mo23705f(new C5531b(this));
        }
    }

    /* renamed from: Z */
    public final void mo30796Z(int i) {
        C15561w1 unused = C15473j.m94492d(this, (C13640g) null, (C15486m0) null, new C5554g(this, i, (C13635d<? super C5554g>) null), 3, (Object) null);
    }

    public C13640g getCoroutineContext() {
        return this.f13508D;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo27412l() {
        C17070a aVar = this.f13506B;
        if (aVar == null) {
            C13706o.m87945v("compositeDisposable");
            aVar = null;
        }
        aVar.mo80337d();
        C10180a.m40075a().mo80020p(this);
        C15561w1.C15562a.m94723a(this.f13507C, (CancellationException) null, 1, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo27413m() {
        this.f13506B = new C17070a();
        C10180a.m40075a().mo80019m(this);
        m21297I();
    }

    public final void onEventMainThread(TemplateDeletedEvent templateDeletedEvent) {
        C13706o.m87929f(templateDeletedEvent, NotificationCompat.CATEGORY_EVENT);
        m21297I();
    }

    public final void onEventMainThread(UserBlockedEvent userBlockedEvent) {
        C13706o.m87929f(userBlockedEvent, NotificationCompat.CATEGORY_EVENT);
        if (userBlockedEvent.mo30174a() == this.f13514p) {
            m21297I();
        }
    }
}
