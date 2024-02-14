package com.arlosoft.macrodroid.actionblock.edit;

import android.content.res.Resources;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4915a;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.utils.C6388h1;
import com.arlosoft.macrodroid.utils.C6399k1;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13654b;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15423h2;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* compiled from: ActionBlockEditViewModel.kt */
public final class ActionBlockEditViewModel extends ViewModel implements LifecycleObserver {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public String f9757A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f9758B;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4915a f9759a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6399k1 f9760c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Resources f9761d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f9762f = -1;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final MutableLiveData<ActionBlock> f9763g;

    /* renamed from: o */
    private final LiveData<ActionBlock> f9764o;

    /* renamed from: p */
    private final C6388h1<Boolean> f9765p;

    /* renamed from: s */
    private final C6388h1<ActionBlock> f9766s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public String f9767z;

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditViewModel$a */
    /* compiled from: ActionBlockEditViewModel.kt */
    static final class C3708a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ ActionBlock $actionBlock;
        int label;
        final /* synthetic */ ActionBlockEditViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3708a(ActionBlockEditViewModel actionBlockEditViewModel, ActionBlock actionBlock, C13635d<? super C3708a> dVar) {
            super(2, dVar);
            this.this$0 = actionBlockEditViewModel;
            this.$actionBlock = actionBlock;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C3708a(this.this$0, this.$actionBlock, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C3708a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.f9759a.mo29646d(this.$actionBlock);
                C4878b.m18874m("Action Block Deleted - " + this.$actionBlock.getName(), this.$actionBlock.getGUID());
                this.this$0.mo27191q().postValue(C13654b.m87833a(this.this$0.f9758B ^ true));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditViewModel$b */
    /* compiled from: ActionBlockEditViewModel.kt */
    static final class C3709b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ ActionBlockEditViewModel this$0;

        /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditViewModel$b$a */
        /* compiled from: ActionBlockEditViewModel.kt */
        static final class C3710a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            int label;
            final /* synthetic */ ActionBlockEditViewModel this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3710a(ActionBlockEditViewModel actionBlockEditViewModel, C13635d<? super C3710a> dVar) {
                super(2, dVar);
                this.this$0 = actionBlockEditViewModel;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C3710a(this.this$0, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C3710a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C6399k1 i = this.this$0.f9760c;
                    String string = this.this$0.f9761d.getString(C17541R$string.action_block_not_found);
                    C13706o.m87928e(string, "resources.getString(R.st…g.action_block_not_found)");
                    i.mo32440a(string, true);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3709b(ActionBlockEditViewModel actionBlockEditViewModel, C13635d<? super C3709b> dVar) {
            super(2, dVar);
            this.this$0 = actionBlockEditViewModel;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C3709b(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C3709b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            ActionBlock actionBlock;
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                if (this.this$0.f9762f == -1) {
                    actionBlock = ActionBlock.Companion.mo27135a();
                    this.this$0.f9759a.mo29647e(actionBlock);
                } else {
                    actionBlock = this.this$0.f9759a.mo29649g(this.this$0.f9762f);
                }
                if (actionBlock == null) {
                    C15423h2 c2 = C15186a1.m93731c();
                    C3710a aVar = new C3710a(this.this$0, (C13635d<? super C3710a>) null);
                    this.label = 1;
                    if (C15414h.m94298g(c2, aVar, this) == c) {
                        return c;
                    }
                } else {
                    String l = this.this$0.f9767z;
                    if (l != null) {
                        actionBlock.setName(l);
                    }
                    String k = this.this$0.f9757A;
                    if (k != null) {
                        actionBlock.setDescription(k);
                    }
                    this.this$0.f9763g.postValue(actionBlock);
                    return C13339u.f61331a;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.mo27191q().postValue(C13654b.m87833a(!this.this$0.f9758B));
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditViewModel$c */
    /* compiled from: ActionBlockEditViewModel.kt */
    static final class C3711c extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ ActionBlock $actionBlock;
        final /* synthetic */ boolean $closeScreen;
        final /* synthetic */ String $descriptionText;
        final /* synthetic */ boolean $isDescriptionVisible;
        final /* synthetic */ String $nameText;
        Object L$0;
        int label;
        final /* synthetic */ ActionBlockEditViewModel this$0;

        /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditViewModel$c$a */
        /* compiled from: ActionBlockEditViewModel.kt */
        static final class C3712a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ ActionBlock $actionBlock;
            int label;
            final /* synthetic */ ActionBlockEditViewModel this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3712a(ActionBlockEditViewModel actionBlockEditViewModel, ActionBlock actionBlock, C13635d<? super C3712a> dVar) {
                super(2, dVar);
                this.this$0 = actionBlockEditViewModel;
                this.$actionBlock = actionBlock;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C3712a(this.this$0, this.$actionBlock, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C3712a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.f9759a.mo29652j(this.$actionBlock);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditViewModel$c$b */
        /* compiled from: ActionBlockEditViewModel.kt */
        static final class C3713b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ Macro $macro;
            int label;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3713b(Macro macro, C13635d<? super C3713b> dVar) {
                super(2, dVar);
                this.$macro = macro;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C3713b(this.$macro, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C3713b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C4934n.m18998M().mo29695o0(this.$macro);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3711c(ActionBlock actionBlock, boolean z, String str, String str2, boolean z2, ActionBlockEditViewModel actionBlockEditViewModel, C13635d<? super C3711c> dVar) {
            super(2, dVar);
            this.$actionBlock = actionBlock;
            this.$isDescriptionVisible = z;
            this.$nameText = str;
            this.$descriptionText = str2;
            this.$closeScreen = z2;
            this.this$0 = actionBlockEditViewModel;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C3711c(this.$actionBlock, this.$isDescriptionVisible, this.$nameText, this.$descriptionText, this.$closeScreen, this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C3711c) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x008b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r2 = r0.label
                r3 = 0
                r4 = 0
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L_0x0026
                if (r2 == r6) goto L_0x0022
                if (r2 != r5) goto L_0x001a
                java.lang.Object r2 = r0.L$0
                java.util.Iterator r2 = (java.util.Iterator) r2
                p297ja.C13332o.m85685b(r18)
                goto L_0x0084
            L_0x001a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0022:
                p297ja.C13332o.m85685b(r18)
                goto L_0x0067
            L_0x0026:
                p297ja.C13332o.m85685b(r18)
                com.arlosoft.macrodroid.actionblock.data.ActionBlock r2 = r0.$actionBlock
                boolean r7 = r0.$isDescriptionVisible
                r2.setDescriptionOpen(r7)
                com.arlosoft.macrodroid.actionblock.data.ActionBlock r2 = r0.$actionBlock
                java.lang.String r7 = r0.$nameText
                r2.setName(r7)
                com.arlosoft.macrodroid.actionblock.data.ActionBlock r2 = r0.$actionBlock
                java.lang.String r7 = r0.$descriptionText
                r2.setDescription(r7)
                com.arlosoft.macrodroid.actionblock.data.ActionBlock r2 = r0.$actionBlock
                r2.setCompleted(r6)
                com.arlosoft.macrodroid.actionblock.data.ActionBlock r2 = r0.$actionBlock
                r2.setIsBeingImported(r4)
                com.arlosoft.macrodroid.actionblock.data.ActionBlock r2 = r0.$actionBlock
                long r7 = java.lang.System.currentTimeMillis()
                r2.setLastEditedTimestamp(r7)
                kotlinx.coroutines.h2 r2 = kotlinx.coroutines.C15186a1.m93731c()
                com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditViewModel$c$a r7 = new com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditViewModel$c$a
                com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditViewModel r8 = r0.this$0
                com.arlosoft.macrodroid.actionblock.data.ActionBlock r9 = r0.$actionBlock
                r7.<init>(r8, r9, r3)
                r0.label = r6
                java.lang.Object r2 = kotlinx.coroutines.C15414h.m94298g(r2, r7, r0)
                if (r2 != r1) goto L_0x0067
                return r1
            L_0x0067:
                boolean r2 = r0.$closeScreen
                if (r2 == 0) goto L_0x0078
                com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditViewModel r2 = r0.this$0
                com.arlosoft.macrodroid.utils.h1 r2 = r2.mo27191q()
                java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.C13654b.m87833a(r6)
                r2.postValue(r7)
            L_0x0078:
                com.arlosoft.macrodroid.macro.n r2 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
                java.util.List r2 = r2.mo29673C()
                java.util.Iterator r2 = r2.iterator()
            L_0x0084:
                r7 = r0
            L_0x0085:
                boolean r8 = r2.hasNext()
                if (r8 == 0) goto L_0x00e0
                java.lang.Object r8 = r2.next()
                com.arlosoft.macrodroid.macro.Macro r8 = (com.arlosoft.macrodroid.macro.Macro) r8
                java.util.ArrayList r9 = r8.getActions()
                java.util.Iterator r9 = r9.iterator()
                r10 = 0
            L_0x009a:
                boolean r11 = r9.hasNext()
                if (r11 == 0) goto L_0x00ca
                java.lang.Object r11 = r9.next()
                com.arlosoft.macrodroid.action.Action r11 = (com.arlosoft.macrodroid.action.Action) r11
                boolean r12 = r11 instanceof com.arlosoft.macrodroid.action.ActionBlockAction
                if (r12 == 0) goto L_0x009a
                com.arlosoft.macrodroid.actionblock.data.ActionBlock r12 = r7.$actionBlock
                long r12 = r12.getGUID()
                com.arlosoft.macrodroid.action.ActionBlockAction r11 = (com.arlosoft.macrodroid.action.ActionBlockAction) r11
                long r14 = r11.mo24715x3()
                int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r16 != 0) goto L_0x009a
                com.arlosoft.macrodroid.actionblock.data.ActionBlock r10 = r7.$actionBlock
                java.lang.String r10 = r10.getName()
                java.lang.String r12 = "actionBlock.name"
                kotlin.jvm.internal.C13706o.m87928e(r10, r12)
                r11.mo24710D3(r10)
                r10 = 1
                goto L_0x009a
            L_0x00ca:
                if (r10 == 0) goto L_0x0085
                kotlinx.coroutines.h2 r9 = kotlinx.coroutines.C15186a1.m93731c()
                com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditViewModel$c$b r10 = new com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditViewModel$c$b
                r10.<init>(r8, r3)
                r7.L$0 = r2
                r7.label = r5
                java.lang.Object r8 = kotlinx.coroutines.C15414h.m94298g(r9, r10, r7)
                if (r8 != r1) goto L_0x0085
                return r1
            L_0x00e0:
                ja.u r1 = p297ja.C13339u.f61331a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditViewModel.C3711c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ActionBlockEditViewModel(C4915a aVar, C6399k1 k1Var, Resources resources) {
        C13706o.m87929f(aVar, "actionBlockStore");
        C13706o.m87929f(k1Var, "toastHelper");
        C13706o.m87929f(resources, "resources");
        this.f9759a = aVar;
        this.f9760c = k1Var;
        this.f9761d = resources;
        MutableLiveData<ActionBlock> mutableLiveData = new MutableLiveData<>();
        this.f9763g = mutableLiveData;
        this.f9764o = mutableLiveData;
        this.f9765p = new C6388h1<>();
        this.f9766s = new C6388h1<>();
    }

    /* renamed from: n */
    public final void mo27187n(ActionBlock actionBlock) {
        C13706o.m87929f(actionBlock, "actionBlock");
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), C15186a1.m93730b(), (C15486m0) null, new C3708a(this, actionBlock, (C13635d<? super C3708a>) null), 2, (Object) null);
    }

    /* renamed from: o */
    public final LiveData<ActionBlock> mo27188o() {
        return this.f9764o;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), C15186a1.m93730b(), (C15486m0) null, new C3709b(this, (C13635d<? super C3709b>) null), 2, (Object) null);
    }

    /* renamed from: p */
    public final C6388h1<ActionBlock> mo27190p() {
        return this.f9766s;
    }

    /* renamed from: q */
    public final C6388h1<Boolean> mo27191q() {
        return this.f9765p;
    }

    /* renamed from: r */
    public final void mo27192r(ActionBlock actionBlock) {
        C13706o.m87929f(actionBlock, "actionBlock");
        this.f9766s.postValue(actionBlock.cloneActionBlock(true));
    }

    /* renamed from: s */
    public final void mo27193s(ActionBlock actionBlock, String str, String str2, boolean z, boolean z2) {
        C13706o.m87929f(actionBlock, "actionBlock");
        C13706o.m87929f(str, "nameText");
        C13706o.m87929f(str2, "descriptionText");
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), C15186a1.m93730b(), (C15486m0) null, new C3711c(actionBlock, z, str, str2, z2, this, (C13635d<? super C3711c>) null), 2, (Object) null);
    }

    /* renamed from: t */
    public final void mo27194t(long j, boolean z) {
        this.f9758B = z;
        this.f9762f = j;
    }

    /* renamed from: u */
    public final void mo27195u(String str) {
        C13706o.m87929f(str, "descriptionText");
        this.f9757A = str;
    }

    /* renamed from: v */
    public final void mo27196v(String str) {
        C13706o.m87929f(str, "name");
        this.f9767z = str;
    }
}
