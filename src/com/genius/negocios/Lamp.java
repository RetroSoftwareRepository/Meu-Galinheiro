package com.genius.negocios;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;


public class Lamp extends Thread {
	
	final GpioController gpio = GpioFactory.getInstance();	
	final GpioPinDigitalOutput pin1 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "LEDR");
	
	public Lamp(){
		pin1.setShutdownOptions(true, PinState.LOW);
	}

    public void acender() throws InterruptedException {         
    	pin1.high();
    }
    
    public void apagar() throws InterruptedException {                
        pin1.low();
   }   
}
