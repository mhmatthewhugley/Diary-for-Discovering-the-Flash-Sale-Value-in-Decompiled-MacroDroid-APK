package p403u7;

import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import p367q7.C16225a;
import p376r7.C16351a;
import p376r7.C16355b;
import p385s7.C16505a;
import p394t7.C16579a;
import p394t7.C16580b;

/* renamed from: u7.c */
/* compiled from: RootToolsInternalMethods */
public final class C16655c {

    /* renamed from: u7.c$a */
    /* compiled from: RootToolsInternalMethods */
    class C16656a extends C16351a {

        /* renamed from: p */
        final /* synthetic */ String f67542p;

        /* renamed from: q */
        final /* synthetic */ String f67543q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16656a(int i, boolean z, String[] strArr, String str, String str2) {
            super(i, z, strArr);
            this.f67542p = str;
            this.f67543q = str2;
        }

        /* renamed from: c */
        public void mo25775c(int i, String str) {
            if (this.f67542p.endsWith("toolbox")) {
                if (!str.contains("no such tool")) {
                    C16653a.f67533a = true;
                }
            } else if (this.f67542p.endsWith("busybox") && str.contains(this.f67543q)) {
                C16505a.m98585z("Found util!");
                C16653a.f67533a = true;
            }
            super.mo25775c(i, str);
        }
    }

    /* renamed from: u7.c$b */
    /* compiled from: RootToolsInternalMethods */
    class C16657b extends C16351a {

        /* renamed from: p */
        final /* synthetic */ String f67545p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16657b(int i, boolean z, String[] strArr, String str) {
            super(i, z, strArr);
            this.f67545p = str;
        }

        /* renamed from: c */
        public void mo25775c(int i, String str) {
            if (str.contains(this.f67545p)) {
                Matcher matcher = C16653a.f67541i.matcher(str);
                try {
                    if (matcher.find()) {
                        String group = matcher.group(1);
                        String str2 = C16653a.f67537e + " " + group;
                        C16653a.f67537e = str2;
                        C16653a.f67537e = str2.trim();
                        C16505a.m98585z("Found pid: " + group);
                    } else {
                        C16505a.m98585z("Matching in ps command failed!");
                    }
                } catch (Exception e) {
                    C16505a.m98585z("Error with regex!");
                    e.printStackTrace();
                }
            }
            super.mo25775c(i, str);
        }
    }

    /* renamed from: u7.c$c */
    /* compiled from: RootToolsInternalMethods */
    class C16658c extends C16351a {

        /* renamed from: p */
        final /* synthetic */ List f67547p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16658c(int i, boolean z, String[] strArr, List list) {
            super(i, z, strArr);
            this.f67547p = list;
        }

        /* renamed from: c */
        public void mo25775c(int i, String str) {
            if (i == 3 && !str.trim().equals("") && !str.trim().contains("not found") && !str.trim().contains("file busy")) {
                this.f67547p.add(str);
            }
            super.mo25775c(i, str);
        }
    }

    /* renamed from: u7.c$d */
    /* compiled from: RootToolsInternalMethods */
    class C16659d extends C16351a {

        /* renamed from: p */
        final /* synthetic */ List f67549p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16659d(int i, boolean z, String[] strArr, List list) {
            super(i, z, strArr);
            this.f67549p = list;
        }

        /* renamed from: c */
        public void mo25775c(int i, String str) {
            if (i == 3 && !str.trim().equals("") && !str.trim().contains("not found") && !str.trim().contains("file busy")) {
                this.f67549p.add(str);
            }
            super.mo25775c(i, str);
        }
    }

    /* renamed from: u7.c$e */
    /* compiled from: RootToolsInternalMethods */
    class C16660e extends C16351a {

        /* renamed from: p */
        final /* synthetic */ StringBuilder f67551p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16660e(int i, boolean z, String[] strArr, StringBuilder sb) {
            super(i, z, strArr);
            this.f67551p = sb;
        }

        /* renamed from: c */
        public void mo25775c(int i, String str) {
            String trim = str.trim();
            if (i == 4) {
                C16505a.m98585z("Version Output: " + trim);
                String[] split = trim.split(" ");
                if (split.length > 1 && split[1].contains("v1.")) {
                    this.f67551p.append(split[1]);
                    C16505a.m98585z("Found Version: " + this.f67551p.toString());
                }
            }
            super.mo25775c(i, trim);
        }
    }

    /* renamed from: u7.c$f */
    /* compiled from: RootToolsInternalMethods */
    class C16661f extends C16351a {

        /* renamed from: p */
        final /* synthetic */ StringBuilder f67553p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16661f(int i, boolean z, String[] strArr, StringBuilder sb) {
            super(i, z, strArr);
            this.f67553p = sb;
        }

        /* renamed from: c */
        public void mo25775c(int i, String str) {
            String trim = str.trim();
            if (i == 4) {
                C16505a.m98585z("Version Output: " + trim);
                String[] split = trim.split(" ");
                if (split.length > 1 && split[1].contains("v1.")) {
                    this.f67553p.append(split[1]);
                    C16505a.m98585z("Found Version: " + this.f67553p.toString());
                }
            }
            super.mo25775c(i, trim);
        }
    }

