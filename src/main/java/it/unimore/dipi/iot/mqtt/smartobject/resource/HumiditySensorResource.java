package it.unimore.dipi.iot.mqtt.smartobject.resource;

import java.util.Random;
import java.util.UUID;

/**
 * @author Marco Picone, Ph.D. - picone.m@gmail.com
 * @project mqtt-demo-smartobject
 * @created 12/10/2020 - 19:28
 */
public class HumiditySensorResource extends SmartObjectResource<Double> {

    private Random random;

    private double value;

    private final double MAX_TEMPERATURE_VALUE = 50.0;

    private final double MIN_TEMPERATURE_VALUE = 30.0;

    private final double MAX_OFFSET = +3.0;

    private final double MIN_OFFSET = -3.0;

    public static final String RESOURCE_UNIT = "%";

    public static final String RESOURCE_TYPE = "iot:sensor:humidity";

    public HumiditySensorResource(){
        super(UUID.randomUUID().toString(), HumiditySensorResource.RESOURCE_UNIT, HumiditySensorResource.RESOURCE_TYPE);
        this.random = new Random(System.currentTimeMillis());
        this.value = MIN_TEMPERATURE_VALUE + this.random.nextDouble() * (MAX_TEMPERATURE_VALUE - MIN_TEMPERATURE_VALUE);
    }

    @Override
    public Double refreshValue() {
        return this.value + (MIN_OFFSET + new Random().nextDouble() * (MAX_OFFSET - MIN_OFFSET));
    }

}