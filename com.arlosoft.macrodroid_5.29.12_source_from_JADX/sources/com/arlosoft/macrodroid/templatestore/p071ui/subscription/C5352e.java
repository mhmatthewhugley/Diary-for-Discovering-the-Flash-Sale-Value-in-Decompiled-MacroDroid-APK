package com.arlosoft.macrodroid.templatestore.p071ui.subscription;

import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.avatar.views.AvatarView;
import com.arlosoft.macrodroid.database.room.C4418o;
import com.arlosoft.macrodroid.database.room.C4419p;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.templatestore.p071ui.profile.C5331h;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p139o1.C8016n0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.e */
/* compiled from: TemplateUpdatesAdapter.kt */
public final class C5352e extends RecyclerView.Adapter<C5353a> {

    /* renamed from: a */
    private List<C4419p> f13210a;

    /* renamed from: b */
    private final C5331h f13211b;

    /* renamed from: c */
    private final C16265l<C4419p, C13339u> f13212c;

    /* renamed from: d */
    private final C16265l<C4419p, C13339u> f13213d;

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.e$a */
    /* compiled from: TemplateUpdatesAdapter.kt */
    public static final class C5353a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final C8016n0 f13214a;

        /* renamed from: b */
        private final C5331h f13215b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C16265l<C4419p, C13339u> f13216c;

        /* renamed from: d */
        private final C16265l<C4419p, C13339u> f13217d;

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.e$a$a */
        /* compiled from: TemplateUpdatesAdapter.kt */
        public /* synthetic */ class C5354a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f13218a;

