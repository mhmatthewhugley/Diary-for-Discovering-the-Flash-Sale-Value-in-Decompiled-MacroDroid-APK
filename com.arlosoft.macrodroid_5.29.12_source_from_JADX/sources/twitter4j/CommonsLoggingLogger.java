package twitter4j;

import org.apache.commons.logging.Log;

final class CommonsLoggingLogger extends Logger {
    private final Log LOGGER;

    CommonsLoggingLogger(Log log) {
        this.LOGGER = log;
    }

    public void debug(String str) {
        this.LOGGER.debug(str);
    }

    public void error(String str) {
        this.LOGGER.error(str);
    }

    public void info(String str) {
        this.LOGGER.info(str);
    }

    public boolean isDebugEnabled() {
        return this.LOGGER.isDebugEnabled();
    }

    public boolean isErrorEnabled() {
        return this.LOGGER.isErrorEnabled();
    }

    public boolean isInfoEnabled() {
        return this.LOGGER.isInfoEnabled();
    }

    public boolean isWarnEnabled() {
        return this.LOGGER.isWarnEnabled();
    }

    public void warn(String str) {
        this.LOGGER.warn(str);
    }

    public void debug(String str, String str2) {
        Log log = this.LOGGER;
        log.debug(str + str2);
    }

    public void error(String str, Throwable th) {
        this.LOGGER.error(str, th);
    }

    public void info(String str, String str2) {
        Log log = this.LOGGER;
        log.info(str + str2);
    }

    public void warn(String str, String str2) {
        Log log = this.LOGGER;
        log.warn(str + str2);
    }
}
