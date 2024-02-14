package com.arlosoft.macrodroid.homescreen.quickrun;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p258f6.C12237a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.homescreen.quickrun.n */
/* compiled from: QuickRunMacroAdapter.kt */
public final class C4786n extends C12237a {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4773a f11990c;

    /* renamed from: com.arlosoft.macrodroid.homescreen.quickrun.n$a */
    /* compiled from: QuickRunMacroAdapter.kt */
    static final class C4787a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Macro $macro;
        int label;
        final /* synthetic */ C4786n this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4787a(C4786n nVar, Macro macro, C13635d<? super C4787a> dVar) {
            super(3, dVar);
            this.this$0 = nVar;
            this.$macro = macro;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4787a(this.this$0, this.$macro, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C4773a t = this.this$0.f11990c;
                if (t != null) {
                    t.mo29305a(this.$macro);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.homescreen.quickrun.n$b */
    /* compiled from: QuickRunMacroAdapter.kt */
    static final class C4788b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Macro $macro;
        int label;
        final /* synthetic */ C4786n this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4788b(C4786n nVar, Macro macro, C13635d<? super C4788b> dVar) {
            super(3, dVar);
            this.this$0 = nVar;
            this.$macro = macro;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4788b(this.this$0, this.$macro, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C4773a t = this.this$0.f11990c;
                if (t != null) {
                    t.mo29306b(this.$macro);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4786n(View view, C4773a aVar) {
        super(view);
        C13706o.m87929f(view, "itemView");
        this.f11990c = aVar;
    }

    /* renamed from: u */
    public final void mo29328u(Macro macro, boolean z) {
        C13706o.m87929f(macro, "macro");
        ((TextView) this.itemView.findViewById(C17532R$id.macroName)).setText(macro.getName());
        View view = this.itemView;
        C13706o.m87928e(view, "itemView");
        C4666m.m18147o(view, (C13640g) null, new C4787a(this, macro, (C13635d<? super C4787a>) null), 1, (Object) null);
        View view2 = this.itemView;
        int i = C17532R$id.deleteButton;
        ImageView imageView = (ImageView) view2.findViewById(i);
        C13706o.m87928e(imageView, "itemView.deleteButton");
        imageView.setVisibility(z ? 0 : 8);
        ImageView imageView2 = (ImageView) this.itemView.findViewById(i);
        C13706o.m87928e(imageView2, "itemView.deleteButton");
        C4666m.m18147o(imageView2, (C13640g) null, new C4788b(this, macro, (C13635d<? super C4788b>) null), 1, (Object) null);
    }
}
