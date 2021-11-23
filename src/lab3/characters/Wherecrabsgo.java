package lab3.characters;

import lab3.enums.Adjective;

public abstract class Wherecrabsgo extends Julio {

    public Wherecrabsgo(String name) {
        super(name);
    }
    public Wherecrabsgo() {
        super("wherecrabsgo");
    }
        public class Restaurant extends Location {

            public Restaurant() {
                super("Restaurant");
            }

            public Restaurant(Adjective... adj) {
                super("Restaurant", adj);
            }
        }

        public class Pool extends Location {
            public Pool() {
                super("Pool");
            }

            public Pool(Adjective... adj) {
                super("Pool", adj);
            }
        }

        public class Theatre extends Location {
            public Theatre() {
                super("Theatre");
            }

            public Theatre(Adjective... adj) {
                super("Theatre", adj);
            }
        }

        public class Hotel extends Location {
            public Hotel() {
                super("hair");
            }

            public Hotel(Adjective... adj) {
                super("Hotel", adj);
            }
        }

    }

