package org.tw;

public class Passenger {
    int luggageWeight;
    String name;

    public Passenger(int luggageWeight,String name){
        this.luggageWeight=luggageWeight;
        this.name=name;
    }
    public static String amountToBePaid(int originalWeight,String name) {
        int excessWeight = originalWeight - 15;
        if(excessWeight>1) {
            return (name+" have to pay " + excessWeight * 500 + " for excess luggage");
        }
        return "Your luggage weight is within the limit";
    }

    public static void main(String[] args){
        AirBharatFlight airBharatFlight1 = new AirBharatFlight(18);
        try {
            airBharatFlight1.calculate(airBharatFlight1.originalLuggageWeight);
        } catch (ExcessLuggageException excessLuggageException) {
            System.out.println("Luggage weight limit exceeded");
        }
        Passenger passenger1 =new Passenger(18,"Bhavya");
        System.out.println(amountToBePaid(passenger1.luggageWeight,passenger1.name));

        AirBharatFlight airBharatFlight2 = new AirBharatFlight(15);
        Passenger passenger2 =new Passenger(15,"Sruthi");
        System.out.println(amountToBePaid(passenger2.luggageWeight, passenger2.name));
        try {
            airBharatFlight2.calculate(airBharatFlight2.originalLuggageWeight);
        } catch (ExcessLuggageException excessLuggageException) {
            System.out.println("Luggage weight limit exceeded");
        }

    }
}
