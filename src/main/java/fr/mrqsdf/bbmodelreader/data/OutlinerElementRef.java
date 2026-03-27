package fr.mrqsdf.bbmodelreader.data;

public final class OutlinerElementRef implements OutlinerChild {

    private final String uuid;

    public OutlinerElementRef(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }
}

