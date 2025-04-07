# BbModelReader

BbModelReader deserializes `.bbmodel` files, allowing retrieval of 3D model information.

### Usage Example:

```java
import fr.mrqsdf.bbmodelreader.BbModelReader;

public class Example {

  public static void main(String[] args){

    // Path of your bbmodel file [Required]
    String filePath = "your/file/path/file.bbmodel";

    // Model Reference Name to retrieve your model [Optional]
    String name = "FileName";

    // Indicates if your file is in the resources folder [Optional]
    boolean resource = false;

    // First Method
    BbModelReader.loadModel(filePath, resource, name);

    // Second Method | here your reference name is the file name
    BbModelReader.loadModel(filePath, resource);

    // Third Method
    File file = new File(filePath);
    BbModelReader.loadModel(file, name);

    BbModel model = BbModelReader.getModel(name);

    String modelName = model.getName();
  }

}
```

