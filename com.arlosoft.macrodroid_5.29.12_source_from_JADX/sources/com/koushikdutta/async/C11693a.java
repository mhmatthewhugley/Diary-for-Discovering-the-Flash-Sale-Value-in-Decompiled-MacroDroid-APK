package com.koushikdutta.async;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: com.koushikdutta.async.a */
/* compiled from: AsyncSemaphore */
public class C11693a {

    /* renamed from: a */
    Semaphore f57494a = new Semaphore(0);

    /* renamed from: a */
    public void mo65745a() throws InterruptedException {
        C11699c d = C11699c.m81833d(Thread.currentThread());
        C11693a aVar = d.waiter;
        d.waiter = this;
        Semaphore semaphore = d.queueSemaphore;
        try {
            if (!this.f57494a.tryAcquire()) {
                while (true) {
                    Runnable h = d.remove();
                    if (h == null) {
                        semaphore.acquire(Math.max(1, semaphore.availablePermits()));
                        if (this.f57494a.tryAcquire()) {
                            d.waiter = aVar;
                            return;
                        }
                    } else {
                        h.run();
                    }
                }
            }
        } finally {
            d.waiter = aVar;
        }
    }

    /* renamed from: b */
    public void mo65746b() {
        this.f57494a.release();
        C11699c.m81834f(this);
    }

    /* renamed from: c */
    public boolean mo65747c(long j, TimeUnit timeUnit) throws InterruptedException {
        long convert = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        C11699c d = C11699c.m81833d(Thread.currentThread());
        C11693a aVar = d.waiter;
        d.waiter = this;
        Semaphore semaphore = d.queueSemaphore;
        try {
            if (this.f57494a.tryAcquire()) {
                return true;
            }
            long currentTimeMillis = System.currentTimeMillis();
            while (true) {
                Runnable h = d.remove();
                if (h != null) {
                    h.run();
                } else if (!semaphore.tryAcquire(Math.max(1, semaphore.availablePermits()), convert, TimeUnit.MILLISECONDS)) {
                    d.waiter = aVar;
                    return false;
                } else if (this.f57494a.tryAcquire()) {
                    d.waiter = aVar;
                    return true;
                } else if (System.currentTimeMillis() - currentTimeMillis >= convert) {
                    d.waiter = aVar;
                    return false;
                }
            }
        } finally {
            d.waiter = aVar;
        }
    }
}
