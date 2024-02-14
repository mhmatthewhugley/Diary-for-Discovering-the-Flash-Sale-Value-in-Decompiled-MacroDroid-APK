package p352oe;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.util.regex.Pattern;
import org.apache.commons.cli.HelpFormatter;
import org.threeten.p356bp.DateTimeException;
import org.threeten.p356bp.zone.ZoneRulesException;
import p383re.C16501d;
import p401te.C16631f;
import p401te.C16636h;

/* renamed from: oe.r */
/* compiled from: ZoneRegion */
final class C15894r extends C15890p {

    /* renamed from: f */
    private static final Pattern f65386f = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");
    private static final long serialVersionUID = 8386373296231747096L;

    /* renamed from: d */
    private final transient C16631f f65387d;

    /* renamed from: id */
    private final String f65388id;

    C15894r(String str, C16631f fVar) {
        this.f65388id = str;
        this.f65387d = fVar;
    }

    /* renamed from: A */
    private static C15894r m95854A(String str) {
        if (str.equals("Z") || str.startsWith("+") || str.startsWith(HelpFormatter.DEFAULT_OPT_PREFIX)) {
            throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: " + str);
        } else if (str.equals("UTC") || str.equals("GMT") || str.equals("UT")) {
            return new C15894r(str, C15892q.f65382p.mo75860j());
        } else {
            if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
                C15892q F = C15892q.m95833F(str.substring(3));
                if (F.mo75866E() == 0) {
                    return new C15894r(str.substring(0, 3), F.mo75860j());
                }
                return new C15894r(str.substring(0, 3) + F.getId(), F.mo75860j());
            } else if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
                return m95856y(str, false);
            } else {
                C15892q F2 = C15892q.m95833F(str.substring(2));
                if (F2.mo75866E() == 0) {
                    return new C15894r("UT", F2.mo75860j());
                }
                return new C15894r("UT" + F2.getId(), F2.mo75860j());
            }
        }
    }

    /* renamed from: C */
    static C15890p m95855C(DataInput dataInput) throws IOException {
        return m95854A(dataInput.readUTF());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C15883m((byte) 7, this);
    }

    /* renamed from: y */
    static C15894r m95856y(String str, boolean z) {
        C16501d.m98548i(str, "zoneId");
        if (str.length() < 2 || !f65386f.matcher(str).matches()) {
            throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: " + str);
        }
        C16631f fVar = null;
        try {
            fVar = C16636h.m99052b(str, true);
        } catch (ZoneRulesException e) {
            if (str.equals("GMT0")) {
                fVar = C15892q.f65382p.mo75860j();
            } else if (z) {
                throw e;
            }
        }
        return new C15894r(str, fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo75870E(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(this.f65388id);
    }

    public String getId() {
        return this.f65388id;
    }

    /* renamed from: j */
    public C16631f mo75860j() {
        C16631f fVar = this.f65387d;
        return fVar != null ? fVar : C16636h.m99052b(this.f65388id, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo75863x(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        mo75870E(dataOutput);
    }
}
