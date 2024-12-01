public class Client {
    public static void main(String[] args) {
        String xmlData = "Sample data";
        AnalyticsTool analyticsTool = new XMLToJSONAdapter(xmlData);
        analyticsTool.analyzeData();
    }
}
