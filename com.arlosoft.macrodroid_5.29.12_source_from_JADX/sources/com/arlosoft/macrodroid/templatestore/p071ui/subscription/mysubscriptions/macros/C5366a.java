package com.arlosoft.macrodroid.templatestore.p071ui.subscription.mysubscriptions.macros;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.database.room.C4407l;
import com.arlosoft.macrodroid.extensions.C4666m;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13654b;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p139o1.C8004h0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.mysubscriptions.macros.a */
/* compiled from: MyMacroSubscriptionsAdapter.kt */
public final class C5366a extends RecyclerView.Adapter<C5367a> {

    /* renamed from: a */
    private List<C4407l> f13229a;

    /* renamed from: b */
    private final C16269p<C4407l, Boolean, C13339u> f13230b;

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.mysubscriptions.macros.a$a */
    /* compiled from: MyMacroSubscriptionsAdapter.kt */
    public static final class C5367a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final C8004h0 f13231a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C16269p<C4407l, Boolean, C13339u> f13232b;

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.mysubscriptions.macros.a$a$a */
        /* compiled from: MyMacroSubscriptionsAdapter.kt */
        static final class C5368a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            final /* synthetic */ C4407l $macro;
            int label;
            final /* synthetic */ C5367a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5368a(C5367a aVar, C4407l lVar, C13635d<? super C5368a> dVar) {
                super(3, dVar);
                this.this$0 = aVar;
                this.$macro = lVar;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C5368a(this.this$0, this.$macro, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.f13232b.invoke(this.$macro, C13654b.m87833a(false));
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.mysubscriptions.macros.a$a$b */
        /* compiled from: MyMacroSubscriptionsAdapter.kt */
        static final class C5369b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            final /* synthetic */ C4407l $macro;
            int label;
            final /* synthetic */ C5367a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5369b(C5367a aVar, C4407l lVar, C13635d<? super C5369b> dVar) {
                super(3, dVar);
                this.this$0 = aVar;
                this.$macro = lVar;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C5369b(this.this$0, this.$macro, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.f13232b.invoke(this.$macro, C13654b.m87833a(true));
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5367a(C8004h0 h0Var, C16269p<? super C4407l, ? super Boolean, C13339u> pVar) {
            super(h0Var.getRoot());
            C13706o.m87929f(h0Var, "binding");
            C13706o.m87929f(pVar, "macroClickListener");
            this.f13231a = h0Var;
            this.f13232b = pVar;
        }

        /* renamed from: u */
        public final void mo30554u(C4407l lVar, boolean z) {
            C13706o.m87929f(lVar, "macro");
            int color = ContextCompat.getColor(this.f13231a.f19280b.getContext(), z ? C17528R$color.card_bg_2 : C17528R$color.card_bg_1);
            this.f13231a.f19281c.setText(lVar.mo28737b());
            this.f13231a.f19280b.setCardBackgroundColor(color);
            CardView cardView = this.f13231a.f19280b;
            C13706o.m87928e(cardView, "binding.cardView");
            C4666m.m18147o(cardView, (C13640g) null, new C5368a(this, lVar, (C13635d<? super C5368a>) null), 1, (Object) null);
            CardView cardView2 = this.f13231a.f19280b;
            C13706o.m87928e(cardView2, "binding.cardView");
            C4666m.m18152t(cardView2, (C13640g) null, false, new C5369b(this, lVar, (C13635d<? super C5369b>) null), 3, (Object) null);
        }
    }

    public C5366a(List<C4407l> list, C16269p<? super C4407l, ? super Boolean, C13339u> pVar) {
        C13706o.m87929f(list, "updateItems");
        C13706o.m87929f(pVar, "macroClickListener");
        this.f13229a = list;
        this.f13230b = pVar;
        setHasStableIds(true);
    }

    /* renamed from: B */
    public void onBindViewHolder(C5367a aVar, int i) {
        C13706o.m87929f(aVar, "holder");
        aVar.mo30554u(this.f13229a.get(i), i % 2 == 0);
    }

    /* renamed from: C */
    public C5367a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        C8004h0 c = C8004h0.m33337c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C13706o.m87928e(c, "inflate(LayoutInflater.f….context), parent, false)");
        return new C5367a(c, this.f13230b);
    }

    /* renamed from: D */
    public final void mo30553D(List<C4407l> list) {
        C13706o.m87929f(list, "updateItems");
        this.f13229a = list;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f13229a.size();
    }

    public long getItemId(int i) {
        return (long) this.f13229a.get(i).mo28736a();
    }
}
