package com.arlosoft.macrodroid.triggers.services;

import android.app.IntentService;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.telephony.SmsMessage;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import p148q0.C8151a;

public class IncomingSMSCheckerService extends IntentService {

    /* renamed from: a */
    private static SmsMessage[] f14487a;

    public IncomingSMSCheckerService() {
        super("IncomingSMSCheckerService");
    }

    /* renamed from: a */
    private SmsMessage[] m24163a(Intent intent) {
        SmsMessage[] smsMessageArr = null;
        try {
            Object[] objArr = (Object[]) intent.getExtras().get("pdus");
            smsMessageArr = new SmsMessage[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                smsMessageArr[i] = SmsMessage.createFromPdu((byte[]) objArr[i]);
            }
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("IncomingSMSTriggerReceiver: [ERROR] getMessagesFromIntent fail: " + e.getMessage()));
        }
        return smsMessageArr;
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        String str;
        SmsMessage[] smsMessageArr;
        if (intent != null) {
            Bundle extras = intent.getExtras();
            SmsMessage[] a = m24163a(intent);
            if (a != null) {
                if (a[0] != null) {
                    if (a.length > 0 && (smsMessageArr = f14487a) != null && smsMessageArr.length > 0) {
                        try {
                            if (smsMessageArr[0].getMessageBody() != null && f14487a[0].getMessageBody().equals(a[0].getMessageBody()) && f14487a[0].getDisplayOriginatingAddress() != null && f14487a[0].getDisplayOriginatingAddress().equals(a[0].getDisplayOriginatingAddress()) && f14487a[0].getTimestampMillis() == a[0].getTimestampMillis()) {
                                return;
                            }
                        } catch (Exception unused) {
                        }
                    }
                    f14487a = a;
                    if (extras != null) {
                        StringBuilder sb = new StringBuilder();
                        String str2 = null;
                        String str3 = "";
                        for (int i = 0; i < a.length; i++) {
                            SmsMessage smsMessage = a[i];
                            if (smsMessage != null) {
                                if (i == 0) {
                                    try {
                                        str2 = smsMessage.getDisplayOriginatingAddress();
                                    } catch (Exception unused2) {
                                    }
                                    if (str2 == null || str2.length() <= 0) {
                                        C4878b.m18882u("Incoming SMS: The from number was null or empty");
                                        str3 = str2;
                                    } else {
                                        try {
                                            Cursor query = MacroDroidApplication.m14845u().getContentResolver().query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, str2), new String[]{"display_name"}, (String) null, (String[]) null, (String) null);
                                            if (query != null) {
                                                if (!query.moveToFirst() || (str = query.getString(query.getColumnIndex("display_name"))) == null || str.length() <= 0) {
                                                    str = str2;
                                                }
                                                try {
                                                    query.close();
                                                } catch (Exception unused3) {
                                                }
                                                str3 = str;
                                            }
                                        } catch (Exception unused4) {
                                        }
                                        str = str2;
                                        str3 = str;
                                    }
                                }
                                sb.append(smsMessage.getMessageBody());
                            }
                        }
                        C6125e.m24239d(this, str2, sb.toString(), str3);
                    }
                    WakefulBroadcastReceiver.completeWakefulIntent(intent);
                    return;
                }
            }
            C8151a.m33873n(new RuntimeException("IncomingSMSTriggerReceiver: getMessagesFromIntent returned null"));
        }
    }
}
