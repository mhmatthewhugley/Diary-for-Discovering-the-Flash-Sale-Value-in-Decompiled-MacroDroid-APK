package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzalm implements zzaln {

    /* renamed from: b */
    private static final Logger f24949b = Logger.getLogger(zzalm.class.getName());

    /* renamed from: a */
    final ThreadLocal f24950a = new zzall(this);

    /* renamed from: a */
    public final zzalq mo41631a(zzgwu zzgwu, zzalr zzalr) throws IOException {
        int e2;
        long j;
        long zzb = zzgwu.zzb();
        ((ByteBuffer) this.f24950a.get()).rewind().limit(8);
        do {
            e2 = zzgwu.mo43875e2((ByteBuffer) this.f24950a.get());
            if (e2 == 8) {
                ((ByteBuffer) this.f24950a.get()).rewind();
                long e = zzalp.m41713e((ByteBuffer) this.f24950a.get());
                byte[] bArr = null;
                if (e >= 8 || e <= 1) {
                    byte[] bArr2 = new byte[4];
                    ((ByteBuffer) this.f24950a.get()).get(bArr2);
                    try {
                        String str = new String(bArr2, "ISO-8859-1");
                        if (e == 1) {
                            ((ByteBuffer) this.f24950a.get()).limit(16);
                            zzgwu.mo43875e2((ByteBuffer) this.f24950a.get());
                            ((ByteBuffer) this.f24950a.get()).position(8);
                            j = zzalp.m41714f((ByteBuffer) this.f24950a.get()) - 16;
                        } else {
                            j = e == 0 ? zzgwu.mo43872a() - zzgwu.zzb() : e - 8;
                        }
                        if ("uuid".equals(str)) {
                            ((ByteBuffer) this.f24950a.get()).limit(((ByteBuffer) this.f24950a.get()).limit() + 16);
                            zzgwu.mo43875e2((ByteBuffer) this.f24950a.get());
                            bArr = new byte[16];
                            for (int position = ((ByteBuffer) this.f24950a.get()).position() - 16; position < ((ByteBuffer) this.f24950a.get()).position(); position++) {
                                bArr[position - (((ByteBuffer) this.f24950a.get()).position() - 16)] = ((ByteBuffer) this.f24950a.get()).get(position);
                            }
                            j -= 16;
                        }
                        long j2 = j;
                        zzalq b = mo41632b(str, bArr, zzalr instanceof zzalq ? ((zzalq) zzalr).zza() : "");
                        b.mo41636c(zzalr);
                        ((ByteBuffer) this.f24950a.get()).rewind();
                        b.mo41635b(zzgwu, (ByteBuffer) this.f24950a.get(), j2, this);
                        return b;
                    } catch (UnsupportedEncodingException e3) {
                        throw new RuntimeException(e3);
                    }
                } else {
                    Logger logger = f24949b;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(e);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
            }
        } while (e2 >= 0);
        zzgwu.mo43876n(zzb);
        throw new EOFException();
    }

    /* renamed from: b */
    public abstract zzalq mo41632b(String str, byte[] bArr, String str2);
}
