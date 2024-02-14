package com.google.firebase.crashlytics.internal.send;

import com.google.android.datatransport.Event;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.runtime.ForcedSender;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.Settings;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class ReportQueue {

    /* renamed from: a */
    private final double f5457a;

    /* renamed from: b */
    private final double f5458b;

    /* renamed from: c */
    private final long f5459c;

    /* renamed from: d */
    private final int f5460d;

    /* renamed from: e */
    private final BlockingQueue<Runnable> f5461e;

    /* renamed from: f */
    private final ThreadPoolExecutor f5462f;

    /* renamed from: g */
    private final Transport<CrashlyticsReport> f5463g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final OnDemandCounter f5464h;

    /* renamed from: i */
    private int f5465i;

    /* renamed from: j */
    private long f5466j;

    private final class ReportRunnable implements Runnable {

        /* renamed from: a */
        private final CrashlyticsReportWithSessionId f5467a;

        /* renamed from: c */
        private final TaskCompletionSource<CrashlyticsReportWithSessionId> f5468c;

        public void run() {
            ReportQueue.this.m7570p(this.f5467a, this.f5468c);
            ReportQueue.this.f5464h.mo23058c();
            double e = ReportQueue.this.m7563g();
            Logger f = Logger.m6525f();
            f.mo22954b("Delay for: " + String.format(Locale.US, "%.2f", new Object[]{Double.valueOf(e / 1000.0d)}) + " s for report: " + this.f5467a.mo22968d());
            ReportQueue.m7571q(e);
        }

        private ReportRunnable(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource) {
            this.f5467a = crashlyticsReportWithSessionId;
            this.f5468c = taskCompletionSource;
        }
    }

    ReportQueue(Transport<CrashlyticsReport> transport, Settings settings, OnDemandCounter onDemandCounter) {
        this(settings.f5485f, settings.f5486g, ((long) settings.f5487h) * 1000, transport, onDemandCounter);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public double m7563g() {
        return Math.min(3600000.0d, (60000.0d / this.f5457a) * Math.pow(this.f5458b, (double) m7564h()));
    }

    /* renamed from: h */
    private int m7564h() {
        int i;
        if (this.f5466j == 0) {
            this.f5466j = m7569o();
        }
        int o = (int) ((m7569o() - this.f5466j) / this.f5459c);
        if (m7566l()) {
            i = Math.min(100, this.f5465i + o);
        } else {
            i = Math.max(0, this.f5465i - o);
        }
        if (this.f5465i != i) {
            this.f5465i = i;
            this.f5466j = m7569o();
        }
        return i;
    }

    /* renamed from: k */
    private boolean m7565k() {
        return this.f5461e.size() < this.f5460d;
    }

    /* renamed from: l */
    private boolean m7566l() {
        return this.f5461e.size() == this.f5460d;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m7567m(CountDownLatch countDownLatch) {
        ForcedSender.m1237b(this.f5463g, Priority.HIGHEST);
        countDownLatch.countDown();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m7568n(TaskCompletionSource taskCompletionSource, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, Exception exc) {
        if (exc != null) {
            taskCompletionSource.mo56140d(exc);
            return;
        }
        mo23514j();
        taskCompletionSource.mo56141e(crashlyticsReportWithSessionId);
    }

    /* renamed from: o */
    private long m7569o() {
        return System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m7570p(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource) {
        Logger f = Logger.m6525f();
        f.mo22954b("Sending report through Google DataTransport: " + crashlyticsReportWithSessionId.mo22968d());
        this.f5463g.mo19272a(Event.m958f(crashlyticsReportWithSessionId.mo22966b()), new C1919b(this, taskCompletionSource, crashlyticsReportWithSessionId));
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static void m7571q(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public TaskCompletionSource<CrashlyticsReportWithSessionId> mo23513i(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z) {
        synchronized (this.f5461e) {
            TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource = new TaskCompletionSource<>();
            if (z) {
                this.f5464h.mo23057b();
                if (m7565k()) {
                    Logger f = Logger.m6525f();
                    f.mo22954b("Enqueueing report: " + crashlyticsReportWithSessionId.mo22968d());
                    Logger f2 = Logger.m6525f();
                    f2.mo22954b("Queue size: " + this.f5461e.size());
                    this.f5462f.execute(new ReportRunnable(crashlyticsReportWithSessionId, taskCompletionSource));
                    Logger f3 = Logger.m6525f();
                    f3.mo22954b("Closing task for report: " + crashlyticsReportWithSessionId.mo22968d());
                    taskCompletionSource.mo56141e(crashlyticsReportWithSessionId);
                    return taskCompletionSource;
                }
                m7564h();
                Logger f4 = Logger.m6525f();
                f4.mo22954b("Dropping report due to queue being full: " + crashlyticsReportWithSessionId.mo22968d());
                this.f5464h.mo23056a();
                taskCompletionSource.mo56141e(crashlyticsReportWithSessionId);
                return taskCompletionSource;
            }
            m7570p(crashlyticsReportWithSessionId, taskCompletionSource);
            return taskCompletionSource;
        }
    }

    /* renamed from: j */
    public void mo23514j() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new C1920c(this, countDownLatch)).start();
        Utils.m6805e(countDownLatch, 2, TimeUnit.SECONDS);
    }

    ReportQueue(double d, double d2, long j, Transport<CrashlyticsReport> transport, OnDemandCounter onDemandCounter) {
        this.f5457a = d;
        this.f5458b = d2;
        this.f5459c = j;
        this.f5463g = transport;
        this.f5464h = onDemandCounter;
        int i = (int) d;
        this.f5460d = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f5461e = arrayBlockingQueue;
        this.f5462f = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f5465i = 0;
        this.f5466j = 0;
    }
}
