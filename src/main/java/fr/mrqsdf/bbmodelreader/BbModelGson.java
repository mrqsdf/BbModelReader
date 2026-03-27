package fr.mrqsdf.bbmodelreader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fr.mrqsdf.bbmodelreader.data.Outliner;

public final class BbModelGson {

    private BbModelGson() {}

    public static Gson create() {
        return new GsonBuilder()
                .registerTypeAdapter(Outliner.class, new OutlinerTypeAdapter())
                .create();
    }
}
