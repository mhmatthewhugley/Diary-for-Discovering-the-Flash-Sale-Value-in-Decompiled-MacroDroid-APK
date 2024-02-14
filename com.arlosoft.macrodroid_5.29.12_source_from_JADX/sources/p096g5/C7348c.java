package p096g5;

import androidx.annotation.NonNull;

/* renamed from: g5.c */
/* compiled from: StateVerifier */
public abstract class C7348c {

    /* renamed from: g5.c$b */
    /* compiled from: StateVerifier */
    private static class C7350b extends C7348c {

        /* renamed from: a */
        private volatile boolean f17997a;

        C7350b() {
            super();
        }

        /* renamed from: b */
        public void mo37325b(boolean z) {
            this.f17997a = z;
        }

        /* renamed from: c */
        public void mo37326c() {
            if (this.f17997a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    private C7348c() {
    }

    @NonNull
    /* renamed from: a */
    public static C7348c m30358a() {
        return new C7350b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo37325b(boolean z);

    /* renamed from: c */
    public abstract void mo37326c();
}
