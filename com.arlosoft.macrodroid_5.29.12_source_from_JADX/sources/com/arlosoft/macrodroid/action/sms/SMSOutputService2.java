package com.arlosoft.macrodroid.action.sms;

import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import android.telephony.SmsManager;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.Contact;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.utils.C6368b1;
import java.util.ArrayList;
import p148q0.C8151a;

public class SMSOutputService2 extends IntentService {

    /* renamed from: c */
    private static int f9229c = 95000;

    /* renamed from: a */
    private PowerManager.WakeLock f9230a;

    public SMSOutputService2() {
        super("SMSOutputService2");
    }

    /* renamed from: a */
    private SmsManager m14457a(int i) {
        if (Build.VERSION.SDK_INT < 22 || i == 0) {
            return SmsManager.getDefault();
        }
        SmsManager smsManagerForSubscriptionId = SmsManager.getSmsManagerForSubscriptionId(i);
        return smsManagerForSubscriptionId != null ? smsManagerForSubscriptionId : SmsManager.getDefault();
    }

    /* renamed from: b */
    private void m14458b() {
        if (this.f9230a == null) {
            PowerManager.WakeLock newWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, "macrodroid:sms_output_service");
            this.f9230a = newWakeLock;
            newWakeLock.setReferenceCounted(true);
        }
    }

    /* renamed from: c */
    public static void m14459c(Context context, String str, Contact contact, String str2, boolean z, int i, int i2) {
        if (contact == null && str2 == null) {
            C4878b.m18868g("SMSOutputService: destinationContact is null");
            C8151a.m33873n(new RuntimeException("SMSOutputService: Destination Contact is null"));
            C4061t1.m16023v(context, "SMS sending failed", "The destination was not set", false);
            return;
        }
        if (str2 == null) {
            if (contact.mo27714h() != null) {
                str2 = contact.mo27714h();
            } else {
                str2 = C4061t1.m15975U(context, contact);
            }
        }
        m14460d(context, str, str2, z, i, i2);
    }

    /* renamed from: d */
    public static void m14460d(Context context, String str, String str2, boolean z, int i, int i2) {
        if (str == null) {
            C4878b.m18868g("SMSOutputService: message is null");
            C8151a.m33873n(new RuntimeException("SMSOutputService: message is null"));
            return;
        }
        Intent intent = new Intent(context, SMSOutputService2.class);
        intent.putExtra("message", str);
        intent.putExtra("destination", str2);
        intent.putExtra("attempt_number", i);
        intent.putExtra("AddToMessageLogExtra", z);
        intent.putExtra("SimId", i2);
        try {
            context.startService(intent);
        } catch (IllegalStateException e) {
            C4878b.m18868g("Cannot start send SMS service: " + e);
            C8151a.m33873n(e);
        }
    }

    /* renamed from: e */
    private void m14461e(SMSMessage sMSMessage, Intent intent) {
        Intent intent2 = intent;
        try {
            this.f9230a.acquire(20000);
            int intExtra = intent2.getIntExtra("SimId", 0);
            Intent intent3 = new Intent(this, SMSResultReceiver.class);
            intent3.putExtra("SMS_MESSAGE_ID", sMSMessage.mo26854e());
            intent3.putExtra("original_intent", intent2);
            intent3.putExtra("attempt_number", intent2.getIntExtra("attempt_number", 1));
            intent3.putExtra("message", intent2.getStringExtra("message"));
            intent3.putExtra("destination", intent2.getStringExtra("destination"));
            intent3.putExtra("AddToMessageLogExtra", intent2.getBooleanExtra("AddToMessageLogExtra", false));
            intent3.putExtra("SimId", intExtra);
            C4878b.m18873l("Sending SMS to: " + sMSMessage.mo26855f() + " Message = " + sMSMessage.mo26852d());
            int i = f9229c;
            f9229c = i + 1;
            PendingIntent broadcast = PendingIntent.getBroadcast(this, i, intent3, 134217728 | C6368b1.f14960c);
            ArrayList<String> divideMessage = SmsManager.getDefault().divideMessage(sMSMessage.mo26852d());
            int size = divideMessage.size();
            if (size == 1) {
                try {
                    m14457a(intExtra).sendTextMessage(sMSMessage.mo26855f(), (String) null, sMSMessage.mo26852d(), broadcast, (PendingIntent) null);
                } catch (Exception e) {
                    C4061t1.m16023v(this, "MacroDroid Error", "SMS Sending Error", false);
                    C4878b.m18868g("SMS Sending failed: " + e.toString());
                    this.f9230a.release();
                }
            } else {
                C4878b.m18873l("SMS exceeds 160 char limit, sending multi-part message (" + size + " parts)");
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(PendingIntent.getBroadcast(this, i, intent3, 1073741824 | C6368b1.f14960c));
                }
                try {
                    m14457a(intExtra).sendMultipartTextMessage(sMSMessage.mo26855f(), (String) null, divideMessage, arrayList, (ArrayList) null);
                } catch (Exception e2) {
                    C4061t1.m16023v(this, "MacroDroid Error", "SMS Sending Error", false);
                    C4878b.m18868g("SMS Sending failed: " + e2.toString());
                    this.f9230a.release();
                }
            }
        } catch (Exception e3) {
            C4878b.m18868g("Failed to send SMS message: " + e3.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        m14458b();
        String stringExtra = intent.getStringExtra("message");
        String stringExtra2 = intent.getStringExtra("destination");
        boolean z = intent.getExtras().getBoolean("AddToMessageLogExtra");
        int intExtra = intent.getIntExtra("attempt_number", 1);
        int intExtra2 = intent.getIntExtra("SimId", 0);
        if (stringExtra == null) {
            C4878b.m18868g("SMSOutputService: message is null");
            C8151a.m33873n(new RuntimeException("SMSOutputService: message is null"));
            C4061t1.m16023v(this, "SMS sending failed", "The message was empty", false);
            return;
        }
        SMSMessage sMSMessage = new SMSMessage(stringExtra2, stringExtra, z, intExtra2);
        intent.putExtra("attempt_number", intExtra);
        intent.putExtra("message", stringExtra);
        intent.putExtra("destination", stringExtra2);
        intent.putExtra("AddToMessageLogExtra", z);
        intent.putExtra("SimId", intExtra2);
        m14461e(sMSMessage, intent);
    }
}
