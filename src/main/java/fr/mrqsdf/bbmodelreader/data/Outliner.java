package fr.mrqsdf.bbmodelreader.data;

public class Outliner {

    private String name;
    private float[] origin;
    private Float color;
    private String uuid;
    private boolean export;
    private boolean mirror_uv;
    private boolean isOpen;
    private boolean locked;
    private boolean visibility;
    private Float autouv;
    private String[] children;

    public String getName() {
        return name;
    }

    public float[] getOrigin() {
        return origin;
    }

    public Float getColor() {
        return color;
    }

    public String getUuid() {
        return uuid;
    }

    public boolean isExport() {
        return export;
    }

    public boolean isMirror_uv() {
        return mirror_uv;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public boolean isLocked() {
        return locked;
    }

    public boolean isVisibility() {
        return visibility;
    }

    public Float getAutouv() {
        return autouv;
    }

    public String[] getChildren() {
        return children;
    }
}
