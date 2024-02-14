package com.arlosoft.macrodroid.common;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.util.Linkify;
import android.util.Log;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import androidx.documentfile.provider.DocumentFile;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.MacroDroidService;
import com.arlosoft.macrodroid.action.services.UIInteractionAccessibilityService;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.remoteconfig.C5070a;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.ModeEnterExitTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.services.FingerprintAccessibilityService;
import com.arlosoft.macrodroid.triggers.services.MacroDroidAccessibilityService;
import com.arlosoft.macrodroid.triggers.services.VolumeButtonAccessibilityService;
import com.arlosoft.macrodroid.upgrade.UpgradeActivity2;
import com.arlosoft.macrodroid.utils.C6368b1;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TimeZone;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import org.apache.commons.p353io.IOUtils;
import p135n1.C7966c;
import p148q0.C8151a;
import p150q2.C8164a;
import p277h9.C12408a;
import p319lc.C15626c;
import p376r7.C16351a;
import p376r7.C16355b;
import p385s7.C16505a;

/* renamed from: com.arlosoft.macrodroid.common.t1 */
/* compiled from: Util */
public class C4061t1 {

    /* renamed from: a */
    public static final Contact f10621a = new Contact("Select_Contact", "[" + MacroDroidApplication.m14845u().getString(C17541R$string.select_contact) + "]", "Select_Contact");

    /* renamed from: b */
    public static final String f10622b;

    /* renamed from: c */
    public static final String f10623c;

    /* renamed from: d */
    public static final String f10624d = ("[" + MacroDroidApplication.m14845u().getString(C17541R$string.any_contact) + "]");

    /* renamed from: e */
    public static final String f10625e = ("[" + MacroDroidApplication.m14845u().getString(C17541R$string.any_number) + "]");

    /* renamed from: f */
    public static final String f10626f = ("[" + MacroDroidApplication.m14845u().getString(C17541R$string.non_contact) + "]");

    /* renamed from: g */
    public static final String f10627g = ("[" + MacroDroidApplication.m14845u().getString(C17541R$string.unknown_caller) + "]");

    /* renamed from: h */
    public static final String[] f10628h = {"3gp", "mp4", "m4a", "aac", "flac", "mp3", "mid", "xmf", "mxmf", "rtttl", "rtx", "ota", "imy", "ogg", "wav"};

    /* renamed from: i */
    public static final String[] f10629i = {"jpg", "jpeg", "png", "raw", "bmp", "tif", "tiff", "gif"};

    /* renamed from: j */
    public static final String[] f10630j = {"3g2", "3gp", "asf", "asx", "avi", "divx", "flv", "mov", "mkv", "mp4", "mpg", "rm", "srt", "swf", "vob", "wmv"};

    /* renamed from: k */
    public static final String f10631k;

    /* renamed from: l */
    private static Ringtone f10632l;

    /* renamed from: m */
    private static int f10633m = 10000000;

    /* renamed from: com.arlosoft.macrodroid.common.t1$a */
    /* compiled from: Util */
    class C4062a extends Thread {

        /* renamed from: a */
        final /* synthetic */ String[] f10634a;

        C4062a(String[] strArr) {
            this.f10634a = strArr;
        }

        public void run() {
            C4061t1.m15947B0(this.f10634a);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.common.t1$b */
    /* compiled from: Util */
    class C4063b extends Thread {

        /* renamed from: a */
        final /* synthetic */ SharedPreferences f10635a;

        /* renamed from: c */
        final /* synthetic */ String f10636c;

        C4063b(SharedPreferences sharedPreferences, String str) {
            this.f10635a = sharedPreferences;
            this.f10636c = str;
        }

        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException unused) {
            }
            this.f10635a.edit().putString("timezone", this.f10636c).apply();
        }
    }

    static {
        MacroDroidApplication.C3787a aVar = MacroDroidApplication.f9883I;
        f10622b = aVar.mo27303b().getString(C17541R$string.bluetooth_any_device);
        f10623c = aVar.mo27303b().getString(C17541R$string.bluetooth_all_devices);
        f10631k = aVar.mo27303b().getString(C17541R$string.select_app);
    }

    /* renamed from: A */
    public static List<String> m15944A(Context context) {
        List<Macro> z = C4934n.m18998M().mo29710z();
        List<String> u = C5163j2.m20270u(context);
        boolean z2 = false;
        for (Macro category : z) {
            String category2 = category.getCategory();
            if (category2 != null && !u.contains(category2)) {
                u.add(category2);
                z2 = true;
            }
        }
        if (z2) {
            C5163j2.m20258s3(context, u);
        }
        Collections.sort(u, new C4021i1(C5163j2.m19963F0(context)));
        u.remove(context.getString(C17541R$string.uncategorized));
        u.add(0, context.getString(C17541R$string.uncategorized));
        return u;
    }

