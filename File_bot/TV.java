package main;


public class TV {
    int channel;
    int volumeLevel;
    boolean on;
    
    public TV()
    {}
     public void turnOn()
    {
        on=true;
    }
    public void turnOff()
    {
        on=false;
    }
    public void setChannel(int newChannel)
    {
        if(newChannel>=1 && newChannel<=120)
        {
            channel=newChannel;
        }
        else
        {
            System.out.println("this channel is not valid");
        }
    }
    public void setVolume(int newVolumeLevel)
    {
        if(newVolumeLevel>=1 && newVolumeLevel<=120)
        {
            volumeLevel=newVolumeLevel;
        }
        else
        {
            System.out.println("this volume Level is not valid");
        }
    }
    public void channelUp()
    {
        if(channel<120)
        {
            channel++;
        }
        else
        {
            System.out.println("This channel is maximum channel");
        }
    }
    public void channelDown()
    {
        if(channel>1)
        {
            channel--;
        }
        else
        {
            System.out.println("This channel is minimum channel");
        }
    }
    public void volumeUp()
    {
        if(volumeLevel<7)
        {
            volumeLevel++;
        }
        else
        {
            System.out.println("this volume level is maximum channel");
        }
    }
    public void volumeDown()
    {
        if(volumeLevel>1)
        {
            volumeLevel--;
        }
        else
        {
            System.out.println("this volume level is minimum channel");
        }
    }
    public int getChannel()
    {
        return channel;
    }
    public int getVolumeLevel()
    {
        return volumeLevel;
    }
    
    public void print()
    {
        System.out.println("state of TV is: "+ on + "\n channel is: " + channel +"\n volume level is: " + volumeLevel);
    }
   
    
}
