package p410ue;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import org.apache.commons.p353io.FilenameUtils;
import org.slf4j.LoggerFactory;
import org.zeroturnaround.zip.ZipBreakException;
import org.zeroturnaround.zip.ZipException;
import p339ne.C15790b;
import p419ve.C16771a;
import p419ve.C16772b;
import p419ve.C16773c;

/* renamed from: ue.l */
/* compiled from: ZipUtil */
public final class C16712l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C15790b f67634a = LoggerFactory.m96693h("org/zeroturnaround/zip/ZipUtil".replace('/', FilenameUtils.EXTENSION_SEPARATOR));

    /* renamed from: ue.l$a */
    /* compiled from: ZipUtil */
    private static class C16713a implements C16709i {

        /* renamed from: a */
        private final File f67635a;

        /* renamed from: b */
        private final C16703d f67636b;

        public C16713a(File file, C16703d dVar) {
            this.f67635a = file;
            this.f67636b = dVar;
        }

        /* renamed from: a */
        public void mo79629a(InputStream inputStream, ZipEntry zipEntry) throws IOException {
            String a = this.f67636b.mo79607a(zipEntry.getName());
            if (a != null) {
                File file = new File(this.f67635a, a);
                if (a.indexOf("..") == -1 || file.getCanonicalPath().startsWith(this.f67635a.getCanonicalPath())) {
                    if (zipEntry.isDirectory()) {
                        C16772b.m99481a(file);
                    } else {
                        C16772b.m99481a(file.getParentFile());
                        if (C16712l.f67634a.isDebugEnabled() && file.exists()) {
                            C16712l.f67634a.mo75506e("Overwriting file '{}'.", zipEntry.getName());
                        }
                        C16771a.m99480c(inputStream, file);
                    }
                    C16704e c = C16710j.m99233c(zipEntry);
                    if (c != null) {
                        C16706g.m99222d().mo79608a(file, c);
                        return;
                    }
                    return;
                }
                throw new ZipException("The file " + a + " is trying to leave the target output directory of " + this.f67635a + ". Ignoring this file.");
            }
        }
    }

    /* renamed from: b */
    public static void m99237b(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public static void m99238c(File file, C16709i iVar) {
        m99239d(file, iVar, (Charset) null);
    }

    /* renamed from: d */
    public static void m99239d(File file, C16709i iVar, Charset charset) {
        ZipEntry zipEntry;
        InputStream inputStream;
        ZipFile zipFile = null;
        if (charset == null) {
            try {
                zipFile = new ZipFile(file);
            } catch (IOException e) {
                throw new ZipException("Failed to process zip entry '" + zipEntry.getName() + "' with action " + iVar, e);
            } catch (ZipBreakException unused) {
                C16773c.m99483b(inputStream);
            } catch (IOException e2) {
                try {
                    throw C16711k.m99235a(e2);
                } catch (Throwable th) {
                    m99237b(zipFile);
                    throw th;
                }
            } catch (Throwable th2) {
                C16773c.m99483b(inputStream);
                throw th2;
            }
        } else {
            zipFile = new ZipFile(file, charset);
        }
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            zipEntry = (ZipEntry) entries.nextElement();
            inputStream = zipFile.getInputStream(zipEntry);
            iVar.mo79629a(inputStream, zipEntry);
            C16773c.m99483b(inputStream);
        }
        m99237b(zipFile);
    }

    /* renamed from: e */
    public static void m99240e(File[] fileArr, File file, C16703d dVar) {
        m99241f(fileArr, file, dVar, -1);
    }

    /* renamed from: f */
    public static void m99241f(File[] fileArr, File file, C16703d dVar, int i) {
        FileOutputStream fileOutputStream;
        f67634a.mo75504c("Compressing '{}' into '{}'.", fileArr, file);
        ZipOutputStream zipOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                ZipOutputStream zipOutputStream2 = new ZipOutputStream(new BufferedOutputStream(fileOutputStream));
                try {
                    zipOutputStream2.setLevel(i);
                    for (File file2 : fileArr) {
                        zipOutputStream2.putNextEntry(C16710j.m99231a(dVar.mo79607a(file2.getName()), file2));
                        C16771a.m99479b(file2, zipOutputStream2);
                        zipOutputStream2.closeEntry();
                    }
                    C16773c.m99484c(zipOutputStream2);
                    C16773c.m99484c(fileOutputStream);
                } catch (IOException e) {
                    e = e;
                    zipOutputStream = zipOutputStream2;
                    try {
                        throw C16711k.m99235a(e);
                    } catch (Throwable th) {
                        th = th;
                        C16773c.m99484c(zipOutputStream);
                        C16773c.m99484c(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    zipOutputStream = zipOutputStream2;
                    C16773c.m99484c(zipOutputStream);
                    C16773c.m99484c(fileOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                throw C16711k.m99235a(e);
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream = null;
            throw C16711k.m99235a(e);
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            C16773c.m99484c(zipOutputStream);
            C16773c.m99484c(fileOutputStream);
            throw th;
        }
    }

    /* renamed from: g */
    public static void m99242g(File file, File file2) {
        m99243h(file, file2, C16700a.f67600a);
    }

    /* renamed from: h */
    public static void m99243h(File file, File file2, C16703d dVar) {
        m99240e(new File[]{file}, file2, dVar);
    }

    /* renamed from: i */
    public static void m99244i(File file, File file2) {
        m99245j(file, file2, C16700a.f67600a);
    }

    /* renamed from: j */
    public static void m99245j(File file, File file2, C16703d dVar) {
        f67634a.mo75504c("Extracting '{}' into '{}'.", file, file2);
        m99238c(file, new C16713a(file2, dVar));
    }
}
