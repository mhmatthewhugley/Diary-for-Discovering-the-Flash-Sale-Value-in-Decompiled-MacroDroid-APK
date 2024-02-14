package com.arlosoft.macrodroid.triggers.services;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.ContactsContract;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.Contact;
import com.arlosoft.macrodroid.common.IncomingSMS;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.IncomingSMSTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6460y1;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p112j2.C7439d0;

/* renamed from: com.arlosoft.macrodroid.triggers.services.e */
/* compiled from: IncomingSMSUtil */
public class C6125e {
    /* renamed from: b */
    private static boolean m24237b(Context context, IncomingSMSTrigger incomingSMSTrigger, String str, boolean z) {
        if (incomingSMSTrigger.mo31206B3() == null) {
            return true;
        }
        String t0 = C4023j0.m15760t0(context, incomingSMSTrigger.mo31206B3(), (TriggerContextInfo) null, incomingSMSTrigger.mo27837X0());
        String c = C6460y1.m24791c(t0.toLowerCase(), z);
        String b = C6460y1.m24790b(t0.toLowerCase(), z);
        if (incomingSMSTrigger.mo31214L3()) {
            return !C6460y1.m24792d(str.toLowerCase(), b, z);
        }
        if (incomingSMSTrigger.mo31212J3()) {
            return C6460y1.m24792d(str.toLowerCase(), c, z);
        }
        return C6460y1.m24792d(str.toLowerCase(), b, z);
    }

