package com.arlosoft.macrodroid.common;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.provider.CalendarContract;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import java.util.TimeZone;
import p112j2.C7439d0;
import p319lc.C15626c;

/* renamed from: com.arlosoft.macrodroid.common.m */
/* compiled from: CalendarHelper */
public class C4037m {
    /* renamed from: a */
    public static void m15935a(Context context, String str, String str2, String str3, long j, long j2, boolean z, int i) {
        long j3;
        Context context2 = context;
        long j4 = j;
        TimeZone timeZone = TimeZone.getDefault();
        ContentValues contentValues = new ContentValues();
        if (z) {
            long offset = j4 + ((long) timeZone.getOffset(j4));
            j4 = offset - (offset % 86400000);
            j3 = 86400000 + j4;
            contentValues.put("allDay", 1);
        } else {
            j3 = j4 + j2;
        }
        if (str != null) {
            try {
                contentValues.put("calendar_id", Integer.valueOf(str));
            } catch (Exception unused) {
            }
        } else {
            contentValues.put("calendar_id", 1);
        }
        contentValues.put("dtstart", Long.valueOf(j4));
        contentValues.put("dtend", Long.valueOf(j3));
        String str4 = str2;
        contentValues.put("title", str2);
        String str5 = str3;
        contentValues.put("description", str3);
        contentValues.put("eventTimezone", timeZone.getID());
        contentValues.put("availability", Integer.valueOf(i));
        try {
            if (ContextCompat.checkSelfPermission(context, "android.permission.WRITE_CALENDAR") != 0) {
                C7439d0.m30909o0(context, "android.permission.WRITE_CALENDAR", context.getString(C17541R$string.action_add_calendar_event), true, false);
            } else {
                context.getApplicationContext().getContentResolver().insert(CalendarContract.Events.CONTENT_URI, contentValues);
            }
        } catch (IllegalArgumentException unused2) {
            C4878b.m18868g("Could not resolve the calendar on this device");
            C15626c.makeText(context.getApplicationContext(), C17541R$string.error, 0).show();
        } catch (SQLiteException e) {
            C4878b.m18868g("Could not write to the calendar: " + e.toString());
            C15626c.makeText(context.getApplicationContext(), C17541R$string.error, 0).show();
        }
    }
}
