package androidx.window.embedding;

import androidx.window.embedding.ExtensionEmbeddingBackend;
import java.util.List;

/* renamed from: androidx.window.embedding.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1306c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ExtensionEmbeddingBackend.SplitListenerWrapper f704a;

    /* renamed from: c */
    public final /* synthetic */ List f705c;

    public /* synthetic */ C1306c(ExtensionEmbeddingBackend.SplitListenerWrapper splitListenerWrapper, List list) {
        this.f704a = splitListenerWrapper;
        this.f705c = list;
    }

    public final void run() {
        ExtensionEmbeddingBackend.SplitListenerWrapper.m101283accept$lambda1(this.f704a, this.f705c);
    }
}
