package adapterPattern;

public class WeatherAdapter {

    public int findTemperature(int zipCode){
        String city = null;

        if(zipCode == 34810){
            city = "AnadoluHisari";
        }

        WeatherFinder finder = new WeatherFinderImpl();
        int temperature = finder.find(city);

        return temperature;
    }
}
