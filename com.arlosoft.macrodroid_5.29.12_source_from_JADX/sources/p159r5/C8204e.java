package p159r5;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.android.p023dx.p026io.Opcodes;
import com.firebase.p073ui.auth.data.model.CountryInfo;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p127l5.C7687a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: r5.e */
/* compiled from: PhoneNumberUtils */
public final class C8204e {

    /* renamed from: a */
    private static final String f19885a = String.valueOf(1);

    /* renamed from: b */
    private static final Locale f19886b;

    /* renamed from: c */
    private static final CountryInfo f19887c;

    /* renamed from: d */
    private static final SparseArray<List<String>> f19888d = m34048a();

    /* renamed from: e */
    private static Map<String, Integer> f19889e;

    static {
        Locale locale = Locale.US;
        f19886b = locale;
        f19887c = new CountryInfo(locale, 1);
    }

    /* renamed from: a */
    private static SparseArray<List<String>> m34048a() {
        SparseArray<List<String>> sparseArray = new SparseArray<>(Opcodes.XOR_INT_LIT16);
        sparseArray.put(1, Arrays.asList(new String[]{"US", "AG", "AI", "AS", "BB", "BM", "BS", "CA", "DM", "DO", "GD", "GU", "JM", "KN", "KY", "LC", "MP", "MS", "PR", "SX", "TC", "TT", "VC", "VG", "VI"}));
        sparseArray.put(7, Arrays.asList(new String[]{"RU", "KZ"}));
        sparseArray.put(20, Collections.singletonList("EG"));
        sparseArray.put(27, Collections.singletonList("ZA"));
        sparseArray.put(30, Collections.singletonList("GR"));
        sparseArray.put(31, Collections.singletonList("NL"));
        sparseArray.put(32, Collections.singletonList("BE"));
        sparseArray.put(33, Collections.singletonList("FR"));
        sparseArray.put(34, Collections.singletonList("ES"));
        sparseArray.put(36, Collections.singletonList("HU"));
        sparseArray.put(39, Collections.singletonList("IT"));
        sparseArray.put(40, Collections.singletonList("RO"));
        sparseArray.put(41, Collections.singletonList("CH"));
        sparseArray.put(43, Collections.singletonList("AT"));
        sparseArray.put(44, Arrays.asList(new String[]{"GB", "GG", "IM", "JE"}));
        sparseArray.put(45, Collections.singletonList("DK"));
        sparseArray.put(46, Collections.singletonList("SE"));
        sparseArray.put(47, Arrays.asList(new String[]{"NO", "SJ"}));
        sparseArray.put(48, Collections.singletonList("PL"));
        sparseArray.put(49, Collections.singletonList("DE"));
        sparseArray.put(51, Collections.singletonList("PE"));
        sparseArray.put(52, Collections.singletonList("MX"));
        sparseArray.put(53, Collections.singletonList("CU"));
        sparseArray.put(54, Collections.singletonList("AR"));
        sparseArray.put(55, Collections.singletonList("BR"));
        sparseArray.put(56, Collections.singletonList("CL"));
        sparseArray.put(57, Collections.singletonList("CO"));
        sparseArray.put(58, Collections.singletonList("VE"));
        sparseArray.put(60, Collections.singletonList("MY"));
        sparseArray.put(61, Arrays.asList(new String[]{"AU", "CC", "CX"}));
        sparseArray.put(62, Collections.singletonList("ID"));
        sparseArray.put(63, Collections.singletonList("PH"));
        sparseArray.put(64, Collections.singletonList("NZ"));
        sparseArray.put(65, Collections.singletonList("SG"));
        sparseArray.put(66, Collections.singletonList("TH"));
        sparseArray.put(81, Collections.singletonList("JP"));
        sparseArray.put(82, Collections.singletonList("KR"));
        sparseArray.put(84, Collections.singletonList("VN"));
        sparseArray.put(86, Collections.singletonList("CN"));
        sparseArray.put(90, Collections.singletonList("TR"));
        sparseArray.put(91, Collections.singletonList("IN"));
        sparseArray.put(92, Collections.singletonList("PK"));
        sparseArray.put(93, Collections.singletonList("AF"));
        sparseArray.put(94, Collections.singletonList("LK"));
        sparseArray.put(95, Collections.singletonList("MM"));
        sparseArray.put(98, Collections.singletonList("IR"));
        sparseArray.put(Opcodes.DIV_INT_LIT16, Collections.singletonList("SS"));
        sparseArray.put(Opcodes.REM_INT_LIT16, Arrays.asList(new String[]{"MA", "EH"}));
        sparseArray.put(Opcodes.AND_INT_LIT16, Collections.singletonList("DZ"));
        sparseArray.put(Opcodes.ADD_INT_LIT8, Collections.singletonList("TN"));
        sparseArray.put(Opcodes.MUL_INT_LIT8, Collections.singletonList("LY"));
        sparseArray.put(Opcodes.REM_INT_LIT8, Collections.singletonList("GM"));
        sparseArray.put(Opcodes.AND_INT_LIT8, Collections.singletonList("SN"));
        sparseArray.put(Opcodes.OR_INT_LIT8, Collections.singletonList("MR"));
        sparseArray.put(Opcodes.XOR_INT_LIT8, Collections.singletonList("ML"));
        sparseArray.put(Opcodes.SHL_INT_LIT8, Collections.singletonList("GN"));
        sparseArray.put(Opcodes.SHR_INT_LIT8, Collections.singletonList("CI"));
        sparseArray.put(Opcodes.USHR_INT_LIT8, Collections.singletonList("BF"));
        sparseArray.put(227, Collections.singletonList("NE"));
        sparseArray.put(228, Collections.singletonList("TG"));
        sparseArray.put(229, Collections.singletonList("BJ"));
        sparseArray.put(230, Collections.singletonList("MU"));
        sparseArray.put(231, Collections.singletonList("LR"));
        sparseArray.put(232, Collections.singletonList("SL"));
        sparseArray.put(233, Collections.singletonList("GH"));
        sparseArray.put(234, Collections.singletonList("NG"));
        sparseArray.put(235, Collections.singletonList("TD"));
        sparseArray.put(236, Collections.singletonList("CF"));
        sparseArray.put(237, Collections.singletonList("CM"));
        sparseArray.put(238, Collections.singletonList("CV"));
        sparseArray.put(239, Collections.singletonList("ST"));
        sparseArray.put(240, Collections.singletonList("GQ"));
        sparseArray.put(241, Collections.singletonList("GA"));
        sparseArray.put(242, Collections.singletonList("CG"));
        sparseArray.put(243, Collections.singletonList("CD"));
        sparseArray.put(244, Collections.singletonList("AO"));
        sparseArray.put(245, Collections.singletonList("GW"));
        sparseArray.put(246, Collections.singletonList("IO"));
        sparseArray.put(247, Collections.singletonList("AC"));
        sparseArray.put(248, Collections.singletonList("SC"));
        sparseArray.put(249, Collections.singletonList("SD"));
        sparseArray.put(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, Collections.singletonList("RW"));
        sparseArray.put(251, Collections.singletonList("ET"));
        sparseArray.put(252, Collections.singletonList("SO"));
        sparseArray.put(253, Collections.singletonList("DJ"));
        sparseArray.put(254, Collections.singletonList("KE"));
        sparseArray.put(255, Collections.singletonList("TZ"));
        sparseArray.put(256, Collections.singletonList("UG"));
        sparseArray.put(257, Collections.singletonList("BI"));
        sparseArray.put(258, Collections.singletonList("MZ"));
        sparseArray.put(260, Collections.singletonList("ZM"));
        sparseArray.put(261, Collections.singletonList("MG"));
        sparseArray.put(262, Arrays.asList(new String[]{"RE", "YT"}));
        sparseArray.put(263, Collections.singletonList("ZW"));
        sparseArray.put(264, Collections.singletonList("NA"));
        sparseArray.put(265, Collections.singletonList("MW"));
        sparseArray.put(266, Collections.singletonList("LS"));
        sparseArray.put(267, Collections.singletonList("BW"));
        sparseArray.put(268, Collections.singletonList("SZ"));
        sparseArray.put(269, Collections.singletonList("KM"));
        sparseArray.put(290, Arrays.asList(new String[]{"SH", "TA"}));
        sparseArray.put(291, Collections.singletonList("ER"));
        sparseArray.put(297, Collections.singletonList("AW"));
        sparseArray.put(298, Collections.singletonList("FO"));
        sparseArray.put(299, Collections.singletonList("GL"));
        sparseArray.put(350, Collections.singletonList("GI"));
        sparseArray.put(351, Collections.singletonList("PT"));
        sparseArray.put(352, Collections.singletonList("LU"));
        sparseArray.put(353, Collections.singletonList("IE"));
        sparseArray.put(354, Collections.singletonList("IS"));
        sparseArray.put(355, Collections.singletonList("AL"));
        sparseArray.put(356, Collections.singletonList("MT"));
        sparseArray.put(357, Collections.singletonList("CY"));
        sparseArray.put(358, Arrays.asList(new String[]{"FI", "AX"}));
        sparseArray.put(359, Collections.singletonList("BG"));
        sparseArray.put(370, Collections.singletonList("LT"));
        sparseArray.put(371, Collections.singletonList("LV"));
        sparseArray.put(372, Collections.singletonList("EE"));
        sparseArray.put(373, Collections.singletonList("MD"));
        sparseArray.put(374, Collections.singletonList("AM"));
        sparseArray.put(375, Collections.singletonList("BY"));
        sparseArray.put(376, Collections.singletonList("AD"));
        sparseArray.put(377, Collections.singletonList("MC"));
        sparseArray.put(378, Collections.singletonList("SM"));
        sparseArray.put(379, Collections.singletonList("VA"));
        sparseArray.put(380, Collections.singletonList("UA"));
        sparseArray.put(381, Collections.singletonList("RS"));
        sparseArray.put(382, Collections.singletonList("ME"));
        sparseArray.put(383, Collections.singletonList("XK"));
        sparseArray.put(385, Collections.singletonList("HR"));
        sparseArray.put(386, Collections.singletonList("SI"));
        sparseArray.put(387, Collections.singletonList("BA"));
        sparseArray.put(389, Collections.singletonList("MK"));
        sparseArray.put(420, Collections.singletonList("CZ"));
        sparseArray.put(TypedValues.Cycle.TYPE_WAVE_SHAPE, Collections.singletonList("SK"));
        sparseArray.put(423, Collections.singletonList("LI"));
        sparseArray.put(500, Collections.singletonList("FK"));
        sparseArray.put(501, Collections.singletonList("BZ"));
        sparseArray.put(502, Collections.singletonList("GT"));
        sparseArray.put(503, Collections.singletonList("SV"));
        sparseArray.put(504, Collections.singletonList("HN"));
        sparseArray.put(505, Collections.singletonList("NI"));
        sparseArray.put(TypedValues.Position.TYPE_PERCENT_X, Collections.singletonList("CR"));
        sparseArray.put(507, Collections.singletonList("PA"));
        sparseArray.put(TypedValues.Position.TYPE_CURVE_FIT, Collections.singletonList("PM"));
        sparseArray.put(509, Collections.singletonList("HT"));
        sparseArray.put(590, Arrays.asList(new String[]{"GP", "BL", "MF"}));
        sparseArray.put(591, Collections.singletonList("BO"));
        sparseArray.put(592, Collections.singletonList("GY"));
        sparseArray.put(593, Collections.singletonList(KeyPropertiesCompact.KEY_ALGORITHM_EC));
        sparseArray.put(594, Collections.singletonList("GF"));
        sparseArray.put(595, Collections.singletonList("PY"));
        sparseArray.put(596, Collections.singletonList("MQ"));
        sparseArray.put(597, Collections.singletonList("SR"));
        sparseArray.put(598, Collections.singletonList("UY"));
        sparseArray.put(599, Arrays.asList(new String[]{"CW", "BQ"}));
        sparseArray.put(670, Collections.singletonList("TL"));
        sparseArray.put(672, Collections.singletonList("NF"));
        sparseArray.put(673, Collections.singletonList("BN"));
        sparseArray.put(674, Collections.singletonList("NR"));
        sparseArray.put(675, Collections.singletonList("PG"));
        sparseArray.put(676, Collections.singletonList("TO"));
        sparseArray.put(677, Collections.singletonList("SB"));
        sparseArray.put(678, Collections.singletonList("VU"));
        sparseArray.put(679, Collections.singletonList("FJ"));
        sparseArray.put(680, Collections.singletonList("PW"));
        sparseArray.put(681, Collections.singletonList("WF"));
        sparseArray.put(682, Collections.singletonList("CK"));
        sparseArray.put(683, Collections.singletonList("NU"));
        sparseArray.put(685, Collections.singletonList("WS"));
        sparseArray.put(686, Collections.singletonList("KI"));
        sparseArray.put(687, Collections.singletonList("NC"));
        sparseArray.put(688, Collections.singletonList("TV"));
        sparseArray.put(689, Collections.singletonList("PF"));
        sparseArray.put(690, Collections.singletonList("TK"));
        sparseArray.put(691, Collections.singletonList("FM"));
        sparseArray.put(692, Collections.singletonList("MH"));
        sparseArray.put(800, Collections.singletonList("001"));
        sparseArray.put(808, Collections.singletonList("001"));
        sparseArray.put(850, Collections.singletonList("KP"));
        sparseArray.put(852, Collections.singletonList("HK"));
        sparseArray.put(853, Collections.singletonList("MO"));
        sparseArray.put(855, Collections.singletonList("KH"));
        sparseArray.put(856, Collections.singletonList("LA"));
        sparseArray.put(870, Collections.singletonList("001"));
        sparseArray.put(878, Collections.singletonList("001"));
        sparseArray.put(880, Collections.singletonList("BD"));
        sparseArray.put(881, Collections.singletonList("001"));
        sparseArray.put(882, Collections.singletonList("001"));
        sparseArray.put(883, Collections.singletonList("001"));
        sparseArray.put(886, Collections.singletonList("TW"));
        sparseArray.put(888, Collections.singletonList("001"));
        sparseArray.put(960, Collections.singletonList("MV"));
        sparseArray.put(961, Collections.singletonList("LB"));
        sparseArray.put(962, Collections.singletonList("JO"));
        sparseArray.put(963, Collections.singletonList("SY"));
        sparseArray.put(964, Collections.singletonList("IQ"));
        sparseArray.put(965, Collections.singletonList("KW"));
        sparseArray.put(966, Collections.singletonList("SA"));
        sparseArray.put(967, Collections.singletonList("YE"));
        sparseArray.put(968, Collections.singletonList("OM"));
        sparseArray.put(970, Collections.singletonList("PS"));
        sparseArray.put(971, Collections.singletonList("AE"));
        sparseArray.put(972, Collections.singletonList("IL"));
        sparseArray.put(973, Collections.singletonList("BH"));
        sparseArray.put(974, Collections.singletonList("QA"));
        sparseArray.put(975, Collections.singletonList("BT"));
        sparseArray.put(976, Collections.singletonList("MN"));
        sparseArray.put(977, Collections.singletonList("NP"));
        sparseArray.put(979, Collections.singletonList("001"));
        sparseArray.put(992, Collections.singletonList("TJ"));
        sparseArray.put(993, Collections.singletonList("TM"));
        sparseArray.put(994, Collections.singletonList("AZ"));
        sparseArray.put(995, Collections.singletonList("GE"));
        sparseArray.put(996, Collections.singletonList("KG"));
        sparseArray.put(998, Collections.singletonList("UZ"));
        return sparseArray;
    }

