package com.maciejgryka.fyproject;

public class IndicatorData {
	
	private String sensorId = "";
	
	private String type = "";
		
	private float translationX;

	
	private float translationY;

	private float translationZ;

	private float rotationAngle;

	private float rotationX;

	private float rotationY;

	private float rotationZ;

	public void clear()
	{
		sensorId = type = "";
		translationX = translationY = translationZ = 0.0f;
		rotationAngle = rotationX = rotationY = rotationZ = 0.0f;
	}

	/*
	 * Returns desired attribute. Possible attributes are:
	 * 	sensorId, temperature, light, movement, time
	 */
	public String getAttribute(String attribute) {
		if (attribute.equals("sensorId")) {
			return sensorId;
		} else if (attribute.equals("type")) {
			return type;
		} else if (attribute.equals("translationX")) {
			return String.valueOf(translationX);
		} else if (attribute.equals("translationY")) {
			return String.valueOf(translationY);
		} else if (attribute.equals("translationZ")) {
			return String.valueOf(translationZ);
		} else if (attribute.equals("rotationAngle")) {
			return String.valueOf(rotationAngle);
		} else if (attribute.equals("rotationX")) {
			return String.valueOf(rotationX);
		} else if (attribute.equals("rotationY")) {
			return String.valueOf(rotationY);
		} else if (attribute.equals("rotationZ")) {
			return String.valueOf(rotationZ);
		}
		return null;
	}

	/**
	 * @return the rotationAngle
	 */
	public float getRotationAngle() {
		return rotationAngle;
	}

	/**
	 * @return the rotationX
	 */
	public float getRotationX() {
		return rotationX;
	}

	/**
	 * @return the rotationY
	 */
	public float getRotationY() {
		return rotationY;
	}

	/**
	 * @return the rotationZ
	 */
	public float getRotationZ() {
		return rotationZ;
	}

	/**
	 * @return the sensorId
	 */
	public String getSensorId() {
		return sensorId;
	}

	/**
	 * @return the translationX
	 */
	public float getTranslationX() {
		return translationX;
	}

	/**
	 * @return the translationY
	 */
	public float getTranslationY() {
		return translationY;
	}

	/**
	 * @return the translationZ
	 */
	public float getTranslationZ() {
		return translationZ;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	public boolean setAttribute(String attribute, String value)
	{
		if (attribute.equals("sensorId")) {
			sensorId = value;
			return true;
		} else if (attribute.equals("type")) {
			type = value;
			return true;
		} else if (attribute.equals("translationX")) {
			translationX = Float.valueOf(value).floatValue();
			return true;
		} else if (attribute.equals("translationY")) {
			translationY = Float.valueOf(value).floatValue();
			return true;
		} else if (attribute.equals("translationZ")) {
			translationZ = Float.valueOf(value).floatValue();
			return true;
		} else if (attribute.equals("rotationAngle")) {
			rotationAngle = Float.valueOf(value).floatValue();
			return true;
		} else if (attribute.equals("rotationX")) {
			rotationX = Float.valueOf(value).floatValue();
			return true;
		} else if (attribute.equals("rotationY")) {
			rotationY = Float.valueOf(value).floatValue();
			return true;
		} else if (attribute.equals("rotationZ")) {
			rotationZ = Float.valueOf(value).floatValue();
			return true;
		}
		return false;
	}
	
	/**
	 * @param rotationAngle the rotationAngle to set
	 */
	public void setRotationAngle(float rotationAngle) {
		this.rotationAngle = rotationAngle;
	}
	/**
	 * @param rotationX the rotationX to set
	 */
	public void setRotationX(float rotationX) {
		this.rotationX = rotationX;
	}
	/**
	 * @param rotationY the rotationY to set
	 */
	public void setRotationY(float rotationY) {
		this.rotationY = rotationY;
	}
	/**
	 * @param rotationZ the rotationZ to set
	 */
	public void setRotationZ(float rotationZ) {
		this.rotationZ = rotationZ;
	}
	/**
	 * @param sensorId the sensorId to set
	 */
	public void setSensorId(String sensorId) {
		this.sensorId = sensorId;
	}
	/**
	 * @param translationX the translationX to set
	 */
	public void setTranslationX(float translationX) {
		this.translationX = translationX;
	}
	/**
	 * @param translationY the translationY to set
	 */
	public void setTranslationY(float translationY) {
		this.translationY = translationY;
	}
	/**
	 * @param translationZ the translationZ to set
	 */
	public void setTranslationZ(float translationZ) {
		this.translationZ = translationZ;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
