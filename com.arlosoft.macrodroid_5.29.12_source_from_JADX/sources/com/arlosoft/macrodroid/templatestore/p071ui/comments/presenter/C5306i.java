package com.arlosoft.macrodroid.templatestore.p071ui.comments.presenter;

import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.avatar.views.AvatarView;
import com.arlosoft.macrodroid.database.room.C4391d;
import com.arlosoft.macrodroid.database.room.C4393e;
import com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase;
import com.arlosoft.macrodroid.extensions.C4660g;
import com.arlosoft.macrodroid.templatestore.events.UserBlockedEvent;
import com.arlosoft.macrodroid.templatestore.model.Comment;
import com.arlosoft.macrodroid.templatestore.model.MacroTemplate;
import com.arlosoft.macrodroid.templatestore.model.PostCommentBody;
import com.arlosoft.macrodroid.templatestore.model.User;
import com.arlosoft.macrodroid.templatestore.p071ui.comments.C5297i;
import com.arlosoft.macrodroid.templatestore.p071ui.templateList.C5410a;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import com.arlosoft.macrodroid.utils.C6380f1;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15423h2;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.C15573z;
import org.apache.http.cookie.ClientCookie;
import p161s1.C10180a;
import p171u0.C10280a;
import p176v0.C10312a;
import p199z2.C10434a;
import p270ga.C12318a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;
import p414v9.C16728b;
import p414v9.C16730d;
import p440y9.C16971a;
import p448z9.C17070a;
import retrofit2.HttpException;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.comments.presenter.i */
/* compiled from: TemplateCommentsPresenter.kt */
public final class C5306i extends C10280a<C5297i> implements C15478k0 {

    /* renamed from: A */
    private C17070a f13145A;

    /* renamed from: c */
    private final C10312a f13146c;

    /* renamed from: d */
    private final C10434a f13147d;

    /* renamed from: f */
    private final C5527g f13148f;

    /* renamed from: g */
    private final C5410a f13149g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final MacroDroidRoomDatabase f13150o;

    /* renamed from: p */
    private C15573z f13151p;

