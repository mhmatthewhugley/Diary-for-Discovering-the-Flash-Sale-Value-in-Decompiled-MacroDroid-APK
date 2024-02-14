package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import okhttp3.internal.connection.C15951h;
import p399tc.C16617e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u000fB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0011"}, mo71668d2 = {"Lokhttp3/k;", "", "Lokhttp3/internal/connection/h;", "a", "Lokhttp3/internal/connection/h;", "()Lokhttp3/internal/connection/h;", "delegate", "<init>", "(Lokhttp3/internal/connection/h;)V", "", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "(IJLjava/util/concurrent/TimeUnit;)V", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.k */
/* compiled from: ConnectionPool.kt */
public final class C15961k {

    /* renamed from: a */
    private final C15951h f65735a;

    public C15961k(C15951h hVar) {
        C13706o.m87929f(hVar, "delegate");
        this.f65735a = hVar;
    }

    /* renamed from: a */
    public final C15951h mo76164a() {
        return this.f65735a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C15961k(int i, long j, TimeUnit timeUnit) {
        this(new C15951h(C16617e.f67465h, i, j, timeUnit));
        C13706o.m87929f(timeUnit, "timeUnit");
    }

    public C15961k() {
        this(5, 5, TimeUnit.MINUTES);
    }
}
