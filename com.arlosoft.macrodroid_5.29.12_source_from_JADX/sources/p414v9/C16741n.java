package p414v9;

import p448z9.C17071b;

/* renamed from: v9.n */
/* compiled from: Observer */
public interface C16741n<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(C17071b bVar);
}
