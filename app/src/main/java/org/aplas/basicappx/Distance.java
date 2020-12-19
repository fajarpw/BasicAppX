package org.aplas.basicappx;

public class Distance {
    private double meter;

    public Distance() {
    }

    public double getMeter() {
        return this.meter;
    }

    public void setMeter(double meter) {
        this.meter = meter;
    }

    public double getInch() {
        return this.meter * 39.3701;
    }

    public void setInch(double inch) {
        this.meter = inch / 39.3701;
    }

    public double getMile() {
        return this.meter * 0.000621371;
    }

    public void setMile(double mile) {
        this.meter = mile / 0.000621371;
    }

    public double getFoot() {
        return this.meter * 3.28084;
    }

    public void setFoot(double foot) {
        this.meter = foot / 3.28084;
    }

    public double convert(String oriUnit, String convUnit, double value){
        if (oriUnit.equals("Mtr")){
            switch (convUnit){
                case "Mtr":
                    setMeter(value);
                    value = getMeter();
                    break;
                case "Inc":
                    setMeter(value);
                    value = getInch();
                    break;
                case "Mil":
                    setMeter(value);
                    value = getMile();
                    break;
                case "Ft":
                    setMeter(value);
                    value = getFoot();
                    break;
            }
        }else if(oriUnit.equals("Inc")){
            switch (convUnit){
                case "Mtr":
                    setInch(value);
                    value = getMeter();
                    break;
                case "Inc":
                    setInch(value);
                    value = getInch();
                    break;
                case "Mil":
                    setInch(value);
                    value = getMile();
                    break;
                case "Ft":
                    setInch(value);
                    value = getFoot();
                    break;
            }

        }else if(oriUnit.equals("Mil")){
            switch (convUnit){
                case "Mtr":
                    setMile(value);
                    value = getMeter();
                    break;
                case "Inc":
                    setMile(value);
                    value = getInch();
                    break;
                case "Mil":
                    setMile(value);
                    value = getMile();
                    break;
                case "Ft":
                    setMile(value);
                    value = getFoot();
                    break;
            }
        }else if(oriUnit.equals("Ft")){
            switch (convUnit){
                case "Mtr":
                    setFoot(value);
                    value = getMeter();
                    break;
                case "Inc":
                    setFoot(value);
                    value = getInch();
                    break;
                case "Mil":
                    setFoot(value);
                    value = getMile();
                    break;
                case "Ft":
                    setFoot(value);
                    value = getFoot();
                    break;
            }
        }
        return value;
    }
}
