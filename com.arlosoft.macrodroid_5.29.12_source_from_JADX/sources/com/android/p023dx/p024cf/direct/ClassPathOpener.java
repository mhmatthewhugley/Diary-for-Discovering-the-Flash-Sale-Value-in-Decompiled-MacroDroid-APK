package com.android.p023dx.p024cf.direct;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.android.dex.util.FileUtils;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.android.dx.cf.direct.ClassPathOpener */
public class ClassPathOpener {
    public static final FileNameFilter acceptAll = new FileNameFilter() {
        public boolean accept(String str) {
            return true;
        }
    };
    private final Consumer consumer;
    private FileNameFilter filter;
    private final String pathname;
    private final boolean sort;

    /* renamed from: com.android.dx.cf.direct.ClassPathOpener$Consumer */
    public interface Consumer {
        void onException(Exception exc);

        void onProcessArchiveStart(File file);

        boolean processFileBytes(String str, long j, byte[] bArr);
    }

    /* renamed from: com.android.dx.cf.direct.ClassPathOpener$FileNameFilter */
    public interface FileNameFilter {
        boolean accept(String str);
    }

    public ClassPathOpener(String str, boolean z, Consumer consumer2) {
        this(str, z, acceptAll, consumer2);
    }

    /* access modifiers changed from: private */
    public static int compareClassNames(String str, String str2) {
        return str.replace('$', '0').replace("package-info", "").compareTo(str2.replace('$', '0').replace("package-info", ""));
    }

    private boolean processArchive(File file) throws IOException {
        byte[] bArr;
        ZipFile zipFile = new ZipFile(file);
        ArrayList<T> list = Collections.list(zipFile.entries());
        if (this.sort) {
            Collections.sort(list, new Comparator<ZipEntry>() {
                public int compare(ZipEntry zipEntry, ZipEntry zipEntry2) {
                    return ClassPathOpener.compareClassNames(zipEntry.getName(), zipEntry2.getName());
                }
            });
        }
        this.consumer.onProcessArchiveStart(file);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(SamsungIrisUnlockModule.IRIS_ONE_EYE);
        byte[] bArr2 = new byte[AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH];
        Iterator<T> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            ZipEntry zipEntry = (ZipEntry) it.next();
            boolean isDirectory = zipEntry.isDirectory();
            String name = zipEntry.getName();
            if (this.filter.accept(name)) {
                if (!isDirectory) {
                    InputStream inputStream = zipFile.getInputStream(zipEntry);
                    byteArrayOutputStream.reset();
                    while (true) {
                        int read = inputStream.read(bArr2);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                    inputStream.close();
                    bArr = byteArrayOutputStream.toByteArray();
                } else {
                    bArr = new byte[0];
                }
                z |= this.consumer.processFileBytes(name, zipEntry.getTime(), bArr);
            }
        }
        zipFile.close();
        return z;
    }

    private boolean processDirectory(File file, boolean z) {
        if (z) {
            file = new File(file, ".");
        }
        File[] listFiles = file.listFiles();
        if (this.sort) {
            Arrays.sort(listFiles, new Comparator<File>() {
                public int compare(File file, File file2) {
                    return ClassPathOpener.compareClassNames(file.getName(), file2.getName());
                }
            });
        }
        boolean z2 = false;
        for (File processOne : listFiles) {
            z2 |= processOne(processOne, false);
        }
        return z2;
    }

    private boolean processOne(File file, boolean z) {
        try {
            if (file.isDirectory()) {
                return processDirectory(file, z);
            }
            String path = file.getPath();
            if (!path.endsWith(".zip") && !path.endsWith(".jar")) {
                if (!path.endsWith(".apk")) {
                    if (!this.filter.accept(path)) {
                        return false;
                    }
                    return this.consumer.processFileBytes(path, file.lastModified(), FileUtils.readFile(file));
                }
            }
            return processArchive(file);
        } catch (Exception e) {
            this.consumer.onException(e);
            return false;
        }
    }

    public boolean process() {
        return processOne(new File(this.pathname), true);
    }

    public ClassPathOpener(String str, boolean z, FileNameFilter fileNameFilter, Consumer consumer2) {
        this.pathname = str;
        this.sort = z;
        this.consumer = consumer2;
        this.filter = fileNameFilter;
    }
}
