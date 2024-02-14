package com.arlosoft.macrodroid.action.services;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.preference.PreferenceManager;
import androidx.core.app.NotificationCompat;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.twitter.TwitterFailNotificationClickReceiver;
import com.arlosoft.macrodroid.utils.C6368b1;
import java.io.File;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import javax.mail.AuthenticationFailedException;
import p134n0.C7960a;
import p148q0.C8151a;

public abstract class UploadService extends Service {

    /* renamed from: A */
    private static int f9141A = 7385250;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public static boolean f9142B;

    /* renamed from: z */
    protected static final Object f9143z = new Object();

    /* renamed from: a */
    C3444d f9144a;

    /* renamed from: c */
    String f9145c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f9146d;

    /* renamed from: f */
    final Queue<C3444d> f9147f = new LinkedBlockingQueue();

    /* renamed from: g */
    final Object f9148g = new Object();

    /* renamed from: o */
    private PendingIntent f9149o;

    /* renamed from: p */
    private QueueUpdateReceiver f9150p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C3444d f9151s;

    protected class QueueUpdateReceiver extends BroadcastReceiver {
        protected QueueUpdateReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            UploadService.this.mo26819k(30000);
            UploadService.this.m14412l();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.services.UploadService$a */
    static /* synthetic */ class C3440a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9153a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                n0.a$c[] r0 = p134n0.C7960a.C7963c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9153a = r0
                n0.a$c r1 = p134n0.C7960a.C7963c.AuthenticationFailure     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9153a     // Catch:{ NoSuchFieldError -> 0x001d }
                n0.a$c r1 = p134n0.C7960a.C7963c.AlreadyUploaded     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.services.UploadService.C3440a.<clinit>():void");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.services.UploadService$b */
    private class C3441b extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        private final Context f9154a;

        /* renamed from: b */
        private final C3444d f9155b;

        /* renamed from: c */
        private boolean f9156c;

