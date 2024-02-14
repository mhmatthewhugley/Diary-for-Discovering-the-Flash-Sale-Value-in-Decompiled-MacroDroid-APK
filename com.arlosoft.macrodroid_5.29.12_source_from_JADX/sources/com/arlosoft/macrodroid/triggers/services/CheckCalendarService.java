package com.arlosoft.macrodroid.triggers.services;

import android.app.IntentService;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.arlosoft.macrodroid.common.C4034l;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.CalendarTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import org.apache.commons.cli.HelpFormatter;

public class CheckCalendarService extends IntentService {

    /* renamed from: com.arlosoft.macrodroid.triggers.services.CheckCalendarService$a */
    private class C6093a {

        /* renamed from: a */
        public Macro f14423a;

        /* renamed from: b */
        public TriggerContextInfo f14424b;

        public C6093a(Macro macro, TriggerContextInfo triggerContextInfo) {
            this.f14423a = macro;
            this.f14424b = triggerContextInfo;
        }
    }

    public CheckCalendarService() {
        super("CheckCalendarService");
    }

    @Nullable
    /* renamed from: b */
    private String m24091b(boolean z, long j, CalendarTrigger calendarTrigger, ContentResolver contentResolver, HashMap<String, List<C4034l>> hashMap) {
        long j2;
        int i;
        boolean z2 = z;
        HashMap<String, List<C4034l>> hashMap2 = hashMap;
        Uri.Builder buildUpon = Uri.parse("content://com.android.calendar/instances/when").buildUpon();
        if (calendarTrigger.mo30989u3()) {
            i = calendarTrigger.mo30993y3();
            j2 = j + ((long) (i * 1000));
        } else {
            i = 0;
            j2 = j;
        }
        if (z2) {
            j2 += (long) TimeZone.getDefault().getOffset(j2);
        }
        ContentUris.appendId(buildUpon, j2);
        ContentUris.appendId(buildUpon, j2);
        String s3 = calendarTrigger.mo30987s3();
        if (TextUtils.isEmpty(s3)) {
            C4878b.m18868g("Calendar Trigger - Calendar id is empty (ignoring)");
            return null;
        }
        String str = s3 + HelpFormatter.DEFAULT_OPT_PREFIX + i;
        List list = hashMap2.get(str);
        if (list == null) {
            list = new ArrayList();
        }
        Cursor query = contentResolver.query(buildUpon.build(), new String[]{"title", "description", "dtstart", "dtend", "allDay", "availability", "eventLocation", "event_id"}, "calendar_id=" + s3, (String[]) null, (String) null);
        if (query != null) {
            if (query.getCount() > 0) {
                query.moveToFirst();
                C4034l e = m24094e(query);
                if (e != null && e.mo27941k() == z2) {
                    list.add(e);
                }
                while (query.moveToNext()) {
                    C4034l e2 = m24094e(query);
                    if (e2 != null && e2.mo27941k() == z2) {
                        list.add(e2);
                        C4878b.m18879r("Found event in calendar: " + calendarTrigger.mo30988t3() + " (id=" + calendarTrigger.mo30987s3() + ") " + e2.mo27940j() + " - " + e2.mo27937g());
                    }
                }
            } else {
                C4878b.m18879r("No Events found currently in calendar: " + calendarTrigger.mo30988t3() + " (id=" + calendarTrigger.mo30987s3() + ")");
            }
            query.close();
        }
        hashMap2.put(str, list);
        return str;
    }

    /* renamed from: c */
    private TriggerContextInfo m24092c(Trigger trigger, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        return new TriggerContextInfo(trigger, str != null ? str : "", str2 != null ? str2 : "", str3 != null ? str3 : "", str4 != null ? str4 : "", str5 != null ? str5 : "", str6 != null ? str6 : "", str7 != null ? str7 : "", str8 != null ? str8 : "", str9 != null ? str9 : "");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m24093d(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6093a aVar = (C6093a) it.next();
            aVar.f14423a.invokeActions(aVar.f14424b);
        }
    }

