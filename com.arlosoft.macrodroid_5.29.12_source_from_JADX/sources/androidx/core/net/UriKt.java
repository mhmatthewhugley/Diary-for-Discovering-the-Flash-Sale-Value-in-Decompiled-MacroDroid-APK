package androidx.core.net;

import android.net.Uri;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\r\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\b\u001a\r\u0010\u0003\u001a\u00020\u0002*\u00020\u0004H\b¨\u0006\u0005"}, mo71668d2 = {"toFile", "Ljava/io/File;", "Landroid/net/Uri;", "toUri", "", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: Uri.kt */
public final class UriKt {
    public static final File toFile(Uri uri) {
        C13706o.m87929f(uri, "<this>");
        if (C13706o.m87924a(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                return new File(path);
            }
            throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
        }
        throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
    }

    public static final Uri toUri(String str) {
        C13706o.m87929f(str, "<this>");
        Uri parse = Uri.parse(str);
        C13706o.m87928e(parse, "parse(this)");
        return parse;
    }

    public static final Uri toUri(File file) {
        C13706o.m87929f(file, "<this>");
        Uri fromFile = Uri.fromFile(file);
        C13706o.m87928e(fromFile, "fromFile(this)");
        return fromFile;
    }
}
