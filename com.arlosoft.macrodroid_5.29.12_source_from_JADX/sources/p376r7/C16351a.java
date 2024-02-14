package p376r7;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;
import p367q7.C16225a;

/* renamed from: r7.a */
/* compiled from: Command */
public class C16351a {

    /* renamed from: a */
    protected boolean f66842a;

    /* renamed from: b */
    protected Context f66843b;

    /* renamed from: c */
    public int f66844c;

    /* renamed from: d */
    public int f66845d;

    /* renamed from: e */
    C16354c f66846e;

    /* renamed from: f */
    Handler f66847f;

    /* renamed from: g */
    protected boolean f66848g;

    /* renamed from: h */
    boolean f66849h;

    /* renamed from: i */
    String[] f66850i;

    /* renamed from: j */
    boolean f66851j;

    /* renamed from: k */
    boolean f66852k;

    /* renamed from: l */
    boolean f66853l;

    /* renamed from: m */
    int f66854m;

    /* renamed from: n */
    int f66855n;

    /* renamed from: o */
    int f66856o;

    /* renamed from: r7.a$b */
    /* compiled from: Command */
    private class C16353b extends Handler {
        private C16353b() {
        }

        public final void handleMessage(Message message) {
            int i = message.getData().getInt("action");
            String string = message.getData().getString("text");
            if (i == 1) {
                C16351a aVar = C16351a.this;
                aVar.mo25775c(aVar.f66855n, string);
            } else if (i == 2) {
                C16351a aVar2 = C16351a.this;
                aVar2.mo25774a(aVar2.f66855n, aVar2.f66854m);
            } else if (i == 3) {
                C16351a aVar3 = C16351a.this;
                aVar3.mo25776d(aVar3.f66855n, string);
            }
        }
    }

    /* renamed from: r7.a$c */
    /* compiled from: Command */
    private class C16354c extends Thread {

        /* renamed from: a */
        private final C16351a f66858a;

        public C16354c(C16351a aVar) {
            this.f66858a = aVar;
        }

        public void run() {
            C16351a aVar = this.f66858a;
            if (aVar.f66856o > 0) {
                synchronized (aVar) {
                    try {
                        C16225a.m97490m("Command " + this.f66858a.f66855n + " is waiting for: " + this.f66858a.f66856o);
                        C16351a aVar2 = this.f66858a;
                        aVar2.wait((long) aVar2.f66856o);
                    } catch (InterruptedException e) {
                        C16225a.m97490m("Exception: " + e);
                    }
                    if (!this.f66858a.mo79017j()) {
                        C16225a.m97490m("Timeout Exception has occurred for command: " + this.f66858a.f66855n + ".");
                        C16351a.this.mo79022o("Timeout Exception");
                    }
                }
            }
        }
    }

    public C16351a(int i, String... strArr) {
        this.f66842a = false;
        this.f66843b = null;
        this.f66844c = 0;
        this.f66845d = 0;
        this.f66846e = null;
        this.f66847f = null;
        this.f66848g = false;
        this.f66849h = false;
        this.f66850i = new String[0];
        this.f66851j = false;
        this.f66852k = false;
        this.f66853l = true;
        this.f66854m = -1;
        this.f66856o = C16225a.f66522c;
        this.f66850i = strArr;
        this.f66855n = i;
        m98043e(C16225a.f66521b);
    }

    /* renamed from: e */
    private void m98043e(boolean z) {
        this.f66853l = z;
        if (Looper.myLooper() == null || !z) {
            C16225a.m97490m("CommandHandler not created");
            return;
        }
        C16225a.m97490m("CommandHandler created");
        this.f66847f = new C16353b();
    }

