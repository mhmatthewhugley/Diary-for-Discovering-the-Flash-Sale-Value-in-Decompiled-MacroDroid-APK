package com.arlosoft.macrodroid.templatestore.p071ui.userlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.avatar.views.AvatarView;
import com.arlosoft.macrodroid.database.room.C4391d;
import com.arlosoft.macrodroid.database.room.C4443v;
import com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.templatestore.model.User;
import com.arlosoft.macrodroid.templatestore.p071ui.C5275b;
import com.arlosoft.macrodroid.templatestore.p071ui.C5314g;
import com.arlosoft.macrodroid.templatestore.p071ui.profile.C5331h;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import p154r0.C8184d;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.userlist.c */
/* compiled from: UserListFragment.kt */
public final class C5560c extends C8184d implements C5572h, C5314g {

    /* renamed from: z */
    public static final C5561a f13524z = new C5561a((C13695i) null);

    /* renamed from: d */
    public C5571g f13525d;

    /* renamed from: f */
    public C5331h f13526f;

    /* renamed from: g */
    public C5527g f13527g;

    /* renamed from: o */
    public MacroDroidRoomDatabase f13528o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C5558b f13529p;

    /* renamed from: s */
    public Map<Integer, View> f13530s = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.userlist.c$a */
    /* compiled from: UserListFragment.kt */
    public static final class C5561a {
        private C5561a() {
        }

