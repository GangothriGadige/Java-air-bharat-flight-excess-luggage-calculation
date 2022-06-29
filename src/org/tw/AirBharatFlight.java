package org.tw;

public class AirBharatFlight {
    int originalLuggageWeight;
    public AirBharatFlight(int originalLuggageWeight) {
        this.originalLuggageWeight=originalLuggageWeight;
    }

    public void calculate(int weight) throws ExcessLuggageException {
        if(weight>15) {
            throw new ExcessLuggageException();

        }else{
            System.out.println("Enjoy your Journey");
        }
    }

}
