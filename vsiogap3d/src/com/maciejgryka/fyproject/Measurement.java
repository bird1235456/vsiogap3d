package com.maciejgryka.fyproject;

/**
 * Single room measurement containing
 * @param sensorId - effectively room ID
 * @param temperature
 * @param light intensity
 * @param movement (1 for movement, 0 for no movement)
 * @param time and date when the measurement was taken
 */

// TODO: change datatypes from String to more efficient ones (ints)
public class Measurement {
	
	private int sensorId;
	
	private int temperature;
	private int light;
	private int movement;
	private String time;
	public void clear()
	{	
		sensorId = temperature = light = movement = 0;
		time = null;
	}
	/**
	 * @return the light
	 */
	public int getLight() {
		return light;
	}
	/**
	 * @return the movement
	 */
	public int getMovement() {
		return movement;
	}
	/**
	 * @return the sensorId
	 */
	public int getSensorId() {
		return sensorId;
	}
	/**
	 * @return the temperature
	 */
	public int getTemperature() {
		return temperature;
	}
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param light the light to set
	 */
	public void setLight(int light) {
		this.light = light;
	}
	/**
	 * @param movement the movement to set
	 */
	public void setMovement(int movement) {
		this.movement = movement;
	}
	/**
	 * @param sensorId the sensorId to set
	 */
	public void setSensorId(int sensorId) {
		this.sensorId = sensorId;
	}
	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
}
