package com.arlosoft.macrodroid.templatestore.p071ui.comments;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.arlosoft.macrodroid.C17523R$anim;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.avatar.views.AvatarView;
import com.arlosoft.macrodroid.comments.C3975c;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.database.room.C4391d;
import com.arlosoft.macrodroid.database.room.C4393e;
import com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.templatestore.model.Comment;
import com.arlosoft.macrodroid.templatestore.model.MacroTemplate;
import com.arlosoft.macrodroid.templatestore.model.User;
import com.arlosoft.macrodroid.templatestore.p071ui.comments.presenter.C5306i;
import com.arlosoft.macrodroid.templatestore.p071ui.profile.C5331h;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import com.google.android.material.snackbar.SnackbarAnimate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15423h2;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import org.apache.http.cookie.ClientCookie;
import p058a3.C2229c;
import p082e3.C7267j;
import p199z2.C10434a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.comments.TemplateCommentsActivity */
/* compiled from: TemplateCommentsActivity.kt */
public final class TemplateCommentsActivity extends MacroDroidDaggerBaseActivity implements C5297i {

    /* renamed from: N */
    public static final C5277a f13109N = new C5277a((C13695i) null);

    /* renamed from: A */
    public C5331h f13110A;

    /* renamed from: B */
    public C5527g f13111B;

    /* renamed from: C */
    public C4083b f13112C;

    /* renamed from: D */
    public C5295g f13113D;

    /* renamed from: E */
    public MacroDroidRoomDatabase f13114E;

    /* renamed from: F */
    public C3975c f13115F;

    /* renamed from: G */
    public C7267j f13116G;

    /* renamed from: H */
    public MacroTemplate f13117H;

    /* renamed from: I */
    private AppCompatDialog f13118I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public LinearLayoutManager f13119J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public int f13120K = -1;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public final C5279c f13121L = new C5279c(this);

    /* renamed from: M */
    public Map<Integer, View> f13122M = new LinkedHashMap();

    /* renamed from: s */
    public C10434a f13123s;

    /* renamed from: z */
    public C5306i f13124z;

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.comments.TemplateCommentsActivity$a */
    /* compiled from: TemplateCommentsActivity.kt */
    public static final class C5277a {
        private C5277a() {
        }

