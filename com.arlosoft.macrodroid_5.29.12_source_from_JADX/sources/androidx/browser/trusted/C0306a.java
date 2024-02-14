package androidx.browser.trusted;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.browser.trusted.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0306a implements CallbackToFutureAdapter.Resolver {

    /* renamed from: a */
    public final /* synthetic */ ConnectionHolder f336a;

    public /* synthetic */ C0306a(ConnectionHolder connectionHolder) {
        this.f336a = connectionHolder;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return this.f336a.lambda$getServiceWrapper$0(completer);
    }
}
