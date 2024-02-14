package p275h7;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.File;
import p259f7.C12241a;
import p259f7.C12242b;
import p259f7.C12246f;
import p414v9.C16735i;

/* renamed from: h7.d */
/* compiled from: GetPath */
public final class C12386d extends C12405m<C12242b> {

    /* renamed from: e */
    private static final String f59086e = "d";

    /* renamed from: a */
    private final C12241a f59087a;

    /* renamed from: b */
    private final C12246f f59088b;

    /* renamed from: c */
    private final C12384c f59089c;

    /* renamed from: d */
    private Uri f59090d;

    /* renamed from: h7.d$b */
    /* compiled from: GetPath */
    private static class C12388b {

        /* renamed from: a */
        String f59091a;

        /* renamed from: b */
        String f59092b;

        private C12388b() {
        }
    }

    public C12386d(C12241a aVar, C12246f fVar, C12384c cVar) {
        this.f59087a = aVar;
        this.f59088b = fVar;
        this.f59089c = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p259f7.C12242b m83178a(android.content.Context r12, android.net.Uri r13, java.lang.String r14, java.lang.String[] r15) {
        /*
            r11 = this;
            java.lang.String r0 = "_data"
            java.lang.String r1 = "_display_name"
            java.lang.String r2 = "mime_type"
            java.lang.String r3 = "title"
            java.lang.String[] r6 = new java.lang.String[]{r0, r1, r2, r3}
            r10 = 0
            android.content.ContentResolver r4 = r12.getContentResolver()     // Catch:{ Exception -> 0x0068, all -> 0x0061 }
            r9 = 0
            r5 = r13
            r7 = r14
            r8 = r15
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0068, all -> 0x0061 }
            if (r12 == 0) goto L_0x005b
            boolean r13 = r12.moveToFirst()     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            if (r13 == 0) goto L_0x005b
            int r13 = r12.getColumnIndexOrThrow(r0)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            java.lang.String r13 = r12.getString(r13)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            int r14 = r12.getColumnIndexOrThrow(r1)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            java.lang.String r7 = r12.getString(r14)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            int r14 = r12.getColumnIndexOrThrow(r2)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            java.lang.String r8 = r12.getString(r14)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            int r14 = r12.getColumnIndexOrThrow(r3)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            java.lang.String r9 = r12.getString(r14)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            if (r13 == 0) goto L_0x004a
            java.io.File r14 = new java.io.File     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            r14.<init>(r13)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            r5 = r14
            goto L_0x004b
        L_0x004a:
            r5 = r10
        L_0x004b:
            f7.b r13 = new f7.b     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            r6 = 0
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            r12.close()
            return r13
        L_0x0056:
            r13 = move-exception
            r10 = r12
            goto L_0x0062
        L_0x0059:
            goto L_0x0069
        L_0x005b:
            if (r12 == 0) goto L_0x0060
            r12.close()
        L_0x0060:
            return r10
        L_0x0061:
            r13 = move-exception
        L_0x0062:
            if (r10 == 0) goto L_0x0067
            r10.close()
        L_0x0067:
            throw r13
        L_0x0068:
            r12 = r10
        L_0x0069:
            if (r12 == 0) goto L_0x006e
            r12.close()
        L_0x006e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p275h7.C12386d.m83178a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):f7.b");
    }

    /* renamed from: b */
    private C12388b m83179b(Uri uri) {
        C12388b bVar = new C12388b();
        String[] split = DocumentsContract.getDocumentId(uri).split(":");
        bVar.f59091a = split[0];
        bVar.f59092b = split[1];
        return bVar;
    }

    /* renamed from: c */
    private C12242b m83180c(Context context) {
        Uri uri;
        try {
            uri = ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(this.f59090d)).longValue());
        } catch (NumberFormatException e) {
            Log.e(f59086e, e.getMessage());
            e.printStackTrace();
            uri = this.f59090d;
        }
        return m83178a(context, uri, (String) null, (String[]) null);
    }

    /* renamed from: d */
    private C12242b m83181d(Context context) {
        return new C12242b(new File(this.f59090d.getPath()), false, C12393f.m83207p(this.f59090d.getPath()), C12393f.m83209r(context, this.f59090d));
    }

    @Nullable
    /* renamed from: e */
    private C12242b m83182e(Context context) {
        if (DocumentsContract.isDocumentUri(context, this.f59090d)) {
            if (m83187j(this.f59090d)) {
                C12388b b = m83179b(this.f59090d);
                if ("primary".equalsIgnoreCase(b.f59091a)) {
                    return m83185h(b);
                }
            } else if (m83186i(this.f59090d)) {
                return m83180c(context);
            } else {
                if (m83189l(this.f59090d)) {
                    return m83184g(context);
                }
            }
        } else if ("content".equalsIgnoreCase(this.f59090d.getScheme())) {
            if (!m83188k(context)) {
                return m83178a(context, this.f59090d, (String) null, (String[]) null);
            }
        } else if ("file".equalsIgnoreCase(this.f59090d.getScheme())) {
            return m83181d(context);
        }
        return null;
    }

    /* renamed from: f */
    private C16735i<C12242b> m83183f() {
        Context c = this.f59088b.mo68561c();
        if (this.f59090d == null || c == null) {
            return null;
        }
        C12242b e = m83182e(c);
        if (e == null || e.mo68545c() == null) {
            return this.f59089c.mo68725j(this.f59090d, e).mo68724h();
        }
        return C16735i.m99342F(e);
    }

    /* renamed from: g */
    private C12242b m83184g(Context context) {
        Uri uri;
        C12388b b = m83179b(this.f59090d);
        if ("image".equals(b.f59091a)) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if ("video".equals(b.f59091a)) {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            uri = "audio".equals(b.f59091a) ? MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : null;
        }
        return m83178a(context, uri, "_id=?", new String[]{b.f59092b});
    }

    /* renamed from: h */
    private C12242b m83185h(C12388b bVar) {
        String s = C12393f.m83210s(bVar.f59092b);
        String B = C12393f.m83197B(bVar.f59092b);
        return new C12242b(new File(Environment.getExternalStorageDirectory() + "/" + bVar.f59092b), false, B, s);
    }

    /* renamed from: i */
    private boolean m83186i(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    /* renamed from: j */
    private boolean m83187j(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    /* renamed from: k */
    private boolean m83188k(Context context) {
        return this.f59090d.getPath().startsWith(this.f59087a.mo68525a(context));
    }

    /* renamed from: l */
    private boolean m83189l(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    /* renamed from: m */
    public C16735i<C12242b> mo68726m() {
        return m83183f();
    }

    /* renamed from: n */
    public C12386d mo68727n(Uri uri) {
        this.f59090d = uri;
        return this;
    }
}