            static {
                int[] iArr = new int[C4418o.values().length];
                iArr[C4418o.TYPE_MACRO_UPDATED.ordinal()] = 1;
                iArr[C4418o.TYPE_MACRO_DELETED.ordinal()] = 2;
                iArr[C4418o.TYPE_MACRO_NEW_COMMENT.ordinal()] = 3;
                iArr[C4418o.TYPE_USER_NEW_MACRO.ordinal()] = 4;
                f13218a = iArr;
            }
        }

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.e$a$b */
        /* compiled from: TemplateUpdatesAdapter.kt */
        static final class C5355b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            final /* synthetic */ C4419p $updateItem;
            int label;
            final /* synthetic */ C5353a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5355b(C5353a aVar, C4419p pVar, C13635d<? super C5355b> dVar) {
                super(3, dVar);
                this.this$0 = aVar;
                this.$updateItem = pVar;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C5355b(this.this$0, this.$updateItem, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.f13216c.invoke(this.$updateItem);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5353a(C8016n0 n0Var, C5331h hVar, C16265l<? super C4419p, C13339u> lVar, C16265l<? super C4419p, C13339u> lVar2) {
            super(n0Var.getRoot());
            C13706o.m87929f(n0Var, "binding");
            C13706o.m87929f(hVar, "profileImageProvider");
            C13706o.m87929f(lVar, "updateClickListener");
            C13706o.m87929f(lVar2, "userClickListener");
            this.f13214a = n0Var;
            this.f13215b = hVar;
            this.f13216c = lVar;
            this.f13217d = lVar2;
        }

        /* access modifiers changed from: private */
        /* renamed from: w */
        public static final void m20745w(C5353a aVar, C4419p pVar, View view) {
            C13706o.m87929f(aVar, "this$0");
            C13706o.m87929f(pVar, "$updateItem");
            aVar.f13217d.invoke(pVar);
        }

        /* renamed from: v */
        public final void mo30543v(C4419p pVar) {
            C13706o.m87929f(pVar, "updateItem");
            this.f13214a.f19367f.setText(String.valueOf(DateUtils.getRelativeTimeSpanString(pVar.mo28758e(), Calendar.getInstance().getTimeInMillis(), 60000)));
            this.f13214a.f19371j.setText(pVar.mo28764i());
            C5331h hVar = this.f13215b;
            AvatarView avatarView = (AvatarView) this.itemView.findViewById(C17532R$id.avatarImage);
            C13706o.m87926c(avatarView);
            hVar.mo30528b(avatarView, pVar.mo28762h(), pVar.mo28764i());
            int i = C5354a.f13218a[pVar.mo28760f().ordinal()];
            if (i == 1) {
                this.f13214a.f19365d.setImageResource(C17530R$drawable.ic_refresh_white_24dp);
                C8016n0 n0Var = this.f13214a;
                n0Var.f19368g.setText(n0Var.f19369h.getContext().getString(C17541R$string.template_store_subscribed_macro_updated_heading));
                this.f13214a.f19369h.setText(pVar.mo28757d());
            } else if (i == 2) {
                this.f13214a.f19365d.setImageResource(C17530R$drawable.ic_delete_white_24dp);
                C8016n0 n0Var2 = this.f13214a;
                n0Var2.f19368g.setText(n0Var2.f19369h.getContext().getString(C17541R$string.template_store_subscribed_macro_deleted_heading));
                this.f13214a.f19369h.setText(pVar.mo28757d());
            } else if (i == 3) {
                this.f13214a.f19365d.setImageResource(C17530R$drawable.ic_insert_comment_white_24dp);
                C8016n0 n0Var3 = this.f13214a;
                TextView textView = n0Var3.f19368g;
                C13696i0 i0Var = C13696i0.f61931a;
                String string = n0Var3.f19369h.getContext().getString(C17541R$string.template_store_subscribed_macro_new_comment);
                C13706o.m87928e(string, "binding.updateText.conte…cribed_macro_new_comment)");
                String format = String.format(string, Arrays.copyOf(new Object[]{pVar.mo28757d()}, 1));
                C13706o.m87928e(format, "format(format, *args)");
                textView.setText(format);
                this.f13214a.f19369h.setText(pVar.mo28754a());
            } else if (i == 4) {
                this.f13214a.f19365d.setImageResource(C17530R$drawable.ic_plus_circle_white_48dp);
                C8016n0 n0Var4 = this.f13214a;
                TextView textView2 = n0Var4.f19368g;
                C13696i0 i0Var2 = C13696i0.f61931a;
                String string2 = n0Var4.f19369h.getContext().getString(C17541R$string.template_store_subscribed_macro_new_macro_from_user);
                C13706o.m87928e(string2, "binding.updateText.conte…acro_new_macro_from_user)");
                String format2 = String.format(string2, Arrays.copyOf(new Object[]{pVar.mo28764i()}, 1));
                C13706o.m87928e(format2, "format(format, *args)");
                textView2.setText(format2);
                this.f13214a.f19369h.setText(pVar.mo28757d());
            }
            CardView cardView = this.f13214a.f19364c;
            C13706o.m87928e(cardView, "binding.cardView");
            C4666m.m18147o(cardView, (C13640g) null, new C5355b(this, pVar, (C13635d<? super C5355b>) null), 1, (Object) null);
            this.f13214a.f19370i.setOnClickListener(new C5351d(this, pVar));
        }
    }

    public C5352e(List<C4419p> list, C5331h hVar, C16265l<? super C4419p, C13339u> lVar, C16265l<? super C4419p, C13339u> lVar2) {
        C13706o.m87929f(list, "updateItems");
        C13706o.m87929f(hVar, "profileImageProvider");
        C13706o.m87929f(lVar, "updateClickListener");
        C13706o.m87929f(lVar2, "userClickListener");
        this.f13210a = list;
        this.f13211b = hVar;
        this.f13212c = lVar;
        this.f13213d = lVar2;
        setHasStableIds(true);
    }

    /* renamed from: B */
    public void onBindViewHolder(C5353a aVar, int i) {
        C13706o.m87929f(aVar, "holder");
        aVar.mo30543v(this.f13210a.get(i));
    }

    /* renamed from: C */
    public C5353a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        C8016n0 c = C8016n0.m33379c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C13706o.m87928e(c, "inflate(LayoutInflater.f….context), parent, false)");
        return new C5353a(c, this.f13211b, this.f13212c, this.f13213d);
    }

    /* renamed from: D */
    public final void mo30542D(List<C4419p> list) {
        C13706o.m87929f(list, "updateItems");
        this.f13210a = list;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f13210a.size();
    }

    public long getItemId(int i) {
        return this.f13210a.get(i).mo28755b();
    }
}
