package com.arlosoft.macrodroid.templatestore.reportmacro;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.arlosoft.macrodroid.extensions.C4660g;
import com.arlosoft.macrodroid.templatestore.model.MacroTemplate;
import com.arlosoft.macrodroid.templatestore.model.Report;
import com.arlosoft.macrodroid.templatestore.p071ui.templateList.C5410a;
import com.arlosoft.macrodroid.templatestore.reportmacro.C5240c;
import com.arlosoft.macrodroid.templatestore.reportmacro.C5255j;
import com.arlosoft.macrodroid.utils.C6388h1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C13583g0;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import p199z2.C10434a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* renamed from: com.arlosoft.macrodroid.templatestore.reportmacro.i */
/* compiled from: ReportMacroViewModel.kt */
public final class C5249i extends ViewModel {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10434a f13076a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5410a f13077b;

    /* renamed from: c */
    private final C5247g f13078c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final MutableLiveData<C5234a> f13079d;

    /* renamed from: e */
    private final LiveData<C5234a> f13080e;

    /* renamed from: f */
    private final C6388h1<C5255j> f13081f = new C6388h1<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public MacroTemplate f13082g;

    /* renamed from: com.arlosoft.macrodroid.templatestore.reportmacro.i$a */
    /* compiled from: ReportMacroViewModel.kt */
    static final class C5250a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ C5249i this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5250a(C5249i iVar, C13635d<? super C5250a> dVar) {
            super(2, dVar);
            this.this$0 = iVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5250a(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5250a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            MacroTemplate macroTemplate = null;
            if (i == 0) {
                C13332o.m85685b(obj);
                StringBuilder sb = new StringBuilder();
                MacroTemplate g = this.this$0.f13082g;
                if (g == null) {
                    C13706o.m87945v("macroTemplate");
                    g = null;
                }
                sb.append(g.getUserId());
                sb.append("adb97ac6-f780-4a41-8475-ce661b574999");
                MacroTemplate g2 = this.this$0.f13082g;
                if (g2 == null) {
                    C13706o.m87945v("macroTemplate");
                    g2 = null;
                }
                sb.append(g2.getId());
                String g3 = C4660g.m18129g(sb.toString());
                C10434a h = this.this$0.f13076a;
                MacroTemplate g4 = this.this$0.f13082g;
                if (g4 == null) {
                    C13706o.m87945v("macroTemplate");
                    g4 = null;
                }
                int id = g4.getId();
                MacroTemplate g5 = this.this$0.f13082g;
                if (g5 == null) {
                    C13706o.m87945v("macroTemplate");
                    g5 = null;
                }
                int userId = g5.getUserId();
                this.label = 1;
                if (h.mo41170n(g3, id, userId, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                try {
                    C13332o.m85685b(obj);
                } catch (Exception unused) {
                    this.this$0.mo30400n().postValue(C5255j.C5257b.f13085a);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MacroTemplate g6 = this.this$0.f13082g;
            if (g6 == null) {
                C13706o.m87945v("macroTemplate");
                g6 = null;
            }
            MacroTemplate flagCount = g6.setFlagCount(0);
            C5410a f = this.this$0.f13077b;
            MacroTemplate g7 = this.this$0.f13082g;
            if (g7 == null) {
                C13706o.m87945v("macroTemplate");
            } else {
                macroTemplate = g7;
            }
            f.mo30606a(macroTemplate.getId(), flagCount);
            this.this$0.mo30400n().postValue(C5255j.C5256a.f13084a);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.reportmacro.i$b */
    /* compiled from: ReportMacroViewModel.kt */
    static final class C5251b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ C5249i this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5251b(C5249i iVar, C13635d<? super C5251b> dVar) {
            super(2, dVar);
            this.this$0 = iVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5251b(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5251b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            MacroTemplate macroTemplate = null;
            if (i == 0) {
                C13332o.m85685b(obj);
                StringBuilder sb = new StringBuilder();
                MacroTemplate g = this.this$0.f13082g;
                if (g == null) {
                    C13706o.m87945v("macroTemplate");
                    g = null;
                }
                sb.append(g.getUserId());
                sb.append("adb97ac6-f780-4a41-8475-ce661b574999");
                MacroTemplate g2 = this.this$0.f13082g;
                if (g2 == null) {
                    C13706o.m87945v("macroTemplate");
                    g2 = null;
                }
                sb.append(g2.getId());
                String g3 = C4660g.m18129g(sb.toString());
                C10434a h = this.this$0.f13076a;
                MacroTemplate g4 = this.this$0.f13082g;
                if (g4 == null) {
                    C13706o.m87945v("macroTemplate");
                    g4 = null;
                }
                int id = g4.getId();
                MacroTemplate g5 = this.this$0.f13082g;
                if (g5 == null) {
                    C13706o.m87945v("macroTemplate");
                    g5 = null;
                }
                int userId = g5.getUserId();
                this.label = 1;
                if (h.mo41174r(g3, id, userId, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                try {
                    C13332o.m85685b(obj);
                } catch (Exception unused) {
                    this.this$0.mo30400n().postValue(C5255j.C5257b.f13085a);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C5410a f = this.this$0.f13077b;
            MacroTemplate g6 = this.this$0.f13082g;
            if (g6 == null) {
                C13706o.m87945v("macroTemplate");
                g6 = null;
            }
            int id2 = g6.getId();
            MacroTemplate g7 = this.this$0.f13082g;
            if (g7 == null) {
                C13706o.m87945v("macroTemplate");
            } else {
                macroTemplate = g7;
            }
            f.mo30606a(id2, macroTemplate.setDeleted());
            this.this$0.mo30400n().postValue(C5255j.C5256a.f13084a);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.reportmacro.i$c */
    /* compiled from: ReportMacroViewModel.kt */
    static final class C5252c extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ MacroTemplate $macroTemplate;
        int label;
        final /* synthetic */ C5249i this$0;

        /* renamed from: com.arlosoft.macrodroid.templatestore.reportmacro.i$c$a */
        /* compiled from: _Collections.kt */
        public static final class C5253a implements C13583g0<Report, Integer> {

            /* renamed from: a */
            final /* synthetic */ Iterable f13083a;

            public C5253a(Iterable iterable) {
                this.f13083a = iterable;
            }

            /* renamed from: a */
            public Integer mo30405a(Report report) {
                return Integer.valueOf(report.getReasonCode());
            }

            /* renamed from: b */
            public Iterator<Report> mo30406b() {
                return this.f13083a.iterator();
            }
        }

        /* renamed from: com.arlosoft.macrodroid.templatestore.reportmacro.i$c$b */
        /* compiled from: Comparisons.kt */
        public static final class C5254b<T> implements Comparator {
            public final int compare(T t, T t2) {
                return C15612b.m94865a(Integer.valueOf(((C5240c.C5242b) t).mo30384a()), Integer.valueOf(((C5240c.C5242b) t2).mo30384a()));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5252c(C5249i iVar, MacroTemplate macroTemplate, C13635d<? super C5252c> dVar) {
            super(2, dVar);
            this.this$0 = iVar;
            this.$macroTemplate = macroTemplate;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5252c(this.this$0, this.$macroTemplate, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5252c) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C10434a h = this.this$0.f13076a;
                int id = this.$macroTemplate.getId();
                this.label = 1;
                obj = h.mo41172p(id, this);
                if (obj == c) {
                    return c;
                }
            } else if (i == 1) {
                try {
                    C13332o.m85685b(obj);
                } catch (Exception unused) {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<Report> list = (List) obj;
            Map a = C13588i0.m87549a(new C5253a(list));
            ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
            for (Report reasonText : list) {
                arrayList.add(reasonText.getReasonText());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object next : arrayList) {
                if (((String) next).length() > 0) {
                    arrayList2.add(next);
                }
            }
            List<String> F0 = C13566b0.m87402F0(arrayList2);
            List e = C13612s.m87736e(new C5240c.C5243c(this.$macroTemplate.getStarCount(), this.$macroTemplate.getFlagCount()));
            ArrayList arrayList3 = new ArrayList(a.size());
            for (Map.Entry entry : a.entrySet()) {
                arrayList3.add(new C5240c.C5242b(((Number) entry.getKey()).intValue(), ((Number) entry.getValue()).intValue()));
            }
            List q0 = C13566b0.m87442q0(e, C13566b0.m87450y0(arrayList3, new C5254b()));
            ArrayList arrayList4 = new ArrayList(C13616u.m87774u(F0, 10));
            for (String aVar : F0) {
                arrayList4.add(new C5240c.C5241a(aVar));
            }
            this.this$0.f13079d.postValue(new C5234a(this.$macroTemplate, C13566b0.m87442q0(q0, arrayList4)));
            return C13339u.f61331a;
        }
    }

    public C5249i(C10434a aVar, C5410a aVar2, C5247g gVar) {
        C13706o.m87929f(aVar, "templateStoreApi");
        C13706o.m87929f(aVar2, "localTemplateOverrideStore");
        C13706o.m87929f(gVar, "reportMacroRepository");
        this.f13076a = aVar;
        this.f13077b = aVar2;
        this.f13078c = gVar;
        MutableLiveData<C5234a> mutableLiveData = new MutableLiveData<>();
        this.f13079d = mutableLiveData;
        this.f13080e = mutableLiveData;
    }

    /* renamed from: m */
    private final void m20440m(MacroTemplate macroTemplate) {
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), C15186a1.m93730b(), (C15486m0) null, new C5252c(this, macroTemplate, (C13635d<? super C5252c>) null), 2, (Object) null);
    }

    /* renamed from: j */
    public final void mo30397j() {
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), C15186a1.m93730b(), (C15486m0) null, new C5250a(this, (C13635d<? super C5250a>) null), 2, (Object) null);
    }

    /* renamed from: k */
    public final void mo30398k() {
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), C15186a1.m93730b(), (C15486m0) null, new C5251b(this, (C13635d<? super C5251b>) null), 2, (Object) null);
    }

    /* renamed from: l */
    public final LiveData<C5234a> mo30399l() {
        return this.f13080e;
    }

    /* renamed from: n */
    public final C6388h1<C5255j> mo30400n() {
        return this.f13081f;
    }

    /* renamed from: o */
    public final void mo30401o(MacroTemplate macroTemplate) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        this.f13082g = macroTemplate;
        m20440m(macroTemplate);
    }
}
