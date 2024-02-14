package com.google.firebase.components;

public final class Dependency {

    /* renamed from: a */
    private final Class<?> f4785a;

    /* renamed from: b */
    private final int f4786b;

    /* renamed from: c */
    private final int f4787c;

    private Dependency(Class<?> cls, int i, int i2) {
        this.f4785a = (Class) Preconditions.m6458c(cls, "Null dependency anInterface.");
        this.f4786b = i;
        this.f4787c = i2;
    }

    /* renamed from: a */
    public static Dependency m6423a(Class<?> cls) {
        return new Dependency(cls, 0, 2);
    }

    /* renamed from: b */
    private static String m6424b(int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return "provider";
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i);
    }

    @Deprecated
    /* renamed from: h */
    public static Dependency m6425h(Class<?> cls) {
        return new Dependency(cls, 0, 0);
    }

    /* renamed from: i */
    public static Dependency m6426i(Class<?> cls) {
        return new Dependency(cls, 0, 1);
    }

    /* renamed from: j */
    public static Dependency m6427j(Class<?> cls) {
        return new Dependency(cls, 1, 0);
    }

    /* renamed from: k */
    public static Dependency m6428k(Class<?> cls) {
        return new Dependency(cls, 1, 1);
    }

    /* renamed from: l */
    public static Dependency m6429l(Class<?> cls) {
        return new Dependency(cls, 2, 0);
    }

    /* renamed from: c */
    public Class<?> mo22909c() {
        return this.f4785a;
    }

    /* renamed from: d */
    public boolean mo22910d() {
        return this.f4787c == 2;
    }

    /* renamed from: e */
    public boolean mo22911e() {
        return this.f4787c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Dependency)) {
            return false;
        }
        Dependency dependency = (Dependency) obj;
        if (this.f4785a == dependency.f4785a && this.f4786b == dependency.f4786b && this.f4787c == dependency.f4787c) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo22913f() {
        return this.f4786b == 1;
    }

    /* renamed from: g */
    public boolean mo22914g() {
        return this.f4786b == 2;
    }

    public int hashCode() {
        return ((((this.f4785a.hashCode() ^ 1000003) * 1000003) ^ this.f4786b) * 1000003) ^ this.f4787c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f4785a);
        sb.append(", type=");
        int i = this.f4786b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(m6424b(this.f4787c));
        sb.append("}");
        return sb.toString();
    }
}
