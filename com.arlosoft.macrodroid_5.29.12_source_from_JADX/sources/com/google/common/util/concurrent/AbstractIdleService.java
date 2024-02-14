package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Service;
import java.util.concurrent.Executor;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class AbstractIdleService implements Service {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Supplier<String> f53382a = new ThreadNameSupplier();

    /* renamed from: b */
    private final Service f53383b = new DelegateService();

    private final class DelegateService extends AbstractService {

        /* renamed from: com.google.common.util.concurrent.AbstractIdleService$DelegateService$1 */
        class C109581 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ DelegateService f53386a;

            public void run() {
                try {
                    AbstractIdleService.this.mo61591f();
                    this.f53386a.mo61624j();
                } catch (Throwable th) {
                    this.f53386a.mo61623i(th);
                }
            }
        }

        private DelegateService() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public final void mo61557d() {
            MoreExecutors.m74264f(AbstractIdleService.this.mo61588c(), AbstractIdleService.this.f53382a).execute(new Runnable() {
                public void run() {
                    try {
                        AbstractIdleService.this.mo61590e();
                        DelegateService.this.mo61625k();
                    } catch (Throwable th) {
                        DelegateService.this.mo61623i(th);
                    }
                }
            });
        }

        public String toString() {
            return AbstractIdleService.this.toString();
        }
    }

    private final class ThreadNameSupplier implements Supplier<String> {
        private ThreadNameSupplier() {
        }

        /* renamed from: a */
        public String get() {
            String d = AbstractIdleService.this.mo61589d();
            String valueOf = String.valueOf(AbstractIdleService.this.mo61550a());
            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 1 + valueOf.length());
            sb.append(d);
            sb.append(" ");
            sb.append(valueOf);
            return sb.toString();
        }
    }

    protected AbstractIdleService() {
    }

    /* renamed from: a */
    public final Service.State mo61550a() {
        return this.f53383b.mo61550a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Executor mo61588c() {
        return new Executor() {
            public void execute(Runnable runnable) {
                MoreExecutors.m74261c((String) AbstractIdleService.this.f53382a.get(), runnable).start();
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo61589d() {
        return getClass().getSimpleName();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo61590e() throws Exception;

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo61591f() throws Exception;

    public String toString() {
        String d = mo61589d();
        String valueOf = String.valueOf(mo61550a());
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 3 + valueOf.length());
        sb.append(d);
        sb.append(" [");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
