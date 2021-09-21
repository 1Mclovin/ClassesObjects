public class main {
    public static void main(String[] args) {
        // now lets create our specific bird
        // every specific bird we create is an OBJECT of our bird class


        //we just created a cardinal , this would now be an object of our bird class
        Bird cardinal = new Bird();

        //lets give our cardinal the attributes we defined earlier

        cardinal.canThisBirdFly= true;
        cardinal.age=2;
        cardinal.breed="cardinal";
        cardinal.eyes=3;
        cardinal.givenName="mutated mf";
        cardinal.legs=4;

        // lets print out an attribute

        System.out.println(cardinal.age);

        // congrats we just created an object!!!



    }
}
