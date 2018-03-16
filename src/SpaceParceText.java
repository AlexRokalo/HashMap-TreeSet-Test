import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpaceParceText implements ParceText {

    @Override
    public List<String> handle(String words) {
        ArrayList<String> worldsArray = new ArrayList<String>(Arrays.asList(words.split(" ")));
        worldsArray.remove(worldsArray.size()-1);
        List<String> worldsList = worldsArray;
        return worldsList;
    }
}