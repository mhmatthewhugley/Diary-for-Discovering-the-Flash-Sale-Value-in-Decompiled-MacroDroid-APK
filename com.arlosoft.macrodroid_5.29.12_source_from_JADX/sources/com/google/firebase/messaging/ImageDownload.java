package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class ImageDownload implements Closeable {

    /* renamed from: a */
    private final URL f55005a;
    @Nullable

    /* renamed from: c */
    private volatile Future<?> f55006c;
    @Nullable

    /* renamed from: d */
    private Task<Bitmap> f55007d;

    private ImageDownload(URL url) {
        this.f55005a = url;
    }

    /* renamed from: e */
    private byte[] m76914e() throws IOException {
        URLConnection openConnection = this.f55005a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] d = ByteStreams.m76789d(ByteStreams.m76787b(inputStream, 1048577));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Downloaded ");
                    sb.append(d.length);
                    sb.append(" bytes from ");
                    sb.append(this.f55005a);
                }
                if (d.length <= 1048576) {
                    return d;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    @Nullable
    /* renamed from: f */
    public static ImageDownload m76915f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new ImageDownload(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m76916h(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.mo56139c(mo63363c());
        } catch (Exception e) {
            taskCompletionSource.mo56138b(e);
        }
    }

    /* renamed from: c */
    public Bitmap mo63363c() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f55005a);
        }
        byte[] e = m76914e();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(e, 0, e.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Successfully downloaded image: ");
                sb.append(this.f55005a);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f55005a);
    }

    public void close() {
        this.f55006c.cancel(true);
    }

    /* renamed from: g */
    public Task<Bitmap> mo63365g() {
        return (Task) Preconditions.m4488k(this.f55007d);
    }

    /* renamed from: i */
    public void mo63366i(ExecutorService executorService) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f55006c = executorService.submit(new C11318t(this, taskCompletionSource));
        this.f55007d = taskCompletionSource.mo56137a();
    }
}
