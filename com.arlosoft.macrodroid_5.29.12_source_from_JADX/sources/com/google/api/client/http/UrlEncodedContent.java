package com.google.api.client.http;

import com.google.api.client.util.Data;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Types;
import com.google.api.client.util.escape.CharEscapers;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class UrlEncodedContent extends AbstractHttpContent {

    /* renamed from: c */
    private Object f52503c;

    public UrlEncodedContent(Object obj) {
        super(UrlEncodedParser.f52504a);
        mo60496j(obj);
    }

    /* renamed from: g */
    private static boolean m72179g(boolean z, Writer writer, String str, Object obj) throws IOException {
        if (obj != null && !Data.m72652c(obj)) {
            if (z) {
                z = false;
            } else {
                writer.write("&");
            }
            writer.write(str);
            String b = CharEscapers.m72746b(obj instanceof Enum ? FieldInfo.m72675j((Enum) obj).mo60745e() : obj.toString());
            if (b.length() != 0) {
                writer.write("=");
                writer.write(b);
            }
        }
        return z;
    }

    /* renamed from: h */
    public static UrlEncodedContent m72180h(HttpRequest httpRequest) {
        HttpContent b = httpRequest.mo60417b();
        if (b != null) {
            return (UrlEncodedContent) b;
        }
        UrlEncodedContent urlEncodedContent = new UrlEncodedContent(new HashMap());
        httpRequest.mo60433r(urlEncodedContent);
        return urlEncodedContent;
    }

    /* renamed from: i */
    public final Object mo60495i() {
        return this.f52503c;
    }

    /* renamed from: j */
    public UrlEncodedContent mo60496j(Object obj) {
        this.f52503c = Preconditions.m72716d(obj);
        return this;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, mo60341e()));
        boolean z = true;
        for (Map.Entry next : Data.m72655f(this.f52503c).entrySet()) {
            Object value = next.getValue();
            if (value != null) {
                String b = CharEscapers.m72746b((String) next.getKey());
                Class<?> cls = value.getClass();
                if ((value instanceof Iterable) || cls.isArray()) {
                    for (Object g : Types.m72741l(value)) {
                        z = m72179g(z, bufferedWriter, b, g);
                    }
                } else {
                    z = m72179g(z, bufferedWriter, b, value);
                }
            }
        }
        bufferedWriter.flush();
    }
}