        public /* synthetic */ C5561a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C5560c mo30831a() {
            return new C5560c();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.userlist.c$b */
    /* compiled from: UserListFragment.kt */
    static final class C5562b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ C5560c this$0;

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.userlist.c$b$a */
        /* compiled from: UserListFragment.kt */
        static final class C5563a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ List<C4391d> $blockedUsers;
            final /* synthetic */ List<C4443v> $userSubscriptions;
            int label;
            final /* synthetic */ C5560c this$0;

            /* renamed from: com.arlosoft.macrodroid.templatestore.ui.userlist.c$b$a$a */
            /* compiled from: UserListFragment.kt */
            static final class C5564a extends C13708q implements C16269p<User, AvatarView, C13339u> {
                final /* synthetic */ C5560c this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C5564a(C5560c cVar) {
                    super(2);
                    this.this$0 = cVar;
                }

                /* renamed from: a */
                public final void mo30834a(User user, AvatarView avatarView) {
                    C13706o.m87929f(user, "user");
                    C13706o.m87929f(avatarView, "avatarView");
                    this.this$0.mo30821Z().mo30840v(user, avatarView);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    mo30834a((User) obj, (AvatarView) obj2);
                    return C13339u.f61331a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5563a(C5560c cVar, List<C4443v> list, List<C4391d> list2, C13635d<? super C5563a> dVar) {
                super(2, dVar);
                this.this$0 = cVar;
                this.$userSubscriptions = list;
                this.$blockedUsers = list2;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C5563a(this.this$0, this.$userSubscriptions, this.$blockedUsers, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C5563a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C5560c cVar = this.this$0;
                    cVar.f13529p = new C5558b(cVar.mo30822a0(), this.$userSubscriptions, this.$blockedUsers, new C5564a(this.this$0));
                    RecyclerView recyclerView = (RecyclerView) this.this$0.mo30820V(C17532R$id.updatesList);
                    C5558b W = this.this$0.f13529p;
                    if (W == null) {
                        C13706o.m87945v("adapter");
                        W = null;
                    }
                    recyclerView.setAdapter(W);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5562b(C5560c cVar, C13635d<? super C5562b> dVar) {
            super(2, dVar);
            this.this$0 = cVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5562b(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5562b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x006f A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r1 = r7.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0029
                if (r1 == r4) goto L_0x0025
                if (r1 == r3) goto L_0x001d
                if (r1 != r2) goto L_0x0015
                p297ja.C13332o.m85685b(r8)
                goto L_0x0070
            L_0x0015:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x001d:
                java.lang.Object r1 = r7.L$0
                java.util.List r1 = (java.util.List) r1
                p297ja.C13332o.m85685b(r8)
                goto L_0x0057
            L_0x0025:
                p297ja.C13332o.m85685b(r8)
                goto L_0x003f
            L_0x0029:
                p297ja.C13332o.m85685b(r8)
                com.arlosoft.macrodroid.templatestore.ui.userlist.c r8 = r7.this$0
                com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase r8 = r8.mo30825e0()
                com.arlosoft.macrodroid.database.room.w r8 = r8.mo28682h()
                r7.label = r4
                java.lang.Object r8 = r8.mo28802c(r7)
                if (r8 != r0) goto L_0x003f
                return r0
            L_0x003f:
                r1 = r8
                java.util.List r1 = (java.util.List) r1
                com.arlosoft.macrodroid.templatestore.ui.userlist.c r8 = r7.this$0
                com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase r8 = r8.mo30825e0()
                com.arlosoft.macrodroid.database.room.e r8 = r8.mo28678d()
                r7.L$0 = r1
                r7.label = r3
                java.lang.Object r8 = r8.mo28718a(r7)
                if (r8 != r0) goto L_0x0057
                return r0
            L_0x0057:
                java.util.List r8 = (java.util.List) r8
                kotlinx.coroutines.h2 r3 = kotlinx.coroutines.C15186a1.m93731c()
                com.arlosoft.macrodroid.templatestore.ui.userlist.c$b$a r4 = new com.arlosoft.macrodroid.templatestore.ui.userlist.c$b$a
                com.arlosoft.macrodroid.templatestore.ui.userlist.c r5 = r7.this$0
                r6 = 0
                r4.<init>(r5, r1, r8, r6)
                r7.L$0 = r6
                r7.label = r2
                java.lang.Object r8 = kotlinx.coroutines.C15414h.m94298g(r3, r4, r7)
                if (r8 != r0) goto L_0x0070
                return r0
            L_0x0070:
                ja.u r8 = p297ja.C13339u.f61331a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.templatestore.p071ui.userlist.C5560c.C5562b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.userlist.c$c */
    /* compiled from: UserListFragment.kt */
    static final class C5565c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ C5560c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5565c(C5560c cVar, C13635d<? super C5565c> dVar) {
            super(3, dVar);
            this.this$0 = cVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5565c(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.mo30821Z().mo30839s();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.userlist.c$d */
    /* compiled from: UserListFragment.kt */
    static final class C5566d extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ C5560c this$0;

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.userlist.c$d$a */
        /* compiled from: UserListFragment.kt */
        static final class C5567a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            int label;
            final /* synthetic */ C5560c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5567a(C5560c cVar, C13635d<? super C5567a> dVar) {
                super(2, dVar);
                this.this$0 = cVar;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C5567a(this.this$0, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C5567a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C5558b W = this.this$0.f13529p;
                    if (W == null) {
                        C13706o.m87945v("adapter");
                        W = null;
                    }
                    W.notifyDataSetChanged();
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5566d(C5560c cVar, C13635d<? super C5566d> dVar) {
            super(2, dVar);
            this.this$0 = cVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5566d(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5566d) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0090 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r1 = r6.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x002a
                if (r1 == r4) goto L_0x0026
                if (r1 == r3) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                p297ja.C13332o.m85685b(r7)
                goto L_0x0091
            L_0x0016:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001e:
                java.lang.Object r1 = r6.L$0
                java.util.List r1 = (java.util.List) r1
                p297ja.C13332o.m85685b(r7)
                goto L_0x0058
            L_0x0026:
                p297ja.C13332o.m85685b(r7)
                goto L_0x0040
            L_0x002a:
                p297ja.C13332o.m85685b(r7)
                com.arlosoft.macrodroid.templatestore.ui.userlist.c r7 = r6.this$0
                com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase r7 = r7.mo30825e0()
                com.arlosoft.macrodroid.database.room.w r7 = r7.mo28682h()
                r6.label = r4
                java.lang.Object r7 = r7.mo28802c(r6)
                if (r7 != r0) goto L_0x0040
                return r0
            L_0x0040:
                r1 = r7
                java.util.List r1 = (java.util.List) r1
                com.arlosoft.macrodroid.templatestore.ui.userlist.c r7 = r6.this$0
                com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase r7 = r7.mo30825e0()
                com.arlosoft.macrodroid.database.room.e r7 = r7.mo28678d()
                r6.L$0 = r1
                r6.label = r3
                java.lang.Object r7 = r7.mo28718a(r6)
                if (r7 != r0) goto L_0x0058
                return r0
            L_0x0058:
                java.util.List r7 = (java.util.List) r7
                com.arlosoft.macrodroid.templatestore.ui.userlist.c r3 = r6.this$0
                com.arlosoft.macrodroid.templatestore.ui.userlist.b r3 = r3.f13529p
                java.lang.String r4 = "adapter"
                r5 = 0
                if (r3 != 0) goto L_0x0069
                kotlin.jvm.internal.C13706o.m87945v(r4)
                r3 = r5
            L_0x0069:
                r3.mo30817E(r1)
                com.arlosoft.macrodroid.templatestore.ui.userlist.c r1 = r6.this$0
                com.arlosoft.macrodroid.templatestore.ui.userlist.b r1 = r1.f13529p
                if (r1 != 0) goto L_0x0078
                kotlin.jvm.internal.C13706o.m87945v(r4)
                r1 = r5
            L_0x0078:
                r1.mo30816D(r7)
                kotlinx.coroutines.h2 r7 = kotlinx.coroutines.C15186a1.m93731c()
                com.arlosoft.macrodroid.templatestore.ui.userlist.c$d$a r1 = new com.arlosoft.macrodroid.templatestore.ui.userlist.c$d$a
                com.arlosoft.macrodroid.templatestore.ui.userlist.c r3 = r6.this$0
                r1.<init>(r3, r5)
                r6.L$0 = r5
                r6.label = r2
                java.lang.Object r7 = kotlinx.coroutines.C15414h.m94298g(r7, r1, r6)
                if (r7 != r0) goto L_0x0091
                return r0
            L_0x0091:
                ja.u r7 = p297ja.C13339u.f61331a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.templatestore.p071ui.userlist.C5560c.C5566d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: R */
    public void mo30501R() {
        ((RecyclerView) mo30820V(C17532R$id.updatesList)).smoothScrollToPosition(0);
    }

    /* renamed from: U */
    public void mo26239U() {
        this.f13530s.clear();
    }

    /* renamed from: V */
    public View mo30820V(int i) {
        View findViewById;
        Map<Integer, View> map = this.f13530s;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: Z */
    public final C5571g mo30821Z() {
        C5571g gVar = this.f13525d;
        if (gVar != null) {
            return gVar;
        }
        C13706o.m87945v("presenter");
        return null;
    }

    /* renamed from: a0 */
    public final C5331h mo30822a0() {
        C5331h hVar = this.f13526f;
        if (hVar != null) {
            return hVar;
        }
        C13706o.m87945v("profileImageProvider");
        return null;
    }

    /* renamed from: b */
    public void mo30823b(PagedList<User> pagedList) {
        LinearLayout linearLayout = (LinearLayout) mo30820V(C17532R$id.emptyView);
        C13706o.m87928e(linearLayout, "emptyView");
        boolean z = true;
        linearLayout.setVisibility(pagedList != null && pagedList.isEmpty() ? 0 : 8);
        if (pagedList == null || pagedList.isEmpty()) {
            z = false;
        }
        if (z) {
            C5558b bVar = this.f13529p;
            if (bVar == null) {
                C13706o.m87945v("adapter");
                bVar = null;
            }
            bVar.submitList(pagedList);
        }
    }

    /* renamed from: d0 */
    public void mo30824d0() {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) mo30820V(C17532R$id.loadingView);
        C13706o.m87928e(lottieAnimationView, "loadingView");
        lottieAnimationView.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) mo30820V(C17532R$id.emptyView);
        C13706o.m87928e(linearLayout, "emptyView");
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) mo30820V(C17532R$id.errorView);
        C13706o.m87928e(linearLayout2, "errorView");
        linearLayout2.setVisibility(8);
        LinearLayout linearLayout3 = (LinearLayout) mo30820V(C17532R$id.pirateView);
        C13706o.m87928e(linearLayout3, "pirateView");
        linearLayout3.setVisibility(0);
    }

    /* renamed from: e0 */
    public final MacroDroidRoomDatabase mo30825e0() {
        MacroDroidRoomDatabase macroDroidRoomDatabase = this.f13528o;
        if (macroDroidRoomDatabase != null) {
            return macroDroidRoomDatabase;
        }
        C13706o.m87945v("roomDatabase");
        return null;
    }

    /* renamed from: f0 */
    public final C5527g mo30826f0() {
        C5527g gVar = this.f13527g;
        if (gVar != null) {
            return gVar;
        }
        C13706o.m87945v("userProvider");
        return null;
    }

    /* renamed from: l0 */
    public void mo30827l0() {
        C15561w1 unused = C15473j.m94492d(LifecycleOwnerKt.getLifecycleScope(this), C15186a1.m93730b(), (C15486m0) null, new C5562b(this, (C13635d<? super C5562b>) null), 2, (Object) null);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ViewCompat.setNestedScrollingEnabled((RecyclerView) mo30820V(C17532R$id.updatesList), false);
        C5571g Z = mo30821Z();
        Fragment parentFragment = getParentFragment();
        C13706o.m87927d(parentFragment, "null cannot be cast to non-null type com.arlosoft.macrodroid.templatestore.ui.SearchTermProvider");
        Z.mo30841w(this, (C5275b) parentFragment, mo30826f0().mo30790b().getUserId());
        AppCompatButton appCompatButton = (AppCompatButton) mo30820V(C17532R$id.retryButton);
        C13706o.m87928e(appCompatButton, "retryButton");
        C4666m.m18147o(appCompatButton, (C13640g) null, new C5565c(this, (C13635d<? super C5565c>) null), 1, (Object) null);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13706o.m87929f(layoutInflater, "inflater");
        return layoutInflater.inflate(C17535R$layout.fragment_template_store_list_no_swipe_refresh, viewGroup, false);
    }

    public void onDestroyView() {
        super.onDestroyView();
        mo30821Z().mo40889j();
        mo26239U();
    }

    public void onResume() {
        super.onResume();
        refresh();
    }

    /* renamed from: q */
    public void mo30828q() {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) mo30820V(C17532R$id.loadingView);
        C13706o.m87928e(lottieAnimationView, "loadingView");
        lottieAnimationView.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) mo30820V(C17532R$id.emptyView);
        C13706o.m87928e(linearLayout, "emptyView");
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) mo30820V(C17532R$id.errorView);
        C13706o.m87928e(linearLayout2, "errorView");
        linearLayout2.setVisibility(0);
        LinearLayout linearLayout3 = (LinearLayout) mo30820V(C17532R$id.pirateView);
        C13706o.m87928e(linearLayout3, "pirateView");
        linearLayout3.setVisibility(8);
    }

    public void refresh() {
        if (this.f13529p != null) {
            C15561w1 unused = C15473j.m94492d(LifecycleOwnerKt.getLifecycleScope(this), C15186a1.m93730b(), (C15486m0) null, new C5566d(this, (C13635d<? super C5566d>) null), 2, (Object) null);
        }
    }

    /* renamed from: x */
    public void mo30830x(boolean z) {
        LinearLayout linearLayout = (LinearLayout) mo30820V(C17532R$id.emptyView);
        C13706o.m87928e(linearLayout, "emptyView");
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) mo30820V(C17532R$id.errorView);
        C13706o.m87928e(linearLayout2, "errorView");
        linearLayout2.setVisibility(8);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) mo30820V(C17532R$id.loadingView);
        C13706o.m87928e(lottieAnimationView, "loadingView");
        lottieAnimationView.setVisibility(z ? 0 : 8);
        LinearLayout linearLayout3 = (LinearLayout) mo30820V(C17532R$id.pirateView);
        C13706o.m87928e(linearLayout3, "pirateView");
        linearLayout3.setVisibility(8);
    }
}
