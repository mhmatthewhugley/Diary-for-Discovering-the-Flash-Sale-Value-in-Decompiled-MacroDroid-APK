package com.sun.mail.util.logging;

import java.util.Date;
import java.util.Formattable;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import javax.mail.UIDFolder;

public class CompactFormatter extends Formatter {
    private final String fmt;

    private class Alternate implements Formattable {
        private final String left;
        private final String right;

        Alternate(String str, String str2) {
            this.left = String.valueOf(str);
            this.right = String.valueOf(str2);
        }

        private int minCodePointCount(String str, int i) {
            int length = str.length();
            if (length - i >= i) {
                return i;
            }
            return Math.min(str.codePointCount(0, length), i);
        }

        private String pad(int i, String str, int i2) {
            StringBuilder sb = new StringBuilder(Math.max(str.length() + i2, i2));
            int i3 = 0;
            if ((i & 1) == 1) {
                while (i3 < i2) {
                    sb.append(' ');
                    i3++;
                }
                sb.append(str);
            } else {
                sb.append(str);
                while (i3 < i2) {
                    sb.append(' ');
                    i3++;
                }
            }
            return sb.toString();
        }

        public void formatTo(java.util.Formatter formatter, int i, int i2, int i3) {
            int i4;
            int i5;
            String str = this.left;
            String str2 = this.right;
            if ((i & 2) == 2) {
                str = str.toUpperCase(formatter.locale());
                str2 = str2.toUpperCase(formatter.locale());
            }
            if ((i & 4) == 4) {
                str = CompactFormatter.this.toAlternate(str);
                str2 = CompactFormatter.this.toAlternate(str2);
            }
            if (i3 >= 0) {
                i5 = minCodePointCount(str, i3);
                int minCodePointCount = minCodePointCount(str2, i3);
                if (i5 > (i3 >> 1)) {
                    i5 = Math.max(i5 - minCodePointCount, i5 >> 1);
                }
                i4 = Math.min(i3 - i5, minCodePointCount);
                str = str.substring(0, str.offsetByCodePoints(0, i5));
                str2 = str2.substring(0, str2.offsetByCodePoints(0, i4));
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (i2 > 0) {
                if (i3 < 0) {
                    i5 = minCodePointCount(str, i2);
                    i4 = minCodePointCount(str2, i2);
                }
                int i6 = i2 >> 1;
                if (i5 < i6) {
                    str = pad(i, str, i6 - i5);
                }
                if (i4 < i6) {
                    str2 = pad(i, str2, i6 - i4);
                }
            }
            formatter.format(str, new Object[0]);
            if (!str.isEmpty() && !str2.isEmpty()) {
                formatter.format("|", new Object[0]);
            }
            formatter.format(str2, new Object[0]);
        }
    }

    static {
        loadDeclaredClasses();
    }

    public CompactFormatter() {
        this.fmt = initFormat(getClass().getName());
    }

    private boolean defaultIgnore(StackTraceElement stackTraceElement) {
        return isSynthetic(stackTraceElement) || isStaticUtility(stackTraceElement) || isReflection(stackTraceElement);
    }

    private String findAndFormat(StackTraceElement[] stackTraceElementArr) {
        String str;
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str = "";
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            if (!ignore(stackTraceElement)) {
                str = formatStackTraceElement(stackTraceElement);
                break;
            }
            i++;
        }
        if (!isNullOrSpaces(str)) {
            return str;
        }
        for (StackTraceElement stackTraceElement2 : stackTraceElementArr) {
            if (!defaultIgnore(stackTraceElement2)) {
                return formatStackTraceElement(stackTraceElement2);
            }
        }
        return str;
    }

    private String formatStackTraceElement(StackTraceElement stackTraceElement) {
        String replace = stackTraceElement.toString().replace(stackTraceElement.getClassName(), simpleClassName(stackTraceElement.getClassName()));
        String simpleFileName = simpleFileName(stackTraceElement.getFileName());
        return (simpleFileName == null || !replace.startsWith(simpleFileName)) ? replace : replace.replace(stackTraceElement.getFileName(), "");
    }

    private Comparable<?> formatZonedDateTime(LogRecord logRecord) {
        Comparable<?> zonedDateTime = LogManagerProperties.getZonedDateTime(logRecord);
        return zonedDateTime == null ? new Date(logRecord.getMillis()) : zonedDateTime;
    }

    private String initFormat(String str) {
        String fromLogManager = LogManagerProperties.fromLogManager(str.concat(".format"));
        return isNullOrSpaces(fromLogManager) ? "%7$#.160s%n" : fromLogManager;
    }

    private static boolean isNullOrSpaces(String str) {
        return str == null || str.trim().isEmpty();
    }

    private boolean isReflection(StackTraceElement stackTraceElement) {
        try {
            return LogManagerProperties.isReflectionClass(stackTraceElement.getClassName());
        } catch (Exception | LinkageError | RuntimeException unused) {
            return stackTraceElement.getClassName().startsWith("java.lang.reflect.") || stackTraceElement.getClassName().startsWith("sun.reflect.");
        }
    }

