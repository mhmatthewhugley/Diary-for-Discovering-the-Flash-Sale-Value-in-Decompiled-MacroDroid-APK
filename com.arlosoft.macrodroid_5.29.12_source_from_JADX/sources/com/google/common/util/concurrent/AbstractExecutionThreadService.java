package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Service;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class AbstractExecutionThreadService implements Service {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Logger f53343b = Logger.getLogger(AbstractExecutionThreadService.class.getName());

    /* renamed from: a */
    private final Service f53344a = new AbstractService() {

        /* renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$1$1 */
        class C109511 implements Supplier<String> {

            /* renamed from: a */
            final /* synthetic */ C109501 f53346a;

            /* renamed from: a */
            public String get() {
                return AbstractExecutionThreadService.this.mo61552d();
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$1$2 */
        class C109522 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C109501 f53347a;

            public void run() {
                try {
                    AbstractExecutionThreadService.this.mo61554f();
                    this.f53347a.mo61624j();
                    if (this.f53347a.mo61622h()) {
                        AbstractExecutionThreadService.this.mo61551c();
                    }
                    AbstractExecutionThreadService.this.mo61553e();
                    this.f53347a.mo61625k();
                } catch (Throwable th) {
                    this.f53347a.mo61623i(th);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo61557d() {
            AbstractExecutionThreadService.this.mo61555g();
        }

        public String toString() {
            return AbstractExecutionThreadService.this.toString();
        }
    };

    /* renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$2 */
    class C109532 implements Executor {

        /* renamed from: a */
        final /* synthetic */ AbstractExecutionThreadService f53348a;

        public void execute(Runnable runnable) {
            MoreExecutors.m74261c(this.f53348a.mo61552d(), runnable).start();
        }
    }

    protected AbstractExecutionThreadService() {
    }

    /* renamed from: a */
    public final Service.State mo61550a() {
        return this.f53344a.mo61550a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo61551c() throws Exception;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo61552d() {
        return getClass().getSimpleName();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo61553e() throws Exception {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo61554f() throws Exception {
    }

    /* access modifiers changed from: protected */
    @Beta
    /* renamed from: g */
    public void mo61555g() {
    }

    public String toString() {
        String d = mo61552d();
        String valueOf = String.valueOf(mo61550a());
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 3 + valueOf.length());
        sb.append(d);
        sb.append(" [");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
