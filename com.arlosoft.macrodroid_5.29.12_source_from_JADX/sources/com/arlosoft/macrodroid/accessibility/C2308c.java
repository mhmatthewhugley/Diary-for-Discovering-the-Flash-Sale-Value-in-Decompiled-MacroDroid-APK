package com.arlosoft.macrodroid.accessibility;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import org.jetbrains.anko.sdk27.coroutines.C16061a;
import p139o1.C8002g0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16271r;

/* renamed from: com.arlosoft.macrodroid.accessibility.c */
/* compiled from: AccessibilityServiceSelectionAdapter.kt */
public final class C2308c extends RecyclerView.Adapter<C2310b> {

    /* renamed from: a */
    private final List<C2304a> f7117a;

    /* renamed from: b */
    private final C2309a f7118b;

    /* renamed from: com.arlosoft.macrodroid.accessibility.c$a */
    /* compiled from: AccessibilityServiceSelectionAdapter.kt */
    public interface C2309a {
        /* renamed from: J0 */
        void mo24653J0(String str, boolean z, int i);
    }

    /* renamed from: com.arlosoft.macrodroid.accessibility.c$b */
    /* compiled from: AccessibilityServiceSelectionAdapter.kt */
    public static final class C2310b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final C8002g0 f7119a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C2309a f7120b;

        /* renamed from: com.arlosoft.macrodroid.accessibility.c$b$a */
        /* compiled from: AccessibilityServiceSelectionAdapter.kt */
        static final class C2311a extends C13665l implements C16271r<C15478k0, CompoundButton, Boolean, C13635d<? super C13339u>, Object> {
            final /* synthetic */ C2304a $item;
            final /* synthetic */ int $position;
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ C2310b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2311a(C2310b bVar, C2304a aVar, int i, C13635d<? super C2311a> dVar) {
                super(4, dVar);
                this.this$0 = bVar;
                this.$item = aVar;
                this.$position = i;
            }

            /* renamed from: h */
            public final Object mo24669h(C15478k0 k0Var, CompoundButton compoundButton, boolean z, C13635d<? super C13339u> dVar) {
                C2311a aVar = new C2311a(this.this$0, this.$item, this.$position, dVar);
                aVar.Z$0 = z;
                return aVar.invokeSuspend(C13339u.f61331a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return mo24669h((C15478k0) obj, (CompoundButton) obj2, ((Boolean) obj3).booleanValue(), (C13635d) obj4);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.f7120b.mo24653J0(this.$item.mo24656c(), this.Z$0, this.$position);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2310b(C8002g0 g0Var, C2309a aVar) {
            super(g0Var.getRoot());
            C13706o.m87929f(g0Var, "binding");
            C13706o.m87929f(aVar, "changeListener");
            this.f7119a = g0Var;
            this.f7120b = aVar;
        }

        /* renamed from: u */
        public final void mo24668u(C2304a aVar, int i) {
            C13706o.m87929f(aVar, "item");
            this.f7119a.f19273c.setText(aVar.mo24658e());
            this.f7119a.f19272b.setChecked(aVar.mo24657d());
            CheckBox checkBox = this.f7119a.f19272b;
            C13706o.m87928e(checkBox, "binding.enabledState");
            C16061a.m96671b(checkBox, (C13640g) null, new C2311a(this, aVar, i, (C13635d<? super C2311a>) null), 1, (Object) null);
        }
    }

    public C2308c(List<C2304a> list, C2309a aVar) {
        C13706o.m87929f(list, "items");
        C13706o.m87929f(aVar, "changeListener");
        this.f7117a = list;
        this.f7118b = aVar;
    }

    /* renamed from: B */
    public void onBindViewHolder(C2310b bVar, int i) {
        C13706o.m87929f(bVar, "holder");
        bVar.mo24668u(this.f7117a.get(i), i);
    }

    /* renamed from: C */
    public C2310b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        C8002g0 c = C8002g0.m33330c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C13706o.m87928e(c, "inflate(LayoutInflater.f….context), parent, false)");
        return new C2310b(c, this.f7118b);
    }

    public int getItemCount() {
        return this.f7117a.size();
    }
}
