package com.google.api.client.googleapis.media;

import com.google.api.client.http.HttpIOExceptionHandler;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@Beta
class MediaUploadErrorHandler implements HttpUnsuccessfulResponseHandler, HttpIOExceptionHandler {

    /* renamed from: d */
    static final Logger f52326d = Logger.getLogger(MediaUploadErrorHandler.class.getName());

    /* renamed from: a */
    private final MediaHttpUploader f52327a;

    /* renamed from: b */
    private final HttpIOExceptionHandler f52328b;

    /* renamed from: c */
    private final HttpUnsuccessfulResponseHandler f52329c;

    public MediaUploadErrorHandler(MediaHttpUploader mediaHttpUploader, HttpRequest httpRequest) {
        this.f52327a = (MediaHttpUploader) Preconditions.m72716d(mediaHttpUploader);
        this.f52328b = httpRequest.mo60421f();
        this.f52329c = httpRequest.mo60429n();
        httpRequest.mo60435t(this);
        httpRequest.mo60441z(this);
    }

    /* renamed from: a */
    public boolean mo60096a(HttpRequest httpRequest, HttpResponse httpResponse, boolean z) throws IOException {
        HttpUnsuccessfulResponseHandler httpUnsuccessfulResponseHandler = this.f52329c;
        boolean z2 = httpUnsuccessfulResponseHandler != null && httpUnsuccessfulResponseHandler.mo60096a(httpRequest, httpResponse, z);
        if (z2 && z && httpResponse.mo60454g() / 100 == 5) {
            try {
                this.f52327a.mo60287i();
            } catch (IOException e) {
                f52326d.log(Level.WARNING, "exception thrown while calling server callback", e);
            }
        }
        return z2;
    }

    /* renamed from: b */
    public boolean mo60292b(HttpRequest httpRequest, boolean z) throws IOException {
        HttpIOExceptionHandler httpIOExceptionHandler = this.f52328b;
        boolean z2 = httpIOExceptionHandler != null && httpIOExceptionHandler.mo60292b(httpRequest, z);
        if (z2) {
            try {
                this.f52327a.mo60287i();
            } catch (IOException e) {
                f52326d.log(Level.WARNING, "exception thrown while calling server callback", e);
            }
        }
        return z2;
    }
}