    /* renamed from: b */
    public static String m34049b(@NonNull String str, @NonNull CountryInfo countryInfo) {
        if (str.startsWith("+")) {
            return str;
        }
        return "+" + String.valueOf(countryInfo.mo34128d()) + str.replaceAll("[^\\d.]", "");
    }

    @Nullable
    /* renamed from: c */
    public static String m34050c(@NonNull String str, Context context) {
        return m34049b(str, m34056i(context));
    }

    @Nullable
    /* renamed from: d */
    public static Integer m34051d(String str) {
        if (f19889e == null) {
            m34062o();
        }
        if (str == null) {
            return null;
        }
        return f19889e.get(str.toUpperCase(Locale.getDefault()));
    }

    @Nullable
    /* renamed from: e */
    private static String m34052e(String str) {
        String replaceFirst = str.replaceFirst("^\\+", "");
        int length = replaceFirst.length();
        int i = 1;
        while (i <= 3 && i <= length) {
            String substring = replaceFirst.substring(0, i);
            if (f19888d.indexOfKey(Integer.valueOf(substring).intValue()) >= 0) {
                return substring;
            }
            i++;
        }
        return null;
    }

    @NonNull
    /* renamed from: f */
    private static String m34053f(String str) {
        String e = m34052e(str);
        return e == null ? f19885a : e;
    }

