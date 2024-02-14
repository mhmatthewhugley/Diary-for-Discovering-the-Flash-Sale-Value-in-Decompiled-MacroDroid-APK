package dev.skomlach.biometric.compat.utils.device;

import android.content.Context;
import android.os.Build;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import dev.skomlach.biometric.compat.utils.SystemPropertiesProxy;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.contextprovider.C12104a;
import dev.skomlach.common.network.C12126b;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.text.C15147d;
import p003a9.C0019a;
import p297ja.C13328m;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0003J\n\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0003J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f0\u0006R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/device/DeviceModel;", "", "", "string", "fixVendorName", "getSimpleDeviceName", "", "getNameFromAssets", "getJSON", "getNameFromDatabase", "name", "getFullName", "vendor", "model", "getName", "Lja/m;", "getNames", "brand", "Ljava/lang/String;", "device", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: DeviceModel.kt */
public final class DeviceModel {
    public static final DeviceModel INSTANCE = new DeviceModel();
    private static final Context appContext;
    private static String brand;
    private static final String device;
    private static final String model;

    static {
        String str;
        String str2;
        String str3 = Build.BRAND;
        brand = C15176v.m93630E(str3 == null ? "" : str3, "  ", " ", false, 4, (Object) null);
        String str4 = Build.MODEL;
        if (str4 == null) {
            str = "";
        } else {
            str = str4;
        }
        model = C15176v.m93630E(str, "  ", " ", false, 4, (Object) null);
        String str5 = Build.DEVICE;
        if (str5 == null) {
            str2 = "";
        } else {
            str2 = str5;
        }
        device = C15176v.m93630E(str2, "  ", " ", false, 4, (Object) null);
        Context g = C12104a.f58372a.mo68283g();
        appContext = g;
        if (C13706o.m87924a(brand, "Amazon") && C13706o.m87924a(SystemPropertiesProxy.INSTANCE.get(g, "ro.build.characteristics"), "tablet")) {
            String str6 = brand;
            brand = str6 + " Kindle";
        }
    }

    private DeviceModel() {
    }

    private final String fixVendorName(String str) {
        String str2 = (String) C15177w.m93705x0(str, new String[]{" "}, false, 0, 6, (Object) null).get(0);
        if (Character.isLowerCase(str2.charAt(0))) {
            char upperCase = Character.toUpperCase(str2.charAt(0));
            String substring = str2.substring(1);
            C13706o.m87928e(substring, "this as java.lang.String).substring(startIndex)");
            str2 = upperCase + substring;
        }
        String substring2 = str.substring(str2.length(), str.length());
        C13706o.m87928e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        return C15177w.m93672R0(str2 + substring2).toString();
    }

    private final String getFullName(String str) {
        String str2 = model;
        List x0 = C15177w.m93705x0(str2, new String[]{" "}, false, 0, 6, (Object) null);
        List x02 = C15177w.m93705x0(str, new String[]{" "}, false, 0, 6, (Object) null);
        return (((String) x0.get(0)).length() <= ((String) x02.get(0)).length() || !C15176v.m93632G((String) x0.get(0), (String) x02.get(0), true)) ? str : str2;
    }

