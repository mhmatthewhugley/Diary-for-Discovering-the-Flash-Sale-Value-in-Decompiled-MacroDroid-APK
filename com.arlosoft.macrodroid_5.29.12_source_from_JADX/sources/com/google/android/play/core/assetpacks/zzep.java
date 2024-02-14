package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.commons.cli.HelpFormatter;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzep {

    /* renamed from: a */
    private static final Pattern f51591a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    /* renamed from: a */
    static List m70730a(File file, File file2) throws IOException {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(zzeo.f51590a);
        if (listFiles == null) {
            fileArr = new File[0];
        } else {
            File[] fileArr2 = new File[r2];
            for (File file3 : listFiles) {
                int parseInt = Integer.parseInt(file3.getName().split(HelpFormatter.DEFAULT_OPT_PREFIX)[0]);
                if (parseInt > listFiles.length || fileArr2[parseInt] != null) {
                    throw new zzck("Metadata folder ordering corrupt.");
                }
                fileArr2[parseInt] = file3;
            }
            fileArr = fileArr2;
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    zzet c = new zzbw(fileInputStream).mo59689c();
                    if (c.mo59680c() != null) {
                        File file5 = new File(file, c.mo59680c());
                        if (file5.exists()) {
                            arrayList.add(file5);
                            fileInputStream.close();
                        } else {
                            throw new zzck(String.format("Missing asset file %s during slice reconstruction.", new Object[]{file5.getCanonicalPath()}));
                        }
                    } else {
                        throw new zzck("Metadata files corrupt. Could not read local file header.");
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
        throw th;
    }
}
