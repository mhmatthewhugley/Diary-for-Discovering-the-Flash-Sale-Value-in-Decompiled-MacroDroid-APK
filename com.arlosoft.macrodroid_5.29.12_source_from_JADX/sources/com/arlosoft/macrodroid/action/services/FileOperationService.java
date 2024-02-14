package com.arlosoft.macrodroid.action.services;

import android.app.IntentService;

public class FileOperationService extends IntentService {
    public FileOperationService() {
        super("FileOperationService");
        setIntentRedelivery(true);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:81|82|83|84|(1:86)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0144 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x0224 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014a A[Catch:{ Exception -> 0x0164 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x022a A[Catch:{ Exception -> 0x0315 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            java.lang.String r2 = "FromPath"
            java.lang.String r2 = r0.getStringExtra(r2)
            java.lang.String r3 = "ToPath"
            java.lang.String r3 = r0.getStringExtra(r3)
            java.lang.String r4 = "FilePattern"
            java.lang.String r4 = r0.getStringExtra(r4)
            java.lang.String r5 = "FileExtensions"
            java.lang.String[] r5 = r0.getStringArrayExtra(r5)
            java.lang.String r6 = "FileOption"
            java.lang.String r6 = r0.getStringExtra(r6)
            java.lang.String r7 = "FileOptionFixed"
            java.lang.String r0 = r0.getStringExtra(r7)
            java.io.File r7 = new java.io.File
            r7.<init>(r2)
            java.lang.String r8 = "/"
            r9 = 1
            r10 = 0
            if (r4 == 0) goto L_0x006f
            org.apache.commons.io.filefilter.WildcardFileFilter r5 = new org.apache.commons.io.filefilter.WildcardFileFilter
            r5.<init>((java.lang.String) r4)
            boolean r4 = r7.canRead()
            if (r4 == 0) goto L_0x0046
            java.io.File[] r4 = r7.listFiles(r5)
        L_0x0042:
            r16 = r0
            goto L_0x00e6
        L_0x0046:
            java.lang.String r4 = "Can't read 'from' directory attempting root only mechanism"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r4)
            java.io.File[] r4 = com.arlosoft.macrodroid.utils.C6362a0.m24606l(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r11 = r4.length
            r12 = 0
        L_0x0056:
            if (r12 >= r11) goto L_0x0066
            r13 = r4[r12]
            boolean r14 = r5.accept(r13)
            if (r14 == 0) goto L_0x0063
            r7.add(r13)
        L_0x0063:
            int r12 = r12 + 1
            goto L_0x0056
        L_0x0066:
            java.io.File[] r4 = new java.io.File[r10]
            java.lang.Object[] r4 = r7.toArray(r4)
            java.io.File[] r4 = (java.io.File[]) r4
            goto L_0x0042
        L_0x006f:
            if (r5 == 0) goto L_0x0361
            boolean r4 = r2.endsWith(r8)
            if (r4 == 0) goto L_0x0081
            java.io.File[] r4 = new java.io.File[r9]
            java.io.File r5 = new java.io.File
            r5.<init>(r2)
            r4[r10] = r5
            goto L_0x0042
        L_0x0081:
            java.io.File[] r4 = r7.listFiles()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r11 = 0
            if (r4 == 0) goto L_0x00e3
            int r11 = r4.length
            r12 = 0
        L_0x008f:
            if (r12 >= r11) goto L_0x00d6
            r13 = r4[r12]
            int r14 = r5.length
            r15 = 0
        L_0x0095:
            if (r15 >= r14) goto L_0x00c9
            r9 = r5[r15]
            java.lang.String r16 = r13.getName()
            java.lang.String r10 = r16.toLowerCase()
            r16 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r17 = r4
            java.lang.String r4 = "."
            r0.append(r4)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            boolean r0 = r10.endsWith(r0)
            if (r0 == 0) goto L_0x00c0
            r7.add(r13)
            goto L_0x00cd
        L_0x00c0:
            int r15 = r15 + 1
            r0 = r16
            r4 = r17
            r9 = 1
            r10 = 0
            goto L_0x0095
        L_0x00c9:
            r16 = r0
            r17 = r4
        L_0x00cd:
            int r12 = r12 + 1
            r0 = r16
            r4 = r17
            r9 = 1
            r10 = 0
            goto L_0x008f
        L_0x00d6:
            r16 = r0
            int r0 = r7.size()
            java.io.File[] r0 = new java.io.File[r0]
            r7.toArray(r0)
            r4 = r0
            goto L_0x00e6
        L_0x00e3:
            r16 = r0
            r4 = r11
        L_0x00e6:
            java.lang.String r5 = "Delete"
            if (r3 == 0) goto L_0x011b
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r7 = r0.exists()
            if (r7 == 0) goto L_0x0116
            boolean r0 = r0.canWrite()
            if (r0 != 0) goto L_0x0116
            java.lang.String r0 = "File output path is not writeable - attempting to remount (root only)"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r0)
            java.lang.String r0 = "RW"
            boolean r0 = p385s7.C16505a.m98558C(r3, r0)
            if (r0 != 0) goto L_0x0117
            java.lang.String r7 = "Mount failed"
            java.lang.String r9 = "Could not make directory writeable"
            r10 = 0
            com.arlosoft.macrodroid.common.C4061t1.m16023v(r1, r7, r9, r10)
            java.lang.String r7 = "Failed to make output path writeable"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r7)
            goto L_0x0117
        L_0x0116:
            r0 = 0
        L_0x0117:
            r9 = r0
            r7 = r16
            goto L_0x011d
        L_0x011b:
            r7 = r5
            r9 = 0
        L_0x011d:
            if (r4 != 0) goto L_0x0120
            return
        L_0x0120:
            int r10 = r4.length
            java.lang.String r0 = ""
            r11 = 0
            r12 = 0
        L_0x0125:
            if (r11 >= r10) goto L_0x0328
            r13 = r4[r11]
            java.lang.String r14 = "\""
            if (r7 == 0) goto L_0x0133
            boolean r15 = r7.equals(r5)
            if (r15 != 0) goto L_0x013b
        L_0x0133:
            java.lang.String r15 = com.arlosoft.macrodroid.action.FileOperationAction.f7243g
            boolean r15 = r6.equals(r15)
            if (r15 == 0) goto L_0x01b6
        L_0x013b:
            boolean r15 = r2.endsWith(r8)
            if (r15 == 0) goto L_0x016c
            org.apache.commons.p353io.FileUtils.deleteDirectory(r13)     // Catch:{ IOException -> 0x0144 }
        L_0x0144:
            boolean r15 = r13.exists()     // Catch:{ Exception -> 0x0164 }
            if (r15 == 0) goto L_0x0164
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0164 }
            r15.<init>()     // Catch:{ Exception -> 0x0164 }
            r15.append(r14)     // Catch:{ Exception -> 0x0164 }
            java.lang.String r13 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x0164 }
            r15.append(r13)     // Catch:{ Exception -> 0x0164 }
            r15.append(r14)     // Catch:{ Exception -> 0x0164 }
            java.lang.String r13 = r15.toString()     // Catch:{ Exception -> 0x0164 }
            r14 = 0
            p385s7.C16505a.m98563d(r13, r14)     // Catch:{ Exception -> 0x0164 }
        L_0x0164:
            r18 = r2
            r16 = r4
            r17 = r5
            goto L_0x0313
        L_0x016c:
            r13.delete()
            boolean r15 = p150q2.C8164a.m33886a()
            r16 = r4
            if (r15 == 0) goto L_0x01b2
            r15 = 1
            java.lang.String[] r4 = new java.lang.String[r15]
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r17 = r5
            java.lang.String r5 = "rm "
            r15.append(r5)
            java.lang.String r5 = r13.getAbsolutePath()
            r15.append(r5)
            java.lang.String r5 = r15.toString()
            r15 = 0
            r4[r15] = r5
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r14)
            java.lang.String r5 = r13.getAbsolutePath()
            r4.append(r5)
            r4.append(r14)
            java.lang.String r4 = r4.toString()
            p385s7.C16505a.m98563d(r4, r15)
            goto L_0x0311
        L_0x01b2:
            r17 = r5
            goto L_0x0311
        L_0x01b6:
            r16 = r4
            r17 = r5
            java.io.File r4 = new java.io.File
            r4.<init>(r3)
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r4 = r4.getAbsolutePath()
            r15.append(r4)
            java.lang.String r4 = java.io.File.separator
            r15.append(r4)
            java.lang.String r4 = r13.getName()
            r15.append(r4)
            java.lang.String r4 = r15.toString()
            r5.<init>(r4)
            boolean r4 = r5.exists()     // Catch:{ Exception -> 0x0315 }
            if (r4 == 0) goto L_0x0209
            r5.delete()     // Catch:{ Exception -> 0x0315 }
            boolean r4 = r5.exists()     // Catch:{ Exception -> 0x0315 }
            if (r4 == 0) goto L_0x0209
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0315 }
            r4.<init>()     // Catch:{ Exception -> 0x0315 }
            r4.append(r14)     // Catch:{ Exception -> 0x0315 }
            java.lang.String r15 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x0315 }
            r4.append(r15)     // Catch:{ Exception -> 0x0315 }
            r4.append(r14)     // Catch:{ Exception -> 0x0315 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0315 }
            r15 = 0
            p385s7.C16505a.m98563d(r4, r15)     // Catch:{ Exception -> 0x0315 }
        L_0x0209:
            if (r7 == 0) goto L_0x0213
            java.lang.String r4 = "Copy"
            boolean r4 = r7.equals(r4)     // Catch:{ Exception -> 0x0315 }
            if (r4 != 0) goto L_0x021b
        L_0x0213:
            java.lang.String r4 = com.arlosoft.macrodroid.action.FileOperationAction.f7241d     // Catch:{ Exception -> 0x0315 }
            boolean r4 = r6.equals(r4)     // Catch:{ Exception -> 0x0315 }
            if (r4 == 0) goto L_0x0299
        L_0x021b:
            boolean r4 = r2.endsWith(r8)     // Catch:{ Exception -> 0x0315 }
            if (r4 == 0) goto L_0x025d
            org.apache.commons.p353io.FileUtils.copyDirectory(r13, r5)     // Catch:{ Exception -> 0x0224 }
        L_0x0224:
            boolean r4 = r5.exists()     // Catch:{ Exception -> 0x0315 }
            if (r4 != 0) goto L_0x0311
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0315 }
            r4.<init>()     // Catch:{ Exception -> 0x0315 }
            r4.append(r14)     // Catch:{ Exception -> 0x0315 }
            java.lang.String r13 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x0315 }
            r4.append(r13)     // Catch:{ Exception -> 0x0315 }
            r4.append(r14)     // Catch:{ Exception -> 0x0315 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0315 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0315 }
            r13.<init>()     // Catch:{ Exception -> 0x0315 }
            r13.append(r14)     // Catch:{ Exception -> 0x0315 }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x0315 }
            r13.append(r5)     // Catch:{ Exception -> 0x0315 }
            r13.append(r14)     // Catch:{ Exception -> 0x0315 }
            java.lang.String r5 = r13.toString()     // Catch:{ Exception -> 0x0315 }
            r13 = 1
            r14 = 0
            p385s7.C16505a.m98562c(r4, r5, r14, r13)     // Catch:{ Exception -> 0x0315 }
            goto L_0x0311
        L_0x025d:
            org.apache.commons.p353io.FileUtils.copyFile((java.io.File) r13, (java.io.File) r5)     // Catch:{ Exception -> 0x0315 }
            boolean r4 = r5.exists()     // Catch:{ Exception -> 0x0315 }
            if (r4 != 0) goto L_0x0311
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0315 }
            r4.<init>()     // Catch:{ Exception -> 0x0315 }
            r4.append(r14)     // Catch:{ Exception -> 0x0315 }
            java.lang.String r13 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x0315 }
            r4.append(r13)     // Catch:{ Exception -> 0x0315 }
            r4.append(r14)     // Catch:{ Exception -> 0x0315 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0315 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0315 }
            r13.<init>()     // Catch:{ Exception -> 0x0315 }
            r13.append(r14)     // Catch:{ Exception -> 0x0315 }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x0315 }
            r13.append(r5)     // Catch:{ Exception -> 0x0315 }
            r13.append(r14)     // Catch:{ Exception -> 0x0315 }
            java.lang.String r5 = r13.toString()     // Catch:{ Exception -> 0x0315 }
            r13 = 1
            r14 = 0
            p385s7.C16505a.m98562c(r4, r5, r14, r13)     // Catch:{ Exception -> 0x0315 }
            goto L_0x0311
        L_0x0299:
            if (r7 == 0) goto L_0x02a3
            java.lang.String r4 = "Move"
            boolean r4 = r7.equals(r4)     // Catch:{ Exception -> 0x0315 }
            if (r4 != 0) goto L_0x02ab
        L_0x02a3:
            java.lang.String r4 = com.arlosoft.macrodroid.action.FileOperationAction.f7242f     // Catch:{ Exception -> 0x0315 }
            boolean r4 = r6.equals(r4)     // Catch:{ Exception -> 0x0315 }
            if (r4 == 0) goto L_0x0311
        L_0x02ab:
            boolean r4 = r2.endsWith(r8)     // Catch:{ Exception -> 0x0315 }
            if (r4 == 0) goto L_0x02b5
            org.apache.commons.p353io.FileUtils.moveDirectory(r13, r5)     // Catch:{ Exception -> 0x0311 }
            goto L_0x0311
        L_0x02b5:
            org.apache.commons.p353io.FileUtils.moveFile(r13, r5)     // Catch:{ Exception -> 0x0315 }
            boolean r4 = r5.exists()     // Catch:{ Exception -> 0x0315 }
            if (r4 != 0) goto L_0x0311
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0315 }
            r4.<init>()     // Catch:{ Exception -> 0x0315 }
            r4.append(r14)     // Catch:{ Exception -> 0x0315 }
            java.lang.String r15 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x0315 }
            r4.append(r15)     // Catch:{ Exception -> 0x0315 }
            r4.append(r14)     // Catch:{ Exception -> 0x0315 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0315 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0315 }
            r15.<init>()     // Catch:{ Exception -> 0x0315 }
            r15.append(r14)     // Catch:{ Exception -> 0x0315 }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x0315 }
            r15.append(r5)     // Catch:{ Exception -> 0x0315 }
            r15.append(r14)     // Catch:{ Exception -> 0x0315 }
            java.lang.String r5 = r15.toString()     // Catch:{ Exception -> 0x0315 }
            r18 = r2
            r2 = 0
            r15 = 1
            boolean r4 = p385s7.C16505a.m98562c(r4, r5, r2, r15)     // Catch:{ Exception -> 0x030f }
            if (r4 == 0) goto L_0x031e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x030f }
            r2.<init>()     // Catch:{ Exception -> 0x030f }
            r2.append(r14)     // Catch:{ Exception -> 0x030f }
            java.lang.String r4 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x030f }
            r2.append(r4)     // Catch:{ Exception -> 0x030f }
            r2.append(r14)     // Catch:{ Exception -> 0x030f }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x030f }
            r4 = 0
            p385s7.C16505a.m98563d(r2, r4)     // Catch:{ Exception -> 0x030f }
            goto L_0x031e
        L_0x030f:
            r0 = move-exception
            goto L_0x0319
        L_0x0311:
            r18 = r2
        L_0x0313:
            r15 = 1
            goto L_0x031e
        L_0x0315:
            r0 = move-exception
            r18 = r2
            r15 = 1
        L_0x0319:
            java.lang.String r0 = r0.getMessage()
            r12 = 1
        L_0x031e:
            int r11 = r11 + 1
            r4 = r16
            r5 = r17
            r2 = r18
            goto L_0x0125
        L_0x0328:
            if (r12 == 0) goto L_0x0359
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Error during "
            r2.append(r4)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r5 = 0
            com.arlosoft.macrodroid.common.C4061t1.m16023v(r1, r2, r0, r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r6)
            java.lang.String r4 = ": "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
        L_0x0359:
            if (r9 == 0) goto L_0x0360
            java.lang.String r0 = "RO"
            p385s7.C16505a.m98558C(r3, r0)
        L_0x0360:
            return
        L_0x0361:
            java.lang.String r0 = "FileOperationService: FilePattern and FileExtensions are both null"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            p148q0.C8151a.m33873n(r2)
            java.lang.String r0 = "File Operation Failed"
            java.lang.String r2 = "Macro Error"
            r3 = 0
            com.arlosoft.macrodroid.common.C4061t1.m16023v(r1, r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.services.FileOperationService.onHandleIntent(android.content.Intent):void");
    }
}
