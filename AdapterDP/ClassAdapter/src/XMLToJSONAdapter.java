public class XMLToJSONAdapter  extends JSONAnalyticsTool implements AnalyticsTool {


    public XMLToJSONAdapter(String xmlData){
        System.out.println("Converting the XML Data "+xmlData+" to JSON data.");
        String newData = xmlData + " in json";
        setJsonData(newData);
    }
    @Override
    public void analyzeData() {
        super.analyzeData();
    }
}
