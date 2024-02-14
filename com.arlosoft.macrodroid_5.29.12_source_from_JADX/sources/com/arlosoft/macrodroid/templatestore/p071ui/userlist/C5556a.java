package com.arlosoft.macrodroid.templatestore.p071ui.userlist;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.avatar.views.AvatarView;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.templatestore.model.User;
import com.arlosoft.macrodroid.templatestore.p071ui.profile.C5331h;
import com.arlosoft.macrodroid.utils.C6418q;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.userlist.a */
/* compiled from: UserItemViewHolder.kt */
public final class C5556a extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final C5331h f13518a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C16269p<User, AvatarView, C13339u> f13519b;

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.userlist.a$a */
    /* compiled from: UserItemViewHolder.kt */
    static final class C5557a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ User $item;
        int label;
        final /* synthetic */ C5556a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5557a(C5556a aVar, User user, C13635d<? super C5557a> dVar) {
            super(3, dVar);
            this.this$0 = aVar;
            this.$item = user;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5557a(this.this$0, this.$item, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C16269p t = this.this$0.f13519b;
                User user = this.$item;
                AvatarView avatarView = (AvatarView) this.this$0.itemView.findViewById(C17532R$id.avatarImage);
                C13706o.m87928e(avatarView, "itemView.avatarImage");
                t.invoke(user, avatarView);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5556a(View view, C5331h hVar, C16269p<? super User, ? super AvatarView, C13339u> pVar) {
        super(view);
        C13706o.m87929f(view, "itemView");
        C13706o.m87929f(hVar, "profileImageProvider");
        C13706o.m87929f(pVar, "userClickHandler");
        this.f13518a = hVar;
        this.f13519b = pVar;
    }

    /* renamed from: v */
    private final String m21330v(int i) {
        String a = C6418q.m24718a((long) i);
        C13706o.m87928e(a, "format(rating.toLong())");
        return a;
    }

    /* renamed from: u */
    public final void mo30812u(User user, boolean z, boolean z2, boolean z3) {
        C13706o.m87929f(user, "item");
        Context context = this.itemView.getContext();
        int i = C17528R$color.card_bg_2;
        int color = ContextCompat.getColor(context, z ? C17528R$color.card_bg_2 : C17528R$color.card_bg_1);
        Context context2 = this.itemView.getContext();
        if (!z) {
            i = C17528R$color.card_bg_1;
        }
        int color2 = ContextCompat.getColor(context2, i);
        ((CardView) this.itemView.findViewById(C17532R$id.cardView)).setCardBackgroundColor(color);
        View view = this.itemView;
        int i2 = C17532R$id.rank;
        ((TextView) view.findViewById(i2)).setBackgroundColor(color2);
        View view2 = this.itemView;
        int i3 = C17532R$id.name;
        ((TextView) view2.findViewById(i3)).setText(user.getUsername());
        C5331h hVar = this.f13518a;
        View view3 = this.itemView;
        int i4 = C17532R$id.avatarImage;
        AvatarView avatarView = (AvatarView) view3.findViewById(i4);
        C13706o.m87926c(avatarView);
        hVar.mo30528b(avatarView, user.getImage(), user.getUsername());
        ((TextView) this.itemView.findViewById(C17532R$id.starRating)).setText(m21330v(user.getRating()));
        ((TextView) this.itemView.findViewById(C17532R$id.numMacros)).setText(String.valueOf(user.getNumMacros()));
        ((TextView) this.itemView.findViewById(i2)).setText(String.valueOf(user.getUserRank()));
        View view4 = this.itemView;
        C13706o.m87928e(view4, "itemView");
        C4666m.m18147o(view4, (C13640g) null, new C5557a(this, user, (C13635d<? super C5557a>) null), 1, (Object) null);
        int i5 = 8;
        if (z3) {
            ((TextView) this.itemView.findViewById(i3)).setPaintFlags(16);
            View view5 = this.itemView;
            int i6 = C17532R$id.description;
            ((TextView) view5.findViewById(i6)).setText(this.itemView.getContext().getString(C17541R$string.template_store_user_is_blocked));
            TextView textView = (TextView) this.itemView.findViewById(i6);
            C13706o.m87928e(textView, "itemView.description");
            textView.setVisibility(0);
            ((AvatarView) this.itemView.findViewById(i4)).setAlpha(0.3f);
            ((TextView) this.itemView.findViewById(i3)).setAlpha(0.3f);
            ((TextView) this.itemView.findViewById(i6)).setAlpha(0.3f);
        } else {
            ((TextView) this.itemView.findViewById(i3)).setPaintFlags(1);
            View view6 = this.itemView;
            int i7 = C17532R$id.description;
            ((TextView) view6.findViewById(i7)).setText(user.getDescription());
            TextView textView2 = (TextView) this.itemView.findViewById(i7);
            C13706o.m87928e(textView2, "itemView.description");
            textView2.setVisibility((user.getDescription().length() == 0) ^ true ? 0 : 8);
            ((AvatarView) this.itemView.findViewById(i4)).setAlpha(1.0f);
            ((TextView) this.itemView.findViewById(i3)).setAlpha(1.0f);
            ((TextView) this.itemView.findViewById(i7)).setAlpha(1.0f);
        }
        ImageView imageView = (ImageView) this.itemView.findViewById(C17532R$id.subscriptionIndicator);
        C13706o.m87928e(imageView, "itemView.subscriptionIndicator");
        if (z2) {
            i5 = 0;
        }
        imageView.setVisibility(i5);
    }
}