    private boolean isStaticUtility(StackTraceElement stackTraceElement) {
        try {
            return LogManagerProperties.isStaticUtilityClass(stackTraceElement.getClassName());
        } catch (Exception | LinkageError | RuntimeException unused) {
            String className = stackTraceElement.getClassName();
            return (className.endsWith("s") && !className.endsWith("es")) || className.contains("Util") || className.endsWith("Throwables");
        }
    }

    private boolean isSynthetic(StackTraceElement stackTraceElement) {
        return stackTraceElement.getMethodName().indexOf(36) > -1;
    }

    private boolean isUnknown(StackTraceElement stackTraceElement) {
        return stackTraceElement.getLineNumber() < 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Class<?>[] loadDeclaredClasses() {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.sun.mail.util.logging.CompactFormatter$Alternate> r2 = com.sun.mail.util.logging.CompactFormatter.Alternate.class
            r0[r1] = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.logging.CompactFormatter.loadDeclaredClasses():java.lang.Class[]");
    }

    private static String replaceClassName(String str, Throwable th) {
        if (!isNullOrSpaces(str)) {
            int i = 0;
            while (th != null) {
                Class<?> cls = th.getClass();
                str = str.replace(cls.getName(), simpleClassName(cls));
                i++;
                if (i == 65536) {
                    break;
                }
                th = th.getCause();
            }
        }
        return str;
    }

    private static String simpleClassName(Class<?> cls) {
        try {
            return cls.getSimpleName();
        } catch (InternalError unused) {
            return simpleClassName(cls.getName());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r2.lastIndexOf(46);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String simpleFileName(java.lang.String r2) {
        /*
            if (r2 == 0) goto L_0x0010
            r0 = 46
            int r0 = r2.lastIndexOf(r0)
            r1 = -1
            if (r0 <= r1) goto L_0x0010
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
        L_0x0010:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.logging.CompactFormatter.simpleFileName(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: protected */
    public Throwable apply(Throwable th) {
        return SeverityComparator.getInstance().apply(th);
    }

    public String format(LogRecord logRecord) {
        Locale locale;
        ResourceBundle resourceBundle = logRecord.getResourceBundle();
        if (resourceBundle == null) {
            locale = null;
        } else {
            locale = resourceBundle.getLocale();
        }
        String formatMessage = formatMessage(logRecord);
        String formatThrown = formatThrown(logRecord);
        String formatError = formatError(logRecord);
        Object[] objArr = {formatZonedDateTime(logRecord), formatSource(logRecord), formatLoggerName(logRecord), formatLevel(logRecord), formatMessage, formatThrown, new Alternate(formatMessage, formatThrown), new Alternate(formatThrown, formatMessage), Long.valueOf(logRecord.getSequenceNumber()), formatThreadID(logRecord), formatError, new Alternate(formatMessage, formatError), new Alternate(formatError, formatMessage), formatBackTrace(logRecord), logRecord.getResourceBundleName(), logRecord.getMessage()};
        if (locale == null) {
            return String.format(this.fmt, objArr);
        }
        return String.format(locale, this.fmt, objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        r1 = r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String formatBackTrace(java.util.logging.LogRecord r7) {
        /*
            r6 = this;
            java.lang.Throwable r7 = r7.getThrown()
            if (r7 == 0) goto L_0x004d
            java.lang.Throwable r0 = r6.apply(r7)
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.String r1 = r6.findAndFormat(r0)
            boolean r2 = isNullOrSpaces(r1)
            if (r2 == 0) goto L_0x004f
            r2 = 0
            r3 = 0
        L_0x001a:
            if (r7 == 0) goto L_0x003d
            java.lang.StackTraceElement[] r1 = r7.getStackTrace()
            java.lang.String r4 = r6.findAndFormat(r1)
            boolean r5 = isNullOrSpaces(r4)
            if (r5 != 0) goto L_0x002c
        L_0x002a:
            r1 = r4
            goto L_0x003d
        L_0x002c:
            int r5 = r0.length
            if (r5 != 0) goto L_0x0030
            r0 = r1
        L_0x0030:
            int r3 = r3 + 1
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r3 != r1) goto L_0x0037
            goto L_0x002a
        L_0x0037:
            java.lang.Throwable r7 = r7.getCause()
            r1 = r4
            goto L_0x001a
        L_0x003d:
            boolean r7 = isNullOrSpaces(r1)
            if (r7 == 0) goto L_0x004f
            int r7 = r0.length
            if (r7 == 0) goto L_0x004f
            r7 = r0[r2]
            java.lang.String r1 = r6.formatStackTraceElement(r7)
            goto L_0x004f
        L_0x004d:
            java.lang.String r1 = ""
        L_0x004f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.logging.CompactFormatter.formatBackTrace(java.util.logging.LogRecord):java.lang.String");
    }

    public String formatError(LogRecord logRecord) {
        return formatMessage(logRecord.getThrown());
    }

    public String formatLevel(LogRecord logRecord) {
        return logRecord.getLevel().getLocalizedName();
    }

    public String formatLoggerName(LogRecord logRecord) {
        return simpleClassName(logRecord.getLoggerName());
    }

    public String formatMessage(LogRecord logRecord) {
        return replaceClassName(replaceClassName(super.formatMessage(logRecord), logRecord.getThrown()), logRecord.getParameters());
    }

    public String formatSource(LogRecord logRecord) {
        String sourceClassName = logRecord.getSourceClassName();
        if (sourceClassName == null) {
            return simpleClassName(logRecord.getLoggerName());
        }
        if (logRecord.getSourceMethodName() == null) {
            return simpleClassName(sourceClassName);
        }
        return simpleClassName(sourceClassName) + " " + logRecord.getSourceMethodName();
    }

    public Number formatThreadID(LogRecord logRecord) {
        Long longThreadID = LogManagerProperties.getLongThreadID(logRecord);
        return longThreadID == null ? Long.valueOf(((long) logRecord.getThreadID()) & UIDFolder.MAXUID) : longThreadID;
    }

    public String formatThrown(LogRecord logRecord) {
        Throwable thrown = logRecord.getThrown();
        String str = "";
        if (thrown == null) {
            return str;
        }
        String formatBackTrace = formatBackTrace(logRecord);
        StringBuilder sb = new StringBuilder();
        sb.append(formatMessage(thrown));
        if (!isNullOrSpaces(formatBackTrace)) {
            str = ' ' + formatBackTrace;
        }
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public boolean ignore(StackTraceElement stackTraceElement) {
        return isUnknown(stackTraceElement) || defaultIgnore(stackTraceElement);
    }

    /* access modifiers changed from: protected */
    public String toAlternate(String str) {
        if (str != null) {
            return str.replaceAll("[\\x00-\\x1F\\x7F]+", "");
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        if (r2 <= -1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        if (r2 >= r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r4 >= r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        if (r4 <= r2) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return r7.substring(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String simpleClassName(java.lang.String r7) {
        /*
            if (r7 == 0) goto L_0x0047
            r0 = 0
            r1 = -1
            r2 = -1
            r3 = -1
            r4 = -1
        L_0x0007:
            int r5 = r7.length()
            if (r0 >= r5) goto L_0x0036
            int r5 = r7.codePointAt(r0)
            boolean r6 = java.lang.Character.isJavaIdentifierPart(r5)
            if (r6 != 0) goto L_0x002b
            r6 = 46
            if (r5 != r6) goto L_0x0025
            int r3 = r2 + 1
            if (r3 == r0) goto L_0x0024
            if (r3 == r4) goto L_0x0024
            r3 = r2
            r2 = r0
            goto L_0x0030
        L_0x0024:
            return r7
        L_0x0025:
            int r5 = r2 + 1
            if (r5 != r0) goto L_0x0036
            r2 = r3
            goto L_0x0036
        L_0x002b:
            r6 = 36
            if (r5 != r6) goto L_0x0030
            r4 = r0
        L_0x0030:
            int r5 = java.lang.Character.charCount(r5)
            int r0 = r0 + r5
            goto L_0x0007
        L_0x0036:
            if (r2 <= r1) goto L_0x0047
            int r2 = r2 + 1
            if (r2 >= r0) goto L_0x0047
            int r4 = r4 + 1
            if (r4 >= r0) goto L_0x0047
            if (r4 <= r2) goto L_0x0043
            r2 = r4
        L_0x0043:
            java.lang.String r7 = r7.substring(r2)
        L_0x0047:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.logging.CompactFormatter.simpleClassName(java.lang.String):java.lang.String");
    }

    public CompactFormatter(String str) {
        this.fmt = str == null ? initFormat(getClass().getName()) : str;
    }

    public String formatMessage(Throwable th) {
        String str;
        if (th == null) {
            return "";
        }
        Throwable apply = apply(th);
        String localizedMessage = apply.getLocalizedMessage();
        String th2 = apply.toString();
        String simpleClassName = simpleClassName(apply.getClass());
        if (isNullOrSpaces(localizedMessage)) {
            str = replaceClassName(simpleClassName(th2), th);
        } else if (!th2.contains(localizedMessage)) {
            str = replaceClassName(simpleClassName(th2) + ": " + localizedMessage, th);
        } else if (th2.startsWith(apply.getClass().getName()) || th2.startsWith(simpleClassName)) {
            str = replaceClassName(localizedMessage, th);
        } else {
            str = replaceClassName(simpleClassName(th2), th);
        }
        if (str.contains(simpleClassName)) {
            return str;
        }
        return simpleClassName + ": " + str;
    }

    private static String replaceClassName(String str, Object[] objArr) {
        if (!isNullOrSpaces(str) && objArr != null) {
            for (Object obj : objArr) {
                if (obj != null) {
                    Class<?> cls = obj.getClass();
                    str = str.replace(cls.getName(), simpleClassName(cls));
                }
            }
        }
        return str;
    }
}