        public /* synthetic */ C5277a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final Intent mo30468a(Context context) {
            C13706o.m87929f(context, "context");
            return new Intent(context, TemplateCommentsActivity.class);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.comments.TemplateCommentsActivity$b */
    /* compiled from: TemplateCommentsActivity.kt */
    static final class C5278b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ int $idToClear;
        int label;
        final /* synthetic */ TemplateCommentsActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5278b(TemplateCommentsActivity templateCommentsActivity, int i, C13635d<? super C5278b> dVar) {
            super(2, dVar);
            this.this$0 = templateCommentsActivity;
            this.$idToClear = i;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5278b(this.this$0, this.$idToClear, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5278b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                this.label = 1;
                if (this.this$0.mo30456h2().mo28680f().mo28766a((long) this.$idToClear, this) == c) {
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

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.comments.TemplateCommentsActivity$c */
    /* compiled from: TemplateCommentsActivity.kt */
    public static final class C5279c extends RecyclerView.AdapterDataObserver {

        /* renamed from: a */
        final /* synthetic */ TemplateCommentsActivity f13125a;

        C5279c(TemplateCommentsActivity templateCommentsActivity) {
            this.f13125a = templateCommentsActivity;
        }

        public void onItemRangeInserted(int i, int i2) {
            if (i == 0) {
                LinearLayoutManager V1 = this.f13125a.f13119J;
                if (V1 == null) {
                    C13706o.m87945v("layoutManager");
                    V1 = null;
                }
                V1.scrollToPositionWithOffset(0, 0);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.comments.TemplateCommentsActivity$d */
    /* compiled from: TemplateCommentsActivity.kt */
    static final class C5280d extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Comment $comment;
        final /* synthetic */ EditText $commentText;
        int label;
        final /* synthetic */ TemplateCommentsActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5280d(TemplateCommentsActivity templateCommentsActivity, Comment comment, EditText editText, C13635d<? super C5280d> dVar) {
            super(3, dVar);
            this.this$0 = templateCommentsActivity;
            this.$comment = comment;
            this.$commentText = editText;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5280d(this.this$0, this.$comment, this.$commentText, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C5306i f2 = this.this$0.mo30453f2();
                Comment comment = this.$comment;
                EditText editText = this.$commentText;
                f2.mo30494P(comment, String.valueOf(editText != null ? editText.getText() : null));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.comments.TemplateCommentsActivity$e */
    /* compiled from: TemplateCommentsActivity.kt */
    static final class C5281e extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ TemplateCommentsActivity this$0;

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.comments.TemplateCommentsActivity$e$a */
        /* compiled from: TemplateCommentsActivity.kt */
        static final class C5282a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ List<C4391d> $blockedUsers;
            int label;
            final /* synthetic */ TemplateCommentsActivity this$0;

            /* renamed from: com.arlosoft.macrodroid.templatestore.ui.comments.TemplateCommentsActivity$e$a$a */
            /* compiled from: TemplateCommentsActivity.kt */
            static final class C5283a extends C13708q implements C16265l<Comment, C13339u> {
                final /* synthetic */ TemplateCommentsActivity this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C5283a(TemplateCommentsActivity templateCommentsActivity) {
                    super(1);
                    this.this$0 = templateCommentsActivity;
                }

                /* renamed from: a */
                public final void mo30473a(Comment comment) {
                    C13706o.m87929f(comment, "it");
                    this.this$0.mo30453f2().mo30488I(comment);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo30473a((Comment) obj);
                    return C13339u.f61331a;
                }
            }

            /* renamed from: com.arlosoft.macrodroid.templatestore.ui.comments.TemplateCommentsActivity$e$a$b */
            /* compiled from: TemplateCommentsActivity.kt */
            static final class C5284b extends C13708q implements C16265l<Comment, C13339u> {
                final /* synthetic */ TemplateCommentsActivity this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C5284b(TemplateCommentsActivity templateCommentsActivity) {
                    super(1);
                    this.this$0 = templateCommentsActivity;
                }

                /* renamed from: a */
                public final void mo30474a(Comment comment) {
                    C13706o.m87929f(comment, "it");
                    this.this$0.mo30453f2().mo30492N(comment);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo30474a((Comment) obj);
                    return C13339u.f61331a;
                }
            }

            /* renamed from: com.arlosoft.macrodroid.templatestore.ui.comments.TemplateCommentsActivity$e$a$c */
            /* compiled from: TemplateCommentsActivity.kt */
            static final class C5285c extends C13708q implements C16269p<Comment, Boolean, C13339u> {
                final /* synthetic */ TemplateCommentsActivity this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C5285c(TemplateCommentsActivity templateCommentsActivity) {
                    super(2);
                    this.this$0 = templateCommentsActivity;
                }

                /* renamed from: a */
                public final void mo30475a(Comment comment, boolean z) {
                    C13706o.m87929f(comment, ClientCookie.COMMENT_ATTR);
                    this.this$0.m20522o2(comment, z);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    mo30475a((Comment) obj, ((Boolean) obj2).booleanValue());
                    return C13339u.f61331a;
                }
            }

            /* renamed from: com.arlosoft.macrodroid.templatestore.ui.comments.TemplateCommentsActivity$e$a$d */
            /* compiled from: TemplateCommentsActivity.kt */
            static final class C5286d extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
                int label;
                final /* synthetic */ TemplateCommentsActivity this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C5286d(TemplateCommentsActivity templateCommentsActivity, C13635d<? super C5286d> dVar) {
                    super(3, dVar);
                    this.this$0 = templateCommentsActivity;
                }

                /* renamed from: h */
                public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                    return new C5286d(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object unused = C13652d.m87832c();
                    if (this.label == 0) {
                        C13332o.m85685b(obj);
                        this.this$0.mo30453f2().mo30491M();
                        return C13339u.f61331a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* renamed from: com.arlosoft.macrodroid.templatestore.ui.comments.TemplateCommentsActivity$e$a$e */
            /* compiled from: TemplateCommentsActivity.kt */
            static final class C5287e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
                int label;
                final /* synthetic */ TemplateCommentsActivity this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C5287e(TemplateCommentsActivity templateCommentsActivity, C13635d<? super C5287e> dVar) {
                    super(3, dVar);
                    this.this$0 = templateCommentsActivity;
                }

                /* renamed from: h */
                public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                    return new C5287e(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object unused = C13652d.m87832c();
                    if (this.label == 0) {
                        C13332o.m85685b(obj);
                        C5163j2.m20095X5(this.this$0, (User) null);
                        Intent intent = new Intent();
                        intent.putExtra("sign_in", true);
                        this.this$0.setResult(-1, intent);
                        this.this$0.finish();
                        return C13339u.f61331a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5282a(TemplateCommentsActivity templateCommentsActivity, List<C4391d> list, C13635d<? super C5282a> dVar) {
                super(2, dVar);
                this.this$0 = templateCommentsActivity;
                this.$blockedUsers = list;
            }

            /* access modifiers changed from: private */
            /* renamed from: u */
            public static final void m20558u(TemplateCommentsActivity templateCommentsActivity, PagedList pagedList) {
                templateCommentsActivity.mo30446a2().submitList(pagedList);
            }

            /* access modifiers changed from: private */
            /* renamed from: v */
            public static final void m20559v(TemplateCommentsActivity templateCommentsActivity, C2229c cVar) {
                int i = 0;
                if (cVar == C2229c.LOADING) {
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) templateCommentsActivity.mo30443T1(C17532R$id.loadingView);
                    C13706o.m87928e(lottieAnimationView, "loadingView");
                    lottieAnimationView.setVisibility(0);
                    TextView textView = (TextView) templateCommentsActivity.mo30443T1(C17532R$id.noCommentsLabel);
                    C13706o.m87928e(textView, "noCommentsLabel");
                    textView.setVisibility(8);
                    return;
                }
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) templateCommentsActivity.mo30443T1(C17532R$id.loadingView);
                C13706o.m87928e(lottieAnimationView2, "loadingView");
                lottieAnimationView2.setVisibility(8);
                TextView textView2 = (TextView) templateCommentsActivity.mo30443T1(C17532R$id.noCommentsLabel);
                C13706o.m87928e(textView2, "noCommentsLabel");
                if (!(cVar == C2229c.EMPTY)) {
                    i = 8;
                }
                textView2.setVisibility(i);
            }

            /* access modifiers changed from: private */
            /* renamed from: w */
            public static final void m20560w(TemplateCommentsActivity templateCommentsActivity, View view) {
                templateCommentsActivity.mo30453f2().mo30495y(String.valueOf(((AppCompatEditText) templateCommentsActivity.mo30443T1(C17532R$id.commentText)).getText()));
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C5282a(this.this$0, this.$blockedUsers, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C5282a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    TemplateCommentsActivity templateCommentsActivity = this.this$0;
                    templateCommentsActivity.mo30461l2(new C3975c(templateCommentsActivity.mo30449d2(), new C5283a(this.this$0), new C5284b(this.this$0), new C5285c(this.this$0), this.this$0.mo30459j2().mo30790b(), this.this$0.mo30455g2(), this.$blockedUsers));
                    LiveData<PagedList<Comment>> g = this.this$0.mo30448c2().mo37137g();
                    TemplateCommentsActivity templateCommentsActivity2 = this.this$0;
                    g.observe(templateCommentsActivity2, new C5292d(templateCommentsActivity2));
                    LiveData<C2229c> h = this.this$0.mo30448c2().mo37138h();
                    TemplateCommentsActivity templateCommentsActivity3 = this.this$0;
                    h.observe(templateCommentsActivity3, new C5293e(templateCommentsActivity3));
                    TemplateCommentsActivity templateCommentsActivity4 = this.this$0;
                    templateCommentsActivity4.f13119J = new LinearLayoutManager(templateCommentsActivity4);
                    LinearLayoutManager V1 = this.this$0.f13119J;
                    if (V1 == null) {
                        C13706o.m87945v("layoutManager");
                        V1 = null;
                    }
                    V1.setReverseLayout(true);
                    LinearLayoutManager V12 = this.this$0.f13119J;
                    if (V12 == null) {
                        C13706o.m87945v("layoutManager");
                        V12 = null;
                    }
                    V12.setStackFromEnd(true);
                    TemplateCommentsActivity templateCommentsActivity5 = this.this$0;
                    int i = C17532R$id.recyclerView;
                    ((RecyclerView) templateCommentsActivity5.mo30443T1(i)).setAdapter(this.this$0.mo30446a2());
                    RecyclerView recyclerView = (RecyclerView) this.this$0.mo30443T1(i);
                    LinearLayoutManager V13 = this.this$0.f13119J;
                    if (V13 == null) {
                        C13706o.m87945v("layoutManager");
                        V13 = null;
                    }
                    recyclerView.setLayoutManager(V13);
                    this.this$0.mo30446a2().registerAdapterDataObserver(this.this$0.f13121L);
                    ((TextView) this.this$0.mo30443T1(C17532R$id.userName)).setText(this.this$0.mo30449d2().getUsername());
                    ((ImageView) this.this$0.mo30443T1(C17532R$id.addCommentButton)).setOnClickListener(new C5291c(this.this$0));
                    this.this$0.mo30453f2().mo30493O(this.this$0.mo30449d2());
                    if (!this.this$0.mo30451e2().mo28009e().mo28008a()) {
                        LinearLayout linearLayout = (LinearLayout) this.this$0.mo30443T1(C17532R$id.addCommentLayout);
                        C13706o.m87928e(linearLayout, "addCommentLayout");
                        linearLayout.setVisibility(8);
                        TemplateCommentsActivity templateCommentsActivity6 = this.this$0;
                        int i2 = C17532R$id.proVersionText;
                        TextView textView = (TextView) templateCommentsActivity6.mo30443T1(i2);
                        C13706o.m87928e(textView, "proVersionText");
                        textView.setVisibility(0);
                        TextView textView2 = (TextView) this.this$0.mo30443T1(i2);
                        C13706o.m87928e(textView2, "proVersionText");
                        C4666m.m18147o(textView2, (C13640g) null, new C5286d(this.this$0, (C13635d<? super C5286d>) null), 1, (Object) null);
                    } else if (this.this$0.mo30459j2().mo30790b().isGuest()) {
                        LinearLayout linearLayout2 = (LinearLayout) this.this$0.mo30443T1(C17532R$id.addCommentLayout);
                        C13706o.m87928e(linearLayout2, "addCommentLayout");
                        linearLayout2.setVisibility(8);
                        TemplateCommentsActivity templateCommentsActivity7 = this.this$0;
                        int i3 = C17532R$id.proVersionText;
                        TextView textView3 = (TextView) templateCommentsActivity7.mo30443T1(i3);
                        C13706o.m87928e(textView3, "proVersionText");
                        textView3.setVisibility(0);
                        TextView textView4 = (TextView) this.this$0.mo30443T1(i3);
                        C13706o.m87928e(textView4, "proVersionText");
                        C4666m.m18147o(textView4, (C13640g) null, new C5287e(this.this$0, (C13635d<? super C5287e>) null), 1, (Object) null);
                        ((TextView) this.this$0.mo30443T1(i3)).setText(this.this$0.getString(C17541R$string.comments_signed_in_users_only));
                    }
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5281e(TemplateCommentsActivity templateCommentsActivity, C13635d<? super C5281e> dVar) {
            super(2, dVar);
            this.this$0 = templateCommentsActivity;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5281e(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5281e) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C4393e d = this.this$0.mo30456h2().mo28678d();
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
            C15423h2 c2 = C15186a1.m93731c();
            C5282a aVar = new C5282a(this.this$0, (List) obj, (C13635d<? super C5282a>) null);
            this.label = 2;
            if (C15414h.m94298g(c2, aVar, this) == c) {
                return c;
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.comments.TemplateCommentsActivity$f */
    /* compiled from: TemplateCommentsActivity.kt */
    static final class C5288f extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ TemplateCommentsActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5288f(TemplateCommentsActivity templateCommentsActivity, C13635d<? super C5288f> dVar) {
            super(3, dVar);
            this.this$0 = templateCommentsActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5288f(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                LinearLayout linearLayout = (LinearLayout) this.this$0.mo30443T1(C17532R$id.errorView);
                C13706o.m87928e(linearLayout, "errorView");
                linearLayout.setVisibility(8);
                this.this$0.mo30453f2().mo30486E(this.this$0.f13120K);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: Z1 */
    private final void m20520Z1(int i) {
        C15561w1 unused = C15473j.m94492d(LifecycleOwnerKt.getLifecycleScope(this), C15186a1.m93730b(), (C15486m0) null, new C5278b(this, i, (C13635d<? super C5278b>) null), 2, (Object) null);
    }

    /* renamed from: k2 */
    private final void m20521k2(MacroTemplate macroTemplate) {
        String str;
        mo30463n2(macroTemplate);
        TextView textView = (TextView) mo30443T1(C17532R$id.macroNameText);
        if (mo30449d2().getUseTranslatedText()) {
            str = mo30449d2().getNameTranslated();
            if (str == null) {
                str = mo30449d2().getName();
            }
        } else {
            str = mo30449d2().getName();
        }
        textView.setText(str);
        C5331h g2 = mo30455g2();
        AvatarView avatarView = (AvatarView) mo30443T1(C17532R$id.avatarImage);
        C13706o.m87928e(avatarView, "avatarImage");
        g2.mo30528b(avatarView, mo30449d2().getUserImage(), mo30449d2().getUsername());
        mo30462m2(new C7267j(mo30447b2(), mo30449d2().getId()));
        C15561w1 unused = C15473j.m94492d(LifecycleOwnerKt.getLifecycleScope(this), C15186a1.m93730b(), (C15486m0) null, new C5281e(this, (C13635d<? super C5281e>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final void m20522o2(Comment comment, boolean z) {
        String[] strArr = new String[1];
        strArr[0] = getString(z ? C17541R$string.template_store_unblock_user : C17541R$string.template_store_block_user);
        new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog_Template).setTitle((int) C17541R$string.select_option).setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C5290b(strArr, this, comment)).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m20523p2(String[] strArr, TemplateCommentsActivity templateCommentsActivity, Comment comment, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(strArr, "$options");
        C13706o.m87929f(templateCommentsActivity, "this$0");
        C13706o.m87929f(comment, "$comment");
        String str = strArr[i];
        C13706o.m87928e(str, "options[index]");
        if (C13706o.m87924a(str, templateCommentsActivity.getString(C17541R$string.template_store_block_user))) {
            templateCommentsActivity.mo30453f2().mo30487H(comment);
        } else if (C13706o.m87924a(str, templateCommentsActivity.getString(C17541R$string.template_store_unblock_user))) {
            templateCommentsActivity.mo30453f2().mo30490K(comment);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static final void m20524q2(String[] strArr, TemplateCommentsActivity templateCommentsActivity, Comment comment, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(strArr, "$options");
        C13706o.m87929f(templateCommentsActivity, "this$0");
        C13706o.m87929f(comment, "$comment");
        String str = strArr[i];
        C13706o.m87928e(str, "options[index]");
        if (C13706o.m87924a(str, templateCommentsActivity.getString(C17541R$string.edit_comment))) {
            templateCommentsActivity.mo30453f2().mo30489J(comment);
        } else if (C13706o.m87924a(str, templateCommentsActivity.getString(C17541R$string.delete))) {
            templateCommentsActivity.mo30453f2().mo30485B(comment);
        }
    }

    /* renamed from: r2 */
    private final void m20525r2(String str) {
        LinearLayout linearLayout = (LinearLayout) mo30443T1(C17532R$id.uploadingLayout);
        C13706o.m87928e(linearLayout, "uploadingLayout");
        linearLayout.setVisibility(8);
        SnackbarAnimate i = SnackbarAnimate.m69574i(findViewById(C17532R$id.coordinatorLayout), str, 0);
        C13706o.m87928e(i, "make(findViewById(R.id.c…ckbarAnimate.LENGTH_LONG)");
        i.mo58921e().setBackgroundResource(C17528R$color.snack_bar_error);
        View findViewById = i.mo58921e().findViewById(2131363815);
        C13706o.m87927d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setTextColor(-1);
        i.mo58932r();
    }

    /* renamed from: K0 */
    public void mo30441K0(boolean z) {
        String string = getString(z ? C17541R$string.not_allowed_to_post_comment : C17541R$string.upload_failed);
        C13706o.m87928e(string, "getString(if (notAllowed…e R.string.upload_failed)");
        m20525r2(string);
    }

    /* renamed from: O */
    public void mo30442O(MacroTemplate macroTemplate) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        m20521k2(macroTemplate);
    }

    /* renamed from: T1 */
    public View mo30443T1(int i) {
        Map<Integer, View> map = this.f13122M;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: Z */
    public void mo30444Z() {
        DataSource dataSource;
        PagedList currentList = mo30446a2().getCurrentList();
        if (!(currentList == null || (dataSource = currentList.getDataSource()) == null)) {
            dataSource.invalidate();
        }
        LinearLayout linearLayout = (LinearLayout) mo30443T1(C17532R$id.uploadingLayout);
        C13706o.m87928e(linearLayout, "uploadingLayout");
        linearLayout.setVisibility(8);
    }

    /* renamed from: a */
    public void mo30445a() {
        String string = getString(C17541R$string.delete_failed);
        C13706o.m87928e(string, "getString(R.string.delete_failed)");
        m20525r2(string);
    }

    /* renamed from: a2 */
    public final C3975c mo30446a2() {
        C3975c cVar = this.f13115F;
        if (cVar != null) {
            return cVar;
        }
        C13706o.m87945v("adapter");
        return null;
    }

    /* renamed from: b2 */
    public final C10434a mo30447b2() {
        C10434a aVar = this.f13123s;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("api");
        return null;
    }

    /* renamed from: c2 */
    public final C7267j mo30448c2() {
        C7267j jVar = this.f13116G;
        if (jVar != null) {
            return jVar;
        }
        C13706o.m87945v("commentsViewModel");
        return null;
    }

    /* renamed from: d2 */
    public final MacroTemplate mo30449d2() {
        MacroTemplate macroTemplate = this.f13117H;
        if (macroTemplate != null) {
            return macroTemplate;
        }
        C13706o.m87945v("macroTemplate");
        return null;
    }

    /* renamed from: e1 */
    public void mo30450e1() {
        LinearLayout linearLayout = (LinearLayout) mo30443T1(C17532R$id.errorView);
        C13706o.m87928e(linearLayout, "errorView");
        linearLayout.setVisibility(0);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) mo30443T1(C17532R$id.loadingView);
        C13706o.m87928e(lottieAnimationView, "loadingView");
        lottieAnimationView.setVisibility(8);
        AppCompatButton appCompatButton = (AppCompatButton) mo30443T1(C17532R$id.retryButton);
        C13706o.m87928e(appCompatButton, "retryButton");
        C4666m.m18147o(appCompatButton, (C13640g) null, new C5288f(this, (C13635d<? super C5288f>) null), 1, (Object) null);
    }

    /* renamed from: e2 */
    public final C4083b mo30451e2() {
        C4083b bVar = this.f13112C;
        if (bVar != null) {
            return bVar;
        }
        C13706o.m87945v("premiumStatusHandler");
        return null;
    }

    /* renamed from: f */
    public void mo30452f(Comment comment) {
        C13706o.m87929f(comment, ClientCookie.COMMENT_ATTR);
        String[] strArr = {getString(C17541R$string.edit_comment), getString(C17541R$string.delete)};
        new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog_Template).setTitle((int) C17541R$string.select_option).setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C5289a(strArr, this, comment)).show();
    }

    /* renamed from: f2 */
    public final C5306i mo30453f2() {
        C5306i iVar = this.f13124z;
        if (iVar != null) {
            return iVar;
        }
        C13706o.m87945v("presenter");
        return null;
    }

    /* renamed from: g0 */
    public void mo30454g0(boolean z) {
        int i = C17532R$id.commentText;
        ((AppCompatEditText) mo30443T1(i)).setEnabled(z);
        float f = 1.0f;
        ((AppCompatEditText) mo30443T1(i)).setAlpha(z ? 1.0f : 0.5f);
        int i2 = C17532R$id.addCommentButton;
        ((ImageView) mo30443T1(i2)).setEnabled(z);
        ImageView imageView = (ImageView) mo30443T1(i2);
        if (!z) {
            f = 0.5f;
        }
        imageView.setAlpha(f);
    }

    /* renamed from: g2 */
    public final C5331h mo30455g2() {
        C5331h hVar = this.f13110A;
        if (hVar != null) {
            return hVar;
        }
        C13706o.m87945v("profileImageProvider");
        return null;
    }

    /* renamed from: h2 */
    public final MacroDroidRoomDatabase mo30456h2() {
        MacroDroidRoomDatabase macroDroidRoomDatabase = this.f13114E;
        if (macroDroidRoomDatabase != null) {
            return macroDroidRoomDatabase;
        }
        C13706o.m87945v("roomDatabase");
        return null;
    }

    /* renamed from: i1 */
    public void mo30457i1(boolean z) {
        AppCompatDialog appCompatDialog = this.f13118I;
        View findViewById = appCompatDialog != null ? appCompatDialog.findViewById(C17532R$id.uploadingLayout) : null;
        if (findViewById != null) {
            findViewById.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: i2 */
    public final C5295g mo30458i2() {
        C5295g gVar = this.f13113D;
        if (gVar != null) {
            return gVar;
        }
        C13706o.m87945v("templateCommentsDataRepository");
        return null;
    }

    /* renamed from: j2 */
    public final C5527g mo30459j2() {
        C5527g gVar = this.f13111B;
        if (gVar != null) {
            return gVar;
        }
        C13706o.m87945v("userProvider");
        return null;
    }

    /* renamed from: k1 */
    public void mo30460k1(boolean z) {
        AppCompatDialog appCompatDialog = this.f13118I;
        View view = null;
        View findViewById = appCompatDialog != null ? appCompatDialog.findViewById(C17532R$id.commentText) : null;
        AppCompatDialog appCompatDialog2 = this.f13118I;
        if (appCompatDialog2 != null) {
            view = appCompatDialog2.findViewById(C17532R$id.updateCommentButton);
        }
        if (findViewById != null) {
            findViewById.setEnabled(z);
        }
        float f = 1.0f;
        if (findViewById != null) {
            findViewById.setAlpha(z ? 1.0f : 0.5f);
        }
        if (view != null) {
            view.setEnabled(z);
        }
        if (view != null) {
            if (!z) {
                f = 0.5f;
            }
            view.setAlpha(f);
        }
    }

    /* renamed from: l2 */
    public final void mo30461l2(C3975c cVar) {
        C13706o.m87929f(cVar, "<set-?>");
        this.f13115F = cVar;
    }

    /* renamed from: m2 */
    public final void mo30462m2(C7267j jVar) {
        C13706o.m87929f(jVar, "<set-?>");
        this.f13116G = jVar;
    }

    /* renamed from: n2 */
    public final void mo30463n2(MacroTemplate macroTemplate) {
        C13706o.m87929f(macroTemplate, "<set-?>");
        this.f13117H = macroTemplate;
    }

    public void onBackPressed() {
        finish();
        overridePendingTransition(0, C17523R$anim.out_to_bottom);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.activity_template_comments);
        mo30453f2().mo40891n(this);
        MacroTemplate a = mo30458i2().mo30482a();
        if (a == null) {
            int intExtra = getIntent().getIntExtra("macro_id", -1);
            this.f13120K = intExtra;
            if (intExtra != 0) {
                ((LinearLayout) mo30443T1(C17532R$id.topContainer)).setBackgroundColor(ContextCompat.getColor(this, C17528R$color.default_background));
                mo30453f2().mo30486E(this.f13120K);
            } else {
                finish();
                return;
            }
        } else {
            m20521k2(a);
        }
        int intExtra2 = getIntent().getIntExtra("clear_update_subscription_id", 0);
        if (intExtra2 > 0) {
            m20520Z1(intExtra2);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo30453f2().mo40889j();
        if (this.f13115F != null) {
            mo30446a2().unregisterAdapterDataObserver(this.f13121L);
        }
    }

    /* renamed from: t */
    public void mo30464t() {
        int i = C17532R$id.commentText;
        ((AppCompatEditText) mo30443T1(i)).setText("");
        AppCompatEditText appCompatEditText = (AppCompatEditText) mo30443T1(i);
        C13706o.m87928e(appCompatEditText, "commentText");
        C4666m.m18144l(appCompatEditText);
    }

    /* renamed from: v0 */
    public void mo30465v0() {
        AppCompatEditText appCompatEditText = (AppCompatEditText) mo30443T1(C17532R$id.commentText);
        C13706o.m87928e(appCompatEditText, "commentText");
        C4666m.m18144l(appCompatEditText);
        LinearLayout linearLayout = (LinearLayout) mo30443T1(C17532R$id.uploadingLayout);
        C13706o.m87928e(linearLayout, "uploadingLayout");
        linearLayout.setVisibility(0);
    }

    /* renamed from: x1 */
    public void mo30466x1(Comment comment) {
        ImageView imageView;
        C13706o.m87929f(comment, ClientCookie.COMMENT_ATTR);
        AppCompatDialog appCompatDialog = new AppCompatDialog(this, C17542R$style.Theme_App_Dialog_Template_NoTitle);
        this.f13118I = appCompatDialog;
        appCompatDialog.setCancelable(false);
        AppCompatDialog appCompatDialog2 = this.f13118I;
        if (appCompatDialog2 != null) {
            appCompatDialog2.setContentView((int) C17535R$layout.dialog_edit_comment);
        }
        AppCompatDialog appCompatDialog3 = this.f13118I;
        Window window = null;
        EditText editText = appCompatDialog3 != null ? (EditText) appCompatDialog3.findViewById(C17532R$id.commentText) : null;
        if (editText != null) {
            editText.setText(comment.getText());
        }
        if (editText != null) {
            Editable text = editText.getText();
            C13706o.m87926c(text);
            editText.setSelection(text.length());
        }
        AppCompatDialog appCompatDialog4 = this.f13118I;
        if (!(appCompatDialog4 == null || (imageView = (ImageView) appCompatDialog4.findViewById(C17532R$id.updateCommentButton)) == null)) {
            C4666m.m18147o(imageView, (C13640g) null, new C5280d(this, comment, editText, (C13635d<? super C5280d>) null), 1, (Object) null);
        }
        AppCompatDialog appCompatDialog5 = this.f13118I;
        if (appCompatDialog5 != null) {
            appCompatDialog5.setCancelable(true);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        AppCompatDialog appCompatDialog6 = this.f13118I;
        Window window2 = appCompatDialog6 != null ? appCompatDialog6.getWindow() : null;
        C13706o.m87926c(window2);
        layoutParams.copyFrom(window2.getAttributes());
        layoutParams.width = Resources.getSystem().getDisplayMetrics().widthPixels - (getResources().getDimensionPixelSize(C17529R$dimen.margin_medium) * 2);
        AppCompatDialog appCompatDialog7 = this.f13118I;
        if (appCompatDialog7 != null) {
            window = appCompatDialog7.getWindow();
        }
        C13706o.m87926c(window);
        window.setAttributes(layoutParams);
        AppCompatDialog appCompatDialog8 = this.f13118I;
        if (appCompatDialog8 != null) {
            appCompatDialog8.show();
        }
    }

    /* renamed from: y1 */
    public void mo30467y1() {
        AppCompatDialog appCompatDialog = this.f13118I;
        if (appCompatDialog != null) {
            appCompatDialog.dismiss();
        }
    }
}
