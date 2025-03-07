package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animals.Pilot;
import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Food.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class CropDuster implements Aircraft, FarmVehicle<Pilot> {

    public boolean fly(Pilot pilot) {
        return pilot instanceof Pilot;
    }

    public boolean operate(Farm farm) {
        return true;
    }


//    public boolean fertilize(CropRow cropRow) {
//        for(Object c: cropRow) {
//            if(c instanceof Crop) {
//                ((Crop<?>) c).isFertilized = true;
//            }
//        }
//        return true;
//    }

    public <CropType extends Crop> boolean fertilize(CropRow<CropType> cropRow) {
        for(CropType c: cropRow) {
            c.isFertilized = true;
        }
        return true;
    }

    @Override
    public String makeNoise() {
        return "roar roar roar";
    }

    @Override
    public boolean ride(Pilot rider) {
        return rider!=null;
    }
}
