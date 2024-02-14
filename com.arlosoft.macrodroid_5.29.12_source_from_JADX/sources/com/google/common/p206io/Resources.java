package com.google.common.p206io;

import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.Resources */
public final class Resources {

    /* renamed from: com.google.common.io.Resources$UrlByteSource */
    private static final class UrlByteSource extends ByteSource {

        /* renamed from: a */
        private final URL f53022a;

        /* renamed from: a */
        public InputStream mo60979a() throws IOException {
            return this.f53022a.openStream();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f53022a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("Resources.asByteSource(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    private Resources() {
    }
}
