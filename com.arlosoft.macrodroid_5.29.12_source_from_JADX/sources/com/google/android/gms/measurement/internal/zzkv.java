package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzek;
import com.google.android.gms.internal.measurement.zzem;
import com.google.android.gms.internal.measurement.zzer;
import com.google.android.gms.internal.measurement.zzet;
import com.google.android.gms.internal.measurement.zzey;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zzjr;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.internal.measurement.zzpd;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.apache.commons.p353io.IOUtils;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzkv extends zzkh {
    zzkv(zzkt zzkt) {
        super(zzkt);
    }

    /* renamed from: C */
    static zzll m66085C(zzll zzll, byte[] bArr) throws zzkp {
        zzjr a = zzjr.m60463a();
        if (a != null) {
            return zzll.mo51299d1(bArr, a);
        }
        return zzll.mo51303w0(bArr);
    }

    /* renamed from: H */
    static List m66086H(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: L */
    static boolean m66087L(List list, int i) {
        if (i >= list.size() * 64) {
            return false;
        }
        return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
    }

    /* renamed from: N */
    static boolean m66088N(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: P */
    static final void m66089P(zzfs zzfs, String str, Object obj) {
        List L = zzfs.mo51011L();
        int i = 0;
        while (true) {
            if (i >= L.size()) {
                i = -1;
                break;
            } else if (str.equals(((zzfx) L.get(i)).mo51046I())) {
                break;
            } else {
                i++;
            }
        }
        zzfw G = zzfx.m59896G();
        G.mo51034D(str);
        if (obj instanceof Long) {
            G.mo51033C(((Long) obj).longValue());
        }
        if (i >= 0) {
            zzfs.mo51005D(i, G);
        } else {
            zzfs.mo51017y(G);
        }
    }

    @WorkerThread
    /* renamed from: k */
    static final boolean m66090k(zzaw zzaw, zzq zzq) {
        Preconditions.m4488k(zzaw);
        Preconditions.m4488k(zzq);
        return !TextUtils.isEmpty(zzq.f47327c) || !TextUtils.isEmpty(zzq.f47318H);
    }

    /* renamed from: l */
    static final zzfx m66091l(zzft zzft, String str) {
        for (zzfx zzfx : zzft.mo51025K()) {
            if (zzfx.mo51046I().equals(str)) {
                return zzfx;
            }
        }
        return null;
    }

    /* renamed from: m */
    static final Object m66092m(zzft zzft, String str) {
        zzfx l = m66091l(zzft, str);
        if (l == null) {
            return null;
        }
        if (l.mo51053Z()) {
            return l.mo51047J();
        }
        if (l.mo51051X()) {
            return Long.valueOf(l.mo51045E());
        }
        if (l.mo51049V()) {
            return Double.valueOf(l.mo51042B());
        }
        if (l.mo51044D() <= 0) {
            return null;
        }
        List<zzfx> K = l.mo51048K();
        ArrayList arrayList = new ArrayList();
        for (zzfx zzfx : K) {
            if (zzfx != null) {
                Bundle bundle = new Bundle();
                for (zzfx zzfx2 : zzfx.mo51048K()) {
                    if (zzfx2.mo51053Z()) {
                        bundle.putString(zzfx2.mo51046I(), zzfx2.mo51047J());
                    } else if (zzfx2.mo51051X()) {
                        bundle.putLong(zzfx2.mo51046I(), zzfx2.mo51045E());
                    } else if (zzfx2.mo51049V()) {
                        bundle.putDouble(zzfx2.mo51046I(), zzfx2.mo51042B());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: n */
    private final void m66093n(StringBuilder sb, int i, List list) {
        if (list != null) {
            int i2 = i + 1;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzfx zzfx = (zzfx) it.next();
                if (zzfx != null) {
                    m66095p(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    m66098s(sb, i2, "name", zzfx.mo51052Y() ? this.f46899a.mo55187D().mo55088e(zzfx.mo51046I()) : null);
                    m66098s(sb, i2, "string_value", zzfx.mo51053Z() ? zzfx.mo51047J() : null);
                    m66098s(sb, i2, "int_value", zzfx.mo51051X() ? Long.valueOf(zzfx.mo51045E()) : null);
                    if (zzfx.mo51049V()) {
                        d = Double.valueOf(zzfx.mo51042B());
                    }
                    m66098s(sb, i2, "double_value", d);
                    if (zzfx.mo51044D() > 0) {
                        m66093n(sb, i2, zzfx.mo51048K());
                    }
                    m66095p(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    /* renamed from: o */
    private final void m66094o(StringBuilder sb, int i, zzem zzem) {
        String str;
        if (zzem != null) {
            m66095p(sb, i);
            sb.append("filter {\n");
            if (zzem.mo50914J()) {
                m66098s(sb, i, "complement", Boolean.valueOf(zzem.mo50913I()));
            }
            if (zzem.mo50916L()) {
                m66098s(sb, i, "param_name", this.f46899a.mo55187D().mo55088e(zzem.mo50912G()));
            }
            if (zzem.mo50917M()) {
                int i2 = i + 1;
                zzey E = zzem.mo50911E();
                if (E != null) {
                    m66095p(sb, i2);
                    sb.append("string_filter {\n");
                    if (E.mo50944K()) {
                        switch (E.mo50945L()) {
                            case 1:
                                str = "UNKNOWN_MATCH_TYPE";
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case 6:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        m66098s(sb, i2, "match_type", str);
                    }
                    if (E.mo50943J()) {
                        m66098s(sb, i2, "expression", E.mo50939E());
                    }
                    if (E.mo50942I()) {
                        m66098s(sb, i2, "case_sensitive", Boolean.valueOf(E.mo50941H()));
                    }
                    if (E.mo50938B() > 0) {
                        m66095p(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String append : E.mo50940G()) {
                            m66095p(sb, i2 + 2);
                            sb.append(append);
                            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                        }
                        sb.append("}\n");
                    }
                    m66095p(sb, i2);
                    sb.append("}\n");
                }
            }
            if (zzem.mo50915K()) {
                m66099t(sb, i + 1, "number_filter", zzem.mo50910D());
            }
            m66095p(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: p */
    private static final void m66095p(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: q */
    private static final String m66096q(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: r */
    private static final void m66097r(StringBuilder sb, int i, String str, zzgi zzgi) {
        if (zzgi != null) {
            m66095p(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (zzgi.mo51209C() != 0) {
                m66095p(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long l : zzgi.mo51215M()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (zzgi.mo51211E() != 0) {
                m66095p(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long l2 : zzgi.mo51217O()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l2);
                    i4 = i5;
                }
                sb.append(10);
            }
            if (zzgi.mo51208B() != 0) {
                m66095p(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (zzfr zzfr : zzgi.mo51214L()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(zzfr.mo51001J() ? Integer.valueOf(zzfr.mo50998B()) : null);
                    sb.append(":");
                    sb.append(zzfr.mo51000I() ? Long.valueOf(zzfr.mo50999C()) : null);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (zzgi.mo51210D() != 0) {
                m66095p(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (zzgk zzgk : zzgi.mo51216N()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    sb.append(zzgk.mo51224K() ? Integer.valueOf(zzgk.mo51221C()) : null);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long longValue : zzgk.mo51223H()) {
                        long longValue2 = longValue.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append("}\n");
            }
            m66095p(sb, 3);
            sb.append("}\n");
        }
    }

    /* renamed from: s */
    private static final void m66098s(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m66095p(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* renamed from: t */
    private static final void m66099t(StringBuilder sb, int i, String str, zzer zzer) {
        if (zzer != null) {
            m66095p(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (zzer.mo50923I()) {
                int N = zzer.mo50928N();
                m66098s(sb, i, "comparison_type", N != 1 ? N != 2 ? N != 3 ? N != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
            }
            if (zzer.mo50925K()) {
                m66098s(sb, i, "match_as_float", Boolean.valueOf(zzer.mo50922H()));
            }
            if (zzer.mo50924J()) {
                m66098s(sb, i, "comparison_value", zzer.mo50919D());
            }
            if (zzer.mo50927M()) {
                m66098s(sb, i, "min_comparison_value", zzer.mo50921G());
            }
            if (zzer.mo50926L()) {
                m66098s(sb, i, "max_comparison_value", zzer.mo50920E());
            }
            m66095p(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: u */
    static int m66100u(zzgc zzgc, String str) {
        for (int i = 0; i < zzgc.mo51137z0(); i++) {
            if (str.equals(zzgc.mo51125r0(i).mo51236H())) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final zzft mo55554A(zzar zzar) {
        zzfs G = zzft.m59856G();
        G.mo51007G(zzar.f46463e);
        zzat zzat = new zzat(zzar.f46464f);
        while (zzat.hasNext()) {
            String a = zzat.next();
            zzfw G2 = zzfx.m59896G();
            G2.mo51034D(a);
            Object p2 = zzar.f46464f.mo55019p2(a);
            Preconditions.m4488k(p2);
            mo55560J(G2, p2);
            G.mo51017y(G2);
        }
        return (zzft) G.mo51441o();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final String mo55555D(zzgb zzgb) {
        if (zzgb == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (zzgd zzgd : zzgb.mo51065E()) {
            if (zzgd != null) {
                m66095p(sb, 1);
                sb.append("bundle {\n");
                if (zzgd.mo51188r1()) {
                    m66098s(sb, 1, "protocol_version", Integer.valueOf(zzgd.mo51139A1()));
                }
                zzpd.m61097b();
                if (this.f46899a.mo55219x().mo54919A((String) null, zzdu.f46623n0) && this.f46899a.mo55219x().mo54919A(zzgd.mo51174T1(), zzdu.f46627p0) && zzgd.mo51191u1()) {
                    m66098s(sb, 1, "session_stitching_token", zzgd.mo51164M());
                }
                m66098s(sb, 1, "platform", zzgd.mo51160K());
                if (zzgd.mo51184n1()) {
                    m66098s(sb, 1, "gmp_version", Long.valueOf(zzgd.mo51157I1()));
                }
                if (zzgd.mo51195y1()) {
                    m66098s(sb, 1, "uploading_gmp_version", Long.valueOf(zzgd.mo51167N1()));
                }
                if (zzgd.mo51182l1()) {
                    m66098s(sb, 1, "dynamite_version", Long.valueOf(zzgd.mo51153G1()));
                }
                if (zzgd.mo51179i1()) {
                    m66098s(sb, 1, "config_version", Long.valueOf(zzgd.mo51150E1()));
                }
                m66098s(sb, 1, "gmp_app_id", zzgd.mo51154H());
                m66098s(sb, 1, "admob_app_id", zzgd.mo51173S1());
                m66098s(sb, 1, "app_id", zzgd.mo51174T1());
                m66098s(sb, 1, "app_version", zzgd.mo51140B());
                if (zzgd.mo51144C0()) {
                    m66098s(sb, 1, "app_version_major", Integer.valueOf(zzgd.mo51177c0()));
                }
                m66098s(sb, 1, "firebase_instance_id", zzgd.mo51152G());
                if (zzgd.mo51181k1()) {
                    m66098s(sb, 1, "dev_cert_hash", Long.valueOf(zzgd.mo51151F1()));
                }
                m66098s(sb, 1, "app_store", zzgd.mo51176V1());
                if (zzgd.mo51194x1()) {
                    m66098s(sb, 1, "upload_timestamp_millis", Long.valueOf(zzgd.mo51165M1()));
                }
                if (zzgd.mo51192v1()) {
                    m66098s(sb, 1, "start_timestamp_millis", Long.valueOf(zzgd.mo51163L1()));
                }
                if (zzgd.mo51183m1()) {
                    m66098s(sb, 1, "end_timestamp_millis", Long.valueOf(zzgd.mo51155H1()));
                }
                if (zzgd.mo51187q1()) {
                    m66098s(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzgd.mo51161K1()));
                }
                if (zzgd.mo51186p1()) {
                    m66098s(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzgd.mo51159J1()));
                }
                m66098s(sb, 1, "app_instance_id", zzgd.mo51175U1());
                m66098s(sb, 1, "resettable_device_id", zzgd.mo51162L());
                m66098s(sb, 1, "ds_id", zzgd.mo51149E());
                if (zzgd.mo51185o1()) {
                    m66098s(sb, 1, "limited_ad_tracking", Boolean.valueOf(zzgd.mo51138A0()));
                }
                m66098s(sb, 1, "os_version", zzgd.mo51158J());
                m66098s(sb, 1, "device_model", zzgd.mo51146D());
                m66098s(sb, 1, "user_default_language", zzgd.mo51166N());
                if (zzgd.mo51193w1()) {
                    m66098s(sb, 1, "time_zone_offset_minutes", Integer.valueOf(zzgd.mo51145C1()));
                }
                if (zzgd.mo51147D0()) {
                    m66098s(sb, 1, "bundle_sequential_index", Integer.valueOf(zzgd.mo51178f1()));
                }
                if (zzgd.mo51190t1()) {
                    m66098s(sb, 1, "service_upload", Boolean.valueOf(zzgd.mo51141B0()));
                }
                m66098s(sb, 1, "health_monitor", zzgd.mo51156I());
                if (zzgd.mo51189s1()) {
                    m66098s(sb, 1, "retry_counter", Integer.valueOf(zzgd.mo51142B1()));
                }
                if (zzgd.mo51180j1()) {
                    m66098s(sb, 1, "consent_signals", zzgd.mo51143C());
                }
                List<zzgm> Q = zzgd.mo51171Q();
                if (Q != null) {
                    for (zzgm zzgm : Q) {
                        if (zzgm != null) {
                            m66095p(sb, 2);
                            sb.append("user_property {\n");
                            m66098s(sb, 2, "set_timestamp_millis", zzgm.mo51240T() ? Long.valueOf(zzgm.mo51235D()) : null);
                            m66098s(sb, 2, "name", this.f46899a.mo55187D().mo55089f(zzgm.mo51236H()));
                            m66098s(sb, 2, "string_value", zzgm.mo51237I());
                            m66098s(sb, 2, "int_value", zzgm.mo51239S() ? Long.valueOf(zzgm.mo51234C()) : null);
                            m66098s(sb, 2, "double_value", zzgm.mo51238R() ? Double.valueOf(zzgm.mo51233B()) : null);
                            m66095p(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzfp> O = zzgd.mo51168O();
                if (O != null) {
                    for (zzfp zzfp : O) {
                        if (zzfp != null) {
                            m66095p(sb, 2);
                            sb.append("audience_membership {\n");
                            if (zzfp.mo50993M()) {
                                m66098s(sb, 2, "audience_id", Integer.valueOf(zzfp.mo50989B()));
                            }
                            if (zzfp.mo50994N()) {
                                m66098s(sb, 2, "new_audience", Boolean.valueOf(zzfp.mo50992L()));
                            }
                            m66097r(sb, 2, "current_data", zzfp.mo50990E());
                            if (zzfp.mo50995O()) {
                                m66097r(sb, 2, "previous_data", zzfp.mo50991G());
                            }
                            m66095p(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzft> P = zzgd.mo51170P();
                if (P != null) {
                    for (zzft zzft : P) {
                        if (zzft != null) {
                            m66095p(sb, 2);
                            sb.append("event {\n");
                            m66098s(sb, 2, "name", this.f46899a.mo55187D().mo55087d(zzft.mo51024J()));
                            if (zzft.mo51028V()) {
                                m66098s(sb, 2, "timestamp_millis", Long.valueOf(zzft.mo51022E()));
                            }
                            if (zzft.mo51027U()) {
                                m66098s(sb, 2, "previous_timestamp_millis", Long.valueOf(zzft.mo51021D()));
                            }
                            if (zzft.mo51026T()) {
                                m66098s(sb, 2, "count", Integer.valueOf(zzft.mo51019B()));
                            }
                            if (zzft.mo51020C() != 0) {
                                m66093n(sb, 2, zzft.mo51025K());
                            }
                            m66095p(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m66095p(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final String mo55556E(zzek zzek) {
        if (zzek == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (zzek.mo50907Q()) {
            m66098s(sb, 0, "filter_id", Integer.valueOf(zzek.mo50898C()));
        }
        m66098s(sb, 0, "event_name", this.f46899a.mo55187D().mo55087d(zzek.mo50901I()));
        String q = m66096q(zzek.mo50903M(), zzek.mo50904N(), zzek.mo50905O());
        if (!q.isEmpty()) {
            m66098s(sb, 0, "filter_type", q);
        }
        if (zzek.mo50906P()) {
            m66099t(sb, 1, "event_count_filter", zzek.mo50900H());
        }
        if (zzek.mo50897B() > 0) {
            sb.append("  filters {\n");
            for (zzem o : zzek.mo50902J()) {
                m66094o(sb, 2, o);
            }
        }
        m66095p(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final String mo55557F(zzet zzet) {
        if (zzet == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (zzet.mo50936L()) {
            m66098s(sb, 0, "filter_id", Integer.valueOf(zzet.mo50930B()));
        }
        m66098s(sb, 0, "property_name", this.f46899a.mo55187D().mo55089f(zzet.mo50932G()));
        String q = m66096q(zzet.mo50933I(), zzet.mo50934J(), zzet.mo50935K());
        if (!q.isEmpty()) {
            m66098s(sb, 0, "filter_type", q);
        }
        m66094o(sb, 1, zzet.mo50931C());
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final List mo55558G(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f46899a.mo55221z().mo55103u().mo55092b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f46899a.mo55221z().mo55103u().mo55093c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final Map mo55559I(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(mo55559I((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(mo55559I((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(mo55559I((Bundle) obj, false));
                    }
                    hashMap.put(str, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo55560J(zzfw zzfw, Object obj) {
        Preconditions.m4488k(obj);
        zzfw.mo51031A();
        zzfw.mo51040y();
        zzfw.mo51039x();
        zzfw.mo51041z();
        if (obj instanceof String) {
            zzfw.mo51035E((String) obj);
        } else if (obj instanceof Long) {
            zzfw.mo51033C(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzfw.mo51032B(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    zzfw G = zzfx.m59896G();
                    for (String str : bundle.keySet()) {
                        zzfw G2 = zzfx.m59896G();
                        G2.mo51034D(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            G2.mo51033C(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            G2.mo51035E((String) obj2);
                        } else if (obj2 instanceof Double) {
                            G2.mo51032B(((Double) obj2).doubleValue());
                        }
                        G.mo51038v(G2);
                    }
                    if (G.mo51036t() > 0) {
                        arrayList.add((zzfx) G.mo51441o());
                    }
                }
            }
            zzfw.mo51037u(arrayList);
        } else {
            this.f46899a.mo55221z().mo55098p().mo55092b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo55561K(zzgl zzgl, Object obj) {
        Preconditions.m4488k(obj);
        zzgl.mo51229v();
        zzgl.mo51228u();
        zzgl.mo51227t();
        if (obj instanceof String) {
            zzgl.mo51226B((String) obj);
        } else if (obj instanceof Long) {
            zzgl.mo51231y(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzgl.mo51230x(((Double) obj).doubleValue());
        } else {
            this.f46899a.mo55221z().mo55098p().mo55092b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean mo55562M(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(this.f46899a.mo55201a().mo21950a() - j) > j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final byte[] mo55563O(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.f46899a.mo55221z().mo55098p().mo55092b("Failed to gzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo54913j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: v */
    public final long mo55564v(byte[] bArr) {
        Preconditions.m4488k(bArr);
        this.f46899a.mo55196N().mo55073e();
        MessageDigest r = zzlb.m66132r();
        if (r != null) {
            return zzlb.m66131q0(r.digest(bArr));
        }
        this.f46899a.mo55221z().mo55098p().mo55091a("Failed to get MD5");
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final Bundle mo55565w(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(mo55565w((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.f46899a.mo55221z().mo55098p().mo55091a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable mo55566x(byte[] r5, android.os.Parcelable.Creator r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ ParseException -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ ParseException -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ ParseException -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ ParseException -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ ParseException -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002f
        L_0x001c:
            com.google.android.gms.measurement.internal.zzfr r5 = r4.f46899a     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.zzeh r5 = r5.mo55221z()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.zzef r5 = r5.mo55098p()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo55091a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002f:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkv.mo55566x(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r0.get("_o");
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzaw mo55567y(com.google.android.gms.internal.measurement.zzaa r9) {
        /*
            r8 = this;
            java.util.Map r0 = r9.mo50684e()
            r1 = 1
            android.os.Bundle r0 = r8.mo55565w(r0, r1)
            java.lang.String r1 = "_o"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x001c
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = r1.toString()
            goto L_0x001e
        L_0x001c:
            java.lang.String r1 = "app"
        L_0x001e:
            r5 = r1
            java.lang.String r1 = r9.mo50683d()
            java.lang.String r1 = com.google.android.gms.measurement.internal.zzgo.m65769b(r1)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = r9.mo50683d()
        L_0x002d:
            r3 = r1
            com.google.android.gms.measurement.internal.zzaw r1 = new com.google.android.gms.measurement.internal.zzaw
            com.google.android.gms.measurement.internal.zzau r4 = new com.google.android.gms.measurement.internal.zzau
            r4.<init>(r0)
            long r6 = r9.mo50679a()
            r2 = r1
            r2.<init>(r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkv.mo55567y(com.google.android.gms.internal.measurement.zzaa):com.google.android.gms.measurement.internal.zzaw");
    }
}
