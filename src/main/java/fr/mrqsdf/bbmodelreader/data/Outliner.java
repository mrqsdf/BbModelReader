package fr.mrqsdf.bbmodelreader.data;

import java.util.List;

public class Outliner {

    private String name;
    private float[] origin;
    private Float color;
    private String uuid;
    private Boolean export;
    private Boolean mirror_uv;
    private Boolean isOpen;
    private Boolean locked;
    private Boolean visibility;
    private Float autouv;
    private List<OutlinerChild> children;

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
        return export != null && export;
    }

    public boolean isMirror_uv() {
        return mirror_uv != null && mirror_uv;
    }

    public boolean isOpen() {
        return isOpen != null && isOpen;
    }

    public boolean isLocked() {
        return locked != null && locked;
    }

    public boolean isVisibility() {
        return visibility != null && visibility;
    }

    public Float getAutouv() {
        return autouv;
    }

    public List<OutlinerChild> getChildren() {
        return children;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrigin(float[] origin) {
        this.origin = origin;
    }

    public void setColor(Float color) {
        this.color = color;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setExport(Boolean export) {
        this.export = export;
    }

    public void setMirrorUv(Boolean mirrorUv) {
        this.mirror_uv = mirrorUv;
    }

    public void setOpen(Boolean open) {
        this.isOpen = open;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public void setVisibility(Boolean visibility) {
        this.visibility = visibility;
    }

    public void setAutouv(Float autouv) {
        this.autouv = autouv;
    }

    public void setChildren(List<OutlinerChild> children) {
        this.children = children;
    }
}
