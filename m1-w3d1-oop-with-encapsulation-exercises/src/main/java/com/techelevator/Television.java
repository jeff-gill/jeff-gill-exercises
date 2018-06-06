package com.techelevator;

public class Television {

	private boolean isOn;
	private int currentChannel;
	private int currentVolume;

	public int getCurrentChannel() {
		return currentChannel;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

	public boolean isOn() {
		return !isOn;
	}

	public void turnOff() {
		this.currentVolume = 0;
	}

	public void turnOn() {
		this.currentVolume = 2;
		this.currentChannel = 3;
	}

	public int changeChannel(int newChannel) {
		if (isOn = true && currentChannel >=3 && currentChannel <= 18) {
			int newChannel = currentChannel + changeChannel;
			} else {
				return newChannel;
			}
	
	public int channelUp() {
		newChannel = currentChannel +1;
		if (isOn = true && newChannel >= 3 && newChannel <= 18);
		return newChannel;
		} 
		if (isOn = true && newChannel < 3){
		newChannel = 18;
		}else if (isOn && newChannel > 18) {
		newChannel = 3;
	} else {
		return currentChannel;
	}

	public int channelDown() {
		newChannel = currentChannel -1 1;
		if (isOn = true && newChannel >= 3 && newChannel <= 18);
		return newChannel;
		} 
		if (isOn = true && newChannel < 3){
		newChannel = 18;
		}else if (isOn && newChannel > 18) {
		newChannel = 3;
	} else {
		return currentChannel;
	}

	public int raiseVolume() {
		this.newVolume = currentVolume + 1;
		if (isOn = true && newVolume >= 0 && newVolume <= 10);
		return this.newVolume;
		} 
		if (isOn = true && newVolume <= 0){
		this.newVolume = 0;
		}else if (isOn && newVolume > 10) {
		this.newVolume = 10;
	} else {
		return currentVolume;
	}

	public int lowerVolume() {
		newVolume = currentVolume - 1;
		if (isOn = true && newVolume >= 0 && newVolume <= 10);
		return newVolume;
		} 
		if (isOn = true && newVolume <= 0){
		newVolume = 0;
		}else if (isOn && newVolume > 10) {
		newVolume = 10;
	} else {
		return currentVolume;
	}
}
}