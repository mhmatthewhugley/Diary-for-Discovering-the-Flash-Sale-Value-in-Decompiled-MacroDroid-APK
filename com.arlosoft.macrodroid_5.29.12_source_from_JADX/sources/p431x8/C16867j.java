package p431x8;

import java.lang.reflect.Method;

/* renamed from: x8.j */
/* compiled from: SubscriberMethod */
final class C16867j {

    /* renamed from: a */
    final Method f68107a;

    /* renamed from: b */
    final C16870m f68108b;

    /* renamed from: c */
    final Class<?> f68109c;

    /* renamed from: d */
    String f68110d;

    C16867j(Method method, C16870m mVar, Class<?> cls) {
        this.f68107a = method;
        this.f68108b = mVar;
        this.f68109c = cls;
    }

    /* renamed from: a */
    private synchronized void m99919a() {
        if (this.f68110d == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f68107a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f68107a.getName());
            sb.append('(');
            sb.append(this.f68109c.getName());
            this.f68110d = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C16867j)) {
            return false;
        }
        m99919a();
        C16867j jVar = (C16867j) obj;
        jVar.m99919a();
        return this.f68110d.equals(jVar.f68110d);
    }

    public int hashCode() {
        return this.f68107a.hashCode();
    }
}
