package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

class SnackbarManager {

    /* renamed from: e */
    private static SnackbarManager f50285e;
    @NonNull

    /* renamed from: a */
    private final Object f50286a = new Object();
    @NonNull

    /* renamed from: b */
    private final Handler f50287b = new Handler(Looper.getMainLooper(), new Handler.Callback() {
        public boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            SnackbarManager.this.mo58961d((SnackbarRecord) message.obj);
            return true;
        }
    });
    @Nullable

    /* renamed from: c */
    private SnackbarRecord f50288c;
    @Nullable

    /* renamed from: d */
    private SnackbarRecord f50289d;

    interface Callback {
        /* renamed from: a */
        void mo58879a(int i);

        void show();
    }

    private static class SnackbarRecord {
        @NonNull

        /* renamed from: a */
        final WeakReference<Callback> f50291a;

        /* renamed from: b */
        int f50292b;

        /* renamed from: c */
        boolean f50293c;

        SnackbarRecord(int i, Callback callback) {
            this.f50291a = new WeakReference<>(callback);
            this.f50292b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo58969a(@Nullable Callback callback) {
            return callback != null && this.f50291a.get() == callback;
        }
    }

    private SnackbarManager() {
    }

    /* renamed from: a */
    private boolean m69608a(@NonNull SnackbarRecord snackbarRecord, int i) {
        Callback callback = (Callback) snackbarRecord.f50291a.get();
        if (callback == null) {
            return false;
        }
        this.f50287b.removeCallbacksAndMessages(snackbarRecord);
        callback.mo58879a(i);
        return true;
    }

    /* renamed from: c */
    static SnackbarManager m69609c() {
        if (f50285e == null) {
            f50285e = new SnackbarManager();
        }
        return f50285e;
    }

    /* renamed from: f */
    private boolean m69610f(Callback callback) {
        SnackbarRecord snackbarRecord = this.f50288c;
        return snackbarRecord != null && snackbarRecord.mo58969a(callback);
    }

    /* renamed from: g */
    private boolean m69611g(Callback callback) {
        SnackbarRecord snackbarRecord = this.f50289d;
        return snackbarRecord != null && snackbarRecord.mo58969a(callback);
    }

    /* renamed from: l */
    private void m69612l(@NonNull SnackbarRecord snackbarRecord) {
        int i = snackbarRecord.f50292b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.f50287b.removeCallbacksAndMessages(snackbarRecord);
            Handler handler = this.f50287b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, snackbarRecord), (long) i);
        }
    }

    /* renamed from: n */
    private void m69613n() {
        SnackbarRecord snackbarRecord = this.f50289d;
        if (snackbarRecord != null) {
            this.f50288c = snackbarRecord;
            this.f50289d = null;
            Callback callback = (Callback) snackbarRecord.f50291a.get();
            if (callback != null) {
                callback.show();
            } else {
                this.f50288c = null;
            }
        }
    }

    /* renamed from: b */
    public void mo58960b(Callback callback, int i) {
        synchronized (this.f50286a) {
            if (m69610f(callback)) {
                m69608a(this.f50288c, i);
            } else if (m69611g(callback)) {
                m69608a(this.f50289d, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo58961d(@NonNull SnackbarRecord snackbarRecord) {
        synchronized (this.f50286a) {
            if (this.f50288c == snackbarRecord || this.f50289d == snackbarRecord) {
                m69608a(snackbarRecord, 2);
            }
        }
    }

    /* renamed from: e */
    public boolean mo58962e(Callback callback) {
        boolean z;
        synchronized (this.f50286a) {
            if (!m69610f(callback)) {
                if (!m69611g(callback)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: h */
    public void mo58963h(Callback callback) {
        synchronized (this.f50286a) {
            if (m69610f(callback)) {
                this.f50288c = null;
                if (this.f50289d != null) {
                    m69613n();
                }
            }
        }
    }

    /* renamed from: i */
    public void mo58964i(Callback callback) {
        synchronized (this.f50286a) {
            if (m69610f(callback)) {
                m69612l(this.f50288c);
            }
        }
    }

    /* renamed from: j */
    public void mo58965j(Callback callback) {
        synchronized (this.f50286a) {
            if (m69610f(callback)) {
                SnackbarRecord snackbarRecord = this.f50288c;
                if (!snackbarRecord.f50293c) {
                    snackbarRecord.f50293c = true;
                    this.f50287b.removeCallbacksAndMessages(snackbarRecord);
                }
            }
        }
    }

    /* renamed from: k */
    public void mo58966k(Callback callback) {
        synchronized (this.f50286a) {
            if (m69610f(callback)) {
                SnackbarRecord snackbarRecord = this.f50288c;
                if (snackbarRecord.f50293c) {
                    snackbarRecord.f50293c = false;
                    m69612l(snackbarRecord);
                }
            }
        }
    }

    /* renamed from: m */
    public void mo58967m(int i, Callback callback) {
        synchronized (this.f50286a) {
            if (m69610f(callback)) {
                SnackbarRecord snackbarRecord = this.f50288c;
                snackbarRecord.f50292b = i;
                this.f50287b.removeCallbacksAndMessages(snackbarRecord);
                m69612l(this.f50288c);
                return;
            }
            if (m69611g(callback)) {
                this.f50289d.f50292b = i;
            } else {
                this.f50289d = new SnackbarRecord(i, callback);
            }
            SnackbarRecord snackbarRecord2 = this.f50288c;
            if (snackbarRecord2 == null || !m69608a(snackbarRecord2, 4)) {
                this.f50288c = null;
                m69613n();
            }
        }
    }
}
