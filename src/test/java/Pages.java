import PojoClasses.Medications;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pages {
    @Test
    public void fetchSampleData() throws FileNotFoundException {
        File input = new File(System.getProperty("user.dir") + "/src/test/java/SampleData.json");
        JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
        JsonObject fileObject = fileElement.getAsJsonObject();
        JsonArray jsonArrayOfMedications = fileObject.get("medications").getAsJsonArray();
        System.out.println(jsonArrayOfMedications);
        List<Medications> medications = new ArrayList<>();
        for (JsonElement medicationsElement : jsonArrayOfMedications.getAsJsonArray()) {
            JsonObject medicationsJsonObject = medicationsElement.getAsJsonObject();
            ArrayList<String> aceInhibitors = new ArrayList<>(Arrays.asList(medicationsJsonObject.get("aceInhibitors").toString()));
            Medications data = new Medications(aceInhibitors);
            medications.add(data);
        }
        System.out.println(medications);
    }
}