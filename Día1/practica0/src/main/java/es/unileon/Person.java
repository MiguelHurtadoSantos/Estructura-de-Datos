package es.unileon;

public class Person {

    String nif;
    String name;

    public Person(String name, String nif) {
        this.nif = nif;
        this.name = name;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else {
            return false;
        }
    }

    
}
