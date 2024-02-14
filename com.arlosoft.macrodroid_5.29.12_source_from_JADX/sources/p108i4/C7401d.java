package p108i4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p083e4.C7275g;
import p102h4.C7376a;

/* renamed from: i4.d */
/* compiled from: DataFetcher */
public interface C7401d<T> {

    /* renamed from: i4.d$a */
    /* compiled from: DataFetcher */
    public interface C7402a<T> {
        /* renamed from: c */
        void mo33006c(@NonNull Exception exc);

        /* renamed from: e */
        void mo33008e(@Nullable T t);
    }

    @NonNull
    /* renamed from: a */
    Class<T> mo37430a();

    /* renamed from: b */
    void mo37435b();

    void cancel();

    @NonNull
    /* renamed from: d */
    C7376a mo37438d();

    /* renamed from: f */
    void mo37440f(@NonNull C7275g gVar, @NonNull C7402a<? super T> aVar);
}
