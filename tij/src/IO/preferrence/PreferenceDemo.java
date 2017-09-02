package IO.preferrence;

import java.util.prefs.Preferences;

public class PreferenceDemo {
	public static void main(String[] args) throws Exception{
		Preferences preferences=Preferences.userNodeForPackage(PreferenceDemo.class);
		preferences.put("Location","Changsha");
		preferences.put("Footwear","E");
		int usageCount=preferences.getInt("UsageCount",0);
		usageCount++;
		preferences.putInt("UsageCount",usageCount);
		for(String key:preferences.keys()){
			System.out.println(key+": "+preferences.get(key,null));
			System.out.println(preferences.getInt("Footwear",0));

		}
	}
}
