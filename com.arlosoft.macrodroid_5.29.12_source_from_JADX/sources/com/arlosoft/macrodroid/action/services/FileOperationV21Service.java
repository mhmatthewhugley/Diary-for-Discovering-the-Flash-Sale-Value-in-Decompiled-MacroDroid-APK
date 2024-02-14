package com.arlosoft.macrodroid.action.services;

import android.app.IntentService;
import android.content.Context;
import android.content.UriPermission;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.documentfile.provider.DocumentFile;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.utils.C6459y0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import org.apache.commons.p353io.IOUtils;

public class FileOperationV21Service extends IntentService {
    public FileOperationV21Service() {
        super("FileOperationV21Service");
        setIntentRedelivery(true);
    }

    /* renamed from: a */
    private String m14332a(DocumentFile documentFile, DocumentFile documentFile2, int i) throws IOException {
        InputStream openInputStream = getContentResolver().openInputStream(documentFile.getUri());
        DocumentFile findFile = documentFile2.findFile(documentFile.getName());
        if (findFile != null && findFile.getUri().equals(documentFile.getUri())) {
            return null;
        }
        if (findFile != null) {
            findFile.delete();
        }
        DocumentFile createFile = documentFile2.createFile(documentFile.getType(), documentFile.getName());
        if (createFile == null) {
            return "Output file could not be written";
        }
        OutputStream openOutputStream = getContentResolver().openOutputStream(createFile.getUri());
        IOUtils.copy(openInputStream, openOutputStream);
        openOutputStream.close();
        openInputStream.close();
        if (i == 1) {
            documentFile.delete();
        }
        return null;
    }

