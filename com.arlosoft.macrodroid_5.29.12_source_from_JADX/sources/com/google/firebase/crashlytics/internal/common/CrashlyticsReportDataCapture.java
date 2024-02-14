package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CrashlyticsReportDataCapture {

    /* renamed from: e */
    private static final Map<String, Integer> f4978e;

    /* renamed from: f */
    static final String f4979f = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"18.3.2"});

    /* renamed from: a */
    private final Context f4980a;

    /* renamed from: b */
    private final IdManager f4981b;

    /* renamed from: c */
    private final AppData f4982c;

    /* renamed from: d */
    private final StackTraceTrimmingStrategy f4983d;

    static {
        HashMap hashMap = new HashMap();
        f4978e = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
    }

    public CrashlyticsReportDataCapture(Context context, IdManager idManager, AppData appData, StackTraceTrimmingStrategy stackTraceTrimmingStrategy) {
        this.f4980a = context;
        this.f4981b = idManager;
        this.f4982c = appData;
        this.f4983d = stackTraceTrimmingStrategy;
    }

    /* renamed from: a */
    private CrashlyticsReport.Builder m6700a() {
        return CrashlyticsReport.m7179b().mo23152h("18.3.2").mo23148d(this.f4982c.f4866a).mo23149e(this.f4981b.mo23049a()).mo23146b(this.f4982c.f4870e).mo23147c(this.f4982c.f4871f).mo23151g(4);
    }

    /* renamed from: e */
    private static int m6701e() {
        Integer num;
        String str = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str) && (num = f4978e.get(str.toLowerCase(Locale.US))) != null) {
            return num.intValue();
        }
        return 7;
    }

    /* renamed from: f */
    private CrashlyticsReport.Session.Event.Application.Execution.BinaryImage m6702f() {
        return CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.m7328a().mo23320b(0).mo23322d(0).mo23321c(this.f4982c.f4869d).mo23323e(this.f4982c.f4867b).mo23319a();
    }

    /* renamed from: g */
    private ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> m6703g() {
        return ImmutableList.m7425d(m6702f());
    }

    /* renamed from: h */
    private CrashlyticsReport.Session.Event.Application m6704h(int i, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return CrashlyticsReport.Session.Event.Application.m7309a().mo23293b(Boolean.valueOf(applicationExitInfo.mo23154b() != 100)).mo23297f(i).mo23295d(m6709m(applicationExitInfo)).mo23292a();
    }

    /* renamed from: i */
    private CrashlyticsReport.Session.Event.Application m6705i(int i, TrimmedThrowableData trimmedThrowableData, Thread thread, int i2, int i3, boolean z) {
        Boolean bool;
        ActivityManager.RunningAppProcessInfo j = CommonUtils.m6587j(this.f4982c.f4869d, this.f4980a);
        if (j != null) {
            bool = Boolean.valueOf(j.importance != 100);
        } else {
            bool = null;
        }
        return CrashlyticsReport.Session.Event.Application.m7309a().mo23293b(bool).mo23297f(i).mo23295d(m6710n(trimmedThrowableData, thread, i2, i3, z)).mo23292a();
    }

    /* renamed from: j */
    private CrashlyticsReport.Session.Event.Device m6706j(int i) {
        BatteryState a = BatteryState.m6561a(this.f4980a);
        Float b = a.mo22974b();
        Double valueOf = b != null ? Double.valueOf(b.doubleValue()) : null;
        int c = a.mo22975c();
        boolean o = CommonUtils.m6592o(this.f4980a);
        return CrashlyticsReport.Session.Event.Device.m7392a().mo23382b(valueOf).mo23383c(c).mo23386f(o).mo23385e(i).mo23387g(CommonUtils.m6596s() - CommonUtils.m6578a(this.f4980a)).mo23384d(CommonUtils.m6579b(Environment.getDataDirectory().getPath())).mo23381a();
    }

    /* renamed from: k */
    private CrashlyticsReport.Session.Event.Application.Execution.Exception m6707k(TrimmedThrowableData trimmedThrowableData, int i, int i2) {
        return m6708l(trimmedThrowableData, i, i2, 0);
    }

    /* renamed from: l */
    private CrashlyticsReport.Session.Event.Application.Execution.Exception m6708l(TrimmedThrowableData trimmedThrowableData, int i, int i2, int i3) {
        String str = trimmedThrowableData.f5522b;
        String str2 = trimmedThrowableData.f5521a;
        StackTraceElement[] stackTraceElementArr = trimmedThrowableData.f5523c;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        TrimmedThrowableData trimmedThrowableData2 = trimmedThrowableData.f5524d;
        if (i3 >= i2) {
            TrimmedThrowableData trimmedThrowableData3 = trimmedThrowableData2;
            while (trimmedThrowableData3 != null) {
                trimmedThrowableData3 = trimmedThrowableData3.f5524d;
                i4++;
            }
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder d = CrashlyticsReport.Session.Event.Application.Execution.Exception.m7346a().mo23337f(str).mo23336e(str2).mo23334c(ImmutableList.m7424c(m6712p(stackTraceElementArr, i))).mo23335d(i4);
        if (trimmedThrowableData2 != null && i4 == 0) {
            d.mo23333b(m6708l(trimmedThrowableData2, i, i2, i3 + 1));
        }
        return d.mo23332a();
    }

    /* renamed from: m */
    private CrashlyticsReport.Session.Event.Application.Execution m6709m(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return CrashlyticsReport.Session.Event.Application.Execution.m7322a().mo23307b(applicationExitInfo).mo23310e(m6717u()).mo23308c(m6703g()).mo23306a();
    }

    /* renamed from: n */
    private CrashlyticsReport.Session.Event.Application.Execution m6710n(TrimmedThrowableData trimmedThrowableData, Thread thread, int i, int i2, boolean z) {
        return CrashlyticsReport.Session.Event.Application.Execution.m7322a().mo23311f(m6720x(trimmedThrowableData, thread, i, z)).mo23309d(m6707k(trimmedThrowableData, i, i2)).mo23310e(m6717u()).mo23308c(m6703g()).mo23306a();
    }

    /* renamed from: o */
    private CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame m6711o(StackTraceElement stackTraceElement, CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder) {
        long j = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max((long) stackTraceElement.getLineNumber(), 0) : 0;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j = (long) stackTraceElement.getLineNumber();
        }
        return builder.mo23370e(max).mo23371f(str).mo23367b(fileName).mo23369d(j).mo23366a();
    }

    /* renamed from: p */
    private ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> m6712p(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement o : stackTraceElementArr) {
            arrayList.add(m6711o(o, CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.m7374a().mo23368c(i)));
        }
        return ImmutableList.m7424c(arrayList);
    }

    /* renamed from: q */
    private CrashlyticsReport.Session.Application m6713q() {
        return CrashlyticsReport.Session.Application.m7253a().mo23239e(this.f4981b.mo23050f()).mo23241g(this.f4982c.f4870e).mo23238d(this.f4982c.f4871f).mo23240f(this.f4981b.mo23049a()).mo23236b(this.f4982c.f4872g.mo22952d()).mo23237c(this.f4982c.f4872g.mo22953e()).mo23235a();
    }

    /* renamed from: r */
    private CrashlyticsReport.Session m6714r(String str, long j) {
        return CrashlyticsReport.Session.m7237a().mo23223l(j).mo23221i(str).mo23219g(f4979f).mo23214b(m6713q()).mo23222k(m6716t()).mo23216d(m6715s()).mo23220h(3).mo23213a();
    }

    /* renamed from: s */
    private CrashlyticsReport.Session.Device m6715s() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int e = m6701e();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long s = CommonUtils.m6596s();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean x = CommonUtils.m6601x();
        int m = CommonUtils.m6590m();
        String str = Build.MANUFACTURER;
        return CrashlyticsReport.Session.Device.m7282a().mo23259b(e).mo23263f(Build.MODEL).mo23260c(availableProcessors).mo23265h(s).mo23261d(blockCount).mo23266i(x).mo23267j(m).mo23262e(str).mo23264g(Build.PRODUCT).mo23258a();
    }

    /* renamed from: t */
    private CrashlyticsReport.Session.OperatingSystem m6716t() {
        return CrashlyticsReport.Session.OperatingSystem.m7410a().mo23404d(3).mo23405e(Build.VERSION.RELEASE).mo23402b(Build.VERSION.CODENAME).mo23403c(CommonUtils.m6602y()).mo23401a();
    }

    /* renamed from: u */
    private CrashlyticsReport.Session.Event.Application.Execution.Signal m6717u() {
        return CrashlyticsReport.Session.Event.Application.Execution.Signal.m7358a().mo23347d("0").mo23346c("0").mo23345b(0).mo23344a();
    }

    /* renamed from: v */
    private CrashlyticsReport.Session.Event.Application.Execution.Thread m6718v(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return m6719w(thread, stackTraceElementArr, 0);
    }

    /* renamed from: w */
    private CrashlyticsReport.Session.Event.Application.Execution.Thread m6719w(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        return CrashlyticsReport.Session.Event.Application.Execution.Thread.m7366a().mo23357d(thread.getName()).mo23356c(i).mo23355b(ImmutableList.m7424c(m6712p(stackTraceElementArr, i))).mo23354a();
    }

    /* renamed from: x */
    private ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> m6720x(TrimmedThrowableData trimmedThrowableData, Thread thread, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m6719w(thread, trimmedThrowableData.f5523c, i));
        if (z) {
            for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
                Thread thread2 = (Thread) next.getKey();
                if (!thread2.equals(thread)) {
                    arrayList.add(m6718v(thread2, this.f4983d.mo23532a((StackTraceElement[]) next.getValue())));
                }
            }
        }
        return ImmutableList.m7424c(arrayList);
    }

    /* renamed from: b */
    public CrashlyticsReport.Session.Event mo23036b(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        int i = this.f4980a.getResources().getConfiguration().orientation;
        return CrashlyticsReport.Session.Event.m7302a().mo23282f("anr").mo23281e(applicationExitInfo.mo23161h()).mo23278b(m6704h(i, applicationExitInfo)).mo23279c(m6706j(i)).mo23277a();
    }

    /* renamed from: c */
    public CrashlyticsReport.Session.Event mo23037c(Throwable th, Thread thread, String str, long j, int i, int i2, boolean z) {
        int i3 = this.f4980a.getResources().getConfiguration().orientation;
        Throwable th2 = th;
        String str2 = str;
        long j2 = j;
        return CrashlyticsReport.Session.Event.m7302a().mo23282f(str).mo23281e(j).mo23278b(m6705i(i3, new TrimmedThrowableData(th, this.f4983d), thread, i, i2, z)).mo23279c(m6706j(i3)).mo23277a();
    }

    /* renamed from: d */
    public CrashlyticsReport mo23038d(String str, long j) {
        return m6700a().mo23153i(m6714r(str, j)).mo23145a();
    }
}
