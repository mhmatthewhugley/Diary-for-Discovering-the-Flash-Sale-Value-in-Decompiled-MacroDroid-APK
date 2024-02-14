package com.google.api.client.googleapis.batch;

import com.google.api.client.http.AbstractHttpContent;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.logging.Logger;
import org.apache.commons.p353io.IOUtils;

class HttpRequestContent extends AbstractHttpContent {

    /* renamed from: c */
    private final HttpRequest f52282c;

    public void writeTo(OutputStream outputStream) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, mo60341e());
        outputStreamWriter.write(this.f52282c.mo60424i());
        outputStreamWriter.write(" ");
        outputStreamWriter.write(this.f52282c.mo60430o().mo60360h());
        outputStreamWriter.write(" ");
        outputStreamWriter.write("HTTP/1.1");
        outputStreamWriter.write(IOUtils.LINE_SEPARATOR_WINDOWS);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.mo60390g(this.f52282c.mo60420e());
        httpHeaders.mo60375A((String) null).mo60388R((String) null).mo60379E((String) null).mo60382K((String) null).mo60380G((Long) null);
        HttpContent b = this.f52282c.mo60417b();
        if (b != null) {
            httpHeaders.mo60382K(b.getType());
            long b2 = b.mo60339b();
            if (b2 != -1) {
                httpHeaders.mo60380G(Long.valueOf(b2));
            }
        }
        HttpHeaders.m72023y(httpHeaders, (StringBuilder) null, (Logger) null, outputStreamWriter);
        outputStreamWriter.write(IOUtils.LINE_SEPARATOR_WINDOWS);
        outputStreamWriter.flush();
        if (b != null) {
            b.writeTo(outputStream);
        }
    }
}