        public C3441b(Context context, C3444d dVar) {
            this.f9155b = dVar;
            this.f9154a = context;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            boolean z = true;
            try {
                UploadService uploadService = UploadService.this;
                uploadService.mo26797q(this.f9154a, this.f9155b, uploadService.f9146d);
                this.f9156c = false;
            } catch (AuthenticationFailedException unused) {
                this.f9156c = true;
            } catch (Exception unused2) {
                this.f9156c = false;
            }
            return Boolean.valueOf(z);
            z = false;
            return Boolean.valueOf(z);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f9154a);
            boolean z = true;
            boolean z2 = defaultSharedPreferences.getBoolean(UploadService.this.mo26792h(), true);
            boolean z3 = defaultSharedPreferences.getBoolean(UploadService.this.mo26791g(), true);
            int intValue = Integer.valueOf(defaultSharedPreferences.getString(UploadService.this.mo26793i(), "0")).intValue() * 60 * 1000;
            synchronized (UploadService.this.f9148g) {
                if (bool.booleanValue()) {
                    if (z2) {
                        C4061t1.m16023v(UploadService.this, UploadService.this.f9145c + " sent", UploadService.this.f9145c + " was sent to: " + this.f9155b.f9169d, false);
                    }
                    UploadService.this.f9147f.remove(this.f9155b);
                    C4878b.m18873l(UploadService.this.f9145c + " was sent to: " + this.f9155b.f9169d);
                } else if (this.f9156c) {
                    if (z3) {
                        C4061t1.m16023v(UploadService.this, UploadService.this.f9145c + " sending failed", "Authentication failed - check your password", false);
                    }
                    UploadService.this.f9147f.remove(this.f9155b);
                    C4878b.m18873l(UploadService.this.f9145c + " sending failed - authentication problem");
                } else {
                    if (this.f9155b.f9168c + ((long) intValue) > System.currentTimeMillis()) {
                        z = false;
                    } else {
                        if (z3) {
                            C4061t1.m16023v(UploadService.this, UploadService.this.f9145c + " sending failed", UploadService.this.f9145c + " not sent to: " + UploadService.this.f9144a.f9169d, false);
                        }
                        UploadService.this.f9147f.remove(this.f9155b);
                        C4878b.m18873l(UploadService.this.f9145c + " sending failed - Giving up");
                    }
                }
                boolean unused = UploadService.f9142B = false;
                if (UploadService.this.f9147f.size() == 0) {
                    UploadService.this.m14411j();
                    UploadService.this.stopSelf();
                } else if (z) {
                    UploadService.this.m14412l();
                }
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.services.UploadService$e */
    private class C3445e extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        private final Context f9175a;

        /* renamed from: b */
        private final C3444d f9176b;

        /* renamed from: c */
        C7960a.C7963c f9177c;

        public C3445e(Context context, C3444d dVar) {
            this.f9176b = dVar;
            this.f9175a = context;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            this.f9177c = UploadService.this.mo26794o(this.f9175a, this.f9176b);
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f9175a);
            boolean z = true;
            boolean z2 = defaultSharedPreferences.getBoolean(UploadService.this.mo26792h(), true);
            boolean z3 = defaultSharedPreferences.getBoolean(UploadService.this.mo26791g(), true);
            int intValue = Integer.valueOf(defaultSharedPreferences.getString(UploadService.this.mo26793i(), "0")).intValue() * 60 * 1000;
            synchronized (UploadService.this.f9148g) {
                C7960a.C7963c cVar = this.f9177c;
                if (cVar == C7960a.C7963c.Ok) {
                    if (z2) {
                        C4061t1.m16023v(this.f9175a, "Twitter " + UploadService.this.f9145c + " uploaded", "The " + UploadService.this.f9145c + " was uploaded to twitter", false);
                    }
                    UploadService.this.f9147f.remove(this.f9176b);
                } else {
                    if (cVar == C7960a.C7963c.ConnectionFailure) {
                        if (this.f9176b.f9168c + ((long) intValue) <= System.currentTimeMillis()) {
                            if (z3) {
                                C4061t1.m16023v(this.f9175a, UploadService.this.getString(C17541R$string.upload_failed) + " (Twitter " + UploadService.this.f9145c + ")", "Retry limit reached", false);
                            }
                            UploadService.this.f9147f.remove(this.f9176b);
                        }
                    } else {
                        if (z3) {
                            int i = C3440a.f9153a[cVar.ordinal()];
                            if (i == 1) {
                                PendingIntent broadcast = PendingIntent.getBroadcast(this.f9175a, UploadService.m14410f(), new Intent(this.f9175a, TwitterFailNotificationClickReceiver.class), 134217728 | C6368b1.f14959b);
                                C4061t1.m16027x(this.f9175a, UploadService.this.getString(C17541R$string.upload_failed) + " (Twitter " + UploadService.this.f9145c + ")", UploadService.this.getString(C17541R$string.authentication_failed_click_to_reauthenticate), false, -1, broadcast, -3355444, "info_notification");
                            } else if (i != 2) {
                                C4061t1.m16023v(this.f9175a, UploadService.this.getString(C17541R$string.upload_failed) + " (Twitter " + UploadService.this.f9145c + ")", "Retry limit reached", false);
                            } else {
                                C4061t1.m16023v(this.f9175a, UploadService.this.getString(C17541R$string.upload_failed) + " (Twitter " + UploadService.this.f9145c + ")", "The " + UploadService.this.f9145c + " has already been uploaded", false);
                            }
                        }
                        UploadService.this.f9147f.remove(this.f9176b);
                    }
                    z = false;
                }
                boolean unused = UploadService.f9142B = false;
                if (UploadService.this.f9147f.size() == 0) {
                    UploadService.this.m14411j();
                    UploadService.this.stopSelf();
                } else if (z) {
                    UploadService.this.m14412l();
                }
            }
        }
    }

