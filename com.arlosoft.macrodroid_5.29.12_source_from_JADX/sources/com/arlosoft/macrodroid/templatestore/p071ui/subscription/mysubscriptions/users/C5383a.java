package com.arlosoft.macrodroid.templatestore.p071ui.subscription.mysubscriptions.users;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.avatar.views.AvatarView;
import com.arlosoft.macrodroid.database.room.C4443v;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.templatestore.p071ui.profile.C5331h;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13654b;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p139o1.C8006i0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.mysubscriptions.users.a */
/* compiled from: MyUserSubscriptionsAdapter.kt */
public final class C5383a extends RecyclerView.Adapter<C5384a> {

    /* renamed from: a */
    private List<C4443v> f13253a;

    /* renamed from: b */
    private final C5331h f13254b;

    /* renamed from: c */
    private final C16269p<C4443v, Boolean, C13339u> f13255c;

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.mysubscriptions.users.a$a */
    /* compiled from: MyUserSubscriptionsAdapter.kt */
    public static final class C5384a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final C8006i0 f13256a;

        /* renamed from: b */
        private final C5331h f13257b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C16269p<C4443v, Boolean, C13339u> f13258c;

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.mysubscriptions.users.a$a$a */
        /* compiled from: MyUserSubscriptionsAdapter.kt */
        static final class C5385a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            final /* synthetic */ C4443v $user;
            int label;
            final /* synthetic */ C5384a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5385a(C5384a aVar, C4443v vVar, C13635d<? super C5385a> dVar) {
                super(3, dVar);
                this.this$0 = aVar;
                this.$user = vVar;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C5385a(this.this$0, this.$user, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.f13258c.invoke(this.$user, C13654b.m87833a(false));
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.mysubscriptions.users.a$a$b */
        /* compiled from: MyUserSubscriptionsAdapter.kt */
        static final class C5386b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            final /* synthetic */ C4443v $user;
            int label;
            final /* synthetic */ C5384a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5386b(C5384a aVar, C4443v vVar, C13635d<? super C5386b> dVar) {
                super(3, dVar);
                this.this$0 = aVar;
                this.$user = vVar;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C5386b(this.this$0, this.$user, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.f13258c.invoke(this.$user, C13654b.m87833a(true));
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5384a(C8006i0 i0Var, C5331h hVar, C16269p<? super C4443v, ? super Boolean, C13339u> pVar) {
            super(i0Var.getRoot());
            C13706o.m87929f(i0Var, "binding");
            C13706o.m87929f(hVar, "profileImageProvider");
            C13706o.m87929f(pVar, "userClickListener");
            this.f13256a = i0Var;
            this.f13257b = hVar;
            this.f13258c = pVar;
        }

        /* renamed from: u */
        public final void mo30573u(C4443v vVar) {
            C13706o.m87929f(vVar, "user");
            this.f13256a.f19300d.setText(vVar.mo28796c());
            CardView cardView = this.f13256a.f19299c;
            C13706o.m87928e(cardView, "binding.cardView");
            C4666m.m18147o(cardView, (C13640g) null, new C5385a(this, vVar, (C13635d<? super C5385a>) null), 1, (Object) null);
            CardView cardView2 = this.f13256a.f19299c;
            C13706o.m87928e(cardView2, "binding.cardView");
            C4666m.m18152t(cardView2, (C13640g) null, false, new C5386b(this, vVar, (C13635d<? super C5386b>) null), 3, (Object) null);
            C5331h hVar = this.f13257b;
            AvatarView avatarView = this.f13256a.f19298b;
            C13706o.m87928e(avatarView, "binding.avatarImage");
            hVar.mo30528b(avatarView, vVar.mo28795b(), vVar.mo28796c());
        }
    }

    public C5383a(List<C4443v> list, C5331h hVar, C16269p<? super C4443v, ? super Boolean, C13339u> pVar) {
        C13706o.m87929f(list, "updateItems");
        C13706o.m87929f(hVar, "profileImageProvider");
        C13706o.m87929f(pVar, "userClickListener");
        this.f13253a = list;
        this.f13254b = hVar;
        this.f13255c = pVar;
        setHasStableIds(true);
    }

    /* renamed from: B */
    public void onBindViewHolder(C5384a aVar, int i) {
        C13706o.m87929f(aVar, "holder");
        aVar.mo30573u(this.f13253a.get(i));
    }

    /* renamed from: C */
    public C5384a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        C8006i0 c = C8006i0.m33344c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C13706o.m87928e(c, "inflate(LayoutInflater.f….context), parent, false)");
        return new C5384a(c, this.f13254b, this.f13255c);
    }

    /* renamed from: D */
    public final void mo30572D(List<C4443v> list) {
        C13706o.m87929f(list, "updateItems");
        this.f13253a = list;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f13253a.size();
    }

    public long getItemId(int i) {
        return (long) this.f13253a.get(i).mo28794a();
    }
}
