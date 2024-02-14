package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.location.LocationRequestCompat;
import androidx.core.p007os.EnvironmentCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.android.p023dx.p026io.Opcodes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import javax.mail.UIDFolder;
import org.apache.commons.cli.HelpFormatter;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzen {

    /* renamed from: a */
    public static final int f34500a;

    /* renamed from: b */
    public static final String f34501b;

    /* renamed from: c */
    public static final String f34502c;

    /* renamed from: d */
    public static final String f34503d;

    /* renamed from: e */
    public static final String f34504e;

    /* renamed from: f */
    public static final byte[] f34505f = new byte[0];

    /* renamed from: g */
    private static final Pattern f34506g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* renamed from: h */
    private static final Pattern f34507h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    /* renamed from: i */
    private static final Pattern f34508i = Pattern.compile("%([A-Fa-f0-9]{2})");

    /* renamed from: j */
    private static final Pattern f34509j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
    @Nullable

    /* renamed from: k */
    private static HashMap f34510k;

    /* renamed from: l */
    private static final String[] f34511l = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};

    /* renamed from: m */
    private static final String[] f34512m = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};

    /* renamed from: n */
    private static final int[] f34513n = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    /* renamed from: o */
    private static final int[] f34514o = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, Opcodes.SHL_INT_LIT8, 231, 238, 233, 252, 251, 242, 245, Opcodes.ADD_INT_LIT8, Opcodes.XOR_INT_LIT8, Opcodes.OR_INT_LIT16, Opcodes.RSUB_INT, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, Opcodes.DIV_INT_LIT8, Opcodes.REM_INT_LIT8, Opcodes.AND_INT_LIT16, Opcodes.MUL_INT_LIT16, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, Opcodes.USHR_INT_LIT8, 235, 236, 193, 198, 207, 200, Opcodes.AND_INT_LIT8, Opcodes.MUL_INT_LIT8, Opcodes.DIV_INT_LIT16, Opcodes.REM_INT_LIT16, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, Opcodes.OR_INT_LIT8, Opcodes.RSUB_INT_LIT8, Opcodes.ADD_INT_LIT16, Opcodes.XOR_INT_LIT16, 194, 197, 204, 203, 230, Opcodes.SHR_INT_LIT8, 232, 239, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 253, 244, 243};

    static {
        int i = Build.VERSION.SDK_INT;
        f34500a = i;
        String str = Build.DEVICE;
        f34501b = str;
        String str2 = Build.MANUFACTURER;
        f34502c = str2;
        String str3 = Build.MODEL;
        f34503d = str3;
        f34504e = str + ", " + str3 + ", " + str2 + ", " + i;
    }

    /* renamed from: A */
    public static float m49126A(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* renamed from: B */
    public static byte[] m49127B(String str) {
        return str.getBytes(zzfsk.f36339c);
    }

    /* renamed from: C */
    public static byte[] m49128C(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: D */
    public static Object[] m49129D(Object[] objArr) {
        return objArr;
    }

    /* renamed from: E */
    public static Object[] m49130E(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    /* renamed from: F */
    public static Object[] m49131F(Object[] objArr, int i) {
        zzdd.m47210d(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    /* renamed from: G */
    public static String[] m49132G() {
        String[] strArr;
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (f34500a >= 24) {
            strArr = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            strArr = new String[]{m49175n(configuration.locale)};
        }
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = m49177p(strArr[i]);
        }
        return strArr;
    }

    /* renamed from: H */
    public static String[] m49133H(String str, String str2) {
        return str.split(str2, -1);
    }

    /* renamed from: I */
    public static String[] m49134I(String str, String str2) {
        return str.split(str2, 2);
    }

    @Nullable
    /* renamed from: J */
    private static String m49135J(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e) {
            zzdw.m48253c("Util", "Failed to read system property ".concat(str), e);
            return null;
        }
    }

    /* renamed from: K */
    private static HashMap m49136K() {
        int length = f34511l.length;
        HashMap hashMap = new HashMap(r2 + 88);
        int i = 0;
        for (String str : Locale.getISOLanguages()) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f34511l;
            int length2 = strArr.length;
            if (i >= 88) {
                return hashMap;
            }
            hashMap.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m49137L(long[] r3, long r4, boolean r6, boolean r7) {
        /*
            int r7 = java.util.Arrays.binarySearch(r3, r4)
            if (r7 >= 0) goto L_0x0008
            int r3 = ~r7
            goto L_0x0016
        L_0x0008:
            int r7 = r7 + 1
            int r0 = r3.length
            if (r7 >= r0) goto L_0x0013
            r0 = r3[r7]
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0008
        L_0x0013:
            if (r6 != 0) goto L_0x0017
            r3 = r7
        L_0x0016:
            return r3
        L_0x0017:
            int r7 = r7 + -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzen.m49137L(long[], long, boolean, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m49138M(int[] r2, int r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Arrays.binarySearch(r2, r3)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r2 = -r0
            goto L_0x0018
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0012
            r1 = r2[r0]
            if (r1 == r3) goto L_0x000a
        L_0x0012:
            if (r4 == 0) goto L_0x0017
            int r2 = r0 + 1
            goto L_0x0018
        L_0x0017:
            r2 = r0
        L_0x0018:
            if (r5 == 0) goto L_0x001f
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzen.m49138M(int[], int, boolean, boolean):int");
    }

    /* renamed from: N */
    public static int m49139N(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0 || jArr[binarySearch] != j) {
                    i = binarySearch + 1;
                }
                binarySearch--;
                break;
            } while (jArr[binarySearch] != j);
            i = binarySearch + 1;
        }
        return z2 ? Math.max(0, i) : i;
    }

    /* renamed from: O */
    public static int m49140O(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: P */
    public static int m49141P(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* renamed from: Q */
    public static int m49142Q(byte[] bArr, int i, int i2, int i3) {
        int i4 = -1;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = f34513n[(i4 >>> 24) ^ (bArr[i5] & 255)] ^ (i4 << 8);
        }
        return i4;
    }

    /* renamed from: R */
    public static int m49143R(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i < i2) {
            i4 = f34514o[i4 ^ (bArr[i] & 255)];
            i++;
        }
        return i4;
    }

    @RequiresApi(21)
    /* renamed from: S */
    public static int m49144S(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    /* renamed from: T */
    public static int m49145T(int i) {
        if (i == 12) {
            return f34500a >= 32 ? 743676 : 0;
        }
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return Opcodes.REM_INT_LIT8;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i2 = f34500a;
                return (i2 < 23 && i2 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    /* renamed from: U */
    public static int m49146U(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i2 : Integer.reverseBytes(i2);
    }

    /* renamed from: V */
    public static int m49147V(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    /* renamed from: W */
    public static int m49148W(@Nullable String str) {
        String[] split;
        int length;
        int i = 0;
        if (str == null || (length = split.length) < 2) {
            return 0;
        }
        String str2 = (split = str.split("_", -1))[length - 1];
        boolean z = length >= 3 && "neg".equals(split[length + -2]);
        Objects.requireNonNull(str2);
        try {
            i = Integer.parseInt(str2);
            if (z) {
                return -i;
            }
        } catch (NumberFormatException unused) {
        }
        return i;
    }

    /* renamed from: X */
    public static int m49149X(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    /* renamed from: Y */
    public static int m49150Y(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                if (i != 268435456) {
                    if (i == 536870912) {
                        return i2 * 3;
                    }
                    if (i != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i2 * 4;
        }
        return i2 + i2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m49151Z(android.net.Uri r7) {
        /*
            java.lang.String r0 = r7.getScheme()
            r1 = 3
            if (r0 == 0) goto L_0x0011
            java.lang.String r2 = "rtsp"
            boolean r0 = com.google.android.gms.internal.ads.zzfse.m50917c(r2, r0)
            if (r0 != 0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            return r1
        L_0x0011:
            java.lang.String r0 = r7.getLastPathSegment()
            r2 = 4
            if (r0 != 0) goto L_0x0019
            return r2
        L_0x0019:
            r3 = 46
            int r3 = r0.lastIndexOf(r3)
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 < 0) goto L_0x0071
            int r3 = r3 + r6
            java.lang.String r0 = r0.substring(r3)
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfse.m50915a(r0)
            int r3 = r0.hashCode()
            switch(r3) {
                case 104579: goto L_0x0053;
                case 108321: goto L_0x0049;
                case 3242057: goto L_0x003f;
                case 3299913: goto L_0x0035;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x005d
        L_0x0035:
            java.lang.String r3 = "m3u8"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x005d
            r0 = 1
            goto L_0x005e
        L_0x003f:
            java.lang.String r3 = "isml"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x005d
            r0 = 3
            goto L_0x005e
        L_0x0049:
            java.lang.String r3 = "mpd"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x005d
            r0 = 0
            goto L_0x005e
        L_0x0053:
            java.lang.String r3 = "ism"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x005d
            r0 = 2
            goto L_0x005e
        L_0x005d:
            r0 = -1
        L_0x005e:
            if (r0 == 0) goto L_0x006c
            if (r0 == r6) goto L_0x006a
            if (r0 == r5) goto L_0x0068
            if (r0 == r1) goto L_0x0068
            r0 = 4
            goto L_0x006d
        L_0x0068:
            r0 = 1
            goto L_0x006d
        L_0x006a:
            r0 = 2
            goto L_0x006d
        L_0x006c:
            r0 = 0
        L_0x006d:
            if (r0 != r2) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            return r0
        L_0x0071:
            java.util.regex.Pattern r0 = f34509j
            java.lang.String r7 = r7.getPath()
            java.util.Objects.requireNonNull(r7)
            java.util.regex.Matcher r7 = r0.matcher(r7)
            boolean r0 = r7.matches()
            if (r0 == 0) goto L_0x009d
            java.lang.String r7 = r7.group(r5)
            if (r7 == 0) goto L_0x009c
            java.lang.String r0 = "format=mpd-time-csf"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x0093
            return r4
        L_0x0093:
            java.lang.String r0 = "format=m3u8-aapl"
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L_0x009c
            return r5
        L_0x009c:
            return r6
        L_0x009d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzen.m49151Z(android.net.Uri):int");
    }

    @Nullable
    /* renamed from: a */
    public static Intent m49152a(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (f34500a < 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, 4);
    }

    /* renamed from: a0 */
    public static long m49153a0(long j, long j2, long j3) {
        long j4 = j + j2;
        return ((j ^ j4) & (j2 ^ j4)) < 0 ? LocationRequestCompat.PASSIVE_INTERVAL : j4;
    }

    /* renamed from: b */
    public static Point m49154b(Context context) {
        String str;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            Objects.requireNonNull(windowManager);
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && m49185x(context)) {
            if (f34500a < 28) {
                str = m49135J("sys.display-size");
            } else {
                str = m49135J("vendor.display-size");
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] split = str.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                zzdw.m48252b("Util", "Invalid display size: ".concat(String.valueOf(str)));
            }
            if ("Sony".equals(f34502c) && f34503d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (f34500a >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            return point;
        }
        display.getRealSize(point);
        return point;
    }

    /* renamed from: b0 */
    public static long m49155b0(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    /* renamed from: c */
    public static Handler m49156c(Looper looper, @Nullable Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* renamed from: c0 */
    public static long m49157c0(long j, float f) {
        return f == 1.0f ? j : Math.round(((double) j) * ((double) f));
    }

    /* renamed from: d */
    public static Handler m49158d(@Nullable Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        zzdd.m47208b(myLooper);
        return new Handler(myLooper, (Handler.Callback) null);
    }

    /* renamed from: d0 */
    public static long m49159d0(long j) {
        if (j == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j + SystemClock.elapsedRealtime();
    }

    /* renamed from: e */
    public static Looper m49160e() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return myLooper;
        }
        return Looper.getMainLooper();
    }

    /* renamed from: e0 */
    public static long m49161e0(long j, float f) {
        return f == 1.0f ? j : Math.round(((double) j) / ((double) f));
    }

    /* renamed from: f */
    public static zzaf m49162f(int i, int i2, int i3) {
        zzad zzad = new zzad();
        zzad.mo41343s("audio/raw");
        zzad.mo41326e0(i2);
        zzad.mo41344t(i3);
        zzad.mo41338n(i);
        return zzad.mo41349y();
    }

    /* renamed from: f0 */
    public static long m49163f0(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0068 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0037  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzcc m49164g(com.google.android.gms.internal.ads.zzcg r11, com.google.android.gms.internal.ads.zzcc r12) {
        /*
            boolean r0 = r11.mo43526p()
            boolean r1 = r11.mo43512a()
            r2 = r11
            com.google.android.gms.internal.ads.zzm r2 = (com.google.android.gms.internal.ads.zzm) r2
            com.google.android.gms.internal.ads.zzcn r3 = r2.mo43525n()
            boolean r4 = r3.mo44135o()
            r5 = -1
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x001a
        L_0x0018:
            r3 = 0
            goto L_0x002b
        L_0x001a:
            int r4 = r2.mo43514c()
            r2.mo43519h()
            r2.mo43527q()
            int r3 = r3.mo44131k(r4, r7, r7)
            if (r3 == r5) goto L_0x0018
            r3 = 1
        L_0x002b:
            com.google.android.gms.internal.ads.zzcn r4 = r2.mo43525n()
            boolean r8 = r4.mo44135o()
            if (r8 == 0) goto L_0x0037
        L_0x0035:
            r2 = 0
            goto L_0x0048
        L_0x0037:
            int r8 = r2.mo43514c()
            r2.mo43519h()
            r2.mo43527q()
            int r2 = r4.mo44130j(r8, r7, r7)
            if (r2 == r5) goto L_0x0035
            r2 = 1
        L_0x0048:
            boolean r4 = r11.zzb()
            boolean r5 = r11.zza()
            com.google.android.gms.internal.ads.zzcn r11 = r11.mo43525n()
            boolean r11 = r11.mo44135o()
            com.google.android.gms.internal.ads.zzca r8 = new com.google.android.gms.internal.ads.zzca
            r8.<init>()
            r8.mo43242b(r12)
            r12 = 4
            r9 = r0 ^ 1
            r8.mo43244d(r12, r9)
            if (r1 == 0) goto L_0x006c
            if (r0 != 0) goto L_0x006c
            r12 = 1
            goto L_0x006d
        L_0x006c:
            r12 = 0
        L_0x006d:
            r10 = 5
            r8.mo43244d(r10, r12)
            if (r3 == 0) goto L_0x0077
            if (r0 != 0) goto L_0x0077
            r12 = 1
            goto L_0x0078
        L_0x0077:
            r12 = 0
        L_0x0078:
            r10 = 6
            r8.mo43244d(r10, r12)
            if (r11 != 0) goto L_0x0088
            if (r3 != 0) goto L_0x0084
            if (r4 == 0) goto L_0x0084
            if (r1 == 0) goto L_0x0088
        L_0x0084:
            if (r0 != 0) goto L_0x0088
            r12 = 1
            goto L_0x0089
        L_0x0088:
            r12 = 0
        L_0x0089:
            r3 = 7
            r8.mo43244d(r3, r12)
            if (r2 == 0) goto L_0x0093
            if (r0 != 0) goto L_0x0093
            r12 = 1
            goto L_0x0094
        L_0x0093:
            r12 = 0
        L_0x0094:
            r3 = 8
            r8.mo43244d(r3, r12)
            if (r11 != 0) goto L_0x00a5
            if (r2 != 0) goto L_0x00a1
            if (r4 == 0) goto L_0x00a5
            if (r5 == 0) goto L_0x00a5
        L_0x00a1:
            if (r0 != 0) goto L_0x00a5
            r11 = 1
            goto L_0x00a6
        L_0x00a5:
            r11 = 0
        L_0x00a6:
            r12 = 9
            r8.mo43244d(r12, r11)
            r11 = 10
            r8.mo43244d(r11, r9)
            if (r1 == 0) goto L_0x00b6
            if (r0 != 0) goto L_0x00b6
            r11 = 1
            goto L_0x00b7
        L_0x00b6:
            r11 = 0
        L_0x00b7:
            r12 = 11
            r8.mo43244d(r12, r11)
            if (r1 == 0) goto L_0x00c1
            if (r0 != 0) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r6 = 0
        L_0x00c2:
            r11 = 12
            r8.mo43244d(r11, r6)
            com.google.android.gms.internal.ads.zzcc r11 = r8.mo43245e()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzen.m49164g(com.google.android.gms.internal.ads.zzcg, com.google.android.gms.internal.ads.zzcc):com.google.android.gms.internal.ads.zzcc");
    }

    /* renamed from: g0 */
    public static long m49165g0(long j, long j2, long j3) {
        int i = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        if (i < 0 || j3 % j2 != 0) {
            return (i >= 0 || j2 % j3 != 0) ? (long) (((double) j) * (((double) j2) / ((double) j3))) : j * (j2 / j3);
        }
        return j / (j3 / j2);
    }

    /* renamed from: h */
    public static Object m49166h(@Nullable Object obj) {
        return obj;
    }

    /* renamed from: h0 */
    public static long m49167h0(long j, long j2, long j3) {
        long j4 = j - j2;
        if (((j ^ j4) & (j2 ^ j)) < 0) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    /* renamed from: i */
    public static String m49168i(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: i0 */
    public static long m49169i0(int i, int i2) {
        return (((long) i2) & UIDFolder.MAXUID) | ((((long) i) & UIDFolder.MAXUID) << 32);
    }

    /* renamed from: j */
    public static String m49170j(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, zzfsk.f36339c);
    }

    /* renamed from: j0 */
    public static long m49171j0(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    /* renamed from: k */
    public static String m49172k(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int length = objArr.length;
            if (i >= length) {
                return sb.toString();
            }
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }

    /* renamed from: l */
    public static String m49173l(@Nullable Context context) {
        TelephonyManager telephonyManager;
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null)) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return zzfse.m50916b(networkCountryIso);
            }
        }
        return zzfse.m50916b(Locale.getDefault().getCountry());
    }

    /* renamed from: m */
    public static String m49174m(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    /* renamed from: n */
    public static String m49175n(Locale locale) {
        if (f34500a >= 21) {
            return locale.toLanguageTag();
        }
        return locale.toString();
    }

    /* renamed from: o */
    public static String m49176o(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return EnvironmentCompat.MEDIA_UNKNOWN;
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    /* renamed from: p */
    public static String m49177p(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String a = zzfse.m50915a(str);
        int i = 0;
        String str2 = a.split(HelpFormatter.DEFAULT_OPT_PREFIX, 2)[0];
        if (f34510k == null) {
            f34510k = m49136K();
        }
        String str3 = (String) f34510k.get(str2);
        if (str3 != null) {
            a = str3.concat(String.valueOf(a.substring(str2.length())));
            str2 = str3;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return a;
        }
        while (true) {
            String[] strArr = f34512m;
            int length = strArr.length;
            if (i >= 18) {
                return a;
            }
            if (a.startsWith(strArr[i])) {
                return String.valueOf(strArr[i + 1]).concat(String.valueOf(a.substring(strArr[i].length())));
            }
            i += 2;
        }
    }

    /* renamed from: q */
    public static ExecutorService m49178q(String str) {
        return Executors.newSingleThreadExecutor(new zzem(str));
    }

    /* renamed from: r */
    public static void m49179r(long[] jArr, long j, long j2) {
        int i = 0;
        int i2 = (j2 > 1000000 ? 1 : (j2 == 1000000 ? 0 : -1));
        if (i2 >= 0 && j2 % 1000000 == 0) {
            long j3 = j2 / 1000000;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j3;
                i++;
            }
        } else if (i2 >= 0 || 1000000 % j2 != 0) {
            double d = 1000000.0d / ((double) j2);
            while (i < jArr.length) {
                jArr[i] = (long) (((double) jArr[i]) * d);
                i++;
            }
        } else {
            long j4 = 1000000 / j2;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j4;
                i++;
            }
        }
    }

    /* renamed from: s */
    public static void m49180s(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: t */
    public static boolean m49181t(@Nullable Object obj, @Nullable Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: u */
    public static boolean m49182u(int i) {
        return i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: v */
    public static boolean m49183v(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: w */
    public static boolean m49184w(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    /* renamed from: x */
    public static boolean m49185x(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: y */
    public static boolean m49186y(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    /* renamed from: z */
    public static boolean m49187z(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
