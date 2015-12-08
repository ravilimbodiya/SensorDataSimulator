package com.data.service.pool;

import java.util.Random;

public class SensorDataPool {

	public static Double getUvIndex(Double min, Double max){
		Random ran = new Random();
		return min + (max - min) * ran.nextDouble();
		
	}
}
