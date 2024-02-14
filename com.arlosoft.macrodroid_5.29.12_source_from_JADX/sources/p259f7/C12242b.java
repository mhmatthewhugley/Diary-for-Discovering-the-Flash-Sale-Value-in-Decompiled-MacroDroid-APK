package p259f7;

import android.util.Log;
import java.io.File;
import java.io.Serializable;
import p275h7.C12383b;

/* renamed from: f7.b */
/* compiled from: FileData */
public class C12242b implements Serializable {
    private boolean exceededMaximumFileSize;
    private File file;
    private String filename;
    private String mimeType;
    private C12383b originalDimensions;
    private String title;
    private boolean transientFile;

    public C12242b(C12242b bVar, C12383b bVar2) {
        this(bVar.mo68545c(), bVar.mo68551i(), bVar.mo68546d(), bVar.mo68547e(), bVar.mo68549g(), bVar2, bVar.mo68550h());
    }

    /* renamed from: a */
    public static void m82931a(C12242b bVar) {
        File c;
        if (bVar.mo68551i() && (c = bVar.mo68545c()) != null && c.exists()) {
            try {
                Log.i(C12242b.class.getSimpleName(), String.format("Removing source file '%s'", new Object[]{c.getAbsolutePath()}));
                c.delete();
            } catch (Exception e) {
                Log.i(C12242b.class.getSimpleName(), String.format("Could not remove source file '%s'", new Object[]{c.getAbsolutePath()}), e);
            }
        }
    }

    /* renamed from: b */
    public static C12242b m82932b(C12242b bVar) {
        return new C12242b((File) null, true, bVar.mo68546d(), bVar.mo68547e(), bVar.mo68549g(), bVar.mo68548f(), true);
    }

    /* renamed from: j */
    public static C12242b m82933j(C12242b bVar, File file2, boolean z, String str) {
        m82931a(bVar);
        return new C12242b(bVar, file2, z, str);
    }

    /* renamed from: c */
    public File mo68545c() {
        return this.file;
    }

    /* renamed from: d */
    public String mo68546d() {
        return this.filename;
    }

    /* renamed from: e */
    public String mo68547e() {
        return this.mimeType;
    }

    /* renamed from: f */
    public C12383b mo68548f() {
        return this.originalDimensions;
    }

    /* renamed from: g */
    public String mo68549g() {
        return this.title;
    }

    /* renamed from: h */
    public boolean mo68550h() {
        return this.exceededMaximumFileSize;
    }

    /* renamed from: i */
    public boolean mo68551i() {
        return this.transientFile;
    }

    public String toString() {
        return String.format("%s %s (%s) - %s", new Object[]{this.transientFile ? "Transient" : "Not transient", this.filename, this.mimeType, this.title});
    }

    public C12242b(C12242b bVar, File file2, boolean z, String str) {
        this(file2, z, bVar.mo68546d(), str, bVar.mo68549g(), bVar.mo68548f(), bVar.mo68550h());
    }

    public C12242b(File file2, boolean z, String str, String str2) {
        this(file2, z, str, str2, (String) null, (C12383b) null, false);
    }

    public C12242b(File file2, boolean z, String str, String str2, String str3) {
        this(file2, z, str, str2, str3, (C12383b) null, false);
    }

    public C12242b(File file2, boolean z, String str, String str2, String str3, C12383b bVar, boolean z2) {
        this.filename = str;
        this.transientFile = z;
        this.mimeType = str2;
        this.file = file2;
        this.title = str3;
        this.exceededMaximumFileSize = z2;
        this.originalDimensions = bVar;
    }
}
