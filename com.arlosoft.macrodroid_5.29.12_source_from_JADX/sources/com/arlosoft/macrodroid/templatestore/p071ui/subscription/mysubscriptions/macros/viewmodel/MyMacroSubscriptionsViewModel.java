package com.arlosoft.macrodroid.templatestore.p071ui.subscription.mysubscriptions.macros.viewmodel;

import androidx.lifecycle.C0736a;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.arlosoft.macrodroid.database.room.C4407l;
import com.arlosoft.macrodroid.database.room.C4409m;
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

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.mysubscriptions.macros.viewmodel.MyMacroSubscriptionsViewModel */
/* compiled from: MyMacroSubscriptionsViewModel.kt */
public final class MyMacroSubscriptionsViewModel extends ViewModel implements DefaultLifecycleObserver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final MacroDroidRoomDatabase f13243a;

    /* renamed from: c */
    private final C10312a f13244c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final MutableLiveData<Boolean> f13245d;

    /* renamed from: f */
    private final LiveData<Boolean> f13246f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final MutableLiveData<List<C4407l>> f13247g;

    /* renamed from: o */
    private final LiveData<List<C4407l>> f13248o;

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.mysubscriptions.macros.viewmodel.MyMacroSubscriptionsViewModel$a */
    /* compiled from: MyMacroSubscriptionsViewModel.kt */
    static final class C5378a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ MyMacroSubscriptionsViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5378a(MyMacroSubscriptionsViewModel myMacroSubscriptionsViewModel, C13635d<? super C5378a> dVar) {
            super(2, dVar);
            this.this$0 = myMacroSubscriptionsViewModel;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5378a(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5378a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                this.this$0.f13245d.postValue(C13654b.m87833a(true));
                C4409m e = this.this$0.f13243a.mo28679e();
                this.label = 1;
                obj = e.mo28744d(this);
                if (obj == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.f13247g.postValue((List) obj);
            this.this$0.f13245d.postValue(C13654b.m87833a(false));
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.mysubscriptions.macros.viewmodel.MyMacroSubscriptionsViewModel$b */
    /* compiled from: MyMacroSubscriptionsViewModel.kt */
    static final class C5379b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4407l $macroSubscription;
        int label;
        final /* synthetic */ MyMacroSubscriptionsViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5379b(MyMacroSubscriptionsViewModel myMacroSubscriptionsViewModel, C4407l lVar, C13635d<? super C5379b> dVar) {
            super(2, dVar);
            this.this$0 = myMacroSubscriptionsViewModel;
            this.$macroSubscription = lVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5379b(this.this$0, this.$macroSubscription, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5379b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C4409m e = this.this$0.f13243a.mo28679e();
                int a = this.$macroSubscription.mo28736a();
                this.label = 1;
                if (e.mo28743c(a, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MutableLiveData j = this.this$0.f13247g;
            Object value = this.this$0.f13247g.getValue();
            C13706o.m87926c(value);
            List I0 = C13566b0.m87405I0((Collection) value);
            C4407l lVar = this.$macroSubscription;
            ArrayList arrayList = new ArrayList();
            for (Object next : I0) {
                if (!C13706o.m87924a((C4407l) next, lVar)) {
                    arrayList.add(next);
                }
            }
            j.postValue(arrayList);
            return C13339u.f61331a;
        }
    }

    public MyMacroSubscriptionsViewModel(MacroDroidRoomDatabase macroDroidRoomDatabase, C10312a aVar) {
        C13706o.m87929f(macroDroidRoomDatabase, "roomDatabase");
        C13706o.m87929f(aVar, "screenLoader");
        this.f13243a = macroDroidRoomDatabase;
        this.f13244c = aVar;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.f13245d = mutableLiveData;
        this.f13246f = mutableLiveData;
        MutableLiveData<List<C4407l>> mutableLiveData2 = new MutableLiveData<>();
        this.f13247g = mutableLiveData2;
        this.f13248o = mutableLiveData2;
    }

    /* renamed from: n */
    private final void m20794n(int i) {
        this.f13244c.mo40932g(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m20795q(C4407l lVar, Task task) {
        C13706o.m87929f(lVar, "$macroSubscription");
        C13706o.m87929f(task, "task");
        if (task.mo23719t()) {
            C4878b.m18879r("Unsubscribed from macro: " + lVar.mo28737b());
            return;
        }
        C4878b.m18864c("Unsubscribe failed for macro: " + lVar.mo28737b());
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final void m20796r(C4407l lVar, Exception exc) {
        C13706o.m87929f(lVar, "$macroSubscription");
        C13706o.m87929f(exc, "exception");
        C4878b.m18864c("Unsubscribe failed for macro: " + lVar.mo28737b());
    }

    /* renamed from: k */
    public final void mo30562k(int i) {
        List value = this.f13248o.getValue();
        C4407l lVar = value != null ? (C4407l) value.get(i) : null;
        if (lVar != null) {
            mo30566p(lVar);
        }
    }

    /* renamed from: l */
    public final LiveData<List<C4407l>> mo30563l() {
        return this.f13248o;
    }

    /* renamed from: m */
    public final LiveData<Boolean> mo30564m() {
        return this.f13246f;
    }

    /* renamed from: o */
    public final void mo30565o(C4407l lVar) {
        C13706o.m87929f(lVar, "macro");
        m20794n(lVar.mo28736a());
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
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), C15186a1.m93730b(), (C15486m0) null, new C5378a(this, (C13635d<? super C5378a>) null), 2, (Object) null);
    }

    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C0736a.m543e(this, lifecycleOwner);
    }

    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C0736a.m544f(this, lifecycleOwner);
    }

    /* renamed from: p */
    public final void mo30566p(C4407l lVar) {
        C13706o.m87929f(lVar, "macroSubscription");
        FirebaseMessaging n = FirebaseMessaging.m76862n();
        n.mo63347K("macro-" + lVar.mo28736a()).mo23702c(new C5380a(lVar)).mo23705f(new C5381b(lVar));
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), C15186a1.m93730b(), (C15486m0) null, new C5379b(this, lVar, (C13635d<? super C5379b>) null), 2, (Object) null);
    }
}