    /* renamed from: s */
    private C13640g f13152s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public MacroTemplate f13153z;

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.comments.presenter.i$a */
    /* compiled from: TemplateCommentsPresenter.kt */
    static final class C5307a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Comment $comment;
        int label;
        final /* synthetic */ C5306i this$0;

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.comments.presenter.i$a$a */
        /* compiled from: TemplateCommentsPresenter.kt */
        static final class C5308a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            int label;
            final /* synthetic */ C5306i this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5308a(C5306i iVar, C13635d<? super C5308a> dVar) {
                super(2, dVar);
                this.this$0 = iVar;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C5308a(this.this$0, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C5308a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C5297i iVar = (C5297i) this.this$0.mo40890k();
                    if (iVar != null) {
                        MacroTemplate w = this.this$0.f13153z;
                        if (w == null) {
                            C13706o.m87945v("macroTemplate");
                            w = null;
                        }
                        iVar.mo30442O(w);
                    }
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5307a(C5306i iVar, Comment comment, C13635d<? super C5307a> dVar) {
            super(2, dVar);
            this.this$0 = iVar;
            this.$comment = comment;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5307a(this.this$0, this.$comment, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5307a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C4393e d = this.this$0.f13150o.mo28678d();
                C4391d dVar = new C4391d(this.$comment.getUserId(), this.$comment.getUsername());
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
            C10180a.m40075a().mo80018i(new UserBlockedEvent(this.$comment.getUserId()));
            C15423h2 c2 = C15186a1.m93731c();
            C5308a aVar = new C5308a(this.this$0, (C13635d<? super C5308a>) null);
            this.label = 2;
            if (C15414h.m94298g(c2, aVar, this) == c) {
                return c;
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.comments.presenter.i$b */
    /* compiled from: TemplateCommentsPresenter.kt */
    static final class C5309b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Comment $comment;
        int label;
        final /* synthetic */ C5306i this$0;

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.comments.presenter.i$b$a */
        /* compiled from: TemplateCommentsPresenter.kt */
        static final class C5310a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            int label;
            final /* synthetic */ C5306i this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5310a(C5306i iVar, C13635d<? super C5310a> dVar) {
                super(2, dVar);
                this.this$0 = iVar;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C5310a(this.this$0, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C5310a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C5297i iVar = (C5297i) this.this$0.mo40890k();
                    if (iVar != null) {
                        MacroTemplate w = this.this$0.f13153z;
                        if (w == null) {
                            C13706o.m87945v("macroTemplate");
                            w = null;
                        }
                        iVar.mo30442O(w);
                    }
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5309b(C5306i iVar, Comment comment, C13635d<? super C5309b> dVar) {
            super(2, dVar);
            this.this$0 = iVar;
            this.$comment = comment;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5309b(this.this$0, this.$comment, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5309b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C4393e d = this.this$0.f13150o.mo28678d();
                int userId = this.$comment.getUserId();
                this.label = 1;
                if (d.mo28720c(userId, this) == c) {
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
            C10180a.m40075a().mo80018i(new UserBlockedEvent(this.$comment.getUserId()));
            C15423h2 c2 = C15186a1.m93731c();
            C5310a aVar = new C5310a(this.this$0, (C13635d<? super C5310a>) null);
            this.label = 2;
            if (C15414h.m94298g(c2, aVar, this) == c) {
                return c;
            }
            return C13339u.f61331a;
        }
    }

    public C5306i(C10312a aVar, C10434a aVar2, C5527g gVar, C5410a aVar3, MacroDroidRoomDatabase macroDroidRoomDatabase) {
        C13706o.m87929f(aVar, "screenLoader");
        C13706o.m87929f(aVar2, "api");
        C13706o.m87929f(gVar, "userProvider");
        C13706o.m87929f(aVar3, "localTemplateOverrideStore");
        C13706o.m87929f(macroDroidRoomDatabase, "roomDatabase");
        this.f13146c = aVar;
        this.f13147d = aVar2;
        this.f13148f = gVar;
        this.f13149g = aVar3;
        this.f13150o = macroDroidRoomDatabase;
        C15573z b = C15198b2.m93746b((C15561w1) null, 1, (Object) null);
        this.f13151p = b;
        this.f13152s = b.plus(C15186a1.m93730b());
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static final void m20592A(C5306i iVar, Throwable th) {
        C13706o.m87929f(iVar, "this$0");
        boolean z = (th instanceof HttpException) && ((HttpException) th).mo80527a() == 403;
        C5297i iVar2 = (C5297i) iVar.mo40890k();
        if (iVar2 != null) {
            iVar2.mo30441K0(z);
        }
        C5297i iVar3 = (C5297i) iVar.mo40890k();
        if (iVar3 != null) {
            iVar3.mo30454g0(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static final void m20593C(C5306i iVar) {
        C13706o.m87929f(iVar, "this$0");
        C5297i iVar2 = (C5297i) iVar.mo40890k();
        if (iVar2 != null) {
            iVar2.mo30464t();
        }
        C5297i iVar3 = (C5297i) iVar.mo40890k();
        if (iVar3 != null) {
            iVar3.mo30444Z();
        }
        C5297i iVar4 = (C5297i) iVar.mo40890k();
        if (iVar4 != null) {
            iVar4.mo30454g0(true);
        }
        MacroTemplate macroTemplate = iVar.f13153z;
        MacroTemplate macroTemplate2 = null;
        if (macroTemplate == null) {
            C13706o.m87945v("macroTemplate");
            macroTemplate = null;
        }
        MacroTemplate updateCommentCount = macroTemplate.updateCommentCount(false);
        iVar.f13153z = updateCommentCount;
        C5410a aVar = iVar.f13149g;
        if (updateCommentCount == null) {
            C13706o.m87945v("macroTemplate");
            updateCommentCount = null;
        }
        int id = updateCommentCount.getId();
        MacroTemplate macroTemplate3 = iVar.f13153z;
        if (macroTemplate3 == null) {
            C13706o.m87945v("macroTemplate");
        } else {
            macroTemplate2 = macroTemplate3;
        }
        aVar.mo30606a(id, macroTemplate2);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static final void m20594D(C5306i iVar, Throwable th) {
        C13706o.m87929f(iVar, "this$0");
        C5297i iVar2 = (C5297i) iVar.mo40890k();
        if (iVar2 != null) {
            iVar2.mo30445a();
        }
        C5297i iVar3 = (C5297i) iVar.mo40890k();
        if (iVar3 != null) {
            iVar3.mo30454g0(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static final void m20595F(C5306i iVar, List list) {
        C13706o.m87929f(iVar, "this$0");
        C13706o.m87928e(list, "it");
        iVar.f13153z = (MacroTemplate) C13566b0.m87422W(list);
        C5297i iVar2 = (C5297i) iVar.mo40890k();
        if (iVar2 != null) {
            MacroTemplate macroTemplate = iVar.f13153z;
            if (macroTemplate == null) {
                C13706o.m87945v("macroTemplate");
                macroTemplate = null;
            }
            iVar2.mo30442O(macroTemplate);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static final void m20596G(C5306i iVar, Throwable th) {
        C13706o.m87929f(iVar, "this$0");
        C5297i iVar2 = (C5297i) iVar.mo40890k();
        if (iVar2 != null) {
            iVar2.mo30450e1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public static final void m20597Q(C5306i iVar) {
        C13706o.m87929f(iVar, "this$0");
        C5297i iVar2 = (C5297i) iVar.mo40890k();
        if (iVar2 != null) {
            iVar2.mo30467y1();
        }
        C5297i iVar3 = (C5297i) iVar.mo40890k();
        if (iVar3 != null) {
            iVar3.mo30444Z();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public static final void m20598R(C5306i iVar, Throwable th) {
        C13706o.m87929f(iVar, "this$0");
        boolean z = (th instanceof HttpException) && ((HttpException) th).mo80527a() == 403;
        C5297i iVar2 = (C5297i) iVar.mo40890k();
        if (iVar2 != null) {
            iVar2.mo30441K0(z);
        }
        C5297i iVar3 = (C5297i) iVar.mo40890k();
        if (iVar3 != null) {
            iVar3.mo30460k1(true);
        }
        C5297i iVar4 = (C5297i) iVar.mo40890k();
        if (iVar4 != null) {
            iVar4.mo30457i1(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static final void m20609z(C5306i iVar) {
        C13706o.m87929f(iVar, "this$0");
        C5297i iVar2 = (C5297i) iVar.mo40890k();
        if (iVar2 != null) {
            iVar2.mo30464t();
        }
        C5297i iVar3 = (C5297i) iVar.mo40890k();
        if (iVar3 != null) {
            iVar3.mo30444Z();
        }
        C5297i iVar4 = (C5297i) iVar.mo40890k();
        if (iVar4 != null) {
            iVar4.mo30454g0(true);
        }
        MacroTemplate macroTemplate = iVar.f13153z;
        MacroTemplate macroTemplate2 = null;
        if (macroTemplate == null) {
            C13706o.m87945v("macroTemplate");
            macroTemplate = null;
        }
        MacroTemplate updateCommentCount = macroTemplate.updateCommentCount(true);
        iVar.f13153z = updateCommentCount;
        C5410a aVar = iVar.f13149g;
        if (updateCommentCount == null) {
            C13706o.m87945v("macroTemplate");
            updateCommentCount = null;
        }
        int id = updateCommentCount.getId();
        MacroTemplate macroTemplate3 = iVar.f13153z;
        if (macroTemplate3 == null) {
            C13706o.m87945v("macroTemplate");
        } else {
            macroTemplate2 = macroTemplate3;
        }
        aVar.mo30606a(id, macroTemplate2);
    }

    /* renamed from: B */
    public final void mo30485B(Comment comment) {
        C13706o.m87929f(comment, ClientCookie.COMMENT_ATTR);
        String g = C4660g.m18129g(comment.getId() + "adb97ac6-f780-4a41-8475-ce661b574999" + comment.getMacroId());
        C17070a aVar = this.f13145A;
        if (aVar == null) {
            C13706o.m87945v("compositeDisposable");
            aVar = null;
        }
        aVar.mo62358a(this.f13147d.mo41157a(g, comment.getId(), comment.getMacroId()).mo79658m(C12318a.m83030b()).mo79655i(C16971a.m100210a()).mo79657k(new C5298a(this), new C5304g(this)));
    }

    /* renamed from: E */
    public final void mo30486E(int i) {
        User b = this.f13148f.mo30790b();
        String a = C6380f1.f14971a.mo32421a(MacroDroidApplication.f9883I.mo27303b());
        String g = C4660g.m18129g(b.getUserId() + "adb97ac6-f780-4a41-8475-ce661b574999" + a + "0");
        C17070a aVar = this.f13145A;
        if (aVar == null) {
            C13706o.m87945v("compositeDisposable");
            aVar = null;
        }
        C10434a aVar2 = this.f13147d;
        int userId = b.getUserId();
        aVar.mo62358a(aVar2.mo41160d(g, 0, userId, 0, 0, 1, 0, "id=" + i, "en").mo79730q(C12318a.m83030b()).mo79726l(C16971a.m100210a()).mo79729o(new C5305h(this), new C5303f(this)));
    }

    /* renamed from: H */
    public final void mo30487H(Comment comment) {
        C13706o.m87929f(comment, ClientCookie.COMMENT_ATTR);
        C15561w1 unused = C15473j.m94492d(this, (C13640g) null, (C15486m0) null, new C5307a(this, comment, (C13635d<? super C5307a>) null), 3, (Object) null);
    }

    /* renamed from: I */
    public final void mo30488I(Comment comment) {
        C5297i iVar;
        C13706o.m87929f(comment, ClientCookie.COMMENT_ATTR);
        if (comment.getUserId() == this.f13148f.mo30790b().getUserId() && (iVar = (C5297i) mo40890k()) != null) {
            iVar.mo30452f(comment);
        }
    }

    /* renamed from: J */
    public final void mo30489J(Comment comment) {
        C13706o.m87929f(comment, ClientCookie.COMMENT_ATTR);
        C5297i iVar = (C5297i) mo40890k();
        if (iVar != null) {
            iVar.mo30466x1(comment);
        }
    }

    /* renamed from: K */
    public final void mo30490K(Comment comment) {
        C13706o.m87929f(comment, ClientCookie.COMMENT_ATTR);
        C15561w1 unused = C15473j.m94492d(this, (C13640g) null, (C15486m0) null, new C5309b(this, comment, (C13635d<? super C5309b>) null), 3, (Object) null);
    }

    /* renamed from: M */
    public final void mo30491M() {
        this.f13146c.mo40935j();
    }

    /* renamed from: N */
    public final void mo30492N(Comment comment) {
        C13706o.m87929f(comment, ClientCookie.COMMENT_ATTR);
        C10312a.m40505l(this.f13146c, comment.getUsername(), comment.getUserImage(), comment.getUserId(), (AvatarView) null, 8, (Object) null);
    }

    /* renamed from: O */
    public final void mo30493O(MacroTemplate macroTemplate) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        this.f13153z = macroTemplate;
    }

    /* renamed from: P */
    public final void mo30494P(Comment comment, String str) {
        C13706o.m87929f(comment, ClientCookie.COMMENT_ATTR);
        C13706o.m87929f(str, "newCommentText");
        if (C13706o.m87924a(comment.getText(), str)) {
            C5297i iVar = (C5297i) mo40890k();
            if (iVar != null) {
                iVar.mo30467y1();
                return;
            }
            return;
        }
        if (!(str.length() == 0)) {
            String g = C4660g.m18129g(comment.getId() + "adb97ac6-f780-4a41-8475-ce661b574999" + str);
            C17070a aVar = this.f13145A;
            if (aVar == null) {
                C13706o.m87945v("compositeDisposable");
                aVar = null;
            }
            aVar.mo62358a(C16728b.m99297h(C16728b.m99298n(2, TimeUnit.SECONDS), this.f13147d.mo41158b(g, this.f13148f.mo30790b().getUserId(), comment.getId(), str)).mo79658m(C12318a.m83030b()).mo79655i(C16971a.m100210a()).mo79657k(new C5299b(this), new C5302e(this)));
            C5297i iVar2 = (C5297i) mo40890k();
            if (iVar2 != null) {
                iVar2.mo30457i1(true);
            }
            C5297i iVar3 = (C5297i) mo40890k();
            if (iVar3 != null) {
                iVar3.mo30460k1(false);
            }
        }
    }

    public C13640g getCoroutineContext() {
        return this.f13152s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo27412l() {
        C17070a aVar = this.f13145A;
        if (aVar != null) {
            if (aVar == null) {
                C13706o.m87945v("compositeDisposable");
                aVar = null;
            }
            aVar.mo80337d();
        }
        C15561w1.C15562a.m94723a(this.f13151p, (CancellationException) null, 1, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo27413m() {
        this.f13145A = new C17070a();
    }

    /* renamed from: y */
    public final void mo30495y(String str) {
        C13706o.m87929f(str, "commentText");
        if (!(str.length() == 0)) {
            StringBuilder sb = new StringBuilder();
            MacroTemplate macroTemplate = this.f13153z;
            MacroTemplate macroTemplate2 = null;
            if (macroTemplate == null) {
                C13706o.m87945v("macroTemplate");
                macroTemplate = null;
            }
            sb.append(macroTemplate.getId());
            sb.append("adb97ac6-f780-4a41-8475-ce661b574999");
            sb.append(this.f13148f.mo30790b().getUserId());
            sb.append(str);
            String g = C4660g.m18129g(sb.toString());
            C17070a aVar = this.f13145A;
            if (aVar == null) {
                C13706o.m87945v("compositeDisposable");
                aVar = null;
            }
            C16730d[] dVarArr = new C16730d[2];
            dVarArr[0] = C16728b.m99298n(2, TimeUnit.SECONDS);
            C10434a aVar2 = this.f13147d;
            int userId = this.f13148f.mo30790b().getUserId();
            MacroTemplate macroTemplate3 = this.f13153z;
            if (macroTemplate3 == null) {
                C13706o.m87945v("macroTemplate");
            } else {
                macroTemplate2 = macroTemplate3;
            }
            dVarArr[1] = aVar2.mo41163g(g, new PostCommentBody(userId, macroTemplate2.getId(), str));
            aVar.mo62358a(C16728b.m99297h(dVarArr).mo79658m(C12318a.m83030b()).mo79655i(C16971a.m100210a()).mo79657k(new C5300c(this), new C5301d(this)));
            C5297i iVar = (C5297i) mo40890k();
            if (iVar != null) {
                iVar.mo30465v0();
            }
            C5297i iVar2 = (C5297i) mo40890k();
            if (iVar2 != null) {
                iVar2.mo30454g0(false);
            }
        }
    }
}
