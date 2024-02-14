package p092g1;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.util.Pair;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: g1.b */
/* compiled from: CalendarInfo */
public class C7327b implements Comparable<C7327b> {

    /* renamed from: a */
    public String f17928a;

    /* renamed from: c */
    public String f17929c;

    /* renamed from: d */
    public String f17930d;

    public C7327b(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        this.f17928a = str;
        this.f17929c = str2;
        this.f17930d = str3;
    }

    /* renamed from: d */
    public static Pair<String, List<C7327b>> m30262d(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String str = null;
        try {
            Cursor query = contentResolver.query(Uri.parse("content://com.android.calendar/calendars"), new String[]{Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID, "calendar_displayName", "account_name", "visible"}, (String) null, (String[]) null, (String) null);
            ArrayList arrayList = new ArrayList();
            if (query != null) {
                while (query.moveToNext()) {
                    String string = query.getString(0);
                    C7327b bVar = new C7327b(string, query.getString(1), query.getString(2));
                    if (!arrayList.contains(bVar)) {
                        arrayList.add(bVar);
                        if (str == null) {
                            str = string;
                        }
                    }
                }
                query.close();
            }
            Collections.sort(arrayList);
            return new Pair<>(str, arrayList);
        } catch (SecurityException unused) {
            C4878b.m18868g("Failed to get calendars - missing ");
            return new Pair<>(null, new ArrayList());
        }
    }

    /* renamed from: b */
    public int compareTo(@NonNull C7327b bVar) {
        String str = this.f17930d;
        if (str == null || str.equals(bVar.f17930d)) {
            return this.f17929c.compareTo(bVar.f17929c);
        }
        return this.f17930d.compareTo(bVar.f17930d);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7327b)) {
            return false;
        }
        C7327b bVar = (C7327b) obj;
        if (!this.f17929c.equals(bVar.f17929c) || !this.f17930d.equals(bVar.f17930d)) {
            return false;
        }
        return true;
    }
}
