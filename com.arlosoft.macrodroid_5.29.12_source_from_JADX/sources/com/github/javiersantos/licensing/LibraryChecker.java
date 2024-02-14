package com.github.javiersantos.licensing;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.work.WorkRequest;
import com.android.vending.licensing.ILicenseResultListener;
import com.android.vending.licensing.ILicensingService;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.Calendar;
import java.util.Queue;
import java.util.Set;

public class LibraryChecker implements ServiceConnection {

    /* renamed from: s */
    private static final SecureRandom f16213s = new SecureRandom();

    /* renamed from: a */
    private final Context f16214a;

    /* renamed from: c */
    private final Policy f16215c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Set<LibraryValidator> f16216d;

    /* renamed from: f */
    private final Queue<LibraryValidator> f16217f;

    /* renamed from: g */
    private ILicensingService f16218g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public PublicKey f16219o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Handler f16220p;

    public class ResultListener extends ILicenseResultListener.Stub {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final LibraryValidator f16221a;

        /* renamed from: c */
        private Runnable f16222c;

        public ResultListener(LibraryValidator libraryValidator) {
            this.f16221a = libraryValidator;
            this.f16222c = new Runnable(LibraryChecker.this) {
                public void run() {
                    Log.i("LibraryChecker", "Check timed out.");
                    ResultListener resultListener = ResultListener.this;
                    LibraryChecker.this.m26149i(resultListener.f16221a);
                    ResultListener resultListener2 = ResultListener.this;
                    LibraryChecker.this.m26148h(resultListener2.f16221a);
                }
            };
            m26154g8();
        }

        /* access modifiers changed from: private */
        /* renamed from: A1 */
        public void m26153A1() {
            Log.i("LibraryChecker", "Clearing timeout.");
            LibraryChecker.this.f16220p.removeCallbacks(this.f16222c);
        }

        /* renamed from: g8 */
        private void m26154g8() {
            Log.i("LibraryChecker", "Start monitoring timeout.");
            LibraryChecker.this.f16220p.postDelayed(this.f16222c, WorkRequest.MIN_BACKOFF_MILLIS);
        }

        public void verifyLicense(final int i, final String str, final String str2) {
            LibraryChecker.this.f16220p.post(new Runnable() {
                public void run() {
                    Log.i("LibraryChecker", "Received response.");
                    if (LibraryChecker.this.f16216d.contains(ResultListener.this.f16221a)) {
                        ResultListener.this.m26153A1();
                        ResultListener.this.f16221a.mo34331a(LibraryChecker.this.f16219o, i, str, Calendar.getInstance(), str2);
                        ResultListener resultListener = ResultListener.this;
                        LibraryChecker.this.m26148h(resultListener.f16221a);
                    }
                }
            });
        }
    }

    /* renamed from: f */
    private void m26147f() {
        if (this.f16218g != null) {
            try {
                this.f16214a.unbindService(this);
            } catch (IllegalArgumentException unused) {
                Log.e("LibraryChecker", "Unable to unbind from licensing service (already unbound)");
            }
            this.f16218g = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public synchronized void m26148h(LibraryValidator libraryValidator) {
        this.f16216d.remove(libraryValidator);
        if (this.f16216d.isEmpty()) {
            m26147f();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public synchronized void m26149i(LibraryValidator libraryValidator) {
        this.f16215c.mo34317b(3144, (ResponseData) null);
        if (this.f16215c.mo34316a()) {
            libraryValidator.mo34332b().mo34328a(3144);
        } else {
            libraryValidator.mo34332b().mo34330c(3144);
        }
    }

    /* renamed from: k */
    private void m26150k() {
        while (true) {
            LibraryValidator poll = this.f16217f.poll();
            if (poll != null) {
                try {
                    Log.i("LibraryChecker", "Calling checkLicense on service for " + poll.mo34334d());
                    this.f16218g.checkLicense((long) poll.mo34333c(), poll.mo34334d(), new ResultListener(poll));
                    this.f16216d.add(poll);
                } catch (RemoteException e) {
                    Log.w("LibraryChecker", "RemoteException in checkLicense call.", e);
                    m26149i(poll);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public synchronized void mo34322g() {
        for (LibraryValidator h : this.f16216d) {
            try {
                m26148h(h);
            } catch (Exception unused) {
            }
        }
        for (LibraryValidator remove : this.f16217f) {
            try {
                this.f16217f.remove(remove);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: j */
    public synchronized void mo34323j() {
        m26147f();
        this.f16220p.getLooper().quit();
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f16218g = ILicensingService.Stub.asInterface(iBinder);
        m26150k();
    }

    public synchronized void onServiceDisconnected(ComponentName componentName) {
        Log.w("LibraryChecker", "Service unexpectedly disconnected.");
        this.f16218g = null;
    }
}
