package p475tf;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p297ja.C13321g;
import p370qa.C16254a;
import p484yf.C17517a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u0013R#\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028BX\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00028BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007R.\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u00038@@@X\u000e¢\u0006\u0012\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u001a\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t8@@@X\u000e¢\u0006\u0012\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, mo71668d2 = {"Ltf/d;", "", "Ljava/lang/ThreadLocal;", "Landroid/os/Bundle;", "currentBundleByThread$delegate", "Lja/g;", "b", "()Ljava/lang/ThreadLocal;", "currentBundleByThread", "", "isReadOnlyByThread$delegate", "d", "isReadOnlyByThread", "value", "a", "()Landroid/os/Bundle;", "e", "(Landroid/os/Bundle;)V", "getCurrentBundle$annotations", "()V", "currentBundle", "c", "()Z", "f", "(Z)V", "isReadOnly$annotations", "isReadOnly", "<init>", "bundle_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: tf.d */
/* compiled from: BundleSpec.kt */
public class C17459d {

    /* renamed from: a */
    private Bundle f69244a;

    /* renamed from: b */
    private final C13321g f69245b = C13323i.m85669b(C17460a.f69248a);

    /* renamed from: c */
    private boolean f69246c;

    /* renamed from: d */
    private final C13321g f69247d = C13323i.m85669b(C17461b.f69249a);

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"Ljava/lang/ThreadLocal;", "Landroid/os/Bundle;", "a", "()Ljava/lang/ThreadLocal;"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: tf.d$a */
    /* compiled from: BundleSpec.kt */
    static final class C17460a extends C13708q implements C16254a<ThreadLocal<Bundle>> {

        /* renamed from: a */
        public static final C17460a f69248a = new C17460a();

        C17460a() {
            super(0);
        }

        /* renamed from: a */
        public final ThreadLocal<Bundle> invoke() {
            return new ThreadLocal<>();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"Ljava/lang/ThreadLocal;", "", "a", "()Ljava/lang/ThreadLocal;"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: tf.d$b */
    /* compiled from: BundleSpec.kt */
    static final class C17461b extends C13708q implements C16254a<ThreadLocal<Boolean>> {

        /* renamed from: a */
        public static final C17461b f69249a = new C17461b();

        C17461b() {
            super(0);
        }

        /* renamed from: a */
        public final ThreadLocal<Boolean> invoke() {
            return new ThreadLocal<>();
        }
    }

    /* renamed from: b */
    private final ThreadLocal<Bundle> m101249b() {
        return (ThreadLocal) this.f69245b.getValue();
    }

    /* renamed from: d */
    private final ThreadLocal<Boolean> m101250d() {
        return (ThreadLocal) this.f69247d.getValue();
    }

    /* renamed from: a */
    public final Bundle mo80830a() {
        return C17517a.f69347b == Thread.currentThread() ? this.f69244a : m101249b().get();
    }

    /* renamed from: c */
    public final boolean mo80831c() {
        if (C17517a.f69347b == Thread.currentThread()) {
            return this.f69246c;
        }
        Boolean bool = m101250d().get();
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        C13706o.m87928e(bool, "isReadOnlyByThread.get() ?: false");
        return bool.booleanValue();
    }

    /* renamed from: e */
    public final void mo80832e(Bundle bundle) {
        if (C17517a.f69347b == Thread.currentThread()) {
            this.f69244a = bundle;
        } else {
            m101249b().set(bundle);
        }
    }

    /* renamed from: f */
    public final void mo80833f(boolean z) {
        if (C17517a.f69347b == Thread.currentThread()) {
            this.f69246c = z;
        } else {
            m101250d().set(Boolean.valueOf(z));
        }
    }
}
