package com.techelevator;

public class Television {

	private boolean isOn;
	private int currentChannel;
	private int currentVolume;

	public Television() {
		this.isOn = false;
		this.currentChannel = 3;
		this.currentVolume = 2;
	}

	public void turnOff() {
		isOn = false;
	}

	public void turnOn() {
		isOn = true;
	}

	public void changeChannel(int newChannel) {
		if(isOn && newChannel <= 18 && newChannel >= 3) {
			this.currentChannel = newChannel;
		} else {
			newChannel = currentChannel;
		}
	}
	public void channelUp() {
		if (isOn && currentChannel < 18) {
			currentChannel++;
		} else {
			this.currentChannel = 3;
		}
	}

	public void channelDown() {
		if (isOn && currentChannel > 3) {
			currentChannel--;
		}else if (isOn && currentChannel == 3)
			this.currentChannel = 18;
	}

	public void raiseVolume() {
		if (isOn && currentVolume < 10) {
			currentVolume++;
		}else if (isOn && currentVolume == 10)
			this.currentVolume = 10;
	}

	public void lowerVolume() {
		if (isOn && currentVolume > 0) {
			currentVolume--;
		}else {
			this.currentVolume = 0;
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
