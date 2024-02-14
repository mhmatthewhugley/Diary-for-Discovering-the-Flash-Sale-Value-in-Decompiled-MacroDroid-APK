package p292io.reactivex.internal.util;

import java.io.Serializable;
import p241da.C11984b;
import p329me.C15738c;
import p329me.C15739d;
import p414v9.C16741n;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.util.i */
/* compiled from: NotificationLite */
public enum C13224i {
    COMPLETE;

    /* renamed from: io.reactivex.internal.util.i$a */
    /* compiled from: NotificationLite */
    static final class C13225a implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        final C17071b upstream;

        public String toString() {
            return "NotificationLite.Disposable[" + this.upstream + "]";
        }
    }

    /* renamed from: io.reactivex.internal.util.i$b */
    /* compiled from: NotificationLite */
    static final class C13226b implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: e */
        final Throwable f61118e;

        C13226b(Throwable th) {
            this.f61118e = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C13226b) {
                return C11984b.m82366c(this.f61118e, ((C13226b) obj).f61118e);
            }
            return false;
        }

        public int hashCode() {
            return this.f61118e.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f61118e + "]";
        }
    }

    /* renamed from: io.reactivex.internal.util.i$c */
    /* compiled from: NotificationLite */
    static final class C13227c implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        final C15739d upstream;

        C13227c(C15739d dVar) {
            this.upstream = dVar;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.upstream + "]";
        }
    }

    /* renamed from: b */
    public static <T> boolean m85554b(Object obj, C16741n<? super T> nVar) {
        if (obj == COMPLETE) {
            nVar.onComplete();
            return true;
        } else if (obj instanceof C13226b) {
            nVar.onError(((C13226b) obj).f61118e);
            return true;
        } else {
            nVar.onNext(obj);
            return false;
        }
    }

    /* renamed from: d */
    public static <T> boolean m85555d(Object obj, C15738c<? super T> cVar) {
        if (obj == COMPLETE) {
            cVar.onComplete();
            return true;
        } else if (obj instanceof C13226b) {
            cVar.onError(((C13226b) obj).f61118e);
            return true;
        } else if (obj instanceof C13227c) {
            cVar.mo68760a(((C13227c) obj).upstream);
            return false;
        } else {
            cVar.onNext(obj);
            return false;
        }
    }

    /* renamed from: e */
    public static <T> boolean m85556e(Object obj, C16741n<? super T> nVar) {
        if (obj == COMPLETE) {
            nVar.onComplete();
            return true;
        } else if (obj instanceof C13226b) {
            nVar.onError(((C13226b) obj).f61118e);
            return true;
        } else if (obj instanceof C13225a) {
            nVar.onSubscribe(((C13225a) obj).upstream);
            return false;
        } else {
            nVar.onNext(obj);
            return false;
        }
    }

    /* renamed from: f */
    public static Object m85557f() {
        return COMPLETE;
    }

    /* renamed from: g */
    public static Object m85558g(Throwable th) {
        return new C13226b(th);
    }

    /* renamed from: i */
    public static <T> Object m85559i(T t) {
        return t;
    }

    /* renamed from: j */
    public static Object m85560j(C15739d dVar) {
        return new C13227c(dVar);
    }

    public String toString() {
        return "NotificationLite.Complete";
    }
}
