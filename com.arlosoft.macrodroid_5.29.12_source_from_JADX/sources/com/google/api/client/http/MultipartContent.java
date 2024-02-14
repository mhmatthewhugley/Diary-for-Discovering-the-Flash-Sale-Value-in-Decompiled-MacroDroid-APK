package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MultipartContent extends AbstractHttpContent {

    /* renamed from: c */
    private ArrayList<Part> f52489c = new ArrayList<>();

    public static final class Part {

        /* renamed from: a */
        HttpContent f52490a;

        /* renamed from: b */
        HttpHeaders f52491b;

        /* renamed from: c */
        HttpEncoding f52492c;

        public Part() {
            this((HttpContent) null);
        }

        /* renamed from: a */
        public Part mo60487a(HttpContent httpContent) {
            this.f52490a = httpContent;
            return this;
        }

        /* renamed from: b */
        public Part mo60488b(HttpHeaders httpHeaders) {
            this.f52491b = httpHeaders;
            return this;
        }

        public Part(HttpContent httpContent) {
            this((HttpHeaders) null, httpContent);
        }

        public Part(HttpHeaders httpHeaders, HttpContent httpContent) {
            mo60488b(httpHeaders);
            mo60487a(httpContent);
        }
    }

    public MultipartContent() {
        super(new HttpMediaType("multipart/related").mo60411m("boundary", "__END_OF_PART__"));
    }

    /* renamed from: a */
    public boolean mo60338a() {
        Iterator<Part> it = this.f52489c.iterator();
        while (it.hasNext()) {
            if (!it.next().f52490a.mo60338a()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public MultipartContent mo60484g(Part part) {
        this.f52489c.add(Preconditions.m72716d(part));
        return this;
    }

    /* renamed from: h */
    public final String mo60485h() {
        return mo60342f().mo60405f("boundary");
    }

    /* renamed from: i */
    public MultipartContent mo60486i(Collection<? extends HttpContent> collection) {
        this.f52489c = new ArrayList<>(collection.size());
        for (HttpContent part : collection) {
            mo60484g(new Part(part));
        }
        return this;
    }

    /* JADX WARNING: type inference failed for: r9v4, types: [com.google.api.client.http.HttpEncodingStreamingContent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeTo(java.io.OutputStream r14) throws java.io.IOException {
        /*
            r13 = this;
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            java.nio.charset.Charset r1 = r13.mo60341e()
            r0.<init>(r14, r1)
            java.lang.String r1 = r13.mo60485h()
            java.util.ArrayList<com.google.api.client.http.MultipartContent$Part> r2 = r13.f52489c
            java.util.Iterator r2 = r2.iterator()
        L_0x0013:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = "--"
            java.lang.String r5 = "\r\n"
            if (r3 == 0) goto L_0x00a7
            java.lang.Object r3 = r2.next()
            com.google.api.client.http.MultipartContent$Part r3 = (com.google.api.client.http.MultipartContent.Part) r3
            com.google.api.client.http.HttpHeaders r6 = new com.google.api.client.http.HttpHeaders
            r6.<init>()
            r7 = 0
            com.google.api.client.http.HttpHeaders r6 = r6.mo60375A(r7)
            com.google.api.client.http.HttpHeaders r8 = r3.f52491b
            if (r8 == 0) goto L_0x0034
            r6.mo60390g(r8)
        L_0x0034:
            com.google.api.client.http.HttpHeaders r8 = r6.mo60379E(r7)
            com.google.api.client.http.HttpHeaders r8 = r8.mo60388R(r7)
            com.google.api.client.http.HttpHeaders r8 = r8.mo60382K(r7)
            com.google.api.client.http.HttpHeaders r8 = r8.mo60380G(r7)
            java.lang.String r9 = "Content-Transfer-Encoding"
            r8.mo60078d(r9, r7)
            com.google.api.client.http.HttpContent r8 = r3.f52490a
            if (r8 == 0) goto L_0x008a
            java.lang.String r10 = "binary"
            java.lang.String[] r10 = new java.lang.String[]{r10}
            java.util.List r10 = java.util.Arrays.asList(r10)
            r6.mo60078d(r9, r10)
            java.lang.String r9 = r8.getType()
            r6.mo60382K(r9)
            com.google.api.client.http.HttpEncoding r3 = r3.f52492c
            if (r3 != 0) goto L_0x006a
            long r9 = r8.mo60339b()
            goto L_0x007c
        L_0x006a:
            java.lang.String r9 = r3.getName()
            r6.mo60379E(r9)
            com.google.api.client.http.HttpEncodingStreamingContent r9 = new com.google.api.client.http.HttpEncodingStreamingContent
            r9.<init>(r8, r3)
            long r10 = com.google.api.client.http.AbstractHttpContent.m71954d(r8)
            r8 = r9
            r9 = r10
        L_0x007c:
            r11 = -1
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x008b
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r6.mo60380G(r3)
            goto L_0x008b
        L_0x008a:
            r8 = r7
        L_0x008b:
            r0.write(r4)
            r0.write(r1)
            r0.write(r5)
            com.google.api.client.http.HttpHeaders.m72023y(r6, r7, r7, r0)
            if (r8 == 0) goto L_0x00a2
            r0.write(r5)
            r0.flush()
            r8.writeTo(r14)
        L_0x00a2:
            r0.write(r5)
            goto L_0x0013
        L_0x00a7:
            r0.write(r4)
            r0.write(r1)
            r0.write(r4)
            r0.write(r5)
            r0.flush()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.http.MultipartContent.writeTo(java.io.OutputStream):void");
    }
}
