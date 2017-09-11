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
