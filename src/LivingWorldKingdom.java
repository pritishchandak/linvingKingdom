import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LivingWorldKingdom {

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.addAnimalBehevior("Dog", cf -> cf.canwalk(true));
        Bird duck = new Bird();
        Bird chicken = new Bird();
        Bird rooster = new Bird();
        Bird parrotWithDog = new Bird();
        Bird parrotWithCat = new Bird();
        Bird parrotWithRooster = new Bird();

        Bird butterFly  = new Bird();
        Bird caterpillar  = new Bird();

        Fish sharkFish = new Fish();
        Fish clownFish = new Fish();
        Dolphin newDolphin = new Dolphin();

        duck.addBirdBehevior("Duck", cf -> cf.canSing(true, " QuackQuak").canSwim(true));
        chicken.addBirdBehevior("Chiken", cf -> cf.canSing(true, " Cluck, cluck”").canFly(false));
        rooster.addBirdBehevior("Rooster", cf -> cf.canSing(true, " Cock-a-doodle-doo”"));
        parrotWithDog.addBirdBehevior("Parrot Living With Dog", cf -> cf.canSing(true, " Woof, woof”"));
        parrotWithCat.addBirdBehevior("Parrot Living With Cat", cf -> cf.canSing(true, " Meow"));
        parrotWithRooster.addBirdBehevior("Parrot Living With Rooster", cf -> cf.canSing(true, " Cock-a-doodle-doo”"));
        sharkFish.addFishBehevior("Shark Fish", cf -> cf.size("Large").colour("GRAY").eatOtherFish());
        clownFish.addFishBehevior("ClownFish", cf -> cf.canMakeJoke(true));
        newDolphin.addDolphinBehevior("new Dolphin", cf -> cf);
        butterFly.addBirdBehevior("ButterFly", cf -> cf.canFly(true).canSing(false,""));
        caterpillar.addBirdBehevior("caterpillar", cf -> cf.canFly(false).canwalk(true));

    }

}

class Animal {
    private List<BehaviourProperties> behaviourPropertiesList = new ArrayList<>();

    List<BehaviourProperties> getBehaviourPropertiesList() {
        return behaviourPropertiesList;
    }

    Animal addAnimalBehevior(String name, Function<AnimalBuilder, AnimalBuilder> configuration) {
        final AnimalBuilder annimalbuilder = new AnimalBuilder(name, behaviourPropertiesList);
        return configuration.andThen(AnimalBuilder::create).apply(annimalbuilder);
    }
}

class Bird {
    private List<BehaviourProperties> behaviourPropertiesList = new ArrayList<>();

    List<BehaviourProperties> getBehaviourPropertiesList() {
        return behaviourPropertiesList;
    }

    Bird addBirdBehevior(String name, Function<BirdBuilder, BirdBuilder> configuration) {
        return configuration.andThen(BirdBuilder::create).apply(new BirdBuilder(name, behaviourPropertiesList));
    }
}

class Fish {
    private List<BehaviourProperties> behaviourPropertiesList = new ArrayList<>();

    List<BehaviourProperties> getBehaviourPropertiesList() {
        return behaviourPropertiesList;
    }

    Fish addFishBehevior(String name, Function<FishBuilder, FishBuilder> configuration) {
        return configuration.andThen(FishBuilder::create).apply(new FishBuilder(name, behaviourPropertiesList));
    }
}

class Dolphin {
    private List<BehaviourProperties> behaviourPropertiesList = new ArrayList<>();

    List<BehaviourProperties> getBehaviourPropertiesList() {
        return behaviourPropertiesList;
    }

    Dolphin addDolphinBehevior(String name, Function<DolphinBuilder, DolphinBuilder> configuration) {
        return configuration.andThen(DolphinBuilder::create).apply(new DolphinBuilder(name, behaviourPropertiesList));
    }
}










