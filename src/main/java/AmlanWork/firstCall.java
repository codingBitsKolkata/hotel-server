package AmlanWork;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class firstCall {

	private static String response;
	String string = "your string parameter";

	static String NAMESPACE = "http://stage-external.travelguru.com/";
	static String METHOD_NAME = "TGServiceEndPoint";
	static String SOAP_ACTION = NAMESPACE + METHOD_NAME;

	static String stringUrl = "http://stage-external.travelguru.com/services-2.0/tg-services/TGServiceEndPoint";
	
	public static void main(String[] args) {
		String requestURL = "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"
				+ "<soap:Body>\n"
				+ "<OTA_HotelAvailRQ xmlns=\"http://www.opentravel.org/OTA/2003/05\" RequestedCurrency=\"INR\" SortOrder=\"TG_RANKING\" Version=\"0.0\" PrimaryLangID=\"en\" SearchCacheLevel=\"VeryRecent\">\n"
				+ "            <AvailRequestSegments>\n" + "            <AvailRequestSegment>\n"
				+ "<HotelSearchCriteria>\n" + "\n" + "                        <Criterion>\n" + "\n"
				+ "                            <Address>\n" + "\n"
				+ "                                <CityName>Mumbai</CityName>\n" + "\n"
				+ "                                <CountryName Code=\"India\"></CountryName>\n" + "\n"
				+ "                            </Address>\n" + "\n" + "                            <HotelRef/>\n" + "\n"
				+ "                            <StayDateRange End=\"2019-01-30\" Start=\"2019-01-29\"/>\n" + "\n"
				+ "                            <RoomStayCandidates>\n" + "\n"
				+ "                                <RoomStayCandidate>\n" + "\n"
				+ "                                    <GuestCounts>\n" + "\n"
				+ "                                        <GuestCount AgeQualifyingCode=\"10\"/>\n" + "\n"
				+ "                                        <GuestCount Age=\"10\" AgeQualifyingCode=\"8\" Count=\"1\" />\n"
				+ "\n" + "                                    </GuestCounts>\n" + "\n"
				+ "                                </RoomStayCandidate>\n" + "\n"
				+ "                            </RoomStayCandidates>\n" + "\n"
				+ "                            <TPA_Extensions>\n" + "\n"
				+ "                                <Pagination enabled=\"false\" hotelsFrom=\"01\" hotelsTo=\"05\"/>\n"
				+ "\n" + "                                <HotelBasicInformation>\n"
				+ "                    <Reviews />\n" + "                  </HotelBasicInformation>\n"
				+ "                            <UserAuthentication password=\"test@123\" propertyId=\"1000000002\" username=\"testsell\"/>\n"
				+ "\n" + "                            \n" + "\n" + "                        </TPA_Extensions>\n" + "\n"
				+ "                    </Criterion>\n" + "\n" + "                </HotelSearchCriteria>\n" + "\n"
				+ "            </AvailRequestSegment>\n" + "\n" + "        </AvailRequestSegments>\n" + "\n"
				+ "    </OTA_HotelAvailRQ>\n" + "\n" + "</soap:Body>\n" + "\n" + "</soap:Envelope>";

		BufferedReader reader = null;
		String body = requestURL;
		try {
			URL url = new URL(stringUrl);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setDoOutput(true);
			conn.setDefaultUseCaches(false);
			conn.setRequestProperty("Accept", "text/xml");
			conn.setRequestProperty("SOAPAction", SOAP_ACTION);

			OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
			wr.write(body);
			wr.flush();

			reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			StringBuilder builder = new StringBuilder();
			String line = null;

			while ((line = reader.readLine()) != null) {

				builder.append(line);
				response = builder.toString();

			}
			//System.out.println("=========================");
			//System.out.println(response);
			Converter converter=new Converter();
			converter.convert(response);
			
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {

				reader.close();
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

}
