package com.arlosoft.macrodroid.templatestore.p071ui.subscription.viewmodel;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.C0736a;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.arlosoft.macrodroid.avatar.views.AvatarView;
import com.arlosoft.macrodroid.database.room.C4418o;
import com.arlosoft.macrodroid.database.room.C4419p;
import com.arlosoft.macrodroid.database.room.C4421q;
import com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase;
import com.arlosoft.macrodroid.templatestore.events.TemplateUpdateEvent;
import com.arlosoft.macrodroid.templatestore.events.UserUpdateEvent;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import com.arlosoft.macrodroid.utils.C6388h1;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13654b;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import p161s1.C10180a;
import p176v0.C10312a;
import p199z2.C10434a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.viewmodel.TemplateUpdatesViewModel */
/* compiled from: TemplateUpdatesViewModel.kt */
public final class TemplateUpdatesViewModel extends ViewModel implements DefaultLifecycleObserver {

    /* renamed from: A */
    private final C6388h1<C5408a> f13280A = new C6388h1<>();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f13281a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final MacroDroidRoomDatabase f13282c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C10312a f13283d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10434a f13284f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C5527g f13285g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final MutableLiveData<Boolean> f13286o;

    /* renamed from: p */
    private final LiveData<Boolean> f13287p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final MutableLiveData<List<C4419p>> f13288s;

    /* renamed from: z */
    private final LiveData<List<C4419p>> f13289z;

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.viewmodel.TemplateUpdatesViewModel$a */
    /* compiled from: TemplateUpdatesViewModel.kt */
    public /* synthetic */ class C5401a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13290a;

