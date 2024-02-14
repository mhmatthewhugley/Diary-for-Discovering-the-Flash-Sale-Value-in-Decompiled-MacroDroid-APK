package com.google.firebase.firestore.bundle;

import androidx.annotation.Nullable;
import com.google.firebase.firestore.util.Logger;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

public class BundleReader {

    /* renamed from: a */
    private final BundleSerializer f5786a;

    /* renamed from: b */
    private final InputStreamReader f5787b;

    /* renamed from: c */
    private final Charset f5788c;
    @Nullable

    /* renamed from: d */
    BundleMetadata f5789d;

    /* renamed from: e */
    private CharBuffer f5790e;

    /* renamed from: f */
    long f5791f;

    /* renamed from: a */
    private IllegalArgumentException m7955a(String str) throws IOException {
        mo23777b();
        throw new IllegalArgumentException("Invalid bundle: " + str);
    }

    /* renamed from: c */
    private BundleElement m7956c(String str) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("metadata")) {
            BundleMetadata c = this.f5786a.mo23781c(jSONObject.getJSONObject("metadata"));
            Logger.m76508a("BundleElement", "BundleMetadata element loaded", new Object[0]);
            return c;
        } else if (jSONObject.has("namedQuery")) {
            NamedQuery q = this.f5786a.mo23784q(jSONObject.getJSONObject("namedQuery"));
            Logger.m76508a("BundleElement", "Query loaded: " + q.mo23796b(), new Object[0]);
            return q;
        } else if (jSONObject.has("documentMetadata")) {
            BundledDocumentMetadata d = this.f5786a.mo23782d(jSONObject.getJSONObject("documentMetadata"));
            Logger.m76508a("BundleElement", "Document metadata loaded: " + d.mo23786b(), new Object[0]);
            return d;
        } else if (jSONObject.has("document")) {
            BundleDocument g = this.f5786a.mo23783g(jSONObject.getJSONObject("document"));
            Logger.m76508a("BundleElement", "Document loaded: " + g.mo23765b(), new Object[0]);
            return g;
        } else {
            throw m7955a("Cannot decode unknown Bundle element: " + str);
        }
    }

    /* renamed from: g */
    private int m7957g() {
        this.f5790e.mark();
        int i = 0;
        while (true) {
            try {
                if (i >= this.f5790e.remaining()) {
                    i = -1;
                    break;
                } else if (this.f5790e.get() == '{') {
                    break;
                } else {
                    i++;
                }
            } finally {
                this.f5790e.reset();
            }
        }
        return i;
    }

    /* renamed from: h */
    private boolean m7958h() throws IOException {
        this.f5790e.compact();
        int read = this.f5787b.read(this.f5790e);
        this.f5790e.flip();
        return read > 0;
    }

    /* renamed from: i */
    private String m7959i(int i) throws IOException {
        StringBuilder sb = new StringBuilder(i);
        while (i > 0) {
            if (this.f5790e.remaining() != 0 || m7958h()) {
                int min = Math.min(i, this.f5790e.remaining());
                sb.append(this.f5790e, 0, min);
                CharBuffer charBuffer = this.f5790e;
                charBuffer.position(charBuffer.position() + min);
                i -= min;
            } else {
                throw m7955a("Reached the end of bundle when more data was expected.");
            }
        }
        return sb.toString();
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    @androidx.annotation.Nullable
    /* renamed from: j */
    private java.lang.String m7960j() throws java.io.IOException {
        /*
            r3 = this;
        L_0x0000:
            int r0 = r3.m7957g()
            r1 = -1
            if (r0 != r1) goto L_0x000d
            boolean r2 = r3.m7958h()
            if (r2 != 0) goto L_0x0000
        L_0x000d:
            java.nio.CharBuffer r2 = r3.f5790e
            int r2 = r2.remaining()
            if (r2 != 0) goto L_0x0017
            r0 = 0
            return r0
        L_0x0017:
            if (r0 == r1) goto L_0x0026
            char[] r0 = new char[r0]
            java.nio.CharBuffer r1 = r3.f5790e
            r1.get(r0)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            return r1
        L_0x0026:
            java.lang.String r0 = "Reached the end of bundle when a length string is expected."
            java.lang.IllegalArgumentException r0 = r3.m7955a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.bundle.BundleReader.m7960j():java.lang.String");
    }

    @Nullable
    /* renamed from: k */
    private BundleElement m7961k() throws IOException, JSONException {
        String j = m7960j();
        if (j == null) {
            return null;
        }
        String i = m7959i(Integer.parseInt(j));
        this.f5791f += (long) (j.length() + i.getBytes(this.f5788c).length);
        return m7956c(i);
    }

    /* renamed from: b */
    public void mo23777b() throws IOException {
        this.f5787b.close();
    }

    /* renamed from: d */
    public BundleMetadata mo23778d() throws IOException, JSONException {
        BundleMetadata bundleMetadata = this.f5789d;
        if (bundleMetadata != null) {
            return bundleMetadata;
        }
        BundleElement k = m7961k();
        if (k instanceof BundleMetadata) {
            BundleMetadata bundleMetadata2 = (BundleMetadata) k;
            this.f5789d = bundleMetadata2;
            this.f5791f = 0;
            return bundleMetadata2;
        }
        throw m7955a("Expected first element in bundle to be a metadata object");
    }

    /* renamed from: e */
    public long mo23779e() {
        return this.f5791f;
    }

    /* renamed from: f */
    public BundleElement mo23780f() throws IOException, JSONException {
        mo23778d();
        return m7961k();
    }
}
