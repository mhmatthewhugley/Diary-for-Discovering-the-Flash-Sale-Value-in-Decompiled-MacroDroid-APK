package p408uc;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15915d0;
import okhttp3.C15932h;
import okhttp3.C15965m;
import okhttp3.C15967n;
import okhttp3.C15986u;
import okhttp3.C15989v;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.protocol.HTTP;
import p226cd.C11179b;
import p226cd.C11188e;
import p372qc.C16279b;
import p435xc.C16926h;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\n\u001a\u00020\t*\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\u0006H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u001a\u0010\u0016\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000\u001a\n\u0010\u0018\u001a\u00020\u000b*\u00020\u0017¨\u0006\u0019"}, mo71668d2 = {"Lokhttp3/u;", "", "headerName", "", "Lokhttp3/h;", "a", "Lcd/b;", "", "result", "Lja/u;", "c", "", "g", "", "prefix", "h", "d", "e", "Lokhttp3/n;", "Lokhttp3/v;", "url", "headers", "f", "Lokhttp3/d0;", "b", "okhttp"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* renamed from: uc.e */
/* compiled from: HttpHeaders.kt */
public final class C16689e {

    /* renamed from: a */
    private static final C11188e f67578a;

    /* renamed from: b */
    private static final C11188e f67579b;

    static {
        C11188e.C11189a aVar = C11188e.f54104d;
        f67578a = aVar.mo62513c(BasicHeaderValueFormatter.UNSAFE_CHARS);
        f67579b = aVar.mo62513c("\t ,=");
    }

    /* renamed from: a */
    public static final List<C15932h> m99147a(C15986u uVar, String str) {
        C13706o.m87929f(uVar, "$this$parseChallenges");
        C13706o.m87929f(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = uVar.size();
        for (int i = 0; i < size; i++) {
            if (C15176v.m93641v(str, uVar.mo76242d(i), true)) {
                try {
                    m99149c(new C11179b().mo62455s0(uVar.mo76246i(i)), arrayList);
                } catch (EOFException e) {
                    C16926h.f68190c.mo80117g().mo80113j("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final boolean m99148b(C15915d0 d0Var) {
        C13706o.m87929f(d0Var, "$this$promisesBody");
        if (C13706o.m87924a(d0Var.mo75984y().mo75917g(), HttpHead.METHOD_NAME)) {
            return false;
        }
        int g = d0Var.mo75971g();
        if (((g >= 100 && g < 200) || g == 204 || g == 304) && C16279b.m97665s(d0Var) == -1 && !C15176v.m93641v(HTTP.CHUNK_CODING, C15915d0.m95985o(d0Var, HTTP.TRANSFER_ENCODING, (String) null, 2, (Object) null), true)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static final void m99149c(C11179b bVar, List<C15932h> list) throws EOFException {
        String e;
        int H;
        String str;
        while (true) {
            String str2 = null;
            while (true) {
                if (str2 == null) {
                    m99153g(bVar);
                    str2 = m99151e(bVar);
                    if (str2 == null) {
                        return;
                    }
                }
                boolean g = m99153g(bVar);
                e = m99151e(bVar);
                if (e != null) {
                    byte b = (byte) 61;
                    H = C16279b.m97632H(bVar, b);
                    boolean g2 = m99153g(bVar);
                    if (g || (!g2 && !bVar.mo62469x1())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int H2 = H + C16279b.m97632H(bVar, b);
                        while (true) {
                            if (e == null) {
                                e = m99151e(bVar);
                                if (m99153g(bVar)) {
                                    continue;
                                    break;
                                }
                                H2 = C16279b.m97632H(bVar, b);
                            }
                            if (H2 == 0) {
                                continue;
                                break;
                            } else if (H2 <= 1 && !m99153g(bVar)) {
                                if (m99154h(bVar, (byte) 34)) {
                                    str = m99150d(bVar);
                                } else {
                                    str = m99151e(bVar);
                                }
                                if (str != null && ((String) linkedHashMap.put(e, str)) == null) {
                                    if (m99153g(bVar) || bVar.mo62469x1()) {
                                        e = null;
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list.add(new C15932h(str2, linkedHashMap));
                        str2 = e;
                    }
                } else if (bVar.mo62469x1()) {
                    list.add(new C15932h(str2, C13615t0.m87759i()));
                    return;
                } else {
                    return;
                }
            }
            Map singletonMap = Collections.singletonMap((Object) null, e + C15176v.m93626A("=", H));
            C13706o.m87928e(singletonMap, "Collections.singletonMap…ek + \"=\".repeat(eqCount))");
            list.add(new C15932h(str2, singletonMap));
        }
    }

    /* renamed from: d */
    private static final String m99150d(C11179b bVar) throws EOFException {
        byte b = (byte) 34;
        if (bVar.readByte() == b) {
            C11179b bVar2 = new C11179b();
            while (true) {
                long o0 = bVar.mo62444o0(f67578a);
                if (o0 == -1) {
                    return null;
                }
                if (bVar.mo62435h(o0) == b) {
                    bVar2.mo62384X(bVar, o0);
                    bVar.readByte();
                    return bVar2.mo62471z();
                } else if (bVar.mo62399D() == o0 + 1) {
                    return null;
                } else {
                    bVar2.mo62384X(bVar, o0);
                    bVar.readByte();
                    bVar2.mo62384X(bVar, 1);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: e */
    private static final String m99151e(C11179b bVar) {
        long o0 = bVar.mo62444o0(f67579b);
        if (o0 == -1) {
            o0 = bVar.mo62399D();
        }
        if (o0 != 0) {
            return bVar.mo62395A(o0);
        }
        return null;
    }

    /* renamed from: f */
    public static final void m99152f(C15967n nVar, C15989v vVar, C15986u uVar) {
        C13706o.m87929f(nVar, "$this$receiveHeaders");
        C13706o.m87929f(vVar, "url");
        C13706o.m87929f(uVar, "headers");
        if (nVar != C15967n.f65765a) {
            List<C15965m> e = C15965m.f65755n.mo76188e(vVar, uVar);
            if (!e.isEmpty()) {
                nVar.mo76190b(vVar, e);
            }
        }
    }

    /* renamed from: g */
    private static final boolean m99153g(C11179b bVar) {
        boolean z = false;
        while (!bVar.mo62469x1()) {
            byte h = bVar.mo62435h(0);
            if (h == 9 || h == 32) {
                bVar.readByte();
            } else if (h != 44) {
                break;
            } else {
                bVar.readByte();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: h */
    private static final boolean m99154h(C11179b bVar, byte b) {
        return !bVar.mo62469x1() && bVar.mo62435h(0) == b;
    }
}
