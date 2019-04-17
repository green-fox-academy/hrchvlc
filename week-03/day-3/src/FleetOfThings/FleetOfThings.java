package FleetOfThings;

public class FleetOfThings {
    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        Thing firstThing = new Thing("Get milk");
        Thing secondThing = new Thing("Remove the obstacles");
        Thing thirdThing = new Thing("Stand up");
        Thing fourthThing = new Thing("Eat lunch");


        fleet.add(firstThing);
        fleet.add(secondThing);
        fleet.add(thirdThing);
        fleet.add(fourthThing);

        thirdThing.complete();
        fourthThing.complete();

        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        System.out.println(fleet);
    }
}