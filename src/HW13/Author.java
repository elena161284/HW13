package HW13;

import java.util.Objects;

public class Author {
    private final String name;
    private final String surName;

    public Author(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    String getName() {
        return this.name;
    }

    String getSurName() {
        return this.surName;
    }
    public String toString() {
        return this.name + " "+ this.surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name == author.name && Objects.equals(surName, author.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }
}