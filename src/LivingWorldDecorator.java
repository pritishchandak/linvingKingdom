public

class LivingWorldDecorator {

    LivingWorlDBuilder canWalk(boolean value, LivingWorlDBuilder livingWorlDBuilder) {
        if (value) {
            System.out.println("I can walk");
            livingWorlDBuilder.getBehaviourPropertiesList().add(BehaviourProperties.WALK);
        } else {
            System.out.println("I cannot walk");
            livingWorlDBuilder.getBehaviourPropertiesList().remove(BehaviourProperties.WALK);
        }
        return livingWorlDBuilder;
    }

    LivingWorlDBuilder canFly(boolean value, LivingWorlDBuilder livingWorlDBuilder) {
        if (value) {
            livingWorlDBuilder.getBehaviourPropertiesList().add(BehaviourProperties.FLY);
            System.out.println("I can Fly");
        } else {
            livingWorlDBuilder.getBehaviourPropertiesList().remove(BehaviourProperties.FLY);
            System.out.println("I can not Fly");
        }
        return livingWorlDBuilder;
    }


    LivingWorlDBuilder canSwim(boolean value, LivingWorlDBuilder livingWorlDBuilder) {
        if (value) {
            livingWorlDBuilder.getBehaviourPropertiesList().add(BehaviourProperties.SWIM);
            System.out.println("I can Swim");
        } else {
            livingWorlDBuilder.getBehaviourPropertiesList().remove(BehaviourProperties.SWIM);
            System.out.println("I can not Swim");
        }
        return livingWorlDBuilder;
    }

    LivingWorlDBuilder canSing(boolean value, String sound, LivingWorlDBuilder livingWorlDBuilder) {
        if (value) {
            System.out.println("I can Sing" + sound);
        } else {
            livingWorlDBuilder.getBehaviourPropertiesList().remove(BehaviourProperties.SING);
            System.out.println("I can not Sing");
        }
        return livingWorlDBuilder;
    }


    LivingWorlDBuilder size(String animalSize, LivingWorlDBuilder livingWorlDBuilder) {
        if (animalSize.equalsIgnoreCase("Large")) {
            livingWorlDBuilder.getBehaviourPropertiesList().remove(BehaviourProperties.LARGE_SIZE);
        } else if (animalSize.equalsIgnoreCase("Small")) {
            livingWorlDBuilder.getBehaviourPropertiesList().remove(BehaviourProperties.SMALL_SIZE);
        } else {
            livingWorlDBuilder.getBehaviourPropertiesList().remove(BehaviourProperties.MEDIUM_SIZE);
        }
        System.out.println("I have size " + animalSize);
        return livingWorlDBuilder;
    }


    LivingWorlDBuilder colour(String animalColour, LivingWorlDBuilder livingWorlDBuilder) {
        if (animalColour.equalsIgnoreCase("GRAY")) {
            livingWorlDBuilder.getBehaviourPropertiesList().remove(BehaviourProperties.COLOUR_GRAY);
        } else {
            livingWorlDBuilder.getBehaviourPropertiesList().remove(BehaviourProperties.COLOURFUL);
        }
        System.out.println("I have Colour " + animalColour);
        return livingWorlDBuilder;
    }

    LivingWorlDBuilder canMakeJoke(boolean canMakeJoke, LivingWorlDBuilder livingWorlDBuilder) {
        if (canMakeJoke) {
            livingWorlDBuilder.getBehaviourPropertiesList().remove(BehaviourProperties.CANMAKE_JOKE);
            System.out.println("I can Make Joke");
        } else {
            livingWorlDBuilder.getBehaviourPropertiesList().remove(BehaviourProperties.CANMAKE_JOKE);
        }
        return livingWorlDBuilder;
    }
}