    /* renamed from: e */
    private static C4034l m24094e(Cursor cursor) {
        return new C4034l(cursor.getString(0), cursor.getString(1), new Date(cursor.getLong(2)), new Date(cursor.getLong(3)), !cursor.getString(4).equals("0"), cursor.getInt(5), cursor.getString(6), cursor.getString(7));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x035a A[Catch:{ SecurityException -> 0x04c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0155 A[Catch:{ SecurityException -> 0x04c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0182 A[Catch:{ SecurityException -> 0x04c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0188 A[Catch:{ SecurityException -> 0x04c3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r35) {
        /*
            r34 = this;
            r11 = r34
            java.util.HashMap r12 = com.arlosoft.macrodroid.settings.C5163j2.m20255s0(r34)     // Catch:{ SecurityException -> 0x04c3 }
            android.content.Context r0 = r34.getApplicationContext()     // Catch:{ SecurityException -> 0x04c3 }
            android.content.ContentResolver r13 = r0.getContentResolver()     // Catch:{ SecurityException -> 0x04c3 }
            java.util.Date r0 = new java.util.Date     // Catch:{ SecurityException -> 0x04c3 }
            r0.<init>()     // Catch:{ SecurityException -> 0x04c3 }
            long r14 = r0.getTime()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r0 = "++ CHECKING CALENDAR ++"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r0)     // Catch:{ SecurityException -> 0x04c3 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ SecurityException -> 0x04c3 }
            r10.<init>()     // Catch:{ SecurityException -> 0x04c3 }
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ SecurityException -> 0x04c3 }
            r9.<init>()     // Catch:{ SecurityException -> 0x04c3 }
            com.arlosoft.macrodroid.macro.n r0 = com.arlosoft.macrodroid.macro.C4934n.m18998M()     // Catch:{ SecurityException -> 0x04c3 }
            java.util.List r0 = r0.mo29679I()     // Catch:{ SecurityException -> 0x04c3 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ SecurityException -> 0x04c3 }
        L_0x0032:
            boolean r0 = r16.hasNext()     // Catch:{ SecurityException -> 0x04c3 }
            if (r0 == 0) goto L_0x04a9
            java.lang.Object r0 = r16.next()     // Catch:{ SecurityException -> 0x04c3 }
            r8 = r0
            com.arlosoft.macrodroid.macro.Macro r8 = (com.arlosoft.macrodroid.macro.Macro) r8     // Catch:{ SecurityException -> 0x04c3 }
            java.util.ArrayList r0 = r8.getTriggerListWithAwaitingActions()     // Catch:{ SecurityException -> 0x04c3 }
            java.util.Iterator r17 = r0.iterator()     // Catch:{ SecurityException -> 0x04c3 }
        L_0x0047:
            boolean r0 = r17.hasNext()     // Catch:{ SecurityException -> 0x04c3 }
            if (r0 == 0) goto L_0x0499
            java.lang.Object r0 = r17.next()     // Catch:{ SecurityException -> 0x04c3 }
            r7 = r0
            com.arlosoft.macrodroid.triggers.Trigger r7 = (com.arlosoft.macrodroid.triggers.Trigger) r7     // Catch:{ SecurityException -> 0x04c3 }
            boolean r0 = r7 instanceof com.arlosoft.macrodroid.triggers.CalendarTrigger     // Catch:{ SecurityException -> 0x04c3 }
            if (r0 == 0) goto L_0x0487
            r18 = r7
            com.arlosoft.macrodroid.triggers.CalendarTrigger r18 = (com.arlosoft.macrodroid.triggers.CalendarTrigger) r18     // Catch:{ SecurityException -> 0x04c3 }
            r1 = 0
            r0 = r34
            r2 = r14
            r4 = r18
            r5 = r13
            r6 = r9
            java.lang.String r6 = r0.m24091b(r1, r2, r4, r5, r6)     // Catch:{ SecurityException -> 0x04c3 }
            r0 = r7
            com.arlosoft.macrodroid.triggers.CalendarTrigger r0 = (com.arlosoft.macrodroid.triggers.CalendarTrigger) r0     // Catch:{ SecurityException -> 0x04c3 }
            boolean r0 = r0.mo30992x3()     // Catch:{ SecurityException -> 0x04c3 }
            if (r0 != 0) goto L_0x0080
            r1 = 1
            r0 = r34
            r2 = r14
            r4 = r18
            r5 = r13
            r35 = r10
            r10 = r6
            r6 = r9
            r0.m24091b(r1, r2, r4, r5, r6)     // Catch:{ SecurityException -> 0x04c3 }
            goto L_0x0083
        L_0x0080:
            r35 = r10
            r10 = r6
        L_0x0083:
            if (r10 != 0) goto L_0x0088
            r10 = r35
            goto L_0x0047
        L_0x0088:
            java.lang.Object r0 = r9.get(r10)     // Catch:{ SecurityException -> 0x04c3 }
            r6 = r0
            java.util.List r6 = (java.util.List) r6     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r5 = r18.mo30994z3()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r4 = r18.mo30990v3()     // Catch:{ SecurityException -> 0x04c3 }
            boolean r0 = r18.mo30991w3()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.Object r1 = r12.get(r10)     // Catch:{ SecurityException -> 0x04c3 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ SecurityException -> 0x04c3 }
            if (r1 != 0) goto L_0x00a8
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ SecurityException -> 0x04c3 }
            r1.<init>()     // Catch:{ SecurityException -> 0x04c3 }
        L_0x00a8:
            r10 = r1
            java.util.Iterator r1 = r6.iterator()     // Catch:{ SecurityException -> 0x04c3 }
        L_0x00ad:
            boolean r2 = r1.hasNext()     // Catch:{ SecurityException -> 0x04c3 }
            if (r2 == 0) goto L_0x00d6
            java.lang.Object r2 = r1.next()     // Catch:{ SecurityException -> 0x04c3 }
            com.arlosoft.macrodroid.common.l r2 = (com.arlosoft.macrodroid.common.C4034l) r2     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x04c3 }
            r3.<init>()     // Catch:{ SecurityException -> 0x04c3 }
            r19 = r1
            java.lang.String r1 = "[ACTIVE] - Event with title: "
            r3.append(r1)     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r1 = r2.mo27940j()     // Catch:{ SecurityException -> 0x04c3 }
            r3.append(r1)     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r1 = r3.toString()     // Catch:{ SecurityException -> 0x04c3 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r1)     // Catch:{ SecurityException -> 0x04c3 }
            r1 = r19
            goto L_0x00ad
        L_0x00d6:
            java.lang.String r2 = "*"
            r1 = 1
            r20 = 0
            if (r0 == 0) goto L_0x02a7
            java.util.Iterator r21 = r6.iterator()     // Catch:{ SecurityException -> 0x04c3 }
        L_0x00e1:
            boolean r0 = r21.hasNext()     // Catch:{ SecurityException -> 0x04c3 }
            if (r0 == 0) goto L_0x029e
            java.lang.Object r0 = r21.next()     // Catch:{ SecurityException -> 0x04c3 }
            com.arlosoft.macrodroid.common.l r0 = (com.arlosoft.macrodroid.common.C4034l) r0     // Catch:{ SecurityException -> 0x04c3 }
            if (r0 != 0) goto L_0x00f0
            goto L_0x00e1
        L_0x00f0:
            boolean r6 = r0.mo27941k()     // Catch:{ SecurityException -> 0x04c3 }
            if (r6 == 0) goto L_0x00ff
            boolean r6 = r18.mo30992x3()     // Catch:{ SecurityException -> 0x04c3 }
            if (r6 == 0) goto L_0x00ff
        L_0x00fc:
            r1 = 0
            goto L_0x0186
        L_0x00ff:
            int r6 = r18.mo30986r3()     // Catch:{ SecurityException -> 0x04c3 }
            if (r6 <= 0) goto L_0x0111
            int r6 = r18.mo30986r3()     // Catch:{ SecurityException -> 0x04c3 }
            int r6 = r6 - r1
            int r1 = r0.mo27934e()     // Catch:{ SecurityException -> 0x04c3 }
            if (r6 == r1) goto L_0x0111
            goto L_0x00fc
        L_0x0111:
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ SecurityException -> 0x04c3 }
            if (r1 != 0) goto L_0x0148
            boolean r1 = r5.equals(r2)     // Catch:{ SecurityException -> 0x04c3 }
            if (r1 != 0) goto L_0x0148
            r1 = 0
            java.lang.String r6 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r11, r5, r1, r8)     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r1 = r6.toLowerCase()     // Catch:{ SecurityException -> 0x04c3 }
            boolean r6 = r18.mo30985A3()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r1 = com.arlosoft.macrodroid.utils.C6460y1.m24791c(r1, r6)     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r6 = r0.mo27940j()     // Catch:{ SecurityException -> 0x04c3 }
            if (r6 == 0) goto L_0x0146
            java.lang.String r6 = r0.mo27940j()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ SecurityException -> 0x04c3 }
            boolean r3 = r18.mo30985A3()     // Catch:{ SecurityException -> 0x04c3 }
            boolean r1 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r6, r1, r3)     // Catch:{ SecurityException -> 0x04c3 }
            if (r1 != 0) goto L_0x0148
        L_0x0146:
            r1 = 0
            goto L_0x0149
        L_0x0148:
            r1 = 1
        L_0x0149:
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch:{ SecurityException -> 0x04c3 }
            if (r3 != 0) goto L_0x0182
            boolean r3 = r4.equals(r2)     // Catch:{ SecurityException -> 0x04c3 }
            if (r3 != 0) goto L_0x0182
            r3 = 0
            java.lang.String r6 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r11, r4, r3, r8)     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ SecurityException -> 0x04c3 }
            boolean r3 = r18.mo30985A3()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r3 = com.arlosoft.macrodroid.utils.C6460y1.m24791c(r6, r3)     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r6 = r0.mo27937g()     // Catch:{ SecurityException -> 0x04c3 }
            if (r6 == 0) goto L_0x00fc
            java.lang.String r6 = r0.mo27937g()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ SecurityException -> 0x04c3 }
            r24 = r1
            boolean r1 = r18.mo30985A3()     // Catch:{ SecurityException -> 0x04c3 }
            boolean r1 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r6, r3, r1)     // Catch:{ SecurityException -> 0x04c3 }
            if (r1 != 0) goto L_0x0184
            goto L_0x00fc
        L_0x0182:
            r24 = r1
        L_0x0184:
            r1 = r24
        L_0x0186:
            if (r1 == 0) goto L_0x0277
            boolean r1 = r10.contains(r0)     // Catch:{ SecurityException -> 0x04c3 }
            if (r1 != 0) goto L_0x0246
            boolean r1 = r7.mo31374R2()     // Catch:{ SecurityException -> 0x04c3 }
            if (r1 == 0) goto L_0x0277
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x04c3 }
            r1.<init>()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r3 = "[START TRIGGER] Event with title: "
            r1.append(r3)     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r3 = r0.mo27940j()     // Catch:{ SecurityException -> 0x04c3 }
            r1.append(r3)     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r3 = " HAS STARTED"
            r1.append(r3)     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r1 = r1.toString()     // Catch:{ SecurityException -> 0x04c3 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r1)     // Catch:{ SecurityException -> 0x04c3 }
            r8.setTriggerThatInvoked(r7)     // Catch:{ SecurityException -> 0x04c3 }
            r3 = 3
            java.text.DateFormat r1 = java.text.DateFormat.getTimeInstance(r3)     // Catch:{ SecurityException -> 0x04c3 }
            java.text.DateFormat r6 = java.text.DateFormat.getDateInstance(r3)     // Catch:{ SecurityException -> 0x04c3 }
            r23 = r2
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ SecurityException -> 0x04c3 }
            java.text.DateFormat r2 = java.text.DateFormat.getDateInstance(r3, r2)     // Catch:{ SecurityException -> 0x04c3 }
            java.util.Date r3 = r0.mo27936f()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r25 = r1.format(r3)     // Catch:{ SecurityException -> 0x04c3 }
            java.util.Date r3 = r0.mo27939i()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r26 = r1.format(r3)     // Catch:{ SecurityException -> 0x04c3 }
            java.util.Date r1 = r0.mo27936f()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r27 = r6.format(r1)     // Catch:{ SecurityException -> 0x04c3 }
            java.util.Date r1 = r0.mo27936f()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r28 = r2.format(r1)     // Catch:{ SecurityException -> 0x04c3 }
            java.util.Date r1 = r0.mo27939i()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r29 = r6.format(r1)     // Catch:{ SecurityException -> 0x04c3 }
            java.util.Date r1 = r0.mo27939i()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r30 = r2.format(r1)     // Catch:{ SecurityException -> 0x04c3 }
            com.arlosoft.macrodroid.triggers.Trigger r1 = r8.getTriggerThatInvoked()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r2 = r0.mo27940j()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r3 = r0.mo27937g()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r6 = r0.getLocation()     // Catch:{ SecurityException -> 0x04c3 }
            r0 = r34
            r31 = r12
            r12 = 1
            r32 = r23
            r23 = 3
            r19 = r4
            r4 = r6
            r6 = r5
            r5 = r27
            r22 = r6
            r6 = r28
            r24 = r7
            r7 = r25
            r25 = r8
            r8 = r29
            r33 = r9
            r9 = r30
            r12 = r35
            r28 = r10
            r10 = r26
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r0 = r0.m24092c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SecurityException -> 0x04c3 }
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r1 = r25.getTriggerContextInfo()     // Catch:{ SecurityException -> 0x04c3 }
            r10 = r25
            boolean r1 = r10.canInvoke(r1)     // Catch:{ SecurityException -> 0x04c3 }
            if (r1 == 0) goto L_0x028a
            com.arlosoft.macrodroid.triggers.services.CheckCalendarService$a r1 = new com.arlosoft.macrodroid.triggers.services.CheckCalendarService$a     // Catch:{ SecurityException -> 0x04c3 }
            r1.<init>(r10, r0)     // Catch:{ SecurityException -> 0x04c3 }
            r12.add(r1)     // Catch:{ SecurityException -> 0x04c3 }
            r35 = r13
            goto L_0x04a0
        L_0x0246:
            r32 = r2
            r19 = r4
            r22 = r5
            r24 = r7
            r33 = r9
            r28 = r10
            r31 = r12
            r23 = 3
            r12 = r35
            r10 = r8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x04c3 }
            r1.<init>()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r2 = "[NO START]: "
            r1.append(r2)     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r0 = r0.mo27940j()     // Catch:{ SecurityException -> 0x04c3 }
            r1.append(r0)     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r0 = " (CONTAINED IN OLD EVENT LIST)"
            r1.append(r0)     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r0 = r1.toString()     // Catch:{ SecurityException -> 0x04c3 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r0)     // Catch:{ SecurityException -> 0x04c3 }
            goto L_0x028a
        L_0x0277:
            r32 = r2
            r19 = r4
            r22 = r5
            r24 = r7
            r33 = r9
            r28 = r10
            r31 = r12
            r23 = 3
            r12 = r35
            r10 = r8
        L_0x028a:
            r8 = r10
            r35 = r12
            r4 = r19
            r5 = r22
            r7 = r24
            r10 = r28
            r12 = r31
            r2 = r32
            r9 = r33
            r1 = 1
            goto L_0x00e1
        L_0x029e:
            r33 = r9
            r31 = r12
            r12 = r35
            r2 = r8
            goto L_0x0484
        L_0x02a7:
            r32 = r2
            r19 = r4
            r22 = r5
            r24 = r7
            r33 = r9
            r28 = r10
            r31 = r12
            r23 = 3
            r12 = r35
            r10 = r8
            java.util.Iterator r21 = r28.iterator()     // Catch:{ SecurityException -> 0x04c3 }
        L_0x02be:
            boolean r0 = r21.hasNext()     // Catch:{ SecurityException -> 0x04c3 }
            if (r0 == 0) goto L_0x0483
            java.lang.Object r0 = r21.next()     // Catch:{ SecurityException -> 0x04c3 }
            com.arlosoft.macrodroid.common.l r0 = (com.arlosoft.macrodroid.common.C4034l) r0     // Catch:{ SecurityException -> 0x04c3 }
            if (r0 != 0) goto L_0x02cd
            goto L_0x02be
        L_0x02cd:
            boolean r1 = r0.mo27941k()     // Catch:{ SecurityException -> 0x04c3 }
            if (r1 == 0) goto L_0x02e3
            boolean r1 = r18.mo30992x3()     // Catch:{ SecurityException -> 0x04c3 }
            if (r1 == 0) goto L_0x02e3
            r4 = r19
            r8 = r22
            r7 = r32
            r1 = 0
            r9 = 1
            goto L_0x036d
        L_0x02e3:
            int r1 = r18.mo30986r3()     // Catch:{ SecurityException -> 0x04c3 }
            r9 = 1
            if (r1 != r9) goto L_0x02f9
            int r1 = r0.mo27934e()     // Catch:{ SecurityException -> 0x04c3 }
            if (r1 == 0) goto L_0x02f9
            r4 = r19
            r8 = r22
            r7 = r32
        L_0x02f6:
            r1 = 0
            goto L_0x036d
        L_0x02f9:
            boolean r1 = android.text.TextUtils.isEmpty(r22)     // Catch:{ SecurityException -> 0x04c3 }
            r8 = r22
            r7 = r32
            if (r1 != 0) goto L_0x0334
            boolean r1 = r8.equals(r7)     // Catch:{ SecurityException -> 0x04c3 }
            if (r1 != 0) goto L_0x0334
            r5 = 0
            java.lang.String r1 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r11, r8, r5, r10)     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ SecurityException -> 0x04c3 }
            boolean r2 = r18.mo30985A3()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r1 = com.arlosoft.macrodroid.utils.C6460y1.m24791c(r1, r2)     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r2 = r0.mo27940j()     // Catch:{ SecurityException -> 0x04c3 }
            if (r2 == 0) goto L_0x0332
            java.lang.String r2 = r0.mo27940j()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r2 = r2.toLowerCase()     // Catch:{ SecurityException -> 0x04c3 }
            boolean r3 = r18.mo30985A3()     // Catch:{ SecurityException -> 0x04c3 }
            boolean r1 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r2, r1, r3)     // Catch:{ SecurityException -> 0x04c3 }
            if (r1 != 0) goto L_0x0335
        L_0x0332:
            r1 = 0
            goto L_0x0336
        L_0x0334:
            r5 = 0
        L_0x0335:
            r1 = 1
        L_0x0336:
            boolean r2 = android.text.TextUtils.isEmpty(r19)     // Catch:{ SecurityException -> 0x04c3 }
            r4 = r19
            if (r2 != 0) goto L_0x036d
            boolean r2 = r4.equals(r7)     // Catch:{ SecurityException -> 0x04c3 }
            if (r2 != 0) goto L_0x036d
            java.lang.String r2 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r11, r4, r5, r10)     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r2 = r2.toLowerCase()     // Catch:{ SecurityException -> 0x04c3 }
            boolean r3 = r18.mo30985A3()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r2 = com.arlosoft.macrodroid.utils.C6460y1.m24791c(r2, r3)     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r3 = r0.mo27937g()     // Catch:{ SecurityException -> 0x04c3 }
            if (r3 == 0) goto L_0x02f6
            java.lang.String r3 = r0.mo27937g()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ SecurityException -> 0x04c3 }
            boolean r5 = r18.mo30985A3()     // Catch:{ SecurityException -> 0x04c3 }
            boolean r2 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r3, r2, r5)     // Catch:{ SecurityException -> 0x04c3 }
            if (r2 != 0) goto L_0x036d
            goto L_0x02f6
        L_0x036d:
            if (r1 == 0) goto L_0x0461
            java.util.Date r1 = r0.mo27936f()     // Catch:{ SecurityException -> 0x04c3 }
            if (r1 == 0) goto L_0x0432
            java.util.Date r1 = r0.mo27939i()     // Catch:{ SecurityException -> 0x04c3 }
            if (r1 == 0) goto L_0x0432
            boolean r1 = r6.contains(r0)     // Catch:{ SecurityException -> 0x04c3 }
            if (r1 != 0) goto L_0x0432
            boolean r1 = r24.mo31374R2()     // Catch:{ SecurityException -> 0x04c3 }
            if (r1 == 0) goto L_0x0461
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x04c3 }
            r1.<init>()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r2 = "[END TRIGGER] Event with title: "
            r1.append(r2)     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r2 = r0.mo27940j()     // Catch:{ SecurityException -> 0x04c3 }
            r1.append(r2)     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r2 = " HAS ENDED"
            r1.append(r2)     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r1 = r1.toString()     // Catch:{ SecurityException -> 0x04c3 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r1)     // Catch:{ SecurityException -> 0x04c3 }
            r5 = r24
            r10.setTriggerThatInvoked(r5)     // Catch:{ SecurityException -> 0x04c3 }
            java.text.DateFormat r1 = java.text.DateFormat.getTimeInstance(r23)     // Catch:{ SecurityException -> 0x04c3 }
            java.text.DateFormat r2 = java.text.DateFormat.getDateInstance(r23)     // Catch:{ SecurityException -> 0x04c3 }
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ SecurityException -> 0x04c3 }
            r35 = r13
            r13 = 3
            java.text.DateFormat r3 = java.text.DateFormat.getDateInstance(r13, r3)     // Catch:{ SecurityException -> 0x04c3 }
            java.util.Date r9 = r0.mo27936f()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r9 = r1.format(r9)     // Catch:{ SecurityException -> 0x04c3 }
            java.util.Date r13 = r0.mo27939i()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r13 = r1.format(r13)     // Catch:{ SecurityException -> 0x04c3 }
            java.util.Date r1 = r0.mo27936f()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r19 = r2.format(r1)     // Catch:{ SecurityException -> 0x04c3 }
            java.util.Date r1 = r0.mo27936f()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r24 = r3.format(r1)     // Catch:{ SecurityException -> 0x04c3 }
            java.util.Date r1 = r0.mo27939i()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r25 = r2.format(r1)     // Catch:{ SecurityException -> 0x04c3 }
            java.util.Date r1 = r0.mo27939i()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r26 = r3.format(r1)     // Catch:{ SecurityException -> 0x04c3 }
            com.arlosoft.macrodroid.triggers.Trigger r1 = r10.getTriggerThatInvoked()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r2 = r0.mo27940j()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r3 = r0.mo27937g()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r27 = r0.getLocation()     // Catch:{ SecurityException -> 0x04c3 }
            r0 = r34
            r28 = r4
            r4 = r27
            r27 = r5
            r29 = 0
            r5 = r19
            r19 = r6
            r6 = r24
            r24 = r7
            r7 = r9
            r30 = r8
            r8 = r25
            r22 = 1
            r9 = r26
            r25 = r10
            r10 = r13
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r0 = r0.m24092c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SecurityException -> 0x04c3 }
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r1 = r25.getTriggerContextInfo()     // Catch:{ SecurityException -> 0x04c3 }
            r2 = r25
            boolean r1 = r2.canInvoke(r1)     // Catch:{ SecurityException -> 0x04c3 }
            if (r1 == 0) goto L_0x0472
            com.arlosoft.macrodroid.triggers.services.CheckCalendarService$a r1 = new com.arlosoft.macrodroid.triggers.services.CheckCalendarService$a     // Catch:{ SecurityException -> 0x04c3 }
            r1.<init>(r2, r0)     // Catch:{ SecurityException -> 0x04c3 }
            r12.add(r1)     // Catch:{ SecurityException -> 0x04c3 }
            goto L_0x04a0
        L_0x0432:
            r28 = r4
            r19 = r6
            r30 = r8
            r2 = r10
            r35 = r13
            r27 = r24
            r22 = 1
            r29 = 0
            r24 = r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x04c3 }
            r1.<init>()     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r3 = "[NO END]: "
            r1.append(r3)     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r0 = r0.mo27940j()     // Catch:{ SecurityException -> 0x04c3 }
            r1.append(r0)     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r0 = " (CONTAINED IN CURRENT EVENT LIST)"
            r1.append(r0)     // Catch:{ SecurityException -> 0x04c3 }
            java.lang.String r0 = r1.toString()     // Catch:{ SecurityException -> 0x04c3 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r0)     // Catch:{ SecurityException -> 0x04c3 }
            goto L_0x0472
        L_0x0461:
            r28 = r4
            r19 = r6
            r30 = r8
            r2 = r10
            r35 = r13
            r27 = r24
            r22 = 1
            r29 = 0
            r24 = r7
        L_0x0472:
            r13 = r35
            r10 = r2
            r6 = r19
            r32 = r24
            r24 = r27
            r19 = r28
            r22 = r30
            r23 = 3
            goto L_0x02be
        L_0x0483:
            r2 = r10
        L_0x0484:
            r35 = r13
            goto L_0x048f
        L_0x0487:
            r2 = r8
            r33 = r9
            r31 = r12
            r35 = r13
            r12 = r10
        L_0x048f:
            r13 = r35
            r8 = r2
            r10 = r12
            r12 = r31
            r9 = r33
            goto L_0x0047
        L_0x0499:
            r33 = r9
            r31 = r12
            r35 = r13
            r12 = r10
        L_0x04a0:
            r13 = r35
            r10 = r12
            r12 = r31
            r9 = r33
            goto L_0x0032
        L_0x04a9:
            r0 = r9
            r12 = r10
            com.arlosoft.macrodroid.settings.C5163j2.m20179i4(r11, r0)     // Catch:{ SecurityException -> 0x04c3 }
            android.os.Handler r0 = new android.os.Handler     // Catch:{ SecurityException -> 0x04c3 }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ SecurityException -> 0x04c3 }
            r0.<init>(r1)     // Catch:{ SecurityException -> 0x04c3 }
            com.arlosoft.macrodroid.triggers.services.b r1 = new com.arlosoft.macrodroid.triggers.services.b     // Catch:{ SecurityException -> 0x04c3 }
            r1.<init>(r12)     // Catch:{ SecurityException -> 0x04c3 }
            r0.post(r1)     // Catch:{ SecurityException -> 0x04c3 }
            com.arlosoft.macrodroid.triggers.CalendarTrigger.m21765J3(r34)     // Catch:{ SecurityException -> 0x04c3 }
            goto L_0x04c8
        L_0x04c3:
            java.lang.String r0 = "Calendar read failed - missing permission"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
        L_0x04c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.services.CheckCalendarService.onHandleIntent(android.content.Intent):void");
    }
}
