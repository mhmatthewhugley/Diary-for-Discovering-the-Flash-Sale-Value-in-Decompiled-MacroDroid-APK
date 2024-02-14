package androidx.browser.trusted;

import android.net.Uri;

/* renamed from: androidx.browser.trusted.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0309d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ TrustedWebActivityServiceConnectionPool f338a;

    /* renamed from: c */
    public final /* synthetic */ Uri f339c;

    public /* synthetic */ C0309d(TrustedWebActivityServiceConnectionPool trustedWebActivityServiceConnectionPool, Uri uri) {
        this.f338a = trustedWebActivityServiceConnectionPool;
        this.f339c = uri;
    }

    public final void run() {
        this.f338a.lambda$connect$0(this.f339c);
    }
}
