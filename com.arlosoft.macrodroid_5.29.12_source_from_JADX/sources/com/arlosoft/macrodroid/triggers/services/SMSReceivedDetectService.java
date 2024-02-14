package com.arlosoft.macrodroid.triggers.services;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import android.provider.ContactsContract;
import androidx.core.content.ContextCompat;
import androidx.work.WorkRequest;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.sms.SMSMessage;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import p112j2.C7439d0;
import p148q0.C8151a;

public class SMSReceivedDetectService extends Service {

    /* renamed from: a */
    private static SMSReceivedReceiver f14542a = null;

    /* renamed from: c */
    private static C6119b f14543c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static String f14544d = "";

    public class SMSReceivedReceiver extends BroadcastReceiver {
        public SMSReceivedReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("SmsReceviedIntent")) {
                SMSReceivedDetectService.m24226d(context, (SMSMessage) intent.getExtras().get("SmsMessageExtra"));
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.services.SMSReceivedDetectService$a */
    class C6118a extends Thread {

        /* renamed from: a */
        final /* synthetic */ SMSMessage f14546a;

        /* renamed from: c */
        final /* synthetic */ Context f14547c;

        /* renamed from: d */
        final /* synthetic */ PowerManager.WakeLock f14548d;

        C6118a(SMSMessage sMSMessage, Context context, PowerManager.WakeLock wakeLock) {
            this.f14546a = sMSMessage;
            this.f14547c = context;
            this.f14548d = wakeLock;
        }

        public void run() {
            String string;
            Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, C4061t1.m15953E0(this.f14546a.mo26855f()));
            if (ContextCompat.checkSelfPermission(this.f14547c, "android.permission.READ_CONTACTS") != 0) {
                Context context = this.f14547c;
                C7439d0.m30909o0(context, "android.permission.READ_CONTACTS", context.getString(C17541R$string.trigger_sms_sent), true, false);
                return;
            }
            Cursor cursor = null;
            try {
                cursor = MacroDroidApplication.m14845u().getContentResolver().query(withAppendedPath, new String[]{"display_name"}, (String) null, (String[]) null, (String) null);
            } catch (Exception unused) {
            }
            String str = "";
            if (cursor != null) {
                if (cursor.moveToFirst() && (string = cursor.getString(cursor.getColumnIndex("display_name"))) != null && string.length() > 0) {
                    str = string;
                }
                cursor.close();
            }
            C6125e.m24239d(this.f14547c, this.f14546a.mo26855f(), this.f14546a.mo26852d(), str);
            if (this.f14548d.isHeld()) {
                this.f14548d.release();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.services.SMSReceivedDetectService$b */
    public static class C6119b extends ContentObserver {

        /* renamed from: a */
        private Context f14549a;

        public C6119b(Handler handler, Context context) {
            super(handler);
            this.f14549a = context;
        }

        public void onChange(boolean z) {
            super.onChange(z);
            Uri parse = Uri.parse("content://sms");
            if (ContextCompat.checkSelfPermission(this.f14549a, "android.permission.READ_SMS") == -1) {
                C7439d0.m30909o0(this.f14549a, "android.permission.READ_SMS", (String) null, true, false);
                return;
            }
            Cursor query = MacroDroidApplication.m14845u().getContentResolver().query(parse, (String[]) null, (String) null, (String[]) null, (String) null);
            if (query != null && query.getCount() != 0) {
                try {
                    query.moveToNext();
                    int i = query.getInt(query.getColumnIndex("type"));
                    String string = query.getString(query.getColumnIndex("address"));
                    String string2 = query.getString(query.getColumnIndex("body"));
                    String string3 = query.getString(query.getColumnIndex(Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID));
                    if (i == 1 && !SMSReceivedDetectService.f14544d.equals(string3)) {
                        SMSReceivedDetectService.m24226d(this.f14549a, new SMSMessage(string, string2, false, 0));
                        String unused = SMSReceivedDetectService.f14544d = string3;
                    }
                } catch (CursorIndexOutOfBoundsException e) {
                    C8151a.m33873n(e);
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
                query.close();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m24226d(Context context, SMSMessage sMSMessage) {
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "macrodroid:SMSReceivedDetectService");
        newWakeLock.acquire(WorkRequest.MIN_BACKOFF_MILLIS);
        new C6118a(sMSMessage, context, newWakeLock).start();
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        try {
            f14543c = new C6119b(new Handler(), this);
            getContentResolver().registerContentObserver(Uri.parse("content://sms"), true, f14543c);
            IntentFilter intentFilter = new IntentFilter("SmsReceviedIntent");
            SMSReceivedReceiver sMSReceivedReceiver = new SMSReceivedReceiver();
            f14542a = sMSReceivedReceiver;
            registerReceiver(sMSReceivedReceiver, intentFilter);
        } catch (SecurityException unused) {
            C4878b.m18868g("SMS dectection is missing access to SMS_RECEIVED permission");
            C7439d0.m30909o0(this, "android.permission.READ_SMS", getString(C17541R$string.trigger_incoming_sms), true, false);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0009 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r2 = this;
            android.content.ContentResolver r0 = r2.getContentResolver()     // Catch:{ Exception -> 0x0009 }
            com.arlosoft.macrodroid.triggers.services.SMSReceivedDetectService$b r1 = f14543c     // Catch:{ Exception -> 0x0009 }
            r0.unregisterContentObserver(r1)     // Catch:{ Exception -> 0x0009 }
        L_0x0009:
            com.arlosoft.macrodroid.triggers.services.SMSReceivedDetectService$SMSReceivedReceiver r0 = f14542a     // Catch:{ Exception -> 0x000e }
            r2.unregisterReceiver(r0)     // Catch:{ Exception -> 0x000e }
        L_0x000e:
            super.onDestroy()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.services.SMSReceivedDetectService.onDestroy():void");
    }
}
