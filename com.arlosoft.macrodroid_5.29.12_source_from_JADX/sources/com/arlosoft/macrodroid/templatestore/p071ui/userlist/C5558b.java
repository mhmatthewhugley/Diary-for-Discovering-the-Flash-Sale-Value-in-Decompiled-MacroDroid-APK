package com.arlosoft.macrodroid.templatestore.p071ui.userlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.avatar.views.AvatarView;
import com.arlosoft.macrodroid.database.room.C4391d;
import com.arlosoft.macrodroid.database.room.C4443v;
import com.arlosoft.macrodroid.templatestore.model.User;
import com.arlosoft.macrodroid.templatestore.p071ui.profile.C5331h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16269p;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.userlist.b */
/* compiled from: UserListAdapter.kt */
public final class C5558b extends PagedListAdapter<User, C5556a> {

    /* renamed from: a */
    private final C5331h f13520a;

    /* renamed from: b */
    private List<C4443v> f13521b;

    /* renamed from: c */
    private List<C4391d> f13522c;

    /* renamed from: d */
    private final C16269p<User, AvatarView, C13339u> f13523d;

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.userlist.b$a */
    /* compiled from: UserListAdapter.kt */
    public static final class C5559a extends DiffUtil.ItemCallback<User> {
        /* renamed from: a */
        public boolean areContentsTheSame(User user, User user2) {
            C13706o.m87929f(user, "oldItem");
            C13706o.m87929f(user2, "newItem");
            return C13706o.m87924a(user, user2);
        }

        /* renamed from: b */
        public boolean areItemsTheSame(User user, User user2) {
            C13706o.m87929f(user, "oldItem");
            C13706o.m87929f(user2, "newItem");
            return user.getUserId() == user2.getUserId();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5558b(C5331h hVar, List<C4443v> list, List<C4391d> list2, C16269p<? super User, ? super AvatarView, C13339u> pVar) {
        super(new C5559a());
        C13706o.m87929f(hVar, "profileImageProvider");
        C13706o.m87929f(list, "userSubscriptions");
        C13706o.m87929f(list2, "blockedUsers");
        C13706o.m87929f(pVar, "userClickHandler");
        this.f13520a = hVar;
        this.f13521b = list;
        this.f13522c = list2;
        this.f13523d = pVar;
    }

    /* renamed from: B */
    public void onBindViewHolder(C5556a aVar, int i) {
        C13706o.m87929f(aVar, "holder");
        Object item = getItem(i);
        C13706o.m87926c(item);
        User user = (User) item;
        List<C4443v> list = this.f13521b;
        ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
        for (C4443v a : list) {
            arrayList.add(Integer.valueOf(a.mo28794a()));
        }
        boolean contains = arrayList.contains(Integer.valueOf(user.getUserId()));
        List<C4391d> list2 = this.f13522c;
        ArrayList arrayList2 = new ArrayList(C13616u.m87774u(list2, 10));
        for (C4391d a2 : list2) {
            arrayList2.add(Integer.valueOf(a2.mo28713a()));
        }
        aVar.mo30812u(user, i % 2 == 0, contains, arrayList2.contains(Integer.valueOf(user.getUserId())));
    }

    /* renamed from: C */
    public C5556a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.item_templates_user, viewGroup, false);
        C13706o.m87928e(inflate, "view");
        return new C5556a(inflate, this.f13520a, this.f13523d);
    }

    /* renamed from: D */
    public final void mo30816D(List<C4391d> list) {
        C13706o.m87929f(list, "blockedUsers");
        this.f13522c = list;
    }

    /* renamed from: E */
    public final void mo30817E(List<C4443v> list) {
        C13706o.m87929f(list, "userSubscriptions");
        this.f13521b = list;
    }
}
