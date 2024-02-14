package p393t6;

import java.io.File;

/* renamed from: t6.b */
/* compiled from: FileUtility */
public class C16575b {
    /* renamed from: a */
    public static boolean m98803a(File file) {
        File[] listFiles;
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isDirectory()) {
                    m98803a(listFiles[i]);
                } else {
                    listFiles[i].delete();
                }
            }
        }
        return file.delete();
    }
}
