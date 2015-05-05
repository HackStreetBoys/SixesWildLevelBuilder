package hackstreet.levelbuilder.config;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class ManifestSerializer implements JsonSerializer<SavedLevelData>{
	
	


	@Override
	public JsonElement serialize(SavedLevelData arg0, Type arg1,
			JsonSerializationContext arg2) {
		JsonObject obj = new JsonObject();
		
		obj.addProperty("starsEarned", arg0.starsEarned);
		obj.addProperty("isUnlocked", arg0.isUnlocked);
		
		
		JsonObject file = new JsonObject();
		file.addProperty("path", "/data/"+arg0.getLevelConfig().getFile().getName());
		
		obj.add("file", file);
		
		return obj;
	}


}

