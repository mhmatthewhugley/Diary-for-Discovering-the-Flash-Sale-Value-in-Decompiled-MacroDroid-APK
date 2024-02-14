package com.arlosoft.macrodroid.utils.sparkpostutil;

import java.util.ArrayList;

public class SparkPostEmailMessage {
    private SparkPostContent content;
    private ArrayList<SparkPostRecipient> recipients;

    public SparkPostEmailMessage(ArrayList<SparkPostRecipient> arrayList, SparkPostContent sparkPostContent) {
        this.recipients = arrayList;
        this.content = sparkPostContent;
    }
}
