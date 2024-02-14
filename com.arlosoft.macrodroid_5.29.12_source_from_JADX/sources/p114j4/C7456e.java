package p114j4;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.C6659a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p126l4.C7667b;

/* renamed from: j4.e */
/* compiled from: ThumbnailStreamOpener */
class C7456e {

    /* renamed from: f */
    private static final C7450a f18257f = new C7450a();

    /* renamed from: a */
    private final C7450a f18258a;

    /* renamed from: b */
    private final C7455d f18259b;

    /* renamed from: c */
    private final C7667b f18260c;

    /* renamed from: d */
    private final ContentResolver f18261d;

    /* renamed from: e */
    private final List<ImageHeaderParser> f18262e;

    C7456e(List<ImageHeaderParser> list, C7455d dVar, C7667b bVar, ContentResolver contentResolver) {
        this(list, f18257f, dVar, bVar, contentResolver);
    }

    @Nullable
    /* renamed from: b */
    private String m30947b(@NonNull Uri uri) {
        Cursor a = this.f18259b.mo37583a(uri);
        if (a != null) {
            try {
                if (a.moveToFirst()) {
                    return a.getString(0);
                }
            } finally {
                a.close();
            }
        }
        if (a != null) {
            a.close();
        }
        return null;
    }

    /* renamed from: c */
    private boolean m30948c(File file) {
        return this.f18258a.mo37580a(file) && 0 < this.f18258a.mo37582c(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo37584a(Uri uri) {
        InputStream inputStream = null;
        try {
            InputStream openInputStream = this.f18261d.openInputStream(uri);
            int a = C6659a.m25236a(this.f18262e, openInputStream, this.f18260c);
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (IOException unused) {
                }
            }
            return a;
        } catch (IOException | NullPointerException unused2) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to open uri: ");
                sb.append(uri);
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused3) {
                return -1;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    /* renamed from: d */
    public InputStream mo37585d(Uri uri) throws FileNotFoundException {
        String b = m30947b(uri);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        File b2 = this.f18258a.mo37581b(b);
        if (!m30948c(b2)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(b2);
        try {
            return this.f18261d.openInputStream(fromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
        }
    }

    C7456e(List<ImageHeaderParser> list, C7450a aVar, C7455d dVar, C7667b bVar, ContentResolver contentResolver) {
        this.f18258a = aVar;
        this.f18259b = dVar;
        this.f18260c = bVar;
        this.f18261d = contentResolver;
        this.f18262e = list;
    }
}
