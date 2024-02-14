package com.arlosoft.macrodroid.homescreen.favourites;

import android.view.View;
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

/* renamed from: com.arlosoft.macrodroid.homescreen.favourites.c */
/* compiled from: FavouritesAdapter.kt */
public final class C4756c extends C12237a {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4758d f11945c;

    /* renamed from: com.arlosoft.macrodroid.homescreen.favourites.c$a */
    /* compiled from: FavouritesAdapter.kt */
    static final class C4757a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Macro $macro;
        int label;
        final /* synthetic */ C4756c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4757a(C4756c cVar, Macro macro, C13635d<? super C4757a> dVar) {
            super(3, dVar);
            this.this$0 = cVar;
            this.$macro = macro;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4757a(this.this$0, this.$macro, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C4758d t = this.this$0.f11945c;
                if (t != null) {
                    t.mo29291a(this.$macro);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4756c(View view, C4758d dVar) {
        super(view);
        C13706o.m87929f(view, "itemView");
        this.f11945c = dVar;
    }

    /* renamed from: u */
    public final void mo29298u(Macro macro, boolean z) {
        C13706o.m87929f(macro, "macro");
        View view = this.itemView;
        int i = C17532R$id.macroName;
        ((TextView) view.findViewById(i)).setText(macro.getName());
        float f = 0.5f;
        ((TextView) this.itemView.findViewById(i)).setAlpha(!macro.isEnabled() ? 0.5f : 1.0f);
        TextView textView = (TextView) this.itemView.findViewById(i);
        if (macro.isEnabled()) {
            f = 1.0f;
        }
        textView.setAlpha(f);
        View view2 = this.itemView;
        C13706o.m87928e(view2, "itemView");
        C4666m.m18147o(view2, (C13640g) null, new C4757a(this, macro, (C13635d<? super C4757a>) null), 1, (Object) null);
    }
}
