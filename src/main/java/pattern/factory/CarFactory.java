package pattern.factory;

import pattern.proxy.Movealbe;

/**
 * Created by wangchao on 2018/3/13.
 */
public class CarFactory extends VehicleFactory {
    @Override
    public Movealbe createVehical() {
        return new Car();
    }
}
