package p114j4;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p083e4.C7271c;
import p083e4.C7275g;
import p102h4.C7376a;
import p108i4.C7401d;
import p108i4.C7408g;

/* renamed from: j4.c */
/* compiled from: ThumbFetcher */
public class C7452c implements C7401d<InputStream> {

    /* renamed from: a */
    private final Uri f18250a;

    /* renamed from: c */
    private final C7456e f18251c;

    /* renamed from: d */
    private InputStream f18252d;

    /* renamed from: j4.c$a */
    /* compiled from: ThumbFetcher */
    static class C7453a implements C7455d {

        /* renamed from: b */
        private static final String[] f18253b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f18254a;

        C7453a(ContentResolver contentResolver) {
            this.f18254a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo37583a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f18254a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f18253b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    /* renamed from: j4.c$b */
    /* compiled from: ThumbFetcher */
    static class C7454b implements C7455d {

        /* renamed from: b */
        private static final String[] f18255b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f18256a;

        C7454b(ContentResolver contentResolver) {
            this.f18256a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo37583a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f18256a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f18255b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    @VisibleForTesting
    C7452c(Uri uri, C7456e eVar) {
        this.f18250a = uri;
        this.f18251c = eVar;
    }

    /* renamed from: c */
    private static C7452c m30936c(Context context, Uri uri, C7455d dVar) {
        return new C7452c(uri, new C7456e(C7271c.m30011c(context).mo37147j().mo32964g(), dVar, C7271c.m30011c(context).mo37142e(), context.getContentResolver()));
    }

    /* renamed from: e */
    public static C7452c m30937e(Context context, Uri uri) {
        return m30936c(context, uri, new C7453a(context.getContentResolver()));
    }

    /* renamed from: g */
    public static C7452c m30938g(Context context, Uri uri) {
        return m30936c(context, uri, new C7454b(context.getContentResolver()));
    }

    /* renamed from: h */
    private InputStream m30939h() throws FileNotFoundException {
        InputStream d = this.f18251c.mo37585d(this.f18250a);
        int a = d != null ? this.f18251c.mo37584a(this.f18250a) : -1;
        return a != -1 ? new C7408g(d, a) : d;
    }

    @NonNull
    /* renamed from: a */
    public Class<InputStream> mo37430a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo37435b() {
        InputStream inputStream = this.f18252d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public void cancel() {
    }

    @NonNull
    /* renamed from: d */
    public C7376a mo37438d() {
        return C7376a.LOCAL;
    }

    /* renamed from: f */
    public void mo37440f(@NonNull C7275g gVar, @NonNull C7401d.C7402a<? super InputStream> aVar) {
        try {
            InputStream h = m30939h();
            this.f18252d = h;
            aVar.mo33008e(h);
        } catch (FileNotFoundException e) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
            aVar.mo33006c(e);
        }
    }
}
