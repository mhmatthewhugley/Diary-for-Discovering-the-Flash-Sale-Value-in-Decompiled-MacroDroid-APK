package com.google.api.client.http;

import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.escape.CharEscapers;
import com.google.api.client.util.escape.Escaper;
import com.google.api.client.util.escape.PercentEscaper;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericUrl extends GenericData {

    /* renamed from: z */
    private static final Escaper f52408z = new PercentEscaper("=&-_.!~*'()@:$,;/?:", false);

    /* renamed from: d */
    private String f52409d;

    /* renamed from: f */
    private String f52410f;

    /* renamed from: g */
    private String f52411g;

    /* renamed from: o */
    private int f52412o;

    /* renamed from: p */
    private List<String> f52413p;

    /* renamed from: s */
    private String f52414s;

    public GenericUrl() {
        this.f52412o = -1;
    }

    /* renamed from: B */
    public static List<String> m71983B(String str) {
        String str2;
        if (str == null || str.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        int i = 0;
        while (z) {
            int indexOf = str.indexOf(47, i);
            boolean z2 = indexOf != -1;
            if (z2) {
                str2 = str.substring(i, indexOf);
            } else {
                str2 = str.substring(i);
            }
            arrayList.add(CharEscapers.m72745a(str2));
            i = indexOf + 1;
            z = z2;
        }
        return arrayList;
    }

    /* renamed from: e */
    static void m71984e(Set<Map.Entry<String, Object>> set, StringBuilder sb) {
        boolean z = true;
        for (Map.Entry next : set) {
            Object value = next.getValue();
            if (value != null) {
                String e = CharEscapers.m72749e((String) next.getKey());
                if (value instanceof Collection) {
                    for (Object f : (Collection) value) {
                        z = m71985f(z, sb, e, f);
                    }
                } else {
                    z = m71985f(z, sb, e, value);
                }
            }
        }
    }

    /* renamed from: f */
    private static boolean m71985f(boolean z, StringBuilder sb, String str, Object obj) {
        if (z) {
            z = false;
            sb.append('?');
        } else {
            sb.append('&');
        }
        sb.append(str);
        String e = CharEscapers.m72749e(obj.toString());
        if (e.length() != 0) {
            sb.append('=');
            sb.append(e);
        }
        return z;
    }

    /* renamed from: g */
    private void m71986g(StringBuilder sb) {
        int size = this.f52413p.size();
        for (int i = 0; i < size; i++) {
            String str = this.f52413p.get(i);
            if (i != 0) {
                sb.append('/');
            }
            if (str.length() != 0) {
                sb.append(CharEscapers.m72747c(str));
            }
        }
    }

    /* renamed from: t */
    private static URL m71987t(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public final void mo60356A(String str) {
        this.f52409d = (String) Preconditions.m72716d(str);
    }

    /* renamed from: C */
    public final URL mo60357C() {
        return m71987t(mo60360h());
    }

    /* renamed from: D */
    public final URL mo60358D(String str) {
        try {
            return new URL(mo60357C(), str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof GenericUrl)) {
            return false;
        }
        return mo60360h().equals(((GenericUrl) obj).toString());
    }

    /* renamed from: h */
    public final String mo60360h() {
        String valueOf = String.valueOf(mo60362k());
        String valueOf2 = String.valueOf(mo60363l());
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public int hashCode() {
        return mo60360h().hashCode();
    }

    /* renamed from: k */
    public final String mo60362k() {
        StringBuilder sb = new StringBuilder();
        sb.append((String) Preconditions.m72716d(this.f52409d));
        sb.append("://");
        String str = this.f52411g;
        if (str != null) {
            sb.append(CharEscapers.m72750f(str));
            sb.append('@');
        }
        sb.append((String) Preconditions.m72716d(this.f52410f));
        int i = this.f52412o;
        if (i != -1) {
            sb.append(':');
            sb.append(i);
        }
        return sb.toString();
    }

    /* renamed from: l */
    public final String mo60363l() {
        StringBuilder sb = new StringBuilder();
        if (this.f52413p != null) {
            m71986g(sb);
        }
        m71984e(entrySet(), sb);
        String str = this.f52414s;
        if (str != null) {
            sb.append('#');
            sb.append(f52408z.mo60789a(str));
        }
        return sb.toString();
    }

    /* renamed from: n */
    public GenericUrl clone() {
        GenericUrl genericUrl = (GenericUrl) super.clone();
        if (this.f52413p != null) {
            genericUrl.f52413p = new ArrayList(this.f52413p);
        }
        return genericUrl;
    }

    /* renamed from: o */
    public String mo60364o() {
        return this.f52414s;
    }

    /* renamed from: p */
    public String mo60365p() {
        return this.f52410f;
    }

    /* renamed from: q */
    public List<String> mo60366q() {
        return this.f52413p;
    }

    /* renamed from: r */
    public int mo60367r() {
        return this.f52412o;
    }

    /* renamed from: s */
    public final String mo60368s() {
        return this.f52409d;
    }

    public String toString() {
        return mo60360h();
    }

    /* renamed from: u */
    public GenericUrl mo60078d(String str, Object obj) {
        return (GenericUrl) super.mo60078d(str, obj);
    }

    /* renamed from: v */
    public final void mo60370v(String str) {
        this.f52410f = (String) Preconditions.m72716d(str);
    }

    /* renamed from: x */
    public void mo60371x(List<String> list) {
        this.f52413p = list;
    }

    /* renamed from: y */
    public final void mo60372y(int i) {
        Preconditions.m72714b(i >= -1, "expected port >= -1");
        this.f52412o = i;
    }

    /* renamed from: z */
    public void mo60373z(String str) {
        this.f52413p = m71983B(str);
    }

    public GenericUrl(String str) {
        this(m71987t(str));
    }

    public GenericUrl(URL url) {
        this(url.getProtocol(), url.getHost(), url.getPort(), url.getPath(), url.getRef(), url.getQuery(), url.getUserInfo());
    }

    private GenericUrl(String str, String str2, int i, String str3, String str4, String str5, String str6) {
        this.f52412o = -1;
        this.f52409d = str.toLowerCase();
        this.f52410f = str2;
        this.f52412o = i;
        this.f52413p = m71983B(str3);
        String str7 = null;
        this.f52414s = str4 != null ? CharEscapers.m72745a(str4) : null;
        if (str5 != null) {
            UrlEncodedParser.m72184c(str5, this);
        }
        this.f52411g = str6 != null ? CharEscapers.m72745a(str6) : str7;
    }
}
