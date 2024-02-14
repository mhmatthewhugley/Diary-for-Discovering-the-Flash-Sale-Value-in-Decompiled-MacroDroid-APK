package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C13592k0;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14473x;
import p297ja.C13328m;
import p297ja.C13337s;
import p297ja.C13339u;
import p370qa.C16265l;
import p398tb.C16610e;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.m */
/* compiled from: predefinedEnhancementInfo.kt */
final class C14390m {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<String, C14383k> f63154a = new LinkedHashMap();

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.m$a */
    /* compiled from: predefinedEnhancementInfo.kt */
    public final class C14391a {

        /* renamed from: a */
        private final String f63155a;

        /* renamed from: b */
        final /* synthetic */ C14390m f63156b;

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.m$a$a */
        /* compiled from: predefinedEnhancementInfo.kt */
        public final class C14392a {

            /* renamed from: a */
            private final String f63157a;

            /* renamed from: b */
            private final List<C13328m<String, C14396q>> f63158b = new ArrayList();

            /* renamed from: c */
            private C13328m<String, C14396q> f63159c = C13337s.m85692a(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, null);

            /* renamed from: d */
            final /* synthetic */ C14391a f63160d;

            public C14392a(C14391a aVar, String str) {
                C13706o.m87929f(str, "functionName");
                this.f63160d = aVar;
                this.f63157a = str;
            }

            /* renamed from: a */
            public final C13328m<String, C14383k> mo73076a() {
                C14473x xVar = C14473x.f63314a;
                String b = this.f63160d.mo73075b();
                String str = this.f63157a;
                List<C13328m<String, C14396q>> list = this.f63158b;
                ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
                for (C13328m c : list) {
                    arrayList.add((String) c.mo70154c());
                }
                String k = xVar.mo73225k(b, xVar.mo73224j(str, arrayList, this.f63159c.mo70154c()));
                C14396q d = this.f63159c.mo70155d();
                List<C13328m<String, C14396q>> list2 = this.f63158b;
                ArrayList arrayList2 = new ArrayList(C13616u.m87774u(list2, 10));
                for (C13328m d2 : list2) {
                    arrayList2.add((C14396q) d2.mo70155d());
                }
                return C13337s.m85692a(k, new C14383k(d, arrayList2));
            }

            /* renamed from: b */
            public final void mo73077b(String str, C14348e... eVarArr) {
                C14396q qVar;
                C13706o.m87929f(str, "type");
                C13706o.m87929f(eVarArr, "qualifiers");
                List<C13328m<String, C14396q>> list = this.f63158b;
                if (eVarArr.length == 0) {
                    qVar = null;
                } else {
                    Iterable<C13592k0> w0 = C13596m.m87629w0(eVarArr);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C16792h.m99540b(C13613s0.m87740e(C13616u.m87774u(w0, 10)), 16));
                    for (C13592k0 k0Var : w0) {
                        linkedHashMap.put(Integer.valueOf(k0Var.mo71844c()), (C14348e) k0Var.mo71845d());
                    }
                    qVar = new C14396q(linkedHashMap);
                }
                list.add(C13337s.m85692a(str, qVar));
            }

            /* renamed from: c */
            public final void mo73078c(String str, C14348e... eVarArr) {
                C13706o.m87929f(str, "type");
                C13706o.m87929f(eVarArr, "qualifiers");
                Iterable<C13592k0> w0 = C13596m.m87629w0(eVarArr);
                LinkedHashMap linkedHashMap = new LinkedHashMap(C16792h.m99540b(C13613s0.m87740e(C13616u.m87774u(w0, 10)), 16));
                for (C13592k0 k0Var : w0) {
                    linkedHashMap.put(Integer.valueOf(k0Var.mo71844c()), (C14348e) k0Var.mo71845d());
                }
                this.f63159c = C13337s.m85692a(str, new C14396q(linkedHashMap));
            }

            /* renamed from: d */
            public final void mo73079d(C16610e eVar) {
                C13706o.m87929f(eVar, "type");
                String f = eVar.mo79462f();
                C13706o.m87928e(f, "type.desc");
                this.f63159c = C13337s.m85692a(f, null);
            }
        }

        public C14391a(C14390m mVar, String str) {
            C13706o.m87929f(str, "className");
            this.f63156b = mVar;
            this.f63155a = str;
        }

        /* renamed from: a */
        public final void mo73074a(String str, C16265l<? super C14392a, C13339u> lVar) {
            C13706o.m87929f(str, "name");
            C13706o.m87929f(lVar, "block");
            Map a = this.f63156b.f63154a;
            C14392a aVar = new C14392a(this, str);
            lVar.invoke(aVar);
            C13328m<String, C14383k> a2 = aVar.mo73076a();
            a.put(a2.mo70154c(), a2.mo70155d());
        }

        /* renamed from: b */
        public final String mo73075b() {
            return this.f63155a;
        }
    }

    /* renamed from: b */
    public final Map<String, C14383k> mo73073b() {
        return this.f63154a;
    }
}