    /* renamed from: g */
    private static String m34054g(String str) {
        List list = f19888d.get(Integer.parseInt(str));
        if (list != null) {
            return (String) list.get(0);
        }
        return f19886b.getCountry();
    }

    @Nullable
    /* renamed from: h */
    public static List<String> m34055h(String str) {
        if (!m34063p(str)) {
            return null;
        }
        return f19888d.get(Integer.parseInt(str.substring(1)));
    }

    @NonNull
    /* renamed from: i */
    public static CountryInfo m34056i(@NonNull Context context) {
        Locale n = m34061n(context);
        if (n == null) {
            n = m34058k();
        }
        if (n == null) {
            return f19887c;
        }
        Integer d = m34051d(n.getCountry());
        return d == null ? f19887c : new CountryInfo(n, d.intValue());
    }

    /* renamed from: j */
    public static Map<String, Integer> m34057j() {
        if (f19889e == null) {
            m34062o();
        }
        return f19889e;
    }

    /* renamed from: k */
    private static Locale m34058k() {
        return Locale.getDefault();
    }

    /* renamed from: l */
    public static C7687a m34059l(@NonNull String str) {
        String str2 = f19885a;
        String country = f19886b.getCountry();
        if (str.startsWith("+")) {
            str2 = m34053f(str);
            country = m34054g(str2);
            str = m34065r(str, str2);
        }
        return new C7687a(str, country, str2);
    }