    /* renamed from: c */
    private static boolean m24238c(Context context, String str, IncomingSMSTrigger incomingSMSTrigger, Macro macro, List<Macro> list, String str2, IncomingSMS incomingSMS) {
        Context context2 = context;
        IncomingSMSTrigger incomingSMSTrigger2 = incomingSMSTrigger;
        Macro macro2 = macro;
        List<String> D3 = incomingSMSTrigger.mo31208D3();
        if (D3.size() > 0) {
            StringBuilder sb = new StringBuilder("(");
            for (int i = 0; i < D3.size(); i++) {
                sb.append(D3.get(i));
                if (i < D3.size() - 1) {
                    sb.append(",");
                }
            }
            sb.append(")");
            Uri uri = ContactsContract.Data.CONTENT_URI;
            String[] strArr = {"data1", "contact_id"};
            try {
                ContentResolver contentResolver = context.getContentResolver();
                Cursor query = contentResolver.query(uri, strArr, "data1 IN " + sb.toString(), (String[]) null, (String) null);
                ArrayList arrayList = new ArrayList();
                if (query != null) {
                    while (query.moveToNext()) {
                        arrayList.add(query.getString(query.getColumnIndex("contact_id")));
                    }
                    query.close();
                }
                Iterator<Contact> it = C4061t1.m15954F(context, arrayList).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (C4061t1.m16011p(str, C4061t1.m15973S(MacroDroidApplication.m14845u(), it.next()))) {
                        if (m24237b(context, incomingSMSTrigger2, str2, incomingSMSTrigger.mo31211I3()) && incomingSMSTrigger.mo31374R2()) {
                            macro2.setTriggerThatInvoked(incomingSMSTrigger2);
                            macro2.setTriggerContextInfo(new TriggerContextInfo((Trigger) incomingSMSTrigger2, incomingSMS));
                            if (macro2.canInvoke(macro.getTriggerContextInfo())) {
                                list.add(macro2);
                                return true;
                            }
                        }
                    } else {
                        List<Macro> list2 = list;
                        String str3 = str2;
                        IncomingSMS incomingSMS2 = incomingSMS;
                    }
                }
            } catch (SecurityException unused) {
                C7439d0.m30909o0(context, "android.permission.READ_CONTACTS", macro.getName(), true, false);
            }
        }
        return false;
    }

    /* renamed from: d */
    public static synchronized void m24239d(Context context, String str, String str2, String str3) {
        boolean z;
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        synchronized (C6125e.class) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            for (Macro next : C4934n.m18998M().mo29679I()) {
                Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Trigger next2 = it.next();
                    if (next2 instanceof IncomingSMSTrigger) {
                        IncomingSMS incomingSMS = new IncomingSMS(str3, str5, str4);
                        String t0 = C4023j0.m15760t0(context.getApplicationContext(), str5, (TriggerContextInfo) null, next);
                        IncomingSMSTrigger incomingSMSTrigger = (IncomingSMSTrigger) next2;
                        if (incomingSMSTrigger.mo31210G3() == 3) {
                            if (incomingSMSTrigger.mo31374R2() && m24237b(context2, incomingSMSTrigger, t0, incomingSMSTrigger.mo31211I3())) {
                                next.setTriggerThatInvoked(incomingSMSTrigger);
                                next.setTriggerContextInfo(new TriggerContextInfo((Trigger) incomingSMSTrigger, incomingSMS));
                                if (next.canInvoke(next.getTriggerContextInfo())) {
                                    arrayList.add(next);
                                }
                            }
                        } else if (incomingSMSTrigger.mo31210G3() == 2) {
                            if (m24240e(context, str, incomingSMSTrigger, next, arrayList, t0, incomingSMS)) {
                                break;
                            }
                        } else {
                            String str6 = t0;
                            if (incomingSMSTrigger.mo31210G3() != 1) {
                                List<Contact> A3 = incomingSMSTrigger.mo31205A3();
                                boolean K3 = ((IncomingSMSTrigger) next2).mo31213K3();
                                Iterator<Contact> it2 = A3.iterator();
                                boolean z2 = K3;
                                List<Contact> list = null;
                                while (true) {
                                    if (!it2.hasNext()) {
                                        boolean z3 = z2;
                                        break;
                                    }
                                    Contact next3 = it2.next();
                                    if (next3 != null) {
                                        if (next3.mo27709b() != null) {
                                            Iterator<Contact> it3 = it2;
                                            boolean z4 = z2;
                                            if (next3.mo27709b().equals("-2")) {
                                                z2 = true;
                                            } else {
                                                if (!next3.mo27709b().equals("-1")) {
                                                    if (!next3.mo27709b().equals("-3")) {
                                                        if (C4061t1.m16011p(str4, C4061t1.m15973S(MacroDroidApplication.m14845u(), next3))) {
                                                            break;
                                                        }
                                                        z2 = z4;
                                                    }
                                                }
                                                boolean equals = next3.mo27709b().equals("-1");
                                                if (list == null) {
                                                    list = C4061t1.m15950D(context);
                                                }
                                                if (list != null && list.size() > 0) {
                                                    Iterator<Contact> it4 = list.iterator();
                                                    while (true) {
                                                        if (!it4.hasNext()) {
                                                            z = false;
                                                            break;
                                                        }
                                                        Contact next4 = it4.next();
                                                        Iterator<Contact> it5 = it4;
                                                        List<String> list2 = (List) hashMap.get(next4.mo27709b());
                                                        if (list2 == null) {
                                                            list2 = C4061t1.m15973S(MacroDroidApplication.m14845u(), next4);
                                                            hashMap.put(next4.mo27709b(), list2);
                                                        }
                                                        if (C4061t1.m16011p(str4, list2)) {
                                                            z = true;
                                                            break;
                                                        }
                                                        it4 = it5;
                                                    }
                                                    if (z == equals) {
                                                        break;
                                                    }
                                                }
                                                z2 = z4;
                                            }
                                            it2 = it3;
                                        }
                                    }
                                    it2 = it2;
                                    z2 = z2;
                                }
                                z2 = !K3;
                                if (z2 && next2.mo31374R2()) {
                                    if (m24237b(context2, incomingSMSTrigger, str6, incomingSMSTrigger.mo31211I3())) {
                                        next.setTriggerThatInvoked(next2);
                                        next.setTriggerContextInfo(new TriggerContextInfo(next2, incomingSMS));
                                        if (next.canInvoke(next.getTriggerContextInfo())) {
                                            arrayList.add(next);
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else if (m24238c(context, str, incomingSMSTrigger, next, arrayList, str6, incomingSMS)) {
                                break;
                            }
                        }
                    }
                }
            }
            new Handler(Looper.getMainLooper()).post(new C6124d(arrayList));
        }
    }

    /* renamed from: e */
    private static boolean m24240e(Context context, String str, IncomingSMSTrigger incomingSMSTrigger, Macro macro, List<Macro> list, String str2, IncomingSMS incomingSMS) {
        boolean z;
        if (str == null) {
            return false;
        }
        String E3 = incomingSMSTrigger.mo31209E3();
        String t0 = C4023j0.m15760t0(context, E3, (TriggerContextInfo) null, macro);
        PhoneNumberUtil.MatchType E = PhoneNumberUtil.m78800q().mo64342E(t0, str);
        if (E == PhoneNumberUtil.MatchType.EXACT_MATCH || E == PhoneNumberUtil.MatchType.NSN_MATCH || E == PhoneNumberUtil.MatchType.SHORT_NSN_MATCH) {
            C4878b.m18879r("INCOMING SMS number (" + str + ") matches trigger number (" + E3 + ")");
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (C6460y1.m24792d(str.toLowerCase(), C6460y1.m24791c(t0.toLowerCase(), false), false)) {
                C4878b.m18879r("INCOMING SMS number (" + str + ") matches trigger number pattern (" + t0 + ")");
                z = true;
            }
        }
        if (!z) {
            C4878b.m18879r("INCOMING SMS number (" + str + ") DOES NOT MATCH NUMBER (" + E3 + ") or Pattern (" + t0 + ")");
        }
        if (z != incomingSMSTrigger.mo31207C3() && m24237b(context, incomingSMSTrigger, str2, incomingSMSTrigger.mo31211I3()) && incomingSMSTrigger.mo31374R2()) {
            macro.setTriggerThatInvoked(incomingSMSTrigger);
            macro.setTriggerContextInfo(new TriggerContextInfo((Trigger) incomingSMSTrigger, incomingSMS));
            if (macro.canInvoke(macro.getTriggerContextInfo())) {
                list.add(macro);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m24241f(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Macro macro = (Macro) it.next();
            macro.invokeActions(macro.getTriggerContextInfo());
        }
    }
}
