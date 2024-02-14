package p352oe;

import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import org.apache.commons.cli.HelpFormatter;
import org.threeten.p356bp.DateTimeException;
import org.threeten.p356bp.zone.ZoneRulesException;
import p383re.C16501d;
import p392se.C16551e;
import p392se.C16557i;
import p392se.C16565j;
import p401te.C16631f;

/* renamed from: oe.p */
/* compiled from: ZoneId */
public abstract class C15890p implements Serializable {

    /* renamed from: a */
    public static final C16565j<C15890p> f65377a = new C15891a();

    /* renamed from: c */
    public static final Map<String, String> f65378c;
    private static final long serialVersionUID = 8352817235686L;

    /* renamed from: oe.p$a */
    /* compiled from: ZoneId */
    class C15891a implements C16565j<C15890p> {
        C15891a() {
        }

        /* renamed from: b */
        public C15890p mo75649a(C16551e eVar) {
            return C15890p.m95823i(eVar);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put("ECT", "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        f65378c = Collections.unmodifiableMap(hashMap);
    }

    C15890p() {
        if (getClass() != C15892q.class && getClass() != C15894r.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    /* renamed from: i */
    public static C15890p m95823i(C16551e eVar) {
        C15890p pVar = (C15890p) eVar.mo75648r(C16557i.m98738f());
        if (pVar != null) {
            return pVar;
        }
        throw new DateTimeException("Unable to obtain ZoneId from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    /* renamed from: t */
    public static C15890p m95824t(String str) {
        C16501d.m98548i(str, "zoneId");
        if (str.equals("Z")) {
            return C15892q.f65382p;
        }
        if (str.length() == 1) {
            throw new DateTimeException("Invalid zone: " + str);
        } else if (str.startsWith("+") || str.startsWith(HelpFormatter.DEFAULT_OPT_PREFIX)) {
            return C15892q.m95833F(str);
        } else {
            if (str.equals("UTC") || str.equals("GMT") || str.equals("UT")) {
                return new C15894r(str, C15892q.f65382p.mo75860j());
            }
            if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
                C15892q F = C15892q.m95833F(str.substring(3));
                if (F.mo75866E() == 0) {
                    return new C15894r(str.substring(0, 3), F.mo75860j());
                }
                return new C15894r(str.substring(0, 3) + F.getId(), F.mo75860j());
            } else if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
                return C15894r.m95856y(str, true);
            } else {
                C15892q F2 = C15892q.m95833F(str.substring(2));
                if (F2.mo75866E() == 0) {
                    return new C15894r("UT", F2.mo75860j());
                }
                return new C15894r("UT" + F2.getId(), F2.mo75860j());
            }
        }
    }

    /* renamed from: v */
    public static C15890p m95825v(String str, Map<String, String> map) {
        C16501d.m98548i(str, "zoneId");
        C16501d.m98548i(map, "aliasMap");
        String str2 = map.get(str);
        if (str2 != null) {
            str = str2;
        }
        return m95824t(str);
    }

    /* renamed from: w */
    public static C15890p m95826w() {
        return m95825v(TimeZone.getDefault().getID(), f65378c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15890p) {
            return getId().equals(((C15890p) obj).getId());
        }
        return false;
    }

    public abstract String getId();

    public int hashCode() {
        return getId().hashCode();
    }

    /* renamed from: j */
    public abstract C16631f mo75860j();

    /* renamed from: m */
    public C15890p mo75861m() {
        try {
            C16631f j = mo75860j();
            if (j.mo79505e()) {
                return j.mo79501a(C15858d.f65317a);
            }
        } catch (ZoneRulesException unused) {
        }
        return this;
    }

    public String toString() {
        return getId();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public abstract void mo75863x(DataOutput dataOutput) throws IOException;
}
