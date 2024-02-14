package com.arlosoft.macrodroid.templatestore.p071ui.userlist;

import androidx.core.app.NotificationCompat;
import androidx.paging.PagedList;
import com.arlosoft.macrodroid.avatar.views.AvatarView;
import com.arlosoft.macrodroid.templatestore.events.UserBlockedEvent;
import com.arlosoft.macrodroid.templatestore.model.User;
import com.arlosoft.macrodroid.templatestore.p071ui.C5274a;
import com.arlosoft.macrodroid.templatestore.p071ui.C5275b;
import com.arlosoft.macrodroid.templatestore.p071ui.upload.C5496a;
import kotlin.jvm.internal.C13706o;
import p094g3.C7332k;
import p161s1.C10180a;
import p171u0.C10280a;
import p176v0.C10312a;
import p199z2.C10434a;
import p448z9.C17070a;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.userlist.g */
/* compiled from: UserListPresenter.kt */
public final class C5571g extends C10280a<C5572h> implements C5274a {

    /* renamed from: c */
    private final C10312a f13534c;

    /* renamed from: d */
    private final C10434a f13535d;

    /* renamed from: f */
    private final C5496a f13536f;

    /* renamed from: g */
    private C17070a f13537g;

    /* renamed from: o */
    private C7332k f13538o;

    /* renamed from: p */
    private C5275b f13539p;

    /* renamed from: s */
    private int f13540s;

    public C5571g(C10312a aVar, C10434a aVar2, C5496a aVar3) {
        C13706o.m87929f(aVar, "screenLoader");
        C13706o.m87929f(aVar2, "api");
        C13706o.m87929f(aVar3, "templateRefreshNotifier");
        this.f13534c = aVar;
        this.f13535d = aVar2;
        this.f13536f = aVar3;
    }

    /* renamed from: q */
    private final boolean m21362q(PagedList<User> pagedList) {
        if (pagedList != null && pagedList.size() == 1) {
            User user = pagedList.get(0);
            if (user != null ? user.isErrorUser() : false) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    private final boolean m21363r(PagedList<User> pagedList) {
        if (pagedList != null && pagedList.size() == 1) {
            User user = pagedList.get(0);
            if (user != null ? user.isPirateUser() : false) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static final void m21364t(C5571g gVar, C5572h hVar, PagedList pagedList) {
        C13706o.m87929f(gVar, "this$0");
        C13706o.m87929f(hVar, "$it");
        if (gVar.m21362q(pagedList)) {
            hVar.mo30828q();
        } else if (gVar.m21363r(pagedList)) {
            hVar.mo30824d0();
        } else {
            C13706o.m87928e(pagedList, "list");
            if (!pagedList.isEmpty()) {
                hVar.mo30830x(false);
                hVar.mo30823b(pagedList);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static final void m21365u(C5571g gVar, Boolean bool) {
        C13706o.m87929f(gVar, "this$0");
        gVar.mo30839s();
    }

    /* renamed from: L */
    public void mo30432L(String str) {
        C13706o.m87929f(str, "searchTerm");
        mo30839s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo27412l() {
        C17070a aVar = this.f13537g;
        if (aVar == null) {
            C13706o.m87945v("compositeDisposable");
            aVar = null;
        }
        aVar.mo80337d();
        this.f13539p = null;
        C10180a.m40075a().mo80020p(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo27413m() {
        this.f13537g = new C17070a();
        mo30839s();
        C5275b bVar = this.f13539p;
        if (bVar != null) {
            bVar.mo30411Y(this);
        }
        C17070a aVar = this.f13537g;
        if (aVar == null) {
            C13706o.m87945v("compositeDisposable");
            aVar = null;
        }
        aVar.mo62358a(this.f13536f.mo30748b().mo79670q(new C5570f(this)));
        C10180a.m40075a().mo80019m(this);
    }

    public final void onEventMainThread(UserBlockedEvent userBlockedEvent) {
        C13706o.m87929f(userBlockedEvent, NotificationCompat.CATEGORY_EVENT);
        C5572h hVar = (C5572h) mo40890k();
        if (hVar != null) {
            hVar.refresh();
        }
    }

    /* renamed from: s */
    public final void mo30839s() {
        String str;
        C10434a aVar = this.f13535d;
        C5275b bVar = this.f13539p;
        if (bVar == null || (str = bVar.mo30419z()) == null) {
            str = "";
        }
        this.f13538o = new C7332k(aVar, str);
        C5572h hVar = (C5572h) mo40890k();
        if (hVar != null) {
            hVar.mo30830x(true);
        }
        C5572h hVar2 = (C5572h) mo40890k();
        if (hVar2 != null) {
            hVar2.mo30827l0();
        }
        C5572h hVar3 = (C5572h) mo40890k();
        if (hVar3 != null) {
            C7332k kVar = this.f13538o;
            if (kVar == null) {
                C13706o.m87945v("userViewModel");
                kVar = null;
            }
            kVar.mo37296f().observe(hVar3, new C5569e(this, hVar3));
        }
    }

    /* renamed from: v */
    public final void mo30840v(User user, AvatarView avatarView) {
        C13706o.m87929f(user, "user");
        C13706o.m87929f(avatarView, "avatarImage");
        this.f13534c.mo40936k(user.getUsername(), user.getImage(), user.getUserId(), avatarView);
    }

    /* renamed from: w */
    public final void mo30841w(C5572h hVar, C5275b bVar, int i) {
        C13706o.m87929f(hVar, "view");
        C13706o.m87929f(bVar, "searchTermProvider");
        this.f13539p = bVar;
        this.f13540s = i;
        super.mo40891n(hVar);
    }
}
