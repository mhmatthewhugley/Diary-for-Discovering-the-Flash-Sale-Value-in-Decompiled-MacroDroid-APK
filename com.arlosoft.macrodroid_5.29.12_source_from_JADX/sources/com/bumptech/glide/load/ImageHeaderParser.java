package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p126l4.C7667b;

public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        
        private final boolean hasAlpha;

        private ImageType(boolean z) {
            this.hasAlpha = z;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }
    }

    /* renamed from: a */
    int mo32976a(@NonNull InputStream inputStream, @NonNull C7667b bVar) throws IOException;

    @NonNull
    /* renamed from: b */
    ImageType mo32977b(@NonNull ByteBuffer byteBuffer) throws IOException;

    @NonNull
    /* renamed from: c */
    ImageType mo32978c(@NonNull InputStream inputStream) throws IOException;
}
