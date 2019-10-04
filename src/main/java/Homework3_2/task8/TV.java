package Homework3_2.task8;

public class TV extends TVDevice {
    private int Volume = 0;
    private int numberOfChannel;

    public int getNumberOfChannel() {
        return numberOfChannel;
    }

    public void setVolume(int volume) {
        Volume = volume;
    }

    public int getVolume() {
        return Volume;
    }


    @Override
    public void powerOn() {
        setOne(true);

    }

    @Override
    public void powerOff() {
        setOne(false);

    }

    @Override
    public int setChannel() {
        int numberOfChannel = this.numberOfChannel;
        return numberOfChannel;
    }

    @Override
    public void currentChannel() {
        System.out.println(getNumberOfChannel());

    }

    @Override
    public void upVolume() {
        setVolume(getVolume() + 1);

    }

    @Override
    public void downVolume() {
        setVolume(getVolume() - 1);

    }

    @Override
    public void mute() {
        setVolume(0);

    }
}
