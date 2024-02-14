package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;

public class ShortcutTriggerReceiver extends BroadcastReceiver {
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0062, code lost:
        r9 = r4.getTriggerListWithAwaitingActions().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006e, code lost:
        if (r9.hasNext() == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0070, code lost:
        r0 = r9.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        if (r10 == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        if ((r0 instanceof com.arlosoft.macrodroid.triggers.GoogleAssistantTrigger) == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        r4.setTriggerThatInvoked(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0082, code lost:
        if ((r0 instanceof com.arlosoft.macrodroid.triggers.ShortcutTrigger) == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
        r4.setTriggerThatInvoked(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008f, code lost:
        if (r4.canInvoke(r4.getTriggerContextInfo()) == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0091, code lost:
        r2.add(r4);
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0094 A[EDGE_INSN: B:34:0x0094->B:27:0x0094 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            java.lang.String r9 = "com.arlosoft.macrodroid.MACRO_NAME"
            java.lang.String r9 = r10.getStringExtra(r9)
            java.lang.String r0 = "guid"
            r1 = 0
            long r0 = r10.getLongExtra(r0, r1)
            java.lang.String r2 = "is_assistant"
            r3 = 0
            boolean r10 = r10.getBooleanExtra(r2, r3)
            if (r9 != 0) goto L_0x0018
            return
        L_0x0018:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.arlosoft.macrodroid.macro.n r3 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
            java.util.List r3 = r3.mo29679I()
            java.util.Iterator r3 = r3.iterator()
        L_0x0029:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0094
            java.lang.Object r4 = r3.next()
            com.arlosoft.macrodroid.macro.Macro r4 = (com.arlosoft.macrodroid.macro.Macro) r4
            long r5 = r4.getGUID()
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x004f
            java.lang.String r5 = r4.getName()
            java.lang.String r5 = r5.toLowerCase()
            java.lang.String r6 = r9.toLowerCase()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0029
        L_0x004f:
            if (r10 == 0) goto L_0x005a
            com.arlosoft.macrodroid.triggers.GoogleAssistantTrigger r9 = new com.arlosoft.macrodroid.triggers.GoogleAssistantTrigger
            r9.<init>()
            r4.setTriggerThatInvoked(r9)
            goto L_0x0062
        L_0x005a:
            com.arlosoft.macrodroid.triggers.ShortcutTrigger r9 = new com.arlosoft.macrodroid.triggers.ShortcutTrigger
            r9.<init>()
            r4.setTriggerThatInvoked(r9)
        L_0x0062:
            java.util.ArrayList r9 = r4.getTriggerListWithAwaitingActions()
            java.util.Iterator r9 = r9.iterator()
        L_0x006a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0087
            java.lang.Object r0 = r9.next()
            com.arlosoft.macrodroid.triggers.Trigger r0 = (com.arlosoft.macrodroid.triggers.Trigger) r0
            if (r10 == 0) goto L_0x0080
            boolean r1 = r0 instanceof com.arlosoft.macrodroid.triggers.GoogleAssistantTrigger
            if (r1 == 0) goto L_0x006a
            r4.setTriggerThatInvoked(r0)
            goto L_0x0087
        L_0x0080:
            boolean r1 = r0 instanceof com.arlosoft.macrodroid.triggers.ShortcutTrigger
            if (r1 == 0) goto L_0x006a
            r4.setTriggerThatInvoked(r0)
        L_0x0087:
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r9 = r4.getTriggerContextInfo()
            boolean r9 = r4.canInvoke(r9)
            if (r9 == 0) goto L_0x0094
            r2.add(r4)
        L_0x0094:
            java.util.Iterator r9 = r2.iterator()
        L_0x0098:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00ac
            java.lang.Object r10 = r9.next()
            com.arlosoft.macrodroid.macro.Macro r10 = (com.arlosoft.macrodroid.macro.Macro) r10
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r0 = r10.getTriggerContextInfo()
            r10.invokeActions(r0)
            goto L_0x0098
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.receivers.ShortcutTriggerReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
