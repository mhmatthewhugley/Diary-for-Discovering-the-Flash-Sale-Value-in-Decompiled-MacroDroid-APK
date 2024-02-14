package com.sun.mail.util.logging;

import java.lang.reflect.UndeclaredThrowableException;
import java.text.MessageFormat;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class CollectorFormatter extends Formatter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long INIT_TIME = System.currentTimeMillis();
    private final Comparator<? super LogRecord> comparator;
    private long count;
    private final String fmt;
    private final Formatter formatter;
    private long generation = 1;
    private LogRecord last;
    private long maxMillis = Long.MIN_VALUE;
    private long minMillis = INIT_TIME;
    private long thrown;

    static {
        Class<CollectorFormatter> cls = CollectorFormatter.class;
    }

    public CollectorFormatter() {
        String name = getClass().getName();
        this.fmt = initFormat(name);
        this.formatter = initFormatter(name);
        this.comparator = initComparator(name);
    }

    private synchronized boolean accept(LogRecord logRecord, LogRecord logRecord2) {
        long millis = logRecord2.getMillis();
        Throwable thrown2 = logRecord2.getThrown();
        if (this.last != logRecord) {
            return false;
        }
        long j = this.count + 1;
        this.count = j;
        if (j != 1) {
            this.minMillis = Math.min(this.minMillis, millis);
        } else {
            this.minMillis = millis;
        }
        this.maxMillis = Math.max(this.maxMillis, millis);
        if (thrown2 != null) {
            this.thrown++;
        }
        return true;
    }

    private synchronized boolean acceptAndUpdate(LogRecord logRecord, LogRecord logRecord2) {
        if (!accept(logRecord, logRecord2)) {
            return false;
        }
        this.last = logRecord2;
        return true;
    }

    private String formatRecord(Handler handler, boolean z) {
        LogRecord logRecord;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long currentTimeMillis;
        String str;
        String str2;
        String str3;
        long j6;
        MessageFormat messageFormat;
        ResourceBundle resourceBundle;
        Handler handler2 = handler;
        synchronized (this) {
            logRecord = this.last;
            j = this.count;
            j2 = this.generation;
            j3 = this.thrown;
            j4 = this.minMillis;
            j5 = this.maxMillis;
            currentTimeMillis = System.currentTimeMillis();
            if (j == 0) {
                j5 = currentTimeMillis;
            }
            if (z) {
                reset(j5);
            }
        }
        Formatter formatter2 = this.formatter;
        if (formatter2 != null) {
            synchronized (formatter2) {
                str2 = formatter2.getHead(handler2);
                str = logRecord != null ? formatter2.format(logRecord) : "";
                str3 = formatter2.getTail(handler2);
            }
        } else {
            str2 = "";
            str = logRecord != null ? formatMessage(logRecord) : "";
            str3 = "";
        }
        String str4 = str2;
        long j7 = j2;
        String str5 = str;
        long j8 = j7;
        Locale locale = null;
        if (!(logRecord == null || (resourceBundle = logRecord.getResourceBundle()) == null)) {
            locale = resourceBundle.getLocale();
        }
        if (locale == null) {
            messageFormat = new MessageFormat(this.fmt);
            j6 = currentTimeMillis;
        } else {
            j6 = currentTimeMillis;
            messageFormat = new MessageFormat(this.fmt, locale);
        }
        long j9 = INIT_TIME;
        return messageFormat.format(new Object[]{finish(str4), finish(str5), finish(str3), Long.valueOf(j), Long.valueOf(j - 1), Long.valueOf(j3), Long.valueOf(j - j3), Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j5 - j4), Long.valueOf(j9), Long.valueOf(j6), Long.valueOf(j6 - j9), Long.valueOf(j8)});
    }

    private Comparator<? super LogRecord> initComparator(String str) {
        String fromLogManager = LogManagerProperties.fromLogManager(str.concat(".comparator"));
        String fromLogManager2 = LogManagerProperties.fromLogManager(str.concat(".comparator.reverse"));
        if (fromLogManager != null) {
            try {
                if (fromLogManager.length() != 0) {
                    if (!"null".equalsIgnoreCase(fromLogManager)) {
                        Comparator<? super LogRecord> newComparator = LogManagerProperties.newComparator(fromLogManager);
                        if (Boolean.parseBoolean(fromLogManager2)) {
                            return LogManagerProperties.reverseOrder(newComparator);
                        }
                        return newComparator;
                    } else if (fromLogManager2 == null) {
                        return null;
                    } else {
                        throw new IllegalArgumentException("No comparator to reverse.");
                    }
                }
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new UndeclaredThrowableException(e2);
            }
        }
        if (fromLogManager2 == null) {
            return Comparator.class.cast(SeverityComparator.getInstance());
        }
        throw new IllegalArgumentException("No comparator to reverse.");
    }

    private String initFormat(String str) {
        String fromLogManager = LogManagerProperties.fromLogManager(str.concat(".format"));
        return (fromLogManager == null || fromLogManager.length() == 0) ? "{0}{1}{2}{4,choice,-1#|0#|0<... {4,number,integer} more}\n" : fromLogManager;
    }

    private Formatter initFormatter(String str) {
        String fromLogManager = LogManagerProperties.fromLogManager(str.concat(".formatter"));
        if (fromLogManager == null || fromLogManager.length() == 0) {
            return Formatter.class.cast(new CompactFormatter());
        }
        if ("null".equalsIgnoreCase(fromLogManager)) {
            return null;
        }
        try {
            return LogManagerProperties.newFormatter(fromLogManager);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new UndeclaredThrowableException(e2);
        }
    }

    private synchronized LogRecord peek() {
        return this.last;
    }

    private synchronized void reset(long j) {
        if (this.last != null) {
            this.last = null;
            this.generation++;
        }
        this.count = 0;
        this.thrown = 0;
        this.minMillis = j;
        this.maxMillis = Long.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    public LogRecord apply(LogRecord logRecord, LogRecord logRecord2) {
        if (logRecord == null || logRecord2 == null) {
            throw null;
        }
        Comparator<? super LogRecord> comparator2 = this.comparator;
        if (comparator2 != null) {
            return comparator2.compare(logRecord, logRecord2) >= 0 ? logRecord : logRecord2;
        }
        return logRecord2;
    }

    /* access modifiers changed from: protected */
    public String finish(String str) {
        return str.trim();
    }

    public String format(LogRecord logRecord) {
        boolean z;
        Objects.requireNonNull(logRecord);
        do {
            LogRecord peek = peek();
            LogRecord apply = apply(peek != null ? peek : logRecord, logRecord);
            if (peek != apply) {
                apply.getSourceMethodName();
                z = acceptAndUpdate(peek, apply);
                continue;
            } else {
                z = accept(peek, logRecord);
                continue;
            }
        } while (!z);
        return "";
    }

    public String getTail(Handler handler) {
        super.getTail(handler);
        return formatRecord(handler, true);
    }

    public String toString() {
        try {
            return formatRecord((Handler) null, false);
        } catch (RuntimeException unused) {
            return super.toString();
        }
    }

    public CollectorFormatter(String str) {
        String name = getClass().getName();
        this.fmt = str == null ? initFormat(name) : str;
        this.formatter = initFormatter(name);
        this.comparator = initComparator(name);
    }

    public CollectorFormatter(String str, Formatter formatter2, Comparator<? super LogRecord> comparator2) {
        this.fmt = str == null ? initFormat(getClass().getName()) : str;
        this.formatter = formatter2;
        this.comparator = comparator2;
    }
}
