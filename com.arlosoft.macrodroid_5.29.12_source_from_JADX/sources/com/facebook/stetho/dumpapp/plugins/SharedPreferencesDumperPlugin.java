package com.facebook.stetho.dumpapp.plugins;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.stetho.dumpapp.DumpUsageException;
import com.facebook.stetho.dumpapp.DumperContext;
import com.facebook.stetho.dumpapp.DumperPlugin;
import com.facebook.stetho.inspector.domstorage.SharedPreferencesHelper;
import java.io.File;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SharedPreferencesDumperPlugin implements DumperPlugin {
    private static final String NAME = "prefs";
    private static final String XML_SUFFIX = ".xml";
    private final Context mAppContext;

    /* renamed from: com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin$1 */
    static /* synthetic */ class C67311 {

        /* renamed from: $SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type */
        static final /* synthetic */ int[] f15742x96b4f424;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin$Type[] r0 = com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15742x96b4f424 = r0
                com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin$Type r1 = com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin.Type.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15742x96b4f424     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin$Type r1 = com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin.Type.INT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15742x96b4f424     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin$Type r1 = com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin.Type.LONG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15742x96b4f424     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin$Type r1 = com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin.Type.FLOAT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15742x96b4f424     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin$Type r1 = com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin.Type.STRING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f15742x96b4f424     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin$Type r1 = com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin.Type.SET     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin.C67311.<clinit>():void");
        }
    }

    private enum Type {
        BOOLEAN(TypedValues.Custom.S_BOOLEAN),
        INT("int"),
        LONG("long"),
        FLOAT(TypedValues.Custom.S_FLOAT),
        STRING(TypedValues.Custom.S_STRING),
        SET("set");
        
        private final String name;

        private Type(String str) {
            this.name = str;
        }

        public static StringBuilder appendNamesList(StringBuilder sb, String str) {
            boolean z = true;
            for (Type type : values()) {
                if (z) {
                    z = false;
                } else {
                    sb.append(str);
                }
                sb.append(type.name);
            }
            return sb;
        }

        /* renamed from: of */
        public static Type m25494of(String str) {
            for (Type type : values()) {
                if (type.name.equals(str)) {
                    return type;
                }
            }
            return null;
        }
    }

    public SharedPreferencesDumperPlugin(Context context) {
        this.mAppContext = context.getApplicationContext();
    }

    private void doPrint(PrintStream printStream, List<String> list) {
        String str;
        String str2 = this.mAppContext.getApplicationInfo().dataDir + "/shared_prefs";
        String str3 = list.isEmpty() ? "" : list.get(0);
        if (list.size() > 1) {
            str = list.get(1);
        } else {
            str = "";
        }
        printRecursive(printStream, str2, "", str3, str);
    }

    private void doUsage(PrintStream printStream) {
        printStream.println("Usage: dumpapp prefs " + "<command> [command-options]");
        printStream.println("Usage: dumpapp prefs " + "print [pathPrefix [keyPrefix]]");
        StringBuilder sb = new StringBuilder("       dumpapp prefs ");
        sb.append("write <path> <key> <");
        StringBuilder appendNamesList = Type.appendNamesList(sb, "|");
        appendNamesList.append("> <value>");
        printStream.println(appendNamesList);
        printStream.println();
        printStream.println("dumpapp prefs print: Print all matching values from the shared preferences");
        printStream.println();
        printStream.println("dumpapp prefs write: Writes a value to the shared preferences");
    }

    private void doWrite(List<String> list) throws DumpUsageException {
        Iterator<String> it = list.iterator();
        String nextArg = nextArg(it, "Expected <path>");
        String nextArg2 = nextArg(it, "Expected <key>");
        Type of = Type.m25494of(nextArg(it, "Expected <type>"));
        if (of != null) {
            SharedPreferences.Editor edit = getSharedPreferences(nextArg).edit();
            switch (C67311.f15742x96b4f424[of.ordinal()]) {
                case 1:
                    edit.putBoolean(nextArg2, Boolean.valueOf(nextArgValue(it)).booleanValue());
                    break;
                case 2:
                    edit.putInt(nextArg2, Integer.valueOf(nextArgValue(it)).intValue());
                    break;
                case 3:
                    edit.putLong(nextArg2, Long.valueOf(nextArgValue(it)).longValue());
                    break;
                case 4:
                    edit.putFloat(nextArg2, Float.valueOf(nextArgValue(it)).floatValue());
                    break;
                case 5:
                    edit.putString(nextArg2, nextArgValue(it));
                    break;
                case 6:
                    putStringSet(edit, nextArg2, it);
                    break;
            }
            edit.commit();
            return;
        }
        throw new DumpUsageException(Type.appendNamesList(new StringBuilder("Usage: prefs write <path> <key> <type> <value>, where type is one of: "), ", ").toString());
    }

    private SharedPreferences getSharedPreferences(String str) {
        return this.mAppContext.getSharedPreferences(str, 4);
    }

    private static String nextArg(Iterator<String> it, String str) throws DumpUsageException {
        if (it.hasNext()) {
            return it.next();
        }
        throw new DumpUsageException(str);
    }

    private static String nextArgValue(Iterator<String> it) throws DumpUsageException {
        return nextArg(it, "Expected <value>");
    }

    private void printFile(PrintStream printStream, String str, String str2) {
        printStream.println(str + ":");
        for (Map.Entry next : SharedPreferencesHelper.getSharedPreferenceEntriesSorted(getSharedPreferences(str))) {
            if (((String) next.getKey()).startsWith(str2)) {
                printStream.println("  " + ((String) next.getKey()) + " = " + next.getValue());
            }
        }
    }

    private void printRecursive(PrintStream printStream, String str, String str2, String str3, String str4) {
        String[] list;
        String str5;
        File file = new File(str, str2);
        if (file.isFile()) {
            if (str2.endsWith(XML_SUFFIX)) {
                printFile(printStream, str2.substring(0, str2.length() - 4), str4);
            }
        } else if (file.isDirectory() && (list = file.list()) != null) {
            for (int i = 0; i < list.length; i++) {
                if (TextUtils.isEmpty(str2)) {
                    str5 = list[i];
                } else {
                    str5 = str2 + File.separator + list[i];
                }
                String str6 = str5;
                if (str6.startsWith(str3)) {
                    printRecursive(printStream, str, str6, str3, str4);
                }
            }
        }
    }

    private static void putStringSet(SharedPreferences.Editor editor, String str, Iterator<String> it) {
        HashSet hashSet = new HashSet();
        while (it.hasNext()) {
            hashSet.add(it.next());
        }
        editor.putStringSet(str, hashSet);
    }

    public void dump(DumperContext dumperContext) throws DumpUsageException {
        PrintStream stdout = dumperContext.getStdout();
        List<String> argsAsList = dumperContext.getArgsAsList();
        String remove = argsAsList.isEmpty() ? "" : argsAsList.remove(0);
        if (remove.equals("print")) {
            doPrint(stdout, argsAsList);
        } else if (remove.equals("write")) {
            doWrite(argsAsList);
        } else {
            doUsage(stdout);
        }
    }

    public String getName() {
        return NAME;
    }
}