    /* renamed from: m */
    public static C7687a m34060m(@NonNull String str, @NonNull String str2) {
        int d = m34051d(str);
        if (d == null) {
            d = 1;
            str = f19885a;
        }
        return new C7687a(m34066s(str2), str, String.valueOf(d));
    }

    /* renamed from: n */
    private static Locale m34061n(@NonNull Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String simCountryIso = telephonyManager != null ? telephonyManager.getSimCountryIso() : null;
        if (TextUtils.isEmpty(simCountryIso)) {
            return null;
        }
        return new Locale("", simCountryIso);
    }

    /* renamed from: o */
    private static void m34062o() {
        HashMap hashMap = new HashMap(248);
        int i = 0;
        while (true) {
            SparseArray<List<String>> sparseArray = f19888d;
            if (i < sparseArray.size()) {
                int keyAt = sparseArray.keyAt(i);
                for (String str : sparseArray.get(keyAt)) {
                    if (!str.equals("001")) {
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, Integer.valueOf(keyAt));
                        } else {
                            throw new IllegalStateException("Duplicate regions for country code: " + keyAt);
                        }
                    }
                }
                i++;
            } else {
                hashMap.remove("TA");
                hashMap.put("HM", 672);
                hashMap.put("GS", 500);
                f19889e = Collections.unmodifiableMap(hashMap);
                return;
            }
        }
    }

    /* renamed from: p */
    public static boolean m34063p(@NonNull String str) {
        return str.startsWith("+") && m34052e(str) != null;
    }

    /* renamed from: q */
    public static boolean m34064q(@Nullable String str) {
        return m34051d(str) != null;
    }

    /* renamed from: r */
    private static String m34065r(String str, String str2) {
        return str.replaceFirst("^\\+?" + str2, "");
    }

    /* renamed from: s */
    private static String m34066s(String str) {
        return str.replaceFirst("^\\+?", "");
    }
}
