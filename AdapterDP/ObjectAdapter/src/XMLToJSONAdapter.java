public class XMLToJSONAdapter implements AnalyticsTool{

    private JSONAnalyticsTool jsonAnalyticsTool;

    public XMLToJSONAdapter(String xmlData){
        System.out.println("Converting the XML Data "+xmlData+" to JSON data.");
        String newData = xmlData + " in json";
        jsonAnalyticsTool = new JSONAnalyticsTool();
        jsonAnalyticsTool.setJsonData(newData);
    }

    @Override
    public void analyzeData() {
        jsonAnalyticsTool.analyzeData();
    }
}
