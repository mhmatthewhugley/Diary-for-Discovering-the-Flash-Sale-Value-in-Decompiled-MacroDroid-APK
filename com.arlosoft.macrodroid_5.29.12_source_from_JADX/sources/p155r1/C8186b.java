package p155r1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: r1.b */
/* compiled from: FileEncoder */
class C8186b {
    /* renamed from: a */
    static String m33946a(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file.getAbsolutePath());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 2);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read != -1) {
                base64OutputStream.write(bArr, 0, read);
            } else {
                base64OutputStream.close();
                return byteArrayOutputStream.toString();
            }
        }
    }

    /* renamed from: b */
    static File m33947b(Context context, Uri uri) throws IOException {
        Cursor query = context.getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return null;
        }
        int columnIndex = query.getColumnIndex("_display_name");
        query.moveToFirst();
        File file = new File(context.getExternalCacheDir(), query.getString(columnIndex));
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
        if (openInputStream == null) {
            return null;
        }
        byte[] bArr = new byte[4096];
        while (true) {
            int read = openInputStream.read(bArr);
            if (read != -1) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                query.close();
                fileOutputStream.close();
                openInputStream.close();
                return file;
            }
        }
    }
}
