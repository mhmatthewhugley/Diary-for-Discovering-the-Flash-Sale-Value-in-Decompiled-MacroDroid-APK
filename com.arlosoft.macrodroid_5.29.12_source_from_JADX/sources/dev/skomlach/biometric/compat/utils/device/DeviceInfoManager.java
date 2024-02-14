package dev.skomlach.biometric.compat.utils.device;

import android.content.SharedPreferences;
import android.os.Looper;
import androidx.annotation.WorkerThread;
import dev.skomlach.biometric.compat.utils.LastUpdatedTs;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.network.C12126b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p269g9.C12317a;
import p297ja.C13328m;
import p338nd.C15788a;
import p373qd.C16293h;
import p391sd.C16532b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001)B\t\b\u0002¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002J$\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002J\u0012\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0014\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0007R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\n  *\u0004\u0018\u00010\u001f0\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001e\u0010#\u001a\u0004\u0018\u00010\u00028B@\u0002X\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006*"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/device/DeviceInfoManager;", "", "Ldev/skomlach/biometric/compat/utils/device/DeviceInfo;", "deviceInfo", "Lja/u;", "setCachedDeviceInfo", "", "modelReadableName", "model", "loadDeviceInfo", "html", "", "getSensorDetails", "url", "getDetailsLink", "getHtml", "s", "capitalize", "", "hasFingerprint", "hasUnderDisplayFingerprint", "hasIrisScanner", "hasFaceID", "Ldev/skomlach/biometric/compat/utils/device/DeviceInfoManager$OnDeviceInfoListener;", "onDeviceInfoListener", "getDeviceInfo", "", "agents", "[Ljava/lang/String;", "getAgents", "()[Ljava/lang/String;", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "pattern", "Ljava/util/regex/Pattern;", "cachedDeviceInfo", "Ldev/skomlach/biometric/compat/utils/device/DeviceInfo;", "getCachedDeviceInfo", "()Ldev/skomlach/biometric/compat/utils/device/DeviceInfo;", "<init>", "()V", "OnDeviceInfoListener", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: DeviceInfoManager.kt */
public final class DeviceInfoManager {
    public static final DeviceInfoManager INSTANCE = new DeviceInfoManager();
    private static final String[] agents = {"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_1) AppleWebKit/602.2.14 (KHTML, like Gecko) Version/10.0.1 Safari/602.2.14", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.71 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.98 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.98 Safari/537.36", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.71 Safari/537.36", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; WOW64; rv:50.0) Gecko/20100101 Firefox/50.0"};
    private static DeviceInfo cachedDeviceInfo;
    private static final Pattern pattern = Pattern.compile("\\((.*?)\\)+");

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/device/DeviceInfoManager$OnDeviceInfoListener;", "", "Ldev/skomlach/biometric/compat/utils/device/DeviceInfo;", "deviceInfo", "Lja/u;", "onReady", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: DeviceInfoManager.kt */
    public interface OnDeviceInfoListener {
        void onReady(DeviceInfo deviceInfo);
    }

    private DeviceInfoManager() {
    }

    private final String capitalize(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char charAt = str.charAt(0);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        String substring = str.substring(1);
        C13706o.m87928e(substring, "this as java.lang.String).substring(startIndex)");
        return upperCase + substring;
    }

    private final DeviceInfo getCachedDeviceInfo() {
        if (cachedDeviceInfo == null) {
            SharedPreferences a = C12317a.f58995a.mo68640a("BiometricCompat_DeviceInfo");
            LastUpdatedTs lastUpdatedTs = LastUpdatedTs.INSTANCE;
            long timestamp = lastUpdatedTs.getTimestamp();
            if (a.getBoolean("checked-" + timestamp, false)) {
                long timestamp2 = lastUpdatedTs.getTimestamp();
                String string = a.getString("model-" + timestamp2, (String) null);
                if (string == null) {
                    return null;
                }
                long timestamp3 = lastUpdatedTs.getTimestamp();
                Set stringSet = a.getStringSet("sensors-" + timestamp3, (Set) null);
                if (stringSet == null) {
                    stringSet = new HashSet();
                }
                cachedDeviceInfo = new DeviceInfo(string, stringSet);
            } else {
                a.edit().clear().commit();
            }
        }
        return cachedDeviceInfo;
    }

