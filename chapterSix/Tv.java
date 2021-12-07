package chapterSix;

public class Tv {


    public boolean isOn;
    public int channel;
    public int Volume;
    public int brightness = 30;


    public Tv(String TvName, int channel, int volume) {

    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public boolean turnOff() {
        return isOn = false;

    }

    public int checkChannelsOfTv(int number) {
        return number;
    }


    public int increaseChannel(int channel) {
        if (channel <= 100) return channel;
        if (channel >= 0)
            return channel;
        return 1;
    }

    public int increaseChannelMoreThan100(int channel) {
        return channel;
    }

    public int setChannelTo100(int userInput) {
        if (channel <= 100) {
            channel = channel + userInput;
            return channel;
        }
        return 100;
    }


    public int setVolume(int volume) {
        return volume;
    }

    public int increaseVolumeTo30(int userInput) {
        if (Volume <= 30) {

            Volume = Volume + userInput;
            return Volume;
        }
        return 30;
    }

    public int getBrightness() {
        //    if (brightness < 100 && brightness >0) {
        return brightness =30;

    }


    public int increaseBrightnessTo40(int userInput) {
        if (brightness <= 40) {
            brightness = userInput;
            return brightness;
        }

        return 40;
    }

    public int setDecreaseBrightness(int userInput) {
        if (brightness == 30) {
            return brightness-userInput;

        }
        return 30;
    }
}














//private String name;
// private int channel;
//private int volume;
//private int brightness;
//private int colour;



