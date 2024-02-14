package com.arlosoft.macrodroid.celltowers;

import android.text.TextUtils;
import android.util.Log;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4061t1;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p135n1.C7964a;
import p148q0.C8151a;

/* renamed from: com.arlosoft.macrodroid.celltowers.l */
/* compiled from: CellTowerGroupStore */
public class C3932l {

    /* renamed from: b */
    private static C3932l f10234b;

    /* renamed from: a */
    private List<C7964a> f10235a = new ArrayList();

    /* renamed from: com.arlosoft.macrodroid.celltowers.l$a */
    /* compiled from: CellTowerGroupStore */
    class C3933a extends TypeToken<List<C7964a>> {
        C3933a() {
        }
    }

    private C3932l() {
        m15308f();
    }

    /* renamed from: e */
    public static C3932l m15307e() {
        if (f10234b == null) {
            f10234b = new C3932l();
        }
        return f10234b;
    }

    /* renamed from: f */
    private void m15308f() {
        FileInputStream fileInputStream;
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            fileInputStream = MacroDroidApplication.m14845u().openFileInput("cellTowerGroups.json");
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, "UTF-8"));
                try {
                    char[] cArr = new char[1024];
                    for (int read = bufferedReader.read(cArr, 0, 1024); read > 0; read = bufferedReader.read(cArr, 0, 1024)) {
                        sb.append(cArr, 0, read);
                    }
                    bufferedReader.close();
                    mo27632g(sb.toString());
                } catch (FileNotFoundException unused) {
                    bufferedReader2 = bufferedReader;
                    Log.w("CellTowerGroupStore", "No Cell Tower data file found");
                    bufferedReader2.close();
                    fileInputStream.close();
                } catch (Exception e) {
                    e = e;
                    bufferedReader2 = bufferedReader;
                    try {
                        String I0 = C4061t1.m15961I0(e);
                        C8151a.m33873n(new RuntimeException("Failed to import CellTowerGroup from JSON: " + e.getMessage() + I0.substring(0, Math.max(200, I0.length()))));
                        bufferedReader2.close();
                        fileInputStream.close();
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader2 = bufferedReader;
                    try {
                        bufferedReader2.close();
                        fileInputStream.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused3) {
                Log.w("CellTowerGroupStore", "No Cell Tower data file found");
                bufferedReader2.close();
                fileInputStream.close();
            } catch (Exception e2) {
                e = e2;
                String I02 = C4061t1.m15961I0(e);
                C8151a.m33873n(new RuntimeException("Failed to import CellTowerGroup from JSON: " + e.getMessage() + I02.substring(0, Math.max(200, I02.length()))));
                bufferedReader2.close();
                fileInputStream.close();
            }
            try {
                bufferedReader.close();
                fileInputStream.close();
            } catch (Exception unused4) {
            }
        } catch (FileNotFoundException unused5) {
            fileInputStream = null;
            Log.w("CellTowerGroupStore", "No Cell Tower data file found");
            bufferedReader2.close();
            fileInputStream.close();
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
            String I022 = C4061t1.m15961I0(e);
            C8151a.m33873n(new RuntimeException("Failed to import CellTowerGroup from JSON: " + e.getMessage() + I022.substring(0, Math.max(200, I022.length()))));
            bufferedReader2.close();
            fileInputStream.close();
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            bufferedReader2.close();
            fileInputStream.close();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo27628a(C7964a aVar) {
        this.f10235a.add(aVar);
    }

    /* renamed from: b */
    public List<C7964a> mo27629b() {
        return this.f10235a;
    }

    /* renamed from: c */
    public List<C7964a> mo27630c() {
        Collections.sort(this.f10235a);
        return this.f10235a;
    }

    /* renamed from: d */
    public C7964a mo27631d(String str) {
        for (C7964a next : this.f10235a) {
            if (str != null && str.equals(next.getName())) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: g */
    public void mo27632g(String str) {
        List<C7964a> list = (List) new GsonBuilder().mo64004c().mo63977k(str, new C3933a().mo64307e());
        this.f10235a = list;
        if (list == null) {
            this.f10235a = new ArrayList();
        }
        for (C7964a next : this.f10235a) {
            for (int i = 0; i < next.getCellTowerIds().size(); i++) {
                next.getCellTowerIds().set(i, C7964a.convertLegacyCellTowerId(next.getCellTowerIds().get(i)));
            }
        }
        Iterator<C7964a> it = this.f10235a.iterator();
        while (it.hasNext()) {
            C7964a next2 = it.next();
            if (TextUtils.isEmpty(next2.getName()) || next2.getCellTowerIds() == null) {
                it.remove();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.OutputStreamWriter] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo27633h() {
        /*
            r6 = this;
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            r1 = 0
            com.arlosoft.macrodroid.app.MacroDroidApplication r2 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()     // Catch:{ Exception -> 0x0038, all -> 0x0035 }
            java.lang.String r3 = "cellTowerGroups.json"
            r4 = 0
            java.io.FileOutputStream r2 = r2.openFileOutput(r3, r4)     // Catch:{ Exception -> 0x0038, all -> 0x0035 }
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r2, r4)     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            java.util.List<n1.a> r1 = r6.f10235a     // Catch:{ Exception -> 0x002d, all -> 0x002b }
            java.lang.String r0 = r0.mo63984s(r1)     // Catch:{ Exception -> 0x002d, all -> 0x002b }
            r3.write(r0)     // Catch:{ Exception -> 0x002d, all -> 0x002b }
            r3.close()     // Catch:{ Exception -> 0x002d, all -> 0x002b }
            r3.close()     // Catch:{ Exception -> 0x005d }
            r2.close()     // Catch:{ Exception -> 0x005d }
            goto L_0x005d
        L_0x002b:
            r0 = move-exception
            goto L_0x0060
        L_0x002d:
            r0 = move-exception
            goto L_0x0033
        L_0x002f:
            r0 = move-exception
            goto L_0x0061
        L_0x0031:
            r0 = move-exception
            r3 = r1
        L_0x0033:
            r1 = r2
            goto L_0x003a
        L_0x0035:
            r0 = move-exception
            r2 = r1
            goto L_0x0061
        L_0x0038:
            r0 = move-exception
            r3 = r1
        L_0x003a:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x005e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x005e }
            r4.<init>()     // Catch:{ all -> 0x005e }
            java.lang.String r5 = "ERROR - Serializing the macro list: "
            r4.append(r5)     // Catch:{ all -> 0x005e }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x005e }
            r4.append(r0)     // Catch:{ all -> 0x005e }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x005e }
            r2.<init>(r0)     // Catch:{ all -> 0x005e }
            p148q0.C8151a.m33873n(r2)     // Catch:{ all -> 0x005e }
            r3.close()     // Catch:{ Exception -> 0x005d }
            r1.close()     // Catch:{ Exception -> 0x005d }
        L_0x005d:
            return
        L_0x005e:
            r0 = move-exception
            r2 = r1
        L_0x0060:
            r1 = r3
        L_0x0061:
            r1.close()     // Catch:{ Exception -> 0x0067 }
            r2.close()     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.celltowers.C3932l.mo27633h():void");
    }

    /* renamed from: i */
    public void mo27634i(C7964a aVar) {
        this.f10235a.remove(aVar);
    }

    /* renamed from: j */
    public void mo27635j(List<C7964a> list) {
        this.f10235a = list;
    }
}
