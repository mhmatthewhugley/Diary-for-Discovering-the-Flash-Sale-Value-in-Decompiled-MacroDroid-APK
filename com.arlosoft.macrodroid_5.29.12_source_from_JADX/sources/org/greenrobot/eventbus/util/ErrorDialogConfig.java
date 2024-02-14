package org.greenrobot.eventbus.util;

import android.content.res.Resources;
import org.greenrobot.eventbus.EventBus;

public class ErrorDialogConfig {
    int defaultDialogIconId;
    final int defaultErrorMsgId;
    Class<?> defaultEventTypeOnDialogClosed;
    final int defaultTitleId;
    EventBus eventBus;
    boolean logExceptions = true;
    final ExceptionToResourceMapping mapping;
    final Resources resources;
    String tagForLoggingExceptions;

    public ErrorDialogConfig(Resources resources2, int i, int i2) {
        this.resources = resources2;
        this.defaultTitleId = i;
        this.defaultErrorMsgId = i2;
        this.mapping = new ExceptionToResourceMapping();
    }

    public ErrorDialogConfig addMapping(Class<? extends Throwable> cls, int i) {
        this.mapping.addMapping(cls, i);
        return this;
    }

    public void disableExceptionLogging() {
        this.logExceptions = false;
    }

    /* access modifiers changed from: package-private */
    public EventBus getEventBus() {
        EventBus eventBus2 = this.eventBus;
        return eventBus2 != null ? eventBus2 : EventBus.getDefault();
    }

    public int getMessageIdForThrowable(Throwable th) {
        Integer mapThrowable = this.mapping.mapThrowable(th);
        if (mapThrowable != null) {
            return mapThrowable.intValue();
        }
        String str = EventBus.TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("No specific message ressource ID found for ");
        sb.append(th);
        return this.defaultErrorMsgId;
    }

    public void setDefaultDialogIconId(int i) {
        this.defaultDialogIconId = i;
    }

    public void setDefaultEventTypeOnDialogClosed(Class<?> cls) {
        this.defaultEventTypeOnDialogClosed = cls;
    }

    public void setEventBus(EventBus eventBus2) {
        this.eventBus = eventBus2;
    }

    public void setTagForLoggingExceptions(String str) {
        this.tagForLoggingExceptions = str;
    }
}