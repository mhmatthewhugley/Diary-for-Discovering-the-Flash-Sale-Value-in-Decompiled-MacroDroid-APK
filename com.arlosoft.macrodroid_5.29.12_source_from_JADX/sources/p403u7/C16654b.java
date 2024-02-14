package p403u7;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import p376r7.C16351a;
import p376r7.C16355b;
import p385s7.C16505a;
import p394t7.C16579a;

/* renamed from: u7.b */
/* compiled from: Remounter */
public class C16654b {
    /* renamed from: a */
    private void m99069a(C16351a aVar) {
        synchronized (aVar) {
            try {
                if (!aVar.mo79017j()) {
                    aVar.wait(2000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    private C16579a m99070b(String str) {
        try {
            ArrayList<C16579a> m = C16505a.m98572m();
            File file = new File(str);
            while (true) {
                Iterator<C16579a> it = m.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C16579a next = it.next();
                        if (next.mo79404c().equals(file)) {
                            return next;
                        }
                    }
                }
            }
        } catch (IOException e) {
            if (!C16505a.f67202b) {
                return null;
            }
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            if (!C16505a.f67202b) {
                return null;
            }
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public boolean mo79550c(String str, String str2) {
        String str3;
        C16654b bVar = this;
        String str4 = str;
        String str5 = str2;
        if (str4.endsWith("/") && !str4.equals("/")) {
            str4 = str4.substring(0, str4.lastIndexOf("/"));
        }
        boolean z = false;
        while (!z) {
            try {
                Iterator<C16579a> it = C16505a.m98572m().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C16579a next = it.next();
                    C16505a.m98585z(next.mo79404c().toString());
                    if (str4.equals(next.mo79404c().toString())) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    try {
                        str4 = new File(str4).getParent();
                    } catch (Exception e) {
                        e.printStackTrace();
                        return false;
                    }
                }
            } catch (Exception e2) {
                if (C16505a.f67202b) {
                    e2.printStackTrace();
                }
                return false;
            }
        }
        C16579a b = bVar.m99070b(str4);
        if (b != null) {
            StringBuilder sb = new StringBuilder();
            String str6 = " mountType was: ";
            sb.append("Remounting ");
            sb.append(b.mo79404c().getAbsolutePath());
            sb.append(" as ");
            sb.append(str2.toLowerCase());
            C16505a.m98556A("RootTools v5.0", sb.toString());
            String str7 = "mount is null, file was: ";
            if (!b.mo79403b().contains(str2.toLowerCase())) {
                try {
                    String[] strArr = new String[17];
                    str3 = "RootTools v5.0";
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("busybox mount -o remount,");
                        try {
                            sb2.append(str2.toLowerCase());
                            sb2.append(" ");
                            sb2.append(b.mo79402a().getAbsolutePath());
                            sb2.append(" ");
                            sb2.append(b.mo79404c().getAbsolutePath());
                            strArr[0] = sb2.toString();
                            strArr[1] = "busybox mount -o remount," + str2.toLowerCase() + " " + str4;
                            strArr[2] = "busybox mount -o " + str2.toLowerCase() + ",remount " + b.mo79402a().getAbsolutePath();
                            strArr[3] = "busybox mount -o " + str2.toLowerCase() + ",remount " + str4;
                            strArr[4] = "toolbox mount -o remount," + str2.toLowerCase() + " " + b.mo79402a().getAbsolutePath() + " " + b.mo79404c().getAbsolutePath();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("toolbox mount -o remount,");
                            sb3.append(str2.toLowerCase());
                            sb3.append(" ");
                            sb3.append(str4);
                            strArr[5] = sb3.toString();
                            strArr[6] = "toybox mount -o remount," + str2.toLowerCase() + " " + b.mo79402a().getAbsolutePath() + " " + b.mo79404c().getAbsolutePath();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("toolbox mount -o ");
                            sb4.append(str2.toLowerCase());
                            sb4.append(",remount ");
                            sb4.append(b.mo79402a().getAbsolutePath());
                            strArr[7] = sb4.toString();
                            strArr[8] = "toolbox mount -o " + str2.toLowerCase() + ",remount " + str4;
                            strArr[9] = "mount -o remount," + str2.toLowerCase() + " " + b.mo79402a().getAbsolutePath() + " " + b.mo79404c().getAbsolutePath();
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("mount -o remount,");
                            sb5.append(str2.toLowerCase());
                            sb5.append(" ");
                            sb5.append(str4);
                            strArr[10] = sb5.toString();
                            strArr[11] = "mount -o " + str2.toLowerCase() + ",remount " + b.mo79402a().getAbsolutePath();
                            strArr[12] = "mount -o " + str2.toLowerCase() + ",remount " + str4;
                            strArr[13] = "toybox mount -o remount," + str2.toLowerCase() + " " + b.mo79402a().getAbsolutePath() + " " + b.mo79404c().getAbsolutePath();
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("toybox mount -o remount,");
                            sb6.append(str2.toLowerCase());
                            sb6.append(" ");
                            sb6.append(str4);
                            strArr[14] = sb6.toString();
                            strArr[15] = "toybox mount -o " + str2.toLowerCase() + ",remount " + b.mo79402a().getAbsolutePath();
                            strArr[16] = "toybox mount -o " + str2.toLowerCase() + ",remount " + str4;
                            C16351a aVar = new C16351a(0, true, strArr);
                            C16355b.m98065L().mo79032w(aVar);
                            bVar = this;
                            bVar.m99069a(aVar);
                        } catch (Exception unused) {
                            bVar = this;
                        }
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    str3 = "RootTools v5.0";
                }
                b = bVar.m99070b(str4);
            } else {
                str3 = "RootTools v5.0";
            }
            if (b != null) {
                C16505a.m98556A(str3, b.mo79403b() + " AND " + str2.toLowerCase());
                if (b.mo79403b().contains(str2.toLowerCase())) {
                    C16505a.m98585z(b.mo79403b().toString());
                    return true;
                }
                C16505a.m98585z(b.mo79403b().toString());
                return false;
            }
            C16505a.m98585z(str7 + str4 + str6 + str2);
            return false;
        }
        String str8 = str5;
        C16505a.m98585z("mount is null, file was: " + str4 + " mountType was: " + str8);
        return false;
    }
}
