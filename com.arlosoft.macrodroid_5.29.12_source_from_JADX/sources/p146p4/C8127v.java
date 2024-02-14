package p146p4;

import androidx.annotation.NonNull;
import p083e4.C7275g;
import p084e5.C7284c;
import p102h4.C7376a;
import p102h4.C7384g;
import p108i4.C7401d;
import p146p4.C8105n;

/* renamed from: p4.v */
/* compiled from: UnitModelLoader */
public class C8127v<Model> implements C8105n<Model, Model> {

    /* renamed from: a */
    private static final C8127v<?> f19740a = new C8127v<>();

    /* renamed from: p4.v$a */
    /* compiled from: UnitModelLoader */
    public static class C8128a<Model> implements C8107o<Model, Model> {

        /* renamed from: a */
        private static final C8128a<?> f19741a = new C8128a<>();

        /* renamed from: b */
        public static <T> C8128a<T> m33775b() {
            return f19741a;
        }

        @NonNull
        /* renamed from: a */
        public C8105n<Model, Model> mo38078a(C8113r rVar) {
            return C8127v.m33772c();
        }
    }

    /* renamed from: p4.v$b */
    /* compiled from: UnitModelLoader */
    private static class C8129b<Model> implements C7401d<Model> {

        /* renamed from: a */
        private final Model f19742a;

        C8129b(Model model) {
            this.f19742a = model;
        }

        @NonNull
        /* renamed from: a */
        public Class<Model> mo37430a() {
            return this.f19742a.getClass();
        }

        /* renamed from: b */
        public void mo37435b() {
        }

        public void cancel() {
        }

        @NonNull
        /* renamed from: d */
        public C7376a mo37438d() {
            return C7376a.LOCAL;
        }

        /* renamed from: f */
        public void mo37440f(@NonNull C7275g gVar, @NonNull C7401d.C7402a<? super Model> aVar) {
            aVar.mo33008e(this.f19742a);
        }
    }

    /* renamed from: c */
    public static <T> C8127v<T> m33772c() {
        return f19740a;
    }

    /* renamed from: a */
    public boolean mo38073a(@NonNull Model model) {
        return true;
    }

    /* renamed from: b */
    public C8105n.C8106a<Model> mo38074b(@NonNull Model model, int i, int i2, @NonNull C7384g gVar) {
        return new C8105n.C8106a<>(new C7284c(model), new C8129b(model));
    }
}