    /* renamed from: b */
    private static DocumentFile m14333b(DocumentFile documentFile, Uri uri) {
        for (DocumentFile documentFile2 : documentFile.listFiles()) {
            if (documentFile2.isDirectory()) {
                if (uri.toString().equals(documentFile2.getUri().toString())) {
                    return documentFile2;
                }
                if (uri.toString().startsWith(documentFile2.getUri().toString())) {
                    return m14333b(documentFile2, uri);
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static DocumentFile m14334c(Context context, Uri uri) {
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        List<UriPermission> persistedUriPermissions = context.getContentResolver().getPersistedUriPermissions();
        C4878b.m18879r("Uri permission list length = " + persistedUriPermissions.size());
        for (UriPermission next : persistedUriPermissions) {
            C4878b.m18879r(next.toString());
            try {
                DocumentFile b = m14333b(DocumentFile.fromTreeUri(context, next.getUri()), DocumentsContract.buildDocumentUriUsingTree(next.getUri(), treeDocumentId));
                if (b != null) {
                    C4878b.m18879r("Access available: " + b.getName());
                    return b;
                }
            } catch (IllegalArgumentException e) {
                C4878b.m18879r("Failed to get file from root permission: " + e.toString());
            }
        }
        return null;
    }

    /* renamed from: d */
    private void m14335d(DocumentFile documentFile, DocumentFile documentFile2, int i, String str) throws IOException {
        DocumentFile documentFile3;
        if (documentFile.isDirectory()) {
            DocumentFile[] listFiles = documentFile.listFiles();
            int length = listFiles.length;
            int i2 = 0;
            while (i2 < length) {
                DocumentFile documentFile4 = listFiles[i2];
                if (documentFile4.isDirectory()) {
                    documentFile3 = documentFile2.findFile(documentFile4.getName());
                    if (documentFile3 == null) {
                        documentFile3 = documentFile2.createDirectory(documentFile4.getName());
                    }
                } else {
                    documentFile3 = documentFile2;
                }
                if (documentFile3.canWrite() || ((documentFile3 = m14334c(this, documentFile3.getUri())) != null && documentFile3.canWrite())) {
                    m14335d(documentFile4, documentFile3, i, str);
                    i2++;
                } else {
                    C6459y0.m24788b(this, str);
                    return;
                }
            }
            return;
        }
        m14332a(documentFile, documentFile2, i);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:79|80|81|(2:83|(6:88|89|90|91|92|93)(1:87))|96|97|(1:99)(1:100)|101|102|103|104|105) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:88|89|90|91|92|93) */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0209, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:104:0x021a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:114:0x0227 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x022b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x0208 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            java.lang.String r2 = "FromUri"
            java.lang.String r2 = r0.getStringExtra(r2)
            java.lang.String r3 = "ToUri"
            java.lang.String r3 = r0.getStringExtra(r3)
            java.lang.String r4 = "FilePattern"
            java.lang.String r4 = r0.getStringExtra(r4)
            java.lang.String r5 = "FileExtensions"
            java.lang.String[] r5 = r0.getStringArrayExtra(r5)
            java.lang.String r6 = "fromPath"
            java.lang.String r6 = r0.getStringExtra(r6)
            java.lang.String r7 = "folderName"
            java.lang.String r7 = r0.getStringExtra(r7)
            java.lang.String r8 = "com.arlosoft.macrodroid.MACRO_NAME"
            java.lang.String r8 = r0.getStringExtra(r8)
            java.lang.String r9 = "option"
            r10 = 0
            int r9 = r0.getIntExtra(r9, r10)
            android.net.Uri r0 = android.net.Uri.parse(r2)
            androidx.documentfile.provider.DocumentFile r11 = androidx.documentfile.provider.DocumentFile.fromTreeUri(r1, r0)
            if (r11 != 0) goto L_0x006d
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "FileOperationV21 fromDir is null: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            p148q0.C8151a.m33873n(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "File operation failure fromDir is null: "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            return
        L_0x006d:
            boolean r12 = r11.exists()
            if (r12 != 0) goto L_0x0097
            androidx.documentfile.provider.DocumentFile r11 = m14334c(r1, r0)
            if (r11 == 0) goto L_0x007f
            boolean r0 = r11.exists()
            if (r0 != 0) goto L_0x00ce
        L_0x007f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "File operation failed - from dir does not exist or is not accessible: "
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            com.arlosoft.macrodroid.utils.C6459y0.m24788b(r1, r8)
            return
        L_0x0097:
            boolean r12 = r11.canRead()
            if (r12 != 0) goto L_0x00ce
            androidx.documentfile.provider.DocumentFile r11 = m14334c(r1, r0)
            if (r11 == 0) goto L_0x00a9
            boolean r0 = r11.canRead()
            if (r0 != 0) goto L_0x00ce
        L_0x00a9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Cannot read 'FROM' directory: ["
            r0.append(r3)
            r0.append(r6)
            java.lang.String r3 = ", "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            com.arlosoft.macrodroid.utils.C6459y0.m24788b(r1, r8)
            return
        L_0x00ce:
            if (r3 == 0) goto L_0x00d6
            android.net.Uri r0 = android.net.Uri.parse(r3)
            r3 = r0
            goto L_0x00d7
        L_0x00d6:
            r3 = 0
        L_0x00d7:
            r0 = 3
            if (r9 != r0) goto L_0x00e4
            androidx.documentfile.provider.DocumentFile r0 = r11.findFile(r7)
            if (r0 != 0) goto L_0x00e3
            r11.createDirectory(r7)
        L_0x00e3:
            return
        L_0x00e4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r7 = " with size "
            java.lang.String r12 = "Found file "
            if (r4 == 0) goto L_0x0143
            org.apache.commons.io.filefilter.WildcardFileFilter r5 = new org.apache.commons.io.filefilter.WildcardFileFilter
            r5.<init>((java.lang.String) r4)
            androidx.documentfile.provider.DocumentFile[] r4 = r11.listFiles()
            int r6 = r4.length
            r11 = 0
        L_0x00fa:
            if (r11 >= r6) goto L_0x013f
            r14 = r4[r11]
            java.lang.String r15 = r14.getName()
            if (r15 == 0) goto L_0x0138
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r12)
            java.lang.String r13 = r14.getName()
            r15.append(r13)
            r15.append(r7)
            r16 = r3
            long r2 = r14.length()
            r15.append(r2)
            boolean r2 = r14.isDirectory()     // Catch:{ Exception -> 0x013a }
            if (r2 != 0) goto L_0x013a
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x013a }
            java.lang.String r3 = r14.getName()     // Catch:{ Exception -> 0x013a }
            r2.<init>(r3)     // Catch:{ Exception -> 0x013a }
            boolean r2 = r5.accept(r2)     // Catch:{ Exception -> 0x013a }
            if (r2 == 0) goto L_0x013a
            r0.add(r14)     // Catch:{ Exception -> 0x013a }
            goto L_0x013a
        L_0x0138:
            r16 = r3
        L_0x013a:
            int r11 = r11 + 1
            r3 = r16
            goto L_0x00fa
        L_0x013f:
            r16 = r3
            goto L_0x01c0
        L_0x0143:
            r16 = r3
            if (r5 == 0) goto L_0x027e
            if (r6 != 0) goto L_0x014f
            java.lang.String r0 = "FileOperationService: fromPath is null"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            return
        L_0x014f:
            java.lang.String r2 = "/"
            boolean r2 = r6.endsWith(r2)
            if (r2 == 0) goto L_0x015b
            r0.add(r11)
            goto L_0x01c0
        L_0x015b:
            androidx.documentfile.provider.DocumentFile[] r2 = r11.listFiles()
            int r3 = r2.length
            r4 = 0
        L_0x0161:
            if (r4 >= r3) goto L_0x01c0
            r6 = r2[r4]
            java.lang.String r11 = r6.getName()
            if (r11 == 0) goto L_0x01b8
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r12)
            r14.append(r11)
            r14.append(r7)
            r17 = r11
            long r10 = r6.length()
            r14.append(r10)
            java.lang.String r10 = r14.toString()
            r11 = 0
            java.lang.Object[] r14 = new java.lang.Object[r11]
            p455ag.C17105a.m100579a(r10, r14)
            int r10 = r5.length
            r11 = 0
        L_0x018e:
            if (r11 >= r10) goto L_0x01b8
            r14 = r5[r11]
            java.lang.String r13 = r17.toLowerCase()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r18 = r2
            java.lang.String r2 = "."
            r15.append(r2)
            r15.append(r14)
            java.lang.String r2 = r15.toString()
            boolean r2 = r13.endsWith(r2)
            if (r2 == 0) goto L_0x01b3
            r0.add(r6)
            goto L_0x01ba
        L_0x01b3:
            int r11 = r11 + 1
            r2 = r18
            goto L_0x018e
        L_0x01b8:
            r18 = r2
        L_0x01ba:
            int r4 = r4 + 1
            r2 = r18
            r10 = 0
            goto L_0x0161
        L_0x01c0:
            int r2 = r0.size()
            if (r2 != 0) goto L_0x01c7
            return
        L_0x01c7:
            java.util.Iterator r2 = r0.iterator()
            r3 = 0
        L_0x01cc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x022f
            java.lang.Object r0 = r2.next()
            androidx.documentfile.provider.DocumentFile r0 = (androidx.documentfile.provider.DocumentFile) r0
            r4 = 2
            if (r9 != r4) goto L_0x01e2
            r0.delete()
            r4 = r16
        L_0x01e0:
            r5 = 0
            goto L_0x022c
        L_0x01e2:
            if (r16 != 0) goto L_0x01ea
            java.lang.String r0 = "File Operation failed: Destination address is null"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            return
        L_0x01ea:
            r4 = r16
            androidx.documentfile.provider.DocumentFile r5 = androidx.documentfile.provider.DocumentFile.fromTreeUri(r1, r4)     // Catch:{ Exception -> 0x021d }
            boolean r6 = r5.canWrite()     // Catch:{ Exception -> 0x021d }
            if (r6 != 0) goto L_0x020a
            androidx.documentfile.provider.DocumentFile r5 = m14334c(r1, r4)     // Catch:{ Exception -> 0x021d }
            if (r5 == 0) goto L_0x0203
            boolean r6 = r5.canWrite()     // Catch:{ Exception -> 0x021d }
            if (r6 == 0) goto L_0x0203
            goto L_0x020a
        L_0x0203:
            com.arlosoft.macrodroid.utils.C6459y0.m24788b(r1, r8)     // Catch:{ Exception -> 0x021d }
            r2 = 0
            throw r2     // Catch:{ Exception -> 0x0208 }
        L_0x0208:
            throw r2     // Catch:{ Exception -> 0x0209 }
        L_0x0209:
            return
        L_0x020a:
            boolean r6 = r0.isDirectory()     // Catch:{ Exception -> 0x021d }
            if (r6 == 0) goto L_0x0214
            r1.m14335d(r0, r5, r9, r8)     // Catch:{ Exception -> 0x021d }
            goto L_0x0218
        L_0x0214:
            java.lang.String r3 = r1.m14332a(r0, r5, r9)     // Catch:{ Exception -> 0x021d }
        L_0x0218:
            r5 = 0
            throw r5     // Catch:{ Exception -> 0x021a }
        L_0x021a:
            throw r5     // Catch:{ Exception -> 0x01e0 }
        L_0x021b:
            r0 = move-exception
            goto L_0x0225
        L_0x021d:
            r0 = move-exception
            if (r3 != 0) goto L_0x0229
            java.lang.String r3 = r0.toString()     // Catch:{ all -> 0x021b }
            goto L_0x0229
        L_0x0225:
            r5 = 0
            throw r5     // Catch:{ Exception -> 0x0227 }
        L_0x0227:
            throw r5     // Catch:{ Exception -> 0x0228 }
        L_0x0228:
            throw r0
        L_0x0229:
            r5 = 0
            throw r5     // Catch:{ Exception -> 0x022b }
        L_0x022b:
            throw r5     // Catch:{ Exception -> 0x022c }
        L_0x022c:
            r16 = r4
            goto L_0x01cc
        L_0x022f:
            if (r3 == 0) goto L_0x027d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 2131954168(0x7f1309f8, float:1.9544828E38)
            java.lang.String r4 = r1.getString(r2)
            r0.append(r4)
            java.lang.String r4 = ": "
            r0.append(r4)
            java.lang.String[] r5 = com.arlosoft.macrodroid.action.FileOperationV21Action.m10675B3()
            r5 = r5[r9]
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r5 = 0
            com.arlosoft.macrodroid.common.C4061t1.m16023v(r1, r0, r3, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r1.getString(r2)
            r0.append(r2)
            r0.append(r4)
            java.lang.String[] r2 = com.arlosoft.macrodroid.action.FileOperationV21Action.m10675B3()
            r2 = r2[r9]
            r0.append(r2)
            java.lang.String r2 = " - "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
        L_0x027d:
            return
        L_0x027e:
            java.lang.String r0 = "FileOperationService: FilePattern and FileExtensions are both null"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            p148q0.C8151a.m33873n(r2)
            r2 = 2131954168(0x7f1309f8, float:1.9544828E38)
            java.lang.String r0 = r1.getString(r2)
            java.lang.String r2 = "File Operation Failed"
            r3 = 0
            com.arlosoft.macrodroid.common.C4061t1.m16023v(r1, r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.services.FileOperationV21Service.onHandleIntent(android.content.Intent):void");
    }
}
