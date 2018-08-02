import java.util.List;

public class LivingWorlDBuilder {

    private LivingWorldDecorator livingWorldDecorator = new LivingWorldDecorator();
    private List<BehaviourProperties> behaviourPropertiesList;

    void setBehaviourPropertiesList(List<BehaviourProperties> behaviourPropertiesList) {
        this.behaviourPropertiesList = behaviourPropertiesList;
    }

    List<BehaviourProperties> getBehaviourPropertiesList() {
        return behaviourPropertiesList;
    }

    LivingWorldDecorator getLivingWorldDecorator() {
        return livingWorldDecorator;
    }

}


class AnimalBuilder extends LivingWorlDBuilder {
    private String name;

    AnimalBuilder(String name, List<BehaviourProperties> behaviourPropertiesList) {
        this.name = name;
        this.setBehaviourPropertiesList(behaviourPropertiesList);

    }

    AnimalBuilder canwalk(boolean value) {
        this.getLivingWorldDecorator().canWalk(value, this);
        return this;
    }

    Animal create() {
        return new Animal();
    }
}


class BirdBuilder extends LivingWorlDBuilder {
    private String name;

    BirdBuilder(String name, List<BehaviourProperties> behaviourPropertiesList) {
        this.name = name;
        this.setBehaviourPropertiesList(behaviourPropertiesList);
        this.defualtProperties();
        System.out.println("\nMy name is " + name + " I am Bird");
    }

    private void defualtProperties() {
        this.getLivingWorldDecorator().canFly(true, this);
        this.getLivingWorldDecorator().canSing(true, "", this);
    }

    BirdBuilder canFly(boolean value) {
        this.getLivingWorldDecorator().canFly(value, this);
        return this;
    }

    BirdBuilder canwalk(boolean value) {
        this.getLivingWorldDecorator().canWalk(value, this);
        return this;
    }


    BirdBuilder canSing(boolean value, String Sound) {
        this.getLivingWorldDecorator().canSing(value, Sound, this);
        return this;
    }

    BirdBuilder canSwim(boolean value) {
        this.getLivingWorldDecorator().canSwim(value, this);
        return this;
    }

    Bird create() {
        return new Bird();
    }
}


class FishBuilder extends LivingWorlDBuilder {
    private String name;

    FishBuilder(String name,List<BehaviourProperties> behaviourPropertiesList) {
        this.name = name;
        this.setBehaviourPropertiesList(behaviourPropertiesList);
        System.out.println("\nMy name is " + name + " I am Fish");
        this.defualtProperties();
    }

    private void defualtProperties() {
        this.getLivingWorldDecorator().canSwim(true, this);
    }

    FishBuilder size(String value) {
        this.getLivingWorldDecorator().size(value, this);
        return this;
    }

    FishBuilder colour(String value) {
        this.getLivingWorldDecorator().colour(value, this);
        return this;
    }

    FishBuilder canMakeJoke(boolean value) {
        this.getLivingWorldDecorator().canMakeJoke(value, this);
        return this;
    }

    FishBuilder eatOtherFish() {
        System.out.println(" I can eat Other Fish");
        return this;
    }


    Fish create() {
        return new Fish();
    }
}



class DolphinBuilder extends LivingWorlDBuilder {

    DolphinBuilder(String name, List<BehaviourProperties> behaviourPropertiesList) {
        this.setBehaviourPropertiesList(behaviourPropertiesList);
        System.out.println("\nI am Dolphin");
        this.defualtProperties();
    }

    private void defualtProperties() {
        this.getLivingWorldDecorator().canSwim(true, this);
    }

    Dolphin create() {
        return new Dolphin();
    }
}
