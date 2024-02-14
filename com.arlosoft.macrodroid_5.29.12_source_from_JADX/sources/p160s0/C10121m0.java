package p160s0;

import com.arlosoft.macrodroid.action.ClearLogAction;
import com.arlosoft.macrodroid.action.ExportLogAction;
import com.arlosoft.macrodroid.action.JsonParseAction;
import com.arlosoft.macrodroid.action.NotificationAction;
import com.arlosoft.macrodroid.action.ProOnlyAction;
import com.arlosoft.macrodroid.action.ReadScreenContentsAction;
import com.arlosoft.macrodroid.action.SendEmailAction;
import com.arlosoft.macrodroid.action.SetVariableAction;
import com.arlosoft.macrodroid.action.ShellScriptAction;
import com.arlosoft.macrodroid.action.services.SendEmailService;
import com.arlosoft.macrodroid.action.services.UIInteractionAccessibilityService;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.cloudmessaging.MacroDroidFirebaseMessagingService;
import com.arlosoft.macrodroid.constraint.GeofenceConstraint;
import com.arlosoft.macrodroid.drawer.MacroDroidDrawer;
import com.arlosoft.macrodroid.helper.receiver.HelperResultsReceiver;
import com.arlosoft.macrodroid.logcat.LogcatButtonService;
import com.arlosoft.macrodroid.triggers.GeofenceTrigger;
import com.arlosoft.macrodroid.triggers.MediaButtonV2Trigger;
import com.arlosoft.macrodroid.triggers.WebHookTrigger;

/* renamed from: s0.m0 */
/* compiled from: AppComponent.kt */
public interface C10121m0 {
    /* renamed from: a */
    void mo38296a(SendEmailAction sendEmailAction);

    /* renamed from: b */
    void mo38297b(MacroDroidFirebaseMessagingService macroDroidFirebaseMessagingService);

    /* renamed from: c */
    void mo38298c(MediaButtonV2Trigger mediaButtonV2Trigger);

    /* renamed from: d */
    void mo38299d(ExportLogAction exportLogAction);

    /* renamed from: e */
    void mo38300e(GeofenceTrigger geofenceTrigger);

    /* renamed from: f */
    void mo38301f(WebHookTrigger webHookTrigger);

    /* renamed from: g */
    void mo38302g(SetVariableAction setVariableAction);

    /* renamed from: h */
    void mo38303h(JsonParseAction jsonParseAction);

    /* renamed from: i */
    void mo38304i(HelperResultsReceiver helperResultsReceiver);

    /* renamed from: j */
    void mo38305j(ProOnlyAction proOnlyAction);

    /* renamed from: k */
    void mo38306k(GeofenceConstraint geofenceConstraint);

    /* renamed from: l */
    void mo38307l(ClearLogAction clearLogAction);

    /* renamed from: m */
    void mo38308m(MacroDroidDrawer macroDroidDrawer);

    /* renamed from: n */
    void mo38309n(ReadScreenContentsAction readScreenContentsAction);

    /* renamed from: o */
    void mo38310o(LogcatButtonService logcatButtonService);

    /* renamed from: p */
    void mo38311p(NotificationAction notificationAction);

    /* renamed from: q */
    void mo38312q(UIInteractionAccessibilityService uIInteractionAccessibilityService);

    /* renamed from: r */
    void mo38313r(MacroDroidApplication macroDroidApplication);

    /* renamed from: s */
    void mo38314s(SendEmailService sendEmailService);

    /* renamed from: t */
    void mo38315t(ShellScriptAction shellScriptAction);
}
