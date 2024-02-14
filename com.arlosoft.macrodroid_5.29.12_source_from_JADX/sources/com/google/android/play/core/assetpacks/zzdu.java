package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.zzag;
import java.io.File;
import java.io.IOException;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzdu {

    /* renamed from: b */
    private static final zzag f51519b = new zzag("MergeSliceTaskHandler");

    /* renamed from: a */
    private final zzbh f51520a;

    zzdu(zzbh zzbh) {
        this.f51520a = zzbh;
    }

    /* renamed from: b */
    private static void m70699b(File file, File file2) {
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                m70699b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                throw new zzck("Unable to delete directory: ".concat(String.valueOf(file)));
            }
        } else if (file2.exists()) {
            throw new zzck("File clashing with existing file from other slice: ".concat(file2.toString()));
        } else if (!file.renameTo(file2)) {
            throw new zzck("Unable to move file: ".concat(String.valueOf(file)));
        }
    }

    /* renamed from: a */
    public final void mo59746a(zzdt zzdt) {
        File E = this.f51520a.mo59626E(zzdt.f51464b, zzdt.f51516c, zzdt.f51517d, zzdt.f51518e);
        if (E.exists()) {
            File x = this.f51520a.mo59649x(zzdt.f51464b, zzdt.f51516c, zzdt.f51517d);
            if (!x.exists()) {
                x.mkdirs();
            }
            m70699b(E, x);
            try {
                this.f51520a.mo59635a(zzdt.f51464b, zzdt.f51516c, zzdt.f51517d, this.f51520a.mo59643r(zzdt.f51464b, zzdt.f51516c, zzdt.f51517d) + 1);
            } catch (IOException e) {
                f51519b.mo59806b("Writing merge checkpoint failed with %s.", e.getMessage());
                throw new zzck("Writing merge checkpoint failed.", e, zzdt.f51463a);
            }
        } else {
            throw new zzck(String.format("Cannot find verified files for slice %s.", new Object[]{zzdt.f51518e}), zzdt.f51463a);
        }
    }
}
