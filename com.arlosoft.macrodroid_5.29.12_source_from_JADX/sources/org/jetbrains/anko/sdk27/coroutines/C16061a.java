package org.jetbrains.anko.sdk27.coroutines;

import android.view.View;
import android.widget.CompoundButton;
import com.android.p023dx.rop.code.RegisterSpec;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13654b;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import p297ja.C13329n;
import p297ja.C13339u;
import p370qa.C16269p;
import p370qa.C16271r;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aN\u0010\n\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012.\u0010\t\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aP\u0010\r\u001a\u00020\u0007*\u00020\f2\b\b\u0002\u0010\u0002\u001a\u00020\u000120\u0010\t\u001a,\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, mo71668d2 = {"Landroid/view/View;", "Lkotlin/coroutines/g;", "context", "Lkotlin/Function4;", "Lkotlinx/coroutines/k0;", "", "Lkotlin/coroutines/d;", "Lja/u;", "", "handler", "c", "(Landroid/view/View;Lkotlin/coroutines/g;Lqa/r;)V", "Landroid/widget/CompoundButton;", "a", "(Landroid/widget/CompoundButton;Lkotlin/coroutines/g;Lqa/r;)V", "anko-sdk27-coroutines_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* renamed from: org.jetbrains.anko.sdk27.coroutines.a */
/* compiled from: ListenersWithCoroutines.kt */
public final class C16061a {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo71668d2 = {"Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "buttonView", "", "isChecked", "Lja/u;", "onCheckedChanged", "(Landroid/widget/CompoundButton;Z)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: org.jetbrains.anko.sdk27.coroutines.a$a */
    /* compiled from: ListenersWithCoroutines.kt */
    static final class C16062a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C13640g f66013a;

        /* renamed from: b */
        final /* synthetic */ C16271r f66014b;

        @Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo71669k = 3, mo71670mv = {1, 1, 13})
        @C13658f(mo71893c = "org/jetbrains/anko/sdk27/coroutines/Sdk27CoroutinesListenersWithCoroutinesKt$onCheckedChange$1$1", mo71894f = "ListenersWithCoroutines.kt", mo71895l = {653, 655}, mo71896m = "invokeSuspend")
        /* renamed from: org.jetbrains.anko.sdk27.coroutines.a$a$a */
        /* compiled from: ListenersWithCoroutines.kt */
        static final class C16063a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ CompoundButton $buttonView;
            final /* synthetic */ boolean $isChecked;
            int label;

            /* renamed from: p$ */
            private C15478k0 f66015p$;
            final /* synthetic */ C16062a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C16063a(C16062a aVar, CompoundButton compoundButton, boolean z, C13635d dVar) {
                super(2, dVar);
                this.this$0 = aVar;
                this.$buttonView = compoundButton;
                this.$isChecked = z;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                C13706o.m87930g(dVar, "completion");
                C16063a aVar = new C16063a(this.this$0, this.$buttonView, this.$isChecked, dVar);
                aVar.f66015p$ = (C15478k0) obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C16063a) create(obj, (C13635d) obj2)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c = C13652d.m87832c();
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else if (obj instanceof C13329n.C13331b) {
                        throw ((C13329n.C13331b) obj).exception;
                    }
                } else if (!(obj instanceof C13329n.C13331b)) {
                    C15478k0 k0Var = this.f66015p$;
                    C16271r rVar = this.this$0.f66014b;
                    CompoundButton compoundButton = this.$buttonView;
                    Boolean a = C13654b.m87833a(this.$isChecked);
                    this.label = 1;
                    if (rVar.invoke(k0Var, compoundButton, a, this) == c) {
                        return c;
                    }
                } else {
                    throw ((C13329n.C13331b) obj).exception;
                }
                return C13339u.f61331a;
            }
        }

        C16062a(C13640g gVar, C16271r rVar) {
            this.f66013a = gVar;
            this.f66014b = rVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C15414h.m94294c(C15503p1.f64723a, this.f66013a, C15486m0.DEFAULT, new C16063a(this, compoundButton, z, (C13635d) null));
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo71668d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "v", "", "hasFocus", "Lja/u;", "onFocusChange", "(Landroid/view/View;Z)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: org.jetbrains.anko.sdk27.coroutines.a$b */
    /* compiled from: ListenersWithCoroutines.kt */
    static final class C16064b implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ C13640g f66016a;

        /* renamed from: c */
        final /* synthetic */ C16271r f66017c;

        @Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo71669k = 3, mo71670mv = {1, 1, 13})
        @C13658f(mo71893c = "org/jetbrains/anko/sdk27/coroutines/Sdk27CoroutinesListenersWithCoroutinesKt$onFocusChange$1$1", mo71894f = "ListenersWithCoroutines.kt", mo71895l = {347, 349}, mo71896m = "invokeSuspend")
        /* renamed from: org.jetbrains.anko.sdk27.coroutines.a$b$a */
        /* compiled from: ListenersWithCoroutines.kt */
        static final class C16065a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ boolean $hasFocus;

            /* renamed from: $v */
            final /* synthetic */ View f66018$v;
            int label;

            /* renamed from: p$ */
            private C15478k0 f66019p$;
            final /* synthetic */ C16064b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C16065a(C16064b bVar, View view, boolean z, C13635d dVar) {
                super(2, dVar);
                this.this$0 = bVar;
                this.f66018$v = view;
                this.$hasFocus = z;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                C13706o.m87930g(dVar, "completion");
                C16065a aVar = new C16065a(this.this$0, this.f66018$v, this.$hasFocus, dVar);
                aVar.f66019p$ = (C15478k0) obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C16065a) create(obj, (C13635d) obj2)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c = C13652d.m87832c();
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else if (obj instanceof C13329n.C13331b) {
                        throw ((C13329n.C13331b) obj).exception;
                    }
                } else if (!(obj instanceof C13329n.C13331b)) {
                    C15478k0 k0Var = this.f66019p$;
                    C16271r rVar = this.this$0.f66017c;
                    View view = this.f66018$v;
                    C13706o.m87925b(view, RegisterSpec.PREFIX);
                    Boolean a = C13654b.m87833a(this.$hasFocus);
                    this.label = 1;
                    if (rVar.invoke(k0Var, view, a, this) == c) {
                        return c;
                    }
                } else {
                    throw ((C13329n.C13331b) obj).exception;
                }
                return C13339u.f61331a;
            }
        }

        C16064b(C13640g gVar, C16271r rVar) {
            this.f66016a = gVar;
            this.f66017c = rVar;
        }

        public final void onFocusChange(View view, boolean z) {
            C15414h.m94294c(C15503p1.f64723a, this.f66016a, C15486m0.DEFAULT, new C16065a(this, view, z, (C13635d) null));
        }
    }

    /* renamed from: a */
    public static final void m96670a(CompoundButton compoundButton, C13640g gVar, C16271r<? super C15478k0, ? super CompoundButton, ? super Boolean, ? super C13635d<? super C13339u>, ? extends Object> rVar) {
        C13706o.m87930g(compoundButton, "receiver$0");
        C13706o.m87930g(gVar, "context");
        C13706o.m87930g(rVar, "handler");
        compoundButton.setOnCheckedChangeListener(new C16062a(gVar, rVar));
    }

    /* renamed from: b */
    public static /* synthetic */ void m96671b(CompoundButton compoundButton, C13640g gVar, C16271r rVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C15186a1.m93731c();
        }
        m96670a(compoundButton, gVar, rVar);
    }

    /* renamed from: c */
    public static final void m96672c(View view, C13640g gVar, C16271r<? super C15478k0, ? super View, ? super Boolean, ? super C13635d<? super C13339u>, ? extends Object> rVar) {
        C13706o.m87930g(view, "receiver$0");
        C13706o.m87930g(gVar, "context");
        C13706o.m87930g(rVar, "handler");
        view.setOnFocusChangeListener(new C16064b(gVar, rVar));
    }

    /* renamed from: d */
    public static /* synthetic */ void m96673d(View view, C13640g gVar, C16271r rVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C15186a1.m93731c();
        }
        m96672c(view, gVar, rVar);
    }
}
