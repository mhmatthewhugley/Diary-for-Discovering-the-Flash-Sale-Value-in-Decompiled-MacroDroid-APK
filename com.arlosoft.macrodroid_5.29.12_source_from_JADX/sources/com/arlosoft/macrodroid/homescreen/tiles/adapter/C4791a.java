package com.arlosoft.macrodroid.homescreen.tiles.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.google.android.material.card.MaterialCardView;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p198z1.C10433a;
import p247e6.C12147d;
import p247e6.C12154k;
import p258f6.C12237a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.adapter.a */
/* compiled from: HomeScreenTilesAdapter.kt */
public final class C4791a extends RecyclerView.Adapter<C4797d> implements C12147d<C4797d> {

    /* renamed from: c */
    public static final C4794b f12001c = new C4794b((C13695i) null);

    /* renamed from: a */
    private final List<C10433a> f12002a;

    /* renamed from: com.arlosoft.macrodroid.homescreen.tiles.adapter.a$a */
    /* compiled from: HomeScreenTilesAdapter.kt */
    public static final class C4792a extends C4797d {
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C10433a f12003c;

        /* renamed from: com.arlosoft.macrodroid.homescreen.tiles.adapter.a$a$a */
        /* compiled from: HomeScreenTilesAdapter.kt */
        static final class C4793a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            final /* synthetic */ View $itemView;
            int label;
            final /* synthetic */ C4792a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4793a(C4792a aVar, View view, C13635d<? super C4793a> dVar) {
                super(3, dVar);
                this.this$0 = aVar;
                this.$itemView = view;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C4793a(this.this$0, this.$itemView, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C10433a u = this.this$0.f12003c;
                    if (u == null) {
                        C13706o.m87945v("tile");
                        u = null;
                    }
                    MaterialCardView materialCardView = (MaterialCardView) this.$itemView.findViewById(C17532R$id.tileContainer);
                    C13706o.m87928e(materialCardView, "itemView.tileContainer");
                    ImageView imageView = (ImageView) this.$itemView.findViewById(C17532R$id.icon);
                    C13706o.m87928e(imageView, "itemView.icon");
                    u.mo29335f(materialCardView, imageView);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4792a(View view) {
            super(view);
            C13706o.m87929f(view, "itemView");
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(C17532R$id.clickContainer);
            C13706o.m87928e(constraintLayout, "itemView.clickContainer");
            C4666m.m18147o(constraintLayout, (C13640g) null, new C4793a(this, view, (C13635d<? super C4793a>) null), 1, (Object) null);
        }

        /* renamed from: t */
        public void mo29340t(C10433a aVar) {
            C13706o.m87929f(aVar, "tile");
            this.f12003c = aVar;
            ((MaterialCardView) this.itemView.findViewById(C17532R$id.tileContainer)).setCardBackgroundColor(aVar.mo29331a());
            ((TextView) this.itemView.findViewById(C17532R$id.title)).setText(aVar.mo29334e());
            ((ImageView) this.itemView.findViewById(C17532R$id.icon)).setImageResource(aVar.mo29332b());
        }
    }

    /* renamed from: com.arlosoft.macrodroid.homescreen.tiles.adapter.a$b */
    /* compiled from: HomeScreenTilesAdapter.kt */
    public static final class C4794b {
        private C4794b() {
        }

        public /* synthetic */ C4794b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.homescreen.tiles.adapter.a$c */
    /* compiled from: HomeScreenTilesAdapter.kt */
    public static final class C4795c extends C4797d {
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C10433a f12004c;

        /* renamed from: com.arlosoft.macrodroid.homescreen.tiles.adapter.a$c$a */
        /* compiled from: HomeScreenTilesAdapter.kt */
        static final class C4796a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            final /* synthetic */ View $itemView;
            int label;
            final /* synthetic */ C4795c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4796a(C4795c cVar, View view, C13635d<? super C4796a> dVar) {
                super(3, dVar);
                this.this$0 = cVar;
                this.$itemView = view;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C4796a(this.this$0, this.$itemView, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C10433a u = this.this$0.f12004c;
                    if (u == null) {
                        C13706o.m87945v("tile");
                        u = null;
                    }
                    MaterialCardView materialCardView = (MaterialCardView) this.$itemView.findViewById(C17532R$id.tileContainer);
                    C13706o.m87928e(materialCardView, "itemView.tileContainer");
                    ImageView imageView = (ImageView) this.$itemView.findViewById(C17532R$id.icon);
                    C13706o.m87928e(imageView, "itemView.icon");
                    u.mo29335f(materialCardView, imageView);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4795c(View view) {
            super(view);
            C13706o.m87929f(view, "itemView");
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C17532R$id.clickableContainer);
            C13706o.m87928e(linearLayout, "itemView.clickableContainer");
            C4666m.m18147o(linearLayout, (C13640g) null, new C4796a(this, view, (C13635d<? super C4796a>) null), 1, (Object) null);
        }

        /* renamed from: t */
        public void mo29340t(C10433a aVar) {
            C13706o.m87929f(aVar, "tile");
            this.f12004c = aVar;
            ((TextView) this.itemView.findViewById(C17532R$id.title)).setText(aVar.mo29334e());
            ((ImageView) this.itemView.findViewById(C17532R$id.icon)).setImageResource(aVar.mo29332b());
            ((MaterialCardView) this.itemView.findViewById(C17532R$id.tileContainer)).setCardBackgroundColor(aVar.mo29331a());
            FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(C17532R$id.customContent);
            C13706o.m87928e(frameLayout, "itemView.customContent");
            aVar.mo29346g(frameLayout);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.homescreen.tiles.adapter.a$d */
    /* compiled from: HomeScreenTilesAdapter.kt */
    public static abstract class C4797d extends C12237a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4797d(View view) {
            super(view);
            C13706o.m87929f(view, "itemView");
        }

        /* renamed from: t */
        public abstract void mo29340t(C10433a aVar);
    }

    public C4791a(List<C10433a> list) {
        C13706o.m87929f(list, "tiles");
        this.f12002a = list;
        setHasStableIds(true);
    }

    /* renamed from: B */
    public void onBindViewHolder(C4797d dVar, int i) {
        C13706o.m87929f(dVar, "holder");
        dVar.mo29340t(this.f12002a.get(i));
    }

    /* renamed from: C */
    public boolean mo29074x(C4797d dVar, int i, int i2, int i3) {
        C13706o.m87929f(dVar, "holder");
        return true;
    }

    /* renamed from: D */
    public C4797d onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        if (i == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.home_tile_basic_layout_macro, viewGroup, false);
            C13706o.m87928e(inflate, "from(parent.context).inf…out_macro, parent, false)");
            return new C4792a(inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.tile_home_screen_basic, viewGroup, false);
        C13706o.m87928e(inflate2, "from(parent.context).inf…een_basic, parent, false)");
        return new C4795c(inflate2);
    }

    /* renamed from: E */
    public C12154k mo29073s(C4797d dVar, int i) {
        C13706o.m87929f(dVar, "holder");
        return null;
    }

    /* renamed from: b */
    public void mo29069b(int i) {
        notifyDataSetChanged();
    }

    /* renamed from: c */
    public void mo29070c(int i, int i2, boolean z) {
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f12002a.size();
    }

    public long getItemId(int i) {
        return this.f12002a.get(i).mo29333c();
    }

    public int getItemViewType(int i) {
        return this.f12002a.get(i).mo41156d() ^ true ? 1 : 0;
    }

    /* renamed from: h */
    public void mo29071h(int i, int i2) {
        this.f12002a.add(i2, this.f12002a.remove(i));
    }

    /* renamed from: q */
    public boolean mo29072q(int i, int i2) {
        return true;
    }
}
