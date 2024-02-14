package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15924f0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\u000f"}, mo71668d2 = {"Lokhttp3/internal/connection/i;", "", "Lokhttp3/f0;", "failedRoute", "Lja/u;", "b", "route", "a", "", "c", "", "Ljava/util/Set;", "failedRoutes", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.internal.connection.i */
/* compiled from: RouteDatabase.kt */
public final class C15954i {

    /* renamed from: a */
    private final Set<C15924f0> f65715a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized void mo76152a(C15924f0 f0Var) {
        C13706o.m87929f(f0Var, "route");
        this.f65715a.remove(f0Var);
    }

    /* renamed from: b */
    public final synchronized void mo76153b(C15924f0 f0Var) {
        C13706o.m87929f(f0Var, "failedRoute");
        this.f65715a.add(f0Var);
    }

    /* renamed from: c */
    public final synchronized boolean mo76154c(C15924f0 f0Var) {
        C13706o.m87929f(f0Var, "route");
        return this.f65715a.contains(f0Var);
    }
}
