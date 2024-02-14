package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14616f;
import p298jb.C13359a;
import p362pb.C16151b;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.q */
/* compiled from: KotlinJvmBinaryClass.kt */
public interface C14459q {

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.q$a */
    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface C14460a {
        /* renamed from: a */
        void mo70781a();

        /* renamed from: b */
        void mo70782b(C16157f fVar, C16151b bVar, C16157f fVar2);

        /* renamed from: c */
        C14460a mo70783c(C16157f fVar, C16151b bVar);

        /* renamed from: d */
        void mo70784d(C16157f fVar, Object obj);

        /* renamed from: e */
        void mo70785e(C16157f fVar, C14616f fVar2);

        /* renamed from: f */
        C14461b mo70786f(C16157f fVar);
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.q$b */
    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface C14461b {
        /* renamed from: a */
        void mo70775a();

        /* renamed from: b */
        C14460a mo70776b(C16151b bVar);

        /* renamed from: c */
        void mo70777c(C16151b bVar, C16157f fVar);

        /* renamed from: d */
        void mo70778d(Object obj);

        /* renamed from: e */
        void mo70779e(C14616f fVar);
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.q$c */
    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface C14462c {
        /* renamed from: a */
        void mo70772a();

        /* renamed from: c */
        C14460a mo70773c(C16151b bVar, C14158z0 z0Var);
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.q$d */
    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface C14463d {
        /* renamed from: a */
        C14462c mo73120a(C16157f fVar, String str, Object obj);

        /* renamed from: b */
        C14464e mo73121b(C16157f fVar, String str);
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.q$e */
    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface C14464e extends C14462c {
        /* renamed from: b */
        C14460a mo73122b(int i, C16151b bVar, C14158z0 z0Var);
    }

    /* renamed from: a */
    void mo67426a(C14463d dVar, byte[] bArr);

    /* renamed from: b */
    C13359a mo67427b();

    /* renamed from: c */
    void mo67428c(C14462c cVar, byte[] bArr);

    /* renamed from: d */
    C16151b mo67429d();

    String getLocation();
}
