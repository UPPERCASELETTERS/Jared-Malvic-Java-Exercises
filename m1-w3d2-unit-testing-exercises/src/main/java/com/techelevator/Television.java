//package com.techelevator;
//
//public class Television {
//
//    private boolean isOn=false;
//    private int selectedChannel = 3;
//    private int currentVolume=2;
//
//    /**
//     * Current on/off status of the tv
//     */
//    public boolean IsOn() {
//        return isOn;        
//    }
//
//    /**
//     * Current selected channel number for the tv. Channels are 3 to 18.
//     */
//    public int getSelectedChannel() {
//        return selectedChannel;            
//    }
//
//
//    /**
//     * Current volume level for the tv. Volume level ranges from 0 to 10. 
//     */
//    public int getCurrentVolume() {
//        return currentVolume;            
//    }
//
//    /**
//     * Turns the tv on. Also resets the volume level to 2 
//     */
//    public void TurnOn()
//    {
//        isOn = true;                        
//    }
//
//    /**
//     * Tuns the tv off. 
//     */
//    public void TurnOff()
//    {
//        isOn = false;
//    }
//
//    /**
//     * Changes the tv channel, but only if it is on. 
//     * @param newChannel new channel to turn to
//     */
//    public void ChangeChannel(int newChannel)
//    {
//        if (isOn && newChannel > 3 && newChannel < 18)
//        {
//            selectedChannel = newChannel;
//        }
//    }
//
//    /**
//     * Raises the volume. It won't raise it past 10 and the tv has to be on 
//     */
//    public void RaiseVolume()
//    {
//        currentVolume++;
//    }
//
//    /**
//     * Lowers the volume. It won't lower it below 0 and the tv has to be on 
//     */
//    public void LowerVolume()
//    {
//        currentVolume--;
//    }
//
//}

package com.techelevator;

public class Television {

	private boolean isOn=false;
	private int currentChannel=3;
	private int currentVolume=2;
	
	public void turnOff() {
		isOn=false;
	}
	public void turnOn() {
		isOn=true;
	}
	public void changeChannel(int newChannel) {
		if (isOn==true) {
			if (newChannel>=3 && newChannel<=18) {
				currentChannel=newChannel;
			}
		}
	}
	public void channelUp() {
		if (isOn==true) {
			if (currentChannel+1>18) {
				currentChannel=3;
			} else {
				currentChannel++;				
			}
		}
	}
	public void channelDown() {
		if (isOn==true) {
			if (currentChannel-1<3) {
					currentChannel=18;
			} else {
					currentChannel--;				
			}
		}
	}
	public void raiseVolume() {
		if (isOn==true) {
			if (currentVolume+1>10) {
					currentVolume=10;
			} else {
					currentVolume++;				
			}
		}
	}
	public void lowerVolume() {
		if (isOn==true) {
			if (currentVolume-1<0) {
					currentVolume=0;
			} else {
					currentVolume--;				
			}
		}
	}	
	
	public boolean isOn() {
		return isOn;
	}
	public int getCurrentChannel() {
		return currentChannel;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	
	
}

