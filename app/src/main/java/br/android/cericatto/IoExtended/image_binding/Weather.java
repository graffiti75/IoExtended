package br.android.cericatto.IoExtended.image_binding;

/**
 * Weather.java.
 *
 * @author Rodrigo Cericatto
 * @since May 14, 2016
 */
public class Weather {
    private String cityName;
    private String url;
    private int temperature;

    public Weather() {
    }

    public Weather(String cityName, String url, int temperature) {
        this.cityName = cityName;
        this.url = url;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Weather{" +
            "cityName='" + cityName + '\'' +
            ", url='" + url + '\'' +
            ", temperature=" + temperature +
            '}';
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}