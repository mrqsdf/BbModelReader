package fr.mrqsdf.bbmodelreader;

import com.google.gson.Gson;
import fr.mrqsdf.bbmodelreader.data.BbModel;

import java.io.File;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BbModelReader {

    private static final Map<String, BbModel> models = new HashMap<>();

    /**
     * Load a model from a file
     * @param modelPath the path to the model
     * @param ressource if the model is in the ressources folder or not
     * @param string the name of the model
     * @return the model
     */
    public static BbModel loadModel(String modelPath, boolean ressource, String string) {
        File file;
        if (ressource) {
            file = new File(Objects.requireNonNull(BbModelReader.class.getClassLoader().getResource(modelPath)).getFile());
        } else {
            file = new File(modelPath);
        }
        return loadModel(file, string);
    }

    /**
     * Load a model from a file
     * @param modelPath the path to the model
     * @param ressource if the model is in the ressources folder or not
     * @return the model
     */
    public static BbModel loadModel(String modelPath, boolean ressource) {
        File file;
        if (ressource) {
            file = new File(Objects.requireNonNull(BbModelReader.class.getClassLoader().getResource(modelPath)).getFile());
        } else {
            file = new File(modelPath);
        }
        String name = file.getName();

        return loadModel(file, name);
    }

    /**
     * Load a model from a file
     * @param file the file
     * @param name the name of the model
     * @return the model
     */
    public static BbModel loadModel(File file, String name) {
        Gson gson = new Gson();
        String jsonString ;
        try {
            jsonString = new String(Files.readAllBytes(file.toPath()));
        } catch (Exception e) {
            throw new RuntimeException("Error while reading file " + name, e);
        }
        BbModel model = gson.fromJson(jsonString, BbModel.class);
        models.put(name, model);

        return model;
    }

    /**
     * Get a model by its name
     * @param name the name of the model
     * @return the model
     */
    public static BbModel getModel(String name) {
        return models.get(name);
    }

}