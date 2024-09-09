package entities;

public class Material {
    private String name;
    private Double note1;
    private Double note2;
    private Double note3;
    private Double note4;



    public Material(String name) {
        this.name = name;
    }

    public Material(Double note1, Double note2, Double note3, Double note4) {
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
        this.note4 = note4;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getNote1() {
        return note1;
    }

    public void setNote1(Double note1) {
        this.note1 = note1;
    }

    public Double getNote2() {
        return note2;
    }

    public void setNote2(Double note2) {
        this.note2 = note2;
    }

    public Double getNote3() {
        return note3;
    }

    public void setNote3(Double note3) {
        this.note3 = note3;
    }

    public Double getNote4() {
        return note4;
    }

    public void setNote4(Double note4) {
        this.note4 = note4;
    }


    @Override
    public String toString() {
        return "Material{" +
                "name='" + name + '\'' +
                ", note1=" + note1 +
                ", note2=" + note2 +
                ", note3=" + note3 +
                ", note4=" + note4 +
                '}';
    }
}
