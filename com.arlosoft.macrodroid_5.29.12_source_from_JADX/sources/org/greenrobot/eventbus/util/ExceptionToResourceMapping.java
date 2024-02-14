package org.greenrobot.eventbus.util;

import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;

public class ExceptionToResourceMapping {
    public final Map<Class<? extends Throwable>, Integer> throwableToMsgIdMap = new HashMap();

    public ExceptionToResourceMapping addMapping(Class<? extends Throwable> cls, int i) {
        this.throwableToMsgIdMap.put(cls, Integer.valueOf(i));
        return this;
    }

    public Integer mapThrowable(Throwable th) {
        int i = 20;
        Throwable th2 = th;
        do {
            Integer mapThrowableFlat = mapThrowableFlat(th2);
            if (mapThrowableFlat != null) {
                return mapThrowableFlat;
            }
            th2 = th2.getCause();
            i--;
            if (i <= 0 || th2 == th) {
                String str = EventBus.TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("No specific message ressource ID found for ");
                sb.append(th);
            }
        } while (th2 != null);
        String str2 = EventBus.TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("No specific message ressource ID found for ");
        sb2.append(th);
        return null;
    }

    /* access modifiers changed from: protected */
    public Integer mapThrowableFlat(Throwable th) {
        Class<?> cls = th.getClass();
        Integer num = this.throwableToMsgIdMap.get(cls);
        if (num == null) {
            Class cls2 = null;
            for (Map.Entry next : this.throwableToMsgIdMap.entrySet()) {
                Class cls3 = (Class) next.getKey();
                if (cls3.isAssignableFrom(cls) && (cls2 == null || cls2.isAssignableFrom(cls3))) {
                    num = (Integer) next.getValue();
                    cls2 = cls3;
                }
            }
        }
        return num;
    }
}