    private final String getDetailsLink(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str3;
        if (str2 == null) {
            return null;
        }
        C16293h i0 = C15788a.m95316a(str2).mo78831J0().mo78870i0("content");
        C16532b m0 = i0 != null ? i0.mo78873m0("a") : null;
        if (m0 == null) {
            m0 = new C16532b();
        } else {
            C13706o.m87928e(m0, "body?.getElementsByTag(\"a\") ?: Elements()");
        }
        C16532b bVar = m0;
        int size = bVar.size();
        String str6 = null;
        for (int i = 0; i < size; i++) {
            C16293h hVar = (C16293h) bVar.get(i);
            String I0 = hVar.mo78860I0();
            if (!(I0 == null || I0.length() == 0)) {
                if (C15176v.m93641v(I0, str5, true)) {
                    C12126b bVar2 = C12126b.f58407a;
                    String c = hVar.mo78823c("href");
                    C13706o.m87928e(c, "element.attr(\"href\")");
                    return bVar2.mo68339e(str4, c);
                }
                if (str6 == null || str6.length() == 0) {
                    C13706o.m87928e(I0, "name");
                    if (C15177w.m93659L(I0, str5, true)) {
                        C12126b bVar3 = C12126b.f58407a;
                        String c2 = hVar.mo78823c("href");
                        C13706o.m87928e(c2, "element.attr(\"href\")");
                        str6 = bVar3.mo68339e(str4, c2);
                    } else {
                        String str7 = " ";
                        String str8 = "href";
                        String str9 = "element.attr(\"href\")";
                        List<String> x0 = C15177w.m93705x0(str3, new String[]{" "}, false, 0, 6, (Object) null);
                        StringBuilder sb = new StringBuilder();
                        for (String append : x0) {
                            sb.append(str7);
                            sb.append(append);
                            String sb2 = sb.toString();
                            C13706o.m87928e(sb2, "stringBuilder.toString()");
                            if (C15177w.m93659L(I0, C15177w.m93672R0(sb2).toString(), true)) {
                                C12126b bVar4 = C12126b.f58407a;
                                String c3 = hVar.mo78823c(str8);
                                C13706o.m87928e(c3, str9);
                                str6 = bVar4.mo68339e(str4, c3);
                            }
                        }
                    }
                }
            }
        }
        return str6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0078 A[Catch:{ all -> 0x0072, all -> 0x007c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getHtml(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "en-US"
            r1 = 0
            dev.skomlach.common.network.b r2 = dev.skomlach.common.network.C12126b.f58407a     // Catch:{ all -> 0x007c }
            boolean r3 = r2.mo68338d()     // Catch:{ all -> 0x007c }
            if (r3 == 0) goto L_0x0089
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0074 }
            r4 = 30
            long r3 = r3.toMillis(r4)     // Catch:{ all -> 0x0074 }
            int r4 = (int) r3     // Catch:{ all -> 0x0074 }
            java.net.HttpURLConnection r7 = r2.mo68335a(r7, r4)     // Catch:{ all -> 0x0074 }
            java.lang.String r3 = "GET"
            r7.setRequestMethod(r3)     // Catch:{ all -> 0x0072 }
            java.lang.String r3 = "Content-Language"
            r7.setRequestProperty(r3, r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r3 = "Accept-Language"
            r7.setRequestProperty(r3, r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "User-Agent"
            java.lang.String[] r3 = agents     // Catch:{ all -> 0x0072 }
            java.security.SecureRandom r4 = new java.security.SecureRandom     // Catch:{ all -> 0x0072 }
            r4.<init>()     // Catch:{ all -> 0x0072 }
            int r5 = r3.length     // Catch:{ all -> 0x0072 }
            int r4 = r4.nextInt(r5)     // Catch:{ all -> 0x0072 }
            r3 = r3[r4]     // Catch:{ all -> 0x0072 }
            r7.setRequestProperty(r0, r3)     // Catch:{ all -> 0x0072 }
            r7.connect()     // Catch:{ all -> 0x0072 }
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0072 }
            r0.<init>()     // Catch:{ all -> 0x0072 }
            java.io.InputStream r3 = r7.getInputStream()     // Catch:{ all -> 0x0072 }
            if (r3 != 0) goto L_0x004c
            java.io.InputStream r3 = r7.getErrorStream()     // Catch:{ all -> 0x0072 }
        L_0x004c:
            r2.mo68336b(r3, r0)     // Catch:{ all -> 0x0072 }
            r3.close()     // Catch:{ all -> 0x0072 }
            byte[] r2 = r0.toByteArray()     // Catch:{ all -> 0x0072 }
            r0.close()     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "data"
            kotlin.jvm.internal.C13706o.m87928e(r2, r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r3 = "forName(\"UTF-8\")"
            kotlin.jvm.internal.C13706o.m87928e(r0, r3)     // Catch:{ all -> 0x0072 }
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0072 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x0072 }
            r7.disconnect()     // Catch:{ all -> 0x007c }
            return r3
        L_0x0072:
            r0 = move-exception
            goto L_0x0076
        L_0x0074:
            r0 = move-exception
            r7 = r1
        L_0x0076:
            if (r7 == 0) goto L_0x007b
            r7.disconnect()     // Catch:{ all -> 0x007c }
        L_0x007b:
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r7 = move-exception
            boolean r0 = r7 instanceof javax.net.ssl.SSLHandshakeException
            if (r0 == 0) goto L_0x0084
            java.lang.String r7 = "<html></html>"
            return r7
        L_0x0084:
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r0 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r0.mo68218e((java.lang.Throwable) r7)
        L_0x0089:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.utils.device.DeviceInfoManager.getHtml(java.lang.String):java.lang.String");
    }

    private final Set<String> getSensorDetails(String str) {
        HashSet hashSet = new HashSet();
        if (str != null) {
            C16293h i0 = C15788a.m95316a(str).mo78831J0().mo78870i0("content");
            C16532b j0 = i0 != null ? i0.mo78871j0("data-spec") : null;
            if (j0 == null) {
                j0 = new C16532b();
            } else {
                C13706o.m87928e(j0, "body?.getElementsByAttri…data-spec\") ?: Elements()");
            }
            int size = j0.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                C16293h hVar = (C16293h) j0.get(i2);
                if (C13706o.m87924a(hVar.mo78823c("data-spec"), "sensors")) {
                    String I0 = hVar.mo78860I0();
                    if (!(I0 == null || I0.length() == 0)) {
                        Matcher matcher = pattern.matcher(I0);
                        String str2 = I0;
                        while (matcher.find()) {
                            String group = matcher.group();
                            C13706o.m87928e(str2, "name");
                            C13706o.m87928e(group, "s");
                            str2 = C15176v.m93630E(str2, group, C15176v.m93630E(group, ",", ";", false, 4, (Object) null), false, 4, (Object) null);
                        }
                        C13706o.m87928e(str2, "name");
                        Object[] array = C15177w.m93705x0(str2, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[i]);
                        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        for (String str3 : (String[]) array) {
                            DeviceInfoManager deviceInfoManager = INSTANCE;
                            int length = str3.length() - 1;
                            int i3 = 0;
                            boolean z = false;
                            while (i3 <= length) {
                                boolean z2 = C13706o.m87931h(str3.charAt(!z ? i3 : length), 32) <= 0;
                                if (!z) {
                                    if (!z2) {
                                        z = true;
                                    } else {
                                        i3++;
                                    }
                                } else if (!z2) {
                                    break;
                                } else {
                                    length--;
                                }
                            }
                            hashSet.add(deviceInfoManager.capitalize(str3.subSequence(i3, length + 1).toString()));
                        }
                    }
                }
                i2++;
                i = 0;
            }
        }
        return hashSet;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:18|19|20|(1:25)(1:24)|(1:27)|28|29|30|34) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00c6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final dev.skomlach.biometric.compat.utils.device.DeviceInfo loadDeviceInfo(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r0 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "DeviceInfoManager: loadDeviceInfo for "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r4 = "/"
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            r4 = 0
            r2[r4] = r3
            r0.mo68217d(r2)
            int r2 = r9.length()
            if (r2 != 0) goto L_0x002c
            r2 = 1
            goto L_0x002d
        L_0x002c:
            r2 = 0
        L_0x002d:
            r3 = 0
            if (r2 == 0) goto L_0x0032
            goto L_0x00d3
        L_0x0032:
            java.lang.String r2 = java.net.URLEncoder.encode(r9)     // Catch:{ all -> 0x00cd }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cd }
            r5.<init>()     // Catch:{ all -> 0x00cd }
            java.lang.String r6 = "https://m.gsmarena.com/res.php3?sSearch="
            r5.append(r6)     // Catch:{ all -> 0x00cd }
            r5.append(r2)     // Catch:{ all -> 0x00cd }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x00cd }
            java.lang.String r5 = r7.getHtml(r2)     // Catch:{ all -> 0x00cd }
            if (r5 != 0) goto L_0x004e
            return r3
        L_0x004e:
            java.lang.String r9 = r7.getDetailsLink(r2, r5, r9)     // Catch:{ all -> 0x00cd }
            if (r9 != 0) goto L_0x005f
            dev.skomlach.biometric.compat.utils.device.DeviceInfo r9 = new dev.skomlach.biometric.compat.utils.device.DeviceInfo     // Catch:{ all -> 0x00cd }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x00cd }
            r0.<init>()     // Catch:{ all -> 0x00cd }
            r9.<init>(r8, r0)     // Catch:{ all -> 0x00cd }
            return r9
        L_0x005f:
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x00cd }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cd }
            r5.<init>()     // Catch:{ all -> 0x00cd }
            java.lang.String r6 = "DeviceInfoManager: Link: "
            r5.append(r6)     // Catch:{ all -> 0x00cd }
            r5.append(r9)     // Catch:{ all -> 0x00cd }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00cd }
            r2[r4] = r5     // Catch:{ all -> 0x00cd }
            r0.mo68217d(r2)     // Catch:{ all -> 0x00cd }
            java.lang.String r9 = r7.getHtml(r9)     // Catch:{ all -> 0x00cd }
            if (r9 != 0) goto L_0x0088
            dev.skomlach.biometric.compat.utils.device.DeviceInfo r9 = new dev.skomlach.biometric.compat.utils.device.DeviceInfo     // Catch:{ all -> 0x00cd }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x00cd }
            r0.<init>()     // Catch:{ all -> 0x00cd }
            r9.<init>(r8, r0)     // Catch:{ all -> 0x00cd }
            return r9
        L_0x0088:
            java.util.Set r2 = r7.getSensorDetails(r9)     // Catch:{ all -> 0x00cd }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00cd }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cd }
            r5.<init>()     // Catch:{ all -> 0x00cd }
            java.lang.String r6 = "DeviceInfoManager: Sensors: "
            r5.append(r6)     // Catch:{ all -> 0x00cd }
            r5.append(r2)     // Catch:{ all -> 0x00cd }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00cd }
            r1[r4] = r5     // Catch:{ all -> 0x00cd }
            r0.mo68217d(r1)     // Catch:{ all -> 0x00cd }
            qd.f r9 = p338nd.C15788a.m95316a(r9)     // Catch:{ all -> 0x00c6 }
            qd.h r9 = r9.mo78831J0()     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = "content"
            qd.h r9 = r9.mo78870i0(r0)     // Catch:{ all -> 0x00c6 }
            if (r9 == 0) goto L_0x00c1
            java.lang.String r0 = "section nobor"
            sd.b r9 = r9.mo78872k0(r0)     // Catch:{ all -> 0x00c6 }
            if (r9 == 0) goto L_0x00c1
            java.lang.String r9 = r9.mo79332f()     // Catch:{ all -> 0x00c6 }
            goto L_0x00c2
        L_0x00c1:
            r9 = r3
        L_0x00c2:
            if (r9 != 0) goto L_0x00c5
            goto L_0x00c6
        L_0x00c5:
            r8 = r9
        L_0x00c6:
            dev.skomlach.biometric.compat.utils.device.DeviceInfo r9 = new dev.skomlach.biometric.compat.utils.device.DeviceInfo     // Catch:{ all -> 0x00cd }
            r9.<init>(r8, r2)     // Catch:{ all -> 0x00cd }
            r3 = r9
            goto L_0x00d3
        L_0x00cd:
            r8 = move-exception
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r9 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r9.mo68218e((java.lang.Throwable) r8)
        L_0x00d3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.utils.device.DeviceInfoManager.loadDeviceInfo(java.lang.String, java.lang.String):dev.skomlach.biometric.compat.utils.device.DeviceInfo");
    }

