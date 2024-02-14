package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import okhttp3.C15907c0;
import okhttp3.C15986u;
import okhttp3.C15997y;

/* renamed from: retrofit2.o */
/* compiled from: ParameterHandler */
abstract class C17275o<T> {

    /* renamed from: retrofit2.o$a */
    /* compiled from: ParameterHandler */
    class C17276a extends C17275o<Iterable<T>> {
        C17276a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo80562a(C17296q qVar, Iterable<T> iterable) throws IOException {
            if (iterable != null) {
                for (T a : iterable) {
                    C17275o.this.mo80562a(qVar, a);
                }
            }
        }
    }

    /* renamed from: retrofit2.o$b */
    /* compiled from: ParameterHandler */
    class C17277b extends C17275o<Object> {
        C17277b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo80562a(C17296q qVar, Object obj) throws IOException {
            if (obj != null) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    C17275o.this.mo80562a(qVar, Array.get(obj, i));
                }
            }
        }
    }

    /* renamed from: retrofit2.o$c */
    /* compiled from: ParameterHandler */
    static final class C17278c<T> extends C17275o<T> {

        /* renamed from: a */
        private final Method f68853a;

        /* renamed from: b */
        private final int f68854b;

        /* renamed from: c */
        private final C17246f<T, C15907c0> f68855c;

        C17278c(Method method, int i, C17246f<T, C15907c0> fVar) {
            this.f68853a = method;
            this.f68854b = i;
            this.f68855c = fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo80562a(C17296q qVar, T t) {
            if (t != null) {
                try {
                    qVar.mo80588l(this.f68855c.mo80387a(t));
                } catch (IOException e) {
                    Method method = this.f68853a;
                    int i = this.f68854b;
                    throw C17307x.m101014p(method, e, i, "Unable to convert " + t + " to RequestBody", new Object[0]);
                }
            } else {
                throw C17307x.m101013o(this.f68853a, this.f68854b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    /* renamed from: retrofit2.o$d */
    /* compiled from: ParameterHandler */
    static final class C17279d<T> extends C17275o<T> {

        /* renamed from: a */
        private final String f68856a;

        /* renamed from: b */
        private final C17246f<T, String> f68857b;

        /* renamed from: c */
        private final boolean f68858c;

        C17279d(String str, C17246f<T, String> fVar, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f68856a = str;
            this.f68857b = fVar;
            this.f68858c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo80562a(C17296q qVar, T t) throws IOException {
            String a;
            if (t != null && (a = this.f68857b.mo80387a(t)) != null) {
                qVar.mo80579a(this.f68856a, a, this.f68858c);
            }
        }
    }

    /* renamed from: retrofit2.o$e */
    /* compiled from: ParameterHandler */
    static final class C17280e<T> extends C17275o<Map<String, T>> {

        /* renamed from: a */
        private final Method f68859a;

        /* renamed from: b */
        private final int f68860b;

        /* renamed from: c */
        private final C17246f<T, String> f68861c;

        /* renamed from: d */
        private final boolean f68862d;

        C17280e(Method method, int i, C17246f<T, String> fVar, boolean z) {
            this.f68859a = method;
            this.f68860b = i;
            this.f68861c = fVar;
            this.f68862d = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo80562a(C17296q qVar, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String a = this.f68861c.mo80387a(value);
                            if (a != null) {
                                qVar.mo80579a(str, a, this.f68862d);
                            } else {
                                Method method = this.f68859a;
                                int i = this.f68860b;
                                throw C17307x.m101013o(method, i, "Field map value '" + value + "' converted to null by " + this.f68861c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f68859a;
                            int i2 = this.f68860b;
                            throw C17307x.m101013o(method2, i2, "Field map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C17307x.m101013o(this.f68859a, this.f68860b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C17307x.m101013o(this.f68859a, this.f68860b, "Field map was null.", new Object[0]);
        }
    }

    /* renamed from: retrofit2.o$f */
    /* compiled from: ParameterHandler */
    static final class C17281f<T> extends C17275o<T> {

        /* renamed from: a */
        private final String f68863a;

        /* renamed from: b */
        private final C17246f<T, String> f68864b;

        C17281f(String str, C17246f<T, String> fVar) {
            Objects.requireNonNull(str, "name == null");
            this.f68863a = str;
            this.f68864b = fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo80562a(C17296q qVar, T t) throws IOException {
            String a;
            if (t != null && (a = this.f68864b.mo80387a(t)) != null) {
                qVar.mo80580b(this.f68863a, a);
            }
        }
    }

    /* renamed from: retrofit2.o$g */
    /* compiled from: ParameterHandler */
    static final class C17282g<T> extends C17275o<Map<String, T>> {

        /* renamed from: a */
        private final Method f68865a;

        /* renamed from: b */
        private final int f68866b;

        /* renamed from: c */
        private final C17246f<T, String> f68867c;

        C17282g(Method method, int i, C17246f<T, String> fVar) {
            this.f68865a = method;
            this.f68866b = i;
            this.f68867c = fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo80562a(C17296q qVar, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            qVar.mo80580b(str, this.f68867c.mo80387a(value));
                        } else {
                            Method method = this.f68865a;
                            int i = this.f68866b;
                            throw C17307x.m101013o(method, i, "Header map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C17307x.m101013o(this.f68865a, this.f68866b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C17307x.m101013o(this.f68865a, this.f68866b, "Header map was null.", new Object[0]);
        }
    }

    /* renamed from: retrofit2.o$h */
    /* compiled from: ParameterHandler */
    static final class C17283h extends C17275o<C15986u> {

        /* renamed from: a */
        private final Method f68868a;

        /* renamed from: b */
        private final int f68869b;

        C17283h(Method method, int i) {
            this.f68868a = method;
            this.f68869b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo80562a(C17296q qVar, C15986u uVar) {
            if (uVar != null) {
                qVar.mo80581c(uVar);
                return;
            }
            throw C17307x.m101013o(this.f68868a, this.f68869b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* renamed from: retrofit2.o$i */
    /* compiled from: ParameterHandler */
    static final class C17284i<T> extends C17275o<T> {

        /* renamed from: a */
        private final Method f68870a;

        /* renamed from: b */
        private final int f68871b;

        /* renamed from: c */
        private final C15986u f68872c;

        /* renamed from: d */
        private final C17246f<T, C15907c0> f68873d;

        C17284i(Method method, int i, C15986u uVar, C17246f<T, C15907c0> fVar) {
            this.f68870a = method;
            this.f68871b = i;
            this.f68872c = uVar;
            this.f68873d = fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo80562a(C17296q qVar, T t) {
            if (t != null) {
                try {
                    qVar.mo80582d(this.f68872c, this.f68873d.mo80387a(t));
                } catch (IOException e) {
                    Method method = this.f68870a;
                    int i = this.f68871b;
                    throw C17307x.m101013o(method, i, "Unable to convert " + t + " to RequestBody", e);
                }
            }
        }
    }

    /* renamed from: retrofit2.o$j */
    /* compiled from: ParameterHandler */
    static final class C17285j<T> extends C17275o<Map<String, T>> {

        /* renamed from: a */
        private final Method f68874a;

        /* renamed from: b */
        private final int f68875b;

        /* renamed from: c */
        private final C17246f<T, C15907c0> f68876c;

        /* renamed from: d */
        private final String f68877d;

        C17285j(Method method, int i, C17246f<T, C15907c0> fVar, String str) {
            this.f68874a = method;
            this.f68875b = i;
            this.f68876c = fVar;
            this.f68877d = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo80562a(C17296q qVar, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            qVar.mo80582d(C15986u.m96302h("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f68877d), this.f68876c.mo80387a(value));
                        } else {
                            Method method = this.f68874a;
                            int i = this.f68875b;
                            throw C17307x.m101013o(method, i, "Part map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C17307x.m101013o(this.f68874a, this.f68875b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C17307x.m101013o(this.f68874a, this.f68875b, "Part map was null.", new Object[0]);
        }
    }

    /* renamed from: retrofit2.o$k */
    /* compiled from: ParameterHandler */
    static final class C17286k<T> extends C17275o<T> {

        /* renamed from: a */
        private final Method f68878a;

        /* renamed from: b */
        private final int f68879b;

        /* renamed from: c */
        private final String f68880c;

        /* renamed from: d */
        private final C17246f<T, String> f68881d;

        /* renamed from: e */
        private final boolean f68882e;

        C17286k(Method method, int i, String str, C17246f<T, String> fVar, boolean z) {
            this.f68878a = method;
            this.f68879b = i;
            Objects.requireNonNull(str, "name == null");
            this.f68880c = str;
            this.f68881d = fVar;
            this.f68882e = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo80562a(C17296q qVar, T t) throws IOException {
            if (t != null) {
                qVar.mo80584f(this.f68880c, this.f68881d.mo80387a(t), this.f68882e);
                return;
            }
            Method method = this.f68878a;
            int i = this.f68879b;
            throw C17307x.m101013o(method, i, "Path parameter \"" + this.f68880c + "\" value must not be null.", new Object[0]);
        }
    }

    /* renamed from: retrofit2.o$l */
    /* compiled from: ParameterHandler */
    static final class C17287l<T> extends C17275o<T> {

        /* renamed from: a */
        private final String f68883a;

        /* renamed from: b */
        private final C17246f<T, String> f68884b;

        /* renamed from: c */
        private final boolean f68885c;

        C17287l(String str, C17246f<T, String> fVar, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f68883a = str;
            this.f68884b = fVar;
            this.f68885c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo80562a(C17296q qVar, T t) throws IOException {
            String a;
            if (t != null && (a = this.f68884b.mo80387a(t)) != null) {
                qVar.mo80585g(this.f68883a, a, this.f68885c);
            }
        }
    }

    /* renamed from: retrofit2.o$m */
    /* compiled from: ParameterHandler */
    static final class C17288m<T> extends C17275o<Map<String, T>> {

        /* renamed from: a */
        private final Method f68886a;

        /* renamed from: b */
        private final int f68887b;

        /* renamed from: c */
        private final C17246f<T, String> f68888c;

        /* renamed from: d */
        private final boolean f68889d;

        C17288m(Method method, int i, C17246f<T, String> fVar, boolean z) {
            this.f68886a = method;
            this.f68887b = i;
            this.f68888c = fVar;
            this.f68889d = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo80562a(C17296q qVar, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String a = this.f68888c.mo80387a(value);
                            if (a != null) {
                                qVar.mo80585g(str, a, this.f68889d);
                            } else {
                                Method method = this.f68886a;
                                int i = this.f68887b;
                                throw C17307x.m101013o(method, i, "Query map value '" + value + "' converted to null by " + this.f68888c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f68886a;
                            int i2 = this.f68887b;
                            throw C17307x.m101013o(method2, i2, "Query map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C17307x.m101013o(this.f68886a, this.f68887b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C17307x.m101013o(this.f68886a, this.f68887b, "Query map was null", new Object[0]);
        }
    }

    /* renamed from: retrofit2.o$n */
    /* compiled from: ParameterHandler */
    static final class C17289n<T> extends C17275o<T> {

        /* renamed from: a */
        private final C17246f<T, String> f68890a;

        /* renamed from: b */
        private final boolean f68891b;

        C17289n(C17246f<T, String> fVar, boolean z) {
            this.f68890a = fVar;
            this.f68891b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo80562a(C17296q qVar, T t) throws IOException {
            if (t != null) {
                qVar.mo80585g(this.f68890a.mo80387a(t), (String) null, this.f68891b);
            }
        }
    }

    /* renamed from: retrofit2.o$o */
    /* compiled from: ParameterHandler */
    static final class C17290o extends C17275o<C15997y.C16000c> {

        /* renamed from: a */
        static final C17290o f68892a = new C17290o();

        private C17290o() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo80562a(C17296q qVar, C15997y.C16000c cVar) {
            if (cVar != null) {
                qVar.mo80583e(cVar);
            }
        }
    }

    /* renamed from: retrofit2.o$p */
    /* compiled from: ParameterHandler */
    static final class C17291p extends C17275o<Object> {

        /* renamed from: a */
        private final Method f68893a;

        /* renamed from: b */
        private final int f68894b;

        C17291p(Method method, int i) {
            this.f68893a = method;
            this.f68894b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo80562a(C17296q qVar, Object obj) {
            if (obj != null) {
                qVar.mo80589m(obj);
                return;
            }
            throw C17307x.m101013o(this.f68893a, this.f68894b, "@Url parameter is null.", new Object[0]);
        }
    }

    /* renamed from: retrofit2.o$q */
    /* compiled from: ParameterHandler */
    static final class C17292q<T> extends C17275o<T> {

        /* renamed from: a */
        final Class<T> f68895a;

        C17292q(Class<T> cls) {
            this.f68895a = cls;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo80562a(C17296q qVar, T t) {
            qVar.mo80586h(this.f68895a, t);
        }
    }

    C17275o() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo80562a(C17296q qVar, T t) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C17275o<Object> mo80563b() {
        return new C17277b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C17275o<Iterable<T>> mo80564c() {
        return new C17276a();
    }
}