    /* renamed from: f */
    static /* synthetic */ int m14410f() {
        int i = f9141A;
        f9141A = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public synchronized void m14411j() {
        ((AlarmManager) MacroDroidApplication.m14845u().getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(this.f9149o);
        if (this.f9150p != null) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(this.f9150p);
            } catch (Exception unused) {
            }
            this.f9150p = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m14412l() {
        synchronized (this.f9148g) {
            if (!f9142B) {
                if (this.f9147f.size() > 0) {
                    m14413m(this.f9147f.peek());
                    f9142B = true;
                } else {
                    m14411j();
                    stopSelf();
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14413m(com.arlosoft.macrodroid.action.services.UploadService.C3444d r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Sending to "
            r0.append(r1)
            java.lang.String r1 = r5.f9167b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18873l(r0)
            java.lang.String r0 = r5.f9167b
            int r1 = r0.hashCode()
            r2 = 2
            r3 = 1
            switch(r1) {
                case -1904619323: goto L_0x0040;
                case 67066748: goto L_0x0036;
                case 561774310: goto L_0x002c;
                case 748307027: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x004a
        L_0x0022:
            java.lang.String r1 = "Twitter"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004a
            r0 = 1
            goto L_0x004b
        L_0x002c:
            java.lang.String r1 = "Facebook"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004a
            r0 = 0
            goto L_0x004b
        L_0x0036:
            java.lang.String r1 = "Email"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004a
            r0 = 2
            goto L_0x004b
        L_0x0040:
            java.lang.String r1 = "Picasa"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004a
            r0 = 3
            goto L_0x004b
        L_0x004a:
            r0 = -1
        L_0x004b:
            if (r0 == 0) goto L_0x005a
            if (r0 == r3) goto L_0x0056
            if (r0 == r2) goto L_0x0052
            goto L_0x005d
        L_0x0052:
            r4.m14416r(r5)
            goto L_0x005d
        L_0x0056:
            r4.m14415p(r5)
            goto L_0x005d
        L_0x005a:
            r4.m14414n(r5)
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.services.UploadService.m14413m(com.arlosoft.macrodroid.action.services.UploadService$d):void");
    }

    /* renamed from: n */
    private void m14414n(C3444d dVar) {
        C4878b.m18868g("Sorry - Upload to facebook is no longer supported due to unacceptable terms and conditions of using Facebook's API.");
    }

    /* renamed from: p */
    private void m14415p(C3444d dVar) {
        new C3445e(MacroDroidApplication.m14845u(), dVar).execute((Object[]) null);
    }

    /* renamed from: r */
    private void m14416r(C3444d dVar) {
        Account account;
        String Q = C5163j2.m20040Q(this);
        this.f9146d = Q;
        this.f9144a = dVar;
        if (Q == null) {
            C4061t1.m16023v(this, "Cannot Send Email", "No email address configured - check your settings", false);
            C4878b.m18868g("Cannot Send Email. No email address configured - check your settings");
        } else if (C5163j2.m20068U(this)) {
            C4878b.m18873l("Using email password");
            new C3441b(MacroDroidApplication.m14845u(), dVar).execute((Object[]) null);
        } else {
            C4878b.m18873l("Using OAUTH");
            AccountManager accountManager = AccountManager.get(this);
            Account[] accountsByType = accountManager.getAccountsByType("com.google");
            int i = 0;
            while (true) {
                if (i >= accountsByType.length) {
                    account = null;
                    break;
                } else if (accountsByType[i].name.equals(this.f9146d)) {
                    account = accountsByType[i];
                    break;
                } else {
                    i++;
                }
            }
            if (account == null) {
                C4878b.m18868g("Upload Service: Could not find google account - cannot send email");
                C8151a.m33873n(new RuntimeException("Upload Service: Could not find google account - cannot send email"));
                C4061t1.m16023v(this, "Cannot Send Email", "Gmail account not found", false);
                return;
            }
            this.f9151s = this.f9144a;
            accountManager.getAuthToken(account, "oauth2:https://www.googleapis.com/auth/gmail.send", true, new C3442c(this, (C3440a) null), (Handler) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract String mo26791g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract String mo26792h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract String mo26793i();

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo26819k(int i) {
        AlarmManager alarmManager = (AlarmManager) MacroDroidApplication.m14845u().getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent pendingIntent = this.f9149o;
        if (pendingIntent != null) {
            alarmManager.cancel(pendingIntent);
        }
        if (this.f9150p != null) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(this.f9150p);
            } catch (Exception unused) {
            }
            this.f9150p = null;
        }
        IntentFilter intentFilter = new IntentFilter("UploadQueueItem");
        this.f9150p = new QueueUpdateReceiver();
        MacroDroidApplication.m14845u().registerReceiver(this.f9150p, intentFilter);
        this.f9149o = PendingIntent.getBroadcast(MacroDroidApplication.m14845u(), 1948273, new Intent("UploadQueueItem"), 268435456 | C6368b1.f14959b);
        alarmManager.setExact(0, System.currentTimeMillis() + ((long) i), this.f9149o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract C7960a.C7963c mo26794o(Context context, C3444d dVar);

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        C4878b.m18873l("Upload Service created");
    }

    public void onDestroy() {
        super.onDestroy();
        C4878b.m18873l("Upload Service destroyed");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract void mo26797q(Context context, C3444d dVar, String str) throws Exception;

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract void mo26798s(Context context, C3444d dVar, String str, String str2) throws Exception;

    /* renamed from: com.arlosoft.macrodroid.action.services.UploadService$d */
    protected class C3444d {

        /* renamed from: a */
        public final Object f9166a;

        /* renamed from: b */
        public final String f9167b;

        /* renamed from: c */
        public final long f9168c = System.currentTimeMillis();

        /* renamed from: d */
        public String f9169d;

        /* renamed from: e */
        public String f9170e;

        /* renamed from: f */
        public String f9171f;

        /* renamed from: g */
        public File f9172g;

        /* renamed from: h */
        public String f9173h;

        public C3444d(Object obj, String str, String str2) {
            this.f9166a = obj;
            this.f9167b = str;
            this.f9169d = str2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3444d)) {
                return false;
            }
            C3444d dVar = (C3444d) obj;
            if (!dVar.f9166a.equals(this.f9166a) || !dVar.f9167b.equals(this.f9167b)) {
                return false;
            }
            return true;
        }

        public C3444d(Object obj, String str, String str2, String str3) {
            this.f9166a = obj;
            this.f9167b = str;
            this.f9169d = str2;
            this.f9170e = str3;
        }

        public C3444d(Object obj, String str, String str2, String str3, String str4) {
            this.f9166a = obj;
            this.f9167b = str;
            this.f9169d = str2;
            this.f9170e = str3;
            this.f9171f = str4;
        }

        public C3444d(Object obj, String str, String str2, String str3, File file) {
            this.f9166a = obj;
            this.f9167b = str;
            this.f9169d = str2;
            this.f9170e = str3;
            this.f9172g = file;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.services.UploadService$c */
    private class C3442c implements AccountManagerCallback<Bundle> {

        /* renamed from: a */
        final SharedPreferences f9158a;

        /* renamed from: b */
        final boolean f9159b;

        /* renamed from: c */
        final boolean f9160c;

        /* renamed from: d */
        final String f9161d;

        /* renamed from: e */
        final int f9162e;

        /* renamed from: com.arlosoft.macrodroid.action.services.UploadService$c$a */
        class C3443a extends Thread {

            /* renamed from: a */
            final /* synthetic */ String f9164a;

            C3443a(String str) {
                this.f9164a = str;
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
            /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
                r2 = r9.f9165c.f9163f.f9145c + " sent";
                r3 = r9.f9165c.f9163f.f9145c + " was sent to: " + r9.f9165c.f9163f.f9144a.f9169d;
             */
            /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x004f */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r9 = this;
                    r0 = 1
                    r1 = 0
                    com.arlosoft.macrodroid.action.services.UploadService$c r2 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    com.arlosoft.macrodroid.action.services.UploadService r2 = com.arlosoft.macrodroid.action.services.UploadService.this     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    com.arlosoft.macrodroid.action.services.UploadService$d r3 = r2.f9144a     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    java.lang.String r4 = r2.f9146d     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    java.lang.String r5 = r9.f9164a     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    r2.mo26798s(r2, r3, r4, r5)     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    com.arlosoft.macrodroid.action.services.UploadService$c r2 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    boolean r3 = r2.f9159b     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    if (r3 == 0) goto L_0x008f
                    com.arlosoft.macrodroid.action.services.UploadService r2 = com.arlosoft.macrodroid.action.services.UploadService.this     // Catch:{ Exception -> 0x004f }
                    r3 = 2131955690(0x7f130fea, float:1.9547915E38)
                    java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x004f }
                    java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x004f }
                    com.arlosoft.macrodroid.action.services.UploadService$c r4 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this     // Catch:{ Exception -> 0x004f }
                    com.arlosoft.macrodroid.action.services.UploadService r4 = com.arlosoft.macrodroid.action.services.UploadService.this     // Catch:{ Exception -> 0x004f }
                    java.lang.String r4 = r4.f9145c     // Catch:{ Exception -> 0x004f }
                    r3[r1] = r4     // Catch:{ Exception -> 0x004f }
                    java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ Exception -> 0x004f }
                    com.arlosoft.macrodroid.action.services.UploadService$c r3 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this     // Catch:{ Exception -> 0x004f }
                    com.arlosoft.macrodroid.action.services.UploadService r3 = com.arlosoft.macrodroid.action.services.UploadService.this     // Catch:{ Exception -> 0x004f }
                    r4 = 2131955691(0x7f130feb, float:1.9547917E38)
                    java.lang.String r3 = r3.getString(r4)     // Catch:{ Exception -> 0x004f }
                    r4 = 2
                    java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x004f }
                    com.arlosoft.macrodroid.action.services.UploadService$c r5 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this     // Catch:{ Exception -> 0x004f }
                    com.arlosoft.macrodroid.action.services.UploadService r5 = com.arlosoft.macrodroid.action.services.UploadService.this     // Catch:{ Exception -> 0x004f }
                    java.lang.String r6 = r5.f9145c     // Catch:{ Exception -> 0x004f }
                    r4[r1] = r6     // Catch:{ Exception -> 0x004f }
                    com.arlosoft.macrodroid.action.services.UploadService$d r5 = r5.f9144a     // Catch:{ Exception -> 0x004f }
                    java.lang.String r5 = r5.f9169d     // Catch:{ Exception -> 0x004f }
                    r4[r0] = r5     // Catch:{ Exception -> 0x004f }
                    java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ Exception -> 0x004f }
                    goto L_0x0088
                L_0x004f:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    r2.<init>()     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    com.arlosoft.macrodroid.action.services.UploadService$c r3 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    com.arlosoft.macrodroid.action.services.UploadService r3 = com.arlosoft.macrodroid.action.services.UploadService.this     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    java.lang.String r3 = r3.f9145c     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    r2.append(r3)     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    java.lang.String r3 = " sent"
                    r2.append(r3)     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    java.lang.String r2 = r2.toString()     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    r3.<init>()     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    com.arlosoft.macrodroid.action.services.UploadService$c r4 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    com.arlosoft.macrodroid.action.services.UploadService r4 = com.arlosoft.macrodroid.action.services.UploadService.this     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    java.lang.String r4 = r4.f9145c     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    r3.append(r4)     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    java.lang.String r4 = " was sent to: "
                    r3.append(r4)     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    com.arlosoft.macrodroid.action.services.UploadService$c r4 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    com.arlosoft.macrodroid.action.services.UploadService r4 = com.arlosoft.macrodroid.action.services.UploadService.this     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    com.arlosoft.macrodroid.action.services.UploadService$d r4 = r4.f9144a     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    java.lang.String r4 = r4.f9169d     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    r3.append(r4)     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    java.lang.String r3 = r3.toString()     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                L_0x0088:
                    com.arlosoft.macrodroid.action.services.UploadService$c r4 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    com.arlosoft.macrodroid.action.services.UploadService r4 = com.arlosoft.macrodroid.action.services.UploadService.this     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    com.arlosoft.macrodroid.common.C4061t1.m16023v(r4, r2, r3, r1)     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                L_0x008f:
                    com.arlosoft.macrodroid.action.services.UploadService$c r2 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    com.arlosoft.macrodroid.action.services.UploadService r2 = com.arlosoft.macrodroid.action.services.UploadService.this     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    com.arlosoft.macrodroid.action.services.UploadService$d r2 = r2.f9151s     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    if (r2 == 0) goto L_0x0158
                    com.arlosoft.macrodroid.action.services.UploadService$c r2 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    com.arlosoft.macrodroid.action.services.UploadService r2 = com.arlosoft.macrodroid.action.services.UploadService.this     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    java.util.Queue<com.arlosoft.macrodroid.action.services.UploadService$d> r3 = r2.f9147f     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    com.arlosoft.macrodroid.action.services.UploadService$d r2 = r2.f9151s     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    r3.remove(r2)     // Catch:{ UserRecoverableAuthIOException -> 0x012c, Exception -> 0x00a8 }
                    goto L_0x0158
                L_0x00a8:
                    long r2 = java.lang.System.currentTimeMillis()
                    com.arlosoft.macrodroid.action.services.UploadService$c r4 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this
                    java.lang.String r4 = r4.f9161d
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    int r4 = r4.intValue()
                    int r4 = r4 * 60
                    int r4 = r4 * 1000
                    com.arlosoft.macrodroid.action.services.UploadService$c r5 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this
                    com.arlosoft.macrodroid.action.services.UploadService r5 = com.arlosoft.macrodroid.action.services.UploadService.this
                    com.arlosoft.macrodroid.action.services.UploadService$d r5 = r5.f9151s
                    long r5 = r5.f9168c
                    long r7 = (long) r4
                    long r5 = r5 + r7
                    int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                    if (r4 <= 0) goto L_0x00d0
                    r0 = 0
                    goto L_0x0158
                L_0x00d0:
                    com.arlosoft.macrodroid.action.services.UploadService$c r2 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this
                    boolean r3 = r2.f9160c
                    if (r3 == 0) goto L_0x0114
                    com.arlosoft.macrodroid.action.services.UploadService r2 = com.arlosoft.macrodroid.action.services.UploadService.this
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    com.arlosoft.macrodroid.action.services.UploadService$c r4 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this
                    com.arlosoft.macrodroid.action.services.UploadService r4 = com.arlosoft.macrodroid.action.services.UploadService.this
                    java.lang.String r4 = r4.f9145c
                    r3.append(r4)
                    java.lang.String r4 = " sending failed"
                    r3.append(r4)
                    java.lang.String r3 = r3.toString()
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    com.arlosoft.macrodroid.action.services.UploadService$c r5 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this
                    com.arlosoft.macrodroid.action.services.UploadService r5 = com.arlosoft.macrodroid.action.services.UploadService.this
                    java.lang.String r5 = r5.f9145c
                    r4.append(r5)
                    java.lang.String r5 = " not sent to: "
                    r4.append(r5)
                    com.arlosoft.macrodroid.action.services.UploadService$c r5 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this
                    com.arlosoft.macrodroid.action.services.UploadService r5 = com.arlosoft.macrodroid.action.services.UploadService.this
                    com.arlosoft.macrodroid.action.services.UploadService$d r5 = r5.f9144a
                    java.lang.String r5 = r5.f9169d
                    r4.append(r5)
                    java.lang.String r4 = r4.toString()
                    com.arlosoft.macrodroid.common.C4061t1.m16023v(r2, r3, r4, r1)
                L_0x0114:
                    com.arlosoft.macrodroid.action.services.UploadService$c r2 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this
                    com.arlosoft.macrodroid.action.services.UploadService r2 = com.arlosoft.macrodroid.action.services.UploadService.this
                    com.arlosoft.macrodroid.action.services.UploadService$d r2 = r2.f9151s
                    if (r2 == 0) goto L_0x0158
                    com.arlosoft.macrodroid.action.services.UploadService$c r2 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this
                    com.arlosoft.macrodroid.action.services.UploadService r2 = com.arlosoft.macrodroid.action.services.UploadService.this
                    java.util.Queue<com.arlosoft.macrodroid.action.services.UploadService$d> r3 = r2.f9147f
                    com.arlosoft.macrodroid.action.services.UploadService$d r2 = r2.f9151s
                    r3.remove(r2)
                    goto L_0x0158
                L_0x012c:
                    r2 = move-exception
                    android.content.Intent r2 = r2.mo60280c()
                    r3 = 268435456(0x10000000, float:2.5243549E-29)
                    r2.addFlags(r3)
                    com.arlosoft.macrodroid.action.services.UploadService$c r3 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this
                    com.arlosoft.macrodroid.action.services.UploadService r3 = com.arlosoft.macrodroid.action.services.UploadService.this
                    com.arlosoft.macrodroid.utils.g0 r3 = com.arlosoft.macrodroid.utils.C6383g0.m24633d(r3)
                    r3.mo32429h(r2)
                    com.arlosoft.macrodroid.action.services.UploadService$c r2 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this
                    com.arlosoft.macrodroid.action.services.UploadService r2 = com.arlosoft.macrodroid.action.services.UploadService.this
                    com.arlosoft.macrodroid.action.services.UploadService$d r2 = r2.f9151s
                    if (r2 == 0) goto L_0x0158
                    com.arlosoft.macrodroid.action.services.UploadService$c r2 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this
                    com.arlosoft.macrodroid.action.services.UploadService r2 = com.arlosoft.macrodroid.action.services.UploadService.this
                    java.util.Queue<com.arlosoft.macrodroid.action.services.UploadService$d> r3 = r2.f9147f
                    com.arlosoft.macrodroid.action.services.UploadService$d r2 = r2.f9151s
                    r3.remove(r2)
                L_0x0158:
                    boolean unused = com.arlosoft.macrodroid.action.services.UploadService.f9142B = r1
                    com.arlosoft.macrodroid.action.services.UploadService$c r1 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this
                    com.arlosoft.macrodroid.action.services.UploadService r1 = com.arlosoft.macrodroid.action.services.UploadService.this
                    java.util.Queue<com.arlosoft.macrodroid.action.services.UploadService$d> r1 = r1.f9147f
                    int r1 = r1.size()
                    if (r1 != 0) goto L_0x0176
                    com.arlosoft.macrodroid.action.services.UploadService$c r0 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this
                    com.arlosoft.macrodroid.action.services.UploadService r0 = com.arlosoft.macrodroid.action.services.UploadService.this
                    r0.m14411j()
                    com.arlosoft.macrodroid.action.services.UploadService$c r0 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this
                    com.arlosoft.macrodroid.action.services.UploadService r0 = com.arlosoft.macrodroid.action.services.UploadService.this
                    r0.stopSelf()
                    goto L_0x017f
                L_0x0176:
                    if (r0 == 0) goto L_0x017f
                    com.arlosoft.macrodroid.action.services.UploadService$c r0 = com.arlosoft.macrodroid.action.services.UploadService.C3442c.this
                    com.arlosoft.macrodroid.action.services.UploadService r0 = com.arlosoft.macrodroid.action.services.UploadService.this
                    r0.m14412l()
                L_0x017f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.services.UploadService.C3442c.C3443a.run():void");
            }
        }

        private C3442c() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(UploadService.this);
            this.f9158a = defaultSharedPreferences;
            this.f9159b = defaultSharedPreferences.getBoolean(UploadService.this.mo26792h(), true);
            this.f9160c = defaultSharedPreferences.getBoolean(UploadService.this.mo26791g(), true);
            String string = defaultSharedPreferences.getString(UploadService.this.mo26793i(), "0");
            this.f9161d = string;
            this.f9162e = Integer.valueOf(string).intValue() * 60 * 1000;
        }

        public void run(AccountManagerFuture<Bundle> accountManagerFuture) {
            String str;
            try {
                new C3443a(accountManagerFuture.getResult().getString("authtoken")).start();
            } catch (Exception unused) {
                boolean z = true;
                if (UploadService.this.f9151s.f9168c + ((long) this.f9162e) > System.currentTimeMillis()) {
                    z = false;
                } else {
                    if (this.f9160c) {
                        try {
                            String string = UploadService.this.getString(C17541R$string.upload_or_share_x_was_not_sent_to_y);
                            UploadService uploadService = UploadService.this;
                            str = String.format(string, new Object[]{uploadService.f9145c, uploadService.f9144a.f9169d});
                        } catch (Exception unused2) {
                            str = UploadService.this.f9145c + " was not sent to " + UploadService.this.f9144a.f9169d;
                        }
                        UploadService uploadService2 = UploadService.this;
                        C4061t1.m16023v(uploadService2, uploadService2.getString(C17541R$string.upload_or_share_sending_failed), str, false);
                    }
                    if (UploadService.this.f9151s != null) {
                        UploadService uploadService3 = UploadService.this;
                        uploadService3.f9147f.remove(uploadService3.f9151s);
                    }
                }
                boolean unused3 = UploadService.f9142B = false;
                if (UploadService.this.f9147f.size() == 0) {
                    UploadService.this.m14411j();
                    UploadService.this.stopSelf();
                } else if (z) {
                    UploadService.this.m14412l();
                }
            }
        }

        /* synthetic */ C3442c(UploadService uploadService, C3440a aVar) {
            this();
        }
    }
}