    private final void setCachedDeviceInfo(DeviceInfo deviceInfo) {
        cachedDeviceInfo = deviceInfo;
        try {
            SharedPreferences.Editor edit = C12317a.f58995a.mo68640a("BiometricCompat_DeviceInfo").edit();
            edit.clear().commit();
            LastUpdatedTs lastUpdatedTs = LastUpdatedTs.INSTANCE;
            long timestamp = lastUpdatedTs.getTimestamp();
            SharedPreferences.Editor putStringSet = edit.putStringSet("sensors-" + timestamp, deviceInfo.getSensors());
            long timestamp2 = lastUpdatedTs.getTimestamp();
            SharedPreferences.Editor putString = putStringSet.putString("model-" + timestamp2, deviceInfo.getModel());
            long timestamp3 = lastUpdatedTs.getTimestamp();
            putString.putBoolean("checked-" + timestamp3, true).apply();
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }

    public final String[] getAgents() {
        return agents;
    }

    @WorkerThread
    public final void getDeviceInfo(OnDeviceInfoListener onDeviceInfoListener) {
        C13706o.m87929f(onDeviceInfoListener, "onDeviceInfoListener");
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            DeviceInfo cachedDeviceInfo2 = getCachedDeviceInfo();
            if (cachedDeviceInfo2 != null) {
                onDeviceInfoListener.onReady(cachedDeviceInfo2);
                return;
            }
            List<C13328m<String, String>> names = DeviceModel.INSTANCE.getNames();
            Iterator<C13328m<String, String>> it = names.iterator();
            while (true) {
                String str = null;
                if (it.hasNext()) {
                    C13328m next = it.next();
                    DeviceInfo loadDeviceInfo = loadDeviceInfo((String) next.mo70154c(), (String) next.mo70155d());
                    Set<String> sensors = loadDeviceInfo != null ? loadDeviceInfo.getSensors() : null;
                    if (!(sensors == null || sensors.isEmpty())) {
                        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
                        Object[] objArr = new Object[1];
                        if (loadDeviceInfo != null) {
                            str = loadDeviceInfo.getModel();
                        }
                        objArr[0] = "DeviceInfoManager: " + str + " -> " + loadDeviceInfo;
                        biometricLoggerImpl.mo68217d(objArr);
                        if (loadDeviceInfo != null) {
                            setCachedDeviceInfo(loadDeviceInfo);
                            onDeviceInfoListener.onReady(loadDeviceInfo);
                            return;
                        }
                    }
                } else if (!names.isEmpty()) {
                    DeviceInfo deviceInfo = new DeviceInfo((String) ((C13328m) C13566b0.m87402F0(names).get(0)).mo70154c(), new HashSet());
                    onDeviceInfoListener.onReady(deviceInfo);
                    setCachedDeviceInfo(deviceInfo);
                    return;
                } else {
                    onDeviceInfoListener.onReady((DeviceInfo) null);
                    return;
                }
            }
        } else {
            throw new IllegalThreadStateException("Worker thread required");
        }
    }

