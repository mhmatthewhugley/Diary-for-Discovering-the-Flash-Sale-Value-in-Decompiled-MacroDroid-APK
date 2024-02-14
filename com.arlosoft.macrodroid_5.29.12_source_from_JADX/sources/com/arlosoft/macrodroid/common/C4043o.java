package com.arlosoft.macrodroid.common;

import android.content.Context;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.commons.p353io.IOUtils;
import p148q0.C8151a;

/* renamed from: com.arlosoft.macrodroid.common.o */
/* compiled from: EventLogging */
public class C4043o {

    /* renamed from: a */
    private static final Object f10594a = new Object();

    /* renamed from: b */
    private static ExecutorService f10595b = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    public static String m15936a(Context context) {
        String str;
        synchronized (f10594a) {
            str = context.getExternalFilesDir((String) null) + "/MacroDroidLog.txt";
            List<String> b = m15937b(context);
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(str)));
                if (C5163j2.m20288w1(context)) {
                    for (int size = b.size() - 1; size >= 0; size--) {
                        dataOutputStream.write(b.get(size).getBytes());
                    }
                } else {
                    for (int i = 0; i < b.size(); i++) {
                        dataOutputStream.write(b.get(i).getBytes());
                    }
                }
                dataOutputStream.close();
            } catch (Exception e) {
                C8151a.m33873n(new RuntimeException("Failed to output html log file: " + e.getMessage()));
                return null;
            }
        }
        return str;
    }

    /* renamed from: b */
    public static List<String> m15937b(Context context) {
        synchronized (f10594a) {
            int F = C5163j2.m19962F(context);
            ArrayList arrayList = new ArrayList();
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(context.getFilesDir());
                sb.append("/");
                int i = 2;
                sb.append(m15938c(F == 1 ? 2 : 1));
                if (new File(sb.toString()).exists()) {
                    if (F != 1) {
                        i = 1;
                    }
                    DataInputStream dataInputStream = new DataInputStream(context.openFileInput(m15938c(i)));
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        arrayList.add(readLine + IOUtils.LINE_SEPARATOR_WINDOWS);
                    }
                    dataInputStream.close();
                }
                if (!new File(context.getFilesDir() + "/" + m15938c(F)).exists()) {
                    return null;
                }
                DataInputStream dataInputStream2 = new DataInputStream(context.openFileInput(m15938c(F)));
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(dataInputStream2));
                while (true) {
                    String readLine2 = bufferedReader2.readLine();
                    if (readLine2 != null) {
                        arrayList.add(readLine2 + IOUtils.LINE_SEPARATOR_WINDOWS);
                    } else {
                        dataInputStream2.close();
                        return arrayList;
                    }
                }
            } catch (Exception e) {
                C8151a.m33873n(new RuntimeException("Failed to output html log file: " + e.getMessage()));
                return null;
            }
        }
    }

    /* renamed from: c */
    public static String m15938c(int i) {
        if (i == 1) {
            return "macrodroid_event_log_1";
        }
        if (i == 2) {
            return "macrodroid_event_log_2";
        }
        C8151a.m33873n(new RuntimeException("Invalid logNumber: " + i));
        return "macrodroid_event_log_1";
    }
}
