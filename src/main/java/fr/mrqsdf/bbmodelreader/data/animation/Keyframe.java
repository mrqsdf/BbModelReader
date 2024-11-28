package fr.mrqsdf.bbmodelreader.data.animation;

public class Keyframe {

    private String channel;
    private DataPoint dataPoint;
    private String uuid;
    private Float time;
    private int color;
    private String interpolation;
    private String easing;
    private Object[] easingArgs;

    public String getChannel() {
        return channel;
    }

    public DataPoint getDataPoint() {
        return dataPoint;
    }

    public String getUuid() {
        return uuid;
    }

    public Float getTime() {
        return time;
    }

    public int getColor() {
        return color;
    }

    public String getInterpolation() {
        return interpolation;
    }

    public String getEasing() {
        return easing;
    }

    public Object[] getEasingArgs() {
        return easingArgs;
    }

}