    /* renamed from: A0 */
    private static void m15945A0(String[] strArr) {
        C16355b bVar = null;
        try {
            C16351a aVar = new C16351a(0, strArr);
            bVar = C16505a.m98578s(true, C16355b.C16359d.NORMAL);
            bVar.mo79032w(aVar);
        } catch (Exception unused) {
            Log.w("Util", "Failed to run root command(s)");
            if (bVar == null) {
                return;
            }
        } catch (Throwable th) {
            if (bVar != null) {
                try {
                    bVar.mo79033y();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
        try {
            bVar.mo79033y();
        } catch (Exception unused3) {
        }
    }

    /* renamed from: B */
    public static List<C7966c> m15946B(Context context) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(ContactsContract.Groups.CONTENT_SUMMARY_URI, new String[]{Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID, "title", "summ_phones"}, "deleted!='1'", (String[]) null, (String) null);
            int columnIndex = cursor.getColumnIndex(Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID);
            int columnIndex2 = cursor.getColumnIndex("title");
            HashMap hashMap = new HashMap();
            while (cursor.moveToNext()) {
                C7966c cVar = new C7966c();
                cVar.f19106a = cursor.getString(columnIndex);
                cVar.f19107b = cursor.getString(columnIndex2);
                if (cursor.getInt(cursor.getColumnIndex("summ_phones")) > 0 && ((C7966c) hashMap.get(cVar.f19107b)) == null) {
                    hashMap.put(cVar.f19107b, cVar);
                    arrayList.add(cVar);
                }
            }
        } catch (IllegalArgumentException unused) {
            cursor = context.getContentResolver().query(ContactsContract.Groups.CONTENT_SUMMARY_URI, new String[]{Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID, "title"}, "deleted!='1'", (String[]) null, (String) null);
            int columnIndex3 = cursor.getColumnIndex(Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID);
            int columnIndex4 = cursor.getColumnIndex("title");
            HashMap hashMap2 = new HashMap();
            while (cursor.moveToNext()) {
                C7966c cVar2 = new C7966c();
                cVar2.f19106a = cursor.getString(columnIndex3);
                String string = cursor.getString(columnIndex4);
                cVar2.f19107b = string;
                if (((C7966c) hashMap2.get(string)) == null) {
                    hashMap2.put(cVar2.f19107b, cVar2);
                    arrayList.add(cVar2);
                }
            }
        } catch (Exception e) {
            String str = e instanceof SecurityException ? "Failed to get contact groups, need permission to access contacts" : "Failed to get contact groups, there is a problem with this device (Usually Huawei devices)";
            C4878b.m18868g(str + ": " + e.toString());
            new Handler(Looper.getMainLooper()).post(new C4055r1(context, str));
            if (cursor != null) {
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        cursor.close();
        return arrayList;
    }

    /* renamed from: B0 */
    public static void m15947B0(String[] strArr) {
        m15949C0(strArr, true);
    }

    /* renamed from: C */
    public static String m15948C(Context context, String str) {
        try {
            Cursor query = context.getContentResolver().query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), new String[]{"display_name"}, (String) null, (String[]) null, (String) null);
            if (query == null) {
                return null;
            }
            String string = query.moveToFirst() ? query.getString(query.getColumnIndex("display_name")) : null;
            if (!query.isClosed()) {
                query.close();
            }
            return string;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: C0 */
    public static void m15949C0(String[] strArr, boolean z) {
        C16355b bVar = null;
        try {
            if (C8164a.m33886a()) {
                C16351a aVar = new C16351a(0, strArr);
                bVar = C16505a.m98578s(true, C16355b.C16359d.SYSTEM_APP);
                bVar.mo79032w(aVar);
                bVar.mo79033y();
            } else if (z) {
                C4878b.m18871j(SelectableItem.m15535j1(C17541R$string.system_log_error_not_rooted), "https://www.xda-developers.com/root/");
            }
            if (bVar == null) {
                return;
            }
        } catch (Exception e) {
            C4878b.m18868g("Failed to run root command: " + e.toString());
            if (bVar == null) {
                return;
            }
        } catch (Throwable th) {
            if (bVar != null) {
                try {
                    bVar.mo79033y();
                } catch (Exception unused) {
                }
            }
            throw th;
        }
        try {
            bVar.mo79033y();
        } catch (Exception unused2) {
        }
    }

    /* renamed from: D */
    public static List<Contact> m15950D(Context context) {
        return m15952E(context, true);
    }

    /* renamed from: D0 */
    public static void m15951D0(String[] strArr) {
        new C4062a(strArr).start();
    }

    /* renamed from: E */
    public static List<Contact> m15952E(Context context, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (context == null) {
            C8151a.m33873n(new RuntimeException("Util getContacts had a null context"));
            return arrayList;
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            C8151a.m33873n(new RuntimeException("Util getContacts ContentResolver was null"));
            return arrayList;
        }
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, new String[]{Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID, "display_name", "lookup", "has_phone_number"}, (String) null, (String[]) null, (String) null);
        } catch (SecurityException unused) {
            C4878b.m18868g("Failed to get contacts - missing permission?");
        } catch (Exception unused2) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                C15626c.m94876a(context.getApplicationContext(), context.getString(C17541R$string.could_not_get_contacts), 0).show();
            } else {
                new Handler(context.getMainLooper()).post(new C4048p1(context));
            }
        }
        if (cursor != null) {
            if (cursor.getCount() > 0) {
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex(Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID));
                        String string2 = cursor.getString(cursor.getColumnIndex("display_name"));
                        String string3 = cursor.getString(cursor.getColumnIndex("lookup"));
                        if (!(string == null || string2 == null || Integer.parseInt(cursor.getString(cursor.getColumnIndex("has_phone_number"))) <= 0)) {
                            arrayList.add(new Contact(string, string2, string3));
                        }
                    } catch (Exception unused3) {
                    }
                }
            }
            cursor.close();
        }
        if (z) {
            Collections.sort(arrayList, C4030j1.f10577a);
        }
        return arrayList;
    }

    /* renamed from: E0 */
    public static String m15953E0(String str) {
        return str.replaceAll("[^0-9.+]", "");
    }

    /* renamed from: F */
    public static List<Contact> m15954F(Context context, List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (context == null) {
            C8151a.m33873n(new RuntimeException("Util getContactsWithIds had a null context"));
            return arrayList;
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            C8151a.m33873n(new RuntimeException("Util getContactsWithIds ContentResolver was null"));
            return arrayList;
        }
        Cursor cursor = null;
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String[] strArr = {Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID, "display_name", "lookup", "has_phone_number"};
        try {
            Uri uri = ContactsContract.Contacts.CONTENT_URI;
            cursor = contentResolver.query(uri, strArr, "_id IN " + sb.toString(), (String[]) null, (String) null);
        } catch (SecurityException unused) {
            C4878b.m18868g("Failed to get contacts - missing permission?");
        } catch (SQLiteException unused2) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                C15626c.m94876a(context.getApplicationContext(), context.getString(C17541R$string.could_not_get_contacts), 0).show();
            } else {
                new Handler(context.getMainLooper()).post(new C4042n1(context));
            }
        }
        if (cursor == null) {
            C8151a.m33873n(new RuntimeException("Util getContacts produced a null cursor"));
            return arrayList;
        }
        if (cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                try {
                    String string = cursor.getString(cursor.getColumnIndex(Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID));
                    String string2 = cursor.getString(cursor.getColumnIndex("display_name"));
                    String string3 = cursor.getString(cursor.getColumnIndex("lookup"));
                    if (!(string == null || string2 == null || Integer.parseInt(cursor.getString(cursor.getColumnIndex("has_phone_number"))) <= 0)) {
                        arrayList.add(new Contact(string, string2, string3));
                    }
                } catch (Exception unused3) {
                }
            }
        }
        cursor.close();
        return arrayList;
    }

    /* renamed from: F0 */
    public static void m15955F0(Context context, String str) {
        String W0 = C5163j2.m20083W0(context);
        if (W0.equals(str)) {
            C4878b.m18873l("MacroDroid mode (" + str + ") not changed - ignoring");
            return;
        }
        C4878b.m18873l("MacroDroid mode set to: " + str);
        C5163j2.m20010L4(context, str);
        MacroDroidService.m9502g(context, true);
        ArrayList arrayList = new ArrayList();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (it.hasNext()) {
                Trigger next2 = it.next();
                if (next2 instanceof ModeEnterExitTrigger) {
                    ModeEnterExitTrigger modeEnterExitTrigger = (ModeEnterExitTrigger) next2;
                    if (modeEnterExitTrigger.mo31335r3() || (modeEnterExitTrigger.mo31333o3() && modeEnterExitTrigger.mo31336w3(str))) {
                        if (next2.mo31374R2()) {
                            next.setTriggerThatInvoked(next2);
                            if (next.canInvoke(next.getTriggerContextInfo())) {
                                arrayList.add(next);
                            }
                        }
                    } else if ((modeEnterExitTrigger.mo31335r3() || (!modeEnterExitTrigger.mo31333o3() && modeEnterExitTrigger.mo31336w3(W0))) && next2.mo31374R2()) {
                        next.setTriggerThatInvoked(next2);
                        if (next.canInvoke(next.getTriggerContextInfo())) {
                            arrayList.add(next);
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Macro macro = (Macro) it2.next();
            macro.invokeActions(macro.getTriggerContextInfo());
        }
    }

    @Nullable
    /* renamed from: G */
    public static DocumentFile m15956G(DocumentFile documentFile) {
        try {
            String path = documentFile.getUri().getPath();
            return DocumentFile.fromFile(new File(path.substring(0, path.lastIndexOf("/"))));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: G0 */
    public static void m15957G0(Activity activity, C5070a aVar) {
        if (aVar.mo29986m()) {
            C12408a.C12409a.m83286b().mo68758c(-1).mo68757a();
            Toast q = C12408a.m83283q(activity, activity.getString(C17541R$string.macro_limit_reached), C17530R$drawable.ic_error_outline_white_24dp, ViewCompat.MEASURED_STATE_MASK, 1, true, true);
            q.setGravity(17, 0, 0);
            q.show();
            UpgradeActivity2.f14829L.mo32326a(activity);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, C17542R$style.Theme_App_Dialog);
        builder.setTitle((int) C17541R$string.macro_limit_reached);
        builder.setMessage((CharSequence) String.format(activity.getString(C17541R$string.you_currently_have_x_macros), new Object[]{Integer.valueOf(C5163j2.m20151f0(activity))})).setCancelable(false).setNegativeButton(17039360, (DialogInterface.OnClickListener) C4036l1.f10588a).setPositiveButton((int) C17541R$string.get_more_macros, (DialogInterface.OnClickListener) new C4015g1(activity));
        builder.show();
    }

    /* renamed from: H */
    public static Drawable m15958H(Context context, String str, int i) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getResourcesForApplication(packageManager.getApplicationInfo(str, 128)).getDrawable(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: H0 */
    public static void m15959H0(Context context, String str, int i) {
        new Handler(context.getApplicationContext().getMainLooper()).post(new C4058s1(context, str, i));
    }

    /* renamed from: I */
    public static Drawable m15960I(Context context, String str, String str2) {
        Drawable drawable;
        if (str2 == null) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (str == null || !str.equals(str2)) {
                String str3 = str != null ? str : "com.arlosoft.macrodroid";
                Resources resourcesForApplication = packageManager.getResourcesForApplication(packageManager.getApplicationInfo(str3, 128));
                drawable = resourcesForApplication.getDrawable(resourcesForApplication.getIdentifier(str2, "drawable", str3));
            } else {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
                drawable = packageManager.getResourcesForApplication(applicationInfo).getDrawable(applicationInfo.icon);
            }
            return drawable;
        } catch (Throwable th) {
            if (!TextUtils.equals(str, "UserIcon")) {
                return null;
            }
            C4878b.m18868g("Failed to get image from package (" + str + ") " + th.toString());
            return null;
        }
    }

    /* renamed from: I0 */
    public static String m15961I0(Throwable th) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append(stackTraceElement.toString());
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f A[Catch:{ Exception -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0012 A[SYNTHETIC] */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.arlosoft.macrodroid.common.C4013g> m15962J(android.content.Context r8, boolean r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            r2 = 0
            java.util.List r3 = r1.getInstalledApplications(r2)     // Catch:{ Exception -> 0x0080 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x0080 }
        L_0x0012:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x0080 }
            if (r4 == 0) goto L_0x005b
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x0080 }
            android.content.pm.ApplicationInfo r4 = (android.content.pm.ApplicationInfo) r4     // Catch:{ Exception -> 0x0080 }
            r5 = 1
            if (r9 == 0) goto L_0x002c
            java.lang.String r6 = r4.packageName     // Catch:{ Exception -> 0x0080 }
            android.content.Intent r6 = r1.getLaunchIntentForPackage(r6)     // Catch:{ Exception -> 0x0080 }
            if (r6 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r6 = 0
            goto L_0x002d
        L_0x002c:
            r6 = 1
        L_0x002d:
            if (r6 == 0) goto L_0x0012
            com.arlosoft.macrodroid.common.g r6 = new com.arlosoft.macrodroid.common.g     // Catch:{ Exception -> 0x0080 }
            r6.<init>()     // Catch:{ Exception -> 0x0080 }
            java.lang.CharSequence r7 = r4.loadLabel(r1)     // Catch:{ Exception -> 0x0080 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0080 }
            r6.f10396a = r7     // Catch:{ Exception -> 0x0080 }
            java.lang.String r4 = r4.packageName     // Catch:{ Exception -> 0x0080 }
            r6.f10397b = r4     // Catch:{ Exception -> 0x0080 }
            if (r9 != 0) goto L_0x0055
            android.content.pm.PackageManager r4 = r8.getPackageManager()     // Catch:{ Exception -> 0x0080 }
            java.lang.String r7 = r6.f10397b     // Catch:{ Exception -> 0x0080 }
            android.content.Intent r4 = r4.getLaunchIntentForPackage(r7)     // Catch:{ Exception -> 0x0080 }
            if (r4 == 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r5 = 0
        L_0x0052:
            r6.f10398c = r5     // Catch:{ Exception -> 0x0080 }
            goto L_0x0057
        L_0x0055:
            r6.f10398c = r5     // Catch:{ Exception -> 0x0080 }
        L_0x0057:
            r0.add(r6)     // Catch:{ Exception -> 0x0080 }
            goto L_0x0012
        L_0x005b:
            java.lang.String r9 = "android.hardware.camera"
            boolean r9 = r1.hasSystemFeature(r9)     // Catch:{ Exception -> 0x0080 }
            if (r9 == 0) goto L_0x0073
            com.arlosoft.macrodroid.common.g r9 = new com.arlosoft.macrodroid.common.g     // Catch:{ Exception -> 0x0080 }
            r9.<init>()     // Catch:{ Exception -> 0x0080 }
            java.lang.String r1 = "Camera"
            r9.f10396a = r1     // Catch:{ Exception -> 0x0080 }
            java.lang.String r1 = "com.android.camera"
            r9.f10397b = r1     // Catch:{ Exception -> 0x0080 }
            r0.add(r9)     // Catch:{ Exception -> 0x0080 }
        L_0x0073:
            java.util.Locale r9 = com.arlosoft.macrodroid.settings.C5163j2.m19963F0(r8)     // Catch:{ Exception -> 0x0080 }
            com.arlosoft.macrodroid.common.h1 r1 = new com.arlosoft.macrodroid.common.h1     // Catch:{ Exception -> 0x0080 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x0080 }
            java.util.Collections.sort(r0, r1)     // Catch:{ Exception -> 0x0080 }
            goto L_0x0095
        L_0x0080:
            r9 = move-exception
            p148q0.C8151a.m33873n(r9)
            android.os.Handler r9 = new android.os.Handler
            android.os.Looper r1 = r8.getMainLooper()
            r9.<init>(r1)
            com.arlosoft.macrodroid.common.q1 r1 = new com.arlosoft.macrodroid.common.q1
            r1.<init>(r8)
            r9.post(r1)
        L_0x0095:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.common.C4061t1.m15962J(android.content.Context, boolean):java.util.List");
    }

    /* renamed from: J0 */
    public static void m15963J0() {
        Ringtone ringtone = f10632l;
        if (ringtone != null) {
            ringtone.stop();
            f10632l = null;
        }
    }

    /* renamed from: K */
    public static Uri m15964K(Context context) {
        long currentTimeMillis = System.currentTimeMillis() + 60000;
        Cursor query = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID, "datetaken", "_data"}, (String) null, (String[]) null, "datetaken DESC");
        Uri uri = null;
        if (query == null) {
            m16023v(context, "Share photo failed", "Could not access photos", false);
            return null;
        }
        if (query.moveToFirst()) {
            while (!query.isAfterLast() && uri == null) {
                query.getString(2);
                int i = query.getInt(0);
                System.currentTimeMillis();
                if (query.getLong(1) < currentTimeMillis) {
                    Uri uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    uri = Uri.withAppendedPath(uri2, "" + i);
                }
            }
        }
        query.close();
        return uri;
    }

    /* renamed from: K0 */
    public static boolean m15965K0(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String string = defaultSharedPreferences.getString("timezone", (String) null);
        String str = TimeZone.getDefault().getID() + "," + TimeZone.getDefault().inDaylightTime(new Date());
        if (string != null && string.equals(str)) {
            return false;
        }
        new C4063b(defaultSharedPreferences, str).start();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m15966L(android.content.Context r11) {
        /*
            android.content.ContentResolver r0 = r11.getContentResolver()
            java.lang.String r1 = "_id"
            java.lang.String r2 = "datetaken"
            java.lang.String r3 = "_data"
            java.lang.String[] r2 = new java.lang.String[]{r1, r2, r3}
            r6 = 0
            android.net.Uri r1 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x0063 }
            java.lang.String r3 = "datetaken<=?"
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ all -> 0x0063 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0063 }
            r9 = 60000(0xea60, double:2.9644E-319)
            long r7 = r7 + r9
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0063 }
            r8 = 0
            r5[r8] = r7     // Catch:{ all -> 0x0063 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            r7.<init>()     // Catch:{ all -> 0x0063 }
            r4 = r2[r4]     // Catch:{ all -> 0x0063 }
            r7.append(r4)     // Catch:{ all -> 0x0063 }
            java.lang.String r4 = " DESC"
            r7.append(r4)     // Catch:{ all -> 0x0063 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0063 }
            r4 = r5
            r5 = r7
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0063 }
            if (r0 != 0) goto L_0x004d
            java.lang.String r1 = "Share photo failed"
            java.lang.String r2 = "Could not access photos"
            m16023v(r11, r1, r2, r8)     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x004c
            r0.close()
        L_0x004c:
            return r6
        L_0x004d:
            boolean r11 = r0.moveToFirst()     // Catch:{ all -> 0x0060 }
            if (r11 == 0) goto L_0x005c
            r11 = 2
            java.lang.String r11 = r0.getString(r11)     // Catch:{ all -> 0x0060 }
            r0.close()
            return r11
        L_0x005c:
            r0.close()
            return r6
        L_0x0060:
            r11 = move-exception
            r6 = r0
            goto L_0x0064
        L_0x0063:
            r11 = move-exception
        L_0x0064:
            if (r6 == 0) goto L_0x0069
            r6.close()
        L_0x0069:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.common.C4061t1.m15966L(android.content.Context):java.lang.String");
    }

    /* renamed from: M */
    public static String m15967M() {
        try {
            ArrayList<T> list = Collections.list(NetworkInterface.getNetworkInterfaces());
            if (list.size() > 0) {
                for (T inetAddresses : list) {
                    ArrayList<T> list2 = Collections.list(inetAddresses.getInetAddresses());
                    if (list2.size() > 0) {
                        for (T t : list2) {
                            String hostAddress = t.getHostAddress();
                            if (!t.isLoopbackAddress() && (t instanceof Inet4Address)) {
                                return hostAddress;
                            }
                        }
                        continue;
                    }
                }
            }
        } catch (SocketException unused) {
        }
        return Build.VERSION.SDK_INT >= 23 ? m15968N(MacroDroidApplication.m14845u()) : "?";
    }

    @RequiresApi(api = 23)
    /* renamed from: N */
    public static String m15968N(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            for (LinkAddress address : connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork()).getLinkAddresses()) {
                InetAddress address2 = address.getAddress();
                String hostAddress = address2.getHostAddress();
                if (!address2.isLoopbackAddress() && (address2 instanceof Inet4Address)) {
                    return hostAddress;
                }
            }
            return "?";
        } catch (Exception unused) {
            return "?";
        }
    }

    /* renamed from: O */
    public static String m15969O() {
        try {
            ArrayList<T> list = Collections.list(NetworkInterface.getNetworkInterfaces());
            if (list.size() > 0) {
                for (T inetAddresses : list) {
                    ArrayList<T> list2 = Collections.list(inetAddresses.getInetAddresses());
                    if (list2.size() > 0) {
                        for (T t : list2) {
                            String hostAddress = t.getHostAddress();
                            if (!t.isLoopbackAddress() && (t instanceof Inet6Address)) {
                                int indexOf = hostAddress.indexOf(TaskerPlugin.VARIABLE_PREFIX);
                                return indexOf > 0 ? hostAddress.substring(0, indexOf) : hostAddress;
                            }
                        }
                        continue;
                    }
                }
            }
        } catch (SocketException unused) {
        }
        return Build.VERSION.SDK_INT >= 23 ? m15970P(MacroDroidApplication.m14845u()) : "?";
    }

    @RequiresApi(api = 23)
    /* renamed from: P */
    public static String m15970P(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            for (LinkAddress address : connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork()).getLinkAddresses()) {
                InetAddress address2 = address.getAddress();
                String hostAddress = address2.getHostAddress();
                if (!address2.isLoopbackAddress() && (address2 instanceof Inet6Address)) {
                    return hostAddress;
                }
            }
            return "?";
        } catch (Exception unused) {
            return "?";
        }
    }

    /* renamed from: Q */
    public static List<String> m15971Q(String str) {
        ArrayList arrayList = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreTokens()) {
            arrayList.add(stringTokenizer.nextToken());
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: R */
    public static String m15972R(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:25|26|27|28|29) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:(3:20|21|(2:23|(5:25|26|27|28|29)(1:(3:31|32|(1:34)))))|35|36|37|38|46) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:39|40|41|42|43|44) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00ec */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0102 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0105 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x010d */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> m15973S(android.content.Context r10, com.arlosoft.macrodroid.common.Contact r11) {
        /*
            java.lang.String r0 = "data1"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r11 != 0) goto L_0x0014
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.String r11 = "Get number for contact, contact is null"
            r10.<init>(r11)
            p148q0.C8151a.m33873n(r10)
            return r1
        L_0x0014:
            android.content.ContentResolver r8 = r10.getContentResolver()
            java.lang.String r2 = r11.mo27712f()
            r9 = 0
            if (r2 == 0) goto L_0x0092
            java.lang.String r2 = r11.mo27709b()     // Catch:{ SecurityException -> 0x0083, Exception -> 0x003a }
            long r2 = java.lang.Long.parseLong(r2)     // Catch:{ SecurityException -> 0x0083, Exception -> 0x003a }
            java.lang.String r4 = r11.mo27712f()     // Catch:{ SecurityException -> 0x0083, Exception -> 0x003a }
            android.net.Uri r3 = android.provider.ContactsContract.Contacts.getLookupUri(r2, r4)     // Catch:{ SecurityException -> 0x0083, Exception -> 0x003a }
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ SecurityException -> 0x0083, Exception -> 0x003a }
            goto L_0x00b6
        L_0x003a:
            r10 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed to obtain contact number for user: "
            r0.append(r2)
            java.lang.String r2 = r11.mo27713g()
            r0.append(r2)
            java.lang.String r2 = "("
            r0.append(r2)
            java.lang.String r11 = r11.mo27709b()
            r0.append(r11)
            java.lang.String r11 = ")"
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r11)
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed to convert contact id to long: "
            r0.append(r2)
            java.lang.String r10 = r10.getMessage()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            p148q0.C8151a.m33873n(r11)
            throw r9     // Catch:{ Exception -> 0x0082 }
        L_0x0082:
            return r1
        L_0x0083:
            r11 = 2131955446(0x7f130ef6, float:1.954742E38)
            java.lang.String r11 = r10.getString(r11)
            r0 = 1
            r2 = 0
            java.lang.String r3 = "android.permission.READ_CONTACTS"
            p112j2.C7439d0.m30909o0(r10, r3, r11, r0, r2)
            return r1
        L_0x0092:
            android.net.Uri r3 = android.provider.ContactsContract.Contacts.CONTENT_URI
            r4 = 0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "_ID = '"
            r10.append(r2)
            java.lang.String r11 = r11.mo27709b()
            r10.append(r11)
            java.lang.String r11 = "'"
            r10.append(r11)
            java.lang.String r5 = r10.toString()
            r6 = 0
            r7 = 0
            r2 = r8
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)
        L_0x00b6:
            if (r10 != 0) goto L_0x00b9
            return r1
        L_0x00b9:
            boolean r11 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x0102, all -> 0x0109 }
            if (r11 == 0) goto L_0x0102
            java.lang.String r11 = "_id"
            int r11 = r10.getColumnIndex(r11)     // Catch:{ SQLiteException -> 0x0102, all -> 0x0109 }
            java.lang.String r11 = r10.getString(r11)     // Catch:{ SQLiteException -> 0x0102, all -> 0x0109 }
            android.net.Uri r3 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI     // Catch:{ SQLiteException -> 0x0102, all -> 0x0109 }
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch:{ SQLiteException -> 0x0102, all -> 0x0109 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0102, all -> 0x0109 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x0102, all -> 0x0109 }
            java.lang.String r5 = "contact_id = "
            r2.append(r5)     // Catch:{ SQLiteException -> 0x0102, all -> 0x0109 }
            r2.append(r11)     // Catch:{ SQLiteException -> 0x0102, all -> 0x0109 }
            java.lang.String r5 = r2.toString()     // Catch:{ SQLiteException -> 0x0102, all -> 0x0109 }
            r6 = 0
            r7 = 0
            r2 = r8
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x0102, all -> 0x0109 }
            if (r9 != 0) goto L_0x00f0
            r10.close()     // Catch:{ Exception -> 0x00ec }
        L_0x00ec:
            r9.close()     // Catch:{ Exception -> 0x00ef }
        L_0x00ef:
            return r1
        L_0x00f0:
            boolean r11 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x0102, all -> 0x0109 }
            if (r11 == 0) goto L_0x0102
            int r11 = r9.getColumnIndex(r0)     // Catch:{ SQLiteException -> 0x0102, all -> 0x0109 }
            java.lang.String r11 = r9.getString(r11)     // Catch:{ SQLiteException -> 0x0102, all -> 0x0109 }
            r1.add(r11)     // Catch:{ SQLiteException -> 0x0102, all -> 0x0109 }
            goto L_0x00f0
        L_0x0102:
            r10.close()     // Catch:{ Exception -> 0x0105 }
        L_0x0105:
            r9.close()     // Catch:{ Exception -> 0x0111 }
            goto L_0x0111
        L_0x0109:
            r11 = move-exception
            r10.close()     // Catch:{ Exception -> 0x010d }
        L_0x010d:
            r9.close()     // Catch:{ Exception -> 0x0110 }
        L_0x0110:
            throw r11
        L_0x0111:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.common.C4061t1.m15973S(android.content.Context, com.arlosoft.macrodroid.common.Contact):java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0041 */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> m15974T(android.content.Context r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "data1"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.content.ContentResolver r2 = r8.getContentResolver()
            r8 = 0
            android.net.Uri r3 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI     // Catch:{ SQLiteException -> 0x0041, all -> 0x0045 }
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch:{ SQLiteException -> 0x0041, all -> 0x0045 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0041, all -> 0x0045 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x0041, all -> 0x0045 }
            java.lang.String r6 = "contact_id = "
            r5.append(r6)     // Catch:{ SQLiteException -> 0x0041, all -> 0x0045 }
            r5.append(r9)     // Catch:{ SQLiteException -> 0x0041, all -> 0x0045 }
            java.lang.String r5 = r5.toString()     // Catch:{ SQLiteException -> 0x0041, all -> 0x0045 }
            r6 = 0
            r7 = 0
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x0041, all -> 0x0045 }
            if (r8 != 0) goto L_0x002f
            r8.close()     // Catch:{ Exception -> 0x002e }
        L_0x002e:
            return r1
        L_0x002f:
            boolean r9 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x0041, all -> 0x0045 }
            if (r9 == 0) goto L_0x0041
            int r9 = r8.getColumnIndex(r0)     // Catch:{ SQLiteException -> 0x0041, all -> 0x0045 }
            java.lang.String r9 = r8.getString(r9)     // Catch:{ SQLiteException -> 0x0041, all -> 0x0045 }
            r1.add(r9)     // Catch:{ SQLiteException -> 0x0041, all -> 0x0045 }
            goto L_0x002f
        L_0x0041:
            r8.close()     // Catch:{ Exception -> 0x004a }
            goto L_0x004a
        L_0x0045:
            r9 = move-exception
            r8.close()     // Catch:{ Exception -> 0x0049 }
        L_0x0049:
            throw r9
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.common.C4061t1.m15974T(android.content.Context, java.lang.String):java.util.List");
    }

    /* renamed from: U */
    public static String m15975U(Context context, Contact contact) {
        Cursor cursor;
        String str;
        String str2;
        String str3 = null;
        if (contact == null) {
            C8151a.m33873n(new RuntimeException("Get number for contact, contact is null"));
            return null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (contact.mo27712f() != null) {
            try {
                cursor = contentResolver.query(ContactsContract.Contacts.getLookupUri(Long.parseLong(contact.mo27709b()), contact.mo27712f()), (String[]) null, (String) null, (String[]) null, (String) null);
            } catch (NumberFormatException e) {
                C8151a.m33873n(new RuntimeException("Failed to convert contact id to long: " + e.toString()));
                return null;
            } catch (SQLiteException e2) {
                C8151a.m33873n(new RuntimeException("Failed to query content resolver: " + e2.toString()));
                return null;
            }
        } else {
            cursor = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, (String[]) null, "_ID = '" + contact.mo27709b() + "'", (String[]) null, (String) null);
        }
        if (cursor == null) {
            return null;
        }
        if (cursor.moveToFirst()) {
            String string = cursor.getString(cursor.getColumnIndex(Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID));
            Cursor query = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, (String[]) null, "contact_id = " + string, (String[]) null, (String) null);
            if (query == null) {
                return null;
            }
            str2 = null;
            str = null;
            while (query.moveToNext()) {
                String string2 = query.getString(query.getColumnIndex("data1"));
                int i = query.getInt(query.getColumnIndex("data2"));
                if (i != 1) {
                    if (i == 2) {
                        return string2;
                    }
                    if (i == 3) {
                        str2 = string2;
                    } else if (str == null) {
                        str = string2;
                    }
                } else if (str3 == null) {
                    str3 = string2;
                }
            }
            query.close();
        } else {
            str2 = null;
            str = null;
        }
        cursor.close();
        if (str3 != null) {
            return str3;
        }
        return str2 != null ? str2 : str;
    }

    /* renamed from: V */
    public static int m15976V(Context context, String str) {
        if (str == null) {
            return -1;
        }
        try {
            int identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
            if (identifier != 0) {
                return identifier;
            }
            Class cls = C17530R$drawable.class;
            if (str.startsWith("SYSTEM")) {
                cls = R.drawable.class;
                str = str.substring(6);
            }
            Field declaredField = cls.getDeclaredField(str);
            return declaredField.getInt(declaredField);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: W */
    public static int m15977W(@NonNull Context context, @NonNull String str) {
        try {
            return context.getResources().getIdentifier(str, "drawable", "com.arlosoft.macrodroid");
        } catch (Throwable unused) {
            C4878b.m18868g("Failed to get image from resource name: " + str);
            return 0;
        }
    }

    /* renamed from: X */
    public static List<String> m15978X(Context context, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add("None");
        }
        RingtoneManager ringtoneManager = new RingtoneManager(context);
        ringtoneManager.setType(i);
        Cursor cursor = null;
        try {
            cursor = ringtoneManager.getCursor();
            if (cursor.getCount() > 0) {
                while (cursor.moveToNext()) {
                    String string = cursor.getString(1);
                    if (string != null) {
                        arrayList.add(string);
                    }
                }
            }
        } catch (Exception e) {
            C8151a.m33873n(e);
        } catch (Throwable th) {
            try {
                cursor.close();
            } catch (Exception unused) {
            }
            throw th;
        }
        try {
            cursor.close();
        } catch (Exception unused2) {
        }
        return arrayList;
    }

    /* renamed from: Y */
    public static boolean m15979Y() {
        return new File("/system/priv-app/MacroDroidSystemHelper.apk").exists();
    }

    /* renamed from: Z */
    public static void m15980Z(Activity activity) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        String format = String.format(SelectableItem.m15535j1(C17541R$string.invite_friends_blurb), new Object[]{"https://play.google.com/store/apps/details?id=com.arlosoft.macrodroid"});
        intent.putExtra("android.intent.extra.SUBJECT", SelectableItem.m15535j1(C17541R$string.invite_friends_android_app_recommnedation));
        intent.putExtra("android.intent.extra.TEXT", format);
        activity.startActivity(Intent.createChooser(intent, (CharSequence) null));
    }

    /* renamed from: a0 */
    public static boolean m15982a0(Context context, String... strArr) {
        return m15984b0(context, strArr) || m15986c0(context, strArr);
    }

    /* renamed from: b0 */
    private static boolean m15984b0(Context context, String... strArr) {
        int i;
        String string;
        try {
            i = Settings.Secure.getInt(context.getContentResolver(), "accessibility_enabled");
        } catch (Settings.SettingNotFoundException e) {
            C4878b.m18868g("Could not find accessibility enabled setting: " + e.toString());
            i = 0;
        }
        TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(':');
        if (i == 1 && (string = Settings.Secure.getString(context.getContentResolver(), "enabled_accessibility_services")) != null) {
            simpleStringSplitter.setString(string);
            while (simpleStringSplitter.hasNext()) {
                String next = simpleStringSplitter.next();
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (next.endsWith(strArr[i2])) {
                            return true;
                        }
                        i2++;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: c0 */
    private static boolean m15986c0(Context context, String... strArr) {
        Iterator<AccessibilityServiceInfo> it = ((AccessibilityManager) context.getSystemService("accessibility")).getEnabledAccessibilityServiceList(-1).iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                return false;
            }
            AccessibilityServiceInfo next = it.next();
            next.getId();
            int length = strArr.length;
            while (true) {
                if (i < length) {
                    if (next.getId().endsWith(strArr[i])) {
                        return true;
                    }
                    i++;
                }
            }
        }
    }

    /* renamed from: d0 */
    private static boolean m15988d0() {
        return MacroDroidAccessibilityService.f14498d;
    }

    /* renamed from: e0 */
    public static boolean m15990e0(Context context) {
        return m15982a0(context, "FingerprintAccessibilityService") || FingerprintAccessibilityService.f14432a;
    }

    /* renamed from: f0 */
    public static boolean m15992f0(Context context) {
        return m15982a0(context, "MacroDroidAccessibilityService", "MacroDroidAccessibilityServiceJellyBean") || m15988d0();
    }

    /* renamed from: g0 */
    public static boolean m15994g0(Context context) {
        return m15982a0(context, "VolumeButtonAccessibilityService") || VolumeButtonAccessibilityService.f14555d;
    }

    /* renamed from: h0 */
    public static boolean m15996h0(Context context) {
        return m15982a0(context, "UIInteractionAccessibilityService") || UIInteractionAccessibilityService.m14349E();
    }

    /* renamed from: i0 */
    public static boolean m15998i0(String str) {
        try {
            new InternetAddress(str).validate();
            return true;
        } catch (AddressException unused) {
            return false;
        } catch (NoClassDefFoundError unused2) {
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public static /* synthetic */ int m16006m0(Locale locale, String str, String str2) {
        Collator instance = Collator.getInstance(locale);
        instance.setStrength(0);
        return instance.compare(str, str2);
    }

    /* renamed from: n */
    public static String m16007n(Context context, String str) {
        return str + "\n\n" + context.getString(C17541R$string.enable_adb_instructions) + " " + "https://macrodroidforum.com/index.php?threads/adb-hack-granting-extra-capabilities-via-the-adb-tool.48/";
    }

    /* renamed from: o */
    public static boolean m16009o(String str, String str2) {
        if (!(str == null || str2 == null)) {
            try {
                String replaceAll = str.replaceAll("[^0-9.]", "");
                String replaceAll2 = str2.replaceAll("[^0-9.]", "");
                if (replaceAll.length() > 8) {
                    if (replaceAll2.length() > 8) {
                        if (replaceAll.substring(replaceAll.length() - 8).equals(replaceAll2.substring(replaceAll2.length() - 8))) {
                            return true;
                        }
                    }
                }
                if (replaceAll.equals(replaceAll2)) {
                    return true;
                }
            } catch (Exception e) {
                C8151a.m33873n(new RuntimeException("Exception in util compareNumbers: " + e.getMessage()));
            }
        }
        return false;
    }

    /* renamed from: p */
    public static boolean m16011p(String str, List<String> list) {
        if (!(str == null || list == null || list.size() == 0)) {
            try {
                String replaceAll = str.replaceAll("[^a-zA-Z0-9.]", "");
                if (replaceAll.contains(";rn")) {
                    replaceAll = replaceAll.substring(0, replaceAll.indexOf(";rn"));
                }
                for (String next : list) {
                    if (next != null) {
                        String replaceAll2 = next.replaceAll("[^a-zA-Z0-9.]", "");
                        if (replaceAll2.contains(";rn")) {
                            replaceAll2 = replaceAll.substring(0, replaceAll2.indexOf(";rn"));
                        }
                        if (replaceAll.length() > 8) {
                            if (replaceAll2.length() > 8) {
                                if (replaceAll.substring(replaceAll.length() - 8).equals(replaceAll2.substring(replaceAll2.length() - 8))) {
                                    return true;
                                }
                            }
                        }
                        if (replaceAll.equals(replaceAll2)) {
                            return true;
                        }
                    }
                }
            } catch (Exception e) {
                C8151a.m33873n(new RuntimeException("Exception in util compareNumbers: " + e.getMessage()));
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public static /* synthetic */ int m16012p0(Contact contact, Contact contact2) {
        try {
            if (contact.mo27713g() != null) {
                if (contact2.mo27713g() != null) {
                    return contact.mo27713g().toLowerCase().compareTo(contact2.mo27713g().toLowerCase());
                }
            }
        } catch (Exception unused) {
        }
        return 1;
    }

    /* renamed from: q */
    private static void m16013q(Context context, String str) {
        try {
            File file = new File(context.getApplicationInfo().dataDir, str);
            InputStream open = context.getAssets().open(str);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    open.close();
                    file.setExecutable(true);
                    return;
                }
            }
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("Util copyAssetToDataDirectory failed: " + e.getMessage()));
        }
    }

    /* renamed from: r */
    public static void m16015r(Context context) {
        m16013q(context, "socat");
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public static /* synthetic */ int m16016r0(Locale locale, C4013g gVar, C4013g gVar2) {
        Collator instance = Collator.getInstance(locale);
        instance.setStrength(0);
        return instance.compare(gVar.f10396a, gVar2.f10396a);
    }

    /* renamed from: s */
    public static Stack<Integer> m16017s(ArrayList<Integer> arrayList) {
        Stack<Integer> stack = new Stack<>();
        stack.addAll(arrayList);
        return stack;
    }

    /* renamed from: t */
    public static void m16019t(Context context, String str, String str2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, C17542R$style.Theme_App_Dialog);
        builder.setTitle((CharSequence) str);
        builder.setMessage((CharSequence) str2).setCancelable(true).setPositiveButton(17039370, (DialogInterface.OnClickListener) C4039m1.f10590a);
        builder.show();
    }

    /* renamed from: u */
    public static void m16021u(Context context, String str, String str2, int i) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, i);
        builder.setTitle((CharSequence) str);
        builder.setMessage((CharSequence) str2).setCancelable(true).setPositiveButton(17039370, (DialogInterface.OnClickListener) C4033k1.f10578a);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public static /* synthetic */ void m16022u0(Activity activity, DialogInterface dialogInterface, int i) {
        activity.startActivity(new Intent(activity, UpgradeActivity2.class));
        dialogInterface.dismiss();
    }

    /* renamed from: v */
    public static void m16023v(Context context, String str, String str2, boolean z) {
        m16027x(context, str, str2, z, -1, (PendingIntent) null, -3355444, "info_notification");
    }

    /* renamed from: w */
    public static void m16025w(Context context, String str, String str2, boolean z, int i, PendingIntent pendingIntent, int i2, Uri uri, int i3, String str3) {
        int i4 = f10633m;
        f10633m = i4 + 1;
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (z) {
                notificationManager.cancelAll();
            }
            int i5 = C17530R$drawable.not_icon_setup;
            if (i == -1) {
                i = C17530R$drawable.not_icon_setup;
            }
            try {
                if (context.getResources().getDrawable(i) != null) {
                    i5 = i;
                }
            } catch (Resources.NotFoundException unused) {
            }
            if (pendingIntent == null) {
                pendingIntent = PendingIntent.getActivity(context, 0, new Intent(), C6368b1.f14959b);
            }
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
            builder.setContentTitle(str).setTicker(str).setWhen(System.currentTimeMillis()).setContentText(str2).setContentIntent(pendingIntent).setSmallIcon(i5).setAutoCancel(true).setColor(i2).setStyle(new NotificationCompat.BigTextStyle().bigText(str2)).setPriority(i3).setGroup(String.valueOf(i4)).setChannelId(str3);
            if (uri != null) {
                builder.setSound(uri);
            } else {
                builder.setSound((Uri) null);
            }
            notificationManager.notify(String.valueOf(i4), i4, builder.build());
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("displayNotification exception: " + e.getMessage()));
        }
    }

    /* renamed from: w0 */
    public static void m16026w0(AlertDialog alertDialog) {
        try {
            Linkify.addLinks((TextView) alertDialog.findViewById(16908299), 15);
        } catch (Exception unused) {
        }
    }

    /* renamed from: x */
    public static void m16027x(Context context, String str, String str2, boolean z, int i, PendingIntent pendingIntent, int i2, String str3) {
        m16025w(context, str, str2, z, i, pendingIntent, i2, RingtoneManager.getDefaultUri(2), 0, str3);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|10|11|12|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        m16023v(r2, "MacroDroid Error", "MacroDroid cannot play the ringtone due to a bug in this version of Android", false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0036 */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m16028x0(android.content.Context r2, int r3, int r4, int r5) {
        /*
            m15963J0()
            android.media.RingtoneManager r0 = new android.media.RingtoneManager
            android.content.Context r1 = r2.getApplicationContext()
            r0.<init>(r1)
            r0.setType(r4)
            r4 = 0
            android.database.Cursor r4 = r0.getCursor()     // Catch:{ NullPointerException -> 0x0057 }
            android.media.Ringtone r3 = r0.getRingtone(r3)     // Catch:{ NullPointerException -> 0x0057 }
            f10632l = r3     // Catch:{ NullPointerException -> 0x0057 }
            r4.close()     // Catch:{ Exception -> 0x001e }
            goto L_0x001f
        L_0x001e:
        L_0x001f:
            android.media.Ringtone r3 = f10632l
            if (r3 == 0) goto L_0x004a
            android.media.Ringtone r3 = f10632l     // Catch:{ Exception -> 0x0036 }
            android.media.AudioAttributes$Builder r4 = new android.media.AudioAttributes$Builder     // Catch:{ Exception -> 0x0036 }
            r4.<init>()     // Catch:{ Exception -> 0x0036 }
            android.media.AudioAttributes$Builder r4 = r4.setLegacyStreamType(r5)     // Catch:{ Exception -> 0x0036 }
            android.media.AudioAttributes r4 = r4.build()     // Catch:{ Exception -> 0x0036 }
            r3.setAudioAttributes(r4)     // Catch:{ Exception -> 0x0036 }
            goto L_0x003b
        L_0x0036:
            android.media.Ringtone r3 = f10632l     // Catch:{ NullPointerException -> 0x0041 }
            r3.setStreamType(r5)     // Catch:{ NullPointerException -> 0x0041 }
        L_0x003b:
            android.media.Ringtone r3 = f10632l     // Catch:{ NullPointerException -> 0x0041 }
            r3.play()     // Catch:{ NullPointerException -> 0x0041 }
            goto L_0x0054
        L_0x0041:
            r3 = 0
            java.lang.String r4 = "MacroDroid Error"
            java.lang.String r5 = "MacroDroid cannot play the ringtone due to a bug in this version of Android"
            m16023v(r2, r4, r5, r3)
            goto L_0x0054
        L_0x004a:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "playRingtone - s_ringtone is null"
            r2.<init>(r3)
            p148q0.C8151a.m33873n(r2)
        L_0x0054:
            return
        L_0x0055:
            r2 = move-exception
            goto L_0x005f
        L_0x0057:
            r2 = move-exception
            p148q0.C8151a.m33873n(r2)     // Catch:{ all -> 0x0055 }
            r4.close()     // Catch:{ Exception -> 0x005e }
        L_0x005e:
            return
        L_0x005f:
            r4.close()     // Catch:{ Exception -> 0x0062 }
        L_0x0062:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.common.C4061t1.m16028x0(android.content.Context, int, int, int):void");
    }

    /* renamed from: y */
    public static boolean m16029y(Context context, String str) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Uri uri = ContactsContract.Groups.CONTENT_SUMMARY_URI;
            if (contentResolver.query(uri, (String[]) null, "_id = '" + str + "'", (String[]) null, (String) null).getCount() > 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: y0 */
    public static boolean m16030y0(Context context) {
        boolean z = true;
        if (!new File("/system/priv-app/MacroDroidSystemHelper.apk").exists()) {
            return true;
        }
        C16505a.f67202b = false;
        if (!C16505a.m98558C("/system", "rw")) {
            if (!C8164a.m33886a()) {
                m16023v(context, "Failed to remove helper apk", "This device does not appear to have root access", false);
                return false;
            }
            m15947B0(new String[]{"mount -o rw,remount /system"});
        }
        C16355b bVar = null;
        try {
            C16351a aVar = new C16351a(0, "rm " + "/system/priv-app/MacroDroidSystemHelper.apk");
            bVar = C16505a.m98574o(true);
            bVar.mo79032w(aVar);
            C16505a.m98561b();
            try {
                bVar.mo79033y();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            if (bVar != null) {
                try {
                    bVar.mo79033y();
                } catch (Exception unused3) {
                }
            }
            z = false;
        } catch (Throwable th) {
            if (bVar != null) {
                try {
                    bVar.mo79033y();
                } catch (Exception unused4) {
                }
            }
            throw th;
        }
        try {
            C16505a.m98558C("/system/", "ro");
        } catch (Exception unused5) {
        }
        return z;
    }

    /* renamed from: z */
    public static ArrayList<Contact> m16031z(Context context) {
        ArrayList<Contact> arrayList = new ArrayList<>();
        try {
            Cursor query = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID, "display_name", "lookup", "data1"}, (String) null, (String[]) null, (String) null);
            while (query.moveToNext()) {
                String string = query.getString(query.getColumnIndex(Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID));
                String string2 = query.getString(query.getColumnIndex("display_name"));
                String string3 = query.getString(query.getColumnIndex("lookup"));
                String string4 = query.getString(query.getColumnIndex("data1"));
                if (string4 != null) {
                    arrayList.add(new Contact(string, string2, string3, string4));
                }
            }
            query.close();
        } catch (SecurityException unused) {
            C4878b.m18868g("Failed to get contacts - missing permission?");
        } catch (Exception unused2) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                C15626c.m94876a(context.getApplicationContext(), context.getString(C17541R$string.could_not_get_contacts), 0).show();
            } else {
                new Handler(context.getMainLooper()).post(new C4045o1(context));
            }
        }
        return arrayList;
    }

    /* renamed from: z0 */
    public static void m16032z0(String[] strArr) {
        m15945A0(strArr);
    }
}
