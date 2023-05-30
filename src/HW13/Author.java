package HW13;

    public class Author{
        private final String name;
        private final String surName;
        public Author (String name, String surName) {
            this.name = name;
            this.surName = surName;
        }
        String getName() {return this.name;}
        String getSurName() {return this.surName;}
    }