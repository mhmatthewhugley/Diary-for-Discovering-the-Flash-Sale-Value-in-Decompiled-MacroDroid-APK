package twitter4j;

import p339ne.C15790b;

final class SLF4JLogger extends Logger {
    private final C15790b LOGGER;

    SLF4JLogger(C15790b bVar) {
        this.LOGGER = bVar;
    }

    public void debug(String str) {
        this.LOGGER.mo75503b(str);
    }

    public void error(String str) {
        this.LOGGER.mo75505d(str);
    }

    public void info(String str) {
        this.LOGGER.mo75507f(str);
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
        this.LOGGER.mo75508g(str);
    }

    public void debug(String str, String str2) {
        C15790b bVar = this.LOGGER;
        bVar.mo75503b(str + str2);
    }

    public void error(String str, Throwable th) {
        this.LOGGER.mo75502a(str, th);
    }

    public void info(String str, String str2) {
        C15790b bVar = this.LOGGER;
        bVar.mo75507f(str + str2);
    }

    public void warn(String str, String str2) {
        C15790b bVar = this.LOGGER;
        bVar.mo75508g(str + str2);
    }
}
