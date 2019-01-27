package AmlanWork;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONObject;
import org.json.XML;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;



 public class Converter {
	 
		public static int PRETTY_PRINT_INDENT_FACTOR = 4;
		public void convert(String response) throws IOException, ParseException {
 	    String TEST_XML_STRING = response;
 	    
 	   
        JSONObject xmlJSONObj = XML.toJSONObject(TEST_XML_STRING);
        String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
        System.out.println(jsonPrettyPrintString);
        FileWriter fw=new FileWriter("SoapJson.json");    
        fw.write(jsonPrettyPrintString);    
        fw.close(); 
        JSONObject js=new JSONObject(jsonPrettyPrintString).optJSONObject("soap:Envelope").optJSONObject("soap:Body");
        
        
		System.out.println("===end===");
		
		Gson gson =new GsonBuilder().create();
		
		/*AmlanWork.OTAHotelAvailRS availRS=gson.fromJson(new JSONObject(jsonPrettyPrintString).optJSONObject("soap:Envelope")
				.optJSONObject("soap:Body").optJSONObject("OTA_HotelAvailRS").toString(), OTAHotelAvailRS.class);
 		
		
		if(availRS.getRoomStays().getRoomStay().get(1).getRoomRates().getRoomRate() instanceof Collection<?>) {
			
			JsonArray jsonArray = gson.toJsonTree( availRS.getRoomStays().getRoomStay().get(0).getRoomRates().getRoomRate()).getAsJsonArray();
			
			ArrayList<RoomRate> roomRates=gson.fromJson(jsonArray, new TypeToken<ArrayList<RoomRate>>() {}.getType());
			System.out.println(roomRates.get(0).getRatePlanCode());
		}else {
			
			JsonObject jsonObject = gson.toJsonTree( availRS.getRoomStays().getRoomStay().get(0).getRoomRates().getRoomRate()).getAsJsonObject();
			RoomRate roomRate= gson.fromJson(jsonObject, RoomRate.class);
			System.out.println("===end===");
		}
		*/
		/*
		JsonObject jsonTpaExtensions=gson.toJsonTree( availRS.getTPAExtensions()).getAsJsonObject();
		TPAExtensions____ extensions____=gson.fromJson(jsonTpaExtensions, TPAExtensions____.class);
		System.out.println(extensions____.getHotelsInfo().getMaxPrice());
		*/
		
		
		
		//System.out.println(availRS.getRoomStays().getRoomStay().get(0).getTPAExtensions().getDeepLinkInformation().getOverviewURL());
		
		//System.out.println(availRS.getRoomStays().getRoomStay().get(0).getRatePlans().getRatePlan());
		//JsonArray jsonObject=gson.toJsonTree(availRS.getRoomStays().getRoomStay().get(0).getRatePlans().getRatePlan()).getAsJsonArray();
		//RatePlan plan=gson.fromJson(jsonObject.get(0), RatePlan.class);
		//System.out.println(plan.getRatePlanInclusions().getRatePlanInclusionDesciption().getText().get(1));
		//System.out.println(plan.getCancelPenalties().getCancelPenalty().getPenaltyDescription().getName());
	}
}
