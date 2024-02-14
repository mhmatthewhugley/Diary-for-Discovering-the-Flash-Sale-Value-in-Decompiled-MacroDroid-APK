package dev.skomlach.biometric.compat.utils;

import android.database.Cursor;
import android.net.Uri;
import android.util.Base64;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.contextprovider.C12104a;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import org.apache.http.cookie.ClientCookie;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u001c\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/DeviceSettings;", "", "Lja/u;", "printSetting", "printProperties", "printAll", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "pattern", "Ljava/util/regex/Pattern;", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: DeviceSettings.kt */
public final class DeviceSettings {
    public static final DeviceSettings INSTANCE = new DeviceSettings();
    private static final Pattern pattern = Pattern.compile("\\[(.+)\\]: \\[(.+)\\]");

    private DeviceSettings() {
    }

    private final void printProperties() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop").getInputStream()));
            String str = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    str = readLine;
                } else {
                    readLine = null;
                }
                if (readLine != null) {
                    Pattern pattern2 = pattern;
                    if (str != null) {
                        Matcher matcher = pattern2.matcher(str);
                        C13706o.m87928e(matcher, "pattern.matcher(line ?: continue)");
                        if (matcher.find()) {
                            MatchResult matchResult = matcher.toMatchResult();
                            matchResult.group(1);
                            matchResult.group(2);
                            BiometricLoggerImpl.INSTANCE.mo68217d("SystemProperties: " + str);
                        }
                    }
                } else {
                    bufferedReader.close();
                    return;
                }
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th, "SystemProperties");
        }
    }

    private final void printSetting() {
        int i;
        try {
            String[] strArr = {"system", "global", ClientCookie.SECURE_ATTR};
            for (int i2 = 0; i2 < 3; i2++) {
                String str = strArr[i2];
                Cursor query = C12104a.f58372a.mo68283g().getContentResolver().query(Uri.parse("content://settings/" + str), (String[]) null, (String) null, (String[]) null, (String) null);
                if (query != null) {
                    query.moveToFirst();
                    while (!query.isAfterLast()) {
                        try {
                            int columnIndexOrThrow = query.getColumnIndexOrThrow("name");
                            if (!query.isNull(columnIndexOrThrow)) {
                                i = query.getColumnIndexOrThrow("values");
                                int type = query.getType(i);
                                String string = query.getString(columnIndexOrThrow);
                                if (type == 0) {
                                    BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
                                    biometricLoggerImpl.mo68217d("SystemSettings: " + str + " - " + string + ":NULL");
                                } else if (type == 1) {
                                    BiometricLoggerImpl biometricLoggerImpl2 = BiometricLoggerImpl.INSTANCE;
                                    int i3 = query.getInt(i);
                                    biometricLoggerImpl2.mo68217d("SystemSettings: " + str + " - " + string + ":" + i3);
                                } else if (type == 2) {
                                    BiometricLoggerImpl biometricLoggerImpl3 = BiometricLoggerImpl.INSTANCE;
                                    float f = query.getFloat(i);
                                    biometricLoggerImpl3.mo68217d("SystemSettings: " + str + " - " + string + ":" + f);
                                } else if (type == 3) {
                                    BiometricLoggerImpl biometricLoggerImpl4 = BiometricLoggerImpl.INSTANCE;
                                    String string2 = query.getString(i);
                                    biometricLoggerImpl4.mo68217d("SystemSettings: " + str + " - " + string + ":" + string2);
                                } else if (type != 4) {
                                    BiometricLoggerImpl biometricLoggerImpl5 = BiometricLoggerImpl.INSTANCE;
                                    biometricLoggerImpl5.mo68217d("SystemSettings: " + str + " - " + string + ": unknown type - " + type);
                                } else {
                                    BiometricLoggerImpl biometricLoggerImpl6 = BiometricLoggerImpl.INSTANCE;
                                    String encodeToString = Base64.encodeToString(query.getBlob(i), 0);
                                    biometricLoggerImpl6.mo68217d("SystemSettings: " + str + " - " + string + ":" + encodeToString);
                                }
                            }
                        } catch (Throwable th) {
                            BiometricLoggerImpl.INSTANCE.mo68218e(th);
                        }
                        query.moveToNext();
                    }
                    query.close();
                }
            }
        } catch (Throwable th2) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th2, "SystemSettings");
        }
    }

    public final void printAll() {
        printSetting();
        printProperties();
    }
}
