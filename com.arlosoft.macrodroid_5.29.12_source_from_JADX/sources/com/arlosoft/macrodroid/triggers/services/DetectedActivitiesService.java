package com.arlosoft.macrodroid.triggers.services;

import android.app.IntentService;
import android.content.Intent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.ActivityRecognitionTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DetectedActivitiesService extends IntentService {

    /* renamed from: a */
    private static final String[] f14430a = {"In vehicle", "On Bicycle", "On Foot", "Still", "Unknown", "Tilting", "?????", "Walking", "Running"};

    /* renamed from: c */
    private static final Map<Trigger, DetectedActivity> f14431c = new HashMap();

    public DetectedActivitiesService() {
        super("activity-detection-service");
    }

    /* renamed from: a */
    public static void m24105a(Trigger trigger) {
        f14431c.remove(trigger);
    }

    /* renamed from: b */
    private DetectedActivity m24106b(List<DetectedActivity> list) {
        DetectedActivity detectedActivity = null;
        int i = 0;
        for (DetectedActivity next : list) {
            if ((next.mo54147m2() == 8 || next.mo54147m2() == 7) && next.mo54146l2() > i) {
                i = next.mo54146l2();
                detectedActivity = next;
            }
        }
        return detectedActivity;
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        DetectedActivity detectedActivity;
        HashMap hashMap = new HashMap();
        if (ActivityRecognitionResult.m64628n2(intent)) {
            List<DetectedActivity> m2 = ActivityRecognitionResult.m64627l2(intent).mo54120m2();
            for (DetectedActivity next : m2) {
                hashMap.put(Integer.valueOf(next.mo54147m2()), next);
            }
            Iterator<DetectedActivity> it = m2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    detectedActivity = null;
                    break;
                }
                detectedActivity = it.next();
                if (detectedActivity.mo54147m2() != 5 && detectedActivity.mo54147m2() != 4) {
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (DetectedActivity next2 : m2) {
                if (next2.mo54147m2() != 2) {
                    int m22 = next2.mo54147m2();
                    String[] strArr = f14430a;
                    if (m22 < strArr.length) {
                        sb.append(strArr[next2.mo54147m2()]);
                        sb.append(" ");
                        sb.append(next2.mo54146l2());
                        sb.append("%,");
                    }
                }
            }
            C4878b.m18879r(sb.substring(0, sb.length() - 1) + "]");
            if (detectedActivity != null) {
                C4878b.m18864c("mostProbableActivity = " + detectedActivity);
                if (detectedActivity.mo54147m2() == 2) {
                    detectedActivity = m24106b(m2);
                    if (detectedActivity != null) {
                        C4878b.m18864c("ON_FOOT mostProbableActivity = " + detectedActivity);
                    } else {
                        C4878b.m18882u("On foot - but not walking or running?");
                        return;
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Macro next3 : C4934n.m18998M().mo29679I()) {
                    Iterator<Trigger> it2 = next3.getTriggerListWithAwaitingActions().iterator();
                    while (it2.hasNext()) {
                        Trigger next4 = it2.next();
                        if (next4 instanceof ActivityRecognitionTrigger) {
                            ActivityRecognitionTrigger activityRecognitionTrigger = (ActivityRecognitionTrigger) next4;
                            Map<Trigger, DetectedActivity> map = f14431c;
                            DetectedActivity detectedActivity2 = map.get(next4);
                            if (activityRecognitionTrigger.mo30889r3()) {
                                DetectedActivity detectedActivity3 = (DetectedActivity) hashMap.get(Integer.valueOf(activityRecognitionTrigger.mo30887p3()));
                                if (detectedActivity3 != null && detectedActivity3.mo54146l2() >= activityRecognitionTrigger.mo30888q3()) {
                                    map.put(next4, (Object) null);
                                } else if ((detectedActivity2 == null || detectedActivity2.mo54147m2() != activityRecognitionTrigger.mo30887p3()) && next4.mo31374R2()) {
                                    next3.setTriggerThatInvoked(next4);
                                    if (next3.canInvoke(next3.getTriggerContextInfo())) {
                                        arrayList.add(next3);
                                    }
                                    map.put(next4, detectedActivity3);
                                }
                            } else if (detectedActivity2 == null || detectedActivity2.mo54147m2() != detectedActivity.mo54147m2()) {
                                if (activityRecognitionTrigger.mo30887p3() != detectedActivity.mo54147m2()) {
                                    C4878b.m18864c("Saving most probable activity for trigger (" + next4.mo24674U0() + "): " + detectedActivity);
                                    map.put(next4, detectedActivity);
                                } else if (detectedActivity.mo54146l2() > activityRecognitionTrigger.mo30888q3() && next4.mo31374R2()) {
                                    C4878b.m18864c("lastRecordedType = " + detectedActivity2 + ", mostProbableActivity = " + detectedActivity);
                                    next3.setTriggerThatInvoked(next4);
                                    if (next3.canInvoke(next3.getTriggerContextInfo())) {
                                        arrayList.add(next3);
                                    }
                                    map.put(next4, detectedActivity);
                                }
                            }
                        }
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Macro macro = (Macro) it3.next();
                    macro.invokeActions(macro.getTriggerContextInfo());
                }
            }
        }
    }
}
