package templateMethod;

public class CSVDataRenderer extends DataRenderer{

    @Override
    public String readData() {
        return "CSV Data";
    }

    @Override
    public String processData(String data) {
        return "Process Data "+data;
    }
}
