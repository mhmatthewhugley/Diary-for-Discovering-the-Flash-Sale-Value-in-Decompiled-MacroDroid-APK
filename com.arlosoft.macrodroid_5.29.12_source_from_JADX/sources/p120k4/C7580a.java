package p120k4;

import p102h4.C7376a;
import p102h4.C7378c;

/* renamed from: k4.a */
/* compiled from: DiskCacheStrategy */
public abstract class C7580a {

    /* renamed from: a */
    public static final C7580a f18488a = new C7581a();

    /* renamed from: b */
    public static final C7580a f18489b = new C7582b();

    /* renamed from: c */
    public static final C7580a f18490c = new C7583c();

    /* renamed from: d */
    public static final C7580a f18491d = new C7584d();

    /* renamed from: e */
    public static final C7580a f18492e = new C7585e();

    /* renamed from: k4.a$a */
    /* compiled from: DiskCacheStrategy */
    class C7581a extends C7580a {
        C7581a() {
        }

        /* renamed from: a */
        public boolean mo37655a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo37656b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo37657c(C7376a aVar) {
            return aVar == C7376a.REMOTE;
        }

        /* renamed from: d */
        public boolean mo37658d(boolean z, C7376a aVar, C7378c cVar) {
            return (aVar == C7376a.RESOURCE_DISK_CACHE || aVar == C7376a.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: k4.a$b */
    /* compiled from: DiskCacheStrategy */
    class C7582b extends C7580a {
        C7582b() {
        }

        /* renamed from: a */
        public boolean mo37655a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo37656b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo37657c(C7376a aVar) {
            return false;
        }

        /* renamed from: d */
        public boolean mo37658d(boolean z, C7376a aVar, C7378c cVar) {
            return false;
        }
    }

    /* renamed from: k4.a$c */
    /* compiled from: DiskCacheStrategy */
    class C7583c extends C7580a {
        C7583c() {
        }

        /* renamed from: a */
        public boolean mo37655a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo37656b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo37657c(C7376a aVar) {
            return (aVar == C7376a.DATA_DISK_CACHE || aVar == C7376a.MEMORY_CACHE) ? false : true;
        }

        /* renamed from: d */
        public boolean mo37658d(boolean z, C7376a aVar, C7378c cVar) {
            return false;
        }
    }

    /* renamed from: k4.a$d */
    /* compiled from: DiskCacheStrategy */
    class C7584d extends C7580a {
        C7584d() {
        }

        /* renamed from: a */
        public boolean mo37655a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo37656b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo37657c(C7376a aVar) {
            return false;
        }

        /* renamed from: d */
        public boolean mo37658d(boolean z, C7376a aVar, C7378c cVar) {
            return (aVar == C7376a.RESOURCE_DISK_CACHE || aVar == C7376a.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: k4.a$e */
    /* compiled from: DiskCacheStrategy */
    class C7585e extends C7580a {
        C7585e() {
        }

        /* renamed from: a */
        public boolean mo37655a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo37656b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo37657c(C7376a aVar) {
            return aVar == C7376a.REMOTE;
        }

        /* renamed from: d */
        public boolean mo37658d(boolean z, C7376a aVar, C7378c cVar) {
            return ((z && aVar == C7376a.DATA_DISK_CACHE) || aVar == C7376a.LOCAL) && cVar == C7378c.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo37655a();

    /* renamed from: b */
    public abstract boolean mo37656b();

    /* renamed from: c */
    public abstract boolean mo37657c(C7376a aVar);

    /* renamed from: d */
    public abstract boolean mo37658d(boolean z, C7376a aVar, C7378c cVar);
}