        static {
            int[] iArr = new int[C4418o.values().length];
            iArr[C4418o.TYPE_MACRO_NEW_COMMENT.ordinal()] = 1;
            iArr[C4418o.TYPE_MACRO_UPDATED.ordinal()] = 2;
            iArr[C4418o.TYPE_USER_NEW_MACRO.ordinal()] = 3;
            f13290a = iArr;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.viewmodel.TemplateUpdatesViewModel$b */
    /* compiled from: TemplateUpdatesViewModel.kt */
    static final class C5402b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ int $position;
        Object L$0;
        int label;
        final /* synthetic */ TemplateUpdatesViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5402b(TemplateUpdatesViewModel templateUpdatesViewModel, int i, C13635d<? super C5402b> dVar) {
            super(2, dVar);
            this.this$0 = templateUpdatesViewModel;
            this.$position = i;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5402b(this.this$0, this.$position, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5402b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            TemplateUpdatesViewModel templateUpdatesViewModel;
            TemplateUpdatesViewModel templateUpdatesViewModel2;
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                List value = this.this$0.mo30593o().getValue();
                C4419p pVar = value != null ? (C4419p) value.get(this.$position) : null;
                if (pVar != null) {
                    templateUpdatesViewModel2 = this.this$0;
                    C4421q f = templateUpdatesViewModel2.f13282c.mo28680f();
                    long b = pVar.mo28755b();
                    this.L$0 = templateUpdatesViewModel2;
                    this.label = 1;
                    if (f.mo28766a(b, this) == c) {
                        return c;
                    }
                }
                return C13339u.f61331a;
            } else if (i == 1) {
                templateUpdatesViewModel2 = (TemplateUpdatesViewModel) this.L$0;
                C13332o.m85685b(obj);
            } else if (i == 2) {
                templateUpdatesViewModel = (TemplateUpdatesViewModel) this.L$0;
                C13332o.m85685b(obj);
                templateUpdatesViewModel.f13288s.postValue((List) obj);
                return C13339u.f61331a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4421q f2 = templateUpdatesViewModel2.f13282c.mo28680f();
            this.L$0 = templateUpdatesViewModel2;
            this.label = 2;
            obj = f2.mo28768c(this);
            if (obj == c) {
                return c;
            }
            templateUpdatesViewModel = templateUpdatesViewModel2;
            templateUpdatesViewModel.f13288s.postValue((List) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.viewmodel.TemplateUpdatesViewModel$c */
    /* compiled from: TemplateUpdatesViewModel.kt */
    static final class C5403c extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ int $macroId;
        int label;
        final /* synthetic */ TemplateUpdatesViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5403c(TemplateUpdatesViewModel templateUpdatesViewModel, int i, C13635d<? super C5403c> dVar) {
            super(2, dVar);
            this.this$0 = templateUpdatesViewModel;
            this.$macroId = i;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5403c(this.this$0, this.$macroId, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5403c) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0091 A[Catch:{ Exception -> 0x00d6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00a1 A[Catch:{ Exception -> 0x00d6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00ad A[Catch:{ Exception -> 0x00d6 }, RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r1 = r14.label
                r2 = 1
                if (r1 == 0) goto L_0x0018
                if (r1 != r2) goto L_0x0010
                p297ja.C13332o.m85685b(r15)     // Catch:{ Exception -> 0x00d6 }
                goto L_0x00ae
            L_0x0010:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0018:
                p297ja.C13332o.m85685b(r15)
                com.arlosoft.macrodroid.templatestore.ui.subscription.viewmodel.TemplateUpdatesViewModel r15 = r14.this$0
                com.arlosoft.macrodroid.templatestore.ui.user.g r15 = r15.f13285g
                com.arlosoft.macrodroid.templatestore.model.User r15 = r15.mo30790b()
                com.arlosoft.macrodroid.utils.f1 r1 = com.arlosoft.macrodroid.utils.C6380f1.f14971a
                com.arlosoft.macrodroid.app.MacroDroidApplication$a r3 = com.arlosoft.macrodroid.app.MacroDroidApplication.f9883I
                com.arlosoft.macrodroid.app.MacroDroidApplication r3 = r3.mo27303b()
                java.lang.String r1 = r1.mo32421a(r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                int r4 = r15.getUserId()
                r3.append(r4)
                java.lang.String r4 = "adb97ac6-f780-4a41-8475-ce661b574999"
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = "0"
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                java.lang.String r4 = com.arlosoft.macrodroid.extensions.C4660g.m18129g(r1)
                com.arlosoft.macrodroid.templatestore.ui.subscription.viewmodel.TemplateUpdatesViewModel r1 = r14.this$0
                android.content.Context r1 = r1.f13281a
                java.util.Locale r1 = com.arlosoft.macrodroid.settings.C5163j2.m19963F0(r1)
                java.lang.String r1 = r1.getLanguage()
                com.arlosoft.macrodroid.templatestore.ui.subscription.viewmodel.TemplateUpdatesViewModel r3 = r14.this$0     // Catch:{ Exception -> 0x00d6 }
                z2.a r3 = r3.f13284f     // Catch:{ Exception -> 0x00d6 }
                r5 = 0
                int r6 = r15.getUserId()     // Catch:{ Exception -> 0x00d6 }
                r7 = 0
                r8 = 0
                r9 = 1
                r10 = 0
                java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d6 }
                r15.<init>()     // Catch:{ Exception -> 0x00d6 }
                java.lang.String r11 = "id="
                r15.append(r11)     // Catch:{ Exception -> 0x00d6 }
                int r11 = r14.$macroId     // Catch:{ Exception -> 0x00d6 }
                r15.append(r11)     // Catch:{ Exception -> 0x00d6 }
                java.lang.String r11 = r15.toString()     // Catch:{ Exception -> 0x00d6 }
                r15 = 0
                if (r1 == 0) goto L_0x008e
                int r12 = r1.length()     // Catch:{ Exception -> 0x00d6 }
                if (r12 != 0) goto L_0x008c
                goto L_0x008e
            L_0x008c:
                r12 = 0
                goto L_0x008f
            L_0x008e:
                r12 = 1
            L_0x008f:
                if (r12 != 0) goto L_0x00a1
                java.lang.String r12 = "language"
                kotlin.jvm.internal.C13706o.m87928e(r1, r12)     // Catch:{ Exception -> 0x00d6 }
                r12 = 2
                java.lang.String r15 = r1.substring(r15, r12)     // Catch:{ Exception -> 0x00d6 }
                java.lang.String r1 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.C13706o.m87928e(r15, r1)     // Catch:{ Exception -> 0x00d6 }
                goto L_0x00a3
            L_0x00a1:
                java.lang.String r15 = "en"
            L_0x00a3:
                r12 = r15
                r14.label = r2     // Catch:{ Exception -> 0x00d6 }
                r13 = r14
                java.lang.Object r15 = r3.mo41173q(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00d6 }
                if (r15 != r0) goto L_0x00ae
                return r0
            L_0x00ae:
                java.util.List r15 = (java.util.List) r15     // Catch:{ Exception -> 0x00d6 }
                boolean r0 = r15.isEmpty()     // Catch:{ Exception -> 0x00d6 }
                r0 = r0 ^ r2
                if (r0 == 0) goto L_0x00ca
                java.lang.Object r15 = kotlin.collections.C13566b0.m87422W(r15)     // Catch:{ Exception -> 0x00d6 }
                com.arlosoft.macrodroid.templatestore.model.MacroTemplate r15 = (com.arlosoft.macrodroid.templatestore.model.MacroTemplate) r15     // Catch:{ Exception -> 0x00d6 }
                r15.setUseTranslatedText(r2)     // Catch:{ Exception -> 0x00d6 }
                com.arlosoft.macrodroid.templatestore.ui.subscription.viewmodel.TemplateUpdatesViewModel r0 = r14.this$0     // Catch:{ Exception -> 0x00d6 }
                v0.a r0 = r0.f13283d     // Catch:{ Exception -> 0x00d6 }
                r0.mo40931f(r15)     // Catch:{ Exception -> 0x00d6 }
                goto L_0x00e1
            L_0x00ca:
                com.arlosoft.macrodroid.templatestore.ui.subscription.viewmodel.TemplateUpdatesViewModel r15 = r14.this$0     // Catch:{ Exception -> 0x00d6 }
                com.arlosoft.macrodroid.utils.h1 r15 = r15.mo30592n()     // Catch:{ Exception -> 0x00d6 }
                com.arlosoft.macrodroid.templatestore.ui.subscription.viewmodel.a r0 = com.arlosoft.macrodroid.templatestore.p071ui.subscription.viewmodel.C5408a.MACRO_NOT_AVAILABLE     // Catch:{ Exception -> 0x00d6 }
                r15.postValue(r0)     // Catch:{ Exception -> 0x00d6 }
                goto L_0x00e1
            L_0x00d6:
                com.arlosoft.macrodroid.templatestore.ui.subscription.viewmodel.TemplateUpdatesViewModel r15 = r14.this$0
                com.arlosoft.macrodroid.utils.h1 r15 = r15.mo30592n()
                com.arlosoft.macrodroid.templatestore.ui.subscription.viewmodel.a r0 = com.arlosoft.macrodroid.templatestore.p071ui.subscription.viewmodel.C5408a.UNKOWN_ERROR
                r15.postValue(r0)
            L_0x00e1:
                ja.u r15 = p297ja.C13339u.f61331a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.templatestore.p071ui.subscription.viewmodel.TemplateUpdatesViewModel.C5403c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.viewmodel.TemplateUpdatesViewModel$d */
    /* compiled from: TemplateUpdatesViewModel.kt */
    static final class C5404d extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ TemplateUpdatesViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5404d(TemplateUpdatesViewModel templateUpdatesViewModel, C13635d<? super C5404d> dVar) {
            super(2, dVar);
            this.this$0 = templateUpdatesViewModel;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5404d(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5404d) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C4421q f = this.this$0.f13282c.mo28680f();
                this.label = 1;
                obj = f.mo28768c(this);
                if (obj == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.f13288s.postValue((List) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.viewmodel.TemplateUpdatesViewModel$e */
    /* compiled from: TemplateUpdatesViewModel.kt */
    static final class C5405e extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ TemplateUpdatesViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5405e(TemplateUpdatesViewModel templateUpdatesViewModel, C13635d<? super C5405e> dVar) {
            super(2, dVar);
            this.this$0 = templateUpdatesViewModel;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5405e(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5405e) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C4421q f = this.this$0.f13282c.mo28680f();
                this.label = 1;
                obj = f.mo28768c(this);
                if (obj == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.f13288s.postValue((List) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.viewmodel.TemplateUpdatesViewModel$f */
    /* compiled from: TemplateUpdatesViewModel.kt */
    static final class C5406f extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ TemplateUpdatesViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5406f(TemplateUpdatesViewModel templateUpdatesViewModel, C13635d<? super C5406f> dVar) {
            super(2, dVar);
            this.this$0 = templateUpdatesViewModel;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5406f(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5406f) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                this.this$0.f13286o.postValue(C13654b.m87833a(true));
                C4421q f = this.this$0.f13282c.mo28680f();
                this.label = 1;
                obj = f.mo28768c(this);
                if (obj == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.f13288s.postValue((List) obj);
            this.this$0.f13286o.postValue(C13654b.m87833a(false));
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.viewmodel.TemplateUpdatesViewModel$g */
    /* compiled from: TemplateUpdatesViewModel.kt */
    static final class C5407g extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4419p $updateItem;
        int label;
        final /* synthetic */ TemplateUpdatesViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5407g(TemplateUpdatesViewModel templateUpdatesViewModel, C4419p pVar, C13635d<? super C5407g> dVar) {
            super(2, dVar);
            this.this$0 = templateUpdatesViewModel;
            this.$updateItem = pVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5407g(this.this$0, this.$updateItem, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5407g) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C4421q f = this.this$0.f13282c.mo28680f();
                long b = this.$updateItem.mo28755b();
                this.label = 1;
                if (f.mo28766a(b, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13339u.f61331a;
        }
    }

    public TemplateUpdatesViewModel(Context context, MacroDroidRoomDatabase macroDroidRoomDatabase, C10312a aVar, C10434a aVar2, C5527g gVar) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(macroDroidRoomDatabase, "roomDatabase");
        C13706o.m87929f(aVar, "screenLoader");
        C13706o.m87929f(aVar2, "templateStoreApi");
        C13706o.m87929f(gVar, "userProvider");
        this.f13281a = context;
        this.f13282c = macroDroidRoomDatabase;
        this.f13283d = aVar;
        this.f13284f = aVar2;
        this.f13285g = gVar;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.f13286o = mutableLiveData;
        this.f13287p = mutableLiveData;
        MutableLiveData<List<C4419p>> mutableLiveData2 = new MutableLiveData<>();
        this.f13288s = mutableLiveData2;
        this.f13289z = mutableLiveData2;
    }

    /* renamed from: q */
    private final void m20856q(int i) {
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), (C13640g) null, (C15486m0) null, new C5403c(this, i, (C13635d<? super C5403c>) null), 3, (Object) null);
    }

    /* renamed from: r */
    private final void m20857r(int i) {
        this.f13283d.mo40932g(i);
    }

    /* renamed from: m */
    public final void mo30591m(int i) {
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), (C13640g) null, (C15486m0) null, new C5402b(this, i, (C13635d<? super C5402b>) null), 3, (Object) null);
    }

    /* renamed from: n */
    public final C6388h1<C5408a> mo30592n() {
        return this.f13280A;
    }

    /* renamed from: o */
    public final LiveData<List<C4419p>> mo30593o() {
        return this.f13289z;
    }

    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C0736a.m539a(this, lifecycleOwner);
    }

    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C0736a.m540b(this, lifecycleOwner);
    }

    public final void onEventMainThread(TemplateUpdateEvent templateUpdateEvent) {
        C13706o.m87929f(templateUpdateEvent, NotificationCompat.CATEGORY_EVENT);
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), C15186a1.m93730b(), (C15486m0) null, new C5404d(this, (C13635d<? super C5404d>) null), 2, (Object) null);
    }

    public void onPause(LifecycleOwner lifecycleOwner) {
        C13706o.m87929f(lifecycleOwner, "owner");
        C10180a.m40075a().mo80020p(this);
    }

    public void onResume(LifecycleOwner lifecycleOwner) {
        C13706o.m87929f(lifecycleOwner, "owner");
        C10180a.m40075a().mo80019m(this);
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), C15186a1.m93730b(), (C15486m0) null, new C5406f(this, (C13635d<? super C5406f>) null), 2, (Object) null);
    }

    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C0736a.m543e(this, lifecycleOwner);
    }

    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C0736a.m544f(this, lifecycleOwner);
    }

    /* renamed from: p */
    public final LiveData<Boolean> mo30596p() {
        return this.f13287p;
    }

    /* renamed from: s */
    public final void mo30597s(C4419p pVar) {
        C13706o.m87929f(pVar, "updateItem");
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), C15186a1.m93730b(), (C15486m0) null, new C5407g(this, pVar, (C13635d<? super C5407g>) null), 2, (Object) null);
        int i = C5401a.f13290a[pVar.mo28760f().ordinal()];
        if (i == 1) {
            m20856q(pVar.mo28756c());
        } else if (i == 2) {
            m20857r(pVar.mo28756c());
        } else if (i == 3) {
            m20857r(pVar.mo28756c());
        }
    }

    /* renamed from: t */
    public final void mo30598t(C4419p pVar) {
        C13706o.m87929f(pVar, "updateItem");
        C10312a.m40505l(this.f13283d, pVar.mo28764i(), pVar.mo28762h(), pVar.mo28761g(), (AvatarView) null, 8, (Object) null);
    }

    public final void onEventMainThread(UserUpdateEvent userUpdateEvent) {
        C13706o.m87929f(userUpdateEvent, NotificationCompat.CATEGORY_EVENT);
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), C15186a1.m93730b(), (C15486m0) null, new C5405e(this, (C13635d<? super C5405e>) null), 2, (Object) null);
    }
}
