package twitter4j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.commons.logging.impl.LogFactoryImpl;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationContext;

public abstract class Logger {
    private static final LoggerFactory LOGGER_FACTORY;
    private static final String LOGGER_FACTORY_IMPLEMENTATION = "twitter4j.loggerFactory";

    static {
        String property = System.getProperty(LOGGER_FACTORY_IMPLEMENTATION);
        LoggerFactory loggerFactoryIfAvailable = property != null ? getLoggerFactoryIfAvailable(property, property) : null;
        Configuration instance = ConfigurationContext.getInstance();
        String loggerFactory = instance.getLoggerFactory();
        if (loggerFactory != null) {
            loggerFactoryIfAvailable = getLoggerFactoryIfAvailable(loggerFactory, loggerFactory);
        }
        if (loggerFactoryIfAvailable == null) {
            loggerFactoryIfAvailable = getLoggerFactoryIfAvailable("org.slf4j.impl.StaticLoggerBinder", "twitter4j.SLF4JLoggerFactory");
        }
        if (loggerFactoryIfAvailable == null) {
            loggerFactoryIfAvailable = getLoggerFactoryIfAvailable(LogFactoryImpl.LOG_PROPERTY, "twitter4j.CommonsLoggingLoggerFactory");
        }
        if (loggerFactoryIfAvailable == null) {
            loggerFactoryIfAvailable = getLoggerFactoryIfAvailable("org.apache.log4j.Logger", "twitter4j.Log4JLoggerFactory");
        }
        if (loggerFactoryIfAvailable == null) {
            loggerFactoryIfAvailable = getLoggerFactoryIfAvailable("com.google.appengine.api.urlfetch.URLFetchService", "twitter4j.JULLoggerFactory");
        }
        if (loggerFactoryIfAvailable == null) {
            loggerFactoryIfAvailable = new StdOutLoggerFactory();
        }
        LOGGER_FACTORY = loggerFactoryIfAvailable;
        try {
            Method method = instance.getClass().getMethod("dumpConfiguration", new Class[0]);
            method.setAccessible(true);
            method.invoke(instance, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    public static Logger getLogger(Class<?> cls) {
        return LOGGER_FACTORY.getLogger(cls);
    }

    private static LoggerFactory getLoggerFactoryIfAvailable(String str, String str2) {
        try {
            Class.forName(str);
            return (LoggerFactory) Class.forName(str2).newInstance();
        } catch (ClassNotFoundException | SecurityException unused) {
            return null;
        } catch (InstantiationException e) {
            throw new AssertionError(e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    public abstract void debug(String str);

    public abstract void debug(String str, String str2);

    public abstract void error(String str);

    public abstract void error(String str, Throwable th);

    public abstract void info(String str);

    public abstract void info(String str, String str2);

    public abstract boolean isDebugEnabled();

    public abstract boolean isErrorEnabled();

    public abstract boolean isInfoEnabled();

    public abstract boolean isWarnEnabled();

    public abstract void warn(String str);

    public abstract void warn(String str, String str2);
}
