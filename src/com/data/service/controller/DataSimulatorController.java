package com.data.service.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.data.service.entity.SensorData;
import com.data.service.pool.SensorDataPool;

@RestController
public class DataSimulatorController {

	@RequestMapping(value="/sensorData", method=RequestMethod.GET)
    public SensorData getSensorData(@RequestParam(value="sensorId") Integer sensorId) {
		
		SensorData data = new SensorData();
		data.setSensorId(sensorId);
		data.setSensorName("Virtual Sensor");
		Date currentDateTime = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdf.format(currentDateTime);
		data.setCaptureDateTime(currentDateTime);
		
		Double uvIndex = SensorDataPool.getUvIndex(0.0, 14.0);
		
		//System.out.println("Random UV Index: "+uvIndex);
		
		data.setUvIndex(uvIndex);
        return data;
    }
}
