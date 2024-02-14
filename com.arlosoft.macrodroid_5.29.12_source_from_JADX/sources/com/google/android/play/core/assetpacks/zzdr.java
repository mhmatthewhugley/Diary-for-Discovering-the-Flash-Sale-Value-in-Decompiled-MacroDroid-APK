package com.google.android.play.core.assetpacks;

import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzdr extends InputStream {

    /* renamed from: a */
    private final Enumeration f51505a;
    @Nullable

    /* renamed from: c */
    private InputStream f51506c;

    public zzdr(Enumeration enumeration) throws IOException {
        this.f51505a = enumeration;
        mo59738b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo59738b() throws IOException {
        InputStream inputStream = this.f51506c;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f51506c = this.f51505a.hasMoreElements() ? new FileInputStream((File) this.f51505a.nextElement()) : null;
    }

    public final void close() throws IOException {
        super.close();
        InputStream inputStream = this.f51506c;
        if (inputStream != null) {
            inputStream.close();
            this.f51506c = null;
        }
    }

    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f51506c;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            mo59738b();
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f51506c == null) {
            return -1;
        }
        Objects.requireNonNull(bArr);
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            do {
                int read = this.f51506c.read(bArr, i, i2);
                if (read > 0) {
                    return read;
                }
                mo59738b();
            } while (this.f51506c != null);
            return -1;
        }
    }
}
