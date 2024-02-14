package p410ue;

import androidx.core.app.FrameMetricsAggregator;
import java.io.File;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import p428we.C16843a;
import p428we.C16844b;
import p428we.C16846d;

/* renamed from: ue.j */
/* compiled from: ZipEntryUtil */
class C16710j {
    /* renamed from: a */
    static ZipEntry m99231a(String str, File file) {
        ZipEntry zipEntry = new ZipEntry(str);
        if (!file.isDirectory()) {
            zipEntry.setSize(file.length());
        }
        zipEntry.setTime(file.lastModified());
        C16704e b = C16706g.m99222d().mo79609b(file);
        if (b != null) {
            m99234d(zipEntry, b);
        }
        return zipEntry;
    }

    /* renamed from: b */
    private static C16843a m99232b(List<C16846d> list) {
        C16843a aVar = null;
        for (C16846d next : list) {
            if (next instanceof C16843a) {
                aVar = (C16843a) next;
            }
        }
        return aVar;
    }

    /* renamed from: c */
    static C16704e m99233c(ZipEntry zipEntry) {
        try {
            C16843a b = m99232b(C16844b.m99842c(zipEntry.getExtra()));
            if (b != null) {
                return C16706g.m99221c(b.mo79965g() & FrameMetricsAggregator.EVERY_DURATION);
            }
            return null;
        } catch (ZipException e) {
            throw new org.zeroturnaround.zip.ZipException((Exception) e);
        }
    }

    /* renamed from: d */
    static boolean m99234d(ZipEntry zipEntry, C16704e eVar) {
        try {
            List<C16846d> c = C16844b.m99842c(zipEntry.getExtra());
            C16843a b = m99232b(c);
            if (b == null) {
                b = new C16843a();
                c.add(b);
            }
            b.mo79970o(zipEntry.isDirectory());
            b.mo79971p(C16706g.m99223e(eVar));
            zipEntry.setExtra(C16844b.m99841b(c));
            return true;
        } catch (ZipException unused) {
            return false;
        }
    }
}