    /* renamed from: u7.c$g */
    /* compiled from: RootToolsInternalMethods */
    class C16662g extends C16351a {
        C16662g(int i, boolean z, String... strArr) {
            super(i, z, strArr);
        }

        /* renamed from: c */
        public void mo25775c(int i, String str) {
            if (i == 5 && !str.trim().equals("") && Character.isDigit(str.trim().substring(0, 1).toCharArray()[0])) {
                C16653a.f67539g = str.trim().split(" ")[0];
            }
            super.mo25775c(i, str);
        }
    }

    /* renamed from: u7.c$h */
    /* compiled from: RootToolsInternalMethods */
    class C16663h extends C16351a {
        C16663h(int i, boolean z, String... strArr) {
            super(i, z, strArr);
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0049 */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0053 A[Catch:{ Exception -> 0x0057 }] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo25775c(int r6, java.lang.String r7) {
            /*
                r5 = this;
                r0 = 1
                if (r6 != r0) goto L_0x005f
                java.lang.String r1 = ""
                java.lang.String r2 = " "
                java.lang.String[] r3 = r7.split(r2)
                r4 = 0
                r3 = r3[r4]
                int r3 = r3.length()
                r4 = 10
                if (r3 == r4) goto L_0x001a
                super.mo25775c(r6, r7)
                return
            L_0x001a:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Line "
                r3.append(r4)
                r3.append(r7)
                java.lang.String r3 = r3.toString()
                p385s7.C16505a.m98585z(r3)
                java.lang.String[] r2 = r7.split(r2)     // Catch:{ Exception -> 0x0049 }
                int r3 = r2.length     // Catch:{ Exception -> 0x0049 }
                int r3 = r3 + -2
                r3 = r2[r3]     // Catch:{ Exception -> 0x0049 }
                java.lang.String r4 = "->"
                boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0049 }
                if (r3 == 0) goto L_0x0049
                java.lang.String r3 = "Symlink found."
                p385s7.C16505a.m98585z(r3)     // Catch:{ Exception -> 0x0049 }
                int r3 = r2.length     // Catch:{ Exception -> 0x0049 }
                int r3 = r3 - r0
                r0 = r2[r3]     // Catch:{ Exception -> 0x0049 }
                r1 = r0
            L_0x0049:
                u7.c r0 = p403u7.C16655c.this     // Catch:{ Exception -> 0x0057 }
                t7.b r0 = r0.mo79562n(r7)     // Catch:{ Exception -> 0x0057 }
                p403u7.C16653a.f67540h = r0     // Catch:{ Exception -> 0x0057 }
                if (r0 == 0) goto L_0x005f
                r0.mo79415j(r1)     // Catch:{ Exception -> 0x0057 }
                goto L_0x005f
            L_0x0057:
                r0 = move-exception
                java.lang.String r0 = r0.getMessage()
                p385s7.C16505a.m98585z(r0)
            L_0x005f:
                super.mo25775c(r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p403u7.C16655c.C16663h.mo25775c(int, java.lang.String):void");
        }
    }

    /* renamed from: u7.c$i */
    /* compiled from: RootToolsInternalMethods */
    class C16664i extends C16351a {
        C16664i(int i, boolean z, String... strArr) {
            super(i, z, strArr);
        }

        /* renamed from: c */
        public void mo25775c(int i, String str) {
            if (i == 8) {
                C16505a.m98585z(str);
                String[] split = str.split(" ");
                C16653a.f67538f.add(new C16579a(new File(split[0]), new File(split[1]), split[2], split[3]));
            }
            super.mo25775c(i, str);
        }
    }

    /* renamed from: u7.c$j */
    /* compiled from: RootToolsInternalMethods */
    class C16665j extends C16351a {
        C16665j(int i, boolean z, String... strArr) {
            super(i, z, strArr);
        }

        /* renamed from: c */
        public void mo25775c(int i, String str) {
            if (i == 6 && str.contains(C16653a.f67536d.trim())) {
                C16653a.f67535c = str.split(" ");
            }
            super.mo25775c(i, str);
        }
    }

    /* renamed from: u7.c$k */
    /* compiled from: RootToolsInternalMethods */
    class C16666k extends C16351a {

        /* renamed from: p */
        final /* synthetic */ List f67559p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16666k(int i, boolean z, String[] strArr, List list) {
            super(i, z, strArr);
            this.f67559p = list;
        }

        /* renamed from: c */
        public void mo25775c(int i, String str) {
            if (i == 7 && !str.trim().equals("")) {
                this.f67559p.add(str);
            }
            super.mo25775c(i, str);
        }
    }

    protected C16655c() {
    }

    /* renamed from: b */
    private void m99072b(C16355b bVar, C16351a aVar) throws Exception {
        while (!aVar.mo79017j()) {
            C16505a.m98556A("RootTools v5.0", bVar.mo79027G(aVar));
            C16505a.m98556A("RootTools v5.0", "Processed " + aVar.f66845d + " of " + aVar.f66844c + " output from command.");
            synchronized (aVar) {
                try {
                    if (!aVar.mo79017j()) {
                        aVar.wait(2000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (!aVar.mo79016i() && !aVar.mo79017j()) {
                boolean z = bVar.f66876l;
                if (!z && !bVar.f66877m) {
                    Log.e("RootTools v5.0", "Waiting for a command to be executed in a shell that is not executing and not reading! \n\n Command: " + aVar.mo79014g());
                    Exception exc = new Exception();
                    exc.setStackTrace(Thread.currentThread().getStackTrace());
                    exc.printStackTrace();
                } else if (!z || bVar.f66877m) {
                    Log.e("RootTools v5.0", "Waiting for a command to be executed in a shell that is not reading! \n\n Command: " + aVar.mo79014g());
                    Exception exc2 = new Exception();
                    exc2.setStackTrace(Thread.currentThread().getStackTrace());
                    exc2.printStackTrace();
                } else {
                    Log.e("RootTools v5.0", "Waiting for a command to be executed in a shell that is executing but not reading! \n\n Command: " + aVar.mo79014g());
                    Exception exc3 = new Exception();
                    exc3.setStackTrace(Thread.currentThread().getStackTrace());
                    exc3.printStackTrace();
                }
            }
        }
    }

    /* renamed from: l */
    public static void m99073l() {
        C16505a.m98559D(new C16655c());
    }

    /* renamed from: a */
    public boolean mo79551a(String str) {
        String str2;
        List<String> f = C16225a.m97483f(str, true);
        if (f.size() <= 0) {
            return false;
        }
        for (String next : f) {
            C16580b j = C16505a.m98569j(next + "/" + str);
            if (j != null) {
                if (Integer.toString(j.mo79408c()).length() > 3) {
                    str2 = Integer.toString(j.mo79408c()).substring(1);
                } else {
                    str2 = Integer.toString(j.mo79408c());
                }
                if (str2.equals("755") || str2.equals("777") || str2.equals("775")) {
                    C16505a.f67203c = next + "/" + str;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (r13.mo79015h() == 0) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0088, code lost:
        if (r13.mo79015h() == 0) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        r10 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo79552c(java.lang.String r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            r9 = this;
            java.lang.String r0 = "busybox"
            java.lang.String r1 = "cp"
            r2 = 1
            r3 = 0
            r4 = 0
            if (r12 == 0) goto L_0x0012
            java.lang.String r5 = "RW"
            p385s7.C16505a.m98558C(r11, r5)     // Catch:{ Exception -> 0x000f }
            goto L_0x0012
        L_0x000f:
            r10 = move-exception
            goto L_0x018f
        L_0x0012:
            boolean r5 = r9.mo79551a(r1)     // Catch:{ Exception -> 0x000f }
            java.lang.String r6 = " "
            if (r5 == 0) goto L_0x0094
            java.lang.String r0 = "cp command is available!"
            p385s7.C16505a.m98585z(r0)     // Catch:{ Exception -> 0x000f }
            if (r13 == 0) goto L_0x0056
            r7.a r13 = new r7.a     // Catch:{ Exception -> 0x000f }
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch:{ Exception -> 0x000f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x000f }
            r1.<init>()     // Catch:{ Exception -> 0x000f }
            java.lang.String r5 = "cp -fp "
            r1.append(r5)     // Catch:{ Exception -> 0x000f }
            r1.append(r10)     // Catch:{ Exception -> 0x000f }
            r1.append(r6)     // Catch:{ Exception -> 0x000f }
            r1.append(r11)     // Catch:{ Exception -> 0x000f }
            java.lang.String r10 = r1.toString()     // Catch:{ Exception -> 0x000f }
            r0[r3] = r10     // Catch:{ Exception -> 0x000f }
            r13.<init>((int) r3, (boolean) r3, (java.lang.String[]) r0)     // Catch:{ Exception -> 0x000f }
            r7.b r10 = p376r7.C16355b.m98065L()     // Catch:{ Exception -> 0x0090 }
            r10.mo79032w(r13)     // Catch:{ Exception -> 0x0090 }
            r7.b r10 = p376r7.C16355b.m98065L()     // Catch:{ Exception -> 0x0090 }
            r9.m99072b(r10, r13)     // Catch:{ Exception -> 0x0090 }
            int r10 = r13.mo79015h()     // Catch:{ Exception -> 0x0090 }
            if (r10 != 0) goto L_0x008c
            goto L_0x008a
        L_0x0056:
            r7.a r13 = new r7.a     // Catch:{ Exception -> 0x000f }
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch:{ Exception -> 0x000f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x000f }
            r1.<init>()     // Catch:{ Exception -> 0x000f }
            java.lang.String r5 = "cp -f "
            r1.append(r5)     // Catch:{ Exception -> 0x000f }
            r1.append(r10)     // Catch:{ Exception -> 0x000f }
            r1.append(r6)     // Catch:{ Exception -> 0x000f }
            r1.append(r11)     // Catch:{ Exception -> 0x000f }
            java.lang.String r10 = r1.toString()     // Catch:{ Exception -> 0x000f }
            r0[r3] = r10     // Catch:{ Exception -> 0x000f }
            r13.<init>((int) r3, (boolean) r3, (java.lang.String[]) r0)     // Catch:{ Exception -> 0x000f }
            r7.b r10 = p376r7.C16355b.m98065L()     // Catch:{ Exception -> 0x0090 }
            r10.mo79032w(r13)     // Catch:{ Exception -> 0x0090 }
            r7.b r10 = p376r7.C16355b.m98065L()     // Catch:{ Exception -> 0x0090 }
            r9.m99072b(r10, r13)     // Catch:{ Exception -> 0x0090 }
            int r10 = r13.mo79015h()     // Catch:{ Exception -> 0x0090 }
            if (r10 != 0) goto L_0x008c
        L_0x008a:
            r10 = 1
            goto L_0x008d
        L_0x008c:
            r10 = 0
        L_0x008d:
            r4 = r13
            goto L_0x0187
        L_0x0090:
            r10 = move-exception
            r4 = r13
            goto L_0x018f
        L_0x0094:
            boolean r5 = r9.mo79551a(r0)     // Catch:{ Exception -> 0x000f }
            if (r5 == 0) goto L_0x0107
            boolean r0 = r9.mo79565q(r1, r0)     // Catch:{ Exception -> 0x000f }
            if (r0 == 0) goto L_0x0107
            java.lang.String r0 = "busybox cp command is available!"
            p385s7.C16505a.m98585z(r0)     // Catch:{ Exception -> 0x000f }
            if (r13 == 0) goto L_0x00d6
            r7.a r13 = new r7.a     // Catch:{ Exception -> 0x000f }
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch:{ Exception -> 0x000f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x000f }
            r1.<init>()     // Catch:{ Exception -> 0x000f }
            java.lang.String r5 = "busybox cp -fp "
            r1.append(r5)     // Catch:{ Exception -> 0x000f }
            r1.append(r10)     // Catch:{ Exception -> 0x000f }
            r1.append(r6)     // Catch:{ Exception -> 0x000f }
            r1.append(r11)     // Catch:{ Exception -> 0x000f }
            java.lang.String r10 = r1.toString()     // Catch:{ Exception -> 0x000f }
            r0[r3] = r10     // Catch:{ Exception -> 0x000f }
            r13.<init>((int) r3, (boolean) r3, (java.lang.String[]) r0)     // Catch:{ Exception -> 0x000f }
            r7.b r10 = p376r7.C16355b.m98065L()     // Catch:{ Exception -> 0x0090 }
            r10.mo79032w(r13)     // Catch:{ Exception -> 0x0090 }
            r7.b r10 = p376r7.C16355b.m98065L()     // Catch:{ Exception -> 0x0090 }
            r9.m99072b(r10, r13)     // Catch:{ Exception -> 0x0090 }
            goto L_0x0104
        L_0x00d6:
            r7.a r13 = new r7.a     // Catch:{ Exception -> 0x000f }
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch:{ Exception -> 0x000f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x000f }
            r1.<init>()     // Catch:{ Exception -> 0x000f }
            java.lang.String r5 = "busybox cp -f "
            r1.append(r5)     // Catch:{ Exception -> 0x000f }
            r1.append(r10)     // Catch:{ Exception -> 0x000f }
            r1.append(r6)     // Catch:{ Exception -> 0x000f }
            r1.append(r11)     // Catch:{ Exception -> 0x000f }
            java.lang.String r10 = r1.toString()     // Catch:{ Exception -> 0x000f }
            r0[r3] = r10     // Catch:{ Exception -> 0x000f }
            r13.<init>((int) r3, (boolean) r3, (java.lang.String[]) r0)     // Catch:{ Exception -> 0x000f }
            r7.b r10 = p376r7.C16355b.m98065L()     // Catch:{ Exception -> 0x0090 }
            r10.mo79032w(r13)     // Catch:{ Exception -> 0x0090 }
            r7.b r10 = p376r7.C16355b.m98065L()     // Catch:{ Exception -> 0x0090 }
            r9.m99072b(r10, r13)     // Catch:{ Exception -> 0x0090 }
        L_0x0104:
            r4 = r13
            goto L_0x0181
        L_0x0107:
            java.lang.String r0 = "cat"
            boolean r0 = r9.mo79551a(r0)     // Catch:{ Exception -> 0x000f }
            if (r0 == 0) goto L_0x0186
            java.lang.String r0 = "cp is not available, use cat!"
            p385s7.C16505a.m98585z(r0)     // Catch:{ Exception -> 0x000f }
            r0 = -1
            if (r13 == 0) goto L_0x011f
            t7.b r0 = r9.mo79559j(r10)     // Catch:{ Exception -> 0x000f }
            int r0 = r0.mo79408c()     // Catch:{ Exception -> 0x000f }
        L_0x011f:
            r7.a r1 = new r7.a     // Catch:{ Exception -> 0x000f }
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ Exception -> 0x000f }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x000f }
            r7.<init>()     // Catch:{ Exception -> 0x000f }
            java.lang.String r8 = "cat "
            r7.append(r8)     // Catch:{ Exception -> 0x000f }
            r7.append(r10)     // Catch:{ Exception -> 0x000f }
            java.lang.String r10 = " > "
            r7.append(r10)     // Catch:{ Exception -> 0x000f }
            r7.append(r11)     // Catch:{ Exception -> 0x000f }
            java.lang.String r10 = r7.toString()     // Catch:{ Exception -> 0x000f }
            r5[r3] = r10     // Catch:{ Exception -> 0x000f }
            r1.<init>((int) r3, (boolean) r3, (java.lang.String[]) r5)     // Catch:{ Exception -> 0x000f }
            r7.b r10 = p376r7.C16355b.m98065L()     // Catch:{ Exception -> 0x0183 }
            r10.mo79032w(r1)     // Catch:{ Exception -> 0x0183 }
            r7.b r10 = p376r7.C16355b.m98065L()     // Catch:{ Exception -> 0x0183 }
            r9.m99072b(r10, r1)     // Catch:{ Exception -> 0x0183 }
            if (r13 == 0) goto L_0x0180
            r7.a r4 = new r7.a     // Catch:{ Exception -> 0x0183 }
            java.lang.String[] r10 = new java.lang.String[r2]     // Catch:{ Exception -> 0x0183 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0183 }
            r13.<init>()     // Catch:{ Exception -> 0x0183 }
            java.lang.String r5 = "chmod "
            r13.append(r5)     // Catch:{ Exception -> 0x0183 }
            r13.append(r0)     // Catch:{ Exception -> 0x0183 }
            r13.append(r6)     // Catch:{ Exception -> 0x0183 }
            r13.append(r11)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x0183 }
            r10[r3] = r13     // Catch:{ Exception -> 0x0183 }
            r4.<init>((int) r3, (boolean) r3, (java.lang.String[]) r10)     // Catch:{ Exception -> 0x0183 }
            r7.b r10 = p376r7.C16355b.m98065L()     // Catch:{ Exception -> 0x000f }
            r10.mo79032w(r4)     // Catch:{ Exception -> 0x000f }
            r7.b r10 = p376r7.C16355b.m98065L()     // Catch:{ Exception -> 0x000f }
            r9.m99072b(r10, r4)     // Catch:{ Exception -> 0x000f }
            goto L_0x0181
        L_0x0180:
            r4 = r1
        L_0x0181:
            r10 = 1
            goto L_0x0187
        L_0x0183:
            r10 = move-exception
            r4 = r1
            goto L_0x018f
        L_0x0186:
            r10 = 0
        L_0x0187:
            if (r12 == 0) goto L_0x0193
            java.lang.String r12 = "RO"
            p385s7.C16505a.m98558C(r11, r12)     // Catch:{ Exception -> 0x000f }
            goto L_0x0193
        L_0x018f:
            r10.printStackTrace()
            r10 = 0
        L_0x0193:
            if (r4 == 0) goto L_0x019e
            int r10 = r4.mo79015h()
            if (r10 != 0) goto L_0x019c
            goto L_0x019d
        L_0x019c:
            r2 = 0
        L_0x019d:
            r10 = r2
        L_0x019e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p403u7.C16655c.mo79552c(java.lang.String, java.lang.String, boolean, boolean):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0097 A[Catch:{ Exception -> 0x000d }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo79553d(java.lang.String r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "busybox"
            java.lang.String r1 = "rm"
            r2 = 0
            if (r9 == 0) goto L_0x0010
            java.lang.String r3 = "RW"
            p385s7.C16505a.m98558C(r8, r3)     // Catch:{ Exception -> 0x000d }
            goto L_0x0010
        L_0x000d:
            r8 = move-exception
            goto L_0x009e
        L_0x0010:
            java.lang.String r3 = "toolbox"
            boolean r3 = r7.mo79565q(r1, r3)     // Catch:{ Exception -> 0x000d }
            java.lang.String r4 = "target not exist or unable to delete file"
            r5 = 1
            if (r3 == 0) goto L_0x0052
            java.lang.String r0 = "rm command is available!"
            p385s7.C16505a.m98585z(r0)     // Catch:{ Exception -> 0x000d }
            r7.a r0 = new r7.a     // Catch:{ Exception -> 0x000d }
            java.lang.String[] r1 = new java.lang.String[r5]     // Catch:{ Exception -> 0x000d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x000d }
            r3.<init>()     // Catch:{ Exception -> 0x000d }
            java.lang.String r6 = "rm -r "
            r3.append(r6)     // Catch:{ Exception -> 0x000d }
            r3.append(r8)     // Catch:{ Exception -> 0x000d }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x000d }
            r1[r2] = r3     // Catch:{ Exception -> 0x000d }
            r0.<init>((int) r2, (boolean) r2, (java.lang.String[]) r1)     // Catch:{ Exception -> 0x000d }
            r7.b r1 = p376r7.C16355b.m98065L()     // Catch:{ Exception -> 0x000d }
            r1.mo79032w(r0)     // Catch:{ Exception -> 0x000d }
            r7.b r1 = p376r7.C16355b.m98065L()     // Catch:{ Exception -> 0x000d }
            r7.m99072b(r1, r0)     // Catch:{ Exception -> 0x000d }
            int r0 = r0.mo79015h()     // Catch:{ Exception -> 0x000d }
            if (r0 == 0) goto L_0x0095
            p385s7.C16505a.m98585z(r4)     // Catch:{ Exception -> 0x000d }
            goto L_0x0094
        L_0x0052:
            boolean r3 = r7.mo79551a(r0)     // Catch:{ Exception -> 0x000d }
            if (r3 == 0) goto L_0x0095
            boolean r0 = r7.mo79565q(r1, r0)     // Catch:{ Exception -> 0x000d }
            if (r0 == 0) goto L_0x0095
            java.lang.String r0 = "busybox rm command is available!"
            p385s7.C16505a.m98585z(r0)     // Catch:{ Exception -> 0x000d }
            r7.a r0 = new r7.a     // Catch:{ Exception -> 0x000d }
            java.lang.String[] r1 = new java.lang.String[r5]     // Catch:{ Exception -> 0x000d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x000d }
            r3.<init>()     // Catch:{ Exception -> 0x000d }
            java.lang.String r6 = "busybox rm -rf "
            r3.append(r6)     // Catch:{ Exception -> 0x000d }
            r3.append(r8)     // Catch:{ Exception -> 0x000d }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x000d }
            r1[r2] = r3     // Catch:{ Exception -> 0x000d }
            r0.<init>((int) r2, (boolean) r2, (java.lang.String[]) r1)     // Catch:{ Exception -> 0x000d }
            r7.b r1 = p376r7.C16355b.m98065L()     // Catch:{ Exception -> 0x000d }
            r1.mo79032w(r0)     // Catch:{ Exception -> 0x000d }
            r7.b r1 = p376r7.C16355b.m98065L()     // Catch:{ Exception -> 0x000d }
            r7.m99072b(r1, r0)     // Catch:{ Exception -> 0x000d }
            int r0 = r0.mo79015h()     // Catch:{ Exception -> 0x000d }
            if (r0 == 0) goto L_0x0095
            p385s7.C16505a.m98585z(r4)     // Catch:{ Exception -> 0x000d }
        L_0x0094:
            r5 = 0
        L_0x0095:
            if (r9 == 0) goto L_0x009c
            java.lang.String r9 = "RO"
            p385s7.C16505a.m98558C(r8, r9)     // Catch:{ Exception -> 0x000d }
        L_0x009c:
            r2 = r5
            goto L_0x00a1
        L_0x009e:
            r8.printStackTrace()
        L_0x00a1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p403u7.C16655c.mo79553d(java.lang.String, boolean):boolean");
    }

    /* renamed from: e */
    public void mo79554e(String str, String str2) {
        try {
            C16505a.m98558C("/system", "rw");
            List<String> f = C16225a.m97483f(str, true);
            if (f.size() > 0) {
                for (String str3 : f) {
                    C16351a aVar = new C16351a(0, false, str2 + " rm " + str3 + "/" + str);
                    C16225a.m97485h(true).mo79032w(aVar);
                    m99072b(C16225a.m97485h(true), aVar);
                }
                C16351a aVar2 = new C16351a(0, false, str2 + " ln -s " + str2 + " /system/bin/" + str, str2 + " chmod 0755 /system/bin/" + str);
                C16225a.m97485h(true).mo79032w(aVar2);
                m99072b(C16225a.m97485h(true), aVar2);
            }
            C16505a.m98558C("/system", "ro");
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public boolean mo79555f(String[] strArr) throws Exception {
        for (String str : strArr) {
            if (!mo79551a(str)) {
                if (mo79551a("busybox")) {
                    if (mo79565q(str, "busybox")) {
                        mo79554e(str, C16505a.f67203c);
                    }
                } else if (!mo79551a("toolbox")) {
                    return false;
                } else {
                    if (mo79565q(str, "toolbox")) {
                        mo79554e(str, C16505a.f67203c);
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: g */
    public List<String> mo79556g(String str) throws Exception {
        if (str != null && !str.endsWith("/") && !str.equals("")) {
            str = str + "/";
        } else if (str == null) {
            throw new Exception("Path is null, please specifiy a path");
        }
        ArrayList arrayList = new ArrayList();
        C16658c cVar = new C16658c(3, false, new String[]{str + "busybox --list"}, arrayList);
        C16225a.m97485h(false).mo79032w(cVar);
        m99072b(C16225a.m97485h(false), cVar);
        if (arrayList.size() <= 0) {
            C16659d dVar = new C16659d(3, false, new String[]{str + "busybox --list"}, arrayList);
            C16225a.m97485h(true).mo79032w(dVar);
            m99072b(C16225a.m97485h(true), dVar);
        }
        return arrayList;
    }

    /* renamed from: h */
    public String mo79557h(String str) {
        StringBuilder sb = new StringBuilder();
        if (!str.equals("") && !str.endsWith("/")) {
            str = str + "/";
        }
        try {
            C16660e eVar = new C16660e(4, false, new String[]{str + "busybox"}, sb);
            C16505a.m98585z("Getting BusyBox Version without root");
            C16355b o = C16505a.m98574o(false);
            o.mo79032w(eVar);
            m99072b(o, eVar);
            if (sb.length() <= 0) {
                C16661f fVar = new C16661f(4, false, new String[]{str + "busybox"}, sb);
                C16505a.m98585z("Getting BusyBox Version with root");
                C16355b o2 = C16505a.m98574o(true);
                o2.mo79032w(fVar);
                m99072b(o2, fVar);
            }
            C16505a.m98585z("Returning found version: " + sb.toString());
            return sb.toString();
        } catch (Exception unused) {
            C16505a.m98585z("BusyBox was not found, more information MAY be available with Debugging on.");
            return "";
        }
    }

    /* renamed from: i */
    public long mo79558i(String str) {
        double d = 1.0d;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            int i = 0;
            while (true) {
                if (i >= str.length()) {
                    break;
                }
                char charAt = str.charAt(i);
                if (Character.isDigit(charAt) || charAt == '.') {
                    stringBuffer.append(str.charAt(i));
                    i++;
                } else {
                    if (charAt != 'm') {
                        if (charAt != 'M') {
                            if (charAt == 'g' || charAt == 'G') {
                                d = 1048576.0d;
                            }
                        }
                    }
                    d = 1024.0d;
                }
            }
            return (long) Math.ceil(Double.valueOf(stringBuffer.toString()).doubleValue() * d);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: j */
    public C16580b mo79559j(String str) {
        C16505a.m98585z("Checking permissions for " + str);
        if (C16505a.m98564e(str)) {
            C16505a.m98585z(str + " was found.");
            try {
                C16663h hVar = new C16663h(1, false, "ls -l " + str, "busybox ls -l " + str, "/system/bin/failsafe/toolbox ls -l " + str, "toolbox ls -l " + str);
                C16225a.m97485h(true).mo79032w(hVar);
                m99072b(C16225a.m97485h(true), hVar);
                return C16653a.f67540h;
            } catch (Exception e) {
                C16505a.m98585z(e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: k */
    public String mo79560k(String str) {
        try {
            C16662g gVar = new C16662g(5, false, "/data/local/ls -i " + str);
            C16355b.m98065L().mo79032w(gVar);
            m99072b(C16355b.m98065L(), gVar);
            return C16653a.f67539g;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: m */
    public ArrayList<C16579a> mo79561m() throws Exception {
        ArrayList<C16579a> arrayList = new ArrayList<>();
        C16653a.f67538f = arrayList;
        if (arrayList.isEmpty()) {
            C16355b o = C16505a.m98574o(true);
            C16664i iVar = new C16664i(8, false, "cat /proc/mounts");
            o.mo79032w(iVar);
            m99072b(o, iVar);
        }
        return C16653a.f67538f;
    }

    /* renamed from: n */
    public C16580b mo79562n(String str) {
        String str2 = str.split(" ")[0];
        if (str2.length() != 10) {
            return null;
        }
        if (str2.charAt(0) != '-' && str2.charAt(0) != 'd' && str2.charAt(0) != 'l') {
            return null;
        }
        if (str2.charAt(1) != '-' && str2.charAt(1) != 'r') {
            return null;
        }
        if (str2.charAt(2) != '-' && str2.charAt(2) != 'w') {
            return null;
        }
        C16505a.m98585z(str2);
        C16580b bVar = new C16580b();
        bVar.mo79416k(str2.substring(0, 1));
        C16505a.m98585z(bVar.mo79410e());
        bVar.mo79417l(str2.substring(1, 4));
        C16505a.m98585z(bVar.mo79411f());
        bVar.mo79412g(str2.substring(4, 7));
        C16505a.m98585z(bVar.mo79406a());
        bVar.mo79413h(str2.substring(7, 10));
        C16505a.m98585z(bVar.mo79407b());
        StringBuilder sb = new StringBuilder();
        sb.append(mo79568t(str2));
        sb.append(mo79567s(bVar.mo79411f()));
        sb.append(mo79567s(bVar.mo79406a()));
        sb.append(mo79567s(bVar.mo79407b()));
        bVar.mo79414i(Integer.parseInt(sb.toString()));
        return bVar;
    }

    /* renamed from: o */
    public long mo79563o(String str) {
        C16653a.f67536d = str;
        C16505a.m98585z("Looking for Space");
        try {
            C16665j jVar = new C16665j(6, false, "df " + str);
            C16355b.m98065L().mo79032w(jVar);
            m99072b(C16355b.m98065L(), jVar);
        } catch (Exception unused) {
        }
        if (C16653a.f67535c != null) {
            C16505a.m98585z("First Method");
            boolean z = false;
            for (String str2 : C16653a.f67535c) {
                C16505a.m98585z(str2);
                if (z) {
                    return mo79558i(str2);
                }
                if (str2.equals("used,")) {
                    z = true;
                }
            }
            int i = 3;
            C16505a.m98585z("Second Method");
            if (C16653a.f67535c[0].length() <= 5) {
                i = 2;
            }
            int i2 = 0;
            for (String str3 : C16653a.f67535c) {
                C16505a.m98585z(str3);
                if (str3.length() > 0) {
                    C16505a.m98585z(str3 + "Valid");
                    if (i2 == i) {
                        return mo79558i(str3);
                    }
                    i2++;
                }
            }
        }
        C16505a.m98585z("Returning -1, space could not be determined.");
        return -1;
    }

    /* renamed from: p */
    public String mo79564p(String str) {
        C16505a.m98585z("Looking for Symlink for " + str);
        try {
            ArrayList arrayList = new ArrayList();
            C16666k kVar = new C16666k(7, false, new String[]{"ls -l " + str}, arrayList);
            C16355b.m98065L().mo79032w(kVar);
            m99072b(C16355b.m98065L(), kVar);
            String[] split = ((String) arrayList.get(0)).split(" ");
            if (split.length > 2 && split[split.length - 2].equals("->")) {
                C16505a.m98585z("Symlink found.");
                if (split[split.length - 1].equals("") || split[split.length - 1].contains("/")) {
                    return split[split.length - 1];
                }
                List<String> f = C16225a.m97483f(split[split.length - 1], true);
                if (f.size() <= 0) {
                    return split[split.length - 1];
                }
                return f.get(0) + split[split.length - 1];
            }
        } catch (Exception e) {
            if (C16505a.f67202b) {
                e.printStackTrace();
            }
        }
        C16505a.m98585z("Symlink not found");
        return "";
    }

    /* renamed from: q */
    public boolean mo79565q(String str, String str2) {
        StringBuilder sb;
        C16653a.f67533a = false;
        if (!str2.endsWith("toolbox") && !str2.endsWith("busybox")) {
            return false;
        }
        try {
            String[] strArr = new String[1];
            if (str2.endsWith("toolbox")) {
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(" ");
                sb.append(str);
            } else {
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(" --list");
            }
            strArr[0] = sb.toString();
            C16656a aVar = new C16656a(0, false, strArr, str2, str);
            C16505a.m98574o(true).mo79032w(aVar);
            m99072b(C16505a.m98574o(true), aVar);
            if (C16653a.f67533a) {
                C16505a.m98585z("Box contains " + str + " util!");
                return true;
            }
            C16505a.m98585z("Box does not contain " + str + " util!");
            return false;
        } catch (Exception e) {
            C16505a.m98585z(e.getMessage());
            return false;
        }
    }

    /* renamed from: r */
    public boolean mo79566r(String str) {
        C16505a.m98585z("Killing process " + str);
        C16653a.f67537e = "";
        C16653a.f67534b = true;
        try {
            C16657b bVar = new C16657b(0, false, new String[]{"ps"}, str);
            C16505a.m98574o(true).mo79032w(bVar);
            m99072b(C16505a.m98574o(true), bVar);
            String str2 = C16653a.f67537e;
            if (str2.equals("")) {
                return true;
            }
            try {
                C16351a aVar = new C16351a(0, false, "kill -9 " + str2);
                C16505a.m98574o(true).mo79032w(aVar);
                m99072b(C16505a.m98574o(true), aVar);
                return true;
            } catch (Exception e) {
                C16505a.m98585z(e.getMessage());
                return false;
            }
        } catch (Exception e2) {
            C16505a.m98585z(e2.getMessage());
        }
    }

    /* renamed from: s */
    public int mo79567s(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        int i = lowerCase.charAt(0) == 'r' ? 4 : 0;
        C16505a.m98585z("permission " + i);
        C16505a.m98585z("character " + lowerCase.charAt(0));
        int i2 = lowerCase.charAt(1) == 'w' ? i + 2 : i + 0;
        C16505a.m98585z("permission " + i2);
        C16505a.m98585z("character " + lowerCase.charAt(1));
        int i3 = (lowerCase.charAt(2) == 'x' || lowerCase.charAt(2) == 's' || lowerCase.charAt(2) == 't') ? i2 + 1 : i2 + 0;
        C16505a.m98585z("permission " + i3);
        C16505a.m98585z("character " + lowerCase.charAt(2));
        return i3;
    }

    /* renamed from: t */
    public int mo79568t(String str) {
        int i = str.charAt(2) == 's' ? 4 : 0;
        if (str.charAt(5) == 's') {
            i += 2;
        }
        if (str.charAt(8) == 't') {
            i++;
        }
        C16505a.m98585z("special permissions " + i);
        return i;
    }
}
