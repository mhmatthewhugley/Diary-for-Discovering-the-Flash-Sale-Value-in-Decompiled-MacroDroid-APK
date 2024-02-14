package com.arlosoft.macrodroid.triggers.services;

import android.app.IntentService;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.telephony.PhoneNumberUtils;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.Contact;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.CallActiveTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6460y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C13706o;

/* compiled from: SignalOnOffTriggerService.kt */
public final class CallStateOffHookService extends IntentService {
    public CallStateOffHookService() {
        super("CallStateOffHookService");
    }

    /* renamed from: a */
    private final void m24088a(String str, CallActiveTrigger callActiveTrigger, Macro macro, List<Macro> list) {
        if (str != null) {
            List<String> w3 = callActiveTrigger.mo31003w3();
            if (w3.size() > 0) {
                StringBuilder sb = new StringBuilder("(");
                int size = w3.size();
                for (int i = 0; i < size; i++) {
                    sb.append(w3.get(i));
                    if (i < w3.size() - 1) {
                        sb.append(",");
                    }
                }
                sb.append(")");
                ContentResolver contentResolver = getContentResolver();
                Cursor query = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"data1", "contact_id"}, "data1 IN " + sb, (String[]) null, (String) null);
                ArrayList<String> arrayList = new ArrayList<>();
                while (true) {
                    C13706o.m87926c(query);
                    if (!query.moveToNext()) {
                        break;
                    }
                    String string = query.getString(query.getColumnIndex("contact_id"));
                    if (!arrayList.contains(string)) {
                        C13706o.m87928e(string, "contactId");
                        arrayList.add(string);
                    }
                }
                query.close();
                for (String T : arrayList) {
                    if (C4061t1.m16011p(str, C4061t1.m15974T(MacroDroidApplication.f9883I.mo27303b(), T)) && callActiveTrigger.mo31374R2()) {
                        macro.setTriggerThatInvoked(callActiveTrigger);
                        macro.setTriggerContextInfo(new TriggerContextInfo((Trigger) callActiveTrigger, str));
                        if (macro.canInvoke(macro.getTriggerContextInfo())) {
                            list.add(macro);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private final void m24089b(String str, CallActiveTrigger callActiveTrigger, Macro macro, List<Macro> list) {
        if (str != null) {
            String x3 = callActiveTrigger.mo31004x3();
            boolean compare = PhoneNumberUtils.compare(x3, str);
            if (!compare) {
                String t0 = C4023j0.m15760t0(this, x3, (TriggerContextInfo) null, macro);
                C13706o.m87928e(t0, "magicText");
                String lowerCase = t0.toLowerCase(Locale.ROOT);
                C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (C6460y1.m24792d(str, C6460y1.m24791c(lowerCase, false), false)) {
                    compare = true;
                }
            }
            if (compare != callActiveTrigger.mo31002v3() && callActiveTrigger.mo31374R2()) {
                macro.setTriggerThatInvoked(callActiveTrigger);
                macro.setTriggerContextInfo(new TriggerContextInfo((Trigger) callActiveTrigger, str));
                if (macro.canInvoke(macro.getTriggerContextInfo())) {
                    list.add(macro);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        boolean z;
        String stringExtra = intent != null ? intent.getStringExtra("lastCallNumber") : null;
        ArrayList arrayList = new ArrayList();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if (next2 instanceof CallActiveTrigger) {
                    CallActiveTrigger callActiveTrigger = (CallActiveTrigger) next2;
                    if (callActiveTrigger.mo31005y3() == 3) {
                        if (next2.mo31374R2()) {
                            next.setTriggerThatInvoked(next2);
                            next.setTriggerContextInfo(new TriggerContextInfo(next.getTriggerThatInvoked(), stringExtra));
                            if (next.canInvoke(next.getTriggerContextInfo())) {
                                arrayList.add(next);
                            }
                        }
                    } else if (callActiveTrigger.mo31005y3() == 2) {
                        C13706o.m87928e(next, "macro");
                        m24089b(stringExtra, callActiveTrigger, next, arrayList);
                    } else if (callActiveTrigger.mo31005y3() == 1) {
                        C13706o.m87928e(next, "macro");
                        m24088a(stringExtra, callActiveTrigger, next, arrayList);
                    } else {
                        boolean z3 = callActiveTrigger.mo31006z3();
                        Iterator<Contact> it2 = callActiveTrigger.mo31001u3().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Contact next3 = it2.next();
                            if (next3 == null || C13706o.m87924a(next3.mo27709b(), "-2")) {
                                z = callActiveTrigger.mo31006z3();
                            } else if (C13706o.m87924a(next3.mo27709b(), "-4")) {
                                if (stringExtra == null) {
                                    z = callActiveTrigger.mo31006z3();
                                    break;
                                }
                            } else if (C13706o.m87924a(next3.mo27709b(), "-1") || C13706o.m87924a(next3.mo27709b(), "-3")) {
                                boolean a = C13706o.m87924a(next3.mo27709b(), "-1");
                                boolean z2 = false;
                                Iterator<Contact> it3 = C4061t1.m15950D(MacroDroidApplication.f9883I.mo27303b()).iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    if (C4061t1.m16011p(stringExtra, C4061t1.m15973S(MacroDroidApplication.f9883I.mo27303b(), it3.next()))) {
                                        z2 = true;
                                        break;
                                    }
                                }
                                if (z2 == a) {
                                    z = callActiveTrigger.mo31006z3();
                                    break;
                                }
                            } else if (C4061t1.m16011p(stringExtra, C4061t1.m15973S(MacroDroidApplication.f9883I.mo27303b(), next3))) {
                                z = callActiveTrigger.mo31006z3();
                                break;
                            }
                        }
                        z3 = !z;
                        if (z3 && next2.mo31374R2()) {
                            next.setTriggerThatInvoked(next2);
                            next.setTriggerContextInfo(new TriggerContextInfo(next.getTriggerThatInvoked(), stringExtra));
                            if (next.canInvoke(next.getTriggerContextInfo())) {
                                arrayList.add(next);
                            }
                        }
                    }
                }
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            Macro macro = (Macro) it4.next();
            macro.invokeActions(macro.getTriggerContextInfo());
        }
    }
}
