//Adaptee Class
public class JSONAnalyticsTool {
    private String jsonData;

    public void setJsonData(String jsonData){
        this.jsonData = jsonData;
    }

    public void analyzeData(){
        if(jsonData.contains("json")){
            System.out.println("Analyzing JSON Data - "+jsonData);
        }else {
            System.out.println("Not in the correct format. Can't analyze!");
        }
    }
}