    private final String getJSON() {
        try {
            InputStream open = appContext.getAssets().open("by_brand.json");
            C13706o.m87928e(open, "appContext.assets.open(\"by_brand.json\")");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C12126b.f58407a.mo68336b(open, byteArrayOutputStream);
            open.close();
            byteArrayOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C13706o.m87928e(byteArray, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
            return new String(byteArray, C15147d.f64349b);
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
            return null;
        }
    }

    private final String getName(String str, String str2) {
        if (C15176v.m93632G(str2, str, true)) {
            return str2;
        }
        return str + " " + str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066 A[Catch:{ all -> 0x0118 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068 A[Catch:{ all -> 0x0118 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076 A[Catch:{ all -> 0x0118 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bf A[Catch:{ all -> 0x0118 }] */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.String> getNameFromAssets() {
        /*
            r14 = this;
            java.lang.String r0 = "name"
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r1 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "AndroidModel.getNameFromAssets started"
            r5 = 0
            r3[r5] = r4
            r1.mo68217d(r3)
            r1 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x0118 }
            java.lang.String r4 = r14.getJSON()     // Catch:{ all -> 0x0118 }
            if (r4 != 0) goto L_0x0019
            return r1
        L_0x0019:
            r3.<init>(r4)     // Catch:{ all -> 0x0118 }
            java.util.Iterator r4 = r3.keys()     // Catch:{ all -> 0x0118 }
            java.lang.String r6 = "json.keys()"
            kotlin.jvm.internal.C13706o.m87928e(r4, r6)     // Catch:{ all -> 0x0118 }
        L_0x0025:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x0118 }
            if (r6 == 0) goto L_0x0124
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x0118 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0118 }
            java.lang.String r7 = brand     // Catch:{ all -> 0x0118 }
            boolean r7 = kotlin.text.C15176v.m93641v(r7, r6, r2)     // Catch:{ all -> 0x0118 }
            if (r7 == 0) goto L_0x0025
            org.json.JSONArray r6 = r3.getJSONArray(r6)     // Catch:{ all -> 0x0118 }
            int r7 = r6.length()     // Catch:{ all -> 0x0118 }
            r8 = 0
        L_0x0042:
            if (r8 >= r7) goto L_0x0025
            org.json.JSONObject r9 = r6.getJSONObject(r8)     // Catch:{ all -> 0x0118 }
            java.lang.String r10 = "model"
            java.lang.String r10 = r9.getString(r10)     // Catch:{ all -> 0x0118 }
            java.lang.String r11 = r9.getString(r0)     // Catch:{ all -> 0x0118 }
            java.lang.String r12 = "device"
            java.lang.String r12 = r9.getString(r12)     // Catch:{ all -> 0x0118 }
            if (r11 == 0) goto L_0x0063
            int r13 = r11.length()     // Catch:{ all -> 0x0118 }
            if (r13 != 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r13 = 0
            goto L_0x0064
        L_0x0063:
            r13 = 1
        L_0x0064:
            if (r13 == 0) goto L_0x0068
            goto L_0x0114
        L_0x0068:
            if (r10 == 0) goto L_0x0073
            int r13 = r10.length()     // Catch:{ all -> 0x0118 }
            if (r13 != 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r13 = 0
            goto L_0x0074
        L_0x0073:
            r13 = 1
        L_0x0074:
            if (r13 != 0) goto L_0x00bd
            java.lang.String r13 = model     // Catch:{ all -> 0x0118 }
            boolean r10 = kotlin.text.C15176v.m93641v(r13, r10, r2)     // Catch:{ all -> 0x0118 }
            if (r10 == 0) goto L_0x00bd
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r3 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE     // Catch:{ all -> 0x0118 }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0118 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0118 }
            r6.<init>()     // Catch:{ all -> 0x0118 }
            java.lang.String r7 = "AndroidModel.getNameFromAssets1 - "
            r6.append(r7)     // Catch:{ all -> 0x0118 }
            r6.append(r9)     // Catch:{ all -> 0x0118 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0118 }
            r4[r5] = r6     // Catch:{ all -> 0x0118 }
            r3.mo68217d(r4)     // Catch:{ all -> 0x0118 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0118 }
            r3.<init>()     // Catch:{ all -> 0x0118 }
            dev.skomlach.biometric.compat.utils.device.DeviceModel r4 = INSTANCE     // Catch:{ all -> 0x0118 }
            java.lang.String r6 = brand     // Catch:{ all -> 0x0118 }
            kotlin.jvm.internal.C13706o.m87928e(r11, r0)     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = r4.getFullName(r11)     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = r4.getName(r6, r0)     // Catch:{ all -> 0x0118 }
            r3.add(r0)     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = brand     // Catch:{ all -> 0x0118 }
            java.lang.String r6 = r4.getFullName(r13)     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = r4.getName(r0, r6)     // Catch:{ all -> 0x0118 }
            r3.add(r0)     // Catch:{ all -> 0x0118 }
            return r3
        L_0x00bd:
            if (r12 == 0) goto L_0x00c8
            int r10 = r12.length()     // Catch:{ all -> 0x0118 }
            if (r10 != 0) goto L_0x00c6
            goto L_0x00c8
        L_0x00c6:
            r10 = 0
            goto L_0x00c9
        L_0x00c8:
            r10 = 1
        L_0x00c9:
            if (r10 != 0) goto L_0x0114
            java.lang.String r10 = device     // Catch:{ all -> 0x0118 }
            boolean r10 = kotlin.text.C15176v.m93641v(r10, r12, r2)     // Catch:{ all -> 0x0118 }
            if (r10 == 0) goto L_0x0114
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r3 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE     // Catch:{ all -> 0x0118 }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0118 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0118 }
            r6.<init>()     // Catch:{ all -> 0x0118 }
            java.lang.String r7 = "AndroidModel.getNameFromAssets2 - "
            r6.append(r7)     // Catch:{ all -> 0x0118 }
            r6.append(r9)     // Catch:{ all -> 0x0118 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0118 }
            r4[r5] = r6     // Catch:{ all -> 0x0118 }
            r3.mo68217d(r4)     // Catch:{ all -> 0x0118 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0118 }
            r3.<init>()     // Catch:{ all -> 0x0118 }
            dev.skomlach.biometric.compat.utils.device.DeviceModel r4 = INSTANCE     // Catch:{ all -> 0x0118 }
            java.lang.String r6 = brand     // Catch:{ all -> 0x0118 }
            kotlin.jvm.internal.C13706o.m87928e(r11, r0)     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = r4.getFullName(r11)     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = r4.getName(r6, r0)     // Catch:{ all -> 0x0118 }
            r3.add(r0)     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = brand     // Catch:{ all -> 0x0118 }
            java.lang.String r6 = model     // Catch:{ all -> 0x0118 }
            java.lang.String r6 = r4.getFullName(r6)     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = r4.getName(r0, r6)     // Catch:{ all -> 0x0118 }
            r3.add(r0)     // Catch:{ all -> 0x0118 }
            return r3
        L_0x0114:
            int r8 = r8 + 1
            goto L_0x0042
        L_0x0118:
            r0 = move-exception
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r3 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "AndroidModel"
            r2[r5] = r4
            r3.mo68219e(r0, r2)
        L_0x0124:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.utils.device.DeviceModel.getNameFromAssets():java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b6  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.String> getNameFromDatabase() {
        /*
            r11 = this;
            android.content.Context r0 = appContext
            o6.b$b r0 = p344o6.C15804b.m95364d(r0)
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r1 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = r0.f65213a
            java.lang.String r5 = r0.f65215c
            java.lang.String r6 = r0.mo75574a()
            java.lang.String r7 = r0.f65214b
            java.lang.String r8 = r0.f65216d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "AndroidModel.getNameFromDatabase -{ "
            r9.append(r10)
            r9.append(r4)
            java.lang.String r4 = "; "
            r9.append(r4)
            r9.append(r5)
            r9.append(r4)
            r9.append(r6)
            r9.append(r4)
            r9.append(r7)
            r9.append(r4)
            r9.append(r8)
            java.lang.String r4 = "; }"
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            r5 = 0
            r3[r5] = r4
            r1.mo68217d(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r4 = r0.f65213a
            if (r4 == 0) goto L_0x005f
            int r4 = r4.length()
            if (r4 != 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r4 = 0
            goto L_0x0060
        L_0x005f:
            r4 = 1
        L_0x0060:
            java.lang.String r6 = "info.model"
            if (r4 == 0) goto L_0x006d
            java.lang.String r0 = r0.f65216d
            kotlin.jvm.internal.C13706o.m87928e(r0, r6)
            r3.add(r0)
            return r3
        L_0x006d:
            java.lang.String r4 = r0.f65213a
            if (r4 == 0) goto L_0x007e
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0079
            r4 = 1
            goto L_0x007a
        L_0x0079:
            r4 = 0
        L_0x007a:
            if (r4 != r2) goto L_0x007e
            r4 = 1
            goto L_0x007f
        L_0x007e:
            r4 = 0
        L_0x007f:
            if (r4 == 0) goto L_0x0084
            java.lang.String r4 = r0.f65213a
            goto L_0x0086
        L_0x0084:
            java.lang.String r4 = brand
        L_0x0086:
            java.lang.String r7 = "if (info.manufacturer?.i…o.manufacturer else brand"
            kotlin.jvm.internal.C13706o.m87928e(r4, r7)
            java.lang.String r8 = r0.mo75574a()
            java.lang.String r9 = "info.name"
            kotlin.jvm.internal.C13706o.m87928e(r8, r9)
            java.lang.String r8 = r11.getFullName(r8)
            java.lang.String r4 = r11.getName(r4, r8)
            r3.add(r4)
            java.lang.String r4 = r0.f65213a
            if (r4 == 0) goto L_0x00b0
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x00ab
            r4 = 1
            goto L_0x00ac
        L_0x00ab:
            r4 = 0
        L_0x00ac:
            if (r4 != r2) goto L_0x00b0
            r4 = 1
            goto L_0x00b1
        L_0x00b0:
            r4 = 0
        L_0x00b1:
            if (r4 == 0) goto L_0x00b6
            java.lang.String r4 = r0.f65213a
            goto L_0x00b8
        L_0x00b6:
            java.lang.String r4 = brand
        L_0x00b8:
            kotlin.jvm.internal.C13706o.m87928e(r4, r7)
            java.lang.String r0 = r0.f65216d
            kotlin.jvm.internal.C13706o.m87928e(r0, r6)
            java.lang.String r0 = r11.getFullName(r0)
            java.lang.String r0 = r11.getName(r4, r0)
            r3.add(r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "AndroidModel.getNameFromDatabase2 -{ "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r4 = " }"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0[r5] = r2
            r1.mo68217d(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.utils.device.DeviceModel.getNameFromDatabase():java.util.List");
    }

    /* access modifiers changed from: private */
    /* renamed from: getNames$lambda-8$lambda-7  reason: not valid java name */
    public static final int m101366getNames$lambda8$lambda7(String str, String str2) {
        return C13706o.m87931h(str2.length(), str.length());
    }

    private final String getSimpleDeviceName() {
        SystemPropertiesProxy systemPropertiesProxy = SystemPropertiesProxy.INSTANCE;
        Context context = appContext;
        String str = systemPropertiesProxy.get(context, "ro.config.marketing_name");
        boolean z = true;
        if (str.length() > 0) {
            return INSTANCE.getName(brand, str);
        }
        String str2 = systemPropertiesProxy.get(context, "ro.camera.model");
        if (str2.length() <= 0) {
            z = false;
        }
        if (z) {
            return INSTANCE.getName(brand, str2);
        }
        return null;
    }

    public final List<C13328m<String, String>> getNames() {
        HashMap hashMap = new HashMap();
        String simpleDeviceName = getSimpleDeviceName();
        if (simpleDeviceName != null) {
            String fixVendorName = INSTANCE.fixVendorName(simpleDeviceName);
            StringBuilder sb = new StringBuilder();
            int length = fixVendorName.length();
            for (int i = 0; i < length; i++) {
                char charAt = fixVendorName.charAt(i);
                if (Character.isLetterOrDigit(charAt) || C15145b.m93521c(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            C13706o.m87928e(sb2, "filterTo(StringBuilder(), predicate).toString()");
            String str = (String) hashMap.put(fixVendorName, sb2);
        }
        List<String> nameFromAssets = getNameFromAssets();
        if (nameFromAssets != null) {
            for (String fixVendorName2 : nameFromAssets) {
                String fixVendorName3 = INSTANCE.fixVendorName(fixVendorName2);
                StringBuilder sb3 = new StringBuilder();
                int length2 = fixVendorName3.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    char charAt2 = fixVendorName3.charAt(i2);
                    if (Character.isLetterOrDigit(charAt2) || C15145b.m93521c(charAt2)) {
                        sb3.append(charAt2);
                    }
                }
                String sb4 = sb3.toString();
                C13706o.m87928e(sb4, "filterTo(StringBuilder(), predicate).toString()");
                hashMap.put(fixVendorName3, sb4);
            }
        }
        List<String> nameFromDatabase = getNameFromDatabase();
        if (nameFromDatabase != null) {
            for (String fixVendorName4 : nameFromDatabase) {
                String fixVendorName5 = INSTANCE.fixVendorName(fixVendorName4);
                StringBuilder sb5 = new StringBuilder();
                int length3 = fixVendorName5.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    char charAt3 = fixVendorName5.charAt(i3);
                    if (Character.isLetterOrDigit(charAt3) || C15145b.m93521c(charAt3)) {
                        sb5.append(charAt3);
                    }
                }
                String sb6 = sb5.toString();
                C13706o.m87928e(sb6, "filterTo(StringBuilder(), predicate).toString()");
                hashMap.put(fixVendorName5, sb6);
            }
        }
        HashSet hashSet = new HashSet(hashMap.keySet());
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                if (!hashSet2.contains(str3) && str2.length() < str3.length()) {
                    C13706o.m87928e(str3, "name2");
                    C13706o.m87928e(str2, "name1");
                    if (C15176v.m93632G(str3, str2, true)) {
                        hashSet2.add(str2);
                    }
                }
            }
        }
        hashSet.removeAll(hashSet2);
        List<String> I0 = C13566b0.m87405I0(hashSet);
        C13622x.m87781y(I0, C0019a.f40a);
        ArrayList arrayList = new ArrayList();
        for (String str4 : I0) {
            String str5 = (String) hashMap.get(str4);
            if (str5 != null) {
                arrayList.add(new C13328m(str4, str5));
            }
        }
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        biometricLoggerImpl.mo68217d("AndroidModel.names " + arrayList);
        return arrayList;
    }
}
