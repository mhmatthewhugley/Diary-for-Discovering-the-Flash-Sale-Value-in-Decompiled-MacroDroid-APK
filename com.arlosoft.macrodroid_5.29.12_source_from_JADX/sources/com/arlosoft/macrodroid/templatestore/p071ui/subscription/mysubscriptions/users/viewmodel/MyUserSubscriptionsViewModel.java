package com.arlosoft.macrodroid.templatestore.p071ui.subscription.mysubscriptions.users.viewmodel;

import androidx.lifecycle.C0736a;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.arlosoft.macrodroid.avatar.views.AvatarView;
import com.arlosoft.macrodroid.database.room.C4443v;
import com.arlosoft.macrodroid.database.room.C4445w;
import com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13654b;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import p176v0.C10312a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.mysubscriptions.users.viewmodel.MyUserSubscriptionsViewModel */
/* compiled from: MyUserSubscriptionsViewModel.kt */
public final class MyUserSubscriptionsViewModel extends ViewModel implements DefaultLifecycleObserver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final MacroDroidRoomDatabase f13269a;

    /* renamed from: c */
    private final C10312a f13270c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final MutableLiveData<Boolean> f13271d;

    /* renamed from: f */
    private final LiveData<Boolean> f13272f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final MutableLiveData<List<C4443v>> f13273g;

    /* renamed from: o */
    private final LiveData<List<C4443v>> f13274o;

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.mysubscriptions.users.viewmodel.MyUserSubscriptionsViewModel$a */
    /* compiled from: MyUserSubscriptionsViewModel.kt */
    static final class C5395a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ MyUserSubscriptionsViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5395a(MyUserSubscriptionsViewModel myUserSubscriptionsViewModel, C13635d<? super C5395a> dVar) {
            super(2, dVar);
            this.this$0 = myUserSubscriptionsViewModel;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5395a(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5395a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                this.this$0.f13271d.postValue(C13654b.m87833a(true));
                C4445w h = this.this$0.f13269a.mo28682h();
                this.label = 1;
                obj = h.mo28802c(this);
                if (obj == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.f13273g.postValue((List) obj);
            this.this$0.f13271d.postValue(C13654b.m87833a(false));
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.mysubscriptions.users.viewmodel.MyUserSubscriptionsViewModel$b */
    /* compiled from: MyUserSubscriptionsViewModel.kt */
    static final class C5396b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Task<Void> $task;
        final /* synthetic */ C4443v $userSubscription;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5396b(Task<Void> task, C4443v vVar, C13635d<? super C5396b> dVar) {
            super(2, dVar);
            this.$task = task;
            this.$userSubscription = vVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5396b(this.$task, this.$userSubscription, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5396b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                if (this.$task.mo23719t()) {
                    C4878b.m18879r("Unsubscribed from user: " + this.$userSubscription.mo28796c());
                } else {
                    C4878b.m18864c("Unsubscribe failed for user: " + this.$userSubscription.mo28796c());
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.mysubscriptions.users.viewmodel.MyUserSubscriptionsViewModel$c */
    /* compiled from: MyUserSubscriptionsViewModel.kt */
    static final class C5397c extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4443v $userSubscription;
        int label;
        final /* synthetic */ MyUserSubscriptionsViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5397c(MyUserSubscriptionsViewModel myUserSubscriptionsViewModel, C4443v vVar, C13635d<? super C5397c> dVar) {
            super(2, dVar);
            this.this$0 = myUserSubscriptionsViewModel;
            this.$userSubscription = vVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5397c(this.this$0, this.$userSubscription, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5397c) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C4445w h = this.this$0.f13269a.mo28682h();
                int a = this.$userSubscription.mo28794a();
                this.label = 1;
                if (h.mo28803d(a, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MutableLiveData j = this.this$0.f13273g;
            Object value = this.this$0.f13273g.getValue();
            C13706o.m87926c(value);
            List I0 = C13566b0.m87405I0((Collection) value);
            C4443v vVar = this.$userSubscription;
            ArrayList arrayList = new ArrayList();
            for (Object next : I0) {
                if (!C13706o.m87924a((C4443v) next, vVar)) {
                    arrayList.add(next);
                }
            }
            j.postValue(arrayList);
            return C13339u.f61331a;
        }
    }

    public MyUserSubscriptionsViewModel(MacroDroidRoomDatabase macroDroidRoomDatabase, C10312a aVar) {
        C13706o.m87929f(macroDroidRoomDatabase, "roomDatabase");
        C13706o.m87929f(aVar, "screenLoader");
        this.f13269a = macroDroidRoomDatabase;
        this.f13270c = aVar;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.f13271d = mutableLiveData;
        this.f13272f = mutableLiveData;
        MutableLiveData<List<C4443v>> mutableLiveData2 = new MutableLiveData<>();
        this.f13273g = mutableLiveData2;
        this.f13274o = mutableLiveData2;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final void m20837p(MyUserSubscriptionsViewModel myUserSubscriptionsViewModel, C4443v vVar, Task task) {
        C13706o.m87929f(myUserSubscriptionsViewModel, "this$0");
        C13706o.m87929f(vVar, "$userSubscription");
        C13706o.m87929f(task, "task");
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(myUserSubscriptionsViewModel), C15186a1.m93730b(), (C15486m0) null, new C5396b(task, vVar, (C13635d<? super C5396b>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m20838q(C4443v vVar, Exception exc) {
        C13706o.m87929f(vVar, "$userSubscription");
        C13706o.m87929f(exc, "exception");
        C4878b.m18864c("Unsubscribe failed for user: " + vVar.mo28796c() + " failure = " + exc);
    }

    /* renamed from: k */
    public final void mo30582k(int i) {
        List value = this.f13274o.getValue();
        C4443v vVar = value != null ? (C4443v) value.get(i) : null;
        if (vVar != null) {
            mo30586o(vVar);
        }
    }

    /* renamed from: l */
    public final LiveData<List<C4443v>> mo30583l() {
        return this.f13274o;
    }

    /* renamed from: m */
    public final LiveData<Boolean> mo30584m() {
        return this.f13272f;
    }

    /* renamed from: n */
    public final void mo30585n(C4443v vVar) {
        C13706o.m87929f(vVar, "user");
        C10312a.m40505l(this.f13270c, vVar.mo28796c(), vVar.mo28795b(), vVar.mo28794a(), (AvatarView) null, 8, (Object) null);
    }

    /* renamed from: o */
    public final void mo30586o(C4443v vVar) {
        C13706o.m87929f(vVar, "userSubscription");
        FirebaseMessaging n = FirebaseMessaging.m76862n();
        n.mo63347K("user-" + vVar.mo28794a()).mo23702c(new C5398a(this, vVar)).mo23705f(new C5399b(vVar));
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), C15186a1.m93730b(), (C15486m0) null, new C5397c(this, vVar, (C13635d<? super C5397c>) null), 2, (Object) null);
    }

    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C0736a.m539a(this, lifecycleOwner);
    }

    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C0736a.m540b(this, lifecycleOwner);
    }

    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C0736a.m541c(this, lifecycleOwner);
    }

    public void onResume(LifecycleOwner lifecycleOwner) {
        C13706o.m87929f(lifecycleOwner, "owner");
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), C15186a1.m93730b(), (C15486m0) null, new C5395a(this, (C13635d<? super C5395a>) null), 2, (Object) null);
    }

    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C0736a.m543e(this, lifecycleOwner);
    }

    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C0736a.m544f(this, lifecycleOwner);
    }
}
