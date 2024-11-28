package fr.mrqsdf.bbmodelreader.data;

public class Face {

    private FaceValue north;
    private FaceValue east;
    private FaceValue south;
    private FaceValue west;
    private FaceValue up;
    private FaceValue down;

    public FaceValue getNorth() {
        return north;
    }

    public FaceValue getEast() {
        return east;
    }

    public FaceValue getSouth() {
        return south;
    }

    public FaceValue getWest() {
        return west;
    }

    public FaceValue getUp() {
        return up;
    }

    public FaceValue getDown() {
        return down;
    }

    public class FaceValue {
        private float[] uv;
        private Float texture;

        public float[] getUv() {
            return uv;
        }

        public Float getTexture() {
            return texture;
        }

    }

}