    /* renamed from: a */
    public void mo25774a(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo79012b() {
        if (!this.f66852k) {
            synchronized (this) {
                Handler handler = this.f66847f;
                if (handler == null || !this.f66853l) {
                    mo25774a(this.f66855n, this.f66854m);
                } else {
                    Message obtainMessage = handler.obtainMessage();
                    Bundle bundle = new Bundle();
                    bundle.putInt("action", 2);
                    obtainMessage.setData(bundle);
                    this.f66847f.sendMessage(obtainMessage);
                }
                C16225a.m97490m("Command " + this.f66855n + " finished.");
                mo79013f();
            }
        }
    }

    /* renamed from: c */
    public void mo25775c(int i, String str) {
        C16225a.m97491n("Command", "ID: " + i + ", " + str);
        this.f66845d = this.f66845d + 1;
    }

    /* renamed from: d */
    public void mo25776d(int i, String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo79013f() {
        this.f66849h = false;
        this.f66851j = true;
        notifyAll();
    }

    /* renamed from: g */
    public final String mo79014g() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (!this.f66842a) {
            while (true) {
                String[] strArr = this.f66850i;
                if (i >= strArr.length) {
                    break;
                }
                sb.append(strArr[i]);
                sb.append(10);
                i++;
            }
        } else {
            String path = this.f66843b.getFilesDir().getPath();
            while (i < this.f66850i.length) {
                if (Build.VERSION.SDK_INT > 22) {
                    sb.append("export CLASSPATH=");
                    sb.append(path);
                    sb.append("/anbuild.dex;");
                    sb.append(" app_process /system/bin ");
                    sb.append(this.f66850i[i]);
                } else {
                    sb.append("dalvikvm -cp " + path + "/anbuild.dex com.android.internal.util.WithFramework com.stericson.RootTools.containers.RootClass " + this.f66850i[i]);
                }
                sb.append(10);
                i++;
            }
        }
        return sb.toString();
    }

    /* renamed from: h */
    public final int mo79015h() {
        return this.f66854m;
    }

    /* renamed from: i */
    public final boolean mo79016i() {
        return this.f66849h;
    }

    /* renamed from: j */
    public final boolean mo79017j() {
        return this.f66851j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo79018k(int i, String str) {
        this.f66844c++;
        Handler handler = this.f66847f;
        if (handler == null || !this.f66853l) {
            mo25775c(i, str);
            return;
        }
        Message obtainMessage = handler.obtainMessage();
        Bundle bundle = new Bundle();
        bundle.putInt("action", 1);
        bundle.putString("text", str);
        obtainMessage.setData(bundle);
        this.f66847f.sendMessage(obtainMessage);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo79019l(int i) {
        synchronized (this) {
            this.f66854m = i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo79020m() {
        this.f66848g = true;
        C16354c cVar = new C16354c(this);
        this.f66846e = cVar;
        cVar.setPriority(1);
        this.f66846e.start();
        this.f66849h = true;
    }

    /* renamed from: n */
    public final void mo79021n() {
        C16225a.m97490m("Terminating command at users request!");
        mo79023p("Terminated at users request!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo79022o(String str) {
        try {
            C16355b.m98092z();
            C16225a.m97490m("Terminating all shells.");
            mo79023p(str);
        } catch (IOException unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo79023p(String str) {
        synchronized (this) {
            Handler handler = this.f66847f;
            if (handler == null || !this.f66853l) {
                mo25776d(this.f66855n, str);
            } else {
                Message obtainMessage = handler.obtainMessage();
                Bundle bundle = new Bundle();
                bundle.putInt("action", 3);
                bundle.putString("text", str);
                obtainMessage.setData(bundle);
                this.f66847f.sendMessage(obtainMessage);
            }
            C16225a.m97490m("Command " + this.f66855n + " did not finish because it was terminated. Termination reason: " + str);
            mo79019l(-1);
            this.f66852k = true;
            mo79013f();
        }
    }

    public C16351a(int i, boolean z, String... strArr) {
        this.f66842a = false;
        this.f66843b = null;
        this.f66844c = 0;
        this.f66845d = 0;
        this.f66846e = null;
        this.f66847f = null;
        this.f66848g = false;
        this.f66849h = false;
        this.f66850i = new String[0];
        this.f66851j = false;
        this.f66852k = false;
        this.f66853l = true;
        this.f66854m = -1;
        this.f66856o = C16225a.f66522c;
        this.f66850i = strArr;
        this.f66855n = i;
        m98043e(z);
    }

    public C16351a(int i, int i2, String... strArr) {
        this.f66842a = false;
        this.f66843b = null;
        this.f66844c = 0;
        this.f66845d = 0;
        this.f66846e = null;
        this.f66847f = null;
        this.f66848g = false;
        this.f66849h = false;
        this.f66850i = new String[0];
        this.f66851j = false;
        this.f66852k = false;
        this.f66853l = true;
        this.f66854m = -1;
        int i3 = C16225a.f66522c;
        this.f66850i = strArr;
        this.f66855n = i;
        this.f66856o = i2;
        m98043e(C16225a.f66521b);
    }
}
