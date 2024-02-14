package com.google.android.gms.maps.model;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public abstract class UrlTileProvider implements TileProvider {

    /* renamed from: b */
    private final int f46346b;

    /* renamed from: c */
    private final int f46347c;

    /* renamed from: E0 */
    public final Tile mo54804E0(int i, int i2, int i3) {
        URL a = mo54805a(i, i2, i3);
        if (a == null) {
            return TileProvider.f46345a;
        }
        try {
            int i4 = this.f46346b;
            int i5 = this.f46347c;
            InputStream openStream = a.openStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = openStream.read(bArr);
                if (read == -1) {
                    return new Tile(i4, i5, byteArrayOutputStream.toByteArray());
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public abstract URL mo54805a(int i, int i2, int i3);
}
