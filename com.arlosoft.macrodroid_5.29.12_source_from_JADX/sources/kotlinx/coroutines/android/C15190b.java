package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15202c1;
import kotlinx.coroutines.C15476j2;
import kotlinx.coroutines.C15492n;
import kotlinx.coroutines.C15575z1;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010$\u001a\u00020\n¢\u0006\u0004\b*\u0010+B\u001d\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b*\u0010,J\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u001e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0016J$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010)\u001a\u00020\u00008\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b'\u0010(¨\u0006-"}, mo71668d2 = {"Lkotlinx/coroutines/android/b;", "Lkotlinx/coroutines/android/c;", "Lkotlinx/coroutines/t0;", "Lkotlin/coroutines/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lja/u;", "D", "", "isDispatchNeeded", "dispatch", "", "timeMillis", "Lkotlinx/coroutines/n;", "continuation", "f", "Lkotlinx/coroutines/c1;", "j", "", "toString", "", "other", "equals", "", "hashCode", "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "handler", "c", "Ljava/lang/String;", "name", "d", "Z", "invokeImmediately", "_immediate", "Lkotlinx/coroutines/android/b;", "E", "()Lkotlinx/coroutines/android/b;", "immediate", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "kotlinx-coroutines-android"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.android.b */
/* compiled from: HandlerDispatcher.kt */
public final class C15190b extends C15193c {
    private volatile C15190b _immediate;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Handler f64396a;

    /* renamed from: c */
    private final String f64397c;

    /* renamed from: d */
    private final boolean f64398d;

    /* renamed from: f */
    private final C15190b f64399f;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Lja/u;", "run", "()V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.android.b$a */
    /* compiled from: Runnable.kt */
    public static final class C15191a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C15492n f64400a;

        /* renamed from: c */
        final /* synthetic */ C15190b f64401c;

        public C15191a(C15492n nVar, C15190b bVar) {
            this.f64400a = nVar;
            this.f64401c = bVar;
        }

        public final void run() {
            this.f64400a.mo74847q(this.f64401c, C13339u.f61331a);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"", "it", "Lja/u;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.android.b$b */
    /* compiled from: HandlerDispatcher.kt */
    static final class C15192b extends C13708q implements C16265l<Throwable, C13339u> {
        final /* synthetic */ Runnable $block;
        final /* synthetic */ C15190b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15192b(C15190b bVar, Runnable runnable) {
            super(1);
            this.this$0 = bVar;
            this.$block = runnable;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C13339u.f61331a;
        }

        public final void invoke(Throwable th) {
            this.this$0.f64396a.removeCallbacks(this.$block);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C15190b(Handler handler, String str, boolean z) {
        super((C13695i) null);
        C15190b bVar = null;
        this.f64396a = handler;
        this.f64397c = str;
        this.f64398d = z;
        this._immediate = z ? this : bVar;
        C15190b bVar2 = this._immediate;
        if (bVar2 == null) {
            bVar2 = new C15190b(handler, str, true);
            this._immediate = bVar2;
        }
        this.f64399f = bVar2;
    }

    /* renamed from: D */
    private final void m93735D(C13640g gVar, Runnable runnable) {
        C15575z1.m94755c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C15186a1.m93730b().dispatch(gVar, runnable);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static final void m93736G(C15190b bVar, Runnable runnable) {
        bVar.f64396a.removeCallbacks(runnable);
    }

    /* renamed from: E */
    public C15190b mo74507o() {
        return this.f64399f;
    }

    public void dispatch(C13640g gVar, Runnable runnable) {
        if (!this.f64396a.post(runnable)) {
            m93735D(gVar, runnable);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C15190b) && ((C15190b) obj).f64396a == this.f64396a;
    }

    /* renamed from: f */
    public void mo74504f(long j, C15492n<? super C13339u> nVar) {
        C15191a aVar = new C15191a(nVar, this);
        if (this.f64396a.postDelayed(aVar, C16792h.m99543e(j, 4611686018427387903L))) {
            nVar.mo74843d(new C15192b(this, aVar));
        } else {
            m93735D(nVar.getContext(), aVar);
        }
    }

    public int hashCode() {
        return System.identityHashCode(this.f64396a);
    }

    public boolean isDispatchNeeded(C13640g gVar) {
        return !this.f64398d || !C13706o.m87924a(Looper.myLooper(), this.f64396a.getLooper());
    }

    /* renamed from: j */
    public C15202c1 mo74506j(long j, Runnable runnable, C13640g gVar) {
        if (this.f64396a.postDelayed(runnable, C16792h.m99543e(j, 4611686018427387903L))) {
            return new C15189a(this, runnable);
        }
        m93735D(gVar, runnable);
        return C15476j2.f64699a;
    }

    public String toString() {
        String s = mo74748s();
        if (s != null) {
            return s;
        }
        String str = this.f64397c;
        if (str == null) {
            str = this.f64396a.toString();
        }
        return this.f64398d ? C13706o.m87936m(str, ".immediate") : str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15190b(Handler handler, String str, int i, C13695i iVar) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public C15190b(Handler handler, String str) {
        this(handler, str, false);
    }
}
