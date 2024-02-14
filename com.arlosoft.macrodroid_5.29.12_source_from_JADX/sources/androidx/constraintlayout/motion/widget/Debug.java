package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Debug {
    public static void dumpLayoutParams(ViewGroup viewGroup, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(fileName).length() + 18 + String.valueOf(str).length());
        sb.append(".(");
        sb.append(fileName);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(") ");
        sb.append(str);
        sb.append("  ");
        String sb2 = sb.toString();
        int childCount = viewGroup.getChildCount();
        PrintStream printStream = System.out;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 21);
        sb3.append(str);
        sb3.append(" children ");
        sb3.append(childCount);
        printStream.println(sb3.toString());
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            PrintStream printStream2 = System.out;
            String name = getName(childAt);
            StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(name).length());
            sb4.append(sb2);
            sb4.append("     ");
            sb4.append(name);
            printStream2.println(sb4.toString());
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Field[] fields = layoutParams.getClass().getFields();
            for (Field field : fields) {
                try {
                    Object obj = field.get(layoutParams);
                    if (field.getName().contains("To")) {
                        if (!obj.toString().equals("-1")) {
                            PrintStream printStream3 = System.out;
                            String name2 = field.getName();
                            String valueOf = String.valueOf(obj);
                            StringBuilder sb5 = new StringBuilder(String.valueOf(sb2).length() + 8 + String.valueOf(name2).length() + valueOf.length());
                            sb5.append(sb2);
                            sb5.append("       ");
                            sb5.append(name2);
                            sb5.append(" ");
                            sb5.append(valueOf);
                            printStream3.println(sb5.toString());
                        }
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static void dumpPoc(Object obj) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(fileName).length() + 15);
        sb.append(".(");
        sb.append(fileName);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        Class<?> cls = obj.getClass();
        PrintStream printStream = System.out;
        String name = cls.getName();
        StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 35 + name.length());
        sb3.append(sb2);
        sb3.append("------------- ");
        sb3.append(name);
        sb3.append(" --------------------");
        printStream.println(sb3.toString());
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            try {
                Object obj2 = field.get(obj);
                if (field.getName().startsWith("layout_constraint")) {
                    if (!(obj2 instanceof Integer) || !obj2.toString().equals("-1")) {
                        if (!(obj2 instanceof Integer) || !obj2.toString().equals("0")) {
                            if (!(obj2 instanceof Float) || !obj2.toString().equals("1.0")) {
                                if (!(obj2 instanceof Float) || !obj2.toString().equals("0.5")) {
                                    PrintStream printStream2 = System.out;
                                    String name2 = field.getName();
                                    String valueOf = String.valueOf(obj2);
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(name2).length() + valueOf.length());
                                    sb4.append(sb2);
                                    sb4.append("    ");
                                    sb4.append(name2);
                                    sb4.append(" ");
                                    sb4.append(valueOf);
                                    printStream2.println(sb4.toString());
                                }
                            }
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        PrintStream printStream3 = System.out;
        String simpleName = cls.getSimpleName();
        StringBuilder sb5 = new StringBuilder(String.valueOf(sb2).length() + 35 + simpleName.length());
        sb5.append(sb2);
        sb5.append("------------- ");
        sb5.append(simpleName);
        sb5.append(" --------------------");
        printStream3.println(sb5.toString());
    }

    public static String getActionType(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        Field[] fields = MotionEvent.class.getFields();
        for (Field field : fields) {
            try {
                if (Modifier.isStatic(field.getModifiers()) && field.getType().equals(Integer.TYPE) && field.getInt((Object) null) == action) {
                    return field.getName();
                }
            } catch (IllegalAccessException unused) {
            }
        }
        return "---";
    }

    public static String getCallFrom(int i) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[i + 2];
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(fileName).length() + 15);
        sb.append(".(");
        sb.append(fileName);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        return sb.toString();
    }

    public static String getLoc() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        String methodName = stackTraceElement.getMethodName();
        StringBuilder sb = new StringBuilder(String.valueOf(fileName).length() + 18 + String.valueOf(methodName).length());
        sb.append(".(");
        sb.append(fileName);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(") ");
        sb.append(methodName);
        sb.append("()");
        return sb.toString();
    }

    public static String getLocation() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(fileName).length() + 15);
        sb.append(".(");
        sb.append(fileName);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        return sb.toString();
    }

    public static String getLocation2() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(fileName).length() + 15);
        sb.append(".(");
        sb.append(fileName);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        return sb.toString();
    }

    public static String getName(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String getState(MotionLayout motionLayout, int i) {
        return getState(motionLayout, i, -1);
    }

    public static void logStack(String str, String str2, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i, stackTrace.length - 1);
        String str3 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            String fileName = stackTrace[i2].getFileName();
            int lineNumber = stackTrace[i2].getLineNumber();
            String methodName = stackTrace[i2].getMethodName();
            StringBuilder sb = new StringBuilder(String.valueOf(fileName).length() + 16 + String.valueOf(methodName).length());
            sb.append(".(");
            sb.append(fileName);
            sb.append(":");
            sb.append(lineNumber);
            sb.append(") ");
            sb.append(methodName);
            String sb2 = sb.toString();
            str3 = String.valueOf(str3).concat(" ");
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(sb2).length() + String.valueOf(str3).length());
            sb3.append(str2);
            sb3.append(str3);
            sb3.append(sb2);
            sb3.append(str3);
        }
    }

    public static void printStack(String str, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i, stackTrace.length - 1);
        String str2 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            String fileName = stackTrace[i2].getFileName();
            int lineNumber = stackTrace[i2].getLineNumber();
            StringBuilder sb = new StringBuilder(String.valueOf(fileName).length() + 16);
            sb.append(".(");
            sb.append(fileName);
            sb.append(":");
            sb.append(lineNumber);
            sb.append(") ");
            String sb2 = sb.toString();
            str2 = String.valueOf(str2).concat(" ");
            PrintStream printStream = System.out;
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(sb2).length() + String.valueOf(str2).length());
            sb3.append(str);
            sb3.append(str2);
            sb3.append(sb2);
            sb3.append(str2);
            printStream.println(sb3.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        r2 = r1.replaceAll("[^_]", "").length();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getState(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2, int r3) {
        /*
            r0 = -1
            if (r2 != r0) goto L_0x0006
            java.lang.String r1 = "UNDEFINED"
            return r1
        L_0x0006:
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getResourceEntryName(r2)
            if (r3 == r0) goto L_0x0059
            int r2 = r1.length()
            if (r2 <= r3) goto L_0x0022
            java.lang.String r2 = "([^_])[aeiou]+"
            java.lang.String r0 = "$1"
            java.lang.String r1 = r1.replaceAll(r2, r0)
        L_0x0022:
            int r2 = r1.length()
            if (r2 <= r3) goto L_0x0059
            java.lang.String r2 = "[^_]"
            java.lang.String r0 = ""
            java.lang.String r2 = r1.replaceAll(r2, r0)
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0059
            int r0 = r1.length()
            int r0 = r0 - r3
            int r0 = r0 / r2
            java.nio.CharBuffer r2 = java.nio.CharBuffer.allocate(r0)
            java.lang.String r2 = r2.toString()
            r3 = 0
            r0 = 46
            java.lang.String r2 = r2.replace(r3, r0)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "_"
            java.lang.String r2 = r2.concat(r3)
            java.lang.String r1 = r1.replaceAll(r2, r3)
        L_0x0059:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.Debug.getState(androidx.constraintlayout.motion.widget.MotionLayout, int, int):java.lang.String");
    }

    public static String getName(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder(12);
            sb.append("?");
            sb.append(i);
            return sb.toString();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3 = r7[r1];
        r5 = new java.lang.StringBuilder(14);
        r5.append("? ");
        r5.append(r3);
        r5.append(" ");
        r2 = r5.toString();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0040 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getName(android.content.Context r6, int[] r7) {
        /*
            int r0 = r7.length     // Catch:{ Exception -> 0x007f }
            r1 = 12
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007f }
            r2.<init>(r1)     // Catch:{ Exception -> 0x007f }
            r2.append(r0)     // Catch:{ Exception -> 0x007f }
            java.lang.String r0 = "["
            r2.append(r0)     // Catch:{ Exception -> 0x007f }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x007f }
            r1 = 0
        L_0x0015:
            int r2 = r7.length     // Catch:{ Exception -> 0x007f }
            if (r1 >= r2) goto L_0x0074
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x007f }
            java.lang.String r2 = " "
            if (r1 != 0) goto L_0x0023
            java.lang.String r3 = ""
            goto L_0x0024
        L_0x0023:
            r3 = r2
        L_0x0024:
            int r4 = r3.length()     // Catch:{ Exception -> 0x007f }
            if (r4 == 0) goto L_0x002f
            java.lang.String r0 = r0.concat(r3)     // Catch:{ Exception -> 0x007f }
            goto L_0x0035
        L_0x002f:
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x007f }
            r3.<init>(r0)     // Catch:{ Exception -> 0x007f }
            r0 = r3
        L_0x0035:
            android.content.res.Resources r3 = r6.getResources()     // Catch:{ NotFoundException -> 0x0040 }
            r4 = r7[r1]     // Catch:{ NotFoundException -> 0x0040 }
            java.lang.String r2 = r3.getResourceEntryName(r4)     // Catch:{ NotFoundException -> 0x0040 }
            goto L_0x0058
        L_0x0040:
            r3 = r7[r1]     // Catch:{ Exception -> 0x007f }
            r4 = 14
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007f }
            r5.<init>(r4)     // Catch:{ Exception -> 0x007f }
            java.lang.String r4 = "? "
            r5.append(r4)     // Catch:{ Exception -> 0x007f }
            r5.append(r3)     // Catch:{ Exception -> 0x007f }
            r5.append(r2)     // Catch:{ Exception -> 0x007f }
            java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x007f }
        L_0x0058:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x007f }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x007f }
            int r3 = r2.length()     // Catch:{ Exception -> 0x007f }
            if (r3 == 0) goto L_0x006b
            java.lang.String r0 = r0.concat(r2)     // Catch:{ Exception -> 0x007f }
            goto L_0x0071
        L_0x006b:
            java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x007f }
            r2.<init>(r0)     // Catch:{ Exception -> 0x007f }
            r0 = r2
        L_0x0071:
            int r1 = r1 + 1
            goto L_0x0015
        L_0x0074:
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x007f }
            java.lang.String r7 = "]"
            java.lang.String r6 = r6.concat(r7)     // Catch:{ Exception -> 0x007f }
            return r6
        L_0x007f:
            r6 = move-exception
            r6.toString()
            java.lang.String r6 = "UNKNOWN"
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.Debug.getName(android.content.Context, int[]):java.lang.String");
    }

    public static void dumpLayoutParams(ViewGroup.LayoutParams layoutParams, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(fileName).length() + 18 + String.valueOf(str).length());
        sb.append(".(");
        sb.append(fileName);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(") ");
        sb.append(str);
        sb.append("  ");
        String sb2 = sb.toString();
        PrintStream printStream = System.out;
        String name = layoutParams.getClass().getName();
        StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 28 + name.length());
        sb3.append(" >>>>>>>>>>>>>>>>>>. dump ");
        sb3.append(sb2);
        sb3.append("  ");
        sb3.append(name);
        printStream.println(sb3.toString());
        Field[] fields = layoutParams.getClass().getFields();
        for (Field field : fields) {
            try {
                Object obj = field.get(layoutParams);
                String name2 = field.getName();
                if (name2.contains("To")) {
                    if (!obj.toString().equals("-1")) {
                        PrintStream printStream2 = System.out;
                        String valueOf = String.valueOf(obj);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 8 + name2.length() + valueOf.length());
                        sb4.append(sb2);
                        sb4.append("       ");
                        sb4.append(name2);
                        sb4.append(" ");
                        sb4.append(valueOf);
                        printStream2.println(sb4.toString());
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        PrintStream printStream3 = System.out;
        String valueOf2 = String.valueOf(sb2);
        printStream3.println(valueOf2.length() != 0 ? " <<<<<<<<<<<<<<<<< dump ".concat(valueOf2) : new String(" <<<<<<<<<<<<<<<<< dump "));
    }
}
