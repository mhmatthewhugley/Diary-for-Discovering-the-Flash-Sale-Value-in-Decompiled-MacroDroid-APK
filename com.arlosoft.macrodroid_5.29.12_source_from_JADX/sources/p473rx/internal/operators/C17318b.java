package p473rx.internal.operators;

import java.io.Serializable;
import p459ef.C17156d;

/* renamed from: rx.internal.operators.b */
/* compiled from: NotificationLite */
public final class C17318b<T> {

    /* renamed from: a */
    private static final C17318b f68983a = new C17318b();

    /* renamed from: b */
    private static final Object f68984b = new C17319a();

    /* renamed from: c */
    private static final Object f68985c = new C17320b();

    /* renamed from: rx.internal.operators.b$a */
    /* compiled from: NotificationLite */
    static class C17319a implements Serializable {
        private static final long serialVersionUID = 1;

        C17319a() {
        }

        public String toString() {
            return "Notification=>Completed";
        }
    }

    /* renamed from: rx.internal.operators.b$b */
    /* compiled from: NotificationLite */
    static class C17320b implements Serializable {
        private static final long serialVersionUID = 2;

        C17320b() {
        }

        public String toString() {
            return "Notification=>NULL";
        }
    }

    /* renamed from: rx.internal.operators.b$c */
    /* compiled from: NotificationLite */
    static final class C17321c implements Serializable {
        private static final long serialVersionUID = 3;

        /* renamed from: e */
        final Throwable f68986e;

        public C17321c(Throwable th) {
            this.f68986e = th;
        }

        public String toString() {
            return "Notification=>Error:" + this.f68986e;
        }
    }

    private C17318b() {
    }

    /* renamed from: e */
    public static <T> C17318b<T> m101039e() {
        return f68983a;
    }

    /* renamed from: a */
    public boolean mo80645a(C17156d<? super T> dVar, Object obj) {
        if (obj == f68984b) {
            dVar.onCompleted();
            return true;
        } else if (obj == f68985c) {
            dVar.onNext(null);
            return false;
        } else if (obj == null) {
            throw new IllegalArgumentException("The lite notification can not be null");
        } else if (obj.getClass() == C17321c.class) {
            dVar.onError(((C17321c) obj).f68986e);
            return true;
        } else {
            dVar.onNext(obj);
            return false;
        }
    }

    /* renamed from: b */
    public Object mo80646b() {
        return f68984b;
    }

    /* renamed from: c */
    public Object mo80647c(Throwable th) {
        return new C17321c(th);
    }

    /* renamed from: d */
    public T mo80648d(Object obj) {
        if (obj == f68985c) {
            return null;
        }
        return obj;
    }

    /* renamed from: f */
    public Object mo80649f(T t) {
        return t == null ? f68985c : t;
    }
}