    public final boolean hasFaceID(DeviceInfo deviceInfo) {
        if ((deviceInfo != null ? deviceInfo.getSensors() : null) == null) {
            return false;
        }
        for (String lowerCase : deviceInfo.getSensors()) {
            Locale locale = Locale.ROOT;
            C13706o.m87928e(locale, "ROOT");
            String lowerCase2 = lowerCase.toLowerCase(locale);
            C13706o.m87928e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if ((C15177w.m93663N(lowerCase2, " id", false, 2, (Object) null) || C15177w.m93663N(lowerCase2, " scanner", false, 2, (Object) null) || C15177w.m93663N(lowerCase2, " recognition", false, 2, (Object) null) || C15177w.m93663N(lowerCase2, " unlock", false, 2, (Object) null) || C15177w.m93663N(lowerCase2, " auth", false, 2, (Object) null)) && C15177w.m93663N(lowerCase2, "face", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasFingerprint(DeviceInfo deviceInfo) {
        if ((deviceInfo != null ? deviceInfo.getSensors() : null) == null) {
            return false;
        }
        for (String lowerCase : deviceInfo.getSensors()) {
            Locale locale = Locale.ROOT;
            C13706o.m87928e(locale, "ROOT");
            String lowerCase2 = lowerCase.toLowerCase(locale);
            C13706o.m87928e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (C15177w.m93663N(lowerCase2, "fingerprint", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasIrisScanner(DeviceInfo deviceInfo) {
        if ((deviceInfo != null ? deviceInfo.getSensors() : null) == null) {
            return false;
        }
        for (String lowerCase : deviceInfo.getSensors()) {
            Locale locale = Locale.ROOT;
            C13706o.m87928e(locale, "ROOT");
            String lowerCase2 = lowerCase.toLowerCase(locale);
            C13706o.m87928e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if ((C15177w.m93663N(lowerCase2, " id", false, 2, (Object) null) || C15177w.m93663N(lowerCase2, " scanner", false, 2, (Object) null) || C15177w.m93663N(lowerCase2, " recognition", false, 2, (Object) null) || C15177w.m93663N(lowerCase2, " unlock", false, 2, (Object) null) || C15177w.m93663N(lowerCase2, " auth", false, 2, (Object) null)) && C15177w.m93663N(lowerCase2, "iris", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasUnderDisplayFingerprint(DeviceInfo deviceInfo) {
        if ((deviceInfo != null ? deviceInfo.getSensors() : null) == null) {
            return false;
        }
        for (String lowerCase : deviceInfo.getSensors()) {
            Locale locale = Locale.ROOT;
            C13706o.m87928e(locale, "ROOT");
            String lowerCase2 = lowerCase.toLowerCase(locale);
            C13706o.m87928e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (C15177w.m93663N(lowerCase2, "fingerprint", false, 2, (Object) null) && C15177w.m93663N(lowerCase2, "under display", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }
}
