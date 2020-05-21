package edu.remad.chapter6.item38;

public enum AdvanceDirection implements Direction {

    NORTHEAST {
        @Override
        public void showDirection() {
            System.out.println("I am NORTH-EAST");
        }
    },
    NORTHWEST {
        @Override
        public void showDirection() {
            System.out.println("I am NORTH-WEST");
        }
    },
    SOUTHEAST {
        @Override
        public void showDirection() {
            System.out.println("I am SOUTH-EAST");
        }
    },
    SOUTHWEST {
        @Override
        public void showDirection() {
            System.out.println("I am SOUTH-WEST");
        }
    }
}
