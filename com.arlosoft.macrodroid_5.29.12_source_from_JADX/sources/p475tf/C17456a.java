package p475tf;

import android.os.Bundle;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p397ta.C16605d;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001\u001a\u001e\u0010\t\u001a\u00020\b*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\"\u0018\u0010\r\u001a\u00020\n*\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, mo71668d2 = {"T", "Ltf/d;", "Lta/d;", "c", "", "key", "", "value", "Lja/u;", "e", "Landroid/os/Bundle;", "d", "(Ltf/d;)Landroid/os/Bundle;", "bundle", "bundle_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* renamed from: tf.a */
/* compiled from: BundleDelegates.kt */
public final class C17456a {
    /* renamed from: c */
    public static final <T> C16605d<C17459d, T> m101238c(C17459d dVar) {
        C13706o.m87929f(dVar, "$this$bundleOrNull");
        C17458c cVar = C17458c.f69243a;
        Objects.requireNonNull(cVar, "null cannot be cast to non-null type kotlin.properties.ReadWriteProperty<splitties.bundle.BundleSpec, T?>");
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final Bundle m101239d(C17459d dVar) {
        Bundle a = dVar.mo80830a();
        if (a != null) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle property accessed outside with() function! Thread: ");
        Thread currentThread = Thread.currentThread();
        C13706o.m87928e(currentThread, "Thread.currentThread()");
        sb.append(currentThread);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m101240e(C17459d dVar, String str, Object obj) {
        if (!dVar.mo80831c()) {
            C17457b.m101241a(m101239d(dVar), str, obj);
            return;
        }
        throw new IllegalStateException("The BundleSpec is in read only mode! If you're trying to mutate extras of an Activity, use putExtras instead of withExtras.".toString());
    }
}
