package fr.mrqsdf.bbmodelreader.data;

public final class OutlinerGroupRef implements OutlinerChild {

    private final Outliner group;

    public OutlinerGroupRef(Outliner group) {
        this.group = group;
    }

    public Outliner getGroup() {
        return group;
    }
}

