package com.arlosoft.macrodroid.actionblock.list;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.actionblock.list.C3752c;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4915a;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.EmptyTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6388h1;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* compiled from: ActionBlockListViewModel.kt */
public final class ActionBlockListViewModel extends ViewModel implements C3751b, LifecycleObserver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4915a f9817a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final MutableLiveData<List<ActionBlock>> f9818c;

    /* renamed from: d */
    private final LiveData<List<ActionBlock>> f9819d;

    /* renamed from: f */
    private final C6388h1<C3752c> f9820f = new C6388h1<>();

    /* renamed from: g */
    private final C6388h1<ActionBlock> f9821g = new C6388h1<>();

    /* renamed from: o */
    private final C6388h1<Macro> f9822o = new C6388h1<>();

    /* renamed from: p */
    private boolean f9823p;

    /* renamed from: com.arlosoft.macrodroid.actionblock.list.ActionBlockListViewModel$a */
    /* compiled from: ActionBlockListViewModel.kt */
    static final class C3748a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ ActionBlockListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3748a(ActionBlockListViewModel actionBlockListViewModel, C13635d<? super C3748a> dVar) {
            super(2, dVar);
            this.this$0 = actionBlockListViewModel;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C3748a(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C3748a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                ActionBlock a = ActionBlock.Companion.mo27135a();
                this.this$0.f9817a.mo29647e(a);
                this.this$0.mo27238i().postValue(new C3752c.C3753a(a));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.list.ActionBlockListViewModel$b */
    /* compiled from: ActionBlockListViewModel.kt */
    static final class C3749b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ ActionBlockListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3749b(ActionBlockListViewModel actionBlockListViewModel, C13635d<? super C3749b> dVar) {
            super(2, dVar);
            this.this$0 = actionBlockListViewModel;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C3749b(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C3749b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                List<ActionBlock> i = this.this$0.f9817a.mo29651i();
                MutableLiveData g = this.this$0.f9818c;
                ArrayList arrayList = new ArrayList();
                for (T next : i) {
                    if (!((ActionBlock) next).getIsBeingImported()) {
                        arrayList.add(next);
                    }
                }
                g.postValue(arrayList);
                ArrayList<ActionBlock> arrayList2 = new ArrayList<>();
                for (T next2 : i) {
                    if (((ActionBlock) next2).getIsBeingImported()) {
                        arrayList2.add(next2);
                    }
                }
                ActionBlockListViewModel actionBlockListViewModel = this.this$0;
                for (ActionBlock d : arrayList2) {
                    actionBlockListViewModel.f9817a.mo29646d(d);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public ActionBlockListViewModel(C4915a aVar) {
        C13706o.m87929f(aVar, "actionBlockStore");
        this.f9817a = aVar;
        MutableLiveData<List<ActionBlock>> mutableLiveData = new MutableLiveData<>();
        this.f9818c = mutableLiveData;
        this.f9819d = mutableLiveData;
    }

    /* renamed from: a */
    public void mo27234a(Macro macro) {
        C13706o.m87929f(macro, "macro");
        this.f9822o.postValue(macro);
    }

    /* renamed from: b */
    public void mo27235b(ActionBlock actionBlock) {
        C13706o.m87929f(actionBlock, "actionBlock");
        if (this.f9823p) {
            this.f9821g.postValue(actionBlock);
        } else {
            this.f9820f.postValue(new C3752c.C3754b(actionBlock));
        }
    }

    /* renamed from: e */
    public void mo27236e(ActionBlock actionBlock) {
        C13706o.m87929f(actionBlock, "actionBlock");
        this.f9820f.postValue(new C3752c.C3755c(actionBlock));
    }

    /* renamed from: h */
    public final void mo27237h() {
        this.f9817a.mo29643a();
        mo27247q();
    }

    /* renamed from: i */
    public final C6388h1<C3752c> mo27238i() {
        return this.f9820f;
    }

    /* renamed from: j */
    public final LiveData<List<ActionBlock>> mo27239j() {
        return this.f9819d;
    }

    /* renamed from: k */
    public final C6388h1<ActionBlock> mo27240k() {
        return this.f9821g;
    }

    /* renamed from: l */
    public final C6388h1<Macro> mo27241l() {
        return this.f9822o;
    }

    /* renamed from: m */
    public final void mo27242m() {
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), C15186a1.m93730b(), (C15486m0) null, new C3748a(this, (C13635d<? super C3748a>) null), 2, (Object) null);
    }

    /* renamed from: n */
    public final void mo27243n(ActionBlock actionBlock) {
        C13706o.m87929f(actionBlock, "actionBlock");
        this.f9820f.postValue(new C3752c.C3754b(actionBlock.cloneActionBlock(true)));
    }

    /* renamed from: o */
    public final void mo27244o(ActionBlock actionBlock) {
        C13706o.m87929f(actionBlock, "actionBlock");
        this.f9817a.mo29646d(actionBlock);
        mo27247q();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        mo27247q();
    }

    /* renamed from: p */
    public final void mo27246p(ActionBlock actionBlock) {
        C13706o.m87929f(actionBlock, "actionBlock");
        try {
            C4878b.m18874m("Testing Action Block: " + actionBlock.getName(), actionBlock.getGUID());
            TriggerContextInfo triggerContextInfo = new TriggerContextInfo((Trigger) new EmptyTrigger());
            ActionBlock cloneActionBlock = actionBlock.cloneActionBlock(false);
            cloneActionBlock.setIsClonedInstance(true);
            cloneActionBlock.setTriggerThatInvoked((Trigger) null);
            this.f9817a.mo29647e(cloneActionBlock);
            cloneActionBlock.invokeActions(triggerContextInfo, true, (ResumeMacroInfo) null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: q */
    public final void mo27247q() {
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), C15186a1.m93730b(), (C15486m0) null, new C3749b(this, (C13635d<? super C3749b>) null), 2, (Object) null);
    }

    /* renamed from: r */
    public final void mo27248r(boolean z) {
        this.f9823p = z;
    }
}
