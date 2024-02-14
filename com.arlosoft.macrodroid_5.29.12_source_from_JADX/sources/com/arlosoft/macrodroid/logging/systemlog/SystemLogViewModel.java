package com.arlosoft.macrodroid.logging.systemlog;

import android.content.Context;
import androidx.arch.core.util.Function;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import androidx.paging.PagingDataTransforms;
import androidx.paging.PagingLiveData;
import androidx.paging.PagingSource;
import androidx.sqlite.p010db.SimpleSQLiteQuery;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.common.C4064u;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.database.room.C4402h;
import com.arlosoft.macrodroid.database.room.C4403i;
import com.arlosoft.macrodroid.database.room.C4429s;
import com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase;
import com.arlosoft.macrodroid.database.room.SystemLogEntry;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.utils.C6388h1;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13654b;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import p297ja.C13328m;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16269p;

/* compiled from: SystemLogViewModel.kt */
public final class SystemLogViewModel extends ViewModel implements LifecycleObserver {

    /* renamed from: A */
    private final LiveData<LogFilter> f12236A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final MutableLiveData<C13328m<Integer, Integer>> f12237B;

    /* renamed from: C */
    private final LiveData<C13328m<Integer, Integer>> f12238C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final MutableLiveData<C13328m<Integer, Integer>> f12239D;

    /* renamed from: E */
    private final LiveData<C13328m<Integer, Integer>> f12240E;

    /* renamed from: F */
    private SimpleSQLiteQuery f12241F;

    /* renamed from: G */
    private boolean f12242G;

    /* renamed from: H */
    private long f12243H;

    /* renamed from: I */
    private LiveData<PagingData<SystemLogEntry>> f12244I;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f12245a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final MacroDroidRoomDatabase f12246c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C4900q f12247d;

    /* renamed from: f */
    private final SimpleDateFormat f12248f = new SimpleDateFormat("dd-MM-yy HH:mm:ss", Locale.getDefault());

    /* renamed from: g */
    private String f12249g = "";

    /* renamed from: o */
    private final C6388h1<C13339u> f12250o = new C6388h1<>();

    /* renamed from: p */
    private final C6388h1<String> f12251p = new C6388h1<>();

    /* renamed from: s */
    private LogFilter f12252s;

