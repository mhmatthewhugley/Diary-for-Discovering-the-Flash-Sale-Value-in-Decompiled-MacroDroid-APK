package com.google.android.gms.nearby.connection;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.ProxyConfig;
import com.android.dex.DexFormat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.nearby.zzsq;
import java.io.InputStream;
import java.util.UUID;
import org.apache.commons.p353io.IOUtils;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public class Payload {

    /* renamed from: j */
    public static final zzsq f47451j = zzsq.m63016u("/", "\\", "?", ProxyConfig.MATCH_ALL_SCHEMES, "\"", "<", ">", "|", "[", "]", ":", ",", ";", DexFormat.MAGIC_SUFFIX, IOUtils.LINE_SEPARATOR_UNIX, "\r", "\t", "\f");

    /* renamed from: k */
    public static final zzsq f47452k = zzsq.m63016u("\\", "?", ProxyConfig.MATCH_ALL_SCHEMES, "\"", "<", ">", "|", "[", "]", ":", ",", ";", "..", DexFormat.MAGIC_SUFFIX, IOUtils.LINE_SEPARATOR_UNIX, "\r", "\t", "\f");

    /* renamed from: a */
    private final long f47453a;
    @Type

    /* renamed from: b */
    private final int f47454b;
    @Nullable

    /* renamed from: c */
    private final byte[] f47455c;
    @Nullable

    /* renamed from: d */
    private final File f47456d;
    @Nullable

    /* renamed from: e */
    private final Stream f47457e;

    /* renamed from: f */
    private long f47458f;

    /* renamed from: g */
    private boolean f47459g;
    @Nullable

    /* renamed from: h */
    private String f47460h;
    @Nullable

    /* renamed from: i */
    private String f47461i;

    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static class File {
        @Nullable

        /* renamed from: a */
        private final java.io.File f47462a;

        /* renamed from: b */
        private final ParcelFileDescriptor f47463b;

        /* renamed from: c */
        private final long f47464c;
        @Nullable

        /* renamed from: d */
        private final Uri f47465d;

        private File(@Nullable java.io.File file, ParcelFileDescriptor parcelFileDescriptor, long j, @Nullable Uri uri) {
            this.f47462a = file;
            this.f47463b = parcelFileDescriptor;
            this.f47464c = j;
            this.f47465d = uri;
        }

        @NonNull
        /* renamed from: d */
        public static File m66316d(@NonNull java.io.File file, @NonNull ParcelFileDescriptor parcelFileDescriptor, long j, @NonNull Uri uri) {
            return new File((java.io.File) Preconditions.m4489l(file, "Cannot create Payload.File from null java.io.File."), (ParcelFileDescriptor) Preconditions.m4489l(parcelFileDescriptor, "Cannot create Payload.File from null ParcelFileDescriptor."), j, (Uri) Preconditions.m4489l(uri, "Cannot create Payload.File from null Uri"));
        }

        @NonNull
        /* renamed from: e */
        public static File m66317e(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
            return new File((java.io.File) null, (ParcelFileDescriptor) Preconditions.m4489l(parcelFileDescriptor, "Cannot create Payload.File from null ParcelFileDescriptor."), parcelFileDescriptor.getStatSize(), (Uri) null);
        }

        @Deprecated
        @Nullable
        /* renamed from: a */
        public java.io.File mo55687a() {
            return this.f47462a;
        }

        @NonNull
        /* renamed from: b */
        public ParcelFileDescriptor mo55688b() {
            return this.f47463b;
        }

        /* renamed from: c */
        public long mo55689c() {
            return this.f47464c;
        }
    }

    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static class Stream {
        @Nullable

        /* renamed from: a */
        private final ParcelFileDescriptor f47466a;
        @Nullable

        /* renamed from: b */
        private InputStream f47467b;

        private Stream(@Nullable ParcelFileDescriptor parcelFileDescriptor, @Nullable InputStream inputStream) {
            this.f47466a = parcelFileDescriptor;
            this.f47467b = inputStream;
        }

        @NonNull
        /* renamed from: b */
        public static Stream m66321b(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
            Preconditions.m4489l(parcelFileDescriptor, "Cannot create Payload.Stream from null ParcelFileDescriptor.");
            return new Stream(parcelFileDescriptor, (InputStream) null);
        }

        @NonNull
        /* renamed from: a */
        public InputStream mo55690a() {
            if (this.f47467b == null) {
                this.f47467b = new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) Preconditions.m4488k(this.f47466a));
            }
            return this.f47467b;
        }
    }

    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public @interface Type {
    }

    private Payload(long j, int i, @Nullable byte[] bArr, @Nullable File file, @Nullable Stream stream) {
        this.f47453a = j;
        this.f47454b = i;
        this.f47455c = bArr;
        this.f47456d = file;
        this.f47457e = stream;
    }

    @NonNull
    /* renamed from: d */
    public static Payload m66303d(@NonNull byte[] bArr) {
        Preconditions.m4489l(bArr, "Cannot create a Payload from null bytes.");
        return m66304h(bArr, UUID.randomUUID().getLeastSignificantBits());
    }

    @NonNull
    /* renamed from: h */
    public static Payload m66304h(@NonNull byte[] bArr, long j) {
        return new Payload(j, 1, bArr, (File) null, (Stream) null);
    }

    @NonNull
    /* renamed from: i */
    public static Payload m66305i(@NonNull File file, long j) {
        return new Payload(j, 2, (byte[]) null, file, (Stream) null);
    }

    @NonNull
    /* renamed from: j */
    public static Payload m66306j(@NonNull Stream stream, long j) {
        return new Payload(j, 3, (byte[]) null, (File) null, stream);
    }

    @Nullable
    /* renamed from: a */
    public byte[] mo55678a() {
        return this.f47455c;
    }

    @Nullable
    /* renamed from: b */
    public File mo55679b() {
        return this.f47456d;
    }

    @Nullable
    /* renamed from: c */
    public Stream mo55680c() {
        return this.f47457e;
    }

    /* renamed from: e */
    public long mo55681e() {
        return this.f47453a;
    }

    /* renamed from: f */
    public long mo55682f() {
        return this.f47458f;
    }

    @Type
    /* renamed from: g */
    public int mo55683g() {
        return this.f47454b;
    }

    @ShowFirstParty
    @Nullable
    /* renamed from: k */
    public final String mo55684k() {
        return this.f47460h;
    }

    @ShowFirstParty
    @Nullable
    /* renamed from: l */
    public final String mo55685l() {
        return this.f47461i;
    }

    /* renamed from: m */
    public final boolean mo55686m() {
        return this.f47459g;
    }
}