    /* renamed from: z */
    private final MutableLiveData<LogFilter> f12253z;

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.SystemLogViewModel$a */
    /* compiled from: SystemLogViewModel.kt */
    static final class C4867a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ SystemLogViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4867a(SystemLogViewModel systemLogViewModel, C13635d<? super C4867a> dVar) {
            super(2, dVar);
            this.this$0 = systemLogViewModel;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C4867a(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C4867a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C4429s g = this.this$0.f12246c.mo28681g();
                this.label = 1;
                if (g.mo28776a(this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.mo29451w().postValue(null);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.SystemLogViewModel$b */
    /* compiled from: SystemLogViewModel.kt */
    static final class C4868b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ SystemLogViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4868b(SystemLogViewModel systemLogViewModel, C13635d<? super C4868b> dVar) {
            super(2, dVar);
            this.this$0 = systemLogViewModel;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C4868b(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C4868b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                if (!this.this$0.mo29453z()) {
                    SystemLogViewModel systemLogViewModel = this.this$0;
                    LogFilter f2 = C5163j2.m20153f2(systemLogViewModel.f12245a);
                    C13706o.m87928e(f2, "getSystemLogFilter(context)");
                    systemLogViewModel.m18824K(f2, false);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.SystemLogViewModel$c */
    /* compiled from: SystemLogViewModel.kt */
    static final class C4869c extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ SystemLogViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4869c(SystemLogViewModel systemLogViewModel, C13635d<? super C4869c> dVar) {
            super(2, dVar);
            this.this$0 = systemLogViewModel;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C4869c(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C4869c) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C4900q j = this.this$0.f12247d;
                C4403i a = C4403i.f11214a.mo28735a(this.this$0.mo29448t().getLogLevel());
                this.label = 1;
                obj = j.mo29496b(a, this);
                if (obj == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) obj;
            if (str != null) {
                this.this$0.mo29452y().postValue(str);
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.SystemLogViewModel$d */
    /* compiled from: SystemLogViewModel.kt */
    static final class C4870d extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ SystemLogViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4870d(SystemLogViewModel systemLogViewModel, C13635d<? super C4870d> dVar) {
            super(2, dVar);
            this.this$0 = systemLogViewModel;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C4870d(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C4870d) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                boolean z = (this.this$0.f12245a.getResources().getConfiguration().uiMode & 48) == 32;
                C4900q j = this.this$0.f12247d;
                C4403i a = C4403i.f11214a.mo28735a(this.this$0.mo29448t().getLogLevel());
                this.label = 1;
                obj = j.mo29495a(z, a, this);
                if (obj == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) obj;
            if (str != null) {
                this.this$0.mo29452y().postValue(str);
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.SystemLogViewModel$e */
    /* compiled from: SystemLogViewModel.kt */
    static final class C4871e extends C13708q implements C16254a<PagingSource<Integer, SystemLogEntry>> {
        final /* synthetic */ SystemLogViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4871e(SystemLogViewModel systemLogViewModel) {
            super(0);
            this.this$0 = systemLogViewModel;
        }

        public final PagingSource<Integer, SystemLogEntry> invoke() {
            return this.this$0.f12246c.mo28681g().mo28782g(this.this$0.mo29434A());
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.SystemLogViewModel$f */
    /* compiled from: SystemLogViewModel.kt */
    static final class C4872f extends C13665l implements C16269p<SystemLogEntry, C13635d<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SystemLogViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4872f(SystemLogViewModel systemLogViewModel, C13635d<? super C4872f> dVar) {
            super(2, dVar);
            this.this$0 = systemLogViewModel;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C4872f fVar = new C4872f(this.this$0, dVar);
            fVar.L$0 = obj;
            return fVar;
        }

        /* renamed from: h */
        public final Object invoke(SystemLogEntry systemLogEntry, C13635d<? super Boolean> dVar) {
            return ((C4872f) create(systemLogEntry, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                SystemLogEntry systemLogEntry = (SystemLogEntry) this.L$0;
                return C13654b.m87833a(this.this$0.m18836r(systemLogEntry) && this.this$0.m18835q(systemLogEntry));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.SystemLogViewModel$g */
    /* compiled from: Transformations.kt */
    public static final class C4873g<I, O> implements Function {

        /* renamed from: a */
        final /* synthetic */ SystemLogViewModel f12254a;

        public C4873g(SystemLogViewModel systemLogViewModel) {
            this.f12254a = systemLogViewModel;
        }

        public final PagingData<SystemLogEntry> apply(PagingData<SystemLogEntry> pagingData) {
            return PagingDataTransforms.filter(pagingData, new C4872f(this.f12254a, (C13635d<? super C4872f>) null));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.SystemLogViewModel$h */
    /* compiled from: SystemLogViewModel.kt */
    static final class C4874h extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ SystemLogViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4874h(SystemLogViewModel systemLogViewModel, C13635d<? super C4874h> dVar) {
            super(2, dVar);
            this.this$0 = systemLogViewModel;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C4874h(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C4874h) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z;
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                List<Macro> z2 = C4934n.m18998M().mo29710z();
                C13706o.m87928e(z2, "allMacros");
                SystemLogViewModel systemLogViewModel = this.this$0;
                int i = 0;
                int i2 = 0;
                for (Macro guid : z2) {
                    try {
                        z = systemLogViewModel.mo29448t().getDisabledMacroIds().contains(C13654b.m87835c(guid.getGUID()));
                    } catch (Exception unused2) {
                        systemLogViewModel.mo29442J(LogFilter.Companion.mo29418a());
                        z = false;
                    }
                    i2 += z ? 1 : 0;
                }
                this.this$0.f12237B.postValue(new C13328m(C13654b.m87834b(z2.size() - i2), C13654b.m87834b(z2.size())));
                List<MacroDroidVariable> r = C4064u.m16048t().mo27993r(false);
                C13706o.m87928e(r, "allVariables");
                SystemLogViewModel systemLogViewModel2 = this.this$0;
                for (MacroDroidVariable name : r) {
                    i += systemLogViewModel2.mo29448t().getDisabledVariableNames().contains(name.getName()) ? 1 : 0;
                }
                this.this$0.f12239D.postValue(new C13328m(C13654b.m87834b(r.size() - i), C13654b.m87834b(r.size())));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.SystemLogViewModel$i */
    /* compiled from: SystemLogViewModel.kt */
    static final class C4875i extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ SystemLogViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4875i(SystemLogViewModel systemLogViewModel, C13635d<? super C4875i> dVar) {
            super(2, dVar);
            this.this$0 = systemLogViewModel;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C4875i(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C4875i) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.mo29451w().postValue(null);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public SystemLogViewModel(Context context, MacroDroidRoomDatabase macroDroidRoomDatabase, C4900q qVar) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(macroDroidRoomDatabase, "roomDatabase");
        C13706o.m87929f(qVar, "systemLogHelper");
        this.f12245a = context;
        this.f12246c = macroDroidRoomDatabase;
        this.f12247d = qVar;
        this.f12252s = C5163j2.m20153f2(context);
        MutableLiveData<LogFilter> mutableLiveData = new MutableLiveData<>(this.f12252s);
        this.f12253z = mutableLiveData;
        this.f12236A = mutableLiveData;
        MutableLiveData<C13328m<Integer, Integer>> mutableLiveData2 = new MutableLiveData<>(new C13328m(0, 0));
        this.f12237B = mutableLiveData2;
        this.f12238C = mutableLiveData2;
        MutableLiveData<C13328m<Integer, Integer>> mutableLiveData3 = new MutableLiveData<>(new C13328m(0, 0));
        this.f12239D = mutableLiveData3;
        this.f12240E = mutableLiveData3;
        LogFilter logFilter = this.f12252s;
        C13706o.m87928e(logFilter, "internalFilter");
        this.f12241F = m18834o(logFilter);
        LiveData<PagingData<SystemLogEntry>> map = Transformations.map(PagingLiveData.getLiveData(new Pager(new PagingConfig(200, 0, false, 0, 0, 0, 62, (C13695i) null), (Object) null, new C4871e(this), 2, (C13695i) null)), new C4873g(this));
        C13706o.m87928e(map, "crossinline transform: (…p(this) { transform(it) }");
        this.f12244I = map;
    }

    /* renamed from: C */
    private final List<String> m18823C(Macro macro) {
        List<MacroDroidVariable> r = C4064u.m16048t().mo27993r(false);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        macro.getAllConstraints();
        Iterator<Trigger> it = macro.getTriggerListWithAwaitingActions().iterator();
        while (it.hasNext()) {
            Trigger next = it.next();
            C13706o.m87928e(next, "trigger");
            C13706o.m87928e(r, "allVariables");
            linkedHashSet.addAll(m18837x(next, r));
        }
        Iterator<Action> it2 = macro.getActions().iterator();
        while (it2.hasNext()) {
            Action next2 = it2.next();
            C13706o.m87928e(next2, "action");
            C13706o.m87928e(r, "allVariables");
            linkedHashSet.addAll(m18837x(next2, r));
        }
        for (Constraint next3 : macro.getAllConstraints()) {
            C13706o.m87928e(next3, "constraint");
            C13706o.m87928e(r, "allVariables");
            linkedHashSet.addAll(m18837x(next3, r));
        }
        ArrayList<MacroDroidVariable> arrayList = new ArrayList<>();
        for (Object next4 : linkedHashSet) {
            if (!((MacroDroidVariable) next4).mo27754c0()) {
                arrayList.add(next4);
            }
        }
        ArrayList arrayList2 = new ArrayList(C13616u.m87774u(arrayList, 10));
        for (MacroDroidVariable name : arrayList) {
            arrayList2.add(name.getName());
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public final void m18824K(LogFilter logFilter, boolean z) {
        this.f12252s = logFilter;
        C13706o.m87928e(logFilter, "internalFilter");
        this.f12241F = m18834o(logFilter);
        if (z && !this.f12242G) {
            C5163j2.m20081V5(this.f12245a, this.f12252s);
        }
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), (C13640g) null, (C15486m0) null, new C4874h(this, (C13635d<? super C4874h>) null), 3, (Object) null);
        C15561w1 unused2 = C15473j.m94492d(ViewModelKt.getViewModelScope(this), (C13640g) null, (C15486m0) null, new C4875i(this, (C13635d<? super C4875i>) null), 3, (Object) null);
    }

    /* renamed from: L */
    static /* synthetic */ void m18825L(SystemLogViewModel systemLogViewModel, LogFilter logFilter, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        systemLogViewModel.m18824K(logFilter, z);
    }

    /* renamed from: o */
    private final SimpleSQLiteQuery m18834o(LogFilter logFilter) {
        String str;
        String str2 = "SELECT * FROM SystemLogEntry WHERE logLevel >= " + logFilter.getLogLevel() + ' ';
        if (!this.f12242G) {
            str = str2 + "AND ( flag = " + C4402h.NONE.ordinal();
        } else {
            str = str2 + "AND macroId = " + this.f12243H + " AND ( flag = " + C4402h.NONE.ordinal();
        }
        if (logFilter.getShowTriggers()) {
            str = str + " OR flag=" + C4402h.TRIGGER.ordinal();
        }
        if (logFilter.getShowActions()) {
            str = str + " OR flag=" + C4402h.ACTION.ordinal();
        }
        if (logFilter.getShowConstraints()) {
            str = str + " OR flag=" + C4402h.CONSTRAINT.ordinal();
        }
        return new SimpleSQLiteQuery(((str + " OR flag=" + C4402h.LOCAL_VARIABLE.ordinal() + " OR flag=" + C4402h.GLOBAL_VARIABLE.ordinal()) + ") ") + "ORDER BY id DESC", (Object[]) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final boolean m18835q(SystemLogEntry systemLogEntry) {
        if (this.f12242G) {
            return true;
        }
        return !((this.f12252s.getDisabledMacroIds().contains(Long.valueOf(systemLogEntry.mo28690f())) && systemLogEntry.mo28683a() != C4402h.GLOBAL_VARIABLE) || (C13566b0.m87414O(this.f12252s.getDisabledVariableNames(), systemLogEntry.mo28692h()) && systemLogEntry.mo28683a() == C4402h.GLOBAL_VARIABLE));
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final boolean m18836r(SystemLogEntry systemLogEntry) {
        if (this.f12249g.length() == 0) {
            return true;
        }
        String e = systemLogEntry.mo28688e();
        Locale locale = Locale.ROOT;
        String lowerCase = e.toLowerCase(locale);
        C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String lowerCase2 = this.f12249g.toLowerCase(locale);
        C13706o.m87928e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return C15177w.m93663N(lowerCase, lowerCase2, false, 2, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c3, code lost:
        if (kotlin.text.C15177w.m93663N(r13, "{v=" + r15.getName(), false, 2, (java.lang.Object) null) != false) goto L_0x00c5;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Set<com.arlosoft.macrodroid.common.MacroDroidVariable> m18837x(com.arlosoft.macrodroid.common.SelectableItem r19, java.util.List<com.arlosoft.macrodroid.common.MacroDroidVariable> r20) {
        /*
            r18 = this;
            r0 = r19
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            boolean r2 = r0 instanceof p057a2.C2219h
            if (r2 == 0) goto L_0x0017
            r2 = r0
            a2.h r2 = (p057a2.C2219h) r2
            com.arlosoft.macrodroid.common.MacroDroidVariable r2 = r2.mo24432s()
            if (r2 == 0) goto L_0x0017
            r1.add(r2)
        L_0x0017:
            boolean r2 = r0 instanceof p057a2.C2220i
            java.lang.String r3 = "variable"
            if (r2 == 0) goto L_0x0036
            r2 = r0
            a2.i r2 = (p057a2.C2220i) r2
            java.lang.String r2 = r2.mo24434m()
            if (r2 == 0) goto L_0x0036
            com.arlosoft.macrodroid.common.u r4 = com.arlosoft.macrodroid.common.C4064u.m16048t()
            com.arlosoft.macrodroid.common.MacroDroidVariable r2 = r4.mo27996w(r2)
            if (r2 == 0) goto L_0x0036
            kotlin.jvm.internal.C13706o.m87928e(r2, r3)
            r1.add(r2)
        L_0x0036:
            boolean r2 = r0 instanceof p057a2.C2222k
            if (r2 == 0) goto L_0x0058
            r2 = r0
            a2.k r2 = (p057a2.C2222k) r2
            java.util.List r2 = r2.mo24437j()
            java.util.Iterator r2 = r2.iterator()
        L_0x0045:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0058
            java.lang.Object r4 = r2.next()
            com.arlosoft.macrodroid.common.MacroDroidVariable r4 = (com.arlosoft.macrodroid.common.MacroDroidVariable) r4
            kotlin.jvm.internal.C13706o.m87928e(r4, r3)
            r1.add(r4)
            goto L_0x0045
        L_0x0058:
            boolean r2 = r0 instanceof p057a2.C2224m
            java.lang.String r3 = "{v="
            java.lang.String r4 = "[v="
            java.lang.String r5 = "text"
            java.lang.String r6 = "selectableItem as Suppor…icText).possibleMagicText"
            r9 = 0
            if (r2 == 0) goto L_0x00d0
            r10 = r0
            a2.m r10 = (p057a2.C2224m) r10
            java.lang.String[] r10 = r10.mo24440F()
            kotlin.jvm.internal.C13706o.m87928e(r10, r6)
            int r11 = r10.length
            r12 = 0
        L_0x0071:
            if (r12 >= r11) goto L_0x00d0
            r13 = r10[r12]
            java.util.Iterator r14 = r20.iterator()
        L_0x0079:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x00cb
            java.lang.Object r15 = r14.next()
            com.arlosoft.macrodroid.common.MacroDroidVariable r15 = (com.arlosoft.macrodroid.common.MacroDroidVariable) r15
            boolean r16 = android.text.TextUtils.isEmpty(r13)
            if (r16 != 0) goto L_0x0079
            kotlin.jvm.internal.C13706o.m87928e(r13, r5)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r8 = r15.getName()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r17 = r10
            r8 = 0
            r10 = 2
            boolean r7 = kotlin.text.C15177w.m93663N(r13, r7, r9, r10, r8)
            if (r7 != 0) goto L_0x00c5
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r8 = r15.getName()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r8 = 0
            boolean r7 = kotlin.text.C15177w.m93663N(r13, r7, r9, r10, r8)
            if (r7 == 0) goto L_0x00c8
        L_0x00c5:
            r1.add(r15)
        L_0x00c8:
            r10 = r17
            goto L_0x0079
        L_0x00cb:
            r17 = r10
            int r12 = r12 + 1
            goto L_0x0071
        L_0x00d0:
            if (r2 == 0) goto L_0x0137
            a2.m r0 = (p057a2.C2224m) r0
            java.lang.String[] r0 = r0.mo24440F()
            kotlin.jvm.internal.C13706o.m87928e(r0, r6)
            int r2 = r0.length
            r6 = 0
        L_0x00dd:
            if (r6 >= r2) goto L_0x0137
            r7 = r0[r6]
            java.util.Iterator r8 = r20.iterator()
        L_0x00e5:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0132
            java.lang.Object r10 = r8.next()
            com.arlosoft.macrodroid.common.MacroDroidVariable r10 = (com.arlosoft.macrodroid.common.MacroDroidVariable) r10
            boolean r11 = android.text.TextUtils.isEmpty(r7)
            if (r11 != 0) goto L_0x00e5
            kotlin.jvm.internal.C13706o.m87928e(r7, r5)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r4)
            java.lang.String r12 = r10.getName()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r12 = 0
            r13 = 2
            boolean r11 = kotlin.text.C15177w.m93663N(r7, r11, r9, r13, r12)
            if (r11 != 0) goto L_0x012e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            java.lang.String r14 = r10.getName()
            r11.append(r14)
            java.lang.String r11 = r11.toString()
            boolean r11 = kotlin.text.C15177w.m93663N(r7, r11, r9, r13, r12)
            if (r11 == 0) goto L_0x00e5
        L_0x012e:
            r1.add(r10)
            goto L_0x00e5
        L_0x0132:
            r12 = 0
            r13 = 2
            int r6 = r6 + 1
            goto L_0x00dd
        L_0x0137:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.logging.systemlog.SystemLogViewModel.m18837x(com.arlosoft.macrodroid.common.SelectableItem, java.util.List):java.util.Set");
    }

    /* renamed from: A */
    public final SimpleSQLiteQuery mo29434A() {
        return this.f12241F;
    }

    /* renamed from: B */
    public final LiveData<C13328m<Integer, Integer>> mo29435B() {
        return this.f12240E;
    }

    /* renamed from: D */
    public final void mo29436D() {
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), C15186a1.m93730b(), (C15486m0) null, new C4869c(this, (C13635d<? super C4869c>) null), 2, (Object) null);
    }

    /* renamed from: E */
    public final void mo29437E() {
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), C15186a1.m93730b(), (C15486m0) null, new C4870d(this, (C13635d<? super C4870d>) null), 2, (Object) null);
    }

    /* renamed from: F */
    public final void mo29438F(boolean z) {
        LogFilter logFilter = this.f12252s;
        C13706o.m87928e(logFilter, "internalFilter");
        m18825L(this, LogFilter.copy$default(logFilter, 0, false, z, false, (List) null, (List) null, 59, (Object) null), false, 2, (Object) null);
    }

    /* renamed from: G */
    public final void mo29439G(boolean z) {
        LogFilter logFilter = this.f12252s;
        C13706o.m87928e(logFilter, "internalFilter");
        m18825L(this, LogFilter.copy$default(logFilter, 0, false, false, z, (List) null, (List) null, 55, (Object) null), false, 2, (Object) null);
    }

    /* renamed from: H */
    public final void mo29440H(int i) {
        LogFilter logFilter = this.f12252s;
        C13706o.m87928e(logFilter, "internalFilter");
        m18825L(this, LogFilter.copy$default(logFilter, i, false, false, false, (List) null, (List) null, 62, (Object) null), false, 2, (Object) null);
    }

    /* renamed from: I */
    public final void mo29441I(boolean z) {
        LogFilter logFilter = this.f12252s;
        C13706o.m87928e(logFilter, "internalFilter");
        m18825L(this, LogFilter.copy$default(logFilter, 0, z, false, false, (List) null, (List) null, 61, (Object) null), false, 2, (Object) null);
    }

    /* renamed from: J */
    public final void mo29442J(LogFilter logFilter) {
        this.f12252s = logFilter;
    }

    /* renamed from: M */
    public final void mo29443M(String str) {
        C13706o.m87929f(str, "searchText");
        this.f12249g = str;
        this.f12250o.postValue(null);
    }

    /* renamed from: n */
    public final void mo29444n() {
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), (C13640g) null, (C15486m0) null, new C4867a(this, (C13635d<? super C4867a>) null), 3, (Object) null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), (C13640g) null, (C15486m0) null, new C4868b(this, (C13635d<? super C4868b>) null), 3, (Object) null);
    }

    /* renamed from: p */
    public final void mo29446p(long j) {
        long j2 = j;
        this.f12242G = true;
        this.f12243H = j2;
        List<Macro> E = C4934n.m18998M().mo29675E();
        C13706o.m87928e(E, "allMacros");
        ArrayList<Macro> arrayList = new ArrayList<>();
        Iterator<T> it = E.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((Macro) next).getGUID() != j2) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C13616u.m87774u(arrayList, 10));
        for (Macro guid : arrayList) {
            arrayList2.add(Long.valueOf(guid.getGUID()));
        }
        List<MacroDroidVariable> r = C4064u.m16048t().mo27993r(false);
        Macro Q = C4934n.m18998M().mo29682Q(j2);
        C13706o.m87928e(Q, "macro");
        List<String> C = m18823C(Q);
        C13706o.m87928e(r, "allVariables");
        ArrayList arrayList3 = new ArrayList(C13616u.m87774u(r, 10));
        for (MacroDroidVariable name : r) {
            arrayList3.add(name.getName());
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object next2 : arrayList3) {
            if (!C.contains((String) next2)) {
                arrayList4.add(next2);
            }
        }
        LogFilter logFilter = this.f12252s;
        C13706o.m87928e(logFilter, "internalFilter");
        m18825L(this, LogFilter.copy$default(logFilter, C4403i.VERBOSE.mo28734d(), false, false, false, arrayList2, arrayList4, 14, (Object) null), false, 2, (Object) null);
    }

    /* renamed from: s */
    public final LiveData<LogFilter> mo29447s() {
        return this.f12236A;
    }

    /* renamed from: t */
    public final LogFilter mo29448t() {
        return this.f12252s;
    }

    /* renamed from: u */
    public final LiveData<C13328m<Integer, Integer>> mo29449u() {
        return this.f12238C;
    }

    /* renamed from: v */
    public final LiveData<PagingData<SystemLogEntry>> mo29450v() {
        return this.f12244I;
    }

    /* renamed from: w */
    public final C6388h1<C13339u> mo29451w() {
        return this.f12250o;
    }

    /* renamed from: y */
    public final C6388h1<String> mo29452y() {
        return this.f12251p;
    }

    /* renamed from: z */
    public final boolean mo29453z() {
        return this.f12242G;
    }
}
